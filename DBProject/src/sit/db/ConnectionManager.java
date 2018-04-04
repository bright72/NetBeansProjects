/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.db;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author harit
 */
public class ConnectionManager {

    public static Connection creatConnection(String url, String username, String psw) throws ClassNotFoundException, SQLException {
        //Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/course", username, psw);
        System.out.println("Driver class register successfully");
        return cn;
    }

    public static void closeConnection(Connection cn) throws SQLException {
        cn.close();
    }

    

}
