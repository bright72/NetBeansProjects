package sit.Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import sit.db.ConnectionManager;
import sit.model.Course;

public class CourseController {

    private Connection con;

    public CourseController(String username, String psw)
            throws ClassNotFoundException, SQLException {
        con = ConnectionManager.createConnection("jdbc:derby://localhost:1527/course", username, psw);
    }
     public CourseController(String fileName)
            throws ClassNotFoundException, SQLException, IOException {
        con = ConnectionManager.createConnection(fileName);
    }

    public void excuteSQLFromUser(String sql) throws SQLException {
        Statement stmt = con.createStatement();
        boolean hasResultset = stmt.execute(sql);
        if (hasResultset) {
            ResultSet rs = stmt.getResultSet();

            //Same process statement with excuteQuery
            while (rs.next()) {
                //ORM - object relational mapping
                String cId = rs.getString("courseId"); //ใส่ชื่อคอลัมน์
                String cName = rs.getString("CourseName");
                Course cTmp = new Course(cId, cName);
                System.out.println(cTmp);
            }
        } 
        else {
            //Same process statement with excuteUpdate
            int updatedRecs = stmt.getUpdateCount();
            System.out.println(updatedRecs + " Update Records");
        }
    }

    

    

    public ArrayList<Course> selectCourse() throws SQLException {
        ArrayList<Course> courseList = new ArrayList<Course>();

        Statement stmt = con.createStatement();
        String sql = "select * from course";
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            //ORM - object relational mapping
            String cId = rs.getString("courseId"); //ใส่ชื่อคอลัมน์
            String cName = rs.getString("CourseName");
            Course cTmp = new Course(cId, cName);
            //System.out.println(cTmp);
            courseList.add(cTmp); //add ลง arrayList
        }
        return courseList;
    }

    public void createCourseTable() throws SQLException {
        String sql = "create table course"
                + "(courseId varchar(6),"
                + "courseName varchar(50),"
                + "primary key(courseId))";
        System.out.println(sql);

        Statement stmt = con.createStatement();
        stmt.executeUpdate(sql);
        System.out.println("create table course successfully");
    }

    public void closeCourseConnection() throws SQLException {
        ConnectionManager.closeConnection(con);
    }

    public void dropCourseTable() throws SQLException {
        String sql = "drop table course";
        System.out.println(sql);

        Statement stmt = con.createStatement();
        stmt.executeUpdate(sql);
        System.out.println("drop table course successfully");
    }

    public int insertFromFile(String fileName) throws FileNotFoundException, SQLException {
        Scanner scFile = new Scanner(new File(fileName));
        scFile.useDelimiter(",");
        int insertedRecs = 0;

        PreparedStatement pStmt = con.prepareStatement("insert into course(courseId, courseName) values (?,?)");

        while (scFile.hasNext()) {
            //System.out.println(scFile.next());
            //set CId to the first question mark
            String cId = (scFile.next()).trim();
            //set CName to the second question mark
            String cName = (scFile.next()).trim();
            pStmt.setString(1, cId);
            pStmt.setString(2, cName);
            insertedRecs += pStmt.executeUpdate();
            System.out.println(insertedRecs + " inserted Recs");
            //Course cTmp = new Course(cId, cName);
            //insertedRecs+=insertCourse(cTmp);
        }
        return insertedRecs;
    }

    public int insertCourse(Course subject) throws SQLException {
        String sql = "insert into course(courseId, courseName) values ("
                + "'" + subject.getCourseId() + "' , '" + subject.getCourseName() + "')";
        System.out.println(sql);

        Statement stmt = con.createStatement();
        int insertedRec = stmt.executeUpdate(sql);
        System.out.println(insertedRec + " inserted successfully");
        return insertedRec;
    }
}
