import java.util.Scanner;
public class Test6{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length from the center to a vertex");
		double r=input.nextDouble();
		double s=2*r*(Math.sin(Math.PI/5));
		double area=(s*s*5)/(4*(Math.tan(Math.PI/5)));
		System.out.printf("The area of the pentagon is %4.2f",area);
	}
}

