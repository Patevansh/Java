import java.sql.*;
import java.util.Scanner;

public class Crud_with_objects {
    public static void main(String[] args) throws SQLException {
        @SuppressWarnings("unused")
        perform p = new perform();
    }
}

class perform {
    perform() throws SQLException {
        Scanner sc = new Scanner(System.in);
        Crud c = new Crud();
        while (true) {
            System.out.println("CRUD OPERATION");
            System.out.println("1)ADD RECORD\n2)EDIT RECORD\n3)DELETE RECORD\n4)SELECT RECORD\n5)SHOW ALL\n6)EXIT");
            System.out.print("Enter operation to perform:");
            int r = sc.nextInt();
            switch (r) {
                case 1:
                    c.get_add();
                    break;
                case 2:
                    c.edit_records();
                    break;
                case 3:
                    c.delete_record();
                    break;
                case 4:
                    c.select_records();
                    break;
                case 5:
                    c.selectall();
                    break;
                case 6:
                    return;
                default:
                    break;
            }
        }
    }
}

class SqlCon {
    Connection c() throws SQLException {
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

        String conurl = "jdbc:mysql://localhost:3306/EP?useSSL=false";

        Connection con = DriverManager.getConnection(conurl, "root", "vansh");
        return con;
    }
}

class Crud {
    void get_add() throws SQLException {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID:");
        int id = sc.nextInt();
        System.out.print("Enter name:");
        String name = sc.next();
        System.out.print("Enter address:");
        String ad = sc.next();
        add_records(id, name, ad);

    }

    private void add_records(int id, String name, String ad) throws SQLException {
        SqlCon con = new SqlCon();
        String q = "INSERT into emp values(?,?,?)";
        PreparedStatement ps = ((Connection) con.c()).prepareStatement(q);
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setString(3, ad);
        ps.execute();
    }

    void edit_records() throws SQLException {
        SqlCon con = new SqlCon();
        Statement st = ((Connection) con.c()).createStatement();
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID to edit:");
        int e = sc.nextInt();
        System.out.print("1)Id\n2)Name\n3)address");
        int num = sc.nextInt();
        if (num == 1) {
            System.out.print("Enter new ID:");
            int newid = sc.nextInt();
            String stri = "UPDATE emp SET Id=" + newid + " WHERE id=" + e;
            st.executeUpdate(stri);
        } else if (num == 2) {
            System.out.print("Enter new name:");
            String newname = sc.next();
            String stri = "UPDATE emp SET name='" + newname + "' WHERE id=" + e;
            st.executeUpdate(stri);
        } else if (num == 3) {
            System.out.print("Enter new address:");
            String newad = sc.next();
            String stri = "UPDATE emp SET address='" + newad + "' WHERE id=" + e;
            st.executeUpdate(stri);
        } else {
            System.out.println("Ivalid choice");
        }
    }

    void delete_record() throws SQLException {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        SqlCon con = new SqlCon();
        Statement st = ((Connection) con.c()).createStatement();
        System.out.print("Enter ID to delete:");
        int d = sc.nextInt();
        String de = "DELETE from emp WHERE id =" + d;
        st.execute(de);
    }

    void select_records() throws SQLException {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        SqlCon con = new SqlCon();
        Statement st = ((Connection) con.c()).createStatement();
        System.out.print("Enter ID to select:");
        int se = sc.nextInt();
        ResultSet result = st.executeQuery("select * from emp where id=" + se);
        while (result.next()) {
            System.out.println("Values in table:\n" + result.getInt("id") + ","
                    + result.getString("name") + "," + result.getString("address"));
        }
    }

    void selectall() throws SQLException {
        SqlCon con = new SqlCon();
        Statement st = ((Connection) con.c()).createStatement();
        ResultSet res = st.executeQuery("select * from emp");
        System.out.println("Values in table:");
        while (res.next()) {
            System.out.println(
                    res.getInt("id") + "," + res.getString("name") + "," + res.getString("address"));
        }
    }
}
