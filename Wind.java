import java.util.Scanner;
public class Wind{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit between -58and 41:");
		double tempreture=input.nextDouble();
		System.out.println("Enter the wind speed (>=2) in miles per hour :");
		int speed=input.nextInt();
		double chill=35.74+0.6215*tempreture-35.75*Math.pow(speed,0.16)+0.4275*Math.pow(speed,0.16);
		System.out.println("THe wind chill index is:"+chill);
	}
}

