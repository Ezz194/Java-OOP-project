package com.mycompany.bs;


import static com.mycompany.bs.Ps.index;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;

public class Withdraw extends JFrame {

    JLabel m8000 = new JLabel("8000");
    JLabel m4000 = new JLabel("4000");
    JLabel m2000 = new JLabel("2000");
    JLabel m1000 = new JLabel("1000");
    JLabel m500 = new JLabel("500");
    JLabel custom = new JLabel("Custom");
    JPanel main = new JPanel();
    JPanel nofunc = new JPanel();
    JPanel display = new JPanel();
    JLabel nFBB = new JLabel("FBB");
    JButton keys[] = new JButton[12];
    JButton R1 = new JButton();
    JButton R2 = new JButton();
    JButton R3 = new JButton();

    JButton L1 = new JButton();
    JButton L2 = new JButton();
    JButton L3 = new JButton();
    mou m = new mou();

    public Withdraw() {
        defaulting_set();
        upper();
        lower();

    }

    public void defaulting_set() {
        this.setUndecorated(true);
        this.setLocation(400, 100);
        this.setTitle("Withdraw");
        this.setVisible(true);
        this.setSize(700, 750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
//        this.add(main);
    }

    public void lower() {
        nofunc.setBounds(193, 420, 300, 280);
        main.add(nofunc);
        nofunc.setLayout(new GridLayout(4, 3, 4, 4));
        nofunc.setBackground(Color.LIGHT_GRAY);
        for (int i = 1; i < 10; i++) {
            nofunc.add(keys[i - 1] = new JButton(Integer.toString(i)));
        }

        // create the "Enter", "0", and "Delete" buttons
        nofunc.add(keys[9] = new JButton("Enter"));
        keys[9].setForeground(new Color(22, 32, 20));
        keys[9].setBackground(new Color(52, 163, 33));
        nofunc.add(keys[10] = new JButton("0"));
        nofunc.add(keys[11] = new JButton("Delete"));
        keys[11].setBackground(Color.red);
        keys[11].setForeground(new Color(125, 0, 0));

        // set the font of all the buttons
        for (int i = 0; i < 12; i++) {
            keys[i].setFont(new Font("italic", Font.CENTER_BASELINE, 19));

        }
        if (Ps.dappear) {
             main.setBorder(new LineBorder(new Color(246, 76, 34), 1));
            main.setBackground(Ps.navy);
            nofunc.setBackground(Color.DARK_GRAY);
            keys[9].setForeground(Color.YELLOW);
            keys[11].setForeground(Color.YELLOW);
        }

    }

    public void upper() {
        this.add(main);
        main.setBounds(0, 0, this.getWidth(), this.getHeight());
        main.setLayout(null);
        main.add(display);
        display.setBackground(Color.DARK_GRAY);
        display.setBounds(93, 0, 500, 420);
         display.add(nFBB);
        nFBB.setBounds(70, 110, 380, 200);
        nFBB.setForeground(new Color(255, 255, 255, 30));
        nFBB.setFont(new Font("itilic", Font.ITALIC + Font.BOLD, 160));
        display.setLayout(null);
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
        L1.addActionListener(m);
        L2.addActionListener(m);
        L3.addActionListener(m);
        R1.addActionListener(m);
        R2.addActionListener(m);
        R3.addActionListener(m);
        display.add(m8000);
        m8000.setBounds(10, 70, 200, 50);
        m8000.setForeground(new Color(200, 200, 200));
        m8000.setFont(new Font("italic", Font.BOLD, 30));
        display.add(m2000);
        m2000.setBounds(10, 140 + 70, 200, 50);
        m2000.setForeground(new Color(200, 200, 200));
        m2000.setFont(new Font("italic", Font.BOLD, 30));
        display.add(custom);
        custom.setForeground(new Color(200, 200, 200));
        custom.setFont(new Font("italic", Font.BOLD, 26));
        custom.setBounds(10, 280 + 70 - 5, 200, 50);

        display.add(m4000);
        m4000.setBounds(420, 70, 200, 50);
        m4000.setForeground(new Color(200, 200, 200));
        m4000.setFont(new Font("italic", Font.BOLD, 30));
        display.add(m1000);
        m1000.setBounds(420, 140 + 70, 200, 50);
        m1000.setForeground(new Color(200, 200, 200));
        m1000.setFont(new Font("italic", Font.BOLD, 30));
        display.add(m500);
        m500.setBounds(425, 280 + 70 - 5, 200, 50);
        m500.setForeground(new Color(200, 200, 200));
        m500.setFont(new Font("italic", Font.BOLD, 30));
         L1.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
          m8000.setFont(new Font("italic", Font.CENTER_BASELINE, 26));
           m8000.setForeground(new Color(120, 255, 120));
        }
        @Override
        public void mouseExited(MouseEvent e) {
           m8000.setFont(new Font("italic", Font.CENTER_BASELINE, 27));
            m8000.setForeground(new Color(200, 200, 200));
        }
    });
          L2.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
          m2000.setFont(new Font("italic", Font.CENTER_BASELINE, 26));
           m2000.setForeground(new Color(120, 255, 120));
        }
        @Override
        public void mouseExited(MouseEvent e) {
           m2000.setFont(new Font("italic", Font.CENTER_BASELINE, 27));
            m2000.setForeground(new Color(200, 200, 200));
        }
    });
          L3.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
         custom.setFont(new Font("italic", Font.CENTER_BASELINE, 26));
           custom.setForeground(new Color(120, 120,255));
        }
        @Override
        public void mouseExited(MouseEvent e) {
           custom.setFont(new Font("italic", Font.CENTER_BASELINE, 27));
            custom.setForeground(new Color(255, 200, 200));
        }
    });
          
    R1.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
          m4000.setFont(new Font("italic", Font.CENTER_BASELINE, 26));
           m4000.setForeground(new Color(120, 255, 120));
        }
        @Override
        public void mouseExited(MouseEvent e) {
           m4000.setFont(new Font("italic", Font.CENTER_BASELINE, 27));
            m4000.setForeground(new Color(200, 200, 200));
        }
    });
          R2.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
          m1000.setFont(new Font("italic", Font.CENTER_BASELINE, 26));
           m1000.setForeground(new Color(120, 255, 120));
        }
        @Override
        public void mouseExited(MouseEvent e) {
           m1000.setFont(new Font("italic", Font.CENTER_BASELINE, 27));
            m1000.setForeground(new Color(200, 200, 200));
        }
    });
    
          R3.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
          m500.setFont(new Font("italic", Font.CENTER_BASELINE, 26));
           m500.setForeground(new Color(120, 255, 120));
        }
        @Override
        public void mouseExited(MouseEvent e) {
           m500.setFont(new Font("italic", Font.CENTER_BASELINE, 27));
            m500.setForeground(new Color(200, 200, 200));
        }
    });
    

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
    display.setVisible(false);
    Timer timer = new Timer(mls, e -> {
        panel.setVisible(false);
        display.setVisible(true);
        ((Timer) e.getSource()).stop();
    });
    timer.setRepeats(false);
    timer.start();
    }
    
    private class mou implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == L1) {
                if (Ps.Balance >= 8000) {
                    History.getInstance().writeTransaction("User "+(index+1)+" Withdrawed 8000$");
                     Ps.doritos=true;
                    Ps.Balance -= 8000;
                    dispose();
                } else {
                    displayPanel(new Rectangle(93, 0, 500, 420), main, "      Not Enough", 3500); 

                }
            }
            if (e.getSource() == L2) {
                if (Ps.Balance >= 2000) {
                     History.getInstance().writeTransaction("User "+(index+1)+" Withdrawed 2000$");
 Ps.doritos=true;
                    Ps.Balance -= 2000;
                    dispose();
                } else {
                   displayPanel(new Rectangle(93, 0, 500, 420), main, "      Not Enough", 3500);

                }
            }
            if (e.getSource() == L3) {
                nd2_screen wid = new nd2_screen();
                wid.setVisible(true);
                dispose();
            }
            if (e.getSource() == R1) {
                if (Ps.Balance >= 4000) {
                     History.getInstance().writeTransaction("User "+(index+1)+" Withdrawed 4000$");
                     Ps.doritos=true;  Ps.Balance -= 4000;
                    dispose();
                } else {
                   displayPanel(new Rectangle(93, 0, 500, 420), main, "      Not Enough", 3500);

                }
            }
            if (e.getSource() == R2) {
                if (Ps.Balance >= 1000) {
                     History.getInstance().writeTransaction("User "+(index+1)+" Withdrawed 1000$");
                  Ps.doritos=true;
                    Ps.Balance -= 1000;
                    dispose();
                } else {
                   displayPanel(new Rectangle(93, 0, 500, 420), main, "      Not Enough", 3500);

                }
            }
            if (e.getSource() == R3) {
                if (Ps.Balance >= 500) {
                     History.getInstance().writeTransaction("User "+(index+1)+" Withdrawed 500$");
                     Ps.doritos=true;
                    Ps.Balance -= 500;
                    dispose();
                } else {
                  displayPanel(new Rectangle(93, 0, 500, 420), main, "      Not Enough", 3500);

                }
            }

        }

    }

    private class nd2_screen extends JFrame {

        JLabel lbl = new JLabel("Withdraw");
        JLabel lbl2 = new JLabel(" ");
        JLabel lb = new JLabel("Enter The amount of money you want to withdraw");
        JLabel minus = new JLabel("Not enough");
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

        public nd2_screen() {
            default_set();
            screen1_set();
            buttons_set();

        }

        public void default_set() {
            this.setUndecorated(true);
            this.setLocation(400, 100);
            this.setTitle("");
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
      
            if (Ps.dappear) {
                 main.setBorder(new LineBorder(new Color(246, 76, 34), 1));
                main.setBackground(Ps.navy);
                board.setBackground(Color.DARK_GRAY);
                t1.setBackground(new Color(38, 38, 38));
                t1.setForeground(new Color(255, 255, 255));
                t1.setCaretColor(new Color(246, 76, 34));
                lbl.setForeground(new Color(246, 76, 34));
                lb.setForeground(new Color(246, 76, 34));
                 t1.setBorder(new LineBorder(new Color(246, 76, 34), 1));
                keys[9].setForeground(Color.YELLOW);
                keys[11].setForeground(Color.YELLOW);
            }
        }

        public void screen1_set() {
            main.setLayout(null);
            main.setBounds(0, 0, getWidth(), getHeight());
            main.add(t1);
            main.add(lbl);
            main.add(lbl2);
            lbl.setFont(new Font("italic", Font.BOLD + Font.ROMAN_BASELINE, 70));
            lbl.setBounds(185, 10, 390, 100);
            lbl2.setFont(new Font("italic", Font.BOLD + Font.ROMAN_BASELINE, 70));
            lbl2.setBounds(160, 110, 390, 100);
            lbl.setForeground(new Color(19, 34, 50));
            lbl2.setForeground(new Color(19, 34, 50));
            t1.setBounds(166, 290, 360, 40);//txt code
            lb.setBounds(166, 255, 400, 30);
            main.add(lb);
            lb.setFont(new Font("italic", Font.BOLD + Font.ROMAN_BASELINE, 17));
            t1.setHorizontalAlignment(JTextField.CENTER);
             t1.setBorder(new LineBorder(Color.BLACK,1));
               
        L1.setBounds(-6, +70, 100, 50);
        L2.setBounds(-6, 140 + 70, 100, 50);
        L3.setBounds(-6, 280 + 70, 100, 50);
        R1.setBounds(592, +70, 100, 50);
        R2.setBounds(592, 140 + 70, 100, 50);
        R3.setBounds(592, 280 + 70, 100, 50);
        main.add(L1);
        main.add(L2);
        main.add(L3);
        main.add(R1);
        main.add(R2);
        main.add(R3);
        
        }

        private class acto implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==L3) {
                    dispose();
                }

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
                                History.getInstance().writeTransaction("User "+(index+1)+" Withdrawed "+t1.getText()+"$");
                               Ps.doritos= true;
                                Ps.Balance -= Integer.parseInt(t1.getText());
                                dispose();
                            } else {
                                main.add(minus);
                                minus.setForeground(Color.red);
                                minus.setBounds(166, 321, 200, 30);

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

            }
        }

    }

}
