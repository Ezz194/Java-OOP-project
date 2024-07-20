package com.mycompany.bs;

import static com.mycompany.bs.Ps.index;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class ChBalance extends JFrame implements ActionListener {

    JLabel check = new JLabel();
    JPanel main = new JPanel();
    JPanel nofunc = new JPanel();
    JPanel display = new JPanel();
    JButton keys[] = new JButton[12];
    JButton R1 = new JButton();
    JButton R2 = new JButton();
    JButton R3 = new JButton();

    JButton L1 = new JButton();
    JButton L2 = new JButton();
    JButton L3 = new JButton("Back");

    public ChBalance() {
        defaulting_set();
        upper();
        lower();
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
                L3.setFont(new Font("italic", Font.CENTER_BASELINE, 19));
        L3.addActionListener(this);
        // set the font of all the buttons
        for (int i = 0; i < 12; i++) {
            keys[i].setFont(new Font("italic", Font.CENTER_BASELINE, 19));

        }
        
        if (Ps.dappear) {
            main.setBackground(Ps.navy);
            nofunc.setBackground(Color.DARK_GRAY);
 main.setBorder(new LineBorder(new Color(246, 76, 34), 1));
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
        display.add(check);
        check.setBounds(70, 200, 390, 50);
        check.setForeground(Color.WHITE);
        check.setFont(new Font("italic", Font.CENTER_BASELINE, 30));
        check.setText("Your Balance is : " + Ps.Balance + " $");
        display.add(check);

    }

    public void defaulting_set() {
        this.setUndecorated(true);
        this.setLocation(400, 100);
        this.setTitle("Balance inquiry");
        //    this.setVisible(true);
        this.setSize(680, 710);
        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(main);
        main.setBounds(0, 0, this.getWidth(), this.getHeight());
        main.setLayout(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == L3) {
            History.getInstance().writeTransaction("User "+(index+1)+" Cheecked his balance");
   
            dispose();
        }

    }

}
