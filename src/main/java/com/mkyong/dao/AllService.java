package com.mkyong.dao;

import com.mkyong.model.BillDetailEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

@Service
@Transactional
public class AllService {

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

    @Transactional
    public void commTest(){
        BillDetailEntity one = billDetailRepository.findOne(1);
        billDetailRepository.delete(one);
    }
}
