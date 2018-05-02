/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpacalculate;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author harit
 */
public class Gpacalculate {

    private JFrame currFrame;
    private JLabel courselabel;
    private JLabel GradeLabel;
    private JLabel creditLabel;
    private JLabel coursename[];
    private JTextField grade[];
    private JTextField credit[];
    private JLabel gpaLabel;
    private String fixname[] = {"INT105", "INT106", "INT107", "GEN111", "LNG102", "MTH111"};
    private JTextField total;
    private JButton calculatebtr;

    public Gpacalculate() {
        initGui();
    }

    public void initGui() {

        currFrame = new JFrame("GPA Calculator");
        courselabel = new JLabel("Course");
        GradeLabel = new JLabel("Grade");
        creditLabel = new JLabel("Credit");
        gpaLabel = new JLabel("GPA");
        total = new JTextField("Total");
        calculatebtr = new JButton("Calculate");

        coursename = new JLabel[6];
        grade = new JTextField[6];
        credit = new JTextField[6];

        for (int i = 0; i < coursename.length; i++) {
            coursename[i] = new JLabel(fixname[i]);
            grade[i] = new JTextField("Input Grade");
            credit[i] = new JTextField("Credit Grade");
        }

    }

    public void loadGpaForm() {
        GridLayout grid = new GridLayout(1, 3);
        JPanel GpaPanal1 = new JPanel();
        GridLayout grid2 = new GridLayout(7, 3);
        JPanel GpaPanal2 = new JPanel();
        GpaPanal1.setLayout(grid);
        GpaPanal2.setLayout(grid2);

        GpaPanal1.add(courselabel);
        GpaPanal1.add(GradeLabel);
        GpaPanal1.add(creditLabel);

        for (int i = 0; i < coursename.length; i++) {
            GpaPanal2.add(coursename[i]);
            GpaPanal2.add(grade[i]);
            GpaPanal2.add(credit[i]);
        }
        GpaPanal2.add(gpaLabel);
        GpaPanal2.add(total);
        
        GpaListener cvtListeber = new GpaListener(grade,credit);
        calculatebtr.addActionListener(cvtListeber);
        GpaPanal2.add(calculatebtr);
        
        

        currFrame.add(GpaPanal1, BorderLayout.NORTH);
        currFrame.add(GpaPanal2, BorderLayout.CENTER);
        currFrame.setSize(200, 200);
        currFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        currFrame.setVisible(true);
    }
}
