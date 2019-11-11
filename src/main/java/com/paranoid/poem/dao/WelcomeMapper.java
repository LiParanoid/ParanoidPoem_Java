package com.paranoid.poem.dao;

import org.apache.ibatis.annotations.Mapper;

import com.paranoid.poem.entity.Poem;

@Mapper
public interface WelcomeMapper {
	Poem getRandItem();
}
