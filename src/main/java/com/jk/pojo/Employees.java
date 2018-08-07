package com.jk.pojo;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Employees {

	private     Integer     id;
	private     String     emp_no;
	private     String     emp_name;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private     Date       emp_hiredate;
	private     Integer     emp_sex;
	private     String     emp_phone;
	private     String     emp_email;
	
	
	//业务字段
	private      String      riqi;
	private      Integer      renshu;
	
	
	//List   业务字段
	
	private    List<String> riqilist;
	private    List<Integer> renshulist;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(String emp_no) {
		this.emp_no = emp_no;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public Date getEmp_hiredate() {
		return emp_hiredate;
	}
	public void setEmp_hiredate(Date emp_hiredate) {
		this.emp_hiredate = emp_hiredate;
	}
	public Integer getEmp_sex() {
		return emp_sex;
	}
	public void setEmp_sex(Integer emp_sex) {
		this.emp_sex = emp_sex;
	}
	public String getEmp_phone() {
		return emp_phone;
	}
	public void setEmp_phone(String emp_phone) {
		this.emp_phone = emp_phone;
	}
	public String getEmp_email() {
		return emp_email;
	}
	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}
	public String getRiqi() {
		return riqi;
	}
	public void setRiqi(String riqi) {
		this.riqi = riqi;
	}
	public Integer getRenshu() {
		return renshu;
	}
	public void setRenshu(Integer renshu) {
		this.renshu = renshu;
	}
	public List<String> getRiqilist() {
		return riqilist;
	}
	public void setRiqilist(List<String> riqilist) {
		this.riqilist = riqilist;
	}
	public List<Integer> getRenshulist() {
		return renshulist;
	}
	public void setRenshulist(List<Integer> renshulist) {
		this.renshulist = renshulist;
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", emp_no=" + emp_no + ", emp_name=" + emp_name + ", emp_hiredate="
				+ emp_hiredate + ", emp_sex=" + emp_sex + ", emp_phone=" + emp_phone + ", emp_email=" + emp_email
				+ ", riqi=" + riqi + ", renshu=" + renshu + ", riqilist=" + riqilist + ", renshulist=" + renshulist
				+ "]";
	}
	
	
}
