package sit.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
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

    public void closeCourseConnection() throws SQLException {
        ConnectionManager.closeConnection(con);
    }
}
