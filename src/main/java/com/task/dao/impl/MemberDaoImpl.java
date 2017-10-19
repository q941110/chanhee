package com.task.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.task.dao.MemberDao;
import com.task.domain.Member;

@Repository
public class MemberDaoImpl implements MemberDao{

	private SqlSession sqlSession;
	
	@Autowired
	public MemberDaoImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Member> selectAll() {
		List<Member> members = sqlSession.selectList("selectAll");
		return members;
	}

}
