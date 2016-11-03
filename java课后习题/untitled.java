public class Lei910{
	public static void main(String[] args){
		CircleWithPrivateFields myCircle=new CircleWithPrivateFields(1);
		int n=5;
		PrintAreas(myCircle,n);
	}
	public static void printAreas(CircleWithPrivateFields c,int times){
		System.out.println("Radius \t\tArea");
		while(times>=1){
			System.out.println(c.getRadius()+"\t\t"+c.getArea());
			c.setRadius(c.getradius()+1);
			times--;
		}

	}
}