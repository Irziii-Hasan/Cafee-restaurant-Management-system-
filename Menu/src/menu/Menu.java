/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menu;
import java.io.File;
import java.io.PrintWriter;

import java.awt.event.*; 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


abstract class Food {
    JCheckBox s1,s2,s3,s4,s5,s6,s7,d1,d2,d3,d4,d5,d6,d7;
                
    public JFrame jf=new JFrame();
    public Container c= jf.getContentPane();
    
    //FONTS SIZE
    public Font font=new Font("TimesNewRoman",Font.BOLD,20);
    public Font title=new Font("TimesNewRoman",Font.BOLD,60);
    public Font para=new Font("TimesNewRoman",Font.BOLD,32);
    public Font qn=new Font("TimesNewRoman",Font.BOLD,40);
        
    //Black color
    public Color color=new Color(0, 0, 0);

    
    public abstract void items();
    
    public void windowsappear(int n1, int n2, int n3) {
        //BACKGROUND COLOR
        Color color=new Color(n1,n2,n3);
        c.setBackground(color);
        
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(0,0,1600,900);
          
        JLabel jt=new JLabel("Cafee Restaurant Management System");
        c.add(jt);
        jt.setForeground(this.color);
        jt.setBounds(230,50,1500,80);
        c.setLayout(null);
        jt.setFont(title);
    }
    
    




    
    
    
    
        
    
    //time menu windows
    public  void time(String a){
        //breakfast,lunch or dinner
        JLabel jl=new JLabel(a);
        c.add(jl);
        jl.setForeground(color.WHITE);
        jl.setBounds(460,200,700,80);
        c.setLayout(null);
        jl.setFont(title); 

        //Dishes Heading
        JLabel dish=new JLabel("DISHES");
        c.add(dish);
        dish.setForeground(color);
        dish.setBounds(120,400,300,30);
        c.setLayout(null);
        dish.setFont(qn);
        
        //Snacks Heading
        JLabel snacks=new JLabel("SNACKS");
        c.add(snacks);
        snacks.setForeground(color);
        snacks.setBounds(620,400,300,30);
        c.setLayout(null);
        snacks.setFont(qn);
        
        //Drinks Heading
        JLabel dinner=new JLabel("DRINKS");
        c.add(dinner);
        dinner.setForeground(color);
        dinner.setBounds(1120,400,300,30);
        c.setLayout(null);
        dinner.setFont(qn);      
       
    }
    
    
    public void snacks(){
                
        JCheckBox  s1=new JCheckBox("Burger                    180rs");
        JCheckBox  s2=new JCheckBox("Pizza                        250rs");
        JCheckBox  s3=new JCheckBox("Broast                     160rs");
        JCheckBox  s4=new JCheckBox("Nuggets                    80rs");
        JCheckBox  s5=new JCheckBox("Fries                         40rs");
        JCheckBox  s6=new JCheckBox("Club Sandwich          20rs");
        JCheckBox  s7=new JCheckBox("Ice-cream                 30rs");
        
        c.add(s1);
        c.add(s2);
        c.add(s3);
        c.add(s4);
        c.add(s5);
        c.add(s6);
        c.add(s7);
        
        s1.setBounds(600,440,300,30);
        s2.setBounds(600,480,300,30);
        s3.setBounds(600,520,300,30);
        s4.setBounds(600,560,300,30);
        s5.setBounds(600,600,300,30);
        s6.setBounds(600,640,300,30);
        s7.setBounds(600,680,300,30);
        
        
        
        s1.setFont(font);
        s2.setFont(font);
        s3.setFont(font);
        s4.setFont(font);
        s5.setFont(font);
        s6.setFont(font);
        s7.setFont(font);

        
        s1.setForeground(color);
        s2.setForeground(color);
        s3.setForeground(color);
        s4.setForeground(color);
        s5.setForeground(color);
        s6.setForeground(color);
        s7.setForeground(color);
        
    }
    
    
    public void drinks(){
        
        JCheckBox  d1=new JCheckBox("Soft Drinks                    50rs");
        JCheckBox  d2=new JCheckBox("Lemonade                      50rs");
        JCheckBox  d3=new JCheckBox("Chocolate Shake           60rs");
        JCheckBox  d4=new JCheckBox("Mango Shake                 50rs");
        JCheckBox  d5=new JCheckBox("Banana Shake               50rs");
        JCheckBox  d6=new JCheckBox("Coffee                         40rs");
        JCheckBox  d7=new JCheckBox("Chaii                           50rs");
        
        c.add(d1);
        c.add(d2);
        c.add(d3);
        c.add(d4);
        c.add(d5);
        c.add(d6);
        c.add(d7);
        
        d1.setBounds(1100,440,300,30);
        d2.setBounds(1100,480,300,30);
        d3.setBounds(1100,520,300,30);
        d4.setBounds(1100,560,300,30);
        d5.setBounds(1100,600,300,30);
        d6.setBounds(1100,640,300,30);        
        d7.setBounds(1100,680,300,30);

        d1.setFont(font);
        d2.setFont(font);
        d3.setFont(font);
        d4.setFont(font);
        d5.setFont(font);
        d6.setFont(font);
        d7.setFont(font);

        
        d1.setForeground(color);
        d2.setForeground(color);
        d3.setForeground(color);
        d4.setForeground(color);
        d5.setForeground(color);
        d6.setForeground(color);
        d7.setForeground(color);
        
    }
    
