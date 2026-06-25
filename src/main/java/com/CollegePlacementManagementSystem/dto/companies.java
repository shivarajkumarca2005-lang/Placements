package com.CollegePlacementManagementSystem.dto;

public class companies {
private String company_name;
private int copanny_id;
private String hr_name;
private String hr_email;
private long phone;
private String location;
private String description;
public String getCompany_name() {
	return company_name;
}
public void setCompany_name(String company_name) {
	this.company_name = company_name;
}
public int getCopanny_id() {
	return copanny_id;
}
public void setCopanny_id(int copanny_id) {
	this.copanny_id = copanny_id;
}
public String getHr_name() {
	return hr_name;
}
public void setHr_name(String hr_name) {
	this.hr_name = hr_name;
}
public String getHr_email() {
	return hr_email;
}
public void setHr_email(String hr_email) {
	this.hr_email = hr_email;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
public String toString() {
	return "companies [company_name=" + company_name + ", copanny_id=" + copanny_id + ", hr_name=" + hr_name
			+ ", hr_email=" + hr_email + ", phone=" + phone + ", location=" + location + ", description=" + description
			+ "]";
}

}
