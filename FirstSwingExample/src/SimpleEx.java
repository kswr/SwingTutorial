import javax.swing.*;
import java.awt.*;

public class SimpleEx extends JFrame {

    public SimpleEx() {
        initUI();
    }

    private void initUI() {
        setTitle("Simple example");
        // use pack() to make window fit it's content
        setSize(600, 400);
        // displays on the center
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // provides concurency safety for UI updates
        EventQueue.invokeLater(() -> {
            SimpleEx ex = new SimpleEx();
            ex.setVisible(true);
        });

    }
}
