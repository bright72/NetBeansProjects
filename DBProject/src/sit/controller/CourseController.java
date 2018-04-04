package sit.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import org.apache.derby.impl.sql.compile.ResultSetNode;
import sit.db.ConnectionManager;
import sit.model.Course;

public class CourseController {

    private Connection con;

    public CourseController(String username, String psw) throws SQLException, ClassNotFoundException {
        con = ConnectionManager.creatConnection(psw, username, psw);
    }

    public void creatCourseTable() throws SQLException {
        String sql = "create table course"
                + "(courseId varchar(6),"
                + "courseName varchar(50),"
                + "primary key(courseId))";
        System.out.println(sql);
        Statement stmt = con.createStatement();
        stmt.execute(sql);
        System.out.println("Create table course successfully");
    }

    public void dropCourseTable() throws SQLException {
        String sql = "drop table course";
        System.out.println(sql);
        Statement stmt = con.createStatement();
        stmt.execute(sql);
        System.out.println("Drop table course successfully");
    }

    public int insertCourse(Course subject) throws SQLException {
        String sql = "insert into course(courseId,courseName) values('" + subject.getCourseId() + "','" + subject.getCourseName() + "')";
        System.out.println(sql);
        Statement stmt = con.createStatement();
        int insertedRec = stmt.executeUpdate(sql);

        return insertedRec;
    }

    public int insertFromFile(String filename) throws FileNotFoundException, SQLException {
        Scanner sc = new Scanner(new File(filename));
        sc.useDelimiter(",");
        int insertedRecs = 0;

        PreparedStatement pStmt = con.prepareStatement("insert into course(courseId,courseName) values(?,?)");

        while (sc.hasNext()) {
            String cId = (sc.next()).trim();
            String cName = (sc.next()).trim();
            pStmt.setString(1, cId);
            pStmt.setString(2, cName);
//            Course cTmp = new Course(cId,cName);
            insertedRecs += pStmt.executeUpdate();

        }
        return insertedRecs;
    }

    public ArrayList<Course> selectCourses() throws SQLException {
        ArrayList<Course> courseList = new ArrayList<Course>();
        Statement stmt = con.createStatement();
        String sql = "select * from course";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            String cId = rs.getString("courseId");
            String cName = rs.getString("courseNAme");
            Course cTmp = new Course(cId, cName);
//            System.out.println(cTmp);
           courseList.add(cTmp);

        }

        return courseList;

    }

    public void closeCourseConnection() throws SQLException {
        ConnectionManager.closeConnection(con);
    }
    public void executeSQLFromUser(String sql) throws SQLException{
    Statement stmt = con.createStatement();
    boolean hasResultset = stmt.execute(sql);
        if (hasResultset) {
            ResultSet rs = stmt.getResultSet();
            while (hasResultset) {                
                String cId = rs.getString("courseId");
            String cName = rs.getString("courseNAme");
            Course cTmp = new Course(cId, cName);
                System.out.println(cTmp);
            }
            
        }
        else{
        int updateRecs = stmt.getUpdateCount();
            System.out.println(updateRecs+" Update Records");
        }
    }
}
