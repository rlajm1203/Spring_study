package org.zerock.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {
	
	@Test
	public void testConnection() throws Exception {
		
		Class clz = Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// DB와 연결 세션 생성
		Connection connection = 
				DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:XE", 
						"book_ex", "book_ex");
		
		// jdbc 드라이버 확인
		log.info(clz);
		
		// 연결 확인
		log.info(connection);
		
		// bad code
		connection.close(); 
		
	}
	
}
