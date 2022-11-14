package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Service.RegService;
import com.bean.Reg;
import com.bean.RegUsernews;

@RestController
@RequestMapping
public class RegController {
	
	@Autowired
	RegService rs;
	
	
	@PostMapping(value="ureg",consumes=MediaType.APPLICATION_JSON_VALUE)
	public String ureg(@RequestBody RegUsernews run) {
		return rs.userreg(run.getReg(), run.getUsernews());
	}
	@PatchMapping(value="uprof", consumes=MediaType.APPLICATION_JSON_VALUE)
	public String uprof(@RequestBody Reg rg) {
		return rs.editprof(rg);
	}
	

}
