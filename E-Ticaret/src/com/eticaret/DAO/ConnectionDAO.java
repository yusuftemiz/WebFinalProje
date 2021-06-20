package com.eticaret.DAO;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConnectionDAO {
	public static Connection getConnection() {
		Connection connectStatus = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
//			?useUnicode=true&characterEncoding=UTF-8
			connectStatus = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/eticaret", "root", "yusuftemiz22");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}		
		return connectStatus;
	}
}
