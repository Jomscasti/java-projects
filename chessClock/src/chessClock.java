import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class chessClock extends JPanel {
    int leftPlayerTime = 600; // 10 minutes in seconds
    int rightPlayerTime = 600; // 10 minutes in seconds
    boolean isLeftPlayerTurn = true;
    int additionalTime = 5; // 5 seconds are added in every move or pause of clock
    
    JLabel btnLeftPlayer = new JLabel();
    JLabel btnRightPlayer = new JLabel();

    public chessClock() {
        this.setBackground(Color.WHITE);
        this.setLayout(null);
        this.setPreferredSize(new Dimension(1045, 490));

        JButton btnLeftPlayer = new JButton("<html><span style='font-size: 30px; font-family: \"Roboto\";'><b>Player 1: " + formatTime(leftPlayerTime) + "</b></span></html>");
        btnLeftPlayer.setBounds(0, 0, 515, 450);
        btnLeftPlayer.setBackground(Color.GRAY);
        btnLeftPlayer.setForeground(Color.WHITE);
        btnLeftPlayer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (isLeftPlayerTurn) {
                    isLeftPlayerTurn = false;
                    leftPlayerTime += additionalTime;
                    btnLeftPlayer.setForeground(Color.WHITE);
                }
            }
        });

        JButton btnRightPlayer = new JButton("<html><span style='font-size: 30px; font-family: \"Roboto\";'><b>Player 2: " + formatTime(rightPlayerTime) + "</b></span></html>");
        btnRightPlayer.setBounds(514, 0, 515, 450);
        btnRightPlayer.setBackground(Color.GRAY);
        btnRightPlayer.setForeground(Color.WHITE);
        btnRightPlayer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!isLeftPlayerTurn) {
                    isLeftPlayerTurn = true;
                    rightPlayerTime += additionalTime;
                    btnRightPlayer.setForeground(Color.WHITE);
                }
            }
        });

        this.add(btnLeftPlayer);
        this.add(btnRightPlayer);
        
        Timer t = new Timer(1000, e -> {
            if (isLeftPlayerTurn) {
                if (leftPlayerTime > 0) {
                    leftPlayerTime -= 1;
                    btnLeftPlayer.setText("<html><span style='font-size: 30px; font-family: \"Roboto\";'><b>Player 1: " + formatTime(leftPlayerTime) + "</b></span></html>");
                    btnLeftPlayer.setForeground(Color.ORANGE);
                }
                if (leftPlayerTime == 0) {
                    isLeftPlayerTurn = false;
                }
            } else {
                if (rightPlayerTime > 0) {
                    rightPlayerTime -= 1;
                    btnRightPlayer.setText("<html><span style='font-size: 30px; font-family: \"Roboto\";'><b>Player 2: " + formatTime(rightPlayerTime) + "</b></span></html>");
                    btnRightPlayer.setForeground(Color.ORANGE);
                }
                if (rightPlayerTime == 0) {
                    isLeftPlayerTurn = true;
                }
            }
        });
        t.start();
    }
    
    
    String formatTime(int time) {
        int minutes = time / 60;
        int seconds = time % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }
}
