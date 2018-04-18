package sit.view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import sit.Controller.CourseController;
import sit.model.Course;

public class TestCourseDB {

    public static void main(String[] args) {
        try{
            CourseController courseCtrl = new CourseController("db.properties");
            //CourseController courseCtrl = new CourseController("sit","sit");
            //courseCtrl.dropCourseTable();
            //courseCtrl.createCourseTable();
            //Course c1 = new Course ("INT105","Computer Programming II");
            //int insertedRec = courseCtrl.insertCourse(c1);
            //System.out.println(insertedRec+"Inserted Record");          
            //courseCtrl.insertFromFile("courseList.txt");
//            ArrayList<Course> cList = courseCtrl.selectCourse();
//            for (int i = 0; i < cList.size(); i++) {
//                System.out.println(cList.get(i));
//                String cId = cList.get(i).getCourseId();
//                if (cId.equalsIgnoreCase("GEN111")) {
//                    cList.get(i).setCourseName("Strong Man");
//                }
//            }
//            courseCtrl.excuteSQLFromUser("select * from course where courseId='GEN111'");
//            courseCtrl.excuteSQLFromUser("update course set courseName = 'Strong Man' where courseId = 'GEN111'");
                    
            courseCtrl.closeCourseConnection();
        }
        catch(ClassNotFoundException cnf){
            System.out.println(cnf);
        }
        catch(SQLException cnf) {
            System.out.println(cnf);
        }
        catch(IOException io) {
            System.out.println(io);
        }
        //catch(FileNotFoundException fnf){
        //    System.out.println(fnf);
        //}
        
    }
}
