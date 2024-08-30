import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame
{
    final private Font maiFont = new Font("segoe print",Font.BOLD,18);
    JTextField tfFirstname;
    JTextField tfLastname;
    JLabel lbWelcome;
    public void initialize(){

     JLabel lbFirstname =new JLabel("First Name");
     lbFirstname.setFont(maiFont);

     JLabel lbLastname =new JLabel("Last Name");
     lbLastname.setFont(maiFont);
   
     tfFirstname = new JTextField();
     tfFirstname.setFont(maiFont);

     tfLastname = new JTextField();
     tfLastname.setFont(maiFont);

     JPanel formPanel =new JPanel();
     formPanel.setLayout(new GridLayout(4,1,5,5));

     formPanel.add(lbFirstname);
     formPanel.add(tfFirstname);
     formPanel.add(lbLastname);
     formPanel.add(tfLastname);



     lbWelcome = new JLabel();
     lbWelcome.setFont(maiFont);



     JButton btnOK =new JButton("oK");
     btnOK.setFont( maiFont);
    btnOK.addActionListener(new ActionListener() 
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            String Firstname = tfFirstname.getText();
            String Lastname = tfLastname.getText();
            lbWelcome.setText("Hello " + Firstname + " " + Lastname);

        }
        
    });


    JButton btnClear =new JButton("Clear");
    btnClear.setFont( maiFont);
    btnClear.addActionListener(new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent e) {
           

         tfFirstname.setText("");
         tfLastname.setText("");
         lbWelcome.setText("");

        }

    });






        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1,2,5,5));
        buttonPanel.add(btnOK);
        buttonPanel.add(btnClear);



        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128,128,255));
        mainPanel.add(formPanel ,BorderLayout.NORTH);
        mainPanel.add(lbWelcome,BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(mainPanel);
        setTitle("welcome");
        setSize(500,600);
        setMaximumSize(new Dimension(300,400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    


    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }
}