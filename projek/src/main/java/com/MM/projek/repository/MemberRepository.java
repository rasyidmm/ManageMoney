package com.MM.projek.repository;

import com.MM.projek.model.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository <Member,Long> {
}
