package com.main.commons;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Common {
	public static Connection getDBConnection(){
		Connection conn = null;
	    try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		    String url = "jdbc:oracle:thin:@localhost:3306:CEDB";// 数据库连接，oracle代表链接的是oracle数据库；thin:@MyDbComputerNameOrIP代表的是数据库所在的IP地址（可以保留thin:）；1521代表链接数据库的端口号；ORCL代表的是数据库名称
		    String UserName = "CEUSER";// 数据库用户登陆名 ( 也有说是 schema 名字的 )
			String Password = "CEUSER";// 密码
			conn = DriverManager.getConnection(url, UserName, Password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
