import javax.swing.*;
public class Lab501_1 {

	public static void main(String[] args) {
		String[] deptName = {"Accounting","HR","Sales","Innovation"};		
		String dept = JOptionPane.showInputDialog("Enter a department name").toLowerCase();	
		boolean wasFound = false;
		
		for(int i = 0; i < deptName.length; i++) {
			if(dept.equalsIgnoreCase(deptName[i])) {
				wasFound = true;				
			}
		}
		
		if(wasFound) {
			JOptionPane.showMessageDialog(null, dept + " was found in the list");			
		}else {
			JOptionPane.showMessageDialog(null, dept + " was not found in the list");
		}
		
	}

}
