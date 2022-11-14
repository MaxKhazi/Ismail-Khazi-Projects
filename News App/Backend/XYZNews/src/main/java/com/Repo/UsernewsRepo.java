package com.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.Usernews;
@Repository
public interface UsernewsRepo extends JpaRepository<Usernews, String> {

}
