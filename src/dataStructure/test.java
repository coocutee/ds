package dataStructure;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("����� ������ �Է����ּ���. �׸��Ͻ÷���  1 �� �����ּ���.");

		while (true) {

			int user = sc.nextInt();

			if (user == 1) {
				System.out.println("����");
				break;
			} else if (user % 4 != 0) {
				System.out.println("���");
			} else if (user % 100 == 0) {
				System.out.println("���");
			} else if (user % 400 == 0) {
				System.out.println("����");
			} else if (user % 4 == 0) {
				System.out.println("����");

			}

		}

	}

}
