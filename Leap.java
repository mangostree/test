import java.util.Scanner;
public class Leap{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter an year:");
		int year=input.nextInt();
		boolean isLeapyear=(year%4==0&&year%100!=0)||(year%400==0);
System.out.println(year + "is a leap year?"+ isLeapyear);
}
}
