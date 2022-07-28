import javax.swing.JOptionPane;

public class Demo1
 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number"));
        int i = 1 , sum ;
        while(i<=num)
        {
            JOptionPane.showMessageDialog(null, "i");
            sum = num + i;
            i++;
            JOptionPane.showMessageDialog(null,"sum of all number is" + sum);
    }
    }    
}
