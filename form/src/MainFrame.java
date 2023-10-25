import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class MainFrame extends JFrame {
    final private Font mainFont = new Font("Comic Sans MS", Font.BOLD, 18);
    final private Font sFont = new Font("Comic Sans MS", Font.BOLD, 50);
    JTextField tfFirstName, tfLastName;
    JLabel lbWelcome;
    ImageIcon img;
    JLabel l;

    public void a(){
        //Panel formularza
        JLabel lbFirstName = new JLabel("First Name");
        lbFirstName.setFont(mainFont);

        tfFirstName = new JTextField();
        tfFirstName.setFont(mainFont);
        //--------------
        JLabel lbLastName = new JLabel("Last Name");
        lbLastName.setFont(mainFont);

        tfLastName = new JTextField();
        tfLastName.setFont(mainFont);


        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(5, 1, 5, 5));
        formPanel.add(lbFirstName);
        formPanel.add(tfFirstName);
        formPanel.add(lbLastName);
        formPanel.add(tfLastName);



        //Panel witający
        lbWelcome = new JLabel();
        lbWelcome.setFont(sFont);
        lbWelcome.setForeground(Color.WHITE);


        //Przyciski
        JButton btnOK = new JButton("OK");
        btnOK.setFont(mainFont);
        btnOK.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String firstName = tfFirstName.getText();
                String lastName = tfLastName.getText();
                lbWelcome.setText("Witaj " + firstName + " " + lastName);
            }
            
        });


        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                tfFirstName.setText("");
                tfLastName.setText("");
                lbWelcome.setText("");
            }

        });

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonsPanel.add(btnOK);
        buttonsPanel.add(btnClear);

        img = new ImageIcon("five-nights-at-freddy-default-dance.gif");
        l = new JLabel("", img, JLabel.CENTER);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(62, 62, 63));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(lbWelcome, BorderLayout.CENTER);
        mainPanel.add(l, BorderLayout.EAST);
        mainPanel.add(lbWelcome, BorderLayout.WEST);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);


        add(mainPanel);
        
        setTitle("aha.");
        setSize(500,600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args){
        MainFrame myFrame = new MainFrame();
        myFrame.a();


    }
    
}
