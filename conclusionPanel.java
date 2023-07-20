package GameDownload;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class conclusionPanel extends JFrame{
    private JButton exitButton;
    private JPanel finishPanel;

    public conclusionPanel() {
        add(finishPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(250,250);
        setTitle("Finish!!");


        exitButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null,"Gözləyin...");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
            JOptionPane.showMessageDialog(conclusionPanel.this,"Çıxış edildi!");
            System.exit(0);

        });
    }
}
