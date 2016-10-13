package com.cn.hnust.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;

	@RequestMapping(value = "/query", method = RequestMethod.GET)
	@ResponseBody
	public JSONObject query() {
		Map<String, Object> map = new HashMap<String, Object>();
		List<User> list = service.query(map);

		JSONObject data = new JSONObject();
		data.put("name", "sdfdf");
		data.put("sex", "25");
		data.put("list", list);

		return data;
	}

	@RequestMapping(value = "/query2", method = RequestMethod.GET)
	public ModelAndView query2() {
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> context = new HashMap<String, Object>();
		List<User> list = service.query(map);

		JSONObject data = new JSONObject();
		data.put("name", "sdfdf");
		data.put("sex", "25");
		data.put("list", list);
		
		context.put("name", "wolsdlf");

		return new ModelAndView("user", context);
	}

}
