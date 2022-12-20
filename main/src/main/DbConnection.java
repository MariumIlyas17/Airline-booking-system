
package main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author user
 */
public class DbConnection {
    
    public Connection con;
    public Connection connect(){
    String  connectionURL = "jdbc:sqlserver://localhost:1433;DatabaseName=airline;UserName=localhost;password=123456789;encrypt=true;trustServerCertificate=true";
    
    try {
        System.out.print("Connecting to the server......");
        Connection con = DriverManager.getConnection(connectionURL);
        this.con = con;
            System.out.println("Connected to the Server.");
           
    }catch (Exception e){
        System.out.println("I am not connected to the Server");
        e.printStackTrace();
    }
    
    return con;
    
    }
    
}
