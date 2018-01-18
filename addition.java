import javax.swing.*;

public class addition
{
    public static void main(String args[])
    {
        int number1;
        int number2;
        int total;
        number1=Integer.parseInt(JOptionPane.showInputDialog("Enter the first number: "));
        number2=Integer.parseInt(JOptionPane.showInputDialog("Enter the second number: "));
        total=number1+number2;
        JOptionPane.showMessageDialog(null,"Total= "+total);
    }
    
            
}