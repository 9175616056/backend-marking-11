package com.marketing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketing.entities.banglow;
import com.marketing.services.servi;


@Controller
public class cont {
   
	@Autowired
	private servi ser;
	
	
	//http://localhost:8080/create
	@RequestMapping("/create")
	public String create() {
		return"createe";
	}
	@RequestMapping("/save")
	public String save(@RequestParam("house")banglow house,Model model) {
		ser.onesave(house);
		model.addAttribute("msg","no record found");
		return"createe";
	}
	//http://localhost:8080/list
	@RequestMapping("/list")
	public String list(Model model) {
		List<banglow> Lead = ser.listte();
		model.addAttribute("Lead",Lead);
		return"listt";
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam("id")long id,Model model) {
		ser.deletee(id);
		
		List<banglow> Lead = ser.listte();
		model.addAttribute("Lead",Lead);
		return"listt";
	}
	@RequestMapping("/update")
	public String update(@RequestParam("id")long id,Model model) {
		
		banglow updatee = ser.updatee(id);
		model.addAttribute("updatee",updatee);
		return"update";
	}
	@RequestMapping("/updatelead")
	public String updatelead(@ModelAttribute("house")banglow house,Model model) {
		ser.onesave(house);
		
		List<banglow> Lead = ser.listte();
		model.addAttribute("Lead",Lead);
		return"listt";
	}
	}
	