    //Abstract calling method
    abstract void classCalling();
    
}

class Breakfast extends Food implements ActionListener{  
   
    JCheckBox b1,b2,b3,b4,b5,b6,b7;
    
    private String msg=null;
    private double amount=0;
    
    
    
    
    public String getMsg(){
    return msg;
}
    
    public double getAmount(){
    return amount;
}
    
    
    
    public void buttonact(){
        JButton b=new JButton("Order");  
        b.setBounds(640,730,150,50);  
        b.addActionListener(this);
        c.add(b);
        b.setFont(qn);
        b.setForeground(this.color);
        b.setBackground(color.WHITE);
    }
    
    @Override
    //polymorphism (method overriden)
    public  void time(String a){
        
        JLabel jl=new JLabel(a);
        c.add(jl);
        jl.setForeground(color.WHITE);
        jl.setBounds(440,200,800,80);
        c.setLayout(null);
        jl.setFont(title); 

        //Dishes Heading
        JLabel dish=new JLabel("DISHES");
        c.add(dish);
        dish.setForeground(color);
        dish.setBounds(120,400,300,30);
        c.setLayout(null);
        dish.setFont(qn);
        
        //Snacks Heading
        JLabel snacks=new JLabel("SNACKS");
        c.add(snacks);
        snacks.setForeground(color);
        snacks.setBounds(620,400,300,30);
        c.setLayout(null);
        snacks.setFont(qn);
        
        //Drinks Heading
        JLabel dinner=new JLabel("DRINKS");
        c.add(dinner);
        dinner.setForeground(color);
        dinner.setBounds(1120,400,300,30);
        c.setLayout(null);
        dinner.setFont(qn);      
       
    }
    
    public void items(){
        
        
        JCheckBox b1=new JCheckBox("Paratha                 20rs");
        JCheckBox b2=new JCheckBox("Halwa                    30rs");
        JCheckBox b3=new JCheckBox("Chai Paratha         60rs");
        JCheckBox b4=new JCheckBox("Qeema Paratha     80rs");
        JCheckBox b5=new JCheckBox("Aalu Paratha         40rs");
        JCheckBox b6=new JCheckBox("Tarkari                  30rs");
        JCheckBox b7=new JCheckBox("Shreelmaal           20rs");
        
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
        c.add(b6);
        c.add(b7);
        
        b1.setBounds(100,440,300,30);
        b2.setBounds(100,480,300,30);
        b3.setBounds(100,520,300,30);
        b4.setBounds(100,560,300,30);
        b5.setBounds(100,600,300,30);
        b6.setBounds(100,640,300,30);
        b7.setBounds(100,680,300,30);

        b1.setFont(font);
        b2.setFont(font);
        b3.setFont(font);
        b4.setFont(font);
        b5.setFont(font);
        b6.setFont(font);
        b7.setFont(font);
        
        b1.setForeground(color);
        b2.setForeground(color);
        b3.setForeground(color);
        b4.setForeground(color);
        b5.setForeground(color);
        b6.setForeground(color);
        b7.setForeground(color);
           
    }
    
