package fr.perso.springbootgithubactions;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@Value("${fr.perso.springbootgithubactions.helloProp}")
	String helloProp;
	
	
	@RequestMapping("/")
	public String hello() {
		return "Hello " + helloProp +" ! ";
	}
	
	
} 