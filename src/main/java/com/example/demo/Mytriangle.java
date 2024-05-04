package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mytriangle {
	
	// Triangle Pattern	
	
	@GetMapping("/letters/{a}")
	public  String triangleprogram(@PathVariable int a) {
	       
        StringBuilder ne = new StringBuilder();
  		
  		for(int i=0;i<=a;i++){
  			for(int j =a-i;j>=1;j--) {                        				
  			   ne.append(" ");	                         	
  			}
  			for(int k=0;k<=i;k++) {
  			   ne.append("* ");
  			}
  		       ne.append("\n");
  		}
          return ne.toString();
}
	
}
