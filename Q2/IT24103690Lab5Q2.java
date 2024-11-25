import java.util.Scanner;




public class IT24103690Lab5Q2{

	public static void main(String[] args){


		System.out.print("Enter the number of new members introduced:" + " ");
		
		Scanner input1 = new Scanner(System.in);

		int membersNum = input1.nextInt();

		
		if(membersNum < 0){
			
			System.out.print("The number of members should be greater than or equal to zero");
			}
			
		switch(membersNum){

			case 0:  System.out.print("No prize");
			break;

			case 1: System.out.print("Prize is: Pen");
			break;
			
			case 2: System.out.print("Prize is: Umbrella");
			break;

			case 3: System.out.print("Prize is: Bag");
			break;

			case 4: System.out.print("Prize is: Travelling Chair");
			break;

			

		}
		if(membersNum > 5 ){
			System.out.print("Prize is: HeadPhone");
			}
	}	
}

	

	