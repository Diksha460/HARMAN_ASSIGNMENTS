package day1;

public class ques1 {
	/*
	 program to display the first 20 Fibonacci numbers F(n), 
	 * where F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1 and also compute their average.
*/
        public static void main(String[] args) {
			int a=1, b=1, range, c, sum=0;
			range=1;
			   while( range<=20 )
			   {
			     System.out.print(a +" ");
			      sum =sum+ a;
			      c = a + b;
			      a = b;
			      b = c;
			      range++;
			   }
			   
			System.out.println("\nsum of 20 terms: "+ sum/20);
		}

	}


