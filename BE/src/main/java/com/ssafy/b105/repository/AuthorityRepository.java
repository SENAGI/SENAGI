package com.ssafy.b105.repository;

import com.ssafy.b105.entity.user.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority,Long> {

}
