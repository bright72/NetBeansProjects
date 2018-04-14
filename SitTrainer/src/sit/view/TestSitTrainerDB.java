package sit.view;

import java.sql.SQLException;
import java.util.Scanner;
import sit.model.Food;
import sit.model.SitController;

public class TestSitTrainerDB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu="\nMENU:\t(1) Find Data\t(2) Add Data\n\t(3) Edit Data\t(4) Delete Data\t(0)Exit";
        int select;
        System.out.println("<--- Welcome to SIT Trainer APP --->");
        try{
            SitController sitCtrl = new SitController("sit","sit");
            
            System.out.println(menu);
            System.out.print("Enter : ");
            select = input.nextInt();
            System.out.print("\n");
            while(select!=0){
                switch(select){
                    case 1: findData(sitCtrl);  break;
                    case 2: addData(sitCtrl);  break;
                    case 3: editData(sitCtrl);  break;
                    case 4: deleteData(sitCtrl);  break;
                    default:    System.out.println("Please Select Again"); 
                }
            System.out.println(menu);
            System.out.print("Enter : ");
            select = input.nextInt();
            System.out.print("\n");
            }
            sitCtrl.CloseConnection();
            System.out.println("GOOD BYE !");
        }
        catch (ClassNotFoundException cnfEx) {
            System.out.println(cnfEx);
        }
        catch (SQLException sqlEx) {
            System.out.println(sqlEx);
        } 
        
        finally{
            System.out.println("by 60130500009 Jatawat Xie");
        }
    }
    
    public static void findData(SitController sitCtrl){
        Scanner input = new Scanner(System.in);
        String word;
        System.out.println(">> Find Data");
        System.out.print("Search : (1)All (2)Name (3)Type (4)Calories\nEnter: ");
        int keyword = input.nextInt();
        try{
            if(keyword==1){
            sitCtrl.findFoodAll();
        }else if(keyword==2){
            System.out.print("Enter Name: ");
            word = input.next();
            sitCtrl.findFoodByKeyword("name", word);
        }else if(keyword==3){
            System.out.print("Enter Type: ");
            word = input.next();
            sitCtrl.findFoodByKeyword("type", word);
        }else if(keyword==4){
            System.out.print("Enter Calories(Low,High): ");
            word = input.next();
            if(word.equalsIgnoreCase("low")||word.equalsIgnoreCase("high")){
                sitCtrl.findFoodByCalorie(word);
            }else{
                System.out.println("Please Try Again");
            }
        }else{
            System.out.println("Please Try Again");
        }
        }catch(SQLException ex){
            System.out.println("Cannot Find Data, Please Try Again");
        }
        System.out.println("-------------------------");
    }
    
    public static void addData(SitController sitCtrl){
        Scanner input = new Scanner(System.in);
        int rec=0;
        System.out.println(">> Add Data");
        System.out.print("Enter Name of Food: ");
        String name = input.next();
        System.out.print("Enter Calories: ");
        int calories = input.nextInt();
        System.out.print("Enter Carbohydrate: ");
        int carb = input.nextInt();
        System.out.print("Enter Protein: ");
        int protein = input.nextInt();
        System.out.print("Enter Fat: ");
        int fat = input.nextInt();
        System.out.print("Enter Type: ");
        String type = input.next();
        Food food1=new Food(name,calories,carb,protein,fat,type);
        try{
            rec=sitCtrl.insertFood(food1);
        }catch(SQLException ex){
            System.out.println("Cannot Add Data, Please Try Again");
        }
        System.out.println("inserted "+rec+" record\n-------------------------");
    }
    
    public static void editData(SitController sitCtrl){
        int rec=0;
        Scanner input = new Scanner(System.in);
        System.out.println(">> Edit Data");
        System.out.print("Enter Name of Food: ");
        String name = input.next();
        System.out.print("Enter New Calories: ");
        int calories = input.nextInt();
        System.out.print("Enter New Carbohydrate: ");
        int carb = input.nextInt();
        System.out.print("Enter New Protein: ");
        int protein = input.nextInt();
        System.out.print("Enter New Fat: ");
        int fat = input.nextInt();
        System.out.print("Enter New Type: ");
        String type = input.next();
        Food food1=new Food(name,calories,carb,protein,fat,type);
        try{
            rec=sitCtrl.updateFood(food1);
        }catch(SQLException ex){
            System.out.println("Cannot Edit Data, Please Try Again");
        }
        System.out.println("update "+rec+" record\n-------------------------");
    }
    
    public static void deleteData(SitController sitCtrl){
        Scanner input = new Scanner(System.in);
        int select,rec;
        String confirm;
        System.out.println(">> Delete Data\n(1)All Food\t(2)Specific");
        System.out.print("Enter: ");
        select = input.nextInt();
        try{
            if(select==1){
            System.out.print("Confirm to delete All Food (yes/no): ");
            confirm = input.next();
            if(confirm.equalsIgnoreCase("yes")){
                rec=sitCtrl.deleteAllFood();
                System.out.println("delete "+rec+" record");
            }
        }else if(select==2){
            System.out.print("Enter Name of Food: ");
            String name = input.next();
            System.out.print("Confirm to delete "+name+" (yes/no): ");
            confirm = input.next();
            if(confirm.equalsIgnoreCase("yes")){
                rec=sitCtrl.deleteFood(name);
                System.out.println("delete "+rec+" record");
            }
        }else{
            System.out.println("Please Try Again!");
        }
        }catch(SQLException ex){
            System.out.println("Cannot Delete Data, Please Try Again");
        }
        System.out.println("-------------------------");
    }
    
}

//author jatawatsafe