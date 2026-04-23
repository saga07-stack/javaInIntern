package question9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Question09_07 {

	public static void main(String[] args) throws IOException {

		BufferedReader str = new BufferedReader ( new
  
				          InputStreamReader (System.in) );
		
		   System.out.println("1以上の数値を入力してください");

		   String str1 = str.readLine();
	       int num = Integer.parseInt(str1);
	       
	       boolean errFlag = false;
	       
	       if(num >1) {
	    	   errFlag = true;
	       }
	       
	       if(errFlag != false) {
	    	   System.out.println("正常な入力です");
	       }
	}

}
