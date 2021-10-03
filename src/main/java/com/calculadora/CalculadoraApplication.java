package com.calculadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.calculadora.Greeting;



@SpringBootApplication
@Controller
public class CalculadoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraApplication.class, args);
	}
	 @GetMapping("/")
	    public String calForm(Model model) {
	 
	        model.addAttribute("greeting", new Greeting());
	 
	        return "datos";
	 
	    }
	 
	    @PostMapping("/calcular")
	    public String formSubmit(@ModelAttribute Greeting greeting) {

	        return "resultado";
	 
	    }

}
