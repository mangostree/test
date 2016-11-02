import java.util.Scanner;
public class year{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number of munites:");
		int num=input.nextInt();
		int year=num/(365*24*60);
		int forday=num%(365*24*60);
		int day=forday/(24*60);
		System.out.println(year);
		System.out.println(day);
		System.out.println(num +"minutes is approximately "+year +"years and "+day +"days");
	}
}