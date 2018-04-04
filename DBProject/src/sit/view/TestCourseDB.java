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
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author harit
 */
public class TestCourseDB {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        try {
            CourseController courseCtrl = new CourseController("sit", "sit");
//            ArrayList<Course> cList = courseCtrl.selectCourses();
//            for (int i = 0; i < cList.size(); i++) {
//                System.out.println(cList.get(i));
//                String cId = (cList.get(i)).getCourseId();
//                if(cId.equalsIgnoreCase("GEN111")){
//                cList.get(i).setCourseName("Strong Man");
//                }
//            }
//            //courseCtrl.dropCourseTable();
            courseCtrl.creatCourseTable();
//            //
//            Course c1 = new Course("int105","COMPURER PROGRAMING II");
//            int insertedrRec = courseCtrl.insertCourse(c1);
//            System.out.println(insertedrRec+"insertcourseRecord");
//            courseCtrl.insertCourse(c1);
//            courseCtrl.insertFromFile("courseList.txt");
//            String sql = sc.nextLine();
//
//            courseCtrl.executeSQLFromUser(sql);

            courseCtrl.closeCourseConnection();

        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);
        } catch (ClassNotFoundException cnfEx) {
            System.out.println(cnfEx);
//        } catch (FileNotFoundException vb) {
//            System.out.println(vb);
        }

    }
}
