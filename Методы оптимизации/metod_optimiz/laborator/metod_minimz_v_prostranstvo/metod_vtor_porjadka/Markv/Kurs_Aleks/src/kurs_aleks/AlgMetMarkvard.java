package kurs_aleks;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.border.*;
import java.beans.*;

/**
 * <p>Title: �������� ������ �� ������� �����������</p>
 * <p>Description: ����� ���������� �.�.</p>
 * <p>Copyright: Copyright (c) 2006</p>
 * <p>Company: ����� �������������� ���������� - ������� ���������� ���������� � �����������</p>
 * @author sashka_drakon@mail.ru or polushin_an@ mail.ru
 * @version 10.0
 */

public class AlgMetMarkvard extends JApplet {
  private boolean isStandalone = false;
  //JPanel jPanel1 = new JPanel();

   Panel_paint1 jPanel1 = new Panel_paint1();
  JButton btn1 = new JButton();
  JButton btn2 = new JButton();
  JButton btn3 = new JButton();


  int t=2,k=10;
   Color ColorFon = new Color(247,247,255);//���� ����
   Color ColorPanelFon = new Color(255,255,255);//���� ���� ������
   Color ColorPanelRamka = new Color(157,187,255);//���� ���������� ������
   Color ColorBtnBackground = new Color(220,230,255);//���� ���� ������
   Color ColorBtnForeground = new Color(0,0,60);//���� ������� �� ������
   Font FontBtn = new java.awt.Font("Dialog",1,12);//����� ������� �� ������
   Font FontBtnStr = new java.awt.Font("Dialog",1,14);//����� ������� �� ������(�������)
   Color ColorTitle = new Color(130,0,80);//���� ���������
   Font FontTitle = new java.awt.Font("Dialog",1,16);//����� ���������
   Color ColorSubTitle = new Color(180,0,80);//���� �������
   Color Color200_0_ = new Color(200,0,0);
   Color ColorSolutionText = new Color(0,0,80);//���� ������ �������

   Border border1;
   Border border2;
   Border border3;
   int step=0,fr=0,i,j;
   double k1=8,m=0,s=1;

  //Get a parameter value
  public String getParameter(String key, String def) {
    return isStandalone ? System.getProperty(key, def) :
      (getParameter(key) != null ? getParameter(key) : def);
  }

  //Construct the applet
  public AlgMetMarkvard() {
  }

  //Initialize the applet
  public void init() {
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }

  //Component initialization
  private void jbInit() throws Exception {
    border1 = BorderFactory.createLineBorder(new Color(250, 250, 250),1);
    border2 = BorderFactory.createLineBorder(new Color(0, 59, 0),1);
    border3 = BorderFactory.createLineBorder(new Color(164, 197, 151),1);

    this.setSize(new Dimension(720, 600));
    jPanel1.setBackground(ColorFon);
    jPanel1.setLayout(null);


    btn1.setBackground(ColorBtnBackground);
    btn1.setFont(FontBtnStr);
    btn1.setForeground(ColorBtnForeground);
    btn1.setBounds(new Rectangle(395+k,508+t+60,100,23));
    btn1.setText("==>");
    btn1.addMouseListener(new AlgMetMarkvard_btn1_mouseAdapter(this));

    btn2.setBackground(ColorBtnBackground);
    btn2.setFont(FontBtn);
    btn2.setForeground(ColorBtnForeground);
    btn2.setBounds(new Rectangle(280+k,508+t+60,100,23));
    btn2.setText("��������");
    btn2.addMouseListener(new AlgMetMarkvard_btn2_mouseAdapter(this));
    btn3.setBounds(new Rectangle(165+k,508+t+60,100,23));

    btn3.setBackground(ColorBtnBackground);
    btn3.setFont(FontBtnStr);
    btn3.setForeground(ColorBtnForeground);
    btn3.setText("<==");
    btn3.addMouseListener(new AlgMetMarkvard_btn3_mouseAdapter(this));

    this.getContentPane().setBackground(ColorFon);
    this.getContentPane().add(jPanel1, BorderLayout.CENTER);
    jPanel1.add(btn1, null);
    jPanel1.add(btn2, null);
    jPanel1.add(btn3, null);

    }

