import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Twenty extends JFrame {

    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;
    private static final int NUM_SHAPES = 20;

    public Twenty() {
        setTitle("Random Shapes");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Random random = new Random();

                for (int i = 0; i < NUM_SHAPES; i++) {
                    int x = random.nextInt(WINDOW_WIDTH);
                    int y = random.nextInt(WINDOW_HEIGHT);
                    Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

                    if (random.nextBoolean()) {
                        g.setColor(color);
                        g.fillOval(x, y, 50, 50);
                    } else {
                        g.setColor(color);
                        g.fillRect(x, y, 50, 50);
                    }
                }
            }
        };

        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Twenty());
    }}