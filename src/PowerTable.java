import java.util.Scanner;

public class PowerTable {

	public static void main(String[] args) {
		String answer = "y";	
	
		int square = 0;
		int cube = 0;
		String down = "";
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Learn your squares and cubes!"+"\n");
			
			
			do { 
				System.out.println("Enter a number between 1 and 100:");
				int userInput=scanner.nextInt();
				String Title  = "Number  "+"square " + "cube  " + "\n" + "====== " + "====== " + "====== ";
				System.out.println(Title);
				
				for (int i = 1; i <= userInput; i++) { 
			
				square = i * i;
				cube = i * i * i;
				
				down = i + "      " + square + "      " + cube;
				System.out.println(down);
				}
				System.out.println("Would you like to continue? (Y/N)");
				answer=scanner.next();
			} while (!answer.equalsIgnoreCase("n"));
		}
		
	
		
		

	}

}
