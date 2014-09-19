package primmetfib;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class AppPrimFib extends JApplet {
  boolean isStandalone = false;
  JLabel jLabel1 = new JLabel();
  JButton jButton1 = new JButton();
  JButton jButton2 = new JButton();
  JButton jButton3 = new JButton();
  JLabel jLabel2 = new JLabel();
  JLabel jLabel3 = new JLabel();
  GrPanel jPanel1 = new GrPanel();
  public int sh=1;

  /**Get a parameter value*/
  public String getParameter(String key, String def) {
    return isStandalone ? System.getProperty(key, def) :
      (getParameter(key) != null ? getParameter(key) : def);
  }

  /**Construct the applet*/
  public AppPrimFib() {
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
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel1.setForeground(new Color(130, 0, 80));
    jLabel1.setText("������");
    jLabel1.setBounds(new Rectangle(236, 4, 73, 17));
    this.getContentPane().setBackground(new Color(247, 247, 255));
    this.setSize(new Dimension(550,500));
     this.getContentPane().setLayout(null);
    jButton1.setBackground(new Color(220, 230, 255));
    jButton1.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton1.setForeground(new Color(0, 0, 60));
    jButton1.setText("<==");
    jButton1.setBounds(new Rectangle(44, 467, 127, 23));
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton1_actionPerformed(e);
      }
    });
    jButton2.setBackground(new Color(220, 230, 255));
    jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton2.setForeground(new Color(0, 0, 60));
    jButton2.setText("��������");
    jButton2.setBounds(new Rectangle(205, 466, 127, 23));
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton2_actionPerformed(e);
      }
    });
    jButton3.setBackground(new Color(220, 230, 255));
    jButton3.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton3.setForeground(new Color(0, 0, 60));
    jButton3.setText("==>");
    jButton3.setBounds(new Rectangle(366, 466, 127, 23));
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton3_actionPerformed(e);
      }
    });
    jPanel1.setBounds(new Rectangle(10, 25, 535, 440));
    jPanel1.setBackground(new Color(247, 247, 255));
    this.getContentPane().add(jLabel2, null);
    this.getContentPane().add(jLabel3, null);
    this.getContentPane().add(jLabel1, null);
    this.getContentPane().add(jButton1, null);
    this.getContentPane().add(jButton2, null);
    this.getContentPane().add(jButton3, null);
    this.getContentPane().add(jPanel1, null);
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
   public void paintArrow(Graphics g, double X0,double Y0,double X1,double Y1)
  {
   g.drawLine((int)X0,(int)Y0,(int)X1,(int)Y1);
   double R=Math.sqrt((X1-X0)*(X1-X0)+(Y1-Y0)*(Y1-Y0));
   double dist=6.0,prm=3.0;
   double Xp=X1+(X0-X1)*dist/R, Yp=Y1+(Y0-Y1)*dist/R;//!!!!!!!!!!
   double Xk1=Xp+(Y0-Y1)*prm/R, Yk1=Yp-(X0-X1)*prm/R;//
   g.drawLine((int)X1,(int)Y1,(int)Xk1,(int)Yk1);
   Xk1=Xp-(Y0-Y1)*prm/R; Yk1=Yp+(X0-X1)*prm/R;
   g.drawLine((int)X1,(int)Y1,(int)Xk1,(int)Yk1);
  }
   public void Ind_n(Graphics g,String a, String b, int x, int y)
   {g.setFont(new java.awt.Font("SansSerif", 1, 15));
    g.drawString(""+a,x,y);
    g.setFont(new java.awt.Font("SansSerif", 1, 11));
    g.drawString(""+b+" ",x+a.length()*8,y+4);
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
  }
  public void Ind_n1(Graphics g,String a, String b, int x, int y)
   {g.setFont(new java.awt.Font("SansSerif", 1, 14));
    g.drawString(""+a,x,y);
    g.setFont(new java.awt.Font("SansSerif", 1, 11));
    g.drawString(""+b+" ",x+a.length()*8,y+4);
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
  }
   public void Ind_n2(Graphics g,String a, String b, int x, int y)
   {g.setFont(new java.awt.Font("SansSerif", 1, 14));
    g.drawString(""+a,x,y);
    g.setFont(new java.awt.Font("SansSerif", 1, 10));
    g.drawString(""+b+" ",x+a.length()*6,y+4);
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
  }
 public void Ind_v(Graphics g,String a, String b, int x, int y)
   {g.setFont(new java.awt.Font("SansSerif", 1, 15));
    g.drawString(""+a,x,y);
    g.setFont(new java.awt.Font("SansSerif", 1, 11));
    g.drawString(""+b+"  ",x+a.length()*8,y-4);
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
  }

  public double f(double x){
   return( 2*Math.pow(x,2)-12*x);
  }

   public int xmin=0,xmax=10,ymin=-18,ymax=2;
   public int gxmin=23,gxmax=303,gymin=66,gymax=306;


  public int XGra( double x ) {
    double xx;
    int XG;
    xx = gxmin+( x - xmin )*( gxmax-gxmin )/( xmax-xmin );
    if ( xx > 400 ) { XG = 400; }
    else if ( xx < 0 ) { XG = 0; }
          else XG = (int)xx;
    return XG;
  }

   public int YGra( double y ) {
   double yy;
   int YG;
   yy = gymax-( y - ymin )*( gymax-gymin )/( ymax-ymin );
   if ( yy > 400 ) { YG = 400; }
   else if ( yy < 0 ) { YG = 0; }
         else YG = (int)yy;
   return YG;}

 class  GrPanel extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
     g.setColor(new Color(180, 0, 80));
     g.setFont(new java.awt.Font("SansSerif", 3, 13));
     g.drawString("������:  ",5,15);
     g.drawString("����������� �����������:                                      ������� ��������:",10,40);
     g.drawString(" �������:  ",343,241);
     g.drawString("�������:  ",10,344);
     g.setColor(new Color(0, 0, 80));
     g.setFont(new java.awt.Font("SansSerif", 1, 14));
     g.drawString("����� ������� �������  f(x) ������� ���������",63,15);
     //g.drawString("��������� ",115,35);
     g.setColor(new Color(255, 255, 255));
     g.fillRect(2,45,320,280);  g.fillRect(338,45,184,179);g.fillRect(338,245,184,82);g.fillRect(2,347,524,82);
     g.setColor(new Color(157, 187, 255));
     g.drawRect(2,45,320,280);  g.drawRect(338,45,184,179);g.drawRect(338,245,184,82);g.drawRect(2,347,524,82);
  //���
    int i,mash_x,mash_y;
    int x0=30,y0=230,x1=260,y1=150;
   if (sh>=1) {
     g.setColor(Color.black);
     g.drawLine(15,310,310,310);
     g.drawLine(304,313,310,310);
     g.drawLine(304,307,310,310);
     g.drawLine(20,60,20,315);
     g.drawLine(20,60,17,66);
     g.drawLine(20,60,23,66);
     g.setFont(new java.awt.Font("SansSerif", 1, 12));
     g.drawString("x",310,305);
     g.drawString("f",25,62);
     g.setColor(new Color(0, 30, 143));
    mash_x=(int)(x1-x0)/10;
    mash_y=(int)(y0-y1+20)/80;
    for (i=0;i<x1;i++)
     g.drawLine(x0+i,(int)(y0-f(i*1.0/mash_x)*mash_y),(x0+1)+i,(int)(y0-f((i+1)*1.0/mash_x)*mash_y));
    g.setColor(Color.gray);
    for (i=5;i<=9;i++)
     g.drawLine(30,153+i*16,30,161+i*16);
    for (i=8;i<=21;i++)
     g.drawLine(290,2+i*14,290,10+i*14);
   }

  //�������
     g.setColor(new Color(0, 0, 80));
     g.setFont(new java.awt.Font("SansSerif", 1, 14));
     g.drawString("\u03B5",350,155);
     Ind_n(g,"L"," 0",350,70);
     g.setFont(new java.awt.Font("SansSerif", 1, 12));
     g.drawString("  -   ���������",370,70);
     g.drawString("�������� ",420,85);
     g.drawString(" ����������������",392,100);
     g.drawString("\u2113   -  ���������� �����",350,120);
     g.drawString("��������� ���������",382,135);
     g.drawString("\u03B5   -   ���������",350,155);
     g.drawString(" ������������",419,170);
     g.drawString("N -  ����������",350,190);
     g.drawString("���������� �������",380,205);
     g.drawString("      =         +               (                   )",352,310);
     g.drawString("      =         +               (                   )",352,270);
     Ind_n1(g, "y","k+1",342,270);
     Ind_n1(g, "a", "k+1",377,270);
     Ind_n1(g, "F"," N-k-3",415,260);
     g.drawLine(415,265,449,265);
     g.drawLine(415,266,449,266);
     Ind_n1(g, "F"," N-k-1",416,279);
     Ind_n1(g, "b","k+1",460,270);
     Ind_n1(g, "a", "k+1",491,270);
     Ind_n1(g, "z","k+1",342,310);
     Ind_n1(g, "a", "k+1",377,310);
     Ind_n1(g, "F"," N-k-2",415,300);
     g.drawLine(415,305,449,305);
     g.drawLine(415,306,449,306);
     Ind_n1(g, "F"," N-k-1",416,319);
     Ind_n1(g, "b","k+1",460,310);
     Ind_n1(g, "a", "k+1",491,310);
     g.drawString("- ",485,267);
     g.drawString("- ",485,307);

     g.setColor(Color.red);
     g.setFont(new java.awt.Font("SansSerif", 3, 16));
     g.drawString(sh+". ",10, 365);

     if (sh==2){
      g.setFont(new java.awt.Font("SansSerif", 1, 12));
      g.setColor(Color.red);
     // paintArrow(g,324,251,338,265);

            g.drawLine(324,161,343,180);
            g.drawLine(324,162,343,181);
            ///-----1------
            g.drawLine(334,181,343,181);
            g.drawLine(336,180,343,180);
            g.drawLine(338,179,343,179);
            ///-----2------
            g.drawLine(343,171,343,181);
            g.drawLine(342,173,342,181);
            g.drawLine(341,176,341,181);
      g.drawString("N",350,190);
    }
     if ((sh==3) || (sh==5)){
      g.setFont(new java.awt.Font("SansSerif", 1, 12));
      g.setColor(Color.red);
     // paintArrow(g,324,251,338,265);

            g.drawLine(324,241,343,260);
            g.drawLine(324,242,343,261);
            ///-----1------
            g.drawLine(334,261,343,261);
            g.drawLine(336,260,343,260);
            g.drawLine(338,259,343,259);
            ///-----2------
            g.drawLine(343,251,343,261);
            g.drawLine(342,253,342,261);
            g.drawLine(341,256,341,261);
      g.drawString("      =         +               (                   )",352,270);
      Ind_n1(g, "y","k+1",342,270);
      Ind_n1(g, "a", "k+1",377,270);
      Ind_n1(g, "F"," N-k-3",415,260);
      g.drawLine(415,265,449,265);
      g.drawLine(415,266,449,266);
      Ind_n1(g, "F"," N-k-1",416,279);
      Ind_n1(g, "b","k+1",460,270);
      Ind_n1(g, "a", "k+1",491,270);
      g.drawString("- ",485,267);
}
    if ((sh==8) || (sh==11)){
       g.setFont(new java.awt.Font("SansSerif", 1, 12));
       g.setColor(Color.red);
       //paintArrow(g,324,291,338,305);
            g.drawLine(324,281,343,300);
            g.drawLine(324,282,343,301);
            ///-----1------
            g.drawLine(334,301,343,301);
            g.drawLine(336,300,343,300);
            g.drawLine(338,299,343,299);
            ///-----2------
            g.drawLine(343,291,343,301);
            g.drawLine(342,293,342,301);
            g.drawLine(341,296,341,301);
       g.drawString("      =         +               (                   )",352,310);
       Ind_n1(g, "z","k+1",342,310);
       Ind_n1(g, "a", "k+1",377,310);
       Ind_n1(g, "F"," N-k-2",415,300);
       g.drawLine(415,305,449,305);
       g.drawLine(415,306,449,306);
       Ind_n1(g, "F"," N-k-1",416,319);
       Ind_n1(g, "b","k+1",460,310);
       Ind_n1(g, "a", "k+1",491,310);
       g.drawString("- ",485,307);
      }

     if (sh==1){
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.setColor(Color.red);
      g.drawLine(28,310,290,310);
      Ind_n1(g, "a","0",32,300);
      Ind_n1(g, "b","0",276,300);
      g.drawString("]",289,314);
      g.drawString("[",28,314);
            g.drawLine(326,41,345,60);
            g.drawLine(326,42,345,61);
            ///-----1------
            g.drawLine(336,61,345,61);
            g.drawLine(338,60,345,60);
            g.drawLine(340,59,345,59);
            ///-----2------
            g.drawLine(345,51,345,61);
            g.drawLine(344,53,344,61);
            g.drawLine(343,56,343,61);
     // paintArrow(g,324,51,338,65);
      g.setColor(new Color(0, 0, 80));
      g.setFont(new java.awt.Font("SansSerif",3, 16));
      g.drawString("\u2113 ",10,385);
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.drawString(" ������� ��������� ������        ,    > 0 - ��������� ������������,",30,365);
      Ind_n(g, "L"," 0",250,365);
      g.drawString("\u03B5 ",280,365);
      g.drawString("   > 0 - ���������� ����� �����. ��������� ��� ��������. �������� ",10,385);
      g.drawString("������� f(x).",10,405);
     }
      if (sh==2){
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.setColor(new Color(180, 0, 60));
      g.drawLine(28,310,290,310);
      Ind_n1(g, "a","0",32,300);
      Ind_n1(g, "b","0",276,300);
      g.drawString("]",289,314);
      g.drawString("[",28,314);
      g.setColor(new Color(0, 0, 80));
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.drawString("������ ���������� N ���������� ������� ��� ���������� �����",30,365);
      g.drawString("�����, ��� ������� ����������� �������                , � ����� ���������",10,385);
      g.drawString(" ",10,405);
      Ind_n(g, "F"," N",313,385);
      Ind_n(g, "L"," 0",347,380);
      g.drawString("\u2265",332,385);
      g.drawString(" ,     , ... ,",25,405);
      Ind_n(g, "F"," 0",10,405);
      Ind_n(g, "F"," 1",35,405);
      Ind_n(g, "F"," N",85,405);
      g.setFont(new java.awt.Font("SansSerif",3, 15));
      g.drawString("\u2113 ",355,398);
      g.drawLine(344,384,372,384);
      g.drawLine(344,369,344,381);
      g.drawLine(371,369,371,381);
          }
      if (sh==3){
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.setColor(new Color(180, 0, 60));
      g.drawLine(28,310,290,310);
      Ind_n1(g, "a","0",32,300);
      Ind_n1(g, "b","0",276,300);
      g.drawString("]",289,314);
      g.drawString("[",28,314);
      g.setColor(new Color(0, 0, 203));
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.drawString("y",125,305);
      g.setFont(new java.awt.Font("SansSerif", 1, 10));
      g.fillOval(120,308,5,5);
      for (i=0;i<=4;i++)
      g.drawLine(122,245+i*14,122,254+i*14);
      g.drawString("0",132,308);
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.setColor(new Color(170, 0, 183));
      g.drawString("z",230,305);
      for (i=4;i<=12;i++)
        g.drawLine(226,133+i*14,226,141+i*14);
      g.setFont(new java.awt.Font("SansSerif", 1, 10));
      g.drawString("0",238,308);
      g.fillOval(224,308,5,5);
      g.setColor(new Color(0, 0, 90));
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.drawString("������� k = 0. ",30,365);
      g.drawString("��������       =     +         (     -     ),      =     +          (     -     )  ",10,385);
      Ind_n(g, "y"," 0",95,385);
      Ind_n(g, "a", "0",125,385);
      Ind_n(g, "F"," N-2",157,375);
      g.drawLine(153,380,183,380);
      g.drawLine(153,381,183,381);
      Ind_n(g, "F"," N",167,399);
      Ind_n(g, "b"," 0",195,385);
      Ind_n(g, "a", "0",220,385);
      Ind_n(g, "z"," 0",250,385);
      Ind_n(g, "a", "0",280,385);
      Ind_n(g, "F"," N-1",312,375);
      g.drawLine(308,380,338,380);
      g.drawLine(308,381,338,381);
      Ind_n(g, "F"," N",322,399);
      Ind_n(g, "b"," 0",353,385);
      Ind_n(g, "a", "0",380,385);
     }
      if (sh==4){
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.setColor(new Color(180, 0, 60));
      g.drawLine(28,310,290,310);
      Ind_n1(g, "a","0",32,300);
      Ind_n1(g, "b","0",276,300);
      g.drawString("]",289,314);
      g.drawString("[",28,314);
      g.setFont(new java.awt.Font("SansSerif", 1, 10));
    //  g.drawString("0",23,238);
      //g.drawString("0",282,238);
      g.setColor(new Color(0, 0, 203));
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.drawString("y",125,305);
      g.setFont(new java.awt.Font("SansSerif", 1, 10));
      g.fillOval(120,308,5,5);
      for (i=0;i<=4;i++)
        g.drawLine(122,245+i*14,122,254+i*14);
      g.drawString("0",132,308);
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.setColor(new Color(170, 0, 183));
      g.drawString("f(z  )",23,183);
       for (i=0;i<=14;i++)
        g.drawLine(27+i*14,188,21+i*14,188);
      g.drawString("z",230,305);
      for (i=0;i<=8;i++)
        g.drawLine(226,188+i*14,226,196+i*14);
      g.setFont(new java.awt.Font("SansSerif", 1, 10));
      g.drawString("0",41,186);
      g.drawString("0",238,308);
      g.fillOval(224,308,5,5);
      g.fillOval(18,187,5,5);
      g.fillOval(223,186,5,5);
      g.setColor(new Color(0, 0, 203));
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.drawString("f(y  )",23,260);
      for (i=0;i<=7;i++)
        g.drawLine(20+i*14,245,28+i*14,245);
      g.setFont(new java.awt.Font("SansSerif", 1, 10));
      g.drawString("0",42,263);
      g.fillOval(120,244,5,5);
      g.fillOval(18,243,5,5);
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
     g.setColor(new Color(0, 0, 90));
      g.drawString("�������� �������� �������  f(     ),   f(     )  � ���������� ������",30,365);
      Ind_n(g, "y","0",265,365);
      Ind_n(g, "z","0",315,365);
      }
    if (sh==5){
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.setColor(new Color(180, 0, 60));
      Ind_n1(g, "a","0",40,297);
      Ind_n1(g, "b","0",276,300);
      g.drawString("]",289,314);
      g.setFont(new java.awt.Font("SansSerif", 1, 10));
      g.setColor(new Color(0, 0, 203));
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.drawString("y",150,298);
      Ind_n(g, "y","1",60,305);
      g.setFont(new java.awt.Font("SansSerif", 1, 10));
      g.fillOval(120,308,5,5);
      g.fillOval(52,238,5,5);
      for (i=0;i<=4;i++)
        g.drawLine(122,245+i*14,122,254+i*14);
      g.drawString("0",157,301);
      for (i=0;i<=4;i++)
        g.drawLine(54,244+i*14,54,253+i*14);
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.setColor(new Color(170, 0, 183));
      Ind_n(g, "z","1",125,298);
      g.drawString("f(z  )",23,183);
     for (i=0;i<=14;i++)
      g.drawLine(27+i*14,188,21+i*14,188);
      g.drawString("z",255,298);
      for (i=0;i<=8;i++)
      g.drawLine(226,188+i*14,226,196+i*14);
      g.setFont(new java.awt.Font("SansSerif", 1, 10));
      g.drawString("0",41,186);
      g.drawString("0",263,301);
      g.fillOval(224,308,5,5);
      g.fillOval(18,187,5,5);
      g.fillOval(223,186,5,5);
      g.setColor(new Color(0, 0, 203));
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.drawString("f(y  )",23,260);
      for (i=0;i<=7;i++)
      g.drawLine(20+i*14,245,28+i*14,245);
      g.setFont(new java.awt.Font("SansSerif", 1, 10));
      g.drawString("0",42,263);
      g.fillOval(120,244,5,5);
      g.fillOval(18,243,5,5);
      g.setColor(Color.red);
      g.drawLine(28,310,230,310);
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      Ind_n(g, "b","1",230,298);
      Ind_n(g, "a","1",22,298);
      g.drawString("[",28,314);
      g.drawString("]",224,314);
      g.setColor(Color.black);
      g.drawString("=",32,298);
      g.drawString("=",244,298);
      g.drawString("=",140,298);
      g.setColor(new Color(0, 0, 90));
      g.drawString("�������   f(     )  c  f(     ) : ",30,365);
      Ind_n(g, "y","0",123,365);
      Ind_n(g, "z","0",182,365);
      g.drawString("f(    ) < f(    ),  �������        =     ,       =     ,      =     ,       =      +            (     -     )",10,385);
      Ind_n(g, "y","0",20,385);
      Ind_n(g, "z","0",68,385);
      Ind_n(g, "a","1",181,385);
      Ind_n(g, "a","0",210,385);
      Ind_n(g, "b","1",243,385);
      Ind_n(g, "z","0",270,385);
      Ind_n(g, "y","0",327,385);
      Ind_n(g, "z","1",295,385);
      Ind_n(g, "y","1",358,385);
      Ind_n(g, "a", " 1",388,385);
      Ind_n(g, "F"," N-k-3",418,373);
      g.drawLine(418,380,453,380);
      g.drawLine(418,379,453,379);
      Ind_n(g, "F"," N-k-1",418,395);
      Ind_n(g, "b"," 1",468,385);
      Ind_n(g, "a", " 1",495,385);
      }
     if (sh==6){
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.setColor(Color.red);
      g.drawLine(28,310,230,310);
      Ind_n(g, "b","1",230,298);
      Ind_n(g, "a","1",22,298);
      g.drawString("[",28,314);
      g.drawString("]",225,314);
      g.setColor(new Color(180, 0, 60));
      Ind_n1(g, "b","0",276,300);
      g.drawString("]",289,314);
      g.setColor(new Color(0, 0, 203));
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      Ind_n(g, "y","1",60,305);
      g.setFont(new java.awt.Font("SansSerif", 1, 10));
      g.fillOval(52,238,5,5);
      g.fillOval(52,308,5,5);
      for (i=0;i<=4;i++)
        g.drawLine(54,244+i*14,54,253+i*14);
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.setColor(new Color(170, 0, 183));
      Ind_n(g, "z","1",125,305);
      for (i=0;i<=4;i++)
        g.drawLine(122,245+i*14,122,254+i*14);
      g.fillOval(120,244,5,5);
      g.fillOval(120,308,5,5);
      g.setColor(Color.gray);
      for (i=0;i<=8;i++)
      g.drawLine(227,188+i*14,227,196+i*14);
      g.setColor(new Color(0, 0, 90));
      g.drawString("�������� ������� ���������          =      -             �     k    N - 3,  ",30,365);
      Ind_n(g, "L"," 2",270,365);
      Ind_n(g, "b"," 1",304,365);
      Ind_n(g, "a"," 1",333,365);
      g.drawString("�����   k = k + 1 = 0 + 1 = 1 ",10,385);
      g.drawString("\u2260 ",415,365);
     }
     if (sh==7){
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.setColor(new Color(180, 0, 60));
      g.drawLine(28,310,230,310);
      Ind_n(g, "b","1",230,298);
      Ind_n(g, "a","1",22,298);
      g.drawString("[",28,314);
      g.drawString("]",225,314);
      Ind_n1(g, "b","0",276,300);
      g.drawString("]",289,314);
      g.setColor(new Color(0, 0, 203));
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      Ind_n(g, "y","1",60,305);
      g.drawString("f(y  )",23,230);
      for (i=0;i<=2;i++)
      g.drawLine(20+i*14,240,28+i*14,240);
      g.setFont(new java.awt.Font("SansSerif", 1, 10));
      g.drawString("1",42,233);
      g.fillOval(52,238,5,5);
      g.fillOval(52,308,5,5);
      g.fillOval(18,238,5,5);
      for (i=0;i<=4;i++)
       g.drawLine(54,244+i*14,54,253+i*14);
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.setColor(new Color(170, 0, 183));
      Ind_n(g, "z","1",125,305);
      for (i=0;i<=4;i++)
        g.drawLine(122,245+i*14,122,254+i*14);
      g.fillOval(120,244,5,5);
      g.fillOval(120,308,5,5);
      g.drawString("f(z  )",23,260);
      for (i=0;i<=7;i++)
      g.drawLine(20+i*14,245,28+i*14,245);
      g.setFont(new java.awt.Font("SansSerif", 1, 10));
      g.drawString("1",42,263);
      g.fillOval(120,244,5,5);
      g.fillOval(18,243,5,5);
      g.setColor(Color.gray);
      for (i=0;i<=8;i++)
      g.drawLine(227,188+i*14,227,196+i*14);
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.setColor(new Color(0, 0, 90));
      g.drawString("�������� �������e �������  f(     ), �  ��������   f(     ) = f(     )",30,365);
      Ind_n(g, "y","1",265,365);
      Ind_n(g, "z","1",400,365);
      Ind_n(g, "y","0",450,365);
      g.drawString("���� ������� �����. ",10,385);
   }
      if (sh==8){
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.setColor(new Color(180, 0, 60));
      g.drawLine(28,310,230,310);
      Ind_n(g, "a","1",22,298);
      g.drawString("[",28,314);
      Ind_n1(g, "b","1",254,298);
      Ind_n1(g, "b","0",276,300);
      g.drawString("]",289,314);
      g.setColor(new Color(0, 0, 203));
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      Ind_n(g, "y","1",80,298);
      Ind_n(g, "y","2",125,298);
      g.drawString("f(y  )",23,230);
      for (i=0;i<=2;i++)
      g.drawLine(20+i*14,240,28+i*14,240);
      g.setFont(new java.awt.Font("SansSerif", 1, 10));
      g.drawString("1",42,233);
      g.fillOval(52,238,5,5);
      g.fillOval(52,308,5,5);
      g.fillOval(18,238,5,5);
      for (i=0;i<=4;i++)
       g.drawLine(54,244+i*14,54,253+i*14);
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.setColor(new Color(170, 0, 183));
      Ind_n(g, "z","1",150,298);
      for (i=0;i<=4;i++)
        g.drawLine(122,245+i*14,122,254+i*14);
      g.fillOval(120,244,5,5);
      g.fillOval(120,308,5,5);
      Ind_n(g, "z","2",185,298);
      for (i=0;i<=5;i++)
        g.drawLine(182,223+i*14,182,232+i*14);
      g.fillOval(180,308,5,5);
      g.fillOval(180,220,5,5);
      g.drawString("f(z  )",23,260);
      for (i=0;i<=7;i++)
      g.drawLine(20+i*14,245,28+i*14,245);
      g.setFont(new java.awt.Font("SansSerif", 1, 10));
      g.drawString("1",42,263);
      g.fillOval(120,244,5,5);
      g.fillOval(18,243,5,5);
      g.setColor(Color.gray);
      for (i=0;i<=8;i++)
      g.drawLine(227,188+i*14,227,196+i*14);
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.setColor(Color.black);
      g.drawString("=",70,298);
      g.drawString("=",244,298);
      g.drawString("=",140,298);
      g.setColor(Color.red);
      g.drawLine(52,310,230,310);
      g.drawString("[",52,314);
      g.drawString("]",225,314);
      Ind_n(g, "b","2",230,298);
      Ind_n(g, "a","2",55,298);
      g.setColor(new Color(0, 0, 90));
      g.drawString("�������   f(     )  c  f(     ) : ",30,365);
      Ind_n(g, "y","1",120,365);
      Ind_n(g, "z","1",179,365);
      g.drawString("f(    ) > f(    ),  �������        =     ,       =     ,       =     ,       =      +             (     -     )",10,385);
      Ind_n(g, "y","1",22,385);
      Ind_n(g, "z","1",68,385);
      Ind_n(g, "a","2",181,385);
      Ind_n(g, "y","1",210,385);
      Ind_n(g, "b","2",243,385);
      Ind_n(g, "b","1",270,385);
      Ind_n(g, "z","1",330,385);
      Ind_n(g, "y","2",303,385);
      Ind_n(g, "z","2",362,385);
      Ind_n(g, "a", " 2",392,385);
      Ind_n(g, "F"," N-k-2",420,375);
      g.drawLine(420,380,463,380);
      g.drawLine(420,381,463,381);
      Ind_n(g, "F"," N-k-1",420,395);
      Ind_n(g, "b"," 2",478,385);
      Ind_n(g, "a", " 2",502,385);
     }
     if (sh==9){
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.setColor(new Color(180, 0, 60));
      g.drawLine(28,310,230,310);
      Ind_n(g, "a","1",22,298);
      g.drawString("[",28,314);
      Ind_n1(g, "b","1",254,298);
      Ind_n1(g, "b","0",276,300);
      g.drawString("]",289,314);
      g.setColor(new Color(0, 0, 203));
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      Ind_n(g, "y","2",125,298);
      for (i=0;i<=4;i++)
        g.drawLine(122,245+i*14,122,254+i*14);
      g.fillOval(120,244,5,5);
      g.fillOval(120,308,5,5);
      g.setColor(new Color(170, 0, 183));
      Ind_n(g, "z","2",185,298);
      for (i=0;i<=5;i++)
        g.drawLine(182,223+i*14,182,232+i*14);
      g.fillOval(180,308,5,5);
      g.fillOval(180,220,5,5);
      g.setColor(Color.red);
      g.drawLine(52,310,230,310);
      g.drawString("[",52,314);
      g.drawString("]",225,314);
      Ind_n(g, "b","2",230,298);
      Ind_n(g, "a","2",55,298);
      g.setColor(Color.gray);
      for (i=0;i<=4;i++)
       g.drawLine(54,240+i*14,54,249+i*14);
       for (i=0;i<=8;i++)
      g.drawLine(227,188+i*14,227,196+i*14);
      g.setColor(Color.black);
      g.drawString("=",244,298);
      g.setColor(new Color(0, 0, 90));
      g.drawString("�������� ������� ���������          =       -             �     k    N - 3,  ",30,365);
      Ind_n(g, "L"," 3",270,365);
      Ind_n(g, "b"," 2",304,365);
      Ind_n(g, "a"," 2",333,365);
      g.drawString("�����   k = k + 1 = 1 + 1 = 2 ",10,385);
      g.drawString("\u2260 ",420,365);

     }

    if (sh==10){
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.setColor(new Color(180, 0, 60));
      g.drawLine(28,310,230,310);
      Ind_n(g, "a","1",22,298);
      g.drawString("[",28,314);
      Ind_n1(g, "b","1",254,298);
      Ind_n1(g, "b","0",276,300);
      g.drawString("]",289,314);
      g.setColor(new Color(0, 0, 203));
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      Ind_n(g, "y","2",125,298);
      for (i=0;i<=4;i++)
        g.drawLine(122,245+i*14,122,254+i*14);
      g.fillOval(120,244,5,5);
      g.fillOval(120,308,5,5);
      g.drawString("f(y  )",23,260);
      for (i=0;i<=7;i++)
      g.drawLine(20+i*14,245,28+i*14,245);
      g.setFont(new java.awt.Font("SansSerif", 1, 10));
      g.drawString("2",42,263);
      g.fillOval(18,243,5,5);
      g.setColor(new Color(170, 0, 183));
      Ind_n(g, "z","2",185,298);
      for (i=0;i<=5;i++)
        g.drawLine(182,223+i*14,182,232+i*14);
      g.fillOval(180,308,5,5);
      g.fillOval(180,220,5,5);
      g.drawString("f(z  )",23,215);
      for (i=0;i<=11;i++)
      g.drawLine(20+i*14,222,28+i*14,222);
      g.setFont(new java.awt.Font("SansSerif", 1, 10));
      g.drawString("2",42,218);
      g.fillOval(18,220,5,5);
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.setColor(Color.red);
      g.drawLine(52,310,230,310);
      g.drawString("[",52,314);
      g.drawString("]",225,314);
      Ind_n(g, "b","2",230,298);
      Ind_n(g, "a","2",55,298);
      g.setColor(Color.gray);
      for (i=0;i<=4;i++)
       g.drawLine(54,240+i*14,54,249+i*14);
       for (i=0;i<=8;i++)
      g.drawLine(227,188+i*14,227,196+i*14);
      g.setColor(Color.black);
      g.drawString("=",244,298);
      g.setColor(new Color(0, 0, 90));
      g.drawString("�������� �������e �������  f(    ), �  ��������   f(     ) = f(     ) ",40,365);
      Ind_n(g, "z","2",270,365);
      Ind_n(g, "y","2",405,365);
      Ind_n(g, "z","1",455,365);
      g.drawString("���� ������� �����. ",10,385);

      }
       if (sh==11){
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.setColor(new Color(180, 0, 60));
      Ind_n(g, "a","1",22,298);
      g.drawString("[",28,314);
      Ind_n1(g, "b","0",276,300);
      g.drawString("]",289,314);
      g.drawString("]",225,314);
      Ind_n(g, "b","2",230,298);
      Ind_n(g, "a","2",76,298);
      g.setColor(new Color(0, 0, 203));
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      Ind_n(g, "y","2",150,298);
      Ind_n(g, "y","3",100,298);
      for (i=0;i<=4;i++)
        g.drawLine(122,245+i*14,122,254+i*14);
      g.fillOval(120,244,5,5);
      g.fillOval(120,308,5,5);
      for (i=0;i<=4;i++)
        g.drawLine(117,245+i*14,117,254+i*14);
      g.fillOval(115,244,5,5);
      g.fillOval(115,308,5,5);
      g.drawString("f(y  )",23,260);
      for (i=0;i<=7;i++)
      g.drawLine(20+i*14,245,28+i*14,245);
      g.setFont(new java.awt.Font("SansSerif", 1, 10));
      g.drawString("2",42,263);
      g.fillOval(18,243,5,5);
      g.setColor(new Color(170, 0, 183));
      Ind_n(g, "z","2",210,298);
      Ind_n(g, "z","3",125,298);
      for (i=0;i<=5;i++)
        g.drawLine(182,223+i*14,182,232+i*14);
      g.fillOval(180,308,5,5);
      g.fillOval(180,220,5,5);
      g.drawString("f(z  )",23,215);
      for (i=0;i<=11;i++)
      g.drawLine(20+i*14,222,28+i*14,222);
      g.setFont(new java.awt.Font("SansSerif", 1, 10));
      g.drawString("2",42,218);
      g.fillOval(18,220,5,5);
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.setColor(Color.red);
      g.drawLine(52,310,180,310);
      g.drawString("[",52,314);
      g.drawString("]",181,314);
      Ind_n(g, "b","3",185,298);
      Ind_n(g, "a","3",55,298);
      g.setColor(Color.gray);
      for (i=0;i<=4;i++)
       g.drawLine(54,240+i*14,54,249+i*14);
       for (i=0;i<=8;i++)
      g.drawLine(227,188+i*14,227,196+i*14);
      g.setColor(Color.black);
      g.drawString("=",199,298);
      g.drawString("=",69,298);
      g.drawString("=",139,298);
      g.setColor(new Color(0, 0, 90));
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.drawString("�������   f(    )  c  f(    ) : ",40,365);
      Ind_n(g, "y","2",127,365);
      Ind_n(g, "z","2",183,365);
      g.drawString("f(    ) > f(    ),  �������        =     ,       =     ,       =     ,       =      +             (     -     )",10,385);
      Ind_n(g, "y","2",22,385);
      Ind_n(g, "z","2",68,385);
      Ind_n(g, "a","3",181,385);
      Ind_n(g, "y","2",210,385);
      Ind_n(g, "b","3",243,385);
      Ind_n(g, "b","2",270,385);
      Ind_n(g, "z","2",330,385);
      Ind_n(g, "y","3",303,385);
      Ind_n(g, "z","3",362,385);
      Ind_n(g, "a", "3",392,385);
      Ind_n(g, "F"," N-k-3",420,375);
      g.drawLine(420,380,463,380);
      g.drawLine(420,381,463,381);
      Ind_n(g, "F"," N-k-1",420,395);
      Ind_n(g, "b"," 3",478,385);
      Ind_n(g, "a", " 3",502,385);
      }
      if (sh==12){
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.setColor(new Color(180, 0, 60));
      Ind_n(g, "a","1",22,298);
      g.drawString("[",28,314);
      Ind_n1(g, "b","0",276,300);
      g.drawString("]",289,314);
      g.drawString("]",225,314);
      Ind_n(g, "b","2",230,298);
      g.setColor(new Color(0, 0, 203));
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      Ind_n(g, "y","4",56,278);
      Ind_n(g, "y","3",80,278);
      for (i=0;i<=4;i++)
        g.drawLine(122,245+i*14,122,254+i*14);
      g.fillOval(120,244,5,5);
      g.fillOval(120,308,5,5);
      for (i=0;i<=4;i++)
        g.drawLine(117,245+i*14,117,254+i*14);
      g.fillOval(115,244,5,5);
      g.fillOval(115,308,5,5);
      g.setColor(new Color(170, 0, 183));
      Ind_n(g, "z","4",125,298);
      Ind_n(g, "z","3",103,278);
      for (i=0;i<=4;i++)
        g.drawLine(122,245+i*14,122,254+i*14);
      g.fillOval(120,244,5,5);
      g.fillOval(120,308,5,5);
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.setColor(Color.red);
      g.drawLine(52,310,180,310);
      g.drawString("[",52,314);
      g.drawString("]",181,314);
      Ind_n(g, "b","3",185,298);
      Ind_n(g, "a","3",55,298);
      g.setColor(Color.gray);
      for (i=0;i<=4;i++)
       g.drawLine(54,240+i*14,54,249+i*14);
       for (i=0;i<=8;i++)
      g.drawLine(227,188+i*14,227,196+i*14);
      for (i=0;i<=5;i++)
        g.drawLine(182,223+i*14,182,232+i*14);
       g.setColor(Color.black);
      g.drawString("=",70,278);
      g.drawString("=",95,278);
      g.setColor(new Color(0, 134, 155));
      g.drawLine(115,312,122,312);
      g.drawLine(117,313,121,313);
      g.drawString("\u03B5 ",115,324);
      g.setColor(new Color(0, 0, 90));
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.drawString("�������� ������� ���������        =      -       �  k = N - 3, ����� ������ ",40,365);
      Ind_n(g, "L"," 4",270,365);
      Ind_n(g, "b"," 3",304,365);
      Ind_n(g, "a"," 3",333,365);
      Ind_n(g, "y"," N-2",10,385);
      Ind_n(g, "z"," N-2",50,385);
      Ind_n(g, "a"," N-2",100,376);
      Ind_n(g, "b"," N-2",142,376);
      g.drawString("+ ",130,378);
      g.drawString("2 ",130,395);
      g.drawLine(100,382,167,382);
      g.drawLine(100,383,167,383);
      g.drawString("        =         =                     , �.�. �����������  �����  ������  ����������",10,385);
      g.drawString("�������. C������ ��������            =         =            �           =         +  ",10,405);
      Ind_n(g, "y"," N-1",225,405);
      Ind_n(g, "y"," N-2",270,405);
      Ind_n(g, "z"," N-2",315,405);
      Ind_n(g, "z"," N-1",385,405);
      Ind_n(g, "y"," N-1",425,405);
      g.drawString("\u03B5 ",470,405);
      }
       if (sh==13){
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.setColor(new Color(180, 0, 60));
      Ind_n(g, "a","1",22,298);
      g.drawString("[",28,314);
      Ind_n1(g, "b","0",276,300);
      g.drawString("]",289,314);
      g.drawString("]",225,314);
      Ind_n(g, "b","2",230,298);
      g.setColor(new Color(0, 0, 203));
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      Ind_n(g, "y","4",56,278);
      Ind_n(g, "y","3",80,278);
      for (i=0;i<=4;i++)
        g.drawLine(122,245+i*14,122,254+i*14);
      g.fillOval(120,244,5,5);
      g.fillOval(120,308,5,5);
      for (i=0;i<=4;i++)
        g.drawLine(117,245+i*14,117,254+i*14);
      g.fillOval(115,244,5,5);
      g.fillOval(115,308,5,5);
      g.setColor(new Color(170, 0, 183));
      Ind_n(g, "z","4",125,298);
      Ind_n(g, "z","3",103,278);
      for (i=0;i<=4;i++)
        g.drawLine(122,245+i*14,122,254+i*14);
      g.fillOval(120,244,5,5);
      g.fillOval(120,308,5,5);
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.setColor(Color.red);
      g.drawLine(52,310,180,310);
      g.drawString("[",52,314);
      g.drawString("]",181,314);
      Ind_n(g, "b","3",185,298);
      Ind_n(g, "a","3",55,298);
      g.setColor(Color.gray);
      for (i=0;i<=4;i++)
       g.drawLine(54,240+i*14,54,249+i*14);
       for (i=0;i<=8;i++)
      g.drawLine(227,188+i*14,227,196+i*14);
      for (i=0;i<=5;i++)
        g.drawLine(182,223+i*14,182,232+i*14);
       g.setColor(Color.black);
      g.drawString("=",70,278);
      g.drawString("=",95,278);
      g.setColor(new Color(0, 134, 155));
      g.drawLine(115,312,122,312);
      g.drawLine(117,313,121,313);
      g.drawString("\u03B5 ",115,324);
      g.setColor(new Color(0, 0, 90));
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      Ind_n(g, "y"," 3",247,367);
      Ind_n(g, "z"," 3",282,367);
      Ind_n(g, "a"," 3",320,360);
      Ind_n(g, "b"," 3",355,360);
      g.drawString("+ ",340,360);
      g.drawString("2 ",340,379);
      g.drawLine(320,366,370,366);
      g.drawLine(320,365,370,365);
      g.drawString("� ����� ������ �������          =       =                 ,             =      =         � ",40,365);
      Ind_n(g, "y"," 4",410,365);
      Ind_n(g, "y"," 3",445,365);
      Ind_n(g, "z"," 3",475,365);
      g.drawString("    =      + ",15,385);
      Ind_n(g, "z"," 4",10,385);
      Ind_n(g, "y"," 4",45,385);
      g.drawString("\u03B5 ",75,385);
     }
       if (sh==14){
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.setColor(new Color(180, 0, 60));
      g.drawString("[",28,314);
      g.drawString("]",289,314);
      Ind_n(g, "b","3",185,298);
      g.drawString("]",181,314);
      Ind_n(g, "a","3",58,298);
      g.setColor(new Color(0, 0, 203));
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      Ind_n(g, "y","4",103,298);
      for (i=0;i<=4;i++)
        g.drawLine(122,245+i*14,122,254+i*14);
      g.fillOval(120,244,5,5);
      g.fillOval(120,308,5,5);
      for (i=0;i<=4;i++)
      g.drawLine(117,245+i*14,117,254+i*14);
      g.fillOval(115,244,5,5);
      g.fillOval(115,308,5,5);
      g.drawString("f(y  )",23,260);
      for (i=0;i<=7;i++)
      g.drawLine(20+i*14,245,28+i*14,245);
      g.setFont(new java.awt.Font("SansSerif", 1, 10));
      g.drawString("4",42,263);
      g.fillOval(18,243,5,5);
      g.setColor(new Color(170, 0, 183));
      Ind_n(g, "z","4",148,298);
      for (i=0;i<=4;i++)
        g.drawLine(122,245+i*14,122,254+i*14);
      g.fillOval(120,244,5,5);
      g.fillOval(120,308,5,5);
      g.drawString("f(z  )",23,240);
      for (i=0;i<=6;i++)
      g.drawLine(25+i*14,243,33+i*14,243);
      g.setFont(new java.awt.Font("SansSerif", 1, 10));
      g.drawString("4",42,243);
      g.fillOval(18,241,5,5);
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.setColor(Color.red);
      g.drawLine(52,310,122,310);
      g.drawString("[",52,314);
      g.drawString("]",120,314);
      Ind_n(g, "a","4",35,298);
      Ind_n(g, "b","4",125,298);
      g.setColor(Color.gray);
      for (i=0;i<=4;i++)
       g.drawLine(54,240+i*14,54,249+i*14);
      for (i=0;i<=5;i++)
        g.drawLine(182,223+i*14,182,232+i*14);
      g.setColor(Color.black);
      g.drawString("=",50,298);
      g.drawString("=",139,298);
      g.setColor(new Color(0, 0, 90));
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.drawString("�������� �������� ������� f(     ),  f(     ) � ���������� ������ �",40,365);
      Ind_n(g, "y","4",267,365);
      Ind_n(g, "z","4",315,365);
      g.drawString("������ ������� ��������� ���������:  f(     ) <= f(     ), ",10,385);
      g.drawString("�������         =      ,       = ",10,405);
      Ind_n(g, "y","4",370,385);
      Ind_n(g, "z","4",310,385);
      Ind_n(g, "a"," 4",90,405);
      Ind_n(g, "a"," 3",120,405);
      Ind_n(g, "b"," 4",158,405);
      Ind_n(g, "z"," 3",188,405);
      }
    if (sh==15){
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.setColor(new Color(180, 0, 60));
      g.drawString("[",28,314);
      g.drawString("]",289,314);
      g.setColor(Color.red);
      g.drawLine(52,310,122,310);
      g.drawString("[",52,314);
      g.drawString("]",120,314);
      Ind_n(g, "a","4",35,298);
      Ind_n(g, "b","4",125,298);
      Ind_v(g, "x"," *",90,298);
      for (i=0;i<=4;i++)
        g.drawLine(88,248+i*14,88,257+i*14);
      g.fillOval(85,308,6,6);
      g.setColor(Color.gray);
      for (i=0;i<=4;i++)
       g.drawLine(54,240+i*14,54,249+i*14);
      for (i=0;i<=4;i++)
        g.drawLine(122,245+i*14,122,254+i*14);
     g.setColor(new Color(0, 0, 90));
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.drawString("������� ������ �����������        =        -        <        �          [      ,       ] .",40,365);
      Ind_n(g, "L"," N",266,365);
      Ind_n(g, "b"," N-1",295,365);
      Ind_n(g, "a"," N-1",333,365);
      Ind_v(g, "x"," *",425,365);
      Ind_n(g, "a"," 4",457,365);
      Ind_n(g, "b"," 4",485,365);
      g.drawString("� �������� ������������� ������� ����� ����� ����� ����� ",10,385);
      g.drawString("���������� ���������, ��������, ��� �������� :       =        .",10,405);
      Ind_n(g, "b"," 4",430,397);
      Ind_v(g, "x"," *",370,405);
      g.drawString(" + ",415,397);
      Ind_n(g, "a"," 4",400,397);
      g.drawString(" 2 ",415,418);
      g.drawLine(402,402,442,402);
      g.drawLine(402,403,442,403);
      g.setFont(new java.awt.Font("SansSerif",3, 15));
      g.drawString("\u2113 ",375,365);
      g.setFont(new java.awt.Font("SansSerif",1, 12));
      g.drawString("\u0404 ",438,365);
      }
   }
  }
   void jButton3_actionPerformed(ActionEvent e) {
    if (sh <15)
    {
     sh++;
    repaint();
   }
}
  void jButton1_actionPerformed(ActionEvent e) {
    if (sh > 1)
    sh--;
    repaint();
  }

  void jButton2_actionPerformed(ActionEvent e) {
    sh=1;
    repaint();
  }

 /* void jPanel1_mouseMoved(MouseEvent e) {
   jLabel2.setText(""+e.getX());jLabel3.setText(""+e.getY());
  }*/
}