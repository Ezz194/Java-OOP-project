package com.mycompany.bs;

import static com.mycompany.bs.Ps.index;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Deposit extends JFrame {

    JLabel lbl = new JLabel("Deposit");
    JLabel lb = new JLabel("Enter The money");
    JPanel board = new JPanel();
    JPanel main = new JPanel();
    JTextField t1 = new JTextField();
    acto a = new acto();

    JButton keys[] = new JButton[12];
    JButton R1 = new JButton();
    JButton R2 = new JButton();
    JButton R3 = new JButton();

    JButton L1 = new JButton();
    JButton L2 = new JButton();
    JButton L3 = new JButton("Back");

    public Deposit() {
        defaulting_set();
        screen1_set();
        buttons_set();

    }

    public void defaulting_set() {
        this.setUndecorated(true);
        this.setLocation(400, 100);
        this.setTitle("Deposit");
//        this.setVisible(true);
        this.setSize(680, 710);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.add(main);
    }

    public void buttons_set() {
        // create a panel to hold the buttons
        main.add(board = new JPanel());
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
        // dmode
        if (Ps.dappear) {
             main.setBorder(new LineBorder(new Color(246, 76, 34), 1));
            main.setBackground(Ps.navy);
            board.setBackground(Color.DARK_GRAY);
            t1.setBackground(new Color(38, 38, 38));
            t1.setForeground(new Color(255, 255, 255));
            t1.setCaretColor(new Color(246, 76, 34));
            lbl.setForeground(new Color(246, 76, 34));
            lb.setForeground(new Color(246, 76, 34));
            t1.setBorder(new LineBorder(new Color(246, 76, 34),1));
            keys[9].setForeground(Color.YELLOW);
            keys[11].setForeground(Color.YELLOW);
        }
    }

    public void screen1_set() {
        main.setLayout(null);
        main.setBounds(0, 0, getWidth(), getHeight());
        main.add(t1);

        main.add(lbl);

        lbl.setFont(new Font("italic", Font.BOLD + Font.ROMAN_BASELINE, 70));
        lbl.setBounds(215, 10, 390, 100);
        lbl.setForeground(new Color(19, 34, 50));

        t1.setBounds(166, 290, 360, 40);//txt code
        lb.setBounds(166, 255, 400, 30);
        main.add(lb);
        lb.setFont(new Font("italic", Font.BOLD + Font.ROMAN_BASELINE, 17));
        t1.setHorizontalAlignment(JTextField.CENTER);
        t1.setBorder(new LineBorder(Color.BLACK,1));
        main.add(L1);
        main.add(L2);
        main.add(L3);
        main.add(R1);
        main.add(R2);
        main.add(R3);
        L1.setBounds(-6, +70, 100, 50);
        L2.setBounds(-6, 140 + 70, 100, 50);
        L3.setBounds(-6, 280 + 70, 100, 50);
        R1.setBounds(592, +70, 100, 50);
        R2.setBounds(592, 140 + 70, 100, 50);
        R3.setBounds(592, 280 + 70, 100, 50);
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
                if (Integer.parseInt(t1.getText())>-1) {
                     Ps.doritos=true;
                try {
                    if (t1.isEditable()) {
                        Ps.Balance += Integer.parseInt(t1.getText());
                        History.getInstance().writeTransaction("User "+(index+1)+" Deposited "+t1.getText()+"$");
                        dispose();
                    }

                } catch (NumberFormatException et) {
                }
            }
                }
            if (e.getSource() == keys[10]) {
                if (t1.getText().length() < 8) {
                    t1.setText(t1.getText() + "0");
                }
            }

            if (e.getSource() == keys[11]) {

                String txt = t1.getText();
                t1.setText(txt.substring(0, txt.length() - 1));

            }
            if (e.getSource() == L3) {
                dispose();
            }

        }
    }

}
