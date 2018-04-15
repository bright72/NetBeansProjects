package catalog.controller;

import catalog.connect.CatalogConnectManager;
import catalog.model.Catalog;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class CatalogController {

    private Connection connect;

    public CatalogController(String usrName, String password) throws SQLException, ClassNotFoundException {
        connect = CatalogConnectManager.createConnection("jdbc:derby://localhost:1527/catalog", usrName, password);
    }

    public void createCatalogTable() throws SQLException {
        String sql = "create table catalog"
                + " (productId varchar(15),"
                + " productName varchar(50),"
                + " productCost varchar(10),"
                + " primary key(productId))";
        System.out.println(sql);

        Statement stmt = connect.createStatement();
        stmt.executeUpdate(sql);
        System.out.println("create catalog table successfully");
    }

    public int insertFromFile(String fileName) throws FileNotFoundException, SQLException {
        Scanner scFile = new Scanner(new File(fileName));
        scFile.useDelimiter(",");
        int insertedRecs = 0;

        PreparedStatement pStmt = connect.prepareStatement("insert into catalog(productId,productName,productCost) values(?,?,?)");

        while (scFile.hasNext()) {

            String productId = (scFile.next()).trim();
            String productName = (scFile.next()).trim();
            String productCost = (scFile.next()).trim();

            pStmt.setString(1, productId);
            pStmt.setString(2, productName);
            pStmt.setString(3, productCost);

            insertedRecs += pStmt.executeUpdate();

            System.out.println(insertedRecs + " inserted product into record");
        }
        return insertedRecs;
    }

    public int insertCatalog(Catalog subject) throws SQLException {
        String sql = "insert into catalog (productId,productName,productCost) values("
                + "'" + subject.getProductId() + "','" + subject.getProductName() + "','" + subject.getProductCost() + "')";
        System.out.println(sql);

        Statement stmt = connect.createStatement();
        int insertedRec = stmt.executeUpdate(sql);
        System.out.println(insertedRec + " insert product successfully");
        return insertedRec;
    }

    public ArrayList<Catalog> selectProduct() throws SQLException {
        ArrayList<Catalog> productList = new ArrayList<Catalog>();
        Statement stmt = connect.createStatement(); //งงโว้ย
        String sql = "select * from catalog";
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {

            String proId = rs.getString("productId");
            String proName = rs.getString("productName");
            String proCost = rs.getString("productCost");

            Catalog ctl = new Catalog(proId, proName, proCost);

            productList.add(ctl);

        }
        return productList;
    }

    public void dropCatalogTable() throws SQLException {
        String sql = "drop table catalog";
        System.out.println(sql);

        Statement stmt = connect.createStatement();
        stmt.executeUpdate(sql);
        System.out.println("drope catalog table successfully");
    }

    public void closeCatalogConnection() throws SQLException {
        CatalogConnectManager.closeConnect(connect);
        System.out.println("-----Close connection-----");
    }

}
