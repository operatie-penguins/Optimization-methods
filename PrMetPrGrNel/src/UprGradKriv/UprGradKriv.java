package UprGradKriv;

import java.awt.*;
import java.lang.*;
import java.math.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;




public class UprGradKriv extends JApplet {
  Panel_Paint myjPanel= new Panel_Paint();
   // Colors
   public static Color cvBtn=new Color(220,230,255),cvBody=new Color(247,247,255),
       cvFrame=new Color(255,255,255),cvRamFr=new Color(157,187,255),
       cvRamBod=new Color(8,83,184),cvGraph=new Color(0,0,220),
       cvg1x=Color.green, cvg2x=Color.orange, cvg3x=Color.magenta, cvg4x=Color.blue;
   // Fonts
   public static String titleFont="Dialog"; public static Color cvTitleFont=new Color(180, 0, 80);
                   public static int styleTitleFont=3,sizeTitleFont=12;
  public static String titleUprFont="Dialog"; public static Color cvTitleUprFont=new Color(130, 0, 80);
                   public static int styleTitleUprFont=1,sizeTitleUprFont=17;
  public static String textFont="Dialog"; public static Color cvTextFont=new Color(0, 0, 80);
                   public static int styleTextFont=1,sizeTextFont=14;

   // Body size
  int aBody=562,bBody=567;

   // Graph Location
  public static int xGraph=24,yGraph=102,aGraph=290,bGraph=255;

   // Values Location
  int xVal=332,yVal=102,aVal=206,bVal=88;

   // Formules Location
  int xForm=332,yForm=210,aForm=206,bForm=88;

   // Proportion Location
  int xProp=362,yProp=320,aProp=156,bProp=37;

   // Solving Location
  int xSolv=24,ySolv=376,aSolv=514,bSolv=140;


   // Function Parameters
  public static int A,B,C,Cx,Cy,K,M;


  public static double x1click=100, x2click=100; int shtr=0;

  // Determine variables
 static int step=0,maxStep=92,ki=0,maxKi=5,fl=0,kStep=0;

 double xi[]=new double [maxKi+5],yi[]=new double [maxKi+5],eps1=-0.001,eps2=0.5,teta=1.0;
 public static double a11[]=new double [maxKi+5],a12[]=new double [maxKi+5],
     a21[]=new double [maxKi+5],a22[]=new double [maxKi+5];  // ����������� �� ���� ���-�� - ������� �
 public static double a_1[]=new double [maxKi+5],a_2[]=new double [maxKi+5];  // ����������� �� ������ ���-�
 public static int nom[]=new int [maxKi+5],nom1[]=new int [maxKi+5],nom2[]=new int [maxKi+5], posch[]=new int [maxKi+5];  // ������ � ���-�� �������� ���-���
 double tf,tg1,tg2,tg3,tg4,tmin[]=new double [maxKi+5]; // ����
 public static double d_1[]=new double [maxKi+5],d_2[]=new double [maxKi+5],
     dg_1[]=new double [maxKi+5],dg_2[]=new double [maxKi+5];  // ������


  public static double a1=1.0, b1=0, c1=0;    public static int g1=1,en1=-1; // x1=a1(x2-c1)^2+b1

  public static double a2=1.0, b2=-2,c2=4;    public static int g2=1,en2=-1;// x2=a2(x1-c2)^2+b2

  public static double a3=2.0,b3=-1,c3=4;    public static int g3=1,en3=-1;// x2=kp(x1-cp)+bp

  public static double a4=-1.0,b4=-1,c4=4;   public static int g4=1,en4=-1;// x2=kp(x1-cp)+bp



  int mstk1=0; boolean exit=false;

  double x1_pr=0,x2_pr=0;
   // OX, OY Parameters
  public static int x0,dx0,y0,dy0,m,acc;


   // Objects
  JButton jBtnNext = new JButton();
  JButton jBtnRefresh = new JButton();
  JButton jBtnPlus = new JButton();
  JButton jBtnMinus = new JButton();
  JButton jBtnLeft = new JButton();
  JButton jBtnRight = new JButton();
  JButton jBtnDown = new JButton();
  JButton jBtnUp = new JButton();
  JSlider jSldrA = new JSlider();
  JSlider jSldrB = new JSlider();
  JSlider jSldrCy = new JSlider();
  JSlider jSldrCx = new JSlider();
  JSlider jSldrK = new JSlider();
  JSlider jSldrM = new JSlider();
  JSlider jsldra1 = new JSlider();
  JSlider jsldrb1 = new JSlider();
  JSlider jsldrc1 = new JSlider();
  JCheckBox jchb_g1 = new JCheckBox();
  JCheckBox jchb_g2 = new JCheckBox();
  JCheckBox jchb_g3 = new JCheckBox();
  JCheckBox jchb_g4 = new JCheckBox();
  JButton jbtnPrevious = new JButton();
  JSlider jsldrTeta = new JSlider();

  class Panel_Paint extends JPanel{
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      Stringer.setGraphics(g);
      // Border painting
      g.setColor(cvRamBod);
      g.drawRect(0,0,aBody-1,bBody-1);
      g.drawRect(1,1,aBody-3,bBody-3);
      g.drawRect(5,5,aBody-11,bBody-11);
      g.drawRect(4,4,aBody-9,bBody-9);
       // Frames painting
      g.setColor(cvFrame);
      g.fillRect(xGraph,yGraph,aGraph,bGraph);
      g.fillRect(xVal,yVal,aVal,bVal);
      g.fillRect(xForm,yForm,aForm,bForm);
      g.fillRect(xProp,yProp,aProp,bProp);
      g.fillRect(xSolv,ySolv,aSolv,bSolv);
      g.setColor(cvRamFr);
      g.drawRect(xGraph,yGraph,aGraph,bGraph);
      g.drawRect(xVal,yVal,aVal,bVal);
      g.drawRect(xForm,yForm,aForm,bForm);
      g.drawRect(xProp,yProp,aProp,bProp);
      g.drawRect(xSolv,ySolv,aSolv,bSolv);
       // Title
      g.setColor(cvTitleUprFont);
      g.setFont(new java.awt.Font(titleUprFont, styleTitleUprFont, sizeTitleUprFont));
      g.drawString("������",aBody/2-70,25);
       // Frame's titles writing
      g.setColor(cvTitleFont);
      g.setFont(new java.awt.Font(titleFont,styleTitleFont,sizeTitleFont));
      g.drawString("����������� �����������:",xGraph+10,yGraph-3);
      g.drawString("�������:",xSolv+10,ySolv-3);
      g.drawString("��������:",xVal+10,yVal-3);
      g.drawString("�������:  ",xForm+10,yForm-3);
      g.drawString("�������:  ",xProp+10,yProp-3);
      g.drawString("������:",xGraph+10,yGraph-60);
       // Problem
      g.setColor(cvTextFont);
      Stringer.fonts[0] = new Font(textFont, styleTextFont, sizeTextFont);
      Stringer.fonts[1] = new Font(textFont, styleTextFont, sizeTextFont-2);
      Stringer.fonts[2] = new Font(textFont, styleTextFont, sizeTextFont-2);
      g.setFont(new java.awt.Font(textFont, styleTextFont, sizeTextFont-2));
      g.drawString("����� ������� ������� f(x) ������� �������� ���������",xGraph+65,yGraph-60);
      //g.drawString("������������ ������",xGraph+180,yGraph-23);
      // Formules
      g.setColor(cvTextFont);
      TemplateUM.drawFormula(g,"x^{0} = ( "+xi[0]+"; "+yi[0]+" )^{T}",340,120);
      TemplateUM.drawFormula(g,"\u03B5_{1} = "+eps1,340,140);
      TemplateUM.drawFormula(g,"\u03B5_{2} = "+eps2,340,160);
      TemplateUM.drawFormula(g,"M = "+maxKi,340,180);


      g.drawString("- ���. �����",340+getW("x0 = ( "+xi[0]+"; "+yi[0]+" )T ",g),120);
      g.drawString("- ����� ��������",340+getW("M = 3 ",g),180);
      g.drawString("- ����� �����",340+getW("\u03B51 = "+eps1,g),140);
      g.drawString("- ����� �����",340+getW("\u03B52 = "+eps2,g),160);

      TemplateUM.drawFormula(g,"x^{k+1} = x^{k} + t_{k}\u2206x^{k}", 340, 230);
      TemplateUM.drawFormula(g,
          "\u2206x^{k} = - [E - A_{k}^{T}(A_{k}A_{k}^{T})^{-1}A_{k}]\u2207f(x^{k})",
          340, 250);
      TemplateUM.drawFormula(g, "\u03BB^{k} = - (A_{k}A_{k}^{T})^{-1}A_{k}\u2207f(x^{k})  \u2265 0", 340, 290);
      TemplateUM.drawFormula(g, "\u2206\u011F(x^{k})=\u2206x^{k}+\u0398\u2207f(x^{k});  \u007C\u007C \u2206x^{k}\u007C\u007C\u2264 \u03B5_{2}", 340, 270);

    //  g.drawString("teta = "+teta,500,500);


      //-------------------


       // Function writing
      g.setColor(cvTextFont);
      Stringer.fonts[0] = new Font(textFont, styleTextFont, sizeTextFont-2);
      Stringer.fonts[1] = new Font(textFont, styleTextFont, sizeTextFont-6);
      Stringer.fonts[2] = new Font(textFont, styleTextFont, sizeTextFont-6);
      Stringer.drawString(Count_Functions.strFunction(1)+"     ��� ������������   g_{i}(x) \u2264 0",xGraph+20,yGraph-42);
      g.setColor(cvTextFont);
      String s="";
      if(g1==0) s+="   g_{1}(x) =" + Count_Functions.gx(1);if(g2==0) s+="   g_{2}(x) =" + Count_Functions.gx(2);
      if(g3==0) s+="   g_{3}(x) =" + Count_Functions.gx(3); if(g4==0) s+="   g_{4}(x) =" + Count_Functions.gx(4);
      Stringer.drawString(""+s,xGraph+20,yGraph-22);



      if(exit){
        step=92; exit=false;
      }
jsldrTeta.setVisible(false);
      if(step==2||step==3||step==4||step==5)
      {
        if(step!=2&&g1!=1) Paint_Functions.parab(g,a1/m,b1*m,c1*m,1,1,cvg1x);
        if(step!=2&&step!=3&&g2!=1)Paint_Functions.parab(g,a2/m,b2*m,c2*m,2,1,cvg2x);
        if(step!=2&&step!=3&&step!=4&&g3!=1)Paint_Functions.linex(g,a3,b3*m,c3*m,1,cvg3x);

      }
      if(step>=6)
      {
        Paint_Functions.fillobl(g,new Color(255,240,255));
        if(g1!=1)Paint_Functions.parab(g,a1/m,b1*m,c1*m,1,1,new Color(230,230,230));
        if(g2!=1)Paint_Functions.parab(g,a2/m,b2*m,c2*m,2,1,new Color(230,230,230));
        if(g3!=1)Paint_Functions.linex(g,a3,b3*m,c3*m,1,new Color(230,230,230));
        if(g4!=1)Paint_Functions.linex(g,a4,b4*m,c4*m,1,new Color(230,230,230));

      }

      // Graphics painting
     Paint_Functions.Elipse(g,0*m*m);
     Paint_Functions.Elipse(g,2*m*m);
     Paint_Functions.Elipse(g,7*m*m);
     Paint_Functions.Elipse(g,17*m*m);
     Paint_Functions.Elipse(g,30*m*m);
     Paint_Functions.oXoYm(g,m);

     if(step==1)
     {
       if(jchb_g1.isSelected())
         Paint_Functions.parab(g,a1/m,b1*m,c1*m,1,0,new Color(230,230,230));
       if(jchb_g2.isSelected())
         Paint_Functions.parab(g,a2/m,b2*m,c2*m,2,0,new Color(230,230,230));
       if(jchb_g3.isSelected())
         Paint_Functions.linex(g,a3,b3*m,c3*m,0,new Color(230,230,230));
       if(jchb_g4.isSelected())
         Paint_Functions.linex(g,a4,b4*m,c4*m,0,new Color(230,230,230));
     }

