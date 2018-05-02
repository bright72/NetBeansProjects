/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JTextField;

public class CalculateListener implements ActionListener {

    public CalculateListener(JTextField[] grades, JTextField[] credits, JTextField GPA) {
        txtGrades = grades;
        txtCredits = credits;
        txtGPA = GPA;

    }
    private JTextField txtGrades[];
    private JTextField txtCredits[];
    private JTextField txtGPA;

    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        if (e.getActionCommand().equals("Calculate")) {
        caculateGrade();
        }
        else if (e.getActionCommand().equals("Save")){
        
        saveToDataFile();
        }
        else if (e.getActionCommand().equals("Save As Object")){
         saveToObjectFile();
        
        }
    }
    
     public void saveToObjectFile(){
         System.out.println("Saving To Object File......");
     
     }
    
      public void saveToDataFile(){
       System.out.println("Saving To Data File......");
      
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
