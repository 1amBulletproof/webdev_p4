/**
 * Display Playground: mess around with GUIs
 * @author Brandon Tarney
 * @since 6/15/2017
 */

package com.brandontarney.gui;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.util.Vector;

/**
 *
 * @author evansrb1
 */
public class DisplayPlayground extends JFrame implements ActionListener{
    
    private final DefaultListModel model = new DefaultListModel();
    private final JComboBox box;
    
    /** Creates a new instance of DisplayPlayground */
    public DisplayPlayground() {
        super("JComboBox");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Vector<String> listOfThings = new Vector<String>(3);
        listOfThings.add("Thing1");
        listOfThings.add("Thing2");
        listOfThings.add("Thing3");
        box = new JComboBox(listOfThings);
        box.addActionListener(this);
        add(box);
     }
    
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        JComboBox myBox = (JComboBox)e.getSource();
        System.out.println(myBox.getSelectedItem());
        
    }
    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DisplayPlayground main = new DisplayPlayground();
        main.pack();
        main.setVisible(true);
    }
    
}
