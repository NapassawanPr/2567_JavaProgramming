import java.io.IOException;
import java.util.*;
public class EmployeeInfo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String choose;
		
		
		System.out.print("Insert or Search Data ? : " );
		choose = input.nextLine().toLowerCase();
		
		while(!choose.equals("insert") && !choose.equals("search")) {
			System.out.print("Please text insert or search data?:");
			choose = input.next().toLowerCase();
		} 
		
		SaveAndOpen objFile = new SaveAndOpen();
		if(choose.equals("insert")) {
			objFile.insert();			
		}else if (choose.equals("search")){ 
		
			System.out.print("\nEnter dept : "); 
			String dept = input.next();
			objFile.setDept(dept);
			objFile.searchData();
		}			

	}

}

