import java.util.*;
public class Lab404 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter student id: ");
		String stuId = input.nextLine();
		System.out.print("Enter subject id: ");
		String subjectId = input.nextLine();
		
		while (!isLength(stuId, subjectId)) {
			System.out.print("Enter student id: ");
			stuId = input.nextLine();
			System.out.print("Enter subject id: ");
			subjectId = input.nextLine();
		}
		
		boolean isITStudent = isITStudent(stuId);
		boolean isITSubject = isITSubject(subjectId);
		
		System.out.print("Student id: " + stuId);
		displayData(isITStudent, isITSubject);

	}
	
	public static boolean isLength(String studentId, String subjectId) {
		return studentId.length() == 10 && subjectId.length() == 7;
	}
	
	public static boolean isITStudent(String studentId) {
		return studentId.substring(0, 2).equals("21") && studentId.substring(3, 6).equals("311");
	}
	
	public static boolean isITSubject(String subjectId) {
		return subjectId.substring(0, 2).equals("21") && subjectId.charAt(4) == '1';
	}
	
	public static void displayData(boolean isITStudent, boolean isITSubject) {
		if(isITStudent) {
			System.out.print(" 1st year student in IT\n");
		}else {
			System.out.print(" is not 1st year student in IT\n");
		}
		
		if(isITSubject) {
			System.out.print("Enroll in courses for Year 1");
		} else {
			System.out.print("Not enroll in courses for Year 1");
		}
	}

}
