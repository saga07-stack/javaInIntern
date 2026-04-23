package Question8;

public class Question08_02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String [] name = {"ichiro","jiro","saburo","shiro","goro"};
		int [] age = {88,62,54,76,45};
		int sum = 0 ;
		for (int i = 0; i<age.length; i++) {
			sum += age[i];
			
		}
		System.out.println("全員のテストの合計は"+sum+"点です");

	}

}
