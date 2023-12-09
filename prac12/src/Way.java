import javax.swing.*;
import java.awt.*;


public class Way extends JFrame {
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;

    public Way(String imagePath) {

        setTitle("Image Viewer");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(WINDOW_WIDTH, WINDOW_HEIGHT, Image.SCALE_SMOOTH);

        JLabel label = new JLabel(new ImageIcon(scaledImage));
        add(label);

        setVisible(true);
    }

    public static void main(String[] args) {

        if (args.length > 0) {
            SwingUtilities.invokeLater(() -> new Way(args[0]));
        } else {
            System.out.println("Please provide the path to the image file as an argument.");
        }
    }
}