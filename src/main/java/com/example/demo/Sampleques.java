package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sampleques {

// Repeated Letters and Unique Letters
	@GetMapping("/variable/{a}")
    public String ulcase(@PathVariable String a) {
		
       String f ="";
       String o ="";
		char[] arr = a.toCharArray();
		for(int i=0;i<a.length();i++) { 
			int count = 1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					count = count+1;
					arr[j]='$';
				}
			}
			if(count == 1 && arr[i]!='$') {
				o=o+arr[i];
			}
			else if(count > 1 && arr[i]!='$') {
				f=f+arr[i];
			}
		}
		return "String : "+a+" , Unique Letters : "+o.toUpperCase()+" , Repeated Letters : "+f.toLowerCase();
	}
	

}
