import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseCordinate extends JFrame implements MouseListener, MouseMotionListener {
    JTextField t1,t2;
    Font f=new Font("Arial",Font.BOLD ,14);

    public MouseCordinate(){
        setSize(400,500);
        t1=new JTextField();
        t2=new JTextField();
        t1.setBounds(100,100,100,100);
        t2.setBounds(200,200,100,100);
        add(t1);add(t2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this);
        addMouseMotionListener(this);
        setLayout(null);
        setVisible(true);
    }
    public void mouseEntered(MouseEvent e){
        t1.setText("mouse entered");
        t1.setFont(f);
        t1.setForeground(Color.BLACK);
    }
    public void mouseExited(MouseEvent e){
        t1.setText("mouse exited");
        t1.setFont(f);
        t1.setForeground(Color.BLUE);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        t2.setText("x=" + e.getX() + " y=" + e.getY());
        Font f1 = new Font("Arial", Font.ITALIC, 14);
        t2.setFont(f1);
        t2.setForeground(Color.RED);
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }
    public static void main(String[] args){
        new MouseCordinate();
    }
}
