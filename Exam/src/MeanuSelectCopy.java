import javax.swing.*;
import java.awt.event.*;

public class MeanuSelectCopy extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenuItem selectall, copy, paste, exit;
    JMenu file;
    JTextArea t1;

    public MeanuSelectCopy() {
        setSize(400, 500);
        setTitle("Menu Select Copy");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        t1 = new JTextArea();
        t1.setBounds(100, 100, 200, 200);
        add(t1);

        mb = new JMenuBar();
        setJMenuBar(mb);

        file = new JMenu("File");
        mb.add(file);

        selectall = new JMenuItem("Select All");
        selectall.addActionListener(this);
        file.add(selectall);

        copy = new JMenuItem("Copy");
        copy.addActionListener(this);
        file.add(copy);

        paste = new JMenuItem("Paste");
        paste.addActionListener(this);
        file.add(paste);

        exit = new JMenuItem("Exit");
        exit.addActionListener(this);
        file.add(exit);

        setVisible(true);
        setLayout(null);
    }

    @Override
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

    public static void main(String[] args) {
        new MeanuSelectCopy();
    }
}
