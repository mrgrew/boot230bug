package com.moneymedia.boot230bug.repository;

import com.moneymedia.boot230bug.entity.Counter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CounterRepository extends CrudRepository<Counter, Long> { }
