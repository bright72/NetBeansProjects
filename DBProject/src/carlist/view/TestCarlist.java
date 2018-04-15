package carlist.view;

import java.sql.SQLException;
import java.util.Scanner;
import carlist.controller.CarlistController;
import carlist.model.Carlist;

public class TestCarlist {

    public static void main(String[] args) {
        try {
            int menu;
            String otherMenu;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Database Username : ");
            String usrName = sc.next();
            System.out.print("Enter Database Password : ");
            String password = sc.next();
            CarlistController carListCtrl = new CarlistController(usrName, password);
            //           carListCtrl.creatCarListTable();
            do {
                System.out.println("--------------------------------------Menu----------------------------------------------");
                System.out.print("(1)Add carlist data\n" + "(2)Edit carlist data\n" + "(3)Find carlist data\n"
                        + "(4)Delete carlist data\n"
                        + "----------------------------------------------------------------------------------------\n");
                System.out.print("Choose the menu (1-4) : ");
                menu = sc.nextInt();
                System.out.println("----------------------------------------------------------------------------------------");
                switch (menu) {

                    case 1:
                        int rec;
                        System.out.println("----------------------------------Add Carlist Data--------------------------------------");
                        System.out.print("Enter Car Id: ");
                        String carId = sc.next();
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
                        Carlist cl1 = new Carlist(carId, carBrand, carColour, carType, carPrice, carProblem);
                        rec = carListCtrl.insertCarlist(cl1);
                        System.out.println("inserted " + rec + " record\n----------------------------------------------------------");
                        break;
                    case 2:
                        int rec2 = 0;
                        String word,
                         editmenu;
                        System.out.println("---------------------------------Edit Carlist Data--------------------------------------");
                        System.out.print("What Car Id that you want to edit data : ");
                        carId = sc.next();
                        System.out.print("Edit : (1)All data (2)Car Brand (3)Car colour (4)Car type (5)Car price (6)Car problem \nEnter: ");
                        int keyword = sc.nextInt();
                        if (keyword == 1) {
                            System.out.print("Enter Car Brand: ");
                            carBrand = sc.next();
                            System.out.print("Enter Car colour: ");
                            carColour = sc.next();
                            System.out.print("Enter Car type: ");
                            carType = sc.next();
                            System.out.print("Enter Car price: ");
                            carPrice = sc.nextDouble();
                            System.out.print("Enter Car problem: ");
                            carProblem = sc.next();
                            Carlist cl2 = new Carlist(carId, carBrand, carColour, carType, carPrice, carProblem);
                            rec2 = carListCtrl.updateAllCarlist(cl2);

                        } else if (keyword == 2) {
                            System.out.print("Enter New Car Brand: ");
                            word = sc.next();
                            editmenu = "carbrand";
                            carListCtrl.updateCarlist(carId, editmenu, word);
                        } else if (keyword == 3) {
                            System.out.print("Enter New Car colour: ");
                            word = sc.next();
                            editmenu = "carcolour";
                            carListCtrl.updateCarlist(carId, editmenu, word);
                        } else if (keyword == 4) {
                            System.out.print("Enter New Car type: ");
                            word = sc.next();
                            editmenu = "cartype";
                            carListCtrl.updateCarlist(carId, editmenu, word);
                        } else if (keyword == 5) {
                            System.out.print("Enter New Car price: ");
                            word = sc.next();
                            editmenu = "carprice";
                            carListCtrl.updateCarlist(carId, editmenu, word);
                        } else if (keyword == 6) {
                            System.out.print("Enter New Car problem: ");
                            word = sc.next();
                            editmenu = "carproblem";
                            carListCtrl.updateCarlist(carId, editmenu, word);
                        } else {
                            System.out.println("Please Try Again");

                        }
                        
                        break;

                    case 3:
                        System.out.println("------------------------------Search Carlist Data---------------------------------------");
                        System.out.print("Search : (1)All (2)Car Id (3)Car Color \nEnter: ");
                        keyword = sc.nextInt();
                        if (keyword == 1) {
                            carListCtrl.findAllCarlist();
                        } else if (keyword == 2) {
                            System.out.print("Enter Car Id: ");
                            word = sc.next();
                            carListCtrl.findCarlistKeyword("carid", word);
                        } else if (keyword == 3) {
                            System.out.print("Enter Car Colour: ");
                            word = sc.next();
                            carListCtrl.findCarlistKeyword("carcolour", word);
                        } else {
                            System.out.println("Please Try Again");

                        }
                        System.out.println("----------------------------------------------------------------------------------------");
                        break;

                    case 4:
                        int select,
                         rec3;
                        String confirm;
                        System.out.println("----------------Delete Data\n(1)All Carlist\t(2)Only Specific Carlist-------------------");
                        System.out.print("Enter: ");
                        select = sc.nextInt();

                        if (select == 1) {
                            System.out.print("Confirm to delete All Carlist (y/n): ");
                            confirm = sc.next();
                            if (confirm.equalsIgnoreCase("y")) {
                                rec3 = carListCtrl.deleteCarList();
                                System.out.println("delete " + rec3 + " record");
                            }
                        } else if (select == 2) {
                            System.out.print("Enter Car Id of Carlist: ");
                            String name = sc.next();
                            System.out.print("Confirm to delete " + name + " (y/n): ");
                            confirm = sc.next();
                            if (confirm.equalsIgnoreCase("y")) {
                                rec3 = carListCtrl.deleteCarlist(name);
                                System.out.println("delete " + rec3 + " record");
                            }
                        } else {
                            System.out.println("Please Try Again!");

                        }
                        System.out.println("----------------------------------------------------------------------------------------");
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
