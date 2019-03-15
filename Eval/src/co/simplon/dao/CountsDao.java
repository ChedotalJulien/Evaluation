package co.simplon.dao;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import dao.Dao;
import java.sql.ResultSet;
import entities.Counts;

public class CountsDao extends Dao<Counts> {
	@Override
	public Counts find(int id) {
		String str = "select * from T_Counts where NumCounts=?";
		PreparedStatement ps;
		Counts counts = null;
		try {
			ps = connection.prepareStatement(str);
			ps.setInt(1,id);
			ResultSet resultSet = ps.executeQuery();
			if(resultSet.next()){
				counts = new Counts (resultSet.getInt(1), resultSet.getDate(2), resultSet.getDouble(3),resultSet.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return counts;
	}

	public boolean create(Object cpt1) {
		String str = "INSERT INTO T_Counts (NumCt,DateCreation, Balance, IdCustomers) VALUES (?, ?, ? ,? );";
		PreparedStatement ps;
		boolean ok = false;
		try {
			ps = connection.prepareStatement(str);
			ps.setInt(1, ((Counts) cpt1).getNumCounts());
			ps.setDate(2,  ((Counts) cpt1).getDateCreation());
			ps.setDouble(3,((Counts) cpt1).getBalance());
			ps.setInt(4,((Counts) cpt1).getIdCust());
			ps.executeQuery();
			ok = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ok;
	}

	@Override
	public boolean update(Object cpt1) {		
		String str = " update T_Counts set Balance=? where NumCt=?;";		
		PreparedStatement ps;
		boolean ok = false;
		try {
			ps = connection.prepareStatement(str);
			ps.setDouble(1,((Counts) cpt1).getBalance());
			ps.setInt(2,((Counts) cpt1).getNumCounts());
			int row = ps.executeUpdate();
			if(row > 0)	ok = true;			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return ok;
	}

	@Override
	public boolean delete(Object cpt1) {
		String str = "delete from T_Counts where NumCt=?;";	
		PreparedStatement ps;
		boolean ok = false;
		try {
			ps = connection.prepareStatement(str);
			ps.setInt(1,cpt1.getNumCounts());
			int row = ps.executeUpdate();
			if(row > 0)	ok = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ok;
	}

	@Override
	public boolean create(Counts obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Counts obj) {
		// TODO Auto-generated method stub
		return false;
	}
}

