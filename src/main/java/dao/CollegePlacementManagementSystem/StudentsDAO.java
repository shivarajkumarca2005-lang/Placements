package dao.CollegePlacementManagementSystem;

import java.util.List;

import com.CollegePlacementManagementSystem.dto.Students;

public interface StudentsDAO {
	void addStudent(Students student);

    Students login(String email, String password);

    List<Students> getAllStudents();

    Students getStudentById(int id);

    void updateStudent(Students student);

    void deleteStudent(int id);
}