       if(step==1)
       {

         g.setColor(cvTitleFont);
         g.setFont(new java.awt.Font(titleFont,styleTitleFont,sizeTitleFont+3));
         g.drawString(""+ki+"."+kStep,xSolv+10,ySolv+20);
         g.setColor(cvTextFont);
         Stringer.fonts[0] = new Font(textFont, styleTextFont, sizeTextFont);
         Stringer.fonts[1] = new Font(textFont, styleTextFont, sizeTextFont-4);
         Stringer.fonts[2] = new Font(textFont, styleTextFont, sizeTextFont-4);
         g.setFont(new java.awt.Font(textFont, styleTextFont, sizeTextFont));
        g.drawString("�������� �����������:",
                     xSolv+45,ySolv+20);
        jchb_g1.setVisible(true);
        jchb_g2.setVisible(true);
        jchb_g3.setVisible(true);
        jchb_g4.setVisible(true);
       }
      else
      {
        jchb_g1.setVisible(false);
        jchb_g2.setVisible(false);
        jchb_g3.setVisible(false);
        jchb_g4.setVisible(false);

      }
       if(step==0)
       {
        g.setColor(cvTitleFont);
        g.setFont(new java.awt.Font(titleFont,styleTitleFont,sizeTitleFont+3));
        g.drawString(""+ki+"."+kStep,xSolv+10,ySolv+20);
        g.setColor(cvTextFont);
        Stringer.fonts[0] = new Font(textFont, styleTextFont, sizeTextFont);
        Stringer.fonts[1] = new Font(textFont, styleTextFont, sizeTextFont-4);
        Stringer.fonts[2] = new Font(textFont, styleTextFont, sizeTextFont-4);
        g.setFont(new java.awt.Font(textFont, styleTextFont, sizeTextFont));
        g.drawString("A:",xSolv+46,ySolv+82);
        g.drawString("B:",xSolv+46,ySolv+114);
        g.drawString("K:",xSolv+338,ySolv+82);
        g.drawString("M:",xSolv+335,ySolv+114);
        Stringer.fonts[0] = new Font(textFont, styleTextFont, sizeTextFont-2);
        Stringer.fonts[1] = new Font(textFont, styleTextFont, sizeTextFont-6);
        Stringer.fonts[2] = new Font(textFont, styleTextFont, sizeTextFont-6);
        Stringer.drawString("A = "+A+";  C_{1} = "+Cx+";  K = "+K+";",xSolv+40,ySolv+40);
        Stringer.drawString("B = "+B+";  C_{2} = "+Cy+";  M = "+M+";",xSolv+40,ySolv+58);
        g.drawLine(xSolv+30,ySolv+30,xSolv+30,ySolv+58);
        g.drawLine(xSolv+166,ySolv+30,xSolv+166,ySolv+58);
        Stringer.fonts[0] = new Font(textFont, styleTextFont, sizeTextFont);
        Stringer.fonts[1] = new Font(textFont, styleTextFont, sizeTextFont-4);
        Stringer.fonts[2] = new Font(textFont, styleTextFont, sizeTextFont-4);
        Stringer.drawString("C_{1}:",xSolv+184,ySolv+82);
        Stringer.drawString("C_{2}:",xSolv+184,ySolv+114);
        Stringer.drawString("������� ������� ����  A(x_{1} - C_{1} + Kx_{2})^{2} + B(x_{2} - C_{2} + Mx_{1})^{2}:",xSolv+40,ySolv+20);
        Stringer.drawString("=>  "+Count_Functions.strFunction(2),xSolv+172,ySolv+48);
        jSldrA.setVisible(true);
        jSldrB.setVisible(true);
        jSldrCx.setVisible(true);
        jSldrCy.setVisible(true);
        jSldrK.setVisible(true);
        jSldrM.setVisible(true);
       }
       else{
         jSldrA.setVisible(false);
         jSldrB.setVisible(false);
         jSldrCx.setVisible(false);
         jSldrCy.setVisible(false);
         jSldrK.setVisible(false);
         jSldrM.setVisible(false);
       }
       if(step<2||step>5){
         jsldra1.setVisible(false);
         jsldrb1.setVisible(false);
         jsldrc1.setVisible(false);
       }
       else{
         jsldra1.setVisible(true);
         jsldrb1.setVisible(true);
         jsldrc1.setVisible(true);

       }

       if(step==2)
       {

        g.setColor(cvTitleFont);
        g.setFont(new java.awt.Font(titleFont,styleTitleFont,sizeTitleFont+3));
        g.drawString(""+ki+"."+kStep,xSolv+10,ySolv+20);
        g.setColor(cvTextFont);
        Stringer.fonts[0] = new Font(textFont, styleTextFont, sizeTextFont);
        Stringer.fonts[1] = new Font(textFont, styleTextFont, sizeTextFont-4);
        Stringer.fonts[2] = new Font(textFont, styleTextFont, sizeTextFont-4);
        g.setFont(new java.awt.Font(textFont, styleTextFont, sizeTextFont));
        Stringer.drawString("������� ����������� ���� a(x_{2} - c)^{2} + b - x_{1} \u2264 0, �.�.",xSolv+40,ySolv+20);

        g.drawString("a = "+a1,xSolv+73,ySolv+120);
        g.drawString("b = "+b1,xSolv+183,ySolv+120);
        g.drawString("c = "+c1,xSolv+293,ySolv+120);

        Stringer.drawString(Count_Functions.gx(11)+" \u2264 0   ���   "+
                            Count_Functions.gx(1)+" \u2264 0",xSolv+40,ySolv+40);
        g.drawString("�������� ���� ������� �������, ����������� ������",xSolv+40,ySolv+60);
        g.drawString("������������. ",xSolv+40,ySolv+80);

        if(shtr==1) { g.setColor(Color.blue); g.drawString("���������",xSolv+400,ySolv+120);}
        if(shtr==0&&x1click!=100) { mstk1++; g.setColor(Color.red); g.drawString("�����������",xSolv+400,ySolv+120); }

        Paint_Functions.point(g, x1click, x2click,"",Color.red);
        Paint_Functions.parab(g,a1/m,b1*m,c1*m,1,shtr,cvg1x);


        //Stringer.drawString(""+Count_Functions.g1x(x1click, x2click),xSolv+40,ySolv+60);

       }

       if(step==3)
       {

        g.setColor(cvTitleFont);
        g.setFont(new java.awt.Font(titleFont,styleTitleFont,sizeTitleFont+3));
        g.drawString(""+ki+"."+kStep,xSolv+10,ySolv+20);
        g.setColor(cvTextFont);
        Stringer.fonts[0] = new Font(textFont, styleTextFont, sizeTextFont);
        Stringer.fonts[1] = new Font(textFont, styleTextFont, sizeTextFont-4);
        Stringer.fonts[2] = new Font(textFont, styleTextFont, sizeTextFont-4);
        g.setFont(new java.awt.Font(textFont, styleTextFont, sizeTextFont));
        Stringer.drawString("������� ����������� ���� a(x_{1} - c)^{2} + b - x_{2} \u2264 0, �.�.",xSolv+40,ySolv+20);
        g.drawString("a = "+a2,xSolv+73,ySolv+120);
        g.drawString("b = "+b2,xSolv+183,ySolv+120);
        g.drawString("c = "+c2,xSolv+293,ySolv+120);

        Stringer.drawString(Count_Functions.gx(22)+" \u2264 0   ���   "+
                            Count_Functions.gx(2)+" \u2264 0",xSolv+40,ySolv+40);
        g.drawString("�������� ���� ������� �������, �����������",xSolv+40,ySolv+60);
        g.drawString("������ ������������",xSolv+40,ySolv+80);

        if(shtr==1) { g.setColor(Color.blue); g.drawString("���������",xSolv+400,ySolv+90);}
        if(shtr==0&&x1click!=100) { mstk1++; g.setColor(Color.red); g.drawString("�����������",xSolv+400,ySolv+90); }

        Paint_Functions.point(g, x1click, x2click,"",Color.red);
        Paint_Functions.parab(g,a2/m,b2*m,c2*m,2,shtr,cvg2x);


       // Stringer.drawString(""+Count_Functions.g2x(x1click, x2click),xSolv+40,ySolv+40);

       }
       if(step==4)
       {

        g.setColor(cvTitleFont);
        g.setFont(new java.awt.Font(titleFont,styleTitleFont,sizeTitleFont+3));
        g.drawString(""+ki+"."+kStep,xSolv+10,ySolv+20);
        g.setColor(cvTextFont);
        Stringer.fonts[0] = new Font(textFont, styleTextFont, sizeTextFont);
        Stringer.fonts[1] = new Font(textFont, styleTextFont, sizeTextFont-4);
        Stringer.fonts[2] = new Font(textFont, styleTextFont, sizeTextFont-4);
        g.setFont(new java.awt.Font(textFont, styleTextFont, sizeTextFont));
        Stringer.drawString("������� ����������� ���� a(x_{1} - c) + b - x_{2} \u2264 0, �.�.",xSolv+40,ySolv+20);
        g.drawString("a = "+a3,xSolv+73,ySolv+120);
        g.drawString("b = "+b3,xSolv+183,ySolv+120);
        g.drawString("c = "+c3,xSolv+293,ySolv+120);

        Stringer.drawString(Count_Functions.gx(33)+" \u2264 0   ���   "+
                            Count_Functions.gx(3)+" \u2264 0",xSolv+40,ySolv+40);
        g.drawString("�������� ���� ������� �������, �����������",xSolv+40,ySolv+60);
        g.drawString("������ ������������",xSolv+40,ySolv+80);

        if(shtr==1) { g.setColor(Color.blue); g.drawString("���������",xSolv+400,ySolv+90);}
        if(shtr==0&&x1click!=100) { mstk1++; g.setColor(Color.red); g.drawString("�����������",xSolv+400,ySolv+90); }

        Paint_Functions.point(g, x1click, x2click,"",Color.red);
        Paint_Functions.linex(g,a3,b3*m,c3*m,shtr,cvg3x);


        //Stringer.drawString(""+Count_Functions.g3x(x1click, x2click),xSolv+40,ySolv+40);

       }
       if(step==5)
       {
        g.setColor(cvTitleFont);
        g.setFont(new java.awt.Font(titleFont,styleTitleFont,sizeTitleFont+3));
        g.drawString(""+ki+"."+kStep,xSolv+10,ySolv+20);
        g.setColor(cvTextFont);
        Stringer.fonts[0] = new Font(textFont, styleTextFont, sizeTextFont);
        Stringer.fonts[1] = new Font(textFont, styleTextFont, sizeTextFont-4);
        Stringer.fonts[2] = new Font(textFont, styleTextFont, sizeTextFont-4);
        g.setFont(new java.awt.Font(textFont, styleTextFont, sizeTextFont));
        Stringer.drawString("������� ����������� ���� a(x_{1} - c) + b - x_{2} \u2264 0, �.�.",xSolv+40,ySolv+20);
        g.drawString("a = "+a4,xSolv+73,ySolv+120);
        g.drawString("b = "+b4,xSolv+183,ySolv+120);
        g.drawString("c = "+c4,xSolv+293,ySolv+120);

        Stringer.drawString(Count_Functions.gx(44)+" \u2264 0   ���   "+
                            Count_Functions.gx(4)+" \u2264 0",xSolv+40,ySolv+40);
        g.drawString("�������� ���� ������� �������, �����������",xSolv+40,ySolv+60);
        g.drawString("������ ������������",xSolv+40,ySolv+80);

        if(shtr==1) { g.setColor(Color.blue); g.drawString("���������",xSolv+400,ySolv+90);}
        if(shtr==0&&x1click!=100) { mstk1++; g.setColor(Color.red); g.drawString("�����������",xSolv+400,ySolv+90); }

        Paint_Functions.point(g, x1click, x2click,"",Color.red);
        Paint_Functions.linex(g,a4,b4*m,c4*m,shtr,cvg4x);



       }

