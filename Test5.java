import java.util.*;
public class Test5{
	public static void main(String[] args){	
		String s1="Welcome";
		String s2="welcome";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.startsWith("AAA"));
		System.out.println(s1.endsWith("AAA"));
		System.out.println(s1.length());
		System.out.println(s1.charAt(0));
		String s3=s1.concat(s2);
		System.out.println(s3);
	    String s11=s1.substring(1);
	    System.out.println(s11);
	    String s14=s1.substring(1,4);
	    System.out.println(s14);
	    String s4=s1.toLowerCase();
	    System.out.println(s4);
	    String s5=s1.toUpperCase();
	    System.out.println(s5);
	    String s6=s1.trim();
	    System.out.println(s6);
	    System.out.println(s1.indexOf('e'));
	    System.out.println(s1.lastIndexOf("abc"));
	}
}

