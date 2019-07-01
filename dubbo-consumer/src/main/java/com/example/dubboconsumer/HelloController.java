package com.example.dubboconsumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubboservice.DemoOne1Service;
import com.example.dubboservice.DemoOne2Service;
import com.example.dubboservice.DemoTwo1Service;
import com.example.dubboservice.DemoTwo2Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Reference(version = "1.0.1")
	private DemoOne1Service one1Service;

	@Reference(version = "1.0.1")
	private DemoOne2Service one2Service;

	@Reference(version = "1.0.1")
	private DemoTwo1Service two1Service;

	@Reference(version = "1.0.1")
	private DemoTwo2Service two2Service;

	@GetMapping(value = "/hello1")
	public String hello1() {
		return one1Service.test();
	}

	@GetMapping(value = "/hello2")
	public String hello2() {
		return one2Service.test();
	}

	@GetMapping(value = "/hello3")
	public String hello3() {
		return two1Service.test();
	}

	@GetMapping(value = "/hello4")
	public String hello4() {
		return two2Service.test();
	}
}
