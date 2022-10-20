package net.javaguides.springboot.Image;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Image extends JFrame {
    JLabel L1;
    public Image (){
        setTitle("Background image");
        setSize(700,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BorderLayout());

        setContentPane(new JLabel(new ImageIcon("C:\\Users\\Ivan\\Desktop\\images.jpg")));
        setLayout(new FlowLayout());
        L1 =new JLabel();
        add(L1);
        setSize(500,500);
    }
    public void main(String args []){
        new Image();
    }
}
