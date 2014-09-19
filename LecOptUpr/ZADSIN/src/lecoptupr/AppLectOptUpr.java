package lecoptupr;

import java.awt.*;
import java.math.*;
import java.awt.event.*;
import java.awt.image.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.border.*;

public class AppLectOptUpr extends JApplet
{
  MyPaint MP = new MyPaint();
  JButton jButton1 = new JButton();
  JButton jButton2 = new JButton();
  JButton jButton3 = new JButton();


  int fl=0;
  double yy1;
  double bbb1, ccc1;
  double bbb2, ccc2;
  int wwidth, hhight, mm, x2, y2, x1, y1, xx, yy, edit=0, lastx, lasty;
  int xPoints[]={334,424,526,575,529,420};   //  �������
  int yPoints[]={237,178,178,205,252,263};        //  ��������������
  Polygon plg = new Polygon(xPoints,yPoints,6); // �������� ��������������
  public Image img1,img2,img3,img4;

  //185
  public int sh=185, x=400, y=285, FlPer=0,xrA,yrA,xrB,yrB,xrkr,yrkr,a=0,Fl=0,i,c1=2,c2=2;
  int xcl=0,ycl=0,Flc=0,num5=1,numGl,labl;
  Color c, col1,col2,col3,col4,col5,col6,col7,col8,col9,col10,col11,col12,col13,col14,col15;

  JCheckBox jCheckBox1 = new JCheckBox();
  JCheckBox jCheckBox2 = new JCheckBox();
  JCheckBox jCheckBox3 = new JCheckBox();
  JLabel jLabel1 = new JLabel();
  JLabel jLabel2 = new JLabel();
  JLabel jLabel3 = new JLabel();
  JLabel jLabel4 = new JLabel();
  JLabel jLabel5 = new JLabel();
  JLabel Ln = new JLabel();
  JLabel Lp = new JLabel();
  JLabel jLabel6 = new JLabel();

  public void init() {
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }

