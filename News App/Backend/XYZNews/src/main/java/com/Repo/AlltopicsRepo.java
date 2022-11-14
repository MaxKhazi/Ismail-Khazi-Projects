package com.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bean.Alltopics;
@Repository
public interface AlltopicsRepo extends JpaRepository<Alltopics, Integer>{

	@Query("select a from Alltopics a where a.topic='tech'")
	List<Object[]>gettechtop();
	
	@Query("select a from Alltopics a where a.topic='Sports'")
	List<Object[]>getsport();
	
	@Query("select a from Alltopics a where a.topic='travel'")
	List<Object[]>gettravel();
	
	@Query("select a from Alltopics a where a.topic='science'")
	List<Object[]>getscience();
	
	@Query("select a from Alltopics a where a.topic='political'")
	List<Object[]>getpolitical();
	
	@Query("select a from Alltopics a where a.topic='entertainment'")
	List<Object[]>getenter();
	
	@Query("select a from Alltopics a where a.topic='business'")
	List<Object[]>getbus();
	
	@Query("select a from Alltopics a where a.topic='Sports' or a.topic='entertainment' or a.topic='travel' order by a.tid desc")
	List<Object[]>getsportentertravel();
	
	@Query("select a from Alltopics a where a.topic='business' or a.topic='political' order by a.tid desc")
	List<Object[]>getbupol();
	
	@Query("select a.comments from Alltopics a where a.tid=:tid")
	Optional<Alltopics>viewcomm(@Param("tid") int tid);
	

}
