import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Popmenu extends JFrame implements ActionListener, MouseListener {
    JTextArea t1;
    JPopupMenu meanu;
    JMenuItem selectall,copy,paste,exit;
    public Popmenu(){
        setSize(400,400);
        t1=new JTextArea();
        t1.setBounds(100,100,10,10);
        add(t1);
        meanu=new JPopupMenu("menu");
        add(meanu);
        selectall = new JMenuItem("Select All");
        selectall.addActionListener(this);
        add(selectall);

        copy = new JMenuItem("Copy");
        copy.addActionListener(this);
        add(copy);

        paste = new JMenuItem("Paste");
        paste.addActionListener(this);
        add(paste);

        exit = new JMenuItem("Exit");
        exit.addActionListener(this);
        add(exit);
        addMouseListener(this);

        setVisible(true);
        setLayout(null);

    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(selectall)) {
            t1.selectAll();
        } else if (e.getSource().equals(paste)) {
            t1.paste();
        } else if (e.getSource().equals(copy)) {
            t1.copy();
        } else {
            System.exit(0);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("x="+e.getX()+"y="+e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }
    public static void main(String[]args){
        new Popmenu();
    }
}
