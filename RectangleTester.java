import java.util.InputMismatchException;
import java.util.Scanner;

class Rectangle {
	// height, width, x, y?
	// 建構子
	// method?
	// overridding public String toString(){}

}

public class RectangleTester {
	public static void main(String[] args) {
		try {
			// build object
			double w, h, X, Y;
			Scanner scanner = new Scanner(System.in);
			for (int i = 0; i < 2; i++) {

				System.out.println("Please enter rectangle" + i + "'s width : ");
				w = scanner.nextInt();
				System.out.println("Please enter rectangle" + i + "'s height : ");
				h = scanner.nextInt();
				System.out.println("Please enter rectangle" + i + "'s X-axis : ");
				X = scanner.nextInt();
				System.out.println("Please enter rectangle" + i + "'s Y-axis : ");
				Y = scanner.nextInt();

				Rectangle r1 = new Rectangle(w, h, X, Y);
				System.out.println(r1);
				
				//function call
				System.out.println("Area=");
				System.out.println("Perimeter=");
			}

		} catch (InputMismatchException ex) {
			System.out.println("Please enter with number");
		}
	}
}
