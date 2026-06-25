package dao.CollegePlacementManagementSystem;

public interface AdminDAO {
	AdminDAO login(String username, String password);

   void changePassword(int adminId, String password);
}
