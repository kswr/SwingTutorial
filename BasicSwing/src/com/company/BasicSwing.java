package com.company;

import javax.swing.*;

public class BasicSwing extends JFrame {

    JPanel p = new JPanel();
    JButton b = new JButton("Hello");
    JTextField t = new JTextField("Hello");
    JTextArea ta = new JTextArea("How\nare\nyou");

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
        add(p);
        setVisible(true);
    }
}
