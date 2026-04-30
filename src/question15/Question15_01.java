package question15;

public class Question15_01 {
	public void test() {
		System.out.println("テスト");
	}
	public void test(String a) {
		System.out.println(a);
	}
	public void test(int num) {
		System.out.println(num);
	}
	public static void main (String [] args) {
		
		Question15_01 src = new Question15_01();
          src.test();
          src.test("hello");
          src.test(20);
		
	}

}
