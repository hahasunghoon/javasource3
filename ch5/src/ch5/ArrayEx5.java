package ch5;

import java.util.Arrays;

public class ArrayEx5 {

	public static void main(String[] args) {
	   int[] numArr = {0,1,2,3,4,5,6,7,8,9};
	   System.out.println(Arrays.toString(numArr));
	   //100번 돌리기
	   for (int i = 0; i < 100; i++) {
		   //0~9사이의 임의의 값 구하기
		  int n = (int)(Math.random()*10);
		   
		   //구한 자리와 0 요소랑 값을 교환하기
		  int temp = numArr[0]; //numArr[0] 의 값을 tmep 변수에 담기(오른쪽에있는걸 왼쪽에 담기)
		  numArr[0] = numArr[n];//n번에있는걸 0번에 대입한다는의미
		  numArr[n] = temp; // 7번쨰에있는게 0번으로 바뀜
		
	}
	   System.out.println(Arrays.toString(numArr));
	   
	   }
	}


