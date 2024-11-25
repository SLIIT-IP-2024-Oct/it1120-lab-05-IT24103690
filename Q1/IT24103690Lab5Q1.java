import java.util.Scanner;




public class IT24103690Lab5Q1{

	public static void main(String[] args){

		System.out.print("Enter the first integer: " + " " );
		
		Scanner input1 = new Scanner(System.in);
		
		int num_1 = input1.nextInt();

		System.out.print("Enter the second integer: " + " ");

		Scanner input2 = new Scanner(System.in);

		int num_2 = input2.nextInt();

		System.out.print("Enter the third integer: " + " " );

		Scanner input3 = new Scanner(System.in);

		int num_3 = input3.nextInt();

		System.out.println("User entered numbers are: " + " " + num_1 + " " + num_2 + " " + num_3);
		
		int Small = num_1;
		int Large = num_1;

		if (num_2>Large){
		Large = num_2; 
		}
		if (num_2<Small){
		Small = num_2;
		}

	
		if(num_3>Large){
		Large = num_3;
		}
		if(num_3<Small){
		Small = num_3;
		}
		

		System.out.println("The smallest number is:" + " " + Small);
		System.out.println("The Largest nuber is:" + " " + Large);
		}
}
		
		