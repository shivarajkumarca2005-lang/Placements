package dao.CollegePlacementManagementSystem;

import java.util.List;

import com.CollegePlacementManagementSystem.dto.jobs;

public interface JobsDAO {
	 void addJob(jobs job);

	    List<jobs> getAllJobs();

	    jobs getJobById(int id);

	    List<jobs> getJobsByCompany(int companyId);

	    void updateJob(jobs job);

	   void deleteJob(int id);
}
