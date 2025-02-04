package pack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Hello2 {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.print("Hello W");
		System.out.println("orld again!");
		
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		System.out.println("Welcome "+name);
		sc.close();
				
	}

}
