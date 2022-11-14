package com.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.Repo.AlltopicsRepo;
import com.Repo.RegRepo;
import com.bean.Alltopics;
import com.bean.Reg;

@Service
public class AdminService {
	
	@Autowired
	RegRepo rrepo;
	
	@Autowired
	AlltopicsRepo alrp;
	
	public String adminlogin(Reg r) {
		List<Reg> objects = rrepo.findAll();
		for (Reg obj: objects) {
			if(r.getEmail().equals("admin@gmail.com")) {
				if(r.getPassword().equals(obj.getPassword()) && (r.getPassword().equals(obj.getPassword()))) {
					return "Login Successful";
				}
			}
		}
			return "Invalid credentials";

	}
	
	public String addtopics(Alltopics at) {
		alrp.save(at);
		return "News added";
		
	}
	public List<Alltopics> getalltopics(){
		return alrp.findAll();
	}
	public String updatealltopics(Alltopics at) {
		Optional<Alltopics> res = alrp.findById(at.getTid());
		if(res.isPresent()) {
			Alltopics alt = res.get();
			alt.setCountry(at.getCountry());
			alt.setDate(at.getDate());
			alt.setDescription(at.getDescription());
			alt.setHeadline(at.getHeadline());
			alt.setImage(at.getImage());
			alt.setJournalist(at.getJournalist());
			alt.setTopic(at.getTopic());
			alrp.saveAndFlush(alt);
			return "News updated";
		}else {
			return "News not updated";
		}
		
		
	}
}