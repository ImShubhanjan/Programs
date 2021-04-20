import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String[] args) {
        Calculate obj = new Calculate();

    }
}
class Calculate extends JFrame implements ActionListener {
    private JTextField t1,t2;
    private JButton add_b,sub_b,mul_b,div_b;
    private JLabel l;
    public Calculate() {
        //JFrame fr = new JFrame();
        setTitle("Calculator");
//        JLabel l = new JLabel();
//        l.setText("Hello");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        add_b = new JButton("+");
        add_b.setBounds(80,30,60,40);
        sub_b = new JButton("-");
        sub_b.setBounds(80,30,60,40);
        mul_b = new JButton("*");
        mul_b.setBounds(80,30,60,40);
        div_b = new JButton("/");
        div_b.setBounds(80,30,60,40);
        l = new JLabel("Result: ");
        l.setBackground(Color.CYAN);
        add(t1);
        add(t2);
        add(add_b);
        add(sub_b);
        add(mul_b);
        add(div_b);
        add(l);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(250, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add_b.addActionListener(this);
        sub_b.addActionListener(this);
        mul_b.addActionListener(this);
        div_b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        double value;
        if (ae.getSource() == add_b) value = num1+num2;
        else if (ae.getSource() == sub_b) value = num1-num2;
        else if (ae.getSource() == mul_b) value = num1*num2;
        else value= (double)num1/num2;
        l.setText(value+" ");
    }
}
