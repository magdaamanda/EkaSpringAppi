package springiharjoitus.EkaAppi.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class FirstController {

	@RequestMapping("index")
	@ResponseBody
	public String returnGreeting() {
		return "This is the main page";
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String returnGreeting2() {
		return "This is the contact page";
	}
	@RequestMapping("hello")
	@ResponseBody
	public String returnGreetingForLocation(@RequestParam(name = "location", required=false, defaultValue="Helsinki") String location, @RequestParam(name="name") String name) {
		return "Welcome to the " + location + name;
	}
}
