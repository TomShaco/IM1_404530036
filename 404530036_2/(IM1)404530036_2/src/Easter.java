/*
 * [B]78
 * [TA's Advise]
 * 1.�D�بèS���n�D�n�gScanner, �Ш̷��D�حn�D�@���g, �Y����@�~�Y�Q�HScanner�i�漶�g�аȥ��g�ҥ~�B�z, ���ͨҥ~���B�z�N�H�{�����~�i�榩��.
 * 2.��@���t��k���~(�D�حn�D��Gauss, ���t��k��Anonymous Gregorian, ���űqB�}�l�p��.
 * 3.�`�����ƾ�method�i�H�O�@�U: Math.floor(), Math.abs(), Math.round(), Math.sqrt(), and so on..
 * 4.�å�����javadoc, ��������5��.
 * 5.�t�~�D�{�����ӬO�g�bTest�ɮ׸̳�.
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