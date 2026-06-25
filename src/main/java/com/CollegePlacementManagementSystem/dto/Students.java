package com.CollegePlacementManagementSystem.dto;

public class Students {
	private String usn;
	private int Student_id;
	private String first_name;
	private String last_name;
	private String email;
	private String password;
	private long phone_number;
	private String dept;
	private int yop;
	private double cgpa;
	private double tenth_per;
	private double twele_per;
	private int backlog;
	private String skills;
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public int getStudent_id() {
		return Student_id;
	}
	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getYop() {
		return yop;
	}
	public void setYop(int yop) {
		this.yop = yop;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public double getTenth_per() {
		return tenth_per;
	}
	public void setTenth_per(double tenth_per) {
		this.tenth_per = tenth_per;
	}
	public double getTwele_per() {
		return twele_per;
	}
	public void setTwele_per(double twele_per) {
		this.twele_per = twele_per;
	}
	public int getBacklog() {
		return backlog;
	}
	public void setBacklog(int backlog) {
		this.backlog = backlog;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Students [usn=" + usn + ", Student_id=" + Student_id + ", first_name=" + first_name + ", last_name="
				+ last_name + ", email=" + email + ", password=" + password + ", phone_number=" + phone_number
				+ ", dept=" + dept + ", yop=" + yop + ", cgpa=" + cgpa + ", tenth_per=" + tenth_per + ", twele_per="
				+ twele_per + ", backlog=" + backlog + ", skills=" + skills + "]";
	}
	
}
