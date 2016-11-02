import java.util.Scanner;
public class Display{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Please input the time:");
		int seconds=input.nextInt();
		int minutes=seconds/60;
		int reseconds=seconds%60;
		System.out.println(seconds+"seconds is"+minutes+"munites and"+reseconds+"seconds");
	}
}