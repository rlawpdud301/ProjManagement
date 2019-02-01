package com.yi.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yi.domain.ProjManagementVO;
import com.yi.persistence.ManagementDAO;

@Service
public class ManagementServiceImpl implements ManagementService {

	@Autowired
	private ManagementDAO dao;
	
	@Override
	public void insert(ProjManagementVO vo) throws SQLException {
		dao.insert(vo);

	}

	@Override
	public List<ProjManagementVO> select() throws SQLException {
		// TODO Auto-generated method stub
		return dao.select();
	}

	@Override
	public ProjManagementVO selectByNo(String proj_no) throws SQLException {
		// TODO Auto-generated method stub
		return dao.selectByNo(proj_no);
	}

	@Override
	public void delet(String proj_no) throws SQLException {
		// TODO Auto-generated method stub
		dao.delet(proj_no);
	}

	@Override
	public void update(ProjManagementVO vo) throws SQLException {
		// TODO Auto-generated method stub
		dao.update(vo);
	}

}
