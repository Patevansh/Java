import java.sql.*; 
import java.util.*; 

class DAOHandler { 
 private int mrollno; 
 private String mname, mmobile; 
 Scanner scn = new Scanner(System.in); 
  
 private Connection getDBConnection() { 
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
 private void getData() { 
  System.out.print("Enter the valid rollno :"); 
  mrollno = scn.nextInt(); 
  System.out.print("Enter the valid name   :"); 
  mname = scn.next(); 
  System.out.print("Enter the valid mobile :"); 
  mmobile = scn.next(); 
 } 
 private void getrollno() { 
  System.out.print("Enter the valid rollno :"); 
  mrollno = scn.nextInt(); 
 } 
 public int addRecord() throws Exception { 
  int result = 0; 
  Connection conn = null; 
  try { 
   conn = getDBConnection(); 
   getData(); 
   
   String SQL = "insert into CRUDStudent values(?,?,?)"; 
   PreparedStatement pstmt = conn.prepareStatement(SQL); 
   pstmt.setInt(1, mrollno); 
   pstmt.setString(2, mname); 
   pstmt.setString(3, mmobile); 
   result = pstmt.executeUpdate(); 
  } 
  catch (Exception e) { 
   System.out.println("Insert Error :" + e.getMessage()); 
  } 
  conn.close(); 
  return result; 
 } 
 public void editRecord() throws Exception { 
  getrollno(); 
  Connection conn = null; 
  PreparedStatement pstmt; 
  boolean flag = false; 
  try { 
   conn = getDBConnection(); 
   pstmt = conn.prepareStatement( 
     "select * from CRUDStudent where rollno = ?"); 
   pstmt.setInt(1, mrollno); 
   ResultSet result = pstmt.executeQuery(); 
    
   while(result.next()) { 
    flag=  true; 
    System.out.println("Student Name  :" + result.getString(2)); 
    System.out.println("Student Mobile:" + result.getString(3)); 
   } 
   if(flag) { 
    System.out.println("Enter data to be update"); 
    System.out.println("-----------------------"); 
    System.out.print("Enter the valid name   :"); 
    mname = scn.next(); 
    System.out.print("Enter the valid mobile :"); 
    mmobile = scn.next(); 
     
    pstmt = conn.prepareStatement 
      ("update crudStudent set name=?,mobile=? where rollno=?"); 
    pstmt.setString(1, mname); 
    pstmt.setString(2, mmobile); 
    pstmt.setInt(3, mrollno); 
     
    pstmt.executeUpdate(); 
    System.out.println("Record updated !"); 
   } 
   else  
   { 
    System.out.println("Record not found, Try later !"); 
   } 
  } 
  catch (Exception e) { 
   System.out.println("Edit error :" + e.getMessage()); 
  } 
 } 
 public void deleteRecord() throws Exception { 
  getrollno(); 
  Connection conn = null; 
  PreparedStatement pstmt = null; 
  boolean flag = false; 
  try { 
   conn = getDBConnection(); 
   pstmt = conn.prepareStatement( 
     "select * from CRUDStudent where rollno = ?"); 
   pstmt.setInt(1, mrollno); 
   ResultSet result = pstmt.executeQuery(); 
    
   while(result.next()) { 
    flag=  true; 
    pstmt = conn.prepareStatement( 
      "delete from CRUDStudent where rollno = ?"); 
    pstmt.setInt(1, mrollno); 
    pstmt.executeUpdate(); 
    System.out.println("Record Deleted !"); 
   } 
   if(!flag) 
    System.out.println("Record not found, Try later !"); 
  } 
  catch (Exception e) { 
   System.out.println("Delete :" + e.getMessage()); 
  } 
  conn.close(); 
 } 
 public void searchRecord() throws Exception{ 
  getrollno(); 
  Connection conn = null; 
  boolean flag = false; 
  try { 
   conn = getDBConnection(); 
   PreparedStatement pstmt = conn.prepareStatement( 
     "select * from CRUDStudent where rollno = ?"); 
   pstmt.setInt(1, mrollno); 
   ResultSet result = pstmt.executeQuery(); 
    
   while(result.next()) { 
    flag=  true; 
    System.out.println("Student Name  :" + result.getString(2)); 
    System.out.println("Student Mobile:" + result.getString(3)); 
   } 
   if(!flag) 
    System.out.println("Record not found, Try later !"); 
  } 
  catch (Exception e) { 
   System.out.println("Insert Error :" + e.getMessage()); 
  } 
  conn.close(); 
 } 
 public void showAll() throws SQLException { 
  Connection conn = null; 
  try { 
   conn = getDBConnection(); 
   PreparedStatement pstmt =  
     conn.prepareStatement("select * from CRUDStudent"); 
   ResultSet result = pstmt.executeQuery(); 
    
   System.out.println("Rollno\tStudent Name\tMobile"); 
   while(result.next()) { 
    System.out.println(result.getString(1) + "\t" +   
      result.getString(2) + "\t\t" + result.getString(3)); 
   } 
  } 
  catch (Exception e) { 
   System.out.println(e.getMessage()); 
  } 
  conn.close(); 
 } 
} 
public class CRUDUsingJDBC { 
 public static void main(String[] args) { 
  int choice = 0; 
  try (Scanner getch = new Scanner(System.in)) {
    DAOHandler crudobj = new DAOHandler(); 
       
      while(choice != 6) { 
       System.out.println("1 - Add Record"); 
       System.out.println("2 - Edit Record"); 
       System.out.println("3 - Delete Record"); 
       System.out.println("4 - Search Record"); 
       System.out.println("5 - View All Records"); 
       System.out.println("6 - Exit"); 
     
       System.out.print("Enter the valid choice :"); 
       choice = getch.nextInt(); 
        
       switch (choice) { 
        case 1: { 
         try { 
          int retval = crudobj.addRecord(); 
          if(retval > 0 ) 
           System.out.println("Record inserted !"); 
          else 
           System.out.println("Error in insert operation !"); 
         } 
         catch (Exception e) { 
          System.out.println("Error :" + e.getMessage()); 
         } 
         break; 
        } 
        case 2: 
         try { 
          crudobj.editRecord(); 
         } 
         catch (Exception e) { 
          System.out.println("Edit :" + e.getMessage()); 
         } 
         break; 
        case 3: 
         try { 
          crudobj.deleteRecord(); 
         } 
         catch (Exception e) { 
          System.out.println("Delete :" + e.getMessage()); 
         } 
         break; 
        case 4: 
         try { 
          crudobj.searchRecord(); 
         } 
         catch (Exception e) { 
          System.out.println("Search :" + e.getMessage()); 
         } 
         break; 
        case 5: 
         try { 
          crudobj.showAll(); 
         } 
         catch (Exception e) { 
          System.out.println("Show All:" + e.getMessage()); 
         } 
         break; 
        case 6: 
         System.out.println("Thank you for using CRUD operation !"); 
         return; 
        default: 
         System.out.println("Invalid choice !"); break; 
       } 
      }
} 
 } 
} 
 
 