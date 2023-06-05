package ch04_controll;

/*
 * 중첩 반복문 : 반복문 내부에 반복문이 존재.
 *           구구단 가로 출력하기 
 * 
 *  2*2=4  3*2=6  ....    9*2=18
 *  2*3=6  3*3=9 
 */

public class ExCont03 {

	public static void main(String[] args) {
		
		for (int i = 2; i <=9; i++) {
			//System.out.println(i);
			for (int j = 2; j <=9; j++) {
				System.out.print(j+"*"+i+"="+(j*i)+ "\t");
			}
			System.out.println();
		}

	}

}