    public void CheckboxAdding(){  
          
          
        
        //snacks checkbox conditon
        if(s1.isSelected()){  
            amount+=180;  
            msg+="Burger: 180\n";  
        }  
        if(s2.isSelected()){  
            amount+=250;  
            msg+="pizza: 250\n";  
        }  
        if(s3.isSelected()){  
            amount+=160;  
            msg+="broast: 160\n";  
        }  
        if(s4.isSelected()){  
            amount+=80;  
            msg+="nuggets: 80\n";  
        }  
        if(s5.isSelected()){  
            amount+=40;  
            msg+="Fries: 40\n";  
        }  
        if(s6.isSelected()){  
            amount+=20;  
            msg+="Club Sandwich: 20\n";  
        }  
        if(s7.isSelected()){  
            amount+=30;  
            msg+="Ice-cream: 30\n";  
            
            
            
        }
        
        
        
        //drinks checkbox conditon        
        if(d1.isSelected()){  
            amount+=50;  
            msg+="SoftDrinks: 50\n";  
        }  
        if(d2.isSelected()){  
            amount+=50;  
            msg+="Lemondade: 50\n";  
        }  
        if(d3.isSelected()){  
            amount+=60;  
            msg+="Chocolate Shake: 60\n";  
        }  
        if(d4.isSelected()){  
            amount+=50;  
            msg+="Mango Shake: 50\n";  
        }  
        if(d5.isSelected()){  
            amount+=50;  
            msg+="Banana Shake: 50\n";  
        }  
        if(d6.isSelected()){  
            amount+=40;  
            msg+="Coffee: 40\n";  
        }  
        if(d7.isSelected()){  
            amount+=40;  
            msg+="Chaii: 40\n";  
        }
        
        
        
        if(b1.isSelected()){  
            amount+=20;  
            msg+="Paratha: 20\n";  
        }  
        if(b2.isSelected()){  
            amount+=30;  
            msg+="Halwa: 30\n";  
        }  
        if(b3.isSelected()){  
            amount+=60;
            msg+="Chai Paratha: 60\n";  
        }  
        if(b4.isSelected()){  
            amount+=80;  
            msg+="Qeema Paratha: 80\n";  
        }  
        if(b5.isSelected()){  
            amount+=40;  
            msg+="Aalu Paratha: 40\n";  
        }  
        if(b6.isSelected()){  
            amount+=30;  
            msg+="Tarkari: 30\n";  
        }  
        if(b7.isSelected()){  
            amount+=20;  
            msg+="Shreelmaal: 20\n";  
        }
        
        
        msg+="-----------------\n";  
        
        

        }
    
public void fileHandling() throws Exception {

}

