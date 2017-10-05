package foodie;

import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.*;

public class WelcomeFrame {

    private String[]restaurantList = {"Amenia", "China Town", "Pappu Dhaba", "Banana Leaf"};//later this will be loaded from database.

    private JFrame frame;
    private JLabel foodieLabel, selectResturantLabel;
    private JButton loginButton, signupButton, loadMenu;
    private JComboBox comboBox;
    
    public static void main(String[]args) {
        new WelcomeFrame().createAndShowGUI();
    }
    
    public void createAndShowGUI() {
        frame = new JFrame("Foodie : The Best App Ever");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);
        frame.setResizable(false);
        frame.setLocation(150, 50);
        try {
            frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File(getClass().getResource("food.PNG").toURI())))));
            //frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("D:\\Programing\\Foodie\\Foodie\\src\\foodie\\food.PNG")))));
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
        frame.setLayout(null);
        
        foodieLabel = new JLabel("Foodie");
        foodieLabel.setFont(new Font("gabriola", Font.BOLD | Font.ITALIC, 80));
        foodieLabel.setForeground(Color.white);
        foodieLabel.setSize(350, 150);
        foodieLabel.setLocation(400, 50);
        
        loginButton = new JButton("Login");
        loginButton.setFocusPainted(false);
        loginButton.setSize(170, 30);
        loginButton.setLocation(280, 200);
        
        signupButton = new JButton("SignUp");
        signupButton.setFocusPainted(false);
        signupButton.setSize(170, 30);
        signupButton.setLocation(550, 200);
        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                signupButton.setEnabled(false);//to prevent clicking twice.
                new Signup().createAndShowGUI();
                frame.setVisible(false);
            }
        });

        selectResturantLabel = new JLabel("Select Restaurant :");
        selectResturantLabel.setForeground(Color.white);
        selectResturantLabel.setSize(150, 20);
        selectResturantLabel.setLocation(380, 300);

        comboBox = new JComboBox(restaurantList);
        comboBox.setSize(100, 20);
        comboBox.setLocation(500, 300);

        loadMenu = new JButton("Load Menu");
        loadMenu.setFocusPainted(false);
        loadMenu.setSize(100, 30);
        loadMenu.setLocation(440, 380);
        
        frame.add(foodieLabel);
        frame.add(loginButton);
        frame.add(signupButton);
        frame.add(selectResturantLabel);
        frame.add(comboBox);
        frame.add(loadMenu);
        
        frame.setVisible(true);
    }
}
