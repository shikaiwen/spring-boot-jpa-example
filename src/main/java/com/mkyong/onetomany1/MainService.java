package com.mkyong.onetomany1;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * 这里发现SpringJPA一个很大的BUG， 如果OneToMany1BillRepository名字是BillRepository的话，SpringJPA的查询方法就有问题，回去查别的包的BillEntity，很可能是Java泛型的缘故，
 * Java泛型只是一个标记，除了子类无法获取真实类型
 *
 *
 * 参考資料: https://gist.github.com/momotar/2d7a5a4f47363d0fcd25
 *
 *
 * 生成中间表的方式实现双向关联， 其实只要@ManyToOne注解就会在多的一方生成字段引用主表
 */
@Service
public class MainService {

    @Resource
    OneToMany1BillRepository billRepository;

    @Resource
    OneToMany1BillDetailRepository billDetailRepository;


    @Transactional
    public void test1(){

        OneToMany1BillEntity bill = new OneToMany1BillEntity();
        OneToMany1BillDetailEntity detailEntity = new OneToMany1BillDetailEntity();
        bill.setBillDetailEntityList(Arrays.asList(detailEntity));
        billRepository.save(bill);

        Iterable<OneToMany1BillEntity> all = billRepository.findAll();

//        all.forEach(item->{
//            billRepository.delete(item);
//        });

        List<OneToMany1BillEntity> allByNoGreaterThan = billRepository.findAllByNoGreaterThan(0);

        OneToMany1BillEntity one = billRepository.findOne(1);

    }
}
