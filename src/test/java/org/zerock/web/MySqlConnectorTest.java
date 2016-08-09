package org.zerock.web;

import java.sql.DriverManager;

import org.junit.Test;

import com.mysql.jdbc.Connection;

public class MySqlConnectorTest {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/book_ex";
	private static final String USER = "zerock";
	private static final String PASSWORD = "zerock";

	@Test
	public void testConnection() throws Exception {
		Class.forName(DRIVER);
		try (Connection conn = (Connection) DriverManager.getConnection(URL, USER, PASSWORD)) {
			System.out.println(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
