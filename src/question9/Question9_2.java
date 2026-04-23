package question9;
import java.util.Scanner;
public class Question9_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sAge = new Scanner(System.in);
		
		String age =  sAge.nextLine();
		int ages = Integer.parseInt(age);
		if(ages>=30) {
			System.out.println("numberの値は30以上です\n 処理を終了します");
		}else {
			System.out.println("number の値は30未満です \n 処理を終了します");
		}
		

	}

}
