import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SoccerTest extends JFrame {
    private int milanScore = 0;
    private int madridScore = 0;

    private JButton milanButton;
    private JButton madridButton;
    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    public SoccerTest() {
        super("Football Match");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920, 1080);
        setLayout(new BorderLayout());

        milanButton = new JButton("AC Milan");
        madridButton = new JButton("Real Madrid");
        resultLabel = new JLabel("Result: 0 X 0");
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");

        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                updateResult();
                lastScorerLabel.setText("Last Scorer: AC Milan");
                updateWinner();
            }
        });

        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                updateResult();
                lastScorerLabel.setText("Last Scorer: Real Madrid");
                updateWinner();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(milanButton);
        buttonPanel.add(madridButton);

        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new GridLayout(3, 1));
        labelPanel.add(resultLabel);
        labelPanel.add(lastScorerLabel);
        labelPanel.add(winnerLabel);

        add(buttonPanel, BorderLayout.NORTH);
        add(labelPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    private void updateResult() {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
    }

    private void updateWinner() {
        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (milanScore < madridScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void soccer() {
        new SoccerTest();
    }
}