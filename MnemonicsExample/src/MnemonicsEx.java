import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class MnemonicsEx extends JFrame {

    public MnemonicsEx() {
        InitUI();
    }

    private void InitUI() {

        JButton button = new JButton("Button");
        button.addActionListener((ActionEvent e) -> {
            System.out.println("Button pressed");
        });

        // highlight button after pressing the option (if button text contains correct letter)
        // option+control+B presses
        button.setMnemonic(KeyEvent.VK_B);

        createLayout(button);

        setTitle("Mnemonic");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createLayout(JComponent... arg) {

        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);

        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
                .addGap(200)
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
                .addGap(200)
        );

        pack();

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            MnemonicsEx ex = new MnemonicsEx();
            ex.setVisible(true);
        });

    }
}

