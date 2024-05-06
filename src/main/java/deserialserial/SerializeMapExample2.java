package deserialserial;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class SerializeMapExample2 {

	public static void main(String[] args) {
		  int n;  
          
	        Map<String, Student> student = new HashMap<String, Student>();  
	          
	        // create an instance of Scanner class  
	        Scanner sc = new Scanner(System.in);  
	          
	        System.out.println("Enter total number of students: ");  
	        n = Integer.valueOf(sc.nextLine());  
	          
	        for(int i = 0; i < n; i++) {  //1
	            String id, fName, lName, course;  
	              
	            Student std = new Student();  
	              
	            System.out.println("Enter id of "+(i+1)+" student:");  
	            id = sc.nextLine();  
	              
	            System.out.println("Enter first name of "+(i+1)+" student:");  
	            fName = sc.nextLine();  
	            std.setFName(fName);  
	              
	            System.out.println("Enter last name of "+(i+1)+" student:");  
	            lName = sc.nextLine();  
	            std.setLName(lName);  
	              
	            System.out.println("Enter course of "+(i+1)+" student:");  
	            course = sc.nextLine();  
	            std.setCourse(course);  
	              
	            // fill student map  
	            student.put(id, std);  // adding id key and Student type on to the Map.
	        }  
	          
	        // create an instance of the ObjectMapper class  
	        ObjectMapper mapper = new ObjectMapper();  
	          
	        // enable SerializationFeature in ObjectMapper  
	      mapper.enable(SerializationFeature.INDENT_OUTPUT);  // it would Print the JSON in a Tree Format.
	          
	        String jsonString;  
	        try {  
	              
	            jsonString = mapper.writeValueAsString(student);  // serialize 
	            System.out.println("After converting Map to JSON :");  
	            System.out.println(jsonString);  
	        } catch (JsonProcessingException e) {  
	            e.printStackTrace();  
	        }  
	          
	        // close Scanner class object  
	        sc.close();  
	          
	    }    

	}


