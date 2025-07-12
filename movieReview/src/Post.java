import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Post extends JPanel {
    public Post(String title, String reviewer, String rating, String description, ImageIcon icnImage) {
        this.setBackground(Color.WHITE);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setLayout(null);
        this.setPreferredSize(new Dimension(950, 420));

        JLabel titleLabel = new JLabel("<html><span style='font-size: 16px; font-family: \"Roboto\";'><b>" + title + "</b></span></html>");
        titleLabel.setBounds(18, 12, 900 - (18 * 2), 25);

        JLabel reviewerLabel = new JLabel("<html><span style='font-size: 12px; font-family: \"Roboto\";'><i>Reviewed by: " + reviewer + "</i></span></html>");
        reviewerLabel.setBounds(18, 38, 900 - (18 * 2), 22);

        JLabel ratingLabel = new JLabel("<html><span style='font-size: 10px; font-family: \"Roboto\";'>Rating: " + rating + "</b></span></html>");
        ratingLabel.setForeground(Color.red);
        ratingLabel.setBounds(18, 60, 900 - (18 * 2), 17);

        JButton descriptionButton = new JButton("Read Review");
        descriptionButton.setBounds(18, 80, 150, 25);
        descriptionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, description, "Review of " + title, JOptionPane.INFORMATION_MESSAGE);
                
            }
        });
        JLabel imageLabel = new JLabel();
        Image image = icnImage.getImage().getScaledInstance(200, 300, Image.SCALE_SMOOTH); 
        imageLabel.setIcon(new ImageIcon(image));
        imageLabel.setBounds(18, 110, 200, 300);
        
        this.add(titleLabel);
        this.add(reviewerLabel);
        this.add(ratingLabel);
        this.add(descriptionButton);
        this.add(imageLabel);
    }
}
