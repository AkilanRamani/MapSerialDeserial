package deserialserial;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TypeSerialization {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
	    ObjectMapper mapper = new ObjectMapper();  
        
        // create json string  
        String studentString = "{\"id\": \"001\", \"fName\":\"Nicholas\", \"lName\":\"Clemens\"}";  
          
        // create TypeReference of type HashMap<String, String>  
        TypeReference<HashMap<String, String>> typeRef = new TypeReference<HashMap<String, String>>() {};  
          
        // deserialize studentString into Map<String, String>  
        Map<String, String> studentMap = mapper.readValue(studentString, typeRef);  //de-serialization
          
        System.out.println("Student Map======>"+studentMap);  

	}

}
