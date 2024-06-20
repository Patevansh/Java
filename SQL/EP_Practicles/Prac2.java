package EP_Practicles;
import java.sql.*;
import java.util.Scanner;

public class Prac2 {
    public static void main(String[] args) throws Exception {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String conurl = "jdbc:mysql://localhost:3306/EP?useSSL=false";
			Connection con = DriverManager.getConnection(conurl, "root", "vansh");
            @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ID:");
			int id = sc.nextInt();
			System.out.println("Enter name:");
			String name = sc.next();
			System.out.println("Enter address:");
			String ad = sc.next();
			String q = "INSERT into emp values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, ad);
			ps.execute();

            ResultSet r=ps.executeQuery("Select * from emp");
            while (r.next()){
                System.out.println(r.getInt("id")+","+r.getString("name")+","+r.getString("address"));
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
