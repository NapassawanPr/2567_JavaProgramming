import javax.swing.*;
public class Lab103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time =  Integer.parseInt(JOptionPane.showInputDialog("Input Time Parking (minute) : "));
		
		int hour = time/60;
		int minute = time%60;
		double total = (hour*50)+(minute*0.25);
		
		String message =  String.format("You parking %d Hour %d Minute.\n Amount to be paid is %,.2f baht.",hour,minute,total);
		JOptionPane.showMessageDialog(null,message);
		

	}

}
