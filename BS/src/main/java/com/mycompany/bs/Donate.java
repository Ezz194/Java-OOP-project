package com.mycompany.bs;


import static com.mycompany.bs.Ps.index;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Donate extends JFrame {

    acto a = new acto();
    JLabel lbl = new JLabel("Donate");
    JLabel lbl2 = new JLabel(" For FCDS");
    JLabel lb = new JLabel("How much do You want to Donate for FCDS");
    JPanel board = new JPanel();
    JPanel solid = new JPanel();
    JTextField t1 = new JTextField();
    JButton keys[] = new JButton[12];

    JButton R1 = new JButton();
    JButton R2 = new JButton();
    JButton R3 = new JButton();

    JButton L1 = new JButton();
    JButton L2 = new JButton();
    JButton L3 = new JButton("Back");

    public Donate() {
        defaulting_set();
        screen1_set();
        buttons_set();

    }

    public void defaulting_set() {
        this.setUndecorated(true);
        this.setLocation(400, 100);
        this.setTitle("Donate");
        // this.setVisible(true);
        this.setSize(680, 710);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.add(solid);
    }

    public void buttons_set() {
        // create a panel to hold the buttons
        solid.add(board = new JPanel());
        board.setLayout(new GridLayout(4, 3, 4, 4));
        board.setBackground(Color.LIGHT_GRAY);
        board.setBounds(194, 420, 300, 280);

        // create number buttons and add them to the panel
        for (int i = 1; i < 10; i++) {
            board.add(keys[i - 1] = new JButton(Integer.toString(i)));
        }

        // create the "Enter", "0", and "Delete" buttons
        board.add(keys[9] = new JButton("Enter"));
        keys[9].setForeground(new Color(22, 32, 20));
        keys[9].setBackground(new Color(52, 163, 33));
        board.add(keys[10] = new JButton("0"));
        board.add(keys[11] = new JButton("Delete"));
        keys[11].setBackground(Color.red);
        keys[11].setForeground(new Color(125, 0, 0));

        // set the font of all the buttons
        for (int i = 0; i < 12; i++) {
            keys[i].setFont(new Font("italic", Font.CENTER_BASELINE, 19));
        }
        L3.setFont(new Font("italic", Font.CENTER_BASELINE, 19));
        keys[0].setMnemonic('1');
        keys[1].setMnemonic('2');
        keys[2].setMnemonic('3');
        keys[3].setMnemonic('4');
        keys[4].setMnemonic('5');
        keys[5].setMnemonic('6');
        keys[6].setMnemonic('7');
        keys[7].setMnemonic('8');
        keys[0].setMnemonic('9');
        keys[0].setMnemonic('0');
        keys[0].setMnemonic(KeyEvent.VK_NUMPAD1); // Sets the mnemonic to the '1' key on the numeric keypad
        keys[1].setMnemonic(KeyEvent.VK_NUMPAD2); // Sets the mnemonic to the '2' key on the numeric keypad
        keys[2].setMnemonic(KeyEvent.VK_NUMPAD3); // Sets the mnemonic to the '3' key on the numeric keypad
        keys[3].setMnemonic(KeyEvent.VK_NUMPAD4); // Sets the mnemonic to the '4' key on the numeric keypad
        keys[4].setMnemonic(KeyEvent.VK_NUMPAD5); // Sets the mnemonic to the '5' key on the numeric keypad
        keys[5].setMnemonic(KeyEvent.VK_NUMPAD6); // Sets the mnemonic to the '6' key on the numeric keypad
        keys[6].setMnemonic(KeyEvent.VK_NUMPAD7); // Sets the mnemonic to the '7' key on the numeric keypad
        keys[7].setMnemonic(KeyEvent.VK_NUMPAD8); // Sets the mnemonic to the '8' key on the numeric keypad
        keys[8].setMnemonic(KeyEvent.VK_NUMPAD9); // Sets the mnemonic to the '9' key on the numeric keypad
        keys[9].setMnemonic(KeyEvent.VK_ENTER);   // Sets the mnemonic to the '9' key on the numeric keypad
        keys[10].setMnemonic(KeyEvent.VK_NUMPAD0); // Sets the mnemonic to the '0' key on the numeric keypad
        keys[11].setMnemonic(KeyEvent.VK_BACK_SPACE); // Sets the mnemonic to the del key on the numeric keypad
        keys[0].addActionListener(a);
        keys[1].addActionListener(a);
        keys[2].addActionListener(a);
        keys[3].addActionListener(a);
        keys[4].addActionListener(a);
        keys[5].addActionListener(a);
        keys[6].addActionListener(a);
        keys[7].addActionListener(a);
        keys[8].addActionListener(a);
        keys[9].addActionListener(a);
        keys[10].addActionListener(a);
        keys[11].addActionListener(a);
        L3.addActionListener(a);
        if (Ps.dappear) {
             solid.setBorder(new LineBorder(new Color(246, 76, 34), 1));
            solid.setBackground(Ps.navy);
            board.setBackground(Color.DARK_GRAY);
            t1.setBackground(new Color(38, 38, 38));
            t1.setForeground(new Color(255, 255, 255));
            t1.setCaretColor(new Color(246, 76, 34));
            t1.setBorder(new LineBorder(new Color(246, 76, 34), 1));
            lbl.setForeground(new Color(246, 76, 34));
            lbl2.setForeground(new Color(246, 76, 34));
            lb.setForeground(new Color(246, 76, 34));
            keys[9].setForeground(Color.YELLOW);
            keys[11].setForeground(Color.YELLOW);
        }
    }

    public void screen1_set() {
        solid.setLayout(null);
        solid.setBounds(0, 0, getWidth(), getHeight());
        solid.add(t1);

        solid.add(lbl);
        solid.add(lbl2);
        lbl.setFont(new Font("italic", Font.BOLD + Font.ROMAN_BASELINE, 70));
        lbl.setBounds(215, 10, 390, 100);
        lbl2.setFont(new Font("italic", Font.BOLD + Font.ROMAN_BASELINE, 70));
        lbl2.setBounds(160, 110, 390, 100);
        lbl.setForeground(new Color(19, 34, 50));
        lbl2.setForeground(new Color(19, 34, 50));
        t1.setBounds(166, 290, 360, 40);//txt code
          t1.setBorder(new LineBorder(Color.BLACK,1));
        lb.setBounds(166, 255, 400, 30);
        solid.add(lb);
        lb.setFont(new Font("italic", Font.BOLD + Font.ROMAN_BASELINE, 17));
        t1.setHorizontalAlignment(JTextField.CENTER);
        solid.add(L1);
        solid.add(L2);
        solid.add(L3);
        solid.add(R1);
        solid.add(R2);
        solid.add(R3);
        L1.setBounds(-6, +70, 100, 50);
        L2.setBounds(-6, 140 + 70, 100, 50);
        L3.setBounds(-6, 280 + 70, 100, 50);
        R1.setBounds(592, +70, 100, 50);
        R2.setBounds(592, 140 + 70, 100, 50);
        R3.setBounds(592, 280 + 70, 100, 50);

    }
     public  void displayPanel(Rectangle bounds, JPanel pane, String message, int mls) {

     JPanel panel = new JPanel();
    JLabel label = new JLabel(message);
     label.setFont(new Font("Arial", Font.BOLD, 36));
        label.setBounds(95, 115, 390, 70);
    label.setForeground(Color.WHITE);
    panel.setLayout(null);
    panel.add(label);
    pane.add(panel);
    panel.setBounds(bounds);
    panel.setBackground(Color.DARK_GRAY);
    pane.setVisible(true);
    
    Timer timer = new Timer(mls, e -> {
        panel.setVisible(false);
        
        ((Timer) e.getSource()).stop();
    });
    timer.setRepeats(false);
    timer.start();
    }

    private class acto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

//////
            if (e.getSource() == keys[0]) {
                if (t1.getText().length() < 8) {

                    t1.setText(t1.getText() + "1");
                }

            }
            if (e.getSource() == keys[1]) {
                if (t1.getText().length() < 8) {
                    t1.setText(t1.getText() + "2");
                }
            }
            if (e.getSource() == keys[2]) {
                if (t1.getText().length() < 8) {
                    t1.setText(t1.getText() + "3");
                }
            }
            if (e.getSource() == keys[3]) {
                if (t1.getText().length() < 8) {
                    t1.setText(t1.getText() + "4");
                }
            }
            if (e.getSource() == keys[4]) {
                if (t1.getText().length() < 8) {
                    t1.setText(t1.getText() + "5");
                }
            }
            if (e.getSource() == keys[5]) {
                if (t1.getText().length() < 8) {
                    t1.setText(t1.getText() + "6");
                }
            }
            if (e.getSource() == keys[6]) {
                if (t1.getText().length() < 8) {
                    t1.setText(t1.getText() + "7");
                }
            }
            if (e.getSource() == keys[7]) {
                if (t1.getText().length() < 8) {
                    t1.setText(t1.getText() + "8");
                }
            }
            if (e.getSource() == keys[8]) {
                if (t1.getText().length() < 8) {
                    t1.setText(t1.getText() + "9");
                }
            }

            // Initialize to a value that indicates an error condition
            if (e.getSource() == keys[9]) {

                try {
                    if (t1.isEditable()) {
                        if (Ps.Balance >= Integer.parseInt(t1.getText())) {
                                                       
History.getInstance().writeTransaction("User "+(index+1)+" Donated "+t1.getText()+"$");
                            Ps.Balance-= Integer.parseInt(t1.getText());
                            Ps.doritos = true;
                            dispose();
                        } else {
                            displayPanel(new Rectangle(93, 0, 500, 420), solid, "      Not Enough", 3500);
                        }
                    }

                } catch (NumberFormatException et) {
                }
            }
            if (e.getSource() == keys[10]) {
                if (t1.getText().length() < 8) {
                    t1.setText(t1.getText() + "0");
                }
            }

            if (e.getSource() == keys[11]) {

                try {
                    String txt = t1.getText();
                    t1.setText(txt.substring(0, txt.length() - 1));

                } catch (StringIndexOutOfBoundsException ere) {
                }
            }
            if (e.getSource() == L3) {
                dispose();
            }

        }
    }

}
