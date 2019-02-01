package com.yi.service;

import java.sql.SQLException;
import java.util.List;

import com.yi.domain.ProjManagementVO;

public interface ManagementService {
	public void insert(ProjManagementVO vo) throws SQLException;

	public List<ProjManagementVO> select() throws SQLException;

	public ProjManagementVO selectByNo(String proj_no) throws SQLException;

	public void delet(String proj_no) throws SQLException;

	public void update(ProjManagementVO vo) throws SQLException;
}