  //Start the applet
  public void start() {
  }

  //Stop the applet
  public void stop() {
  }

  //Destroy the applet
  public void destroy() {
  }

  //Get Applet information
  public String getAppletInfo() {
    return "Applet Information";
  }

  //Get parameter info
  public String[][] getParameterInfo() {
    return null;
  }
  public void plus (Graphics g, int x, int y, int fl){
     if(fl==0){
       g.drawLine(x-9,y-6,x-3,y-6); g.drawLine(x-6,y-9,x-6,y-3);
     }
     else {
       g.drawLine(x+3,y-6,x+9,y-6); g.drawLine(x+6,y-9,x+6,y-3);
     }
   }
   public void minus (Graphics g, int x, int y, int fl){
     if(fl==1) g.drawLine(x-9,y-6,x-3,y-6);
     else g.drawLine(x+3,y-6,x+9,y-6);
   }
   public void romb (Graphics g, int x, int y, int hir, int vis, int vis_line, int f){
       g.drawLine(x,y,x+hir/2,y-vis/2);
       g.drawLine(x,y,x+hir/2,y+vis/2);
       g.drawLine(x+hir/2,y-vis/2,x+hir,y);
       g.drawLine(x+hir/2,y+vis/2,x+hir,y);
       g.drawLine(x+hir/2,y-vis/2,x+hir/2,y-vis/2-vis_line);
       if(f==0){plus(g, x, y, f); minus(g, x+hir, y, f);}
       if(f==1) {plus(g, x+hir, y, f); minus(g, x, y, f);}
   }
   public void prjam (Graphics g, int x, int y, int hir, int vis, int vis_line){
       g.drawRect(x, y, hir, vis);
       g.drawLine(x+hir/2,y,x+hir/2,y-vis_line);
   }
   public void paral (Graphics g, int x, int y, int hir, int vis, int vis_line){
       g.drawLine(x, y, x+hir, y);
       g.drawLine(x-15, y+vis, x+hir-15, y+vis);
       g.drawLine(x, y, x-15, y+vis);
       g.drawLine(x+hir, y, x+hir-15, y+vis);
       g.drawLine(x+(hir-15)/2,y,x+(hir-15)/2,y-vis_line);
   }
   public void strela (Graphics g, int x, int y, int napr){
     if(napr==0){
       g.drawLine(x, y, x+10, y-2);
       g.drawLine(x, y, x+10, y+2);
     }
     if(napr==1){
       g.drawLine(x-2, y-10, x, y);
       g.drawLine(x+2, y-10, x, y);
     }
     if(napr==2){
       g.drawLine(x, y, x+10, y);
       g.drawLine(x+10-4, y-2, x+10, y);
       g.drawLine(x+10-4, y+2, x+10, y);
     }
   }

  //Main method
  public static void main(String[] args) {
    AlgMetMarkvard applet = new AlgMetMarkvard();
    applet.isStandalone = true;
    JFrame frame = new JFrame();
    //EXIT_ON_CLOSE == 3
    frame.setDefaultCloseOperation(3);
    frame.setTitle("Applet Frame");
    frame.getContentPane().add(applet, BorderLayout.CENTER);
    applet.init();
    applet.start();
    frame.setSize(400,320);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    frame.setLocation((d.width - frame.getSize().width) / 2, (d.height - frame.getSize().height) / 2);
    frame.setVisible(true);
  }

