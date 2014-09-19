package primgomory;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class AppPrimGomory extends JApplet {
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
    this.setSize(new Dimension(567, 540));
    this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseMoved(MouseEvent e) {
        this_mouseMoved(e);
      }
    });
    this.getContentPane().setLayout(null);
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel1.setForeground(new Color(130, 0, 80));
    jLabel1.setText("Пример");
    jLabel1.setBounds(new Rectangle(249, 0, 62, 17));
    jPanel1.setBounds(new Rectangle(5,18,561,486));
    jPanel1.setBackground(new Color(247, 247, 255));
    jButton1.setBackground(new Color(220, 230, 255));
    jButton1.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton1.setForeground(new Color(0, 0, 60));
    jButton1.setText("==>");
    jButton1.setBounds(new Rectangle(353, 510, 100, 23));
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton1_actionPerformed(e);
      }
    });
    jButton2.setBackground(new Color(220, 230, 255));
    jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton2.setForeground(new Color(0, 0, 60));
    jButton2.setText("Обновить");
    jButton2.setBounds(new Rectangle(233, 510, 100, 23));
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton2_actionPerformed(e);
      }
    });
    jButton3.setBackground(new Color(220, 230, 255));
    jButton3.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton3.setForeground(new Color(0, 0, 60));
    jButton3.setText("<==");
    jButton3.setBounds(new Rectangle(113, 510, 110, 23));
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton3_actionPerformed(e);
      }
    });
   /* jLabel2.setText("");
    jLabel2.setBounds(new Rectangle(5, 3, 189, 17));
    this.getContentPane().add(jLabel2, null);*/
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
    g.drawString("Таблица "+t+":",15+b,163+d);
    g.setColor(new Color(255, 255, 255)); g.fillRect(b+7,167+d,542-2*b,2+17*(3+c));
    g.setColor(Color.black);
    for(int i=0; i<=a+1; i++)
      g.drawLine(b+128+i*60,168+d,b+128+i*60,270-d);
    for(int i=0; i<=3; i++)
      if(i==0) g.drawLine(b+8+i*40,168+d,b+8+i*40,270-d);
      else g.drawLine(b+8+i*40,168+d,b+8+i*40,253-d);
    for(int i=0; i<=3+c; i++)
      if(i==1) g.drawLine(b+128,d+168+i*17,548-b,d+168+i*17);
      else g.drawLine(b+8,d+168+i*17,548-b,d+168+i*17);
    g.setColor(new Color(157, 187, 255)); g.drawRect(b+7,167+d,542-2*b,2+17*(3+c));
    g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 13));
    if (f==true){
      g.drawString("БП",b+59,190+d); g.drawString("БР",b+99,190+d);
      g.drawString("БР/",b+139+60*a,199+d); Ind_nk(g,"a","ir",b+162+60*a,199+d);
      Ind_nk(g,"c","i",b+23,190+d); Ind_nk(g,"c","j",b+153+a*60,179+d);
      for(int i=1; i<=a; i++)
        Ind_n(g,"x",""+i,b+153+(i-1)*60,196+d);
      for(int i=0; i<c; i++)
        if(bp[i]>0) Ind_n(g,"x",""+bp[i],b+62,213+d+i*17);
      Ind_nbk(g,"\u2206","  j",b+153+a*60,215+c*17+d);
    }
  }
  public void Tabl2(Graphics g, int a, int c, int t, int h, boolean f, int bp[]){ //Рисует нижнюю таблицу
    int b=(540-120-(a+1)*60)/2, d=(int)Math.round(17*(3-c)/2);
    if(h==0) g.setColor(Color.red); else g.setColor(new Color(180, 0, 80));
    g.setFont(new java.awt.Font("SansSerif", 3, 13));
    g.drawString("Таблица "+t+":",b+15,286+d);
    g.setColor(new Color(255, 255, 255)); g.fillRect(b+7,291+d,542-2*b,2+17*(3+c));
    g.setColor(Color.black);
    for(int i=0; i<=a+1; i++)
      g.drawLine(b+128+i*60,292+d,b+128+i*60,394-d);
    for(int i=0; i<=3; i++)
      if(i==0) g.drawLine(b+8+i*40,292+d,b+8+i*40,394-d);
      else g.drawLine(b+8+i*40,292+d,b+8+i*40,377-d);
    for(int i=0; i<=3+c; i++)
      if(i==1) g.drawLine(b+128,d+292+i*17,548-b,d+292+i*17);
      else g.drawLine(b+8,d+292+i*17,548-b,d+292+i*17);
    g.setColor(new Color(157, 187, 255)); g.drawRect(b+7,291+d,542-2*b,2+17*(3+c));
    g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 13));
    if (f==true){
      g.drawString("БП",b+59,314+d); g.drawString("БР",b+99,314+d);
      g.drawString("БР/",b+139+60*a,323+d); Ind_nk(g,"a","ir",b+162+60*a,323+d);
      Ind_nk(g,"c","i",b+23,314+d); Ind_nk(g,"c","j",b+153+a*60,303+d);
      for(int i=1; i<=a; i++)
        Ind_n(g,"x",""+i,b+153+(i-1)*60,320+d);
      for(int i=0; i<c; i++)
        if(bp[i]>0) Ind_n(g,"x",""+bp[i],b+62,337+d+i*17);
      Ind_nbk(g,"\u2206","  j",b+153+a*60,339+c*17+d);
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
            if (tbn[i][j]==1000) g.drawString("M",ii+10,182+d);
            else if (tbn[i][j]==-1000) g.drawString("-M",ii+10,182+d);
                 else g.drawString(jj,ii,182+d);
          }
          else g.drawString(jj,ii,199+i*17+d);
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
        g.drawString(jj,ii,216+c*17+d);
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
    int b=(540-120-(a+1)*60)/2, d=(int)Math.round(17*(3-c)/2), l=0;
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
            if (tbn[4][j]-k*1000>0){
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
        g.drawString(jj,ii,340+c*17+d);
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
  public void ModifyArrayS(int a, int c, int tbn[][], int tbd[][], int bp[], String s[]){
    int k;
    for(int i=0; i<a; i++)
      if(tbn[0][i+1]<20000){
        s[i]="= ";
        if((Math.round(tbn[0][i+1]/1000.0)<1) && (Math.round(tbn[0][i+1]/1000.0)>-1))
          s[i]=s[i]+tbn[0][i+1]+"-[";
        else{
          if(tbn[0][i+1]==1000) s[i]=s[i]+"M"+"-[";
          if(tbn[0][i+1]==-1000) s[i]=s[i]+"-M"+"-[";
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
        s[i]=s[i]+"] = ";
        if(tbn[4][i+1]<20000){
          k=(int)Math.round(tbn[4][i+1]/1000.0);
          if(tbd[4][i+1]==1){
            if((k>=1)||(k<=-1)){
              if(tbn[4][i+1]-k*1000>0){
                if(k==1) s[i]=s[i]+"M+"+(tbn[4][i+1]-k*1000);
                else if(k==-1) s[i]=s[i]+"-M+"+(tbn[4][i+1]-k*1000);
                     else s[i]=s[i]+k+"M+"+(tbn[4][i+1]-k*1000);
              }
              else if(tbn[4][i+1]-k*1000<0){
                     if(k==1) s[i]=s[i]+"M-"+(k*1000-tbn[4][i+1]);
                     else if(k==-1) s[i]=s[i]+"-M-"+(k*1000-tbn[4][i+1]);
                          else s[i]=s[i]+k+"M-"+(k*1000-tbn[4][i+1]);
                   }
                   else{
                     if(k==1) s[i]=s[i]+"M";
                     else if(k==-1) s[i]=s[i]+"-M";
                          else s[i]=s[i]+k+"M";
                   }
            }
            else s[i]=s[i]+""+tbn[4][i+1];
          }
          else{
            if((k>=1)||(k<=-1)){
              if (tbn[4][i+1]-k*1000>0){
                if(k==1) s[i]=s[i]+"("+"M+"+(tbn[4][i+1]-k*1000)+")/"+tbd[4][i+1];
                else if(k==-1) s[i]=s[i]+"("+"-M+"+(tbn[4][i+1]-k*1000)+")/"+tbd[4][i+1];
                     else s[i]=s[i]+"("+k+"M+"+(tbn[4][i+1]-k*1000)+")/"+tbd[4][i+1];
              }
              else if (tbn[4][i+1]-k*1000<0){
                     if(k==1) s[i]=s[i]+"("+"M-"+(k*1000-tbn[4][i+1])+")/"+tbd[4][i+1];
                     else if(k==-1) s[i]=s[i]+"("+"-M-"+(k*1000-tbn[4][i+1])+")/"+tbd[4][i+1];
                          else s[i]=s[i]+"("+k+"M-"+(k*1000-tbn[4][i+1])+")/"+tbd[4][i+1];
                   }
                   else{
                     if(k==1) s[i]=s[i]+"M/"+tbd[4][i+1];
                     else if(k==-1) s[i]=s[i]+"-M/"+tbd[4][i+1];
                          else s[i]=s[i]+"M/"+tbd[4][i+1];
                   }
            }
            else s[i]=s[i]+tbn[4][i+1]+"/"+tbd[4][i+1];
          }
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
  public void ModifyArray2(int a, int c, int tbn[][], int tbd[][], int p, int n){  //Пересчет таблицы
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
       for(int i=1; i<=a; i++)
         if((tbn[4][i]>0) && (max<(double)tbn[4][i]/tbd[4][i])){
           max=tbn[4][i]/tbd[4][i];
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

  class  Panel_mypaint extends JPanel {
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Stringer.setGraphics(g);
      Stringer1.setGraphics(g);
      String s1,s2,s3,s4,s[]={"","","","","","",""}, sm[]={""}, ss="", jj="";
      int n=0, p=0, z=0, l=0, a=5, c=2, b=(540-120-(a+1)*60)/2, d=(int)Math.round(17*(3-c)/2), nm[]={0},
          bp[]={5,4,0},
          tbn[][]={ {20000,1,-1,0,0,-1000,20000,20000,20000},
                  {4,-1,2,-1,0,1,20000,20000,20000},
                  {14,3,2,0,1,0,20000,20000,20000},
                  {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                  {20000,20000,20000,20000,20000,20000,20000,20000,20000} },
          tbd[][]={ {1,1,1,1,1,1,1,1,1},
                    {1,1,1,1,1,1,1,1,1},
                    {1,1,1,1,1,1,1,1,1},
                    {1,1,1,1,1,1,1,1,1},
                    {1,1,1,1,1,1,1,1,1} };
      g.setColor(new Color(180, 0, 80));
      g.setFont(new java.awt.Font("SansSerif", 3, 13));
      g.drawString("Задача:  ",3,15);
      g.drawString("Решение:",15,410);
      g.drawString("Обозначения:",415,57);
      g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
      Stringer.drawString("Найти целочисленное решение f(x) = x_{1}- x_{2} \u2192 max  при ограничениях",58,15);
      Stringer.drawString("-x_{1} + 2 x_{2} \u2265 4,  3 x_{1} + 2 x_{2} \u2264 14,  x_{1}, x_{2} \u2265 0, где x_{1}, x_{2} - целые, методом Гомори",12,35);
      g.setColor(new Color(255, 255, 255));
      g.fillRect(7,62,180,85); g.fillRect(207,62,180,85); g.fillRect(407,62,142,85); g.fillRect(7,415,542,70);
      g.setColor(new Color(157, 187, 255));
      g.drawRect(7,62,180,85); g.drawRect(207,62,180,85); g.drawRect(407,62,142,85); g.drawRect(7,415,542,70);
      g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 13));
      g.drawString("БП",417,82); g.drawString("БР",416,119);
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.drawString("- базисные",437,83); g.drawString("переменные",447,99);
      g.drawString("- базисное",437,119); g.drawString("решение",447,135);
      if(sh>=1){
        g.setColor(Color.red);
        if(sh==1) g.drawRect(7,62,180,85);
        if(sh==2) g.drawRect(207,62,180,85);
        s1="f(x) = x_{1}- x_{2} \u2192 max"; s2="-x_{1}+ 2 x_{2} \u2265 4,";
        s3="3 x_{1}+ 2 x_{2} \u2264 14,"; s4=" x_{1}, x_{2} \u2265 0.";
        g.setColor(new Color(180, 0, 80));
        g.setFont(new java.awt.Font("SansSerif", 3, 13));
        g.drawString("Задача:",13,57); g.drawString("Расширенная форма:",213,57);
        if(sh==1) g.setColor(Color.red); g.drawString("Задача:",13,57); g.setColor(new Color(180, 0, 80));
        if(sh==2) g.setColor(Color.red); g.drawString("Расширенная форма:",213,57);
        g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
        if(sh>=2){
          Stringer.drawString("f(x) = x_{1}- x_{2} - М x_{5} \u2192 max",212,77);
          Stringer.drawString("-x_{1}+ 2 x_{2}- x_{3}+ x_{5} = 4,",232,99);
          Stringer.drawString("3 x_{1}+ 2 x_{2}+ x_{4} = 14,",238,119);
          Stringer.drawString("x_{1},...,x_{5} \u2265 0.",259,139);
        }
        Stringer.drawString(s1,(int)(7+(180-s1.length()*5)/2),77); //Ind_n(g,"x","1",85,77); Ind_n(g,"x","2",109,77);
        Stringer.drawString(s2,(int)(7+(180-s2.length()*4)/2),99); //Ind_n(g,"x","1",77,99); Ind_n(g,"x","2",114,99);
        Stringer.drawString(s3,(int)(7+(180-s3.length()*4)/2),119); //Ind_n(g,"x","1",76,119); Ind_n(g,"x","2",114,119);
        Stringer.drawString(s4,(int)(7+(180-s4.length()*4)/2),139);
      }
      if(sh==3){
        Tabl1(g,a,c,1,0,true,bp);
        Tb1(g,a,c,tbn,tbd,bp);
      }
      if((sh>=4) && (sh<=6)){
        Tabl1(g,a,c,1,1,true,bp);
        if(sh==4){
          g.setColor(new Color(230, 230, 255));
          g.fillRect(129+b,203+d+17*c,60*(a+1)-1,16);
          g.setColor(Color.black);
          for(int i=0; i<a; i++)
            g.drawLine(188+b+i*60,203+d+17*c,188+b+i*60,219+d+17*c);
          g.setColor(Color.red);
          Ind_nbk(g,"\u2206","  j",b+153+a*60,215+c*17+d);
        }
        ModifyArray(a,c,tbn,tbd,bp);
        Tb1(g,a,c,tbn,tbd,bp);
      }
      if(((sh>=5) && (sh<=18)) || ((sh>=20) && (sh<=29))){
        ModifyArray(a,c,tbn,tbd,bp);
        Valuation(a,c,tbn,tbd,nm,sm);
        n=nm[0]; ss=sm[0];
        if(sh==5){
          g.setColor(new Color(230, 230, 255));
          g.fillRect(69+b+n*60,203+d+17*c,59,16);
          Tb1(g,a,c,tbn,tbd,bp);
        }
      }
      if(sh==6){
        for(int i=1; i<=c; i++)
          if(tbn[i][n]>0){
            g.setColor(new Color(230, 230, 255));
            g.fillRect(69+b+n*60,186+d+17*i,59,16);
            Tb1(g,a,c,tbn,tbd,bp);
          }
        g.setColor(Color.red);
        Ind_n(g,"x",""+n,b+153+(n-1)*60,196+d);
      }
      if(((sh>=7) && (sh<=18)) || ((sh>=20) && (sh<=29))){
        if(sh<=11) Tabl1(g,a,c,1,1,true,bp);
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
        if(sh==7){
          g.setColor(new Color(230, 230, 255));
          g.fillRect(129+a*60+b,186+d,59,16+c*17);
          g.setColor(Color.black);
          for(int i=1; i<=c; i++)
            g.drawLine(129+a*60+b,d+185+i*17,188+a*60+b,d+185+i*17);
        }
        if(sh<8){
          Tb1(g,a,c,tbn,tbd,bp);
          g.setColor(Color.red);
          Ind_n(g,"x",""+bp[p-1],b+62,213+d+(p-1)*17);
        }
        if(sh==7){
          g.setFont(new java.awt.Font("SansSerif", 1, 13));
          g.drawString("БР/",b+139+60*a,199+d); Ind_nk(g,"a","ir",b+162+60*a,199+d);
        }
        if(sh!=7) g.setColor(new Color(0, 0, 80));
        if((tbn[p][8]<20000) && (sh<=8)){
          if(tbd[p][8]==1) jj=""+tbn[p][8];
          else jj=""+tbn[p][8]+"/"+tbd[p][8];
          g.drawString(jj,(int)(b+128+60*a+(60-jj.length()*8)/2),216+d+(p-1)*17);
        }
      }
      if(((sh>=8) && (sh<=18)) || ((sh>=20) && (sh<=29))){
        for(int i=1; i<=c+1; i++){
          tbn[i][8]=20000; tbd[i][8]=1;
        }
        if(sh<19)Tb1(g,a,c,tbn,tbd,bp);
        z=bp[p-1];
        bp[p-1]=n;
        if(sh<=11){
          if(sh==8) Tabl2(g,a,c,2,0,true,bp);
          else Tabl2(g,a,c,2,1,true,bp);
          Tb2(g,a,c,tbn,tbd,bp);
        }
        if(sh<10){
          g.setColor(Color.red);
          Ind_n(g,"x",""+n,b+62,337+d+(p-1)*17);
        }
        if(sh<=11){
          g.setColor(new Color(255, 255, 255)); g.fillRect(b+89,327+d,39+60*a,(c+1)*17-1);
          g.setColor(Color.black);
          for(int i=0; i<a; i++)
            g.drawLine(b+128+i*60,327+d,b+128+i*60,326+d+(c+1)*17);
          for(int i=1; i<=c; i++)
            g.drawLine(b+89,326+d+i*17,b+128+60*a,326+d+i*17);
        }
      }
      if((sh>=9) && (sh<=11)){
        if(sh<10){
          bp[p-1]=z;
          g.setColor(new Color(230, 230, 255));
          g.fillRect(89+b,186+d+17*p,40+60*a-1,16);
          g.setColor(Color.black);
          for(int i=0; i<=a; i++)
            g.drawLine(b+128+i*60,186+d+17*p,b+128+i*60,202+d+17*p);
          for(int i=1; i<3; i++)
            g.drawLine(b+8+i*40,186+d+17*p,b+8+i*40,202+d+17*p);
          Tb1(g,a,c,tbn,tbd,bp);
          g.setColor(Color.red);
          if(tbd[p][n]==1) jj=""+tbn[p][n];
          else jj=tbn[p][n]+"/"+tbd[p][n];
          g.drawString(jj,68+60*n+(60-jj.length()*8)/2+b,p*17+199+d);
          bp[p-1]=n;
        }
        if(sh==10){
          g.setColor(new Color(230, 230, 255));
          g.fillRect(b+89,327+d,39+60*a,(p-1)*17-1);
          g.fillRect(b+89,327+d+17*p,39+60*a,(c-p)*17-1);
        }
        if(sh==11){
          g.setColor(Color.red);
          Ind_nbk(g,"\u2206","  j",b+153+a*60,339+c*17+d);
          g.setColor(new Color(230, 230, 255));
          g.fillRect(b+129,327+d+c*17,60*a-1,16);
        }
        if((sh==10) || (sh==11)){
          g.setColor(Color.red);
          if(tbd[p][n]==1) jj=""+tbn[p][n];
          else jj=tbn[p][n]+"/"+tbd[p][n];
          g.drawString(jj,68+60*n+(60-jj.length()*8)/2+b,p*17+199+d);
          g.setColor(new Color(230, 230, 255));
          g.fillRect(b+89,327+d+17*p,39+60*a,(c-p)*17-1);
          g.setColor(Color.black);
          for(int i=0; i<a; i++)
            g.drawLine(b+128+i*60,327+d,b+128+i*60,326+d+(c+1)*17);
          for(int i=1; i<=c; i++)
            g.drawLine(b+89,326+d+i*17,b+128+60*a,326+d+i*17);
        }
        ModifyArray1(a,c,tbn,tbd,p,n);
        Tb2(g,a,c,tbn,tbd,bp);
        if(sh<=9){
          g.setColor(new Color(255, 255, 255));
          if(sh<10){
            g.fillRect(b+89,327+d,39+60*a,(p-1)*17-1);
            g.fillRect(b+89,327+d+p*17,39+60*a,(c-p+1)*17-1);
          }
          else g.fillRect(b+89,327+d+c*17,39+60*a,16);
          g.setColor(Color.black);
          for(int i=0; i<a; i++)
            g.drawLine(b+128+i*60,327+d,b+128+i*60,326+d+(c+1)*17);
          for(int i=1; i<=c; i++)
            g.drawLine(b+89,326+d+i*17,b+128+60*a,326+d+i*17);
        }
      }
      if(((sh>=12) && (sh<=18)) || ((sh>=20) && (sh<=29))){
        ModifyArray1(a,c,tbn,tbd,p,n);
        if(sh<19) Tabl1(g,a,c,2,0,true,bp);
        Valuation(a,c,tbn,tbd,nm,sm);
        n=nm[0]; ss=sm[0];
        if((sh==12) && (sh<=19)){
          g.setColor(new Color(230, 230, 255));
          g.fillRect(69+b+n*60,203+d+17*c,59,16);
          Tb1(g,a,c,tbn,tbd,bp);
        }
      }
      if(sh==13){
        Tabl1(g,a,c,2,1,true,bp);
        for(int i=1; i<=c; i++)
          if(tbn[i][n]>0){
            g.setColor(new Color(230, 230, 255));
            g.fillRect(69+b+n*60,186+d+17*i,59,16);
            Tb1(g,a,c,tbn,tbd,bp);
          }
        g.setColor(Color.red);
        Ind_n(g,"x",""+n,b+153+(n-1)*60,196+d);
      }
      if(((sh>=14) && (sh<=18)) || ((sh>=20) && (sh<=29))){
        if(sh<=18) Tabl1(g,a,c,2,1,true,bp);
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
        if(sh==14){
          g.setColor(new Color(230, 230, 255));
          g.fillRect(129+a*60+b,186+d,59,16+c*17);
          g.setColor(Color.black);
          for(int i=1; i<=c; i++)
            g.drawLine(129+a*60+b,d+185+i*17,188+a*60+b,d+185+i*17);
        }
        if(sh<16) Tb1(g,a,c,tbn,tbd,bp);
        if(sh==14){
          g.setColor(Color.red);
          Ind_n(g,"x",""+bp[p-1],b+62,213+d+(p-1)*17);
          g.setFont(new java.awt.Font("SansSerif", 1, 13));
          g.drawString("БР/",b+139+60*a,199+d); Ind_nk(g,"a","ir",b+162+60*a,199+d);
        }
      }
      if(((sh>=15) && (sh<=18)) || ((sh>=20) && (sh<=29))){
        for(int i=1; i<=c+1; i++){
          tbn[i][8]=20000; tbd[i][8]=1;
        }
        if(sh<19) Tb1(g,a,c,tbn,tbd,bp);
        z=bp[p-1];
        bp[p-1]=n;
        if(sh<=18){
          if(sh==15) Tabl2(g,a,c,3,0,true,bp);
          else Tabl2(g,a,c,3,1,true,bp);
        }
      }
      if((sh>=15) && (sh<=18)){
        ModifyArray1(a,c,tbn,tbd,p,n);
        Tb2(g,a,c,tbn,tbd,bp);
        if(sh==15){
          g.setColor(new Color(255, 255, 255));
          g.fillRect(b+89,327+d+17*c,39+60*a+5,16);
         g.setColor(Color.black);
          for(int i=0; i<=a; i++)
            g.drawLine(b+128+i*60,327+d,b+128+i*60,326+d+(c+1)*17);
        }
      }
      if(sh==16){
        g.setColor(Color.red);
        Ind_nbk(g,"\u2206","  j",b+153+a*60,339+c*17+d);
      }
      if(sh==17){
        g.setColor(Color.red);
        Ind_nbk(g,"\u2206","  j",b+153+a*60,339+c*17+d);
        g.setColor(new Color(230, 230, 255));
        g.fillRect(b+129,327+d+c*17,60*a-1,16);
        g.setColor(Color.black);
        for(int i=0; i<a; i++)
          g.drawLine(b+128+i*60,327+d,b+128+i*60,326+d+(c+1)*17);
        Tb2(g,a,c,tbn,tbd,bp);
      }
      if((sh>=20) && (sh<=29)){
        ModifyArray1(a,c,tbn,tbd,p,n);
        if((sh>=20) && (sh<=26)){
          Tabl1(g,a,c,3,1,true,bp);
          Tb1(g,a,c,tbn,tbd,bp);
        }
        if(sh==20){
          g.setColor(Color.red);
          Ind_n(g,"x",""+bp[1],b+62,213+d+17);
        }
        if((sh>=21) && (sh<=25)){
          g.setColor(new Color(180, 0, 80));
          g.setFont(new java.awt.Font("SansSerif", 3, 13));
          g.drawString("Формула:",b+15,286+d);
          g.setColor(new Color(255, 255, 255)); g.fillRect(b+7,291+d,542-2*b,2+17*(3+c));
          g.setColor(new Color(157, 187, 255)); g.drawRect(b+7,291+d,542-2*b,2+17*(3+c));
          g.setColor(new Color(0, 0, 80));
          if(sh==21){
            g.setColor(new Color(230, 230, 255));
            g.fillRect(89+b,186+d+17*2,40+60*a-1,16);
            g.setColor(Color.black);
            for(int i=0; i<=a; i++)
              g.drawLine(b+128+i*60,186+d+17*2,b+128+i*60,202+d+17*2);
            g.setColor(Color.red);
            Ind_n(g,"x",""+bp[1],b+62,213+d+17);
            Tb1(g,a,c,tbn,tbd,bp);
            g.setColor(new Color(0, 0, 80));
            Stringer1.drawString("x_{i} = x&{i}{*} - \u2211 a_{ik} x_{k}, где",210,307+d);
            Ind_nkr1(g,"k\u2208 I","НБ",257,321+d);
            Ind_nkr2(g,"I","НБ",b+10,356+d);
            Stringer1.drawString("x&{i}{*} - оптимальное нецелочисленное значение x_{i},",b+10,339+d);
            Stringer1.drawString("- множество индексов небазисных переменных в оптимальном",b+28,356+d);
            Stringer1.drawString("нецелочисленном решении.",b+37,373+d);
          }
          if(sh==22){
            Stringer1.drawString("\u2211 a_{ik} x_{k} \u2261 x&{i}{*}",234,311+d);
            Ind_nkr1(g,"k\u2208 I","НБ",226,325+d);
            Ind_nkr1(g,"c","",291,299+d); Ind_nkr1(g,"c","",444,331+d);
            g.setFont(new java.awt.Font("SansSerif", 2, 15));
            g.drawString("a    b                        сравнимыми по модулю 1  a \u2261 b",b+88,343+d);
            g.drawString("a - b -                                     дробной частью вещественного числа a",b+11,358+d);
            g.drawString("a",b+470,373+d);
            Stringer.drawString("Два числа    и    называются                                              (        ), если",b+11,343+d);
            Stringer.drawString("целое число. Тогда",b+53,358+d);
            Stringer.drawString("называется наименьшее неотрицательное число, сравнимое с   .",b+11,373+d);
          }
          if(sh==23){
            Stringer1.drawString("Для дробных частей всех коэффициентов a_{ik} и x&{i}{*}:",b+12,308+d);
            Stringer1.drawString("\u2211 (a_{ik}) x_{k} \u2261 (x&{i}{* }),   0 \u2264 (a_{ik}) \u2264 1,   0 \u2264 (x&{i}{* }) \u2264 1",141,341+d);
            Ind_nkr1(g,"k\u2208 I","НБ",133,355+d);
            Ind_nkr1(g,"c","",208,329+d);
          }
          if(sh==24){
            Stringer.drawString("Новое ограничение :",b+12,308+d);
            Stringer1.drawString("\u2211 (a_{ik}) x_{k} \u2265 (x&{i}{* })",222,333+d);
            Ind_nkr1(g,"k\u2208 I","НБ",214,347+d);
          }
          if(sh==25){
            Stringer.drawString("Новое ограничение в виде равенства:",b+12,308+d);
            Stringer1.drawString("\u2211 (a_{ik}) x_{k} - x_{\u03C5} = (x&{i}{* }),",209,333+d);
            Ind_nkr1(g,"k\u2208 I","НБ",201,347+d);
            Stringer1.drawString("где x_{\u03C5} - дополнительная переменная",b+12,371+d);
          }
        }
        if(sh>=26){
          a=6; c=3;
          tbn[3][0]=1; tbn[3][1]=0; tbn[3][2]=0; tbn[3][3]=1; tbn[3][4]=1; tbn[3][5]=3; tbn[3][6]=-1;
          tbd[3][0]=2; tbd[3][1]=1; tbd[3][2]=1; tbd[3][3]=4; tbd[3][4]=4; tbd[3][5]=4; tbd[3][6]=1;
          tbn[0][6]=0; tbn[1][6]=0; tbn[2][6]=0; tbd[1][6]=1; tbd[2][6]=1;
          b=(540-120-(a+1)*60)/2; d=(int)Math.round(17*(3-c)/2);
          if(sh==25){
            Tabl2(g,a,c,4,0,true,bp);
            g.setColor(new Color(230, 230, 255));
            g.fillRect(b+89,327+d+17*p,39+60*a,16);
            g.setColor(Color.black);
            for(int i=0; i<a; i++)
              g.drawLine(b+128+i*60,327+d+17*p,b+128+i*60,326+d+(c+1)*17);
            for(int i=1; i<=c; i++)
              g.drawLine(b+89,326+d+i*17,b+128+60*a,326+d+i*17);
            Tb2(g,a,c,tbn,tbd,bp);
          }
        }
        if(sh==27){
          Tabl1(g,a,c,4,1,true,bp);
          g.setColor(new Color(230, 230, 255));
          g.fillRect(b+309,186+d+17*c,59,33);
          g.setColor(Color.black);
          g.drawLine(b+309,202+d+17*c,b+369,202+d+17*c);
          Tb1(g,a,c,tbn,tbd,bp);
          g.setColor(Color.red);
          Stringer.drawString("?",b+64,216+d+2*17);
          Ind_n(g,"x","4",b+153+3*60,196+d);
          g.setColor(new Color(0, 0, 80));
        }
        if(sh==28){
          Tabl1(g,a,c,4,1,true,bp);
          Tb1(g,a,c,tbn,tbd,bp);
          Stringer.drawString("?",b+64,216+d+2*17);
          bp[2]=4; p=3; n=4; tbn[4][6]=0;
          g.setColor(Color.red);
          if(tbd[p][n]==1) jj=""+tbn[p][n];
          else jj=tbn[p][n]+"/"+tbd[p][n];
          g.drawString(jj,68+60*n+(60-jj.length()*8)/2+b,p*17+199+d);
          ModifyArray1(a,c,tbn,tbd,p,n);
          Tabl2(g,a,c,5,0,true,bp);
          Tb2(g,a,c,tbn,tbd,bp);
        }
        if(sh==29){
          bp[2]=4; p=3; n=4; tbn[4][6]=0;
          ModifyArray1(a,c,tbn,tbd,p,n);
          Tabl1(g,a,c,5,1,true,bp);
          Tb1(g,a,c,tbn,tbd,bp);
        }
      }
     //График
      if((sh==19) || (sh==30)){
        g.setColor(new Color(180, 0, 80));
        g.setFont(new java.awt.Font("SansSerif", 3, 13));
        g.drawString("Графическая иллюстрация:",168,162);
        g.setColor(new Color(255, 255, 255));
        g.fillRect(160,167,246,228);
        g.setColor(new Color(157, 187, 255));
        g.drawRect(160,167,246,228);
        g.setColor(Color.black);
        g.drawLine(180,173,180,394);
        g.drawLine(161,365,401,365);
        Ind_n(g,"x","2",187,178); Ind_n(g,"x","1",391,377);
        int a11[]={175,180,185}, b11[]={174,167,174};
        int a12[]={400,405,400}, b12[]={360,365,370};
        g.fillPolygon(a11,b11,3);
        g.fillPolygon(a12,b12,3);
        int i;
        g.setColor(new Color(227, 227, 255));
        int a21[]={181,243,181}, b21[]={184,280,312};
        g.fillPolygon(a21,b21,3);
        g.setColor(new Color(0, 0, 80));
        if(sh==19){
          for (i=278; i<364; i=i+4) g.drawLine(244,i,244,i+2);
          for (i=182; i<243; i=i+5) g.drawLine(i,280,i+2,280);
        }
        else{
          for (i=289; i<364; i=i+4) g.drawLine(232,i,232,i+2);
          for (i=182; i<232; i=i+5) g.drawLine(i,287,i+2,287);
        }
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("C",252,289);
        g.setFont(new java.awt.Font("SansSerif", 1, 11));
        g.setColor(Color.darkGray);
        g.drawString("0",170,378);
        for(i=-2; i<7; i++){
          g.setColor(Color.black);
          g.drawLine(177,339-26*i,183,339-26*i);
          if(i>=0){
            g.drawLine(206+26*i,362,206+26*i,368);
            g.setColor(Color.darkGray);
            if((i!=4) && (i!=0)) g.drawString(""+(i+1),204+26*i,379);
            else g.drawString(""+(i+1),209+26*i,379);
          }
        }
        g.drawString(""+(-1),166,394);
        for(i=0; i<7; i++)
          if(i!=1) g.drawString(""+(i+1),170,343-26*i);
          else g.drawString(""+(i+1),170,340-26*i);
        g.setColor(new Color(0, 0, 80));
        g.drawLine(169,168,320,394); g.drawLine(170,168,321,394);
        g.drawLine(161,322,405,200); g.drawLine(161,323,405,201);
        g.drawLine(180,365,180+25,365+25); g.drawLine(180,366,180+25,366+25);
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("3    + 2     = 14",293,345);
        Ind_n(g,"x","1",303,345); Ind_n(g,"x","2",339,345);
        g.drawString("-    + 2     = 4",318,257);
        Ind_n(g,"x","1",326,257); Ind_n(g,"x","2",362,257);
        int a4[]={180+26,180+23,180+17}, b4[]={365+26,365+17,365+23};
        g.fillPolygon(a4,b4,3);
        for(i=180; i<200; i=i+7)
          g.drawLine(i+6,365+26,i+10,365+26);
        for(i=365; i<385; i=i+7)
          g.drawLine(206,i+6,206,i+10);
        g.drawString("\u25bcf",209,391);
        g.setColor(Color.red);
        if(sh==30){
          g.fillOval(799-2*285,285,6,6);
          Stringer.drawString("x^{*}",830-2*306,306);
          g.setColor(new Color(180, 0, 80));
        }
        g.fillOval(242,278,6,6);
   //     g.fillOval((int)((12826+151*259)/226),259,6,6);
      }
     //Коментарии
    if(sh==1){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("1.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Так как задача уже имеет ограничения с целочисленными",26, 435);
       Stringer.drawString("коэффициентами в левой и правой частях, то переходим к следующему",12, 455);
       Stringer.drawString("шагу",12, 475);
     }
     if(sh==2){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Будем решать задачу без учета тебования целочисленности",26, 435);
       Stringer.drawString("симплекс-методом: для этого запишем расширенную форму",12, 455);
       g.setColor(Color.red);
       Stringer.drawString("симплекс-методом: для этого запишем расширенную форму",12, 455);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("симплекс-методом: для этого запишем",12, 455);
     }
     if(sh==3){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.1.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Заполняем                    согласно алгоритму симплекс-метода.",40, 435);
       Stringer.drawString("Базиcными переменными являютя x_{"+bp[0]+"}, x_{"+bp[1]+"}, а свободными x_{1}, x_{2}, x_{3}. Тогда",12, 455);
       Stringer.drawString("начальное базисное решение будет x_{"+bp[0]+"} = 4, x_{"+bp[1]+"} = 14 и x_{1} = x_{2} = x_{3} = 0",12, 475);
       g.setColor(Color.red); g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("Таблицу 1",124, 435);
     }
     if(sh==4){
       ModifyArrayS(a,c,tbn,tbd,bp,s);
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.1.1.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Вычисляем относительные оценки      ,    = 1, ..., 5 :",54, 435);
       g.drawString(s[0]+";                 "+s[1]+";",81, 455);
       g.drawString(s[2]+";       "+s[3]+";       "+s[4]+";",34, 475);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("j",341, 435);
       g.setColor(Color.red); Ind_nbk(g,"\u2206","  j",314,435);
       Ind_nb(g,"\u2206","  1",62,455); Ind_nb(g,"\u2206","  2",309,455); Ind_nb(g,"\u2206","  3",14,475);
       Ind_nb(g,"\u2206","  4",206,475); Ind_nb(g,"\u2206","  5",374,475);
     }
     if(sh==5){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.1.2.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Проанализируем относительные оценки: оценка      = "+ss+">0, так как",54, 435);
       Stringer.drawString("М>0, следовательно, текущее базисное решение x_{"+bp[0]+"}= 4, x_{"+bp[1]+"}=14 и x_{1}=x_{2}=x_{3}= 0",12, 455);
       Stringer.drawString("не оптимально",12, 475);
       g.setColor(Color.red);
       Ind_nb(g,"\u2206","  "+n,410,435);
       Stringer.drawString("Проанализируем относительные оценки: оценка      = "+ss,54, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Проанализируем относительные оценки: оценка",54, 435);

     }
     if(sh==6){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.1.3.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Анализируем коэффициенты столбца при переменной x_{"+n+"}: так как",54, 435);
       Stringer.drawString("оба коэффициента положительны, то    = 2 и переменная x_{"+n+"} должна быть",12, 455);
       Stringer.drawString("введена в число базисных",12, 475);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("r",286, 455);
       g.setColor(Color.red);
       Stringer.drawString("оба коэффициента положительны, то    = 2 и переменная x_{"+n+"}",12, 455);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("оба коэффициента положительны, то    = 2 и переменная",12, 455);
     }
     if(sh==7){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.1.4.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Определяем переменную, выводимую из базиса: вычисляем",54, 435);
       Stringer.drawString("отношение БР/a_{ir}, выбираем наименьшее значение (2<7). Таким образом,",12, 455);
       Stringer.drawString("из базиса должна быть удалена переменная x_{"+bp[p-1]+"} и заменена переменной x_{2}",12, 475);
       g.setColor(Color.red);
       Stringer.drawString("отношение БР/a_{ir}, выбираем наименьшее значение (2",12, 455);
       Stringer.drawString("из базиса должна быть удалена переменная x_{"+bp[p-1]+"}",12, 475);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("отношение БР/a_{ir}, выбираем наименьшее значение (",12, 455);
       Stringer.drawString("из базиса должна быть удалена переменная",12, 475);
     }
     if(sh==8){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.2.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Вычисляем новое базисное решение, занося результаты пересчета",40, 435);
       Stringer.drawString("в                   . В                    в столбец БП введена переменная x_{2} вместо x_{5}",12, 455);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("Таблице 2",118, 455);
       g.setColor(Color.red);
       g.drawString("Таблицу 2",24, 455);
       Stringer.drawString("в                   . В                    в столбец БП введена переменная x_{2}",12, 455);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("в                   . В                    в столбец БП введена переменная",12, 455);
     }
     if(sh==9){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.2.1.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Первой пересчитывается строка, соотвествующая введенной",54, 435);
       Stringer.drawString("переменной x_{2}. Она получается в результате деления каждого элемента",12, 455);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("Таблицы 1",159, 475);
       g.setColor(Color.red);
       Stringer.drawString("выделенной строки                     на разрешающий элемент, равный 2",12, 475);
       Stringer.drawString("переменной x_{2}",12, 455);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("переменной",12, 455);
       Stringer.drawString("выделенной строки                     на разрешающий элемент, равный",12, 475);
     }
     if(sh==10){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.2.2.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Остальные элементы пересчитывают по 'правилу прямоугольника'.",54, 435);
       Stringer.drawString("Для второй сторки имеем: 14 -        = 10,  3 -         = 4,  2 -        = 0,  0 -         = 1,",12, 455);
       Stringer.drawString("4*2",237, 449); Stringer.drawString("-1*2",326, 449); Stringer.drawString("2*2",412, 449);
       Stringer.drawString("-1*2",491, 449); Stringer.drawString("0*2",35, 469); Stringer.drawString("1*2",121, 469);
       Stringer.drawString("2",243, 463); Stringer.drawString("2",336, 463); Stringer.drawString("2",418, 463); Stringer.drawString("2",501, 463);
       Stringer.drawString("2",41, 483); Stringer.drawString("2",127, 483);
       Stringer.drawString("1 -        = 1,   0 -        = -1",12, 475);
       g.drawLine(237,450,257,450); g.drawLine(237,451,257,451);
       g.drawLine(327,450,351,450); g.drawLine(327,451,351,451);
       g.drawLine(411,450,432,450); g.drawLine(411,451,432,451);
       g.drawLine(493,450,517,450); g.drawLine(493,451,517,451);
       g.drawLine(34,470,55,470); g.drawLine(34,471,55,471);
       g.drawLine(121,470,142,470); g.drawLine(121,471,142,471);
     }
     if(sh==11){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.2.3.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Вычисляем оценки     ,    = 1 ,..., 5. Строка      пересчитывается по",54, 435);
       Stringer.drawString("также по 'правилу прямоугольнка':      = -M+1-                  =   ,     = 0,",88, 455);
       Stringer.drawString("     = -M -                  =-    ,      = 0 -                 = 0,      = 0 -                = ",12, 475);
       Stringer.drawString("-1*(2M-1)    1",415, 449); g.drawString("2           2",440, 463);
       Stringer.drawString("-1*(2M-1)      1",74, 469);g.drawString("2             2",99, 483);
       Stringer.drawString("0*(2M-1)",236, 469);g.drawString("2",261, 483);
       Stringer.drawString("1*(2M-1)    -2M+1",378, 469);g.drawString("2             2",407, 483);
       Ind_nbk(g,"\u2206","  j",197,435);
       g.drawLine(414,450,475,450); g.drawLine(414,451,475,451); g.drawLine(491,450,500,450); g.drawLine(491,451,500,451);
       g.drawLine(76,470,135,470); g.drawLine(76,471,135,471); g.drawLine(158,470,167,470); g.drawLine(158,471,167,471);
       g.drawLine(234,470,291,470); g.drawLine(234,471,291,471);
       g.drawLine(379,470,433,470); g.drawLine(379,471,433,471); g.drawLine(449,470,491,470); g.drawLine(449,471,491,471);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("Таблице 1",12, 455); g.drawString("j",223, 435);
       g.setColor(Color.red); Ind_nbk(g,"\u2206","  j",351,435);
       Ind_nb(g,"\u2206","  1",339,455); Ind_nb(g,"\u2206","  2",508,455); Ind_nb(g,"\u2206","  3",12,475);
       Ind_nb(g,"\u2206","  4",180,475); Ind_nb(g,"\u2206","  5",325,475);
     }
     if(sh==12){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.2.4.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Проанализируем относительные оценки: оценка      = "+ss+" > 0 и,",54, 435);
       Stringer.drawString("следовательно, текущее базисное решение x_{"+bp[0]+"} = 2, x_{"+bp[1]+"} = 10 и x_{1} = x_{3} = x_{5} = 0",12, 455);
       Stringer.drawString("не оптимально",12, 475);
       g.setColor(Color.red);
       Ind_nb(g,"\u2206","  "+n,409,435);
       Stringer.drawString("Проанализируем относительные оценки: оценка      = "+ss,54, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Проанализируем относительные оценки: оценка",54, 435);
     }
     if(sh==13){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.2.5.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Анализируем коэффициенты столбца при переменной x_{"+n+"}: так как",54, 435);
       Stringer.drawString("столбец содержит один положительный коэффициент, то    = 1 и",12, 455);
       Stringer.drawString("переменная x_{"+n+"} должна быть введена в число базисных",12, 475);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("r",432, 455);
       g.setColor(Color.red);
       Stringer.drawString("переменная x_{"+n+"}",12, 475);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("переменная",12, 475);
     }
     if(sh==14){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.2.6.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Определяем переменную, выводимую из базиса: находим",54, 435);
       Stringer.drawString("наименьшее из неотрицательных отношений БР/a_{ir}. Оно равно 5/2. Тогда,",12, 455);
       Stringer.drawString("из базиса должна быть удалена переменная x_{"+bp[p-1]+"} и заменена переменной x_{1}",12, 475);
       g.setColor(Color.red);
       Stringer.drawString("наименьшее из неотрицательных отношений БР/a_{ir}",12, 455);
       Stringer.drawString("из базиса должна быть удалена переменная x_{"+bp[p-1]+"}",12, 475);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("наименьшее из неотрицательных отношений",12, 455);
       Stringer.drawString("из базиса должна быть удалена переменная",12, 475);
     }
     if(sh==15){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.3.1.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Вычисляем новое базисное решение, занося результаты",54, 435);
       Stringer.drawString("пересчета в                   .",12, 455);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.setColor(Color.red);
       g.drawString("Таблицу 3",103, 455);
     }
     if(sh==16){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.3.2.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Вычисляем оценки     ,    = 1,...,5",54, 435);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("j",222, 435);
       g.setColor(Color.red); Ind_nbk(g,"\u2206","  j",197,435);
     }
     if(sh==17){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.3.3.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Все оценки      не положительны, следовательно, решение",54, 435);
       Stringer.drawString("x_{"+bp[0]+"} = "+tbn[1][0]+"/"+tbd[1][0]+", x_{"+bp[1]+"} = "+tbn[2][0]+"/"+tbd[2][0]+", x_{3} = x_{4} = x_{5} = 0 является оптимальным",12, 455);
       g.setColor(Color.red); Ind_nbk(g,"\u2206","  j",141,435);
     }
     if(sh==18){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.3.4.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Решение задачи x_{"+bp[0]+"} = "+tbn[1][0]+"/"+tbd[1][0]+", x_{"+bp[1]+"} = "+tbn[2][0]+"/"+tbd[2][0]+" получается путем отбрасывания",54, 435);
       Stringer.drawString("дополнительных переменных x_{2}, x_{3} и искусственной переменной x_{5}",12, 455);
       g.setColor(Color.red);
       Stringer.drawString("Решение задачи x_{"+bp[0]+"} = "+tbn[1][0]+"/"+tbd[1][0]+", x_{"+bp[1]+"} = "+tbn[2][0]+"/"+tbd[2][0],54, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Решение задачи x_{"+bp[0]+"} = "+tbn[1][0]+"/"+tbd[1][0]+",",54, 435);
       g.setColor(Color.red);
       Stringer.drawString("Решение задачи x_{"+bp[0]+"} = "+tbn[1][0]+"/"+tbd[1][0],54, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Решение задачи",54, 435);
     }
     if(sh==19){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("3.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Оптимальное решение С = (5/2; 13/4) целочисленным не является",27, 435);
     }
     if(sh==20){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("4.",10, 435);
       g.setColor(Color.red);
       Stringer.drawString("x_{1}",488, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer1.drawString("Выбираем координату x_{i} с максимальной дробной частью - это",27, 435);
     }
     if(sh==21){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("5.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Записываем уравнение по формуле, пользуясь оптимальной                  ",27, 435);
       Stringer.drawString("5     1         1         1",138, 456);
       Stringer.drawString(":  x_{1} =     -     x_{3 }-     x_{4 }+     x_{5}",95, 464);
       Stringer.drawString("2     4         4         4",138, 472);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("Таблицей 3",12, 464);
       g.drawLine(135,458,148,458); g.drawLine(163,458,175,458); g.drawLine(207,458,217,458); g.drawLine(251,458,262,458);
       g.drawLine(135,459,148,459); g.drawLine(163,459,175,459); g.drawLine(207,459,217,459); g.drawLine(251,459,262,459);
     }
     if(sh==22){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("6.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Так как значение должно быть целым, получаем",27, 435);
       Stringer.drawString("1         1         1         5",201, 456);
       Stringer.drawString("x_{3 }+     x_{4 }-     x_{5 }\u2261 ",214, 464);
       Stringer.drawString("4         4         4         2",201, 472);
       Ind_nkr1(g,"c","",318,451);
       g.drawLine(198,458,210,458); g.drawLine(242,458,254,458); g.drawLine(286,458,298,458); g.drawLine(330,458,343,458);
       g.drawLine(198,459,210,459); g.drawLine(242,459,254,459); g.drawLine(286,459,298,459); g.drawLine(330,459,343,459);
     }
     if(sh==23){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("7.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Берем дробные части всех коэффициентов справа и слева:",27, 435);
       Stringer.drawString("1         1         3         1",201, 456);
       Stringer.drawString("x_{3 }+     x_{4 }+    x_{5 }\u2261 ",214, 464);
       Stringer.drawString("4         4         4         2",201, 472);
       Ind_nkr1(g,"c","",319,451);
       g.drawLine(198,458,210,458); g.drawLine(242,458,254,458); g.drawLine(287,458,298,458); g.drawLine(330,458,342,458);
       g.drawLine(198,459,210,459); g.drawLine(242,459,254,459); g.drawLine(287,459,298,459); g.drawLine(330,459,342,459);
     }
     if(sh==24){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("8.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("В этой задаче новое ограничение будет иметь вид:",27, 435);
       Stringer.drawString("1         1         3         1",201, 456);
       Stringer.drawString("x_{3 }+     x_{4 }+    x_{5 }\u2265 ",214, 464);
       Stringer.drawString("4         4         4         2",201, 472);
       g.drawLine(198,458,210,458); g.drawLine(242,458,254,458); g.drawLine(287,458,298,458); g.drawLine(330,458,342,458);
       g.drawLine(198,459,210,459); g.drawLine(242,459,254,459); g.drawLine(287,459,298,459); g.drawLine(330,459,342,459);
     }
     if(sh==25){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("9.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Записываем ограничение в виде равенства",27, 435);
       Stringer.drawString("1         1         3                  1",161, 456);
       Stringer.drawString("x_{3 }+     x_{4 }+    x_{5 }- 1\u00B7x_{6 }=    ,  x_{6} \u2265 0",174, 464);
       Stringer.drawString("4         4         4                  2",161, 472);
       g.drawLine(158,458,170,458); g.drawLine(202,458,214,458); g.drawLine(247,458,258,458); g.drawLine(326,458,338,458);
       g.drawLine(158,459,170,459); g.drawLine(202,459,214,459); g.drawLine(247,459,258,459); g.drawLine(326,459,338,459);
     }
     if(sh==26){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("10.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Расширяем оптимальную                    на одну строку и один столбец. В",35, 435);
       Stringer.drawString("полученную                    записываем дополнительное ограничение",12, 451);
       Stringer.drawString("1         1         3                  1",186, 466);
       Stringer.drawString("x_{3 }+     x_{4 }+    x_{5 }- 1\u00B7x_{6 }=    ",199, 474);
       Stringer.drawString("4         4         4                  2",186, 482);
       g.drawLine(183,468,195,468); g.drawLine(227,468,239,468); g.drawLine(272,468,283,468); g.drawLine(351,468,363,468);
       g.drawLine(183,469,195,469); g.drawLine(227,469,239,469); g.drawLine(272,469,283,469); g.drawLine(351,469,363,469);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("Таблицу 3",222, 435);
       g.setColor(Color.red);
       g.drawString("Таблицу 4",99, 451);
     }
     if(sh==27){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("11.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("В базис вводим переменную x_{4}, так как ей соответствует наименьшая",35, 435);
       Stringer.drawString("по модулю отрицательная оценка      и x_{4} входит в дополнительное",12, 455);
       Ind_nbk(g,"\u2206","  j",260,455);
       Stringer.drawString("ограничение с положительным коэффициентом",12, 475);
       g.setColor(Color.red);
       Stringer.drawString("В базис вводим переменную x_{4}",35, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("В базис вводим переменную",35, 435);
     }
     if(sh==28){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("12.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Осуществляем пересчет                    , вычисляя новое базисное",35, 435);
       Stringer.drawString("решение и заносим результаты пересчета в",12, 455);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("Таблицы 4",215, 435);
       g.setColor(Color.red);
       g.drawString("Таблицу 5",334, 455);
     }
     if(sh==29){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("13.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Все оценки      не положительны. Оптимальное решение задачи:",35, 435);
       Ind_nbk(g,"\u2206","  j",122,435);
       g.setColor(Color.red);
       Stringer.drawString("x^{* }= (2; 3)",12, 455);
     }
     if(sh==30){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("14.",10, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Решение x^{* }= (2; 3) является целочисленным, следовательно решение",35, 435);
       Stringer.drawString("задачи закончено.",12, 455);
       g.setColor(Color.red);
       Stringer.drawString("Решение x^{* }= (2; 3)",35, 435);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Решение",35, 435);
     }
     if(sh==1) jButton3.setEnabled(false);
     else jButton3.setEnabled(true);
     if(sh==30) jButton1.setEnabled(false);
     else jButton1.setEnabled(true);
  }
 }

  void jButton1_actionPerformed(ActionEvent e) {
    sh++;
    if (sh>30) sh=30;
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
//    a=e.getX()-5;
//    aa=e.getY()-22;
    xx=e.getX()-5;
    yy=e.getY()-22;
//    jLabel2.setText("x="+Integer.toString(a)+"   y="+Integer.toString(aa));
    jPanel1.repaint();
  }
}
