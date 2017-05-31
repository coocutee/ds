package dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class DQueue {
	
	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<>();
		String arr[] = {"��","��","��","��"};
		
		//queue�� ���ִ��� ����ִ��� Ȯ��. �� ���� boolean.
		System.out.println("1. isEmpty() : "+ q.isEmpty());
		
		for (String string : arr) {
			//offer�� ���� �Ѷ��Ѷ� �о� �־��ش�.
			q.offer(string);
		}
		
		//offer�� ����� Ȯ��
		System.out.println("2. offer() : "+ q);
		
		//��ü�� ������. ���� ��ü�� ��¹�
		System.out.println("3. poll() : "  + q.poll());
		
		//����� ��ü��  �ҷ���
		System.out.println("4. element() : " + q.element());
		System.out.println("5. peek() : " + q.peek());
		
		
		while(!q.isEmpty()){
			System.out.println("6. poll() : "  + q.poll());
		}
		
		//queue�ȿ� �ƹ��͵� ������ null��ȯ
		System.out.println("7. peek() : " + q.peek());
		
		System.out.println(q.element());
	}

}
