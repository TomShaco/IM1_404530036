import java.util.InputMismatchException;
import java.util.Scanner;

public class RectangleTester
{
	public static void main(String[ ] args){
		try{
		R.show();
		}
		catch( InputMismatchException ex){
			System.out.println("Please enter with number");
		
}			
		}
	}
class Rectangle{
	Scanner scanner =new Scanner(System.in);
	int num;	
	double w,h,X,Y;
   int i=1;
	void speak(){
		num=i;
		System.out.println("Please enter rectangle"+num+"'s width : ");
		w=scanner.nextInt();
		System.out.println("Please enter rectangle"+num+"'s height : ");
		h=scanner.nextInt();
		System.out.println("Please enter rectangle"+num+"'s X-axis : ");
		X=scanner.nextInt();
		System.out.println("Please enter rectangle"+num+"'s Y-axis : ");
		Y=scanner.nextInt();
		System.out.println("Rectangle"+num+"(width = "+w+"  height = "+h+"  X-axis = "+X+"  Y-axis = "+Y);
		System.out.println("Rectangle"+num+"'s area is "+w*h);
		System.out.println("Rectangle"+num+"'s perimeter is "+(w+h)*2);
		i++;
	}
}
class R{
	public static void show(){
		Rectangle R = new Rectangle();
		R.speak();
		R.speak();
	}
}
