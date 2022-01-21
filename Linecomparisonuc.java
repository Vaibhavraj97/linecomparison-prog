package ComparisonLine;
import java.lang.Math;
public class Linecomparisonuc {
	int x1=2;
	int x2=4;
	int y1=10;
	int y2=15;
	public void length() {
		double Length =Math.sqrt((x2-x1)^2+(y2-y1)^2);
		
		System.out.println(Length);
	}
	
	
	public static void main(String[] args)
	{
		Linecomparisonuc object = new Linecomparisonuc();
		object.length();
		
	}
	
	

}
