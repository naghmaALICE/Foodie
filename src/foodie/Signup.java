package foodie;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Signup {

    private JFrame frame;
    private JLabel signupLabel, nameLabel, passwordLabel, passwordReEnterLabel, addressLabel, MobileNoLabel;
    private JTextField nameTextField, passwordTextField, passwordReEnterTextField, addressTextField, MobileNoTextField;
    private JButton signupButton;

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

        signupLabel = new JLabel("Sign-Up");
        signupLabel.setFont(new Font("gabriola", Font.BOLD | Font.ITALIC, 80));
        signupLabel.setForeground(Color.white);
        signupLabel.setSize(350, 150);
        signupLabel.setLocation(400, 50);

        nameLabel = new JLabel("Name:");
        nameLabel.setForeground(Color.white);
        nameLabel.setSize(150, 20);
        nameLabel.setLocation(300, 200);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setForeground(Color.white);
        passwordLabel.setBackground(Color.BLUE);
        passwordLabel.setSize(150, 20);
        passwordLabel.setLocation(300, 240);

        passwordReEnterLabel = new JLabel("Re-Enter Password:");
        passwordReEnterLabel.setForeground(Color.white);
        passwordReEnterLabel.setBackground(Color.BLUE);
        passwordReEnterLabel.setSize(150, 20);
        passwordReEnterLabel.setLocation(300, 280);

        addressLabel = new JLabel("Address:");
        addressLabel.setForeground(Color.white);
        addressLabel.setBackground(Color.BLUE);
        addressLabel.setSize(150, 20);
        addressLabel.setLocation(300, 320);

        MobileNoLabel = new JLabel("Mobile No.:");
        MobileNoLabel.setForeground(Color.white);
        MobileNoLabel.setBackground(Color.BLUE);
        MobileNoLabel.setSize(150, 20);
        MobileNoLabel.setLocation(300, 360);

        nameTextField = new JTextField();
        nameTextField.setSize(300, 20);
        nameTextField.setLocation(430, 200);

        passwordTextField = new JTextField();
        passwordTextField.setSize(300, 20);
        passwordTextField.setLocation(430, 240);

        passwordReEnterTextField = new JTextField();
        passwordReEnterTextField.setSize(300, 20);
        passwordReEnterTextField.setLocation(430, 280);

        addressTextField = new JTextField();
        addressTextField.setSize(300, 20);
        addressTextField.setLocation(430, 320);

        MobileNoTextField = new JTextField();
        MobileNoTextField.setSize(300, 20);
        MobileNoTextField.setLocation(430, 360);

        signupButton = new JButton("Sign Up");
        signupButton.setFocusPainted(false);
        signupButton.setSize(170, 30);
        signupButton.setLocation(420, 420);
        //take user-inputs and check & store to database.

        frame.add(signupLabel);

        frame.add(nameLabel);
        frame.add(passwordLabel);
        frame.add(passwordReEnterLabel);
        frame.add(addressLabel);
        frame.add(MobileNoLabel);

        frame.add(nameTextField);
        frame.add(passwordTextField);
        frame.add(passwordReEnterTextField);
        frame.add(addressTextField);
        frame.add(MobileNoTextField);

        frame.add(signupButton);

        frame.setVisible(true);
    }

    /*public static void main(String[]args) {
        new Signup().createAndShowGUI();
    }*/
}
