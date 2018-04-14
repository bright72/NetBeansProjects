package sit.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    public static Connection createConnection(String url, String username, String psw) throws SQLException, ClassNotFoundException{
    Connection cn=DriverManager.getConnection(url, username, psw);
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    return cn;
    }
    
    public static void closeConnection(Connection cn) throws SQLException{
        cn.close();
    }
}

//author jatawatsafe