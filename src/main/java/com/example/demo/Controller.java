package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/order/{id}")
	public String getOrder(@PathVariable String id) {
        // id값을 url path로 입력받은 후 그 값을 응답에 넣어 리턴하는 코드
		System.out.println("getOrder. id: " + id);
		return "{ \"id\": \"" + id + "\"}";
	}
}