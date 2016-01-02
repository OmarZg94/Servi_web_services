package com.servi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.servi.connector.Conecction;
import com.servi.dto.DtoHueco;

public class DaoHueco {

	private Connection con;
	private java.sql.Statement stmt;
	private String query;

	public List<DtoHueco> getAll(){
		List<DtoHueco> catalog = new ArrayList<DtoHueco>();
		DtoHueco obj;
		try {
			con = new Conecction().getConection();
			stmt = con.createStatement();
			query = "SELECT * FROM hueco";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				obj=new DtoHueco();
				obj.setSalon(rs.getInt("salon"));
				obj.setDia(rs.getString("dia"));
				obj.setHora(rs.getTime("hora"));
				catalog.add(obj);
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return catalog;
	}
}
