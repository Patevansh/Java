package com.jspdemo.daoimpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.jspdemo.models.User;

public class UserDAO {
	public static Connection getConnection(){  
	    Connection con=null;  
	    try{  
	        Class.forName("com.mysql.cj.jdbc.Driver");  
	        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EP?useSSL=false",
	        		"root","vansh");  
	    }catch(Exception e){System.out.println(e);}  
	    return con;  
	}  
	public static int save(User u){  
	    int status=0;  
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement(  
	        		"insert into register(name,password,email,sex,country) " + 
	        		"values(?,?,?,?,?)");  
	        ps.setString(1,u.getName());  
	        ps.setString(2,u.getPassword());  
	        ps.setString(3,u.getEmail());  
	        ps.setString(4,u.getSex());  
	        ps.setString(5,u.getCountry());  
	        status=ps.executeUpdate();  
	    }catch(Exception e){System.out.println(e);}  
	    return status;  
	}  
	public static int update(User user){  
	    int status=0;  
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement(  
	        		"update register set name=?,password=?,email=?," + 
	        		"sex=?,country=? where id=?");  
	        ps.setString(1,user.getName());  
	        ps.setString(2,user.getPassword());  
	        ps.setString(3,user.getEmail());  
	        ps.setString(4,user.getSex());  
	        ps.setString(5,user.getCountry());  
	        ps.setInt(6,user.getId());  
	        status=ps.executeUpdate();  
	    }catch(Exception e){System.out.println(e);}  
	    return status;  
	}  
	public static int delete(User user){  
	    int status=0;  
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=
	        		con.prepareStatement(
	        			"delete from register where id=?");  
	        ps.setInt(1,user.getId());  
	        status=ps.executeUpdate();  
	    }catch(Exception e){System.out.println(e);}  
	  
	    return status;  
	}  
	public static List<User> getAllRecords(){  
	    List<User> list=new ArrayList<>();
	      
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement("select * from register");  
	        ResultSet rs=ps.executeQuery();  
	        while(rs.next()){  
	            User user=new User();  
	            user.setId(rs.getInt("id"));  
	            user.setName(rs.getString("name"));  
	            user.setPassword(rs.getString("password"));  
	            user.setEmail(rs.getString("email"));  
	            user.setSex(rs.getString("sex"));  
	            user.setCountry(rs.getString("country"));  
	            list.add(user);  
	        }  
	    }catch(Exception e){System.out.println(e);}  
	    return list;  
	}  
	public static User getRecordById(int id){  
	    User user = null;  
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement("select * from register where id=?");  
	        ps.setInt(1,id);  
	        ResultSet rs=ps.executeQuery();  
	        while(rs.next()){  
	        	user = new User();  
	        	user.setId(rs.getInt("id"));  
	        	user.setPassword(rs.getString("password"));  
	        	user.setName(rs.getString("name"));  
	        	user.setEmail(rs.getString("email"));  
	        	user.setSex(rs.getString("sex"));  
	        	user.setCountry(rs.getString("country"));  
	        }  
	    }catch(Exception e){System.out.println(e);}  
	    return user;  
	}  
}