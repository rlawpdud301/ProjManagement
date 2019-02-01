package com.yi.ProjManagement;

import java.sql.SQLException;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yi.domain.ProjManagementVO;
import com.yi.persistence.ManagementDAO;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class DaoTest {

	@Autowired
	private ManagementDAO dao;
	
	@Test
	public void testinsert() throws SQLException {
		ProjManagementVO projManagement = new ProjManagementVO();
		projManagement.setProj_name("±èÀð¿µ");
		projManagement.setProj_cont("User4");
		projManagement.setStart_date(new Date());
		projManagement.setEnd_date(new Date());
		projManagement.setProgress("ÁøÇàÁß");
		
		
		dao.insert(projManagement);
		
	}
	
	@Test
	public void testselect() throws SQLException {
		System.out.println(dao.select());
	}
	
	@Test
	public void testselectByNo() throws SQLException {
		System.out.println(dao.selectByNo("1"));
	}
	
	@Test
	public void testupdate() throws SQLException {
		ProjManagementVO vo= new ProjManagementVO();
		vo.setProj_no(1);
		vo.setProj_name("asdasd");
		vo.setProj_cont("¤±¤±¤±¤±¤±¤±¤±");
		vo.setProgress("º¸·ù");
		dao.update(vo);
	}
	
	@Test
	public void testdelet() throws SQLException {
		dao.delet("1");
	}
}
