 package ch04;

public class BinaryTest {

	public static void main(String[] args) {

		int num = 10;
		//진수를 표현할 때 식별자를 사용해줘야 한다.
		int bNum = 0B1010; //2진수 10표현 
		int oNum = 012; // 8진수 10표
		int xNum = 0XA; //16진수 A는 10을 표현 
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);

	}

}
