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
	double w,h,X,Y;
        int i=1;
	void speak(){
		System.out.println("Please enter rectangle"+i+"'s width : ");
		w=scanner.nextInt();
		System.out.println("Please enter rectangle"+i+"'s height : ");
		h=scanner.nextInt();
		System.out.println("Please enter rectangle"+i+"'s X-axis : ");
		X=scanner.nextInt();
		System.out.println("Please enter rectangle"+i+"'s Y-axis : ");
		Y=scanner.nextInt();
		System.out.println("Rectangle"+i+"(width = "+w+"  height = "+h+"  X-axis = "+X+"  Y-axis = "+Y);
		System.out.println("Rectangle"+i+"'s area is "+w*h);
		System.out.println("Rectangle"+i+"'s perimeter is "+(w+h)*2);
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
