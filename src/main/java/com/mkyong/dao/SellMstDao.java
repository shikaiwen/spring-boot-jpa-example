package com.mkyong.dao;

import com.mkyong.model.SellMstEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

public interface SellMstDao extends CrudRepository<SellMstEntity, Integer> {

    List<SellMstEntity> findByStatusIn(Collection statusList);
}
