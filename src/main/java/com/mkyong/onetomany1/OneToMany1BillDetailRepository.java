package com.mkyong.onetomany1;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("onetomany1BillDetailRepository")
public interface OneToMany1BillDetailRepository extends CrudRepository<OneToMany1BillDetailEntity, Integer> {

}
