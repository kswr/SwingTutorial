import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class QuickButtonEx  extends JFrame {
    public QuickButtonEx() {
        initUI();
    }

    private void initUI() {
        JButton quitButton = new JButton("Quit");

        quitButton.addActionListener((ActionEvent event) -> {
            System.exit(0);
        });

        createLayout(quitButton);

        setTitle("Quit button");
        setSize(120, 70);
//        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createLayout(JComponent... arg) {
        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);
        gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(arg[0]));
        gl.setVerticalGroup(gl.createSequentialGroup().addComponent(arg[0]));
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            QuickButtonEx ex = new QuickButtonEx();
            ex.setVisible(true);
        });
    }
}
