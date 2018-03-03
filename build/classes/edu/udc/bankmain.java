/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.udc;

import edu.udc.UDCStudentUnion.BankAccount;
import edu.udc.bank.AcctInterface;
import edu.udc.bank.BankAcctInterface;
import edu.udc.bank.BankCust;
import edu.udc.bank.Depositor;
import edu.udc.bank.PhoneInterface;
import java.util.ArrayList;
import java.util.List;

/** Connor took the main of this and stuck it in the constructor. 
 *
 * @author TOSHIBAPC
 */
public class bankmain {

            UDCStudentUnion udcstudent;
        AcctInterface [] acctarray;
        List<BankAcctInterface> listBankInter;
        List<BankAccount>listBacct;
       public List<BankCust>listBaCust;
    
    public bankmain() {
        // TODO code application logic here
        
        
        
        
        UDCStudentUnion udcstudent = new UDCStudentUnion();
        AcctInterface [] acctarray = udcstudent.getStudentAccts();
        List<BankAcctInterface> listBankInter = udcstudent.getStudentAcctsList();
        List<BankAccount>listBacct = new ArrayList<BankAccount>();
        List<BankCust>listBaCust = new ArrayList<BankCust>();
    
       
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
            
            BankAccount barray = udcstudent.new BankAccount(bi.getAcctValue(), bi.getAcctHolder(), bi.getUniqueID());
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
    
}
