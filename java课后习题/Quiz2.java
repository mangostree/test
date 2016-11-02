import java.util.Scanner;
public class Quiz2{
	public static void main(String[] args){
		int number=(int)(Math.random()*101);
		Scanner input=new Scanner(System.in);
		System.out.println("Guess a magic number between 0 to 100:");
		int guess =-1;
		while(guess!=number){
			System.out.println("\nEnter your guess: ");
			guess=input.nextInt();
			if(guess==number)
				System.out.println("Yes,the number is"+guess);
			else if(guess>number)
				System.out.println("Your guess is too high");
			else
				System.out.println("Your guess is too low");
		}
	}
}