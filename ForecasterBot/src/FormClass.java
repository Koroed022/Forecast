import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class FormClass extends JDialog {

    private JPanel panel;
    private JLabel label1;
    private JLabel label2;
    public static String zadacha;
    public static FormClass dialog;
    private JButton button1;
    private JTextArea textArea2;



    public FormClass() {


        setContentPane(panel);
        //setModal(true);
        getRootPane().setDefaultButton(button1);

        try {
            button1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    zadacha = textArea2.getText();
                    if (zadacha.equals("")) {
                        textArea2.setText("Введите задачу");
                    } else textArea2.setText("Идет сканирование...");
                    Scanning scanning = new Scanning();
                    Thread scan = new Thread(scanning);
                    scan.start();
                    //resulArea.setText("Победит команда: " + "");//вставить победителя из стратегий
                }
            });
            setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        } catch (IllegalComponentStateException illegalComponentStateException) {
            System.out.println(illegalComponentStateException.toString());
        }
    }



    public static void CteateForm() {
        dialog = new FormClass();

        dialog.pack();
        dialog.setTitle("Forecast Bot");
        dialog.setLocation(500, 300);
        dialog.setSize(500, 300);
        dialog.setLocationByPlatform(true);
        dialog.setVisible(true);

    }

}

