/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package onlineordering;

import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Admin
 */
public class OrderingSystem implements ActionListener {
//    public static int con;
    public static String nm;
    public static  String ctno;
    
    JLabel Customer,Name,Contact,Food,Drink,cinfo, orece,menu,t1,t2,ood,ctnor,nr,cnr,cc,nn,rr;
    JTextField tc,tn,tct;
    JComboBox c1,c2;
    JRadioButton b1,b2;
    JButton br,brt;
    
OrderingSystem(){

    
     JFrame f = new JFrame("Ordering");
     
     //    label
    Customer = new JLabel("Customer No:");
    Customer.setBounds(20,75,150,30);
    f.add(Customer);
    
    Name = new JLabel("Name:");f.add(Name);
    Name.setBounds(20,100,150,30);

    Contact = new JLabel("Contact Number:"); f.add(Contact); 
    Contact.setBounds(20,150,150,30);

    Food = new JLabel("Food");f.add(Food);f.add(Food); 
    Food.setBounds(45,250,150,30);

    Drink = new JLabel("Drink");
    Drink.setBounds(50,300,150,30);
    f.add(Drink);

    t1 = new JLabel("Type:");
    t1.setBounds(60,400,150,30);
    f.add(t1);
    
    cinfo = new JLabel("Customer's Information"); f.add(cinfo);
    cinfo.setBounds(85, 5, 200,60);
    
    menu = new JLabel("Menu");
    menu.setBounds(170,200,150,60);
    f.add(menu);
    
    orece = new JLabel("Order Receipt");f.add(orece);
    orece.setBounds(600, 6, 200, 60);
          
//    textFielld
    tc = new JTextField();
    tc.setBounds(150,75,200,20);
    f.add(tc);
    
    tn = new JTextField();
    tn.setBounds(150,100,200,20);
    f.add(tn);
    
    tct = new JTextField();
    tct.setBounds(150,150,200,20);
    f.add(tct);
    
    //    comboBox
    
    String fod[] ={"","Pasta","Fizza", "Frech Frie", "Burger"};     
    c1 = new JComboBox(fod);
    c1.setBounds(190,260,120,30);
    f.add(c1);

    String drik[] ={"","Orange Juice","Water","Soda"};     
    c2 = new JComboBox(drik);
    c2.setBounds(190,300,120,30);
    f.add(c2);
    
          
//    radioButton
    b1  = new JRadioButton ("Vegan Style");
    b2  = new JRadioButton ("Original Style");   
    b1.setBounds(130, 400, 120, 30);
    b2.setBounds(230, 400, 120, 30); 
    f.add(b1);f.add(b2);
    
//    Button
    br = new JButton ("Reset");
    br.setBounds(300, 550, 80, 40); 
    f.add(br);

    brt = new JButton ("Receipt");
    brt.setBounds(500, 550, 80, 40);
    f.add(brt);
    
    // label & Textfield for receipt
    
    cc = new JLabel("Customer Number:");
    cc.setBounds(500, 75, 150, 30);
    f.add(cc);
    ctnor = new JLabel();
    ctnor.setBounds(550, 75, 150, 30);
    f.add(ctnor);
    
    ood = new JLabel();f.add(ood);
    ood.setBounds(570, 200, 250,30);
        
    nn = new JLabel("Name:");
    nn.setBounds(500,100, 150, 30);
    f.add(nn);
    nr = new JLabel();
    nr.setBounds(550,100, 150, 30);
    f.add(nr);
    
    rr = new JLabel("Contact No.:");
    rr.setBounds(500, 150,150,30);
    f.add(rr);
    cnr = new JLabel();
    cnr.setBounds(550, 150,150,30);
    f.add(cnr);

    
    

    
    br.addActionListener(this);
    brt.addActionListener(this);
    f.setLayout(null);
    f.setSize(900,800);f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    f.setVisible(true);
    
    brt.addActionListener(new ActionListener(){
  
        @Override 
    public void actionPerformed(ActionEvent e){
    
        //getting the form value in then adding to label 
        int con = Integer.parseInt(tc.getText()); 
        ctnor.setText(Integer.toString(con));
        tc.setText(null);

        nm = tn.getText();
        nr.setText(nm);
        tn.setText(null);

        ctno = tct.getText();
        cnr.setText(ctno);
        tct.setText(null);

        String pod = " Selected: "+ fod.getItemAt(fod.getSelectedIndex());
        ood.setText(pod);
    
    }
    
    });

}

@Override
 public void actionPerformed(ActionEvent e)   {
       if(e.getSource ()== br){
   tc.setText(null);
   tn.setText(null);
   tct.setText(null);
   b1.setSelected(false);
   b2.setSelected(false);
   c1.removeAllItems();
   c2.removeAllItems();
       }
       
       
 }
    public static void main(String args[]) {
        new OrderingSystem();
    }
}
