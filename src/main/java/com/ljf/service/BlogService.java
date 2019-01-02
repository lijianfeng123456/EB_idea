package com.ljf.service;

import com.ljf.dao.BlogDao;
import com.ljf.pojo.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService {
	@Autowired
	private BlogDao dao;
	
	public Blog findbyID(int id){
		return dao.findByid(id);
	}
}
