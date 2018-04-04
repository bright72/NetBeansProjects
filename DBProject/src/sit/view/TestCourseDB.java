/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.view;

import java.sql.SQLException;
import sit.controller.CourseController;
import sit.model.Course;
import java.*;
import java.io.FileNotFoundException;

/**
 *
 * @author harit
 */
public class TestCourseDB {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            CourseController courseCtrl = new CourseController("sit", "sit");
//            //courseCtrl.dropCourseTable();
//            //courseCtrl.creatCourseTable();
//            //
//            Course c1 = new Course("int105","COMPURER PROGRAMING II");
//            int insertedrRec = courseCtrl.insertCourse(c1);
//            System.out.println(insertedrRec+"insertcourseRecord");
//            courseCtrl.insertCourse(c1);
            courseCtrl.insertFromFile("courseList.txt");
            courseCtrl.closeCourseConnection();

        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);
        } catch (ClassNotFoundException cnfEx) {
            System.out.println(cnfEx);
        } catch (FileNotFoundException vb) {
            System.out.println(vb);
        }

    }
}
