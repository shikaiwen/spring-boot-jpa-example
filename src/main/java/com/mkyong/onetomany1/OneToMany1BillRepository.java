package com.mkyong.onetomany1;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("onetomany1BillRepository")
public interface OneToMany1BillRepository extends CrudRepository<OneToMany1BillEntity, Integer> {

    List<OneToMany1BillEntity> findAllByNoGreaterThan(int num);
}
