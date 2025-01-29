import java.util.*;
public class TestStudent {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("How many students in classroom: ");
		int numberOfStudents = scan.nextInt();
		//consume new line character
		scan.nextLine();
		
		//Create an array of Student objects
		Student[] students = new Student[numberOfStudents];
		
		
		//Input information for each student
		for(int i = 0; i< numberOfStudents;i++) {
			//2. Create a new student object 
			students[i] = new Student();
			System.out.println("\nINPUT INFORMATION OF STUDENT" + (i+1));
			Line();
			//Input student's name
			System.out.print("Input student name: ");
			//String stdName = scan.nextLine();
			//students[i].setName(stdName);
			students[i].setName(scan.nextLine());
			
			System.out.print("Input student score : ");
	        int score = scan.nextInt();
	        scan.nextLine();
	        students[i].setScore(score);
	        while(!students[i].checkScore()) {
	             System.out.print("Input score, again : ");
	             students[i].setScore(scan.nextInt());        	
	             scan.nextLine();
	         }
	        
	       
		 }//end of for
				
		//Display the list of students who passed 
		System.out.print("\nLIST OF PASS STUDENTS (>=50): ");
		System.out.println();
		Line();
		for(Student student : students) {
			if(student.isPass()) {
				System.out.println(">> " + student.getName()+ " (" + student.getScore() + ") " + " get grade " + findGrade(student.getScore()));
			}
		}
		
		scan.close();
	}
	
	public static void Line() {
		for(int i =1 ; i<=60; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	public static String findGrade(int score) {
		if(score>=80) {
			return "A";
		} else if(score>=76) {
			return "B+";
		}else if(score>=70) {
			return "B";
		}else if(score>=66) {
			return "C+";
		}else if(score>=60) {
			return "C";
		}else if(score>=56) {
			return "D+";
		} else if(score>=50) {
			return "D";
		}else {
			return "F";
		}
	}

}
