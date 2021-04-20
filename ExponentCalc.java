import javax.swing.*;
import java.awt.*;

public class ExponentCalc {
    private JPanel panel1;
    private JTextField textField1;

    public static void main(String[] args) {
        Expo obj = new Expo();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        textField1 = new JTextField(150);

    }
}

class Expo extends JFrame {
    JTextField t1,t2;
    JButton b;
    JLabel l;
    public Expo() {
        setTitle("Exponent");
        t1 = new JTextField(20);
        t2 =new JTextField(20);
        b = new JButton("RUN");
        l= new JLabel("Result");

        add(t1);
        add(t2);
        add(b);
        add(l);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
