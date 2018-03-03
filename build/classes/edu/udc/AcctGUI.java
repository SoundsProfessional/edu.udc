/*
 * Secret and Proprietary
 */
package edu.udc;

import edu.udc.*;
import edu.udc.bank.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.event.ListDataListener;

/** Both Left and Right panels have a public attribute SINGLE
 *  which is the BankCustomer object used to fill their models.
 *  Which you probably would hate.
 * 
 * I have Tofik's bankmain logic just dumped in here, but I'd rather call his function and use that file.
 *
 * @author Connor and Tofik and 
 */
public class AcctGUI extends javax.swing.JFrame {

    static UDCStudentUnion udcstudent;
    static AcctInterface[] acctarray;
    public List<BankAcctInterface> listBankInter;
    ArrayList<UDCStudentUnion.BankAccount> listBacct;
    List<BankCust> listBaCust;

    /**
     * Creates new form NewDeathPanel
     */
    public AcctGUI() {
        initDataStructures();
        if (listBaCust == null) {
            System.out.print("KEWL, inside data");
        }
       
initComponents();
        
        
        
        
        improveComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void improveComponents() {
        System.out.print(jButton1.getText());
        jButton1.setText("CLOTHES");
        jButton1.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        }
        );

        //ComboBoxModel<AcctInterface> bModel = new bankModel();
        this.jComboBox1.setModel(new bankModel());
        jComboBox1.setAutoscrolls(true);
         jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBox temp = (JComboBox)evt.getSource();
                LeftPanel.single = listBaCust.get(temp.getSelectedIndex());
                
                RightPanel.single = listBaCust.get(temp.getSelectedIndex());
                RightPanel.jComboBox1ActionPerformed(evt);
                 LeftPanel.jComboBox1ActionPerformed(evt);
            }

            
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel1 = new edu.udc.LeftPanel();
        riightPanel1 = new edu.udc.RightPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("jButton1");

        jLabel1.setText("Accounts");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(leftPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(riightPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jButton1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(riightPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(leftPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AcctGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AcctGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcctGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcctGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AcctGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private edu.udc.LeftPanel leftPanel1;
    private edu.udc.RightPanel riightPanel1;
    // End of variables declaration//GEN-END:variables

    public void initDataStructures() {
    
   
        
        UDCStudentUnion udcstudent = new UDCStudentUnion();
        AcctInterface [] acctarray = udcstudent.getStudentAccts();
        List<BankAcctInterface> listBankInter = udcstudent.getStudentAcctsList();
        List<UDCStudentUnion.BankAccount>listBacct = new ArrayList<UDCStudentUnion.BankAccount>();
        listBaCust = new ArrayList<>();
    
       
        for(BankAcctInterface bi: listBankInter){
            
            System.out.println(bi.getDepositor().getPersonID());
            System.out.println(bi.getDepositor().getStreetAddr());
            System.out.println(bi.getDepositor().getPostalCode());
            System.out.println(bi.getAcctHolder());
            System.out.println(bi.getSpecialInfo());
            System.out.println(bi.getAcctValue());
            System.out.println(bi.getUniqueID());
            System.out.println(bi.getAcctType());
            System.out.println("\n");
            
            UDCStudentUnion.BankAccount barray = udcstudent.new BankAccount(bi.getAcctValue(), bi.getAcctHolder(), bi.getUniqueID());
            listBacct.add(barray);
            
            BankAcctInterface bacust = new BankCust(bi.getAcctValue(), bi.getAcctHolder(), 
                    bi.getUniqueID(), bi.getDepositor().getPersonID(),
                    bi.getDepositor().getStreetAddr(), bi.getDepositor().getPostalCode(),
                    bi.getAcctType(), bi.getSpecialInfo(), bi.getDateOpened()
            );
            
            listBaCust.add((BankCust)bacust);
            
            PhoneInterface [] piarray = bi.getDepositor().getPhones();
            
            if(piarray != null){
            for(PhoneInterface pi: piarray){
                System.out.println(pi.getFullPhone());
            }
            }
        }
        
        
        for(AcctInterface ai:acctarray){
            System.out.println(ai.getAcctValue());
            System.out.println(ai.getAcctHolder());
            System.out.println(ai.getUniqueID());
        }
        for(BankCust ni:listBaCust){
            System.out.println(ni.getAcctHolder());
        }
        
        for(UDCStudentUnion.BankAccount bil: listBacct){
            System.out.println(bil.getAcctValue());
            System.out.println(bil.getAcctHolder());
            System.out.println(bil.getUniqueID());
        }
        
       
   
    
    

    }

    public class bankModel extends DefaultComboBoxModel {

        @Override
        public int getSize() {
            
            if(listBaCust == null){
                
             System.out.print("NULL LIST FOUND");
             return 0;
            }
             return listBaCust.size();
            
            //if(bank.(bankmain)bank..listBacct == null) { System.out.print("NULL LIST"); }
            //if(listBaCust == null) { System.out.print("NULL2 LIST"); return 0; }

//return listBacct.size();
        }

        @Override
        public Object getElementAt(int index) {
            //Note that a String is returned
            String goBack = 
            listBaCust.get(index).getAcctHolder() + " | " + listBaCust.get(index).getUniqueID()
                    ;
            //System.out.println(bank.acctarray[index].getAcctHolder());
           // goBack = new String(listBankInter.bank.acctarray[index].getAcctHolder() + " | " + bank.acctarray[index].getUniqueID());
            return goBack;
        }

        public List<BankCust> getListBaCust() {
            return listBaCust;
        }

    }
}
