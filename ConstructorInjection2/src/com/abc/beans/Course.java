package com.abc.beans;

public class Course {
	
	private String cid;
	private String cname;
	private int cost;
	
	public Course(String cid, String cname, int cost) {
	
		this.cid = cid;
		this.cname = cname;
		this.cost = cost;
	}
	public String getCid() {
		return cid;
	}
	
	public String getCname() {
		return cname;
	}
	
	public int getCost() {
		return cost;
	}

	@Override
	public String toString() {
		return "Course[cid="+ cid+ ", cname="+ cname+ ", cost=" + cost+"]";
		
	}

}
