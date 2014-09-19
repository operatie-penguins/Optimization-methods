package primsimras;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class AppPrimSimRas extends JApplet {
  JButton jButton1 = new JButton();
  JButton jButton2 = new JButton();
  JButton jButton3 = new JButton();
  JLabel jLabel1 = new JLabel();
  public int sh=1;
  Panel_mypaint jPanel1 = new Panel_mypaint();
//  JLabel jLabel2 = new JLabel();
  static int xx,yy;

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
    this.setSize(new Dimension(590, 570));
    this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseMoved(MouseEvent e) {
        this_mouseMoved(e);
      }
    });
    this.getContentPane().setLayout(null);
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel1.setForeground(new Color(130, 0, 80));
    jLabel1.setText("Пример");
    jLabel1.setBounds(new Rectangle(258, 0, 62, 17));
    jPanel1.setBounds(new Rectangle(5,18,580,510));
    jPanel1.setBackground(new Color(247, 247, 255));
    jButton1.setBackground(new Color(220, 230, 255));
    jButton1.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton1.setForeground(new Color(0, 0, 60));
    jButton1.setText("==>");
    jButton1.setBounds(new Rectangle(365, 538, 100, 23));
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton1_actionPerformed(e);
      }
    });
    jButton2.setBackground(new Color(220, 230, 255));
    jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton2.setForeground(new Color(0, 0, 60));
    jButton2.setText("Обновить");
    jButton2.setBounds(new Rectangle(245, 538, 100, 23));
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton2_actionPerformed(e);
      }
    });
    jButton3.setBackground(new Color(220, 230, 255));
    jButton3.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton3.setForeground(new Color(0, 0, 60));
    jButton3.setText("<==");
    jButton3.setBounds(new Rectangle(125, 538, 100, 23));
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton3_actionPerformed(e);
      }
    });
