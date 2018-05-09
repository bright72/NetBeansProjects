/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import StudentGrade.StudentGrade;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JTextField;
import view.StudentGradeView;

public class CalculateListener implements ActionListener {

    private JTextField txtGrades[];
    private JTextField txtCredits[];
    private JTextField txtGPA;
    private JLabel lblSubjects[];

    public CalculateListener(JTextField[] txtGrades, JTextField[] txtCredits, JTextField txtGPA, JLabel[] lblSubjects) {
        this.txtGrades = txtGrades;
        this.txtCredits = txtCredits;
        this.txtGPA = txtGPA;
        this.lblSubjects = lblSubjects;
    }



    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        if (e.getActionCommand().equals("Calculate")) {
            caculateGrade();
        } else if (e.getActionCommand().equals("Save")) {
            saveToDataFile();
        } else if (e.getActionCommand().equals("Save As Object")) {
            saveToObjectFile();

        }
    }

    public void saveToObjectFile() {
        System.out.println("Saving To Object File......");
try {
            FileOutputStream fos = new FileOutputStream("myGrade-object.dat");
            ObjectOutputStream dos = new ObjectOutputStream(fos);

            for (int i = 0; i < lblSubjects.length; i++) {
                String subject = lblSubjects[i].getText();
                String grade = txtGrades[i].getText();
                String temp = txtCredits[i].getText();
                float credit = Float.parseFloat(temp);
                
                StudentGrade myStdGrade = new StudentGrade(subject,grade,credit);
                dos.writeObject(myStdGrade);
      

            }

            dos.close();

        } catch (FileNotFoundException fnf) {
            System.out.println(fnf);
        } catch (IOException r) {
            System.out.println(r);
        }
    }

    public void saveToDataFile() {
        System.out.println("Saving To Data File......");

        try {
            FileOutputStream fos = new FileOutputStream("myGrade.dat");
            DataOutputStream dos = new DataOutputStream(fos);

            for (int i = 0; i < lblSubjects.length; i++) {
                String subject = lblSubjects[i].getText();
                String grade = txtGrades[i].getText();
                String temp = txtCredits[i].getText();
                float credit = Float.parseFloat(temp);
                dos.writeUTF(subject);
                dos.writeUTF(grade);
                dos.writeFloat(credit);

            }
            String tmp2 = txtGPA.getText();
            float gpa = Float.parseFloat(tmp2);
            dos.writeFloat(gpa);
            dos.close();

        } catch (FileNotFoundException fnf) {
            System.out.println(fnf);
        } catch (IOException r) {
            System.out.println(r);
        }

    }

    public void caculateGrade() {
        DecimalFormat dc = new DecimalFormat("0.00");
        float totalGrade = 0;
        float totalCredit = 0;
        float gpa = 0;
        System.out.println("Calculating");
        for (int i = 0; i < txtGrades.length; i++) {
            float grade = convertGrade(txtGrades[i].getText());
            float credit = Float.parseFloat(txtCredits[i].getText());
            totalGrade += grade * credit;
            totalCredit += credit;
        }
        gpa = totalGrade / totalCredit;
        txtGPA.setText(dc.format(gpa) + "");
    }

    public float convertGrade(String gradeString) {
        float grade = 0;
        switch (gradeString) {
            case "A":
                grade = 4f;
                break;
            case "B":
                grade = 3f;
                break;
            case "B+":
                grade = 3.5f;
                break;
            case "C":
                grade = 2f;
                break;
            case "C+":
                grade = 2.5f;
                break;
            case "D":
                grade = 1;
                break;
            case "D+":
                grade = 1.5f;
                break;
            default:
                grade = 0;
                break;
        }
        return grade;

    }
}
