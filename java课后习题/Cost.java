import java.util.*;
public class Cost{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the driveing distance:");
		double distance=input.nextDouble();
		System.out.println("Enter niles per gallon:");-
		System.out.println("Enter price per gallon:");
		double per=input.nextDouble();
		double cost=distance/miles*per;
		System.out.println("The cost of driving is:"+cost);
	}
}

