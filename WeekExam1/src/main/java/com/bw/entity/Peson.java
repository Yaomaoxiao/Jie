package com.bw.entity;

public class Peson {
   private int pid;
   private String pname;
   private String ptime;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getPtime() {
	return ptime;
}
public void setPtime(String ptime) {
	this.ptime = ptime;
}
@Override
public String toString() {
	return "Peson [pid=" + pid + ", pname=" + pname + ", ptime=" + ptime + "]";
}
   
}
