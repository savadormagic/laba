import javax.swing.*;
import java.awt.event.ActionListener;

public class GUIT  extends JFrame {

    Shop shop = new Shop();
    int am;
    int i = 0;
    private JButton button1 = new JButton("add");
    private JButton button2 = new JButton("show All");
    private JButton button3 = new JButton("show certain");
    private JButton button4 = new JButton("sell");
    private JButton button5 = new JButton("add Amount");
    private JTextField textField1 = new JTextField("", 15);
    private JTextField textField2 = new JTextField("", 15);
    private JTextField textField3 = new JTextField("", 15);
    private JTextField textField4 = new JTextField("", 15);
    private JTextField textField5 = new JTextField("", 15);
    private JTextField textField7 = new JTextField("", 15);
    private JTextField textField8 = new JTextField("", 15);
    private JTextField textField9 = new JTextField("", 15);
    private JLabel label1 = new JLabel();
    private JLabel label2 = new JLabel();
    private JLabel label3 = new JLabel();
    private JLabel label4 = new JLabel();
    private JLabel label5 = new JLabel();
    private JLabel label6 = new JLabel();
    private JLabel label7 = new JLabel();
    private JTextArea textArea2 = new JTextArea();
    private JPanel panel = new JPanel();
    private JScrollPane scroll = new JScrollPane(textArea2);

    public GUIT(){
        super("test");
        this.setBounds(100,100,840, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //labels
        label1.setText("Name");
        label1.setSize(90, 20);
        label1.setLocation(10, 45);

        label2.setText("Supplier");
        label2.setSize(90, 20);
        label2.setLocation(10, 70);

        label3.setText("Manufacturer");
        label3.setSize(90, 20);
        label3.setLocation(10, 95);

        label4.setText("Shelf life");
        label4.setSize(90, 20);
        label4.setLocation(10, 120);

        label5.setText("Amount");
        label5.setSize(90, 20);
        label5.setLocation(10, 145);

        label6.setText("id:");
        label6.setSize(50, 20);
        label6.setLocation(200, 20);

        label7.setText("amount:");
        label7.setSize(50, 20);
        label7.setLocation(250, 20);

        //textFields
        textField1.setSize(90, 20);
        textField1.setLocation(90, 45);

        textField2.setSize(90, 20);
        textField2.setLocation(90, 70);

        textField3.setSize(90, 20);
        textField3.setLocation(90, 95);

        textField4.setSize(90, 20);
        textField4.setLocation(90, 120);

        textField5.setSize(90, 20);
        textField5.setLocation(90, 145);

        textField7.setSize(30, 20);
        textField7.setLocation(300, 20);

        textField8.setSize(30, 20);
        textField8.setLocation(217, 20);

        //textAreas

        textArea2.setSize(550, 200);
        textArea2.setLocation(200, 45);

        scroll.setSize(550, 200);
        scroll.setLocation(200, 45);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        //buttons
        button1.setSize(90, 20);
        button1.setLocation(90, 20);

        button2.setSize(90, 20);
        button2.setLocation(520, 20);

        button3.setSize(110, 20);
        button3.setLocation(615, 20);

        button4.setSize(70, 20);
        button4.setLocation(335, 20);

        button5.setSize(105, 20);
        button5.setLocation(410, 20);
        setLayout(null);

        button1.addActionListener(actionListener());
        button2.addActionListener(actionListener2());
        button3.addActionListener(actionListener3());
        button4.addActionListener(actionListener4());
        button5.addActionListener(actionListener5());

        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        /*add(textArea2);*/
        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(label5);
        add(label6);
        add(label7);
        add(textField1);
        add(textField2);
        add(textField3);
        add(textField4);
        add(textField5);
        add(textField7);
        add(textField8);
        add(scroll);
    }

    public void addAmount(int id){
        int am = Integer.parseInt(textField7.getText());
        shop.pharmacy.get(id).setAmount(shop.pharmacy.get(id).getAmount() + am);
        textArea2.setText("updated: \n" + (shop.showCertain(id)));
    }

    public void sell(int id){
        for (int i = 0; i <= shop.pharmacy.size(); i++) {
            int am = Integer.parseInt(textField7.getText());
            if(id == i && am <= shop.pharmacy.get(i).getAmount()){
                shop.pharmacy.get(i).setAmount(shop.pharmacy.get(i).getAmount() - am);
                textArea2.setText("updated: \n" + (shop.showCertain(i)));
            }
        }
    }

    private ActionListener actionListener5() {
        return e -> {
            addAmount(Integer.parseInt(textField8.getText()));
        };
    }

    private ActionListener actionListener4() {
        return e -> {
            sell(Integer.parseInt(textField8.getText()));
        };
    }

    private ActionListener actionListener3() {
        return e -> {
            if(Integer.parseInt(textField8.getText()) < shop.pharmacy.size()){
                textArea2.setText(shop.showCertain(Integer.parseInt(textField8.getText())));
            }
            else if(Integer.parseInt(textField8.getText()) > shop.pharmacy.size() - 1){
                textArea2.setText("лекарства с таким id нет");
            }

        };
    }

    private ActionListener actionListener2() {
        return e -> {
                textArea2.setText(shop.showAll());
        };
    }

    private ActionListener actionListener() {
        return e -> {
            if(textField1 != null &&
                    textField2 != null &&
                        textField3 != null &&
                            textField4 != null &&
                                textField5 != null){
                shop.addOne(textField1.getText(),
                        textField2.getText(),
                        textField3.getText(),
                        textField4.getText(),
                        am = Integer.parseInt(textField5.getText()));
                textArea2.setText(shop.showCertain(i));
                i++;
            }
        };
    }
}
