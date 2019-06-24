package com.mkyong.dao;

import com.mkyong.model.BillEntity;
import org.springframework.data.repository.CrudRepository;

public interface BillRepository extends CrudRepository<BillEntity, Integer> {
}
