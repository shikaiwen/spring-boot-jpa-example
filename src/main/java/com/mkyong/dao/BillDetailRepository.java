package com.mkyong.dao;

import com.mkyong.model.BillDetailEntity;
import org.springframework.data.repository.CrudRepository;

public interface BillDetailRepository  extends CrudRepository<BillDetailEntity, Integer> {
}
