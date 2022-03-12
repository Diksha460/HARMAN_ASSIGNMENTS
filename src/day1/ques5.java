package day1;

/*enter day: 31 
* enter month: 12 
* enter year: 2022
* 
* You have entered date: 31/12/2022
* Next date: 1/1/2023
*/
import java.util.Scanner;

public class ques5 {


public static void main(String[] args) {
		
		int day, month, year;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("PE day:-");
			day = scanner.nextInt();

			System.out.println("PE month:-");
			month = scanner.nextInt();

			System.out.println("PE year:-");
			year = scanner.nextInt();
		}

		System.out.println("current date: " + day + "/" + month + "/" + year);

	
		int noOfDaysInMonth[]={-1, 31,28,31,30,31,30,31,31,30,31,30,31};

		  if(isLeapYear(year)){
			noOfDaysInMonth[2]=29;//hey no of days in feb is 29 if it is a leap year
		  }
		  
		  day=day+1; 

		  if(day > noOfDaysInMonth[month]){
			day=1;
			month++;
			if(month > 12){
				month=1;
				year++;
			}

		  }  
		  System.out.println("next date: " + day + "/" + month + "/" + year);  
	}

	public static boolean isLeapYear(int year) {
		if ((year % 400 == 0 || year % 100 != 0) && (year % 4 == 0))
			return true;
		else
			return false;
	}
}
