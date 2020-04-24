package com.example.contract.producer.controller;

import com.example.contract.producer.constants.ApiPath;
import com.example.contract.producer.vo.DummyVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(ApiPath.DUMMY)
public class DummyController {

	@GetMapping
	public List<DummyVO> getDummy() {
		return Arrays.asList(new DummyVO().setValue("Hi! I'm a dummy object ;)"));
	}
}
