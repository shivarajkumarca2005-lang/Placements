package com.CollegePlacementManagementSystem.dto;

public class notices {
private int notice_id;
private String title;
private String content;
private String posted_at;
private int posted_by_id;
public int getNotice_id() {
	return notice_id;
}
public void setNotice_id(int notice_id) {
	this.notice_id = notice_id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String getPosted_at() {
	return posted_at;
}
public void setPosted_at(String posted_at) {
	this.posted_at = posted_at;
}
public int getPosted_by_id() {
	return posted_by_id;
}
public void setPosted_by_id(int posted_by_id) {
	this.posted_by_id = posted_by_id;
}
@Override
public String toString() {
	return "notices [notice_id=" + notice_id + ", title=" + title + ", content=" + content + ", posted_at=" + posted_at
			+ ", posted_by_id=" + posted_by_id + "]";
}

}
