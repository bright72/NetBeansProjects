package sit.model;

public class Course {

    private String courseName;

    private int numberOfStudents;
    private RegisStudent[] students;

    public Course(String courseName, int numOfStudentCanRegis) {
        this.courseName = courseName;
        students = new RegisStudent[numOfStudentCanRegis];
        this.numberOfStudents = 0;
    }

    public int addStudent(RegisStudent student) {
        int value = 0;
        for (int i = 0; i < students.length; i++) {
            if (student.equals(students[i])) {
                value = 1;
            }
        }
        if (value == 0) {
            if (numberOfStudents < students.length) {
                students[numberOfStudents] = student;
                numberOfStudents++;
                return numberOfStudents - 1;
            } else {
                return -2;
            }
        } else {
            return -1;
        }
    }

    public boolean dropStudent(RegisStudent student) {
        boolean check = true;
        int index = 0;
        boolean value = false;
        for (int i = 0; i < students.length; i++) {
            if (student.equals(students[i])) {
                index = i;
                check = false;
                break;
            }
        }
        if (check == false) {
            for (int i = index; i < students.length-1; i++) {
                students[i] = students[i+1];
            }
            numberOfStudents--;
            value = true;
        } else {
            value = false;
        }
        return value;
    }

    public RegisStudent[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public String toString() {
        String course = "----" + courseName + "----\n";
        for (RegisStudent rs : students) {
            course += rs + "\n";
        }
        return course;

    }
}
