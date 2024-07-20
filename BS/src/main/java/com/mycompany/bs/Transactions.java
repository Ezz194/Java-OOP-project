package com.mycompany.bs;

import static com.mycompany.bs.Ps.Balance;

import static com.mycompany.bs.Ps.dappear;
import static com.mycompany.bs.Ps.doritos;
import static com.mycompany.bs.Ps.index;
import static com.mycompany.bs.Ps.xx;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Transactions extends JFrame {

    fst1 go = new fst1();
    JButton keys[] = new JButton[12];
    JButton R1 = new JButton();
    JButton R2 = new JButton();
    JButton R3 = new JButton();

    JButton L1 = new JButton();
    JButton L2 = new JButton();
    JButton L3 = new JButton();

    ///
    JLabel inquiry = new JLabel("Balance Inquiry");
    JLabel withdraw = new JLabel("Withdraw");
    JLabel donate = new JLabel("Donate");
    JLabel deposit = new JLabel("Deposit");
    JLabel transfer = new JLabel("Tranfer Money");
    JLabel exit = new JLabel("Exit");
    JLabel nFBB = new JLabel("FBB");
    JPanel screena = new JPanel();
    JPanel main = new JPanel();
    JPanel buts = new JPanel();

    public Transactions() {
        defaulting_set();
        transport();
        scree2_set();
        butsSet();
    }

    public void defaulting_set() {
        this.setUndecorated(true);
        this.setLocation(400, 100);
        this.setTitle("Withdraw");
        this.setVisible(true);
        this.setSize(680, 710);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.add(main);
    }

    public void scree2_set() {
        screena.add(inquiry);
        screena.add(withdraw);
        screena.add(donate);
        screena.add(deposit);
        screena.add(transfer);
        screena.add(exit);
        screena.add(nFBB);
        nFBB.setBounds(70, 110, 380, 200);
        nFBB.setForeground(new Color(255, 255, 255, 30));
        nFBB.setFont(new Font("itilic", Font.ITALIC + Font.BOLD, 160));
        inquiry.setForeground(new Color(200, 200, 200));
        inquiry.setFont(new Font("italic", Font.CENTER_BASELINE, 27));
        inquiry.setBounds(10, 72, 205, 40);
        donate.setForeground(new Color(200, 200, 200));
        donate.setFont(new Font("italic", Font.CENTER_BASELINE, 27));
        donate.setBounds(55, 212, 195, 40);
        exit.setForeground(new Color(255, 200, 200));
        exit.setFont(new Font("italic", Font.CENTER_BASELINE, 27));
        exit.setBounds(75, 352, 195, 40);
        withdraw.setForeground(new Color(200, 200, 200));
        withdraw.setFont(new Font("italic", Font.CENTER_BASELINE, 27));
        withdraw.setBounds(343, 72, 195, 40);
        deposit.setForeground(new Color(200, 200, 200));
        deposit.setFont(new Font("italic", Font.CENTER_BASELINE, 27));
        deposit.setBounds(351, 212, 195, 40);
        transfer.setForeground(new Color(200, 200, 200));
        transfer.setFont(new Font("italic", Font.CENTER_BASELINE, 27));
        transfer.setBounds(287, 352, 205, 40);
        L1.addActionListener(go);
        L2.addActionListener(go);
        L3.addActionListener(go);
        R1.addActionListener(go);
        R2.addActionListener(go);
        R3.addActionListener(go);

    }

    public void transport() {
        main.setLayout(null);
        main.setBounds(0, 0, this.getWidth(), this.getHeight());

        main.add(screena);
        screena.setBounds(93, 0, 500, 420);

        //
        screena.setBackground(Color.DARK_GRAY);
        screena.setLayout(null);
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

    public void butsSet() {
        // create a panel to hold the buttons
        main.add(buts = new JPanel());
        buts.setLayout(new GridLayout(4, 3, 4, 4));
        buts.setBackground(Color.LIGHT_GRAY);
        buts.setBounds(194, 420, 300, 280);
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
        if (Ps.dappear) {
            main.setBorder(new LineBorder(new Color(246, 76, 34), 1));
            main.setBackground(Ps.navy);
            buts.setBackground(Color.DARK_GRAY);
            keys[9].setForeground(Color.YELLOW);
            keys[11].setForeground(Color.YELLOW);
        }
        L1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                inquiry.setFont(new Font("italic", Font.CENTER_BASELINE, 26));
                inquiry.setForeground(new Color(120, 120, 255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                inquiry.setFont(new Font("italic", Font.CENTER_BASELINE, 27));
                inquiry.setForeground(new Color(200, 200, 200));
            }
        });
        L2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                donate.setFont(new Font("italic", Font.CENTER_BASELINE, 26));
                donate.setForeground(new Color(120, 120, 255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                donate.setFont(new Font("italic", Font.CENTER_BASELINE, 27));
                donate.setForeground(new Color(200, 200, 200));
            }
        });
        L3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                exit.setFont(new Font("italic", Font.CENTER_BASELINE, 26));
                exit.setForeground(new Color(255, 0, 0));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                exit.setFont(new Font("italic", Font.CENTER_BASELINE, 27));
                exit.setForeground(new Color(255, 200, 200));
            }
        });

        R1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                withdraw.setFont(new Font("italic", Font.CENTER_BASELINE, 26));
                withdraw.setForeground(new Color(120, 120, 255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                withdraw.setFont(new Font("italic", Font.CENTER_BASELINE, 27));
                withdraw.setForeground(new Color(200, 200, 200));
            }
        });
        R2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                deposit.setFont(new Font("italic", Font.CENTER_BASELINE, 26));
                deposit.setForeground(new Color(120, 120, 255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deposit.setFont(new Font("italic", Font.CENTER_BASELINE, 27));
                deposit.setForeground(new Color(200, 200, 200));
            }
        });

        R3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                transfer.setFont(new Font("italic", Font.CENTER_BASELINE, 26));
                transfer.setForeground(new Color(120, 120, 255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                transfer.setFont(new Font("italic", Font.CENTER_BASELINE, 27));
                transfer.setForeground(new Color(200, 200, 200));
            }
        });

    }

    public void ifExit() throws InterruptedException {
//        screena.remove(inquiry);
//        screena.remove(withdraw);
//        screena.remove(donate);
//        screena.remove(deposit);
//        screena.remove(transfer);
        History.getInstance().writeTransaction("User " + (index + 1) + " Logged out");

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

    public void displayPanel(Rectangle bounds, JPanel pane, String message, int mls) {

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
        screena.setVisible(false);
        Timer timer = new Timer(mls, e -> {
            panel.setVisible(false);
            screena.setVisible(true);
            ((Timer) e.getSource()).stop();
        });
        timer.setRepeats(false);
        timer.start();
    }

    private class fst1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == L1) {
                ifBalanceInquir();

            }
            if (e.getSource() == L2) {
                ifDonation();

            }
            if (e.getSource() == L3) {
                xx.balanc.set(index, Integer.toString(Balance));
                xx.Elmtrix();
                xx.setTheTable();
                try {
                    ifExit();
                } catch (InterruptedException ex) {
                    ex.getStackTrace();
                }
                dispose();
//                System.exit(0);
            }
/////////////////////////////////////////////////////////////////////////////////////////////////
            if (e.getSource() == R1) {
                ifWithdraw();
//                displayPanel(new Rectangle(93, 0, 500, 420), main, "Done Successfully", 3500);              
            }
            if (e.getSource() == R2) {
                ifDeposit();
//                displayPanel(new Rectangle(93, 0, 500, 420), main, "Done Successfully", 3500);

            }
            if (e.getSource() == R3) {
                ifTransfer();

            }
            if (doritos) {
                History.getInstance().writeTransaction("Done Successfully");
//                displayPanel(new Rectangle(93, 0, 500, 420), main, "Done Successfully", 4000);
                doritos = false;
            }

        }

    }

}
