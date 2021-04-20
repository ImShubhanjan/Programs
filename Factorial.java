import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        fact ob = new fact();

    }
}
class fact extends JFrame implements ActionListener {
    JTextField t1;
    JButton b;
    JLabel l;
    JScrollPane s1;
    public fact() {
        t1 = new JTextField(10);
        b = new JButton("Calculate");
        l = new JLabel("Result");
//        s1 = new JScrollPane(JFrame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        add(t1);
        add(b);
        add(l);
        add(s1);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(300, 500);
//        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        int num = Integer.parseInt(t1.getText());

        BigInteger factorial = BigInteger.ONE;
        if(num != 0) {
            for (int i = num; i >= 2; i--) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
        }
        l.setText(factorial + " ");
    }
}
