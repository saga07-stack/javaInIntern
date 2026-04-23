package question9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Question09_08 {

	public static void main(String[] args) throws IOException {

     BufferedReader str = new BufferedReader (new InputStreamReader (System.in));
	 
     System.out.println("整数を入力してください");
     String num = str.readLine();
       int num1 = Integer.parseInt(num);
       
       
     if(num1 % 2 == 0) {
    	 System.out.println(num1+"\n"+num1+"は偶数");
     }else {
    	 System.out.println(num1+"\n"+num1+"奇数です");
     }
     
     
	}

}
