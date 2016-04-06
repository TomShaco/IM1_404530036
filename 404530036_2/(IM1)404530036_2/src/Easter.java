/*
 * [B]78
 * [TA's Advise]
 * 1.題目並沒有要求要寫Scanner, 請依照題目要求作撰寫, 若之後作業若想以Scanner進行撰寫請務必寫例外處理, 產生例外未處理將以程式錯誤進行扣分.
 * 2.實作的演算法錯誤(題目要求為Gauss, 此演算法為Anonymous Gregorian, 等級從B開始計算.
 * 3.常見的數學method可以記一下: Math.floor(), Math.abs(), Math.round(), Math.sqrt(), and so on..
 * 4.並未產生javadoc, 此部分扣5分.
 * 5.另外主程式應該是寫在Test檔案裡喔.
 * */

import java.util.Scanner;

public class Easter {
	public static void main(String arg[]) {
		int aYear;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the year that you want to know the Easter date : ");
		aYear = scanner.nextInt();
		System.out.println(Eastertest.CalculateEaster(aYear));

	}
}