package question9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question9_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader (System.in)); 
		  String age = reader.readLine();
		  int score = Integer.parseInt(age);
		  if(score>=100) {
			  System.out.println("正しくありません");
			
		  }
		  else if(score>=80) {
			   System.out.println("テスト点数は優秀です \n お疲れ様です。");
			   
		   }else if( score>=50) {
			   System.out.println("テスト点数は平均的です　\n お疲れ様です。");
		   }
		   else if (score>=30) {
			   System.out.println("テスト点数は及第点です　\n お疲れ様です。");
		   }else {
			   System.out.println("赤点のため追加試が必要です　\n お疲れ様です。");
		   }
		  
		  

	}

}
