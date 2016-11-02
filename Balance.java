import java.util.*;
public class Balance{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter investment amount:");
		double amount=input.nextDouble();
		System.out.println("Enter annual interest rate in percentag: ");
		double rate=input.nextDouble();
		System.out.println("Enter number of year:");
		double year=input.nextDouble();
		double year1=year*12;
		double rate2=1+rate;
		double rate1=Math.pow(rate2,year1);
		double value=amount*rate1;
			System.out.println("Accumulated value is "+value);
		}
	}

