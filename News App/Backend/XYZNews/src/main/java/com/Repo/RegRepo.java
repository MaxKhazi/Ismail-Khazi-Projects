package com.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.Reg;
@Repository
public interface RegRepo extends JpaRepository<Reg, Integer> {

}
