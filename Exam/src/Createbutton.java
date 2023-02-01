import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Createbutton extends JFrame implements ActionListener {
    JButton b1,b2;
    public Createbutton(){
        setSize(400,400);
        b1=new JButton("1");
        b1.setBounds(100,111,111,111);
        b2=new JButton("2");
        b2.setBounds(200,222,222,222);
        add(b1);add(b2);
        ButtonGroup bg=new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        setLayout(new FlowLayout(FlowLayout.CENTER,100,100));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource().equals(b1)) {
            Coustemmsgdialogbox.newMsg(this, "b", "bb");
        }else {
            Coustemmsgdialogbox.newMsg(this, "b", "bb");

        }
    }
    public static void main(String []args){
        new Createbutton();
    }
}
