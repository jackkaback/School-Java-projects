import javax.swing.JOptionPane;
public class Methods {
	public static void main(String[] args){

		public static boolean isNumeric(String checkString) {
			if (checkString == null) {
				return false;
			}
			for (int ii = 0; ii < checkString.length(); ii++) {
				if (checkString.charAt(ii) < '0' || checkString.charAt(ii) > '9') {
					return false;
				}
			}
			return true;
		
	}
}
}