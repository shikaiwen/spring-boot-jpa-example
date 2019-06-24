package com.mkyong;

import com.mkyong.dao.*;
import com.mkyong.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.System.exit;

//for jsr310 java 8 java.time.*
//@EntityScan(
//        basePackageClasses = { SpringBootConsoleApplication.class, Jsr310JpaConverters.class }
//)
@SpringBootApplication
public class Application implements CommandLineRunner {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @Autowired
    DataSource dataSource;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BillRepository billEntityRespository;

    @Autowired
    BillDetailRepository billDetailRepository;

    @Autowired
    SellMstDetailDao sellMstDetailDao;

    @Autowired
    SellMstDao sellMstDao;


    public static void main(String[] args) throws Exception {
//        URLClassLoader classLoader = (URLClassLoader)Thread.currentThread().getContextClassLoader();
//        URL[] urls = classLoader.getURLs();
//        for (URL u : urls){
//            System.out.println(u.getPath());
//        }
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        SpringApplication.run(Application.class, args);
    }


    public void testSellMstDetail(){

        SellMstDetailEntity detailEntity = new SellMstDetailEntity();
        detailEntity.setPrice(7500);
        detailEntity.setNum(100);

        SellMstDetailEntity resultEntity = sellMstDetailDao.save(detailEntity);
        System.out.println((resultEntity != detailEntity));

    }


    public void testSellMst(){
//        BillDetailEntity entity = billDetailRepository.findOne(1);
//        System.out.println(entity.getRespDate().getTime());

        SellMstEntity entity = new SellMstEntity();
        entity.setBillNo(1);
        entity.setDiscountRate(0.8);
        sellMstDao.save(entity);
    }


    public void findSellMst(){

        List<String> statusList = new ArrayList<>();
        statusList.add("1");
        statusList.add("5");
        List<SellMstEntity>  list = sellMstDao.findByStatusIn(statusList);

    }


    public void testBillDetail(){
        BillDetailEntity entity = billDetailRepository.findOne(1);
        System.out.println(entity.getRespDate().getTime());
    }



//  cascade save
    public void testSaveBillJoin(){

        BillEntity be = new BillEntity();
        be.setProductCode("P00YE31");
        be.setBillNum(200);
        be.setPrice(8000);

        BillDetailEntity billDetailEntity = new BillDetailEntity();
        billDetailEntity.setRespNum(100);
        billDetailEntity.setRespDate(new Date());
        billDetailEntity.setDiscountRate(0.76);
        billDetailEntity.setBillNo(be.getNo());
        billDetailEntity.setBillEntity(be);

        List<BillDetailEntity> detailList = new ArrayList<>();
        detailList.add(billDetailEntity);

        be.setBillDetailEntityList(detailList);

        BillEntity resultBean = billEntityRespository.save(be);
        System.out.println(resultBean);
//        BillDetailEntity entity = billDetailRepository.findOne(1);
//        System.out.println(entity.getRespDate().getTime());
    }

    public void queryBill(){

        BillEntity bbb = billEntityRespository.findOne(4);
        System.out.println(bbb);
    }


    public void saveBillDetail(){

        BillEntity be = new BillEntity();
        be.setNo(5);


        BillDetailEntity billDetailEntity = new BillDetailEntity();
        billDetailEntity.setRespNum(100);
        billDetailEntity.setRespDate(new Date());
        billDetailEntity.setDiscountRate(0.76);
        billDetailEntity.setBillNo(be.getNo());

        billDetailEntity.setBillEntity(be);

        BillDetailEntity entity = billDetailRepository.save(billDetailEntity);
        System.out.println(entity);

    }


    @Transactional(readOnly = true)
    @Override
    public void run(String... args) throws Exception {

//        BillEntity entity = new BillEntity();
//        entity.setProductCode("SL0001");
//        billEntityRespository.save(entity);

//        testBillDetail();
//        testSellMstDetail();

//        testSellMst();

//        testSaveBillJoin();
//        queryBill();

//        saveBillDetail();

        findSellMst();
        if(true){
            return;
        }



        System.out.println("DATASOURCE = " + dataSource);

        System.out.println("\n1.findAll()...");
        for (Customer customer : customerRepository.findAll()) {
            System.out.println(customer);
        }

        System.out.println("\n2.findByEmail(String email)...");
        for (Customer customer : customerRepository.findByEmail("222@yahoo.com")) {
            System.out.println(customer);
        }

        System.out.println("\n3.findByDate(Date date)...");
        for (Customer customer : customerRepository.findByDate(sdf.parse("2017-02-12"))) {
            System.out.println(customer);
        }

        // For Stream, need @Transactional
        System.out.println("\n4.findByEmailReturnStream(@Param(\"email\") String email)...");
        try (Stream<Customer> stream = customerRepository.findByEmailReturnStream("333@yahoo.com")) {
            stream.forEach(x -> System.out.println(x));
        }

        //System.out.println("....................");
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //Date from = sdf.parse("2017-02-15");
        //Date to = sdf.parse("2017-02-17");

        //for (Customer customer : customerRepository.findByDateBetween(from, to)) {
        //    System.out.println(customer);
        //}

        System.out.println("Done!");

        exit(0);
    }

}