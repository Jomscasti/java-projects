import javax.swing.*;

public class Home {
    public static void main(String[] a) {
        JFrame frmHome = new JFrame("Chess Clock");

        chessClock clockPanel = new chessClock();

        frmHome.setVisible(true);
        frmHome.setSize(1045, 490);
        frmHome.add(clockPanel);
    }
}
