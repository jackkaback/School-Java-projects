import javax.swing.JOptionPane;


public class Loan2 {
		public static void main(String[] args) {
		String Interestrate = JOptionPane.showInputDialog(null, "Enter Annual Interest rate" , "Input interest" , JOptionPane.QUESTION_MESSAGE);
		double annualInterestrate = Double.parseDouble(Interestrate);
}}
