package com.ems.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ems.bean.SalariesBean;

public interface SalariesService {

	// @GetMapping(path = "/salaries/{id}")
	@GetMapping(path = "/backend-salaries-service/salaries/{id}")
    SalariesBean getSalariesByEmployeeId(@PathVariable(value = "id") long id) throws Exception;

}
