import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Msgdialogbox extends JFrame implements ActionListener {
    JButton b1;
    Msgdialogbox(){
        setSize(400,400);
        b1=new JButton("click");
        b1.setBounds(100,100,110,110);
        add(b1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addActionListener(this);
        setVisible(true);
        setLayout(null);
    }
    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(this,"hllow","msg",JOptionPane.PLAIN_MESSAGE);
    }
    public static void main(String[]args){
        new Msgdialogbox();
    }
}
