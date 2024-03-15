import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Three implements ActionListener {
    JFrame threeXThreeFrame = new JFrame();
    JPanel topPanel = new JPanel();
    JLabel topLabel = new JLabel();
    JButton menu = new JButton();
    JButton reset = new JButton();
    ImageIcon image = new ImageIcon("zaverecnapracelogo.png");
    JPanel buttonPanel = new JPanel();
    JButton[] buttons = new JButton[9];
    boolean player1Turn;

    Three() {
        topLabel.setText("3x3 - match 3 in a row / O turn");
        topLabel.setFont(new Font("Arial", Font.PLAIN, 30));
        topLabel.setBounds(0, 0, 800, 100);

        menu.addActionListener(this);
        menu.setText("Menu");
        menu.setFont(new Font("Arial Black", Font.PLAIN, 25));
        menu.setBounds(639, 25, 150, 50);
        menu.setBackground(new Color(20, 143, 119));

        reset.addActionListener(this);
        reset.setText("Reset");
        reset.setFont(new Font("Arial Black", Font.PLAIN, 25));
        reset.setBounds(464, 25, 150, 50);
        reset.setBackground(new Color(20, 143, 119));

        topPanel.setLayout(null);
        topPanel.setBackground(new Color(39, 174, 96));
        topPanel.setBounds(0, 0, 800, 100);
        topPanel.add(topLabel);
        topPanel.add(menu);
        topPanel.add(reset);

        buttonPanel.setLayout(new GridLayout(3, 3));
        buttonPanel.setBackground(new Color(170, 170, 170));
        buttonPanel.setBounds(0, 100, 800, 700);

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttonPanel.add(buttons[i]);
            buttons[i].setFont(new Font("Monospaced", Font.PLAIN, 200));
            buttons[i].setFocusable(false);
            buttons[i].setBackground(new Color(130, 224, 170 ));
            buttons[i].addActionListener(this);

        }

        threeXThreeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        threeXThreeFrame.setTitle("TicTacToe - 3x3");
        threeXThreeFrame.setResizable(false);
        threeXThreeFrame.setSize(816, 839);
        threeXThreeFrame.setVisible(true);
        threeXThreeFrame.setLayout(null);
        threeXThreeFrame.setIconImage(image.getImage());
        threeXThreeFrame.add(topPanel);
        threeXThreeFrame.add(buttonPanel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menu) {
            threeXThreeFrame.dispose();
            Meny menu1 = new Meny();
        }
        if (e.getSource() == reset) {
            threeXThreeFrame.dispose();
            Three threeXThree = new Three();
        }
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]) {
                if (player1Turn) {
                    if (buttons[i].getText().equals("")) {
                        buttons[i].setForeground(new Color(255, 0, 0));
                        buttons[i].setText("X");
                        player1Turn = false;
                        topLabel.setText("O turn");
                        check();
                    }

                } else {
                    if (buttons[i].getText().equals("")) {
                        buttons[i].setForeground(new Color(0, 0, 255));
                        buttons[i].setText("O");
                        player1Turn = true;
                        topLabel.setText("X turn");
                        check();
                    }

                }

            }

        }

    }

    public void check() {
        if (
                (buttons[0].getText().equals("X")) &&
                        (buttons[1].getText().equals("X")) &&
                        (buttons[2].getText().equals("X"))
        ) {
            xWins(0, 1, 2);
        }
        if (
                (buttons[3].getText().equals("X")) &&
                        (buttons[4].getText().equals("X")) &&
                        (buttons[5].getText().equals("X"))
        ) {
            xWins(3, 4, 5);
        }
        if (
                (buttons[6].getText().equals("X")) &&
                        (buttons[7].getText().equals("X")) &&
                        (buttons[8].getText().equals("X"))
        ) {
            xWins(6, 7, 8);
        }
        if (
                (buttons[0].getText().equals("X")) &&
                        (buttons[3].getText().equals("X")) &&
                        (buttons[6].getText().equals("X"))
        ) {
            xWins(0, 3, 6);
        }
        if (
                (buttons[1].getText().equals("X")) &&
                        (buttons[4].getText().equals("X")) &&
                        (buttons[7].getText().equals("X"))
        ) {
            xWins(1, 4, 7);
        }
        if (
                (buttons[2].getText().equals("X")) &&
                        (buttons[5].getText().equals("X")) &&
                        (buttons[8].getText().equals("X"))
        ) {
            xWins(2, 5, 8);
        }
        if (
                (buttons[0].getText().equals("X")) &&
                        (buttons[4].getText().equals("X")) &&
                        (buttons[8].getText().equals("X"))
        ) {
            xWins(0, 4, 8);
        }
        if (
                (buttons[2].getText().equals("X")) &&
                        (buttons[4].getText().equals("X")) &&
                        (buttons[6].getText().equals("X"))
        ) {
            xWins(2, 4, 6);
        }
        if (
                (buttons[0].getText().equals("O")) &&
                        (buttons[1].getText().equals("O")) &&
                        (buttons[2].getText().equals("O"))
        ) {
            oWins(0, 1, 2);
        }
        if (
                (buttons[3].getText().equals("O")) &&
                        (buttons[4].getText().equals("O")) &&
                        (buttons[5].getText().equals("O"))
        ) {
            oWins(3, 4, 5);
        }
        if (
                (buttons[6].getText().equals("O")) &&
                        (buttons[7].getText().equals("O")) &&
                        (buttons[8].getText().equals("O"))
        ) {
            oWins(6, 7, 8);
        }
        if (
                (buttons[0].getText().equals("O")) &&
                        (buttons[3].getText().equals("O")) &&
                        (buttons[6].getText().equals("O"))
        ) {
            oWins(0, 3, 6);
        }
        if (
                (buttons[1].getText().equals("O")) &&
                        (buttons[4].getText().equals("O")) &&
                        (buttons[7].getText().equals("O"))
        ) {
            oWins(1, 4, 7);
        }
        if (
                (buttons[2].getText().equals("O")) &&
                        (buttons[5].getText().equals("O")) &&
                        (buttons[8].getText().equals("O"))
        ) {
            oWins(2, 5, 8);
        }
        if (
                (buttons[0].getText().equals("O")) &&
                        (buttons[4].getText().equals("O")) &&
                        (buttons[8].getText().equals("O"))
        ) {
            oWins(0, 4, 8);
        }
        if (
                (buttons[2].getText().equals("O")) &&
                        (buttons[4].getText().equals("O")) &&
                        (buttons[6].getText().equals("O"))
        ) {
            oWins(2, 4, 6);
        }
    }


    public void xWins(int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        topLabel.setText("X wins");
    }

    public void oWins(int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        topLabel.setText("O wins");
    }
}

