package edu.udc;

import edu.udc.bank.*;
import edu.udc.bank.BankCust;
import edu.udc.bank.Depositor;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.*;
/**  Both Left and Right panels have a public attribute SINGLE
 *  which is the BankCustomer object used to fill their models.
 * 
 * @author handsome
 */
public class LeftPanel extends JPanel{

    
    static void jComboBox1ActionPerformed(ActionEvent evt) {
                                                  
        // TODO add your handling code here:
        Object i = (evt.getSource());
        JComboBox temp = new JComboBox();
        i = (JComboBox)i;
        BalanceLabel.setText(new String(""+single.getAcctValue()));
        AcctNumberLabel.setText(new String(""+single.getUniqueID()));
        AcctType type = single.getAcctType();
        switch(type){
            case ACCT_CHECKING: {AccountTypeLabel.setIcon(icoChecking); AccountTypeLabel.setText(null); break;}
            case ACCT_SAVINGS: {AccountTypeLabel.setText(new String("savings")); break;}
            case ACCT_CD: {AccountTypeLabel.setIcon(icoCertificate); AccountTypeLabel.setText(null); break;}
    }
        
    }

    public static JLabel BalanceLabel;
    public static JLabel AcctNumberLabel;
    public static JLabel AccountTypeLabel;
    private final JLabel AcctNumberLeft;
    private final JLabel BalanceLeft;
    private final JLabel AcctTypeLeft;
    private Object jLabel6;
    //public ArrayList<BankAcctInterface> blist;
    //public List<BankCust> Bacust;
    public static BankCust single;
    static ImageIcon icoChecking;
    
    static ImageIcon icoCertificate;
    static ImageIcon icoSaving;    
    
    public LeftPanel() {
        BalanceLabel = new javax.swing.JLabel();
        AcctNumberLabel = new javax.swing.JLabel();
        AccountTypeLabel = new javax.swing.JLabel();
        AcctNumberLeft = new javax.swing.JLabel();
        BalanceLeft = new javax.swing.JLabel();
        AcctTypeLeft = new javax.swing.JLabel();
        
        setBorder(javax.swing.BorderFactory.createTitledBorder("Account Information"));
        BalanceLabel.setText("$" + " amt");
        AcctNumberLabel.setText("SOME NUMBER");
        AccountTypeLabel.setText("Credit or smth");
        AcctNumberLeft.setText("Balance");
        BalanceLeft.setText("Account Number");
        AcctTypeLeft.setText("Account Type");
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this);
        setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                //.addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AcctTypeLeft)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(AccountTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AcctNumberLeft)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BalanceLeft)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AcctNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
               // .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AcctNumberLeft))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AcctNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BalanceLeft))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccountTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AcctTypeLeft))
                .addGap(0, 43, Short.MAX_VALUE))
        );
        
            
        try
        {
 	URL url=ClassLoader.getSystemResource("chking.gif");
        if(url == null)
            System.err.println("Checking gif not found");
        else
            icoChecking=new ImageIcon(url);
         	URL url2=ClassLoader.getSystemResource("buttongif.gif");
        if(url2 == null)
            System.err.println("CD gif not found");
        else
            icoCertificate=new ImageIcon(url2);

}
catch(Exception ee)
{
    System.err.println("error:" + ee);
}

    
    
   /* void getStateChange(ItemEvent e) {
               
                if(e.getStateChange() == ItemEvent.SELECTED){
                    BankCust temp = (BankCust)e.getSource();
          //      BalanceLabel.setText( 
          //         "" + temp.getAcctValue() );
                AcctNumberLabel.setText(
                 "" + temp.getUniqueID() ); //DOUBLE CHECK THAT HE WANTS THIS FOR THE ACCT NUMBER
                
                //if(temp.getAcctType() == Acct_Checking){ }
                //AccountTypeLabel.setText( new String( 
                        
                            //"" +
                 //"" + temp.getAcctType() );
                
            }
    }*/
    
    
    
}
}
