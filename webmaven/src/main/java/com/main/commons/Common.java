package com.main.commons;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Common {
	public static Connection getDBConnection(){
		Connection conn = null;
	    try {
			Class.forName("com.mysql.jdbc.Driver");    //为mysql创建一个新用户，进入cmd，输入mysql -u root -p回车输入grant insert on *.* to jason@% identified by "1122" 回车输入flush privileges
		    String url = "jdbc:mysql://localhost:3306/xml";// 数据库连接，oracle代表链接的是oracle数据库；thin:@MyDbComputerNameOrIP代表的是数据库所在的IP地址（可以保留thin:）；1521代表链接数据库的端口号；ORCL代表的是数据库名称
		    String UserName = "jason";// 数据库用户登陆名 ( 也有说是 schema 名字的 )
			String Password = "1122";// 密码
			conn = DriverManager.getConnection(url, UserName, Password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
