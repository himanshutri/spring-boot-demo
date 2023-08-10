package com.trieffects.springbootdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trieffects.springbootdemo.controller.model.Employee;

@RestController
public class EmployeeController {

	@RequestMapping("/getAllEmployees")
	public List<Employee> getAllEmployees(){
		List<Employee> list=new ArrayList<Employee>();
		Employee e1=new Employee("himanshu",1,"noida");
		Employee e2=new Employee("Ajay",2,"noida");
		list.add(e1);
		list.add(e2);
		return list;
	}
}
