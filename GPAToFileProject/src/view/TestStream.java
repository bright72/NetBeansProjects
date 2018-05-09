/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import StudentGrade.StudentGrade;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

/**
 *
 * @author harit
 */
public class TestStream {

    public static void main(String[] args) {

//        try {
//            FileInputStream fis = new FileInputStream("myGrade.dat");
//            DataInputStream dis = new DataInputStream(fis);
//            int count = 0;
//            while (count < 6) {
//                String subject = dis.readUTF();
//                String grade = dis.readUTF();
//                float credit = dis.readFloat();
//                System.out.println(subject + " , " + grade + " , " + credit);
//                count++;
//            }
//            float gpa = dis.readFloat();
//            System.out.println("GPA" + gpa);
//
//        } catch (FileNotFoundException b) {
//            System.out.println(b);
//        } catch (IOException a) {
//            System.out.println(a);
//
//        }
        Scanner sc = new Scanner(System.in);
        InputStream fis = null;

        try {
            System.out.println("Enter your filename : ");
            String fileName = sc.next();

            fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);

            int count = 0;
            while (true) {
                Object tmp = ois.readObject();
                StudentGrade stdGrade = (StudentGrade) tmp;
                System.out.println(stdGrade);
                count++;
            }

        } catch (FileNotFoundException r) {
            System.out.println(r);
        } catch (EOFException l) {
            System.out.println(l);
        } catch (IOException a) {
            System.out.println(a);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

    }
}
