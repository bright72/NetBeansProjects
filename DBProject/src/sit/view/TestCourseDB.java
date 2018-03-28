/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.view;

import java.sql.SQLException;
import sit.controller.CourseController;
import sit.model.Course;

/**
 *
 * @author harit
 */
public class TestCourseDB {
    public static void main(String[] args) {
       
        try{
         CourseController courseCtrl = new CourseController("sit","sit");
        courseCtrl.creatCourseTable();
         Course subject = new Course ("INT105","Computer Programing II");
 //   courseCtrl.dropCourseTable();
            courseCtrl.insertCourse(subject);
         courseCtrl.closeCourseConnection();
        }
        catch(SQLException sqlEx){
            System.out.println(sqlEx);
        }
        catch(ClassNotFoundException cnfEx){
            System.out.println(cnfEx);
        }

    }
}
