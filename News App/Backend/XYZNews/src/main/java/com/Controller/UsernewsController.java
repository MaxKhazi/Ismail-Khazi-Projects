package com.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Service.UsernewsService;
import com.bean.Alltopics;
import com.bean.Usernews;

@RestController
@RequestMapping
public class UsernewsController {
	
	@Autowired
	UsernewsService uns;
	
	@PatchMapping(value="addbus", consumes=MediaType.APPLICATION_JSON_VALUE)
	public String addbus(@RequestBody Usernews un) {
		return uns.addbusiness(un);
	}
	@PatchMapping(value="unaddbus", consumes=MediaType.APPLICATION_JSON_VALUE)
	public String unaddbus(@RequestBody Usernews un) {
		return uns.unaddbusiness(un);
	}

	@PatchMapping(value="addent", consumes=MediaType.APPLICATION_JSON_VALUE)
	public String addent(@RequestBody Usernews un) {
		return uns.addenter(un);
	}
	@PatchMapping(value="unaddent", consumes=MediaType.APPLICATION_JSON_VALUE)
	public String unaddent(@RequestBody Usernews un) {
		return uns.unaddenter(un);
	}
	@PatchMapping(value="addpol", consumes=MediaType.APPLICATION_JSON_VALUE)
	public String addpol(@RequestBody Usernews un) {
		return uns.addpol(un);
	}
	@PatchMapping(value="unaddpol", consumes=MediaType.APPLICATION_JSON_VALUE)
	public String unaddpol(@RequestBody Usernews un) {
		return uns.unaddpol(un);
	}
	@PatchMapping(value="addsci", consumes=MediaType.APPLICATION_JSON_VALUE)
	public String addsci(@RequestBody Usernews un) {
		return uns.addscience(un);
	}
	@PatchMapping(value="unaddsci", consumes=MediaType.APPLICATION_JSON_VALUE)
	public String unaddsci(@RequestBody Usernews un) {
		return uns.unaddscience(un);
	}
	@PatchMapping(value="addsport", consumes=MediaType.APPLICATION_JSON_VALUE)
	public String addsport(@RequestBody Usernews un) {
		return uns.addsports(un);
	}
	@PatchMapping(value="unaddsport", consumes=MediaType.APPLICATION_JSON_VALUE)
	public String unaddsport(@RequestBody Usernews un) {
		return uns.unaddsports(un);
	}
	@PatchMapping(value="addtech", consumes=MediaType.APPLICATION_JSON_VALUE)
	public String addtech(@RequestBody Usernews un) {
		return uns.addtechno(un);
	}
	@PatchMapping(value="unaddtech", consumes=MediaType.APPLICATION_JSON_VALUE)
	public String unaddtech(@RequestBody Usernews un) {
		return uns.unaddtechno(un);
	}
	@PatchMapping(value="addtrav", consumes=MediaType.APPLICATION_JSON_VALUE)
	public String addtrav(@RequestBody Usernews un) {
		return uns.addtravel(un);
	}
	@PatchMapping(value="unaddtrav", consumes=MediaType.APPLICATION_JSON_VALUE)
	public String unaddtrav(@RequestBody Usernews un) {
		return uns.unaddtravel(un);
	}
	
	@GetMapping(value="gettech", produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Object[]> gettech(){	
    	return uns.viewtech();
    }
    @GetMapping(value="getsport", produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Object[]> getsport(){
    	return uns.viewsport();
    }
    @GetMapping(value="gettravel", produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Object[]> gettravel(){
    	return uns.viewtravel();
    }
    @GetMapping(value="getenter", produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Object[]> getenter(){
    	return uns.viewenter();
    }
    
    @GetMapping(value="getscience", produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Object[]> getscience(){
    	return uns.viewscience();
    }
    @GetMapping(value="getpolitical", produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Object[]> getpolitical(){
    	return uns.viewpolitical();
    }
    @GetMapping(value="getbusi", produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Object[]> getbusi(){
    	return uns.viewbusi();
    }
    @GetMapping(value="getsportenttravel", produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Object[]> getsportenttravel(){
    	return uns.viewsportentertravel();
    }
    @GetMapping(value="getbupol", produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Object[]> getbupol(){
    	return uns.viewbupol();
    }
    
    
    @PostMapping(value="likes", consumes=MediaType.APPLICATION_JSON_VALUE)
    public String likes(@RequestBody Alltopics at) {
    	return uns.like(at);
    }
    @PostMapping(value="dislikes", consumes=MediaType.APPLICATION_JSON_VALUE)
    public String dislikes(@RequestBody Alltopics at) {
    	return uns.dislike(at);

    }
    @PatchMapping(value="comments/{email}", consumes=MediaType.APPLICATION_JSON_VALUE)
    public String comments(@RequestBody Alltopics at,@PathVariable("email") String email) {
    	System.out.println("--"+at.getTid());
    	return uns.comment(at, email);
    }
	@PatchMapping(value="getcomment/{tid}", consumes=MediaType.APPLICATION_JSON_VALUE)
	public Optional<Alltopics> getcomment(@RequestBody @PathVariable("tid") int tid){
		return uns.viewcom(tid);
	}
	@DeleteMapping(value="deltop/{tid}")
	public String deltop(@PathVariable("tid") int tid) {
		return uns.deletetop(tid);
		
	}
	
	
}
