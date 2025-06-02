package com.example.demo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Fighterjet;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class ControllerJet {

	List<Fighterjet> listofjets=new ArrayList<>(List.of(new Fighterjet("f-35","usa",2720), new Fighterjet("Akasha","India",3220)));
	 
	
	@GetMapping("/get-jetInfo")
	public Fighterjet getJetInfo() {
		
		Fighterjet f1=new Fighterjet("su-57","Russia",2220);
		return f1;
	}
	
	@GetMapping("/get-alljets")
	public List<Fighterjet> getAllJetsInfo(){
		
		return listofjets;
	} 
	
	@GetMapping("/get-info")
	public String getinfo(HttpServletRequest request) {
		
		return "5th generation fighters jets has stleath  "+request.getSession().getId();
	}
	
	@GetMapping("/get-moreinfo")
	public String moregetinfo(HttpServletRequest request) {
		
		return "japan is already making 6th gen jets  "+request.getSession().getId();
	}
	
	@PostMapping("/add-jet")
	public Fighterjet addjet(@RequestBody Fighterjet jet) {
		
	System.out.print(jet);
	return jet;
		
	}
	
	@GetMapping("/csrf")
	public CsrfToken getscsrfToken(HttpServletRequest request) {
		
		return (CsrfToken) request.getAttribute("_csrf");
	}
	
}
