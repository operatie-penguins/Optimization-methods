package strsimplex;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class AppStrSimplex extends JApplet {
  JButton jButton1 = new JButton();
  JButton jButton2 = new JButton();
  JButton jButton3 = new JButton();
  JLabel jLabel1 = new JLabel();
  public int sh=1;
  Panel_mypaint jPanel1 = new Panel_mypaint();
  JLabel jLabel2 = new JLabel();

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
    this.getContentPane().setBackground(new Color(247, 247, 255));
    this.setSize(new Dimension(651,480));
    this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseMoved(MouseEvent e) {
        this_mouseMoved(e);
      }
    });
    this.getContentPane().setLayout(null);
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel1.setForeground(new Color(130, 0, 80));
    jLabel1.setText("Идея поиска минимума функции симплекс-методом");
    jLabel1.setBounds(new Rectangle(118, 1, 414, 17));
    jPanel1.setBounds(new Rectangle(5,18,641,430));
    jPanel1.setBackground(new Color(247, 247, 255));
    jButton1.setBackground(new Color(220, 230, 255));
    jButton1.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton1.setForeground(new Color(0, 0, 60));
    jButton1.setText("==>");
    jButton1.setBounds(new Rectangle(395, 450, 100, 23));
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton1_actionPerformed(e);
      }
    });
    jButton2.setBackground(new Color(220, 230, 255));
    jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton2.setForeground(new Color(0, 0, 60));
    jButton2.setText("Обновить");
    jButton2.setBounds(new Rectangle(275, 450, 100, 23));
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton2_actionPerformed(e);
      }
    });
    jButton3.setBackground(new Color(220, 230, 255));
    jButton3.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton3.setForeground(new Color(0, 0, 60));
    jButton3.setText("<==");
    jButton3.setBounds(new Rectangle(155, 450, 100, 23));
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton3_actionPerformed(e);
      }
    });
    jLabel2.setText("");
    jLabel2.setBounds(new Rectangle(5, 3, 189, 17));
    this.getContentPane().add(jLabel2, null);
    this.getContentPane().add(jPanel1, null);
    this.getContentPane().add(jLabel1, null);
    this.getContentPane().add(jButton1, null);
    this.getContentPane().add(jButton2, null);
    this.getContentPane().add(jButton3, null);
  }
  public void Ind_n(Graphics g,String a, String b, int x, int y){
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
    g.drawString(""+a,x,y);
    g.setFont(new java.awt.Font("SansSerif", 1, 11));
    g.drawString(""+b+" ",x+a.length()*8,y+5);
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
  }
  public void Ind_nbv(Graphics g,String a, String b, String c, int x, int y){
    g.setFont(new java.awt.Font("SansSerif", 1, 15));
    g.drawString(""+a,x,y);
    g.setFont(new java.awt.Font("SansSerif", 1, 11));
    g.drawString(""+c+" ",x+a.length()*8,y-3);
    g.drawString(""+b+" ",x+a.length()*8,y+4);
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
  }
  public void Ind_nk(Graphics g,String a, String b, int x, int y){
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
    g.drawString(""+a,x,y);
    g.setFont(new java.awt.Font("SansSerif", 3, 11));
    g.drawString(""+b+" ",x+a.length()*8,y+2);
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
  }
  public void Ind_nb(Graphics g,String a, String b, int x, int y){
    g.setFont(new java.awt.Font("SansSerif", 1, 15));
    g.drawString(""+a,x,y);
    g.setFont(new java.awt.Font("SansSerif", 1, 11));
    g.drawString(""+b+" ",x+a.length()*8,y+4);
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
  }
  public void Ind_nbk(Graphics g,String a, String b, int x, int y){
    g.setFont(new java.awt.Font("SansSerif", 1, 15));
    g.drawString(""+a,x,y);
    g.setFont(new java.awt.Font("SansSerif", 3, 11));
    g.drawString(""+b+" ",x+a.length()*8,y+2);
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
  }

  public void Tabl1(Graphics g, int a, int c, int t, int h, boolean f, int bp[]){ //Рисует верхнюю таблицу
    if(h==0) g.setColor(Color.red); else g.setColor(new Color(180, 0, 80));
    g.setFont(new java.awt.Font("SansSerif", 3, 13));
    g.drawString("Таблица "+t+":",15,123);
    g.setColor(new Color(255, 255, 255)); g.fillRect(7,127,422,2+17*(3+c));
    g.setColor(Color.black);
    for(int i=0; i<=a+1; i++)
      g.drawLine(128+i*60,128,128+i*60,128+17*(c+3));
    for(int i=0; i<=3; i++)
      if(i==0) g.drawLine(8+i*40,128,8+i*40,128+17*(c+3));
      else g.drawLine(8+i*40,128,8+i*40,128+17*(c+2));
    for(int i=0; i<=3+c; i++)
      if(i==1) g.drawLine(128,128+i*17,428,128+i*17);
      else g.drawLine(8,128+i*17,428,128+i*17);
    g.setColor(new Color(157, 187, 255)); g.drawRect(7,127,422,2+17*(3+c));
    g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 13));
    if (f==true){
      g.drawString("БП",59,150); g.drawString("БР",99,150);
      g.drawString("БР/",139+60*a,159); Ind_nk(g,"a","ir",162+60*a,159);
      Ind_nk(g,"c","i",23,150); Ind_nk(g,"c","j",153+a*60,139);
      for(int i=1; i<=a; i++)
        Ind_n(g,"x",""+i,153+(i-1)*60,156);
      for(int i=0; i<c; i++)
        if(bp[i]>0) Ind_n(g,"x",""+bp[i],62,173+i*17);
      Ind_nbk(g,"\u2206","  j",153+a*60,175+c*17);
    }
  }
  public void Tabl2(Graphics g, int a, int c, int t, int h, boolean f, int bp[]){ //Рисует нижнюю таблицу
    if(h==0) g.setColor(Color.red); else g.setColor(new Color(180, 0, 80));
    g.setFont(new java.awt.Font("SansSerif", 3, 13));
    g.drawString("Таблица "+t+":",15,229);
    g.setColor(new Color(255, 255, 255)); g.fillRect(7,234,422,2+17*(3+c));
    g.setColor(Color.black);
    for(int i=0; i<=a+1; i++)
      g.drawLine(128+i*60,234,128+i*60,234+17*(3+c));
    for(int i=0; i<=3; i++)
      if(i==0) g.drawLine(8+i*40,234,8+i*40,234+17*(3+c));
      else g.drawLine(8+i*40,234,8+i*40,234+17*(2+c));
    for(int i=0; i<=3+c; i++)
      if(i==1) g.drawLine(128,235+i*17,428,235+i*17);
      else g.drawLine(8,235+i*17,428,235+i*17);
    g.setColor(new Color(157, 187, 255)); g.drawRect(7,234,422,2+17*(3+c));
    g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 13));
    if (f==true){
      g.drawString("БП",59,257); g.drawString("БР",99,257);
      g.drawString("БР/",139+60*a,266); Ind_nk(g,"a","ir",162+60*a,266);
      Ind_nk(g,"c","i",23,257); Ind_nk(g,"c","j",153+a*60,246);
      for(int i=1; i<=a; i++)
        Ind_n(g,"x",""+i,153+(i-1)*60,263);
      for(int i=0; i<c; i++)
        if(bp[i]>0) Ind_n(g,"x",""+bp[i],62,280+i*17);
      Ind_nbk(g,"\u2206","  j",153+a*60,282+c*17);
    }
  }
  public void Tb1(Graphics g, int a, int c, String tbn[][], String tbd[][], int bp[]){ //Заполняет верхнюю таблицу
    g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
    int l=0; int p;
    String jj=""; int ii;
    for (int i=0; i<=c+1; i++)
      for (int j=0; j<=a; j++){
        jj="";
        g.setColor(new Color(0, 0, 160));
        if(i==0) g.setColor(new Color(0, 0, 80));//g.setColor(new Color(150, 0, 80));
        if (j==0) p=40; else p=60;
        if(tbn[i][j]!=""){
            if((tbd[i][j]=="") || (tbn[i][j]=="0")) jj=tbn[i][j];
            else jj=tbn[i][j]+"/"+tbd[i][j];
        }
        if(i!=0){
          Stringer.drawString(jj,(int)(88+(p-40)*(3*j-1)+(p-8)/2),159-jj.length()/2+i*17);
        }
        else Stringer.drawString(tbn[i][j],(int)(88+(p-40)*(3*j-1)+(p-8)/2),142-jj.length()/2+i*17);
      }
    g.setColor(new Color(0, 0, 80));//g.setColor(new Color(90, 0, 90));
    for (int i=0; i<c; i++){
      if((bp[i]<20000) && (tbn[0][bp[i]]!="")){
        jj=""+tbn[0][bp[i]];
        g.drawString(jj,(int)(8+(40-8)/2),176-jj.length()/2+i*17);
      }
    }
  }

  class  Panel_mypaint extends JPanel {
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Stringer.setGraphics(g);
      Stringer1.setGraphics(g);
      String s[]={"","","","","","",""}, sm[]={""}, ss="", jj="";
      int n=0, p=0, z=0, l=0, a=4, c=2, nm[]={0},
          bp[]={3,4};
      String tbn[][]={ {"","C_{1}","C_{2}","0","0",""},
                       {"b_{1}","a_{11}","a_{12}","1","0",""},
                       {"b_{2}","a_{21}","a_{22}","0","1",""},
                       {"","","","","",""} },
          tbd[][]={ {"","","","","",""},
                    {"","","","","",""},
                    {"","","","","",""},
                    {"","","","","",""} };
      g.setColor(new Color(180, 0, 80));
      g.setFont(new java.awt.Font("SansSerif", 3, 13));
      g.drawString("Решение:",15,336);
      g.drawString("Обозначения:",500,17);
      g.drawString("Формулы:",457,122);
      g.setColor(new Color(255, 255, 255));
      g.fillRect(7,22,180,85); g.fillRect(207,22,265,85); g.fillRect(492,22,142,85); g.fillRect(450,127,184,34*(c+3)+24); g.fillRect(7,341,627,70);
      g.setColor(new Color(157, 187, 255));
      g.drawRect(7,22,180,85); g.drawRect(207,22,265,85); g.drawRect(492,22,142,85);  g.drawRect(450,127,184,34*(c+3)+24); g.drawRect(7,341,627,70);
      g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 13));
      g.drawString("БП",501,40); g.drawString("БР",501,82);
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.drawString("- базисные",522,40); g.drawString("переменные",532,58);
      g.drawString("- базисное",522,82); g.drawString("решение",532,100);

      if(sh>=1){
        g.setColor(Color.red);
        if(sh==1) g.drawRect(7,22,180,85);
        if(sh==2) g.drawRect(207,22,265,85);
        g.setColor(new Color(180, 0, 80));
        g.setFont(new java.awt.Font("SansSerif", 3, 13));
        g.drawString("Задача:",13,17); g.drawString("Каноническая форма:",213,17);
        if(sh==1) g.setColor(Color.red); g.drawString("Задача:",13,17); g.setColor(new Color(180, 0, 80));
        if(sh==2) g.setColor(Color.red); g.drawString("Каноническая форма:",213,17);
        g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
        if(sh>=2){
          Stringer.drawString("f(x) = C_{1} x_{1} + C_{2} x_{2} + 0 x_{3} + 0 x_{4} \u2192 min",213,37);
          Stringer.drawString("a_{11} x_{1}+ a_{12} x_{2} + 1 x_{3} + 0 x_{4} = b_{1},",237,59);
          Stringer.drawString("a_{21} x_{1}+ a_{22} x_{2} + 0 x_{3} + 1 x_{4} = b_{2},",237,79);
          Stringer.drawString("x_{1},...,x_{4} \u2265 0.",305,99);
        }
        Stringer.drawString("f(x) = C_{1} x_{1} + C_{2} x_{2} \u2192 min",13,37);
        Stringer.drawString("a_{11} x_{1}+ a_{12} x_{2} \u2264 b_{1},",36,59);
        Stringer.drawString("a_{21} x_{1}+ a_{22} x_{2} \u2264 b_{2},",36,79);
        Stringer.drawString("x_{1}, x_{2} \u2265 0.",64,99);
      }
      //Формулы
       if((sh>=7) && (sh<=10)){ g.setColor(Color.red); Stringer.Strelka(g,95,17);}
       else g.setColor(new Color(0, 0, 80));
       Ind_nbk(g,"\u2206","  j",460,153);
       Stringer1.drawString("= c_{j} - z_{j} ,",479,153);
       Stringer1.drawString("z_{j } = \u2211 c_{jB} a_{ij}",543,153);
       Stringer1.drawString("j = 1,...,m+n",465,175);
       Stringer1.drawString("i = 1,...,m",560,175);
       if((sh==11)){ g.setColor(Color.red); Stringer.Strelka(g,118,77);}
       else g.setColor(new Color(0, 0, 80));
       Ind_nbk(g,"\u2206","  r",497,207);
       Ind_nbk(g,"\u2206","  r",571,207);
       Stringer1.drawString("|     | = max |     |",492,207);
       g.setFont(new java.awt.Font("SansSerif", 1, 11));
       g.drawString("\u2206  < 0",535,217);
       g.setFont(new java.awt.Font("SansSerif", 2, 9));
       g.drawString("r",542,219);
       if(sh==13) {g.setColor(Color.red); Stringer.Strelka(g,120,110);}
       else g.setColor(new Color(0, 0, 80));
       g.setFont(new java.awt.Font("SansSerif", 1, 13));
       g.drawString("БР              БР",497,239);
       Stringer1.drawString("a_{ir}              a_{ir}",497,252);
       Stringer1.drawString("=  min",522,245);
       g.setFont(new java.awt.Font("SansSerif", 1, 11));
       g.drawString("a   > 0",536,255);
       g.setFont(new java.awt.Font("SansSerif", 2, 9));
       g.drawString("ir",544,254);
       g.drawLine(496,241,514,241); g.drawLine(570,241,588,241);
       g.drawLine(496,242,514,242); g.drawLine(570,242,588,242);
       if((sh>=15) && (sh<=17)){ g.setColor(Color.red); Stringer.Strelka(g,115,160);}
       else g.setColor(new Color(0, 0, 80));
       Stringer1.drawString("a_{sj } = a_{sj} - ",486,293);
       Stringer1.drawString("a_{sr }* a_{ij}",555,282);
       Stringer1.drawString("a_{ir}",570,301);
       g.drawLine(554,288,600,288); g.drawLine(554,288,600,288);

      if(sh<20){
        if(sh==3)
        {
          Tabl1(g,a,c,1,0,true,bp);
          g.setColor(new Color(255, 255, 255));
          g.fillRect(9,163,419,33);
          g.setColor(Color.black);
          for(int i=0; i<3; i++)
            g.drawLine(48+i*40,163,48+i*40,197);
          for(int i=0; i<a; i++)
            g.drawLine(188+i*60,163,188+i*60,197);
          g.drawLine(9,179,428,179);
        }
        if(sh>=4)
        {
          Tabl1(g,a,c,1,1,true,bp);
          Tb1(g,a,c,tbn,tbd,bp);
          if(sh==4)
          {
            g.setColor(new Color(255, 255, 255));
            g.fillRect(9,163,419,33);
            g.setColor(Color.black);
            for(int i=0; i<3; i++)
              g.drawLine(48+i*40,163,48+i*40,197);
            for(int i=0; i<a; i++)
              g.drawLine(188+i*60,163,188+i*60,197);
            g.drawLine(9,179,428,179);
          }
          if(sh==5)
          {
            g.setColor(new Color(255, 255, 255));
            g.fillRect(129,163,299,33);
            g.setColor(Color.black);
            for(int i=0; i<a; i++)
              g.drawLine(188+i*60,163,188+i*60,197);
            g.drawLine(9,179,428,179);
          }
          if(sh>=7)
          {
            for(int i=1; i<=a; i++)
            {
              if(sh-6 == i) g.setColor(new Color(180, 0, 80));
              else g.setColor(new Color(0, 0, 80));
              Ind_nb(g,"\u2206","  "+i,93+i*60,175+c*17);
            }
          }
          if((sh>=7) && (sh<=10))
          {
            g.setColor(new Color(255, 255, 255));
            g.fillRect(189+60*(sh-7),197,179-60*(sh-7),16);
            g.setColor(Color.black);
            for(int i=sh-7; i<a; i++)
              g.drawLine(188+i*60,197,188+i*60,213);
            g.setColor(Color.red);
            Stringer.drawString(tbn[0][sh-6],(int)(114+20*(3*(sh-6)-1)),142-tbn[0][sh-6].length()/2);
            g.setColor(Color.blue);
            Stringer.drawString(tbn[1][sh-6],(int)(114+20*(3*(sh-6)-1)),159-tbn[1][sh-6].length()/2+17);
            Stringer.drawString(tbn[2][sh-6],(int)(114+20*(3*(sh-6)-1)),159-tbn[2][sh-6].length()/2+34);
          }
          if(sh>=13)
          {
            g.setColor(new Color(230, 230, 255));
            g.fillRect(9,163,419,16);
            g.setColor(Color.black);
            for(int i=0; i<3; i++)
              g.drawLine(48+i*40,163,48+i*40,180);
            for(int i=0; i<a; i++)
              g.drawLine(188+i*60,163,188+i*60,180);
            g.setColor(new Color(0, 0, 80));
            Ind_n(g,"x","3",62,173);
          }
          if(sh>=11)
          {
            g.setColor(new Color(230, 230, 255));
            g.fillRect(129,129,59,83);
            g.setColor(Color.black);
            for(int i=0; i<=c+1; i++)
              g.drawLine(129,145+i*17,188,145+i*17);
            Tb1(g,a,c,tbn,tbd,bp);
            g.setColor(new Color(0, 0, 80));
            Ind_n(g,"x","1",153,156);
            Ind_nb(g,"\u2206","  1",153,175+c*17);
          }
          if(sh>=12)
          {
            if(sh==12) g.setColor(Color.red);
            Stringer.drawString("b_{1 }/a_{11}",380,173);
            Stringer.drawString("b_{2 }/a_{22}",380,190);
          }
          if(sh>=14)
          {
            bp[0]=1;
            if(sh==14) Tabl2(g,a,c,2,0,true,bp);
            else Tabl2(g,a,c,2,1,true,bp);
            g.setColor(new Color(0, 0, 80));
            for (int i=0; i<c; i++)
              if((bp[i]<20000) && (tbn[0][bp[i]]!="")){
                jj=""+tbn[0][bp[i]];
                Stringer.drawString(jj,(int)(8+(40-8)/2),283-jj.length()/2+i*17);
              }
            for (int j=0; j<=a; j++){
              jj=tbn[0][j]; g.setColor(new Color(0, 0, 80));
              Stringer.drawString(jj,(int)(114+20*(3*j-1)),249-jj.length()/2);
              if(j!=1)
                tbd[1][j]=tbn[1][1];
            }
            g.setColor(new Color(0, 0, 160));
            Stringer.drawString(tbn[1][0]+"/"+tbd[1][0],89,281);
            Stringer.drawString("1",154,283);
            Stringer.drawString(tbn[1][2]+"/"+tbd[1][2],197,281);
            Stringer.drawString(tbn[1][3]+"/"+tbd[1][3],263,281);
            Stringer.drawString("0",334,283);
          }
        }
        if(sh>=15)
        {
          Stringer.drawString("b&{2}{*}",105,299);
        }
        if(sh>=16)
        {
          Stringer.drawString("0",154,300);
          Stringer.drawString("a&{22}{*}",215,299);
          Stringer.drawString("a&{23}{*}",275,299);
          Stringer.drawString("1",334,300);
        }
        if(sh>=17)
        {
           for(int i=1; i<=a; i++)
             Ind_nbv(g,"\u2206","  "+i,"  *",93+i*60,282+c*17);
        }
        if(sh==18)
        {
          g.setColor(Color.red);
          Stringer.drawString(tbn[1][0]+"/"+tbd[1][0],89,281);
          Stringer.drawString("b&{2}{*}",105,299);
          g.setColor(new Color(180, 0, 80));
          Ind_nbk(g,"\u2206","  j",153+a*60,282+c*17);
        }
      }
     //Коментарии
      if(sh==1){
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Решить задачу линейного программирования симплекс-методом.",12,361);
      }
      if(sh==2){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("1.",10, 361);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Приведем исходную задачу к канонической форме.",26, 361);
      }
     if(sh==3){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.",10, 361);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Исходные данные занесем в симплекс-таблицу.",26, 361);
     }
     if(sh==4){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.1.",10, 361);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Занесем в                   переменные и коэффициенты при них.",40, 361);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("Таблицу 1",117, 361);
     }
     if(sh==5){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.2.",10, 361);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Занесем в                   базисные переменные, их коэффициенты и свободные",40, 361);
       Stringer.drawString("члены.",12, 381);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("Таблицу 1",117, 361);
     }
     if(sh==6){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.3.",10, 361);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Занесем в таблицу оставшиеся коэффициенты.",40, 361);
     }
     if(sh==7){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("3.1.",10, 361);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Вычислим значениe      = c_{1} - z_{1} по вышеприведенной формуле",40, 361);
       Stringer.drawString("= "+tbn[0][1]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][1]+" + "+tbn[0][bp[1]]+" * "+tbn[2][1]+" ).",245, 386);
       Ind_nb(g,"\u2206","  1",192,361); Ind_nb(g,"\u2206","  1",225,386);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][1]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][1]+" + "+tbn[0][bp[1]]+" * "+tbn[2][1],245, 386);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][1]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][1]+" + "+tbn[0][bp[1]]+" * ",245, 386);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][1]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][1]+" + "+tbn[0][bp[1]],245, 386);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][1]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][1]+" + ",245, 386);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][1]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][1],245, 386);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][1]+" - ( "+tbn[0][bp[0]]+" * ",245, 386);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][1]+" - ( "+tbn[0][bp[0]],245, 386);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][1]+" - ( ",245, 386);
       g.setColor(Color.red);
       Stringer.drawString("= "+tbn[0][1],245, 386);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= ",245, 386);
       g.setColor(new Color (180,0,80));
       Stringer.drawString(""+tbn[3][1],433,386);
     }
     if(sh==8){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("3.2.",10, 361);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Вычислим значениe      = c_{2} - z_{2} по вышеприведенной формуле",40, 361);
       Stringer.drawString("= "+tbn[0][2]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][2]+" + "+tbn[0][bp[1]]+" * "+tbn[2][2]+" ).",245, 386);
       Ind_nb(g,"\u2206","  2",192,361); Ind_nb(g,"\u2206","  2",225,386);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][2]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][2]+" + "+tbn[0][bp[1]]+" * "+tbn[2][2],245, 386);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][2]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][2]+" + "+tbn[0][bp[1]]+" * ",245, 386);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][2]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][2]+" + "+tbn[0][bp[1]],245, 386);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][2]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][2]+" + ",245, 386);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][2]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][2],245, 386);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][2]+" - ( "+tbn[0][bp[0]]+" * ",245, 386);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][2]+" - ( "+tbn[0][bp[0]],245, 386);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][2]+" - ( ",245, 386);
       g.setColor(Color.red);
       Stringer.drawString("= "+tbn[0][2],245, 386);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= ",245, 386);
       g.setColor(new Color (180,0,80));
       Stringer.drawString(""+tbn[3][2],428,386);
     }
     if(sh==9){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("3.3.",10, 361);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Вычислим значениe      = c_{3} - z_{3} по вышеприведенной формуле",40, 361);
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][3]+" + "+tbn[0][bp[1]]+" * "+tbn[2][3]+" ).",245, 386);
       Ind_nb(g,"\u2206","  3",192,361); Ind_nb(g,"\u2206","  3",225,386);g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][3]+" + "+tbn[0][bp[1]]+" * "+tbn[2][3],245, 386);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][3]+" + "+tbn[0][bp[1]]+" * ",245, 386);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][3]+" + "+tbn[0][bp[1]],245, 386);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][3]+" + ",245, 386);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][3],245, 386);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * ",245, 386);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]],245, 386);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][3]+" - ( ",245, 386);
       g.setColor(Color.red);
       Stringer.drawString("= "+tbn[0][3],245, 386);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= ",245, 386);
       g.setColor(new Color (180,0,80));
       Stringer.drawString(""+tbn[3][3],428,386);
     }
     if(sh==10){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("3.4.",10, 361);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Вычислим значениe      = c_{4} - z_{4} по вышеприведенной формуле",40, 361);
       Stringer.drawString("= "+tbn[0][4]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][4]+" + "+tbn[0][bp[1]]+" * "+tbn[2][4]+" ).",245, 386);
       Ind_nb(g,"\u2206","  4",192,361); Ind_nb(g,"\u2206","  4",225,386);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][4]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][4]+" + "+tbn[0][bp[1]]+" * "+tbn[2][4],245, 386);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][4]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][4]+" + "+tbn[0][bp[1]]+" * ",245, 386);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][4]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][4]+" + "+tbn[0][bp[1]],245, 386);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][4]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][4]+" + ",245, 386);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][4]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][4],245, 386);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][4]+" - ( "+tbn[0][bp[0]]+" * ",245, 386);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][4]+" - ( "+tbn[0][bp[0]],245, 386);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][4]+" - ( ",245, 386);
       g.setColor(Color.red);
       Stringer.drawString("= "+tbn[0][4],245, 386);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= ",245, 386);
       g.setColor(new Color (180,0,80));
       Stringer.drawString(""+tbn[3][4],428,386);
     }
     if(sh==11){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("4.",10, 361);
       g.setColor(new Color(0, 0, 80));
       Stringer1.drawString("Выберем максимальное по модулю отрицательное значение |     | по вышеприве-",25, 361);
       Stringer.drawString("денной формуле. Пусть |     | - выбранное значение. Тогда столбец x_{1} - ведущий. Пере-",12, 381);
       Stringer.drawString("менную x_{1} вводим в базис.",12, 401);
       Ind_nbk(g,"\u2206","  r",477,361);
       g.setColor(Color.red);
       Ind_nb(g,"\u2206","  1",191,381);
     }
     if(sh==12){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("5.",10, 361);
       g.setColor(new Color(0, 0, 80));
       Stringer1.drawString("Вычислим отношения БР/a_{ir}.",25, 361);
       Stringer.drawString("Если для некоторой внебазисной переменной выполняются условия      < 0, и a_{ik} \u2264 0,",12, 381);
       Ind_nb(g,"\u2206","  k",515,381);
       Stringer.drawString("где i = 1,...,m, то целевая функция не ограничена снизу на допустимом множестве.",12, 401);
       g.setColor(Color.red);
       Stringer1.drawString("Вычислим отношения БР/a_{ir}",25, 361);
       g.setColor(new Color(0, 0, 80));
       Stringer1.drawString("Вычислим отношения",25, 361);
     }
     if(sh==13){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("6.",10, 361);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Выберем ведущую строку по вышеприведенной формуле min (b_{1}/a_{11}, b_{2}/a_{22}).",25, 361);
       Stringer.drawString("Пусть отношение b_{1}/a_{11} минимальное. Тогда строка x_{3} - ведущая. Переменная x_{3} вы-",12, 381);
       Stringer.drawString("водится из базиса.",12,401);
       g.setColor(Color.red);
       Stringer.drawString("Пусть отношение b_{1}/a_{11} минимальное. Тогда строка x_{3} - ведущая. Переменная x_{3}",12, 381);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Пусть отношение b_{1}/a_{11} минимальное. Тогда строка x_{3} - ведущая. Переменная",12, 381);
     }
     if(sh==14){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("7.",10, 361);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Вычисляем новое базисное решение, занося результаты пересчета в                   . В",26, 361);
       Stringer.drawString("базис введена переменная x_{1} вместо x_{3}. Первой пересчитывается строка, соотвест-",12, 381);
       Stringer.drawString("вующая введенной переменной x_{1} путем деления каждого элемента строки на a_{11}.",12, 401);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.setColor(Color.red);
       g.drawString("Таблицу 2",534, 361);
       Stringer.drawString("В столбец БП введена переменная x_{3}",12, 475);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("В столбец БП введена переменная",12, 475);
     }
     if(sh==15){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("7.1.",10, 361); g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Вычислим свободный член в                    по 'правилу прямоугольника':",40,361);
       Stringer.drawString("b&{2}{*} = b_{2} - (b_{1}*a_{21})/a_{11}.",255,381);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("Таблице 2",256, 361);
     }
     if(sh==16){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("7.2.",10, 361);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Остальные элементы пересчитывают также по 'правилу прямоугольника'.",40, 361);
       Stringer.drawString("a&{21}{*} = a{21} - (a_{11}*a_{21})/a_{11} = 0           a&{23}{*} = a_{23} - (a_{13}*a_{21})/a_{11}",85, 381);
       Stringer.drawString("a&{22}{*} = a{22} - (a_{12}*a_{21})/a_{11}                 a&{24}{*} = a_{24} - (a_{14}*a_{21})/a_{11} = 1 - (0*a_{21})/a_{11} = 1.",85, 401);
     }
     if(sh==17){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("7.3.",10, 361);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Вычисляем оценки     ,    = 1 ,..., 4. Строка      пересчитывается по                    также",40, 361);
       Stringer.drawString("по 'правилу прямоугольнка'. Далее повторяем действия пп.4-7, до тех пор, пока не",12, 381);
       Stringer.drawString("выполнится условие оптимальности, т.е. все      \u2265 0.",12,401);
       Ind_nbk(g,"\u2206","  j",341,401); Ind_nbk(g,"\u2206","  j",183,361);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("Таблице 1",508, 361); g.drawString("j",209, 361);
       g.setColor(Color.red); Ind_nbk(g,"\u2206","  j",337,361);
     }
     if(sh==18){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("8.",10, 361);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Если выполнится условие оптимальности, т.е. все      \u2265 0 то базисное решение,",26,361);
       Ind_nbk(g,"\u2206","  j",393,361);
       Stringer.drawString("соответствующее этому шагу является оптимальным.",12,381);
     }

     if(sh==1) jButton3.setEnabled(false);
     else jButton3.setEnabled(true);
     if(sh==18) jButton1.setEnabled(false);
     else jButton1.setEnabled(true);
  }
 }

  void jButton1_actionPerformed(ActionEvent e) {
    sh++;
    if (sh>18) sh=18;
    jPanel1.repaint();
  }

  void jButton2_actionPerformed(ActionEvent e) {
    sh=1;
    jPanel1.repaint();
  }

  void jButton3_actionPerformed(ActionEvent e) {
    sh--;
    if (sh<1) sh=1;
    jPanel1.repaint();
  }

  void this_mouseMoved(MouseEvent e) {
    int a,aa;
    a=e.getX()-5;
    aa=e.getY()-18;
   // jLabel2.setText("x="+Integer.toString(a)+"   y="+Integer.toString(aa));
    jPanel1.repaint();
  }
}
