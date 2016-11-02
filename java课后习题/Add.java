import java.util.Scanner;
public class Add{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number 0 and 1000:");
		int num=input.nextInt();
		int gewei,shiwei,baiwei,jishi;
		if(num>99){
			gewei=num%10;
			jishi=num/10;
			shiwei=jishi%10;
			baiwei=jishi/10;
		}
		else{
            baiwei=0;
			gewei=num%10;
			shiwei=num/10;
		}
		 int sum=gewei+shiwei+baiwei;
		System.out.println("The sum of the digits is "+sum);
	}
}