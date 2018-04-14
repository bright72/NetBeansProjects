package carlist.view;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import carlist.controller.CarlistController;
import carlist.model.Carlist;

public class TestCarlist {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Database Username : ");
            String usrName = sc.next();
            System.out.print("Enter Database Password : ");
            String password = sc.next();
            CarlistController carListCtrl = new CarlistController(usrName, password);

            int menu;
            String otherMenu;
            do {
                System.out.println("--------------------Menu--------------------");
                System.out.print("(1)Create Table\n" + "(2)Add carlist data\n" + "(3)Search carlist data\n" + "(4)Find carlist data\n"
                        + "(5)Delete carlist data\n" + "(6)Drop carlist Table\n" + "----------------\n");
                System.out.print("Choose the menu (1-6) : ");
                menu = sc.nextInt();
                System.out.println("--------------------------------------------");
                switch (menu) {
                    case 1:
                        carListCtrl.creatCarListTable();
                        break;
                    case 2:
                        int rec1 = 0;
                        System.out.println("--------------------Add Carlist Data---------------");
                        System.out.print("Enter Car Onwer Name: ");
                        String carownerName = sc.next();
                        System.out.print("Enter Car Brand: ");
                        String carBrand = sc.next();
                        System.out.print("Enter Car colour: ");
                        String carColour = sc.next();
                        System.out.print("Enter Car type: ");
                        String carType = sc.next();
                        System.out.print("Enter Car price: ");
                        Double carPrice = sc.nextDouble();
                        System.out.print("Enter Car problem: ");
                        String carProblem = sc.next();
                        Carlist cl1 = new Carlist(carownerName, carBrand, carColour, carType, carPrice, carProblem);
                        try {
                            rec1 = carListCtrl.insertCarlist(cl1);
                        } catch (SQLException ex) {
                            System.out.println("Cannot Add Data, Please Try Again");
                        }
                        System.out.println("inserted " + rec1 + " record\n-------------------------");
                        break;
                    case 3:
                        int rec2 = 0;
                        System.out.println("--------------------Edit Carlist Data---------------");
                        System.out.print("Enter Car Onwer Name: ");
                        String ecarownerName = sc.next();
                        System.out.print("Enter Car Brand: ");
                        String ecarBrand = sc.next();
                        System.out.print("Enter Car colour: ");
                        String ecarColour = sc.next();
                        System.out.print("Enter Car type: ");
                        String ecarType = sc.next();
                        System.out.print("Enter Car price: ");
                        Double ecarPrice = sc.nextDouble();
                        System.out.print("Enter Car problem: ");
                        String ecarProblem = sc.next();
                        Carlist cl2 = new Carlist(ecarownerName, ecarBrand, ecarColour, ecarType, ecarPrice, ecarProblem);
                        try {
                            rec2 = carListCtrl.updateCarlist(cl2);
                        } catch (SQLException ex) {
                            System.out.println("Cannot Edit Data, Please Try Again");
                        }
                        System.out.println("update " + rec2 + " record\n-------------------------");
                        break;

                    case 4:
                        String word;
                        System.out.println("------------------Search Carlist Data------------------");
                        System.out.print("Search : (1)All (2)Owner Name (3)Car Color \nEnter: ");
                        int keyword = sc.nextInt();
                        try {
                            if (keyword == 1) {
                                carListCtrl.findAllCarlist();
                                
                            } else if (keyword == 2) {
                                System.out.print("Enter Owner Name: ");
                                word = sc.next();
                                carListCtrl.findCarlistKeyword("name", word);
                            } else if (keyword == 3) {
                                System.out.print("Enter Car Color: ");
                                word = sc.next();
                                carListCtrl.findCarlistKeyword("type", word);
                            } else {
                                System.out.println("Please Try Again");
                            }
                        } catch (SQLException ex) {
                            System.out.println("Cannot Find Data, Please Try Again");
                        }
                        System.out.println("-------------------------");
                        break;

                    case 5:
                        int select,
                         rec3;
                        String confirm;
                        System.out.println(">> Delete Data\n(1)All Carlist\t(2)Only Specific Carlist");
                        System.out.print("Enter: ");
                        select = sc.nextInt();
                        try {
                            if (select == 1) {
                                System.out.print("Confirm to delete All Carlist (yes/no): ");
                                confirm = sc.next();
                                if (confirm.equalsIgnoreCase("yes")) {
                                    rec3 = carListCtrl.deleteCarList();
                                    System.out.println("delete " + rec3 + " record");
                                }
                            } else if (select == 2) {
                                System.out.print("Enter Car onwername of Carlist: ");
                                String name = sc.next();
                                System.out.print("Confirm to delete " + name + " (yes/no): ");
                                confirm = sc.next();
                                if (confirm.equalsIgnoreCase("yes")) {
                                    rec3 = carListCtrl.deleteCarlist(name);
                                    System.out.println("delete " + rec3 + " record");
                                }
                            } else {
                                System.out.println("Please Try Again!");
                            }
                        } catch (SQLException ex) {
                            System.out.println("Cannot Delete Data, Please Try Again");
                        }
                        System.out.println("-------------------------");
                        break;

                    case 6:
                        carListCtrl.dropCarListTable();
                        break;

                }
                System.out.print("Do you want to do anything else? (y/n): ");
                otherMenu = sc.next();
            } while (otherMenu.equalsIgnoreCase("y"));

            carListCtrl.closeCarListConnection();

        } catch (SQLException sql) {
            System.out.println(sql);

        } catch (ClassNotFoundException cnf) {
            System.out.println(cnf);

        }
    }

}
