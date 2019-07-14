package com.bw.entity;

public class Goods {
   private int gid;
   private String gname;
public int getGid() {
	return gid;
}
public void setGid(int gid) {
	this.gid = gid;
}
public String getGname() {
	return gname;
}
public void setGname(String gname) {
	this.gname = gname;
}
@Override
public String toString() {
	return "Goods [gid=" + gid + ", gname=" + gname + "]";
}
   
}
