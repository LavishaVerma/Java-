import java.util.Scanner;
class Distance{
	public double x1;
	public double y1;
	public double x2;
	public double y2;
	public void in(){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter x1 = ");
	x1 = sc.nextInt();
	System.out.print("Enter y1 = ");
	y1 = sc.nextInt();
	System.out.print("Enter x2 = ");
	x2 = sc.nextInt();
	System.out.print("Enter y2 = ");
	y2 = sc.nextInt();
	}
	public void show(){
	System.out.println("1st points = "+x1+","+y1);
	System.out.println("2nd points = "+x2+","+y2);
	}
	public void ca(){
	System.out.print("Distance = "+Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
	}
}
class dist{
	public static void main(String args[]){
	System.out.println("lavisha 24csu314");
	Distance a = new Distance();
	a.in();
	a.show();
	a.ca();
	}
}