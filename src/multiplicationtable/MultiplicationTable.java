package multiplicationtable;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class MultiplicationTable extends JFrame {

    private Container c;
    private JLabel imglabel,textlabel;
    private ImageIcon img;
    private Font f;
    private JTextArea ta;
    private JTextField tf;
    private JButton btn,submitbtn;
    private JScrollPane scroll;
            
    
    MultiplicationTable (){
        
        initcom();
        
    }
    public void initcom(){
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.blue);
        img=new ImageIcon(getClass().getResource("IMG_20190721_165615.png"));
        f=new Font ("Arial",Font.BOLD,17);
        imglabel=new JLabel(img);
        imglabel.setBounds(20,10,img.getIconWidth()+100,img.getIconHeight());
        c.add(imglabel);
        textlabel=new JLabel("Enter Your No:");
        textlabel.setBounds(10,img.getIconHeight()+40,130,30);
        textlabel.setOpaque(true);
        textlabel.setBackground(Color.DARK_GRAY);
        textlabel.setForeground(Color.PINK);
        textlabel.setFont(f);
        c.add(textlabel);
        tf=new JTextField();
        tf.setBounds(150,img.getIconHeight()+40,130,30);
        tf.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf);
        
        btn=new JButton("Clear");
        btn.setBounds(227,img.getIconHeight()+90,65,30);
        btn.setBackground(Color.green);
        btn.setForeground(Color.red);
        c.add(btn);
        submitbtn=new JButton("Submit");
        submitbtn.setBounds(220-70,img.getIconHeight()+90,75,30);
        submitbtn.setBackground(Color.pink);
        submitbtn.setForeground(Color.blue);
        c.add(submitbtn);
        ta=new JTextArea();
        
        ta.setForeground(Color.MAGENTA);
        ta.setFont(f);
        ta.setBackground(Color.green);
       ta.setLineWrap(true);
       ta.setWrapStyleWord(true);
        scroll=new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(10,img.getIconHeight()+145,310,360-img.getIconHeight()+150);
        
        c.add(scroll);
        
        
        tf.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String Value=tf.getText();
                ta.setText("");
              if(Value.isEmpty()){
               JOptionPane.showMessageDialog(null,"please enter any input");
              }
              else{
                  
                  int num=Integer.parseInt(tf.getText());
               for(int i=1;i<=35;i++){
                   int result=num*i;
                   
                   String r=String.valueOf(result);
                   String n=tf.getText();
                   String incr=String.valueOf(i);
                   
                   ta.append(n+" X "+incr+"="+r+"\n");
                   
                   
               }
                
              }
                
            } 
            
            
        });
        submitbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                
                 String Value=tf.getText();
                 ta.setText("");
              if(Value.isEmpty()){
               JOptionPane.showMessageDialog(null,"please enter any input");
              }
              else{
                  
                  int num=Integer.parseInt(tf.getText());
               for(int i=1;i<=35;i++){
                   int result=num*i;
                   
                   String r=String.valueOf(result);
                   String n=tf.getText();
                   String incr=String.valueOf(i);
                   
                   ta.append(n+" X "+incr+"="+r+"\n");
                   
                   
               }
                
              }
                
            } 
            
            
        });
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
              
                ta.setText("");
                tf.setText("");
                
                
            }
            
            
            
        });
        
        
        
        
        
        
        
    }
    
    public static void main(String[] args) {

        MultiplicationTable frame = new MultiplicationTable();

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50, 10, 350, 700);
        frame.setTitle("Multiplication Table");

    }

}
