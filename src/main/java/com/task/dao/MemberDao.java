package com.task.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.task.domain.Member;

//@Mapper
public interface MemberDao {
	public List<Member> selectAll();
}
