package com.CollegePlacementManagementSystem.dto;

public class applications {
 private int application_id;
 private int student_id;
 private int job_id;
 private String applied_date;
 private String status;
 public int getApplication_id() {
	return application_id;
 }
 public void setApplication_id(int application_id) {
	this.application_id = application_id;
 }
 public int getStudent_id() {
	return student_id;
 }
 public void setStudent_id(int student_id) {
	this.student_id = student_id;
 }
 public int getJob_id() {
	return job_id;
 }
 public void setJob_id(int job_id) {
	this.job_id = job_id;
 }
 public String getApplied_date() {
	return applied_date;
 }
 public void setApplied_date(String applied_date) {
	this.applied_date = applied_date;
 }
 public String getStatus() {
	return status;
 }
 public void setStatus(String status) {
	this.status = status;
 }
 @Override
 public String toString() {
	return "applications [application_id=" + application_id + ", student_id=" + student_id + ", job_id=" + job_id
			+ ", applied_date=" + applied_date + ", status=" + status + "]";
 }
 
 
 
}
