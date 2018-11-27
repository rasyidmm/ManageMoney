package com.MM.projek.repository;

import com.MM.projek.model.Dompet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DompetRepository  extends CrudRepository<Dompet,Long> {
}
