import javax.swing.*;
import java.awt.*;

public class FrameIconEx extends JFrame {

    public FrameIconEx() {
        InitUI();
    }

    private void InitUI() {

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            FrameIconEx ex = new FrameIconEx();
            ex.setVisible(true);
        });

    }
}

