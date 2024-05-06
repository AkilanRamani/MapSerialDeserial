package deserialserial;

public class Student {
	private String fName;  
    private String lName;  
    private String course;  
    private String id;  
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String toString() {  
        return "Name = "+fName + " " +lName+" Course = "+course;  
    }  
      
    public String getFName() {  
        return fName;  
    }  
    public void setFName(String fName) {  
        this.fName = fName;  
    }  
      
    public String getLName() {  
        return lName;  
    }  
    public void setLName(String lName) {  
        this.lName = lName;  
    }  
      
    public String getCourse() {  
        return course;  
    }  
    public void setCourse(String course) {  
        this.course = course;  
    }  
      
}
