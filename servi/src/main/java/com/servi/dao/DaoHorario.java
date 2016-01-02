package com.servi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.servi.connector.Conecction;
import com.servi.dto.DtoHorario;

public class DaoHorario {

	private Connection con;
	private java.sql.Statement stmt;
	private String query;

	public List<DtoHorario> getAll(){
		List<DtoHorario> catalog = new ArrayList<DtoHorario>();
		DtoHorario obj;
		try {
			con = new Conecction().getConection();
			stmt = con.createStatement();
			query = "SELECT * FROM horario";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				obj=new DtoHorario();
				obj.setId(rs.getInt("ID"));
				obj.setGrupo(rs.getString("grupo"));
				obj.setMateria(rs.getString("materia"));
				obj.setProfesor(rs.getString("profesor"));
				obj.setSalon(rs.getInt("salon"));
				obj.setLunes(rs.getTime("lunes"));
				obj.setMartes(rs.getTime("martes"));
				obj.setMiercoles(rs.getTime("miercoles"));
				obj.setJueves(rs.getTime("jueves"));
				obj.setViernes(rs.getTime("viernes"));
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
