import java.util.*;
public class Lab301 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		// กำหนดตัวแปรไว้รมข้อความเข้าด้วยกัน
		String textConcate = "";
		//กำหนดตัวแปร ไว้รับข้อความทาง console
		String word;
		 while(true) {
			 System.out.print("Enter word: ");
			 word = kb.next();
			 //ตรวจสอบเงื่อนไขเพื่อให้หยุดการรับข้อความ
			 if(word.equalsIgnoreCase("stop")) {
				 System.out.println("Program Terminate");
				 break;
			 }
			 //การรวมข้อความเข้าด้วยกัน
			 textConcate += word + " ";
			 
		 }// end of while
		System.out.println(textConcate.toUpperCase());
		
		kb.close();

	}

}
