package vozm_napr;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
//import javax.swing.border.*;
//import com.borland.jbcl.layout.*;
//import java.beans.*;

public class AppLectMet_vozm_napr extends JApplet {
  boolean isStandalone = false;
  int step=0,ok=0;
  int x[]=new int[3];
  int y[]=new int[3];
  Panel_paint1 jPn1Main = new Panel_paint1();
  Panel_paint2 jPn1Plus = new Panel_paint2();
  JButton jbtnNext = new JButton();
  JButton jbtnNew = new JButton();
  JButton jbtnBack = new JButton();
  JCheckBox jChkbFormula = new JCheckBox();
  /**Get a parameter value*/
  public String getParameter(String key, String def) {
    return isStandalone ? System.getProperty(key, def) :
      (getParameter(key) != null ? getParameter(key) : def);
  }

  /**Construct the applet*/
  public AppLectMet_vozm_napr() {
  }
  /**Initialize the applet*/
  public void init() {
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
  /**Component initialization*/
  private void jbInit() throws Exception {

   this.getContentPane().setLayout(null);

   jbtnNext.setBounds(new Rectangle(430,515,127,23));
   jbtnNext.setBackground(new Color(167, 213, 255));
   jbtnNext.setFont(new java.awt.Font("Dialog", 1, 14));
   jbtnNext.setForeground(new Color(0, 0, 130));
   jbtnNext.setText("==>");
   this.getContentPane().add(jbtnNext, null);
   jbtnNext.addActionListener(new java.awt.event.ActionListener() {
     public void actionPerformed(ActionEvent e) {
       jbtnNext_actionPerformed(e);
     }
   });

   jbtnNew.setBounds(new Rectangle(280,515,127,23));
   jbtnNew.setBackground(new Color(167, 213, 255));
   jbtnNew.setFont(new java.awt.Font("Dialog", 1, 12));
   jbtnNew.setForeground(new Color(0, 0, 130));
   jbtnNew.setText("��������");
   this.getContentPane().add(jbtnNew, null);
   jbtnNew.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(ActionEvent e) {
       jbtnNew_actionPerformed(e);
     }
   });

   jbtnBack.setBounds(new Rectangle(130,515,127,23));
   jbtnBack.setBackground(new Color(167, 213, 255));
   jbtnBack.setFont(new java.awt.Font("Dialog", 1, 14));
   jbtnBack.setForeground(new Color(0, 0, 130));
   jbtnBack.setText("<==");
   this.getContentPane().add(jbtnBack, null);
   jbtnBack.addActionListener(new java.awt.event.ActionListener() {
     public void actionPerformed(ActionEvent e) {
       jbtnBack_actionPerformed(e);
     }
   });

