package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Service.AdminService;
import com.bean.Alltopics;
import com.bean.Reg;

@RestController
@RequestMapping
public class AdminController {
	
	@Autowired
	AdminService as;
	
	@PostMapping(value="adlog", consumes=MediaType.APPLICATION_JSON_VALUE)
	public String adlog(@RequestBody Reg r) {
		return as.adminlogin(r);
	}

	@PostMapping(value="addtopic",consumes=MediaType.APPLICATION_JSON_VALUE)
	public String addtopic(@RequestBody Alltopics al) {
		return as.addtopics(al);
	}
	@GetMapping(value="getalltp", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Alltopics> getalltp(){
		return as.getalltopics();
	}
	@PatchMapping(value="updatetop", consumes=MediaType.APPLICATION_JSON_VALUE)
	public String updatetop(@RequestBody Alltopics al) {
		return as.updatealltopics(al);
	}
}
