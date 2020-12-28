import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {

    private JButton button1 = new JButton("Press");
    private JTextField input1 = new JTextField("", 5);
    private JLabel label1 = new JLabel("Добавить: ");
    private JRadioButton radio1 = new JRadioButton("1");
    private JRadioButton radio2 = new JRadioButton("2");
    private JCheckBox check1 = new JCheckBox("", false);

    public GUI(){
        super("ex");
        this.setBounds(100,100,400, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(5, 3, 2,2));
        container.add(label1);
        container.add(input1);

        ButtonGroup group1 = new ButtonGroup();
        group1.add(radio1);
        group1.add(radio2);

        container.add(radio1);
        radio1.setSelected(true);
        container.add(radio2);
        radio2.setSelected(false);
        container.add(check1);
        button1.addActionListener(new ButtonEvent());
        container.add(button1);
    }

    class ButtonEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "lox\n";
            message += "text: " + input1.getText() + "\n";
            message += (radio1.isSelected() ? "Radio1 " : "Radio2 ") + "is selected "  + "\n";
            message += "CheckBox is: " + ((check1.isSelected()) ? "Checked" : "Unchecked")  + "\n";
            JOptionPane.showMessageDialog(null, message, "output", JOptionPane.PLAIN_MESSAGE);

        }
    }

}
