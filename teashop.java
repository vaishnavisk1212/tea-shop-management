/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vkhat
 */
import java.awt.*;


import java.awt.event.*;
import javax.swing.*;

public class teashop extends JApplet implements ItemListener {
    JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22;
    JLabel  l1=new JLabel("bill is");
    JTextField t=new JTextField(20);
    public void init(){
        Container con=getContentPane();
        JPanel p=new JPanel();
        p.setLayout(new GridLayout(7,1));
        JPanel p1=new JPanel();
        p1.setLayout(new GridLayout(1,1));
        c1=new JCheckBox("half-tea....5");
        c2=new JCheckBox("full-tea....15");
        c3=new JCheckBox("coffee....30");
        c4=new JCheckBox("green tea....15");
        c5=new JCheckBox("black-tea....20");
        c6=new JCheckBox("white-tea....25");
        c7=new JCheckBox("oolong-tea....20");
        c8=new JCheckBox("darjeeling-tea....55");
        c9=new JCheckBox("masala-chai....25");
        c10=new JCheckBox("herbal-tea....50");
        c11=new JCheckBox("yellow-tea....40");
        c12=new JCheckBox("ceylon-tea....50");
        c13=new JCheckBox("chamomile-tea....35");
        c14=new JCheckBox("mate-tea....45");
        c15=new JCheckBox("english breakfast-tea....25");
        c16=new JCheckBox("puer-tea....35");
        c17=new JCheckBox("silver needle tea....55");
        c18=new JCheckBox("mamaki tea....55");
        c19=new JCheckBox("bush tea....55");
        c20=new JCheckBox("oliveleaves tea....55");
        c21=new JCheckBox("Pumpkin Spice tea....55");
        c22=new JCheckBox("Honeybush tea....55");
        

        
       p.add(c1);
       c1.addItemListener(this);
        p.add(c2);
       c2.addItemListener(this);
        p.add(c3);
       c3.addItemListener(this);
        p.add(c4);
       c4.addItemListener(this);
        p.add(c5);
       c5.addItemListener(this); p.add(c6);
       c6.addItemListener(this);
        p.add(c7);
       c7.addItemListener(this); p.add(c8);
       c8.addItemListener(this);
        p.add(c9);
       c9.addItemListener(this);
        p.add(c10);
       c10.addItemListener(this);
        p.add(c11);
       c11.addItemListener(this);
        p.add(c12);
       c12.addItemListener(this);
        p.add(c13);
       c13.addItemListener(this);
        p.add(c14);
       c14.addItemListener(this);
        p.add(c15);
       c15.addItemListener(this);
       
        p.add(c16);
       c16.addItemListener(this);
        p.add(c17);
       c17.addItemListener(this);
       p.add(c18);
       c18.addItemListener(this);
       p.add(c19);
       c19.addItemListener(this);
       p.add(c20);
       c20.addItemListener(this);
       p.add(c21);
       c21.addItemListener(this);
       p.add(c22);
       c22.addItemListener(this);
       
       
       con.add(p,BorderLayout.NORTH);
       p1.add(l1);
       p1.add(t);
       con.add(p1,BorderLayout.SOUTH);
    }
    public void itemStateChanged(ItemEvent e){
        int amt=0;
        if(c1.isSelected()){
            amt=amt+5;
        }
        if(c2.isSelected()){
            amt=amt+15;
        }
        if(c3.isSelected()){
            amt=amt+30;
        }if(c4.isSelected()){
            amt=amt+15;
        }if(c5.isSelected()){
            amt=amt+20;
        }
        if(c6.isSelected()){
            amt=amt+25;
        }
        if(c7.isSelected()){
            amt=amt+20;
        }
       
                if(c8.isSelected()){
            amt=amt+55;
        }
                if(c9.isSelected()){
            amt=amt+25;
        }
                if(c10.isSelected()){
            amt=amt+50;
        }if(c11.isSelected()){
            amt=amt+40;
        }
        if(c12.isSelected()){
            amt=amt+50;
        }
        if(c13.isSelected()){
            amt=amt+35;
        }
        if(c14.isSelected()){
            amt=amt+45;
        }
        if(c15.isSelected()){
            amt=amt+25;
        }
        if(c16.isSelected()){
            amt=amt+35;
        }
        if(c17.isSelected()){
            amt=amt+55;
        }
        
        if(c18.isSelected()){
            amt=amt+55;
        }
        
        if(c19.isSelected()){
            amt=amt+55;
        }

        if(c20.isSelected()){
            amt=amt+55;
        }

        if(c21.isSelected()){
            amt=amt+55;
        }

        if(c22.isSelected()){
            amt=amt+56;
        }

        t.setText(String.valueOf(amt));
                
        
        
    }
}
    
