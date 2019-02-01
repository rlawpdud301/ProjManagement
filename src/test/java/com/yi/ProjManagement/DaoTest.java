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
		projManagement.setProj_no(1);
		projManagement.setProj_name("±èÀð¿µ");
		projManagement.setProj_cont("User4");
		projManagement.setStart_date(new Date());
		projManagement.setEnd_date(new Date());
		projManagement.setProgress("ÁøÇàÁß");
		
		dao.insert(projManagement);
	}
	
	@Test
	public void testList() throws SQLException {
		System.out.println(dao.select());
	}
	
	/*@Test
	public void testupdate() {
		ReplyVO vo= new ReplyVO();
		vo.setRno(1);
		vo.setReplytext("sdafsdafsdafsdaf");
		dao.update(vo);
	}
	@Test
	public void testdelet() {
		dao.delete(2);
	}*/
}
