import java.util.Scanner;
public class Areayuan{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the radius and length of a mcylinder:");
		double radius=input.nextDouble();
		double length=input.nextDouble();
		final double p=3.1415;
		double area=radius*radius*p;
		double volume=area*length;
		System.out.println("The area is "+area);
		System.out.println("The volume is "+volume);
	}
}