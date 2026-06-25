package com.CollegePlacementManagementSystem.dto;

public class jobs {
private int job_id;
private int company_id;
private String job_title;
private String description;
private double package_lpa;
private int backlogs;
private double cgpa;
private String skills;
private String dead_line;
private String interview_date;
private String status;
public int getJob_id() {
	return job_id;
}
public void setJob_id(int job_id) {
	this.job_id = job_id;
}
public int getCompany_id() {
	return company_id;
}
public void setCompany_id(int company_id) {
	this.company_id = company_id;
}
public String getJob_title() {
	return job_title;
}
public void setJob_title(String job_title) {
	this.job_title = job_title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getPackage_lpa() {
	return package_lpa;
}
public void setPackage_lpa(double package_lpa) {
	this.package_lpa = package_lpa;
}
public int getBacklogs() {
	return backlogs;
}
public void setBacklogs(int backlogs) {
	this.backlogs = backlogs;
}
public double getCgpa() {
	return cgpa;
}
public void setCgpa(double cgpa) {
	this.cgpa = cgpa;
}
public String getSkills() {
	return skills;
}
public void setSkills(String skills) {
	this.skills = skills;
}
public String getDead_line() {
	return dead_line;
}
public void setDead_line(String dead_line) {
	this.dead_line = dead_line;
}
public String getInterview_date() {
	return interview_date;
}
public void setInterview_date(String interview_date) {
	this.interview_date = interview_date;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "jobs [job_id=" + job_id + ", company_id=" + company_id + ", job_title=" + job_title + ", description="
			+ description + ", package_lpa=" + package_lpa + ", backlogs=" + backlogs + ", cgpa=" + cgpa + ", skills="
			+ skills + ", dead_line=" + dead_line + ", interview_date=" + interview_date + ", status=" + status + "]";
}


}
