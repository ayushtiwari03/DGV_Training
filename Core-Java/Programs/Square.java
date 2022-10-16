package first;

import java.util.Scanner;

public class Square implements Shape{
	
	Scanner sc = new Scanner(System.in);
	
	int side;
	
	public void getDetails() {
		System.out.println("Enter side");
		side = sc.nextInt();
		
		
	}
	
	public int area() {
		return side*side;
	}

}
