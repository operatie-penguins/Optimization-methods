package sravnvgrangom;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class AppSravnVGranGom extends JApplet {
  MyPaint1 jPanel1 = new MyPaint1();
  MyPaint2 jPanel2 = new MyPaint2();
  MyPaint3 jPanel3 = new MyPaint3();
  JButton jButton1 = new JButton();
  JButton jButton2 = new JButton();
  JButton jButton3 = new JButton();
  JLabel jLabel1 = new JLabel();
//  JLabel jLabel2 = new JLabel();
  static int xx,yy;
  public boolean Ch=false, entry=false, Right=true, RightPust=true, edt=false, IntF=false, fl=false;
  public int sh=1, r=0, bpx=-1, x=-1;
  public String sm[]={""}, ss="", jj="", ogr="", ots="";
  public int a=4, c=2, a1=4, c1=2, b=(540-120-(a+1)*60)/2, d=(int)Math.round(17*(3-c)/2), n=0, p=0, k=0,
             b1=(540-120-(a1+1)*60)/2, d1=(int)Math.round(17*(3-c1)/2), nm[]={0}, tup1=26, tup2=tup1+135-d,
             bp[]={3,4,0}, bp1[]={0,0,0},
             tbn[][]={ {20000,2,0,0,0,20000,20000,20000,20000},
                     {16,1,4,1,0,20000,20000,20000,20000},
                     {2,1,-1,0,1,20000,20000,20000,20000},
                     {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                     {20000,20000,20000,20000,20000,20000,20000,20000,20000} },
             tbd[][]={ {1,1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1,1} },
             tbn1[][]={ {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                       {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                       {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                       {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                       {20000,20000,20000,20000,20000,20000,20000,20000,20000} },
             tbd1[][]={ {1,1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1,1} },
             tn[][]={ {20000,2,0,0,0,20000,20000,20000,20000},
                      {16,1,4,1,0,20000,20000,20000,20000},
                      {2,1,-1,0,1,20000,20000,20000,20000},
                      {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                      {20000,20000,20000,20000,20000,20000,20000,20000,20000} },
             td[][]={ {1,1,1,1,1,1,1,1,1},
                      {1,1,1,1,1,1,1,1,1},
                      {1,1,1,1,1,1,1,1,1},
                      {1,1,1,1,1,1,1,1,1},
                      {1,1,1,1,1,1,1,1,1} },
              Ogrn[]={20000,20000,20000,20000,20000,20000,20000,20000,20000},
              Ogrd[]={1,1,1,1,1,1,1,1,1};

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
    this.setSize(new Dimension(567, 560));
    this.getContentPane().setLayout(null);
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel1.setForeground(new Color(130, 0, 80));
    jLabel1.setText("Сравнение метода ветвей и границ и метода Гомори");
    jLabel1.setBounds(new Rectangle(72, 7, 423, 17));
    jPanel1.setLayout(null);
    jPanel1.setBounds(new Rectangle(5,26,557,40));
    jPanel1.setBackground(new Color(247, 247, 255));
    jPanel2.setLayout(null);
    jPanel2.setBackground(new Color(247, 247, 255));
    jPanel2.setBounds(new Rectangle(5,67,557,267));
    this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseMoved(MouseEvent e) {
        this_mouseMoved(e);
      }
    });
    jPanel3.setLayout(null);
    jPanel3.setBounds(new Rectangle(5,335,557,181));
    jPanel3.setBackground(new Color(247, 247, 255));
    jButton1.setBackground(new Color(220, 230, 255));
    jButton1.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton1.setForeground(new Color(0, 0, 60));
    jButton1.setText("==>");
    jButton1.setBounds(new Rectangle(353, 526, 100, 23));
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton1_actionPerformed(e);
      }
    });
    jButton2.setBackground(new Color(220, 230, 255));
    jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton2.setForeground(new Color(0, 0, 60));
    jButton2.setText("Обновить");
    jButton2.setBounds(new Rectangle(233, 526, 100, 23));
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton2_actionPerformed(e);
      }
    });
    jButton3.setBackground(new Color(220, 230, 255));
    jButton3.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton3.setForeground(new Color(0, 0, 60));
    jButton3.setText("<==");
    jButton3.setBounds(new Rectangle(113, 526, 100, 23));
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton3_actionPerformed(e);
      }
    });
//    jLabel2.setText("Label");
//    jLabel2.setBounds(new Rectangle(0, 5, 189, 17));
    this.getContentPane().add(jPanel1, null);
    this.getContentPane().add(jPanel2, null);
    this.getContentPane().add(jPanel3, null);
    this.jPanel2.setLayout(null);
    this.jPanel2.setLayout(null);
    this.jPanel3.setLayout(null);
    this.getContentPane().add(jLabel1, null);