    @Override
    public void actionPerformed(ActionEvent e){
        JFrame jf=new JFrame();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c= jf.getContentPane();
        jf.setBounds(400,100,800,700);

        //FONTS SIZE
        Font font=new Font("TimesNewRoman",Font.BOLD,20);
        Font title=new Font("TimesNewRoman",Font.BOLD,60);
        Font para=new Font("TimesNewRoman",Font.BOLD,32);
        Font qn=new Font("TimesNewRoman",Font.BOLD,40);


        //BACKGROUND COLOR
        Color color=new Color(0, 0, 0);
        c.setBackground(color);


        //TITLE CAFEE RESTURANT MANAGEMENT SYSTEM
        jf.setTitle("Cafee Resturant Management System");




        
        
        //set text(label)
        JLabel jl=new JLabel("Cafee Restaurant Management System");
        c.add(jl);
        jl.setForeground(color.WHITE);
        //left top width height
        jl.setBounds(30,50,1000,80);
        c.setLayout(null);
        jl.setFont(qn);
        
        JLabel ln1=new JLabel("You will recieved your order soon");
        c.add(ln1);
        ln1.setForeground(color.WHITE);
        //left top width height
        ln1.setBounds(100,200,650,35);
        c.setLayout(null);
        ln1.setFont(para);
        
        JLabel ln2=new JLabel("Thanks for your trust n have a nice Morning.");
        c.add(ln2);
        ln2.setForeground(color.WHITE);
        //left top width height
        ln2.setBounds(50,240,700,35);
        c.setLayout(null);
        ln2.setFont(para);
        

//Data to write on Console using PrintWriter
PrintWriter writer = new PrintWriter(System.out);
//writer.write("Javatpoint provides tutorials of all technology.");
writer.flush();

writer.close();
//Data to write in File using PrintWriter
PrintWriter writer1 =null;
        try {
            writer1 = new PrintWriter(new File("savedOrder.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Breakfast.class.getName()).log(Level.SEVERE, null, ex);
        }
writer1.write(msg);
writer1.flush();
writer1.close();


//        //INTRO LINE
//        JLabel meal=new JLabel(msg);
//        meal.setForeground(color.WHITE);
//        c.add(meal);
//        meal.setBounds(250,150,500,400);
//        meal.setFont(font);

}
   
    
    @Override
    public void classCalling(){
        Breakfast bf=new Breakfast();
        bf.windowsappear(212, 201, 2);
        
        bf.time("BREAKFAST TIME MENU");
        try {
            bf.fileHandling();
        } catch (Exception ex) {
            Logger.getLogger(Breakfast.class.getName()).log(Level.SEVERE, null, ex);
        }
        bf.items();
        bf.snacks();
        bf.drinks();
        bf.buttonact();
        CheckboxAdding();

        //bf.actionPerformed(this);
    
}



}


class Lunch extends Food implements ActionListener{
    
        JCheckBox l1,l2,l3,l4,l5,l6,l7;
    
    String msg="";
    double amount=0;
    
    public void buttonact(){
        JButton b=new JButton("Order");  
        b.setBounds(640,730,150,50);  
        b.addActionListener(this);
        c.add(b);
        b.setFont(qn);
        b.setForeground(this.color);
        b.setBackground(color.WHITE);
    }
    
    
    @Override
    public void items(){
        
        JCheckBox l1=new JCheckBox("Biryani                    120rs");
        JCheckBox l2=new JCheckBox("Pulao                       100rs");
        JCheckBox l3=new JCheckBox("Mix Sabzi                  70rs");
        JCheckBox l4=new JCheckBox("Daal Chana                60rs");
        JCheckBox l5=new JCheckBox("Koyla Karahi            100rs");
        JCheckBox l6=new JCheckBox("Naan                         10rs");
        JCheckBox l7=new JCheckBox("Roti                          08rs");

        c.add(l1);
        c.add(l2);
        c.add(l3);
        c.add(l4);
        c.add(l5);
        c.add(l6);
        c.add(l7);
        
        
        
        l1.setBounds(100,440,300,30);
        l2.setBounds(100,480,300,30);
        l3.setBounds(100,520,300,30);
        l4.setBounds(100,560,300,30);
        l5.setBounds(100,600,300,30);
        l6.setBounds(100,640,300,30);
        l7.setBounds(100,680,300,30);

        
        l1.setFont(font);
        l2.setFont(font);
        l3.setFont(font);
        l4.setFont(font);
        l5.setFont(font);
        l6.setFont(font);
        l7.setFont(font);

        
        l1.setForeground(color);
        l2.setForeground(color);
        l3.setForeground(color);
        l4.setForeground(color);
        l5.setForeground(color);
        l6.setForeground(color);
        l7.setForeground(color);

    }
    
    
    public void CheckboxAdding(){  
          
          
        
        //snacks checkbox conditon
        if(s1.isSelected()){  
            amount+=180;  
            msg="Burger: 180\n";  
        }  
        if(s2.isSelected()){  
            amount+=250;  
            msg+="pizza: 250\n";  
        }  
        if(s3.isSelected()){  
            amount+=160;  
            msg+="broast: 160\n";  
        }  
        if(s4.isSelected()){  
            amount+=80;  
            msg="nuggets: 80\n";  
        }  
        if(s5.isSelected()){  
            amount+=40;  
            msg+="Fries: 40\n";  
        }  
        if(s6.isSelected()){  
            amount+=20;  
            msg+="Club Sandwich: 20\n";  
        }  
        if(s7.isSelected()){  
            amount+=30;  
            msg+="Ice-cream: 30\n";  
            
            
            
        }
        
        
        
        //drinks checkbox conditon        
        if(d1.isSelected()){  
            amount+=50;  
            msg="SoftDrinks: 50\n";  
        }  
        if(d2.isSelected()){  
            amount+=50;  
            msg+="Lemondade: 50\n";  
        }  
        if(d3.isSelected()){  
            amount+=60;  
            msg+="Chocolate Shake: 60\n";  
        }  
        if(d4.isSelected()){  
            amount+=50;  
            msg="Mango Shake: 50\n";  
        }  
        if(d5.isSelected()){  
            amount+=50;  
            msg+="Banana Shake: 50\n";  
        }  
        if(d6.isSelected()){  
            amount+=40;  
            msg+="Coffee: 40\n";  
        }  
        if(d7.isSelected()){  
            amount+=40;  
            msg+="Chaii: 40\n";  
        }
        
        
        
        //Lunxh checkbox conditon       
        if(l1.isSelected()){  
            amount+=20;  
            msg="Biryani\n";  
        }  
        if(l2.isSelected()){  
            amount+=30;  
            msg+="Pulao\n";  
        }  
        if(l3.isSelected()){  
            amount+=60;
            msg+="Mix Sabzi\n";  
        }  
        if(l4.isSelected()){  
            amount+=80;  
            msg="Daal Chana\n";  
        }  
        if(l5.isSelected()){  
            amount+=40;  
            msg+="Koyla Karahi:\n";  
        }  
        if(l6.isSelected()){  
            amount+=30;  
            msg+="Naan\n";  
        }  
        if(l7.isSelected()){  
            amount+=20;  
            msg+="Roti\n";  
        }
        
        
        msg+="-----------------\n"; 
        
        
        
        
        
    }
    
    public void outputStream(){
        try  
          {  
            FileOutputStream fo= new FileOutputStream("order.txt");  
              
            byte b[]=msg.getBytes();
            fo.write(b);  
            fo.close();  
          }  
        catch(Exception y)  
          {  
             
          }
    }
    
    
        @Override
    public void actionPerformed(ActionEvent e){
        JFrame jf=new JFrame();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c= jf.getContentPane();
        jf.setBounds(400,100,800,700);

        //FONTS SIZE
        Font font=new Font("TimesNewRoman",Font.BOLD,20);
        Font title=new Font("TimesNewRoman",Font.BOLD,60);
        Font para=new Font("TimesNewRoman",Font.BOLD,32);
        Font qn=new Font("TimesNewRoman",Font.BOLD,40);


        //BACKGROUND COLOR
        Color color=new Color(0, 0, 0);
        c.setBackground(color);


        //TITLE CAFEE RESTURANT MANAGEMENT SYSTEM
        jf.setTitle("Cafee Resturant Management System");




        //set text(label)
        JLabel jl=new JLabel("Cafee Restaurant Management System");
        c.add(jl);
        jl.setForeground(color.WHITE);
        //left top width height
        jl.setBounds(30,50,1000,80);
        c.setLayout(null);
        jl.setFont(qn);
        
        JLabel ln1=new JLabel("You will recieved your order soon");
        c.add(ln1);
        ln1.setForeground(color.WHITE);
        //left top width height
        ln1.setBounds(100,200,650,35);
        c.setLayout(null);
        ln1.setFont(para);
        
        JLabel ln2=new JLabel("Thanks for your trust n have a nice evening. ");
        c.add(ln2);
        ln2.setForeground(color.WHITE);
        //left top width height
        ln2.setBounds(50,240,700,35);
        c.setLayout(null);
        ln2.setFont(para);
        
//        JLabel ln3=new JLabel("Regards by Mangers ");
//        c.add(ln2);
//        ln3.setForeground(color.WHITE);
//        //left top width height
//        ln3.setBounds(50,280,700,35);
//        c.setLayout(null);
//        ln3.setFont(para);
//        
//        JLabel ln4=new JLabel("Zareen Khan, Irza Hasan and Zainab Fatima");
//        c.add(ln2);
//        ln4.setForeground(color.WHITE);
//        //left top width height
//        ln4.setBounds(50,320,700,35);
//        c.setLayout(null);
//        ln4.setFont(para);
//        
        


        //INTRO LINE
        //JLabel meal=new JLabel(msg);
        //meal.setForeground(color.WHITE);
        //c.add(meal);
        //meal.setBounds(250,180,500,400);
        //meal.setFont(font);

}
   
    
    @Override
    public void classCalling(){
        Lunch lnch=new Lunch();
        lnch.windowsappear(245, 135, 66);
        lnch.items();
        lnch.snacks();
        lnch.drinks();
        lnch.buttonact();
        lnch.outputStream();
        lnch.time("LUNCH TIME MENU");
        lnch.CheckboxAdding();
        //bf.actionPerformed(this);
    }
}

class Dinner extends Food implements ActionListener{
    JCheckBox dn1,dn2,dn3,dn4,dn5,dn6,dn7;  
    
    String msg="";
    double amount=0;
    
    public void buttonact(){
        JButton b=new JButton("Order");  
        b.setBounds(640,730,150,50);  
        b.addActionListener(this);
        c.add(b);
        b.setFont(qn);
        b.setForeground(this.color);
        b.setBackground(color.WHITE);
    }
    
    @Override
    public void items(){
        JCheckBox dn1=new JCheckBox("Biryani                    120rs");
        JCheckBox dn2=new JCheckBox("Nihari                       100rs");
        JCheckBox dn3=new JCheckBox("Mix Sabzi                  70rs");
        JCheckBox dn4=new JCheckBox("Paye                         60rs");
        JCheckBox dn5=new JCheckBox("Koyla Karahi            100rs");
        JCheckBox dn6=new JCheckBox("Naan                         10rs");
        JCheckBox dn7=new JCheckBox("Roti                          08rs");

        c.add(dn1);
        c.add(dn2);
        c.add(dn3);
        c.add(dn4);
        c.add(dn5);
        c.add(dn6);
        c.add(dn7);
        
        
        dn1.setBounds(100,440,300,30);
        dn2.setBounds(100,480,300,30);
        dn3.setBounds(100,520,300,30);
        dn4.setBounds(100,560,300,30);
        dn5.setBounds(100,600,300,30);
        dn6.setBounds(100,640,300,30);
        dn7.setBounds(100,680,300,30);
        
        
        
        
        dn1.setFont(font);
        dn2.setFont(font);
        dn3.setFont(font);
        dn4.setFont(font);
        dn5.setFont(font);
        dn6.setFont(font);
        dn7.setFont(font);

        
        dn1.setForeground(color);
        dn2.setForeground(color);
        dn3.setForeground(color);
        dn4.setForeground(color);
        dn5.setForeground(color);
        dn6.setForeground(color);
        dn7.setForeground(color);
   
    }
    
       public void CheckboxAdding(){  
          
          
        
        //snacks checkbox conditon
        if(s1.isSelected()){  
            amount+=180;  
            msg="Burger: 180\n";  
        }  
        if(s2.isSelected()){  
            amount+=250;  
            msg+="pizza: 250\n";  
        }  
        if(s3.isSelected()){  
            amount+=160;  
            msg+="broast: 160\n";  
        }  
        if(s4.isSelected()){  
            amount+=80;  
            msg="nuggets: 80\n";  
        }  
        if(s5.isSelected()){  
            amount+=40;  
            msg+="Fries: 40\n";  
        }  
        if(s6.isSelected()){  
            amount+=20;  
            msg+="Club Sandwich: 20\n";  
        }  
        if(s7.isSelected()){  
            amount+=30;  
            msg+="Ice-cream: 30\n";  
            
            
            
        }
        
        
        
        //drinks checkbox conditon        
        if(d1.isSelected()){  
            amount+=50;  
            msg="SoftDrinks: 50\n";  
        }  
        if(d2.isSelected()){  
            amount+=50;  
            msg+="Lemondade: 50\n";  
        }  
        if(d3.isSelected()){  
            amount+=60;  
            msg+="Chocolate Shake: 60\n";  
        }  
        if(d4.isSelected()){  
            amount+=50;  
            msg="Mango Shake: 50\n";  
        }  
        if(d5.isSelected()){  
            amount+=50;  
            msg+="Banana Shake: 50\n";  
        }  
        if(d6.isSelected()){  
            amount+=40;  
            msg+="Coffee: 40\n";  
        }  
        if(d7.isSelected()){  
            amount+=40;  
            msg+="Chaii: 40\n";  
        }
        
        
        
        //Dinner checkbox condtion
        if(dn1.isSelected()){  
            amount+=20;  
            msg="Paratha: 20\n";  
        }  
        if(dn2.isSelected()){  
            amount+=30;  
            msg+="Halwa: 30\n";  
        }  
        if(dn3.isSelected()){  
            amount+=60;
            msg+="Chai Paratha: 60\n";  
        }  
        if(dn4.isSelected()){  
            amount+=80;  
            msg="Qeema Paratha: 80\n";  
        }  
        if(dn5.isSelected()){  
            amount+=40;  
            msg+="Aalu Paratha: 40\n";  
        }  
        if(dn6.isSelected()){  
            amount+=30;  
            msg+="Tarkari: 30\n";  
        }  
        if(dn7.isSelected()){  
            amount+=20;  
            msg+="Shreelmaal: 20\n";  
        }
        
        
        msg+="-----------------\n";  
        
        }
       
       public void outputStream(){
        try  
          {  
            FileOutputStream fo= new FileOutputStream("order.txt");  
              
            byte b[]=msg.getBytes();
            fo.write(b);  
            fo.close();  
          }  
        catch(Exception y)  
          {  
             
          }}
    
    
    public void actionPerformed(ActionEvent e){
        JFrame jf=new JFrame();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c= jf.getContentPane();
        jf.setBounds(400,100,800,700);

        //FONTS SIZE
        Font font=new Font("TimesNewRoman",Font.BOLD,20);
        Font title=new Font("TimesNewRoman",Font.BOLD,60);
        Font para=new Font("TimesNewRoman",Font.BOLD,32);
        Font qn=new Font("TimesNewRoman",Font.BOLD,40);


        //BACKGROUND COLOR
        Color color=new Color(0, 0, 0);
        c.setBackground(color);


        //TITLE CAFEE RESTURANT MANAGEMENT SYSTEM
        jf.setTitle("Cafee Resturant Management System");




        //set text(label)
        JLabel jl=new JLabel("Cafee Restaurant Management System");
        c.add(jl);
        jl.setForeground(color.WHITE);
        //left top width height
        jl.setBounds(30,50,1000,80);
        c.setLayout(null);
        jl.setFont(qn);
        
        JLabel ln1=new JLabel("You will recieved your order soon");
        c.add(ln1);
        ln1.setForeground(color.WHITE);
        //left top width height
        ln1.setBounds(100,200,650,35);
        c.setLayout(null);
        ln1.setFont(para);
        
        JLabel ln2=new JLabel("Thanks for your trust n have a nice evening. ");
        c.add(ln2);
        ln2.setForeground(color.WHITE);
        //left top width height
        ln2.setBounds(50,240,700,35);
        c.setLayout(null);
        ln2.setFont(para);
        


//        //INTRO LINE
//        JLabel meal=new JLabel(msg);
//        meal.setForeground(color.WHITE);
//        c.add(meal);
//        meal.setBounds(250,150,500,400);
//        meal.setFont(font);

}
 
    @Override
    public void classCalling(){
        Dinner dnr=new Dinner();
        dnr.windowsappear(3, 110, 156);
        dnr.items();
        dnr.snacks();
        dnr.drinks();
        dnr.buttonact();
        dnr.outputStream();
        dnr.time("DINNER TIME MENU");
        dnr.CheckboxAdding();

        //bf.actionPerformed(this);
    }
    
    



}


//menu caller class
public class Menu{

    
    
    public void BreakfastCalling(){
      Breakfast bf=new Breakfast();
      bf.classCalling();
  }  
    public void LunchCalling(){
      Lunch lnch=new Lunch();
      lnch.classCalling();
  } 
    
    public void DinnerCalling(){
      Dinner dnr=new Dinner();
      dnr.classCalling();
  } 
}
