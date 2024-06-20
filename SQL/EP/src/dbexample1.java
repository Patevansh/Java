import java.sql.*;
import java.util.Scanner;

public class dbexample1 {
	public static void main(String[] args) throws Exception {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			String conurl = "jdbc:mysql://localhost:3306/myrestaurant?useSSL=false";

			Connection conn = DriverManager.getConnection(conurl, "root", "vansh");
			Statement st = conn.createStatement();
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			String s = "INSERT INTO users VALUES(1,'Divyanshu',86475256,'Delhi,India','pass0011')";
			st.execute(s);
			String stri = "UPDATE users SET name='VANSH' WHERE id=1";
			st.executeUpdate(stri);
			String d = "DELETE from users WHERE id = 1";
			st.execute(d);
			System.out.println("Enter ID:");
			int id = sc.nextInt();
			System.out.println("Enter name:");
			String name = sc.next();
			System.out.println("Enter phone number:");
			int p = sc.nextInt();
			System.out.println("Enter address:");
			String ad = sc.next();
			System.out.println("Enter password:");
			String pass = sc.next();
			String q = "INSERT into users values(?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(q);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, p);
			ps.setString(4, ad);
			ps.setString(5, pass);
			ps.execute();
			ResultSet result = st.executeQuery("select * from users");
			while (result.next()) {
				System.out.println("Values in table:\n" + result.getInt("id") + "," + result.getString("name"));
			}
			conn.close();
		} catch (Exception ex) {

			System.out.println("Error :" + ex.getMessage());
		}
	}

}
