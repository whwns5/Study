package day04;
/*
 * 2016_11_08
 */
public class Day04_02_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;   // i = 1 , j = x
		int j = i++; // i = 2 , j = 1  ->  후위형 증감 연산자 이기 때문에 j에 1이 먼저 대입되고 i가 증간한다.
		
		
		if(i > ++j && ++i == j){  // i > ++j  ->  2 > 2  ->  비교 연산자보다 전위형 증감 연산자가 우선순위가 높기때문에 먼저 증감된 후 비교한다.
			i += j;				  // 논리 연산자의 경우 목적상 모두 참이 되어야 하므라 처음 비교문에서 거짓이 나와 두번째 비교문을 진행하지 않는다.
		}						  // i = 2 , j = 2;
		
		if(i > ++j & ++i == j){   // i > ++j  ->  2 > 2  ->  비교 연산자보다 전위형 증감 연산자가 우선순위가 높기때문에 먼저 증감된후 비교한다.
			i += j;				  // 비트 연산자의 경우 목적상 두 2진수 값을 비교하기 때문에 처음 비교문을 진행하여 false가 나오더라도 두번째 비교문을 실행하게 된다.
		}						  // 관계 연산자보다 전위형 증감 연산자가 우선순위가 높기 때문에 먼저 증감된 후 비교한다.
								  // i = 3 , j = 3;
		System.out.println("i = " + i + " / j = " + j);
	}

}
