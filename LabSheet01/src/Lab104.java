import javax.swing.*;
public class Lab104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String name;
        double hourlyWage = 7.5;
        double taxRate = 0.15;

        JOptionPane.showMessageDialog(null,"Welcome to the payroll application");
        name =  JOptionPane.showInputDialog(null,"Enter employee name","Input",JOptionPane.QUESTION_MESSAGE);
        String strTotalHours =  JOptionPane.showInputDialog(null,"Enter total hours for this employee.","Input",JOptionPane.QUESTION_MESSAGE);
        double totalHours = Double.parseDouble(strTotalHours);

        double grossEarning = totalHours*hourlyWage;
        double tax = grossEarning*taxRate;
        double netEarnings = grossEarning-tax;

        String message = String.format("Employee name: %s \nHour worked: %.1f\nHourly wage: $ %.1f\nGross earnings: $ %.1f\nTax rate: %.2f\nTax: $ %.1f\nNet earnings: $ %.1f",name,totalHours,hourlyWage,grossEarning,taxRate,tax,netEarnings);
        JOptionPane.showMessageDialog(null, message);
	}

}
