import java.util.InputMismatchException;
import java.util.Scanner;

class Rectangle {

	double W, H, X, Y;

	Rectangle() {
		this(0, 0, 0, 0);
	}

	Rectangle(double w, double h, double x, double y) {
		H = h;
		W = w;
		X = x;
		Y = y;
	}

	public double getHeight() {
		return H;
	}

	public double getWidth() {
		return W;
	}

	public double getXaxis() {
		return X;
	}

	public double getYaxis() {
		return Y;
	}

	public String toString() {

		return "java.Rectangle = " + "[ weight = " + W + " , Height = " + H + " , X-axis = " + X + " , Y-axis = " + Y
				+ " ]";
	}

}

public class RectangleTester {
	public static void main(String[] args) {
		try {
			double w, h, x, y;
			Scanner scanner = new Scanner(System.in);
			for (int i = 1; i < 3; i++) {

				System.out.println("Please enter rectangle" + i + "'s width : ");
				w = scanner.nextInt();
				System.out.println("Please enter rectangle" + i + "'s height : ");
				h = scanner.nextInt();
				System.out.println("Please enter rectangle" + i + "'s X-axis : ");
				x = scanner.nextInt();
				System.out.println("Please enter rectangle" + i + "'s Y-axis : ");
				y = scanner.nextInt();

				Rectangle r = new Rectangle(w, h, x, y);
				System.out.println(r);
				System.out.println("Area = " + r.getHeight() * r.getWidth());
				System.out.println("Perimeter = " + (r.getHeight() + r.getWidth()) * 2);
			}

		} catch (InputMismatchException ex) {
			System.out.println("Please enter with number");
		}
	}
}
