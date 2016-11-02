import java.util.Scanner;
public class Test8{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter an ASCII code:");
		String x=input.nextLine();
		char ch=x.charAt(0);
		System.out.println("The unicode for the charater"+x+"is"+(int)ch);
	}
}