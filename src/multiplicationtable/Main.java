
package multiplicationtable;

import javax.swing.JFrame;


public class Main {
    
    
    public static void main(String[] args) {
        
          MultiplicationTable frame = new MultiplicationTable();

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50, 10, 350, 700);
        frame.setTitle("Multiplication Table");

        
        
        
    }
    
}
