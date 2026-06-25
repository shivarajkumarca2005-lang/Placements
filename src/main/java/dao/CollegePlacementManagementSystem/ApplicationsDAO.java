package dao.CollegePlacementManagementSystem;

import java.util.List;

import com.CollegePlacementManagementSystem.dto.applications;

public interface ApplicationsDAO {
	void applyjob(applications application); 
	List<applications> getApplicationByStudent(int Student_id);
	List<applications> getAllApplications();
	void updateApplicationStatus(int application_id, String status );
	void deleteApplication(int application_id);
}
