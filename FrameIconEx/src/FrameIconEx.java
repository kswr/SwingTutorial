import javax.swing.*;
import java.awt.*;

public class FrameIconEx extends JFrame {

    public FrameIconEx() {
        InitUI();
    }

    private void InitUI() {

        ImageIcon webIcon = new ImageIcon("src/main/resources/web.png");

        setIconImage(webIcon.getImage());

        setTitle("Icon");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            FrameIconEx ex = new FrameIconEx();
            ex.setVisible(true);
        });

    }
}

