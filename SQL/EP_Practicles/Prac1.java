package EP_Practicles;
import java.sql.*;
public class Prac1 {
    public static void main(String[] args) throws Exception {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			String conurl = "jdbc:mysql://localhost:3306/EP?useSSL=false";

			Connection con = DriverManager.getConnection(conurl, "root", "vansh");
			Statement st = con.createStatement();
            st.execute("INSERT into emp values(1,'vansh','Daman')");
            st.execute("INSERT into emp values(2,'Sugam','Haryana')");
            st.execute("INSERT into emp values(3,'Rahul','Rajasthan')");

            ResultSet r=st.executeQuery("Select * from emp");
            while (r.next()){
                System.out.println(r.getInt("id")+","+r.getString("name")+","+r.getString("address"));
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
