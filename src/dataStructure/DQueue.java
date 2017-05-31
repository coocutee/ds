package dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class DQueue {
	
	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<>();
		String arr[] = {"ㄱ","ㄴ","ㄷ","ㄹ"};
		
		//queue가 차있는지 비어있는지 확인. 얘 역시 boolean.
		System.out.println("1. isEmpty() : "+ q.isEmpty());
		
		for (String string : arr) {
			//offer로 값을 한땀한땀 밀어 넣어준다.
			q.offer(string);
		}
		
		//offer후 결과값 확인
		System.out.println("2. offer() : "+ q);
		
		//객체를 꺼낸당. 꺼낸 객체는 쎄굿바
		System.out.println("3. poll() : "  + q.poll());
		
		//저장된 객체를  불러옴
		System.out.println("4. element() : " + q.element());
		System.out.println("5. peek() : " + q.peek());
		
		
		while(!q.isEmpty()){
			System.out.println("6. poll() : "  + q.poll());
		}
		
		//queue안에 아무것도 없으면 null반환
		System.out.println("7. peek() : " + q.peek());
		
		System.out.println(q.element());
	}

}
