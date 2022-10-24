package tester;
import com.cdac.geometry.Point2D;
import java.util.Scanner;

public class TestPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Points you want to Plot:");
		int pointCount=sc.nextInt();
		Point2D[] p=new Point2D[pointCount];
		for(int i=0;i<pointCount;i++) {
		System.out.println("Enter the X and Y coardinate of the Points:");
		p[i]=new Point2D(sc.nextInt(),sc.nextInt());
		}
		for(Point2D pt:p)
		System.out.println(pt.show());
		System.out.println("Enter two indexes(between 1 to "+pointCount+") to get distance between the points they have :");
		int fi=sc.nextInt();
		int si=sc.nextInt();
		if(p[fi-1].isEqual(p[si-1])) {
			System.out.println("These Points are same");
		}
		else {
		double d=p[fi-1].calculateDistance(p[si-1]);
		System.out.println("Distance between these two Points is :"+d);
		}
		
		sc.close();
	}

}