//    jLabel2.setText("");
//    jLabel2.setBounds(new Rectangle(5, 3, 189, 17));
//    this.getContentPane().add(jLabel2, null);
    this.getContentPane().add(jPanel1, null);
    this.getContentPane().add(jLabel1, null);
    this.getContentPane().add(jButton1, null);
    this.getContentPane().add(jButton2, null);
    this.getContentPane().add(jButton3, null);
  }
  public void Ind_n(Graphics g,String a, String b, int x, int y){
    g.setFont(new java.awt.Font("SansSerif", 1, 15));
    g.drawString(""+a,x,y);
    g.setFont(new java.awt.Font("SansSerif", 1, 11));
    g.drawString(""+b+" ",x+a.length()*8,y+5);
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
  }
  public void Ind_nk(Graphics g,String a, String b, int x, int y){
    g.setFont(new java.awt.Font("SansSerif", 1, 15));
    g.drawString(""+a,x,y);
    g.setFont(new java.awt.Font("SansSerif", 3, 11));
    g.drawString(""+b+" ",x+a.length()*8,y+2);
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
  }
  public void Ind_v(Graphics g,String a, String b, int x, int y){
    g.setFont(new java.awt.Font("SansSerif", 1, 15));
    g.drawString(""+a,x,y);
    g.setFont(new java.awt.Font("SansSerif", 1, 11));
    g.drawString(""+b+"  ",x+a.length()*8,y-4);
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
  }
  public void Ind_vn(Graphics g,String a, String b, String c, int x, int y){
    g.setFont(new java.awt.Font("SansSerif", 1, 15));
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
  public void Tabl1(Graphics g, int a, int ay, int c, int t, int h, boolean f, int bp[]){ //Рисует верхнюю таблицу
    int b=(564-120-(a+ay+1)*60)/2, d=(int)Math.round(17*(3-c)/2);d=0;
    if(h==0) g.setColor(Color.red); else g.setColor(new Color(180, 0, 80));
    g.setFont(new java.awt.Font("SansSerif", 3, 13));
    g.drawString("Таблица "+t+":",15+b,163+d);
    g.setColor(new Color(255, 255, 255)); g.fillRect(b+7,167+d,566-2*b,2+17*(4+c));
    g.setColor(Color.black);
    for(int i=0; i<=a+ay+1; i++)
      g.drawLine(b+128+i*60,168+d,b+128+i*60,270-d);
    for(int i=0; i<=3; i++)
      if(i==0) g.drawLine(b+8+i*40,168+d,b+8+i*40,270-d);
      else g.drawLine(b+8+i*40,168+d,b+8+i*40,235-d);
    for(int i=0; i<=4+c; i++)
      if((i==1) || (i==c+3)) g.drawLine(b+128,d+168+i*17,572-b,d+168+i*17);
      else g.drawLine(b+8,d+168+i*17,572-b,d+168+i*17);
    g.setColor(new Color(157, 187, 255)); g.drawRect(b+7,167+d,566-2*b,2+17*(4+c));
    g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 13));
    if (f==true){
      g.drawString("БП",b+59,190+d); g.drawString("БР",b+99,190+d);
      g.drawString("БР/",b+139+60*(a+ay),199+d); Ind_nk(g,"a","ir",b+162+60*(a+ay),199+d);
      Ind_nk(g,"c","i",b+23,190+d); Ind_nk(g,"c","j",b+153+(a+ay)*60,179+d);
      int ii=0;
      for(int i=1; i<=a; i++){
        Ind_n(g,"x",""+i,b+153+(i-1)*60,196+d);
        ii=i;
      }
      for(int i=1; i<=ay; i++)
        Ind_n(g,"y",""+i,b+153+(ii+i-1)*60,196+d);
      for(int i=0; i<c; i++)
        if(bp[i]>a) Ind_n(g,"y",""+(bp[i]-a),b+62,213+d+i*17);
        else if(bp[i]>0) Ind_n(g,"x",""+bp[i],b+62,213+d+i*17);
      Ind_nk(g,"z"," j",b+153+(a+ay)*60,215+c*17+d);
      Ind_nk(g,"\u2206","  j",b+153+(a+ay)*60,232+c*17+d);
    }
  }
  public void Tabl2(Graphics g, int a, int ay, int c, int t, int h, boolean f, int bp[]){ //Рисует нижнюю таблицу
    int b=(564-120-(a+ay+1)*60)/2, d=(int)Math.round(17*(3-c)/2); d=0;
    if(h==0) g.setColor(Color.red); else g.setColor(new Color(180, 0, 80));
    g.setFont(new java.awt.Font("SansSerif", 3, 13));
    g.drawString("Таблица "+t+":",b+15,286+d);
    g.setColor(new Color(255, 255, 255)); g.fillRect(b+7,291+d,566-2*b,2+17*(4+c));
    g.setColor(Color.black);
    for(int i=0; i<=a+ay+1; i++)
      g.drawLine(b+128+i*60,292+d,b+128+i*60,394-d);
    for(int i=0; i<=3; i++)
      if(i==0) g.drawLine(b+8+i*40,292+d,b+8+i*40,394-d);
      else g.drawLine(b+8+i*40,292+d,b+8+i*40,359-d);
    for(int i=0; i<=4+c; i++)
      if((i==1) || (i==c+3)) g.drawLine(b+128,d+292+i*17,572-b,d+292+i*17);
      else g.drawLine(b+8,d+292+i*17,572-b,d+292+i*17);
    g.setColor(new Color(157, 187, 255)); g.drawRect(b+7,291+d,566-2*b,2+17*(4+c));
    g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 13));
    if (f==true){
      g.drawString("БП",b+59,314+d); g.drawString("БР",b+99,314+d);
      g.drawString("БР/",b+139+60*(a+ay),323+d); Ind_nk(g,"a","ir",b+162+60*(a+ay),323+d);
      Ind_nk(g,"c","i",b+23,314+d); Ind_nk(g,"c","j",b+153+(a+ay)*60,303+d);
       int ii=0;
      for(int i=1; i<=a; i++){
        Ind_n(g,"x",""+i,b+153+(i-1)*60,320+d);
        ii=i;
      }
      for(int i=1; i<=ay; i++)
        Ind_n(g,"y",""+i,b+153+(ii+i-1)*60,320+d);
      for(int i=0; i<c; i++)
        if(bp[i]>a) Ind_n(g,"y",""+(bp[i]-a),b+62,337+d+i*17);
        else if(bp[i]>0) Ind_n(g,"x",""+bp[i],b+62,337+d+i*17);
      Ind_nk(g,"z"," j",b+153+(a+ay)*60,339+c*17+d);
      Ind_nk(g,"\u2206","  j",b+153+(a+ay)*60,356+c*17+d);
    }
  }
  public void Tb1(Graphics g, int a, int c,int tbn[][], int tbd[][], int bp[]){ //Заполняет верхнюю таблицу
    g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
    int b=(564-120-(a+1)*60)/2, d=(int)Math.round(17*(3-c)/2), l=0; d=0;
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
            if (tbn[i][j]==1000) g.drawString("M",ii+10,182+d);
            else if (tbn[i][j]==-1000) g.drawString("-M",ii+10,182+d);
                 else g.drawString(jj,ii,182+d);
          }
          else g.drawString(jj,ii,199+i*17+d);
        }
      }
    int k; g.setColor(new Color(0, 0, 80));//g.setColor(new Color(130, 0, 130));
    for(int i=0; i<=1; i++)
      for(int j=1; j<=a; j++){
        if(tbn[4+i][j]<20000){
          k=(int)Math.round(tbn[4+i][j]/1000.0);
          if((tbd[4+i][j]==1) || (tbn[4+i][j]==0)){
            if((k>=1)||(k<=-1)){
              if (tbn[4+i][j]-k*1000>0){
                if(k==1) jj=(tbn[4+i][j]-k*1000)+"+M";
                else if(k==-1) jj=(tbn[4+i][j]-k*1000)+"-M";
                     else if(k>0) jj=(tbn[4+i][j]-k*1000)+"+"+k+"M";
                           else jj=(tbn[4+i][j]-k*1000)+k+"M";
              }
              else if(tbn[4+i][j]-k*1000<0){
                     if(k==1) jj="-"+(k*1000-tbn[4+i][j])+"+M";
                     else if(k==-1) jj="-"+(k*1000-tbn[4+i][j])+"-M";
                          else if(k>0) jj="-"+(k*1000-tbn[4+i][j])+"+"+k+"M";
                               else jj="-"+(k*1000-tbn[4+i][j])+k+"M";
                   }
                   else{
                     if(k==1) jj="M";
                     else if(k==-1) jj="-M";
                          else jj=k+"M";
                   }
            }
            else jj=""+tbn[4+i][j];
          }
          else{
          if((k>=1)||(k<=-1)){
            if(tbn[4+i][j]-k*1000>0){
                if(k==1) jj="("+(tbn[4+i][j]-k*1000)+"+M)/"+tbd[4+i][j];
                else if(k==-1) jj="("+(tbn[4+i][j]-k*1000)+"-M)/"+tbd[4+i][j];
                     else if(k>0) jj="("+(tbn[4+i][j]-k*1000)+"+"+k+"M)/"+tbd[4+i][j];
                          else jj="("+(tbn[4+i][j]-k*1000)+k+"M)/"+tbd[4+i][j];
                }
                else if(tbn[4+i][j]-k*1000<0){
                       if(k==1) jj="(-"+(k*1000-tbn[4+i][j])+"+M)/"+tbd[4+i][j];
                       else if(k==-1) jj="(-"+(k*1000-tbn[4+i][j])+"-M)/"+tbd[4+i][j];
                            else if(k>0) jj="(-"+(k*1000-tbn[4+i][j])+"+"+k+"M)/"+tbd[4+i][j];
                                 else jj="(-"+(k*1000-tbn[4+i][j])+k+"M)/"+tbd[4+i][j];
                   }
                   else{
                     if(k==1) jj="M/"+tbd[4+i][j];
                     else if(k==-1) jj="-M/"+tbd[4+i][j];
                          else jj="M/"+tbd[4+i][j];
                   }
            }
            else jj=tbn[4+i][j]+"/"+tbd[4+i][j];
          }
          l=60-jj.length()*8;
          if(l<0){
            g.setFont(new java.awt.Font("SansSerif", 1, 13));
            l=(60-jj.length()*6);
          }
          ii=(int)(b+68+j*60+l/2);
          g.drawString(jj,ii,216+(c+i)*17+d);
          g.setFont(new java.awt.Font("SansSerif", 1, 14));
        }
      }
    g.setColor(new Color(0, 0, 80));//g.setColor(new Color(90, 0, 90));
    for (int i=0; i<c; i++){
      if((bp[i]<20000) && (tbn[0][bp[i]]<20000)){
        jj=""+tbn[0][bp[i]];
        ii=(int)(b+8+(40-jj.length()*8)/2);
        if (tbn[0][bp[i]]==1000) g.drawString("M",ii+10,216+d+i*17);
        else if (tbn[0][bp[i]]==-1000) g.drawString("-M",ii+10,216+d+i*17);
             else g.drawString(jj,ii,216+d+i*17);
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
        g.drawString(jj,ii,216+d+(i-1)*17);
      }
      if(tbn[i][8]==-20000){
        jj="--";
        ii=(int)(b+130+60*a+(60-jj.length()*8)/2);
        g.drawString(jj,ii,216+d+(i-1)*17);
      }
    }
  }
  public void Tb2(Graphics g, int a, int c, int tbn[][], int tbd[][], int bp[]){ //Заполняет нижнюю таблицу
    g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
    int b=(564-120-(a+1)*60)/2, d=(int)Math.round(17*(3-c)/2), l=0; d=0;
    String jj=""; int ii;
    for (int i=0; i<=c; i++)
      for (int j=0; j<=a; j++){
        int p; g.setColor(new Color(0, 0, 160));
        if(i==0) g.setColor(new Color(0, 0, 80));//g.setColor(new Color(150, 0, 80));
        if(j==0) p=40; else p=60;
        if(tbn[i][j]<20000){
          if((tbd[i][j]==1) || (tbn[i][j]==0)) jj=""+tbn[i][j];
          else jj=tbn[i][j]+"/"+tbd[i][j];
          ii=(int)(b+88+(p-40)*(3*j-1)+(p-jj.length()*8)/2);
          if(i==0){
            if (tbn[i][j]==1000) g.drawString("M",ii+10,300+d);
            else if(tbn[i][j]==-1000) g.drawString("-M",ii+10,306+d);
                 else g.drawString(jj,ii,306+d);
          }
          else g.drawString(jj,ii,323+i*17+d);
        }
      }
    int k; g.setColor(new Color(0, 0, 80)); //g.setColor(new Color(130, 0, 130));
     for(int i=0; i<=1; i++)
      for(int j=1; j<=a; j++){
                if(tbn[4+i][j]<20000){
          k=(int)Math.round(tbn[4+i][j]/1000.0);
          if((tbd[4+i][j]==1) || (tbn[4+i][j]==0)){
            if((k>=1)||(k<=-1)){
              if (tbn[4+i][j]-k*1000>0){
                if(k==1) jj=(tbn[4+i][j]-k*1000)+"+M";
                else if(k==-1) jj=(tbn[4+i][j]-k*1000)+"-M";
                     else if(k>0) jj=(tbn[4+i][j]-k*1000)+"+"+k+"M";
                           else jj=(tbn[4+i][j]-k*1000)+k+"M";
              }
              else if(tbn[4+i][j]-k*1000<0){
                     if(k==1) jj="-"+(k*1000-tbn[4+i][j])+"+M";
                     else if(k==-1) jj="-"+(k*1000-tbn[4+i][j])+"-M";
                          else if(k>0) jj="-"+(k*1000-tbn[4+i][j])+"+"+k+"M";
                               else jj="-"+(k*1000-tbn[4+i][j])+k+"M";
                   }
                   else{
                     if(k==1) jj="M";
                     else if(k==-1) jj="-M";
                          else jj=k+"M";
                   }
            }
            else jj=""+tbn[4+i][j];
          }
          else{
          if((k>=1)||(k<=-1)){
            if(tbn[4+i][j]-k*1000>0){
                if(k==1) jj="("+(tbn[4+i][j]-k*1000)+"+M)/"+tbd[4+i][j];
                else if(k==-1) jj="("+(tbn[4+i][j]-k*1000)+"-M)/"+tbd[4+i][j];
                     else if(k>0) jj="("+(tbn[4+i][j]-k*1000)+"+"+k+"M)/"+tbd[4+i][j];
                          else jj="("+(tbn[4+i][j]-k*1000)+k+"M)/"+tbd[4+i][j];
                }
                else if(tbn[4+i][j]-k*1000<0){
                       if(k==1) jj="(-"+(k*1000-tbn[4+i][j])+"+M)/"+tbd[4+i][j];
                       else if(k==-1) jj="(-"+(k*1000-tbn[4+i][j])+"-M)/"+tbd[4+i][j];
                            else if(k>0) jj="(-"+(k*1000-tbn[4+i][j])+"+"+k+"M)/"+tbd[4+i][j];
                                 else jj="(-"+(k*1000-tbn[4+i][j])+k+"M)/"+tbd[4+i][j];
                   }
                   else{
                     if(k==1) jj="M/"+tbd[4+i][j];
                     else if(k==-1) jj="-M/"+tbd[4+i][j];
                          else jj="M/"+tbd[4+i][j];
                   }
            }
            else jj=tbn[4+i][j]+"/"+tbd[4+i][j];
          }
          l=60-jj.length()*8;
          if(l<0){
            g.setFont(new java.awt.Font("SansSerif", 1, 13));
            l=(60-jj.length()*6);
          }
          ii=(int)(b+68+j*60+l/2);
         g.drawString(jj,ii,340+(c+i)*17+d);
         g.setFont(new java.awt.Font("SansSerif", 1, 14));
       }
    }
    g.setColor(new Color(0, 0, 80));//g.setColor(new Color(90, 0, 90));
    for(int i=0; i<c; i++){
      if((bp[i]<20000) && (tbn[0][bp[i]]<20000)){
        jj=""+tbn[0][bp[i]];
        ii=(int)(b+8+(40-jj.length()*8)/2);
        if (tbn[0][bp[i]]==1000) g.drawString("M",ii+10,340+d+i*17);
        else if(tbn[0][bp[i]]==-1000) g.drawString("-M",ii+10,340+d+i*17);
             else g.drawString(jj,ii,340+d+i*17);
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
        g.drawString(jj,ii,340+d+(i-1)*17);
      }
      if(tbn[i][8]==-20000){
        jj="--";
        ii=(int)(b+130+60*a+(60-jj.length()*8)/2);
        g.drawString(jj,ii,340+d+(i-1)*17);
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
    int mn[]={0,0,0}, md[]={1,1,1}, k=1, tmp;
    for(int i=1; i<=a; i++){
      for(int j=0; j<c; j++){
        mn[j]=tbn[j+1][i]*tbn[0][bp[j]];
        md[j]=tbd[j+1][i]*tbd[0][bp[j]];
      }
      tbn[5][i]=tbn[0][i]; tbd[5][i]=tbd[0][i];
      tbn[4][i]=0; tbd[4][i]=1;
      for(int j=0; j<c; j++)
        if(mn[j]<20000){
          k=MaxDel(tbd[4][i],md[j]);
          tbn[4][i]=tbn[4][i]*md[j]/k; mn[j]=mn[j]*tbd[4][i]/k;
          tbd[4][i]=tbd[4][i]*md[j]/k; //md[j]=tbd[4][i]; // общий знаменатель
          tbn[4][i]=tbn[4][i]+mn[j];
        }
       tmp=tbn[4][i];
       k=MaxDel(tbd[5][i],tmp);
       tbn[5][i]=tbn[5][i]*tbd[4][i]/k; tmp=tmp*tbd[5][i]/k;
       tbd[5][i]=tbd[5][i]*tbd[4][i]/k; //md[j]=tbd[4][i]; // общий знаменатель
       tbn[5][i]=tbn[5][i]-tmp;
      if((Math.round(tbn[5][i]/1000.0)<=1) && (Math.round(tbn[5][i]/1000.0)>=-1)){
        k=MaxDel(tbn[5][i],tbd[5][i]);
        tbn[5][i]=tbn[5][i]/k; tbd[5][i]=tbd[5][i]/k;
      }
      else{
        int j=1;
        k=(int)Math.round(tbn[5][i]/1000.0);
        j=MaxDel3(tbn[5][i]-k*1000,tbd[5][i],k*1000);
        tbd[5][i]=tbd[5][i]/j;
        tbn[5][i]=tbn[5][i]/j;
      }
    }
  }
  public void ModifyArrayS(int a, int c, int tbn[][], int tbd[][], int bp[], String s[]){
    int k;
    for(int i=0; i<a; i++)
      if(tbn[0][i+1]<20000){
        s[i]="= ";
        if((Math.round(tbn[0][i+1]/1000.0)<1) && (Math.round(tbn[0][i+1]/1000.0)>-1))
          s[i]=s[i]+tbn[0][i+1]+" - [ ";
        else{
          if(tbn[0][i+1]==1000) s[i]=s[i]+"M"+" - [ ";
          if(tbn[0][i+1]==-1000) s[i]=s[i]+"-M"+" - [ ";
        }
        for(int j=1; j<=c; j++){
          if(j>1) s[i]=s[i]+" + ";
          if(tbn[0][bp[j-1]]<0){
            if(tbn[0][bp[j-1]]==-1000) s[i]=s[i]+"(-M)*";
            else s[i]=s[i]+"("+tbn[0][bp[j-1]]+")*";
          }
          else{
            if(tbn[0][bp[j]]==1000) s[i]=s[i]+"M*";
            else s[i]=s[i]+tbn[0][bp[j-1]]+"*";
          }
          if(tbd[j][i+1]==1){
            if(tbn[j][i+1]<0) s[i]=s[i]+"("+tbn[j][i+1]+")";
            else s[i]=s[i]+tbn[j][i+1];
          }
          else s[i]=s[i]+"("+tbn[j][i+1]+"/"+tbd[j][i+1]+")";
        }
        s[i]=s[i]+" ] = ";
        if(tbn[5][i+1]<20000){
          k=(int)Math.round(tbn[5][i+1]/1000.0);
          if(tbd[5][i+1]==1){
            if((k>=1)||(k<=-1)){
              if(tbn[5][i+1]-k*1000>0){
                if(k==1) s[i]=s[i]+"M + "+(tbn[5][i+1]-k*1000);
                else if(k==-1) s[i]=s[i]+"-M + "+(tbn[5][i+1]-k*1000);
                     else s[i]=s[i]+k+"M + "+(tbn[5][i+1]-k*1000);
              }
              else if(tbn[5][i+1]-k*1000<0){
                     if(k==1) s[i]=s[i]+"M - "+(k*1000-tbn[5][i+1]);
                     else if(k==-1) s[i]=s[i]+"-M - "+(k*1000-tbn[5][i+1]);
                          else s[i]=s[i]+k+"M - "+(k*1000-tbn[5][i+1]);
                   }
                   else{
                     if(k==1) s[i]=s[i]+"M";
                     else if(k==-1) s[i]=s[i]+"-M";
                          else s[i]=s[i]+k+"M";
                   }
            }
            else s[i]=s[i]+""+tbn[5][i+1];
          }
          else{
            if((k>=1)||(k<=-1)){
              if (tbn[5][i+1]-k*1000>0){
                if(k==1) s[i]=s[i]+"("+"M + "+(tbn[5][i+1]-k*1000)+")/"+tbd[5][i+1];
                else if(k==-1) s[i]=s[i]+"("+"-M + "+(tbn[5][i+1]-k*1000)+")/"+tbd[5][i+1];
                     else s[i]=s[i]+"("+k+"M + "+(tbn[5][i+1]-k*1000)+")/"+tbd[5][i+1];
              }
              else if (tbn[5][i+1]-k*1000<0){
                     if(k==1) s[i]=s[i]+"("+"M - "+(k*1000-tbn[5][i+1])+")/"+tbd[5][i+1];
                     else if(k==-1) s[i]=s[i]+"("+"-M - "+(k*1000-tbn[5][i+1])+")/"+tbd[5][i+1];
                          else s[i]=s[i]+"("+k+"M - "+(k*1000-tbn[5][i+1])+")/"+tbd[5][i+1];
                   }
                   else{
                     if(k==1) s[i]=s[i]+"M/"+tbd[5][i+1];
                     else if(k==-1) s[i]=s[i]+"-M/"+tbd[5][i+1];
                          else s[i]=s[i]+"M/"+tbd[5][i+1];
                   }
            }
            else s[i]=s[i]+tbn[5][i+1]+"/"+tbd[5][i+1];
          }
        }
      }
  }
  public void ModifyArray1(int a, int c, int tbn[][], int tbd[][], int p, int n, int bp[]){  //Пересчет таблицы
    int tbn1=0, tbd1=0, k=0, t=1, tmp;
    for(int i=1; i<=5 ; i++){
      if((c==2) && (i==3)) i++;
      if((i!=p) && (i!=4)){
        for(int j=0; j<=a; j++)
          if(tbn[i][j]<20000)
            if(j!=n){
              tbn1=tbn[p][j]*tbn[i][n]*tbd[p][n];
              tbd1=tbd[p][j]*tbd[i][n]*tbn[p][n];
              t=MaxDel(tbd[i][j],tbd1);
              tbn[i][j]=(tbn[i][j]*tbd1/t)-(tbn1*tbd[i][j]/t);
              tbd[i][j]=tbd[i][j]*tbd1/t;
              k=(int)Math.round(tbn1/1000.0);
              if( ( ((k>-1) && (k<1)) && (i==5)) || (i<=5)){
                t=MaxDel(tbn[i][j],tbd[i][j]);
                tbd[i][j]=tbd[i][j]/t;
                tbn[i][j]=tbn[i][j]/t;
              }
              if(((k<=-1) || (k>=1)) && (i==5)){
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
   int mn[]={0,0,0}, md[]={1,1,1}; k=1;
    for(int i=1; i<=a; i++){
      for(int j=0; j<c; j++){
        mn[j]=tbn[j+1][i]*tbn[0][bp[j]];
        md[j]=tbd[j+1][i]*tbd[0][bp[j]];
        if(mn[j]==0) md[j]=1;
      }
      tbn[4][i]=0; tbd[4][i]=1;
      for(int j=0; j<c; j++)
        if(mn[j]<20000){
          k=MaxDel(tbd[4][i],md[j]);
          tbn[4][i]=tbn[4][i]*md[j]/k; mn[j]=mn[j]*tbd[4][i]/k;
          tbd[4][i]=tbd[4][i]*md[j]/k; //md[j]=tbd[4][i]; // общий знаменатель
          tbn[4][i]=tbn[4][i]+mn[j];
        }
    }
  }
  public void Valuation(int a, int c, int tbn[][], int tbd[][], int nm[], String sm[]){ //Находит максимальную оценку
    double max=0.0; int maxn=0, maxd=1;
       for(int i=1; i<=a; i++)
         if((tbn[5][i]>0) && (max<(double)tbn[5][i]/tbd[5][i])){
           max=tbn[5][i]/tbd[5][i];
           nm[0]=i; maxn=tbn[5][i]; maxd=tbd[5][i];
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

  class  Panel_mypaint extends JPanel {
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Stringer.setGraphics(g);
      String s[]={"","","","","","",""}, sm[]={""}, ss="", jj="";
      int n=0, p=0, z=0, l=0, a=4, ay=1, c=2, b=(564-120-(a+ay+1)*60)/2, d=(int)Math.round(17*(3-c)/2), nm[]={0},
          bp[]={5,4,0},
          tbn[][]={ {20000,1,-1,0,0,-1000,20000,20000,20000},
                  {4,-1,2,-1,0,1,20000,20000,20000},
                  {14,3,2,0,1,0,20000,20000,20000},
                  {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                  {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                  {20000,20000,20000,20000,20000,20000,20000,20000,20000} },
          tbd[][]={ {1,1,1,1,1,1,1,1,1},
                    {1,1,1,1,1,1,1,1,1},
                    {1,1,1,1,1,1,1,1,1},
                    {1,1,1,1,1,1,1,1,1},
                    {1,1,1,1,1,1,1,1,1},
                    {1,1,1,1,1,1,1,1,1} };
      d=0;
      g.setColor(new Color(180, 0, 80));
      g.setFont(new java.awt.Font("SansSerif", 3, 13));
      g.drawString("Задача:  ",43,15);
      g.drawString("Решение:",15,410);
      g.drawString("Обозначения:",440,57);
      g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
      Stringer.drawString("Найти решение задачи  f(x) = x_{1}- x_{2} \u2192 max  при ограничениях",98,15);
      Stringer.drawString("-x_{1} + 2 x_{2} \u2265 4,  3 x_{1} + 2 x_{2} \u2264 14,  x_{1}, x_{2} \u2265 0, где x_{1}, x_{2} - целые, симплекс-методом",15,35);
      g.setColor(new Color(255, 255, 255));
      g.fillRect(7,62,145,85); g.fillRect(432,62,140,85); g.fillRect(7,415,565,90); g.fillRect(172,62,240,85);
      g.setColor(new Color(157, 187, 255));
      g.drawRect(7,62,145,85); g.drawRect(432,62,140,85); g.drawRect(7,415,565,90); g.drawRect(172,62,240,85);
      g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 13));

      if(sh>=1){
        g.drawString("БП",440,82); g.drawString("БР",440,119);
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("- базисные",461,83); g.drawString("переменные",471,99);
        g.drawString("- базисное",461,119); g.drawString("решение",471,135);
      }

      if(sh>=1){
        g.setColor(new Color(180, 0, 80));  g.setFont(new java.awt.Font("SansSerif", 3, 13));
        if(sh==1){
          g.setColor(Color.red); g.drawRect(7,62,145,85);
        }
        g.drawString("Исходная задача:",15,57);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("f(x) = x_{1} - x_{2} \u2192 max",15,77);
        Stringer.drawString("- x_{1} + 2 x_{2} \u2265 4,",31,99);
        Stringer.drawString("3 x_{1} + 2 x_{2} \u2264 14,",29,119);
        Stringer.drawString("x_{1}, x_{2} \u2265 0.",49,139);
      }
      if(sh==2){
        g.setColor(new Color(180, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 3, 13));
        g.setColor(Color.red); g.drawRect(172,62,240,85);
        g.drawString("Задача в канонической форме:",180,57);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("f(x) = x_{1} - x_{2} \u2192 max",227,77);
        Stringer.drawString("- x_{1} + 2 x_{2 } -    x_{3} + 0 x_{4} =  4,",202,99);
        Stringer.drawString("3 x_{1} + 2 x_{2} + 0 x_{3} +    x_{4} = 14,",199,119);
        Stringer.drawString("x_{1}, x_{2}, x_{3}, x_{4} \u2265 0.",238,139);
        g.setColor(Color.red);
        Stringer.drawString("- x_{1} + 2 x_{2 } -    x_{3}",202,99);
        Stringer.drawString("3 x_{1} + 2 x_{2} + 0 x_{3} +    x_{4}",199,119);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("- x_{1} + 2 x_{2 }",202,99);
        Stringer.drawString("3 x_{1} + 2 x_{2} + 0 x_{3}",199,119);
      }
      if(sh>=3){
        g.setFont(new java.awt.Font("SansSerif", 3, 13));
        if(sh==3) g.setColor(Color.red);
        else g.setColor(new Color(180, 0, 80));
        g.drawString("Задача в расширенной форме:",180,57);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("f(x) = x_{1} - x_{2} - М y_{1} \u2192 max",205,77);
        Stringer.drawString("- x_{1} + 2 x_{2 } -    x_{3} + 0 x_{4} +    y_{1} =  4,",182,99);
        Stringer.drawString("3 x_{1} + 2 x_{2} + 0 x_{3} +    x_{4} + 0 y_{1} = 14,",179,119);
        Stringer.drawString("x_{1}, x_{2}, x_{3}, x_{4}, y_{1} \u2265 0.",226,139);
        if(sh==3){
          g.setColor(Color.red); g.drawRect(172,62,240,85);
          Stringer.drawString("f(x) = x_{1} - x_{2} - М y_{1}",205,77);
          Stringer.drawString("- x_{1} + 2 x_{2 } -    x_{3} + 0 x_{4} +    y_{1}",182,99);
          g.setColor(new Color(0, 0, 80));
          Stringer.drawString("f(x) = x_{1} - x_{2}",205,77);
          Stringer.drawString("- x_{1} + 2 x_{2 } -    x_{3} + 0 x_{4}",182,99);
        }
      }
      if(sh<=18){
      if(sh==4){
        Tabl1(g,a,ay,c,1,0,true,bp);
        g.setColor(new Color(230, 230, 255)); g.fillRect(49+b,203+d,39,33);
        g.setColor(Color.black); g.drawLine(49+b,203+d+16,49+b+39,203+d+16);
        g.setColor(new Color(0, 0, 80)); Ind_n(g,"y","1",b+62,213+d); Ind_n(g,"x","4",b+62,213+d+17);
        g.setColor(new Color(0, 0, 160)); String jj0;
        for (int i=1; i<=c; i++)
          if(tbn[i][0]<20000){
            if((tbd[i][0]==1) || (tbn[i][0]==0)) jj0=""+tbn[i][0];
            else jj0=tbn[i][0]+"/"+tbd[i][0];
            g.drawString(jj0,(int)(b+88+(40-jj0.length()*8)/2),199+i*17+d);
          }
      }
      if((sh>=5) && (sh<=12)){
        Tabl1(g,a,ay,c,1,1,true,bp);
        Tb1(g,a+ay,c,tbn,tbd,bp);
      }
      if(sh>=6){
        ModifyArray(a+ay,c,tbn,tbd,bp);
        if(sh==6){
          g.setColor(new Color(230, 230, 255)); g.fillRect(129+b,237+d,299,33);
          g.setColor(Color.black); g.drawLine(129+b,237+d+16,129+b+299,237+d+16);
          for(int i=1; i<=4; i++)
           g.drawLine(128+b+60*i,237+d,128+b+60*i,237+d+33);
          Tb1(g,a+ay,c,tbn,tbd,bp);
          g.setColor(Color.red); Ind_nk(g,"\u2206","  j",b+153+(a+ay)*60,215+(c+1)*17+d);
        }
      }
      if(sh==7){
        g.setColor(new Color(230, 230, 255)); g.fillRect(189+b,203+d,59,33); g.fillRect(189+b,254+d,59,16);
        g.setColor(Color.black); g.drawLine(189+b,203+d+16,189+b+59,203+d+16);
        Tb1(g,a+ay,c,tbn,tbd,bp);
        g.setColor(Color.red); Ind_n(g,"x","2",b+153+60,196+d);
      }
      if(sh>=8){
        Valuation(a+ay,c,tbn,tbd,nm,sm);
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
        Tb1(g,a+ay,c,tbn,tbd,bp);
        if(sh<10){ g.setColor(Color.red); Ind_n(g,"y","1",b+62,213+d);}
        if(sh==8){
          g.setColor(new Color(230, 230, 255));
          g.fillRect(129+(a+ay)*60+b,186+d,59,c*17+16);
          g.setColor(Color.black);
          for(int i=1; i<=c; i++)
            g.drawLine(129+(a+ay)*60+b,d+185+i*17,188+(a+ay)*60+b,d+185+i*17);
          Tb1(g,a+ay,c,tbn,tbd,bp);
          g.setColor(Color.red); g.setFont(new java.awt.Font("SansSerif", 1, 13));
          g.drawString("БР/",b+139+60*(a+ay),199+d); Ind_nk(g,"a","ir",b+162+60*(a+ay),199+d);
          Ind_n(g,"x","2",b+153+60,196+d); Ind_n(g,"y","1",b+62,213+d);
        }
      }
      if(sh>=9){
        for(int i=1; i<=c+1; i++){
          tbn[i][8]=20000; tbd[i][8]=1;
        }
        z=bp[p-1];
        bp[p-1]=n;
        if(sh<=12){
          if(sh==9) Tabl2(g,a,ay,c,2,0,true,bp);
          else Tabl2(g,a,ay,c,2,1,true,bp);
          Tb2(g,a+ay,c,tbn,tbd,bp);
        }
        if(sh==9){
          g.setColor(Color.red);
          Ind_n(g,"x",""+n,b+62,337+d+(p-1)*17);
        }
        if(sh<=12){
          g.setColor(new Color(255, 255, 255)); g.fillRect(b+89,327+d,39+60*(a+ay),(c+2)*17-1);
          g.setColor(Color.black);
          for(int i=0; i<a+ay; i++)
            g.drawLine(b+128+i*60,327+d,b+128+i*60,326+d+(c+2)*17);
          for(int i=1; i<=c; i++)
            g.drawLine(b+89,326+d+i*17,b+128+60*(a+ay),326+d+i*17);
          g.drawLine(b+129,326+d+(c+1)*17,b+128+60*(a+ay),326+d+(c+1)*17);
        }
      }

      if((sh>=10) && (sh<=12)){
        if(sh<11){
          bp[p-1]=z;
          g.setColor(new Color(230, 230, 255));
          g.fillRect(89+b,186+d+17*p,40+60*(a+ay)-1,16);
          g.setColor(Color.black);
          for(int i=0; i<=a+ay; i++)
            g.drawLine(b+128+i*60,186+d+17*p,b+128+i*60,202+d+17*p);
          for(int i=1; i<3; i++)
            g.drawLine(b+8+i*40,186+d+17*p,b+8+i*40,202+d+17*p);
          Tb1(g,a+ay,c,tbn,tbd,bp);
          g.setColor(Color.red);
          if(tbd[p][n]==1) jj=""+tbn[p][n];
          else jj=tbn[p][n]+"/"+tbd[p][n];
          g.drawString(jj,68+60*n+(60-jj.length()*8)/2+b,p*17+199+d);
          bp[p-1]=n;
        }
        if(sh==11){
          g.setColor(new Color(230, 230, 255));
          g.fillRect(b+89,327+d,39+60*(a+ay),(p-1)*17-1);
          g.fillRect(b+89,327+d+17*p,39+60*(a+ay),(c-p)*17-1);
        }
        if(sh==12){
          g.setColor(Color.red);
          Ind_nk(g,"\u2206","  j",b+153+(a+ay)*60,339+(c+1)*17+d);
          g.setColor(new Color(230, 230, 255));
          g.fillRect(b+129,327+d+c*17,60*(a+ay)-1,33);
        }
      if((sh==11) || (sh==12)){
          g.setColor(Color.red);
          if(tbd[p][n]==1) jj=""+tbn[p][n];
          else jj=tbn[p][n]+"/"+tbd[p][n];
          g.drawString(jj,68+60*n+(60-jj.length()*8)/2+b,p*17+199+d);
          g.setColor(Color.black);
          for(int i=0; i<a+ay; i++)
            g.drawLine(b+128+i*60,327+d,b+128+i*60,326+d+(c+2)*17);
          for(int i=1; i<=c; i++)
            g.drawLine(b+89,326+d+i*17,b+128+60*(a+ay),326+d+i*17);
          g.drawLine(b+129,326+d+(c+1)*17,b+128+60*(a+ay),326+d+(c+1)*17);
        }
        ModifyArray1(a+ay,c,tbn,tbd,p,n,bp);
        Tb2(g,a+ay,c,tbn,tbd,bp);
        if(sh<=11){
          g.setColor(new Color(255, 255, 255));
          if(sh<11){
            g.fillRect(b+89,327+d,39+60*(a+ay),(p-1)*17-1);
            g.fillRect(b+89,327+d+p*17,39+60*(a+ay),(c-p+2)*17-1);
          }
          else g.fillRect(b+89,327+d+c*17,39+60*(a+ay),33);
          g.setColor(Color.black);
          for(int i=0; i<a+ay; i++)
            g.drawLine(b+128+i*60,327+d,b+128+i*60,326+d+(c+2)*17);
          for(int i=1; i<=c; i++)
            g.drawLine(b+89,326+d+i*17,b+128+60*(a+ay),326+d+i*17);
          g.drawLine(b+129,326+d+(c+1)*17,b+128+60*(a+ay),326+d+(c+1)*17);
        }
      }
      if(sh>=13){
        ModifyArray1(a+ay,c,tbn,tbd,p,n,bp);
        Valuation(a+ay,c,tbn,tbd,nm,sm);
        n=nm[0]; ss=sm[0];
        Tabl1(g,a,ay,c,2,0,true,bp);
        if(sh==13){
          g.setColor(new Color(230, 230, 255));
          g.fillRect(69+b+n*60,186+d+17*2,59,16);
          g.fillRect(69+b+n*60,203+d+17*(c+1),59,16);
          Tb1(g,a+ay,c,tbn,tbd,bp);
          g.setColor(Color.red);
          Ind_n(g,"x",""+n,b+153+(n-1)*60,196+d);
        }
      }
      if(sh>=14){
        Tabl1(g,a,ay,c,2,1,true,bp);
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
        Tb1(g,a+ay,c,tbn,tbd,bp);
        if(sh==14){
          g.setColor(new Color(230, 230, 255));
          g.fillRect(129+(a+ay)*60+b,186+d,59,16+c*17);
          g.setColor(Color.black);
          for(int i=1; i<=c; i++)
            g.drawLine(129+(a+ay)*60+b,d+185+i*17,188+(a+ay)*60+b,d+185+i*17);
          Tb1(g,a+ay,c,tbn,tbd,bp);
          g.setColor(Color.red);
          Ind_n(g,"x",""+n,b+153+(n-1)*60,196+d);
          Ind_n(g,"x",""+bp[p-1],b+62,213+d+(p-1)*17);
          g.setFont(new java.awt.Font("SansSerif", 1, 13));
          g.drawString("БР/",b+139+60*(a+ay),199+d); Ind_nk(g,"a","ir",b+162+60*(a+ay),199+d);
        }
      }
      if(sh>=15){
        for(int i=1; i<=c+1; i++){
          tbn[i][8]=20000; tbd[i][8]=1;
        }
        z=bp[p-1];
        bp[p-1]=n;
        if(sh==15) Tabl2(g,a,ay,c,3,0,true,bp);
        else Tabl2(g,a,ay,c,3,1,true,bp);
      }
      if(sh>=15){
        ModifyArray1(a+ay,c,tbn,tbd,p,n,bp);
        Tb2(g,a+ay,c,tbn,tbd,bp);
        if(sh==15){
          g.setColor(Color.red);
          Ind_n(g,"x","4",b+62,213+d+(p-1)*17);
          Ind_n(g,"x","1",b+62,337+d+(p-1)*17);
        }
        if(sh==15){
          g.setColor(new Color(255, 255, 255));
          g.fillRect(b+89,327+d+17*c,39+60*(a+ay),33);
          g.setColor(Color.black);
          for(int i=0; i<=a+ay; i++)
            g.drawLine(b+128+i*60,327+d,b+128+i*60,326+d+(c+2)*17);
          g.drawLine(b+129,326+d+(c+1)*17,b+128+60*(a+ay),326+d+(c+1)*17);
        }
        if(sh==16){
          g.setColor(new Color(230, 230, 255));
          g.fillRect(b+129,327+d+c*17,60*(a+ay)-1,33);
          g.setColor(Color.black);
          for(int i=0; i<a+ay; i++)
            g.drawLine(b+128+i*60,327+d,b+128+i*60,326+d+(c+2)*17);
            g.drawLine(b+129,326+d+(c+1)*17,b+128+60*(a+ay),326+d+(c+1)*17);
          Tb2(g,a+ay,c,tbn,tbd,bp);
        }
      }
      if(sh==17){
        g.setColor(Color.red);
        Ind_nk(g,"\u2206","  j",b+153+(a+ay)*60,339+(c+1)*17+d);
        g.setColor(new Color(230, 230, 255));
        g.fillRect(b+129,327+d+(c+1)*17,60*(a+ay)-1,16);
        g.setColor(Color.black);
        for(int i=0; i<a+ay; i++)
          g.drawLine(b+128+i*60,327+d,b+128+i*60,326+d+(c+2)*17);
        Tb2(g,a+ay,c,tbn,tbd,bp);
      }
      if(sh==18){
        g.setColor(new Color(230, 230, 255));
        g.fillRect(b+129,327+d+(c+1)*17,60*(a+ay)-1,16);
        g.setColor(Color.black);
        for(int i=0; i<a+ay; i++)
          g.drawLine(b+128+i*60,327+d,b+128+i*60,326+d+(c+2)*17);
        Tb2(g,a+ay,c,tbn,tbd,bp);
      }
      }
     //График
     if(sh==19){
       g.setColor(new Color(180, 0, 80));
       g.setFont(new java.awt.Font("SansSerif", 3, 13));
       g.drawString("Графическая иллюстрация:",175,162);
       g.setColor(new Color(255, 255, 255));
       g.fillRect(167,167,246,228);
       g.setColor(new Color(157, 187, 255));
       g.drawRect(167,167,246,228);
       g.setColor(Color.black);
       g.drawLine(187,173,187,394);
       g.drawLine(168,365,408,365);
       Ind_n(g,"x","2",194,178); Ind_n(g,"x","1",398,377);
       int a11[]={182,187,192}, b11[]={174,167,174};
       int a12[]={407,412,407}, b12[]={360,365,370};
       g.fillPolygon(a11,b11,3);
       g.fillPolygon(a12,b12,3);
       int i;
       g.setColor(new Color(227, 227, 255));
       int a21[]={188,250,188}, b21[]={184,280,312};
       g.fillPolygon(a21,b21,3);
       g.setColor(new Color(0, 0, 80));
       for (i=278; i<364; i=i+4) g.drawLine(251,i,251,i+2);
       for (i=189; i<250; i=i+5) g.drawLine(i,280,i+2,280);
       g.setColor(Color.red); Ind_v(g,"x","*",251,275);
       g.setFont(new java.awt.Font("SansSerif", 1, 11));
       g.setColor(Color.darkGray);
       g.drawString("0",177,378);
       for(i=-2; i<7; i++){
           g.setColor(Color.black);
           g.drawLine(184,339-26*i,190,339-26*i);
           if(i>=0){
             g.drawLine(213+26*i,362,213+26*i,368);
             g.setColor(Color.darkGray);
             if((i!=4) && (i!=0)) g.drawString(""+(i+1),211+26*i,379);
             else g.drawString(""+(i+1),216+26*i,379);
           }
       }
       g.drawString(""+(-1),173,394);
       for(i=0; i<7; i++)
         if(i!=1) g.drawString(""+(i+1),177,343-26*i);
         else g.drawString(""+(i+1),177,340-26*i);
       g.setColor(new Color(0, 0, 80));
       g.drawLine(176,168,327,394); g.drawLine(177,168,328,394);
       g.drawLine(168,322,412,200); g.drawLine(168,323,412,201);
       g.drawLine(187,365,187+25,365+25); g.drawLine(187,366,187+25,366+25);
       g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("3    + 2     = 14",300,345);
       Ind_n(g,"x","1",310,345); Ind_n(g,"x","2",346,345);
       g.drawString("-    + 2     = 4",325,257);
       Ind_n(g,"x","1",333,257); Ind_n(g,"x","2",369,257);
       int a4[]={187+26,187+23,187+17}, b4[]={365+26,365+17,365+23};
       g.fillPolygon(a4,b4,3);
       for(i=187; i<207; i=i+7)
         g.drawLine(i+6,365+26,i+10,365+26);
       for(i=365; i<385; i=i+7)
         g.drawLine(213,i+6,213,i+10);
       g.drawString("\u25bcf",216,391);
       g.setColor(Color.red);
       g.fillOval(250,279,5,5);
     }
     //Коментарии
     if(sh==1){
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Найти максимум в исходной задаче.",12, 435);
     }
     if(sh==2){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("0.1",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Приведем исходную задачу к канонической. Т.к. 1-е неравенство имеет",40,435);
       Stringer.drawString("знак \u2265, вводим дополнительную переменную x_{3} со знаком ' - '. Поскольку во",12,455);
       Stringer.drawString("втором неравенстве знак \u2264, то вводим дополнительную переменную x_{4} со",12,475);
       Stringer.drawString("знаком ' + ' (она становится базисной).",12,495);
       g.setColor(Color.red);
       Stringer.drawString("Приведем исходную задачу к канонической",40,435);
       Stringer.drawString("знак \u2265, вводим дополнительную переменную x_{3} со знаком ' -",12,455);
       Stringer.drawString("втором неравенстве знак \u2264, то вводим дополнительную переменную x_{4}",12,475);
       Stringer.drawString("знаком ' +",12,495);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Приведем исходную задачу к",40,435);
       Stringer.drawString("знак \u2265, вводим дополнительную переменную x_{3} со знаком '",12,455);
       Stringer.drawString("втором неравенстве знак \u2264, то вводим дополнительную переменную",12,475);
       Stringer.drawString("знаком '",12,495);
       g.setColor(Color.red);
       Stringer.drawString("знак \u2265, вводим дополнительную переменную x_{3}",12,455);
       Stringer.drawString("втором неравенстве знак \u2264",12,475);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("знак \u2265, вводим дополнительную переменную",12,455);
       Stringer.drawString("втором неравенстве знак",12,475);
       g.setColor(Color.red);
       Stringer.drawString("знак \u2265, вводим дополнительную",12,455);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("знак \u2265, вводим",12,455);
       g.setColor(Color.red);
       Stringer.drawString("знак \u2265",12,455);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("знак",12,455);
     }
     if(sh==3){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("0.2",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Т.к. в первом уравнении нет базисных переменных, то перейдем к",40,435);
       Stringer.drawString("М-задаче. Для этого введем искусственную переменную y_{1} и добавим ее к",12,455);
       Stringer.drawString("целевой функции с коэффициентом ' - M '. В результате получаем задачу в",12,475);
       Stringer.drawString("расширенной форме.",12,495);
       g.setColor(Color.red);
       Stringer.drawString("Т.к. в первом уравнении нет базисных",40,435);
       Stringer.drawString("М-задаче. Для этого введем искусственную переменную y_{1}",12,455);
       Stringer.drawString("целевой функции с коэффициентом ' - M",12,475);
       Stringer.drawString("расширенной форме",12,495);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Т.к. в первом уравнении нет",40,435);
       Stringer.drawString("М-задаче. Для этого введем искусственную переменную",12,455);
       Stringer.drawString("целевой функции с коэффициентом '",12,475);
       g.setColor(Color.red);
       Stringer.drawString("М-задаче. Для этого введем искусственную",12,455);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("М-задаче. Для этого введем",12,455);
       g.setColor(Color.red);
       Stringer.drawString("М-задаче",12,455);
    }
    if(sh==4){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("1.1.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Найдем начальное базисное решение. Базисными переменными",40,435);
       Stringer.drawString("являются x_{4}, y_{1}, а свободными x_{1}, x_{2}, x_{3}. Приравняем свободные переменные",10,455);
       Stringer.drawString("к нулю. Тогда x_{1} = x_{2} = x_{3} = 0 и x_{4} = 14, y_{1} = 4. Начальное базисное решение",10,475);
       Stringer.drawString("(0;0;0;14;4)^{T}.",10,495);
       g.setColor(Color.red);
       Stringer.drawString("Найдем начальное базисное решение. Базисными",40,435);
       Stringer.drawString("являются x_{4}, y_{1}, а свободными x_{1}, x_{2}, x_{3}",10,455);
       Stringer.drawString("(0;0;0;14;4)^{T}",10,495);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Найдем начальное базисное решение.",40,435);
       Stringer.drawString("являются x_{4}, y_{1}, а свободными x_{1}, x_{2},",10,455);
       g.setColor(Color.red); Stringer.drawString("являются x_{4}, y_{1}, а свободными x_{1}, x_{2}",10,455);
       g.setColor(new Color(0, 0, 80)); Stringer.drawString("являются x_{4}, y_{1}, а свободными x_{1},",10,455);
       g.setColor(Color.red); Stringer.drawString("являются x_{4}, y_{1}, а свободными x_{1}",10,455);
       g.setColor(new Color(0, 0, 80)); Stringer.drawString("являются x_{4}, y_{1}, а",10,455);
       g.setColor(Color.red); Stringer.drawString("являются x_{4}, y_{1}",10,455);
       g.setColor(new Color(0, 0, 80)); Stringer.drawString("являются x_{4},",10,455);
       g.setColor(Color.red); Stringer.drawString("являются x_{4}",10,455);
    }
    if(sh==5){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("1.2.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Заполняем                    согласно алгоритму симплекс-метода.",40, 435);
       g.setColor(Color.red); g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("Таблицу 1",124, 435);
    }
    if(sh==6){
       ModifyArrayS(a+ay,c,tbn,tbd,bp,s);
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("1.3.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Вычисляем относительные оценки      ,    = 1, ..., 5 :",40, 435);
       Stringer.drawString(s[0]+";                "+s[1]+";",66, 455);
       Stringer.drawString(s[2]+";                      "+s[3]+";",66, 475);
       Stringer.drawString(s[4]+".",217, 495);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("j",328, 435);
       g.setColor(Color.red); Ind_nk(g,"\u2206","  j",300,435);
       Ind_n(g,"\u2206","  1",47,455); Ind_n(g,"\u2206","  2",312,455);
       Ind_n(g,"\u2206","  3",47,475); Ind_n(g,"\u2206","  4",312,475);
       Ind_n(g,"\u2206","  5",198,495);
    }
    if(sh==7){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("1.4.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Проанализируем относительные оценки. Оценка \u2206_{2} = -1+2М > 0, т.к. М > 0,",40,435);
       Stringer.drawString("следовательно, текущее базисное решение (0;0;0;14;4) не оптимально. Ана-",12,455);
       Stringer.drawString("лизируем коэффициенты столбца при переменной x_{2}. Т.к. оба коэффициента",12,475);
       Stringer.drawString("положительны, то r = 2 и переменная x_{2} должна быть введена в базис.",12,495);
       g.setColor(Color.red);
       Stringer.drawString("Проанализируем относительные оценки. Оценка \u2206_{2}",40,435);
       Stringer.drawString("положительны, то r = 2 и переменная x_{2}",12,495);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Проанализируем относительные оценки. Оценка",40,435);
       Stringer.drawString("положительны, то r = 2 и переменная",12,495);
    }
    if(sh==8){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("1.5.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Определяем переменную, выводимую из базиса. Для этого вычисляем",40,435);
       Stringer.drawString("отношения           . Выбираем наименьшее значение (2 < 7). Следовательно",12,455);
       Stringer.drawString("из числа базисных должна удалена переменная y_{1} и заменена переменной",12,475);
       Stringer.drawString("x_{2}.",12,495);
       g.setColor(Color.red);
       g.setFont(new java.awt.Font("SansSerif", 1, 13));
       g.drawString("БР/",95, 455); Ind_nk(g,"a","ir",118,455);
       Stringer.drawString("из числа базисных должна удалена переменная y_{1}",12,475);
       Stringer.drawString("x_{2}",12,495);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("из числа базисных должна удалена переменная",12,475);
    }
    if(sh==9){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("1.6.1.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Вычисляем новое базисное решение, занося результаты пересчета в ",54, 435);
       Stringer.drawString(". В                    в столбец       введена переменная     вместо",83, 455);
       Stringer.drawString("y_{1}.",508,455);
       g.setFont(new java.awt.Font("SansSerif", 1, 13));
       g.drawString("БП",258, 455);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("Таблице 2",104, 455);
       g.setColor(Color.red);
       g.drawString("Таблицу 2",12, 455);
       Stringer.drawString("x_{2}",436,455);
       Stringer.drawString("y_{1}",508,455);
    }
    if(sh==10){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("1.6.2.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Первой пересчитывается строка, соотвествующая введенной перемен-",51, 435);
       Stringer.drawString("ной     . Она получается в результате деления каждого элемента выделенной",12, 455);
       Stringer.drawString("строки                    на разрешающий элемент, равный 2.",12, 475);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("Таблицы 1",62, 475);
       g.setColor(Color.red); Ind_n(g,"x","2",42,455);
       Stringer.drawString("строки                    на разрешающий элемент, равный 2",12, 475);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("строки                    на разрешающий элемент, равный",12, 475);
     }
     if(sh==11){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("1.6.3.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Остальные элементы пересчитывают по 'правилу прямоугольника'.",54, 435);
       Stringer.drawString("Для второй сторки имеем: 14 -        = 10,    3 -         = 4,    2 -        = 0,    0 -         = 1,",10, 455);
       Stringer.drawString("4*2",235, 450); Stringer.drawString("-1*2",331, 450); Stringer.drawString("2*2",427, 450);
       Stringer.drawString("-1*2",513, 450); Stringer.drawString("0*2",35, 470); Stringer.drawString("1*2",131, 470);
       Stringer.drawString("2",241, 464); Stringer.drawString("2",341, 464); Stringer.drawString("2",432, 464);
       Stringer.drawString("2",523, 464); Stringer.drawString("2",41, 484); Stringer.drawString("2",137, 484);
       Stringer.drawString("1 -        = 1,      0 -        = -1.",12, 475);
       g.drawLine(235,452,255,452); g.drawLine(235,451,255,451);
       g.drawLine(332,452,356,452); g.drawLine(332,451,356,451);
       g.drawLine(426,452,447,452); g.drawLine(426,451,447,451);
       g.drawLine(515,452,539,452); g.drawLine(515,451,539,451);
       g.drawLine(34,472,55,472); g.drawLine(34,471,55,471);
       g.drawLine(131,472,152,472); g.drawLine(131,471,152,471);
       g.setColor(Color.red); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       Stringer.drawString("",341, 475); Ind_n(g,"","",12,455);
     }
     if(sh==12){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.3.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Вычисляем оценки     ,    = 1,...,5. Строка      пересчитывается по",40, 435);
       Stringer.drawString("также по 'правилу прямоугольнка':        = -M+1-                  =   ,         = 0,",12, 460);
       Stringer.drawString("      = -M -                  =-    ,           = 0 -                 = 0,           = 0 -                =            .",21, 490);
       Stringer.drawString("-1*(2M-1)    1",347, 454); Stringer.drawString("2           2",372, 469);
       Stringer.drawString("-1*(2M-1)      1",88, 484);Stringer.drawString("2             2",113, 498);
       Stringer.drawString("0*(2M-1)",269, 484);Stringer.drawString("2",296, 498);
       Stringer.drawString("1*(2M-1)    -2M+1",431, 484);Stringer.drawString("2             2",460, 498);
       Ind_nk(g,"\u2206","  j",183,435);
       g.drawLine(346,455,407,455); g.drawLine(346,456,407,456); g.drawLine(423,455,432,455); g.drawLine(423,456,432,456);
       g.drawLine(90,485,149,485); g.drawLine(90,486,149,486); g.drawLine(172,485,181,485); g.drawLine(172,486,181,486);
       g.drawLine(267,485,324,485); g.drawLine(267,486,324,486);
       g.drawLine(432,485,486,485); g.drawLine(432,486,486,486); g.drawLine(502,485,544,485); g.drawLine(502,486,544,486);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("Таблице 1",497, 435); g.drawString("j",209, 435);
       g.setColor(Color.red); Ind_nk(g,"\u2206","  j",330,435);
       Ind_n(g,"\u2206","  1",271,460); Ind_n(g,"\u2206","  2",454,460); Ind_n(g,"\u2206","  3",26,490);
       Ind_n(g,"\u2206","  4",213,490); Ind_n(g,"\u2206","  5",377,490);
     }
     if(sh==13){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.4.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Проанализируем относительные оценки, и текущее базисное решение",40,435);
       Stringer.drawString("(0;2;0;10;0). Оценка \u2206_{1} = -1/2 > 0, поэтому, Анализируем коэффициенты столб-",12,455);
       Stringer.drawString("ца при переменной x_{1}. Т.к. это столбец содержит один положительный коэф-",12,475);
       Stringer.drawString("фициент, то r = 1 и переменная x_{1} должна быть введена в число базисных.",12,495);
       g.setColor(Color.red);
       Stringer.drawString("(0;2;0;10;0). Оценка \u2206_{1}",12,455);
       Stringer.drawString("фициент, то r = 1 и переменная x_{1}",12,495);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("(0;2;0;10;0). Оценка",12,455);
       Stringer.drawString("фициент, то r = 1 и переменная",12,495);
     }
     if(sh==14){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.5.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Определяем переменную, выводимую из базиса. Для этого вычисляем",40,435);
       Stringer.drawString("наименьшее из неотрицательных отношений           . Оно равно 5/2. Следова-",12,455);
       Stringer.drawString("тельно из числа базисных должна удалена переменная x_{4} и заменена пере-",12,475);
       Stringer.drawString("менной x_{1}.",12,495);
       g.setColor(Color.red);
       g.setFont(new java.awt.Font("SansSerif", 1, 13));
       g.drawString("БР/",344, 455); Ind_nk(g,"a","ir",367,455);
       Stringer.drawString("тельно из числа базисных должна удалена переменная x_{4}",12,475);
       Stringer.drawString("менной x_{1}",12,495);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("тельно из числа базисных должна удалена переменная",12,475);
       Stringer.drawString("менной",12,495);
     }
     if(sh==15){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.6.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Вычисляем новое базисное решение, занося результаты пересчета в ",40, 435);
       Stringer.drawString(". В                    в столбец       введена переменная     вместо    .",83, 455);
       g.setFont(new java.awt.Font("SansSerif", 1, 13));
       g.drawString("БП",258, 455);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("Таблице 3",104, 455);
       g.setColor(Color.red);
       g.drawString("Таблицу 3",12, 455);
       Ind_n(g,"x","1",436,455); Ind_n(g,"x","4",508,455);
    }
    if(sh==16){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("3.3.1.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Вычисляем относительные оценки      ,    = 1, ..., 5, и определяем, явля-",54, 435);
       Stringer.drawString("ется ли решение (5/2;13/4;0;0;0) оптимальным.",12, 455);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("j",342, 435);
       g.setColor(Color.red);
       Ind_nk(g,"\u2206","  j",314,435);
       Stringer.drawString("ется ли решение (5/2;13/4;0;0;0)",12, 455);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("ется ли решение",12, 455);
    }
    if(sh==17){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("3.3.2.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Все оценки       не положительны, следовательно, решение x_{1} = 5/2,",54,435);
       Stringer.drawString("x_{2} = 13/4, x_{3} = x_{4} = x_{5} = 0 является оптимальным.",12,455);
       g.setColor(Color.red);
       Ind_n(g,"\u2206"," j",141,435);
       Stringer.drawString("Все оценки       не положительны, следовательно, решение x_{1} = 5/2",54,435);
       Stringer.drawString("x_{2} = 13/4, x_{3} = x_{4} = x_{5} = 0",12,455);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Все оценки       не положительны, следовательно, решение",54,435);
       Stringer.drawString("x_{2} = 13/4,",12,455);
       g.setColor(Color.red);
       Stringer.drawString("x_{2} = 13/4",12,455);
    }
    if(sh==18){
     g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
     g.drawString("4.",10, 435);
     g.setColor(new Color(0, 0, 80));
     Stringer.drawString("Решение исходной задачи x^{*} = ( 5/2; 13/4; 0; 0; 0 ).",26,435);
    }
    if(sh==19){
     g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
     g.drawString("5.",10, 435);
     g.setColor(new Color(0, 0, 80));
     Stringer.drawString("Графически решение исходной задачи соответствует точке x^{*} = ( 5/2; 13/4 ).",26,435);
     g.setColor(Color.red);
     Stringer.drawString("Графически решение исходной задачи соответствует точке x^{*} = ( 5/2; 13/4 )",26,435);
     g.setColor(new Color(0, 0, 80));
     Stringer.drawString("Графически решение исходной задачи соответствует точке",26,435);
    }
    if(sh==1) jButton3.setEnabled(false);
    else jButton3.setEnabled(true);
    if(sh==19) jButton1.setEnabled(false);
    else jButton1.setEnabled(true);
  }
 }

  void jButton1_actionPerformed(ActionEvent e) {
    sh++;
    if (sh>19) sh=19;
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
    aa=e.getY()-22;
    xx=e.getX()-5;
    yy=e.getY()-22;
//    jLabel2.setText("x="+Integer.toString(a)+"   y="+Integer.toString(aa)+"   sh="+Integer.toString(sh));
    jPanel1.repaint();
  }

}
