package com.utn.dao;

import java.sql.*;

public interface IConnection {

	public default Connection getConnection() {

		Connection conn = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/utn", "root", "");

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

		return conn;

	}

}
