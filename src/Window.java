import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window {
    static JFrame frame = new JFrame("Test Window");
    static JPanel pane = new JPanel();

    static JLabel label = new JLabel("Input here:", SwingConstants.CENTER);
    static JButton submit = new JButton("Submit");
    static JTextField textInput = new JTextField();

    public static String savedInput;

    public static void wndw() {
        pane.setLayout(new GridLayout(3, 1));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane();
        frame.setContentPane(pane);
        frame.setSize(960, 540);
        frame.setVisible(true);

        pane.add(label);
        label.setLocation(1, 1);
        label.setVisible(true);

        pane.add(textInput);
        textInput.setLocation(2, 1);
        textInput.setVisible(true);

        pane.add(submit);
        submit.setLocation(3, 1);
        submit.setVisible(true);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                savedInput = textInput.getText();
                textInput.requestFocus();
            }
        });
    }

}
