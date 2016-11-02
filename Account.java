import java.util.Scanner;
public class Account{
	public static void main(String[] args){
	    Scanner input=new Scanner(System.in);
	    System.out.println("Enter the monthly saving amount and nianlilv and month:");
	    double value=input.nextDouble();
	    double ninalilv=input.nextDouble();
	    double month=input.nextDouble();
	    double yue=nialilv/12;
	    for(i=1;i<=month;i++)
	    	double value+=value*(1+yue);
	    System.out.println(value);
	}
}
