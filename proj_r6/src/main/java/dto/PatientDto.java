package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="PatientDetails")
public class PatientDto {
	@Id
private int pid;
private String pname;
private long phno;
private String pbgrp;
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
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
public String getPbgrp() {
	return pbgrp;
}
public void setPbgrp(String pbgrp) {
	this.pbgrp = pbgrp;
}


}
