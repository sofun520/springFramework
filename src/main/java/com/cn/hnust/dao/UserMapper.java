package com.cn.hnust.dao;

import java.util.List;
import java.util.Map;

import com.cn.hnust.pojo.User;

public interface UserMapper {
	int delete(Integer id);

	int insert(User record);

	User find(Integer id);

	int update(User record);

	List<User> query(Map<String, Object> map);

}