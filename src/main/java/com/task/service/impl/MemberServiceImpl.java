package com.task.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.dao.MemberDao;
import com.task.domain.Member;
import com.task.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{

	private MemberDao memberDao;
	
	@Autowired
	public MemberServiceImpl(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	@Override
	public List<Member> getAll() {
		List<Member> list = memberDao.selectAll();
		for(Member member : list) {
			System.out.println(member.toString());
		}
		
		return list;
	}

}
