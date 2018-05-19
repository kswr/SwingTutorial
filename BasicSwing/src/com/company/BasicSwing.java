package com.company;

import javax.swing.*;

public class BasicSwing extends JFrame {

    JPanel p = new JPanel();
    JButton b = new JButton("Hello");
    JTextField t = new JTextField("Hello", 20);
    JTextArea ta = new JTextArea("How\nare\nyou", 5, 20);
    JLabel l = new JLabel("What's up");
    String[] choices = {
            "Hello",
            "Arr",
            "Guten Morgen"
    };
//    JComboBox<String> cb = new JComboBox<>();
    JComboBox cb = new JComboBox(choices);


    public static void main(String[] args) {
        new BasicSwing();
    }

    public BasicSwing() {
        super("Basic Swing App");
        setSize(400, 300);
        setResizable(true);
        p.add(t);
        p.add(ta);
        p.add(b);
        p.add(l);
        p.add(cb);
        add(p);
        setVisible(true);
    }
}
