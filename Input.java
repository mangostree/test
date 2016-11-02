import java.util.Scanner;
public class Input{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("Please input the radius:");
	double radius=input.nextDouble();
	final double PI=3.14159;
	double area=PI*radius*radius;
    System.out.println("the area is:"+area);
	}
}