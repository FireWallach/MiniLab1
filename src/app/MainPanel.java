/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author daw5510
 */
import javax.swing.JButton;
import javax.swing.JPanel;

public class MainPanel extends JPanel {
    MainPanel(){
        JButton blueButton = new JButton("Blue");
        add(blueButton);
    
        JButton redButton = new JButton("Red");
        add(redButton);
        
        JButton dylanButton = new JButton("Dylan");
        add(dylanButton);
        
        JButton lauraButton  = new JButton("Laura");
        add(lauraButton);
        
        JButton SteveButton = new JButton("Steve");
        add(SteveButton);
    }
}
