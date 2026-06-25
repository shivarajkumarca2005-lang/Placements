package dao.CollegePlacementManagementSystem;

import java.util.List;

import com.CollegePlacementManagementSystem.dto.notices;

public interface NoticesDAO {

    boolean addNotice(notices notice);

    List<notices> getAllNotices();

    notices getNoticeById(int id);

    void updateNotice(notices notice);

    void deleteNotice(int id);
}
