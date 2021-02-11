package com.abc.beans;

public class Course {

	private String cid;
	private String cname;
	private int cost;

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "[cid=" + cid + ", cname=" + cname + ", cost=" + cost + "]";
	}

}
