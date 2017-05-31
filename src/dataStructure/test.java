package dataStructure;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("계산할 연도를 입력해주세여. 그만하시려면  1 을 눌러주세여.");

		while (true) {

			int user = sc.nextInt();

			if (user == 1) {
				System.out.println("종료");
				break;
			} else if (user % 4 != 0) {
				System.out.println("평년");
			} else if (user % 100 == 0) {
				System.out.println("평년");
			} else if (user % 400 == 0) {
				System.out.println("윤년");
			} else if (user % 4 == 0) {
				System.out.println("윤년");

			}

		}

	}

}