       if(step==6)
       {

        g.setColor(cvTitleFont);
        g.setFont(new java.awt.Font(titleFont,styleTitleFont,sizeTitleFont+3));
        g.drawString(""+ki+"."+(kStep-g1-g2-g3-g4),xSolv+10,ySolv+20);
        g.setColor(cvTextFont);
        Stringer.fonts[0] = new Font(textFont, styleTextFont, sizeTextFont);
        Stringer.fonts[1] = new Font(textFont, styleTextFont, sizeTextFont-4);
        Stringer.fonts[2] = new Font(textFont, styleTextFont, sizeTextFont-4);
        g.setFont(new java.awt.Font(textFont, styleTextFont, sizeTextFont));
        g.drawString("������� ��������� ����� ������ �������",xSolv+40,ySolv+20);
        g.drawString("� ������� ����:",xSolv+40,ySolv+40);
        Stringer.drawString("x^{"+ki+"} = ("+xi[0]+"; "+yi[0]+")",xSolv+200,ySolv+60);
        if((Count_Functions.g1x(xi[0],yi[0])<=0||g1==1)&&(Count_Functions.g2x(xi[0],yi[0])<=0||g2==1)
      &&(Count_Functions.g3x(xi[0],yi[0])<=0||g3==1)&&(Count_Functions.g4x(xi[0],yi[0])<=0||g4==1))
   { shtr=1;jBtnNext.setEnabled(true);
     if((Count_Functions.g1x(xi[0],yi[0])==0&&g1==0)||(Count_Functions.g2x(xi[0],yi[0])==0&&g2==0)
      ||(Count_Functions.g3x(xi[0],yi[0])==0&&g3==0)||(Count_Functions.g4x(xi[0],yi[0])==0&&g4==0))
     { shtr=2;jBtnNext.setEnabled(true);}
   }
   else shtr=0;

        if(shtr==2) { g.setColor(Color.blue); g.drawString("����� ����������� ������� �������",xSolv+100,ySolv+90);}
        if(shtr==1) { g.setColor(Color.blue); g.drawString("����� ����������� ������ �������",xSolv+100,ySolv+90);}
        if(shtr==0) { g.setColor(Color.red); g.drawString("����� �� ����������� ������ �������",xSolv+100,ySolv+90); }
        Paint_Functions.point(g, xi[0], yi[0],"x^{0}",Color.red);

       }
       if(step==7)
       {
         g.setColor(cvTitleFont);
         g.setFont(new java.awt.Font(titleFont,styleTitleFont,sizeTitleFont+3));
         g.drawString(""+ki+"."+(kStep-g1-g2-g3-g4),xSolv+10,ySolv+20);
         g.setColor(cvTextFont);
         Stringer.fonts[0] = new Font(textFont, styleTextFont, sizeTextFont);
         Stringer.fonts[1] = new Font(textFont, styleTextFont, sizeTextFont-4);
         Stringer.fonts[2] = new Font(textFont, styleTextFont, sizeTextFont-4);
         g.setFont(new java.awt.Font(textFont, styleTextFont, sizeTextFont));
         Stringer.drawString("������� k = "+ki+".",xSolv + 40, ySolv + 20);
         Stringer.drawString("������� ��������� ��������: \u03B5_{1} = "+eps1+" ; \u03B5_{2} = "+eps2+
                             " ; M = "+maxKi,xSolv + 40, ySolv + 40);
           Paint_Functions.point(g, xi[0], yi[0],"x^{0}",Color.red);




       }

