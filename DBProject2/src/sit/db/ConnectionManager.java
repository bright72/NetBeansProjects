package sit.db;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import org.apache.derby.jdbc.ClientDataSource;

public class ConnectionManager {

    public static Connection createConnection(String url, String username, String psw) throws ClassNotFoundException, SQLException {
        //load driver class and register driver class to DriverManager
        //Class.forName("org.apache.derby.jdbc.EmbeddedDriver"); ตั้ังแต่ 1.6 ไม่ต้องใส่ได้

        Connection cn = DriverManager.getConnection(url, username, psw);
        System.out.println("Driver class register successfully");
        return cn;
    }

    public static Connection createConnection(String fileName) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
        FileReader dbProFile = new FileReader(fileName);
        Properties dbProp = new Properties();
        dbProp.load(dbProFile);
        String serverName = dbProp.getProperty("DERBY_SERVER_NAME");
        String tempPort = dbProp.getProperty("DERBY_SERVER_PORT");
        int serverPort = Integer.parseInt(tempPort);
        String dbName = dbProp.getProperty("DERBY_DB_NAME");
        String dbUsername = dbProp.getProperty("DERBY_DB_USERNAME");
        String dbPassword = dbProp.getProperty("DERBY_DB_PASSWORD");
        
        ClientDataSource ds = new ClientDataSource();
        ds.setServerName(serverName);
        ds.setPortNumber(serverPort);
        ds.setDatabaseName(dbName);
        ds.setUser(dbUsername);
        ds.setPassword(dbPassword);
        Connection cn = ds.getConnection();
        return cn;
    }

    public static void closeConnection(Connection cn) throws SQLException {
        cn.close();
    }
}
