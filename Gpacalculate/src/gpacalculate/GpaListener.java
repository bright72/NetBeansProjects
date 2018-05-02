/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpacalculate;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JTextField;

/**
 *
 * @author harit
 */
public class GpaListener implements ActionListener {

    private JTextField grade[];
    private JTextField credit[];
    private double g;

    public GpaListener(JTextField[] grade, JTextField[] credit) {
        this.grade = grade;
        this.credit = credit;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DecimalFormat dcm = new DecimalFormat("#.##");
        System.out.println(e.getActionCommand());
        double eachGrade[] = new double[6];
        for (int i = 0; i < 6; i++) {
            if (grade[i].getText().equalsIgnoreCase("A")) {
                eachGrade[i] = 4 * Double.parseDouble(credit[i].getText());
            }
            else if (grade[i].getText().equalsIgnoreCase("B+")) {
                eachGrade[i] = 3.5 * Double.parseDouble(credit[i].getText());
            }
            else if (grade[i].getText().equalsIgnoreCase("B")) {
                eachGrade[i] = 3 * Double.parseDouble(credit[i].getText());
            }
             else if (grade[i].getText().equalsIgnoreCase("C+")) {
                eachGrade[i] = 2.5 * Double.parseDouble(credit[i].getText());
            }
             else if (grade[i].getText().equalsIgnoreCase("C")) {
                eachGrade[i] = 2 * Double.parseDouble(credit[i].getText());
            }
             else if (grade[i].getText().equalsIgnoreCase("D+")) {
                eachGrade[i] = 1.5 * Double.parseDouble(credit[i].getText());
            }
             else if (grade[i].getText().equalsIgnoreCase("D")) {
                eachGrade[i] = 1 * Double.parseDouble(credit[i].getText());
            }
             else if (grade[i].getText().equalsIgnoreCase("F")) {
                eachGrade[i] = 0 * Double.parseDouble(credit[i].getText());
            }
        }
    }
}
