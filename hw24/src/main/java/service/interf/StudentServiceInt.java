package service.interf;

import java.sql.SQLException;
import java.util.List;

public interface StudentServiceInt {

    Boolean addStudent(String fullname, int group, String yearOfAdmission) throws SQLException;
    Boolean getAll() throws SQLException;

    Boolean getByIds(List<Integer> Ids) throws SQLException;

    Boolean getByName(String name) throws SQLException;

    Boolean deleteSt(String name, int group) throws SQLException;
}
