package com.creditease.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.creditease.producer.MessageProducer;

@Controller
public class IndexController {
	@Value("${INDEX}")
	private String index;
	@Autowired
	private MessageProducer messageProducer;
	@RequestMapping("/index.shtml")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("index", index);
		messageProducer.sendMessage("--hello---");
		return new ModelAndView("index", map);
	}
}
