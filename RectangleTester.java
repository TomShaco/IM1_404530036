import java.util.InputMismatchException;
import java.util.Scanner;

public class RectangleTester
{
	public static void main(String[ ] args){
		try{
		Rectangle.speak();
		Rectangle.speak();
		}
		catch( InputMismatchException ex){
			System.out.println("Please enter with number");
}			
		}
	}
class Rectangle{
    static int i=1;
	static void speak(){
	double w,h,X,Y;   
	    Scanner scanner =new Scanner(System.in);//有燈泡提示 但不影響結果
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