  private void jbInit() throws Exception
  {

    this.getContentPane().setBackground(new Color(147, 107, 87));
    this.getContentPane().setLayout(null);
    this.setSize(new Dimension(850,600));
    this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseMoved(MouseEvent e) {
        this_mouseMoved(e);
      }
    });
    MP.setBounds(new Rectangle(0, 0, 850, 550));
    MP.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(MouseEvent e) {
        MP_mousePressed(e);
      }
      public void mouseReleased(MouseEvent e) {
        MP_mouseReleased(e);
      }
    });
    MP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseDragged(MouseEvent e) {
        MP_mouseDragged(e);
      }
      public void mouseMoved(MouseEvent e) {
        MP_mouseMoved(e);
      }
    });
    MP.setBackground(new Color(247, 247, 255));
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton1_actionPerformed(e);
      }
    });
    jButton2.setBackground(new Color(255, 235, 200));
    jButton2.setFont(new java.awt.Font("SansSerif", 1, 12));
    jButton2.setForeground(new Color(0, 0, 60));
    jButton2.setBorder(BorderFactory.createEtchedBorder());
    jButton2.setText("����������");
    jButton2.setBounds(new Rectangle(215, 569, 120, 23));
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton2_actionPerformed(e);
      }
    });
    jButton3.setBackground(new Color(255, 235, 200));
    jButton3.setFont(new java.awt.Font("SansSerif", 1, 12));
    jButton3.setForeground(new Color(0, 0, 60));
    jButton3.setBorder(BorderFactory.createEtchedBorder());
    jButton3.setText("�����");
    jButton3.setBounds(new Rectangle(515, 569, 120, 23));
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton3_actionPerformed(e);
      }
    });
    jButton2.setVisible(true);
    jButton3.setVisible(true);


    jCheckBox1.setBackground(Color.white);
    jCheckBox1.setText("");
    jCheckBox1.setBounds(808,227,15,15);
    jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        jCheckBox1_itemStateChanged(e);
      }
    });
    jCheckBox1.setSelected(false);
    jCheckBox1.setVisible(false);

    jCheckBox2.setBackground(Color.white);
    jCheckBox2.setText("");
    jCheckBox2.setBounds(808,337,15,15);
    jCheckBox2.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        jCheckBox2_itemStateChanged(e);
      }
    });
    jCheckBox2.setSelected(false);
    jCheckBox2.setVisible(false);
    jCheckBox3.setBackground(Color.white);
    jCheckBox3.setText("");
    jCheckBox3.setBounds(808,287,15,15);
    jCheckBox3.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        jCheckBox3_itemStateChanged(e);
      }
    });
    jCheckBox3.setSelected(false);
    jCheckBox3.setVisible(false);

    this.getContentPane().add(MP, null);
    this.getContentPane().add(jButton1, null);
    this.getContentPane().add(jButton2, null);
    this.getContentPane().add(jButton3, null);
    this.getContentPane().add(jLabel1, null);
    this.getContentPane().add(jLabel2, null);
    this.getContentPane().add(jLabel3, null);
    this.getContentPane().add(jLabel4, null);
    this.getContentPane().add(jLabel5, null);
    this.getContentPane().add(Ln, null);
    this.getContentPane().add(Lp, null);
    this.getContentPane().add(jLabel6, null);
    this.MP.setLayout(null);
    this.MP.add(jCheckBox1,null);
    this.MP.add(jCheckBox2,null);
    this.MP.add(jCheckBox3,null);
    img1 = getImage(getDocumentBase(), "Obl.jpg");
    img2 = getImage(getDocumentBase(), "Tetr.jpg");
    img3 = getImage(getDocumentBase(), "End.jpg");
    img4 = getImage(getDocumentBase(), "Tetr_chast.jpg");


  }
 class  MyPaint extends JPanel
  {

   public MyPaint()
   {
    super();
    MediaTracker tr=new MediaTracker(this);
    tr.addImage(img1,0);
    tr.addImage(img2,0);
    tr.addImage(img3,0);
    tr.addImage(img4,0);
    try
    {tr.waitForID(0);}catch(InterruptedException e){}

   }

   double Fun(double x, double y)
    { double F;
      F=2*x*x-x*y+2*y*y-6*x-6*y;
      return F;
    }

  double Fun2(double x)
    { double F;
      F=-0.3*x*x*x;
      return F;
    }


   public double PF(double x,double c)
    {
        double D=0;
        double PF=0;
        D=(x+6)*(x+6)-8*(2*x*x-6*x-c);
        if (D>0)   PF=(x+6+Math.sqrt(D))/4;
        if (D==0) PF=c2;
       return PF;
    }

    public double PF1(double x,double c)
    {
        double D=0;
        double PF1=0;
        D=(x+6)*(x+6)-8*(2*x*x-6*x-c);
        if (D>0)  PF1=(x+6-Math.sqrt(D))/4;
        if (D==0) PF1=c2;
       return PF1;
    }

    public void paintLine(Graphics gr,double s)
    {
     Graphics2D g = (Graphics2D) gr;

     double ddx=0.001;
     int n1=290,n2=300,rx=30,ry=30;
     double t=-10;
     while (t<=10)
      {
       if (((t+6)*(t+6)-8*(2*t*t-6*t-Fun(c1-s,c2))>=0)&&(((t+ddx)+6)*((t+ddx)+6)-8*(2*(t+ddx)*(t+ddx)-6*(t+ddx)-Fun(c1-s,c2))>=0))
       {
       g.drawLine((int)(n1+rx*t),(int)(n2-ry*PF(t,Fun(c1-s,c2))),(int)(n1+rx*(t+ddx)),(int)(n2-ry*PF(t+ddx,Fun(c1-s,c2))));
       g.drawLine((int)(n1+rx*t),(int)(n2-ry*PF1(t,Fun(c1-s,c2))),(int)(n1+rx*(t+ddx)),(int)(n2-ry*PF1(t+ddx,Fun(c1-s,c2))));
       }
       t=t+ddx;
       }
    }


      public void RisIgVar(Graphics g,int cx, int cy, int rx, int ry)
     {
      double ddx=0.001;
      double t=0;
      while (t<=6.14)
        {
         g.drawLine((int)(cx+rx*t),(int)(cy-ry*Math.sin(t)),(int)(cx+rx*(t+ddx)),(int)(cy-ry*Math.sin(t+ddx)));
         g.drawLine((int)(cx+rx*t),(int)(cy-1-ry*Math.sin(t)),(int)(cx+rx*(t+ddx)),(int)(cy-1-ry*Math.sin(t+ddx)));
         t=t+ddx;
        }
     }

     public void FormulaPrir(Graphics g)
     {
      Stringer1.setGraphics(g);
      g.setColor(new Color(80, 50, 60));
      g.fillRect(208,143,400,280);
      g.setColor(new Color(255, 235, 200));
      g.fillRect(200,135,400,280);

      g.setColor(new Color(255, 215, 190));
      for (i=0;i<=26;i++)
       g.drawLine(200+i*15,135,200+i*15,415);
      for (i=0;i<=18;i++)
       g.drawLine(200,135+15*i,600,135+15*i);

      g.setColor(Color.black);
      g.drawRect(200,135,400,280);
      g.setFont(new Font("Dialog",1,14));
      g.drawString("������� ���������� �������� ��������:",250,160);
      g.drawString("���",220,250);
      g.setColor(Color.red);
      Stringer1.drawString("\u2206 I ( u ) = -     \u2206_{\u016B} H ( x , \u03C8 , u , t ) dt  +  \u03B7  ,",265,205);
      g.setFont(new Font("Dialog",0,20));
      g.drawString("\u222B",343,208);
      g.setFont(new Font("Dialog",1,13));
      g.drawString("t",348,188);
      g.drawString("t",340,220);
      g.setFont(new Font("Dialog",1,9));
      g.drawString("1",353,191);
      g.drawString("0",345,223);

      g.setColor(new Color(0,0,120));
      Stringer1.drawString("\u03B7 = \u03B7_{ 1} + \u03B7_{ 2} + \u03B7_{ 3}  ,",285,250);
      Stringer1.drawString("\u03B7_{ 1} = o ( || \u2206 x ( t_{ 1} ) || )  ,",285,280);
      Stringer1.drawString("\u03B7_{ 2} = -    \u2206 x '",285,315);
      Stringer1.drawString("\u2202\u2206_{\u016B} H ( x , \u03C8 , u , t )",380,304);
      Stringer1.drawString("\u2202x",438,325);
      g.drawLine(377,310,517,310);
      Stringer1.drawString("dt   ,",523,315);
      g.setFont(new Font("Dialog",0,20));
      g.drawString("\u222B",330,319);
      g.drawString("\u222B",330,369);
      g.setFont(new Font("Dialog",1,13));
      g.drawString("t",335,299);
      g.drawString("t",335,349);
      g.drawString("t",327,331);
      g.drawString("t",327,381);
      g.setFont(new Font("Dialog",1,9));
      g.drawString("1",340,302);
      g.drawString("1",340,352);
      g.drawString("0",332,334);
      g.drawString("0",332,384);
      Stringer1.drawString("\u03B7_{ 3} = -    \u03C8 ' ( t ) o_{ 1} ( || \u2206 x ( t ) || ) dt  .",285,365);

     }

     public void FormulaIgVar(Graphics g)
     {
      Stringer1.setGraphics(g);
      g.setColor(new Color(80, 50, 60));
      g.fillRect(208,143,350,180);
      g.setColor(new Color(255, 235, 200));
      g.fillRect(200,135,350,180);

      g.setColor(new Color(255, 215, 190));
      for (i=0;i<=23;i++)
       g.drawLine(200+i*15,135,200+i*15,315);
      for (i=0;i<=12;i++)
       g.drawLine(200,135+15*i,550,135+15*i);

      g.setColor(Color.black);
      g.drawRect(200,135,350,180);
      g.setFont(new Font("Dialog",1,14));
      g.drawString("������� ���������� ��������:",260,160);
      g.drawString("���",230,270);
      g.setColor(Color.red);
      Stringer1.drawString("\u2206 u ( t ) = ",230,215);
      Stringer1.drawString("      0       ,   t \u2209 [ \u03B8 - \u03B5 , \u03B8 + \u03B5 ]",317,200);
      Stringer1.drawString("v - u ( t ) ,   t \u2208 [ \u03B8 - \u03B5 , \u03B8 + \u03B5 ] ,",317,230);
      g.setFont(new Font("Dialog",0,50));
      g.drawString("{",300,223);
      g.setColor(new Color(255, 235, 200));
      g.drawString("{",302,223);
      g.setColor(new Color(0, 0, 120));
      Stringer1.drawString("v \u2208 U  ,   \u03B8 \u2208 [ t_{ 0} , t_{ 1} ]  ,   \u03B5 \u2260 0",285,285);
     }

     public void Formula3(Graphics g)
     {
      Stringer1.setGraphics(g);
      g.setColor(new Color(80, 50, 60));
      g.fillRect(208,143,400,150);
      g.setColor(new Color(255, 235, 200));
      g.fillRect(200,135,400,150);

      g.setColor(new Color(255, 215, 190));
      for (i=0;i<=26;i++)
       g.drawLine(200+i*15,135,200+i*15,285);
      for (i=0;i<=9;i++)
       g.drawLine(200,135+15*i,600,135+15*i);

      g.setColor(Color.black);
      g.drawRect(200,135,400,150);
      g.setFont(new Font("Dialog",1,14));
      g.drawString("���������  �������� :",320,160);
      g.setColor(Color.red);
      g.drawLine(238,195,245,195);
      g.drawLine(238,194,245,194);
      g.drawLine(252,195,327,195);
      Stringer1.drawString("\u2202 B ( x , \u03C4 )",255,191);
      Stringer1.drawString("\u2202 \u03C4",280,210);
      Stringer1.drawString("=   min ",340,200);
      g.drawLine(397,195,480,195);
      Stringer1.drawString("\u2202 B ' ( x , \u03C4 )",400,191);
      Stringer1.drawString("\u2202 x",429,210);
      Stringer1.drawString("f ( x , v , \u03C4 )",490,200);
      g.setFont(new Font("DIalog",3,12));
      g.drawString("v \u2208 U",363,212);
      g.setColor(new Color(0, 0, 120));
      g.setFont(new Font("DIalog",2,14));
      g.drawString("- ���  ���������  �  �������  �����������, �����������",205,240);
      g.drawString("���������  �����������.",315,270);

     }

      public void paint(Graphics gr)
     {
       Graphics2D g = (Graphics2D) gr;
     if (sh==0) g.drawImage(img1,0,0,this);
     if ((sh>=1)&&(sh<=233))  g.drawImage(img2,0,0,this);
     if (sh==219) g.drawImage(img3,0,0,this);

     if (sh==0)
   {
     jLabel1.setVisible(false);
     jLabel2.setVisible(false);
     jLabel3.setVisible(false);
     jLabel4.setVisible(false);
     jLabel5.setVisible(false);
     jLabel6.setVisible(false);
     Lp.setVisible(false);
     Ln.setVisible(false);
   }
   else
   {
     jLabel1.setVisible(true);
     jLabel2.setVisible(true);
     jLabel3.setVisible(true);
     jLabel4.setVisible(true);
     jLabel5.setVisible(true);
     jLabel6.setVisible(true);
     Lp.setVisible(true);
     Ln.setVisible(true);
   }
     Stringer.setGraphics(g);
     Stringer1.setGraphics(g);
     Stringer2.setGraphics(g);
     Stringer3.setGraphics(g);
     StringerForm.setGraphics(g);




     if (sh<=218)
      {
      g.setColor(Color.red);
      g.drawLine(627,15,627,535);
      g.setColor(new Color(0,0,120));
      g.setFont(new Font("Dialog",1,14));
      g.drawString("����:",690,60);
      g.setColor(Color.red);
      Stringer1.drawString("x_{1} ( t ) = x_{2} ( t )",660,100);
      Stringer1.drawString(".",662,90);
      Stringer1.drawString("x_{2} ( t ) = u ( t )",660,130);
      Stringer1.drawString(".",662,120);
      Stringer1.drawString("x_{1} ( 0 ) = 0",660,170);
      Stringer1.drawString("x_{2} ( 0 ) = - 4",660,190);

      }



     if ((sh>=185)&&(sh<=204))
     {
       g.setColor(Color.black);
       g.setFont(new Font("Dialog",1,14));
       g.drawString("������:",110,60);
       g.setFont(new Font("Dialog",1,14));
       g.setColor(Color.black);
       g.setColor(new Color(0,0,0));
       Stringer.drawString("����� ����������� �� �������������� ����������,",190,60);
       Stringer.drawString("��������������� ��� ���������� � �����, ������������� �� ������� ��",110,80);
       Stringer.drawString("��������� x_{1}(0) = 0, x_{2}(0) = -4 � ������ ��������� ��� ������ �������",110,100);
       Stringer.drawString("����������, ����������� �������� ���������������� ���������.",110,120);
       g.setColor(new Color(0,0,120));
       Stringer3.drawString("x_{1} ( t ) = x_{2} ( t )",200,140);
       Stringer1.drawString(".",202,130);
       Stringer3.drawString("x_{2} ( t ) = u ( t )",200,160);
       Stringer1.drawString(".",202,150);
       g.setColor(new Color(0,0,0));
       Stringer.drawString("��� x = (x_{1}, x_{2})^{T}, |u| \u2264 1.",350,160);
       g.drawLine(105,200,620,200);
     }
     if ((sh>=186)&&(sh<=204))
     {
        g.setColor(new Color(255,0,0));
        g.setFont(new Font("Dialog",1,14));
        g.drawString("������� :",120,180);
        g.setColor(new Color(0,0,0));
        Stringer.drawString("������������ �������� � ����� ������ ����������� �����������:",120,225);

      }
     if ((sh>=187)&&(sh<=204))
     {
        g.setColor(new Color(255,0,0));
        g.setFont(new Font("Dialog",1,14));

        g.setColor(new Color(0,0,120));
        Stringer3.drawString("I =   dt \u2192 min,",300,260);

        g.setFont(new Font("Dialog",1,18));
        g.drawString("\u222B",320,263);
        g.setFont(new Font("Dialog",1,11));
        g.drawString("0",320,275);
        g.drawString("T",320,245);

      }
     if ((sh>=188)&&(sh<=204))
     {
       g.setColor(Color.black);
       Stringer.drawString("��� ������ ��������� �������� ���������� T �� ����� � �������� ",120,290);
       Stringer.drawString("�����������",120,310);
       g.setColor(new Color(0,0,120));
      }
     if ((sh>=189)&&(sh<=204))
     {
       g.setColor(Color.black);
       Stringer.drawString("� ������ �������",120,330);
       g.setColor(new Color(0,0,120));
       Stringer3.drawString("f_{1}(t, x, u) = x_{2},     f_{2}(t ,x, u) = u,",250,330);
       Stringer3.drawString("f^{0}(t, x, u) = 1,      F(x) = 0,      �_{1}(T, x(T)) = x_{1}(T) = 0,      �_{2}(T, X(T)) = x_{2}(T) = 0",110,350);
       g.setColor(new Color(0,0,120));
      }
    if ((sh>=190)&&(sh<=199))
     {
       g.setColor(Color.black);
       Stringer.drawString("�������� ������ ��������. ��������� ����� ����������� �����������",120,400);
       Stringer.drawString("���������� u^{0} (.), ��������������� ��� ���������� x*(.) � ����� T.",120,420);
       g.setColor(new Color(0,0,120));
       g.setColor(new Color(0,0,120));
      }
     if ((sh>=191)&&(sh<=199))
     {
      g.setColor(Color.red);
      g.drawImage(img4,0,201,this);

      g.setColor(Color.red);
      Stringer1.drawString("1.",110,220);
      g.setColor(Color.black);
      Stringer.drawString("��������  ������������ :",130,220);
      g.setColor(new Color(0,0,120));
      Stringer1.drawString("H ( x , \u03C8 , u , t ) =",320,220);

     }
     if ((sh>=192)&&(sh<=199))
     {
       Stringer1.drawString("\u03C8_{1}x_{2} + \u03C8_{2}u - 1",442,220);
      }
     if ((sh>=193)&&(sh<=199))
     {
      g.setColor(Color.red);
      Stringer1.drawString("2.",110,240);
      g.setColor(Color.black);
      Stringer.drawString("������  ��������  H ( x ,\u03C8 , u , t ) ��  ���������� :",130,240);
      g.setColor(new Color(0,0,120));

     }
     if ((sh>=194)&&(sh<=199))
     {
       g.setColor(Color.red);
       Stringer1.drawString("u^{ 0} ( t ) = 1  sign \u03C8_{ 2} ( t ) = sign \u03C8_{ 2} ( t ) ,",205,260);
     }
     if ((sh>=195)&&(sh<=199))
     {
       g.setColor(Color.red);
       Stringer1.drawString("3.",110,280);
       g.setColor(Color.black);
       Stringer.drawString("����c�����  ������������  ���������  ��������  ��������� :",130,280);
       g.setFont(new Font("Dialog",0,100));
       g.setColor(new Color(0,0,120));
       g.drawString("{",125,380);
       g.setColor(Color.white);
       g.drawString("{",127,380);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("x_{ 1} ( t ) = x_{ 2} ( t ) ,    x_{ 1} ( 0 ) = 0 ,    x_{1} ( T ) = 0",155,320);
       Stringer1.drawString(".",158,310);
     }
     if ((sh>=196)&&(sh<=199))
     {
       Stringer1.drawString("x_{ 2} ( t ) = ",155,340);
       Stringer1.drawString(".",158,330);
      }
      if ((sh>=197)&&(sh<=199))
     {
       Stringer1.drawString("u^{ 0} ( t ) = sign \u03C8_{ 2} ( t ) ,  x_{ 2} ( 0 ) = -4 ,  x_{2} (T) = 0,",220,340);
      }
      if ((sh>=198)&&(sh<=199))
     {
       Stringer1.drawString("\u03C8_{ 1} ( t ) = - ",155,495-160+30);
       Stringer1.drawString("\u03C8_{ 2} ( t ) = - ",155,525-160+30);
       Stringer1.drawString(".",159,485-160+30);
       Stringer1.drawString(".",159,515-160+30);
       Stringer2.drawString("\u2202",233,489-160+30);
       Stringer2.drawString("\u2202",233,517-160+30);
       Stringer2.drawString("\u2202x_{1}",228,503-160+30);
       g.drawString("2",242,533-160+30);
       Stringer2.drawString("\u2202x",228,530-160+30);
       g.drawLine(227,490-160+30,248,490-160+30);
       g.drawLine(227,518-160+30,248,518-160+30);
       Stringer1.drawString("H ( x , \u03C8 , u^{ 0} , t ) = 0",251,495-160+30);
       Stringer1.drawString("H ( x , \u03C8 , u^{ 0} , t ) = - \u03C8_{1} ( t )",251,525-160+30);
      }
      if (sh==199)
     {
       g.setColor(Color.red);
       Stringer1.drawString("4.",110,420);
       g.setColor(Color.black);
       Stringer.drawString("��������� ������� �����������������:",130,420);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("[ \u03B4F - H ( t_{1} ) \u03B4t_{1} +    \u03C8_{j} ( t_{1} ) \u03B4x_{j} ]             = 0",225-80,495-30);
       g.drawLine(500-50-80,470-30,500-50-80,510-30);
       g.setFont(new Font("Dialog",0,26));
       g.drawString("\u2211",225+115+3-80,495+2-30);
       g.setFont(new Font("Dialog",1,11));
       Stringer3.drawString("t_{1} = T",455-80,515-30);
       Stringer3.drawString(" _{j=1}",225+115+1-80,495+2-30+10);
       Stringer3.drawString(" _{2}",225+115+1-80+4,495+2-30-25);
       g.setColor(new Color(0,0,0));
       Stringer.drawString(", ��� \u03B4F = 0.",455-80+100,465);
      }
      if ((sh>=200)&&(sh<=204))
     {
       g.setColor(Color.red);
       g.drawImage(img4,0,201,this);

       g.setColor(Color.red);
       g.setColor(Color.black);
       Stringer.drawString("��� ��� ������ ��������� T �� �����, � x_{1} ( T ) � x_{2} ( T ) ������, �� ��������",110,220);
       Stringer.drawString("\u03B4t_{1} �����������, � \u03B4x_{1} = 0. \u03B4x_{2} = 0. ������� �� ������� �����������������",110,240);
       Stringer.drawString("�������:",110,260);
       g.setColor(new Color(0,0,120));
      }
      if ((sh>=201)&&(sh<=204))
     {
       g.setColor(new Color(0,0,120));
       Stringer3.drawString("H( T ) = H ( T, \u03C8 ( T ), x( T ), u( T ) ) = 0",200,260);
      }
      if ((sh>=202)&&(sh<=204))
     {
       g.setColor(Color.red);
       Stringer1.drawString("5.",110,280);
       g.setColor(Color.black);
       Stringer.drawString("������ ������������ ������� ������",130,280);
       g.setFont(new Font("Dialog",0,100));
       g.setColor(new Color(0,0,120));
       g.drawString("{",195,440-50);
       g.setColor(Color.white);
       g.drawString("{",197,440-50);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("x_{ 1} ( t ) = x_{ 2} ( t ) ,    x_{ 1} ( 0 ) = 0 ,   x_{1} ( T ) = 0,",225,375-50);
       Stringer1.drawString(".",228,365-50);
       Stringer1.drawString("x_{ 2} ( t ) = sign \u03C8_{ 2} ( t ) ,  x_{ 2} ( 0 ) = - 4 ,   x_{2} ( T ) = 0,",225,405-50);
       Stringer1.drawString(".",228,395-50);
       Stringer1.drawString("\u03C8_{ 1} ( t ) = 0 , \u03C8_{2} ( t ) = - \u03C8_{1} ( t ) ,",225,435-50);
       Stringer1.drawString(".",229,425-50);
       Stringer1.drawString("H ( T, \u03C8 ( T ), x ( T ), u ( T ) ) = 0",225,465-50);
      }
     if ((sh>=203)&&(sh<=204))
     {
       g.setColor(Color.black);
       Stringer.drawString("����� ��� ��������� ���������, ��������::",110,435);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("\u03C8_{1} ( t ) = C_{1} = const,   \u03C8_{2} ( t ) = - C_{1} t + C_{2},   u^{0} = 1 sign ( - C_{1} t + C_{2} )",130,455);
      }
     if (sh==204)
     {
       g.setColor(Color.black);
       Stringer.drawString("�. �. �������� ������� ������ ���� �� ����� ������ ����, �� ����������� ",110,475);
       Stringer.drawString("���������� �������� �������-���������� ��������, ������� �� ����� ����",110,495);
       Stringer.drawString("���������� ����������������. �� ����� u ( t ) = 1, �� ������ u ( t ) = - 1.",110,515);
      }
      if ((sh>=205)&&(sh<=208))
     {
      g.setColor(Color.red);
      g.setColor(Color.black);
      Stringer.drawString("�������� ������� �������. ��� ����� ������� ��������� ���������� ",110,50);
      Stringer.drawString("������� �� ������� ���������:",110,70);

     }
     if ((sh>=206)&&(sh<=208))
     {
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("x_{1} ( t ) = x_{2} ( t ),    x_{2} ( t ) = u ( t ) = const",350,70);
       Stringer1.drawString(".",353,60);
      }
     if ((sh>=207)&&(sh<=208))
     {
       g.setColor(new Color(0,0,120));

       Stringer1.drawString("dx_{1}      x_{2}",110,255+100-265);
       Stringer1.drawString("dx_{2}      u",110,270+100-265);
       g.drawLine(110,258+100-265,130,258+100-265);
       g.drawLine(155-3,258+100-265,170-3,258+100-265);
       Stringer1.drawString("=",140,265+100-265);

       Stringer1.drawString("x_{2}^{2}",240,255+100-265);
       Stringer1.drawString("2 u",235,270+100-265);
       g.drawLine(230,258+100-265,250,258+100-265);
       Stringer1.drawString("x_{1} =         + C",200,265+100-265);
      }

     if ((sh>=208)&&(sh<=208))
     {
      g.setColor(Color.red);
      g.drawImage(img4,0,201,this);

      wwidth=250;
      hhight=250;

      g.setColor(Color.white);
      g.fillRect(0+100,0+50+70,wwidth,hhight);

      BasicStroke pen = new BasicStroke(2,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_MITER);
      BasicStroke pen1 = new BasicStroke(1,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_MITER);

      g.setColor(new Color(174,174,174));
      for(int i=0;i<=wwidth;i+=wwidth/17) g.drawLine(0+100,i+50+70,wwidth+100,i+50+70);
      for(int i=0;i<=wwidth;i+=wwidth/17) g.drawLine(i+100,0+50+70,i+100,hhight+50+70);

      g.setColor(Color.red);
      g.drawRect(0+100, 0+50+70, wwidth-1, hhight-1);

      g.setColor(new Color(0, 0, 0));

    // ��� ��
    g.drawLine(0+100,125+50+70,250+100,125+50+70);
    g.drawLine(250+100,125+50+70,240+100,128+50+70);
    g.drawLine(250+100,125+50+70,240+100,122+50+70);

    g.drawLine(125+100,0+50+70,125+100,250+50+70);
    g.drawLine(125+100,0+50+70,128+100,10+50+70);
    g.drawLine(125+100,0+50+70,122+100,10+50+70);

    g.setColor(new Color(0, 0, 0));
    g.setFont(new Font("Dialog",1,12));
    Stringer.drawString("x_{2}",118+100-3,225-60-100+70);
    Stringer.drawString("x_{1}",248-5+100-3,125-20-50+118+70);

    g.setStroke(pen);

    g.setColor(new Color(0, 3, 138));
    for(int j=-3;j<=3;j++){
      for(double i=-125;i<=125;i+=0.05){
        if ((int) (125 + (i * i) * 17 / 2 + j * 17 * 3+100)>=100 && (int) (125 + (i * i) * 17 / 2 + j * 17 * 3+100)<=100+250 && (int) (125 + (i + 0.5) * (i + 0.5) * 17 / 2 + j * 17 * 3+100)>=100 && (int) (125 + (i + 0.5) * (i + 0.5) * 17 / 2 + j * 17 * 3+100)<=100+250){
          g.setColor(new Color(0, 3, 138));
          g.drawLine( (int) (125 + (i * i) * 17 / 2 + j * 17 * 3+100),
                      (int) (125 + i * 17+50+70),
                      (int) (125 + (i + 0.5) * (i + 0.5) * 17 / 2 + j * 17 * 3+100),
                     (int) (125 + (i + 0.5) * 17)+50+70);
    }

   if((int) (125 + (1 * 1) * 17 / 2 + j * 17 * 3+100)<=350 && (int) (125 + (1 * 1) * 17 / 2 + j * 17 * 3+100)>=100){
     g.drawLine( (int) (125 + (1 * 1) * 17 / 2 + j * 17 * 3+100),
                 (int) (125 + 1 * 17+50+70),
                 (int) (125 + (1) * (1) * 17 / 2  + j * 17 * 3+100)+2,
                 (int) (125 + (1) * 17 + 5+50+70));

     g.drawLine( (int) (125 + (1 * 1) * 17 / 2 + j * 17 * 3+100),
                 (int) (125 + 1 * 17+50+70),
                 (int) (125 + (1) * (1) * 17 / 2  + j * 17 * 3+100)+8,
                 (int) (125 + (1) * 17 + 2+50+70));
   }
  }
}

//2

      wwidth=250;
      hhight=250;

      g.setStroke(pen1);
      g.setColor(Color.white);
      g.fillRect(0+370,0+50+70,wwidth,hhight);

      g.setColor(new Color(174,174,174));
      for(int i=0;i<=wwidth;i+=wwidth/17) g.drawLine(0+370,i+50+70,wwidth+370,i+50+70);
      for(int i=0;i<=wwidth;i+=wwidth/17) g.drawLine(i+370,0+50+70,i+370,hhight+50+70);

      g.setColor(Color.red);
      g.drawRect(0+370, 0+50+70, wwidth-1, hhight-1);

      g.setColor(new Color(0, 0, 0));

      // ��� ��
      g.drawLine(0+370,125+50+70,250+370,125+50+70);
      g.drawLine(250+370,125+50+70,240+370,128+50+70);
      g.drawLine(250+370,125+50+70,240+370,122+50+70);

      // ��� ��
      g.drawLine(125+370,0+50+70,125+370,250+50+70);
      g.drawLine(125+370,0+50+70,128+370,10+50+70);
      g.drawLine(125+370,0+50+70,122+370,10+50+70);

      Stringer.drawString("x_{2}",118+100-3+290,225-60-100+70);
      Stringer.drawString("x_{1}",248-5+100-3-10+290-5,125-20-50+118+70);

      g.setStroke(pen);
      g.setColor(new Color(0, 3, 138));
      for(int j=-3;j<=3;j++){
        for(double i=-125;i<=125;i+=0.05){
          if((int) (125 - (i * i) * 17 / 2 + j * 17 * 3+370)>=370 && (int) (125 - (i * i) * 17 / 2 + j * 17 * 3+370)<=370+250 && (int) (125 - (i + 0.5) * (i + 0.5) * 17 / 2 + j * 17 * 3+370)>=370 && (int) (125 - (i + 0.5) * (i + 0.5) * 17 / 2 + j * 17 * 3+370)<=370+250){
          g.setColor(new Color(0, 3, 138));
          g.drawLine( (int) (125 - (i * i) * 17 / 2 + j * 17 * 3+370),
                      (int) (125 + i * 17+50+70),
                      (int) (125 - (i + 0.5) * (i + 0.5) * 17 / 2 + j * 17 * 3+370),
                      (int) (125 + (i + 0.5) * 17+50+70));
          }

         if((int) (125 - (1 * 1) * 17 / 2 + j * 17 * 3+370)>=370 && (int) (125 - (1 * 1) * 17 / 2 + j * 17 * 3+370)<=370+250){
           g.drawLine( (int) (125 - (1 * 1) * 17 / 2 + j * 17 * 3+370),
                       (int) (125 + 1 * 17+50+70),
                       (int) (125 - (1) * (1) * 17 / 2  + j * 17 * 3+370)+7,
                       (int) (125 + (1) * 17 - 5+50+70));
           g.drawLine( (int) (125 - (1 * 1) * 17 / 2 + j * 17 * 3+370),
                       (int) (125 + 1 * 17+50+70),
                       (int) (125 - (1) * (1) * 17 / 2  + j * 17 * 3+370)-1,
                       (int) (125 + (1) * 17 - 4+50+70));
         }
        }
      }


       g.setColor(new Color(0,0,120));

       Stringer1.drawString("x_{2}^{2}",240-5,255+100+40);
       Stringer1.drawString("2",235,270+100+40);
       g.drawLine(230,258+100+40,250,258+100+40);
       Stringer1.drawString("x_{1} =         + C",200,265+100+40);
       Stringer1.drawString("u^{0} = 1    =>",110,265+100+40);

       Stringer1.drawString("x_{2}^{2}",240+250-5+30,255+100+40);
       Stringer1.drawString("-2",235+250-3+30,270+100+40);
       g.drawLine(230+250+30,258+100+40,250+250+30,258+100+40);
       Stringer1.drawString("x_{1} =         + C",200+250+30,265+100+40);
       Stringer1.drawString("u^{0} = - 1    =>",130+250,265+100+40);

       g.setColor(new Color(0,0,0));
       Stringer.drawString("�� ������ ������� ����������� ���������� �� ����� ������������ u^{0} = 1,",110,450);
       Stringer.drawString("� �� ������ u^{0} = - 1.",110,470);
      }

      if ((sh>=209)&&(sh<=209))
      {
               g.setColor(new Color(0,0,120));
               Stringer1.drawString("�������� ����� � ���������� ����������� ����������.",110,320);

               g.setColor(Color.black);
               Stringer.drawString("�� ���������� ����������� (������ ������������) �������� ���������� ",110,350);
               Stringer.drawString("�� ��������� ��������� ���������������� ����������.",110,370);

               BasicStroke pen = new BasicStroke(2,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_MITER);
               BasicStroke pen1 = new BasicStroke(1,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_MITER);

               g.setStroke(pen1);
               g.setColor(Color.white);
               g.fillRect(0+100,0+50,550-20-10,250);

               hhight=250;
               wwidth=550-20-10;

               g.setColor(new Color(174,174,174));
               for(int i=0;i<=hhight;i+=250/17) g.drawLine(0+100,i+50,wwidth+100,i+50);
               for(int i=0;i<=wwidth;i+=250/17) g.drawLine(i+100,0+50,i+100,hhight+50);

               mm=250/17;

               // ��� ��
               g.setColor(Color.black);
               g.drawLine(0+100,125+50,550+100-30,125+50);
               g.drawLine(550+100-30,125+50,540+100-30,128+50);
               g.drawLine(550+100-30,125+50,540+100-30,122+50);

               g.drawLine(280+100,0+50,280+100,250+50);
               g.drawLine(280+100,0+50,283+100,10+50);
               g.drawLine(280+100,0+50,277+100,10+50);

               g.setColor(new Color(0, 0, 0));
               g.setFont(new Font("Dialog",1,12));
               Stringer.drawString("x_{1}",600,225-60);
               Stringer.drawString("x_{2}",370-5,20+50);

               g.setColor(Color.red);
               g.drawRect(0+100,0+50,550-20-10,250);

               g.setStroke(pen);
               g.setColor(new Color(0, 3, 138));

               for(double i=0;i<=125;i+=0.5){
                 if((int) (280 + (i * i) * 17 / 2+100) >= 100 && (int) (280 + (i * i) * 17 / 2+100) <= wwidth+100 && (int) (280 + (i + 0.5) * (i + 0.5) * 17 / 2+100)>=100 && (int) (280 + (i + 0.5) * (i + 0.5) * 17 / 2+100)<=wwidth+100){
                 g.setColor(new Color(0, 3, 138));
                 g.setColor(new Color(0, 3, 138));

                 g.drawLine( (int) (280 + (i * i) * 17 / 2+100),
                            (int) (125 + i * 17+50),
                            (int) (280 + (i + 0.5) * (i + 0.5) * 17 / 2+100),
                            (int) (125 + (i + 0.5) * 17+50));
                 }
                if(i==1){
                  g.drawLine((int) (280 + (i * i) * 17 / 2+100),
                             (int) (125 + i * 17+50),
                             (int) (280 + (i * i) * 17 / 2+4+100),
                             (int) (125 + i * 17)+7+50);

                  g.drawLine((int) (280 + (i * i) * 17 / 2+100),
                             (int) (125 + i * 17+50),
                             (int) (280 + (i * i) * 17 / 2+7+100),
                             (int) (125 + i * 17)+1+50);
                }
       }

               for(double i=-125;i<0;i+=0.5){
                 if((int) (280 - (i * i) * 17 / 2+100) >= 100 && (int) (280 - (i * i) * 17 / 2+100) <= wwidth+100 && (int) (280 - (i + 0.5) * (i + 0.5) * 17 / 2+100)>=100 && (int) (280 - (i + 0.5) * (i + 0.5) * 17 / 2+100)<=wwidth+100){
                   g.setColor(new Color(0, 3, 138));
                   g.drawLine( (int) (280 - (i * i) * 17 / 2+100),
                              (int) (125 + i * 17+50),
                              (int) (280 - (i + 0.5) * (i + 0.5) * 17 / 2+100),
                              (int) (125 + (i + 0.5) * 17+50));
                 }
                   if (i == -1) {

                     g.drawLine( (int) (280 - (i * i) * 17 / 2+100),
                                (int) (125 + i * 17+50),
                                (int) (280 - (i * i) * 17 / 2) -2 +100,
                                (int) (125 + i * 17) - 5+50);

                     g.drawLine( (int) (280 - (i * i) * 17 / 2+100),
                                (int) (125 + i * 17+50),
                                (int) (280 - (i * i) * 17 / 2) - 7+100,
                                (int) (125 + i * 17) + 50);

                   }
               }

                 // ��� ���������
               g.setStroke(pen);
               for(int j=-3;j<=2;j++){
                 if((int) (125 + (i * i) * 17 / 2 + j * 17 * 3+100)>=100 && (int) (125 + (i * i) * 17 / 2 + j * 17 * 3+100)<=wwidth+100 && (int) (125 + (i + 0.5) * (i + 0.5) * 17 / 2 + j * 17 * 3+100)>=100 && (int) (125 + (i + 0.5) * (i + 0.5) * 17 / 2 + j * 17 * 3+100)<=wwidth+100){
               for(double i=-125;i<=125;i+=0.05){
                 if ( (int) (125 + (i * i) * 17 / 2 + j * 17 * 3+100) <= (int) (280 - (i * i) * 17 / 2+100)) {
                   g.setColor(new Color(0, 3, 138));
                   g.drawLine( (int) (125 + (i * i) * 17 / 2 + j * 17 * 3+100),
                              (int) (125 + i * 17+50),
                              (int) (125 + (i + 0.05) * (i + 0.05) * 17 / 2 +
                                     j * 17 * 3+100),
                              (int) (125 + (i + 0.05) * 17+50));
                 }
                   if (i == 1) {
                     g.drawLine( (int) (125 + (i * i) * 17 / 2 + j * 17 * 3+100),
                                (int) (125 + i * 17+50),
                                (int) (125 + (i) * (i) * 17 / 2 + j * 17 * 3+100) + 2,
                                (int) (125 + (i) * 17 + 5+50));
                     g.drawLine( (int) (125 + (i * i) * 17 / 2 + j * 17 * 3+100),
                                (int) (125 + i * 17+50),
                                (int) (125 + (i) * (i) * 17 / 2 + j * 17 * 3+100) + 8,
                                (int) (125 + (i) * 17 + 2+50));
                   }
                 }
               }
             }
             for(int j=-1;j<=3;j++){
               for(double i=-125;i<=125;i+=0.05){
                 if((int) (280+125-20 - (i * i) * 17 / 2 + j * 17 * 3+100)>=100 && (int) (280+125-20 - (i * i) * 17 / 2 + j * 17 * 3+100)<=wwidth+100 && (int) (280+125-20 - (i + 0.005) * (i + 0.005) * 17 / 2 + j * 17 * 3+100)>=100 && (int) (280+125-20 - (i + 0.005) * (i + 0.005) * 17 / 2 + j * 17 * 3+100)<=wwidth+100){
                 if ((int) (280+125-20 - (i * i) * 17 / 2 + j * 17 * 3+100) >= (int) (280 + (i * i) * 17 / 2+100)) {
                   g.setColor(new Color(0, 3, 138));

                   g.drawLine( (int) (280+125-20 - (i * i) * 17 / 2 + j * 17 * 3+100),
                              (int) (125 + i * 17+50),
                              (int) (280+125-20 - (i + 0.05) * (i + 0.05) * 17 / 2 + j * 17 * 3+100),
                              (int) (125 + (i + 0.05) * 17+50));

                 }

                   if (i == 1) {
                     g.drawLine( (int) (285 - (i * i) * 17 / 2 + j * 17 * 3+100),
                                (int) (125 + i * 17+50),
                                (int) (285 - (i) * (i) * 17 / 2 + j * 17 * 3+100) + 7,
                                (int) (125 + (i) * 17 - 5+50));
                     g.drawLine( (int) (285 - (i * i) * 17 / 2 + j * 17 * 3+100),
                                (int) (125 + i * 17+50),
                                (int) (285 - (i) * (i) * 17 / 2 + j * 17 * 3+100) - 1,
                                (int) (125 + (i) * 17 - 4+50));

                   }
                 }
               }
             }



       if(edit==1){

         int xxx=(int)((x1-100-280));
         int nn=-y1+50+125;
         int yyy=(int) ( Math.sqrt(Math.abs(2*  xxx  *mm)));
         int yyy1=(int) (Math.sqrt(Math.abs(-2*  Math.abs(xxx)  *mm)));

         g.setColor(Color.blue);
         g.setFont(new Font("SansSerif", 1, 14));
         g.setColor(Color.red);

if(nn!=yyy1 && nn!=yyy){

         if( (nn >  yyy && xxx<0) || (nn > -yyy && xxx>0)) {
           int c =  (int) (xxx/mm + nn/mm*nn/mm / 2);
           for(double i=-125;i<=125;i+=0.01){

              if(i<=0){
                if(nn>Math.abs(i)){
                  if((int) (280 - (i * i) * 17 / 2+100+c*mm) >= x1){
                          g.drawLine( (int) (280 - (i * i) * 17 / 2+100+c*mm),
                                      (int) (125 + i * 17+50),
                                      (int) (280 - (i + 0.01) * (i + 0.007) * 17 / 2+100+c*mm),
                                      (int) (125 + (i + 0.01) * 17+50));
                  }
                }
             }
             else{
              if(nn>Math.abs(i)){
               if((int) (280 - (i * i) * 17 / 2+100+c*mm) >= (int) (280 + (i * i) * 17 / 2+100)){
                          g.drawLine( (int) (280 - (i * i) * 17 / 2+100+c*mm),
                                      (int) (125 + i * 17+50),
                                      (int) (280 - (i + 0.01) * (i + 0.01) * 17 / 2+100+c*mm),
                                      (int) (125 + (i + 0.01) * 17+50));

                          bbb1= i;
                          ccc1=  (i+0.01) * (i+0.01)  / 2+c*mm;
               }
              }
              else{
                if((int) (280 - (i * i) * 17 / 2+100+c*mm) <= x1 && (int) (280 - (i * i) * 17 / 2+100+c*mm) >= (int) (280 + (i * i) * 17 / 2+100)){
                          g.drawLine( (int) (280 - (i * i) * 17 / 2+100+c*mm),
                                      (int) (125 + i * 17+50),
                                      (int) (280 - (i + 0.01) * (i + 0.007) * 17 / 2+100+c*mm),
                                      (int) (125 + (i + 0.01) * 17+50));
                          bbb1= i;
                          ccc1=  (i+0.01) * (i+0.01)  / 2+c*mm;
                  }


              }
             }



           /*if((int) (280 + (i * i) * 17 / 2+100)<=100+wwidth-44 && (int) (280 + (i * i) * 17 / 2+100)>=380 && (int) (125 + i * 17+50) >= 125+50   &&  i <= bbb1-0.5    &&  (i * i) / 2 <= ccc1 ){
             g.drawLine( (int) (280 + (i * i) * 17 / 2+100),
                            (int) (125 + i * 17+50),
                            (int) (280 + (i + 0.5) * (i + 0.5) * 17 / 2+100),
                            (int) (125 + (i + 0.5) * 17+50));
              }*/


          }



          for(double i=-125;i<=125;i+=0.01)
          {
            if((int) (280 + (i * i) * 17 / 2+100)<=100+wwidth-44 && (int) (280 + (i * i) * 17 / 2+100)>=380 && (int) (125 + i * 17+50) >= 125+50   &&  i < bbb1-0.5    &&  (i * i) / 2 <= ccc1 ){
             g.drawLine( (int) (280 + (i * i) * 17 / 2+100),
                            (int) (125 + i * 17+50),
                            (int) (280 + (i + 0.5) * (i + 0.5) * 17 / 2+100),
                            (int) (125 + (i + 0.5) * 17+50));
              }

          }


          /*g.drawLine((int) (280 + (1 * 1) * 17 / 2+100),
                           (int) (125 + 1 * 17+50),
                           (int) (280 + (1 * 1) * 17 / 2+4+100),
                           (int) (125 + 1 * 17)+7+50);

          g.drawLine((int) (280 + (1 * 1) * 17 / 2+100),
                           (int) (125 + 1 * 17+50),
                           (int) (280 + (1 * 1) * 17 / 2+7+100),
                           (int) (125 + 1 * 17)+1+50);*/

         }









         else{
           int c =  (int) (xxx/mm - nn/mm*nn/mm / 2);
           fl=0;
           for(double i=-125;i<=125;i+=0.01){



             if((int) (280 - (i * i) * 17 / 2+100)>=100 && (int) (280 - (i * i) * 17 / 2+100)<=380 && (int) (125 + i * 17+50) <= 125+38){
             /*g.drawLine( (int) (280 - (i * i) * 17 / 2+100),
                            (int) (125 + i * 17+50),
                            (int) (280 - (i + 0.5) * (i + 0.5) * 17 / 2+100),
                            (int) (125 + (i + 0.5) * 17+50));*/
              }





              if(i>=0){

                if(nn<Math.abs(i)){
                  if((int) (280 + (i * i) * 17 / 2+100+c*mm) <= x1){
                    fl++;
                          g.drawLine( (int) (280 + (i * i) * 17 / 2+100+c*mm),
                                      (int) (125 + i * 17+50),
                                      (int) (280 + (i + 0.01) * (i + 0.007) * 17 / 2+100+c*mm),
                                      (int) (125 + (i + 0.01) * 17+50));
                          if(fl==1){
                            bbb1 = i;
                            ccc1 = -1 * (i + 0.01) * (i + 0.01) / 2 + c * mm;
                            //fl=0;
                          }

                  }
                }
             }
             else{
              if(nn<Math.abs(i)){

               if((int) (280 + (i * i) * 17 / 2+100+c*mm) <= (int) (280 - (i * i) * 17 / 2+100)){
                 fl++;
                         g.drawLine( (int) (280 + (i * i) * 17 / 2+100+c*mm),
                                      (int) (125 + i * 17+50),
                                      (int) (280 + (i + 0.01) * (i + 0.007) * 17 / 2+100+c*mm),
                                      (int) (125 + (i + 0.01) * 17+50));
                          if(fl==1){
                            bbb1 = i;
                            ccc1 = -1 * (i + 0.01) * (i + 0.01) / 2 + c * mm;
                            //fl=0;
                          }
               }
              }
              else{
                if((int) (280 + (i * i) * 17 / 2+100+c*mm) >= x1 && (int) (280 + (i * i) * 17 / 2+100+c*mm) <= (int) (280 - (i * i) * 17 / 2+100)){
                  fl++;
                          g.drawLine( (int) (280 + (i * i) * 17 / 2+100+c*mm),
                                      (int) (125 + i * 17+50),
                                      (int) (280 + (i + 0.01) * (i + 0.007) * 17 / 2+100+c*mm),
                                      (int) (125 + (i + 0.01) * 17+50));
                          if(fl==1){
                            bbb1 = i;
                            ccc1 = -1 * (i + 0.01) * (i + 0.01) / 2 + c * mm;
                            //fl=0;
                          }

                  }
              }
             }



           if((int) (280 - (i * i) * 17 / 2+100)>=100+wwidth-44 && (int) (280 - (i * i) * 17 / 2+100)<=380 && (int) (125 + i * 17+50) <= 125+50){
             g.drawLine( (int) (280 - (i * i) * 17 / 2+100),
                            (int) (125 + i * 17+50),
                            (int) (280 - (i + 0.5) * (i + 0.5) * 17 / 2+100),
                            (int) (125 + (i + 0.5) * 17+50));
              }


          }







          for(double i=-125;i<=125;i+=0.01){
            if((int) (280 - (i * i) * 17 / 2+100)>=100 && (int) (280 - (i * i) * 17 / 2+100)<=380 && (int) (125 + i * 17+50) <= 125+38   &&  i > bbb1){//    && -1* (i * i) / 2 <= ccc1 ){
            g.drawLine( (int) (280 - (i * i) * 17 / 2+100),
                            (int) (125 + i * 17+50),
                            (int) (280 - (i + 0.5) * (i + 0.5) * 17 / 2+100),
                            (int) (125 + (i + 0.5) * 17+50));
            }
          }


/*
          g.drawLine( (int) (280 - ((-1) * (-1)) * 17 / 2+100),
                                (int) (125 + (-1) * 17+50),
                                (int) (280 - ((-1) * (-1)) * 17 / 2) -2 +100,
                                (int) (125 + (-1) * 17) - 5+50);

         g.drawLine( (int) (280 - ((-1) * (-1)) * 17 / 2+100),
                                (int) (125 + (-1) * 17+50),
                                (int) (280 - ((-1) * (-1)) * 17 / 2) - 7+100,
                                (int) (125 + (-1) * 17) + 50);
 */
         }
}
else{
 if(nn!=yyy1){
   for(double i=-125;i<=125;i+=0.01){
            if((int) (280 - (i * i) * 17 / 2+100)>=100 && (int) (280 - (i * i) * 17 / 2+100)<=380 && (int) (125 + i * 17+50) <= 125+38){
            g.drawLine( (int) (280 - (i * i) * 17 / 2+100),
                            (int) (125 + i * 17+50),
                            (int) (280 - (i + 0.5) * (i + 0.5) * 17 / 2+100),
                            (int) (125 + (i + 0.5) * 17+50));
      }
    }




    /*g.drawLine( (int) (280 - ((-1) * (-1)) * 17 / 2+100),
                                    (int) (125 + (-1) * 17+50),
                                    (int) (280 - ((-1) * (-1)) * 17 / 2) -2 +100,
                                    (int) (125 + (-1) * 17) - 5+50);

                         g.drawLine( (int) (280 - ((-1) * (-1)) * 17 / 2+100),
                                    (int) (125 + (-1) * 17+50),
                                    (int) (280 - ((-1) * (-1)) * 17 / 2) - 7+100,
                                    (int) (125 + (-1) * 17) + 50);*/








 }
 else{
   for(double i=-125;i<=125;i+=0.01)
          {
            if((int) (280 + (i * i) * 17 / 2+100)<=100+wwidth-44 && (int) (280 + (i * i) * 17 / 2+100)>=380 && (int) (125 + i * 17+50) >= 125+50   &&  i < bbb1-0.5    &&  (i * i) / 2 <= ccc1 ){
             g.drawLine( (int) (280 + (i * i) * 17 / 2+100),
                            (int) (125 + i * 17+50),
                            (int) (280 + (i + 0.5) * (i + 0.5) * 17 / 2+100),
                            (int) (125 + (i + 0.5) * 17+50));
              }

          }


          /*g.drawLine( (int) (280 - ((-1) * (-1)) * 17 / 2+100),
                                        (int) (125 + (-1) * 17+50),
                                        (int) (280 - ((-1) * (-1)) * 17 / 2) -2 +100,
                                        (int) (125 + (-1) * 17) - 5+50);

                             g.drawLine( (int) (280 - ((-1) * (-1)) * 17 / 2+100),
                                        (int) (125 + (-1) * 17+50),
                                        (int) (280 - ((-1) * (-1)) * 17 / 2) - 7+100,
                                        (int) (125 + (-1) * 17) + 50);
    */



 }
}


       }


      }
    if ((sh>=210)&&(sh<=217))
     {
       g.setColor(Color.black);
       Stringer.drawString("������ ����� T = t_{1} + t_{2}, ������������� �� ������� �� ����� x_{0} = ( 0, - 4 )^{T} ",110,60);
       Stringer.drawString("� ������ ���������. ",110,80);

      }
     if ((sh>=211)&&(sh<=217))
     {
       Stringer.drawString("����� t_{1} - �����, �������� � ����������� u^{0} = 1 �� ����� ������������, ",110,100);
       Stringer.drawString("t_{2} - ����� �������� � ����������� u^{0} = - 1.",153,120);

     }
     if ((sh>=212)&&(sh<=217))
     {
      Stringer.drawString("�� ������ ������� x_{1} ( t ) = x_{2} ( t ),   x_{2} ( t ) = u^{0} ( t ) = 1, ������",110,160);
      Stringer3.drawString(".                          .",239,150);
      g.setColor(new Color(0,0,120));
      Stringer1.drawString("x_{2} = t + C_{1},    x_{1} ( t ) =      + C_{1} t + C_{2}",110,190);
      Stringer1.drawString("t^{2}",260,180);
      Stringer1.drawString("2",260,200);
      g.drawLine(257,184,269,184);
      }
     if ((sh>=213)&&(sh<=217))
     {
      g.setColor(Color.black);
      Stringer.drawString("��� t = 0 ����� x_{2} ( 0 ) = C_{1} = - 4,   x_{1} ( 0 ) = C_{2} = 0, �������",110,220);
      g.setColor(new Color(0,0,120));
      Stringer1.drawString("x_{2} = t - 4,     x_{1} ( t ) =         - 4 t ",110,190+60);
      Stringer1.drawString("t^{2}",260,180+60);
      Stringer1.drawString("2",260,200+60);
      g.drawLine(257,184+60,269,184+60);

     }
     if ((sh>=214)&&(sh<=217))
     {
      g.setColor(Color.black);
      Stringer.drawString("�� ������ ������� x_{1} ( t ) = x_{2} ( t ),   x_{2} ( t ) = u^{0} ( t ) = - 1, ������",110,280);
      Stringer3.drawString(".                          .",237,270);
      g.setColor(new Color(0,0,120));
      Stringer1.drawString("x_{2} = - t + C_{1},    x_{1} ( t ) = -       + C_{1} t + C_{2}",110,190+120);
      Stringer1.drawString("t^{2}",260+20,180+120);
      Stringer1.drawString("2",260+20,200+120);
      g.drawLine(257+20,184+120,269+20,184+120);
     }
      if ((sh>=215)&&(sh<=217))
     {
      g.setColor(Color.black);
      Stringer.drawString("� �������� ������ ������� T = t_{1} + t_{2} ���������� ������ ������� � ������ ",110,340);
      Stringer.drawString("���������",110,360);
      g.setColor(new Color(0,0,120));
      Stringer1.drawString("x_{2} ( t_{1} + t_{2} ) = - ( t_{1} + t_{2} ) + C_{1} = 0",200,360);
      g.setColor(Color.black);
      Stringer.drawString("�� ���� ������� ",440,360);
      g.setColor(new Color(0,0,120));
      Stringer1.drawString("C_{1} = t_{1} + t_{2},   C_{2} = - 0.5 ( t_{1} + t_{2} )^{2}",110,380);
      }
      if ((sh>=216)&&(sh<=217))
      {
       Stringer1.drawString("x_{1} ( t_{1} ) = 0.5 t_{1} ^{2} - 4 t_{1} = -0.5 t_{1} ^{2} + ( t_{1} + t_{2} ) t_{1} - 0.5 ( t_{1} + t_{2} )^{2}",110,410);
       Stringer1.drawString("x_{2} = ( t_{1} - 4 ) = - t_{1} + t_{1} + t_{2}",110,430);
      }
      if ((sh>=217)&&(sh<=217))
      {
       g.setColor(Color.black);
       Stringer.drawString("� ���������� �������� ",110,460);
       g.setColor(Color.red);
       g.drawLine(330,445,350,445);
       g.drawLine(330,446,350,446);
       Stringer1.drawString("t_{2} = 2 \u221A 2      �      T = 4 + 4 \u221A 2",280,460);
       g.drawLine(472,445,482,445);
       g.drawLine(472,446,482,446);
      }
      if ((sh>=218)&&(sh<=218))
      {



        Stringer1.drawString("x_{1} ( t ) = x_{2} ( t )",660-510,100+300);
        Stringer1.drawString(".",662-510,90+300);
        Stringer1.drawString("x_{2} ( t ) = u ( t )",660-510,130+300);
        Stringer1.drawString(".",662-510,120+300);
        Stringer1.drawString("x_{1} ( 0 ) = 0",660-510,170+300);
        Stringer1.drawString("x_{2} ( 0 ) = - 4",660-510,190+300);

        g.drawLine(330,445-60,350,445-60);
        g.drawLine(330,446-60,350,446-60);
        Stringer1.drawString("t_{2} = 2 \u221A 2             T = 4 + 4 \u221A 2",280,460-60);
        g.drawLine(472,445-60,482,445-60);
        g.drawLine(472,446-60,482,446-60);

        Stringer1.drawString(", ��� �������  u^{0} = 1, ����� u^{0} = - 1",280-30,130+300);




               g.setColor(Color.white);
               g.fillRect(0+100,0+50,550-20-10,250);

               hhight=250;
               wwidth=550-20-10;

               g.setColor(new Color(174,174,174));
               for(int i=0;i<=hhight;i+=250/17) g.drawLine(0+100,i+50,wwidth+100,i+50);
               for(int i=0;i<=wwidth;i+=250/17) g.drawLine(i+100,0+50,i+100,hhight+50);

               mm=250/17;

               // ��� ��
               g.setColor(Color.black);
               g.drawLine(0+100,125+50,550+100-30,125+50);
               g.drawLine(550+100-30,125+50,540+100-30,128+50);
               g.drawLine(550+100-30,125+50,540+100-30,122+50);

               g.drawLine(280+100,0+50,280+100,250+50);
               g.drawLine(280+100,0+50,283+100,10+50);
               g.drawLine(280+100,0+50,277+100,10+50);

               g.setColor(Color.red);
               g.drawRect(0+100,0+50,550-20-10,250);

               g.setColor(new Color(0, 3, 138));

               g.drawString("( 0, 0 )",100+280+5,125+48);
               g.drawString("( 0, -4 )",100+270-40,125+48+50+30);
               g.setColor(new Color(0, 0, 0));
               g.setFont(new Font("Dialog",1,12));
               Stringer.drawString("x_{1}",600,225-60);
               Stringer.drawString("x_{2}",370-5,20+50);

               g.setColor(Color.red);
               BasicStroke pen = new BasicStroke(2,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_MITER);
               BasicStroke pen1 = new BasicStroke(1,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_MITER);
               g.setStroke(pen);
               for(double i=-125;i<0;i+=0.005){
                 if((int) (280 - (i * i) * 17 / 2+100) >= 250+70+10 && (int) (280 - (i * i) * 17 / 2+100) <= wwidth+100 && (int) (280 - (i + 0.5) * (i + 0.5) * 17 / 2+100)>=100 && (int) (280 - (i + 0.5) * (i + 0.5) * 17 / 2+100)<=wwidth+100){
                   g.setColor(new Color(0, 3, 138));
                    g.drawLine( (int) (280 - (i * i) * 17 / 2+100),
                                (int) (125 + i * 17+50),
                                (int) (280 - (i + 0.005) * (i + 0.005) * 17 / 2+100),
                                (int) (125 + (i + 0.005) * 17+50));
                 }
                     g.drawLine( (int) (280 - ((-2) * (-2)) * 17 / 2+100),
                                 (int) (125 + (-2) * 17+50),
                                 (int) (280 - ((-2) * (-2)) * 17 / 2) - 7+100,
                                 (int) (125 + (-2) * 17) - 8 +50);
                     g.drawLine( (int) (280 - ((-2) * (-2)) * 17 / 2+100),
                                 (int) (125 + (-2) * 17+50)-1,
                                 (int) (280 - ((-2) * (-2)) * 17 / 2) - 7+100,
                                 (int) (125 + (-2) * 17) - 8 +50-1);


                     g.drawLine( (int) (280 - ((-2) * (-2)) * 17 / 2+100),
                                 (int) (125 + (-2) * 17+50),
                                 (int) (280 - ((-2) * (-2)) * 17 / 2) - 10+100,
                                 (int) (125 + (-2) * 17) - 2 +50);
                     g.drawLine( (int) (280 - ((-2) * (-2)) * 17 / 2+100),
                                 (int) (125 + (-2) * 17+50)+1,
                                 (int) (280 - ((-2) * (-2)) * 17 / 2) - 10+100,
                                 (int) (125 + (-2) * 17) - 2 +50+1);
               }
                 if((int) (125 + (i * i) * 17 / 2 +100)>=100 && (int) (125 + (i * i) * 17 / 2 + 100)<=wwidth+100 && (int) (125 + (i + 0.5) * (i + 0.5) * 17 / 2 + 100)>=100 && (int) (125 + (i + 0.5) * (i + 0.5) * 17 / 2 + 100)<=wwidth+100){
               for(double i=-125;i<=125;i+=0.005){

                 if((int) (125 + (i * i) * 17 / 2 +100+60)<=125+280-27 && (int) (125 + i * 17+50)>=135){
                 g.drawLine( (int) (125 + (i * i) * 17 / 2 +100+60),
                                             (int) (125 + i * 17+50),
                                             (int) (125 + (i + 0.005) * (i + 0.005) * 17 / 2 +
                                                    100+60),
                                             (int) (125 + (i + 0.005) * 17+50));
                 }
                     g.drawLine( (int) (125 + (1 * 1) * 17 / 2 + 100+60),
                                (int) (125 + 1 * 17+50),
                                (int) (125 + (1) * (1) * 17 / 2 + 100+60) + 2,
                                (int) (125 + (1) * 17 + 5+50));
                    g.drawLine( (int) (125 + (1 * 1) * 17 / 2 + 100+60),
                                (int) (125 + 1 * 17+50)+1,
                                (int) (125 + (1) * (1) * 17 / 2 + 100+60) + 2,
                                (int) (125 + (1) * 17 + 5+50)+1);


                     g.drawLine( (int) (125 + (1 * 1) * 17 / 2 + 100+60),
                                (int) (125 + 1 * 17+50)-1,
                                (int) (125 + (1) * (1) * 17 / 2 + 100+60) + 8,
                                (int) (125 + (1) * 17 + 2+50)-1);
                    g.drawLine( (int) (125 + (1 * 1) * 17 / 2 + 100+60),
                                (int) (125 + 1 * 17+50),
                                (int) (125 + (1) * (1) * 17 / 2 + 100+60) + 8,
                                (int) (125 + (1) * 17 + 2+50));
                 }
               }

               g.setColor(new Color(0,0,120));
               Stringer1.drawString("����������� ���������� ��� ������ ������.",110,320);
      }
    }
  }

  void jButton1_actionPerformed(ActionEvent e)
   {
     if (sh==0)
    { jButton1.setText("����������");
      jButton2.setVisible(true);
      jButton3.setVisible(true);}
     sh=1;
     if (jCheckBox1.isSelected()) jCheckBox1.setSelected(false);
     if (jCheckBox2.isSelected()) jCheckBox2.setSelected(false);
     if (jCheckBox3.isSelected()) jCheckBox3.setSelected(false);
     MP.repaint();
    if (sh>=152) {xcl=0; ycl=0;}
   }

  void jButton2_actionPerformed(ActionEvent e)
  {
   edit=0;
   if (sh<=218) sh++;
   if (jCheckBox1.isSelected()) jCheckBox1.setSelected(false);
   if (jCheckBox2.isSelected()) jCheckBox2.setSelected(false);
   if (jCheckBox3.isSelected()) jCheckBox3.setSelected(false);
   if (sh>=1)  MP.repaint();
  }

  void jButton3_actionPerformed(ActionEvent e)
  {
   edit=0;
   if (sh>185) sh--;
   if (sh==28) a=0;
   if (jCheckBox1.isSelected()) jCheckBox1.setSelected(false);
   if (jCheckBox2.isSelected()) jCheckBox2.setSelected(false);
   if (jCheckBox3.isSelected()) jCheckBox3.setSelected(false);
   MP.repaint();
   if (sh==151) {xcl=0; ycl=0;}
  }

  void MP_mouseDragged(MouseEvent e)
  {
    x2=e.getX();
    y2=e.getY();
    if ((sh>=10)&&(sh<=16)&&(FlPer==1))
    {
       if ((x2>=282)&&(x2<=520)){x=x2; MP.repaint(245,200,360,150);}
       if (x2<282) {x=282; MP.repaint(245,200,360,150);}
       if (x2>520) {x=520; MP.repaint(245,200,360,150);}
    }
  }

  void MP_mousePressed(MouseEvent e)
  {

   if (sh==209 && e.getX()>=100 && e.getX()<=550-20-10+50 && e.getY()>=50 && e.getY()<=50+250){
     x1=e.getX();
     y1=e.getY();
     edit=1;
     MP.repaint(100,50,550-20-10,250);
   }

  }

  void MP_mouseReleased(MouseEvent e)
  {
   if ((sh>=10)&&(sh<=16)&&(c==Color.red))
     {
      c=Color.black;
      MP.repaint(245,200,360,150);
      }
  }

  void jCheckBox1_itemStateChanged(ItemEvent e)
  {
   if (jCheckBox2.isSelected()) jCheckBox2.setSelected(false);
   if (jCheckBox1.isSelected()) MP.FormulaPrir(MP.getGraphics());
   else MP.repaint(200,135,408,288);
  }

  void jCheckBox2_itemStateChanged(ItemEvent e)
  {
   if (jCheckBox1.isSelected()) jCheckBox1.setSelected(false);
   if (jCheckBox2.isSelected()) MP.FormulaIgVar(MP.getGraphics());
   else MP.repaint(200,135,358,188);
  }

  void jCheckBox3_itemStateChanged(ItemEvent e)
  {
   if (jCheckBox3.isSelected()) MP.Formula3(MP.getGraphics());
   else MP.repaint(200,135,358,158);
  }

  void MP_mouseMoved(MouseEvent e)
  {




   col1=Color.black; col2=Color.black; col3=Color.black; col4=Color.black; col5=Color.black;
   col6=Color.black; col7=Color.black; col8=Color.black; col9=Color.black; col10=Color.black;
   col11=Color.black; col12=Color.black; col13=Color.black; col14=Color.black; col15=Color.black;
  if ((sh==1)&&(x2>=160)&&(x2<=750))
    {
     if ((y2>=85)&&(y2<=103))   col1=Color.red;
     if ((y2>=107)&&(y2<=125))  col2=Color.red;
     if ((y2>=160)&&(y2<=178))  col3=Color.red;
     if ((y2>=182)&&(y2<=199))  col4=Color.red;
     if ((y2>=203)&&(y2<=220))  col5=Color.red;
     if ((y2>=223)&&(y2<=240))  col6=Color.red;
     if ((y2>=275)&&(y2<=313))  col7=Color.red;
     if ((y2>=317)&&(y2<=335))  col8=Color.red;
     if ((y2>=370)&&(y2<=388))  col9=Color.red;
     if ((y2>=392)&&(y2<=409))  col10=Color.red;
     if ((y2>=412)&&(y2<=429))  col11=Color.red;
     if ((y2>=432)&&(y2<=450))  col12=Color.red;
     if ((y2>=475)&&(y2<=493))  col13=Color.red;
     if ((y2>=495)&&(y2<=513))  col14=Color.red;
     if ((y2>=515)&&(y2<=533))  col15=Color.red;
    }

  }

  void jButton1_mouseMoved(MouseEvent e)
  {
   if  (jLabel1.getForeground()==Color.white) jLabel1.setForeground(Color.black);
   if  (jLabel2.getForeground()==Color.white) jLabel2.setForeground(Color.black);
   if  (jLabel3.getForeground()==Color.white) jLabel3.setForeground(Color.black);
   if  (jLabel4.getForeground()==Color.white) jLabel4.setForeground(Color.black);
   if  (jLabel5.getForeground()==Color.white) jLabel5.setForeground(Color.black);
   if  (Lp.getForeground()==Color.white) Lp.setForeground(Color.black);
   if  (Ln.getForeground()==Color.white) Ln.setForeground(Color.black);
  }

  void this_mouseMoved(MouseEvent e)
  {
   if  (jLabel1.getForeground()==Color.white) jLabel1.setForeground(Color.black);
   if  (jLabel2.getForeground()==Color.white) jLabel2.setForeground(Color.black);
   if  (jLabel3.getForeground()==Color.white) jLabel3.setForeground(Color.black);
   if  (jLabel4.getForeground()==Color.white) jLabel4.setForeground(Color.black);
   if  (jLabel5.getForeground()==Color.white) jLabel5.setForeground(Color.black);
   if  (Lp.getForeground()==Color.white) Lp.setForeground(Color.black);
   if  (Ln.getForeground()==Color.white) Ln.setForeground(Color.black);
  }

  void jLabel1_mouseMoved(MouseEvent e)
  {
   if  (jLabel2.getForeground()==Color.white) jLabel2.setForeground(Color.black);
   if  (jLabel3.getForeground()==Color.white) jLabel3.setForeground(Color.black);
   if  (jLabel4.getForeground()==Color.white) jLabel4.setForeground(Color.black);
   if  (jLabel5.getForeground()==Color.white) jLabel5.setForeground(Color.black);
   if  (Lp.getForeground()==Color.white) Lp.setForeground(Color.black);
   if  (Ln.getForeground()==Color.white) Ln.setForeground(Color.black);
   if  (jLabel1.getForeground()==Color.black) jLabel1.setForeground(Color.white);
  }

  void jLabel2_mouseMoved(MouseEvent e)
  {
    if  (jLabel1.getForeground()==Color.white) jLabel1.setForeground(Color.black);
    if  (jLabel3.getForeground()==Color.white) jLabel3.setForeground(Color.black);
    if  (jLabel4.getForeground()==Color.white) jLabel4.setForeground(Color.black);
    if  (jLabel5.getForeground()==Color.white) jLabel5.setForeground(Color.black);
    if  (Lp.getForeground()==Color.white) Lp.setForeground(Color.black);
    if  (Ln.getForeground()==Color.white) Ln.setForeground(Color.black);
    if  (jLabel2.getForeground()==Color.black) jLabel2.setForeground(Color.white);
  }

  void jLabel3_mouseMoved(MouseEvent e)
  {
    if  (jLabel1.getForeground()==Color.white) jLabel1.setForeground(Color.black);
    if  (jLabel2.getForeground()==Color.white) jLabel2.setForeground(Color.black);
    if  (jLabel4.getForeground()==Color.white) jLabel4.setForeground(Color.black);
    if  (jLabel5.getForeground()==Color.white) jLabel5.setForeground(Color.black);
    if  (Lp.getForeground()==Color.white) Lp.setForeground(Color.black);
    if  (Ln.getForeground()==Color.white) Ln.setForeground(Color.black);
    if  (jLabel3.getForeground()==Color.black) jLabel3.setForeground(Color.white);
  }

  void jLabel4_mouseMoved(MouseEvent e)
  {
   if  (jLabel1.getForeground()==Color.white) jLabel1.setForeground(Color.black);
   if  (jLabel2.getForeground()==Color.white) jLabel2.setForeground(Color.black);
   if  (jLabel3.getForeground()==Color.white) jLabel3.setForeground(Color.black);
   if  (jLabel5.getForeground()==Color.white) jLabel5.setForeground(Color.black);
   if  (Lp.getForeground()==Color.white) Lp.setForeground(Color.black);
   if  (Ln.getForeground()==Color.white) Ln.setForeground(Color.black);
   if  (jLabel4.getForeground()==Color.black) jLabel4.setForeground(Color.white);
  }

  void jLabel5_mouseMoved(MouseEvent e)
  {
   if  (jLabel1.getForeground()==Color.white) jLabel1.setForeground(Color.black);
   if  (jLabel2.getForeground()==Color.white) jLabel2.setForeground(Color.black);
   if  (jLabel3.getForeground()==Color.white) jLabel3.setForeground(Color.black);
   if  (jLabel4.getForeground()==Color.white) jLabel4.setForeground(Color.black);
   if  (Lp.getForeground()==Color.white) Lp.setForeground(Color.black);
   if  (Ln.getForeground()==Color.white) Ln.setForeground(Color.black);
   if  (jLabel5.getForeground()==Color.black) jLabel5.setForeground(Color.white);
  }

  void Ln_mouseMoved(MouseEvent e)
  {
   if  (jLabel1.getForeground()!=Color.yellow) jLabel1.setForeground(Color.black);
   if  (Lp.getForeground()==Color.white) Lp.setForeground(Color.black);
    if (num5>1) Ln.setForeground(Color.white);
  }

 void Lp_mouseMoved(MouseEvent e)
  {
   if  (jLabel5.getForeground()!=Color.yellow) jLabel5.setForeground(Color.black);
   if  (Ln.getForeground()==Color.white) Ln.setForeground(Color.black);
    if (num5<5) Lp.setForeground(Color.white);
  }

  void Ln_mouseClicked(MouseEvent e)
  {
   if (num5>1)
   {
     num5--;
     jLabel1.setText(""+(1+5*(num5-1)));
     jLabel2.setText(""+(2+5*(num5-1)));
     jLabel3.setText(""+(3+5*(num5-1)));
     jLabel4.setText(""+(4+5*(num5-1)));
     jLabel5.setText(""+(5+5*(num5-1)));

     jLabel1.setForeground(Color.black);
     jLabel2.setForeground(Color.black);
     jLabel3.setForeground(Color.black);
     jLabel4.setForeground(Color.black);
     jLabel5.setForeground(Color.black);
     if (num5==numGl)
     {
     if (labl==1) jLabel1.setForeground(Color.yellow);
     if (labl==2) jLabel2.setForeground(Color.yellow);
     if (labl==3) jLabel3.setForeground(Color.yellow);
     if (labl==4) jLabel4.setForeground(Color.yellow);
     if (labl==5) jLabel5.setForeground(Color.yellow);
     }
   }
  }

  void Lp_mouseClicked(MouseEvent e)
  {
   if (num5<5)
   {
     num5++;
     jLabel1.setText(""+(1+5*(num5-1)));
     jLabel2.setText(""+(2+5*(num5-1)));
     jLabel3.setText(""+(3+5*(num5-1)));
     jLabel4.setText(""+(4+5*(num5-1)));
     jLabel5.setText(""+(5+5*(num5-1)));

     jLabel1.setForeground(Color.black);
     jLabel2.setForeground(Color.black);
     jLabel3.setForeground(Color.black);
     jLabel4.setForeground(Color.black);
     jLabel5.setForeground(Color.black);
     if (num5==numGl)
   {
     if (labl==1) jLabel1.setForeground(Color.yellow);
     if (labl==2) jLabel2.setForeground(Color.yellow);
     if (labl==3) jLabel3.setForeground(Color.yellow);
     if (labl==4) jLabel4.setForeground(Color.yellow);
     if (labl==5) jLabel5.setForeground(Color.yellow);
   }
   }
  }

  void jLabel1_mouseClicked(MouseEvent e)
  {
   if (num5==1) sh=16;
   if (num5==2) sh=64;
   if (num5==3) sh=101;
   if (num5==4) sh=146;
   if (num5==5) sh=199;
   MP.repaint();
  }

  void jLabel2_mousePressed(MouseEvent e)
  {
   if (num5==1) sh=30;
   if (num5==2) sh=69;
   if (num5==3) sh=112;
   if (num5==4) sh=155;
   if (num5==5) sh=204;
   MP.repaint();
  }

  void jLabel3_mouseClicked(MouseEvent e)
  {
   if (num5==1) sh=41;
   if (num5==2) sh=74;
   if (num5==3) sh=121;
   if (num5==4) sh=166;
   if (num5==5) sh=219;
   MP.repaint();
  }

  void jLabel4_mouseClicked(MouseEvent e)
  {
   if (num5==1) sh=45;
   if (num5==2) sh=79;
   if (num5==3) sh=126;
   if (num5==4) sh=174;
   if (num5==5) sh=224;
   MP.repaint();
  }

  void jLabel5_mouseClicked(MouseEvent e)
  {
   if (num5==1) sh=55;
   if (num5==2) sh=89;
   if (num5==3) sh=133;
   if (num5==4) sh=184;
   if (num5==5) sh=233;
   MP.repaint();
  }



}
