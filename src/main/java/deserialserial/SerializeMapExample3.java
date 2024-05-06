package deserialserial;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class SerializeMapExample3 {

	public static void main(String[] args) {
		int n;  
        
        Map<Course, Student> student = new HashMap<Course, Student>();  
          
        // create an instance of Scanner class  
        Scanner sc = new Scanner(System.in);  
          
        System.out.println("Enter total number of students: ");  
        n = Integer.valueOf(sc.nextLine());  
          
        for(int i = 0; i < n; i++) {  
            String id, fName, lName;  
              
            Student std = new Student();  
            Course course = new Course();  
              
            System.out.println("Enter id of "+(i+1)+" student:");  //0+1 => 1
            
            id = sc.nextLine();  
            std.setId(id); 
              
            System.out.println("Enter first name of "+(i+1)+" student:");  
            fName = sc.nextLine();  
            std.setFName(fName);  
              
            System.out.println("Enter last name of "+(i+1)+" student:");  
            lName = sc.nextLine();  
            std.setLName(lName);  
              
            System.out.println("Enter course of "+(i+1)+" student:");  
            course.setName(sc.nextLine());  
              
            System.out.println("Enter Semester: ");  
            course.setSemester(sc.nextLine());  
              
            // fill student map  
            student.put(course, std);  
        }  
          
        // create an instance of the ObjectMapper class  
        ObjectMapper mapper = new ObjectMapper();  
          
        // enable SerializationFeature in ObjectMapper  
        mapper.enable(SerializationFeature.INDENT_OUTPUT);  
          
        String jsonString;  
        try {  
              
            jsonString = mapper.writeValueAsString(student);  
            System.out.println("After converting Map to JSON :");  
            System.out.println(jsonString);  
        } catch (JsonProcessingException e) {  
            e.printStackTrace();  
        }  
          
        // close Scanner class object  
        sc.close();  
          
    }    

	}