   jChkbFormula.setBounds(545,483,100,20);
   jChkbFormula.setBackground(Color.white);
   jChkbFormula.setFont(new java.awt.Font("Dialog", 1, 14));
   jChkbFormula.setForeground(new Color(130, 0, 60));
   jChkbFormula.setBorder(BorderFactory.createLineBorder(new Color(164, 197, 151),1));
   jChkbFormula.setText("�������");
   jChkbFormula.setVisible(false);
   jChkbFormula.setSelected(false);
   this.getContentPane().add(jChkbFormula, null);
   jChkbFormula.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(MouseEvent e) {
        jChkbFormula_mousePressed(e);
      }
    });

   this.setSize(new Dimension(700,570));
   this.getContentPane().setBackground(new Color(80, 80, 180));

   jPn1Plus.setBackground(new Color(230, 230, 230));
   jPn1Plus.setBounds(new Rectangle(135, 80, 400, 410));
   jPn1Plus.setVisible(false);
   this.getContentPane().add(jPn1Plus, null);

   //jPn1Main.setBackground(new Color(0, 0, 130));
   jPn1Main.setBackground(new Color(31, 82, 113));
   jPn1Main.setBounds(new Rectangle(0, 0, 700, 570));
   this.getContentPane().add(jPn1Main, null);
  }
  /**Get Applet information*/
  public String getAppletInfo() {
    return "Applet Information";
  }
  /**Get parameter info*/
  public String[][] getParameterInfo() {
    return null;
  }

 //static initializer for setting look & feel
  static {
    try {
      //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      //UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
    }
    catch(Exception e) {
    }
  }

  class Panel_paint2 extends JPanel {
  public void paintComponent(Graphics g2) {
   super.paintComponent(g2);

   g2.setColor(new Color(167, 213, 255)); //
   g2.fill3DRect(1,1,398,408,true);       //
   g2.setColor(Color.white);              //
   g2.fillRect(20,20,360,370);            //
   g2.setColor(new Color(213, 225, 255)); //
   for(int i=0;i<38;i++)                  //
    g2.drawLine(20,20+i*10,380,20+i*10);  //            ���������� ����
   for(int i=0;i<37;i++)                  //
   g2.drawLine(20+i*10,20,20+i*10,370+20);   //
   g2.setColor(new Color(40,70,170));     //
   g2.drawRect(20,20,360,370);            //
   g2.setColor(new Color(150,0,0));       //
   g2.setFont(new Font("Dialog",1,14));   //
   g2.drawString("�������:",160,40);      //
   g2.setColor(new Color(0,0,80));        //
   g2.setFont(new Font("Dialog",3,12));   //

   if(step>=3)
    {
     g2.setColor(new Color(200,0,0));
     g2.setFont(new Font("Dialog",1,14));
     g2.drawString("(1)",350,70);
     g2.setColor(new Color(0,0,80));
     OptimizationBasic.drawFormula(g2,"f(x^{*}) = min f(x),",40,60,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
     OptimizationBasic.drawFormula(g2,"X = {x \u2208 R^{n} | g_{j}(x) \u2264 0; j = 1,..,m; m<n}",40,90,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
     OptimizationBasic.drawFormula(g2,"x \u2208 X",83,70,new java.awt.Font("Dialog",1,11),new java.awt.Font("Dialog",1,11));


     g2.drawLine(30,50,30,68);
     g2.drawLine(31,50,31,68);
     g2.drawLine(30,74,30,90);
     g2.drawLine(31,74,31,90);
     g2.drawLine(31,68,28,70);
     g2.drawLine(30,68,28,71);
     g2.drawLine(31,74,28,72);
     g2.drawLine(30,74,28,70);
     g2.drawLine(30,50,33,48);
     g2.drawLine(31,50,33,47);
     g2.drawLine(30,90,33,92);
     g2.drawLine(31,90,33,93);
     g2.drawLine(27,71,27,71);
    }
   if(step>=6)
    {
     g2.setColor(new Color(200,0,0));
     g2.setFont(new Font("Dialog",1,14));
     g2.drawString("(2)",350,120);
     g2.setColor(new Color(0,0,80));
     OptimizationBasic.drawFormula(g2,"x^{k+1} = x^{k} + t_{k}*s^{k}",40,120,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
    }
   if(step>=17)
    {
     g2.setColor(new Color(200,0,0));
     g2.setFont(new Font("Dialog",1,14));
     g2.drawString("(3)",350,160);
     g2.setColor(new Color(0,0,80));
     OptimizationBasic.drawFormula(g2,"min < f (x^{k}), s^{k} >",40,150,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
     g2.drawLine(88,138,88,142);
     g2.drawLine(89,138,89,142);
     OptimizationBasic.drawFormula(g2,"< g _{j} (x^{k}), s^{k} > \u2264 0   j \u2208 J_{a}",40,180,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
     g2.drawLine(62,168,62,172);
     g2.drawLine(63,168,63,172);

     g2.drawLine(30,140,30,158);
     g2.drawLine(31,140,31,158);
     g2.drawLine(30,164,30,180);
     g2.drawLine(31,164,31,180);
     g2.drawLine(31,158,28,160);
     g2.drawLine(30,158,28,161);
     g2.drawLine(31,164,28,162);
     g2.drawLine(30,164,28,160);
     g2.drawLine(30,140,33,138);
     g2.drawLine(31,140,33,137);
     g2.drawLine(30,180,33,182);
     g2.drawLine(31,180,33,183);
     g2.drawLine(27,161,27,161);
    }
   if(step>=19)
    {
     g2.setColor(new Color(200,0,0));
     g2.setFont(new Font("Dialog",1,14));
     g2.drawString("(3.1)",340,210);
     g2.setColor(new Color(0,0,80));
     OptimizationBasic.drawFormula(g2,"|| s || \u2264 1   s_{1} + s_{2} \u2264 1",40,210,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
     g2.setFont(new Font("Dialog",1,11));
     g2.drawString("2",117,200);
     g2.drawString("2",147,200);
    }
   if(step>=20)
    {
     g2.setColor(new Color(200,0,0));
     g2.setFont(new Font("Dialog",1,14));
     g2.drawString("(3.2)",340,240);
     g2.setColor(new Color(0,0,80));
     OptimizationBasic.drawFormula(g2,"| s_{j} | \u2264 1   -1 \u2264 s_{1} \u2264  1;  -1 \u2264 s_{2} \u2264  1",40,240,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
    }
   if(step>=31)
    {
     g2.setColor(new Color(200,0,0));
     g2.setFont(new Font("Dialog",1,14));
     g2.drawString("(4)",350,270);
     g2.setColor(new Color(0,0,80));
     OptimizationBasic.drawFormula(g2,"f ( x^{k} + t^{*}_{k}s^{k} ) = min  { f ( x^{k} + t_{k}s^{k}) }",40,270,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
     OptimizationBasic.drawFormula(g2,"t_{k} \u2265 0",145,280,new java.awt.Font("Dialog",1,11),new java.awt.Font("Dialog",1,11));
    }
   if(step>=34)
    {
     g2.setColor(new Color(200,0,0));
     g2.setFont(new Font("Dialog",1,14));
     g2.drawString("(5)",350,310);
     g2.setColor(new Color(0,0,80));
     OptimizationBasic.drawFormula(g2,"t^{j}_{k} = max { 0, g_{j} ( x^{k} + t_{k}s^{k}) = 0 }",40,300,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
     OptimizationBasic.drawFormula(g2,"j = 1 .. m",67,310,new java.awt.Font("Dialog",1,11),new java.awt.Font("Dialog",1,11));
     OptimizationBasic.drawFormula(g2,"t^{**}_{k} = min { t^{ j}_{k} > 0 }",40,330,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
     g2.setFont(new Font("Dialog",1,11));
     g2.drawString("j = 1..m",73,340);

     g2.drawLine(30,290,30,308);
     g2.drawLine(31,290,31,308);
     g2.drawLine(30,314,30,330);
     g2.drawLine(31,314,31,330);
     g2.drawLine(31,308,28,310);
     g2.drawLine(30,308,28,311);
     g2.drawLine(31,314,28,312);
     g2.drawLine(30,314,28,310);
     g2.drawLine(30,290,33,288);
     g2.drawLine(31,290,33,287);
     g2.drawLine(30,330,33,332);
     g2.drawLine(31,330,33,333);
     g2.drawLine(27,311,27,311);
    }
   if(step>=35)
    {
     g2.setColor(new Color(200,0,0));
     g2.setFont(new Font("Dialog",1,14));
     g2.drawString("(6)",350,360);
     g2.setColor(new Color(0,0,80));
     OptimizationBasic.drawFormula(g2,"t_{k} = min { t^{*}_{k} > 0 , t^{**}_{k} > 0 }",40,360,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
    }
   if(step>=38)
    {
     g2.setColor(new Color(0,0,80));
     OptimizationBasic.drawFormula(g2,"-\u03B5_{k} \u2264 < f  (x^{k}), s^{k} > < 0",35,380,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
     g2.drawLine(94,373,94,370);
     g2.drawLine(95,373,95,370);
     g2.setColor(new Color(200,0,0));
     g2.setFont(new Font("Dialog",1,14));
     g2.drawString("(7)",350,380);
    }
}}

  class Panel_paint1 extends JPanel {
  public void paintComponent(Graphics g1) {
   super.paintComponent(g1);
//----------------���������� ����-----------------------------------
   g1.setColor(new Color(0,0,50));
   //g1.setColor(new Color(31,82,113));
   g1.fill3DRect(12,13,655,500,true);
   g1.setColor(Color.white);
   g1.fill3DRect(10,10,651,496,true);
   //g1.setColor(new Color(0, 0, 130));
   g1.setColor(new Color(31, 82, 113));
   for(int i=0;i<57;i++)
    for(int j=0;j<57;j++)
      {
        if(Math.sqrt((j-9-57)*(j-9-57)+(i-9-57)*(i-9-57))>60)
         g1.drawRect(i,j,1,1);
      }

    //g1.setColor(new Color(0,0,150));
    g1.setColor(new Color(31, 82, 113));
    g1.drawLine(58,9,663,9);
    g1.drawArc(9,9,96,96,90,90);
    g1.drawLine(9,58,9,509);
    //g1.setColor(new Color(0,0,60));
    g1.drawLine(58,10,663,10);
    g1.drawArc(10,10,96,96,90,90);
    g1.drawLine(10,58,10,509);
    for(int i=1;i<=22;i++)
     {
      g1.setColor(new Color(0,0,0));
      g1.fillOval(41+i*25,16,8,8);
      g1.drawArc(35+i*25,1,20,20,9,270);
      g1.drawArc(34+i*25,0,20,20,5,270);
      g1.setColor(new Color(170,170,170));
      g1.drawArc(41+i*25,17,5,5,220,180);
      g1.drawArc(36+i*25,2,19,19,10,60);
      g1.drawArc(33+i*25,-1,23,23,110,70);
     }
    g1.setColor(new Color(213, 225, 255));

    for(int i=5;i<46;i++)
     g1.drawLine(40,30+i*10,630,30+i*10);
    for(int i=0;i<60;i++)
     g1.drawLine(40+i*10,80,40+i*10,480);

//--------------------------------------------
   if(step==0)
      {
       g1.setColor(new Color(0,0,160));
       g1.setFont(new Font("Dialog",1,26));
       g1.drawString("���� ������:",250,170);
       g1.setColor(new Color(130,0,60));
       g1.setFont(new Font("Dialog",1,28));
       g1.drawString("����� ��������� �����������",110,270);
       g1.setFont(new Font("Dialog",1,18));
       g1.setColor(new Color(60,0,250));
       g1.drawLine(80,280,590,280);
       g1.drawLine(160,290,510,290);
       g1.setColor(new Color(0,0,10));
       g1.drawLine(160,291,510,291);
       g1.drawLine(80,281,590,281);
       g1.setColor(new Color(40,70,170));
       g1.drawRect(40,80,590,400);
       jbtnBack.setEnabled(false);
      }
        else
        if(step!=61)
        {
          g1.setFont(new Font("Dialog",1,16));
          g1.setColor(new Color(130,0,60));
          g1.drawString("����� ��������� �����������",200,55);

          g1.setColor(new Color(100, 80, 255));
          g1.drawLine(150,62,520,62);
          g1.drawLine(230,70,440,70);
          g1.setColor(new Color(0, 0, 0));
          g1.drawLine(150,63,520,63);
          g1.drawLine(230,71,440,71);
        }

     if(step<2)
      {
       jPn1Plus.setVisible(false);
       jChkbFormula.setVisible(false);
       jChkbFormula.setSelected(false);
       ok=0;
      }
     if(ok==1 && jPn1Plus.isVisible()==false && step>=2)
        {
         jPn1Plus.setVisible(true);
         repaint();
        }
        else
         if(ok==0 && jPn1Plus.isVisible()==true)
          {
           jPn1Plus.setVisible(false);
           repaint();
          }
      if(step>=2 && step<=60)
       jChkbFormula.setVisible(true);
       else
        jChkbFormula.setVisible(false);
     if(step>=1)
      jbtnBack.setEnabled(true);
     if(step>=2 && step<=7)
     {
     if(step>=2)
      {
       if(step==2)
        g1.setColor(new Color(0,0,160));
        else
         g1.setColor(new Color(0,0,80));
       g1.setFont(new Font("Dialog",1,14));
       g1.drawString("���������� ��������� ������:",70,100);
       g1.drawString("����� ������� �������",50,120);
       OptimizationBasic.drawFormula(g1,"f(x) = f(x_{1},...x_{n})  ��� ��������� ������������, �.�. �����",235,120,new java.awt.Font("Dialog",1,14),new java.awt.Font("SanSerief",1,11));
       OptimizationBasic.drawFormula(g1,"����� x^{*} \u2208 X, ���",50,140,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
      }
     if(step>=3)
      {
       g1.setColor(new Color(246,246,250));
       g1.fillRect(160,150,360,40);
       g1.setColor(new Color(250,0,0));
       g1.drawRect(160,150,360,40);
       OptimizationBasic.drawFormula(g1,"f(x^{*}) = min f(x), X = {x\u2208R^{n} | g_{j}(x) \u2264 0; j = 1,..,m; m<n}",170,170,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       OptimizationBasic.drawFormula(g1,"x \u2208 X",213,180,new java.awt.Font("Dialog",1,11),new java.awt.Font("Dialog",1,11));
       g1.setFont(new Font("Dialog",1,14));
       g1.drawString("(1)",600,170);
       if(step==3)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
       OptimizationBasic.drawFormula(g1,"��� ������� g_{j}(x)\u2264 0,  j=1,..,m  �������� ����������������� ��������� x.",50,210,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
      }
     if(step>=4)
      {
       if(step==4)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
       g1.drawString("��� ������� ���� ������ ����� ������������ ����� ��������� ��������-",70,230);
       g1.drawString("���. ����������� s ����������",50,250);
       g1.drawString(", ����",380,250);
       g1.setColor(new Color(150,0,0));
       g1.setFont(new Font("Dialog",3,15));
       g1.drawString("���������",287,250);
       g1.setFont(new Font("Dialog",1,14));
       g1.setColor(new Color(246,246,250));
       g1.fillRect(200,260,270,30);
       g1.setColor(new Color(250,0,0));
       g1.drawRect(200,260,270,30);
       OptimizationBasic.drawFormula(g1,"\u2203 \u03BB^{|} > 0:    x + \u03BB*s  \u2208 X,    \u2200 \u03BB \u2208 [ 0,\u03BB^{|} ]",210,280,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,9));
      }
     if(step>=5)
      {
       if(step==5)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
       g1.drawString("������� ��������� �����",70,310);
       OptimizationBasic.drawFormula(g1,"x^{0}",268,310,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       g1.drawString("� ������� ���������� ��������, �.�. � �������,",288,310);
       g1.drawString("��� ����������� ��� �����������-�����������:",50,330);
       OptimizationBasic.drawFormula(g1,"x^{0} \u2208 X.",410,330,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
      }
     if(step>=6)
      {
       if(step==6)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
       g1.drawString("������ ����������� ����� ������ �� �������:",70,350);
       OptimizationBasic.drawFormula(g1,"��� t_{k} - �������� ����, s^{k} - ����������� ��������.",50,410,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       g1.setColor(new Color(246,246,250));
       g1.fillRect(270,360,130,30);
       g1.setColor(new Color(250,0,0));
       g1.drawRect(270,360,130,30);
       OptimizationBasic.drawFormula(g1,"x^{k+1} = x^{k}+ t_{k}*s^{k}",280,380,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       g1.setFont(new Font("Dialog",1,14));
       g1.drawString("(2)",600,380);
      }
     if(step>=7)
      {
       if(step==7)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
       g1.drawString("����� ��� ����������� �������. ����� �������� �����������",70,430);
       OptimizationBasic.drawFormula(g1,"s^{k}",535,430,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       g1.drawString("���, �����",555,430);
       g1.drawString("��� ������������ ����� ���� � ���������� �������. ����� ����, ����� ����-",50,450);
       g1.drawString("������� ����������� �������� ������� ������ �������.",50,470);
      }
     }
    if(step>=8 && step<=15)
     {
      if(step>=8)
       {
        g1.setColor(Color.white);
        g1.fillRect(50,110,330,190);
        if(step==8)
         g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
        OptimizationBasic.drawFormula(g1,"��� ����, ����� �������� ������� f(x) ������� � ������� ����������� s^{0},",70,100,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
        OptimizationBasic.drawFormula(g1,"�������� � ������������ � ���-",390,120,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,8));
        OptimizationBasic.drawFormula(g1,"�� x^{0}",390,140,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
        g1.setColor(new Color(0,0,160));
        g1.drawRect(50,110,330,190);
        g1.setColor(new Color(0,0,60));
        g1.drawLine(213,208,213,212);
        g1.drawLine(214,208,214,212);

        g1.drawOval(80,120,100,160);
        g1.drawOval(100,140,60,120);
        g1.drawOval(115,160,30,80);
        g1.fillOval(129,198,4,4);
        g1.setColor(new Color(177,197,255));
        x[0]=305; x[1]=365; x[2]=217;
        y[0]=145; y[1]=205; y[2]=266;
        g1.fillPolygon(x,y,3);
        g1.setColor(Color.blue);
        OptimizationBasic.drawFormula(g1,"g_{1} \u2264 0",240,130,new java.awt.Font("Dialog",1,12),new java.awt.Font("Dialog",1,11));
        OptimizationBasic.drawFormula(g1,"g_{2} \u2264 0",330,130,new java.awt.Font("Dialog",1,12),new java.awt.Font("Dialog",1,11));
        OptimizationBasic.drawFormula(g1,"g_{3} \u2264 0",290,250,new java.awt.Font("Dialog",1,12),new java.awt.Font("Dialog",1,11));
        g1.fillOval(263,200,4,4);
        g1.drawLine(330,111,194,299);
        g1.drawLine(270,111,379,220);
        g1.drawLine(379,200,140,299);
        g1.setColor(new Color(0,0,60));
        OptimizationBasic.drawFormula(g1,"x^{0}",270,210,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));

        g1.setColor(new Color(180,0,60));
        g1.drawLine(265,201,210,201);
        g1.drawLine(210,201,215,198);
        g1.drawLine(210,201,215,204);
        OptimizationBasic.drawFormula(g1,"-f  (x^{0})",200,220,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
        g1.drawLine(213,208,213,212);
        g1.drawLine(214,208,214,212);
       }
      if(step>=9)
        {
        if(step==9)
         g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
         g1.drawString("� ����� ��������� ������-",425,140);
         g1.drawString("����� ��������.",390,160);
        if(step==9)
         g1.setColor(new Color(72,104,255));
         else
          g1.setColor(new Color(130,160,255));
         g1.drawLine(264,110,264,300);
         g1.fillArc(244,176,40,50,90,180);
         g1.setColor(new Color(180,0,60));
         g1.drawLine(265,201,210,201);
         g1.setColor(Color.blue);
         g1.fillOval(263,200,4,4);
         g1.drawLine(330,111,194,299);
       }
      if(step>=10)
        {
        if(step==10)
         g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
        g1.drawString("��� ����, �����",515,160);
        g1.drawString("���������� �������� ������ ��-",390,180);
        g1.drawString("�����, �������� �������������",390,200);
        OptimizationBasic.drawFormula(g1,"� ��������� ����������� �� ���-",390,220,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,9));
        OptimizationBasic.drawFormula(g1,"�� x^{0} (����������� g_{j}(x) ������-",390,240,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
        g1.drawString("����",390,260);
        OptimizationBasic.drawFormula(g1,"� ����� x^{0}, ����",516,260,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
        OptimizationBasic.drawFormula(g1,"g_{j}(x^{0}) = 0)",390,280,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));

        g1.setColor(new Color(150,0,0));
        g1.setFont(new Font("Dialog",3,15));
        g1.drawString("��������",430,260);
        g1.setFont(new Font("Dialog",1,14));
        g1.setColor(new Color(151,39,217));
        g1.drawLine(264,200,210,165);
        g1.drawLine(210,165,213,172);
        g1.drawLine(210,165,217,165);
        OptimizationBasic.drawFormula(g1,"g_{2}(x^{0})",200,155,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,9));
        g1.drawLine(210,142,210,146);
        g1.drawLine(211,142,211,146);
      }
      if(step>=11)
        {
        if(step==11)
         g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
        g1.drawString("� ����� ������������-",460,280);
        g1.drawString("��� �����������.",390,300);
        if(step==11)
         g1.setColor(new Color(0,0,255));
          else
          g1.setColor(new Color(112,144,255));
        g1.drawArc(240,175,50,50,53,-134-90+48);
        g1.drawLine(279,180,252,218);
       }
      if(step>=12)
       {
        if(step==12)
         g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
        g1.drawString("����� ����� ����������� ������� � ��� ��� ������� ����� ��������� ��-",70,320);
        g1.drawString("��������� ��������, �� ������� ������� �������, ��� ���� �� ���������",50,340);
        g1.drawString("�����������, ������������� �������������.",50,360);
        g1.setColor(new Color(0,0,160));
        g1.fillArc(240,176,50,50,235,35);
        g1.setColor(new Color(180,0,60));
        g1.drawLine(264,201,264,206);
        g1.drawLine(263,201,263,206);
        g1.drawLine(265,201,265,206);

        g1.drawLine(264,211,264,216);
        g1.drawLine(265,211,265,216);
        g1.drawLine(263,211,263,216);

        g1.drawLine(264,220,264,225);
        g1.drawLine(265,220,265,225);
        g1.drawLine(263,220,263,225);

       }
      if(step>=13)
       {
        if(step==13)
         g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
        OptimizationBasic.drawFormula(g1,"���� ������ ������ ����������� �� ",376,360,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
        OptimizationBasic.drawFormula(g1,"����������, ������ ����� x^{0} �������� �����������.",50,380,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       }
     if(step>=14)
     {
      if(step==14)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
       g1.drawString("������������ ������� �������� ������� � ������ ����������� ��������-",70,400);
       g1.drawString("���� � ����:",50,420);
       g1.setColor(new Color(246,246,250));
       g1.fillRect(270,420,130,30);
       g1.setColor(new Color(250,0,0));
       g1.drawRect(270,420,130,30);
       OptimizationBasic.drawFormula(g1,"< f  ( x^{0}), s^{0} > < 0",280,440,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       g1.drawLine(302,429,302,433);
       g1.drawLine(303,429,303,433);
      }
      if(step>=15)
       {
       if(step==15)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
        g1.drawString("������ ���������� �������, ������� ����� ��������, ����� �����������",70,470);
       }
      }
     if(step>=16 && step<=20)
     {
      if(step>=16)
       {
       if(step==16)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
        g1.setFont(new Font("Dialog",1,14));
        g1.drawString("���� ���������:",50,100);
        OptimizationBasic.drawFormula(g1,"����� J_{a} - ��������� �������� j �����, ���  -\u03B5_{0} < g_{j}(x^{0}) \u2264 0,  \u03B5_{0}- ������� �����-",70,140,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
        OptimizationBasic.drawFormula(g1,"��� �������� ����������.",50,160,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));

        g1.setColor(new Color(246,246,250));
        g1.fillRect(240,90,190,30);
        g1.setColor(new Color(250,0,0));
        g1.drawRect(240,90,190,30);
        OptimizationBasic.drawFormula(g1,"< g _{j} (x^{0}), s^{0} > \u2264 0;   j \u2208 J_{a}",250,110,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
        g1.drawLine(272,98,272,102);
        g1.drawLine(273,98,273,102);
       }
      if(step>=17)
       {
       if(step==17)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
        g1.drawString("��������� �����������, ��������������� ������� ������������� �����-",70,180);
        g1.drawString("��� ������� ������ ���� ��� ����� ����� � �������������, ������� � �����",50,200);
        g1.drawString("���� ����� ������:",50,220);
        g1.setColor(new Color(246,246,250));
        g1.fillRect(240,220,190,50);
        g1.setColor(new Color(250,0,0));
        g1.drawRect(240,220,190,50);
        OptimizationBasic.drawFormula(g1,"min < f (x^{k}), s^{k} >",275,240,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
        g1.drawLine(323,228,323,231);
        g1.drawLine(324,228,324,231);
        OptimizationBasic.drawFormula(g1,"< g _{j} (x^{k}), s^{k} > \u2264 0;  j \u2208 J_{a}",250,260,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
        g1.drawLine(272,248,272,252);
        g1.drawLine(273,248,273,252);
        g1.setFont(new Font("Dialog",1,14));
        g1.drawString("(3)",600,250);
       }
      if(step>=18)
       {
       if(step==18)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
        g1.drawString("����������� ������ (3) - ������ ��������� ����������������. ��� ���� ��-",70,290);
        g1.drawString("����� ������� ����� ���� ������������ �� ���������� ���������.",50,310);
       }
     if(step>=19)
       {
       if(step==19)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
        g1.drawString("��� ����, ����� ������ ������, ������� ����������� �� �����������:",70,330);
        g1.setColor(new Color(246,246,250));
        g1.fillRect(250,340,170,30);
        g1.setColor(new Color(250,0,0));
        g1.drawRect(250,340,170,30);
        OptimizationBasic.drawFormula(g1,"|| s || \u2264 1   s_{1}^{2}+ s_{2}^{2}\u2264 1",260,360,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
        g1.setFont(new Font("Dialog",1,14));
        g1.drawString("(3.1)",590,360);
      }
     if(step>=20)
      {
       if(step==20)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
        g1.drawString("���",320,390);
        g1.drawString("������� (3.1) � (3.2) ���������� ���������",70,450);
        g1.drawString("������� s � ����-",502,450);
        g1.drawString("��������� ��� ����, ����� ������� ���� ��������.",50,470);
        g1.setColor(new Color(150,0,0));
        g1.setFont(new Font("Dialog",3,15));
        g1.drawString("������������",390,450);
        g1.setFont(new Font("Dialog",1,14));
        g1.setColor(new Color(246,246,250));
        g1.fillRect(220,400,230,30);
        g1.setColor(new Color(250,0,0));
        g1.drawRect(220,400,230,30);
        OptimizationBasic.drawFormula(g1,"| s_{j} | \u2264 1   -1 \u2264s_{1}\u2264 1;  -1 \u2264s_{2}\u2264 1",230,420,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
        g1.setFont(new Font("Dialog",1,14));
        g1.drawString("(3.2)",590,420);
       }
     }
      if(step>=21 && step<=28)
     {
       if(step>=21)
      {
       if(step==21)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
       OptimizationBasic.drawFormula(g1,"�� ����� ��������� ����������� s^{k}, ����� ������ �������������",70,100,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       OptimizationBasic.drawFormula(g1,"���������������� (3)+(3.1) ��� ������ ��������� ���������������� (3)+(3.2).",50,120,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));

      }
      if(step>=22)
       {
        g1.setColor(Color.white);
        g1.fillRect(50,150,330,190);
        if(step==22)
         g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
        OptimizationBasic.drawFormula(g1,"���������� ���������� ������ � ����������� �������������: ��������",70,140,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
        OptimizationBasic.drawFormula(g1,"������������ ������� � ����� x^{0}",390,160,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
        g1.setColor(new Color(0,0,160));
        g1.drawRect(50,150,330,190);
        g1.setColor(new Color(0,0,60));

        g1.drawOval(80,160,100,160);
        g1.drawOval(100,180,60,120);
        g1.drawOval(115,200,30,80);
        g1.fillOval(129,238,4,4);
        g1.setColor(new Color(177,197,255));
        g1.fillArc(380-168+20-12,360-70-100-30+50-12,350-14-40+24,160+60+40+24,105,70);
        g1.setColor(Color.white);
        g1.fillArc(380-160-35+7-40,358-166+7+80+25-20,350-14+40+80,296-14-100-60-30+20,90,90);

        g1.setColor(Color.blue);
        OptimizationBasic.drawFormula(g1,"g_{1} \u2264 0",280,165,new java.awt.Font("Dialog",1,12),new java.awt.Font("Dialog",1,11));
        OptimizationBasic.drawFormula(g1,"g_{2} \u2264 0",340,190,new java.awt.Font("Dialog",1,12),new java.awt.Font("Dialog",1,11));
        OptimizationBasic.drawFormula(g1,"g_{3} \u2264 0",290,300,new java.awt.Font("Dialog",1,12),new java.awt.Font("Dialog",1,11));
        g1.fillOval(263,240,4,4);
        g1.drawArc(380-168+20-12,360-70-100-30+50-12,350-14-40+24,160+60+40+24,90,90);
        g1.drawArc(380-160-35+7-40,358-166+7+80+25-20,350-14+40+80,296-14-100-60-30+20,90,55);
        g1.drawLine(380,340,320,150);
        g1.drawLine(5+160-7+20+14,340-35+3,5+160-7-13-40,340);

        /*g1.drawArc(198,191,400,400,95,70);
        g1.drawArc(-240,145,700,700,80,-40);
        g1.drawArc(198-50,191+90-40,700,400,110,40);
*/
        g1.setColor(new Color(0,0,60));
        OptimizationBasic.drawFormula(g1,"x^{0}",270,250,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));

        g1.setColor(new Color(180,0,60));
        g1.drawLine(265,241,210,241);
        g1.drawLine(210,241,215,238);
        g1.drawLine(210,241,215,244);
        OptimizationBasic.drawFormula(g1,"-f  (x^{0})",200,260,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
        g1.drawLine(213,248,213,252);
        g1.drawLine(214,248,214,252);
       }
      if(step>=23)
        {
        if(step==23)
         g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
         g1.drawString("� ����� ��������� �����������",390,180);
         g1.drawString("��������.",390,200);
        if(step==23)
         g1.setColor(new Color(72,104,255));
         else
          g1.setColor(new Color(130,160,255));
         g1.drawLine(264,150,264,340);
         g1.fillArc(244,216,40,50,90,180);
         g1.setColor(new Color(180,0,60));
         g1.drawLine(265,241,210,241);
         g1.setColor(Color.blue);
         g1.fillOval(263,240,4,4);
       }
      if(step>=24)
        {
        if(step==24)
         g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
        g1.drawString("�������� ��������-",470,200);
        g1.drawString("����� � �����������, �������-",390,220);
        g1.drawString("��� � ��������� ����������� �",390,240);
        OptimizationBasic.drawFormula(g1,"����� x^{0}",390,260,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));

        g1.setFont(new Font("Dialog",1,14));
        g1.setColor(new Color(151,39,217));
        g1.drawLine(360,151,156,339);
        g1.drawLine(264,240,210,205);
        g1.drawLine(210,205,213,212);
        g1.drawLine(210,205,217,205);
        OptimizationBasic.drawFormula(g1,"g_{2}(x^{0})",200,195,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,9));
        g1.drawLine(210,182,210,186);
        g1.drawLine(211,182,211,186);
      }
      if(step>=25)
        {
        if(step==25)
         g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
        g1.drawString("� ����� ������������-",453,260);
        g1.drawString("��� �����������.",390,280);
        if(step==25)
         g1.setColor(new Color(0,0,255));
          else
          g1.setColor(new Color(112,144,255));
        g1.drawArc(240,215,50,50,43,-134-90+44);
        g1.drawLine(284,222,247,256);
       }
      if(step>=26)
       {
        if(step==26)
         g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
        g1.drawString("����� �����",530,280);
        g1.drawString("���������� ������� ��� ��� ��-",390,300);
        g1.drawString("����� ����� ��������� ������-",390,320);
        g1.drawString("����� ��������.",390,340);

         g1.setColor(new Color(0,0,160));
        g1.fillArc(240,215,50,50,223,48);
       }
      if(step>=27)
       {
        g1.setColor(Color.red);
        g1.fillArc(240,215,50,50,222,7);
        g1.drawLine(265,241,265,264);
        g1.drawLine(264,241,264,264);
        if(step==27)
         g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
        OptimizationBasic.drawFormula(g1,"��� ����� �� �������, �� ��� ����������� ��� ����������: ���� ������� ������",50,360,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
        g1.drawString("������� �� �������, ������ - �� ��� �������� �������.",50,380);
       }
     if(step>=28)
     {
      if(step==28)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
       g1.drawString("������� ��� ��������-",465,380);
       OptimizationBasic.drawFormula(g1,"���-���������� �������� ��������������� ���������� \u03BE � �������� ������:",50,400,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       g1.setColor(new Color(246,246,250));
       g1.fillRect(250,410,170,70);
       g1.setColor(new Color(250,0,0));
       g1.drawRect(250,410,170,70);
       OptimizationBasic.drawFormula(g1,"min \u03BE = ?",305,430,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       OptimizationBasic.drawFormula(g1,"< f  ( x^{k}), s^{k} > - \u03BE \u2264 0",260,450,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       g1.drawLine(282,439,282,443);
       g1.drawLine(283,439,283,443);
       OptimizationBasic.drawFormula(g1,"< g_{j}  ( x^{k}), s^{k} > - \u03BE \u2264 0",260,470,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       g1.drawLine(282,459,282,463);
       g1.drawLine(283,459,283,463);
      }
        }
    if(step>=29 && step<=36)
     {
       if(step>=29)
       {
       if(step==29)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
          g1.setFont(new Font("Dialog",1,14));
        g1.drawString("�.�., � �������������� ������� ������������ (3.1) ��� (3.2) (��. �������),",70,100);
        OptimizationBasic.drawFormula(g1,"��������� ����������� �������� s^{k},�� ��������� ��� �� ���������� �������.",50,120,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       }
      if(step>=30)
      {
       if(step==30)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
        OptimizationBasic.drawFormula(g1,"��������� �������� ���� t_{k}:",70,140,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
        g1.drawString("1) ��� ���������� ���, ����� ������� �������.",50,160);
      }
      if(step>=31)
       {
       if(step==31)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
        g1.setFont(new Font("Dialog",1,14));
        OptimizationBasic.drawFormula(g1,"��� ����� ����� ����� t^{*}_{k}:",70,180,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
        g1.setColor(new Color(246,246,250));
        g1.fillRect(210,190,250,40);
        g1.setColor(new Color(250,0,0));
        g1.drawRect(210,190,250,40);
        OptimizationBasic.drawFormula(g1,"f ( x^{k}+ t^{*}_{k}s^{k} ) = min  { f ( x^{k}+ t_{k}s^{k}) }",220,210,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
        OptimizationBasic.drawFormula(g1,"t_{k} \u2265 0",322,220,new java.awt.Font("Dialog",1,11),new java.awt.Font("Dialog",1,11));
        g1.setFont(new Font("Dialog",1,14));
        g1.drawString("(4)",600,210);
       }
      if(step>=32)
       {
       if(step==32)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
        g1.setFont(new Font("Dialog",1,14));
        g1.drawString("2) ��� �� ������ �������� ��� �� ���������� �������.",50,250);
        }
     if(step>=33)
       {
       if(step==33)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
        g1.drawString("��� ����� �������",70,270);
        g1.setColor(new Color(246,246,250));
        g1.fillRect(220,280,230,40);
        g1.setColor(new Color(250,0,0));
        g1.drawRect(220,280,230,40);
        OptimizationBasic.drawFormula(g1,"t^{j}_{k} = max { 0, g_{j} ( x^{k} + t_{k}s^{k}) = 0 }",230,300,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
        OptimizationBasic.drawFormula(g1,"j = 1 .. m",257,310,new java.awt.Font("Dialog",1,11),new java.awt.Font("Dialog",1,11));
       }
     if(step>=34)
       {
       if(step==34)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
         OptimizationBasic.drawFormula(g1,"�",328,340,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,9));
         g1.setColor(new Color(246,246,250));
         g1.fillRect(260,350,150,40);
         g1.setColor(new Color(250,0,0));
         g1.drawRect(260,350,150,40);
         OptimizationBasic.drawFormula(g1,"t^{**}_{k} = min { t^{ j}_{k} > 0 }",270,370,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));

         g1.setFont(new Font("Dialog",1,11));
         g1.drawString("j = 1..m",303,380);
         g1.setFont(new Font("Dialog",1,14));
         g1.drawString("(5)",600,350);
         }
      if(step>=35)
       {
       if(step==35)
        g1.setColor(new Color(0,0,160));
         else
         g1.setColor(new Color(0,0,80));
         g1.drawString("������������ �������� �������� ����:",70,410);
         g1.setColor(new Color(246,246,250));
         g1.fillRect(240,420,190,30);
         g1.setColor(new Color(250,0,0));
         g1.drawRect(240,420,190,30);
         OptimizationBasic.drawFormula(g1,"t_{k} = min { t^{*}_{k} > 0 , t^{**}_{k} > 0 }",250,440,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
         g1.setFont(new Font("Dialog",1,14));
         g1.drawString("(6)",600,440);
       }
      if(step>=36)
       {
       if(step==36)
        g1.setColor(new Color(0,0,160));
         else
         g1.setColor(new Color(0,0,80));
       g1.drawString("������ � ��� ���� ��� ��������� ��� ���������� ��������� ������������",70,470);
       }
     }
     if(step>=37 && step<=48)
     {
     if(step>=37)
       {
       if(step==37)
        g1.setColor(new Color(0,0,160));
         else
         g1.setColor(new Color(0,0,80));
         g1.setFont(new Font("Dialog",1,14));
         g1.drawString("����� �� ������� (2) (��. �������). ����� ���������� ������� ������, ����",50,100);
         g1.drawString("�� ���������� �������� ���������:",50,120);
        }
       if(step>=38)
       {
        if(step==38)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
          g1.setColor(new Color(246,246,250));
          g1.fillRect(250,130,170,30);
          g1.setColor(new Color(250,0,0));
          g1.drawRect(250,130,170,30);
          OptimizationBasic.drawFormula(g1,"-\u03B5_{k} \u2264 < f  (x^{k}), s^{k} > < 0",260,150,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
          g1.drawLine(319,143,319,140);
          g1.drawLine(320,143,320,140);
          g1.setFont(new Font("Dialog",1,14));
          g1.drawString("(7)",600,150);
       }
      if(step>=39)
       {
       if(step==39)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
        OptimizationBasic.drawFormula(g1,"���������� ��������� ���������� ������:",50,180,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       }
      if(step>=40)
       {
        if(step==40)
         g1.setColor(new Color(0,0,160));
          else
            g1.setColor(new Color(0,0,80));
       OptimizationBasic.drawFormula(g1,"�������� ����� ������ �������",380,180,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       OptimizationBasic.drawFormula(g1,"f(x)",360,200,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       g1.setColor(Color.white);
       g1.fillRect(51,191,299,239);
       g1.setColor(new Color(0,0,80));
       g1.drawLine(77, 191, 77, 429);
       g1.drawLine(51, 405, 349, 405);
       g1.drawLine(77, 191, 81, 201);
       g1.drawLine(77, 191, 73, 201);
       g1.drawLine(336, 409, 349, 405);
       g1.drawLine(336, 401, 349, 405);
       OptimizationBasic.drawFormula(g1,"x_{1}",327,420,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       OptimizationBasic.drawFormula(g1,"x_{2}",57,205,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       g1.setColor(new Color(0,0,160));
       g1.drawRect(50,190,300,240);
       for ( int i = 1; i <= 3; i++)
        g1.drawOval( 135+42 - i*40, 175+150 - i*20, i*80+5, i*40+5 );
       g1.fillOval( 136+42, 176+150, 4, 4 );
       OptimizationBasic.drawFormula(g1,"f ( x ) = f ( x_{ 1} , x_{ 2} )", 212, 258,new java.awt.Font("Dialog",3,12),new java.awt.Font("Dialog",3,11));
      }
      if(step>=41)
       {
        if(step==41)
         g1.setColor(new Color(0,0,160));
          else
            g1.setColor(new Color(0,0,80));
        OptimizationBasic.drawFormula(g1,"� ��������� ���������� �����-", 390, 200,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
        OptimizationBasic.drawFormula(g1,"��� X = { x\u2208R^{2}| g_{j}(x) \u2264 0, j=1,..,m}.", 360, 220,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
      if(step==41)
       {
        g1.setColor(Color.red);
        g1.drawLine(17-8+42, 189-4+150, 285+42, 279+150);
        g1.drawLine(17-8+42, 109+150, 180+42, 279+150);
        g1.drawLine(35+42, 41+150, 35+42, 279+150);
        g1.drawLine(9+42, 255+150, 305+42, 255+150);
        OptimizationBasic.drawFormula(g1,"g_{ 1}( x ) \u2264 0", 155+42, 225+150,new java.awt.Font("Dialog",1,12),new java.awt.Font("Dialog",1,11));
        OptimizationBasic.drawFormula(g1,"g_{ 2}( x ) \u2264 0", 65+42, 150+150,new java.awt.Font("Dialog",1,12),new java.awt.Font("Dialog",1,11));
        OptimizationBasic.drawFormula(g1,"g_{ 3}( x ) \u2264 0", 235+42, 235+150,new java.awt.Font("Dialog",1,12),new java.awt.Font("Dialog",1,11));
        OptimizationBasic.drawFormula(g1,"g_{ 4}( x ) \u2264 0", 50+42, 70+150,new java.awt.Font("Dialog",1,12),new java.awt.Font("Dialog",1,11));
      double i = -1.2;
      while (i <= 13.25) {
       if ( i <= 12.1 )
         g1.drawLine( (int) (35 +42+ i * 20), (int) (250+150 - (9 - i) * 20 / 3.0+5),
                     (int) (38 +42+ i * 20), (int) (255+150 - (9 - i) * 20 / 3.0+5));
       if ( i <= 6.9 )
         g1.drawLine( (int) (35 +42+ i * 20), (int) (255+150 - (6 - i) * 20 ),
                     (int) (35 +42+ i * 20), (int) (260+150 - (6 - i) * 20 ) );
       if ( i <= 10.5 )
         g1.drawLine( 35+42, (int) (255+150 -  i * 20 ), 39+42, (int) (250+150 -  i * 20 ) );
       g1.drawLine( (int)(35+42+i*20), 255+150 , (int)(39+42+i*20), 250+150  );
       i = i + 0.3;
       }
      }
      }
      if(step>=42)
       {
        if(step==42)
         g1.setColor(new Color(0,0,160));
          else
            g1.setColor(new Color(0,0,80));
        OptimizationBasic.drawFormula(g1,"����-", 589, 220,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
        OptimizationBasic.drawFormula(g1,"���� ������� ���������� ��������.", 360, 240,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
     g1.setColor(new Color(157, 187, 255));
    g1.fillPolygon( new int[] {35+42, 35+42, 125+42, 155+42}, new int[]  {255+150, 195+150, 225+150, 255+150}, 4 );
    g1.setColor( Color.black );
    g1.drawPolygon(new int[] {35+42, 35+42, 125+42, 155+42}, new int[]  {255+150, 195+150, 225+150, 255+150}, 4 );
    if ( step == 42 ){
      g1.setColor(Color.red);
      g1.drawLine(150+42, 225+150, 110+42, 235+150);
      g1.drawLine(151+42, 226+150, 111+42, 236+150);
      Arrow(150+42, 225+150, 110+42, 235+150, g1);
      Arrow(151+42, 226+150, 111+42, 236+150, g1);
      g1.drawLine(150+42, 225+150, 165+42, 225+150);
      g1.drawLine(150+42, 226+150, 165+42, 226+150);
      g1.drawString("X", 170+42, 230+150);
      }
      }
     if(step>=43)
       {
        if(step==43)
         g1.setColor(new Color(0,0,160));
          else
            g1.setColor(new Color(0,0,80));
        OptimizationBasic.drawFormula(g1,"������� ��������� ����� x^{0}, �����", 360, 260,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
        OptimizationBasic.drawFormula(g1,"\u03B5_{0 }>0 ��� ��������� ���������, ���-", 360, 280,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
        OptimizationBasic.drawFormula(g1,"������� ����� �������� M. �������", 357, 300,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
        OptimizationBasic.drawFormula(g1,"k=0.", 360, 320,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
     if (step >= 43){
     if (step < 53)
       g1.setColor(Color.red);
     else
       g1.setColor(new Color(180, 0, 80));
     g1.fillOval(33+43, 193+150, 4, 4);
     OptimizationBasic.drawFormula(g1,"x^{ 0}", 40+42, 195+150,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       }
     }
     if(step>=44)
       {
        if(step==44)
         g1.setColor(new Color(0,0,160));
          else
            g1.setColor(new Color(0,0,80));
       OptimizationBasic.drawFormula(g1,"�������� �������� �������", 395, 320,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       OptimizationBasic.drawFormula(g1,"g_{j}(x^{0});  j=1,..,m.", 360, 340,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
     }
    if(step>=45)
       {
        if(step==45)
         g1.setColor(new Color(0,0,160));
          else
            g1.setColor(new Color(0,0,80));
       OptimizationBasic.drawFormula(g1,"���������� ������-", 470, 340,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       OptimizationBasic.drawFormula(g1,"��� J_{ a} �������� j:  -\u03B5_{0} < g_{j}(x^{0}) \u2264 0.", 360, 360,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
      }
     if(step>=46)
       {
         g1.setColor(new Color(246,246,250));
         g1.fillRect(400,390,190,43);
         g1.setColor(new Color(250,0,0));
         g1.drawRect(400,390,190,43);
         g1.setColor(Color.red);
         OptimizationBasic.drawFormula(g1,"\u2207f( x^{ 0} )^{ T} s^{ 0} < 0,", 410, 407,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
         OptimizationBasic.drawFormula(g1,"\u2207g_{ j}( x^{ 0} )^{ T} s^{ 0} \u2264 0, j \u2208 J_{ a}", 410, 425,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));

        if(step==46)
         g1.setColor(new Color(0,0,160));
          else
            g1.setColor(new Color(0,0,80));
       OptimizationBasic.drawFormula(g1,"��-", 603, 360,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       OptimizationBasic.drawFormula(g1,"�������� ������� ����������:", 360, 380,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
      }
     if(step>=47)
       {
        if(step==47)
         g1.setColor(new Color(0,0,160));
          else
            g1.setColor(new Color(0,0,80));
       OptimizationBasic.drawFormula(g1,"���������� ������ ��������� ���������������� (3) + (3.2) (��. �������).", 50, 450,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
      }
     if(step>=48)
       {
        if(step==48)
         g1.setColor(new Color(0,0,160));
          else
            g1.setColor(new Color(0,0,80));
        OptimizationBasic.drawFormula(g1,"�.�.", 600, 450,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
        OptimizationBasic.drawFormula(g1,"������ ������ �������� ������� � E^{ 2}, �� ����� ������ � ����������. ������", 50, 470,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
    }
   }
   if(step>=49 && step<=55)
     {
      if(step>=49)
       {
        g1.setColor(Color.white);
        g1.fillRect(51,131,297,239);
        g1.setColor(new Color(0,0,160));
        g1.drawRect(50,130,298,240);
        if(step==49)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
        OptimizationBasic.drawFormula(g1,"����� ������ ������� F(s). ������� ����������� �������� F(s) �� ���������,", 50, 100,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
        OptimizationBasic.drawFormula(g1,"��������� � ����� ������ �� ����������� ������������� -\u2207f( x^{ 0}).", 50, 120,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
if(step==49 || step==50 || step==51)
{
      Polygon polygon1 = new Polygon( new int[] {135+42, 215+42, 215+42, 135+42},
                                  new int[] {155+90, 181+90, 235+90, 235+90}, 4 );
  g1.setColor( new Color(157, 187, 255) );
  g1.fillPolygon(polygon1);
  g1.setColor( Color.black );
  g1.setFont( new java.awt.Font("Dialog", 3, 12) );
  g1.drawLine( 9+42, 155+90, 295+42, 155+90 );
  g1.drawLine( 135+42, 45+90, 135+42, 279+90 );
  g1.drawLine( 55+42, 75+90, 215+42, 75+90 );
  g1.drawLine( 215+42, 75+90, 215+42, 235+90 );
  g1.drawLine( 55+42, 75+90, 55+42, 235+90 );
  g1.drawLine( 55+42, 235+90, 215+42, 235+90 );
  Arrow(135+42, 155+90, 135+42, 45+90, g1);
  Arrow(135+42, 155+90, 295+42, 155+90, g1);
  g1.drawPolygon(polygon1);
  g1.drawString( "1", 121+42, 65+90 );
  g1.drawString( "1", 205+42, 170+90 );
  g1.drawString( "-1", 35+42, 170+90 );
  g1.drawString( "-1", 121+42, 249+90 );

  g1.drawLine( 135+42, 155+90, 245+42, 111+90 );
  Arrow(135+42, 155+90, 245+42, 111+90, g1);
  g1.setFont( new java.awt.Font("Dialog", 3, 12) );
  OptimizationBasic.drawFormula(g1,"-\u2207f( x^{ 0})", 220+42, 102+90,new java.awt.Font("Dialog",3,14),new java.awt.Font("Dialog",3,11));
  OptimizationBasic.drawFormula(g1,"s_{ 1}", 285+42, 170+90,new java.awt.Font("Dialog",3,14),new java.awt.Font("Dialog",3,11));
  OptimizationBasic.drawFormula(g1,"s_{ 2}", 145+42, 53+90,new java.awt.Font("Dialog",3,14),new java.awt.Font("Dialog",3,11));

  g1.setFont( new java.awt.Font("Dialog", 3, 12) );
  if (step == 50 || step==49) {
    g1.setColor(new Color(171, 0, 255));
    g1.drawString(" ___ ����� ������ ������� F(s)", 25+42, 275+90);
    double a = - 2.0;
    while ( a <= 2.8 ){
      if( a >= -1.0 && a < 0.4)
       g1.drawLine( (int) (128+42 + 80 * (-0.4 * 1.2 + a)), 41+90,
                  (int) (135+42 + 80 * (-0.4 * ( -1.2 ) + a)),
                  (int) (155+90 - ( -1.2) * 80));
      if( a >= 0.4 && a < 1.4)
       g1.drawLine( (int) (128+42 + 80 * (-0.4 * 1.2 + a)), 41+90,
                  (int) (135+42 + 80 * (-0.4 * ( -1.2 ) + a+0.15)),
                  279+90);
      if(a >= 1.4)
       g1.drawLine( (int) (128+42 + 80 * (-0.4 * 1.2 + a)), 41+90,
                  305+42,(int) (30+90-(-2.8+a)*188));
      if(a < -1)
       g1.drawLine( 9+42, (int) (240+90-(2+a)*200),
                  (int) (135+42 + 80 * (-0.4 * ( -1.2 ) + a)),
                  (int) (155+90 - ( -1.2) * 80));
      a = a + 0.2;
    }
  } else
  if (step == 51)
   {
    g1.setColor(Color.red);
    g1.drawLine( (int) (127+42 + 80 * (-0.4 * 1.2 + 0.87)),41+90,
                (int) (147+42 + 80 * (-0.4 * ( -1.2 ) + 0.87)),
                279+90);

    g1.drawLine( 135+42, 155+90, 215+42, 181+90 );
    Arrow(135+42, 155+90, 215+42, 181+90, g1);
    OptimizationBasic.drawFormula(g1,"s_{ 0}", 198+42, 195+90,new java.awt.Font("Dialog",3,14),new java.awt.Font("Dialog",3,11));
 }
   }
       }
      if(step>=50)
       {
       if(step==50)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
      OptimizationBasic.drawFormula(g1,"��������� ����� ������� ����� ����-", 360, 140,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
      OptimizationBasic.drawFormula(g1,"�� ��������� ����� ������ ������-", 360, 160,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
      OptimizationBasic.drawFormula(g1,"��.", 360, 180,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
     }
  if(step>=51)
    {
     if(step==51)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
     OptimizationBasic.drawFormula(g1,"� ���������� ��������� �������", 390, 180,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
     OptimizationBasic.drawFormula(g1,"��������� ����������� ������ s^{ 0}.", 360, 200,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
   }
  if(step>=52)
    {
     if(step==52)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
     OptimizationBasic.drawFormula(g1,"��������� ������� ��������� (7)", 360, 220,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
     OptimizationBasic.drawFormula(g1,"(��. �������). ���� ��� ���������-", 360, 240,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
     OptimizationBasic.drawFormula(g1,"��, �� x^{0} - ����������� ������� ��-", 360, 260,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
     OptimizationBasic.drawFormula(g1,"����. ����� ���������� ������� ��-", 360, 280,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
     OptimizationBasic.drawFormula(g1,"����.", 360, 300,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       g1.setColor(new Color(0,0,80));
       g1.drawLine(77, 131, 77, 369);
       g1.drawLine(51, 345, 349, 345);
       g1.drawLine(77, 131, 81, 141);
       g1.drawLine(77, 131, 73, 141);
       g1.drawLine(336, 349, 349, 345);
       g1.drawLine(336, 341, 349, 345);
       OptimizationBasic.drawFormula(g1,"x_{1}",327,360,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       OptimizationBasic.drawFormula(g1,"x_{2}",57,145,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       g1.setColor(new Color(0,0,160));
       for ( int i = 1; i <= 3; i++)
        g1.drawOval( 135+42 - i*40, 175+150 - i*20-60, i*80+5, i*40+5 );
       g1.fillOval( 136+42, 176+150-60, 4, 4 );
       OptimizationBasic.drawFormula(g1,"f ( x ) = f ( x_{ 1} , x_{ 2} )", 212, 258-60,new java.awt.Font("Dialog",3,12),new java.awt.Font("Dialog",3,11));
    g1.setColor(new Color(157, 187, 255));
    g1.fillPolygon( new int[] {35+42, 35+42, 125+42, 155+42}, new int[]  {255+150-60, 195+150-60, 225+150-60, 255+150-60}, 4 );
    g1.setColor( Color.black );
    g1.drawPolygon(new int[] {35+42, 35+42, 125+42, 155+42}, new int[]  {255+150-60, 195+150-60, 225+150-60, 255+150-60}, 4 );
    g1.setColor(Color.red);
    g1.fillOval(33+43, 193+150-60, 4, 4);
     OptimizationBasic.drawFormula(g1,"x^{ 0}", 40+42, 195+150-60,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
    }
   if(step>=53)
    {
     if(step==53)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
     OptimizationBasic.drawFormula(g1,"�� ������� (4) ������� ����-", 400, 300,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
     OptimizationBasic.drawFormula(g1,"���� t^{*}_{0}.", 360, 320,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
    }
   if(step>=54)
    {
     if(step==54)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
     OptimizationBasic.drawFormula(g1,"���������� �������� t^{ j}_{0}.", 425, 320,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
     OptimizationBasic.drawFormula(g1,"����� ���� ������������� t^{ j}_{0} ��-", 360, 340,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
     OptimizationBasic.drawFormula(g1,"����� t^{**}_{0} (������� (5)).", 360, 360,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
     }
    if(step>=55)
    {
     if(step==55)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
     OptimizationBasic.drawFormula(g1,"���������", 540, 360,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
     OptimizationBasic.drawFormula(g1,"�������� t_{0}:", 360, 380,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       g1.setColor(new Color(246,246,250));
       g1.fillRect(150,390,360,90);
       g1.setColor(new Color(250,0,0));
       g1.drawRect(150,390,360,90);
     OptimizationBasic.drawFormula(g1,"���� t^{*}_{ 0} > 0, t^{**}_{ 0} > 0, �� t_{ 0} = min( t^{*}_{ 0} > 0, t^{**}_{ 0} > 0 );", 160, 410,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
     OptimizationBasic.drawFormula(g1,"���� t^{*}_{ 0} > 0, t^{**}_{ 0} = 0, �� t_{ 0} = t^{*}_{ 0};", 160, 430,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
     OptimizationBasic.drawFormula(g1,"���� t^{*}_{ 0} = 0, t^{**}_{ 0} > 0, �� t_{ 0} = t^{**}_{ 0};", 160, 450,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
     OptimizationBasic.drawFormula(g1,"���� t^{*}_{ 0} = 0, t^{**}_{ 0} = 0, �� t_{ 0} = 0.", 160, 470,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
    }
  }
  if(step>=56 && step<=60)
     {
     if(step>=56)
    {
     if(step==56)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
     OptimizationBasic.drawFormula(g1,"�� ������� (2) ������� ��������� ������������ ����� x^{1}.", 70, 100,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       g1.setColor(Color.white);
       g1.fillRect(51,111,277,239);
       g1.setColor(new Color(0,0,160));
       g1.drawRect(50,110,278,240);
       g1.setColor(Color.red);
       g1.setColor(new Color(0,0,80));
       g1.drawLine(77, 111, 77, 349);
       g1.drawLine(51, 325, 329, 325);
       g1.drawLine(77, 111, 81, 121);
       g1.drawLine(77, 111, 73, 121);
       g1.drawLine(316, 329, 329, 325);
       g1.drawLine(316, 321, 329, 325);
       OptimizationBasic.drawFormula(g1,"x_{1}",307,340,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       OptimizationBasic.drawFormula(g1,"x_{2}",57,125,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       g1.setColor(new Color(0,0,160));
       for ( int i = 1; i <= 3; i++)
        g1.drawOval( 135+42 - i*40, 175+130 - i*20-60, i*80+5, i*40+5 );
       g1.fillOval( 136+42, 176+130-60, 4, 4 );
       OptimizationBasic.drawFormula(g1,"f ( x ) = f ( x_{ 1} , x_{ 2} )", 212, 238-60,new java.awt.Font("Dialog",3,12),new java.awt.Font("Dialog",3,11));
    g1.setColor(new Color(157, 187, 255));
    g1.fillPolygon( new int[] {35+42, 35+42, 125+42, 155+42}, new int[]  {255+130-60, 195+130-60, 225+130-60, 255+130-60}, 4 );
    g1.setColor( Color.black );
    g1.drawPolygon(new int[] {35+42, 35+42, 125+42, 155+42}, new int[]  {255+130-60, 195+130-60, 225+130-60, 255+130-60}, 4 );
    g1.setColor(Color.red);
    g1.fillOval(33+43, 193+130-60, 4, 4);
     OptimizationBasic.drawFormula(g1,"x^{ 0}", 40+42, 195+130-60,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));

    g1.fillOval(104+42, 217+70, 4, 4);
    String s;
    if ( step >= 59 ) s = "*";  else s = "1";
     OptimizationBasic.drawFormula(g1,"x^{ "+s+"}", 110+42, 220+65,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
    }
   if(step>=57)
    {
     if(step==57)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
     OptimizationBasic.drawFormula(g1,"������� \u03B5_{1}=\u03B5_{0},", 515, 100,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
     OptimizationBasic.drawFormula(g1,"k=k+1=1.", 340, 120,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
    }
      if(step>=58)
       {
        if(step==58)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
         OptimizationBasic.drawFormula(g1,"��������� ������� k \u2264 M:", 410, 120,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
         OptimizationBasic.drawFormula(g1,"- ���� k = M, �� ������ ��������;", 340, 140,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
         OptimizationBasic.drawFormula(g1,"- ���� k < M, �� ��������� � ����, ��", 340, 160,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
         OptimizationBasic.drawFormula(g1,"������� ����������� ��������� J_{ a}.", 340, 180,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       }
     if(step>=59)
       {
        if(step==59)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
         OptimizationBasic.drawFormula(g1,"��������� �������� �������, ��-", 360, 200,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
         OptimizationBasic.drawFormula(g1,"����� ����� x^{k}, ������� ����� ��������", 340, 220,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
         OptimizationBasic.drawFormula(g1,"x^{*} - ������ ��������.", 340, 240,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       }
     if(step>=60)
       {
        if(step==60)
        g1.setColor(new Color(0,0,160));
         else
          g1.setColor(new Color(0,0,80));
       OptimizationBasic.drawFormula(g1,"�������� ������, ����� ��� �� �����-", 50, 370,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       OptimizationBasic.drawFormula(g1,"��� ����� ���������� �� �����������", 50, 390,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       OptimizationBasic.drawFormula(g1,"� ��. �������� ���������, � ���������,", 50, 410,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       OptimizationBasic.drawFormula(g1,"����� ������� ��������� �����������", 50, 430,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       OptimizationBasic.drawFormula(g1,"��������� � ���������� �������.", 50, 450,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));

       g1.setColor(Color.white);
       g1.fillRect(290+51,111+140,277,219);
       g1.setColor(new Color(0,0,160));
       g1.drawRect(290+50,110+140,278,220);
       g1.setColor(Color.red);
       g1.setColor(new Color(0,0,80));
       g1.drawLine(77+290, 111+140, 77+290, 349+120);
       g1.drawLine(51+290, 325+30, 329+290, 325+30);
       g1.drawLine(77+290, 111+140, 81+290, 121+140);
       g1.drawLine(77+290, 111+140, 73+290, 121+140);
       g1.drawLine(316+290, 329+30, 329+290, 325+30);
       g1.drawLine(316+290, 321+30, 329+290, 325+30);
       OptimizationBasic.drawFormula(g1,"x_{1}",307+290,340+30,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       OptimizationBasic.drawFormula(g1,"x_{2}",57+290,125+140,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
       g1.setColor(new Color(0,0,160));
       g1.drawArc(135+112+290 - 3*40, 180+100 - 3*20-60+140, 3*80+5, 3*40+5,50,260);
       g1.drawArc(135+112+290 - 2*40, 180+100 - 2*20-60+140, 2*80+5, 2*40+5,20,320);
       g1.drawOval( 135+112+290 - 40, 180+100 - 20-60+140, 80+5, 40+5 );
       g1.fillOval( 136+112+290, 181+100-60+140, 4, 4 );
       OptimizationBasic.drawFormula(g1,"f ( x ) = f ( x_{ 1} , x_{ 2} )", 212+290, 210-60+140,new java.awt.Font("Dialog",3,12),new java.awt.Font("Dialog",3,11));
    g1.setColor(new Color(157, 187, 255));
    g1.fillPolygon( new int[] {35+42+290, 35+42+290, 155+42+30+290}, new int[]  {255+20-60+140, 195+20-60+140,255+20-60+140}, 3 );
    g1.setColor( Color.black );
    g1.drawPolygon(new int[] {35+42+290, 35+42+290, 155+42+30+290}, new int[]  {255+20-60+140, 195+20-60+140, 255+20-60+140}, 3 );
    g1.setColor(Color.red);
    g1.fillOval(33+43+290, 193+20-60+140, 4, 4);
     OptimizationBasic.drawFormula(g1,"x^{ 0}", 40+42+290, 195+20-60+140,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));

    g1.fillOval(155+42+30+290, 255+20-60+140-2, 4, 4);
    OptimizationBasic.drawFormula(g1,"x^{ *}", 190+42+285, 220+100+30,new java.awt.Font("Dialog",1,14),new java.awt.Font("Dialog",1,11));
   }
  }

  if(step==61)
     {
       g1.setFont(new Font("Dialog",1,28));
      g1.setColor(new Color(130,0,60));
      g1.drawString("����� ������",240,250);
      jbtnNext.setEnabled(false);
     }
}}

 void jbtnNext_actionPerformed(ActionEvent e) {
  if(step<=61)
   step++;
  repaint();
  }

 void jbtnNew_actionPerformed(ActionEvent e) {
  step=0;
  ok=0;
  jbtnNext.setEnabled(true);
  jChkbFormula.setVisible(false);
  jChkbFormula.setSelected(false);
  repaint();
  }

 void jbtnBack_actionPerformed(ActionEvent e) {
  if(step!=0)
   step--;
  jbtnNext.setEnabled(true);
  repaint();
  }

 void jChkbFormula_mousePressed(MouseEvent e) {
   if(jChkbFormula.isSelected()==true)
    ok=0;
   else
    ok=1;
   repaint();
  }

  private void Arrow( int p1, int q1, int p2, int q2, Graphics g1 ) {
    double a, ff = Math.PI/6.0;
    int x1, x2, y1, y2, x, y, m, n;
    a = Math.atan2( Math.abs( q2 - q1 ), Math.abs( p2 - p1 ) );
    if ( p1 < p2 ){
      if ( q1 < q2 ) { m = -1; n = -1; }
      else { m = -1; n = 1; }
    }
    else {
      if ( q1 < q2 ) { m = 1; n = -1; }
      else { m = 1; n = 1; }
    }
    x =(int) Math.round( p2 + m*4*Math.cos(a) );
    y = (int)Math.round( q2 + n*4*Math.sin(a) );
    x1 = (int)Math.round( x + m*5*Math.cos(a - ff) );
    y1 = (int)Math.round( y + n*5*Math.sin(a - ff) );
    x2 = (int)Math.round( x + m*5*Math.cos(a + ff) );
    y2 = (int)Math.round( y + n*5*Math.sin(a + ff) );
    g1.drawLine( x1, y1, p2, q2 );
    g1.drawLine( x2, y2, p2, q2 );
  }
}