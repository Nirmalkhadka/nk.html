import javax.swing.*;
import java.awt.event.*;

class class8_20 extends JFrame implements ActionListener {
    JMenu menu;
    JMenuItem sa, copy, cut, paste, exit;
    JTextArea ta;
    JMenuBar ba;

    public class8_20() {
        setSize(400, 500);
        ta = new JTextArea("ass");
        ta.setBounds(300, 100, 300, 300);
        add(ta);
        ba = new JMenuBar();
        setJMenuBar(ba);
        menu = new JMenu("MENU");
        ba.add(menu);
        sa = new JMenuItem("SELECT ALL");
        menu.add(sa);
        copy = new JMenuItem("COPY");
        menu.add(copy);
        cut = new JMenuItem("cut");
        menu.add(cut);
        paste = new JMenuItem("paste");
        menu.add(paste);
        menu.addSeparator();
        exit = new JMenuItem("exit");
        menu.add(exit);
        setVisible(true);
        setLayout(null);
        sa.addActionListener(this);
        copy.addActionListener(this);
        cut.addActionListener(this);
        paste.addActionListener(this);
        exit.addActionListener(this);
    }

    //    public void action @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sa) {
            ta.selectAll();
        } else if (e.getSource() == copy) {

            ta.copy();
        } else if (e.getSource() == cut) {

            ta.cut();
        } else if (e.getSource() == paste) {

            ta.paste();


//    formed
        }
        else {
            System.exit(0);
        }
    }
    public static void main(String [] args){
        new class8_20();
    }
}
