import javax.swing.*;

class Marklist {
    public static void main(String args[]) {
        int  Dcc, Mic, Java, Sen, Gad, Per, T;
        JOptionPane.showInputDialog(null, "Enter the Name");
        
        Dcc = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the marks of Dcc"));
        Mic = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the marks of Mic"));
        Java = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the marks of Java"));
        Sen = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the marks  of Sen"));
        Gad = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the marks of Gad"));
        T = Dcc + Mic + Java + Sen + Gad;
        Per = T / 5;
        if (Dcc >= 40 && Mic >= 40 && Java >= 40 && Sen >= 40 && Gad >= 40) {

            JOptionPane.showMessageDialog(null, "Student is pass");
            if (Per >= 75) {
                JOptionPane.showMessageDialog(null, "Student is pass with Distingtion "+Per);
            }
        } else {
            JOptionPane.showMessageDialog(null, " Student is Fail");
        }
    }
}