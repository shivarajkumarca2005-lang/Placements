package com.CollegePlacementManagementSystem.dto;

public class admin {
	 private int adminId;
	    private String username;
	    private String password;
	    private String email;
		public int getAdminId() {
			return adminId;
		}
		public void setAdminId(int adminId) {
			this.adminId = adminId;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
			
			
		}
		@Override
		public String toString() {
			return "admin [adminId=" + adminId + ", username=" + username + ", password=" + password + ", email="
					+ email + "]";
		}
		
}
