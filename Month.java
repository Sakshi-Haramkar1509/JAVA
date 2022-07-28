import javax.swing.*;

public class Month {
    public static void main(String args[]) {
        int month = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the month number"));

        switch (month) {
            case 3:
                JOptionPane.showMessageDialog(null, "Summer");
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "Summer");
                break;

            case 5:
                JOptionPane.showMessageDialog(null, "Summer");
                break;

            case 6:
                JOptionPane.showMessageDialog(null, "Summer");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Rainy");
                break;

            case 8:
                JOptionPane.showMessageDialog(null, "Rainy");
                break;

            case 9:
                JOptionPane.showMessageDialog(null, "Rainy");
                JOptionPane.showMessageDialog(null, "Septt");
                break;

            case 10:
                JOptionPane.showMessageDialog(null, "Rainy");
                break;
            case 11:
                JOptionPane.showMessageDialog(null, "Winter");
                break;

            case 12:
                JOptionPane.showMessageDialog(null, "Winter");
                break;

            case 1:
                JOptionPane.showMessageDialog(null, "Winter");
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Winter");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Invalid month");
                break;

        }
    }
}
