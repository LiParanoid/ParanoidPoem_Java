package com.paranoid.poem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paranoid.poem.dao.WelcomeMapper;
import com.paranoid.poem.entity.Poem;
import com.paranoid.poem.service.WelcomeService;

@Service
public class WelcomeServiceImpl implements WelcomeService {
	@Autowired
	WelcomeMapper WelcomeMapper;
	@Override
	public Poem getRandItem() {
		
		return WelcomeMapper.getRandItem();
	}
	
}
