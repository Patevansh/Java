package Practice;
import java.sql.*;

public class SQL_Connection {
    Connection c(){
    Connection conn = null;
  try { 
   DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver()); 
   String mysqlUrl = 
"jdbc:mysql://localhost:3306/EP?useSSL=false"; 
   conn = DriverManager.getConnection(mysqlUrl, "root", "vansh"); 
  } 
  catch (Exception e) { 
   System.out.println("Connection Error :" + e.getMessage()); 
  } 
  return conn; 
 } 
}
