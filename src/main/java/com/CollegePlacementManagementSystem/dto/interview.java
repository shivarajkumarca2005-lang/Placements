package com.CollegePlacementManagementSystem.dto;

public class interview {
	private int interview_id;
	private int application_id;
	private String round_name;
	private String interview_date;
	private String interview_time;
	private String venue;
	private String result;
	public int getInterview_id() {
		return interview_id;
	}
	public void setInterview_id(int interview_id) {
		this.interview_id = interview_id;
	}
	public int getApplication_id() {
		return application_id;
	}
	public void setApplication_id(int application_id) {
		this.application_id = application_id;
	}
	public String getRound_name() {
		return round_name;
	}
	public void setRound_name(String round_name) {
		this.round_name = round_name;
	}
	public String getInterview_date() {
		return interview_date;
	}
	public void setInterview_date(String interview_date) {
		this.interview_date = interview_date;
	}
	public String getInterview_time() {
		return interview_time;
	}
	public void setInterview_time(String interview_time) {
		this.interview_time = interview_time;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "interview [interview_id=" + interview_id + ", application_id=" + application_id + ", round_name="
				+ round_name + ", interview_date=" + interview_date + ", interview_time=" + interview_time + ", venue="
				+ venue + ", result=" + result + "]";
	}
	
}
