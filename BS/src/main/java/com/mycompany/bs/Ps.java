package com.mycompany.bs;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class Ps extends JFrame {

///
// create an instance of the ActionListener class
    mouseAct vcut = new mouseAct();
    act a = new act();
    static Accounts xx = new Accounts();

// create a new button
    JButton tab = new JButton();

// create two panels and some other UI components
    static Color navy = new Color(19, 34, 50);
    Color lite = new Color(238, 238, 238);
    JPanel main = new JPanel();
    JPanel is16enf = new JPanel(); // panel to display red or green to indicate if the user has entered 16 numbers
    JPanel buts; // panels for buttons and screen

// create text fields for user number and password
    JTextField userNumTF, pass;

// create an array of buttons
    JButton keys[] = new JButton[12];

// create radio buttons for dark and light mode
    JRadioButton dmode = new JRadioButton("Dark");
    JRadioButton wmode = new JRadioButton("Lite");
    ButtonGroup gr1 = new ButtonGroup();

// create labels for welcome message, FBB, and user prompts
    JLabel welc ;
    JLabel FBB ;
    JLabel usecod ;
    JLabel pscod;
    JLabel wrongser ;
    JLabel wrongpass;

// create a string to hold the user password
    String zpass = "";
// set the initial balance
    static int Balance;
    static int index;
//set appearence boolean
    static boolean dappear = false;
    static boolean doritos = false;
    int mistake = 0;
// constructor for the class

    public Ps() throws IOException {
        welc = new JLabel("Welcome to");
        FBB = new JLabel("FBB");usecod = new JLabel("Write the code from 16 numbers");
        usecod = new JLabel("Write the code from 16 numbers");
        pscod = new JLabel("Enter the password");
        wrongser = new JLabel("Enter a 16 number Correctly");
        wrongpass = new JLabel("Wrong Password");
// call methods to set up the UI
        defaulting_set();
        buttons_set();
        screen1_set();

    }

    public void defaulting_set() {
        this.setUndecorated(true);
        this.setLocation(500, 100);
        this.setTitle("FBB");
        this.setVisible(true);
        this.setSize(480, 710);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setMaximumSize(this.getPreferredSize());
//this.setUndecorated(true);
        this.setResizable(false);
        this.setLayout(null);
        this.add(main);
        main.setBounds(0, 0, this.getWidth(), this.getHeight());
        main.setLayout(null);
        /////
//        this.addComponentListener(new ComponentAdapter() {
//            public void componentMoved(ComponentEvent e) {
//                setLocation(500, 100);
//            }
//        });

    }

    public void buttons_set() {
        // create a panel to hold the buttons
        main.add(buts = new JPanel());
        buts.setLayout(new GridLayout(4, 3, 4, 4));
        buts.setBackground(Color.LIGHT_GRAY);
        buts.setBounds(94, 420, 300, 280);

        // create number buttons and add them to the panel
        for (int i = 1; i < 10; i++) {
            buts.add(keys[i - 1] = new JButton(Integer.toString(i)));
        }

        // create the "Enter", "0", and "Delete" buttons
        buts.add(keys[9] = new JButton("Enter"));
        keys[9].setForeground(new Color(22, 32, 20));
        keys[9].setBackground(new Color(52, 163, 33));
        buts.add(keys[10] = new JButton("0"));
        buts.add(keys[11] = new JButton("Delete"));
        keys[11].setBackground(Color.red);
        keys[11].setForeground(new Color(125, 0, 0));

        // set the font of all the buttons
        for (int i = 0; i < 12; i++) {
            keys[i].setFont(new Font("italic", Font.CENTER_BASELINE, 19));
        }
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
        // add action listeners to all the buttons
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

        // add action listeners to the two radio buttons
        dmode.addActionListener(a);
        wmode.addActionListener(a);
        //
        tab.setBorderPainted(false);
        tab.setContentAreaFilled(false);
        tab.setOpaque(true);
        tab.addActionListener(a);
        tab.addMouseListener(vcut);
    }

    public void screen1_set() {

        main.add(userNumTF = new JTextField());
        main.add(pass = new JTextField());
        main.add(welc);
        welc.setBounds(56, 40, 160, 30);
        welc.setForeground(navy);
        main.add(FBB);
        FBB.setBounds(70, 20, 350, 200);
        FBB.setFont(new Font("itilic", Font.ITALIC + Font.BOLD, 160));
        FBB.setForeground(navy);
        FBB.setToolTipText("Fanta Borta'n Bank");
        main.add(usecod);
        main.add(pscod);
        tab.setBounds(0, 0, 25, 25);
        tab.setFont(new Font("italic", Font.CENTER_BASELINE, 14));
        main.add(tab);
        gr1.add(dmode);
        gr1.add(wmode);
        is16enf.setBounds(419, 234, 10, 30);
        main.add(is16enf);
        usecod.setBounds(56, 200, 190, 30);
        usecod.setForeground(navy);//lbl for txt
        pscod.setBounds(56, 290, 120, 30);
        pscod.setForeground(navy);//lbl for pss

        userNumTF.setBounds(56, 230, 360, 40);//txt code
        userNumTF.setHorizontalAlignment(JTextField.CENTER);
        userNumTF.setBorder(new LineBorder(navy, 1, true));
        pass.setHorizontalAlignment(JTextField.CENTER);

        pass.setBounds(56, 320, 360, 40);
        userNumTF.requestFocusInWindow();
        main.add(dmode);
        dmode.setBounds(410, 0, 70, 20);
        main.add(wmode);
        wmode.setBounds(410, -40, 70, 20);
        wmode.setBackground(navy);
        wmode.setForeground(Color.YELLOW);
        dmode.setBorderPainted(true);
        wmode.setBorderPainted(true);

        wrongser.setForeground(Color.red);
        wrongser.setBounds(56, 265, 360, 25);
        wrongser.setVisible(false);
        main.add(wrongser);
        wrongpass.setForeground(Color.red);
        wrongpass.setBounds(56, 355, 360, 25);
        wrongpass.setVisible(false);
        main.add(wrongpass);
        userNumTF.setText(xx.acc.get(0));

    }

    ///\\\
    public void ifExit() throws InterruptedException {
//        screena.remove(inquiry);
//        screena.remove(withdraw);
//        screena.remove(donate);
//        screena.remove(deposit);
//        screena.remove(transfer);
//        displayPanel(new Rectangle(93, 0, 500, 420), main, "Thank YOU for", 30000);

        //  screena.wait(1000);
    }
///\\\

    public void ifTransfer() {

        TransformMoney trnsfer = new TransformMoney();
        trnsfer.setVisible(true);

    }

    public void ifBalanceInquir() {
        ChBalance display = new ChBalance();
        display.setVisible(true);

    }

    public void ifDeposit() {
        Deposit deposite = new Deposit();
        deposite.setVisible(true);

    }

    public void ifDonation() {
        Donate dont = new Donate();
        dont.setVisible(true);
    }

    public void ifWithdraw() {
        Withdraw widthw = new Withdraw();
        widthw.setVisible(true);
    }
///\\\

//    public static void displayPanel(Rectangle bounds, JPanel pane, String message, int mls) {
//
//        JPanel panel = new JPanel();
//        JLabel label = new JLabel(message);
//        label.setFont(new Font("itilic", Font.BOLD, 36));
//        label.setBounds(95, 115, 390, 70);
//        label.setForeground(Color.WHITE);
//        panel.add(label);
//
//        pane.add(panel);
//
//        panel.setBounds(bounds);
////         panel.setLocation(0,0);
//
//        panel.setBackground(Color.DARK_GRAY);
//        pane.setVisible(true);
//
//        Timer timer = new Timer(mls, e -> {
//            panel.setVisible(false);
//        });
//
//        timer.setRepeats(false);
//        timer.start();
//    }
    ////
    private class act implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == tab) {
                xx.setVisible(true);
                requestFocus();
            }
