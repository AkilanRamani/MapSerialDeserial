package deserialserial;

public class Course {
	 private String name;  
	    private String semester;  
	      
	    public String toString() {  
	        return "Course Name = "+name+" Semester = "+semester;  
	    }  
	      
	    public String getName() {  
	        return name;  
	    }  
	    public void setName(String name) {  
	        this.name = name;  
	    }  
	      
	    public String getSemester() {  
	        return semester;  
	    }  
	    public void setSemester(String semester) {  
	        this.semester = semester;  
	    }  
}
