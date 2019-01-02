package com.ljf.dao;

import com.ljf.pojo.Blog;

import java.util.Map;

public interface BlogDao {
	//存储过程调用
	public void countByType(Map<String, Integer> map);
	
	public Blog findByid(int id);
	public void update(Blog blog);
}
