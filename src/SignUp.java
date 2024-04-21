import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SignUp extends MioFrame implements ActionListener,WindowListener{
    JTextField t1, t2;
    JButton b1;
    JLabel l1, l2, l3, l4, l5;

    public SignUp(){
        setLayout(null);

        l3 = new JLabel("Registrati");
        l3.setFont(new Font("Times New Roman", Font.BOLD, 30));
        l3.setForeground(Color.white);
        l3.setBounds(75, 20, 300, 40);

        l4 = new JLabel("Stringing Community");
        l4.setFont(new Font("Sunny Spell Basic", Font.BOLD, 15));
        l4.setForeground(Color.white);
        l4.setBounds(250, 100, 180, 30);

        l5 = new JLabel("Più film che indiani");
        l5.setFont(new Font("Sunny Spell Basic", Font.BOLD, 15));
        l5.setForeground(Color.white);
        l5.setBounds(280, 120, 180, 30);

        l1 = new JLabel("Email:");
        l1.setBounds(60, 60, 80, 30);

        l2 = new JLabel("Password:");
        l2.setBounds(40, 100, 80, 30);

        t1 = new JTextField(60);
        t1.setBounds(100, 60, 80, 30);

        t2 = new JPasswordField(60);
        t2.setBounds(100, 100, 80, 30);

        b1 = new JButton("Sign Up");
        b1.setBounds(100, 140, 80, 30);

        b1.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileWriter fw = new FileWriter("login.txt", true);
                    fw.write(t1.getText()+"\t"+t2.getText()+"\n");
                    fw.close();
                    JFrame f = new JFrame();
                    JOptionPane.showMessageDialog(f, "Registration Completed");
                    dispose();
                }catch(Exception exception){}
            }
        }));

        try {
            BufferedImage img = ImageIO.read(getClass().getResource("logo.png")); // Change this to your image file path
            Image dimg = img.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(dimg);
            JLabel imageLabel = new JLabel(imageIcon);
            imageLabel.setBounds(0, 0, 40, 40); // Adjust position and size as needed
            add(imageLabel);
        } catch (IOException e) {
            e.printStackTrace();
        }



        add(l3);
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b1);
        add(l4);
        add(l5);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