  class  Panel_paint1 extends JPanel {
      public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Stringer_algMarkvard.setGraphics(g);
      if(step==0)
       {
//       btn2.setEnabled(false);
         btn3.setEnabled(false);
       }
       else
       {
//       btn2.setEnabled(true);
         btn3.setEnabled(true);
       }
       if(step!=20)
         btn1.setEnabled(true);
       else
         btn1.setEnabled(false);
         g.setFont(FontTitle);
         g.setColor(ColorTitle);
         g.drawString("�������� ����������� ������� ������� ����������",110+k,21);
         g.setColor(ColorPanelRamka);
         g.drawRect(13,30+t,310,465+60);
         g.drawRect(336,30+t,350+20,465+60);
         g.setColor(ColorPanelFon);
         g.fillRect(14,31+t,308,463+60);
         g.fillRect(337,31+t,348+20,463+60);
//=======================================1-� ��������=====================================
     if(step>=0&&step<=20)
     {
       i=17;
       j=18;
       g.setColor(ColorSolutionText);
       g.drawRoundRect(461-83+k,30+t+10,100,20,20,20);
      Stringer_algMarkvard.drawString("������",491-83+k,54+t);
       g.setColor(ColorSolutionText);
        if(step>=1)
        {
           g.setColor(ColorTitle);
          Stringer_algMarkvard.drawString("1.",17,45+i*0+j*0+t);
           if(step==1){
           g.setColor(Color200_0_);
          Stringer_algMarkvard.drawString("������  x^{0}",30,45+i*0+j*0+t);
          Stringer_algMarkvard.drawString("- ��������� �����",55,45+i*1+j*0+t);
        }
        else
        g.setColor(ColorSolutionText);
     }
     if(step>=2)
     {
      Stringer_algMarkvard.drawString("������  x^{0},",30,45+i*0+j*0+t);
       if(step==2)
       {
         g.setColor(Color200_0_);
         Stringer_algMarkvard.drawString("\u03b5_{1} > 0",100,45+i*0+j*0+t);
        Stringer_algMarkvard.drawString("- ����� ������������� ����� ��� ��������",55,45+i*1+j*0+t);
         Stringer_algMarkvard.drawString("�������� ���������",55,45+i*2+j*0+t);
       }
       else g.setColor(ColorSolutionText);
     }

     if(step>=3)
     {
       Stringer_algMarkvard.drawString("������  x^{0},",30,45+i*0+j*0+t);
       Stringer_algMarkvard.drawString("\u03b5_{1} > 0 ,",100,45+i*0+j*0+t);
       Stringer_algMarkvard.drawString("\u03b5_{2} > 0 ,",142,45+i*0+j*0+t);
       if(step==3)
       {
         g.setColor(Color200_0_);
         Stringer_algMarkvard.drawString("�",183,45+i*0+j*0+t);
         Stringer_algMarkvard.drawString("- ���������� ����� ��������",55,45+i*1+j*0+t);
       }
       else g.setColor(ColorSolutionText);
     }
     if(step>=4)
     {
       Stringer_algMarkvard.drawString("������  x^{0},",30,45+i*0+j*0+t);
       Stringer_algMarkvard.drawString("\u03b5_{1} > 0 ,",100,45+i*0+j*0+t);
       Stringer_algMarkvard.drawString("\u03b5_{2} > 0 ,",142,45+i*0+j*0+t);
       Stringer_algMarkvard.drawString("�. ",183,45+i*0+j*0+t);
       if(step==4) g.setColor(Color200_0_);
       Stringer_algMarkvard.drawString("�������� k = 0 � \u00B5^{k} = \u00B5^{0}",30,45+i*0+j*1+t);
       g.setColor(ColorTitle);
       Stringer_algMarkvard.drawString("2.",17,45+i*0+j*1+t);
       g.setColor(ColorSolutionText);
     }
     if(step>=5)
     {
       if(step==5) g.setColor(Color200_0_);
       Stringer_algMarkvard.drawString("����� �������� \u2207f(x),",30,45+i*0+j*2+t);
       g.setColor(ColorTitle);
       Stringer_algMarkvard.drawString("3.",17,45+i*0+j*2+t);
       g.setColor(ColorSolutionText);
     }
     if(step>=6)
     {
       if(step==6) g.setColor(Color200_0_);
      Stringer_algMarkvard.drawString("������� ����� H(x).",160,45+i*0+j*2+t);
       g.setColor(ColorSolutionText);
     }
     if(step>=7)
     {
       if(step==7) g.setColor(Color200_0_);
       Stringer_algMarkvard.drawString("��������� �������� \u2207f(x^{k}).",30,45+i*0+j*3+t);
       g.setColor(ColorTitle);
       Stringer_algMarkvard.drawString("4.",17,45+i*0+j*3+t);
       g.setColor(ColorSolutionText);
     }
     if(step>=8)
     {
       if(step==8) g.setColor(Color200_0_);
       Stringer_algMarkvard.drawString("��������� ���������� �������� ��������� ",30,45+i*0+j*4+t);
       Stringer_algMarkvard.drawString("||\u2207f(x^{k})|| < \u03b5_{1}:",130,45+i*1+j*4+t);
       g.setColor(ColorTitle);
       Stringer_algMarkvard.drawString("5.",17,45+i*0+j*4+t);
       g.setColor(ColorSolutionText);
     }
     if(step>=9)
     {
       if(step==9) g.setColor(Color200_0_);
       Stringer_algMarkvard.drawString("�) ���� ����������� ���������, ������",30,45+i*2+j*4+t);
       Stringer_algMarkvard.drawString("������� � x* = x^{k};",30,45+i*3+j*4+t);
       g.setColor(ColorSolutionText);
     }
     if(step>=10)
     {
       if(step==10) g.setColor(Color200_0_);
       Stringer_algMarkvard.drawString("�) � ��������� ������ ������� � ���� 6.",30,45+i*4+j*4+t);
       Stringer_algMarkvard.drawString("��������� ���������� ����������� k \u2265 M:",30,45+i*4+j*5+t);
      g.setColor(ColorTitle);
      Stringer_algMarkvard.drawString("6.",17,45+i*4+j*5+t);

       g.setColor(ColorSolutionText);
     }

    if(step>=11)
    {
       if(step==11) g.setColor(Color200_0_);
       Stringer_algMarkvard.drawString("�) ���� ����������� ���������, ������",30,45+i*5+j*5+t);
       Stringer_algMarkvard.drawString("������� � x* = x^{k};",30,45+i*6+j*5+t);
       g.setColor(ColorSolutionText);
    }
    if(step>=12)
    {
      if(step==12) g.setColor(Color200_0_);
      Stringer_algMarkvard.drawString("�) � ��������� ������ ������� � ���� 7.",30,45+i*7+j*5+t);
       Stringer_algMarkvard.drawString("��������� ������� H(x^{k}).",30,45+i*7+j*6+t);
      g.setColor(ColorTitle);
       Stringer_algMarkvard.drawString("7.",17,45+i*7+j*6+t);

      g.setColor(ColorSolutionText);
    }

    if(step>=13)
    {
      if(step==13) g.setColor(Color200_0_);
     Stringer_algMarkvard.drawString("���������  H(x^{k}) + \u00B5^{k} * E,",30,45+i*7+j*7+t);
     Stringer_algMarkvard.drawString("��� � - ��������� �������,",30,45+i*7+j*8+t);
      Stringer_algMarkvard.drawString("� \u00B5^{k} - ������-��� ������������� �����.",30,45+i*7+j*9+t);
      g.setColor(ColorTitle);
      Stringer_algMarkvard.drawString("8.",17,45+i*7+j*7+t);
      g.setColor(ColorSolutionText);
    }
    if(step>=14)
    {
      if(step==14) g.setColor(Color200_0_);
      Stringer_algMarkvard.drawString("���������  [H(x^{k}) + \u00B5^{k} * E]^{-1}.",30,45+i*7+j*10+t);

      g.setColor(ColorTitle);
      Stringer_algMarkvard.drawString("9.",17,45+i*7+j*10+t);
      g.setColor(ColorSolutionText);
    }

    if(step>=15)
    {
      if(step==15) g.setColor(Color200_0_);
      Stringer_algMarkvard.drawString("��������� d^{k} = -[H(x^{k}) + \u00B5^{k} * E]^{-1}*\u2207f(x^{k})",35,i*9+j*11+t+10);
      g.setColor(ColorTitle);
      Stringer_algMarkvard.drawString("10.",15,i*9+j*11+t+10);
      g.setColor(ColorSolutionText);
    }
    if(step>=16)
    {
      if(step==16) g.setColor(Color200_0_);
     Stringer_algMarkvard.drawString("��������� x^{k+1} = x^{k} - [H(x^{k}) + \u00B5^{k} * E]^{-1}*\u2207f(x^{k})",35,i*10+j*12+t-8);
     g.setColor(ColorTitle);
      Stringer_algMarkvard.drawString("11.",15,i*10+j*12+t-8);
      g.setColor(ColorSolutionText);
    }

    if(step>=17)
    {
      if(step==17) g.setColor(Color200_0_);
     Stringer_algMarkvard.drawString("��������� ���������� �������",35,i*11+j*13+t-27);
      Stringer_algMarkvard.drawString("f(x^{k+1}) < f(x^{k})",35+40,i*11+j*13+t-12);
      g.setColor(ColorTitle);
      Stringer_algMarkvard.drawString("12.",15,i*11+j*13+t-27);

      g.setColor(ColorSolutionText);
    }
    if(step>=18)
    {
      if(step==18) g.setColor(Color200_0_);
     Stringer_algMarkvard.drawString("�) ���� ����������� �����������,",35,i*11+j*14+t-15);
      Stringer_algMarkvard.drawString(" �� ������� � ���� 13.",35,i*11+j*14+t+15-15);

       g.setColor(ColorTitle);
        g.setColor(Color200_0_);
      Stringer_algMarkvard.drawString("13.",15,i*11+j*14+t+15);
      Stringer_algMarkvard.drawString(" ������� k = k + 1 , \u00B5^{k+1} = \u00B5^{k}/2.",35,i*11+j*14+t+15);

      g.setColor(ColorSolutionText);
    }
    if(step>=19)
    {
       if(step==19)        g.setColor(ColorTitle);

        Stringer_algMarkvard.drawString("13.",15,i*11+j*14+t+15);
         g.setColor(Color.black);
         Stringer_algMarkvard.drawString(" ������� k = k + 1 , \u00B5^{k+1} = \u00B5^{k}/2.",35,i*11+j*14+t+15);


         g.setColor(Color200_0_);
      Stringer_algMarkvard.drawString("�) ���� ���, ������� � ���� 14.",35,i*13+j*15+t-20);
        g.setColor(ColorTitle);
        Stringer_algMarkvard.drawString("14.",15,i*14+j*15+t-20);
      g.setColor(Color200_0_);
       Stringer_algMarkvard.drawString("������� \u00B5^{k} = 2 * \u00B5^{k} � ������� � ���� 8. ",35,i*14+j*15+t-20);
       g.setColor(ColorSolutionText);
    }

    if(step>=20)
   {
      if(step==20)   g.setColor(Color.black);
       Stringer_algMarkvard.drawString("�) ���� ���, ������� � ���� 14.",35,i*13+j*15+t-20);
        g.setColor(ColorTitle);
       Stringer_algMarkvard.drawString("13.",15,i*11+j*14+t+15);
        Stringer_algMarkvard.drawString("14.",15,i*14+j*15+t-20);
       g.setColor(Color.black);
      Stringer_algMarkvard.drawString("������� \u00B5^{k} = 2 * \u00B5^{k} � ������� � ���� 8. ",35,i*14+j*15+t-20);
      g.setColor(ColorSolutionText);
   }




  }
//**************************************************************
  if(step>=0&&step<=20)
  {
    i=14;
    j=20;
    g.setColor(ColorSolutionText);
    if(step>=1)
    {
      if(step==1) g.setColor(Color.red);
     Stringer_algMarkvard.drawString("x^{0},",390+k,70+t+i);
      paral(g, 375+k, 70+t, 120 , j, 10);
      g.setColor(ColorSolutionText);
    }
    if(step>=2)
    {
      if(step==2) g.setColor(Color.red);
      paral(g, 375+k, 70+t, 120 , j, 10);
      Stringer_algMarkvard.drawString("\u03b5_{1} > 0, ",410+k,70+i+t);
      g.setColor(ColorSolutionText);
    }

    if(step>=3)
    {
      if(step==3) g.setColor(Color.red);
      paral(g, 375+k, 70+t, 120 , j, 10);
      Stringer_algMarkvard.drawString("M",450+k,70+i+t);
      g.setColor(ColorSolutionText);
    }
    if(step>=4)
    {
      if(step==4) g.setColor(Color.red);
      Stringer_algMarkvard.drawString("k = 0 ,",393+k,70+t+i+j+10);
      Stringer_algMarkvard.drawString("\u00B5^{k} = \u00B5^{0}",428+k,70+t+i+j+10);
      prjam(g,385+k, 70+t+j+10, 34+55, j, 10);
      g.setColor(ColorSolutionText);
    }
    if(step>=5)
    {
      if(step==5) g.setColor(Color.red);
      Stringer_algMarkvard.drawString("\u2207f(x),",400+k,70+t+i+(j+10)*2);
      prjam(g, 412-17+k, 70+2*(j+10)+t, 2*34, j, 10);
      g.setColor(ColorSolutionText);
    }
    if(step>=6)
    {
      if(step==6) g.setColor(Color.red);
      Stringer_algMarkvard.drawString("H(x)",436+k,70+t+i+(j+10)*2);
      prjam(g, 412-17+k, 70+2*(j+10)+t, 2*34, j, 10);
      g.setColor(ColorSolutionText);
    }
    if(step>=7)
    {
      if(step==7) g.setColor(Color.red);
      Stringer_algMarkvard.drawString("\u2207f(x^{k})",411+k,70+t+i+(j+10)*3);
      prjam(g, 407+k, 70+t+3*(j+10), 44, j, 10);
      g.setColor(ColorSolutionText);
    }
    if(step>=8)
    {
      if(step==8) g.setColor(Color.red);
      Stringer_algMarkvard.drawString("||\u2207f(x^{k})|| \u2264 \u03b5_{1}",488-120+30+k,73+t+i+(j+10)*4+j-i);
      romb(g, 374+k, 70+t+4*(j+10)+j, 108, 2*j, 10, 0);
      g.drawLine(368+k,70+t+4*(j+10)+j,374+k,70+t+4*(j+10)+j);
      g.drawLine(482+k, 70+t+4*(j+10)+j, 490+k, 70+t+4*(j+10)+j);
      g.setColor(ColorSolutionText);
    }
    if(step>=9)
    {
      if(step==9) g.setColor(Color.red);
     Stringer_algMarkvard.drawString("x* = x^{k}",350+k,282+t);
      prjam(g, 348+k-2, 282+t-i, 40+4, j, -(70+t+4*(j+10)+j)+(282+t-i));
      g.drawLine(368+k,70+t+4*(j+10)+j,374+k,70+t+4*(j+10)+j);
      g.drawLine(368+k,j+404-i-4*(j+10),368+k,416+65+t-14+60);
      strela(g, 368+k, 416+65+t-14+60, 1);
      g.setColor(ColorSolutionText);
      g.drawRoundRect(338+5+k,416+65+t-14+60,60,20,20,20);
      Stringer_algMarkvard.drawString("�����",351+5+k,481+t+60);
    }
    if(step>=10)
    {
      if(step==10) g.setColor(Color.red);
      Stringer_algMarkvard.drawString("k \u2265 M",476+k,70+t+5*(j+10)+2*j-i-6);
      g.drawLine(482+k, 70+t+4*(j+10)+j, 490+k, 70+t+4*(j+10)+j);
      romb(g, 460+k-2, 70+t+5*(j+10)+1*j-6, 60+4, 1*j+6, 10, 0);
      g.drawLine(460+k-2, 70+t+5*(j+10)+1*j-6, 430+k, 70+t+5*(j+10)+1*j-6);
      g.drawLine(520+k+2, 70+t+5*(j+10)+1*j-6, 550+k, 70+t+5*(j+10)+1*j-6);
      g.setColor(ColorSolutionText);
    }
    if(step>=11)
    {
      if(step==11) g.setColor(Color.red);
      g.drawLine(460+k, 70+t+5*(j+10)+1*j-6, 368+k, 70+t+5*(j+10)+1*j-6);
      strela(g, 368+k, 70+t+5*(j+10)+1*j-6, 0);
      g.setColor(ColorSolutionText);
    }
    if(step>=12)
    {
      if(step==12) g.setColor(Color.red);
      Stringer_algMarkvard.drawString("H(x^{k})",480+57+k,65+t+6*(j+10)+1*j-6);
      g.drawLine(520+k, 70+t+5*(j+10)+1*j-6, 550+k, 70+t+5*(j+10)+1*j-6);
      prjam(g, 520+k, 70+t+6*(j+10)+0*j-6, 60, j, 10);
      g.setColor(ColorSolutionText);
    }


    if(step>=13)
   {
     if(step==13) g.setColor(Color.red);
     Stringer_algMarkvard.drawString("H(x^{k}) + \u00B5^{k} * E",515+k,65+t+7*(j+10)+1*j-6);
     prjam(g, 505+k, 70+t+7*(j+10)+0*j-6, 90, j, 10);
     g.setColor(ColorSolutionText);
   }


    if(step>=14)
    {
      if(step==14) g.setColor(Color.red);
     Stringer_algMarkvard.drawString("[H(x^{k}) + \u00B5^{k} * E]^{-1}",505+k,65+t+8*(j+10)+1*j-6);
      prjam(g, 495+k, 70+t+8*(j+10)-6, 110, j, 10);
      g.setColor(ColorSolutionText);
    }

    if(step>=15)
    {
      if(step==15) g.setColor(Color.red);
      Stringer_algMarkvard.drawString("d^{k} = -[H(x^{k}) + \u00B5^{k} * E]^{-1}*\u2207f(x^{k})",470+k,80+t+9*(j+10)+i-10-6);
       prjam(g, 463+k, 70+t+9*(j+10)-6, 105+70, j, 10);
      g.setColor(ColorSolutionText);
    }

    if(step>=16)
    {
      if(step==16)
      g.setColor(Color.red);
     Stringer_algMarkvard.drawString("x^{k+1} = x^{k} - [H(x^{k}) + \u00B5^{k} * E]^{-1}*\u2207f(x^{k})",457+k,70+t+10*(j+10)+i-6);
      prjam(g, 453+k, 70+t+10*(j+10)-6, 110+85, j, 10);
      g.setColor(ColorSolutionText);
    }

    if(step>=17)
    {
      if(step==17) g.setColor(Color.red);
     Stringer_algMarkvard.drawString("f(x^{k+1}) < f(x^{k})",512+k,t+13*(j+10)+14+j+i-6);
      romb(g, 490-15+k,t+13*(j+10)+25+j-6,150,3*j+10,10,1);
      g.drawLine(492-15+k-2,t+11*(j+10)+25+j+60-6, 470-10+k,t+11*(j+10)+25+j+60-6);
      g.drawLine(470-10+k,t+11*(j+10)+25+j+60-6,470-10+k ,t+11*(j+10)+25+j+54+30 );

      g.drawLine(625+k, t+11*(j+10)+25+j+54, 638+k,t+11*(j+10)+25+j+54);
      g.drawLine(638+k,t+11*(j+10)+25+j+54,638+k,t+11*(j+10)+25+j+54+30);

      g.setColor(ColorSolutionText);
    }

    if(step>=18)
    {
      if(step==18)g.setColor(Color.red);
      Stringer_algMarkvard.drawString("k = k+1",610+k+2,40+t+11*(j+10)+15+j+i+60-6);
      Stringer_algMarkvard.drawString("\u00B5^{k+1} = \u00B5^{k}/2",605+k+2,25+t+12*(j+10)+15+j+i+60-6);
      prjam(g, 600+k,40+t+11*(j+10)+15+j+54, 42+30, j+15, 0);
      g.drawLine(680-5+k+4, 80+t+11*(j+10)+15+j+54+20, 680-5+k+4, 70+t+3*(j+10)-5);
      g.drawLine(680-5+k+4, 70+t+3*(j+10)-5, 429+k,70+t+3*(j+10)-5);
      g.drawLine(638+k,30+t+12*(j+10)+25+j+60,638+k,30+t+12*(j+10)+25+j+54+30);
      g.drawLine(638+k,30+t+12*(j+10)+25+j+54+30,680-5+k+4,30+t+12*(j+10)+25+j+54+30);
      strela(g, 429+k, 70+t+3*(j+10)-5, 0);
      g.setColor(ColorSolutionText);
    }
    if(step>=19)
   {
     if(step==19)g.setColor(Color.red);
     Stringer_algMarkvard.drawString("\u00B5^{k} = 2 * \u00B5^{k}",441-9+k-2,40+t+11*(j+10)+15+j+i+60-6);
     prjam(g,445-15+k-4,40+t+11*(j+10)+15+j+60-6, 40+30, j, 0);
     g.drawLine(470-10+k,50+t+11*(j+10)+25+j+60-6,470-10+k ,50+t+11*(j+10)+25+j+54+30 );
     g.drawLine(470-10+k ,50+t+11*(j+10)+25+j+54+30,425-10+k , 50+t+11*(j+10)+25+j+54+30);
     g.drawLine(425-10+k , 50+t+11*(j+10)+25+j+54+30, 425-10+k, t+10*j+70);
     g.drawLine(425-10+k, t+10*j+70,550+k,t+10*j+70);
     strela(g, 540+k, 185+t+3*(j+10)-5, 2);
     g.setColor(ColorSolutionText);
   }

  }
  }
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

