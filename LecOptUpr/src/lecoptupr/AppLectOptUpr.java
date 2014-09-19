package lecoptupr;

import java.awt.*;
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

  int xPoints[]={334,424,526,575,529,420};   //  �������
  int yPoints[]={237,178,178,205,252,263};        //  ��������������
  Polygon plg = new Polygon(xPoints,yPoints,6); // �������� ��������������
  public Image img1,img2,img3;
  public int sh=0, x=400, y=285, FlPer=0,xrA,yrA,xrB,yrB,xrkr,yrkr,a=0,Fl=0,i,c1=2,c2=2;
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
    jButton1.setBackground(new Color(255, 235, 200));
    jButton1.setFont(new java.awt.Font("SansSerif", 1, 12));
    jButton1.setForeground(new Color(0, 0, 60));
    jButton1.setBorder(BorderFactory.createEtchedBorder());
    jButton1.setText("������");
    jButton1.setBounds(new Rectangle(365, 569, 120, 23));
    jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseMoved(MouseEvent e) {
        jButton1_mouseMoved(e);
      }
    });
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
    jButton2.setVisible(false);
    jButton3.setVisible(false);


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
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel1.setText("1");

    jLabel1.setBounds(new Rectangle(360, 550, 25, 17));
    jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        jLabel1_mouseClicked(e);
      }
    });
    jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseMoved(MouseEvent e) {
        jLabel1_mouseMoved(e);
      }
    });
    jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseMoved(MouseEvent e) {
        jLabel2_mouseMoved(e);
      }
    });
    jLabel2.setBounds(new Rectangle(390, 550, 25, 17));
    jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(MouseEvent e) {
        jLabel2_mousePressed(e);
      }
    });
    jLabel2.setText("2");
    jLabel2.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseMoved(MouseEvent e) {
        jLabel3_mouseMoved(e);
      }
    });
    jLabel3.setBounds(new Rectangle(420, 550, 25, 17));
    jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        jLabel3_mouseClicked(e);
      }
    });
    jLabel3.setText("3");
    jLabel3.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel4.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel4.setText("4");
    jLabel4.setBounds(new Rectangle(450, 550, 25, 17));
    jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        jLabel4_mouseClicked(e);
      }
    });
    jLabel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseMoved(MouseEvent e) {
        jLabel4_mouseMoved(e);
      }
    });
    jLabel5.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel5.setText("5");
    jLabel5.setBounds(new Rectangle(480, 550, 25, 17));
    jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        jLabel5_mouseClicked(e);
      }
    });
    jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseMoved(MouseEvent e) {
        jLabel5_mouseMoved(e);
      }
    });
    Ln.setFont(new java.awt.Font("Dialog", 1, 16));
    Ln.setToolTipText("����������");
    Ln.setText("<<");
    Ln.setBounds(new Rectangle(320, 550, 27, 17));
    Ln.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        Ln_mouseClicked(e);
      }
    });
    Ln.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseMoved(MouseEvent e) {
        Ln_mouseMoved(e);
      }
    });
    Lp.setFont(new java.awt.Font("Dialog", 1, 16));
    Lp.setToolTipText("���������");
    Lp.setText(">>");
    Lp.setBounds(new Rectangle(512, 550, 25, 17));
    Lp.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        Lp_mouseClicked(e);
      }
    });
    Lp.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseMoved(MouseEvent e) {
        Lp_mouseMoved(e);
      }
    });
    jLabel6.setFont(new java.awt.Font("Dialog", 3, 14));
    jLabel6.setForeground(Color.orange);
    jLabel6.setText("���.");
    jLabel6.setBounds(new Rectangle(265, 549, 41, 17));
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

    public void paintLine(Graphics g,double s)
    {
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

      public void paint(Graphics g)
     {
     if (sh==0) g.drawImage(img1,0,0,this);
     if ((sh>=1)&&(sh<=233))  g.drawImage(img2,0,0,this);
     if (sh==234) g.drawImage(img3,0,0,this);

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
     if (sh==1)
     {
       g.setColor(Color.red);
       g.setFont(new Font("Dialog",1,24));
       g.drawString("����������",365,45);
       g.setColor(Color.black);
       g.drawLine(365,49,510,49);
       g.drawLine(365,50,510,50);
       g.setFont(new Font("Dialog",1,16));
       g.setColor(new Color(0,0,120));
       g.drawString("\u00A7 1. ��������  ������  ������������  ����������",130,75);
       g.drawString("\u00A7 2. �������  ���������  ����������",130,150);
       g.drawString("\u00A7 3. �����������  �������  �������������",130,265);
       g.drawString("\u00A7 4. �������  �����������������",130,360);
       g.drawString("\u00A7 5. �������  �����",130,470);
       g.setColor(col1);
       Stringer3.drawString("- 1.  ������  ������������  ��  ��������������  ����������  ................................. 1",160,100);
       g.setColor(col2);
       Stringer3.drawString("- 2.  ����������  ��������  ������  ������������  ����������  ............................... 3",160,120);
       g.setColor(col3);
       Stringer3.drawString("- 1.  ����������  ����������  ������  �������������  ����������  ........................ 5",160,175);
       g.setColor(col4);
       Stringer3.drawString("- 2.  �������  ����������  ��������  ��������  .......................................................... 6",160,195);
       g.setColor(col5);
       Stringer3.drawString("- 3.  ����������  ��������  ................................................................................................ 9",160,215);
       g.setColor(col6);
       Stringer3.drawString("- 4.  �������  ���������  ................................................................................................ 10",160,235);
       g.setColor(col7);
       Stringer3.drawString("- 1.  �������  ������  �������������  ����������  �������  �������������",160,290);
       Stringer3.drawString("����������������  .................................................................................................. 12 ",190,310);
       g.setColor(col8);
       Stringer3.drawString("- 2.  �����������  �������  �������������  ................................................................. 15",160,330);
       g.setColor(col9);
       Stringer3.drawString("- 1.  �����  ������  �������������  ����������  ....................................................... 16",160,385);
       g.setColor(col10);
       Stringer3.drawString("- 2.  ������  ������  ������������  ���������� ......................................................... 18",160,405);
       g.setColor(col11);
       Stringer3.drawString("- 3.  �������  ���������  �  �������  ����������������� ....................................... 18",160,425);
       g.setColor(col12);
       Stringer3.drawString("- 4.  �������  ���������  �  ������  �������������� .............................................. 19",160,445);
       g.setColor(col13);
       Stringer3.drawString("- 1.  ��������  ����������  ��������  ��������� .................................................... 20",160,490);
       g.setColor(col14);
       Stringer3.drawString("- 2.  ������ 1 ( �������� ������ ������ ) ................................................................... 21",160,510);
       g.setColor(col15);
       Stringer3.drawString("- 3.  ������ 2 ( �������� ������ ������ ) .................................................................. 23",160,530);
     }

    if ((sh>=1)&&(sh<=55))    num5=1;
    if ((sh>=56)&&(sh<=89))  num5=2;
    if ((sh>=90)&&(sh<=133)) num5=3;
    if ((sh>=134)&&(sh<=184)) num5=4;
    if ((sh>=185)&&(sh<=233)) num5=5;
    jLabel1.setText(""+(1+5*(num5-1)));
    jLabel2.setText(""+(2+5*(num5-1)));
    jLabel3.setText(""+(3+5*(num5-1)));
    jLabel4.setText(""+(4+5*(num5-1)));
    jLabel5.setText(""+(5+5*(num5-1)));
     numGl=num5;
     if ((sh==1)||(sh==234))
     {
      labl=0;
      jLabel1.setForeground(Color.black);
      jLabel2.setForeground(Color.black);
      jLabel3.setForeground(Color.black);
      jLabel4.setForeground(Color.black);
      jLabel5.setForeground(Color.black);
     }
     if ((sh>=2)&&(sh<=16)&&(num5==1))
     {
      labl=1;
      jLabel1.setForeground(Color.yellow);
      jLabel2.setForeground(Color.black);
      jLabel3.setForeground(Color.black);
      jLabel4.setForeground(Color.black);
      jLabel5.setForeground(Color.black);
     }
    if ((sh>=17)&&(sh<=30)&&( num5==1))
    {
      labl=2;
      jLabel2.setForeground(Color.yellow);
      jLabel1.setForeground(Color.black);
      jLabel3.setForeground(Color.black);
      jLabel4.setForeground(Color.black);
      jLabel5.setForeground(Color.black);
     }
    if ((sh>=31)&&(sh<=41)&&( num5==1))
    {
      labl=3;
      jLabel3.setForeground(Color.yellow);
      jLabel2.setForeground(Color.black);
      jLabel1.setForeground(Color.black);
      jLabel4.setForeground(Color.black);
      jLabel5.setForeground(Color.black);
     }
    if ((sh>=42)&&(sh<=45)&&( num5==1))
     {
      labl=4;
      jLabel4.setForeground(Color.yellow);
      jLabel2.setForeground(Color.black);
      jLabel3.setForeground(Color.black);
      jLabel1.setForeground(Color.black);
      jLabel5.setForeground(Color.black);
     }
    if ((sh>=46)&&(sh<=55)&&( num5==1))
    {
      labl=5;
      jLabel5.setForeground(Color.yellow);
      jLabel2.setForeground(Color.black);
      jLabel3.setForeground(Color.black);
      jLabel4.setForeground(Color.black);
      jLabel1.setForeground(Color.black);
     }
    if ((sh>=56)&&(sh<=64)&&( num5==2))
     {
       labl=1;
       jLabel1.setForeground(Color.yellow);
       jLabel2.setForeground(Color.black);
       jLabel3.setForeground(Color.black);
       jLabel4.setForeground(Color.black);
       jLabel5.setForeground(Color.black);
      }
    if ((sh>=65)&&(sh<=69)&&( num5==2))
    {
      labl=2;
      jLabel2.setForeground(Color.yellow);
      jLabel1.setForeground(Color.black);
      jLabel3.setForeground(Color.black);
      jLabel4.setForeground(Color.black);
      jLabel5.setForeground(Color.black);
     }
     if ((sh>=70)&&(sh<=74)&&( num5==2))
     {
      labl=3;
      jLabel3.setForeground(Color.yellow);
      jLabel2.setForeground(Color.black);
      jLabel1.setForeground(Color.black);
      jLabel4.setForeground(Color.black);
      jLabel5.setForeground(Color.black);
     }
    if ((sh>=75)&&(sh<=79)&&( num5==2))
     {
      labl=4;
      jLabel4.setForeground(Color.yellow);
      jLabel2.setForeground(Color.black);
      jLabel3.setForeground(Color.black);
      jLabel1.setForeground(Color.black);
      jLabel5.setForeground(Color.black);
     }
     if ((sh>=80)&&(sh<=89)&&( num5==2))
    {
      labl=5;
      jLabel5.setForeground(Color.yellow);
      jLabel2.setForeground(Color.black);
      jLabel3.setForeground(Color.black);
      jLabel4.setForeground(Color.black);
      jLabel1.setForeground(Color.black);
     }
     if ((sh>=90)&&(sh<=101)&&( num5==3))
      {
       labl=1;
       jLabel1.setForeground(Color.yellow);
       jLabel2.setForeground(Color.black);
       jLabel3.setForeground(Color.black);
       jLabel4.setForeground(Color.black);
       jLabel5.setForeground(Color.black);
      }
     if ((sh>=102)&&(sh<=112)&&( num5==3))
     {
      labl=2;
      jLabel2.setForeground(Color.yellow);
      jLabel1.setForeground(Color.black);
      jLabel3.setForeground(Color.black);
      jLabel4.setForeground(Color.black);
      jLabel5.setForeground(Color.black);
     }
     if ((sh>=113)&&(sh<=121)&&( num5==3))
     {
      labl=3;
      jLabel3.setForeground(Color.yellow);
      jLabel2.setForeground(Color.black);
      jLabel1.setForeground(Color.black);
      jLabel4.setForeground(Color.black);
      jLabel5.setForeground(Color.black);
     }
    if ((sh>=122)&&(sh<=126)&&( num5==3))
     {
      labl=4;
      jLabel4.setForeground(Color.yellow);
      jLabel2.setForeground(Color.black);
      jLabel3.setForeground(Color.black);
      jLabel1.setForeground(Color.black);
      jLabel5.setForeground(Color.black);
     }
    if ((sh>=127)&&(sh<=133)&&( num5==3))
     {
      labl=5;
      jLabel5.setForeground(Color.yellow);
      jLabel2.setForeground(Color.black);
      jLabel3.setForeground(Color.black);
      jLabel4.setForeground(Color.black);
      jLabel1.setForeground(Color.black);
     }
     if ((sh>=134)&&(sh<=146)&&( num5==4))
      {
       labl=1;
       jLabel1.setForeground(Color.yellow);
       jLabel2.setForeground(Color.black);
       jLabel3.setForeground(Color.black);
       jLabel4.setForeground(Color.black);
       jLabel5.setForeground(Color.black);
      }
     if ((sh>=147)&&(sh<=155)&&( num5==4))
     {
      labl=2;
      jLabel2.setForeground(Color.yellow);
      jLabel1.setForeground(Color.black);
      jLabel3.setForeground(Color.black);
      jLabel4.setForeground(Color.black);
      jLabel5.setForeground(Color.black);
     }
     if ((sh>=156)&&(sh<=166)&&( num5==4))
     {
      labl=3;
      jLabel3.setForeground(Color.yellow);
      jLabel2.setForeground(Color.black);
      jLabel1.setForeground(Color.black);
      jLabel4.setForeground(Color.black);
      jLabel5.setForeground(Color.black);
     }
     if ((sh>=167)&&(sh<=174)&&( num5==4))
     {
      labl=4;
      jLabel4.setForeground(Color.yellow);
      jLabel2.setForeground(Color.black);
      jLabel1.setForeground(Color.black);
      jLabel3.setForeground(Color.black);
      jLabel5.setForeground(Color.black);
     }
    if ((sh>=175)&&(sh<=184)&&( num5==4))
     {
      labl=5;
      jLabel5.setForeground(Color.yellow);
      jLabel2.setForeground(Color.black);
      jLabel1.setForeground(Color.black);
      jLabel4.setForeground(Color.black);
      jLabel3.setForeground(Color.black);
     }
    if ((sh>=185)&&(sh<=199)&&( num5==5))
      {
       labl=1;
       jLabel1.setForeground(Color.yellow);
       jLabel2.setForeground(Color.black);
       jLabel3.setForeground(Color.black);
       jLabel4.setForeground(Color.black);
       jLabel5.setForeground(Color.black);
      }
    if ((sh>=200)&&(sh<=204)&&( num5==5))
      {
       labl=2;
       jLabel2.setForeground(Color.yellow);
       jLabel1.setForeground(Color.black);
       jLabel3.setForeground(Color.black);
       jLabel4.setForeground(Color.black);
       jLabel5.setForeground(Color.black);
      }
     if ((sh>=205)&&(sh<=219)&&( num5==5))
      {
       labl=3;
       jLabel3.setForeground(Color.yellow);
       jLabel2.setForeground(Color.black);
       jLabel1.setForeground(Color.black);
       jLabel4.setForeground(Color.black);
       jLabel5.setForeground(Color.black);
      }
     if ((sh>=220)&&(sh<=224)&&( num5==5))
      {
       labl=4;
       jLabel4.setForeground(Color.yellow);
       jLabel2.setForeground(Color.black);
       jLabel1.setForeground(Color.black);
       jLabel3.setForeground(Color.black);
       jLabel5.setForeground(Color.black);
      }
     if ((sh>=225)&&(sh<=233)&&( num5==5))
      {
       labl=5;
       jLabel5.setForeground(Color.yellow);
       jLabel1.setForeground(Color.black);
       jLabel2.setForeground(Color.black);
       jLabel3.setForeground(Color.black);
       jLabel4.setForeground(Color.black);
      }
     if ((sh>=2)&&(sh<=233))
     {
      g.setColor(Color.red);
      g.drawLine(627,15,627,535);
      g.setColor(new Color(0,0,120));
      g.setFont(new Font("Dialog",1,14));
      g.drawString("�������:",690,60);
     }
     if ((sh>=2)&&(sh<=45))
     {
       g.setColor(Color.red);
       g.setFont(new Font("Dialog",1,16));
       g.drawString("�������� ������ ������������ ����������",160,30);
       g.setColor(Color.black);
       g.drawLine(160,35,517,35);
       g.drawLine(160,34,517,34);
     }
    if ((sh>=2)&&(sh<=16))
     {
       g.setFont(new Font("Dialog",0,14));
       g.drawString("   ����������  ������  ������  ������  ������������  ����������,  ������� ",100,60);
       g.drawString("��������  ��� ��������� ����  ���������� �����  ����������  ����������� ",100,80);
       g.drawString("������   ����������:",100,100);
     }
     if ((sh>=3)&&(sh<=30))
     {
       g.setFont(new Font("Dialog",1,14));
       if (sh<=16) g.drawString("1.  ������ ������������ �� �������������� ����������.",110,120);
       else        g.drawString("1.  ������ ������������ �� �������������� ����������.",110,60);
     }
    if ((sh>=4)&&(sh<=16))
     { g.setColor(new Color(0,0,140));
       g.setFont(new Font("Dialog",2,14));
       g.drawString("���������� ��c������� ������:",120,140);
       g.drawString("�������:",120,240);
     }
     if ((sh>=5)&&(sh<=16))
     {
       g.setFont(new Font("Dialog",0,14));
       if (sh==5) g.setColor(new Color(100,0,60));
       else g.setColor(Color.black);
       g.drawString("������������ ����� ��������� �����",100,160);
       if (sh==5) g.setColor(Color.red);
       else g.setColor(Color.black);
       if ((sh>=10)&&(sh<=16)) g.setColor(c);
       g.drawRect(x,285,45,30);
       g.drawRect(x+1,286,43,28);
       g.setColor(Color.black);
       g.fillOval(x+20,298,5,5);
       g.drawLine(x+22,300,x+22,340);
       g.drawLine(x+19,330,x+22,340);
       g.drawLine(x+25,330,x+22,340);
       g.drawString("P",x+30,345);
     }
     if ((sh>=6)&&(sh<=16))
     {
       if (sh==6) g.setColor(new Color(100,0,60));
       else g.setColor(Color.black);
       g.drawString("��������� � ������� ��������������",365,160);
       g.drawString("����, �� ����������� �� ������ �������,",100,180);
       if (sh==6) g.setColor(Color.red);
       else g.setColor(Color.black);
       if ((sh>=10)&&(sh<=16)) g.setColor(c);
       g.drawLine(x-40,300,x,300);
       g.drawLine(x-10,297,x,300);
       g.drawLine(x-10,303,x,300);
       g.setFont(new Font("Dialog",1,14));
       g.drawString("U",x-15,295);
     }

     if ((sh>=7)&&(sh<=16))
     {
       if (sh==7) g.setColor(new Color(100,0,60));
       else g.setColor(Color.black);
       g.setFont(new Font("Dialog",0,14));
       g.drawString("����������� �� ��������������",405,180);
       g.drawString("������,",100,200);
       if (sh==7) g.setColor(Color.red);
       else g.setColor(Color.black);
       g.drawLine(280,315,580,315);
       g.drawLine(570,312,580,315);
       g.drawLine(570,318,580,315);
       g.setFont(new Font("Dialog",2,14));
       g.drawString("x",570,330);
       if ((sh>=10)&&(sh<=16)) g.setColor(c);
       g.setFont(new Font("Dialog",1,14));
       g.drawString("V",x+50,265);
       g.drawLine(x+22,285,x+22,270);
       g.drawLine(x+22,270,x+70,270);
       g.drawLine(x+60,267,x+70,270);
       g.drawLine(x+60,273,x+70,270);
     }
     if ((sh>=8)&&(sh<=16))
     {
       if (sh==8) g.setColor(new Color(100,0,60));
       else g.setColor(Color.black);
       g.setFont(new Font("Dialog",0,14));
       g.drawString("��  ����������  ���������  A,",165,200);
       g.drawString("�  �������  �����  �����  ��������",370,200);
       Stringer.drawString("�������� v_{0}  ",100,220);
       if (sh==8) g.setColor(Color.red);
       else g.setColor(Color.black);
       g.fillOval(300,312,6,6);
       g.drawLine(303,340,303,245);
       g.drawLine(303,245,343,245);
       g.drawLine(333,242,343,245);
       g.drawLine(333,248,343,245);
       Stringer.drawString("V_{0}",313,238);
       g.setFont(new Font("Dialog",1,14));
       g.drawString("A",290,330);
       g.setFont(new Font("Dialog",2,15));
       g.drawString("\u03B1",290,310);
     }
     if ((sh>=9)&&(sh<=16))
     {
      if (sh==9) g.setColor(new Color(100,0,60));
      else g.setColor(Color.black);
      g.setFont(new Font("Dialog",0,14));
      Stringer.drawString("� �������� ��������� B � �������� ��������� v_{1}   ��������.",190,220);
      if (sh==9) g.setColor(Color.red);
      else g.setColor(Color.black);
      g.fillOval(540,312,6,6);
      g.drawLine(543,315,543,245);
      g.drawLine(543,245,583,245);
      g.drawLine(573,242,583,245);
      g.drawLine(573,248,583,245);
      Stringer.drawString("V_{1}",555,238);
      g.setFont(new Font("Dialog",1,14));
      g.drawString("B",550,330);
      g.setFont(new Font("Dialog",2,15));
      g.drawString("\u03B2",550,310);
      if ((sh>=10)&&(sh<=16)) g.setColor(c);
      g.drawLine(304,335,x+20,335);
      g.drawLine(304,335,309,332);
      g.drawLine(304,335,309,337);
      g.drawLine(x+20,335,x+15,337);
      g.drawLine(x+20,335,x+15,332);
      g.setFont(new Font("Dialog",2,14));
      g.drawString("x",Math.round((x-304)/2)+320,330);
     }
     if ((sh>=10)&&(sh<=16))
     {
     g.setColor(new Color(150,0,60));
     g.setFont(new Font("Dialog",2,13));
     g.drawString("C ������� �������",110,270);
     g.drawString("�� ������ �����������",110,285);
     g.drawString("������ �� ������ A",110,300);
     g.drawString("� ����� B.",110,315);
     }

     if ((sh>=11)&&(sh<=16))
     {
       g.setColor(new Color(0,0,140));
       g.setFont(new Font("Dialog",2,14));
       g.drawString("�������������� ��c������� ������:",120,360);
     }
    if ((sh>=12)&&(sh<=16))
     {
       g.setFont(new Font("Dialog",0,14));
       g.setColor(Color.black);
       g.drawString("�������� ",100,380);
       g.drawString("��������  �����  �����  ���  Ox  �����������",300,380);
       g.drawString("����������",100,400);
       g.setFont(new Font("Dialog",3,14));
       g.drawString("������ ������� ",170,380);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("x = u ,",300,400);
       g.drawString("(1)",585,400);
       g.setFont(new Font("Dialog",1,16));
       g.drawString("..",302,390);
     }
    if ((sh>=12)&&(sh<=45))
     {
      if ((sh==19)||(sh==26)) g.setColor(Color.red);
      else        //g.setColor(Color.black);
       g.setColor(new Color(120,0,0));
       StringerForm.drawString("x(t) = u(t) ",632,90);
       g.drawString("(1) ",805,90);
       g.drawString("..",634,80);
     }
    if ((sh>=13)&&(sh<=16))
     {
      g.setFont(new Font("Dialog",0,14));
      g.setColor(Color.black);
      g.drawString("��� ",100,420);
      g.drawString(" - ��������� ����� � ������ ������� t ;",260,420);
      g.drawString("�������� ����, ����������� � ������ ������� t � ������� ����������.",140,440);
      g.setFont(new Font("Dialog",2,14));
      g.drawString("x (t) =",180,420);
      g.drawString("u (t) -",100,440);
      Stringer2.drawString("\u2202^{ 2}x",225,412);
      Stringer2.drawString("\u2202 t^{ 2}",225,429);
      g.drawLine(220,415,248,415);
      g.setFont(new Font("Dialog",1,15));
      g.drawString("..",181,410);
     }
     if ((sh>=14)&&(sh<=16))
     {
      g.setFont(new Font("Dialog",0,14));
      g.setColor(Color.black);
      g.drawString("��  ����������   ����������  ������  �������  �����������   ��   x(t) :",100,460);
      g.setColor(new Color(0,0,140));
      Stringer1.drawString("x(0) = \u03B1 ,    x(0) = v_{0} ;    x(t_{1} ) = \u03B2 ,    x(t_{ 1} ) = v_{1}",200,480);
      g.setFont(new Font("Dialog",1,15));
      g.drawString(".",279,470);
      g.drawString(".",443,470);
      g.drawString("(2)",585,480);
     }
     if ((sh>=14)&&(sh<=45))
     {
      if (sh==20) g.setColor(Color.red);
      else     //   g.setColor(Color.black);
      g.setColor(new Color(120,0,0));
      StringerForm.drawString("x(0) = \u03B1",632,120);
      StringerForm.drawString("x(0) = v_{0}",632,150);
      StringerForm.drawString("x(t_{1}) = \u03B2",632,180);
      StringerForm.drawString("x(t_{1}) = v_{1}",632,210);
      g.setFont(new Font("Dialog",3,16));
      g.drawString(".",636,139);
      g.drawString(".",636,199);
      g.drawString("(2)",805,165);
      g.setFont(new Font("Dialog",0,100));
      g.drawString("}",712,185);
      g.setColor(Color.white);
      g.drawString("}",710,185);
     }
 if ((sh>=15)&&(sh<=16))
     {
      g.setFont(new Font("Dialog",0,14));
      g.setColor(Color.black);
      g.drawString("��� ",100,500);
      g.drawString(" - �������� ����� ;",190,500);
      g.setFont(new Font("Dialog",2,14));
      g.drawString("x (t) =",130,500);
      Stringer.drawString("t = 0 � t = t_{1} - ��������� � �������� �������.",315,500);
      Stringer2.drawString("\u2202 x",171,492);
      Stringer2.drawString("\u2202 t",171,509);
      g.drawLine(170,495,188,495);
      g.setFont(new Font("Dialog",1,15));
      g.drawString(".",133,490);
     }
    if (sh==16)
     {
      g.setFont(new Font("Dialog",0,14));
      g.setColor(Color.black);
      g.drawString("�� ���� ����� �������� �����������:  ",100,525);
      g.setColor(new Color(0,0,140));
      Stringer1.drawString("| u ( t ) |     1 ,    t \u2208 [ 0, t_{ 1} ]",380,525);
      Stringer1.drawString("(3)",585,525);
      Stringer.drawString("\u2264",438,525);
      Stringer.drawString("\u2264",439,525);
     }
    if ((sh>=16)&&(sh<=45))
     {
      if (sh==18) g.setColor(Color.red);
      else    //    g.setColor(Color.black);
      g.setColor(new Color(120,0,0));
      StringerForm.drawString("| u (t) |     1 ,  t \u2208 [0, t_{1} ]",632,240);
      g.drawString("(3)",805,240);
      Stringer.drawString("\u2264",682,240);
      Stringer.drawString("\u2264",683,240);
     }
    if ((sh>=17)&&(sh<=30))
     {
      g.setFont(new Font("Dialog",0,14));
      g.setColor(Color.black);
      Stringer.drawString("�.�. �������������� ������ ��������������� ������ ������� � ������ �����",100,80);
      Stringer.drawString("������� ����������� ������� u^{ 0} (t) ,  t\u2208 [0 , t&{ 1}{ 0} ]",100,100);
     }
    if ((sh>=18)&&(sh<=30))
     {
      g.setFont(new Font("Dialog",0,14));
      g.setColor(Color.black);
      g.drawString("���������� ������������ (3),",425,100);
      Stringer.drawString("t_{ 1} = t&{ 1}{ 0} , ",100,120);
     }
    if ((sh>=19)&&(sh<=30))
     {
      g.setColor(Color.black);
      Stringer.drawString("����� ��������������� �� �������  x^{ 0} (t) ,  t\u2208 [0 , t&{ 1}{ 0} ] , ���������  (1)",150,120);
     }
    if ((sh>=20)&&(sh<=30))
     {
      g.setColor(Color.black);
      Stringer.drawString("������������� ������� �������� (2)",100,140);
     }
     if ((sh>=21)&&(sh<=30))
     {
      g.setColor(Color.black);
      Stringer.drawString("� �������� ������  t&{ 1}{ 0} ��� ����������",355,140);
      Stringer.drawString("���������.",100,160);
     }
     if ((sh>=22)&&(sh<=30))
     {
      g.setColor(new Color(0,0,140));
      g.setFont(new Font("Dialog",2,14));
      g.drawString("�������� � ������� ����������",120,180);
      g.setColor(Color.black);
      g.drawString("(���������� ��������� ������� ����������): ",100,200);
      g.setFont(new Font("Dialog",0,14));
      g.drawString("�����",425,200);
      Stringer1.drawString("x_{ 1}= x , x_{ 2}= x ,",470,200);
      Stringer1.drawString(".",553,190);
     }
     if ((sh>=23)&&(sh<=30))
     {
      g.setColor(Color.black);
      g.setFont(new Font("Dialog",0,14));
      g.drawString("����� ���������������� ������ ��������� ���:",100,220);
      g.setColor(new Color(0,0,140));
      Stringer1.drawString("x_{1}= x_{ 2} ,    x_{2}= u ,    | u |     1 ,    x_{1}(0) = \u03B1 , ",230,240);
      Stringer1.drawString("x_{2}(0) = v_{ 0} ,    x_{1} (t_{ 1} ) = \u03B2 ,    x_{2} (t_{ 1} ) = v_{ 1}  ,    t_{ 1}   > min ",190,260);
      Stringer.drawString("\u2264",387,240);
      Stringer.drawString("\u2264",388,240);
      g.drawLine(502,254,514,254);
      g.drawLine(502,253,514,253);
      Stringer1.drawString(".",233,230);
      Stringer1.drawString(".",301,230);
     }
     if ((sh>=24)&&(sh<=30))
     {
      g.setColor(new Color(0,0,140));
      g.setFont(new Font("Dialog",2,14));
      g.drawString("�������������� ����� :",120,300);
     }
     if ((sh>=25)&&(sh<=30))
     {
      g.setFont(new Font("Dialog",0,14));
      g.setColor(Color.black);
      g.drawString("���������� �� ������� ��������� {",110,330);
      g.drawString("}",398,330);
      Stringer.drawString(" x_{ 1} , x_{ 2}",350,330);
      g.drawLine(425,320,425,480);
      g.drawLine(420,330,425,320);
      g.drawLine(430,330,425,320);
      g.drawLine(420,475,590,475);
      g.drawLine(580,470,590,475);
      g.drawLine(580,480,590,475);
      Stringer1.drawString("x_{ 1}",590,488);
      Stringer1.drawString("x_{2}",430,320);
      Stringer1.drawString("0",415,488);
     }
     if ((sh>=26)&&(sh<=30))
     {
      g.setColor(Color.black);
      Stringer.drawString("����� ����������      x^{ 0} (t) = ",110,350);
      g.drawString("{",300,350);
      g.drawString("}",395,350);
      g.drawString("������� (1),",110,370);
      Stringer.drawString("x&{ 1}{ 0} (t) , x&{ 2}{ 0} (t)",310,350);
     }
     if ((sh>=27)&&(sh<=30))
     {
      g.setColor(Color.black);
      Stringer.drawString("������� �� ���������� �����",200,370);
      Stringer.drawString("t&{ 1}{ 0} ��������� �� �����  A = ",110,390);
      g.drawString("{",290,390);
      g.drawString("}",340,390);
      Stringer.drawString("\u03B1 , v_{0}",300,390);
     }
     if ((sh>=28)&&(sh<=30))
     {
      g.setColor(Color.black);
      g.setFont(new Font("Dialog",0,14));
      g.drawString("� �����",355,390);
      g.drawString("B =  {",110,410);
      g.drawString("}.",190,410);
      Stringer.drawString("\u03B2 , v_{1}",150,410);
     }
     if ((sh>=29)&&(sh<=30))
     {
      g.setColor(new Color(150,0,60));
      g.setFont(new Font("Dialog",2,13));
      g.drawString("�������� �� ��������� ���������",130,440);
      g.drawString("� �������� ����� A � B,",130,460);
      g.setColor(new Color(150,150,150));
      int i;
      for (i=0;i<=9;i++)
       g.drawLine(425+i*15,335,435+i*15,335);
       g.drawLine(570,335,570,340);
      for (i=0;i<=8;i++)
       g.drawLine(570,345+i*15,570,355+i*15);
      if (a>=1)
      {
       g.setColor(new Color(0,0,120));
       g.fillOval(xrA,yrA,8,8);
       g.setColor(Color.red);
       Stringer1.drawString("A(\u03B1,v_{0})",xrA,yrA-5);}
      if (a==2)
      {g.setColor(new Color(0,0,120));
       g.fillOval(xrB,yrB,8,8);
       g.setColor(Color.red);
       Stringer1.drawString("B(\u03B2,v_{1})",xrB,yrB-5);}
    }

    if (sh==30)
     {
       g.setColor(new Color(150,0,60));
       g.setFont(new Font("Dialog",2,13));
       g.drawString("� ����� ",300,460);
       g.drawString("�������� �� ��������� ������.",130,480);
       g.setColor(new Color(0,0,120));
       g.drawLine(xrA+3,yrA+3,xrB+3,yrB+3);
       g.drawLine(xrA+2,yrA+2,xrB+2,yrB+2);
       g.setColor(Color.black);
       Stringer3.drawString("x^{ 0}(t)",Math.round(Math.abs(xrB-xrA)/2)+Math.min(xrA,xrB) , Math.round(Math.abs(yrB-yrA)/2)+Math.min(yrA,yrB));
     }
    if ((sh>=31)&&(sh<=45))
     {

       g.setFont(new Font("Dialog",1,14));
       g.setColor(Color.black);
       g.drawString("2.  ���������� �������� ������ ������������ ����������.",110,60);
     }
    if ((sh>=32)&&(sh<=41))
     {
       g.setFont(new Font("Dialog",1,14));
       Stringer.drawString("����������  ���������  ������, ���������  �������� �  n-������ �������",110,80);
       Stringer.drawString("������������ R_{n} ����������� ���������� ",100,100);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("x = f ( x , u ) ,",320,120);
       Stringer1.drawString(".",322,110);
       Stringer1.drawString("(4)",585,120);
     }
    if ((sh>=32)&&(sh<=45))
     {
       if ((sh==36)||(sh==43)) g.setColor(Color.red);
       else      //  g.setColor(Color.black);
       g.setColor(new Color(120,0,0));
       StringerForm.drawString("x = f ( x , u ) ",632,270);
       StringerForm.drawString("(4) ",805,270);
       g.drawString(".",636,260);
      }
    if ((sh>=33)&&(sh<=41))
     {
      g.setColor(Color.black);
      Stringer.drawString("��� ",100,140);
      g.drawString(" - �������� ������� ;",200,165);
      g.drawString("{",165,140);
      g.drawString("{",165,190);
      g.drawString("}",270,140);
      g.drawString("}",270,190);
      g.setFont(new Font("Dialog",2,14));
      g.setColor(new Color(0,0,120));
      g.drawString(" - ��������� ;",280,140);
      g.drawString(" - ������ ���������� ;",280,190);
      g.setColor(Color.black);
      g.drawString("x =",140,140);
      g.drawString("x = ",140,165);
      g.drawString("u =",140,190);
      Stringer.drawString("x_{ 1} , x_{ 2}, ... , x_{ n}",175,140);
      Stringer.drawString("u_{ 1} , u_{ 2}, ... , u_{ r}",175,190);
      Stringer.drawString("\u2202 x",170,157);
      Stringer.drawString("\u2202 t",170,175);
      g.drawLine(165,160,193,160);
      Stringer1.drawString(".",142,155);
     }
     if ((sh>=34)&&(sh<=41))
     {
      Stringer1.drawString("Df_{1} :",100,220);
      Stringer.drawString("�����  �  r - ������  ������������  R_{ r} ������  ���������  U \u2208 R_{ r}.",135,220);
     }
     if ((sh>=35)&&(sh<=41))
     {
      Stringer.drawString("������� - �����������   �������   u(t) ,  t \u2265 0 ,  �����������  ��������  ��",100,240);
      Stringer.drawString("U :  u (t) \u2208 U,  t \u2265 0,  �������",100,260);
      g.setFont(new Font("Dialog",3,14));
      g.drawString("��������� �����������.",300,260);
     }
     if ((sh>=36)&&(sh<=41))
     {
      Stringer1.drawString("Df_{2} :",100,290);
      Stringer.drawString("��������� ���������� u (t) , t \u2265 0, � ��������������� ��� ����������� ",135,290);
      Stringer.drawString("�������-������� ����������  x (t) , t \u2265 0, ������� (4) ������� ",100,310);
      g.setFont(new Font("Dialog",3,14));
      g.drawString("����������� ,",515,310);
     }
     if ((sh>=37)&&(sh<=41))
     {
      Stringer.drawString("���� ��� �������� �����  x_{ �} , x_{ �} \u2208 R_{ n} ��� ���������  0 < t_{ 1} < \u221E  �����������",100,330);
      Stringer.drawString("��������� :",100,350);
      g.setColor(new Color(0,0,120));
      Stringer1.drawString("x (0) = x_{ �} , x ( t_{1} ) = x_{ �}",270,355);
      Stringer1.drawString("(5)",585,355);
     }
     if ((sh>=37)&&(sh<=45))
     {
//      g.setColor(Color.black);
      g.setColor(new Color(120,0,0));
      StringerForm.drawString("x (0) = x_{ �}",632,300);
      StringerForm.drawString("x ( t_{1} ) = x_{ �}",632,330);
      StringerForm.drawString("(5) ",805,315);
      g.setFont(new Font("Dialog",0,45));
      g.drawString("}",722,320);
      g.setColor(Color.white);
      g.drawString("}",720,320);
     }
     if ((sh>=38)&&(sh<=41))
     {
      g.setColor(new Color(0,0,120));
      g.setFont(new Font("Dialog",2,14));
      g.drawString(" ��������  ������  ������������  ����������",110,385);
      g.setColor(Color.black);
      Stringer.drawString("������� � ��������� :",440,385);
     }
     if ((sh>=39)&&(sh<=41))
     {
      Stringer.drawString("�����  ����������  ����������  �����  �����  u^{ 0}(t),  t \u2265 0,  ������� ���������",100,405);
      Stringer.drawString("����������  x^{ 0}(t),  t \u2265 0,  ��  x_{ �} �  x_{ �}  �� ���������� ��������� �����.",100,425);
     }
     if ((sh>=40)&&(sh<=41))
     {
      Stringer1.drawString("Df_{3} :",100,460);
      Stringer.drawString("����������  x^{ 0}(t), t\u2208 [0 , t&{ 1}{ 0} ] , � ����������� �� ���������� ����������",135,460);
      Stringer.drawString("u^{ 0}( t ),   t\u2208 [0 , t&{ 1}{ 0} ] ,",100,480);
     }
     if (sh==41)
     {
      Stringer.drawString("���������� ",235,480);
      g.setFont(new Font("Dialog",3,14));
      g.drawString("������������;",320,480);
      Stringer.drawString("��� ����   t&{ 1}{ 0}   ����������",100,500);
      g.setColor(new Color(0,0,120));
      g.setFont(new Font("Dialog",2,14));
      g.drawString("�������� ��������������.",280,500);
     }
     if ((sh>=42)&&(sh<=45))
     {
      g.setColor(Color.black);
      Stringer.drawString("����������  ��� ��������������",110,90);
      g.setColor(new Color(0,0,120));
      g.setFont(new Font("Dialog",2,14));
      g.drawString("�������  �������������  �����������",340,90);
      g.drawString("���������� :",100,110);
      g.setColor(Color.black);
      g.setFont(new Font("Dialog",1,15));
      g.drawString("T",107,133);
      g.setFont(new Font("Dialog",0,35));
      g.drawString("\u2207",100,143);
     }
     if ((sh>=43)&&(sh<=45))
     {
      Stringer.drawString("����  ���������  ����������  ����������  �������  (4)  �  f ( x , u ) \u2208 C",130,135);
      Stringer.drawString("������� � ����������,",100,155);
     }
     if ((sh>=44)&&(sh<=45))
     {
      Stringer.drawString("�",260,155);
      Stringer.drawString(" - ��������   �������,",100,200);
      g.setColor(new Color(0,0,120));
      g.setFont(new Font("Dialog",2,14));
      g.drawString("��������� ���������� ��������� ",280,155);
      Stringer1.drawString("f ( x , U ) =    y : y = f( x , u ), u \u2208 U",220,180);
      g.setFont(new Font("Dialog",1,14));
      g.drawString("{",295,180);
      g.drawString("}",460,180);
     }
     if (sh==45)
     {
      g.setColor(Color.black);
      Stringer.drawString("�� ������  ��������������  �����  �������  � ������",255,200);
      Stringer.drawString(" ���������  �������.",100,220);
      }
     if ((sh>=46)&&(sh<=101))
     {
       g.setColor(Color.red);
       g.setFont(new Font("Dialog",1,16));
       g.drawString("������� ��������� ����������",230,30);
       g.setColor(Color.black);
       g.drawLine(230,35,495,35);
       g.drawLine(230,34,495,34);
     }
     if ((sh>=47)&&(sh<=55))
     {
       g.setFont(new Font("Dialog",3,14));
       g.drawString("��������� ���������",110,60);
       Stringer.drawString("����������   ��������   �����������   �������",285,60);
       Stringer.drawString("�������������    �    �������   ������������   ����������,  ���������   �",110,80);
       Stringer.drawString("�������������  �������������  ������.",110,100);
     }
     if ((sh>=48)&&(sh<=55))
     {
       Stringer.drawString("���  �����  ������� �� ��������� ����������� �������  �������  �������.",110,120);
       Stringer.drawString("�  ������  ���������  �������  ��������� ������������ ���",100,140);
       g.setFont(new Font("Dialog",2,14));
       g.setColor(new Color(0,0,120));
       g.drawString("����������",525,140);
       g.drawString("������  �������������  ����������.",100,160);
     }
     if ((sh>=49)&&(sh<=64))
     {
       g.setColor(Color.black);
       g.setFont(new Font("Dialog",1,14));
       if (sh<=55) g.drawString("1.  ���������� ���������� ������ ������������� ����������.",110,180);
       else        g.drawString("1.  ���������� ���������� ������ ������������� ����������.",110,60);
     }
     if ((sh>=50)&&(sh<=55))
     {
       Stringer.drawString("����� ��������� ������� ����������� ���������� ",110,200);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("x = f ( x , u , t ) ,   x ( t_{ 0} ) = x_{ 0} ,  t \u2208 T = [ t_{ 0} , t_{ 1} ]",195,225);
       Stringer1.drawString("(1)",585,225);
       Stringer1.drawString(".",197,215);
     }
     if ((sh>=50)&&(sh<=101))
     {
       if ((sh==54)||(sh==55)||(sh==59)||(sh==84)) g.setColor(Color.red);
       else      //  g.setColor(Color.black);
       g.setColor(new Color(120,0,0));
       StringerForm.drawString("x = f ( x , u , t )",632,90);
       StringerForm.drawString("x ( t_{ 0} ) = x_{ 0}",632,120);
       StringerForm.drawString("t \u2208 T = [ t_{ 0} , t_{ 1} ]",632,150);
       StringerForm.drawString("(1)",805,120);
       StringerForm.drawString(".",636,80);
       g.setFont(new Font("Dialog",0,80));
       g.drawString("}",747,135);
       g.setColor(Color.white);
       g.drawString("}",745,135);
     }
      if ((sh>=51)&&(sh<=55))
      {
       g.setColor(Color.black);
       Stringer.drawString("��� ",100,250);
       Stringer.drawString("-   n -������  ���������  ;",150,250);
       Stringer.drawString("-   r -������  ����������  ;",150,270);
       Stringer.drawString("-   ������ ( ����� )  ;",150,290);
       Stringer.drawString("-   ���������  ������  �  ��������� ;",180,310);
       Stringer.drawString("-   ��������  ������  ������� ;",150,330);
       Stringer2.drawString("x",130,250);
       Stringer2.drawString("u",130,270);
       Stringer2.drawString("t",130,290);
       Stringer2.drawString("t_{ 0 } , x_{ 0 }",130,310);
       Stringer2.drawString("t_{ 1 }",130,330);
     }
      if ((sh>=52)&&(sh<=55))
      {
       g.setColor(Color.black);
       Stringer.drawString("����� ��������� ���������� �������� ����� ��, ��� � �������� ������: ���",110,350);
       Stringer.drawString("������� - ����������� r - ���������  �������,  ���������������  �������",100,370);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("u ( t ) \u2208 U  , t \u2208 T",290,390);
       Stringer1.drawString("(2)",585,390);
      }
      if ((sh>=52)&&(sh<=101))
     {
       if ((sh==55)||(sh==84)) g.setColor(Color.red);
       else      //  g.setColor(Color.black);
       g.setColor(new Color(120,0,0));
       StringerForm.drawString("u ( t ) \u2208 U  , t \u2208 T",632,180);
       StringerForm.drawString("(2)",805,180);
     }
      if ((sh>=53)&&(sh<=55))
      {
       g.setColor(Color.black);
       Stringer.drawString("�������� ����������� ���������� ������ ������������",110,410);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("I ( u ) = \u03C6 ( x ( t_{ 1} ) )    > min",270,430);
       g.drawLine(400,423,420,423);
       g.drawLine(400,424,420,424);
       Stringer1.drawString("(3)",585,430);
      }
     if ((sh>=53)&&(sh<=101))
      {
       if ((sh==54)||(sh==55)||(sh==60)||(sh==84)) g.setColor(Color.red);
       else       // g.setColor(Color.black);
       g.setColor(new Color(120,0,0));
       StringerForm.drawString("I(u) = \u03C6 (x ( t_{ 1} ))   > min",632,210);
       g.drawLine(750,203,768,203);
       g.drawLine(750,204,768,204);
       g.drawLine(750,205,768,205);
       StringerForm.drawString("(3)",805,210);
      }
     if ((sh>=54)&&(sh<=55))
      {
       g.setColor(Color.black);
       Stringer.drawString("�������  (3)  ������� ",110,450);
       g.setFont(new Font("Dialog",3,14));
       g.drawString("���������  ��������  �������� ",270,450);
       Stringer.drawString(", ������� ������",505,450);
       Stringer.drawString("�� ��������",100,470);
       Stringer.drawString("����������  �������  (1).",320,470);
       g.setColor(new Color(0,0,120));
       Stringer2.drawString("( ������������ )",190,470);
      }
     if (sh==55)
      {
       g.setColor(Color.black);
       Stringer.drawString("������ (1) - (3) ����������  ",100,490);
       Stringer.drawString("��  ������� - ���������� ���������� u_{ 0 }( t ) , t \u2208 T , � ��������������� ���",100,510);
       g.setColor(new Color(0,0,120));
       Stringer2.drawString("���������� ������� ������������� ����������.",285,490);
      }

     if ((sh>=56)&&(sh<=64))
      {
       g.setColor(Color.black);
       Stringer.drawString("����������   x_{ 0}( t )  ,  t \u2208 T ,  ����������",100,85);
       Stringer1.drawString("������������    �����������",380,85);
       Stringer1.drawString("�   �����������.",100,105);
      }
     if ((sh>=57)&&(sh<=64))
      {
       if (sh==61) g.setColor(Color.red);
       else g.setColor(new Color(0,0,120));
       Stringer2.drawString("���������:",110,125);
       if (sh==61) g.setColor(Color.red);
       else g.setColor(Color.black);
       Stringer.drawString("���   �����������   ������  ������  �����  ������������,  ���",200,125);
       Stringer.drawString(" ����������  �������  ",100,145);
       Stringer.drawString(".",470,145);
       Stringer2.drawString(",",418,145);
       Stringer2.drawString("f ( x, u, t ) , \u03C6 ( x ),",260,145);
       Stringer2.drawString("\u2202 f       \u2202 \u03C6",390,139);
       g.drawLine(385,140,412,140);
       g.drawLine(425,140,462,140);
       Stringer2.drawString("\u2202 x       \u2202 x",390,153);
      }
     if ((sh>=58)&&(sh<=74))
     {
       g.setColor(Color.black);
       g.setFont(new Font("Dialog",1,14));
       if (sh<=64) g.drawString("2.  �������  ����������  ��������  ��������.",110,180);
       else        g.drawString("2.  �������  ����������  ��������  ��������.",110,60);
     }
     if ((sh>=59)&&(sh<=64))
     {
       g.setColor(Color.black);
       Stringer.drawString("���������� ��� ���������� ���������� ",110,200);
       Stringer.drawString("t \u2208 T , � ��������������� �� ���������� ",100,220);
       Stringer.drawString("������� (1).",100,240);
       Stringer2.drawString("u ( t ) ,  u ( t ) = u ( t ) + \u2206 u ( t ),",400,200);
       Stringer2.drawString("x ( t ) ,  x ( t ) = x ( t ) + \u2206 x ( t ) , t \u2208 T ",385,220);
       g.drawLine(434,209,439,209);
       g.drawLine(452,189,457,189);
     }
     if ((sh>=60)&&(sh<=64))
     {
       g.setColor(Color.black);
       Stringer.drawString("������ ������� ��� ���������� �������� �������� (3). ",190,240);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("\u2206 I ( u ) = I ( u ) - I ( u ) = \u03C6 ( x ( t_{ 1} ) ) - \u03C6 ( x ( t_{ 1} ) )",190,270);
       Stringer1.drawString("(4)",585,270);
       g.drawLine(275,259,280,259);
       g.drawLine(380,259,385,259);
     }
     if ((sh>=61)&&(sh<=64))
     {
       g.setColor(Color.black);
       Stringer.drawString("�������� ��������� ������ ��������� ����� �������� � ��������� ����:",110,295);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("\u2206 I ( u ) = \u2206  x ' ( t_{ 1} ) ",170,327);
       Stringer1.drawString("\u2202\u03C6 ( x ( t_{ 1} ) )",310,317);
       Stringer1.drawString("\u2202x",340,337);
       Stringer1.drawString(" + o ( || \u2206 x ( t_{ 1} ) || )",400,327);
       Stringer1.drawString("(5)",585,327);
       g.drawLine(308,322,395,322);
     }
    if ((sh>=62)&&(sh<=64))
     {
       g.setColor(Color.black);
       Stringer.drawString("����������   ����������",110,355);
       Stringer.drawString("�������������",520,355);
       Stringer.drawString("����������������� ��������� :",100,375);
       Stringer2.drawString("\u2206 x ( t ) = x ( t ) - x ( t )   ,  t \u2208 T  ,",305,355);
       g.drawLine(368,344,373,344);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("\u2206 x = f ( x + \u2206 x , u , t ) - f ( x , u , t )  , \u2206 x ( t_{ 0 } ) = 0  , t \u2208 T",155,400);
       g.drawLine(362,389,367,389);
       Stringer1.drawString(".",173,390);
       Stringer1.drawString("(6)",585,400);
     }
    if ((sh>=63)&&(sh<=64))
     {
       g.setColor(Color.black);
       Stringer.drawString(", �������  �����  ��������  ���������  �������:",100,425);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("\u2206 x = ",105,460);
       Stringer1.drawString("\u2202f ( x , u , t )",148,448);
       Stringer1.drawString("\u2202x",180,469);
       Stringer1.drawString("\u2206 x + \u2206_{\u016B} f ( x , u , t ) +",235,460);
       Stringer1.drawString("\u2202\u2206_{\u016B} f ( x , u , t )",393,448);
       Stringer1.drawString("\u2202x",435,469);
       Stringer1.drawString("\u2206 x",500,460);
       Stringer1.drawString("+ o_{ 1} ( || \u2202 x || )",525,460);
       g.drawLine(145,454,230,454);
       g.drawLine(390,454,495,454);
       Stringer1.drawString("(7)",585,430);
     }
    if (sh==64)
     {
       g.setColor(Color.black);
       Stringer.drawString("�����  ���������� :",100,490);
       Stringer2.drawString("\u2206_{\u016B} f ( x , u , t ) = f ( x , u , t ) - f ( x , u , t ) ,",240,490);
       g.drawLine(381,479,386,479);
       Stringer2.drawString("\u2202 f",243,509);
       Stringer2.drawString("\u2202 x",242,525);
       g.setFont(new Font("Dialog",0,14));
       g.drawString("= {",266,515);
       g.drawString(",",320,515);
       g.drawString("i = 1 .. n ; j = 1 .. n }.",330,515);
       Stringer2.drawString("\u2202 f_{i}",291,507);
       Stringer2.drawString("\u2202 x_{ j}",290,525);
       g.drawLine(240,512,262,512);
       g.drawLine(287,512,312,512);
     }
    if ((sh>=65)&&(sh<=69))
      {
       g.setColor(Color.black);
       Stringer.drawString("������   n \u00D7 n -  ���������   �������   F ( t ),  t \u2208 T ,  - �������  ���������",110,80);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("F = AF  ,  F ( 0 ) = E",290,105);
       Stringer1.drawString(".",295,92);
       Stringer1.drawString("(8)",585,105);
     }
    if ((sh>=66)&&(sh<=69))
      {
       g.setColor(Color.black);
       Stringer.drawString(" ���    A = A ( t ) = ",100,135);
       Stringer2.drawString("\u2202f ( x ( t ), u ( t ), t )",220,126);
       Stringer2.drawString("\u2202x",270,144);
       g.drawLine(218,130,340,130);
       Stringer.drawString("E - ���������  ������������  n \u00D7 n  �������.",142,160);
     }
    if ((sh>=67)&&(sh<=69))
     {
       g.setColor(Color.black);
       Stringer.drawString("������������    �������������   ������   ����������������    ���������",110,180);
       Stringer.drawString("������������,  ���  ��������� (7) ������������  ����������  �������������",100,200);
       Stringer.drawString("���������:",100,220);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("\u2206 x ( t ) =    F ( t ) F^{ -1} ( \u03C4 ) \u2206_{\u016B} f ( x ( \u03C4 ) , u ( \u03C4 ) , \u03C4 ) d\u03C4  + ",180,240);
       Stringer1.drawString("+    F ( t ) F^{ -1} ( \u03C4 ) [",135,280);
       g.setFont(new Font("Dialog",0,20));
       g.drawString("\u222B",250,243);
       g.drawString("\u222B",150,283);
       g.setFont(new Font("Dialog",1,13));
       g.drawString("t",255,223);
       g.drawString("t",247,255);
       g.drawString("t",155,263);
       g.drawString("t",147,295);
       g.setFont(new Font("Dialog",1,9));
       g.drawString("0",252,258);
       g.drawString("0",152,298);
       g.drawLine(265,276,375,276);
       Stringer1.drawString("\u2202\u2206_{\u016B} f ( x , u , t )",270,270);
       Stringer1.drawString("\u2202x",310,290);
       Stringer1.drawString("\u2206 x",380,280);
       Stringer1.drawString("+ o_{ 1} ( || \u2206 x ( \u03C4 ) || ) ] d\u03C4",410,280);
     }
     if ((sh>=68)&&(sh<=69))
     {
       g.setColor(Color.black);
       Stringer.drawString("�������  ������  (5)  �����  ��������:",110,315);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("\u2206 I ( u ) = [",140,345);
       Stringer1.drawString("\u2202\u03C6 ( x ( t_{ 1} ) )",220,335);
       g.drawLine(215,340,310,340);
       Stringer1.drawString("\u2202x",249,354);
       Stringer1.drawString("] '     F ( t_{ 1} ) F^{ -1} ( t ) \u2206_{\u016B} f ( x , u , t ) dt  +",315,345);
       Stringer1.drawString("+ [",155,385);
       Stringer1.drawString("\u2202\u03C6 ( x ( t_{ 1} ) )",182,375);
       g.drawLine(176,381,272,381);
       Stringer1.drawString("\u2202x",212,395);
       Stringer1.drawString("] '     F ( t_{ 1} ) F^{ -1} ( t ) [",276,385);
       g.setFont(new Font("Dialog",0,20));
       g.drawString("\u222B",335,348);
       g.drawString("\u222B",295,388);
       g.setFont(new Font("Dialog",1,13));
       g.drawString("t",340,328);
       g.drawString("t",332,360);
       g.drawString("t",300,368);
       g.drawString("t",292,400);
       g.setFont(new Font("Dialog",1,9));
       g.drawString("1",345,331);
       g.drawString("1",305,371);
       g.drawString("0",337,363);
       g.drawString("0",297,403);
       Stringer1.drawString("\u2202\u2206_{\u016B} f ( x , u , t )",425,375);
       g.drawLine(420,381,530,381);
       Stringer1.drawString("\u2202x",465,395);
       Stringer1.drawString("\u2206 x +",535,385);
       Stringer1.drawString("+ o_{ 1} ( || \u2206 x ( t ) || ) ] dt  +  o ( || \u2206 x ( t_{ 1} ) || )",210,420);
       Stringer1.drawString("(9)",585,420);
     }
     if (sh==69)
     {
       g.setColor(Color.black);
       Stringer.drawString("���������",110,450);
       Stringer1.drawString("\u03C8 (t) = - [ F^{ -1} ( t ) ] ' F ' ( t_{ 1} )",205,455);
       Stringer1.drawString("\u2202\u03C6 ( x ( t_{ 1} ) )",397,445);
       g.drawLine(395,450,487,450);
       Stringer1.drawString("\u2202x",428,465);
       Stringer1.drawString("H ( x , \u03C8 , u , t ) = \u03C8 ' f ( x , u , t )",205,485);
       Stringer1.drawString("\u2206_{\u016B} H ( x , \u03C8 , u , t ) = H ( x , \u03C8 , u , t ) - H ( x , \u03C8 , u , t )",205,515);
       g.drawLine(416,504,421,504);
     }
     if ((sh>=70)&&(sh<=74))
     {
       g.setColor(Color.black);
       Stringer.drawString("�����  ��  ���������  (9)  �������  �������  �������  ����������",110,80);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("\u2206 I ( u ) = -     \u2206_{\u016B} H ( x , \u03C8 , u , t ) dt  +  \u03B7",225,115);
       g.setFont(new Font("Dialog",0,20));
       g.drawString("\u222B",303,118);
       g.setFont(new Font("Dialog",1,13));
       g.drawString("t",308,98);
       g.drawString("t",300,130);
       g.setFont(new Font("Dialog",1,9));
       g.drawString("1",313,101);
       g.drawString("0",305,133);
       Stringer1.drawString("(10)",585,115);
     }
     if ((sh>=71)&&(sh<=101))
     {
       if (sh==91) g.setColor(Color.red);
       else g.setColor(new Color(120,0,0));
       Stringer1.drawString("������� ����������",630,240);
       jCheckBox1.setVisible(true);
       jCheckBox1.repaint();
     }
     if ((sh>=71)&&(sh<=74))
     {
       g.setColor(Color.black);
       Stringer.drawString("�����",110,150);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("\u03B7 = \u03B7_{ 1} + \u03B7_{ 2} + \u03B7_{ 3}  ,",225,150);
       Stringer1.drawString("\u03B7_{ 1} = o ( || \u2206 x ( t_{ 1} ) || )  ,",225,180);
       Stringer1.drawString("\u03B7_{ 2} = -    \u2206 x '",225,215);
       Stringer1.drawString("\u2202\u2206_{\u016B} H ( x , \u03C8 , u , t )",320,204);
       Stringer1.drawString("\u2202x",378,225);
       g.drawLine(317,210,457,210);
       Stringer1.drawString("dt   ,",463,215);
       g.setFont(new Font("Dialog",0,20));
       g.drawString("\u222B",270,219);
       g.drawString("\u222B",270,269);
       g.setFont(new Font("Dialog",1,13));
       g.drawString("t",275,199);
       g.drawString("t",275,249);
       g.drawString("t",267,231);
       g.drawString("t",267,281);
       g.setFont(new Font("Dialog",1,9));
       g.drawString("1",280,202);
       g.drawString("1",280,252);
       g.drawString("0",272,234);
       g.drawString("0",272,284);
       Stringer1.drawString("\u03B7_{ 3} = -    \u03C8 ' ( t ) o_{ 1} ( || \u2206 x ( t ) || ) dt  .",225,265);
     }
     if ((sh>=72)&&(sh<=74))
     {
       g.setColor(Color.black);
       Stringer.drawString("�  ����  (8)  �������  \u03C8 ( t )  �������������   ���������",120,300);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("\u03C8 = - A' \u03C8  ,  \u03C8 ( t_{ 1} ) = - ",230,335);
       Stringer1.drawString("\u2202\u03C6 ( x ( t_{ 1} ) )",392,325);
       g.drawLine(390,330,482,330);
       Stringer1.drawString("\u2202x",423,345);
       Stringer1.drawString("(11)",585,335);
       Stringer1.drawString(".",234,324);
       Stringer1.drawString(",",495,333);
     }
     if ((sh>=73)&&(sh<=74))
     {
       g.setColor(Color.black);
       Stringer.drawString("�������  ����������",120,375);
       g.setFont(new Font("Dialog",3,14));
       g.drawString("�����������  ��������",270,375);
       Stringer.drawString("( �����  u ( t ) , t \u2208 T ) .",455,375);
       Stringer.drawString("����������  \u03C8_{ 1}, ... ,\u03C8_{ n} ������� \u03C8 ��������",100,395);
       g.setFont(new Font("Dialog",3,14));
       g.drawString("������������  �����������.",403,395);
     }
     if (sh==74)
     {
       g.setColor(Color.black);
       Stringer.drawString("������� H ( x , \u03C8 , u , t ) ������� ��������",100,415);
       g.setFont(new Font("Dialog",3,14));
       g.drawString("��������������.",390,415);
       Stringer.drawString("������������",524,415);
       Stringer.drawString("���������   ��������   ��������   ���������    (1)  , (11)   �  ����������   � ",100,435);
       Stringer.drawString("��������������  ���� :",100,455);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("x =",205,485);
       Stringer1.drawString("\u2202H",235,478);
       Stringer1.drawString("\u2202\u03C8",234,494);
       Stringer1.drawString(".",208,474);
       g.drawLine(230,480,260,480);
       Stringer1.drawString(",",267,483);
       Stringer1.drawString("\u03C8 = -",290,485);
       g.drawLine(329,480,359,480);
       Stringer1.drawString("\u2202H",334,478);
       Stringer1.drawString("\u2202x",334,494);
       Stringer1.drawString(".",294,474);
       Stringer1.drawString(",",364,483);
       Stringer1.drawString("H = \u03C8' f ( x , u , t ) .",387,485);
       Stringer1.drawString("(12)",585,485);
     }
     if ((sh>=74)&&(sh<=101))
     {
       if (sh==85)  g.setColor(Color.red);
       else g.setColor(new Color(120,0,0));
       Stringer1.drawString("x =",630,275);
       Stringer1.drawString("\u2202H",660,268);
       Stringer1.drawString("\u2202\u03C8",659,284);
       Stringer1.drawString(".",633,264);
       g.drawLine(655,270,685,270);
       Stringer1.drawString(",",692,273);
       Stringer1.drawString("\u03C8 = -",705,275);
       g.drawLine(744,270,774,270);
       Stringer1.drawString("\u2202H",749,268);
       Stringer1.drawString("\u2202x",749,284);
       Stringer1.drawString(".",709,264);
       Stringer1.drawString("H = \u03C8' f ( x , u , t ) .",630,315);
       Stringer1.drawString("(12)",800,295);
       g.setFont(new Font("Dialog",0,60));
       g.drawString("}",774,303);
       g.setColor(Color.white);
       g.drawString("}",772,303);
     }
     if ((sh>=75)&&(sh<=89))
     {
       g.setColor(Color.black);
       g.setFont(new Font("Dialog",1,14));
       g.drawString("3.  ����������  ��������.",110,60);
     }
     if ((sh>=76)&&(sh<=79))
     {
       g.setColor(Color.black);
       Stringer.drawString("��������  �����  ������  ������������  ����������, ���  �  ������������� ",110,85);
       Stringer.drawString("���������� ,  -  ���",100,105);
       g.setColor(new Color(0,0,120));
       Stringer2.drawString("�����  ��������.",240,105);
       g.setColor(Color.black);
       Stringer.drawString("������     ��������    ������������",370,105);
       Stringer.drawString("����������  �������������  ����������  �� ���  ��������.",100,125);
     }
     if ((sh>=77)&&(sh<=79))
     {
       g.setColor(Color.black);
       Stringer.drawString("����������  ��������  ������  ����  ����������",110,145);
       g.setFont(new Font("Dialog",3,14));
       g.drawString("����������  ��������� :",445,145);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("\u2206 u ( t ) = ",120,195);
       Stringer1.drawString("0 ,   t \u2209 [ \u03B8 - \u03B5 , \u03B8 + \u03B5 ]",207,180);
       Stringer1.drawString("v - u ( t ) ,   t \u2208 [ \u03B8 - \u03B5 , \u03B8 + \u03B5 ] , v \u2208 U , \u03B8 \u2208 [ t_{ 0} , t_{ 1} ] , \u03B5 \u2260 0",207,210);
       Stringer1.drawString("(13)",585,180);
       g.setFont(new Font("Dialog",0,50));
       g.drawString("{",190,203);
       g.setColor(Color.white);
       g.drawString("{",192,203);
     }
     if ((sh>=77)&&(sh<=101))
     {
       if ((sh==90)||(sh==93)) g.setColor(Color.red);
       else g.setColor(new Color(120,0,0));
       Stringer1.drawString("������� ����������",630,340);
       Stringer1.drawString("��������",680,360);
       jCheckBox2.setVisible(true);
       jCheckBox2.repaint();
     }
     if ((sh>=78)&&(sh<=79))
     {
       g.setColor(Color.black);
       Stringer.drawString("   �   ������������   ����������   ��������   ����   ����������  ������  ��",100,240);
       Stringer.drawString("[ t_{ 0} , t_{ 1} ]  ,  �������   ��    ����������    ��������    ������������   ��������",100,260);
       Stringer.drawString("������� ,  ��  �������  ��������  �������  ��  ���� :",100,280);
     }
     if (sh==79)
     {
       g.setColor(Color.black);
       g.drawLine(170,300,170,460);
       g.drawLine(167,310,170,300);
       g.drawLine(173,310,170,300);
       g.drawLine(160,450,570,450);
       g.drawLine(560,447,570,450);
       g.drawLine(560,453,570,450);
       Stringer1.drawString("\u2206u",142,317);
       Stringer1.drawString("t",570,465);
       Stringer1.drawString("0",155,465);
       g.setColor(Color.red);
       g.fillOval(200,447,6,6);
       g.fillOval(530,447,6,6);
       g.fillOval(318,447,6,6);
       g.fillOval(410,447,6,6);
       g.drawLine(203,449,320,449);
       g.drawLine(203,450,320,450);
       g.drawLine(413,449,533,449);
       g.drawLine(413,450,533,450);
       StringerForm.drawString("t_{ 0}",197,468);
       StringerForm.drawString("t_{ 1}",530,468);
       MP.RisIgVar(g,320,346,15,15);
       g.setColor(new Color(0,0,120));
       StringerForm.drawString("\u03B8 - \u03B5",305,470);
       StringerForm.drawString("\u03B8 + \u03B5",397,470);
       g.drawLine(367,447,367,453);
       StringerForm.drawString("\u03B8",362,443);
       for (i=0;i<=7;i++)
        { g.drawLine(321,445-i*13,321,437-i*13);
          g.drawLine(412,445-i*13,412,437-i*13);}

       g.setColor(new Color(150,0,60));
       g.setFont(new Font("Dialog",2,13));
       g.drawString("��  �������  ����������  ����������  ��������",220,510);
     }

    if ((sh>=80)&&(sh<=89))
     {
       g.setColor(Color.black);
       Stringer.drawString("���  �������  �����������  ���������� , ���  �����   \u03B5   ����������  x ( t ) ,",110,80);
       g.drawLine(580,69,585,69);
       Stringer.drawString("�����������  ����������  ��������� ,  ����  ����������  ��  x ( t ) :",100,100);
     }
    if ((sh>=81)&&(sh<=89))
     {
       g.setColor(new Color(0,0,120));
       g.drawLine(239,120,244,120);
       g.drawLine(239,121,244,121);
       Stringer1.drawString("(14)",585,135);
       Stringer1.drawString("|| x ( t ) - x ( t ) ||         K | \u03B5 |   ,   t \u2208 T  ,",225,133);
       Stringer.drawString("\u2264",346,133);
       Stringer.drawString("\u2264",346,134);
     }
     if ((sh>=81)&&(sh<=101))
     {
       if (sh==93) g.setColor(Color.red);
       else g.setColor(new Color(120,0,0));
       g.drawLine(644,375,649,375);
       g.drawLine(644,376,649,376);
       Stringer1.drawString("(14)",800,390);
       Stringer1.drawString("|| x ( t ) - x ( t ) ||    K | \u03B5 |",630,388);
       Stringer.drawString("\u2264",742,388);
       Stringer.drawString("\u2264",742,389);
     }
    if ((sh>=82)&&(sh<=89))
     {
       g.setColor(Color.black);
       Stringer.drawString("��  �� ����������� ",100,165);
       Stringer.drawString("dx",237,158);
       Stringer.drawString("dt",237,175);
       g.drawLine(236,161,251,161);
       g.drawLine(246,147,250,147);
       Stringer.drawString("��-��  ��������������  �������   v \u2208 U   �����  ������",260,165);
       Stringer.drawString("����������  ��",100,195);
       Stringer.drawString("dx",212,188);
       Stringer.drawString("dt",212,205);
       g.drawLine(211,191,226,191);
       Stringer.drawString(",  �������  ������� ,  ���",235,195);
       g.setColor(new Color(0,0,120));
       Stringer2.drawString("����������  ��������    -    ���",409,195);
       Stringer2.drawString("�������  �������� .",100,225);
     }
     if ((sh>=83)&&(sh<=101))
     {
       g.setColor(Color.black);
       g.setFont(new Font("Dialog",1,14));
       if (sh<=89) g.drawString("4.  �������  ���������.",110,255);
       else        g.drawString("4.  �������  ���������.",110,60);
     }
     if ((sh>=84)&&(sh<=89))
     {
       g.setColor(Color.red);
       Stringer.drawString("�����   u^{ 0}( t )   -   �����������   ����������   ����������   ������  (1) - (3).",110,285);
     }
     if ((sh>=85)&&(sh<=89))
     {
       g.setColor(Color.red);
       Stringer.drawString("�����  �����  �����  ����������  �  ��������������� ��� ����������  x^{ 0}( t ) ,",100,305);
       Stringer.drawString(" \u03C8^{ 0}( t )  ������� (12)",100,325);
     }
     if ((sh>=86)&&(sh<=89))
     {
       g.setColor(Color.red);
       Stringer.drawString("������������   �������   ���������   ���������    (�.�.",248,325);
       Stringer.drawString("�����������  �������  ���������) :",100,345);
       Stringer1.drawString("H ( x ( t ) , \u03C8 ( t ) , u ( t ) , t ) = max H ( x ( t ) , \u03C8 ( t ) , u ( t ) , t )",155,375);
       g.setFont(new Font("Dialog",1,12));
       g.drawString("u \u2208 U",363,388);
     }
     if ((sh>=87)&&(sh<=89))
     {
       g.setColor(new Color(0,0,120));
       Stringer2.drawString("�������������� :",110,405);
     }
     if ((sh>=88)&&(sh<=89))
     {
       g.setColor(Color.black);
       Stringer.drawString("�����������,  ���  �������  �������,  �.�.  ���  ���������  \u03B8  \u2208  [ t_{ 0} , t_{ 1} ]",110,425);
       Stringer.drawString("�����������  ����������� :",100,445);
     }
     if (sh==89)
     {
       g.setColor(Color.black);
       Stringer3.drawString("H ( x^{ 0}( \u03B8 ) , \u03C8^{ 0}( \u03B8 ) , v , \u03B8 )  -  H ( x^{ 0}( \u03B8 ) , \u03C8^{ 0}( \u03B8 ) , u^{ 0}( \u03B8 ) , \u03B8 ) =",155,480);
       Stringer3.drawString("= \u2206_{ \u016B} H ( x^{ 0}( \u03B8 ) , \u03C8^{ 0}( \u03B8 ) , u^{ 0}( \u03B8 ) , \u03B8 ) = \u03B1 > 0",210,510);
     }
     if ((sh>=90)&&(sh<=101))
     {
       g.setColor(Color.black);
       Stringer.drawString("������������   ����������   u^{ 0} ( t )   ����������   ���������",110,80);
     }
    if ((sh>=91)&&(sh<=101))
     {
       g.setColor(Color.black);
       Stringer.drawString("�   ��������",535,80);
       Stringer.drawString("����������  ��������  �������� :",100,100);
     }
     if ((sh>=92)&&(sh<=101))
     {
       if (sh==95) g.setColor(Color.red);
       else g.setColor(Color.black);
       Stringer3.drawString("\u2206 I ( u^{ 0} ) = I ( u^{ 0} + \u2206 u )  -  I ( u^{ 0} ) = -    \u2206_{ v} H ( x^{ 0} , \u03C8^{ 0} , u^{ 0} , t ) dt  + \u03B7",115,135);
       g.setFont(new Font("Dialog",0,20));
       g.drawString("\u222B",363,137);
       g.setFont(new Font("Dialog",1,13));
       g.drawString("\u03B8 - \u03B5",353,151);
       g.drawString("\u03B8 + \u03B5",353,116);
       Stringer3.drawString("(15)",595,135);
     }
     if ((sh>=93)&&(sh<=101))
     {
       g.setColor(Color.black);
       Stringer.drawString("�  ������  �������  ����������  ��������  �  ��������  (14)  �������� :",100,170);
       g.setFont(new Font("Dialog",0,20));
       g.drawString("\u222B",110,212);
       g.setFont(new Font("Dialog",1,13));
       g.drawString("\u03B8 - \u03B5",102,228);
       g.drawString("\u03B8 + \u03B5",102,191);
       Stringer3.drawString("\u2206_{ v} H ( x^{ 0} , \u03C8^{ 0} , u^{ 0} , t ) dt  =  2 \u03B5 H ( x^{ 0}( \u03B8 ) , \u03C8^{ 0}( \u03B8 ) , u^{ 0}( \u03B8 ) , \u03B8 ) + o_{ 2} ( \u03B5 ) =",120,210);
       Stringer3.drawString("= 2 \u03B5 \u03B1 + o_{ 2} ( \u03B5 )  ,",295,240);
     }
     if ((sh>=94)&&(sh<=101))
     {
       g.setColor(Color.black);
       Stringer.drawString("���  ����",100,270);
       Stringer3.drawString("o_{ 2} ( \u03B5 )      K_{ 2} \u03B5^{ 2} ;      \u03B7_{ 1}      K_{ 3} \u03B5^{ 2} ;     \u03B7_{ 2}      K_{ 4} \u03B5^{ 2} ;     \u03B7_{ 3}      K_{ 5} \u03B5^{ 2}",180,270);
       Stringer.drawString("\u2264",235,270);
       Stringer.drawString("\u2264",236,270);
       Stringer.drawString("\u2264",346,270);
       Stringer.drawString("\u2264",347,270);
       Stringer.drawString("\u2264",455,270);
       Stringer.drawString("\u2264",456,270);
       Stringer.drawString("\u2264",565,270);
       Stringer.drawString("\u2264",566,270);
       Stringer.drawString("���  ����",100,270);
     }
    if ((sh>=95)&&(sh<=101))
     {
       g.setColor(Color.black);
       Stringer.drawString("���������  ���  ������  � (15),  ��������  �  �����������  :",100,300);
       Stringer3.drawString("\u2206 I ( u^{ 0} )      - 2 \u03B5 \u03B1  +  K_{ 6} \u03B5^{ 2}  ,",130,330);
       Stringer.drawString("\u2264",197,330);
       Stringer.drawString("\u2264",198,330);
     }
    if ((sh>=96)&&(sh<=101))
     {
       g.setColor(Color.black);
       Stringer.drawString("�������  ���  ����������  �����  \u03B5  >  0",350,330);
       Stringer.drawString("���������  ��� :",100,360);
       Stringer3.drawString("\u2206 I ( u^{ 0} )  <  0  .",225,360);
     }
    if ((sh>=97)&&(sh<=101))
     {
       g.setColor(Color.black);
       Stringer.drawString("������   �����������   ������������",352,360);
       Stringer.drawString("�����������  ������������� :",100,390);
       Stringer3.drawString("\u2206 I ( u^{ 0} )       0  .",340,390);
       Stringer.drawString("\u2265",408,390);
       Stringer.drawString("\u2265",409,390);
     }
    if ((sh>=98)&&(sh<=101))
     {
       g.setColor(new Color(0,0,120));
       Stringer2.drawString("�������   �������� !",465,390);
     }
     if ((sh>=99)&&(sh<=101))
      {
        g.setColor(new Color(0,0,120));
        Stringer3.drawString("��������� :",110,420);
      }
     if ((sh>=100)&&(sh<=101))
      {
        g.setColor(Color.red);
        Stringer.drawString("�������    ���������   ��������   �����������    ��������",215,420);
        Stringer.drawString("�������������,  ��  �������  ����������� , ",100,440);
      }
      if (sh==101)
      {
        g.setColor(new Color(0,0,0));
        Stringer.drawString("�.�.   ��    ������    ����������",410,440);
        Stringer.drawString("����������  ,     ���������������     ��������      ���������    (  ����������",100,460);
        Stringer.drawString("���������� ) ,  ��������  ����������� !",100,480);
      }
      if ((sh>=102)&&(sh<=133))
     {
       g.setColor(Color.red);
       g.setFont(new Font("Dialog",1,16));
       g.drawString("�����������  �������  �������������",205,30);
       g.setColor(Color.black);
       g.drawLine(200,35,520,35);
       g.drawLine(200,34,520,34);
     }
     if ((sh>=103)&&(sh<=126))
     {
       g.setColor(Color.black);
       g.setFont(new Font("Dialog",1,14));
       g.drawString("1.  �������   ������   �������������   ����������   �������",110,60);
       g.drawString("�������������   ����������������.",130,80);
     }
     if ((sh>=104)&&(sh<=112))
     {
       g.setColor(Color.black);
       Stringer.drawString("������  �������������  ����������  ��������  �  ���������  �����:",110,105);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("x = f ( x , u , t )  ,    x ( \u03C4 ) = x  ,    u ( t ) \u2208 U  ,    t \u2208 T_{ \u03C4}= [ \u03C4 , t_{ 1} ]  ,",140,135);
       Stringer1.drawString(".",143,125);
       Stringer1.drawString("I ( u ) = \u03C6 ( x ( t_{ 1} ) )    > min  ,",250,165);
       g.drawLine(380,158,400,158);
       g.drawLine(380,159,400,159);
       Stringer1.drawString("(1)",585,150);
     }
     if ((sh>=104)&&(sh<=133))
     {
       if ((sh==108)||(sh==112)) g.setColor(Color.red);
       else      //  g.setColor(Color.black);
       g.setColor(new Color(120,0,0));
       g.setFont(new Font("Dialog",0,100));
       g.drawString("}",794,154);
       g.setColor(Color.white);
       g.drawString("}",792,154);
       if ((sh==108)||(sh==112)) g.setColor(Color.red);
       else      //  g.setColor(Color.black);
       g.setColor(new Color(120,0,0));
       StringerForm.drawString("x = f ( x , u , t )",632,90);
       StringerForm.drawString("x ( \u03C4 ) = x , u ( t ) \u2208 U ,",632,120);
       StringerForm.drawString("t \u2208 T_{ \u03C4} = [ \u03C4 , t_{ 1} ]",632,150);
       StringerForm.drawString("I(u) = \u03C6 (x ( t_{ 1} ))   > min",632,180);
       g.drawLine(750,173,768,173);
       g.drawLine(750,174,768,174);
       g.drawLine(750,175,768,175);
       StringerForm.drawString("(1)",805,77);
       StringerForm.drawString(".",636,80);
     }
     if ((sh>=105)&&(sh<=112))
     {
       g.setColor(Color.black);
       Stringer.drawString("���������  ��  ���������� :  ����������  \u03C4   �   n - ����������  x.",110,195);
     }
     if ((sh>=106)&&(sh<=112))
     {
       g.setColor(Color.black);
       Stringer.drawString("�����������  ��������  ��������  ��������  I ( u )  ��������� �����  B ( x , \u03C4 )",100,215);
       g.setColor(new Color(0,0,120));
       Stringer2.drawString("( �������  �������� ).",100,235);
     }
     if ((sh>=107)&&(sh<=112))
     {
       g.setColor(Color.black);
       Stringer.drawString("���   ���������   ���������   ��������   ��   �������",265,235);
       Stringer.drawString("[ \u03C4 , \u03C4 + \u2206 \u03C4 ] ,  \u2206 \u03C4 > 0 ,  �������  ����������  u ( t ) = v ( t ) , t \u2208 [ \u03C4 , \u2206 \u03C4 ] .",100,255);
     }
     if ((sh>=108)&&(sh<=112))
     {
       g.setColor(Color.black);
       Stringer.drawString("���   ���������   �����   ����������   �������  (1)   ��  ���������   x ( \u03C4 ) = x",110,275);
       Stringer.drawString("��������  �  ��������� :",100,295);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("x ( \u03C4 + \u2206 \u03C4 ) = x ( \u03C4 )  +  \u2206 \u03C4 f ( x ( \u03C4 ) , v ( \u03C4 ) , \u03C4 )  +  o ( \u2206 \u03C4 )",160,320);
       Stringer1.drawString("(2)",585,320);
     }
     if ((sh>=109)&&(sh<=112))
     {
       g.setColor(Color.black);
       Stringer.drawString("����������� ,   ���   �   �������    t = \u03C4 + \u2206 \u03C4     ��   ���������    x ( \u03C4 + \u2206 \u03C4 )",110,345);
       Stringer.drawString("�������   (1)   �����������   �   �������    u ( t ) = u ( t | x ( \u03C4 + \u2206 \u03C4) , \u03C4 + \u2206 \u03C4 ) ,",100,365);
       Stringer.drawString("t \u2208 [ \u03C4 + \u2206 \u03C4 , t_{ 1} ] ,   �����������  ������� .",100,385);
     }
     if ((sh>=110)&&(sh<=112))
     {
       g.setColor(Color.black);
       Stringer.drawString("��������  �����������  �������  ��������  ��������  ��������  ���  ����",110,405);
       Stringer.drawString("���������  ��������  B (  x ( \u03C4 + \u2206 \u03C4) , \u03C4 + \u2206 \u03C4 ) .",100,425);
     }
     if ((sh>=111)&&(sh<=112))
     {
       g.setColor(Color.black);
       Stringer.drawString("�����  ������� :",415,425);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("B ( x ( \u03C4 + \u2206 \u03C4 ) , \u03C4 + \u2206 \u03C4 ) )      B ( x , \u03C4 )",225,455);
       Stringer.drawString("\u2264",406,455);
       Stringer.drawString("\u2264",406,456);
       Stringer1.drawString("(3)",585,455);
     }
     if ((sh>=111)&&(sh<=133))
     {
       if (sh==113) g.setColor(Color.red);
       else      //  g.setColor(Color.black);
       g.setColor(new Color(120,0,0));
       StringerForm.drawString("B(x( \u03C4 + \u2206\u03C4),\u03C4 + \u2206\u03C4))   B(x,\u03C4)",630,225);
       Stringer.drawString("\u2264",774,225);
       Stringer.drawString("\u2264",774,226);
       StringerForm.drawString("(3)",805,205);
     }

     if (sh==112)
     {
       g.setColor(Color.black);
       Stringer.drawString("����  ��  �  ��������  v ( t ) , t \u2208 [ \u03C4 , \u03C4 + \u2206 \u03C4 ] ,  �����   �������   ������������",110,475);
       Stringer.drawString("����������   u ( t | x , \u03C4 )  �  ������  (1) ,  �� ,  �������� : ",100,495);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("B ( x^{ 0} ( \u03C4 + \u2206 \u03C4 ) , \u03C4 + \u2206 \u03C4 ) )  =  B ( x , \u03C4 )",220,525);
       Stringer1.drawString("(4)",585,525);
     }

     if ((sh>=112)&&(sh<=133))
     {
       if (sh==113) g.setColor(Color.red);
       else      //  g.setColor(Color.black);
       g.setColor(new Color(120,0,0));
       StringerForm.drawString("B(x^{ 0}(\u03C4 + \u2206\u03C4),\u03C4 + \u2206\u03C4))=B(x,\u03C4)",630,270);
       StringerForm.drawString("(4)",805,250);
     }
     if ((sh>=113)&&(sh<=121))
     {
       g.setColor(Color.black);
       Stringer.drawString("����������� ,  ���   B ( x , \u03C4 ) \u2208 C^{ (1)} .  �����  ��  (3)  �  (4)  ������� :",110,105);
     }
     if ((sh>=114)&&(sh<=121))
     {
       g.setColor(new Color(0,0,120));
       g.fillOval(101,131,6,6);
       Stringer1.drawString("B ( x , \u03C4 )  +  ",110,140);
       g.drawLine(195,135,270,135);
       Stringer1.drawString("\u2202 B ( x , \u03C4 )",198,131);
       Stringer1.drawString("\u2202 \u03C4",221,150);
       Stringer1.drawString("\u2206 \u03C4  +",275,140);
       g.drawLine(322,135,404,135);
       Stringer1.drawString("\u2202 B ' ( x , \u03C4 )",325,131);
       Stringer1.drawString("\u2202 x",352,150);
       Stringer1.drawString("f ( x , v ( \u03C4 ) , \u03C4 ) \u2206 \u03C4  +  o ( \u03C4 )",410,140);
       Stringer.drawString("\u2264",605,140);
       Stringer.drawString("\u2264",605,141);
       Stringer.drawString("\u2264",312,177);
       Stringer.drawString("\u2264",312,178);
       Stringer1.drawString("B ( x , \u03C4 )  ,",330,178);
       Stringer1.drawString("(5)",585,178);
     }
     if ((sh>=115)&&(sh<=121))
     {
       g.setColor(new Color(0,0,120));
       g.fillOval(101,131+75,6,6);
       Stringer1.drawString("B ( x , \u03C4 )  +  ",110,140+75);
       g.drawLine(195,135+75,270,135+75);
       Stringer1.drawString("\u2202 B ( x , \u03C4 )",198,131+75);
       Stringer1.drawString("\u2202 \u03C4",221,150+75);
       Stringer1.drawString("\u2206 \u03C4  +",275,140+75);
       g.drawLine(322,135+75,404,135+75);
       Stringer1.drawString("\u2202 B ' ( x , \u03C4 )",325,131+75);
       Stringer1.drawString("\u2202 x",352,150+75);
       Stringer1.drawString("f ( x , u^{ 0}( \u03C4 ) , \u03C4 ) \u2206 \u03C4  +  o ( \u03C4 ) =",410,140+75);
       Stringer1.drawString("=   B ( x , \u03C4 )  .",312,178+75);
       Stringer1.drawString("(6)",585,178+75);
     }
     if ((sh>=116)&&(sh<=121))
     {
       g.setColor(Color.black);
       Stringer.drawString("��������  ���  �����   ��  B ( x , \u03C4 )  �  ��������  ��  \u2206 \u03C4 ,  ���",110,280);
       Stringer3.drawString("\u2206 \u03C4       > 0 ,",530,280);
       g.drawLine(563,274,583,274);
       g.drawLine(563,275,583,275);
       Stringer.drawString("�������",100,300);
       g.setColor(Color.red);
       Stringer3.drawString("���������  �������� :",175,300);
     }
     if ((sh>=117)&&(sh<=121))
     {
       g.setColor(new Color(0,0,120));
       g.drawLine(193,330,200,330);
       g.drawLine(193,329,200,329);
       g.drawLine(207,330,282,330);
       Stringer1.drawString("\u2202 B ( x , \u03C4 )",210,326);
       Stringer1.drawString("\u2202 \u03C4",235,345);
       Stringer1.drawString("=   min ",295,335);
       g.drawLine(352,330,435,330);
       Stringer1.drawString("\u2202 B ' ( x , \u03C4 )",355,326);
       Stringer1.drawString("\u2202 x",384,345);
       Stringer1.drawString("f ( x , v , \u03C4 )",445,335);
       Stringer1.drawString("(7)",585,335);
       g.setFont(new Font("DIalog",3,12));
       g.drawString("v \u2208 U",318,347);
     }
     if ((sh>=117)&&(sh<=133))
     {
       if ((sh==91)||(sh==128)) g.setColor(Color.red);
       else g.setColor(new Color(120,0,0));
       Stringer1.drawString("��������� ��������",630,300);
       jCheckBox3.setVisible(true);
       jCheckBox3.repaint();
     }
     if ((sh>=118)&&(sh<=121))
     {
       g.setColor(Color.black);
       Stringer.drawString("���  �������  ���������  ��  �����������   �������  ��������  ����������",110,375);
       Stringer.drawString("���������  ���������  ������� :",100,395);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("B ( x , t_{ 1} )  =  \u03C6 ( x )",290,420);
       Stringer1.drawString("(8)",585,420);
     }
     if ((sh>=118)&&(sh<=133))
     {
       g.setColor(new Color(120,0,0));
       StringerForm.drawString("B ( x , t_{ 1} )  =  \u03C6 ( x )",630,330);
       StringerForm.drawString("(8)",805,330);
     }
     if ((sh>=119)&&(sh<=121))
     {
       g.setColor(new Color(0,0,120));
       Stringer2.drawString(" ����� ����� ��������� ��������� ���������� � ���������� �������� :",100,450);
     }
     if ((sh>=120)&&(sh<=121))
     {
       g.setColor(Color.black);
       Stringer.drawString("����  u^{ 0} ( t ) ,  x^{ 0} ( t ) ,  \u03C8^{ 0} ( t ) ,  t \u2208 T ,  -  �����������   �������   ��������",110,470);
       Stringer.drawString("�  �����������  ������ ,  �  B ( x , \u03C4 ) \u2208 C^{ (2)}  -  �������  ���������  ��������,",100,490);
     }
     if (sh==121)
     {
       g.setColor(Color.black);
       Stringer.drawString("��",100,510);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("\u03C8^{ 0} ( t )  =",235,520);
       g.drawLine(307,514,315,514);
       g.drawLine(307,515,315,515);
       g.drawLine(322,515,432,515);
       Stringer1.drawString("\u2202 B ( x^{ 0} ( t ) , t )",324,512);
       Stringer1.drawString("\u2202 x",366,530);
       Stringer1.drawString(",   t \u2208 T .",440,518);
       Stringer1.drawString("(9)",585,518);
     }
     if ((sh>=121)&&(sh<=126))
     {
       if ((sh==122)||(sh==125)) g.setColor(Color.red);
       else g.setColor(new Color(120,0,0));
       StringerForm.drawString("\u03C8^{ 0}( t ) = -",630,365);
       g.drawLine(702,360,790,360);
       StringerForm.drawString("\u2202B (x^{ 0}(t) , t)",704,357);
       StringerForm.drawString("\u2202x",740,375);
       StringerForm.drawString("(9)",805,365);
     }
     if ((sh>=122)&&(sh<=126))
     {
       g.setColor(Color.black);
       Stringer.drawString(" ������� (9) ���������  ����  ���������",100,105);
       g.setColor(new Color(0,0,120));
       Stringer2.drawString("��������������  �������������",386,105);
       Stringer2.drawString("��������  ��������� :",100,125);
     }
     if ((sh>=123)&&(sh<=126))
     {
       g.setColor(Color.black);
       Stringer.drawString("��������  �����  ������  �������  B ( x , t ).",115,360);
       g.setColor(new Color(0,0,120));
       Stringer3.drawString("1.",100,360);
       if (sh==123) g.setColor(new Color(0,0,120));
       else         g.setColor(new Color(157, 187, 255));
      //  g.setColor(new Color(120,120,120));
       g.fillOval(290+30*2-3,300-30*2-3,6,6);
       MP.paintLine(g,1);
       MP.paintLine(g,2);
       MP.paintLine(g,3);
     }
     if ((sh>=124)&&(sh<=126))
     {
       g.setColor(new Color(0,0,120));
       Stringer3.drawString("2.",100,380);
       g.setColor(Color.black);
       Stringer.drawString("�������  �������� ���������  �������  ��������  B( x , t )  �  ����� x^{ 0}( t ).",115,380);
       if (sh==124)   g.setColor(Color.red);
       else           g.setColor(Color.black);
       g.drawLine(408,248,471,279);
       g.drawLine(408,249,471,280);
       g.drawLine(471,280,456,277);
       g.drawLine(471,280,460,270);
       Stringer3.drawString("grad B ( x^{ 0}( t ) , t )",438,300);
       g.setColor(Color.red);
       g.fillOval(405,245,6,6);
       g.setColor(Color.black);
       g.drawLine(395,273,395+26,273-50);
       if (sh==126) g.drawLine(322,248,339,213);

     }
     if ((sh>=125)&&(sh<=126))
     {
       g.setColor(new Color(0,0,120));
       Stringer3.drawString("3.",100,400);
       g.setColor(Color.black);
       Stringer.drawString("��������  \u03C8^{ 0}( t ).  ��  ��������  (9)  ���  �����  ��������  �������������",115,400);
       Stringer.drawString("�������  ��������  B ( x , t ) �  �����  x^{ 0} ( t ).",115,420);
       if (sh==125)   g.setColor(Color.red);
       else           g.setColor(Color.black);
       g.drawLine(408,248,340,214);
       g.drawLine(408,249,340,215);
       g.drawLine(340,215,351,226);
       g.drawLine(340,214,356,218);
       Stringer3.drawString("\u03C8^{ 0}( t )",326,210);
       g.setColor(Color.red);
       g.fillOval(405,245,6,6);
     }
     if (sh==126)
     {
       g.setColor(new Color(0,0,120));
       Stringer3.drawString("4.",100,440);
       g.setColor(Color.red);
       Stringer.drawString("� ������  ������  t  ����������� ����������  u^{ 0} ( t ) ����������  �������",115,440);
       Stringer.drawString("��������   f ( x^{ 0} ( t ) , u^{ 0} ( t ) , t ) ,  �������   ������������   ��������  ��",115,460);
       Stringer.drawString("�����������  \u03C8^{ 0} ( t ). ",115,480);
       g.setColor(Color.red);
       g.drawLine(408,248,322,248);
       g.drawLine(408,249,322,249);
       g.drawLine(322,248,335,244);
       g.drawLine(322,249,335,253);
       Stringer3.drawString("f(x^{ 0}(t),u^{ 0}(t),t)",280,270);
       g.setColor(Color.red);
       g.fillOval(405,245,6,6);
     }
     if ((sh>=127)&&(sh<=133))
     {
       g.setColor(Color.black);
       g.setFont(new Font("Dialog",1,14));
       g.drawString("2.  �����������  �������  �������������.",110,60);
     }
     if ((sh>=128)&&(sh<=133))
     {
       g.setColor(Color.black);
       Stringer.drawString("�����   B ( x , t )  -  �������   �������   ���������   ��������   �   �������",110,90);
       Stringer.drawString("�������� :",100,110);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("B ( x , t_{ 1} )  =  \u03C6 ( x )  +  \u03BB ' g ( x )        ( \u03BB      0 )  ,",220,120);
       Stringer.drawString("\u2264",494,120);
       Stringer.drawString("\u2264",494,121);
     }
     if ((sh>=129)&&(sh<=133))
     {
       g.setColor(Color.black);
       Stringer.drawString("u ( t )  -  ���  �����  ����������  ,  ���������������  ������� :",110,150);
       g.setColor(new Color(0,0,120));
       g.drawLine(140,180,227,180);
       Stringer1.drawString("\u2202 B ' ( x , t )",143,177);
       Stringer1.drawString("\u2202 x",172,195);
       Stringer1.drawString("f ( x , u ( x , t ) , t )  =  min",233,185);
       g.drawLine(412,180,499,180);
       Stringer1.drawString("\u2202 B ' ( x , t )",415,177);
       Stringer1.drawString("\u2202 x",444,195);
       Stringer1.drawString("f ( x , u  , t ) .",505,185);
       g.setFont(new Font("DIalog",3,12));
       g.drawString("u \u2208 U",380,198);
     }
     if ((sh>=130)&&(sh<=133))
     {
       g.setColor(Color.red);
       Stringer.drawString("����  ���������",110,225);
       Stringer3.drawString("x  =  f ( x , u ( x , t ) , t ) ,    x ( t_{ 0} )  =  x_{ 0} ,",235,225);
       Stringer3.drawString(".",238,215);
       Stringer.drawString("�����  �������",512,225);
       Stringer3.drawString("x ( t ) ,  t \u2208 T ,",100,245);
     }
     if ((sh>=131)&&(sh<=133))
     {
       g.setColor(Color.red);
       Stringer.drawString("�����   ��������   �������",201,245);
       Stringer3.drawString("u ( t )  =  u ( x ( t ) , t )",395,245);
       Stringer.drawString("������� -",559,245);
       Stringer.drawString("- ����������  �",100,265);
       Stringer1.drawString("g ( x ( t_{ 1} ) )      0 ,    \u03BB ' g ( x ( t_{ 1} ) ) = 0 ,",240,285);
       Stringer.drawString("\u2264",323,285);
       Stringer.drawString("\u2264",323,286);
     }
     if ((sh>=132)&&(sh<=133))
     {
       g.setColor(new Color(0,0,120));
       Stringer3.drawString("�����������",365,315);
       g.setColor(Color.red);
       Stringer.drawString("�����   ����������   u ( t )   ��������",100,315);
       Stringer.drawString("�   ��������   ������",483,315);
       Stringer.drawString("�������������  ���������� :",100,335);
     }
     if (sh==133)
     {
       g.setColor(new Color(0,0,0));
       Stringer1.drawString("I ( u ) = \u03C6 ( x ( t_{ 1} ) )     > min ,   x = f ( x , u , t ) ,",200,360);
       Stringer1.drawString(".",411,350);
       g.drawLine(335,354,355,354);
       g.drawLine(335,353,355,353);
       Stringer1.drawString("x ( t_{ 0} ) = x_{ 0} ,   u ( t ) \u2208 U ,   t \u2208 T ,   g ( x (t_{ 1} ) )      0.",185,390);
       Stringer.drawString("\u2264",500,390);
       Stringer.drawString("\u2264",500,391);
     }
     if ((sh>=134)&&(sh<=174))
     {
       g.setColor(Color.red);
       g.setFont(new Font("Dialog",1,16));
       g.drawString("�������  �����������������",242,30);
       g.setColor(Color.black);
       g.drawLine(237,35,485,35);
       g.drawLine(237,34,485,34);
     }
     if ((sh>=135)&&(sh<=146))
     {
       g.setColor(Color.black);
       Stringer.drawString("�������   �������������   ���   �������   ��������  ����������  ����������",110,60);
       Stringer.drawString("����������",100,80);
       Stringer1.drawString("���������  �����������������.",190,80);
     }
     if ((sh>=136)&&(sh<=146))
     {
       g.setColor(Color.black);
       Stringer.drawString("�   ������   ���������   ��   �����   �������������   ������   ������������",110,105);
       Stringer.drawString("����������,  ����������",100,125);
       Stringer.drawString("��  ������  �����  ����������.",100,145);
       g.setColor(new Color(0,0,120));
       Stringer2.drawString("�����������   ����   ���������   �  �����������",290,125);
     }
     if ((sh>=137)&&(sh<=146))
     {
       g.setColor(Color.black);
       Stringer.drawString("( �����������    �������    �����    ������",335,145);
       Stringer.drawString("�����������  �  ��  �����  �����  ���������� ).",100,165);
     }
     if ((sh>=138)&&(sh<=155))
     {
       g.setColor(Color.black);
       g.setFont(new Font("Dialog",1,14));
       if (sh<=146) g.drawString("1.  �����  ������  �������������  ����������.",110,195);
       else         g.drawString("1.  �����  ������  �������������  ����������.",110,60);
     }
     if ((sh>=139)&&(sh<=146))
     {
       g.setColor(Color.black);
       Stringer.drawString("���  �  �  ��������  ������  ���������������  �������  ���������� :",110,225);
     }
     if ((sh>=139)&&(sh<=146))
     {
       g.setColor(Color.black);
       Stringer.drawString("���  �  �  ��������  ������  ���������������  �������  ���������� :",110,225);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("x = f ( x , u , t ) ,    x ( t_{ 0} ) = x_{ 0} ,    t \u2208 T = [ t_{ 0} , t_{ 1} ] ,    u ( t ) \u2208 U .",145,255);
       Stringer1.drawString(".",148,245);
       Stringer1.drawString("(1)",595,255);
     }
     if ((sh>=139)&&(sh<=174))
     {
       if ((sh==141)||(sh==154)||(sh==162)||(sh==164)) g.setColor(Color.red);
       else
       g.setColor(new Color(120,0,0));
       StringerForm.drawString("x = f ( x , u , t )",632,90);
       StringerForm.drawString("x ( t_{ 0} ) = x_{0}",632,120);
       StringerForm.drawString("t \u2208 T = [ t_{ 0} , t_{ 1} ]",632,150);
       StringerForm.drawString("u ( t ) \u2208 U ",632,180);
       StringerForm.drawString("(1)",805,135);
       StringerForm.drawString(".",636,80);
       g.setFont(new Font("Dialog",0,100));
       g.drawString("}",755,154);
       g.setColor(Color.white);
       g.drawString("}",753,154);
     }
     if ((sh>=140)&&(sh<=146))
     {
       g.setColor(Color.black);
       Stringer.drawString("�����",110,285);
       Stringer3.drawString("\u03C6_{ i} ( x ) ,  i = 0 .. q ,",161,285);
       Stringer.drawString("- ������������  �������,  ������������  ��  R_{ n}.",288,285);
     }
     if ((sh>=141)&&(sh<=146))
     {
       g.setColor(Color.black);
       Stringer1.drawString("�����������    ������������",110,315);
       Stringer.drawString("�����   ��������   �����   ���������",365,315);
       Stringer.drawString("����������  u ( t ) , t \u2208 T ,  �  ���������������  ��� ����������  x ( t ) , t \u2208 T ,",100,335);
       Stringer.drawString("�������  (1) ,",100,355);
     }
     if ((sh>=142)&&(sh<=146))
     {
       g.setColor(Color.black);
       Stringer.drawString("�������  �������������  ������������ :",205,355);
     }
     if ((sh>=143)&&(sh<=146))
     {
       g.setColor(Color.red);
       Stringer3.drawString("- ����  ����������� :",105,390);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("I_{ i} ( u )  =  \u03C6_{ i} ( x ( t_{ 1} ) )      0 ,  i = 1 .. p .",290,390);
       Stringer.drawString("\u2264",449,389);
       Stringer.drawString("\u2264",449,390);
       Stringer1.drawString("(2)",595,390);
     }
     if ((sh>=143)&&(sh<=174))
     {
       if ((sh==154)||(sh==163)||(sh==164)) g.setColor(Color.red);
       else
       g.setColor(new Color(120,0,0));
       StringerForm.drawString("I_{i} (u) = \u03C6_{i} ( x( t_{ 1} ))    0",632,210);
       Stringer.drawString("\u2264",763,209);
       Stringer.drawString("\u2264",763,210);
       StringerForm.drawString("(2)",805,210);
     }
     if ((sh>=144)&&(sh<=146))
     {
       g.setColor(Color.red);
       Stringer3.drawString("- ����  ��������� :",105,420);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("I_{ i} ( u )  =  \u03C6_{ i} ( x ( t_{ 1} ) )  =  0 ,  i = p + 1 .. q .",290,420);
       Stringer1.drawString("(3)",595,420);
     }
     if ((sh>=144)&&(sh<=174))
     {
       if ((sh==154)||(sh==163)||(sh==164)) g.setColor(Color.red);
       else
       g.setColor(new Color(120,0,0));
       StringerForm.drawString("I_{i} (u) = \u03C6_{i} ( x( t_{ 1} )) = 0",632,240);
       StringerForm.drawString("(3)",805,240);
     }
     if ((sh>=145)&&(sh<=146))
     {
       g.setColor(Color.black);
       Stringer.drawString("�����  �  R_{ n}  ������  ���������",110,450);
       Stringer.drawString("G =    x \u2208 R_{ n} : ",335,465);
       Stringer.drawString("\u03C6_{ i} ( x )  \u2264  0 ,  i = 1 .. p",445,450);
       Stringer.drawString("\u03C6_{ i} ( x )  =  0 ,  i = p + 1 .. q",445,480);
       g.drawString("{",363,465);
       g.drawString("}",618,465);
       g.setFont(new Font("Dialog",0,40));
       g.setColor(Color.black);
       g.drawString("{",429,471);
       g.setColor(Color.white);
       g.drawString("{",431,471);
     }
     if (sh==146)
     {
       g.setColor(Color.black);
       Stringer.drawString("��������   �������   ����   �����������   ����������   ����������   -  ���",110,510);
     }
     if ((sh>=147)&&(sh<=155))
     {
       g.setColor(Color.black);
       Stringer.drawString("�������   u ( t ) ,   t \u2208 T ,   ���  �������  ����������    x ( t )   �   ������  t = t_{ 1}",100,90);
       Stringer.drawString("��������  ��  ���������  G .",100,110);
     }
     if ((sh>=148)&&(sh<=155))
     {
       g.setColor(new Color(0, 0, 120));
       Stringer2.drawString("����������� :",145,135);
     }
     if ((sh>=149)&&(sh<=155))
     {
       g.setColor(Color.black);
       Stringer.drawString("- C�����  ���������  G.",110,165);
       g.setColor(new Color(200, 200, 255));
       g.fillPolygon(plg);
       g.setColor(Color.blue);
       g.drawPolygon(plg);
       //g.setColor(Color.black);
       StringerForm.drawString("G",495,225);
     }
     if ((sh>=150)&&(sh<=155))
     {
       g.setColor(Color.black);
       Stringer.drawString("- x_{ 0} - �����  �����  x ( t ).",110,185);
       g.setColor(Color.red);
       g.fillOval(348,118,8,8);
       StringerForm.drawString("x_{0}",355,115);
     }
     if ((sh>=151)&&(sh<=155))
     {
       g.setColor(Color.black);
       Stringer.drawString("-�����  ���������� x ( t )",110,205);
       Stringer.drawString("����� ��������� ��� :",120,225);
       double ddx=0.001;
       double t=-1.8;
       int rx=25,ry=40;
       while (t<=1.3)
        {
         g.drawLine((int)(396+rx*t),(int)(195-ry*Fun2(t)),(int)(396+rx*(t+ddx)),(int)(195-ry*Fun2(t+ddx)));
         g.drawLine((int)(396+rx*t),(int)(195-1-ry*Fun2(t)),(int)(396+rx*(t+ddx)),(int)(195-1-ry*Fun2(t+ddx)));
         t=t+ddx;
        }
       rx=40;ry=40;
       t=-1.1;
       while (t<=1.7)
        {
         g.drawLine((int)(397+rx*t),(int)(140-ry*Fun2(t)),(int)(397+rx*(t+ddx)),(int)(140-ry*Fun2(t+ddx)));
         g.drawLine((int)(397+rx*t),(int)(140-1-ry*Fun2(t)),(int)(397+rx*(t+ddx)),(int)(140-1-ry*Fun2(t+ddx)));
         t=t+ddx;
        }
       int xPoints[]={421,430,429};
       int yPoints[]={217,212,221};
       Polygon plg1 = new Polygon(xPoints,yPoints,3);
       g.fillPolygon(plg1);
       int xPoints1[]={459,468,467};
       int yPoints2[]={196,191,200};
       Polygon plg2 = new Polygon(xPoints1,yPoints2,3);
       g.fillPolygon(plg2);
       StringerForm.drawString("x ( t )",425,135);
     }
      if ((sh>=152)&&(sh<=155))
      {
       g.setColor(new Color(150,0,60));
       g.setFont(new Font("Dialog",2,13));
       g.drawString("������   ��   �������   �����",110,255);
       g.drawString("�������  �����  �����",110,275);
       g.drawString("�����  x ( t ) �����  ����������.",110,295);
       Stringer2.drawString("x_{ 1} = x ( t_{1} ) ,",265,275);
       if (xcl!=0)
       {
          if (Flc==1)
           {
            g.setColor(Color.red);
            g.fillOval(xcl,ycl,7,7);
            Stringer3.drawString("x_{ 1}",xcl+8,ycl);
            StringerForm.drawString("�����!",440,300);
           }
          else
           {
            g.setColor(Color.blue);
            g.fillOval(xcl,ycl,7,7);
            g.drawLine(xcl-2,ycl-2,xcl+8,ycl+8);
            g.drawLine(xcl+8,ycl-2,xcl-2,ycl+8);
            Stringer3.drawString("x_{ 1}",xcl+10,ycl-3);
            StringerForm.drawString("�������!",430,300);
           }

       }
     }
      if ((sh>=153)&&(sh<=155))
      {
        g.setColor(Color.black);
        Stringer.drawString("��������  ����������  ����������  ������  ������������ :",110,330);
        g.setColor(new Color(0,0,120));
        g.drawLine(398,353,423,353);
        g.drawLine(398,354,423,354);
        Stringer1.drawString("I_{ 0} ( u ) = \u03C6_{ 0} ( x ( t_{ 1} ) )        > min",240,360);
        Stringer1.drawString("(4)",585,360);
      }
      if ((sh>=153)&&(sh<=174))
      {
        if ((sh==154)||(sh==164)) g.setColor(Color.red);
        else
        g.setColor(new Color(120,0,0));
        g.drawLine(718,263,743,263);
        g.drawLine(718,264,743,264);
        g.drawLine(718,265,743,265);
        StringerForm.drawString("I_{0} (u) = \u03C6_{ 0}        > min",632,270);
        StringerForm.drawString("(4)",805,270);
      }
      if ((sh>=154)&&(sh<=155))
      {
        g.setColor(Color.black);
        Stringer.drawString("������    �����������   �����������   (4)   ��    ���������    ����������",110,390);
        Stringer.drawString("����������   �������  (1) - (3)  ����������",100,410);
        g.setColor(new Color(0,0,120));
        Stringer2.drawString("�����  �������  �������������",396,410);
        Stringer2.drawString("����������  ( �  ������������  ��������  ��������� ).",100,430);
      }
      if (sh==155)
      {
        g.setColor(Color.black);
        Stringer.drawString("���������������� ������ ������������ ���������� �������� ����������",110,450);
        Stringer.drawString("�����. ����������  ���������  �������  ������.",100,470);
      }

      if ((sh>=156)&&(sh<=166))
      {
        g.setColor(Color.black);
        Stringer3.drawString("2.  ������  ������  ������������  ����������.",110,60);
      }
      if ((sh>=157)&&(sh<=166))
      {
        g.setColor(Color.black);
        Stringer.drawString("���������  ����������  ��������  ����������  ���������  ������� :",110,80);
        g.setColor(new Color(0,0,120));
        Stringer1.drawString("I ( u ) =      f_{ 0} ( x ( t ) , u ( t ) , t ) dt   +   F ( x ( t_{ 1} ) , t_{ 1} )",185,120);
        Stringer1.drawString("(5)",585,120);
        g.setFont(new Font("Dialog",0,20));
        g.drawString("\u222B",244,122);
        g.setFont(new Font("Dialog",1,13));
        g.drawString("t",248,100);
        g.drawString("t",240,135);
        g.setFont(new Font("Dialog",1,9));
        g.drawString("1",254,104);
        g.drawString("0",246,139);
      }
      if ((sh>=158)&&(sh<=166))
      {
        g.setColor(Color.black);
        Stringer.drawString("������  �  ������������  (5)  ����������",110,165);
        g.setColor(Color.red);
        g.fillOval(101,157,6,6);
        Stringer3.drawString("�������  ������ ;",405,165);
      }
      if ((sh>=159)&&(sh<=166))
      {
        g.setColor(Color.black);
        Stringer.drawString("����  ��  �  �����������  (5)",110,195);
        Stringer3.drawString("F ( x , t_{ 1} ) = 0",320,195);
        Stringer.drawString("( �����������  ���  ����������",414,195);
        Stringer.drawString("������������   ���� ) -  ��������������� ",110,215);
        g.setColor(Color.red);
        g.fillOval(101,187,6,6);
        Stringer3.drawString("������  �������� ;",405,215);
      }
      if ((sh>=160)&&(sh<=166))
      {
        g.setColor(Color.black);
        Stringer.drawString("����  ��  �  �����������  (5)",110,240);
        Stringer3.drawString("f_{ 0} ( x , u , t ) = 0",320,240);
        Stringer.drawString("( �����������  ������������",431,240);
        Stringer.drawString("���� )  -  ��������   ������   �����������",110,260);
        g.setColor(Color.red);
        g.fillOval(101,232,6,6);
        Stringer3.drawString("�������  ������ ;",405,260);
      }
      if ((sh>=161)&&(sh<=174))
      {
        g.setColor(Color.black);
        if (sh<=166) Stringer3.drawString("3.  �������  ���������  �  �������  �����������������.",110,300);
        else         Stringer3.drawString("3.  �������  ���������  �  �������  �����������������.",110,60);

      }
      if ((sh>=162)&&(sh<=166))
      {
        g.setColor(Color.black);
        Stringer.drawString("����� u^{ 0} ( t ) ,  x^{ 0} ( t ) , t \u2208 T , - ����������  ����������  � ���������������",110,325);
        Stringer.drawString("���  ����������  �������  (1).",100,345);
      }
      if ((sh>=163)&&(sh<=166))
      {
        g.setColor(Color.black);
        Stringer.drawString("����������� ,  ��� �������  \u03C6_{ i} :  R_{ n}     >  R_{ 1} ,",313,345);
        g.drawLine(562,340,585,340);
        Stringer.drawString("i = 0 .. q ,  ��  (2) - (3)  ������������  ������  C^{ (1)}  �  �����������  �����  x^{ 0}(t_{ 1}).",100,365);
        g.setColor(Color.red);
        Stringer3.drawString("������� .",110,390);
      }
      if ((sh>=164)&&(sh<=166))
      {
        g.setColor(new Color(0,0,120));
        Stringer.drawString("����   ����������  ����������  u^{ 0} ( t )  ����������  �  ������  (1) - (4) , �� ",110,405);
        Stringer.drawString("����������",100,425);
        Stringer3.drawString("���������",185,425);
        Stringer.drawString("������",275,425);
        Stringer3.drawString("\u03BB = ( \u03BB_{ 0} , \u03BB_{ 1} , ... , \u03BB_{ q} ) \u2208 R_{ q+1}",340,425);
        Stringer.drawString("����� ,",555,425);
      }
      if ((sh>=165)&&(sh<=166))
      {
        g.setColor(new Color(0,0,120));
        Stringer.drawString("���  �����  u^{ 0} ( t ) , x^{ 0} ( t )  �  ����������  \u03C8^{ 0} ( t )  �����������  ������� :",100,445);
      }
      if (sh==166)
      {
        g.setColor(Color.red);
        Stringer3.drawString("1)  �����������  �����������",110,480);
        g.setColor(new Color(0,0,120));
        Stringer1.drawString("\u03BB_{ i}     0 :    \u03BB_{ i} \u03C6_{ i} ( x^{ 0} ( t_{ 1} ) )  =  0 ,  i = 0 .. p.",220,510);
        Stringer.drawString("\u2265",240,510);
        Stringer.drawString("\u2265",240,509);
       }
      if ((sh>=167)&&(sh<=174))
      {
        g.setColor(Color.red);
        Stringer3.drawString("2)  �����������������",110,90);
        g.setColor(new Color(0,0,120));
        Stringer1.drawString("\u03C8^{ 0} ( t_{ 1} )  =  -          \u03BB_{ i}",235,125);
        g.drawLine(382,120,485,120);
        Stringer1.drawString("\u2202\u03C6_{ i} ( x^{ 0} ( t_{ 1} ))",384,114);
        Stringer1.drawString("\u2202x",424,135);
        g.setFont(new Font("Dialog", 0, 30));
        g.drawString("\u2211",330,127);
        g.setFont(new Font("Dialog", 3, 12));
        g.drawString("i = 0",328,142);
        g.drawString("q",336,103);
       }
       if ((sh>=168)&&(sh<=174))
      {
        g.setColor(Color.red);
        Stringer3.drawString("3)  ���������",110,165);
        g.setColor(new Color(0,0,120));
        Stringer1.drawString("H ( x^{ 0} ( t ) , \u03C8^{ 0} ( t ) , u^{ 0} ( t ) , t )  =  max  H ( x^{ 0} ( t ) , \u03C8^{ 0} ( t ) , u , t ) , t \u2208 T.",120,195);
        g.setFont(new Font("Dialog", 3, 12));
        g.drawString("u \u2208 U",360,208);
       }
      if ((sh>=169)&&(sh<=174))
      {
        g.setColor(Color.black);
        Stringer3.drawString("4.  �������  ���������  ����������  �  ������  ��������������.",110,240);
        g.setColor(Color.red);
        Stringer3.drawString("������� .",110,270);
      }
      if ((sh>=170)&&(sh<=174))
      {
        g.setColor(Color.black);
        Stringer.drawString("�����  u^{ 0} ( t ) , t \u2208 [ 0 , t&{ 1}{ 0} ] , -  �����������  ���������� ,  �����������  ��",110,285);
        Stringer.drawString("����������  �����  t&{ 1}{ 0}  ����������  x^{ 0} ( t )  �������  x = f ( x , u ) �� ���������",100,305);
        Stringer.drawString("x ( 0 ) = x_{ �} \u2208 R_{ n}  �  ���������  x ( t&{ 1}{ 0} ) = x_{ �} \u2208 R_{ n}.",100,325);
        Stringer3.drawString(".",458,275);
      }
      if ((sh>=171)&&(sh<=174))
      {
        g.setColor(Color.black);
        Stringer.drawString("�����  �����  u^{ 0} ( t ) , x^{ 0} ( t ) ,",425,325);
        Stringer.drawString("t \u2208 [ 0 , t&{ 1}{ 0} ] ,  ����������  �����",100,345);
        Stringer3.drawString("�������������",316,345);
        Stringer.drawString("������� \u03C8^{ 0}(t) �����������",435,345);
        Stringer.drawString("������� , ",100,365);
      }
      if ((sh>=172)&&(sh<=174))
      {
        g.setColor(Color.black);
        Stringer.drawString("���  �����������  ������� :",175,365);
      }
      if ((sh>=173)&&(sh<=174))
      {
        g.setColor(Color.red);
        Stringer3.drawString("1)  ���������  ��  ����������",110,390);
        g.setColor(new Color(0,0,120));
        Stringer1.drawString("H ( x^{ 0} ( t ) , \u03C8^{ 0} ( t ) , u^{ 0} ( t ) )  =  max  H ( x^{ 0} ( t ) , \u03C8^{ 0} ( t ) , u ) ,  t \u2208 [ 0 , t&{ 1}{ 0} ]",112,420);
        g.setFont(new Font("Dialog", 3, 12));
        g.drawString("u \u2208 U",352,433);
      }
      if (sh==174)
      {
        g.setColor(Color.red);
        Stringer3.drawString("2)  ��������������  ��  �������  ��������������  t&{ 1}{ 0}",110,465);
        g.setColor(new Color(0,0,120));
        Stringer1.drawString("H ( x^{ 0} ( t&{ 1}{ 0} ) , \u03C8^{ 0} ( t&{ 1}{ 0} ) , u^{ 0} ( t&{ 1}{ 0} ) )  =  0 .",240,495);
      }
     if ((sh>=175)&&(sh<=233))
     {
       g.setColor(Color.red);
       g.setFont(new Font("Dialog",1,16));
       g.drawString("������� �����",285,30);
       g.setColor(Color.black);
       g.drawLine(280,35,411,35);
       g.drawLine(280,34,411,34);
     }
     if ((sh>=176)&&(sh<=184))
     {
       g.setColor(Color.black);
       g.setFont(new Font("Dialog",1,14));
       g.drawString("1.  ��������  ����������  �������� ���������.",110,60);
     }
     if ((sh>=177)&&(sh<=184))
     {
       g.setColor(Color.red);
       StringerForm.drawString("1.",110,90);
       g.setColor(Color.black);
       Stringer.drawString("���������  ������������  ��  �������: ",130,90);
       g.setColor(new Color(0,0,120));
       Stringer3.drawString("H ( x , \u03C8 , u , t ) =       \u03C8_{ j} f_{ j}( x , u , t )  - f_{ 0} ( x , u , t ).",195,115);
       g.setFont(new Font("Dialog",0,20));
       g.drawString("\u2211",316,117);
       g.setFont(new Font("Dialog",1,11));
       g.drawString("j = 1",313,130);
       g.drawString("n",320,101);
     }
     if ((sh>=177)&&(sh<=233))
     {
       if ((sh==190)||(sh==191)||(sh==210)||(sh==211)) g.setColor(Color.red);
       else
       g.setColor(new Color(120,0,0));
       Stringer3.drawString("H =     \u03C8_{ j} f_{ j}  - f_{ 0}",645,90);
       g.setFont(new Font("Dialog",0,20));
       g.drawString("\u2211",670,90);
       g.setFont(new Font("Dialog",1,11));
       g.drawString("j = 1",667,103);
       g.drawString("n",673,73);
     }
     if ((sh>=178)&&(sh<=184))
     {
       g.setColor(Color.red);
       StringerForm.drawString("2.",110,155);
       g.setColor(Color.black);
       Stringer.drawString("�����  ��������� ������������ ����������  u^{ 0} ( t ) = u^{ 0} ( x ( t ) , \u03C8 ( t ), t )",130,155);
       Stringer.drawString("��  ������� ��������� :",130,175);
       g.setColor(new Color(0,0,120));
       Stringer3.drawString("H ( x^{ 0} ( t ) , \u03C8^{ 0} ( t ) , u^{ 0} ( t ) , t )  =  max  H ( x^{ 0} ( t ) , \u03C8^{ 0} ( t ) , u , t ).",140,200);
       g.setFont(new Font("Dialog", 3, 12));
       g.drawString("u \u2208 U",380,213);
     }
     if ((sh>=178)&&(sh<=233))
     {
       if ((sh==192)||(sh==193)||(sh==194)||(sh==195)||(sh==212)||(sh==213)) g.setColor(Color.red);
       else
       g.setColor(new Color(120,0,0));
       Stringer3.drawString("H (x^{ 0}, \u03C8^{ 0}, u^{ 0}, t) =",645,130);
       Stringer3.drawString("= max H (x^{ 0}, \u03C8^{ 0}, u, t)",665,150);
       g.setFont(new Font("Dialog", 1, 12));
       g.drawString("u \u2208 U",683,161);
     }
     if ((sh>=179)&&(sh<=184))
     {
       g.setColor(Color.red);
       StringerForm.drawString("3.",110,240);
       g.setColor(Color.black);
       Stringer.drawString("���������   �������   ������������   ���������   �  ���������   �  ������",130,240);
       Stringer.drawString("��������� :",130,260);
       g.setColor(new Color(0,0,120));
       Stringer3.drawString("x =",225,275);
       Stringer3.drawString(".",228,265);
       g.drawLine(250,270,362,270);
       Stringer3.drawString("\u2202H ( x , \u03C8 , u , t )",250,266);
       Stringer3.drawString("\u2202\u03C8",295,285);
       Stringer3.drawString(",    \u03C8 = -",370,275);
       Stringer3.drawString(".",394,265);
       Stringer3.drawString(",",550,275);
       g.drawLine(430,270,542,270);
       Stringer3.drawString("\u2202H ( x , \u03C8 , u , t )",430,266);
       Stringer3.drawString("\u2202x",475,285);
     }

     if ((sh>=180)&&(sh<=184))
     {
       g.setColor(new Color(0,0,120));
       Stringer3.drawString("x ( t_{ 0} ) = x_{ 0} ,     t \u2208 T .",225,315);
     }
     if ((sh>=180)&&(sh<=233))
     {
       if ((sh==196)||(sh==197)||(sh==198)||((sh>=214)&&(sh<=219)))  g.setColor(Color.red);
       else g.setColor(new Color(120,0,0));
       Stringer3.drawString("x =",660,195);
       Stringer3.drawString("\u2202H",690,188);
       Stringer3.drawString("\u2202\u03C8",689,204);
       Stringer3.drawString(".",663,184);
       g.drawLine(685,190,715,190);
       Stringer3.drawString(",",722,193);
       Stringer3.drawString("\u03C8 = -",735,195);
       g.drawLine(774,190,804,190);
       Stringer3.drawString("\u2202H",779,188);
       Stringer3.drawString("\u2202x",779,204);
       Stringer3.drawString(".",739,184);
       Stringer3.drawString("x ( t_{ 0} ) = x_{ 0},   t \u2208 T",660,232);
       g.setFont(new Font("Dialog",0,60));
       g.drawString("{",640,223);
       g.setColor(Color.white);
       g.drawString("{",642,223);
     }
     if ((sh>=181)&&(sh<=184))
     {
       g.setColor(Color.red);
       StringerForm.drawString("4.",110,345);
       g.setColor(Color.black);
       Stringer.drawString("��������  �����������  �������  �������  ���  ���������  ������� :",130,345);
       g.setColor(new Color(0,0,120));
       Stringer3.drawString("\u03C8^{ 0} ( t_{ 1} )  =  -          \u03BB_{ i}",145,380);
       g.drawLine(292,375,395,375);
       Stringer3.drawString("\u2202\u03C6_{ i} ( x^{ 0} ( t_{ 1} ))",294,369);
       Stringer3.drawString("\u2202x",334,390);
       g.setFont(new Font("Dialog", 0, 30));
       g.drawString("\u2211",240,382);
       g.setFont(new Font("Dialog", 1, 12));
       g.drawString("i = 0",238,397);
       g.drawString("q",246,358);
       g.setColor(new Color(0,0,0));
       Stringer.drawString("/ ����  �������  �����������",415,375);
       Stringer.drawString("  ��  ������  ����� /",450,390);
     }
     if ((sh>=182)&&(sh<=184))
     {
       g.setColor(new Color(0,0,120));
       Stringer3.drawString("\u03C8^{ 0} ( t_{ 0} )  =          \u03BC_{ k}",145,430);
       g.drawLine(277,425,380,425);
       Stringer3.drawString("\u2202h_{ k} ( x^{ 0} ( t_{ 0} ))",279,419);
       Stringer3.drawString("\u2202x",319,440);
       g.setFont(new Font("Dialog", 0, 30));
       g.drawString("\u2211",225,432);
       g.setFont(new Font("Dialog", 1, 12));
       g.drawString("k = 0",223,447);
       g.drawString("r",233,408);
       g.setColor(new Color(0,0,0));
       Stringer.drawString("/ ����  �������  �����������",415,425);
       Stringer.drawString("  ��  �����  ����� /",450,440);
     }
     if ((sh>=183)&&(sh<=184))
     {
       g.setColor(new Color(0,0,120));
       Stringer3.drawString("\u03C8^{ 0} ( t_{ 1} )  = -",145,475);
       g.drawLine(235,471,332,471);
       Stringer3.drawString("\u2202\u03C6 ( x^{ 0} ( t_{ 1} ))",237,466);
       Stringer3.drawString("\u2202x",271,485);
       g.setColor(new Color(0,0,0));
       Stringer.drawString("/ ����  ���  ����������� /",415,478);
     }
     if ((sh>=183)&&(sh<=233))
     {
       if ((sh==199)||(sh==220)||(sh==221))  g.setColor(Color.red);
       else g.setColor(new Color(120,0,0));
       Stringer3.drawString("\u03C8^{ 0}(t_{ 1}) = -",645,275);
       g.drawLine(717,271,800,271);
       Stringer3.drawString("\u2202\u03C6 (x^{ 0}(t_{ 1}) )",720,266);
       Stringer3.drawString("\u2202x",749,285);
     }
     if (sh==184)
     {
       g.setColor(Color.red);
       StringerForm.drawString("5.",110,504);
       g.setColor(Color.black);
       Stringer.drawString("������   ������������   �������   ������   ���   ����������   ������� ,",130,504);
       Stringer.drawString("���������  ������� �������,  ��������  ����  x^{ 0} � \u03C8^{ 0}  �  �����  �� 2. u^{ 0}.",130,524);
     }
     if ((sh>=185)&&(sh<=204))
     {
       g.setColor(Color.black);
       g.setFont(new Font("Dialog",1,14));
       g.drawString("2.  ������  1 ( ��������  ������  ������ ) .",110,60);
     }
     if ((sh>=186)&&(sh<=204))
     {
       g.setColor(new Color(255,0,0));
       g.drawString("���� :",120,90);
       g.setColor(new Color(0,0,120));
       Stringer3.drawString("x = x ( t ) + u ( t ) ,   x (0) = 0 ,   x , u \u2208 R ,   t \u2208 [ 0 , 1 ].",190,105);
       Stringer3.drawString(".",192,95);
       Stringer3.drawString("I =      u^{ 2} ( t ) dt  -  x (1)       > min .",190,135);
       g.drawLine(350,129,375,129);
       g.drawLine(350,130,375,130);
       g.setFont(new Font("Dialog",0,20));
       g.drawString("\u222B",216,137);
       g.setFont(new Font("Dialog",1,11));
       g.drawString("1",223,120);
       g.drawString("0",211,148);
      }
     if ((sh>=187)&&(sh<=204))
     {
       g.setColor(new Color(255,0,0));
       g.setFont(new Font("Dialog",1,14));
       g.drawString("����� :",120,180);
       g.setColor(new Color(0,0,0));
       Stringer.drawString("���������  �����  �����������  ���� ( x^{ 0} (t) , u^{ 0} (t) ), ��  �������",177,180);
       Stringer.drawString("�����������  �������  ����������� .",177,200);
      }
     if ((sh>=188)&&(sh<=204))
     {
       g.setColor(new Color(255,0,0));
       g.setFont(new Font("Dialog",1,14));
       g.drawString("������� :",120,225);
       g.setColor(new Color(0,0,0));
       Stringer.drawString("���������  �  �����  �����������  ������  ����� :",210,225);
      }
     if ((sh>=189)&&(sh<=204))
     {
       Stringer3.drawString("f ( x , u , t ) = x + u ,  f_{ 0} ( x , u , t ) = u^{ 2} ,  F ( x ) = - x .",190,255);
       g.drawLine(105,265,620,265);
      }
    if ((sh>=190)&&(sh<=199))
     {
       g.setColor(Color.red);
       Stringer1.drawString("1.",110,285);
       g.setColor(Color.black);
       Stringer.drawString("��������  ������������ :",130,285);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("H ( x , \u03C8 , u , t ) =",320,285);
      }
     if ((sh>=191)&&(sh<=199))
     {
       Stringer1.drawString("\u03C8 ( x + u ) - u^{ 2} .",442,285);
     }
     if ((sh>=192)&&(sh<=199))
     {
       g.setColor(Color.red);
       Stringer1.drawString("2.",110,305);
       g.setColor(Color.black);
       Stringer.drawString("������  ��������  H ( x ,\u03C8 , u , t ) ��  ���������� :",130,305);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("\u2202",120,328);
       Stringer1.drawString("\u2202u",114,345);
       g.drawLine(113,331,133,331);
       Stringer1.drawString("H ( x ( t ) , \u03C8 ( t ) , u , t ) =",137,337);
      }
     if ((sh>=193)&&(sh<=199))
     {
       Stringer1.drawString("\u03C8 ( t ) - 2 u = 0 .",315,337);
     }
     if ((sh>=194)&&(sh<=199))
     {
       g.setColor(Color.black);
       Stringer.drawString("������ :",430,337);
       g.setColor(new Color(255,0,0));
       Stringer1.drawString("u^{ 0} ( t ) =",500,337);
       Stringer1.drawString("\u03C8 ( t )",567,327);
       Stringer1.drawString("2",582,345);
       g.drawLine(565,331,602,331);
     }
     if ((sh>=195)&&(sh<=199))
     {
       g.setColor(Color.black);
       Stringer.drawString("��������� ����������  ������������  max H , �.�. ",130,370);
       Stringer.drawString("\u2202^{ 2}",472,361);
       Stringer.drawString("\u2202u^{2}",470,378);
       g.drawLine(470,363,490,363);
       Stringer.drawString("H = - 2 < 0 .",497,370);
     }
     if ((sh>=196)&&(sh<=199))
     {
       g.setColor(Color.red);
       Stringer1.drawString("3.",110,405);
       g.setColor(Color.black);
       Stringer.drawString("�������  ���������  �������  � ������  �����������  ���������� :",130,405);
       g.setFont(new Font("Dialog",0,40));
       g.setColor(new Color(0,0,120));
       g.drawString("{",165,454);
       g.setColor(Color.white);
       g.drawString("{",167,454);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("x ( t ) = x ( t ) + u^{ 0} ( t ) = ",185,435);
       Stringer1.drawString(".",188,425);
      }
      if ((sh>=197)&&(sh<=199))
     {
       Stringer1.drawString("x ( t ) + 0.5 \u03C8 ( t )  ,  x ( 0 ) = 0 ,",352,435);
      }
      if ((sh>=198)&&(sh<=199))
     {
       Stringer1.drawString("\u03C8 ( t ) = - \u03C8 ( t ) .",185,465);
       Stringer1.drawString(".",188,455);
      }
      if (sh==199)
     {
       g.setColor(Color.red);
       Stringer1.drawString("4.",110,495);
       g.setColor(Color.black);
       Stringer.drawString("������  �����������  �������  ������� :",130,495);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("\u03C8 ( t_{ 1} ) = \u03C8 (1) = - ( - 1) = 1 .",425,495);
      }
      if ((sh>=200)&&(sh<=204))
     {
       g.setColor(Color.red);
       Stringer1.drawString("5.",110,285);
       g.setColor(Color.black);
       Stringer.drawString("�.�. ��  �������� ������������  �������  ������ : ",130,285);
       g.setFont(new Font("Dialog",0,40));
       g.setColor(new Color(0,0,120));
       g.drawString("{",165,334);
       g.setColor(Color.white);
       g.drawString("{",167,334);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("x ( t ) = x ( t ) + 0.5 \u03C8 ( t )  ,  x ( 0 ) = 0 ,",185,315);
       Stringer1.drawString("\u03C8 ( t ) = - \u03C8 ( t ) ,  \u03C8 (1) = 1 .",185,345);
       Stringer1.drawString(".",188,335);
       Stringer1.drawString(".",189,305);
      }
      if ((sh>=201)&&(sh<=204))
     {
       g.setColor(Color.black);
       Stringer.drawString("��  �������  ���������  �  ��������  ��������  ����� :",110,375);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("\u03C8 ( t ) = e^{ 1 - t} .",495,375);
      }
      if ((sh>=202)&&(sh<=204))
     {
       g.setColor(Color.black);
       Stringer.drawString("�����   ������   ���������   ������� ,   ����������   ���������   ������� ,",110,395);
       Stringer.drawString("��������  �����������  ���������� :",110,415);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("x^{ 0}( t ) = 0.25 [ e^{ 1 + t} - e^{ 1 - t} ] .",380,415);
      }
     if ((sh>=203)&&(sh<=204))
     {
       g.setColor(Color.black);
       Stringer.drawString("�������  �����������  ���������� :",110,435);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("u^{ 0}( t ) = 0.5 \u03C8 ( t ) = 0.5 e^{ 1 - t} .",380,435);
      }
     if (sh==204)
     {
       g.setColor(new Color(0,0,120));
       Stringer3.drawString("����� :",325,465);
       g.setColor(Color.red);
       Stringer3.drawString("x^{ 0}( t ) = 0.25 [ e^{ 1 + t} - e^{ 1 - t} ]",257,485);
       Stringer3.drawString("u^{ 0}( t ) =  0.5 e^{ 1 - t}",292,510);
      }
      if ((sh>=205)&&(sh<=233))
     {
       g.setColor(Color.black);
       g.setFont(new Font("Dialog",1,14));
       g.drawString("3.  ������  2 ( ��������  ������  ������ ) .",110,60);
     }
     if ((sh>=206)&&(sh<=233))
     {
       g.setColor(new Color(255,0,0));
       g.drawString("���� :",120,90);
       g.setColor(new Color(0,0,120));
       Stringer3.drawString("x_{ 1}( t ) = x_{ 2}( t ) ,   x_{ 2}( t ) = - x_{ 1}( t ) + u( t ).",205,90);
       Stringer3.drawString(".",207,80);
       Stringer3.drawString(".",324,80);
       Stringer3.drawString("x_{ 1}(0) = 0 ,  x_{ 2}(0) = 0 .",205,115);
       Stringer3.drawString("x = ( x_{ 1} , x_{ 2} )^{ T} \u2208 R^{2} , u \u2208 [ -1 , 1 ] ,   t \u2208 [ 0 , 2\u03C0 ].",205,140);
       Stringer3.drawString("I =  x_{ 2} ( 2\u03C0 )       > min .",205,165);
       g.drawLine(295,159,320,159);
       g.drawLine(295,160,320,160);
      }
     if ((sh>=207)&&(sh<=233))
     {
       g.setColor(new Color(255,0,0));
       g.setFont(new Font("Dialog",1,14));
       g.drawString("����� :",120,195);
       g.setColor(new Color(0,0,0));
       Stringer.drawString("�����������  ����������  �  ��������������  ���  ����������.",177,195);
      }
     if ((sh>=208)&&(sh<=233))
     {
       g.setColor(new Color(255,0,0));
       g.setFont(new Font("Dialog",1,14));
       g.drawString("������� :",120,225);
       g.setColor(new Color(0,0,0));
       Stringer.drawString("���������  �  �����  �����������  ������  ����� :",210,225);
      }
     if ((sh>=209)&&(sh<=233))
     {
       Stringer3.drawString("f_{ 0} ( x , u , t ) = 0 ,  F ( x ) = x_{ 2} ,  f_{ 1} ( x , u , t ) = x_{ 2} ,  f_{ 2} ( x , u , t ) = - x_{ 1} + u .",116,255);
       g.drawLine(105,265,620,265);
      }
    if ((sh>=210)&&(sh<=219))
     {
       g.setColor(Color.red);
       Stringer1.drawString("1.",110,285);
       g.setColor(Color.black);
       Stringer.drawString("��������  ������������ :",130,285);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("H ( x , \u03C8 , u , t ) =",320,285);
      }
     if ((sh>=211)&&(sh<=219))
     {
       Stringer1.drawString("\u03C8_{ 1} x_{ 2} + \u03C8_{ 2} ( - x_{ 1} + u ) .",442,285);
     }
     if ((sh>=212)&&(sh<=219))
     {
       g.setColor(Color.red);
       Stringer1.drawString("2.",110,305);
       g.setColor(Color.black);
       Stringer.drawString("������  ��������  H ( x ,\u03C8 , u , t )  ��  ����������. ���  ���  �������",130,305);
       Stringer.drawString("�����������  ��  ����������, ���������  �����  ��������  ��������.",130,325);
      }
     if ((sh>=213)&&(sh<=219))
     {
       Stringer.drawString("�  �����  ������  ������������  ������  ��  u \u2208 U = [ -1 , 1 ] ,  ������� :",130,345);
       g.setColor(Color.red);
       Stringer1.drawString("u^{ 0} ( t ) = 1  sign \u03C8_{ 2} ( t ) = sign \u03C8_{ 2} ( t ) ,",225,375);
       Stringer1.drawString(".",297,371);
     }
     if ((sh>=214)&&(sh<=219))
     {
       g.setColor(Color.red);
       Stringer1.drawString("3.",110,405);
       g.setColor(Color.black);
       Stringer.drawString("����c�����  ������������  ���������  ��������  ��������� :",130,405);
       g.setFont(new Font("Dialog",0,100));
       g.setColor(new Color(0,0,120));
       g.drawString("{",125,500);
       g.setColor(Color.white);
       g.drawString("{",127,500);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("x_{ 1} ( t ) = x_{ 2} ( t ) ,    x_{ 1} ( 0 ) = 0 ,",155,435);
       Stringer1.drawString(".",158,425);
      }
      if ((sh>=215)&&(sh<=219))
     {
       Stringer1.drawString("x_{ 2} ( t ) = - x_{ 1} ( t ) + u ( t ) =",155,465);
       Stringer1.drawString(".",158,455);
      }
      if ((sh>=216)&&(sh<=219))
      {
       Stringer1.drawString("- x_{ 1} ( t ) + sign \u03C8_{ 2} ( t ) ,  x_{ 2} ( 0 ) = 0 ,",340,465);
      }
      if ((sh>=217)&&(sh<=219))
      {
       Stringer1.drawString("\u03C8_{ 1} ( t ) = - ",155,495);
       Stringer1.drawString("\u03C8_{ 2} ( t ) = - ",155,525);
       Stringer1.drawString(".",159,485);
       Stringer1.drawString(".",159,515);
       Stringer2.drawString("\u2202",233,489);
       Stringer2.drawString("\u2202",233,517);
       Stringer2.drawString("\u2202x_{1}",228,503);
       g.drawString("2",242,533);
       Stringer2.drawString("\u2202x",228,530);
       g.drawLine(227,490,248,490);
       g.drawLine(227,518,248,518);
       Stringer1.drawString("H ( x , \u03C8 , u^{ 0} , t ) = ",251,495);
       Stringer1.drawString("H ( x , \u03C8 , u^{ 0} , t ) = ",251,525);
      }
      if ((sh>=218)&&(sh<=219))
      {
       Stringer1.drawString("\u03C8_{ 2} ( t ) ,",385,495);
      }
      if (sh==219)
      {
       Stringer1.drawString("- \u03C8_{ 1} ( t ) .",385,525);
      }
      if ((sh>=220)&&(sh<=224))
     {
       g.setColor(Color.red);
       Stringer1.drawString("4.",110,285);
       g.setColor(Color.black);
       Stringer.drawString("������  �����������  �������  ������� :",130,285);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("\u03C8_{ 1} ( t_{ 1} ) = \u03C8_{ 1} ( 2\u03C0 ) = 0 ,",165,315);
      }
      if ((sh>=221)&&(sh<=224))
      {
       Stringer1.drawString("\u03C8_{ 2} ( t_{ 1} ) = \u03C8_{ 2} ( 2\u03C0 ) = - 1 ,",380,315);
      }
      if ((sh>=222)&&(sh<=224))
     {
       g.setColor(Color.red);
       Stringer1.drawString("5.",110,345);
       g.setColor(Color.black);
       Stringer.drawString("�.�. ��  �������� ������������  �������  ������ : ",130,345);
       g.setFont(new Font("Dialog",0,100));
       g.setColor(new Color(0,0,120));
       g.drawString("{",195,440);
       g.setColor(Color.white);
       g.drawString("{",197,440);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("x_{ 1} ( t ) = x_{ 2} ( t ) ,    x_{ 1} ( 0 ) = 0 ,",225,375);
       Stringer1.drawString(".",228,365);
       Stringer1.drawString("x_{ 2} ( t ) = - x_{ 1} ( t ) + sign \u03C8_{ 2} ( t ) ,  x_{ 2} ( 0 ) = 0 ,",225,405);
       Stringer1.drawString(".",228,395);
       Stringer1.drawString("\u03C8_{ 1} ( t ) = \u03C8_{ 2} ( t ) , \u03C8_{ 1} ( 2\u03C0 ) = 0 ,",225,435);
       Stringer1.drawString(".",229,425);
       Stringer1.drawString("\u03C8_{ 2} ( t ) = - \u03C8_{ 1} ( t ) , \u03C8_{ 2} ( 2\u03C0 ) = - 1 ,",225,465);
       Stringer1.drawString(".",229,455);
      }
      if ((sh>=223)&&(sh<=224))
     {
       g.setColor(Color.black);
       Stringer.drawString("��  ����  ���������  ��������  �����  �����  �������� :",130,495);
       g.setColor(new Color(0,0,120));
       Stringer1.drawString("\u03C8_{ 1} ( t ) = - sin t ,",220,525);
      }
      if (sh==224)
     {
       Stringer1.drawString("\u03C8_{ 2} ( t ) = - cos t .",380,525);
      }
      if ((sh>=225)&&(sh<=233))
     {
       g.setColor(Color.black);
       Stringer.drawString("������������� :",110,285);
       g.setColor(Color.red);
       Stringer1.drawString("u^{ 0} ( t ) = sign \u03C8_{ 2} ( t ) = ",235,285);
      }
      if ((sh>=226)&&(sh<=233))
     {
       Stringer1.drawString("sign ( - cos t ) = - sign ( cos t ) .",397,285);
      }
     if ((sh>=227)&&(sh<=233))
     {
       g.setColor(Color.black);
       Stringer.drawString("���������  �����������  ����������  u^{ 0} ( t ) ��  ��������� [ 0 , 2\u03C0 ] �����",110,315);
       Stringer.drawString("���  �����  ������������  �  ���  ���������  ���������������� :",110,335);
      }
     if ((sh>=228)&&(sh<=233))
     {
       g.setColor(Color.black);
       Stringer3.drawString("1)   0    t  <        :    u^{ 0} ( t ) = -1 ,",110,360);
       Stringer.drawString("\u2264",146,360);
       Stringer.drawString("\u2264",146,361);
       Stringer3.drawString("\u03C0",188,353);
       Stringer3.drawString("2",190,369);
       g.drawLine(185,355,200,355);
     }
      if ((sh>=228)&&(sh<=233))
     {
       Stringer3.drawString("x&{ 1}{ 0} ( t ) = cos t - 1 ,   x&{ 2}{ 0} ( t ) = - sin t ;",325,360);
     }
     if ((sh>=229)&&(sh<=233))
     {
       g.setColor(Color.black);
       Stringer3.drawString("2)          t  <        :   u^{ 0} ( t ) = 1 ,",110,390);
       Stringer3.drawString("\u03C0",132,383);
       Stringer3.drawString("2",135,399);
       g.drawLine(130,385,145,385);
       Stringer.drawString("\u2264",150,390);
       Stringer.drawString("\u2264",150,391);
       Stringer3.drawString("3\u03C0",190,383);
       Stringer3.drawString("2",194,399);
       g.drawLine(187,385,210,385);
     }
     if ((sh>=230)&&(sh<=233))
     {
       Stringer3.drawString("x&{ 1}{ 0} ( t ) = cos t - 2 sin t + 1 ,",325,390);
       Stringer3.drawString("x&{ 2}{ 0} ( t ) = - sin t - 2 cos t ;",325,420);
     }
     if ((sh>=231)&&(sh<=233))
     {
       g.setColor(Color.black);
       Stringer3.drawString("3)            t  < 2\u03C0 :  u^{ 0} ( t ) = - 1 ,",110,450);
       Stringer3.drawString("3\u03C0",132,443);
       Stringer3.drawString("2",137,459);
       g.drawLine(130,445,150,445);
       Stringer.drawString("\u2264",154,450);
       Stringer.drawString("\u2264",154,451);
     }
     if ((sh>=232)&&(sh<=233))
     {
       Stringer3.drawString("x&{ 1}{ 0} ( t ) = cos t - 4 sin t - 1 ,",325,450);
       Stringer3.drawString("x&{ 2}{ 0} ( t ) = - sin t - 4 cos t ;",325,480);
     }
     if (sh==233)
     {
       Stringer.drawString("�����������  ��������  ����������� :",110,510);
       g.setColor(Color.red);
       StringerForm.drawString("I = x&{ 2}{ 0} ( 2\u03C0 ) = - 4 .",430,510);
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
   if (sh<=233) sh++;
   if (jCheckBox1.isSelected()) jCheckBox1.setSelected(false);
   if (jCheckBox2.isSelected()) jCheckBox2.setSelected(false);
   if (jCheckBox3.isSelected()) jCheckBox3.setSelected(false);
   if (sh>=1)  MP.repaint();
  }

  void jButton3_actionPerformed(ActionEvent e)
  {
   if (sh>0) sh--;
   if (sh==28) a=0;
   if (jCheckBox1.isSelected()) jCheckBox1.setSelected(false);
   if (jCheckBox2.isSelected()) jCheckBox2.setSelected(false);
   if (jCheckBox3.isSelected()) jCheckBox3.setSelected(false);
   MP.repaint();
   if (sh==151) {xcl=0; ycl=0;}
  }

  void MP_mouseDragged(MouseEvent e)
  { int x2,y2;
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
  {int x1,y1;
   x1=e.getX();
   y1=e.getY();

   if ((sh==1)&&(x1>=160)&&(x1<=750))
    {
     if ((y1>=85)&&(y1<=103))   sh=3;
     if ((y1>=107)&&(y1<=125))  sh=31;
     if ((y1>=160)&&(y1<=178))  sh=49;
     if ((y1>=182)&&(y1<=199))  sh=58;
     if ((y1>=203)&&(y1<=220))  sh=75;
     if ((y1>=223)&&(y1<=240))  sh=83;
     if ((y1>=275)&&(y1<=313))  sh=103;
     if ((y1>=317)&&(y1<=335))  sh=127;
     if ((y1>=370)&&(y1<=388))  sh=138;
     if ((y1>=392)&&(y1<=409))  sh=156;
     if ((y1>=412)&&(y1<=429))  sh=161;
     if ((y1>=432)&&(y1<=450))  sh=169;
     if ((y1>=475)&&(y1<=493))  sh=176;
     if ((y1>=495)&&(y1<=513))  sh=185;
     if ((y1>=515)&&(y1<=533))  sh=205;
     MP.repaint();
    }

   if ((sh>=10)&&(sh<=16))
   {  if ((x1>=x)&&(x1<=x+45)&&(y1>=285)&&(y1<=315)) {FlPer=1;c=Color.red; MP.repaint(245,200,360,150);}
      else FlPer=0;
    }
   if ((sh==29)&&(x1>=425)&&(x1<=570)&&(y1>=335)&&(y1<=475)&&(a!=2))
    {a++;
     if (a==1) {xrA=x1; yrA=y1;}
     if (a==2) {xrB=x1; yrB=y1;}
     MP.repaint(425,260,200,320);}
   xcl=0; ycl=0; Flc=0;
   if ((sh>=152)&&(sh<=155))
    {
     xcl=x1;
     ycl=y1;
     Graphics g=getGraphics();
     if (plg.contains(x1+3,y1+3)) Flc=1;
     MP.repaint(330,100,290,205);
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
   int x2,y2;
     x2=e.getX();
     y2=e.getY();

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
    MP.repaint();
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