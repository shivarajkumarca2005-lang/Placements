package com.CollegePlacementManagementSystem.dto;

public class placement_results {
private int result_id;
private int Student_id;
private int company_id;
private int job_id;
private double package_lpa;
private String joining_date;
public int getResult_id() {
	return result_id;
}
public void setResult_id(int result_id) {
	this.result_id = result_id;
}
public int getStudent_id() {
	return Student_id;
}
public void setStudent_id(int student_id) {
	Student_id = student_id;
}
public int getCompany_id() {
	return company_id;
}
public void setCompany_id(int company_id) {
	this.company_id = company_id;
}
public int getJob_id() {
	return job_id;
}
public void setJob_id(int job_id) {
	this.job_id = job_id;
}
public double getPackage_lpa() {
	return package_lpa;
}
public void setPackage_lpa(double package_lpa) {
	this.package_lpa = package_lpa;
}
public String getJoining_date() {
	return joining_date;
}
public void setJoining_date(String joining_date) {
	this.joining_date = joining_date;
}
@Override
public String toString() {
	return "placement_results [result_id=" + result_id + ", Student_id=" + Student_id + ", company_id=" + company_id
			+ ", job_id=" + job_id + ", package_lpa=" + package_lpa + ", joining_date=" + joining_date + "]";
}


}
