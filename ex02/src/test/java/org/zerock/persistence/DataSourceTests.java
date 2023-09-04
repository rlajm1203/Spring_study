package org.zerock.persistence;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DataSourceTests {
	
	@Autowired
	private DataSource ds;
	
	@Autowired
	private SqlSessionFactory sessionFactory;
	
	@Test
	public void testConnection() {
		
		try(Connection connection = ds.getConnection()){
			log.info(connection);
		} catch(Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());
		}
	}
	
	@Test
	public void testConnection2() {
		
		System.out.println("---------test2----------");
		try(SqlSession session = sessionFactory.openSession();
				Connection con = session.getConnection()){
			
			log.info(session);
			
			log.info(con);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

