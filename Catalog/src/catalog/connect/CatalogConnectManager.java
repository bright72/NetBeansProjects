
package catalog.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class CatalogConnectManager {
    
    public static Connection createConnection(String url, String usrName, String psw) throws SQLException, ClassNotFoundException{
        //Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection connect = DriverManager.getConnection(url, usrName, psw);
        System.out.println("Driver class registed successfully");
        return connect;
        
    }
    
    public static void closeConnect(Connection connect) throws SQLException{
        connect.close();
    }
}
