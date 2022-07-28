
import javax.swing.*;
public class Marks
{
	public static void main(String args[])
	{
	int Java , PWP , DS , T , Per;
	Java =Integer.parseInt(JOptionPane.showInputDialog(null, "Enter marks of Java"));
	PWP = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter marks of PWP"));
	DS = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter marks of DS"));
	if(Java >= 40 && PWP >= 40 && DS >=40)
	{
	T= Java + PWP + DS;
	Per = T/30;
	JOptionPane.showMessageDialog(null," Student is pass ");
	if(Per >= 75);
	{
	JOptionPane.showMessageDialog(null,"Student is passed in dist& per is "+Per);
	}
	}
	else
	{
	JOptionPane.showMessageDialog(null,"Student is Fail");
}
}
}		

