import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CoustemMsgdialog extends JFrame implements ActionListener {
    JButton b1;
    public CoustemMsgdialog(){
        setSize(400,400);
        b1=new JButton("click");
        b1.setBounds(100,100,100,10);
        add(b1);
        b1.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        Coustemmsgdialogbox.newMsg(this,"coustem mgs is created","coustem mgs box is");
    }
    public static void main(String[]args){
        new CoustemMsgdialog();
    }
}
