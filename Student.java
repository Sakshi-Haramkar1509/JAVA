import javax.swing.*;

public class Student {
	public static void main(String args[]) {

		String Name;
		int Java, Dcc, Mic, Sen, Gad, Total, Roll_no;
		double Per;
		 
		Name = JOptionPane.showInputDialog(null, "Enter the your Name");
		Roll_no = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the Roll_No"));
		Java = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the marks of Java"));
		
		Dcc = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the marks of Dcc"));
		Mic = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the marks of Mic"));
		Sen = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the marks of Sen"));
		Gad = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the marks of Gad"));
		Total = Java + Dcc + Mic + Sen + Gad;
		Per = Total / 5;
		String Pass = "";
		String Fail = "";
		String First ="";
		String Second ="";
		String Condo ="";
		if (Java >= 40 && Dcc >= 40 && Mic >= 40 && Sen >= 40 && Gad >= 40) {
			JOptionPane.showMessageDialog(null, "Student is Pass");
			JOptionPane.showMessageDialog(null, "Total marks =" + Total);
			JOptionPane.showMessageDialog(null, "Percentage=" + Per);
			if (Per >= 75) {
				JOptionPane.showMessageDialog(null, "Student is pass in destingtion");
				Pass = Pass + "Student is pass in destingtion";
			} else if (Per >= 60) {
				JOptionPane.showMessageDialog(null, "Student is pass in first class");
				First = First + "Student is pass in first class";
			} else if (Per >= 50) {
				JOptionPane.showMessageDialog(null, "Student is pass in second class");
				Second = Second + "Student is pass in second class";
			}
		}

		else {

			if (Sen >= 35 && Sen <= 40 || Java >= 35 && Java <= 40|| Dcc >= 35 && Dcc <= 40 || Mic >= 35 && Mic <= 40 || Sen >= 35 && Sen <= 40 ||Gad >= 35 && Gad <= 40 ) {
				JOptionPane.showMessageDialog(null, " Student is pass with Condo");
				Condo = Condo + "Student is Pass with condo";
			}
			else
			JOptionPane.showMessageDialog(null, "Student is Fail");
			Fail = Fail + "Student is Fail";
		}
		JOptionPane.showMessageDialog(null,
				" Name = " + Name + " \n Roll_No = " + Roll_no + "\n Java Marks =" + Java + "\n Dcc Marks =" + Dcc
						+ "\n Mic Marks = " + Mic + "\n Sen Marks =" + Sen + "\n Gad Marks =" + Gad+"\n Total marks ="
						+ Total + "\n Percentage =" + Per + "\n"+Pass +"\n"+Condo +"\n" +First +"\n" +Second +"\n" +Fail);

						System.out.println(" Name = " + Name + " \n Roll_No = " + Roll_no + "\n Java Marks =" + Java + "\n Dcc Marks =" + Dcc
						+ "\n Mic Marks = " + Mic + "\n Sen Marks =" + Sen + "\n Gad Marks =" + Gad+"\n Total marks ="
						+ Total + "\n Percentage =" + Per + "\n"+Pass +"\n"+Condo );
	}
}