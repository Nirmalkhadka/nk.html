import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeColor extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4;
    public ChangeColor(){
        setSize(400,500);
        b1=new JButton();
        b2=new JButton();
        b3=new JButton();
        b4=new JButton();
        b1.setBounds(50,100,100,100);
        b2.setBounds(200,250,50,50);
        b3.setBounds(200,350,40,40);
        b4.setBounds(200,400,30,30);
        add(b1);add(b2);add(b3);
        add(b4);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        setVisible(true);
        setLayout(null);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(b1)){
            getContentPane().setBackground(Color.cyan);
        } else if (e.getSource().equals(b2)) {
            getContentPane().setBackground(Color.black);
        } else if (e.getSource().equals(b3)) {
            getContentPane().setBackground(Color.BLUE);
        }else {
            getContentPane().setBackground(Color.GREEN);
        }
    }
    public static void main(String[]args){
        new ChangeColor();
    }
}
