import java.util.InputMismatchException;
import java.util.Scanner;

public class RectangleTester
{
	public static void main(String[ ] args){
		try{
		R1.show();
		R2.show();
		}
		catch( InputMismatchException ex){
			System.out.println("Please enter with number");
}			
		}
	}
class Rectangle{
	Scanner scanner =new Scanner(System.in);
	int width,height,area,perimeter,num,X,Y;

	void speak1(){
		System.out.println("Please enter rectangle"+num+"'s width : ");
		width=scanner.nextInt();
		System.out.println("Please enter rectangle"+num+"'s height : ");
		height=scanner.nextInt();
		System.out.println("Please enter rectangle"+num+"'s X-axis : ");
		X=scanner.nextInt();
		System.out.println("Please enter rectangle"+num+"'s Y-axis : ");
		Y=scanner.nextInt();
	}
	void speak2( ){
		area=width*height;
		perimeter=(width+height)*2;
		System.out.println("Rectangle"+num+"'s area is "+area);
		System.out.println("Rectangle"+num+"'s perimeter is "+perimeter);
	}
}
class R1{
	public static void show(){
		Rectangle R1 = new Rectangle();
		R1.num = 1;
		R1.speak1();
		R1.speak2();
	}
}
class R2{
	public static void show(){
		Rectangle R2 = new Rectangle();
		R2.num = 2;
		R2.speak1();
		R2.speak2();
	}
}