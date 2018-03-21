
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author INT105
 */
public class CheckedException {

    public static int countWords(String fileName) throws FileNotFoundException, WrongWordException {

        int numOfWorld = 0;

        Scanner scFile = new Scanner(new File(fileName));
        while (scFile.hasNext()) {
            String word = scFile.next();
            if (word.equalsIgnoreCase("your")) {
                throw new WrongWordException("your word is wrong");
            }
            numOfWorld++;
        }

        return numOfWorld;
    }

    public static int countLine(String fileName) throws FileNotFoundException {

        int numOfLine = 0;
        Scanner scFile = new Scanner(new File(fileName));
        while (scFile.hasNextLine()) {
            System.out.println(scFile.nextLine());
            numOfLine++;
        }

        return numOfLine;
    }

    public static int countChar(String fileName) throws FileNotFoundException {

        String numOfChar = "";
        Scanner scFile = new Scanner(new File(fileName));
        while (scFile.hasNext()) {
            numOfChar += scFile.next();
        }

        return numOfChar.length();
    }

    public static void main(String[] args) {
        int lines = -1;
        int words = -1;
        int numchar = -1;
        try {
            lines = countLine("words.txt");
            numchar = countChar("words.txt");
             words = countWords("words.txt");
             
            
        } catch (FileNotFoundException ff) {
            System.out.println(ff);
        } catch (WrongWordException ww) {
            System.out.println(ww);
        }
        finally{
        System.out.println("words in file : " + words);
            System.out.println("line in file : " + lines);
            System.out.println("char in file : " + numchar);
        
        }
    }
}
