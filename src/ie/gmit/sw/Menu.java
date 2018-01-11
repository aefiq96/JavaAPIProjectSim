package ie.gmit.sw;

import java.util.Scanner;

public class Menu {
private Scanner console = new Scanner(System.in);
	
	public Menu() throws InterruptedException {
			//ask user
			Launcher launch = new Launcher();
			
			System.out.println("Enter name of File 1: ");
			String file1 = console.next();
			
			System.out.println("Enter name of File 2: ");
			String file2 = console.next();
			
			System.out.println("Enter Shingle size: ");
			int shingleSize = console.nextInt();
			
			System.out.println("Enter min hash size: ");
			int k = console.nextInt();
			
			System.out.println("Enter pool size: ");
			int pool = console.nextInt();
			//call launch method 
			launch.Launch(file1, file2, shingleSize, k, pool);
	}

}