//    this.getContentPane().add(jLabel2, null);
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
  public void Ind_nkr1(Graphics g,String a, String b, int x, int y){
    g.setFont(new java.awt.Font("SansSerif", 3, 11));
    g.drawString(""+a,x,y);
    g.setFont(new java.awt.Font("SansSerif", 3, 8));
    g.drawString(""+b+" ",x+a.length()*5,y+5);
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
  }
  public void Ind_nkr2(Graphics g,String a, String b, int x, int y){
    g.setFont(new java.awt.Font("SansSerif", 3, 14));
    g.drawString(""+a,x,y);
    g.setFont(new java.awt.Font("SansSerif", 3, 10));
    g.drawString(""+b+" ",x+a.length()*4,y+5);
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
    g.drawString(""+b+" ",x+a.length()*8,y+5);
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
  }
  public void Ind_nbk(Graphics g,String a, String b, int x, int y){
    g.setFont(new java.awt.Font("SansSerif", 1, 15));
    g.drawString(""+a,x,y);
    g.setFont(new java.awt.Font("SansSerif", 3, 11));
    g.drawString(""+b+" ",x+a.length()*8,y+2);
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
  }
  public void Ind_v(Graphics g,String a, String b, int x, int y){
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
    g.drawString(""+a,x,y);
    g.setFont(new java.awt.Font("SansSerif", 1, 11));
    g.drawString(""+b+"  ",x+a.length()*8,y-4);
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
  }
  public void Ind_vn(Graphics g,String a, String b, String c, int x, int y){
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
    g.drawString(""+a,x,y);
    g.setFont(new java.awt.Font("SansSerif", 1, 11));
    g.drawString(""+b+"  ",x+a.length()*8,y-4);
    g.drawString(""+c+" ",x+a.length()*8,y+5);
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
  }
  public void Ind_f(Graphics g, int x, int y){
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
    g.drawString("f",x,y);
    g.drawLine(x-2,y+2,x+5,y+2);
    g.drawLine(x-2,y+1,x+5,y+1);
  }

  public void Tabl1(Graphics g, int a, int c, int t, int h, boolean f, int bp[]){ //Рисует верхнюю таблицу
    int b=(540-120-(a+1)*60)/2, d=(int)Math.round(17*(3-c)/2);
    if(h==0) g.setColor(Color.red); else g.setColor(new Color(180, 0, 80));
    g.setFont(new java.awt.Font("SansSerif", 3, 13));
    g.drawString("Таблица "+t+":",15+b,tup1-5+d);
    g.setColor(new Color(255, 255, 255)); g.fillRect(b+7,tup1+d,542-2*b,2+17*(3+c));
    g.setColor(Color.black);
    for(int i=0; i<=a+1; i++)
      g.drawLine(b+128+i*60,tup1+1+d,b+128+i*60,tup1+103-d);
    for(int i=0; i<=3; i++)
      if(i==0) g.drawLine(b+8+i*40,tup1+1+d,b+8+i*40,tup1+103-d);
      else g.drawLine(b+8+i*40,tup1+1+d,b+8+i*40,tup1+85-d);
    for(int i=0; i<=3+c; i++)
      if(i==1) g.drawLine(b+128,d+tup1+1+i*17,548-b,d+tup1+1+i*17);
      else g.drawLine(b+8,d+tup1+1+i*17,548-b,d+tup1+1+i*17);
    g.setColor(new Color(157, 187, 255)); g.drawRect(b+7,tup1+d,542-2*b,2+17*(3+c));
    g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 13));
    if (f==true){
      g.drawString("БП",b+59,tup1+23+d); g.drawString("БР",b+99,tup1+23+d);
      g.drawString("БР/",b+139+60*a,tup1+32+d); Ind_nk(g,"a","ir",b+162+60*a,tup1+32+d);
      Ind_nk(g,"c","i",b+23,tup1+23+d); Ind_nk(g,"c","j",b+153+a*60,tup1+12+d);
      for(int i=1; i<=a; i++)
        Ind_n(g,"x",""+i,b+153+(i-1)*60,tup1+29+d);
      for(int i=0; i<c; i++)
        if(bp[i]>0) Ind_n(g,"x",""+bp[i],b+62,tup1+46+d+i*17);
      Ind_nbk(g,"\u2206","  j",b+153+a*60,tup1+48+c*17+d);
    }
  }
  public void Tabl2(Graphics g, int a, int c, int t, int h, boolean f, int bp[]){ //Рисует нижнюю таблицу
    int b=(540-120-(a+1)*60)/2, d=(int)Math.round(17*(3-c)/2); tup2=tup1+135-d;
    if(h==0) g.setColor(Color.red); else g.setColor(new Color(180, 0, 80));
    g.setFont(new java.awt.Font("SansSerif", 3, 13));
    g.drawString("Таблица "+t+":",15+b,tup2-5+d);
    g.setColor(new Color(255, 255, 255)); g.fillRect(b+7,tup2+d,542-2*b,2+17*(3+c));
    g.setColor(Color.black);
    for(int i=0; i<=a+1; i++)
      g.drawLine(b+128+i*60,tup2+1+d,b+128+i*60,tup2+103-d);
    for(int i=0; i<=3; i++)
      if(i==0) g.drawLine(b+8+i*40,tup2+1+d,b+8+i*40,tup2+103-d);
      else g.drawLine(b+8+i*40,tup2+1+d,b+8+i*40,tup2+85-d);
    for(int i=0; i<=3+c; i++)
      if(i==1) g.drawLine(b+128,d+tup2+1+i*17,548-b,d+tup2+1+i*17);
      else g.drawLine(b+8,d+tup2+1+i*17,548-b,d+tup2+1+i*17);
    g.setColor(new Color(157, 187, 255)); g.drawRect(b+7,tup2+d,542-2*b,2+17*(3+c));
    g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 13));
    if (f==true){
      g.drawString("БП",b+59,tup2+23+d); g.drawString("БР",b+99,tup2+23+d);
      g.drawString("БР/",b+139+60*a,tup2+32+d); Ind_nk(g,"a","ir",b+162+60*a,tup2+32+d);
      Ind_nk(g,"c","i",b+23,tup2+23+d); Ind_nk(g,"c","j",b+153+a*60,tup2+12+d);
      for(int i=1; i<=a; i++)
        Ind_n(g,"x",""+i,b+153+(i-1)*60,tup2+29+d);
      for(int i=0; i<c; i++)
        if(bp[i]>0) Ind_n(g,"x",""+bp[i],b+62,tup2+46+d+i*17);
      Ind_nbk(g,"\u2206","  j",b+153+a*60,tup2+48+c*17+d);
    }
  }
  public void Tb1(Graphics g, int a, int c,int tbn[][], int tbd[][], int bp[]){ //Заполняет верхнюю таблицу
    g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
    int b=(540-120-(a+1)*60)/2, d=(int)Math.round(17*(3-c)/2), l=0;
    String jj=""; int ii;
    for (int i=0; i<=c; i++)
      for (int j=0; j<=a; j++){
        int p; g.setColor(new Color(0, 0, 160));
        if(i==0) g.setColor(new Color(0, 0, 80));//g.setColor(new Color(150, 0, 80));
        if (j==0) p=40; else p=60;
        if(tbn[i][j]<20000){
          if((tbd[i][j]==1) || (tbn[i][j]==0)) jj=""+tbn[i][j];
          else jj=tbn[i][j]+"/"+tbd[i][j];
          ii=(int)(b+88+(p-40)*(3*j-1)+(p-jj.length()*8)/2);
          if (i==0){
            if (tbn[i][j]==1000) g.drawString("M",ii+10,tup1+15+d);
            else if (tbn[i][j]==-1000) g.drawString("-M",ii+10,tup1+15+d);
                 else g.drawString(jj,ii,tup1+15+d);
          }
          else g.drawString(jj,ii,tup1+32+i*17+d);
        }
      }
    int k; g.setColor(new Color(0, 0, 80));//g.setColor(new Color(130, 0, 130));
    for (int j=1; j<=a; j++){
      if(tbn[4][j]<20000){
        k=(int)Math.round(tbn[4][j]/1000.0);
        if((tbd[4][j]==1) || (tbn[4][j]==0)){
          if((k>=1)||(k<=-1)){
            if (tbn[4][j]-k*1000>0){
              if(k==1) jj="M+"+(tbn[4][j]-k*1000);
              else if(k==-1) jj="-M+"+(tbn[4][j]-k*1000);
                   else jj=k+"M+"+(tbn[4][j]-k*1000);
            }
            else if(tbn[4][j]-k*1000<0){
                   if(k==1) jj="M-"+(k*1000-tbn[4][j]);
                   else if(k==-1) jj="-M-"+(k*1000-tbn[4][j]);
                        else jj=k+"M-"+(k*1000-tbn[4][j]);
                 }
                 else{
                   if(k==1) jj="M";
                   else if(k==-1) jj="-M";
                        else jj=k+"M";
                 }
          }
          else jj=""+tbn[4][j];
        }
        else{
          if((k>=1)||(k<=-1)){
            if(tbn[4][j]-k*1000>0){
              if(k==1) jj="("+"M+"+(tbn[4][j]-k*1000)+")/"+tbd[4][j];
              else if(k==-1) jj="("+"-M+"+(tbn[4][j]-k*1000)+")/"+tbd[4][j];
                   else jj="("+k+"M+"+(tbn[4][j]-k*1000)+")/"+tbd[4][j];
              }
            else if(tbn[4][j]-k*1000<0){
                   if(k==1) jj="("+"M-"+(k*1000-tbn[4][j])+")/"+tbd[4][j];
                   else if(k==-1) jj="("+"-M-"+(k*1000-tbn[4][j])+")/"+tbd[4][j];
                        else jj="("+k+"M-"+(k*1000-tbn[4][j])+")/"+tbd[4][j];
                 }
                 else{
                   if(k==1) jj="M/"+tbd[4][j];
                   else if(k==-1) jj="-M/"+tbd[4][j];
                        else jj="M/"+tbd[4][j];
                 }
          }
          else jj=tbn[4][j]+"/"+tbd[4][j];
        }
        l=60-jj.length()*8;
        if(l<0){
          g.setFont(new java.awt.Font("SansSerif", 1, 13));
          l=(60-jj.length()*6);
        }
        ii=(int)(b+68+j*60+l/2);
        g.drawString(jj,ii,tup1+49+c*17+d);
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
      }
    }
    g.setColor(new Color(0, 0, 80));//g.setColor(new Color(90, 0, 90));
    for (int i=0; i<c; i++){
      if((bp[i]<20000) && (tbn[0][bp[i]]<20000)){
        jj=""+tbn[0][bp[i]];
        ii=(int)(b+8+(40-jj.length()*8)/2);
        if (tbn[0][bp[i]]==1000) g.drawString("M",ii+10,tup1+49+d+i*17);
        else if (tbn[0][bp[i]]==-1000) g.drawString("-M",ii+10,tup1+49+d+i*17);
             else g.drawString(jj,ii,tup1+49+d+i*17);
      }
    }
    g.setColor(new Color(0, 0, 80));//g.setColor(new Color(130, 0, 130));
    for(int i=1; i<=c; i++){
      jj="";
      if((tbn[i][8]<20000)&&(tbn[i][8]>-20000)){
        if(tbd[i][8]==1)
          jj=""+tbn[i][8];
        else jj=""+tbn[i][8]+"/"+tbd[i][8];
        ii=(int)(b+128+60*a+(60-jj.length()*8)/2);
        g.drawString(jj,ii,tup1+49+d+(i-1)*17);
      }
      if(tbn[i][8]==-20000){
        jj="--";
        ii=(int)(b+130+60*a+(60-jj.length()*8)/2);
        g.drawString(jj,ii,tup1+49+d+(i-1)*17);
      }
    }
  }
  public void Tb2(Graphics g, int a, int c, int tbn[][], int tbd[][], int bp[]){ //Заполняет нижнюю таблицу
    g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
    int b=(540-120-(a+1)*60)/2, d=(int)Math.round(17*(3-c)/2), l=0; tup2=tup1+135-d;
    String jj=""; int ii;
    for (int i=0; i<=c; i++)
      for (int j=0; j<=a; j++){
        int p; g.setColor(new Color(0, 0, 160));
        if(i==0) g.setColor(new Color(0, 0, 80));//g.setColor(new Color(150, 0, 80));
        if (j==0) p=40; else p=60;
        if(tbn[i][j]<20000){
          if((tbd[i][j]==1) || (tbn[i][j]==0)) jj=""+tbn[i][j];
          else jj=tbn[i][j]+"/"+tbd[i][j];
          ii=(int)(b+88+(p-40)*(3*j-1)+(p-jj.length()*8)/2);
          if (i==0){
            if (tbn[i][j]==1000) g.drawString("M",ii+10,tup2+15+d);
            else if (tbn[i][j]==-1000) g.drawString("-M",ii+10,tup2+15+d);
                 else g.drawString(jj,ii,tup2+15+d);
          }
          else g.drawString(jj,ii,tup2+32+i*17+d);
        }
      }
    int k; g.setColor(new Color(0, 0, 80));//g.setColor(new Color(130, 0, 130));
    for (int j=1; j<=a; j++){
      if(tbn[4][j]<20000){
        k=(int)Math.round(tbn[4][j]/1000.0);
        if((tbd[4][j]==1) || (tbn[4][j]==0)){
          if((k>=1)||(k<=-1)){
            if (tbn[4][j]-k*1000>0){
              if(k==1) jj="M+"+(tbn[4][j]-k*1000);
              else if(k==-1) jj="-M+"+(tbn[4][j]-k*1000);
                   else jj=k+"M+"+(tbn[4][j]-k*1000);
            }
            else if(tbn[4][j]-k*1000<0){
                   if(k==1) jj="M-"+(k*1000-tbn[4][j]);
                   else if(k==-1) jj="-M-"+(k*1000-tbn[4][j]);
                        else jj=k+"M-"+(k*1000-tbn[4][j]);
                 }
                 else{
                   if(k==1) jj="M";
                   else if(k==-1) jj="-M";
                        else jj=k+"M";
                 }
          }
          else jj=""+tbn[4][j];
        }
        else{
          if((k>=1)||(k<=-1)){
            if(tbn[4][j]-k*1000>0){
              if(k==1) jj="("+"M+"+(tbn[4][j]-k*1000)+")/"+tbd[4][j];
              else if(k==-1) jj="("+"-M+"+(tbn[4][j]-k*1000)+")/"+tbd[4][j];
                   else jj="("+k+"M+"+(tbn[4][j]-k*1000)+")/"+tbd[4][j];
              }
            else if(tbn[4][j]-k*1000<0){
                   if(k==1) jj="("+"M-"+(k*1000-tbn[4][j])+")/"+tbd[4][j];
                   else if(k==-1) jj="("+"-M-"+(k*1000-tbn[4][j])+")/"+tbd[4][j];
                        else jj="("+k+"M-"+(k*1000-tbn[4][j])+")/"+tbd[4][j];
                 }
                 else{
                   if(k==1) jj="M/"+tbd[4][j];
                   else if(k==-1) jj="-M/"+tbd[4][j];
                        else jj="M/"+tbd[4][j];
                 }
          }
          else jj=tbn[4][j]+"/"+tbd[4][j];
        }
        l=60-jj.length()*8;
        if(l<0){
          g.setFont(new java.awt.Font("SansSerif", 1, 13));
          l=(60-jj.length()*6);
        }
        ii=(int)(b+68+j*60+l/2);
        g.drawString(jj,ii,tup2+49+c*17+d);
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
      }
    }
    g.setColor(new Color(0, 0, 80));//g.setColor(new Color(90, 0, 90));
    for (int i=0; i<c; i++){
      if((bp[i]<20000) && (tbn[0][bp[i]]<20000)){
        jj=""+tbn[0][bp[i]];
        ii=(int)(b+8+(40-jj.length()*8)/2);
        if (tbn[0][bp[i]]==1000) g.drawString("M",ii+10,tup2+49+d+i*17);
        else if (tbn[0][bp[i]]==-1000) g.drawString("-M",ii+10,tup2+49+d+i*17);
             else g.drawString(jj,ii,tup2+49+d+i*17);
      }
    }
    g.setColor(new Color(0, 0, 80));//g.setColor(new Color(130, 0, 130));
    for(int i=1; i<=c; i++){
      jj="";
      if((tbn[i][8]<20000)&&(tbn[i][8]>-20000)){
        if(tbd[i][8]==1)
          jj=""+tbn[i][8];
        else jj=""+tbn[i][8]+"/"+tbd[i][8];
        ii=(int)(b+128+60*a+(60-jj.length()*8)/2);
        g.drawString(jj,ii,tup2+49+d+(i-1)*17);
      }
      if(tbn[i][8]==-20000){
        jj="--";
        ii=(int)(b+130+60*a+(60-jj.length()*8)/2);
        g.drawString(jj,ii,tup2+49+d+(i-1)*17);
      }
    }
  }
  public int MaxDel(int n, int m){ //Макимальный общий делитель из 2 чисел
    int s=1;
    for (int i=Math.min(Math.abs(n),Math.abs(m)); i>1; i--){
      if (((Math.max(Math.abs(n),Math.abs(m))%i)==0) && ((Math.min(Math.abs(n),Math.abs(m))%i)==0)){
        s=i;
        break;
      }
    }
    return s;
  }
  public int MaxDel3(int n, int m, int l){ //Макимальный общий делитель из 3 чисел
    int s=1;
    for (int i=Math.min((Math.min(Math.abs(n),Math.abs(m))),Math.abs(l)); i>1; i--){
      if ( ((Math.abs(n)%i)==0) && ((Math.abs(m)%i)==0) && ((Math.abs(l)%i)==0) ){
        s=i;
        break;
      }
    }
    return s;
  }
  public void ModifyArray(int a, int c, int tbn[][], int tbd[][], int bp[]){ //Вычисляет оценки
    int mn[]={0,0,0}, md[]={1,1,1}, k=1;
    for(int i=1; i<=a; i++){
      for(int j=0; j<c; j++){
        mn[j]=tbn[j+1][i]*tbn[0][bp[j]];
        md[j]=tbd[j+1][i]*tbd[0][bp[j]];
      }
      tbn[4][i]=tbn[0][i]; tbd[4][i]=tbd[0][i];
      for(int j=0; j<c; j++)
        if(mn[j]<20000){
          k=MaxDel(tbd[4][i],md[j]);
          tbn[4][i]=tbn[4][i]*md[j]/k; mn[j]=mn[j]*tbd[4][i]/k;
          tbd[4][i]=tbd[4][i]*md[j]/k; //md[j]=tbd[4][i]; // общий знаменатель
          tbn[4][i]=tbn[4][i]-mn[j];
        }
      if((Math.round(tbn[4][i]/1000.0)<=1) && (Math.round(tbn[4][i]/1000.0)>=-1)){
        k=MaxDel(tbn[4][i],tbd[4][i]);
        tbn[4][i]=tbn[4][i]/k; tbd[4][i]=tbd[4][i]/k;
      }
      else{
        int j=1;
        k=(int)Math.round(tbn[4][i]/1000.0);
        j=MaxDel3(tbn[4][i]-k*1000,tbd[4][i],k*1000);
        tbd[4][i]=tbd[4][i]/j;
        tbn[4][i]=tbn[4][i]/j;
      }
    }
  }
  public void ModifyArray1(int a, int c, int tbn[][], int tbd[][], int p, int n){  //Пересчет таблицы
    int tbn1=0, tbd1=0, k=0, t=1;
    for(int i=1; i<=4 ; i++){
      if((c==2) && (i==3)) i++;
      if(i!=p){
        for(int j=0; j<=a; j++)
          if(tbn[i][j]<20000)
            if(j!=n){
              tbn1=tbn[p][j]*tbn[i][n]*tbd[p][n];
              tbd1=tbd[p][j]*tbd[i][n]*tbn[p][n];
              t=MaxDel(tbd[i][j],tbd1);
              tbn[i][j]=(tbn[i][j]*tbd1/t)-(tbn1*tbd[i][j]/t);
              tbd[i][j]=tbd[i][j]*tbd1/t;
              k=(int)Math.round(tbn1/1000.0);
              if( ( ((k>-1) && (k<1)) && (i==4)) || (i<=4)){
                t=MaxDel(tbn[i][j],tbd[i][j]);
                tbd[i][j]=tbd[i][j]/t;
                tbn[i][j]=tbn[i][j]/t;
              }
              if(((k<=-1) || (k>=1)) && (i==4)){
                t=1;;
                t=MaxDel3(tbn[i][j]-k*1000,tbd[i][j],k*1000);
                tbd[i][j]=tbd[i][j]/t;
                tbn[i][j]=tbn[i][j]/t;
              }
            }
        tbn[i][n]=0; tbd[i][n]=1;
      }
    }
    tbn1=tbn[p][n]; tbd1=tbd[p][n];
    for(int i=0; i<=a; i++){
      tbn[p][i]=tbn[p][i]*tbd1;
      tbd[p][i]=tbd[p][i]*tbn1;
      t=MaxDel(tbn[p][i],tbd[p][i]);
      tbn[p][i]=tbn[p][i]/t;
      tbd[p][i]=tbd[p][i]/t;
   }
  }
  public void Valuation(int a, int c, int tbn[][], int tbd[][], int nm[], String sm[]){ //Находит максимальную оценку
    double max=0.0; int maxn=0, maxd=1;
     nm[0]=-1; sm[0]="";
       for(int i=1; i<=a; i++)
         if((tbn[4][i]>0) && (max<(double)tbn[4][i]/tbd[4][i])){
           max=(double)tbn[4][i]*1.0/tbd[4][i];
           nm[0]=i; maxn=tbn[4][i]; maxd=tbd[4][i];
         }
       int k;
       if(maxn<20000){
         k=(int)Math.round(maxn/1000.0);
         if(maxd==1){
           if((k>=1)||(k<=-1)){
             if (maxn-k*1000>0){
               if(k==1) sm[0]="M+"+(maxn-k*1000);
               else if(k==-1) sm[0]="-M+"+(maxn-k*1000);
                    else sm[0]=k+"M+"+(maxn-k*1000);
             }
             else if (maxn-k*1000<0){
                    if(k==1) sm[0]="M-"+(k*1000-maxn);
                    else if(k==-1) sm[0]="-M-"+(k*1000-maxn);
                         else sm[0]=k+"M-"+(k*1000-maxn);
                  }
                  else{
                    if(k==1) sm[0]="M";
                    else if(k==-1) sm[0]="-M";
                         else sm[0]=k+"M";
                  }
           }
           else sm[0]=""+maxn;
         }
         else{
           if((k>=1)||(k<=-1)){
             if (maxn-k*1000>0){
               if(k==1) sm[0]="("+"M+"+(maxn-k*1000)+")/"+maxd;
               else if(k==-1) sm[0]="("+"-M+"+(maxn-k*1000)+")/"+maxd;
                    else sm[0]="("+k+"M+"+(maxn-k*1000)+")/"+maxd;
               }
             else if (maxn-k*1000<0){
                    if(k==1) sm[0]="("+"M-"+(k*1000-maxn)+")/"+maxd;
                    else if(k==-1) sm[0]="("+"-M-"+(k*1000-maxn)+")/"+maxd;
                         else sm[0]="("+k+"M-"+(k*1000-maxn)+")/"+maxd;
                  }
                  else{
                    if(k==1) sm[0]="M/"+maxd;
                    else if(k==-1) sm[0]="-M/"+maxd;
                         else sm[0]="M/"+maxd;
                  }
           }
           else sm[0]=maxn+"/"+maxd;
         }
       }
  }
  public void Raschet(int a, int c, int tbn[][], int tbd[][]){
    Valuation(a,c,tbn,tbd,nm,sm);
    n=nm[0]; ss=sm[0];
    double min=20000.0; int minn=0, mind=1;
    for(int i=1; i<=c; i++)
      if(tbn[i][n]>0){
        minn=tbn[i][0]*tbd[i][n]; mind=tbd[i][0]*tbn[i][n];
        tbn[i][8]=minn/MaxDel(minn,mind); tbd[i][8]=mind/MaxDel(minn,mind);
        if(min>((double)tbn[i][0]/tbd[i][0])*((double)tbd[i][n]/tbn[i][n])){
          min=((double)tbn[i][0]/tbd[i][0])*((double)tbd[i][n]/tbn[i][n]);
          p=i;
        }
      }
      else tbn[i][8]=-20000;
  }

  class MyPaint1 extends JPanel {
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Stringer.setGraphics(g);
      g.setColor(new Color(180, 0, 80));
      g.setFont(new java.awt.Font("SansSerif", 3, 13));
      g.drawString("Задача:  ",6,15);
      g.setColor(new Color(0, 0, 80));
      Stringer.drawString("Найти целочисленное решение  f(x) = 2 x_{1 }\u2192 max  при ограничениях",53+10,15);
      Stringer.drawString("x_{1 }+ 4 x_{2 }\u2264 16,  x_{1 }- x_{2 }\u2264 2,  x_{1}, x_{2 }\u2265 0, где x_{1}, x_{2} - целые, методом Гомори",33,35);
   //   g.drawString(""+sh,10,50);
    }
  }

  class MyPaint2 extends JPanel {
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Stringer.setGraphics(g);
      if((sh>=1) && (sh<=13)){
        a=4; c=2; a1=4; c1=2; r=0; n=0; p=0; k=0; nm[0]=0; sm[0]=""; ss=""; jj=""; ots=""; ogr="";
        b=(540-120-(a+1)*60)/2; d=(int)Math.round(17*(3-c)/2);
        b1=(540-120-(a1+1)*60)/2; d1=(int)Math.round(17*(3-c1)/2);
        bp[0]=3; bp[1]=4; bp[2]=0;
        for(int i=0; i<3; i++)
          bp1[i]=0;
        for(int i=0; i<5; i++)
          for(int j=0; j<9; j++){
            tbn[i][j]=20000; tbd[i][j]=1;
            tbn1[i][j]=20000; tbd1[i][j]=1;
          }
        tbn[0][1]=2; tbn[0][2]=0;  tbn[0][3]=0; tbn[0][4]=0;
        tbn[1][0]=16; tbn[1][1]=1; tbn[1][2]=4;  tbn[1][3]=1; tbn[1][4]=0;
        tbn[2][0]=2; tbn[2][1]=1; tbn[2][2]=-1;  tbn[2][3]=0; tbn[2][4]=1;

        g.setColor(new Color(180, 0, 80));
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        ModifyArray(a,c,tbn,tbd,bp);
        if(sh>=2) Raschet(a,c,tbn,tbd);
        if(sh<=2){
          Tabl1(g,a,c,1,0,true,bp);
          if(sh==2){
            g.setColor(new Color(230, 230, 255));
            g.fillRect(129+b+a*60,tup1+d+2+17*3,59,16);
            g.fillRect(129+b,tup1+d+2+17*4,59,16);
          }
          Tb1(g,a,c,tbn,tbd,bp);
        }
        if(sh>=2){
          bp[p-1]=n;
          ModifyArray1(a,c,tbn,tbd,p,n);
          for(int i=1; i<=c+1; i++){
            tbn[i][8]=20000; tbd[i][8]=1;
          }
          if(sh==2){
            g.setColor(Color.red);
            g.drawString(""+tbn[2][1],b+154,tup1+32+2*17+d);
            Tabl2(g,a,c,2,0,true,bp);
            Tb2(g,a,c,tbn,tbd,bp);
          }
        }
        if(sh>=3){
          Raschet(a,c,tbn,tbd);
          if(sh==3){
            Tabl1(g,a,c,2,0,true,bp);
            Tb1(g,a,c,tbn,tbd,bp);
            g.setColor(Color.red);
            g.drawString(""+tbn[1][2],b+214,tup1+32+1*17+d);
          }
          if(sh==4){
            Tabl1(g,a,c,2,1,true,bp);
            Tb1(g,a,c,tbn,tbd,bp);
          }
          bp[p-1]=n;
          ModifyArray1(a,c,tbn,tbd,p,n);
          for(int i=1; i<=c+1; i++){
            tbn[i][8]=20000; tbd[i][8]=1;
          }
          if(sh==3){
            Tabl2(g,a,c,3,0,true,bp);
            Tb2(g,a,c,tbn,tbd,bp);
          }
          if(sh==4){
            Tabl2(g,a,c,3,1,true,bp);
            Tb2(g,a,c,tbn,tbd,bp);
            g.setColor(Color.red);
            Ind_n(g,"x",""+bp[0],b+62,tup2+46+d+0*17);
          }
        }
        if(sh==5){
          g.drawString("Метод ветвей и границ",194,tup1-10+d);
          g.drawString("Метод Гомори",229,tup2-10+d);
          Tabl1(g,a,c,3,1,true,bp);
          Tabl2(g,a,c,3,1,true,bp);
          g.setColor(Color.red);
          Ind_n(g,"x",""+bp[0],b+62,tup1+46+d+0*17);
          Ind_n(g,"x",""+bp[0],b+62,tup2+46+d+0*17);
          g.setColor(new Color(230, 230, 255));
          g.fillRect(89+b,tup1+d+2+17*2,39,16);
          g.fillRect(89+b,tup2+d+2+17*2,a*60+39,16);
          g.setColor(Color.black);
          for(int i=0; i<=a; i++)
            g.drawLine(b+128+i*60,tup2+d+2+17*2,b+128+i*60,tup2+18+d+17*2);
          Tb1(g,a,c,tbn,tbd,bp);
          Tb2(g,a,c,tbn,tbd,bp);
        }
        if(sh>=6){
          for(int i=0; i<5; i++)
            for(int j=0; j<9; j++){
              tbn1[i][j]=tbn[i][j]; tbd1[i][j]=tbd[i][j];
               tbn[i][j]=tn[i][j]; tbd[i][j]=td[i][j];
            }
          a=5; c=3;
          for(int i=0; i<3; i++)
            bp1[i]=bp[i];
          bp[0]=3; bp[1]=4; bp[2]=5;
          tbn[0][5]=0; tbn[1][5]=0; tbn[2][5]=0; tbn1[0][5]=0; tbn1[1][5]=0; tbn1[2][5]=0;
          tbn[3][0]=2; tbn[3][1]=0; tbn[3][2]=1; tbn[3][3]=0; tbn[3][4]=0; tbn[3][5]=1;
          tbn1[3][0]=4; tbn1[3][1]=0; tbn1[3][2]=0; tbn1[3][3]=1; tbn1[3][4]=4; tbn1[3][5]=-1;
          tbd1[3][0]=5; tbd1[3][3]=5; tbd1[3][4]=5;
          ModifyArray(a,c,tbn,tbd,bp);
          if(sh>=7) Raschet(a,c,tbn,tbd);
          b=(540-120-(a+1)*60)/2; d=(int)Math.round(17*(3-c)/2); tup2=tup1+135-d;
          g.drawString("Метод ветвей и границ",194,tup1-10+d);
          g.drawString("Метод Гомори",229,tup2-10+d);
          if(sh==6){
            Tabl1(g,a,c,4,0,true,bp);
            Tabl2(g,a,c,4,0,true,bp1);
          }
          if(sh==7){
            Tabl1(g,a,c,4,1,true,bp);
            Tabl2(g,a,c,4,1,true,bp1);
            g.setColor(Color.red);
            Ind_n(g,"x","1",b+153,tup1+29+d);
            Ind_n(g,"x","4",b+62,tup1+29+d+17*2);
            Ind_n(g,"x","3",b+153+2*60,tup2+29+d);
            Stringer.drawString("?",b+64,tup2+49+d+2*17);
            g.setColor(new Color(230, 230, 255));
            g.fillRect(129+b+a*60,tup1+d+2+17*3,59,16);
            g.fillRect(129+b,tup1+d+2+17*5,59,16);
            g.fillRect(129+b+60*2,tup2+d+2+17*5,59,16);
          }
          if((sh==6) || (sh==7)){
            Tb1(g,a,c,tbn,tbd,bp);
            Tb2(g,a,c,tbn1,tbd1,bp1);
          }
        }
        if(sh>=8){
          bp[p-1]=n; bp1[2]=3; tbn1[4][5]=0;
          ModifyArray1(a,c,tbn,tbd,p,n);
          ModifyArray1(a,c,tbn1,tbd1,3,3);
          for(int i=1; i<=c+1; i++){
            tbn[i][8]=20000; tbd[i][8]=1;
          }
          Raschet(a,c,tbn,tbd);
          if(sh==8){
            Tabl1(g,a,c,5,0,true,bp);
            Tabl2(g,a,c,5,0,true,bp1);
            g.setColor(new Color(230, 230, 255));
            g.fillRect(89+b,tup2+d+2+17*2,39,33);
            g.setColor(Color.black);
            g.drawLine(89+b,tup2+d+1+17*3,129+b,tup2+d+1+17*3);
            Tb1(g,a,c,tbn,tbd,bp);
            Tb2(g,a,c,tbn1,tbd1,bp1);
            g.setColor(Color.red);
            g.drawString(""+tbn[3][2],b+214,tup1+32+3*17+d);
          }
        }
        if(sh>=9){
          bp[p-1]=n;
          ModifyArray1(a,c,tbn,tbd,p,n);
          for(int i=1; i<=c+1; i++){
            tbn[i][8]=20000; tbd[i][8]=1;
          }
          if(sh==9){
            Tabl1(g,a,c,6,0,true,bp);
            g.setColor(new Color(230, 230, 255));
            g.fillRect(89+b,tup1+d+2+17*3,39,33);
            g.setColor(Color.black);
            g.drawLine(89+b,tup1+d+1+17*4,129+b,tup1+d+1+17*4);
            Tb1(g,a,c,tbn,tbd,bp);
          }
          Tabl2(g,a,c,5,1,true,bp1);
          Tb2(g,a,c,tbn1,tbd1,bp1);
        }
        if(sh>=10){
          for(int i=0; i<5; i++)
            for(int j=0; j<9; j++){
              tbn[i][j]=tn[i][j]; tbd[i][j]=td[i][j];
            }
          a=6; c=3; b=(540-120-(a+1)*60)/2; bp[0]=3; bp[1]=4; bp[2]=6;
          tbn[0][5]=0; tbn[1][5]=0; tbn[2][5]=0; tbn[0][6]=-1000; tbn[1][6]=0; tbn[2][6]=0;
          tbn[3][0]=3; tbn[3][1]=0; tbn[3][2]=1; tbn[3][3]=0; tbn[3][4]=0; tbn[3][5]=-1; tbn[3][6]=1;
          ModifyArray(a,c,tbn,tbd,bp);
          if(sh>=11) Raschet(a,c,tbn,tbd);
          if(sh==10) Tabl1(g,a,c,7,0,true,bp);
          if(sh==11){
            Tabl1(g,a,c,7,1,true,bp);
            g.setColor(Color.red);
            Ind_n(g,"x","2",b+153+60,tup1+29+d);
            Ind_n(g,"x","6",b+62,tup1+29+d+17*3);
            g.setColor(new Color(230, 230, 255));
            g.fillRect(129+b+a*60,tup1+d+2+17*4,59,16);
            g.fillRect(129+b+60,tup1+d+2+17*5,59,16);
          }
          if((sh==10) || (sh==11)) Tb1(g,a,c,tbn,tbd,bp);
        }
        if(sh>=12){
          bp[p-1]=n;
          ModifyArray1(a,c,tbn,tbd,p,n);
          for(int i=1; i<=c+1; i++){
            tbn[i][8]=20000; tbd[i][8]=1;
          }
          Raschet(a,c,tbn,tbd);
          if(sh==12){
            Tabl1(g,a,c,8,0,true,bp);
            Tb1(g,a,c,tbn,tbd,bp);
            g.setColor(Color.red);
            g.drawString(""+tbn[1][1],b+154,tup1+32+17+d);
          }
        }
        if(sh>=13){
          bp[p-1]=n;
          ModifyArray1(a,c,tbn,tbd,p,n);
          for(int i=1; i<=c+1; i++){
            tbn[i][8]=20000; tbd[i][8]=1;
          }
          if(sh==13){
            Tabl1(g,a,c,9,0,true,bp);
            g.setColor(new Color(230, 230, 255));
            g.fillRect(89+b,tup1+d+2+17*2,39,16);
            g.fillRect(89+b,tup1+d+2+17*4,39,16);
            Tb1(g,a,c,tbn,tbd,bp);
          }
        }
      }
      if(sh==14){
        g.setColor(new Color(247, 247, 255)); g.fillRect(7,20,542,243);
        g.setColor(new Color(255, 255, 255)); g.fillRect(17,40,251,213); g.fillRect(288,40,251,213);
        g.setColor(new Color(157, 187, 255)); g.drawRect(7,20,542,243); g.drawLine(278,20,278,263);
        g.drawRect(17,40,251,213); g.drawRect(288,40,251,213);
        g.setColor(new Color(180, 0, 80));
        g.setFont(new java.awt.Font("SansSerif", 3, 13));
        g.drawString("Анализ методов на основе даннай задачи:",15,15);
        g.setColor(new Color(180, 0, 60));
        g.drawString("Достоинства:",25,60); g.drawString("Достоинства:",296,60);
        g.drawString("1.",20,80); g.drawString("2.",20,100); g.drawString("1.",291,80);
        g.drawString("Недостатки:",25,145); g.drawString("Недостатки:",296,145);
        g.drawString("1.",20,165); g.drawString("2.",20,205);
        g.drawString("1.",291,165); g.drawString("2.",291,225);
        g.setFont(new java.awt.Font("SansSerif", 3, 14)); g.setColor(new Color(180, 0, 80));
        g.drawString("Метод ветвей и границ",57,36);
        g.drawString("Метод Гомори",362,36);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Находит оба решения задачи;",34,80);
        Stringer.drawString("Если задача задана на плоскости,",34,100);
        Stringer.drawString("то ее можно решать графически.",20,120);
        Stringer.drawString("Требуется решать несколько",34,165);
        Stringer.drawString("задач ЗЛП;",20,185);
        Stringer.drawString("Необходимо вычислять",36,205);
        Stringer.drawString("значение функции f(x) на каждом",20,225);
        Stringer.drawString("решении.",20,245);
        Stringer.drawString("Требует меньше вычислений и",305,80);
        Stringer.drawString("быстрее находит решение",291,100);
        Stringer.drawString("задачи, чем метод ветвей границ.",291,120);
        Stringer.drawString("Находит только одно решение",305,165);
        Stringer.drawString("задачи, даже если существует",291,185);
        Stringer.drawString("несколько решений;",291,205);
        Stringer.drawString("Графически решить задачу",305,225);
        Stringer.drawString("на плоскости нельзя.",291,245);
      }
    }
  }

  class MyPaint3 extends JPanel {
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Stringer.setGraphics(g);
      Stringer1.setGraphics(g);
      g.setColor(new Color(180, 0, 80));
      g.setFont(new java.awt.Font("SansSerif", 3, 13));
      if(sh<=3)
        g.drawString("Решение:",15,15);
      else{
        g.drawString("Решение методом ветвей и границ:",15,15);
        g.drawString("Решение методом Гомори:",15,105);
      }
      if(sh<=3){
        g.setColor(new Color(255, 255, 255)); g.fillRect(7,20,542,160);
        g.setColor(new Color(157, 187, 255)); g.drawRect(7,20,542,160);
      }
      else{
        g.setColor(new Color(255, 255, 255)); g.fillRect(7,20,542,70);
        g.setColor(new Color(157, 187, 255)); g.drawRect(7,20,542,70);
        g.setColor(new Color(255, 255, 255)); g.fillRect(7,110,542,70);
        g.setColor(new Color(157, 187, 255)); g.drawRect(7,110,542,70);
      }
      if(sh==1){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("1.",10, 40);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Исходная задача уже имеет ограничения с целочисленными",26, 40);
        Stringer.drawString("коэффициентами в левой и правой частях. Решаем ее без учета",12, 60);
        Stringer.drawString("тебования целочисленности. На основе исходных данных заполняем",12, 80);
        Stringer.drawString("согласно алгоритму симплекс-метода и вычисляем",88, 100);
        Stringer1.drawString("относительные оценки     .",12, 120);
        Ind_nbk(g,"\u2206","  j",183,120);
        g.setColor(Color.red); g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("Таблицу 1",12, 100);
      }
      if(sh==2){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("2.",10, 40);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Текущее решение                     не оптимально. Вводим в базис",26, 40);
        Stringer.drawString("переменную x_{1}, которой соответствует максимальная оценка      и",12, 60);
        Stringer.drawString("выводим x_{4}, которой соответствует минимальное отношение БР/a_{ir}.",12, 80);
        Stringer.drawString("Результат пересчета                     представлен в                   .",12, 100);
        Ind_nbk(g,"\u2206","  j",458,60);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("Таблицы 1",164, 100);
        g.setColor(Color.red);
        g.drawString("Таблицы 1",160, 40); g.drawString("Таблице 2",352, 100);
      }
      if(sh==3){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("3.",10, 40);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Текущее решение                     не оптимально. Вводим в базис",26, 40);
        Stringer.drawString("переменную x_{2}, выводим x_{3}. Результат пересчета                     представлен",12, 60);
        Stringer.drawString("в                   . Текущее решение                     оптимально. Полученное",12, 80);
        Stringer.drawString("решение задачи x^{0 }= (24/5; 14/5) не явяется целочисленным.",12, 100);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("Таблицы 2",374, 60); g.drawString("Таблицы 3",238, 80);
        g.setColor(Color.red);
        g.drawString("Таблицы 2",159, 40); g.drawString("Таблице 3",24, 80);
      }
      if(sh==4){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("4.",10, 40); g.drawString("4.",10, 130);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Осуществим ветвление задачи ЗЛП - 0: выбираем в ",26, 40);
        Stringer.drawString("нецелочисленную координату по установленному правилу. Здесь",12, 60);
        Stringer.drawString("обе координаты подходят, поэтому выбираем любую из них, например x_{2}.",12, 80);
        Stringer1.drawString("Выбираем в                    нецелочисленную координату x_{i }с максимальной",26, 130);
        Stringer.drawString("дробной частью. Дробные части координат x_{1 }и x_{2} равны, поэтому",12, 150);
        Stringer.drawString("выбираем любую из них, например x_{2}.",12, 170);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("Таблице 3",405, 40); g.drawString("Таблице 3",119, 130);
        g.setColor(Color.red);
        Stringer.drawString("обе координаты подходят, поэтому выбираем любую из них, например x_{2}",12, 80);
        Stringer.drawString("выбираем любую из них, например x_{2}",12, 170);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("обе координаты подходят, поэтому выбираем любую из них, например",12, 80);
        Stringer.drawString("выбираем любую из них, например",12, 170);
      }
      if(sh==5){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("5.",10, 40); g.drawString("5.",10, 132);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Формируем дополнительные ограничения  x_{2 }\u2264 [14/5] = 2 для ЗЛП - 1",26, 40);
        Stringer.drawString("и  x_{2 }\u2265 [14/5] + 1 = 3 для ЗЛП-2.",12, 60);
        Stringer.drawString("Записываем новое ограничение  |{1}{5} x_{3 }+ |{4}{5} x_{4 }- x_{5} = |{4}{5}  по формуле",26, 132);
        Stringer1.drawString("\u2211 (a_{ik}) x_{k} - x_{\u03C5} = (x&{i}{* }),     0 \u2264 (a_{ik}) \u2264 1,     0 \u2264 (x&{i}{* }) \u2264 1,",19,158);
        Stringer1.drawString("где x_{\u03C5} - дополнительная",362,155);
        Stringer1.drawString("переменная.",432, 172);
        Ind_nkr1(g,"k\u2208 I","НБ",12,172);
        g.setColor(Color.red);
        Stringer.drawString("Формируем дополнительные ограничения  x_{2 }\u2264 [14/5] = 2",26, 40);
        Stringer.drawString("и  x_{2 }\u2265 [14/5] + 1 = 3",12, 60);
        Stringer.drawString("Записываем новое ограничение  |{1}{5} x_{3 }+ |{4}{5} x_{4 }- x_{5} = |{4}{5}",26, 132);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Формируем дополнительные ограничения",26, 40);
        Stringer.drawString("и",12, 60);
        Stringer.drawString("Записываем новое ограничение",26, 132);
      }
      if(sh==6){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("6.",10, 40); g.drawString("6.",10, 132);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Будем решать задачу ЗЛП - 1 без учета тебования целочисленности",26, 40);
        Stringer.drawString("симплекс-методом. Заполняем                    согласно алгоритму симплекс-",12, 60);
        Stringer.drawString("метода и вычисляем относительные оценки      ,    = 1, ..., 5.",12, 80);
        Stringer.drawString("Расширяем оптимальную                    на одну строку и один столбец. В",26, 130);
        Stringer.drawString("полученную                    записываем дополнительное ограничение",12, 150);
        Stringer.drawString("|{1}{5} x_{3 }+ |{4}{5} x_{4 }- x_{5} = |{4}{5}.",215, 170);
        Ind_nbk(g,"\u2206","  j",341,80);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("Таблицу 3",213, 130); g.drawString("j",368, 80);
        g.setColor(Color.red);
        g.drawString("Таблицу 4",100, 150); g.drawString("Таблицу 4",241, 60);
      }
      if(sh==7){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("7.",10, 40); g.drawString("7.",10, 132);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Текущее решение                     не оптимально. Вводим в базис",26, 40);
        Stringer.drawString("переменную x_{1}, которой соответствует максимальная оценка      и",12, 60);
        Stringer.drawString("выводим x_{4}, которой соответствует минимальное отношение БР/a_{ir}.",12, 80);
        Stringer.drawString("В базис вводим переменную x_{3}, которой соответствует наименьшая",26, 130);
        Stringer.drawString("по модулю отрицательная оценка     .",12, 150);
        Ind_nbk(g,"\u2206","  j",260,150); Ind_nbk(g,"\u2206","  j",458,60);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("Таблицы 4",160, 40);
        g.setColor(Color.red);
        Stringer.drawString("переменную x_{1}",12, 60);
        Stringer.drawString("выводим x_{4}",12, 80);
        Stringer.drawString("В базис вводим переменную x_{3}",26, 130);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("переменную",12, 60);
        Stringer.drawString("выводим",12, 80);
        Stringer.drawString("В базис вводим переменную",26, 130);
      }
      if(sh==8){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("8.",10, 40); g.drawString("8.",10, 132);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Производим пересчет                     и результат записываем в",26, 40);
        Stringer.drawString("Текущее решение                     не оптимально. Вводим в базис переменную",11, 60);
        Stringer.drawString("x_{2}, выводим x_{5} и снова производим пересчет таблицы.",11, 80);
        Stringer.drawString("Производим пересчет                     и результат записываем в",26, 130);
        Stringer.drawString("Текущее решение                     оптимально. Тогда решением будет",12, 150);
         Stringer.drawString("x^{* }= (4; 2).",12, 170);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("Таблицы 4",190, 40); g.drawString("Таблицы 4",190, 130);
        g.drawString("Таблицы 5",145, 60); g.drawString("Таблицы 5",145, 150);
        g.setColor(Color.red);
        g.drawString("Таблицу 5",465, 40); g.drawString("Таблицу 5",465, 130);
        Stringer.drawString("x^{* }= (4; 2)",12, 170);
      }
      if(sh==9){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("9.",10, 40); g.drawString("9.",10, 132);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Результат пересчета записываем в                   . Текущее решение ",26, 40);
        Stringer.drawString("x^{1 }= (4; 2) является оптимальным и целочисленным. Вычисляем /{f}{} = f(x^{1})=8.",12, 60);
        Stringer.drawString("Включаем это решение в ",12, 80);
        Stringer.drawString("Полученное решение x^{* }= (4; 2) является целочисленным,",26, 130);
        Stringer.drawString("следовательно, поставленная задача решена.",12, 150);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("множество возможных оптимальных решений.",200, 80);
        g.setColor(Color.red);
        g.drawString("Таблицу 6",284, 40);
      }
      if(sh>=10){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("10.",10, 132);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Задача решена. Ответ: x^{* }= (4; 2).",35, 130);
      }
      if(sh==10){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("10.",10, 40);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Будем решать задачу ЗЛП - 2 без учета тебования целочисленности",35, 40);
        Stringer.drawString("симплекс-методом. Заполняем                    согласно алгоритму симплекс-",12, 60);
        Stringer.drawString("метода и вычисляем относительные оценки      ,    = 1, ..., 6.",12, 80);
        Ind_nbk(g,"\u2206","  j",341,80);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("j",368, 80);
        g.setColor(Color.red);
        g.drawString("Таблицу 7",241, 60);
      }
      if(sh==11){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("11.",10, 40);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Текущее решение                     не оптимально. Вводим в базис",35, 40);
        Stringer.drawString("переменную x_{2}, которой соответствует максимальная оценка      и",12, 60);
        Stringer.drawString("выводим x_{6}, которой соответствует минимальное отношение БР/a_{ir}.",12, 80);
        Ind_nbk(g,"\u2206","  j",458,60);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("Таблицы 7",169, 40);
        g.setColor(Color.red);
        Stringer.drawString("переменную x_{2}",12, 60);
        Stringer.drawString("выводим x_{6}",12, 80);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("переменную",12, 60);
        Stringer.drawString("выводим",12, 80);
      }
      if(sh==12){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("12.",10, 40);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Производим пересчет                     и результат записываем в",35, 40);
        Stringer.drawString("Текущее решение                     не оптимально. Вводим в базис переменную",11, 60);
        Stringer.drawString("x_{1}, выводим x_{3} и снова производим пересчет таблицы.",11, 80);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("Таблицы 7",199, 40);
        g.drawString("Таблицы 8",145, 60);
        g.setColor(Color.red);
        g.drawString("Таблицу 8",474, 40);
      }
      if(sh==13){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("13.",10, 40);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Результат записываем в                   . Текущее решение x^{2 }= (4; 3)",35, 40);
        Stringer.drawString("является оптимальным и целочисленным. Вычисляем f(x^{2}) = 8 = /{f}{} .",12, 60);
        Stringer.drawString("Включаем это решение в ",12, 80);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("множество возможных оптимальных решений.",200, 80);
        g.setColor(Color.red);
        g.drawString("Таблицу 9",216, 40);
      }
      if(sh==14){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("14.",10, 40);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("содержит два решения,",379, 40);
        Stringer.drawString("значения функций которых равны /{f}{} . Следовательно, ответ задачи:",12, 60);
        Stringer.drawString("x^{* }= (4; 2) = (4; 3), f(x^{*}) = 8.",12, 80);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("Множество возможных оптимальных решений",35, 40);
        g.setColor(Color.red);
        Stringer.drawString("x^{* }= (4; 2) = (4; 3), f(x^{*}) = 8",12, 80);
        Stringer.drawString("Задача решена. Ответ: x^{* }= (4; 2)",35, 130);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("x^{* }= (4; 2) = (4; 3),",12, 80);
        Stringer.drawString("Задача решена. Ответ:",35, 130);
        g.setColor(Color.red);
        Stringer.drawString("x^{* }= (4; 2) = (4; 3)",12, 80);
      }

      if(sh==1) jButton3.setEnabled(false);
      else jButton3.setEnabled(true);
      if(sh==14) jButton1.setEnabled(false);
      else jButton1.setEnabled(true);
    }
  }

  void jButton1_actionPerformed(ActionEvent e) {
    sh++;
    if (sh>14) sh=14;
    jPanel1.repaint();
    jPanel2.repaint();
    jPanel3.repaint();
  }

  void jButton2_actionPerformed(ActionEvent e) {
    sh=1;
    jPanel1.repaint();
    jPanel2.repaint();
    jPanel3.repaint();
  }

  void jButton3_actionPerformed(ActionEvent e) {
    sh--;
    if (sh<1) sh=1;
    jPanel1.repaint();
    jPanel2.repaint();
    jPanel3.repaint();
  }

  void this_mouseMoved(MouseEvent e) {
    int a,aa;
    xx=e.getX();
    yy=e.getY();
    a=e.getX();
    aa=e.getY();
    if((xx>=5)&&(xx<=562)) a=xx-5;
    if((yy>=26)&&(yy<=40)) aa=yy-26;
    if((yy>=67)&&(yy<=315)) aa=yy-67;
    if((yy>=316)&&(yy<=500)) aa=yy-316;
 //   jLabel2.setText("x="+Integer.toString(a)+";y="+Integer.toString(aa));
  }

}
