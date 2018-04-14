package sit.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SitController {
    private Connection con;
    
    public SitController(String username,String password) throws SQLException, ClassNotFoundException{
        String url="jdbc:derby://localhost:1527/SitTrainer";
        con = ConnectionManager.createConnection(url, username, password);
        System.out.println("Connection created Succesfully");
    }
    public void CloseConnection() throws SQLException{
        ConnectionManager.closeConnection(con);
        System.out.println("Close Connection Succesfully");
    }
    
    public int insertFood(Food food) throws SQLException{
        int insertedRec=0;
        String name=food.getName();
        int calories=food.getCalories();
        int carb = food.getCarbohydrate();
        int protein = food.getProtein();
        int fat = food.getFat();
        String type = food.getType();
        String sql="insert into food(name,calories,carbohydrate,protein,fat,type)"
                + "values ('"+name+"',"+calories+","+carb+","+protein+","+fat+",'"+type+"')";
        Statement stmt=con.createStatement();
        insertedRec=stmt.executeUpdate(sql);
        return insertedRec;
    }
    
    public int updateFood(Food food) throws SQLException{
        int updatedRec=0;
        String name=food.getName();
        int calories=food.getCalories();
        int carb = food.getCarbohydrate();
        int protein = food.getProtein();
        int fat = food.getFat();
        String type = food.getType();
        String sql="UPDATE food set calories="+calories+",carbohydrate="+carb+",protein="+protein+",fat="+fat+",type='"+type+"'"
                + " WHERE name='"+name+"'";
        Statement stmt = con.createStatement();
        updatedRec=stmt.executeUpdate(sql);
        return updatedRec;
    }
    
    public int deleteAllFood() throws SQLException{
        int deletedRecs=0;
        String sql="delete from food";
        Statement stmt=con.createStatement();
        deletedRecs=stmt.executeUpdate(sql);
        return deletedRecs;
    }
    
    public int deleteFood(String name) throws SQLException{
        int deletedRecs=0;
        String sql="delete from food where name='"+name+"'";
        Statement stmt=con.createStatement();
        deletedRecs=stmt.executeUpdate(sql);
        return deletedRecs;
    }
    
    public void findFoodByKeyword(String keyword,String word) throws SQLException{
        ArrayList<Food> foodList = new ArrayList<Food>();
        String sql = "SELECT * FROM food WHERE "+keyword+" LIKE '"+word+"%'";    
        Statement stmt=con.createStatement();
        ResultSet resultSet = stmt.executeQuery(sql);
        while (resultSet.next()) {
            String name=resultSet.getString("NAME");
            int calories=resultSet.getInt("CALORIES");
            int carb = resultSet.getInt("CARBOHYDRATE");
            int protein = resultSet.getInt("PROTEIN");
            int fat = resultSet.getInt("FAT");
            String type = resultSet.getString("TYPE");
            Food food=new Food(name,calories,carb,protein,fat,type);
            foodList.add(food);
            }
        System.out.println("Result:");
        for(Food stu:foodList){
            System.out.println(stu);
        }
    }
    
    public void findFoodAll() throws SQLException{
        ArrayList<Food> foodList = new ArrayList<Food>();
        String sql = "SELECT * FROM food";    
        Statement stmt=con.createStatement();
        ResultSet resultSet = stmt.executeQuery(sql);
        while (resultSet.next()) {
            String name=resultSet.getString("NAME");
            int calories=resultSet.getInt("CALORIES");
            int carb = resultSet.getInt("CARBOHYDRATE");
            int protein = resultSet.getInt("PROTEIN");
            int fat = resultSet.getInt("FAT");
            String type = resultSet.getString("TYPE");
            Food food=new Food(name,calories,carb,protein,fat,type);
            foodList.add(food);
            }
        System.out.println("Result:");
        for(Food stu:foodList){
            System.out.println(stu);
        }
    }
    
    public void findFoodByCalorie(String word) throws SQLException{
        ArrayList<Food> foodList = new ArrayList<Food>();
        String sql;
        if(word.equalsIgnoreCase("low")){
            sql = "SELECT * FROM food WHERE calories BETWEEN 1 AND 150";  
        }else{
            sql = "SELECT * FROM food WHERE calories BETWEEN 151 AND 1000";  
        }
        Statement stmt=con.createStatement();
        ResultSet resultSet = stmt.executeQuery(sql);
        while (resultSet.next()) {
            String name=resultSet.getString("NAME");
            int calories=resultSet.getInt("CALORIES");
            int carb = resultSet.getInt("CARBOHYDRATE");
            int protein = resultSet.getInt("PROTEIN");
            int fat = resultSet.getInt("FAT");
            String type = resultSet.getString("TYPE");
            Food food=new Food(name,calories,carb,protein,fat,type);
            foodList.add(food);
        }
        System.out.println("Result:");
        for(Food stu:foodList){
            System.out.println(stu);
        }
    }
    
}

//author jatawatsafe