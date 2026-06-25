package dao.CollegePlacementManagementSystem;

import java.util.List;

import com.CollegePlacementManagementSystem.dto.companies;

public interface CompaniesDAO {
	void addCompany(companies company);
	List<companies> getAllCompanies();
	companies getCompanyById(int id);

    void updateCompany(companies company);

    void deleteCompany(int id);
}
