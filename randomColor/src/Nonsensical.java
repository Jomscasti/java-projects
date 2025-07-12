import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class Nonsensical {
    public static void main(String[] a) {
        JFrame frmHome = new JFrame("Color");
        JButton btn = new JButton("Find your favorite Color!");
        
        frmHome.setVisible(true);
        frmHome.setLayout(null);
        frmHome.setSize(217, 110);
        
        btn.setBounds(0, 0, 200, 70);
        
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Random r = new Random();
                int randx = r.nextInt(256);
                int randy = r.nextInt(256);
                int randz = r.nextInt(256);

                btn.setBackground(new Color(randx, randy, randz));
            }
        });
        
        frmHome.add(btn);
    }
}
