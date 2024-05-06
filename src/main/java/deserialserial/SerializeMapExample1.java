package deserialserial;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializeMapExample1 {

	public static void main(String[] args) {
		 int n;  
	        Map<String, String> student = new HashMap<String, String>();  
	          
	        // create an instance of Scanner class  
	        Scanner sc = new Scanner(System.in);  
	          
	        System.out.println("Enter total number of students: ");  
	        n = Integer.valueOf(sc.nextLine());  
	          
	        for(int i = 0; i < n; i++) {  //1
	            String id, name;
	            System.out.println("Enter student id of "+(i+1)+" student:");  //0+1 => 1
	            id = sc.nextLine();  //
	            System.out.println("Enter student name of "+(i+1)+" student:"); //0+1 => 1  
	            name = sc.nextLine();  
	              
	            // fill student map  
	            student.put(id, name);//adding it to the Map.  
	        }  
	          
	        // create an instance of the ObjectMapper class  
	        ObjectMapper mapper = new ObjectMapper();  
	          
	        try {  
	            // serialize student Map by using Jackson  
	            String jsonString = mapper  
	                    .writerWithDefaultPrettyPrinter()  
	                    .writeValueAsString(student);  // serializing the map into the String.
	            // Maps(KEY-VALUE) Pair will be Converted into the JSON consists of Key and value pair.
	            System.out.println("Java Map after serialize using Jackson: "+jsonString);  
	        } catch (JsonProcessingException e) {  
	            // TODO Auto-generated catch block  
	            e.printStackTrace();  
	        }  
	          
	        // close Scanner class object  
	        sc.close();  
	          
	    }    
	}


