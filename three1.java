import java.util.Scanner;
public class three1{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a b c:");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		double d=b*b-4*a*c;
		double r1=(-b+Math.pow(d,0.5))/(2*a);
		double r2=(-b-Math.pow(d,0.5))/(2*a);
		double r3=(-b)/(2*a);
		if(d>0)
			System.out.println("The equation has two roots "+r1+"and "+ r2);
		if(d==0)
			System.out.println("The equation has one root "+r3);
		if(d<0)
			System.out.println("The equation has no real roots");
	}
}
