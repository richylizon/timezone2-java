package com.example.timezone2.repositories;

import com.example.timezone2.models.TimeModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeRepository extends CrudRepository<TimeModel, Long> {



}
