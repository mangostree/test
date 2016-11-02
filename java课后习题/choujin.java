import java.util.Scanner;
public class choujin{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the subtotal and a gratuity rate:");
		double subtotal=input.nextDouble();
		double rate=input.nextDouble();
		double qratuity=subtotal*(rate/100);
		double total=subtotal+qratuity;
		System.out.println("The gratuity is "+qratuity +"and total is "+total);
	}
}