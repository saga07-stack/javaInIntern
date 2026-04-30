package question18;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Question18_1 {
	public static void main (String[] args) {
		System.out.println("今日の日付を表示します");
		 LocalDateTime now = LocalDateTime.now();
		 DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		System.out.println(now.format(fmt));
		
	}

}
