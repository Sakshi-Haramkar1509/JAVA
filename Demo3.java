import javax.swing.*;

public class Demo3 {
    
    public static void main(String[] args) {
        int n;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number"));
        
        JOptionPane.showMessageDialog(null,n);
        }
        while(n!=0);
        
    }
    }
    

