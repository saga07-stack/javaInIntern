package question9;
import java.util.Scanner;
public class Question9_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner num = new Scanner (System.in);
		
	      String number = num.nextLine();
	      int number1 = Integer.parseInt(number);
		if(number1>=10) {
			System.out.println("numberの値は10以上です\n 処理を終了します");
		}else {
			System.out.println("処理を終了します");
		}
		
		

	}

}
