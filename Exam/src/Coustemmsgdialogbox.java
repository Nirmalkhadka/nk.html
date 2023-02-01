import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Coustemmsgdialogbox {
    static JDialog d;
    static JLabel lb;
    static JButton btn;
    public static void newMsg(JFrame f,String msg,String tit){
        d=new JDialog(f,tit);
        d.setSize(300,300);
        lb=new JLabel(msg);
        btn=new JButton("0l");
        d.add(Box.createRigidArea(new Dimension(0,15)));
        d.add(lb);
        d.add(Box.createRigidArea(new Dimension(0,15)));
        d.add(btn);
        lb.setAlignmentX(Component.CENTER_ALIGNMENT);
        btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        d.setLocationRelativeTo(f);
        d.setLayout(new BoxLayout(d.getContentPane(),BoxLayout.Y_AXIS));
        d.setVisible(true);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d.setVisible(false);
            }
        });
    }
}
