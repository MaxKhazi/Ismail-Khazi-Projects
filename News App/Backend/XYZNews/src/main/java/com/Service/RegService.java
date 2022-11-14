package com.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Repo.AlltopicsRepo;
import com.Repo.RegRepo;
import com.Repo.UsernewsRepo;
import com.bean.Alltopics;
import com.bean.Reg;
import com.bean.Usernews;

@Service
public class RegService {
	
	@Autowired
	RegRepo rr;
	@Autowired
	UsernewsRepo unr;
	
	@Autowired
	AlltopicsRepo atr;
	
	public String userreg(Reg r, Usernews un) {
		List<Reg> res = rr.findAll();
		System.out.println(res);
			int j = 0;
			for(Reg obj : res) {
				if(r.getEmail().equals(obj.getEmail())) {
					j=j+1;
				}else {
					System.out.println("---");
						}
				}
			if(j==0) {
				rr.save(r);
				unr.save(un);
				return "user added successfully";
			}else {
				return "email id already exists";
			}
		}

	public String editprof(Reg r) {
		List<Reg> objects = rr.findAll();
		for(Reg obj : objects) {
			if(r.getEmail().equals(obj.getEmail())) {
				obj.setAge(r.getAge());
				obj.setName(r.getName());
				obj.setPassword(r.getPassword());
				rr.saveAndFlush(obj);
				return "Profile Updated";
			}
			return "Invalid email id";
		}
		return "Profile not updated";
	}
	
	
	
	
	
	
	
}
