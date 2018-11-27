package com.MM.projek.repository;

import com.MM.projek.model.Kategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KategoryRepository extends CrudRepository<Kategory, Long> {
}
