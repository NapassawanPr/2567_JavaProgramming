import javax.swing.*;
public class Lab203 {

	public static void main(String[] args) {
		   double weight = Double.parseDouble(JOptionPane.showInputDialog(null, "Input weight:"));
		   double height = Double.parseDouble(JOptionPane.showInputDialog(null, "Input height:"));

		   double heightInMeter = height / 100;
		   double bmi = weight / (heightInMeter * heightInMeter);
		   String category;
		            if (bmi < 18.5) {
		               category = "Underweight";
		            } else if (bmi >= 18.5 && bmi <= 24.9) {
		               category = "Normal-weight";
		            } else if (bmi >= 25.0 && bmi <= 29.9) {
		               category = "Over-weight";
		            } else {
		               category = "Obesity";
		            }
		   String frmBmi = String.format("%.1f",bmi);
		   JOptionPane.showMessageDialog(null, "BML = " + frmBmi + "\nYou're " + category,"BMI",JOptionPane.WARNING_MESSAGE); 

	}

}
