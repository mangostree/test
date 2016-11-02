import java.util.Scanner;
public class Test7{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter point1(latitude and longitude) in degrees:");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		System.out.println("Enter point2(latitude and longitude) in degrees:");
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		final double r=6371.01;
		double x31=Math.sin(Math.toRadians(x1));
		double x3=Math.acos(Math.cos(x31));
		double x4=Math.toRadians(x2);
		double x5=Math.cos(Math.toRadians(x1));
		double x6=Math.cos(Math.toRadians(x2));
		double x7=Math.cos(Math.toRadians(y1=y2));
		double d=r*x3*x4*x5*x6*x7;
		System.out.println("The distance between the two points is : "+d+"km");
	}
}
