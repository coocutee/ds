package dataStructure;

import java.util.Stack;

public class Dstack {
	
	public static void main(String[] args) {
		
		//���ڸ� ���� ����� Integer�� �ֱ� ������ �ٸ� ���׸�Ÿ���� �൵ �ȴ�@
		Stack<Integer> st = new Stack<Integer>();
		
		//�̸�ŭ�� �ѹ��� stack�� ���� �����Ŵ�.
		int num[] = {1,2,3,4,5};
		
		//boolean��. ��������� true, �ƴϸ� false ����!
		//�ϴ� �� ����ֱ� ���� Ȯ���غ��� true�� ���´� 
		System.out.println("1. empty() : " + st.empty());
		
		//foreach�� stack�� �Ʊ� �������� num[]�� ���ų־����..!
		for (int i : num) {
			st.push(i);
		}
		//push �� stack ��� Ȯ��
		System.out.println("2. push() : " + st);
		
		//stack�� �ֻ����� Ȯ��
		System.out.println("3. peek() : " + st.peek());
		
		//������ ������ ����
		st.pop();
		System.out.println("4. pop() : " + st);
		
		//������ �߰�
		st.push(100);
		System.out.println("5. push() : " + st);
		
		//���ϴ� ���� ����ִ��� Ȯ��. ������ -1, ������ 1 ����.
		System.out.println("6. search() : " + st.search(5) + 
				" , "+ st.search(100));
		
		while(!st.empty()){
			System.out.println(st.pop());
		}
		
		//stack ����Ȯ��.
		System.out.println("�������� : " + st.empty());
	}

}
