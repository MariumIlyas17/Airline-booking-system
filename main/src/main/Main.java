
package main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {

    public static void main(String[] args) throws SQLException {
//    file File new file()
      NewJFrame jn = new NewJFrame();
      jn.setVisible(true);
//      url = "jdbc:sqlserver://" +serverName + ":1433;DatabaseName=" + dbName + ";encrypt=true;trustServerCertificate=true;
//        String  connectionURL = "jdbc:sqlserver://localhost:1433;DatabaseName=airline;UserName=DESKTOP-L63Q895\\user;password='';encrypt=true;trustServerCertificate=true";
    
//            Connection con;
            
//            con = new DbConnection().connect();
//        String  connectionURL = "jdbc:sqlserver://localhost:1433;DatabaseName=airline;UserName=localhost;password=123456789;encrypt=true;trustServerCertificate=true";
//    String dsn = "jdbc:sqlserver://localhost:1433;DatabaseName=airline;";
//    String username = "localhost";
//    String password = "123456789";
    try {
        System.out.print("Connecting to the server......");
      Connection con =  new DbConnection().connect();   
            Statement st = con.createStatement();
            String SQL = "select * from TestUsers";
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next())
      {
        int id = rs.getInt("id");
        String firstName = rs.getString("name");
        String pass = rs.getString("password");
       
      
        // print the results
          System.out.println(id + firstName + pass);
      }
      st.close();
    }catch (Exception e){
 
        e.printStackTrace();
    }
           
           
    }
    
}