//////

            if (e.getSource() == keys[0]) {
                if (userNumTF.isEditable()) {
                    userNumTF.setText(userNumTF.getText() + "1");
                } else {
                    if (pass.getText().length() < 4) {
                        zpass += "1";
                        pass.setText(pass.getText() + "*");
                    }
                }

            }
            if (e.getSource() == keys[1]) {
                if (userNumTF.isEditable()) {
                    userNumTF.setText(userNumTF.getText() + "2");
                } else {
                    if (pass.getText().length() < 4) {
                        zpass += "2";
                        pass.setText(pass.getText() + "*");
                    }
                }
            }
            if (e.getSource() == keys[2]) {
                if (userNumTF.isEditable()) {
                    userNumTF.setText(userNumTF.getText() + "3");
                } else {
                    if (pass.getText().length() < 4) {
                        zpass += "3";
                        pass.setText(pass.getText() + "*");
                    }
                }
            }
            if (e.getSource() == keys[3]) {
                if (userNumTF.isEditable()) {
                    userNumTF.setText(userNumTF.getText() + "4");
                } else {
                    if (pass.getText().length() < 4) {
                        zpass += "4";
                        pass.setText(pass.getText() + "*");
                    }
                }
            }
            if (e.getSource() == keys[4]) {
                if (userNumTF.isEditable()) {
                    userNumTF.setText(userNumTF.getText() + "5");
                } else {
                    if (pass.getText().length() < 4) {
                        zpass += "5";
                        pass.setText(pass.getText() + "*");
                    }
                }
            }
            if (e.getSource() == keys[5]) {
                if (userNumTF.isEditable()) {
                    userNumTF.setText(userNumTF.getText() + "6");
                } else {
                    if (pass.getText().length() < 4) {
                        zpass += "6";
                        pass.setText(pass.getText() + "*");
                    }
                }
            }
            if (e.getSource() == keys[6]) {
                if (userNumTF.isEditable()) {
                    userNumTF.setText(userNumTF.getText() + "7");
                } else {
                    if (pass.getText().length() < 4) {
                        zpass += "7";
                        pass.setText(pass.getText() + "*");
                    }
                }
            }
            if (e.getSource() == keys[7]) {
                if (userNumTF.isEditable()) {
                    userNumTF.setText(userNumTF.getText() + "8");
                } else {
                    if (pass.getText().length() < 4) {
                        zpass += "8";
                        pass.setText(pass.getText() + "*");
                    }
                }
            }
            if (e.getSource() == keys[8]) {
                if (userNumTF.isEditable()) {
                    userNumTF.setText(userNumTF.getText() + "9");
                } else {
                    if (pass.getText().length() < 4) {
                        zpass += "9";
                        pass.setText(pass.getText() + "*");
                    }
                }
            }

            try {
                // Initialize to a value that indicates an error condition
                if (e.getSource() == keys[9]) {

                    if (userNumTF.isEditable()) {

                        if (userNumTF.getText().length() == 16 && xx.acc.indexOf(userNumTF.getText()) > -1) {
                            // Set the index of the account

                            pass.requestFocus();
                            userNumTF.setEditable(false);
                            main.remove(wrongser);

                        } else {
                            wrongser.setVisible(true);
                            mistake++;
                        }

                    } else if (Integer.parseInt(zpass) == Integer.parseInt(xx.passwords.get(xx.acc.indexOf(userNumTF.getText())))) {
                        index = xx.acc.indexOf(userNumTF.getText());
                        Balance = Integer.parseInt(xx.balanc.get(index));
                        wrongpass.setVisible(false);
                        History.getInstance().writeTransaction("User " + (index + 1) + " Logged in");
                        xx.dispose();
                        Transactions transactions = new Transactions();
                        userNumTF.setEditable(true);
                        userNumTF.getCaret();
                        userNumTF.setText("");
                        pass.setText("");
                        xx.Elmtrix();
                        xx.setTheTable();
                        mistake = 0;
                    } else {
                        wrongpass.setVisible(true);
                        mistake++;
                    }
                }

            } catch (NumberFormatException ror) {

                wrongser.setForeground(Color.red);
                wrongser.setBounds(56, 265, 360, 25);

            }
            if (e.getSource() == keys[10]) {
                if (userNumTF.isEditable()) {
                    userNumTF.setText(userNumTF.getText() + "0");
                } else {
                    if (pass.getText().length() < 4) {
                        zpass += "0";
                        pass.setText(pass.getText() + "*");
                    }
                }
            }
            try {
                if (e.getSource() == keys[11]) {
                    if (userNumTF.isEditable()) {
                        String txt = userNumTF.getText();
                        userNumTF.setText(txt.substring(0, txt.length() - 1));
                    } else {
                        String dpss = pass.getText();
                        pass.setText(dpss.substring(0, dpss.length() - 1));
                        zpass = zpass.substring(0, dpss.length() - 1);
                    }
                }
            } catch (StringIndexOutOfBoundsException ere) {
            }
            if (userNumTF.getText().length() >= 16) {
                is16enf.setBackground(Color.GREEN);
            } else {
                is16enf.setBackground(Color.RED);
            }
            if (e.getSource() == dmode) {//dark
                main.setBackground(navy);
                buts.setBackground(Color.DARK_GRAY);
                wmode.setBounds(410, 0, 70, 20);
                dmode.setBounds(410, -40, 70, 20);//switch between 2 rbutns
                keys[11].setForeground(Color.YELLOW);
                keys[9].setForeground(Color.YELLOW);
                usecod.setForeground(new Color(120, 120, 120));
                pscod.setForeground(new Color(120, 120, 120));
                FBB.setForeground(new Color(246, 76, 34));
                welc.setForeground(new Color(246, 76, 34));
                userNumTF.setBackground(new Color(38, 38, 38));
                userNumTF.setForeground(new Color(255, 255, 255));
                userNumTF.setCaretColor(new Color(246, 76, 34));
                userNumTF.setBorder(new LineBorder(new Color(246, 76, 34), 1));
                pass.setBorder(new LineBorder(new Color(246, 76, 34), 1));
                pass.setBackground(new Color(38, 38, 38));
                pass.setForeground(new Color(255, 255, 255));
                pass.setCaretColor(new Color(246, 76, 34));
                tab.setBackground(new Color(246, 76, 34));
                dappear = true;
            }
            if (e.getSource() == wmode) {//lite
                main.setBackground(lite);
                buts.setBackground(Color.LIGHT_GRAY);
                dmode.setBounds(410, 0, 70, 20);
                wmode.setBounds(410, -40, 70, 20);//switch between 2 rbutns
                keys[11].setForeground(new Color(125, 0, 0));
                keys[9].setForeground(new Color(22, 32, 20));
                usecod.setForeground(navy);
                pscod.setForeground(navy);
                FBB.setForeground(navy);
                welc.setForeground(navy);
                userNumTF.setBackground(new Color(255, 255, 255));
                userNumTF.setForeground(new Color(51, 51, 51));
                userNumTF.setCaretColor(Color.BLACK);
                userNumTF.setBorder(new LineBorder(navy, 1, true));
                pass.setBackground(new Color(255, 255, 255));
                pass.setForeground(new Color(51, 51, 51));
                pass.setCaretColor(Color.BLACK);
                pass.setBorder(new LineBorder(navy, 1, true));
                tab.setBackground(new Color(229, 237, 246));
                dappear = false;

            }
            if (mistake >= 3) {
//                displayPanel(new Rectangle(93, 0, 500, 420), main, "Thank YOU", 3500);
                History.getInstance().closeWriter();
                dispose();
                System.exit(0);
            }
        }

    }

    static class Accounts extends JFrame implements ActionListener {

        Random rand;
        ArrayList<String> acc = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();
        ArrayList<String> balanc = new ArrayList<>();
        String[] columnNames = {"", "Usercode", "Passcode", "Balance"};

        JTable table;
        int numRows = 3;
        Object[][] data = new Object[numRows][4];
        JButton generate = new JButton("Generate");

        JScrollPane scrollPane;
//        = new JScrollPane(table);

        public Accounts() {
            defaulting_set();
            makeAccountAndPassword();
            Elmtrix();
            setTheTable();
            theButt();
        }

        public void defaulting_set() {
            setUndecorated(true);
            setResizable(true);
//        setVisible(true);
            setLayout(null);
            this.setLocation(50, 200);
            this.setTitle("Accounts");
            this.setSize(450, 100);
            this.getContentPane().setBackground(Color.WHITE);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        public void makeAccountAndPassword() {
            rand = new Random();
            for (int i = 0; i < 15; i++) {
                String useri = Long.toString((long) (rand.nextDouble() * (9999999999999999L - 1000000000000000L) + 1000000000000000L));
                String passnumi = Integer.toString(rand.nextInt(9000) + 1000);
                passwords.add(passnumi);
                acc.add(useri);
                balanc.add("10000");
            }
        }

        public void Elmtrix() {
            for (int i = 0; i < numRows; i++) {
                data[i][0] = "User " + (i + 1);
                data[i][1] = acc.get(i);
                data[i][2] = passwords.get(i);
                data[i][3] = balanc.get(i);
            }
        }

        public void theButt() {
            generate.setBounds(160, 74, 145, 20);
            add(generate);
            generate.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == generate) {
                if (numRows < 15) {
                    numRows++;
                    Object[][] newData = new Object[numRows][4];
                    for (int i = 0; i < numRows - 1; i++) {
                        newData[i][0] = data[i][0];
                        newData[i][1] = data[i][1];
                        newData[i][2] = data[i][2];
                        newData[i][3] = data[i][3];
//                    System.out.println(acc.get(i)+" \t"+passwords.get(i));
                    }

//                String useri = Long.toString((long) (rand.nextDouble() * (9999999999999999L - 1000000000000000L) + 1000000000000000L));
//                String passnumi = Integer.toString(rand.nextInt(9000) + 1000);
                    newData[numRows - 1][0] = "User " + numRows;
                    newData[numRows - 1][1] = acc.get(numRows - 1);
                    newData[numRows - 1][2] = passwords.get(numRows - 1);
                    newData[numRows - 1][3] = balanc.get(numRows - 1);
                    data = newData;
                    table.setModel(new DefaultTableModel(data, columnNames));
                    table.setBounds(0, 0, 450, table.getHeight() + 16);
                    table.getColumnModel().getColumn(0).setPreferredWidth(26); // Set preferred width for the first column
                    table.getColumnModel().getColumn(2).setPreferredWidth(26); // Set preferred width for the first column
                    this.setSize(getWidth(), getHeight() + 16);
                    generate.setBounds(160, generate.getY() + 16, 145, 20);
                    scrollPane.setBounds(0, 0, 450, scrollPane.getHeight() + 16);
                } else {
                    generate.setEnabled(false);
                }
            }
        }

        public void setTheTable() {
            this.table = new JTable(data, columnNames);
            table.setEnabled(false);
            table.setBounds(0, 0, 450, 60);
            table.getColumnModel().getColumn(0).setPreferredWidth(26); // Set preferred width for the first column
            table.getColumnModel().getColumn(2).setPreferredWidth(26); // Set preferred width for the first column
            scrollPane = new JScrollPane(table);
            scrollPane.setBounds(0, 0, 450, 70); // Set the bounds of the scroll pane
//          table.setFillsViewportHeight(true);
            this.add(scrollPane); // Add the scroll pane to the frame
            table.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);

        }
    }

///////////////
    private class mouseAct implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            tab.setBounds(0, 0, 105, 25);
            tab.setText("Accounts");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            tab.setBounds(0, 0, 25, 25);
            tab.setText("");
        }

    }
}
