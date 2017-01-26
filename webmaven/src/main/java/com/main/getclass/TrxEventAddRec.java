package com.main.getclass;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.main.commons.Common;

public class TrxEventAddRec implements ClassNames{

	@Override
	public void say() {
		System.out.println("bb");
	}

	@Override
	public void getDate(String table) {
		try {
			Connection conn = Common.getDBConnection();
			Statement stmt = conn.createStatement();
			String selectSql = "select * from "+table;
			ResultSet resultSet = stmt.executeQuery(selectSql);
			while(resultSet.next()){
				String name = resultSet.getString("name");
				int age = resultSet.getInt("age");
				String address = resultSet.getString("address");
				
				System.out.println(name+":"+age+":"+address);
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
