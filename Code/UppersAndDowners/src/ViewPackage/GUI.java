/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ViewPackage;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author mg300
 */
public class GUI extends JFrame{
    private JLabel background=new JLabel(new ImageIcon("/homes/mg300/board.jpg"));

    public GUI(){
        this.setSize(560, 580);
        this.setLayout(null);
        this.setResizable(false);
        this.add(background);
        background.setBounds(0, 0, 560, 560);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        this.setVisible(true);
        //GUI!
    }
}
