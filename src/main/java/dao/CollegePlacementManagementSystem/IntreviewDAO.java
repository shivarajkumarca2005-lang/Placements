package dao.CollegePlacementManagementSystem;

import java.util.List;

import com.CollegePlacementManagementSystem.dto.interview;

public interface IntreviewDAO {
	 void scheduleInterview(interview interview);

	    List<interview> getAllInterviews();

	    List<interview> getInterviewsByStudent(int studentId);

	    void updateInterview(interview interview);

	    void deleteInterview(int interviewId);
}
