package com.mkyong.dao;

import com.mkyong.model.BillDetailEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("BillDetailRepository")
public interface BillDetailRepository  extends CrudRepository<BillDetailEntity, Integer> {
}
