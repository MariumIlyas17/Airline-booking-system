
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
