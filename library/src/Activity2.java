import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;

public class Activity2 {

    static Color clrTheme = new Color(173, 216, 230); // Soft Blue
    static JLabel lblItem;
    static float fltTotal = 0;

    public static void main(String[] args) {
        // DECLARE ALL COMPONENTS

        JFrame frm = new JFrame("Digital Library System");
        JButton btnClear = new JButton("Clear Receipt");

        JButton btnB = new JButton("Books");
        JButton btnM = new JButton("Magazines");
        JButton btnT = new JButton("Textbooks");

        JPanel pnlNav = new JPanel();
        JPanel pnlContent = new JPanel();
        JPanel pnlReceipt = new JPanel();
        JPanel pnlTotal = new JPanel();

        JPanel pnlB = new JPanel();
        JPanel pnlM = new JPanel();
        JPanel pnlT = new JPanel();

        // SET FRAME SETTINGS

        frm.setVisible(true);
        frm.setSize(500, 500);
        frm.setLayout(new BorderLayout());

        // SET PANEL SETTINGS

        pnlNav.setLayout(new GridLayout());
        CardLayout lmCard = new CardLayout();
        pnlContent.setLayout(lmCard);
        pnlReceipt.setBackground(clrTheme);
        pnlReceipt.setLayout(new BoxLayout(pnlReceipt, BoxLayout.Y_AXIS));
        pnlReceipt.add(Box.createVerticalStrut(10));
        pnlTotal.setLayout(new FlowLayout(FlowLayout.LEFT));


        // SET UP RECEIPT ITEMS

        lblItem = new JLabel("<html>");
        lblItem.setAlignmentX(Component.RIGHT_ALIGNMENT);
        pnlReceipt.add(lblItem);

        JLabel lblTotal = new JLabel(fltTotal + "");
        lblTotal.setPreferredSize(new Dimension(120,50));
        pnlTotal.setBackground(clrTheme);


        // CREATE PANEL B-BOOKS CONTENTS

        String[][] booksWithPrices = {
            {"b3.jpg","Harry Potter and the Philosopher's Stone", "199.50"},
            {"b4.jpg","Fifty Shades of Grey", "169.00"},
            {"b5.jpg","ABNKKBSNPLAko!", "150.99"},
            {"b6.jpg","To Kill A Mockingbird", "170.99"},
            {"b7.jpg","Pride and Prejudice", "145.99"},
            {"b8.jpg","The Great Gatsby", "180.99"},
            {"b9.jpg","The Hunger Games", "143.99"}
        };

        // for each
        for (String[] books : booksWithPrices) {
            URL imgurl1 = Activity2.class.getResource("/" + books[0]);
            ImageIcon icn1 = new ImageIcon(imgurl1);

            JButton btnBook = new JButton();
            btnBook.setPreferredSize(new Dimension(127, 204));
            btnBook.setIcon(icn1);
            pnlB.add(btnBook);

            //Action listener for preview button
            JButton btnPreview = new JButton("Preview");
            btnPreview.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Show a message box with book description
                    JOptionPane.showMessageDialog(frm, books[1] + ": ₱" + books[2], "Book Description", JOptionPane.INFORMATION_MESSAGE);
                }
            });
            pnlB.add(btnPreview);

            //Action listener for buy button
            JButton btnBuy = new JButton("Buy");
            btnBuy.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String strReceipt = lblItem.getText();
                    lblItem.setText(strReceipt + "Price: " + books[2] + "<br/>");

                    fltTotal += Float.parseFloat(books[2]);
                    lblTotal.setText("Total: ₱" + fltTotal + "");
                }
            });
            pnlB.add(btnBuy);
        }

        // CREATE PANEL M-MAGAZINE CONTENTS

        String[][] MagazineWithPrices = {
            {"m1.jpg","National Geographic", "192.91"},
            {"m2.jpg","Time", "120.53"},
            {"m3.jpg","The New Yorker", "150.04"},
            {"m4.jpg","Forbes", "123.04"},
            {"m5.jpg","Wired", "148.04"},
            {"m6.jpg","Rolling Stone", "170.04"},
            {"m7.jpg","Sports Illustration", "130.04"},
            {"m8.jpg","Reader's Digest", "123.04"},
            {"m9.jpg","Vanity Fair", "147.04"},
        };

        // for each
        for(String[] Magazines : MagazineWithPrices) {
            URL imgurl2 = Activity2.class.getResource("/" + Magazines[0]);
            ImageIcon icn2 = new ImageIcon(imgurl2);

            JButton btnMagazine = new JButton();
            btnMagazine.setPreferredSize(new Dimension(127,204));
            btnMagazine.setIcon(icn2);
            pnlM.add(btnMagazine);


            //Action listener for preview button
            JButton btnPreview = new JButton("Preview");
            btnPreview.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Show a message box with book description
                    JOptionPane.showMessageDialog(frm, Magazines[1] + ": ₱" + Magazines[2], "Magazine Description", JOptionPane.INFORMATION_MESSAGE);
                }
            });
            pnlM.add(btnPreview);

            //Action listener for buy button
            JButton btnBuy = new JButton("Buy");
            btnBuy.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String strReceipt = lblItem.getText();
                    lblItem.setText(strReceipt + "Price: " + Magazines[2] + "<br/>");

                    fltTotal += Float.parseFloat(Magazines[2]);
                    lblTotal.setText("Total: ₱" + fltTotal + "");
                }
            });
            pnlM.add(btnBuy);
        }

        // CREATE PANEL T - TEXTBOOKS CONTENTS

        String[][] TextbookWithPrices = {
            {"b1.jpg","Introduction to Algorithms", "176.99"},
            {"b2.jpg","Java: The Complete Reference", "154.95"},
            {"t1.jpg","Principles of Economics", "157.91"},
            {"t2.jpg","Fundamentals of Quantum Physics", "185.91"},
            {"t3.jpg","Essentials of Human Anatomy & Physiology", "172.91"},
            {"t4.jpg","Linear Algebra and Its Applications", "157.91"},
            {"t5.jpg","Campbell Biology", "139.91"},
            {"t6.jpg","Fundamentals of Corporate Finance", "174.91"},
        };

        // for each
        for(String[] Textbooks : TextbookWithPrices) {
            URL imgurl3 = Activity2.class.getResource("/" + Textbooks[0]);
            ImageIcon icn3 = new ImageIcon(imgurl3);

            JButton btnTextbook = new JButton();
            btnTextbook.setPreferredSize(new Dimension(127,204));
            btnTextbook.setIcon(icn3);
            pnlT.add(btnTextbook);

            //Action listener for preview button
            JButton btnPreview = new JButton("Preview");
            btnPreview.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Show a message box with book description
                    JOptionPane.showMessageDialog(frm, Textbooks[1] + ": ₱" + Textbooks[2], "Magazine Description", JOptionPane.INFORMATION_MESSAGE);
                }
            });
            pnlT.add(btnPreview);

            //Action listener for buy button
            JButton btnBuy = new JButton("Buy");
            btnBuy.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String strReceipt = lblItem.getText();
                    lblItem.setText(strReceipt + "Price: " + Textbooks[2] + "<br/>");

                    fltTotal += Float.parseFloat(Textbooks[2]);
                    lblTotal.setText("Total: ₱" + fltTotal + "");
                }
            });
            pnlT.add(btnBuy);
        }

        pnlB.setBackground(clrTheme);
        pnlM.setBackground(clrTheme);
        pnlT.setBackground(clrTheme);
        pnlNav.setBackground(clrTheme);

        // BUTTON FUNCTIONS

        btnB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lmCard.show(pnlContent, "B");
            }
        });

        btnM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lmCard.show(pnlContent, "M");
            }
        });

        btnT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lmCard.show(pnlContent, "T");

                pnlB.setBackground(clrTheme);
                pnlM.setBackground(clrTheme);
                pnlT.setBackground(clrTheme);
                pnlNav.setBackground(clrTheme);
            }
        });

        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lblItem.setText("<html>");
                fltTotal = 0;
                lblTotal.setText(fltTotal + "");
            }
        });

        // ADD TO PANELS

        // ITO YUNG NORTH
        
        pnlNav.add(btnB);
        pnlNav.add(btnM);
        pnlNav.add(btnT);
        pnlNav.add(btnClear);
        
        // ITO YUNG EAST
        pnlTotal.add(lblTotal);
        pnlReceipt.add(pnlTotal);
        
        // ITO YUNG CENTER
        pnlContent.add(pnlB, "B");
        pnlContent.add(pnlM, "M");
        pnlContent.add(pnlT, "T");

        // ADD TO FRAME
        frm.add(pnlNav, BorderLayout.NORTH);
        frm.add(pnlContent, BorderLayout.CENTER);
        frm.add(pnlReceipt, BorderLayout.EAST);
    }
}
