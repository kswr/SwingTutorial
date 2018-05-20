import javax.swing.*;
import java.awt.*;

public class TooltipEx extends JFrame {

    public TooltipEx() {
        InitUI();
    }

    private void InitUI() {

        JButton btn = new JButton("Button");
        btn.setToolTipText("A button component");

        createLayout(btn);

        setTitle("Tooltip");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void createLayout(JComponent... arg) {
        JPanel pane = (JPanel) getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        pane.setToolTipText("Content pane");

        gl.setAutoCreateContainerGaps(true);

        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
                .addGap(200)
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
                .addGap(120)
        );

        pack();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            TooltipEx ex = new TooltipEx();
            ex.setVisible(true);
        });

    }
}
