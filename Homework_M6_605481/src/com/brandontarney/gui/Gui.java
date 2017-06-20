/**
 * GUI Class
 * - The view & controller in a Quasi M-V-C architecture
 *
 * @author Brandon Tarney
 * @since 6/17/2017
 */
package com.brandontarney.gui;

import javax.swing.JComboBox;
import com.sun.xml.internal.ws.util.StringUtils;

import com.brandontarney.bookingrate.BookingDay;
import com.brandontarney.bookingrate.Rates;
import com.brandontarney.bookingrate.BookingSummary;

import com.brandontarney.controller.Controller;
import com.brandontarney.controller.BadRateException;
import javax.swing.JOptionPane;

/** GUI (View - MVC) 
 *  - MVC Architecture: "Gui" = View, "Controller" = Controller, "Rates" = Model
 *
 */
public class Gui extends javax.swing.JFrame {

    private Rates rate;
    private int year;
    private int month;
    private int day;
    private int duration;

    /**
     * Creates new form Gui
     */
    public Gui() {
        initComponents();
    }

    /**
     * Initializes GUI elements
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        javax.swing.JComboBox<String> hikeList = new javax.swing.JComboBox<String>();
        titleLabel = new javax.swing.JLabel();
        hikeLabel = new javax.swing.JLabel();
        yearLabel = new javax.swing.JLabel();
        monthLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        durationlabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailsText = new javax.swing.JTextArea();
        costText = new javax.swing.JTextField();
        costLabel = new javax.swing.JLabel();
        detailsLabel = new javax.swing.JLabel();
        yearList = new javax.swing.JComboBox<String>();
        monthList = new javax.swing.JComboBox<String>();
        dayList = new javax.swing.JComboBox<String>();
        submitButton = new javax.swing.JButton();
        durationList = new javax.swing.JComboBox<String>();

        jButton1.setText("Submit");

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Beartooth Hiking Company (BHC)");
        setBackground(new java.awt.Color(168, 149, 90));
        setForeground(new java.awt.Color(168, 148, 90));

        hikeList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        hikeList.setName("hikeList"); // NOI18N
        hikeList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hikeListActionPerformed(evt);
            }
        });
        hikeList.removeAllItems();
        hikeList.addItem("HELLROARING (easy)");
        hikeList.addItem("GARDINER (intermediate)");
        hikeList.addItem("BEATEN (difficult)");

        titleLabel.setBackground(new java.awt.Color(168, 148, 90));
        titleLabel.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        titleLabel.setText("Book a Hike");

        hikeLabel.setText("Hike");

        yearLabel.setText("Year");

        monthLabel.setText("Month");

        dateLabel.setText("Date");

        durationlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        durationlabel.setText("Duration (Season 6/1 - 10/1)");

        detailsText.setColumns(20);
        detailsText.setRows(5);
        detailsText.setName("detailsText"); // NOI18N
        jScrollPane1.setViewportView(detailsText);

        costText.setText("$000.00");
        costText.setName("costText"); // NOI18N
        costText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costTextActionPerformed(evt);
            }
        });

        costLabel.setText("Cost");

        detailsLabel.setText("Details");

        yearList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        yearList.setName("yearList"); // NOI18N
        yearList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearListActionPerformed(evt);
            }
        });
        yearList.removeAllItems();
        yearList.addItem("2017");
        yearList.addItem("2018");
        yearList.addItem("2019");
        yearList.addItem("2020");

        monthList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        monthList.setName("monthList"); // NOI18N
        monthList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthListActionPerformed(evt);
            }
        });
        monthList.removeAllItems();
        monthList.addItem("6");
        monthList.addItem("7");
        monthList.addItem("8");
        monthList.addItem("9");

        dayList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        dayList.setName("dayList"); // NOI18N
        dayList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayListActionPerformed(evt);
            }
        });
        dayList.removeAllItems();
        dayList.addItem("1");
        dayList.addItem("2");
        dayList.addItem("3");
        dayList.addItem("4");
        dayList.addItem("5");
        dayList.addItem("6");
        dayList.addItem("7");
        dayList.addItem("8");
        dayList.addItem("9");
        dayList.addItem("10");
        dayList.addItem("11");
        dayList.addItem("12");
        dayList.addItem("13");
        dayList.addItem("14");
        dayList.addItem("15");
        dayList.addItem("16");
        dayList.addItem("17");
        dayList.addItem("18");
        dayList.addItem("19");
        dayList.addItem("20");
        dayList.addItem("21");
        dayList.addItem("22");
        dayList.addItem("23");
        dayList.addItem("24");
        dayList.addItem("25");
        dayList.addItem("26");
        dayList.addItem("27");
        dayList.addItem("28");
        dayList.addItem("29");
        dayList.addItem("30");
        dayList.addItem("31");

        submitButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        durationList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        durationList.setName("durationList"); // NOI18N
        durationList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationListActionPerformed(evt);
            }
        });
        durationList.removeAllItems();
        durationList.addItem("2");
        durationList.addItem("3");
        durationList.addItem("4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(190, Short.MAX_VALUE)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(hikeLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hikeList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titleLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(durationList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(durationlabel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(costText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(detailsLabel)
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(yearLabel)
                        .addGap(44, 44, 44)
                        .addComponent(monthLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(yearList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(monthList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(dateLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dayList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hikeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hikeList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monthLabel)
                    .addComponent(dateLabel)
                    .addComponent(yearLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monthList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(durationlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(durationList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detailsLabel)
                    .addComponent(costLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void costTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costTextActionPerformed
        //Do Nothing
    }//GEN-LAST:event_costTextActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        try {
            Gui.this.rate = Controller.computeRate(
                    Gui.this.rate, Gui.this.duration, Gui.this.year, Gui.this.month, Gui.this.day);

            double cost = Gui.this.rate.getCost();
            Gui.this.costText.setText("$" + Double.toString(cost));

            String details = BookingSummary.summarize(Gui.this.rate);
            Gui.this.detailsText.setText(details);
        } catch (BadRateException exception) {
            //JOptionDialog
            JOptionPane.showMessageDialog(this, exception.getMessage(), "ERROR", 0);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void hikeListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hikeListActionPerformed
        JComboBox hikeBox = (JComboBox) evt.getSource();
        String selectedItem = (String) hikeBox.getSelectedItem();
        if (selectedItem == null) {
            //Handle callbacks when things are uninitialized
        } else {
            int[] durations;
            switch (selectedItem) {
                case "HELLROARING (easy)":
                    //System.out.println((String) hikeBox.getSelectedItem());
                    Gui.this.rate = new Rates(Rates.HIKE.HELLROARING);
                    durations = Gui.this.rate.getDurations();
                    Gui.this.durationList.removeAllItems();
                    for (int idx = 0; idx < durations.length; idx++) {
                        Gui.this.durationList.addItem(Integer.toString(durations[idx]));
                    }
                    break;
                case "GARDINER (intermediate)":
                    //System.out.println((String) hikeBox.getSelectedItem());
                    Gui.this.rate = new Rates(Rates.HIKE.GARDINER);
                    durations = Gui.this.rate.getDurations();
                    Gui.this.durationList.removeAllItems();
                    for (int idx = 0; idx < durations.length; idx++) {
                        Gui.this.durationList.addItem(Integer.toString(durations[idx]));
                    }
                    break;

                case "BEATEN (difficult)":
                    //System.out.println((String) hikeBox.getSelectedItem());
                    Gui.this.rate = new Rates(Rates.HIKE.BEATEN);
                    durations = Gui.this.rate.getDurations();
                    Gui.this.durationList.removeAllItems();
                    for (int idx = 0; idx < durations.length; idx++) {
                        Gui.this.durationList.addItem(Integer.toString(durations[idx]));
                    }

                    break;
                default:
                    //System.out.println("ERROR");
                    durations = new int[0];
                    Gui.this.rate = new Rates(Rates.HIKE.GARDINER);
                    Gui.this.durationList.removeAllItems();
                    for (int idx = 0; idx < durations.length; idx++) {
                        Gui.this.durationList.addItem(Integer.toString(durations[idx]));
                    }
            }
            blankText();
        }
    }//GEN-LAST:event_hikeListActionPerformed

    private void yearListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearListActionPerformed
        JComboBox yearBox = (JComboBox) evt.getSource();
        String selectedItem = (String) yearBox.getSelectedItem();
        if (selectedItem == null) {
            //Handle callbacks when things are uninitialized
        } else {
            try {
                String tmpYear = (String) ((JComboBox) evt.getSource()).getSelectedItem();
                Gui.this.year = Integer.parseInt(tmpYear);
            } catch (NumberFormatException e) {
                //System.out.println(e.toString());
                Gui.this.year = 0;
            }
            blankText();
        }
    }//GEN-LAST:event_yearListActionPerformed

    private void monthListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthListActionPerformed
        JComboBox monthBox = (JComboBox) evt.getSource();
        String selectedItem = (String) monthBox.getSelectedItem();
        if (selectedItem == null) {
            //Handle callbacks when things are uninitialized
        } else {
            try {
                String tmpMonth = (String) ((JComboBox) evt.getSource()).getSelectedItem();
                Gui.this.month = Integer.parseInt(tmpMonth);
            } catch (NumberFormatException e) {
                //System.out.println(e.toString());
                Gui.this.month = 0;
            }
            blankText();
        }
    }//GEN-LAST:event_monthListActionPerformed

    private void dayListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayListActionPerformed
        JComboBox dayBox = (JComboBox) evt.getSource();
        String selectedItem = (String) dayBox.getSelectedItem();
        if (selectedItem == null) {
            //Handle callbacks when things are uninitialized
        } else {
            try {
                String tmpDay = (String) ((JComboBox) evt.getSource()).getSelectedItem();
                Gui.this.day = Integer.parseInt(tmpDay);
            } catch (NumberFormatException e) {
                //System.out.println(e.toString());
                Gui.this.day = 0;
            }
            blankText();
        }
    }//GEN-LAST:event_dayListActionPerformed

    private void durationListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationListActionPerformed
        JComboBox durationBox = (JComboBox) evt.getSource();
        String selectedItem = (String) durationBox.getSelectedItem();
        if (selectedItem == null) {
            //Handle callbacks when things are uninitialized
        } else {
            try {
                String tmpDuration = (String) ((JComboBox) evt.getSource()).getSelectedItem();
                Gui.this.duration = Integer.parseInt(tmpDuration);
            } catch (NumberFormatException e) {
                //System.out.println(e.toString());
                Gui.this.duration = 0;
            }
            blankText();
        }
    }//GEN-LAST:event_durationListActionPerformed
    
    /** Clear the text fields on the GUI
     */
    private void blankText() {
        Gui.this.costText.setText("$000.00");
        Gui.this.detailsText.setText("");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel costLabel;
    private javax.swing.JTextField costText;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JComboBox<String> dayList;
    private javax.swing.JLabel detailsLabel;
    private javax.swing.JTextArea detailsText;
    private javax.swing.JComboBox<String> durationList;
    private javax.swing.JLabel durationlabel;
    private javax.swing.JLabel hikeLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel monthLabel;
    private javax.swing.JComboBox<String> monthList;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel yearLabel;
    private javax.swing.JComboBox<String> yearList;
    // End of variables declaration//GEN-END:variables
}
