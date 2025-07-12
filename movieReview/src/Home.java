import javax.swing.*;
import java.net.URL;

public class Home {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Movie Review");
        frame.setSize(280, 1000);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        String[][] reviews = {
            {"Finding Jesus", "Allen Kalbo", "5/5", " Mahahanap mo si Jesus pag napanood mo", "FindingJ.png"},
            {"Tappy Toes", "Topher", "5/5", "Better than Happy Feet Two (because it's actually good)", "TappyToes.png"},
            {"Little Panda Fighter", "Hev Jame", "2/5", "Seriously, just why?.","PandaFighter.png"},
            {"Ratatoing", "Jam Yelvilabol", "1/5", "So bad it's good","Ratatoing.png"},
            {"Finding Jesus 2", "Janna Swing", "5/5", "One of the greatest movies of the 21st century. After watching this movie, I suddenly discovered the answer to the meaning of life. Watch it, it's amazing.","FindingJ2.png"},
        };

        for (String[] review : reviews) {
			URL imgurl = Home.class.getResource("/" + review[4]);
			ImageIcon icnImage = new ImageIcon(imgurl);
            Post reviewComponent = new Post(review[0], review[1], review[2], review[3], icnImage);
            panel.add(reviewComponent);
        }

        JScrollPane scrollPane = new JScrollPane(panel);

        frame.add(scrollPane);
        frame.setVisible(true);
    }
}
