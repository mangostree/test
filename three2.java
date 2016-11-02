import java.util.Scanner;
public class three2{
	public static void main(String[] args){
		int random=(int)(Math.random()*12+1);
		switch(random){
			case 1  : System.out.println("This month is yiyue");
			case 2  : System.out.println("This month is eryue");
			case 3  : System.out.println("This month is sanyue");
			case 4  : System.out.println("This month is siyue");
			case 5  : System.out.println("This month is wuyue");
			case 6  : System.out.println("This month is liuyue");
            case 7  : System.out.println("This month is qiyue");
            case 8  : System.out.println("This month is bayue");
            case 9  : System.out.println("This month is jiuyue");
            case 10 : System.out.println("This month is shiyue");
            case 11 : System.out.println("This month is shiyiyue");
            case 12 : System.out.println("This month is shieryue");
			default:break;
		}
	}
}