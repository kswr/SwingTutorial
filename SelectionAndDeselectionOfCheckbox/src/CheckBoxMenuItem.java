import javax.swing.*;
import java.awt.*;

public class CheckBoxMenuItem extends JFrame {

    public CheckBoxMenuItem() {
        InitUI();
    }

    private void InitUI() {

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            CheckBoxMenuItem ex = new CheckBoxMenuItem();
            ex.setVisible(true);
        });

    }
}

