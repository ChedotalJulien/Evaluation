package co.simplon.entities;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.Dao;


public class Customers extends Dao<Customers> {

	private Object connection;
	private Object connection2;

	public Customers find(int id) {
		String str = "select * from T_Customers where IdCust=?";
		PreparedStatement ps;
		Customers Customers = null;

		try {
			ps = ((Connection) connection).prepareStatement(str);
			ps.setInt(1,id);
			ResultSet resultSet = ps.executeQuery();
			if(resultSet.next()){				
				Customers = new Customers();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return Customers;
	}

	public boolean create(Customers obj) {
		String str = "INSERT INTO T_Customers (IdCust, FirstName, Name) VALUES (?, ? ,? );";
		PreparedStatement ps;
		boolean ok = false;
		try {
			ps = ((Connection) connection).prepareStatement(str);
			ps.setInt(1, obj.getIdCustomers());
			ps.setString(2,obj.getFirstName());
			ps.setString(3,obj.getName());
			ps.executeQuery();
			ok = true;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ok;
	}

	private int getIdCustomers() {
		// TODO Auto-generated method stub
		return 0;
	}

	private String getName() {
		return null;
	}

	private String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean update(Customers obj) {		
		String str = " update T_Customers set Name=?,FirstName=? where CodeCust=?;";		
		PreparedStatement ps;
		boolean ok = false;
		try {
			connection2 = null;
			ps = ((Connection) connection2).prepareStatement(str);
			ps.setInt(1,obj.getIdCustomers());
			ps.setString(2,obj.getFirstName());
			ps.setString(3,obj.getName());
			int row = ps.executeUpdate();
			if(row > 0)	ok = true;			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return ok;
	}

	public boolean delete(Customers obj) {
		String str = "delete from T_Customers where IdCust=?;";	
		PreparedStatement ps;
		boolean ok = false;
		try {
			connection = null;
			ps = ((Connection) connection).prepareStatement(str);
			ps.setInt(1,obj.getIdCustomers());
			int row = ps.executeUpdate();
			if(row > 0)	ok = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ok;
	}
}
