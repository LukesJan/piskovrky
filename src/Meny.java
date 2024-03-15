import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Meny implements ActionListener {
    JPanel topPanel = new JPanel();
    JPanel midTopPanel = new JPanel();
    JPanel midBottomPanel = new JPanel();
    JPanel bottomPanel = new JPanel();
    JButton threeXThreeButton = new JButton();
    JButton exitButton = new JButton();
    JLabel ticTacToeLabel = new JLabel();
    JFrame menuFrame = new JFrame();
    ImageIcon image = new ImageIcon("zaverecnapracelogo.png");

    Meny() {


        threeXThreeButton.setBounds(300, 150, 200, 100);
        threeXThreeButton.addActionListener(this);
        threeXThreeButton.setText("3x3");
        threeXThreeButton.setFont(new Font("Arial Black", Font.PLAIN, 40));
        threeXThreeButton.setHorizontalTextPosition(JButton.CENTER);
        threeXThreeButton.setBackground(new Color(39, 174, 96 ));

        exitButton.setBounds(300, 50, 200, 100);
        exitButton.addActionListener(this);
        exitButton.setText("EXIT");
        exitButton.setFont(new Font("Arial Black", Font.PLAIN, 40));
        exitButton.setHorizontalTextPosition(JButton.CENTER);
        exitButton.setBackground(new Color(20, 143, 119));

        ticTacToeLabel.setText("Tic Tac Toe");
        ticTacToeLabel.setHorizontalAlignment(JLabel.CENTER);
        ticTacToeLabel.setVerticalAlignment(JLabel.CENTER);
        ticTacToeLabel.setBounds(0, 0, 800, 200);
        ticTacToeLabel.setFont(new Font("Sneakerhead BTN Shadow", Font.PLAIN, 80));

        topPanel.setBounds(0, 0, 800, 200);
        topPanel.setBackground(new Color(39, 174, 96 ));
        topPanel.setLayout(null);
        topPanel.add(ticTacToeLabel);

        midTopPanel.setBounds(0, 200, 800, 400);
        midTopPanel.setBackground(new Color(20, 143, 119));
        midTopPanel.setLayout(null);
        midTopPanel.add(threeXThreeButton);

        /*midBottomPanel.setBounds(0, 400, 800, 200);
        midBottomPanel.setBackground(new Color(150, 200, 255));
        midBottomPanel.setLayout(null);*/

        bottomPanel.setBounds(0, 600, 800, 200);
        bottomPanel.setBackground(new Color(39, 174, 96 ));
        bottomPanel.setLayout(null);
        bottomPanel.add(exitButton);

        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuFrame.setTitle("TicTacToe - Menu");
        menuFrame.setResizable(false);
        menuFrame.setSize(816, 839);
        menuFrame.setVisible(true);
        menuFrame.setLayout(null);
        menuFrame.setIconImage(image.getImage());
        menuFrame.add(topPanel);
        menuFrame.add(midTopPanel);
        menuFrame.add(midBottomPanel);
        menuFrame.add(bottomPanel);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == threeXThreeButton) {
            menuFrame.dispose();
            Three threeXThree = new Three();
        }
        if (e.getSource() == exitButton) {
            menuFrame.dispose();
        }
    }
}