       if(step>7)
       {

         jbtnPrevious.setEnabled(true);
         g.setColor(cvTitleFont);
         g.setFont(new java.awt.Font(titleFont,styleTitleFont,sizeTitleFont+3));
         if (ki==0) fl=g1+g2+g3+g4;
         else fl=7;
         if(step!=92)g.drawString(""+ki+"."+(kStep-fl),xSolv+10,ySolv+20);
         g.setColor(cvTextFont);
         Stringer.fonts[0] = new Font(textFont, styleTextFont, sizeTextFont);
         Stringer.fonts[1] = new Font(textFont, styleTextFont, sizeTextFont-4);
         Stringer.fonts[2] = new Font(textFont, styleTextFont, sizeTextFont-4);
         g.setFont(new java.awt.Font(textFont, styleTextFont, sizeTextFont));
         if(kStep==8)
         {
           String r=""; if(ki!=0) r="������� k = k + 1 . " ;
           g.drawString(r+"�������� ������� k \u2264 M:", xSolv + 40, ySolv + 20);
           if(ki<maxKi) g.drawString("k = "+ki+" < M = "+maxKi+" - ����������� => ���������� ����������", xSolv + 40, ySolv + 40);
           if(ki==maxKi) g.drawString("k = "+ki+" = M = "+maxKi+" - ����������� => ���������� ����������", xSolv + 40, ySolv + 40);
           if(ki>maxKi) { g.drawString("k = "+ki+" > M = "+maxKi+" - �� ����������� => ���������� ����������", xSolv + 40, ySolv + 40); exit=true; }
         }
         if(kStep==9)
         {
           String sr="", sr1="";
           if(g1==0) sr+="   g_{1}(x^{"+ki+"})";
           if(g2==0) sr+="   g_{2}(x^{"+ki+"})";
           if(g3==0) sr+="   g_{3}(x^{"+ki+"})";
           if(g4==0) sr+="   g_{4}(x^{"+ki+"})";
           Stringer.drawString("�������� �������� "+sr+":", xSolv + 40, ySolv + 20);
           sr=""; sr1="";
           if(g1==0) sr+="g_{1}("+TemplateUM.round(xi[ki])+";"+TemplateUM.round(yi[ki])+") = "+TemplateUM.round(Count_Functions.g1x(xi[ki],yi[ki]));
           if(g2==0) sr1+="g_{2}("+TemplateUM.round(xi[ki])+";"+TemplateUM.round(yi[ki])+") = "+TemplateUM.round(Count_Functions.g2x(xi[ki],yi[ki]));
           if(g3==0) sr+="          g_{3}("+TemplateUM.round(xi[ki])+";"+TemplateUM.round(yi[ki])+") = "+TemplateUM.round(Count_Functions.g3x(xi[ki],yi[ki]));
           if(g4==0) sr1+="          g_{4}("+TemplateUM.round(xi[ki])+";"+TemplateUM.round(yi[ki])+") = "+TemplateUM.round(Count_Functions.g4x(xi[ki],yi[ki]));
           Stringer.drawString(""+sr, xSolv + 60, ySolv + 50);
           Stringer.drawString(""+sr1, xSolv + 60, ySolv + 70);
           sr="";
           en1=-1; en2=-1; en3=-1; en4=-1;
           if(g1==0&&TemplateUM.round(Count_Functions.g1x(xi[ki],yi[ki]))==0) {sr+=" g_{1}(x);"; en1=1;}
           if(g2==0&&TemplateUM.round(Count_Functions.g2x(xi[ki],yi[ki]))==0) {sr+=" g_{2}(x);"; en2=1;}
           if(g3==0&&TemplateUM.round(Count_Functions.g3x(xi[ki],yi[ki]))==0) {sr+=" g_{3}(x);"; en3=1;}
           if(g4==0&&TemplateUM.round(Count_Functions.g4x(xi[ki],yi[ki]))==0) {sr+=" g_{4}(x);"; en4=1;}
           if(sr=="") sr="���";
           Stringer.drawString("�������� �����������:  "+sr, xSolv + 40, ySolv + 100);
           nom[ki]=-1; nom1[ki]=-1; nom2[ki]=-1;
           posch[ki]=0;
           if(en1==1) posch[ki]++;
           if(en2==1) posch[ki]++;
           if(en3==1) posch[ki]++;
           if(en4==1) posch[ki]++;
           if(posch[ki]==1)
           {
             if(en1==1) nom[ki]=1;
             if(en2==1) nom[ki]=2;
             if(en3==1) nom[ki]=3;
             if(en4==1) nom[ki]=4;
           }
           if(posch[ki]==2)
           {
             if(en1==1&&nom1[ki]<0) nom1[ki]=1;
             if(en2==1&&nom1[ki]<0) nom1[ki]=2;
             if(en3==1&&nom1[ki]<0) nom1[ki]=3;
             if(en4==1&&nom1[ki]<0) nom1[ki]=4;
             if(en1==1&&nom1[ki]>0) nom2[ki]=1;
             if(en2==1&&nom1[ki]>0) nom2[ki]=2;
             if(en3==1&&nom1[ki]>0) nom2[ki]=3;
             if(en4==1&&nom1[ki]>0) nom2[ki]=4;
           }

         }
         if(kStep==10)
         {
           if(posch[ki]!=0)Stringer.drawString("�������� ������� A_{"+ki+"}:", xSolv + 45, ySolv + 20);
           else
             {
               Stringer.drawString(
                   "��� ���������� ����� ������������ ������ �����������",
                   xSolv + 45, ySolv + 20);
               Stringer.drawString(
                   "��������, �� �������� ����� ��������� �� ������� �������.",
                   xSolv + 45, ySolv + 40);
             }
           if(posch[ki]==1){
             if(nom[ki]==1) {a_1[ki]=Count_Functions.grad_g1x(xi[ki],yi[ki],1); a_2[ki]=Count_Functions.grad_g1x(xi[ki],yi[ki],2);}
             if(nom[ki]==2) {a_1[ki]=Count_Functions.grad_g2x(xi[ki],yi[ki],1); a_2[ki]=Count_Functions.grad_g2x(xi[ki],yi[ki],2);}
             if(nom[ki]==3) {a_1[ki]=Count_Functions.grad_g3x(xi[ki],yi[ki],1); a_2[ki]=Count_Functions.grad_g3x(xi[ki],yi[ki],2);}
             if(nom[ki]==4) {a_1[ki]=Count_Functions.grad_g4x(xi[ki],yi[ki],1); a_2[ki]=Count_Functions.grad_g4x(xi[ki],yi[ki],2);}
             TemplateUM.drawFormula(g,"A_{"+ki+"} = ", 70, 425,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
             TemplateUM.drawFormula(g,"\u2202g_{"+nom[ki]+"}(x)", 50+getW("\u2207f(x)=  ",g)+10, 415,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
             TemplateUM.drawFormula(g,"\u2202x_{1}", 50+getW("\u2207f(x0)=  ",g)+15, 435,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
             g.drawLine(50+getW("\u2207f(x)=  ",g)+10, 420, 50+getW("\u2207f(x0)=  \u2202f(x)",g)+10, 420);
             g.drawString(";", 50+getW("\u2207f(x0)=  \u2202f(x) ",g)+10, 425);
             TemplateUM.drawFormula(g,"\u2202g_{"+nom[ki]+"}(x)", 50+getW("\u2207f(x)=  \u2202f(x) ; ",g)+10, 415,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
             TemplateUM.drawFormula(g,"\u2202x_{2}", 50+getW("\u2207f(x0)=  \u2202f(x) ; ",g)+15, 435,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
             g.drawLine( 50+getW("\u2207f(x)=  \u2202f(x) ; ",g)+10, 420, 50+getW("\u2207f(x0)=  \u2202f(x) ; \u2202f(x)",g)+10, 420);
             g.drawRoundRect(40+getW("\u2207f(x0)=  ",g)+5, 400, 100, 40, 25, 25);
             g.drawString("  = ("+TemplateUM.round(a_1[ki])+"; "+TemplateUM.round(a_2[ki])+")",210,425);
             TemplateUM.drawFormula(g,"x^{"+ki+"}", 206, 443);
             g.setColor(Color.white);
             g.setFont(TemplateUM.FontSolution);
             g.drawLine(50+getW("\u2207f(x0)=  ",g)+5, 400, 50+getW("\u2207f(x0)=  ",g)+5+90, 400);
             g.drawLine(50+getW("\u2207f(x0)=  ",g)+5, 440, 50+getW("\u2207f(x0)=  ",g)+5+90, 440);
           }
           if(posch[ki]==2){
           TemplateUM.drawFormula(g,"A_{"+ki+"} = ", 50, 440,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
           TemplateUM.drawFormula(g,"\u2202g_{"+nom1[ki]+"}(x)", 90, 415,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
           TemplateUM.drawFormula(g,"\u2202x_{1}", 100, 432,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
           g.drawLine(90, 420, 130, 420);
           TemplateUM.drawFormula(g,"\u2202g_{"+nom1[ki]+"}(x)", 140, 415,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
           TemplateUM.drawFormula(g,"\u2202x_{2}", 150, 432,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
           g.drawLine(140, 420, 180, 420);
           TemplateUM.drawFormula(g,"\u2202g_{"+nom2[ki]+"}(x)", 90, 450,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
           TemplateUM.drawFormula(g,"\u2202x_{1}", 100, 467,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
           g.drawLine(90, 455, 130, 455);
           TemplateUM.drawFormula(g,"\u2202g_{"+nom2[ki]+"}(x)", 140, 450,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
           TemplateUM.drawFormula(g,"\u2202x_{2}", 150, 467,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
           g.drawLine(140, 455, 180, 455);
           g.drawRoundRect(85, 400, 100, 75, 15, 15);
           TemplateUM.drawFormula(g,"x^{"+ki+"}", 188, 475);
           TemplateUM.drawFormula(g,"=", 200, 440,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
           if(nom1[ki]==1) {a11[ki]=Count_Functions.grad_g1x(xi[ki],yi[ki],1); a12[ki]=Count_Functions.grad_g1x(xi[ki],yi[ki],2);}
           if(nom1[ki]==2) {a11[ki]=Count_Functions.grad_g2x(xi[ki],yi[ki],1); a12[ki]=Count_Functions.grad_g2x(xi[ki],yi[ki],2);}
           if(nom1[ki]==3) {a11[ki]=Count_Functions.grad_g3x(xi[ki],yi[ki],1); a12[ki]=Count_Functions.grad_g3x(xi[ki],yi[ki],2);}
           if(nom1[ki]==4) {a11[ki]=Count_Functions.grad_g4x(xi[ki],yi[ki],1); a12[ki]=Count_Functions.grad_g4x(xi[ki],yi[ki],2);}
           if(nom2[ki]==1) {a21[ki]=Count_Functions.grad_g1x(xi[ki],yi[ki],1); a22[ki]=Count_Functions.grad_g1x(xi[ki],yi[ki],2);}
           if(nom2[ki]==2) {a21[ki]=Count_Functions.grad_g2x(xi[ki],yi[ki],1); a22[ki]=Count_Functions.grad_g2x(xi[ki],yi[ki],2);}
           if(nom2[ki]==3) {a21[ki]=Count_Functions.grad_g3x(xi[ki],yi[ki],1); a22[ki]=Count_Functions.grad_g3x(xi[ki],yi[ki],2);}
           if(nom2[ki]==4) {a21[ki]=Count_Functions.grad_g4x(xi[ki],yi[ki],1); a22[ki]=Count_Functions.grad_g4x(xi[ki],yi[ki],2);}
          // g.drawString(""+TemplateUM.round(a11)+"   "+TemplateUM.round(a12), 225, 430);
         //  g.drawString(""+TemplateUM.round(a21)+"   "+TemplateUM.round(a22), 220, 455);
           g.drawRoundRect(215, 412, 130, 50, 10, 10);
         g.drawString(""+TemplateUM.round(a11[ki]), 230, 430);
         g.drawString(""+TemplateUM.round(a21[ki]), 230, 455);
         g.drawString(""+TemplateUM.round(a12[ki]), 290, 430);
         g.drawString(""+TemplateUM.round(a22[ki]), 290, 455);
           g.setColor(Color.white);
           g.drawLine(90, 400, 180, 400);
           g.drawLine(90, 475, 180, 475);
           g.drawLine(220, 412, 345, 412);
           g.drawLine(220, 462, 345, 462);
           }
         }
        if(kStep==11)
        {

          TemplateUM.drawFormula(g,"�������� \u2207f(x^{"+ki+"}):", xSolv + 45, ySolv + 20,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
          TemplateUM.drawFormula(g,"\u2207f(x^{"+ki+"})=", 60, 425,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
          TemplateUM.drawFormula(g,"\u2202f(x)", 50+getW("\u2207f(x0)=  ",g)+10, 415,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
          TemplateUM.drawFormula(g,"\u2202x_{1}", 50+getW("\u2207f(x0)=  ",g)+15, 435,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
          g.drawLine(50+getW("\u2207f(x0)=  ",g)+10, 420, 50+getW("\u2207f(x0)=  \u2202f(x)",g)+10, 420);
          g.drawString(";", 50+getW("\u2207f(x0)=  \u2202f(x) ",g)+10, 425);
          TemplateUM.drawFormula(g,"\u2202f(x)", 50+getW("\u2207f(x0)=  \u2202f(x) ; ",g)+10, 415,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
          TemplateUM.drawFormula(g,"\u2202x_{2}", 50+getW("\u2207f(x0)=  \u2202f(x) ; ",g)+15, 435,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
          g.drawLine( 50+getW("\u2207f(x0)=  \u2202f(x) ; ",g)+10, 420, 50+getW("\u2207f(x0)=  \u2202f(x) ; \u2202f(x)",g)+10, 420);
          g.drawRoundRect(50+getW("\u2207f(x0)=  ",g)+5, 400, 90, 40, 25, 25);
          TemplateUM.drawFormula(g,"= "+Count_Functions.strFunction(3), 50+getW("\u2207f(x0)=  \u2202f(x) ; \u2202f(x) x0",g)+10, 425,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
          TemplateUM.drawFormula(g,"x^{"+ki+"}",  50+getW("\u2207f(x0)=  \u2202f(x) ; \u2202f(x) ",g)+15, 445);
          g.setFont(TemplateUM.FontSolution);
          if(TemplateUM.round(Count_Functions.gradx(xi[ki],yi[ki]))!=0||TemplateUM.round(Count_Functions.grady(xi[ki],yi[ki]))!=0)
          TemplateUM.drawFormula(g, "\u2207f(x^{"+ki+"}) = ("+TemplateUM.round(Count_Functions.gradx(xi[ki],yi[ki]))+"; "+TemplateUM.round(Count_Functions.grady(xi[ki],yi[ki]))+")^{T} \u2260 0",
                                 50, 475,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
          else{
            TemplateUM.drawFormula(g, "\u2207f(x^{"+ki+"}) = ("+TemplateUM.round(Count_Functions.gradx(xi[ki],yi[ki]))+"; "+TemplateUM.round(Count_Functions.grady(xi[ki],yi[ki]))+")^{T} = 0  => ������� ������� f(x) ������ �������",
                                   50, 475,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
            exit=true;

          }
          g.setColor(Color.white);
          g.setFont(TemplateUM.FontSolution);
          g.drawLine(50+getW("\u2207f(x0)=  ",g)+5, 400, 50+getW("\u2207f(x0)=  ",g)+5+90, 400);
          g.drawLine(50+getW("\u2207f(x0)=  ",g)+5, 440, 50+getW("\u2207f(x0)=  ",g)+5+90, 440);

        }
        if(kStep==12)
        {

          Stringer.drawString("�������� \u2206x^{"+ki+"}:", xSolv + 45, ySolv + 20);

          if(posch[ki]==0)
          {
           d_1[ki]=-Count_Functions.gradx(xi[ki],yi[ki]);
           d_2[ki]=-Count_Functions.grady(xi[ki],yi[ki]);

           Stringer.drawString("\u2206x^{"+ki+"} = - \u2207f(x^{"+ki+"}) = ("+TemplateUM.round(d_1[ki])+" ; "+TemplateUM.round(d_2[ki])+")  -  �.�. ����� x^{"+ki+"} ������ �������", xSolv + 40, ySolv + 40);

          }

          if(posch[ki]==1)
          {
           d_1[ki]=-((a_2[ki]*a_2[ki]/(a_1[ki]*a_1[ki]+a_2[ki]*a_2[ki]))*Count_Functions.gradx(xi[ki],yi[ki])-
               (a_1[ki]*a_2[ki]/(a_1[ki]*a_1[ki]+a_2[ki]*a_2[ki]))*Count_Functions.grady(xi[ki],yi[ki]));
           d_2[ki]=-((-a_1[ki]*a_2[ki]/(a_1[ki]*a_1[ki]+a_2[ki]*a_2[ki]))*Count_Functions.gradx(xi[ki],yi[ki])+
                 (a_1[ki]*a_1[ki]/(a_1[ki]*a_1[ki]+a_2[ki]*a_2[ki]))*Count_Functions.grady(xi[ki],yi[ki]));

           double ag_1=0,ag_2=0; dg_1[ki]=0; dg_2[ki]=0; x1_pr=0; x2_pr=0;
           if(nom[ki]==1||nom[ki]==2){
             dg_1[ki] = d_1[ki] + teta * Count_Functions.gradx(xi[ki], yi[ki]);
             dg_2[ki] = d_2[ki] + teta * Count_Functions.grady(xi[ki], yi[ki]);


             x1_pr=xi[ki]+0.01*(dg_1[ki]); x2_pr=yi[ki]+0.01*(dg_2[ki]);
           if((Count_Functions.g1x(x1_pr,x2_pr)<=0||g1==1)&&(Count_Functions.g2x(x1_pr,x2_pr)<=0||g2==1)
                &&(Count_Functions.g3x(x1_pr,x2_pr)<=0||g3==1)&&(Count_Functions.g4x(x1_pr,x2_pr)<=0||g4==1));
           else {
             dg_1[ki] *= -1;
             dg_2[ki] *= -1;
           }

               if(Count_Functions.stepT(xi[ki],yi[ki],d_1[ki]+dg_1[ki],d_2[ki]+dg_2[ki])>0){
             Paint_Functions.line(g,xi[ki]*m,yi[ki]*m,(xi[ki]+dg_1[ki])*m,(yi[ki]+dg_2[ki])*m,Color.black);
          //   Paint_Functions.line(g,xi[ki]*m,yi[ki]*m,(xi[ki]-dg_1[ki])*m,(yi[ki]-dg_2[ki])*m,Color.red);
             //Paint_Functions.line(g,xi[ki]*m,yi[ki]*m,(xi[ki]+d_1[ki]+dg_1[ki])*m,(yi[ki]+d_2[ki]+dg_2[ki])*m,Color.green);
             Paint_Functions.line(g,xi[ki]*m,yi[ki]*m,(xi[ki]+d_1[ki])*m,(yi[ki]+d_2[ki])*m,Color.gray);
           //  Paint_Functions.line(g,xi[ki]*m,yi[ki]*m,(xi[ki]-Count_Functions.gradx(xi[ki], yi[ki]))*m,(yi[ki]-Count_Functions.grady(xi[ki], yi[ki]))*m,Color.blue);

              g.setColor(cvTextFont);}


           TemplateUM.drawFormula(g,"\u2206x^{"+ki+"} = - [E - A_{"+ki+"}^{T}(A_{"+ki+"}A_{"+ki+"}^{T})^{-1}A_{"+ki+"}]\u2207f(x^{"+ki+"}) = ("+TemplateUM.round(d_1[ki])+" ; "+TemplateUM.round(d_2[ki])+")", xSolv + 45, ySolv + 40,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
           TemplateUM.drawFormula(g,"��� ��� ����������� ���������, ��������� �����������: ", xSolv + 40, ySolv + 60,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
           TemplateUM.drawFormula(g,"\u2206\u011F(x^{"+ki+"}) = \u2206x^{"+ki+"} + \u0398\u2207f(x^{"+ki+"}), ��� \u0398:                    "+teta, xSolv + 40, ySolv + 80,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
           TemplateUM.drawFormula(g,"\u0398 = "+teta+"   =>  \u2206\u011F(x^{"+ki+"}) = ("+TemplateUM.round(dg_1[ki])+" ; "+TemplateUM.round(dg_2[ki])+")  �  \u2206x^{"+ki+"} = \u2206\u011F(x^{"+ki+"})", xSolv + 40, ySolv + 100,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
           TemplateUM.drawFormula(g,"�.�. \u2206x^{"+ki+"}+ \u2206\u011F(x^{"+ki+"}) = ("+TemplateUM.round(d_1[ki]+dg_1[ki])+" ; "+TemplateUM.round(d_2[ki]+dg_2[ki])+")", xSolv + 40, ySolv + 120,TemplateUM.FontSolution,TemplateUM.FontIndSolution);

           jsldrTeta.setVisible(true);

         }

         else{
            TemplateUM.drawFormula(g,"\u2206x^{"+ki+"} = - [E - A_{"+ki+"}^{T}(A_{"+ki+"}A_{"+ki+"}^{T})^{-1}A_{"+ki+"}]\u2207f(x^{"+ki+"}) = ("+TemplateUM.round(d_1[ki])+" ; "+TemplateUM.round(d_2[ki])+")", xSolv + 45, ySolv + 40,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
         }

          }
          if(posch[ki]==2){

          double at11=a11[ki],at12=a21[ki],at21=a12[ki],at22=a22[ki],

              a_at11=a11[ki]*a11[ki]+a12[ki]*a12[ki],a_at12=a11[ki]*a21[ki]+a12[ki]*a22[ki],a_at21=a11[ki]*a21[ki]+a12[ki]*a22[ki],a_at22=a21[ki]*a21[ki]+a22[ki]*a22[ki],

              a_atDet=a_at11*a_at22-a_at12*a_at21,a_atObr11=a_at22/a_atDet,a_atObr12=-a_at12/a_atDet,a_atObr21=-a_at21/a_atDet,a_atObr22=a_at11/a_atDet,

              a_atObra11=a_atObr11*a11[ki]+a_atObr12*a21[ki],a_atObra12=a_atObr11*a12[ki]+a_atObr12*a22[ki],a_atObra21=a_atObr21*a11[ki]+a_atObr22*a21[ki],a_atObra22=a_atObr21*a12[ki]+a_atObr22*a22[ki],

              Lamb_1=-(a_atObra11*Count_Functions.gradx(xi[ki],yi[ki])+a_atObra12*Count_Functions.grady(xi[ki],yi[ki])),
              Lamb_2=-(a_atObra21*Count_Functions.gradx(xi[ki],yi[ki])+a_atObra22*Count_Functions.grady(xi[ki],yi[ki])),

              my11=(at11*a_atObra11+at12*a_atObra21)-1,my12=(at11*a_atObra12+at12*a_atObra22),
              my21=(at21*a_atObra11+at22*a_atObra21),my22=(at21*a_atObra12+at22*a_atObra22)-1,

              dx_1=(my11*Count_Functions.gradx(xi[ki],yi[ki])+my12*Count_Functions.grady(xi[ki],yi[ki])),
              dx_2=(my21*Count_Functions.gradx(xi[ki],yi[ki])+my22*Count_Functions.grady(xi[ki],yi[ki]));

              if(TemplateUM.round(dx_1)>0||TemplateUM.round(dx_2)>0){d_1[ki]=dx_1;d_2[ki]=dx_2;}
              else
              {

                double r1=a_1[ki],r2=a_2[ki]; int nr=nom[ki];
                if(Lamb_1>Lamb_2) { a_1[ki]=a11[ki]; a_2[ki]=a12[ki]; nom[ki]=nom1[ki];}
                if(Lamb_1<Lamb_2) { a_1[ki]=a21[ki]; a_2[ki]=a22[ki]; nom[ki]=nom2[ki];}



                d_1[ki]=-((a_2[ki]*a_2[ki]/(a_1[ki]*a_1[ki]+a_2[ki]*a_2[ki]))*Count_Functions.gradx(xi[ki],yi[ki])-
                    (a_1[ki]*a_2[ki]/(a_1[ki]*a_1[ki]+a_2[ki]*a_2[ki]))*Count_Functions.grady(xi[ki],yi[ki]));
                d_2[ki]=-((-a_1[ki]*a_2[ki]/(a_1[ki]*a_1[ki]+a_2[ki]*a_2[ki]))*Count_Functions.gradx(xi[ki],yi[ki])+
                      (a_1[ki]*a_1[ki]/(a_1[ki]*a_1[ki]+a_2[ki]*a_2[ki]))*Count_Functions.grady(xi[ki],yi[ki]));

                double ag_1=0,ag_2=0,x1_pr=0,x2_pr=0; dg_1[ki]=0; dg_2[ki]=0;
                if(nom[ki]==1||nom[ki]==2){
                  dg_1[ki] = d_1[ki] + teta * Count_Functions.gradx(xi[ki], yi[ki]);
                  dg_2[ki] = d_2[ki] + teta * Count_Functions.grady(xi[ki], yi[ki]);


                  x1_pr=xi[ki]+0.01*(dg_1[ki]); x2_pr=yi[ki]+0.01*(dg_2[ki]);
                if((Count_Functions.g1x(x1_pr,x2_pr)<=0||g1==1)&&(Count_Functions.g2x(x1_pr,x2_pr)<=0||g2==1)
                     &&(Count_Functions.g3x(x1_pr,x2_pr)<=0||g3==1)&&(Count_Functions.g4x(x1_pr,x2_pr)<=0||g4==1));
                else {
                  dg_1[ki] *= -1;
                  dg_2[ki] *= -1;
                }

                    if(Count_Functions.stepT(xi[ki],yi[ki],d_1[ki]+dg_1[ki],d_2[ki]+dg_2[ki])>0){
                  Paint_Functions.line(g,xi[ki]*m,yi[ki]*m,(xi[ki]+dg_1[ki])*m,(yi[ki]+dg_2[ki])*m,Color.black);
               //   Paint_Functions.line(g,xi[ki]*m,yi[ki]*m,(xi[ki]-dg_1[ki])*m,(yi[ki]-dg_2[ki])*m,Color.red);
                  //Paint_Functions.line(g,xi[ki]*m,yi[ki]*m,(xi[ki]+d_1[ki]+dg_1[ki])*m,(yi[ki]+d_2[ki]+dg_2[ki])*m,Color.green);
                  Paint_Functions.line(g,xi[ki]*m,yi[ki]*m,(xi[ki]+d_1[ki])*m,(yi[ki]+d_2[ki])*m,Color.gray);
                //  Paint_Functions.line(g,xi[ki]*m,yi[ki]*m,(xi[ki]-Count_Functions.gradx(xi[ki], yi[ki]))*m,(yi[ki]-Count_Functions.grady(xi[ki], yi[ki]))*m,Color.blue);

                   g.setColor(cvTextFont);}
                }
               a_1[ki]=r1; a_2[ki]=r2; nom[ki]=nr;


              }

         Stringer.drawString("\u2206x^{"+ki+"} = ("+TemplateUM.round(dx_1)+" ; "+TemplateUM.round(dx_2)+")", xSolv + 35, ySolv + 40);

        if(TemplateUM.round(dx_1)==0&&TemplateUM.round(dx_2)==0)
        {
          Stringer.drawString("�.�. \u2206x^{"+ki+"} = (0;0), ��������� \u03BB^{"+ki+"}  = ("+TemplateUM.round(Lamb_1)+" ; "+TemplateUM.round(Lamb_2)+") =>",  xSolv + 35, ySolv + 60);
          jsldrTeta.setVisible(true);
          Stringer.drawString("������� \u0398:                  "+teta,  xSolv + 170, ySolv + 80);
          if(Lamb_1>Lamb_2)
            Stringer.drawString(""+TemplateUM.round(Lamb_2)+" < "+TemplateUM.round(Lamb_1)+" => ������� �� � 2-�� ������:  � = ("+TemplateUM.round(a_1[ki])+" ; "+TemplateUM.round(a_2[ki])+")",  xSolv + 35, ySolv + 100);
          if(Lamb_1<Lamb_2)
            Stringer.drawString(""+TemplateUM.round(Lamb_1)+" < "+TemplateUM.round(Lamb_2)+" => ������� �� � 1-�� ������:  � = ("+TemplateUM.round(a_1[ki])+" ; "+TemplateUM.round(a_2[ki])+")",  xSolv + 35, ySolv + 100);
          Stringer.drawString("� ������������� \u2206x^{"+ki+"} => \u2206x^{"+ki+"} = ("+TemplateUM.round(d_1[ki]+dg_1[ki])+" ; "+TemplateUM.round(d_2[ki]+dg_2[ki])+")",  xSolv + 35, ySolv + 120);
        }


          }


        }

        if(Count_Functions.stepT(xi[ki],yi[ki],d_1[ki]+dg_1[ki],d_2[ki]+dg_2[ki])>0)
          Paint_Functions.line(g,xi[ki]*m,yi[ki]*m,(xi[ki]+d_1[ki]+dg_1[ki])*m,(yi[ki]+d_2[ki]+dg_2[ki])*m,Color.green);
        g.setColor(cvTextFont);
       if(kStep==13)
       {
         TemplateUM.drawFormula(g,"��������� ������� \u007C\u007C \u2206x^{0}\u007C\u007C \u2264 \u03B5_{2}: ",
                               xSolv + 45, ySolv + 20,TemplateUM.FontSolution,TemplateUM.FontIndSolution);



        if(Count_Functions.norma(d_1[ki],d_2[ki])>eps2)
        {
          TemplateUM.drawFormula(g,"\u007C\u007C \u2206x^{"+ki+"}\u007C\u007C  = "+TemplateUM.round(Count_Functions.norma(d_1[ki],d_2[ki]))+" > \u03B5_{2} = "+eps2,
                                xSolv + 40, ySolv + 40,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
         TemplateUM.drawFormula(g,"������� �� �����������  =>  ��������� ����. �����",
                              xSolv + 40, ySolv + 60,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
       TemplateUM.drawFormula(g,"� ����������� \u2206x^{"+ki+"}",
                            xSolv + 40, ySolv + 80,TemplateUM.FontSolution,TemplateUM.FontIndSolution);



        }
        else
        {

          double Lamb=-(a_1[ki]*Count_Functions.gradx(xi[ki],yi[ki])/(a_1[ki]*a_1[ki]+a_2[ki]*a_2[ki])+
                       a_2[ki]*Count_Functions.grady(xi[ki],yi[ki])/(a_1[ki]*a_1[ki]+a_2[ki]*a_2[ki]));

          if(TemplateUM.round(Lamb)>=0)   {
            Stringer.drawString("�_{"+ki+"} = ("+TemplateUM.round(a_1[ki])+" ; "+TemplateUM.round(a_2[ki])+") � \u03BB^{"+ki+"} = "+TemplateUM.round(Lamb) +" \u2265 0 => ������ �������",
                                xSolv + 40, ySolv + 80);
            exit=true;
          }
          else{
            Stringer.drawString("�_{"+ki+"} = ("+TemplateUM.round(a_1[ki])+" ; "+TemplateUM.round(a_2[ki])+") � \u03BB^{"+ki+"} = "+TemplateUM.round(Lamb) +" < 0 => ���������� ���. �����",
                                 xSolv + 40, ySolv + 80);

             jBtnNext.setEnabled(false);
           }

            TemplateUM.drawFormula(g,"\u007C\u007C \u2206x^{"+ki+"}\u007C\u007C  = "+TemplateUM.round(Count_Functions.norma(d_1[ki],d_2[ki]))+" \u2264 \u03B5_{2} = "+eps2,
                                xSolv + 40, ySolv + 40,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
         TemplateUM.drawFormula(g,"������� �����������  =>  ��������� \u03BB^{"+ki+"} = - (A_{"+ki+"}A_{"+ki+"}^{T})^{-1}A_{"+ki+"}\u2207f(x^{"+ki+"})",
                               xSolv + 40, ySolv + 60,TemplateUM.FontSolution,TemplateUM.FontIndSolution);

        }

       }
       if(kStep==14)
       {
         TemplateUM.drawFormula(g,"������� ����� x^{"+ki+"} + t_{"+ki+"}\u2206x^{"+ki+"}:",
                               xSolv + 45, ySolv + 20,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
        TemplateUM.drawFormula(g,"x^{"+ki+"} + t_{"+ki+"}\u2206x^{"+ki+"} = ("+TemplateUM.round(xi[ki])+" ; "+TemplateUM.round(yi[ki])+") +t_{"+ki+"}("+TemplateUM.round(d_1[ki]+dg_1[ki])+" ; "+TemplateUM.round(d_2[ki]+dg_2[ki])+")",
                              xSolv + 40, ySolv + 40,TemplateUM.FontSolution,TemplateUM.FontIndSolution);

       }
       if(kStep==15)
       {
         TemplateUM.drawFormula(g,"������� t_{"+ki+"} = min(t^{\u2032}, t^{\u2032\u2032}):  t^{\u2032} ������� �� �������",
                               xSolv + 45, ySolv + 20,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
        tmin[ki]=100;
        tf=Count_Functions.stepT(xi[ki],yi[ki],d_1[ki]+dg_1[ki],d_2[ki]+dg_2[ki]);
        tg1=Count_Functions.stepT_g1(xi[ki],yi[ki],d_1[ki]+dg_1[ki],d_2[ki]+dg_2[ki]);
        tg2=Count_Functions.stepT_g2(xi[ki],yi[ki],d_1[ki]+dg_1[ki],d_2[ki]+dg_2[ki]);
        tg3=Count_Functions.stepT_g3(xi[ki],yi[ki],d_1[ki]+dg_1[ki],d_2[ki]+dg_2[ki]);
        tg4=Count_Functions.stepT_g4(xi[ki],yi[ki],d_1[ki]+dg_1[ki],d_2[ki]+dg_2[ki]);
        double tg=-1; int nm=5;
        if(tg1>0&&tg1<tmin[ki]&&g1==0) {tmin[ki]=tg1;nm=1;}
        if(tg2>0&&tg2<tmin[ki]&&g2==0) {tmin[ki]=tg2;nm=2;}
        if(tg3>0&&tg3<tmin[ki]&&g3==0) {tmin[ki]=tg3;nm=3;}
        if(tg4>0&&tg4<tmin[ki]&&g4==0) {tmin[ki]=tg4;nm=4;}
        if(nm!=5) tg=tmin[ki];
        if(tf>0&&tf<tmin[ki]) tmin[ki]=tf;

        if(tf<0) { exit=true; }

        TemplateUM.drawFormula(g,"f(x^{"+ki+"} + t^{\u2032}\u2206x^{"+ki+"}) " +
                             "= min f(x^{"+ki+"} + t^{\u2032}\u2206x^{"+ki+"}): t^{\u2032} = "+TemplateUM.round(tf)+";",
                              xSolv + 40, ySolv + 40,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
       if(nm!=5){
       TemplateUM.drawFormula(g,"�� ������� g_{"+nm+"}(x^{"+ki+"} + t^{\u2032\u2032}\u2206x^{"+ki+"}) = 0 ������� t^{\u2032\u2032} = "+TemplateUM.round(tg)+";",
                              xSolv + 40, ySolv + 60,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
        TemplateUM.drawFormula(g, "����� t_{"+ki+"} = min(t^{\u2032}, t^{\u2032\u2032}) = ("+TemplateUM.round(tf)+"; "+TemplateUM.round(tg)+") = "+TemplateUM.round(tmin[ki])+".",
                              xSolv + 40, ySolv + 80,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
       }

       }

         for(int i=0;i<=ki;i++)
         {
           if(i<ki)Paint_Functions.line(g,xi[i]*m,yi[i]*m,xi[i+1]*m,yi[i+1]*m,Color.lightGray);
           Paint_Functions.point(g,xi[i],yi[i],"x^{"+i+"}",Color.red);
         }
         g.setColor(cvTextFont);
       if(kStep==16)
        {



           xi[ki+1]=xi[ki]+tmin[ki]*(d_1[ki]+dg_1[ki]);
           yi[ki+1]=yi[ki]+tmin[ki]*(d_2[ki]+dg_2[ki]);
           TemplateUM.drawFormula(g,"������� x^{"+(ki+1)+"}:",
                                 xSolv + 45, ySolv + 20,TemplateUM.FontSolution,TemplateUM.FontIndSolution);
          TemplateUM.drawFormula(g,"x^{"+(ki+1)+"}  = ("+TemplateUM.round(xi[ki])+" ; "+
                                 TemplateUM.round(yi[ki])+") +"+TemplateUM.round(tmin[ki])+"("+TemplateUM.round(d_1[ki]+dg_1[ki])+" ; "+TemplateUM.round(d_2[ki]+dg_2[ki])+
                                 ") = ("+TemplateUM.round(+xi[ki+1])+" ; "+TemplateUM.round(+yi[ki+1])+")",
                                xSolv + 45, ySolv + 40,TemplateUM.FontSolution,TemplateUM.FontIndSolution);

         if(Count_Functions.stepT(xi[ki],yi[ki],d_1[ki]+dg_1[ki],d_2[ki]+dg_2[ki])>0) Paint_Functions.point(g,xi[ki+1],yi[ki+1],"x^{"+(ki+1)+"}",Color.blue);



        }

       }
       if(step==92)
       {

         g.setColor(cvFrame);
         g.fillRect(xSolv+1,ySolv+1,aSolv-2,bSolv-2);

         g.setColor(cvTextFont);
         Stringer.fonts[0] = new Font(textFont, styleTextFont, sizeTextFont);
         Stringer.fonts[1] = new Font(textFont, styleTextFont, sizeTextFont-4);
         Stringer.fonts[2] = new Font(textFont, styleTextFont, sizeTextFont-4);
         g.setFont(new java.awt.Font(textFont, styleTextFont, sizeTextFont));
         Stringer.drawString("������ ������������ ������� ������� f(x):",xSolv+35,ySolv+30);
         Stringer.drawString("x^{*} = x^{"+ki+"} = ("
                             +TemplateUM.round(xi[ki])+" ; "+TemplateUM.round(yi[ki])+")",xSolv+45,ySolv+50);

       }



    }
    }

  //Construct the applet
  public UprGradKriv() {
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
    A=1; B=1; Cx=0; Cy=0; K=0; M=0;
    x0=-60;dx0=20;y0=-40;dy0=20;m=20; acc=10;
    step=0; dg_1[ki]=0; dg_2[ki]=0;
    for(int i=0;i<maxKi;i++)
    {
      xi[i]=0; yi[i]=0; }
    this.getContentPane().setBackground(SystemColor.control);
    this.setSize(new Dimension(aBody,bBody));
    this.addMouseListener(new UprGradKriv_this_mouseAdapter(this));
    this.getContentPane().setLayout(null);
    myjPanel.setLayout(null);
    myjPanel.setBackground(cvBody);
    myjPanel.setBounds(new Rectangle(0,0,aBody,bBody));
    jBtnNext.setBackground(cvBtn);
    jBtnNext.setBounds(new Rectangle(335, 528, 107, 24));
    jBtnNext.setFont(new java.awt.Font("Dialog", 1, 14));
    jBtnNext.setBorder(BorderFactory.createEtchedBorder());
    jBtnNext.setContentAreaFilled(true);
    jBtnNext.setFocusPainted(true);
    jBtnNext.setText("==>");
    jBtnNext.addActionListener(new UprGradKriv_jBtnNext_actionAdapter(this));
    jBtnRefresh.setText("��������");
    jBtnRefresh.addActionListener(new UprGradKriv_jBtnRefresh_actionAdapter(this));
    jBtnRefresh.setFocusPainted(true);
    jBtnRefresh.setContentAreaFilled(true);
    jBtnRefresh.setBorder(BorderFactory.createEtchedBorder());
    jBtnRefresh.setFont(new java.awt.Font("Dialog", 1, 12));
    jBtnRefresh.setBounds(new Rectangle(207, 528, 108, 24));
    jBtnRefresh.setBackground(cvBtn);
    jSldrA.setMinimum(1);
    jSldrA.setMaximum(10);
    jSldrA.setValue(1);
    jSldrA.setBackground(cvFrame);
    jSldrA.setBounds(new Rectangle(86, 445, 91, 24));
    jSldrA.addChangeListener(new UprGradKriv_jSldrA_changeAdapter(this));
    jSldrB.setBounds(new Rectangle(86, 477, 91, 24));
    jSldrB.addChangeListener(new UprGradKriv_jSldrB_changeAdapter(this));
    jSldrB.setMinimum(1);
    jSldrB.setMaximum(10);
    jSldrB.setValue(1);
    jSldrB.setBackground(cvFrame);
    jSldrCy.setMajorTickSpacing(0);
    jSldrCy.setMaximum(5);
    jSldrCy.setMinimum(-5);
    jSldrCy.setValue(0);
    jSldrCy.addChangeListener(new UprGradKriv_jSldrCy_changeAdapter(this));
    jSldrCy.setBackground(cvFrame);
    jSldrCy.setBounds(new Rectangle(232, 477, 91, 24));
    jSldrCx.setBounds(new Rectangle(232, 445, 91, 24));
    jSldrCx.setMaximum(5);
    jSldrCx.setMinimum(-5);
    jSldrCx.setValue(0);
    jSldrCx.addChangeListener(new UprGradKriv_jSldrCx_changeAdapter(this));
    jSldrCx.setBackground(cvFrame);
    jSldrK.setBounds(new Rectangle(379, 445, 91, 24));
    jSldrK.addChangeListener(new UprGradKriv_jSldrK_changeAdapter(this));
    jSldrK.setMaximum(2);
    jSldrK.setMinimum(-2);
    jSldrK.setValue(0);
    jSldrK.setBackground(cvFrame);
    jBtnPlus.setBackground(cvBtn);
    jBtnPlus.setBounds(new Rectangle(367, 327, 21, 23));
    jBtnPlus.setBorder(BorderFactory.createRaisedBevelBorder());
    jBtnPlus.setText("+");
    jBtnPlus.addActionListener(new UprGradKriv_jBtnPlus_actionAdapter(this));
    jBtnMinus.setText("-");
    jBtnMinus.addActionListener(new UprGradKriv_jBtnMinus_actionAdapter(this));
    jBtnMinus.setBorder(BorderFactory.createRaisedBevelBorder());
    jBtnMinus.setBackground(cvBtn);
    jBtnMinus.setBounds(new Rectangle(392, 327, 21, 23));
    jBtnLeft.setText("\u2190");
    jBtnLeft.addActionListener(new UprGradKriv_jBtnLeft_actionAdapter(this));
    jBtnLeft.setBorder(BorderFactory.createRaisedBevelBorder());
    jBtnLeft.setBackground(cvBtn);
    jBtnLeft.setBounds(new Rectangle(417, 327, 21, 23));
    jBtnDown.setBackground(cvBtn);
    jBtnDown.setBounds(new Rectangle(467, 327, 21, 23));
    jBtnDown.setBorder(BorderFactory.createRaisedBevelBorder());
    jBtnDown.setText("\u2193");
    jBtnDown.addActionListener(new UprGradKriv_jBtnDown_actionAdapter(this));
    jBtnRight.setText("\u2192");
    jBtnRight.addActionListener(new UprGradKriv_jBtnRight_actionAdapter(this));
    jBtnRight.setBorder(BorderFactory.createRaisedBevelBorder());
    jBtnRight.setBackground(cvBtn);
    jBtnRight.setBounds(new Rectangle(442, 327, 21, 23));
    jBtnUp.setBackground(cvBtn);
    jBtnUp.setBounds(new Rectangle(492, 327, 21, 23));
    jBtnUp.setBorder(BorderFactory.createRaisedBevelBorder());
    jBtnUp.setText("\u2191");
    jBtnUp.addActionListener(new UprGradKriv_jBtnUp_actionAdapter(this));
    jSldrM.setBackground(cvFrame);
    jSldrM.setValue(0);
    jSldrM.setMinimum(-2);
    jSldrM.setMaximum(2);
    jSldrM.addChangeListener(new UprGradKriv_jSldrM_changeAdapter(this));
    jSldrM.setBounds(new Rectangle(379, 477, 91, 24));
    jSldrM.addChangeListener(new UprGradKriv_jSldrM_changeAdapter(this));
    jsldra1.setMaximum(3);
    jsldra1.setMinimum(1);
    jsldra1.setBackground(Color.white);
    jsldra1.setBounds(new Rectangle(90, 460, 60, 24));
    jsldra1.addChangeListener(new UprGradKriv_jsldra1_changeAdapter(this));
    jsldrb1.setMaximum(4);
    jsldrb1.setMinimum(-4);
    jsldrb1.setBackground(Color.white);
    jsldrb1.setBounds(new Rectangle(200, 460, 60, 24));
    jsldrb1.addChangeListener(new UprGradKriv_jsldrb1_changeAdapter(this));
    jsldrc1.setMaximum(4);
    jsldrc1.setMinimum(-4);
    jsldrc1.setBackground(Color.white);
    jsldrc1.setBounds(new Rectangle(310, 460, 60, 24));
    jsldrc1.addChangeListener(new UprGradKriv_jsldrc1_changeAdapter(this));
    jsldra1.setVisible(false);
    jsldrb1.setVisible(false);
    jsldrc1.setVisible(false);

    jchb_g1.setSelected(false);
    jchb_g2.setSelected(false);
    jchb_g3.setSelected(false);
    jchb_g4.setSelected(false);

    jchb_g2.setBackground(Color.white);
    jchb_g2.setFont(new java.awt.Font("Dialog", 1, 14));
    jchb_g1.setForeground(cvTextFont);
    jchb_g2.setForeground(cvTextFont);
    jchb_g3.setForeground(cvTextFont);
    jchb_g4.setForeground(cvTextFont);
    jchb_g2.setText("������������ ��������");
    jchb_g2.setBounds(new Rectangle(304, 420, 203, 23));
    jchb_g2.addMouseListener(new UprGradKriv_jchb_g2_mouseAdapter(this));
    jchb_g3.setBackground(Color.white);
    jchb_g3.setFont(new java.awt.Font("Dialog", 1, 14));
    jchb_g3.setToolTipText("");
    jchb_g3.setText("������ �����");
    jchb_g3.setBounds(new Rectangle(62, 455, 139, 23));
    jchb_g3.addMouseListener(new UprGradKriv_jchb_g3_mouseAdapter(this));
    jchb_g4.setBackground(Color.white);
    jchb_g4.setFont(new java.awt.Font("Dialog", 1, 14));
    jchb_g4.setText("������ �����");
    jchb_g4.setBounds(new Rectangle(304, 455, 144, 23));
    jchb_g4.addMouseListener(new UprGradKriv_jchb_g4_mouseAdapter(this));
    jchb_g1.setBackground(Color.white);
    jchb_g1.setFont(new java.awt.Font("Dialog", 1, 14));
    jchb_g1.setText("�������������� ��������");
    jchb_g1.setBounds(new Rectangle(62, 420, 224, 21));
    jchb_g1.addMouseListener(new UprGradKriv_jchb_g1_mouseAdapter(this));
    jbtnPrevious.setBounds(new Rectangle(80, 528, 107, 24));
    jbtnPrevious.setFont(new java.awt.Font("Dialog", 1, 14));
    jbtnPrevious.setBorder(BorderFactory.createEtchedBorder());
    jbtnPrevious.setText("<==");
    jbtnPrevious.setBackground(cvBtn);
    jbtnPrevious.addMouseListener(new UprGradKriv_jbtnPrevious_mouseAdapter(this));
    jsldrTeta.setMaximum(10);
    jsldrTeta.setMinimum(6);
    jsldrTeta.setValue(10);
    jsldrTeta.setBackground(Color.white);
    jsldrTeta.setForeground(SystemColor.control);
    jsldrTeta.setBounds(new Rectangle(280, 440, 60, 24));
    jsldrTeta.addChangeListener(new UprGradKriv_jsldrTeta_changeAdapter(this));
    myjPanel.add(jSldrB, null);
    myjPanel.add(jSldrCy, null);
    myjPanel.add(jSldrK, null);
    myjPanel.add(jSldrA, null);
    myjPanel.add(jSldrCx, null);
    myjPanel.add(jBtnRefresh, null);
    myjPanel.add(jBtnNext, null);
    myjPanel.add(jbtnPrevious, null);
    myjPanel.add(jBtnRight, null);
    myjPanel.add(jBtnDown, null);
    myjPanel.add(jBtnUp, null);
    myjPanel.add(jBtnPlus, null);
    myjPanel.add(jBtnMinus, null);
    myjPanel.add(jBtnLeft, null);
    myjPanel.add(jSldrM, null);
    myjPanel.add(jsldra1, null);
    myjPanel.add(jsldrb1, null);
    myjPanel.add(jsldrc1, null);
    myjPanel.add(jchb_g2, null);
    myjPanel.add(jchb_g1, null);
    myjPanel.add(jchb_g3, null);
    myjPanel.add(jchb_g4, null);
    myjPanel.add(jsldrTeta, null);
    this.getContentPane().add(myjPanel, null);
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



  void jSldrA_stateChanged(ChangeEvent e) {
    A=jSldrA.getValue();
    repaint();

  }

  void jSldrB_stateChanged(ChangeEvent e) {
    B=jSldrB.getValue();
    repaint();
  }

  void jBtnRefresh_actionPerformed(ActionEvent e) {
    A=1; B=1; Cx=0; Cy=0; K=0; M=0;
    x0=-60;dx0=20;y0=-40;dy0=20;m=20; acc=10;
    step=0; kStep=0; ki=0; fl=0;
    x1click=1000; x2click=1000; shtr=0;
    a1=1.0; b1=0; c1=0;    g1=1; en1=-1; // x1=a1(x2-c1)^2+b1
    a2=1.0; b2=-2;c2=4;    g2=1; en2=-1;// x2=a2(x1-c2)^2+b2
    a3=2.0; b3=-1; c3=4;    g3=1; en3=-1;// x2=kp(x1-cp)+bp
    a4=-1.0; b4=-1; c4=4;   g4=1; en4=-1;// x2=kp(x1-cp)+bp

   for(int h=0;h<maxKi+5;h++){
    nom[h]=-1;nom1[h]=-1;nom2[h]=-1; posch[h]=0;  // ������ � ���-�� �������� ���-���
    a11[h]=0;a12[h]=0;a21[h]=0;a22[h]=0;  // ����������� �� ���� ���-��
    a_1[h]=0;a_2[h]=0;  // ����������� �� ������ ���-�
    dg_1[h]=0; dg_2[h]=0;}

  jchb_g1.setSelected(false);
  jchb_g2.setSelected(false);
  jchb_g3.setSelected(false);
  jchb_g4.setSelected(false);

    exit=false;
    for(int i=0;i<maxKi;i++)
    {

      xi[i]=0; yi[i]=0; }
    d_1[ki]=0; d_2[ki]=0; dg_1[ki]=0; dg_2[ki]=0;teta=1.0;
    jSldrA.setVisible(true);
    jSldrB.setVisible(true);
    jSldrCx.setVisible(true);
    jSldrCy.setVisible(true);
    jSldrK.setVisible(true);
    jSldrM.setVisible(true);
    jSldrA.setValue(A);
    jSldrB.setValue(B);
    jSldrCx.setValue(Cx);
    jSldrCy.setValue(Cy);
    jSldrK.setValue(K);
    jSldrM.setValue(M);
    jBtnNext.setEnabled(true);
    repaint();
  }

  void jSldrCx_stateChanged(ChangeEvent e) {
    Cx=jSldrCx.getValue();
    repaint();

  }

  void jSldrCy_stateChanged(ChangeEvent e) {
    Cy=jSldrCy.getValue();
    repaint();

  }

  void jSldrK_stateChanged(ChangeEvent e) {
    K=jSldrK.getValue();
    if(K==1&&M==1||K==-1&&M==-1)
      K=0;
    repaint();

  }





  void jBtnLeft_actionPerformed(ActionEvent e) {
   x0+=dx0;
   repaint();
  }

  void jBtnRight_actionPerformed(ActionEvent e) {
   x0-=dx0;
   repaint();
  }

  void jBtnDown_actionPerformed(ActionEvent e) {
    y0+=dy0;
    repaint();

  }

  void jBtnUp_actionPerformed(ActionEvent e) {
    y0-=dy0;
    repaint();
  }

  void jBtnPlus_actionPerformed(ActionEvent e) {
   if(m<100)
   {
     m+=acc;
     repaint();
   }
  }

  void jBtnMinus_actionPerformed(ActionEvent e) {
    if(m>10)
    {
      m -= acc;
      repaint();
    }
  }

  void jSldrM_stateChanged(ChangeEvent e) {
    M=jSldrM.getValue();
    if(K==1&&M==1||K==-1&&M==-1)
      M=0;
    repaint();
  }


  void jBtnNext_actionPerformed(ActionEvent e) {
   if(step<maxStep) {
     step++;
     if(step==2&&g1==1) { step++; kStep++;}
     if(step==3&&g2==1) { step++; kStep++;}
     if(step==4&&g3==1) { step++; kStep++;}
     if(step==5&&g4==1) { step++; kStep++;}
     if(step==1&&g1==1&&g2==1&&g3==1&&g4==1) jBtnNext.setEnabled(false);



     jbtnPrevious.setEnabled(true);
    if(kStep>=16)
     {kStep=8; ki++;
       en1=-1;en2=-1;en3=-1;en4=-1; d_1[ki]=0; d_2[ki]=0; dg_1[ki]=0; dg_2[ki]=0;
     }
     else kStep++;

   }
   else jBtnNext.setEnabled(false);

   if(step>1&&step<=6) {shtr=0; x1click=100; x2click=100;}

   if(step==2||step==3||step==4||step==5||step==6)
   {
     jBtnNext.setEnabled(false);
     if(step==4) {jsldra1.setMinimum(-3);}
     jsldra1.setValue(2);
     jsldrb1.setValue(0);
     jsldrc1.setValue(0);
   }
   repaint();
  }

  void this_mouseClicked(MouseEvent e) {
   if(e.getX()>xGraph&&e.getX()<xGraph+aGraph&&
      e.getY()>yGraph&&e.getY()<yGraph+bGraph&&ki==0&&(step>1&&step<7))
   {
     if(step==6){
     xi[0]=(e.getX()-(x0+xGraph+aGraph/2))/(double)m; yi[0]=(-e.getY()+(-y0+yGraph+bGraph/2))/(double)m;
     xi[0]=((double)((int)(xi[0]*10)))/(double)10; yi[0]=((double)((int)(yi[0]*10)))/(double)10;
     if((Count_Functions.g1x(xi[0],yi[0])<=0||g1==1)&&(Count_Functions.g2x(xi[0],yi[0])<=0||g2==1)
        &&(Count_Functions.g3x(xi[0],yi[0])<=0||g3==1)&&(Count_Functions.g4x(xi[0],yi[0])<=0||g4==1))
     { shtr=1;
       if((Count_Functions.g1x(xi[0],yi[0])==0&&g1==0)||(Count_Functions.g2x(xi[0],yi[0])==0&&g2==0)
        ||(Count_Functions.g3x(xi[0],yi[0])==0&&g3==0)||(Count_Functions.g4x(xi[0],yi[0])==0&&g4==0))
       shtr=2;
     }
     else shtr=0;
      }
     if(step==2&&shtr==0){
     x1click=(e.getX()-(x0+xGraph+aGraph/2))/(double)m; x2click=(-e.getY()+(-y0+yGraph+bGraph/2))/(double)m;
     x1click=((double)((int)(x1click*10)))/(double)10; x2click=((double)((int)(x2click*10)))/(double)10;
      if(Count_Functions.g1x(x1click,x2click)<0) shtr=1;}
     if(step==3&&shtr==0){
     x1click=(e.getX()-(x0+xGraph+aGraph/2))/(double)m; x2click=(-e.getY()+(-y0+yGraph+bGraph/2))/(double)m;
     x1click=((double)((int)(x1click*10)))/(double)10; x2click=((double)((int)(x2click*10)))/(double)10;
      if(Count_Functions.g2x(x1click,x2click)<0) shtr=1;}
     if(step==4&&shtr==0){
     x1click=(e.getX()-(x0+xGraph+aGraph/2))/(double)m; x2click=(-e.getY()+(-y0+yGraph+bGraph/2))/(double)m;
     x1click=((double)((int)(x1click*10)))/(double)10; x2click=((double)((int)(x2click*10)))/(double)10;
      if(Count_Functions.g3x(x1click,x2click)<0) shtr=1;}
     if(step==5&&shtr==0){
     x1click=(e.getX()-(x0+xGraph+aGraph/2))/(double)m; x2click=(-e.getY()+(-y0+yGraph+bGraph/2))/(double)m;
     x1click=((double)((int)(x1click*10)))/(double)10; x2click=((double)((int)(x2click*10)))/(double)10;
      if(Count_Functions.g4x(x1click,x2click)<0) shtr=1;}
     if(shtr!=0)jBtnNext.setEnabled(true);
     if(shtr==0)jBtnNext.setEnabled(false);
     repaint();
   }
  }

  void jsldra1_stateChanged(ChangeEvent e) {

    if(step==2&&jsldra1.getValue()!=0&&shtr==0)
      {
        if(jsldra1.getValue()==1||jsldra1.getValue()==-1) a1 = 0.1*jsldra1.getValue();
        if(jsldra1.getValue()==2||jsldra1.getValue()==-2) a1 = 0.5*jsldra1.getValue();
        if(jsldra1.getValue()==3||jsldra1.getValue()==-3) a1 = 1*jsldra1.getValue();

      }
    if(step==3&&jsldra1.getValue()!=0&&shtr==0)
      {
        if(jsldra1.getValue()==1||jsldra1.getValue()==-1) a2 = 0.1*jsldra1.getValue();
        if(jsldra1.getValue()==2||jsldra1.getValue()==-2) a2 = 0.5*jsldra1.getValue();
        if(jsldra1.getValue()==3||jsldra1.getValue()==-3) a2 = 1*jsldra1.getValue();

      }
    if(step==4&&jsldra1.getValue()!=0&&shtr==0)
      a3=jsldra1.getValue();
    if(step==5&&jsldra1.getValue()!=0&&shtr==0)
      a4=jsldra1.getValue();
    repaint();
  }

  void jsldrb1_stateChanged(ChangeEvent e) {
    if(step==2&&shtr==0) b1=jsldrb1.getValue();
    if(step==3&&shtr==0) b2=jsldrb1.getValue();
    if(step==4&&shtr==0) b3=jsldrb1.getValue();
    if(step==5&&shtr==0) b4=jsldrb1.getValue();
    repaint();

  }

  void jsldrc1_stateChanged(ChangeEvent e) {
    if(step==2&&shtr==0) c1=jsldrc1.getValue();
    if(step==3&&shtr==0) c2=jsldrc1.getValue();
    if(step==4&&shtr==0) c3=jsldrc1.getValue();
    if(step==5&&shtr==0) c4=jsldrc1.getValue();
    repaint();

  }
  private int getW(String str,Graphics g){
       return g.getFontMetrics().stringWidth(str);
    }



  void jchb_g1_mouseClicked(MouseEvent e) {
    if(jchb_g1.isSelected())
      g1=0;
    else g1=1;
    if(g1==1&&g2==1&&g3==1&&g4==1) jBtnNext.setEnabled(false);
    else jBtnNext.setEnabled(true);
    repaint();
  }

  void jchb_g3_mouseClicked(MouseEvent e) {
    if(jchb_g3.isSelected())
     g3=0;
   else g3=1;
   if(g1==1&&g2==1&&g3==1&&g4==1) jBtnNext.setEnabled(false);
   else jBtnNext.setEnabled(true);
  repaint();
  }

  void jchb_g2_mouseClicked(MouseEvent e) {
    if(jchb_g2.isSelected())
    g2=0;
  else g2=1;
  if(g1==1&&g2==1&&g3==1&&g4==1) jBtnNext.setEnabled(false);
  else jBtnNext.setEnabled(true);
 repaint();
  }

  void jchb_g4_mouseClicked(MouseEvent e) {
    if(jchb_g4.isSelected())
     g4=0;
   else g4=1;
   if(g1==1&&g2==1&&g3==1&&g4==1) jBtnNext.setEnabled(false);
   else jBtnNext.setEnabled(true);
  repaint();
  }

  void jbtnPrevious_mouseClicked(MouseEvent e) {
    if(step>0) { step--;
      kStep--;if(kStep<=11){d_1[ki]=0; d_2[ki]=0; dg_1[ki]=0; dg_2[ki]=0;}
      if(kStep==8)
       { if(ki>0){ki--; kStep=16;
         }else{step=8;}
         }

      if(step==5&&g4==1) { step--; kStep--;}
      if(step==4&&g3==1) { step--; kStep--;}
      if(step==3&&g2==1) { step--; kStep--;}
      if(step==2&&g1==1) { step--; kStep--;}
      if(step==2&&g1==0) { shtr=0;}
      if(step==3&&g2==0) { shtr=0;}
      if(step==4&&g3==0) { shtr=0;}
      if(step==5&&g4==0) { shtr=0;}

      jBtnNext.setEnabled(true);
      exit=false;
       //if(kStep==8) ki--;
    }
    else jbtnPrevious.setEnabled(false);

   repaint();
  }

  void jsldrTeta_stateChanged(ChangeEvent e) {
    teta=jsldrTeta.getValue()/10.0;
    repaint();
  }


}

class UprGradKriv_jSldrA_changeAdapter implements javax.swing.event.ChangeListener {
  UprGradKriv adaptee;

  UprGradKriv_jSldrA_changeAdapter(UprGradKriv adaptee) {
    this.adaptee = adaptee;
  }
  public void stateChanged(ChangeEvent e) {
    adaptee.jSldrA_stateChanged(e);
  }
}

class UprGradKriv_jSldrB_changeAdapter implements javax.swing.event.ChangeListener {
  UprGradKriv adaptee;

  UprGradKriv_jSldrB_changeAdapter(UprGradKriv adaptee) {
    this.adaptee = adaptee;
  }
  public void stateChanged(ChangeEvent e) {
    adaptee.jSldrB_stateChanged(e);
  }
}

class UprGradKriv_jBtnRefresh_actionAdapter implements java.awt.event.ActionListener {
  UprGradKriv adaptee;

  UprGradKriv_jBtnRefresh_actionAdapter(UprGradKriv adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jBtnRefresh_actionPerformed(e);
  }
}

class UprGradKriv_jSldrCx_changeAdapter implements javax.swing.event.ChangeListener {
  UprGradKriv adaptee;

  UprGradKriv_jSldrCx_changeAdapter(UprGradKriv adaptee) {
    this.adaptee = adaptee;
  }
  public void stateChanged(ChangeEvent e) {
    adaptee.jSldrCx_stateChanged(e);
  }
}

class UprGradKriv_jSldrCy_changeAdapter implements javax.swing.event.ChangeListener {
  UprGradKriv adaptee;

  UprGradKriv_jSldrCy_changeAdapter(UprGradKriv adaptee) {
    this.adaptee = adaptee;
  }
  public void stateChanged(ChangeEvent e) {
    adaptee.jSldrCy_stateChanged(e);
  }
}

class UprGradKriv_jSldrK_changeAdapter implements javax.swing.event.ChangeListener {
  UprGradKriv adaptee;

  UprGradKriv_jSldrK_changeAdapter(UprGradKriv adaptee) {
    this.adaptee = adaptee;
  }
  public void stateChanged(ChangeEvent e) {
    adaptee.jSldrK_stateChanged(e);
  }
}

class UprGradKriv_jBtnLeft_actionAdapter implements java.awt.event.ActionListener {
  UprGradKriv adaptee;

  UprGradKriv_jBtnLeft_actionAdapter(UprGradKriv adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jBtnLeft_actionPerformed(e);
  }
}

class UprGradKriv_jBtnRight_actionAdapter implements java.awt.event.ActionListener {
  UprGradKriv adaptee;

  UprGradKriv_jBtnRight_actionAdapter(UprGradKriv adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jBtnRight_actionPerformed(e);
  }
}

class UprGradKriv_jBtnDown_actionAdapter implements java.awt.event.ActionListener {
  UprGradKriv adaptee;

  UprGradKriv_jBtnDown_actionAdapter(UprGradKriv adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jBtnDown_actionPerformed(e);
  }
}

class UprGradKriv_jBtnUp_actionAdapter implements java.awt.event.ActionListener {
  UprGradKriv adaptee;

  UprGradKriv_jBtnUp_actionAdapter(UprGradKriv adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jBtnUp_actionPerformed(e);
  }
}

class UprGradKriv_jBtnPlus_actionAdapter implements java.awt.event.ActionListener {
  UprGradKriv adaptee;

  UprGradKriv_jBtnPlus_actionAdapter(UprGradKriv adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jBtnPlus_actionPerformed(e);
  }
}

class UprGradKriv_jBtnMinus_actionAdapter implements java.awt.event.ActionListener {
  UprGradKriv adaptee;

  UprGradKriv_jBtnMinus_actionAdapter(UprGradKriv adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jBtnMinus_actionPerformed(e);
  }
}

class UprGradKriv_jSldrM_changeAdapter implements javax.swing.event.ChangeListener {
  UprGradKriv adaptee;

  UprGradKriv_jSldrM_changeAdapter(UprGradKriv adaptee) {
    this.adaptee = adaptee;
  }
  public void stateChanged(ChangeEvent e) {
    adaptee.jSldrM_stateChanged(e);
  }
}

class UprGradKriv_jBtnNext_actionAdapter implements java.awt.event.ActionListener {
  UprGradKriv adaptee;

  UprGradKriv_jBtnNext_actionAdapter(UprGradKriv adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jBtnNext_actionPerformed(e);
  }
}

class UprGradKriv_this_mouseAdapter extends java.awt.event.MouseAdapter {
  UprGradKriv adaptee;

  UprGradKriv_this_mouseAdapter(UprGradKriv adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseClicked(MouseEvent e) {
    adaptee.this_mouseClicked(e);
  }
}

class UprGradKriv_jsldra1_changeAdapter implements javax.swing.event.ChangeListener {
  UprGradKriv adaptee;

  UprGradKriv_jsldra1_changeAdapter(UprGradKriv adaptee) {
    this.adaptee = adaptee;
  }
  public void stateChanged(ChangeEvent e) {
    adaptee.jsldra1_stateChanged(e);
  }
}

class UprGradKriv_jsldrb1_changeAdapter implements javax.swing.event.ChangeListener {
  UprGradKriv adaptee;

  UprGradKriv_jsldrb1_changeAdapter(UprGradKriv adaptee) {
    this.adaptee = adaptee;
  }
  public void stateChanged(ChangeEvent e) {
    adaptee.jsldrb1_stateChanged(e);
  }
}

class UprGradKriv_jsldrc1_changeAdapter implements javax.swing.event.ChangeListener {
  UprGradKriv adaptee;

  UprGradKriv_jsldrc1_changeAdapter(UprGradKriv adaptee) {
    this.adaptee = adaptee;
  }
  public void stateChanged(ChangeEvent e) {
    adaptee.jsldrc1_stateChanged(e);
  }
}

class UprGradKriv_jchb_g1_mouseAdapter extends java.awt.event.MouseAdapter {
  UprGradKriv adaptee;

  UprGradKriv_jchb_g1_mouseAdapter(UprGradKriv adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseClicked(MouseEvent e) {
    adaptee.jchb_g1_mouseClicked(e);
  }
}

class UprGradKriv_jchb_g3_mouseAdapter extends java.awt.event.MouseAdapter {
  UprGradKriv adaptee;

  UprGradKriv_jchb_g3_mouseAdapter(UprGradKriv adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseClicked(MouseEvent e) {
    adaptee.jchb_g3_mouseClicked(e);
  }
}

class UprGradKriv_jchb_g2_mouseAdapter extends java.awt.event.MouseAdapter {
  UprGradKriv adaptee;

  UprGradKriv_jchb_g2_mouseAdapter(UprGradKriv adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseClicked(MouseEvent e) {
    adaptee.jchb_g2_mouseClicked(e);
  }
}

class UprGradKriv_jchb_g4_mouseAdapter extends java.awt.event.MouseAdapter {
  UprGradKriv adaptee;

  UprGradKriv_jchb_g4_mouseAdapter(UprGradKriv adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseClicked(MouseEvent e) {
    adaptee.jchb_g4_mouseClicked(e);
  }
}

class UprGradKriv_jbtnPrevious_mouseAdapter extends java.awt.event.MouseAdapter {
  UprGradKriv adaptee;

  UprGradKriv_jbtnPrevious_mouseAdapter(UprGradKriv adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseClicked(MouseEvent e) {
    adaptee.jbtnPrevious_mouseClicked(e);
  }
}

class UprGradKriv_jsldrTeta_changeAdapter implements javax.swing.event.ChangeListener {
  UprGradKriv adaptee;

  UprGradKriv_jsldrTeta_changeAdapter(UprGradKriv adaptee) {
    this.adaptee = adaptee;
  }
  public void stateChanged(ChangeEvent e) {
    adaptee.jsldrTeta_stateChanged(e);
  }
}


