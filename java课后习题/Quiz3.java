import java.util.Scanner;
public class Quiz3{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int data=0;
		int sum=0;
		while(data!=-1){
			sum+=data;
		System.out.println("Enter an integer(the input ends if it is 0):");
		data=input.nextInt();
		}
		System.out.println("the sum is "+sum);
	}
}