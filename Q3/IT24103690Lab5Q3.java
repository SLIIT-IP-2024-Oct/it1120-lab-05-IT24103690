import java.util.Scanner;

public class IT24103690Lab5Q3{


	public static void main(String[] args){


		//constants

		final double ROOM_CHARGE = 48000.00;
		final double DISCOUNT3 = 0.9;
		final double DISCOUNT5 = 0.8;

		System.out.print("Enter Start Date (1-31): "+ " " );
		Scanner input1 = new Scanner(System.in);
		double Start_date = input1.nextDouble();

		System.out.print("Enter End Date (1-31):" + " " );
		Scanner input2 = new Scanner(System.in);
		double End_date = input2.nextDouble();

		double NumDays = End_date - Start_date;

		if(Start_date<1 || Start_date>31){

			System.out.println("Days should be between 1 and 31");
			}
		else if(End_date<1 || End_date>31){

			System.out.println("Days should be between 1 and 31");
			}

		else if(Start_date>End_date){
		System.out.println("start Date must be less than End Date");}

		else{
		
			System.out.println("Room Charge per day:"+ " " +" Rs." + " " +ROOM_CHARGE);
			 
			
		System.out.println("Number of days reserved: " + " " +NumDays);
		
		
	}
		Double Total = NumDays*ROOM_CHARGE;

		if(NumDays>=3 && NumDays<=4){ 
				
				Total = Total*DISCOUNT3;
			}

		else if(NumDays>=5){
				Total = Total*DISCOUNT5;
			}
		
		System.out.println("Total amount to be paid:" + " " + Total);
			
	
}	

} 
	
		