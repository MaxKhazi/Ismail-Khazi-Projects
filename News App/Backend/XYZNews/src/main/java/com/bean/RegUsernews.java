package com.bean;

public class RegUsernews {

	Reg reg;
	Usernews usernews;
	public Reg getReg() {
		return reg;
	}
	public void setReg(Reg reg) {
		this.reg = reg;
	}
	public Usernews getUsernews() {
		return usernews;
	}
	public void setUsernews(Usernews usernews) {
		this.usernews = usernews;
	}
	@Override
	public String toString() {
		return "RegUsernews [reg=" + reg + ", usernews=" + usernews + "]";
	}
	
	
}
