package dao.CollegePlacementManagementSystem;

import java.util.List;

import com.CollegePlacementManagementSystem.dto.placement_results;

public interface Placement_resultDAO {
	void addResult(placement_results result);

    List<placement_results> getAllResults();

    placement_results getResultById(int id);

    void updateResult(placement_results result);

    void deleteResult(int id);
}
