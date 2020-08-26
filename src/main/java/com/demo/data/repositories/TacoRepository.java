package com.demo.data.repositories;

import com.demo.data.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {


}
