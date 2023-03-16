package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


//stack = push 삽입
//             pop   꺼낼때
//Queue = offer 삽입
//            = pool 꺼낼때

// stack = 수식계산, 수식 괄호검사, 워드 undo / redo, 웹브라우저 뒤로, 앞으로
//               시간 순서에 따라 자료가 쌓여서 가장 마지막에 삽입된 자료가 가장 먼저 삭제된다는 구조적 특징을 가지게 된다.


//queue = 최근 사용문서 ,인쇄작업 대기목록, 버퍼
//              한쪽 끝에서 삽입 작업이, 다른 쪽 끝에서 삭제 작업이 양쪽으로 이루어진다.

//스택. 큐 용어 외우기 ★★★★★★★★★★★★

public class ListEx4 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		Queue<String> queue = new LinkedList<>(); // new Queue 존재하지않는다.
		
		//스택삽입
		stack.push("0");
		stack.push("1");
		stack.push("2");
		stack.push("3");
		
		//큐 삽입
		queue.offer("0");
		queue.offer("1");
		queue.offer("2");
		queue.offer("3");
		
		System.out.println("======== Stack =========");
		while (!stack.isEmpty()) { //비어있지않으면 whi 컨트롤스페이스바 3번째
			System.out.println(stack.pop());
			
		}

		System.out.println("========Queue =========");
		while (!queue.isEmpty()) { //비어있지않으면 whi 컨트롤스페이스바 3번째
			System.out.println(queue.poll());
			
		}

		
		
		
	}

}
