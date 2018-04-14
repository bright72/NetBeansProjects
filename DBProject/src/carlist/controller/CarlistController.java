package carlist.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import carlist.db.ConnectionManager;
import carlist.model.Carlist;

public class CarlistController {

    private Connection con;

    public CarlistController(String username, String password) throws SQLException, ClassNotFoundException {
        String url = "jdbc:derby://localhost:1527/carlist";
        con = ConnectionManager.createConnection(url, username, password);
        System.out.println("Connection created Succesfully");
    }

    public void closeCarListConnection() throws SQLException {
        ConnectionManager.closeConnection(con);
        System.out.println("Close Connection Succesfully");
    }

    public void creatCarListTable() throws SQLException {
        String sql = "create table carlist"
                + "(caronwername varchar(50),"
                + "carbrand varchar(50),"
                + "carcolour varchar(50),"
                + "cartype varchar(50),"
                + "carprice Double,"
                + "carproblem varchar(50),"
                + " primary key(caronwername))";
        System.out.println(sql);
        Statement stmt = con.createStatement();
        stmt.execute(sql);
        System.out.println("Create table carlist successfully");
    }
    public void dropCarListTable() throws SQLException {
        String sql = "drop table carlist";
        System.out.println(sql);
        Statement stmt = con.createStatement();
        stmt.execute(sql);
        System.out.println("Drop table carlist successfully");
    }

    public int insertCarlist(Carlist carlist) throws SQLException {
        int insertedRec = 0;
        String sql = "insert into carlist (carownerName,carBrand,carColour,carType,carPrice,carProblem) values("
                + "'" + carlist.getCarownerName() + "','" + carlist.getCarBrand() + "','" + carlist.getCarColour() + "','" + carlist.getCarType()+ "','" + carlist.getCarproblem()+ "')";
        Statement stmt = con.createStatement();
        insertedRec = stmt.executeUpdate(sql);
        System.out.println(insertedRec + " insert product successfully");
        return insertedRec;
    }

    public int updateCarlist(Carlist carlist) throws SQLException {
        int updatedRec = 0;
        String carownerName = carlist.getCarownerName();
        String carBrand = carlist.getCarBrand();
        String carColour = carlist.getCarColour();
        String carType = carlist.getCarType();
        double carPrice = carlist.getCarPrice();
        String carProblem = carlist.getCarproblem();
        String sql = "UPDATE carlist set carbrand=" + carBrand + ",carcolour=" + carColour + ",cartype=" + carType + ",carprice=" + carPrice + ",carproblem='" + carProblem + "'"
                + " WHERE carownername='" + carownerName + "'";
        Statement stmt = con.createStatement();
        updatedRec = stmt.executeUpdate(sql);
        return updatedRec;
    }
    
      public int deleteCarList() throws SQLException{
        int deletedRecs=0;
        String sql="delete from carlist";
        Statement stmt=con.createStatement();
        deletedRecs=stmt.executeUpdate(sql);
        return deletedRecs;
    }
      
        public int deleteCarlist(String name) throws SQLException{
        int deletedRecs=0;
        String sql="delete from carlist where carownername='"+name+"'";
        Statement stmt=con.createStatement();
        deletedRecs=stmt.executeUpdate(sql);
        return deletedRecs;
    }

        public void findCarlistKeyword(String keyword,String word) throws SQLException{
        ArrayList<Carlist> carlist = new ArrayList<Carlist>();
        String sql = "SELECT * FROM carlist WHERE "+keyword+" LIKE '"+word+"%'";    
        Statement stmt=con.createStatement();
        ResultSet resultSet = stmt.executeQuery(sql);
        while (resultSet.next()) {
        String carownerName = resultSet.getString("carownername");
        String carBrand = resultSet.getString("carbrand");
        String carColour = resultSet.getString("carcolour");
        String carType = resultSet.getString("cartype");
        double carPrice = resultSet.getDouble("carprice");
        String carProblem = resultSet.getString("carproblem");
        Carlist cl= new Carlist(carownerName,carBrand,carColour,carType,carPrice,carProblem);
            carlist.add(cl);
            }
        System.out.println("Result:");
        for(Carlist stu:carlist){
            System.out.println(stu);
        }
    }
        
        public void findAllCarlist() throws SQLException{
        ArrayList<Carlist> carlist = new ArrayList<Carlist>();
        String sql = "SELECT * FROM carlist";    
        Statement stmt=con.createStatement();
        ResultSet resultSet = stmt.executeQuery(sql);
        while (resultSet.next()) {
           String carownerName = resultSet.getString("carownername");
        String carBrand = resultSet.getString("carbrand");
        String carColour = resultSet.getString("carcolour");
        String carType = resultSet.getString("cartype");
        double carPrice = resultSet.getDouble("carprice");
        String carProblem = resultSet.getString("carproblem");
            Carlist cl= new Carlist(carownerName,carBrand,carColour,carType,carPrice,carProblem);
            carlist.add(cl);
            }
        System.out.println("Result:");
        for(Carlist stu:carlist){
            System.out.println(stu);
        }
        for (int i = 0; i < carlist.size(); i++) {
                            System.out.println(carlist.get(i));
                        }
    }
        


}
