import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimationTest extends JFrame {
    private JLabel animationLabel;
    private Timer timer;
    private int frameIndex = 0;
    private ImageIcon[] frames;

    public AnimationTest() {
        super("ZODIAC");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new BorderLayout());

        // Загрузка кадров анимации из файлов jpeg
        frames = new ImageIcon[4];
        frames[0] = new ImageIcon("C:\\Users\\Vovak\\Documents\\business\\Zodiac1.jpg");
        frames[1] = new ImageIcon("C:\\Users\\Vovak\\Documents\\business\\Zodiac2.jpg");
        frames[2] = new ImageIcon("C:\\Users\\Vovak\\Documents\\business\\Zodiac3.jpg");
        frames[3] = new ImageIcon("C:\\Users\\Vovak\\Documents\\business\\Zodiac4.jpg");

        animationLabel = new JLabel(frames[0]);
        add(animationLabel, BorderLayout.CENTER);

        // Создание таймера для изменения кадров с задержкой в 500 миллисекунд
        timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameIndex = (frameIndex + 1) % frames.length;
                animationLabel.setIcon(frames[frameIndex]);
            }
        });

        setVisible(true);
    }

    public void startAnimation() {
        timer.start();
    }

    public static void animation() {
        AnimationTest example = new AnimationTest();
        example.startAnimation();
    }
}