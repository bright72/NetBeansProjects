
package sit.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import sit.db.ConnectionManager;
import sit.model.Course;


public class CourseController {
    private Connection con;

    public CourseController(String username , String psw) throws SQLException, ClassNotFoundException {
        con = ConnectionManager.creatConnection(psw, username, psw);
    }
    public void creatCourseTable() throws SQLException{
    String sql = "create table course"
            +"(courseId varchar(6),"
            +"courseName varchar(50),"
            +"primary key(courseId))";
        System.out.println(sql);
        Statement stmt = con.createStatement();
        stmt.execute(sql);
        System.out.println("Create table course successfully");
    }
    public void dropCourseTable() throws SQLException{
    String sql = "drop table course";
        System.out.println(sql);
        Statement stmt = con.createStatement();
        stmt.execute(sql);
        System.out.println("Drop table course successfully");
    }
    
    public int insertCourse(Course subject) throws SQLException{
    String sql = "insert into course(courseId,courseName) values('"+subject.getCourseId()+"','"+subject.getCourseName()+"')";
        System.out.println(sql);
        Statement stmt = con.createStatement();
        int insertedRec = stmt.executeUpdate(sql);
        
        
        return insertedRec;
    }
    public void closeCourseConnection() throws SQLException{
    ConnectionManager.closeConnection(con);
    }
}
