package com.service.spring.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.spring.domain.MemberVO;
import com.service.spring.user.MemberDAO;
import com.service.spring.user.MemberService;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberDAO  memberDAO;
	
	
	@Override
	public MemberVO getMember(String id) throws Exception {
		return memberDAO.getMember(id);
	}

	@Override
	public List<MemberVO> showAllMember() throws Exception {
		return memberDAO.showAllMember();
	}

	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		return memberDAO.login(vo);
	}

}
