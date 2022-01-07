/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cafeeresturantmanagementsystem;
import menu.Menu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CafeeResturantManagementSystem extends Frame implements ActionListener {

    //Encapsulation
    private JLabel jltable,jlname;

public void btn(){
JFrame jf=new JFrame();
jf.setVisible(true);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Container c= jf.getContentPane();
jf.setBounds(0,0,1600,900);

//FONTS SIZE
Font font=new Font("TimesNewRoman",Font.BOLD,20);
Font title=new Font("TimesNewRoman",Font.BOLD,60);
Font para=new Font("TimesNewRoman",Font.BOLD,32);
Font qn=new Font("TimesNewRoman",Font.BOLD,40);


//BACKGROUND COLOR
Color color=new Color(173, 7, 7);
c.setBackground(color);

//TITLE CAFEE RESTURANT MANAGEMENT SYSTEM
jf.setTitle("Cafee Resturant Management System");

//set text(label)
JLabel jl=new JLabel("Cafee Restaurant Management System");
c.add(jl);
jl.setForeground(color.WHITE);
jl.setBounds(230,50,1500,80);
c.setLayout(null);
jl.setFont(title);

//Set Text Fields
JLabel jlname=new JLabel("ENTER YOUR NAME: ");
c.add(jlname);
jlname.setForeground(color.BLACK);
jlname.setBounds(220,190,240,30);
c.add(jlname);
jlname.setFont(font);
//BOX
JTextField t1=new JTextField();
t1.setFont(font);
c.add(t1);
t1.setBounds(440,190,270,30);


//TABLE NO
JLabel jltable=new JLabel("ENTER YOUR TABLE NUM: ");
jltable.setForeground(color.BLACK);
jltable.setBounds(770,190,300,30);
c.add(jltable);
jltable.setFont(font);
//TEXT FIELD
JTextField t2=new JTextField();
t2.setFont(font);
c.add(t2);
t2.setBounds(1045,190,270,30);

//INTRO LINE
JLabel intro=new JLabel("Assalam u Alaikum! A Warmed Welcome to CAFEE RESTAURANT to you all.");
intro.setForeground(color.BLACK);
c.add(intro);
intro.setBounds(210,260,1500,70);
intro.setFont(para);

//ASKING TO CLICK ON YOU FAV OPTION
JLabel ask=new JLabel("ARE YOU COME FOR A");
ask.setForeground(color.WHITE);
c.add(ask);
ask.setBounds(580,370,500,70);
ask.setFont(qn);


//WORKING ON BUTTON
JButton bf=new JButton("Breakfast");
JButton lnch=new JButton("Lunch");
JButton dnr=new JButton("Dinner");


//time option buttons
bf.setBounds(400,500,200,90);
lnch.setBounds(700,500,200,90);
dnr.setBounds(1000,500,200,90);

jf.add(bf);
jf.add(lnch);
jf.add(dnr);

bf.setBackground(color.WHITE);
lnch.setBackground(color.WHITE);
dnr.setBackground(color.WHITE);

bf.setForeground(color.BLACK);
lnch.setForeground(color.BLACK);
dnr.setForeground(color.BLACK);

bf.setFont(para);
lnch.setFont(para);
dnr.setFont(para);




bf.addActionListener(this);
lnch.addActionListener(this);
dnr.addActionListener(this);



}




    @Override
 public void actionPerformed(ActionEvent e){
    
    String str=e.getActionCommand();
    if(str.equals("Breakfast")){
        menu.Menu bf=new menu.Menu();
        bf.BreakfastCalling();
    
    }
    if(str.equals("Lunch")){
        menu.Menu lnch=new menu.Menu();
        lnch.LunchCalling();
        
    }
    if(str.equals("Dinner")){
        menu.Menu dnr=new menu.Menu();
        dnr.DinnerCalling();
    }
}


}


class test {
    public static void main(String[] args){
        CafeeResturantManagementSystem rms=new CafeeResturantManagementSystem();
        rms.btn();
        
    }

}
