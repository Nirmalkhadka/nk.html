import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class NameonButtonClick extends JFrame implements ActionListener {
    JLabel lb;
    JButton btn;
    public NameonButtonClick(){
        setSize(500,400);
        setTitle("nirmal");
        lb=new JLabel();
        lb.setBounds(150,150,200,300);
        btn=new JButton("click here");
        btn.setBounds(150,150,200,300);
        add(lb);
        add(btn);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        lb.setText("nk");
    }
    public static void main(String[]args){
        new NameonButtonClick();
    }
}
