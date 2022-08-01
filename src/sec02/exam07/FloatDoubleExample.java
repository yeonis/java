package sec02.exam07;

public class FloatDoubleExample {

	public static void main(String[] args) {
		//실수값 저장
		//float var1 = 3.14;   //컴파일 에러 (Type mismatch)
		float var2 = 3.14f;
		double var3 = 3.14;
		
		//정밀도 테스트
		float var4 = 0.12345123672178323f;
		double var5 = 0.123457839324789324;		
		
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		//e 사용하기
		double var6 = 3e6;
		float var7 = 3e6f;
		double var8 = 2e-3;
		System.out.println("var6: " + var6);
		System.out.println("var:7 " + var7);
		System.out.println("var:8 " + var8);
		

	}

}
