package com.cn.hnust.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.UserMapper;
import com.cn.hnust.pojo.User;

@Service
public class UserService implements UserMapper {

	@Resource
	private UserMapper dao;

	public int delete(Integer id) {
		return dao.delete(id);
	}

	public int insert(User record) {
		return dao.insert(record);
	}

	public User find(Integer id) {
		return dao.find(id);
	}

	public int update(User record) {
		return dao.update(record);
	}

	public List<User> query(Map<String, Object> map) {
		return dao.query(map);
	}

}
