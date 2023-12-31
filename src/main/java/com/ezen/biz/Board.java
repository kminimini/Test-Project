package com.ezen.biz;

public class Board {
	
	private int seq;
	private String name;
	private String email;
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Board [seq=" + seq + ", name=" + name + ", email=" + email + "]";
	}
	
}
