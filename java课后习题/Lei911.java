public class Lei911{
	public static void main(String[] args){
		CircleWIthPrivateDataFields[] circleArray;
		circleArray=createCircleArray();
		printCircleArray(circleArray);
	}
	public static CircleWIthPrivateDataFields[] createCircleArray(){
		CircleWIthPrivateDataFields[] circleArray=new CircleWIthPrivateDataFields[5];
		for(int i=0;i<circleArray.length;i++)
			circleArray[i]=new CircleWIthPrivateDataFields(Math.random() *100);
		reurn circleArray;
	}
	public sattic void printCircleArray(CircleWIthPrivateDataFields[] circleArray){
		System.out.printf("%-30s-15s\n","Radius","Area");
		for(int i=0;i<circleArray.length;i++)
			System.out.printf("%-30f%-15\n",circleArray[i].getRadius(),circleArray[i].getArea());
		System.out.println("-------------------------------------");
		System.out.println("%-30s%-15f\n","The total area of circle is",sum(circleArray));
	}
	pubic static double sum(CircleWIthPrivateDataFields[] circleArray){
		double sum=0;
		for(int i=0;i<circleArray.length;i++)
			sum+=circleArray[i].getArea();
		return sum;
	}
}