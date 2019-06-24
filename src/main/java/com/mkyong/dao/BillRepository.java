package com.mkyong.dao;

import com.mkyong.model.BillEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("BillRepository")
public interface BillRepository extends CrudRepository<BillEntity, Integer> {
}
