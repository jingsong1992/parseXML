package com.main.getclass;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.main.commons.Common;

public class TrxMasterAddRec implements ClassNames{

	@Override
	public void say() {
		System.out.println("aa");
		
	}

	@Override
	public void getDate(String table) {
		try {
			Connection conn = Common.getDBConnection();
			Statement stmt = conn.createStatement();
			String selectSql = "select * from "+table;
			ResultSet resultSet = stmt.executeQuery(selectSql);
			while(resultSet.next()){
				String weight = resultSet.getString("weight");
				String height = resultSet.getString("height");
				System.out.println(weight+":"+height);
			}
			System.out.print(table);
			resultSet.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
