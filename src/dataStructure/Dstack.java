package dataStructure;

import java.util.Stack;

public class Dstack {
	
	public static void main(String[] args) {
		
		//숫자를 예로 드려고 Integer로 주긴 했지만 다른 제네릭타입을 줘도 된다@
		Stack<Integer> st = new Stack<Integer>();
		
		//이만큼을 한번에 stack에 집어 넣을거다.
		int num[] = {1,2,3,4,5};
		
		//boolean값. 비어있으면 true, 아니면 false 리턴!
		//일단 값 집어넣기 전에 확인해보면 true가 나온당 
		System.out.println("1. empty() : " + st.empty());
		
		//foreach로 stack에 아까 만들어놓은 num[]을 쑤셔넣어버렷..!
		for (int i : num) {
			st.push(i);
		}
		//push 후 stack 결과 확인
		System.out.println("2. push() : " + st);
		
		//stack의 최상위값 확인
		System.out.println("3. peek() : " + st.peek());
		
		//마지막 데이터 제거
		st.pop();
		System.out.println("4. pop() : " + st);
		
		//데이터 추가
		st.push(100);
		System.out.println("5. push() : " + st);
		
		//원하는 값이 들어있는지 확인. 없으면 -1, 있으면 1 리턴.
		System.out.println("6. search() : " + st.search(5) + 
				" , "+ st.search(100));
		
		while(!st.empty()){
			System.out.println(st.pop());
		}
		
		//stack 상태확인.
		System.out.println("최종상태 : " + st.empty());
	}

}
