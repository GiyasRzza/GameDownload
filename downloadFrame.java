package GameDownload;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;

public class downloadFrame extends JFrame{
    private JProgressBar progress;
    private JButton readyButton;
    private JPanel mainPanel;
    private JLabel message;
    private int value;

    public downloadFrame() {
    add(mainPanel);
    setSize(400,400);
    setVisible(true);
    setTitle("Downloading");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    readyButton.addActionListener(e -> {
        Timer time = new Timer(50,null);
         time.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 value++;
                 progress.setValue(value);
                 if (progress.getValue()==100){

                     setVisible(false);
                     conclusionPanel conclusionPanel = new conclusionPanel();
                     time.stop();


                 }
             }
         });
        time.start();
        });
}
}
