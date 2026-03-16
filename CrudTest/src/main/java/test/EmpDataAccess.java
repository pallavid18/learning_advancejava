package test;
import java.util.*;
import java.sql.*;

public class EmpDataAccess {
	//----------JDBC Connection--------------
	public static Connection getConnection() {
		Connection con = null;
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudtestdb","root","pallavi2015");
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		return con;
		
	}
	
	//----------------Save the Employee Data------------------
	public static int save(Emp e) {
		
		int status=0;
		try {
			
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("insert into usertable(id,name,password ,email, country) values(?, ?, ?, ?, ?)");
			ps.setInt(1, e.getId());
			ps.setString(2, e.getName());
			ps.setString(3, e.getPassword());
			ps.setString(4, e.getEmail());
			ps.setString(5, e.getCountry());
			
			status = ps.executeUpdate();
			con.close();
			
		} 
		catch (Exception e2) {
			System.out.println(e2);
		}
		return status;
		
	}

	//-----------Get Employee Data----------------
	public static List<Emp> getAllEmployees(){
		List<Emp> list = new ArrayList<Emp>();
		
		try {
			
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("select * from usertable");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				Emp e = new Emp();
				e.setId( rs.getInt(1));
				e.setName( rs.getString(2));
				e.setPassword(rs.getString(3));
				e.setEmail(rs.getString(4));
				e.setCountry(rs.getString(5));
				
				list.add(e);
			}

			con.close();
			
		} 
		catch (Exception e1) {
			System.out.println(e1);
		}
		return list;
	}
	//------------------ Update the Employee------------------
	
	public static int update(Emp e) {
		
		int status =0;
		
		try {
			
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("update usertable set name=?,password=?, email=?, country=? where id=?");
			
			ps.setString(1, e.getName());
			ps.setString(2, e.getPassword());
			ps.setString(3, e.getEmail());
			ps.setString(4, e.getCountry());
			ps.setInt(5, e.getId());
			
			status = ps.executeUpdate();
			
			con.close();
			
			
		}
		catch (Exception e3) {
			System.out.println(e3);
		}
		return status;
		
	}
	
	//------------------Get updated Employee Data--------------------
	
	public static Emp getElemenetBy(int id) {
		
		Emp e = new Emp();
		
		try {
			
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("select * from usertable where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				e.setId( rs.getInt(1));
				e.setName( rs.getString(2));
				e.setPassword(rs.getString(3));
				e.setEmail(rs.getString(4));
				e.setCountry(rs.getString(5));
				
			}
			con.close();
		} 
		catch (Exception e1) {
			System.out.println(e1);
		}
		return e;
	}
	
//-----------------Delete the data--------------------
	
	public static int delete(int id) {
		
		int status =0;
		
		try {
			
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("delete from  usertable  where id=?");
			ps.setInt(1, id);
			status = ps.executeUpdate();
			con.close();
			
		} 
		catch (Exception e1) {
			System.out.println(e1);
		}
		
		return status;
	}
	
}


