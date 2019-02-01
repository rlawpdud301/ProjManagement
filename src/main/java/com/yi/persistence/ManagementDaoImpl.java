package com.yi.persistence;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yi.domain.ProjManagementVO;

@Repository
public class ManagementDaoImpl implements ManagementDAO {

	@Autowired
	private SqlSession sqlSession;
	
	private static final String namespace = "com.yi.mapper.ManagementMapper";
	
	@Override
	public void insert(ProjManagementVO vo) throws SQLException {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace + ".insert",vo);
	}

	@Override
	public List<ProjManagementVO> select() throws SQLException {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace + ".select");
	}

	@Override
	public ProjManagementVO selectByNo(String proj_no) throws SQLException {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace + ".selectByNo",proj_no);
	}

	@Override
	public void delet(String proj_no) throws SQLException {
		// TODO Auto-generated method stub
		sqlSession.delete(namespace + ".delet",proj_no);
	}

	@Override
	public void update(ProjManagementVO vo) throws SQLException {
		// TODO Auto-generated method stub
		sqlSession.update(namespace + ".update",vo);
	}

}
