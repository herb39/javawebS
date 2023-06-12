package com.spring.javawebS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.javawebS.dao.MemberDAO;

@Service
public class MemberServieImpl implements MemberService {

	@Autowired
	MemberDAO memberDAO;

	
}