  void btn1_mouseClicked(MouseEvent e) {
    if(step<=20)
     {
       step++;
       repaint();
     }
     if(step==20)
     {
     btn1.setEnabled(false);
      repaint();
     }

  }

  void btn2_mouseClicked(MouseEvent e) {
    step=0;
  repaint();
  }

  void btn3_mouseClicked(MouseEvent e) {
    if(step>0)
     {
       step--;
       repaint();
     }

  }


}

class AlgMetMarkvard_btn1_mouseAdapter extends java.awt.event.MouseAdapter {
  AlgMetMarkvard adaptee;

  AlgMetMarkvard_btn1_mouseAdapter(AlgMetMarkvard adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseClicked(MouseEvent e) {
    adaptee.btn1_mouseClicked(e);
  }
}

class AlgMetMarkvard_btn2_mouseAdapter extends java.awt.event.MouseAdapter {
  AlgMetMarkvard adaptee;

  AlgMetMarkvard_btn2_mouseAdapter(AlgMetMarkvard adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseClicked(MouseEvent e) {
    adaptee.btn2_mouseClicked(e);
  }
}

class AlgMetMarkvard_btn3_mouseAdapter extends java.awt.event.MouseAdapter {
  AlgMetMarkvard adaptee;

  AlgMetMarkvard_btn3_mouseAdapter(AlgMetMarkvard adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseClicked(MouseEvent e) {
    adaptee.btn3_mouseClicked(e);
  }
}
