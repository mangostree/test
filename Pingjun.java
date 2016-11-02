import java.util.Scanner;
public class Pingjun{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Please input three num:");
		double num1=input.nextDouble();
		double num2=input.nextDouble();
		double num3=input.nextDouble();
		double average=((num1+num2+num3)/3);
		System.out.println("The average of three num is:"+average);
	
	}
}