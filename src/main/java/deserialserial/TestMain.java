package deserialserial;

import java.util.Scanner;

public class TestMain {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s);
		Integer b = Integer.valueOf(s);
		System.out.println("The Test value is " + b);
		
		Integer obj = new Integer(2); 
		   
        String str = "424"; 
        // It will return  a Integer instance 
        // representing  the specified string 
        System.out.println("Integer Value = " +  
                            obj.valueOf(str)); 

	}

}
