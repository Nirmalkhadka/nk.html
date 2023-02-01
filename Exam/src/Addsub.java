import javax.sound.midi.ControllerEventListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Addsub extends JFrame {
    TextField t1,t2,t3;
    JButton b1,b2;
    public Addsub(){
        setSize(500,600);
        t1=new TextField();
        t2=new TextField();
        t3=new TextField();
        t1.setBounds(100,100,100,100);
        t2.setBounds(400,100,100,100);
        t3.setBounds(300,500,100,100);
        t3.setEditable(false);
        b1=new JButton("sum");
        b1.setBounds(100,300,100,100);
        b2=new JButton("sub");
        b2.setBounds(400,300,100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(t1);
        add(t2);add(t3);
        add(b1);add(b2);
        Controller c=new Controller(this);
        b1.addActionListener(c);
        b2.addActionListener(c);
        setVisible(true);
        setLayout(null);
    }
    public static void main(String[]args){
        new Addsub();
    }
}
class Controller implements ActionListener{
    Addsub as;
    public Controller(Addsub as){
        this.as=as;
    }
    public void actionPerformed(ActionEvent e){

        if(e.getSource()==this.as.b1){
            int f1=Integer.parseInt(this.as.t1.getText());
            int s1=Integer.parseInt(this.as.t2.getText());
            int add=f1+s1;
            this.as.t3.setText(" "+add);
            this.as.t3.setForeground(Color.black);
        }
        else {
            int f1=Integer.parseInt(this.as.t1.getText());
            int s1=Integer.parseInt(this.as.t2.getText());
            int sub=f1-s1;
            this.as.t3.setText(" "+sub);
            this.as.t3.setForeground(Color.cyan);
        }
    }
}
