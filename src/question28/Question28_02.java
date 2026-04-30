package question28;

public class Question28_02 {

	public static void main(String[] args) {


		int num = 30;
		int message_no =0;
		String str[] = { "30以上５０未満","25以上３０未満"};
		
		if(message_no == 0) {
			if(num >= 30 && num<50) {
				System.out.println(str[message_no]);
			}else if (message_no == 1) {
				if(num >= 25 && num < 30) {
					System.out.println(str[message_no]);
							
				}
			}
			System.out.println("じゃ");
		}
	}

}
