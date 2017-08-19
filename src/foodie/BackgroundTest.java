package foodie;

import java.net.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.ImageIO;

public class BackgroundTest {
    JFrame frame;
    JLabel foodieLabel;
    JButton loginButton, signupButton;
    
    public static void main(String[]args) {
        new BackgroundTest().createAndShowGUI();
    }
    
    public void createAndShowGUI() {
        frame = new JFrame("Foodie : The Best App Ever");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        foodieLabel.setLocation(400, 150);
        
        loginButton = new JButton("Do some work here");
        loginButton.setFocusPainted(false);
        loginButton.setSize(170, 30);
        loginButton.setLocation(280, 300);
        
        signupButton = new JButton("Some more buttons");
        signupButton.setFocusPainted(false);
        signupButton.setSize(170, 30);
        signupButton.setLocation(550, 300);
        
        frame.add(foodieLabel);
        frame.add(loginButton);
        frame.add(signupButton);
        
        frame.setVisible(true);
    }
}
