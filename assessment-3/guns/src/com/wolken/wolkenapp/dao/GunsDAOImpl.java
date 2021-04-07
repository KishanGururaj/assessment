package com.wolken.wolkenapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wolken.wolkenapp.Connect;
import com.wolken.wolkenapp.dto.GunsDTO;

public class GunsDAOImpl implements GunsDAO {
	Connection con=Connect.getConnect();
	GunsDTO gunsDTO=new GunsDTO();

	@Override
	public void add(GunsDTO gunsDTO) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("inside add method inside GunsDAOImpl");
		System.out.println("insert using SQL with  JDBC API  ");
		//try(Connection con=DriverManager.getConnection("url")){
			try(PreparedStatement pre=con.prepareStatement("insert into wolken.gun_table values(?,?,?,?,?,?,?,?)")){
				pre.setInt(1, gunsDTO.getGunsId());
				pre.setString(2,gunsDTO.getName());
				pre.setInt(3, gunsDTO.getPrice());
				pre.setInt(4, gunsDTO.getSerialNumber());
				pre.setString(5,gunsDTO.getBrandName());
				pre.setString(6,gunsDTO.getType());
				pre.setInt(7, gunsDTO.getNoOfBullets());
				pre.setString(8,gunsDTO.getMadeIn());
				pre.executeUpdate();
				this.gunsDTO=gunsDTO;
				System.out.println("guns data is been added");
				pre.close();
			}//con.close();
		}
	//}

	@Override
	public void getAll() throws SQLException {
		// TODO Auto-generated method stub
		//try(Connection con=DriverManager.getConnection("url")){
		System.out.println("inside get all method inside GunsDAOImpl");
			try(PreparedStatement pre=con.prepareStatement("select * from wolken.gun_table")){
				System.out.println("execute SQL statement (select query) ");
				try(ResultSet rs=pre.executeQuery()){
					System.out.println("inside get all result set ");
					while(rs.next()) {
						 int gunsId=rs.getInt("guns_id");
						 String name=rs.getString("guns_name");
						 int price=rs.getInt("gun_price");
						 int serialNumber=rs.getInt("guns_sno");
						 String brandName=rs.getString("gun_brand");
						 String type=rs.getString("gun_type");
						 int noOfBullets=rs.getInt("no_of_bullets");
						 String madeIn=rs.getString("made_in");
						 System.out.println(""+gunsId+" "+name+" "+price+" "+serialNumber+" "+brandName+" "+type+" "+noOfBullets+" "+madeIn);
					}
					System.out.println("result set closed inside getall ");
					rs.close();
						
					}
				System.out.println("prepared statement closed inisde getall");
				pre.close();
				}//con.close();
			}
	//}
		


	@Override
	public GunsDTO deleteByGunsId(int gunsId) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("inside delete by guns id inside GunsDAOImpl");
		//try(Connection con=DriverManager.getConnection("url")){
			try(PreparedStatement pre=con.prepareStatement("delete from wolken.gun_table where guns_id=?")){
				pre.setInt(1,gunsId);
				pre.executeUpdate();
				System.out.println("data has been deleted inside GunsDAOImpl");
				System.out.println("prepared statement closed inisde delete inside GunsDAOImpl");
				pre.close();
			
			//}con.close();
		}return gunsDTO;
	}

	@Override
	public GunsDTO updateBySerialNumber(int serialNumber) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("inside update by serial number inside GunsDAOImpl");
		//try(Connection con=DriverManager.getConnection("url")){
			try(PreparedStatement pre=con.prepareStatement("update wolken.gun_table set guns_name=null where guns_sno=?")){
				pre.setInt(1,serialNumber);
				pre.executeUpdate();
				System.out.println("data has been update inside GunsDAOImpl");
				pre.close();
			
			//}con.close();
		}return gunsDTO;
		
	}

	@Override
	public void getAllBrandName(String brandName) throws SQLException{
		// TODO Auto-generated method stub
		System.out.println("get all by brand name inside GunsDAOImpl");
		//try(Connection con=DriverManager.getConnection("url")){
			try(PreparedStatement pre=con.prepareStatement("select * from gun_table where gun_brand = ?")){
				pre.setString(1, brandName);
				try(ResultSet rs=pre.executeQuery()){
					System.out.println("inside get all brand name inside GunsDAOImpl");
					while(rs.next()) {
						 int gunsId=rs.getInt("guns_id");
						 String name=rs.getString("guns_name");
						 int price=rs.getInt("gun_price");
						 int serialNumber=rs.getInt("guns_sno");
						 //String brandName1=rs.getString("gun_brand");
						 String type=rs.getString("gun_type");
						 int noOfBullets=rs.getInt("no_of_bullets");
						 String madeIn=rs.getString("made_in");
						 System.out.println(""+gunsId+" "+name+" "+price+" "+serialNumber+"  "+type+" "+noOfBullets+" "+madeIn);
					}
					System.out.println("result set is closed inside GunsDAOImpl");
					rs.close();
				
				//pre.executeUpdate();
				System.out.println("prepared statement is closed inside GunsDAOImpl");
				pre.close();
				//}con.close();
			}
		}
		
		
	}

	@Override
	public void getAllByCountryName() throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("get all by country name inside GunsDAOImpl");
		//try(Connection con=DriverManager.getConnection("url")){
			try(PreparedStatement pre=con.prepareStatement("select * from gun_table ")){
				try(ResultSet rs=pre.executeQuery()){
					System.out.println("inside get all result set by country inside GunsDAOImpl");

					while(rs.next()) {
						 int gunsId=rs.getInt("guns_id");
						 String name=rs.getString("guns_name");
						 int price=rs.getInt("gun_price");
						 int serialNumber=rs.getInt("guns_sno");
						 String brandName=rs.getString("gun_brand");
						 String type=rs.getString("gun_type");
						 int noOfBullets=rs.getInt("no_of_bullets");
						 String madeIn=rs.getString("made_in");
						 System.out.println(""+gunsId+" "+name+" "+price+" "+serialNumber+" "+brandName+" "+type+" "+noOfBullets+" "+madeIn);
					}
					System.out.println("result closed inside get all by country name inside GunsDAOImpl");
					rs.close();
				}
				//pre.executeUpdate();
				System.out.println("prepared statement closed inside get all b y country name inside GunsDAOImpl ");
				pre.close();
				//con.close();
			}
		Connect.closeConnect();
	}

}
