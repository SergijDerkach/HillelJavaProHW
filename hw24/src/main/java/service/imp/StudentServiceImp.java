package service.imp;

import org.example.DBService;
import org.example.Student;
import service.interf.StudentServiceInt;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentServiceImp implements StudentServiceInt {
    @Override
    public Boolean addStudent(String fullname, int group, String yearOfAdmission) throws SQLException {
        DBService db = new DBService();
        Connection con = db.greateConnection();
        Statement st = db.createStatement(con);

        st.execute("insert into studens (full_name,group_student,year_of_admission) values ('"+fullname + "','" +group +"','" + yearOfAdmission +"')");

        db.closeConnection(con);
        return true;
    }

    @Override
    public Boolean getAll() throws SQLException {
        DBService db = new DBService();
        Connection con = db.greateConnection();
        Statement st = db.createStatement(con);

        ResultSet rs = st.executeQuery("select * from studens ");

        List<Student> students = new ArrayList<>();

        while (rs.next()){
            int id = rs.getInt("id_student");
            String full_name = rs.getString("full_name");
            String gr = rs.getString("group_student");
            String year = rs.getString("year_of_admission");
            students.add(new Student(id,full_name,gr,year));
        }

        for (Student s: students) {
            System.out.println(s);
        }
        db.closeConnection(con);
        return true;
    }

    @Override
    public Boolean getByIds(List<Integer> Ids) throws SQLException {
        DBService db = new DBService();
        Connection con = db.greateConnection();
        Statement st = db.createStatement(con);

        String ids = Ids.stream()
                .map(n -> String.valueOf(n))
                .collect(Collectors.joining(",", "(", ")"));


        ResultSet rs = st.executeQuery("select * from studens where id_student in" + ids);

        List<Student> students = new ArrayList<>();

        while (rs.next()){
            int id = rs.getInt("id_student");
            String full_name = rs.getString("full_name");
            String gr = rs.getString("group_student");
            String year = rs.getString("year_of_admission");
            students.add(new Student(id,full_name,gr,year));
        }

        for (Student s: students) {
            System.out.println(s);
        }

        db.closeConnection(con);
        return true;
    }

    @Override
    public Boolean getByName(String name) throws SQLException {
        DBService db = new DBService();
        Connection con = db.greateConnection();
        Statement st = db.createStatement(con);

        ResultSet rs = st.executeQuery("select * from studens where full_name = '"+ name +"'");

        List<Student> students = new ArrayList<>();

        while (rs.next()){
            int id = rs.getInt("id_student");
            String full_name = rs.getString("full_name");
            String gr = rs.getString("group_student");
            String year = rs.getString("year_of_admission");
            students.add(new Student(id,full_name,gr,year));
        }

        for (Student s: students) {
            System.out.println(s);
        }

        db.closeConnection(con);
        return true;
    }

    @Override
    public Boolean deleteSt(String name,int group) throws SQLException {
        DBService db = new DBService();
        Connection con = db.greateConnection();
        Statement st = db.createStatement(con);

        st.execute("delete from studens where full_name ='"+name+"' and group_student ='"+group+"'");

        db.closeConnection(con);
        return true;
    }
}
