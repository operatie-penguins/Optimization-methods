import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class AppPrimVetGran1 extends JApplet {
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
    this.setSize(new Dimension(627, 579));
    this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseMoved(MouseEvent e) {
        this_mouseMoved(e);
      }
    });
    this.getContentPane().setLayout(null);
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel1.setForeground(new Color(130, 0, 80));
    jLabel1.setText("Пример");
    jLabel1.setBounds(new Rectangle(279, 0, 62, 17));
    jPanel1.setBounds(new Rectangle(5,18,621,529));
    jPanel1.setBackground(new Color(247, 247, 255));
    jButton1.setBackground(new Color(220, 230, 255));
    jButton1.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton1.setForeground(new Color(0, 0, 60));
    jButton1.setText("==>");
    jButton1.setBounds(new Rectangle(383, 553, 100, 23));
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton1_actionPerformed(e);
      }
    });
    jButton2.setBackground(new Color(220, 230, 255));
    jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton2.setForeground(new Color(0, 0, 60));
    jButton2.setText("Обновить");
    jButton2.setBounds(new Rectangle(263, 553, 100, 23));
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton2_actionPerformed(e);
      }
    });
    jButton3.setBackground(new Color(220, 230, 255));
    jButton3.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton3.setForeground(new Color(0, 0, 60));
    jButton3.setText("<==");
    jButton3.setBounds(new Rectangle(143, 553, 100, 23));
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton3_actionPerformed(e);
      }
    });
/*    jLabel2.setText("");
    jLabel2.setBounds(new Rectangle(5, 3, 189, 17));
    this.getContentPane().add(jLabel2, null);*/
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
  public void Tabl1(Graphics g, int a, int c, int t, int h, boolean f, int bp[]){ //Рисует верхнюю таблицу
    int b=(600-120-(a+1)*60)/2, d=(int)Math.round(17*(3-c)/2);
    if(h==0) g.setColor(Color.red); else g.setColor(new Color(180, 0, 80));
    g.setFont(new java.awt.Font("SansSerif", 3, 13));
    g.drawString("Таблица "+t+":",15+b,163+d);
    g.setColor(new Color(255, 255, 255)); g.fillRect(b+7,167+d,602-2*b,2+17*(3+c));
    g.setColor(Color.black);
    for(int i=0; i<=a+1; i++)
      g.drawLine(b+128+i*60,168+d,b+128+i*60,270-d);
    for(int i=0; i<=3; i++)
      if(i==0) g.drawLine(b+8+i*40,168+d,b+8+i*40,270-d);
      else g.drawLine(b+8+i*40,168+d,b+8+i*40,253-d);
    for(int i=0; i<=3+c; i++)
      if(i==1) g.drawLine(b+128,d+168+i*17,608-b,d+168+i*17);
      else g.drawLine(b+8,d+168+i*17,608-b,d+168+i*17);
    g.setColor(new Color(157, 187, 255)); g.drawRect(b+7,167+d,602-2*b,2+17*(3+c));
    g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 13));
    if (f==true){
      g.drawString("БП",b+59,190+d); g.drawString("БР",b+99,190+d);
      g.drawString("БР/",b+139+60*a,199+d); Ind_nk(g,"a","ir",b+162+60*a,199+d);
      Ind_nk(g,"c","i",b+23,190+d); Ind_nk(g,"c","j",b+153+a*60,179+d);
      for(int i=1; i<=a; i++)
        Ind_n(g,"x",""+i,b+153+(i-1)*60,196+d);
      for(int i=0; i<c; i++)
        if(bp[i]>0) Ind_n(g,"x",""+bp[i],b+62,213+d+i*17);
      Ind_nk(g,"\u2206","  j",b+153+a*60,215+c*17+d);
    }
  }
  public void Tabl2(Graphics g, int a, int c, int t, int h, boolean f, int bp[]){ //Рисует нижнюю таблицу
    int b=(600-120-(a+1)*60)/2, d=(int)Math.round(17*(3-c)/2);
    if(h==0) g.setColor(Color.red); else g.setColor(new Color(180, 0, 80));
    g.setFont(new java.awt.Font("SansSerif", 3, 13));
    g.drawString("Таблица "+t+":",b+15,286+d);
    g.setColor(new Color(255, 255, 255)); g.fillRect(b+7,291+d,602-2*b,2+17*(3+c));
    g.setColor(Color.black);
    for(int i=0; i<=a+1; i++)
      g.drawLine(b+128+i*60,292+d,b+128+i*60,394-d);
    for(int i=0; i<=3; i++)
      if(i==0) g.drawLine(b+8+i*40,292+d,b+8+i*40,394-d);
      else g.drawLine(b+8+i*40,292+d,b+8+i*40,377-d);
    for(int i=0; i<=3+c; i++)
      if(i==1) g.drawLine(b+128,d+292+i*17,608-b,d+292+i*17);
      else g.drawLine(b+8,d+292+i*17,608-b,d+292+i*17);
    g.setColor(new Color(157, 187, 255)); g.drawRect(b+7,291+d,602-2*b,2+17*(3+c));
    g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 13));
    if (f==true){
      g.drawString("БП",b+59,314+d); g.drawString("БР",b+99,314+d);
      g.drawString("БР/",b+139+60*a,323+d); Ind_nk(g,"a","ir",b+162+60*a,323+d);
      Ind_nk(g,"c","i",b+23,314+d); Ind_nk(g,"c","j",b+153+a*60,303+d);
      for(int i=1; i<=a; i++)
        Ind_n(g,"x",""+i,b+153+(i-1)*60,320+d);
      for(int i=0; i<c; i++)
        if(bp[i]>0) Ind_n(g,"x",""+bp[i],b+62,337+d+i*17);
      Ind_nk(g,"\u2206","  j",b+153+a*60,339+c*17+d);
    }
  }
  public void Tb1(Graphics g, int a, int c,int tbn[][], int tbd[][], int bp[]){ //Заполняет верхнюю таблицу
    g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
    int b=(600-120-(a+1)*60)/2, d=(int)Math.round(17*(3-c)/2), l=0;
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
    int b=(600-120-(a+1)*60)/2, d=(int)Math.round(17*(3-c)/2), l=0;
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
        if(tbn[4][i+1]<20000){
          k=(int)Math.round(tbn[4][i+1]/1000.0);
          if(tbd[4][i+1]==1){
            if((k>=1)||(k<=-1)){
              if(tbn[4][i+1]-k*1000>0){
                if(k==1) s[i]=s[i]+"M + "+(tbn[4][i+1]-k*1000);
                else if(k==-1) s[i]=s[i]+"-M + "+(tbn[4][i+1]-k*1000);
                     else s[i]=s[i]+k+"M + "+(tbn[4][i+1]-k*1000);
              }
              else if(tbn[4][i+1]-k*1000<0){
                     if(k==1) s[i]=s[i]+"M - "+(k*1000-tbn[4][i+1]);
                     else if(k==-1) s[i]=s[i]+"-M - "+(k*1000-tbn[4][i+1]);
                          else s[i]=s[i]+k+"M - "+(k*1000-tbn[4][i+1]);
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
                if(k==1) s[i]=s[i]+"("+"M + "+(tbn[4][i+1]-k*1000)+")/"+tbd[4][i+1];
                else if(k==-1) s[i]=s[i]+"("+"-M + "+(tbn[4][i+1]-k*1000)+")/"+tbd[4][i+1];
                     else s[i]=s[i]+"("+k+"M + "+(tbn[4][i+1]-k*1000)+")/"+tbd[4][i+1];
              }
              else if (tbn[4][i+1]-k*1000<0){
                     if(k==1) s[i]=s[i]+"("+"M - "+(k*1000-tbn[4][i+1])+")/"+tbd[4][i+1];
                     else if(k==-1) s[i]=s[i]+"("+"-M - "+(k*1000-tbn[4][i+1])+")/"+tbd[4][i+1];
                          else s[i]=s[i]+"("+k+"M - "+(k*1000-tbn[4][i+1])+")/"+tbd[4][i+1];
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
      String s1,s2,s3,s4,s[]={"","","","","","",""}, sm[]={""}, ss="", jj="";
      int n=0, p=0, z=0, l=0, a=5, c=2, b=(600-120-(a+1)*60)/2, d=(int)Math.round(17*(3-c)/2), nm[]={0},
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
      g.drawString("Задача:  ",5,15);
      g.drawString("Задачи подлежащие ветвлению:",15,410);
      g.drawString("Возможные оптимальные решения:",326,410);
      g.drawString("Решение:",15,453);
      g.drawString("Обозначения:",475,57);
      g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
      Stringer.drawString("Найти целочисленное решение задачи  f(x) = x_{1}- x_{2} \u2192 max  при ограничениях",58,15);
      Stringer.drawString("-x_{1} + 2 x_{2} \u2265 4,  3 x_{1} + 2 x_{2} \u2264 14,  x_{1}, x_{2} \u2265 0, где x_{1}, x_{2} - целые, методом ветвей и границ",12,35);
      g.setColor(new Color(255, 255, 255));
      g.fillRect(7,62,210,85); g.fillRect(237,62,210,85); g.fillRect(467,62,142,85); g.fillRect(7,458,602,70); g.fillRect(7,415,291,23); g.fillRect(318,415,291,23);
      g.setColor(new Color(157, 187, 255));
      g.drawRect(7,62,210,85); g.drawRect(237,62,210,85); g.drawRect(467,62,142,85); g.drawRect(7,458,602,70); g.drawRect(7,415,291,23); g.drawRect(318,415,291,23);
      g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 13));
      if(((sh>=1) && (sh<=18)) || ((sh>=22) && (sh<=28)) || ((sh>=30) && (sh<=36))){
        g.drawString("БП",477,82); g.drawString("БР",476,119);
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("- базисные",497,83); g.drawString("переменные",507,99);
        g.drawString("- базисное",497,119); g.drawString("решение",507,135);
      }
      if(((sh>=19) && (sh<=21)) || (sh==29) || (sh>=37)){
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("Н - нецелочислен-",471,83); g.drawString("ное решение",494,99);
        g.drawString("Ц - целочисленное",471,119); g.drawString("решение",494,135);
      }
      if(sh>=1){
        if((sh==1) || (sh==21)|| (sh==22) || (sh==30)){
          g.setColor(Color.red);
          g.drawRect(7,62,210,85); g.drawRect(237,62,210,85);
        }
        s1="f(x) =     -     \u2192 max"; s2="-     + 2     \u2265 4,";
        s3="3    + 2     \u2264 14,"; s4="      ,     \u2265 0.";
        if((sh<=20) || (sh==38)){
          g.setColor(new Color(180, 0, 80));
          if(sh==1) g.setColor(Color.red);
          g.setFont(new java.awt.Font("SansSerif", 3, 13));
          g.drawString("Задача ЗЛП - 0:",15,57); g.drawString("Расширенная форма:",245,57);
          g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
          g.drawString("f(x) =    -     - М     \u2192 max",261,77); Ind_n(g,"x","1",298,77); Ind_n(g,"x","2",321,77); Ind_n(g,"x","5",363,77);
          g.drawString("-     + 2    -     +     = 4,",274,99); Ind_n(g,"x","1",283,99); Ind_n(g,"x","2",320,99); Ind_n(g,"x","3",344,99); Ind_n(g,"x","5",371,99);
          g.drawString("3    + 2    +     = 14,",284,119); Ind_n(g,"x","1",293,119); Ind_n(g,"x","2",330,119); Ind_n(g,"x","4",355,119);
          g.drawString(",...,     \u2265 0.",318,139); Ind_n(g,"x","1",303,139); Ind_n(g,"x","5",340,139);
          Ind_n(g,"x","1",81,139); Ind_n(g,"x","2",102,139);
        }
        if((sh>=21) && (sh<30)){
          g.setFont(new java.awt.Font("SansSerif", 3, 13));
          if(sh>22) g.setColor(new Color(180, 0, 80)); else g.setColor(Color.red);
          g.drawString("Задача ЗЛП - 1:",15,57);
          if(sh>=22){
            g.drawString("Расширенная форма:",245,57);
            g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
            g.drawString("f(x) =    -     - М     \u2192 max",261,77); Ind_n(g,"x","1",298,77); Ind_n(g,"x","2",321,77); Ind_n(g,"x","6",363,77);
            g.drawString("-     + 2    -     +     = 4,",274,99); Ind_n(g,"x","1",283,99); Ind_n(g,"x","2",320,99); Ind_n(g,"x","3",344,99); Ind_n(g,"x","6",371,99);
            g.drawString("3    + 2    +     = 14,",284,119); Ind_n(g,"x","1",293,119); Ind_n(g,"x","2",330,119); Ind_n(g,"x","4",355,119);
            g.drawString("+     = 2,       ,...,     \u2265 0.",278,139); Ind_n(g,"x","1",263,139); Ind_n(g,"x","5",289,139); Ind_n(g,"x","1",343,139); Ind_n(g,"x","6",380,139);
          }
          if(sh==21){
            g.setColor(Color.red); g.setFont(new java.awt.Font("SansSerif", 3, 14));
            g.drawString("Задача ЗЛП - 2:",245,57); s4="          \u2265 3,       ,     \u2265 0.";
            g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
            Ind_n(g,"x","1",287,139); Ind_n(g,"x","1",341,139); Ind_n(g,"x","2",362,139);
            g.drawString(s1,(int)(237+(210-s1.length()*6)/2),77); Ind_n(g,"x","1",315,77); Ind_n(g,"x","2",339,77);
            g.drawString(s2,(int)(237+(210-s2.length()*5)/2),99); Ind_n(g,"x","1",307,99); Ind_n(g,"x","2",344,99);
            g.drawString(s3,(int)(237+(210-s3.length()*5)/2),119); Ind_n(g,"x","1",306,119); Ind_n(g,"x","2",344,119);
            g.drawString(s4,(int)(237+(210-s4.length()*5)/2),139);
          }
          s4="         \u2264 2,       ,     \u2265 0."; g.setColor(new Color(0, 0, 80));
          Ind_n(g,"x","1",57,139); Ind_n(g,"x","1",110,139); Ind_n(g,"x","2",131,139);
        }
        if((sh>=30) && (sh<=37)){
          g.setFont(new java.awt.Font("SansSerif", 3, 13));
          if(sh>30) g.setColor(new Color(180, 0, 80)); else g.setColor(Color.red);
          g.drawString("Задача ЗЛП - 2:",15,57);
          g.drawString("Расширенная форма:",245,57);
          g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
          g.drawString("f(x) =    -    - М     - М     \u2192 max",242,77); Ind_n(g,"x","1",279,77); Ind_n(g,"x","2",300,77); Ind_n(g,"x","6",340,77); Ind_n(g,"x","7",381,77);
          g.drawString("-     + 2    -     +     = 4,",274,99); Ind_n(g,"x","1",283,99); Ind_n(g,"x","2",320,99); Ind_n(g,"x","3",344,99); Ind_n(g,"x","6",371,99);
          g.drawString("3    + 2    +     = 14,",284,119); Ind_n(g,"x","1",293,119); Ind_n(g,"x","2",330,119); Ind_n(g,"x","4",355,119);
          g.drawString("-     +     = 3,       ,...,     \u2265 0.",266,139); Ind_n(g,"x","1",251,139); Ind_n(g,"x","5",277,139); Ind_n(g,"x","7",303,139); Ind_n(g,"x","1",356,139); Ind_n(g,"x","7",393,139);
          s4="         \u2265 3,       ,     \u2265 0."; g.setColor(new Color(0, 0, 80));
          Ind_n(g,"x","1",57,139); Ind_n(g,"x","1",110,139); Ind_n(g,"x","2",131,139);
        }
        g.drawString(s1,(int)(7+(210-s1.length()*6)/2),77); Ind_n(g,"x","1",85,77); Ind_n(g,"x","2",109,77);
        g.drawString(s2,(int)(7+(210-s2.length()*5)/2),99); Ind_n(g,"x","1",77,99); Ind_n(g,"x","2",114,99);
        g.drawString(s3,(int)(7+(210-s3.length()*5)/2),119); Ind_n(g,"x","1",76,119); Ind_n(g,"x","2",114,119);
        g.drawString(s4,(int)(7+(210-s4.length()*5)/2),139);
      }
      if(sh==2){
        Tabl1(g,a,c,1,0,true,bp);
        Tb1(g,a,c,tbn,tbd,bp);
      }
      if((sh>=3) && (sh<=5)){
        Tabl1(g,a,c,1,1,true,bp);
        if(sh==3){
          g.setColor(new Color(230, 230, 255));
          g.fillRect(129+b,203+d+17*c,60*(a+1)-1,16);
          g.setColor(Color.black);
          for(int i=0; i<a; i++)
            g.drawLine(188+b+i*60,203+d+17*c,188+b+i*60,219+d+17*c);
          g.setColor(Color.red);
          Ind_nk(g,"\u2206","  j",b+153+a*60,215+c*17+d);
        }
        ModifyArray(a,c,tbn,tbd,bp);
        Tb1(g,a,c,tbn,tbd,bp);
      }
      if((sh>=4) && (sh<22)){
        ModifyArray(a,c,tbn,tbd,bp);
        Valuation(a,c,tbn,tbd,nm,sm);
        n=nm[0]; ss=sm[0];
        if(sh==4){
          g.setColor(new Color(230, 230, 255));
          g.fillRect(69+b+n*60,203+d+17*c,59,16);
          Tb1(g,a,c,tbn,tbd,bp);
        }
      }
      if(sh==5){
        for(int i=1; i<=c; i++)
          if(tbn[i][n]>0){
            g.setColor(new Color(230, 230, 255));
            g.fillRect(69+b+n*60,186+d+17*i,59,16);
            Tb1(g,a,c,tbn,tbd,bp);
          }
        g.setColor(Color.red);
        Ind_n(g,"x",""+n,b+153+(n-1)*60,196+d);
      }
      if((sh>=6) && (sh<=22)){
        if(sh<=10) Tabl1(g,a,c,1,1,true,bp);
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
        if(sh==6){
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
        if(sh==6){
          g.setFont(new java.awt.Font("SansSerif", 1, 13));
          g.drawString("БР/",b+139+60*a,199+d); Ind_nk(g,"a","ir",b+162+60*a,199+d);
        }
        if(sh!=6) g.setColor(new Color(0, 0, 80));
        if((tbn[p][8]<20000) && (sh<=7)){
          if(tbd[p][8]==1) jj=""+tbn[p][8];
          else jj=""+tbn[p][8]+"/"+tbd[p][8];
          g.drawString(jj,(int)(b+128+60*a+(60-jj.length()*8)/2),216+d+(p-1)*17);
        }
      }
      if((sh>=7) && (sh<=22)){
        for(int i=1; i<=c+1; i++){
          tbn[i][8]=20000; tbd[i][8]=1;
        }
        if(sh<18)Tb1(g,a,c,tbn,tbd,bp);
        z=bp[p-1];
        bp[p-1]=n;
        if(sh<=10){
          if(sh==7) Tabl2(g,a,c,2,0,true,bp);
          else Tabl2(g,a,c,2,1,true,bp);
          Tb2(g,a,c,tbn,tbd,bp);
        }
        if(sh<9){
          g.setColor(Color.red);
          Ind_n(g,"x",""+n,b+62,337+d+(p-1)*17);
        }
        if(sh<=10){
          g.setColor(new Color(255, 255, 255)); g.fillRect(b+89,327+d,39+60*a,(c+1)*17-1);
          g.setColor(Color.black);
          for(int i=0; i<a; i++)
            g.drawLine(b+128+i*60,327+d,b+128+i*60,326+d+(c+1)*17);
          for(int i=1; i<=c; i++)
            g.drawLine(b+89,326+d+i*17,b+128+60*a,326+d+i*17);
        }
      }
      if((sh>=8) && (sh<=10)){
        if(sh<9){
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
        if(sh==9){
          g.setColor(new Color(230, 230, 255));
          g.fillRect(b+89,327+d,39+60*a,(p-1)*17-1);
          g.fillRect(b+89,327+d+17*p,39+60*a,(c-p)*17-1);
        }
        if(sh==10){
          g.setColor(Color.red);
          Ind_nk(g,"\u2206","  j",b+153+a*60,339+c*17+d);
          g.setColor(new Color(230, 230, 255));
          g.fillRect(b+129,327+d+c*17,60*a-1,16);
        }
        if((sh==9) || (sh==10)){
          g.setColor(Color.red);
          if(tbd[p][n]==1) jj=""+tbn[p][n];
          else jj=tbn[p][n]+"/"+tbd[p][n];
          g.drawString(jj,68+60*n+(60-jj.length()*8)/2+b,p*17+199+d);
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
          if(sh<9){
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
      if((sh>=11) && (sh<=22)){
        ModifyArray1(a,c,tbn,tbd,p,n);
        if(sh<18) Tabl1(g,a,c,2,0,true,bp);
        Valuation(a,c,tbn,tbd,nm,sm);
        n=nm[0]; ss=sm[0];
        if((sh==11) && (sh<=18)){
          g.setColor(new Color(230, 230, 255));
          g.fillRect(69+b+n*60,203+d+17*c,59,16);
          Tb1(g,a,c,tbn,tbd,bp);
        }
      }
      if(sh==12){
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
      if((sh>=13) && (sh<=22)){
        if(sh<=17) Tabl1(g,a,c,2,1,true,bp);
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
        if(sh==13){
          g.setColor(new Color(230, 230, 255));
          g.fillRect(129+a*60+b,186+d,59,16+c*17);
          g.setColor(Color.black);
          for(int i=1; i<=c; i++)
            g.drawLine(129+a*60+b,d+185+i*17,188+a*60+b,d+185+i*17);
        }
        if(sh<15) Tb1(g,a,c,tbn,tbd,bp);
        if(sh==13){
          g.setColor(Color.red);
          Ind_n(g,"x",""+bp[p-1],b+62,213+d+(p-1)*17);
          g.setFont(new java.awt.Font("SansSerif", 1, 13));
          g.drawString("БР/",b+139+60*a,199+d); Ind_nk(g,"a","ir",b+162+60*a,199+d);
        }
      }
      if((sh>=14) && (sh<=22)){
        for(int i=1; i<=c+1; i++){
          tbn[i][8]=20000; tbd[i][8]=1;
        }
        if(sh<18) Tb1(g,a,c,tbn,tbd,bp);
        z=bp[p-1];
        bp[p-1]=n;
        if(sh<=17){
          if(sh==14) Tabl2(g,a,c,3,0,true,bp);
          else Tabl2(g,a,c,3,1,true,bp);
        }
      }
      if((sh>=14) && (sh<=17)){
        ModifyArray1(a,c,tbn,tbd,p,n);
        Tb2(g,a,c,tbn,tbd,bp);
        if(sh==14){
          g.setColor(new Color(255, 255, 255));
          g.fillRect(b+89,327+d+17*c,39+60*a+5,16);
         g.setColor(Color.black);
          for(int i=0; i<=a; i++)
            g.drawLine(b+128+i*60,327+d,b+128+i*60,326+d+(c+1)*17);
        }
      }
      if(sh==15){
        g.setColor(Color.red);
        Ind_nk(g,"\u2206","  j",b+153+a*60,339+c*17+d);
      }
      if(sh==16){
        g.setColor(Color.red);
        Ind_nk(g,"\u2206","  j",b+153+a*60,339+c*17+d);
        g.setColor(new Color(230, 230, 255));
        g.fillRect(b+129,327+d+c*17,60*a-1,16);
        g.setColor(Color.black);
        for(int i=0; i<a; i++)
          g.drawLine(b+128+i*60,327+d,b+128+i*60,326+d+(c+1)*17);
        Tb2(g,a,c,tbn,tbd,bp);
      }
      if(((sh>=23) && (sh<=28)) || ((sh>=31) && (sh<=36))){
        if((sh>=23) && (sh<=28)){
          a=6; c=3; bp[0]=6; bp[1]=4; bp[2]=5; tbn[1][5]=0; tbn[1][6]=1; tbn[2][5]=0; tbn[2][6]=0;
          tbn[3][0]=2; tbn[3][1]=1; tbn[3][2]=0; tbn[3][3]=0; tbn[3][4]=0; tbn[3][5]=1; tbn[3][6]=0;
          tbn[0][5]=0; tbn[0][6]=-1000; b=(600-120-(a+1)*60)/2; d=(int)Math.round(17*(3-c)/2);
        }
        if((sh>=31) && (sh<=36)){
          a=7; c=3; bp[0]=6; bp[1]=4; bp[2]=7; tbn[1][5]=0; tbn[1][6]=1; tbn[1][7]=0; tbn[2][5]=0; tbn[2][6]=0; tbn[2][7]=0;
          tbn[3][0]=3; tbn[3][1]=1; tbn[3][2]=0; tbn[3][3]=0; tbn[3][4]=0; tbn[3][5]=-1; tbn[3][6]=0; tbn[3][7]=1;
          tbn[0][5]=0; tbn[0][6]=-1000; tbn[0][7]=-1000; b=(600-120-(a+1)*60)/2; d=(int)Math.round(17*(3-c)/2);
        }
        if((sh==23) || (sh==31)){
          Tabl1(g,a,c,1,0,true,bp);
          g.setColor(new Color(230, 230, 255));
          g.fillRect(129+b,203+d+17*c,60*(a+1)-1,16);
          g.setColor(Color.black);
          for (int i=0; i<a; i++)
            g.drawLine(188+b+i*60,203+d+17*c,188+b+i*60,219+d+17*c);
          g.setColor(Color.red);
          Ind_nk(g,"\u2206","  j",b+153+a*60,215+c*17+d);
        }
        else if((sh<=25) || ((sh>=31) && (sh<=33))) Tabl1(g,a,c,1,1,true,bp);
        ModifyArray(a,c,tbn,tbd,bp);
        if((sh>=24) && (sh!=31)){
          Valuation(a,c,tbn,tbd,nm,sm); n=nm[0]; ss=sm[0];
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
        if(((sh>25) && (sh<=28)) || (sh>33)){
          bp[p-1]=n;
          for(int i=1; i<=c+1; i++){
            tbn[i][8]=20000; tbd[i][8]=1;
          }
          ModifyArray1(a,c,tbn,tbd,p,n);
        }
        if(((sh>=26) && (sh<=28)) || (sh>=34)){
          if((sh==26) || (sh==34)) Tabl1(g,a,c,2,0,true,bp);
            else if(((sh>26) && (sh<28)) || ((sh>34) && (sh<36))) Tabl1(g,a,c,2,1,true,bp);
          Valuation(a,c,tbn,tbd,nm,sm); n=nm[0]; ss=sm[0];
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
        if(((sh>27) && (sh<=28)) || (sh>35)){
          bp[p-1]=n;
          for(int i=1; i<=c+1; i++){
            tbn[i][8]=20000; tbd[i][8]=1;
          }
          ModifyArray1(a,c,tbn,tbd,p,n);
        }
        if((sh==28) || (sh==36)){
          Tabl1(g,a,c,3,0,true,bp);
          g.setColor(Color.red);
          Ind_nk(g,"\u2206","  j",b+153+a*60,215+c*17+d);
          g.setColor(new Color(230, 230, 255));
          g.fillRect(b+129,203+d+c*17,60*a-1,16);
          g.setColor(Color.black);
          for(int i=0; i<a; i++)
            g.drawLine(b+128+i*60,185+d+(c+1)*17,b+128+i*60,202+d+(c+1)*17);
        }
        if(((sh==24) || (sh==26)) || ((sh==32) || (sh==34))){
          g.setColor(new Color(230, 230, 255));
          g.fillRect(69+b+n*60,203+d+17*c,59,16);
          g.fillRect(129+a*60+b,186+d+p*17,59,16);
        }
        if(((sh>=24) && (sh<=27)) || ((sh>=32) && (sh<=35))){
          g.setColor(Color.red);
          Ind_n(g,"x",""+n,b+153+(n-1)*60,196+d);
          Ind_n(g,"x",""+bp[p-1],b+62,213+d+(p-1)*17);
        }
        Tb1(g,a,c,tbn,tbd,bp);
        if(((sh==25) || (sh==27)) || ((sh==33) || (sh==35))){
          bp[p-1]=n;
          for(int i=1; i<=c+1; i++){
            tbn[i][8]=20000; tbd[i][8]=1;
          }
          if((sh==25) || (sh==33)) Tabl2(g,a,c,2,0,true,bp);
          if((sh==27) || (sh==35)) Tabl2(g,a,c,3,0,true,bp);
          ModifyArray1(a,c,tbn,tbd,p,n);
          Tb2(g,a,c,tbn,tbd,bp);
          g.setColor(Color.red);
          Ind_n(g,"x",""+n,b+62,337+d+(p-1)*17);
        }
        if(sh==36){
          g.setColor(Color.red);
          Ind_n(g,"x",""+bp[2],b+62,213+d+p*17);
        }
      }
     //Схема
     if(((sh>=19) && (sh<=21)) || (sh==29) || (sh>=37)){
       g.setColor(new Color(180, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 3, 13));
       g.drawString("Схема решения:",281,162);
       g.setColor(new Color(255, 255, 255)); g.fillRect(273,167,336,228);
       g.setColor(new Color(157, 187, 255)); g.drawRect(273,167,336,228);
       g.setColor(Color.black);
       g.drawRect(378,207,126,48);
       g.drawLine(378,222,504,222);
       g.drawLine(486,222,486,255);
       g.setColor(Color.red); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("ЗЛП - 0",416,220);
       g.setColor(new Color(0, 0, 80));
       Ind_v(g,"x","0",382,237);
       g.drawString("= (5/2; 13/4)",399,237);
       g.drawString("f(   ) = -3/4",399, 252);
       Ind_v(g,"x","0",408,252);
       g.drawString("Н",490,247);
       g.setFont(new java.awt.Font("SansSerif", 3, 11));
       g.drawString("T",476, 232);
       if(sh>=20){
         g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
         g.drawString("ЗЛП - 0",416,220);
         if(sh==21) g.setColor(Color.red);
         g.drawString("ЗЛП - 1",332,320);
         g.drawString("ЗЛП - 2",502,320);
         g.setColor(Color.black);
         g.drawLine(436,255,356,307);
         int a1[]={353,358,363}, b1[]={307,302,307};
         g.fillPolygon(a1,b1,3);
         g.drawRect(293,307,126,48);
         g.drawLine(293,322,419,322);
         g.drawLine(446,255,526,307);
         int a2[]={519,524,529}, b2[]={307,302,307};
         g.fillPolygon(a2,b2,3);
         g.drawRect(463,307,126,48);
         g.drawLine(463,322,589,322);
         if(sh==20) g.setColor(Color.red);
         else g.setColor(new Color(0, 0, 80));
         Ind_n(g,"x","1",303,286); g.drawString("\u2264 [5/2] = 2",319,286);
         Ind_n(g,"x","1",499,286); g.drawString("\u2265 [5/2] + 1 = 3",515,286);
         if(sh>=29){
           g.setColor(new Color(0, 0, 80));
           g.drawString("Ц",405,347);
           if((sh==29) || (sh==38)) g.setColor(Color.red);
           Ind_v(g,"x","1",314,337);
           g.drawString("= (2; 3)",332,337);
           g.drawString("f(   ) = -1",319, 352);
           Ind_v(g,"x","1",328,352);
           g.setFont(new java.awt.Font("SansSerif", 3, 11));
           g.drawString("T",377, 332);
           g.setColor(Color.black);
           g.drawLine(401,322,401,355);
         }
         if(sh>=37){
           if(sh==37) g.setColor(Color.red);
           else g.setColor(new Color(0, 0, 80));
           g.setFont(new java.awt.Font("SansSerif", 1, 14));
           g.drawString("X = O",506,341);
           g.drawLine(531,340,541,332);
           g.drawLine(531,339,541,331);
         }
       }
     }
     //График
     if(((sh>=18) && (sh<=19)) || (sh==29) || (sh>=37)){
       g.setColor(new Color(180, 0, 80));
       g.setFont(new java.awt.Font("SansSerif", 3, 13));
       g.drawString("Графическая иллюстрация:",15,162);
       g.setColor(new Color(255, 255, 255));
       g.fillRect(7,167,246,228);
       g.setColor(new Color(157, 187, 255));
       g.drawRect(7,167,246,228);
       g.setColor(Color.black);
       g.drawLine(27,173,27,394);
       g.drawLine(8,365,248,365);
       Ind_n(g,"x","2",34,178); Ind_n(g,"x","1",238,377);
       int a11[]={22,27,32}, b11[]={174,167,174};
       int a12[]={247,252,247}, b12[]={360,365,370};
       g.fillPolygon(a11,b11,3);
       g.fillPolygon(a12,b12,3);
       int i;
       if((sh>=18) && (sh<=21)){
         g.setColor(new Color(227, 227, 255));
         int a21[]={28,90,28}, b21[]={184,280,312};
         g.fillPolygon(a21,b21,3);
         g.setColor(new Color(0, 0, 80));
         for (i=278; i<364; i=i+4) g.drawLine(91,i,91,i+2);
         for (i=29; i<90; i=i+5) g.drawLine(i,280,i+2,280);
         g.setColor(new Color(180, 0, 80));
         g.drawString("ЗЛП - 0",108,182);
         if(sh>18) g.setColor(new Color(0, 0, 80));
         else g.setColor(Color.red);
         Ind_v(g,"x","0",91,275);
       }
       if((sh==29) || (sh==38)){
         g.setColor(new Color(227, 227, 255));
         int a22[]={28,79,79,28}, b22[]={184,261,287,312};
         g.fillPolygon(a22,b22,4);
         g.setColor(new Color(0, 0, 80));
         for (i=33; i<79; i=i+5) g.drawLine(i,287,i+2,287);
         g.setColor(new Color(180, 0, 80));
         g.drawString("ЗЛП - 1",108,182);
         g.setColor(new Color(0, 0, 80));
         g.drawLine(78,168,78,394); g.drawLine(79,168,79,394);
         Ind_n(g,"x","1",84,210); g.drawString("= 2",100,211);
         g.setColor(Color.red);
         if(sh==29) Ind_v(g,"x","1",82,300);
         else Ind_v(g,"x","*",82,300);
       }
       if(sh==37){
         g.setColor(new Color(180, 0, 80));
         g.drawString("ЗЛП - 2",115,182);
         g.setColor(new Color(0, 0, 80));
         g.drawLine(104,168,104,394); g.drawLine(105,168,105,394);
         Ind_n(g,"x","1",63,210); g.drawString("= 3",79,211);
         g.setColor(Color.black);
         for(i=0; i<=14; i++){
           g.drawLine(i*4+27,i*6+195,i*4+30,i*6+188);
           if(i<=8) g.drawLine((i+20)*4+27,(i+20)*6+195,(i+20)*4+30,(i+20)*6+188);
         }
         for(i=0; i<=20; i++){
           if(i<=8) g.drawLine(i*7+28,311-i*4+i/2,i*7+30,305-i*4+i/2);
           g.drawLine((i+11)*7+30,311-(i+11)*4+(i+11)/2,(i+11)*7+32,305-(i+11)*4+(i+10)/2);
         }
         for(i=0; i<=11; i++){
           g.drawLine(105,174+i*9,110,168+i*9);
           if(i<=5) g.drawLine(105,175+(i+16)*9,110,169+(i+16)*9);
         }
       }
       g.setFont(new java.awt.Font("SansSerif", 1, 11));
       g.setColor(Color.darkGray);
       g.drawString("0",17,378);
       for(i=-2; i<7; i++){
           g.setColor(Color.black);
           g.drawLine(24,339-26*i,30,339-26*i);
           if(i>=0){
             g.drawLine(53+26*i,362,53+26*i,368);
             g.setColor(Color.darkGray);
             if((((sh==29) || (sh==38)) && (i==1)) || ((sh==37) && (i==2)))
               g.drawString(""+(i+1),56+26*i,379);
            else
              if((i!=4) && (i!=0)) g.drawString(""+(i+1),51+26*i,379);
              else g.drawString(""+(i+1),56+26*i,379);
           }
       }
       g.drawString(""+(-1),13,394);
       for(i=0; i<7; i++)
         if(i!=1) g.drawString(""+(i+1),17,343-26*i);
         else g.drawString(""+(i+1),17,340-26*i);
       g.setColor(new Color(0, 0, 80));
       g.drawLine(16,168,167,394); g.drawLine(17,168,168,394);
       g.drawLine(8,322,252,200); g.drawLine(8,323,252,201);
       g.drawLine(27,365,27+25,365+25); g.drawLine(27,366,27+25,366+25);
       g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("3    + 2     = 14",140,345);
       Ind_n(g,"x","1",150,345); Ind_n(g,"x","2",186,345);
       g.drawString("-    + 2     = 4",165,257);
       Ind_n(g,"x","1",173,257); Ind_n(g,"x","2",209,257);
       int a4[]={27+26,27+23,27+17}, b4[]={365+26,365+17,365+23};
       g.fillPolygon(a4,b4,3);
       for(i=27; i<47; i=i+7)
         g.drawLine(i+6,365+26,i+10,365+26);
       for(i=365; i<385; i=i+7)
         g.drawLine(53,i+6,53,i+10);
       g.drawString("\u25bcf",56,391);
       g.setColor(Color.red);
       if((sh>=18) && (sh<=21)) g.fillOval(90,279,5,5);
       if((sh==29) || (sh==38)) g.fillOval(77,285,5,5);
     }
     //Множества
     if(((sh>=1) && (sh<=17)) || (sh>=19)){
       if((sh==19) || (sh==38)) g.setColor(Color.red);
       else g.setColor(new Color(0, 0, 80));
       g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("J",15, 433); g.drawString("O",41, 433);
       g.setFont(new java.awt.Font("SansSerif", 1, 16));
       g.drawString("=",29, 433);
       g.drawLine(40,431,54,421);
       g.drawLine(40,432,54,422);
     }
     if(sh==18){
       g.setColor(Color.red);
       g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("J",15, 433); g.drawString("0",49, 433);
       g.setFont(new java.awt.Font("SansSerif", 1, 16));
       g.drawString("= {   }",29, 433);
     }

     if((sh>=1) && (sh<=28)){
       g.setColor(new Color(0, 0, 80));
       g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("X = O",326, 433);
       g.setFont(new java.awt.Font("SansSerif", 1, 16));
       Ind_v(g,"","*",339,431);
       g.drawLine(353,431,367,421);
       g.drawLine(353,432,367,422);
     }
     if(sh>=29){
       if((sh==29) || (sh==38)) g.setColor(Color.red); else g.setColor(new Color(0, 0, 80));
       Ind_v(g,"x","1",365,433); Ind_v(g,"x","1",469,433);
       g.drawString("= (2; 3)     = f(   ) = -1",382, 433);
       Ind_f(g,439, 433);
       if(sh==38) g.setColor(new Color(0, 0, 80));
       g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("X",326, 433);
       Ind_v(g,"","*",339,431);
       g.setFont(new java.awt.Font("SansSerif", 1, 16));
       g.drawString("= {                ,                    } ",346, 433);
     }
     //Коментарии
     if(sh==1){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("0.0.",10, 478);
       g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("Положим    = 0. Будем решать исходную задачу ЗЛП - 0 без учета тебования",40, 478);
       g.drawString("целочисленности симплекс-методом: для этого запишем расширенную форму",12, 498);
       g.drawString("ЗЛП - 0",12, 518);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("k",110, 478);
       g.setColor(Color.red); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("задачу ЗЛП - 0",332, 478); g.drawString("расширенную форму",429, 498);
     }
     if(sh==2){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("0.1.1.",10, 478);
       g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("Заполняем                    согласно алгоритму симплекс-метода. Базиcными",54, 478);
       g.drawString("переменными являютя     ,    , а свободными     ,    ,    . Тогда начальное базисное",12, 498);
       g.drawString("решение будет     = 4,     = 14 и      =     =     = 0",12, 518);
       Ind_n(g,"x",""+bp[0],184,498); Ind_n(g,"x",""+bp[1],204,498);
       Ind_n(g,"x","1",338,498); Ind_n(g,"x","2",358,498); Ind_n(g,"x","3",378,498);
       Ind_n(g,"x",""+bp[0],125,518); Ind_n(g,"x",""+bp[1],168,518);
       Ind_n(g,"x","1",233,518); Ind_n(g,"x","2",261,518); Ind_n(g,"x","3",289,518);
       g.setColor(Color.red); g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("Таблицу 1",138, 478);
     }
     if(sh==3){
       ModifyArrayS(a,c,tbn,tbd,bp,s);
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("0.1.1.1.",10, 478);
       g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("Вычисляем относительные оценки      ,    = 1, ..., 5 :",66, 478);
       g.drawString(s[0]+";                "+s[1]+";",86, 498);
       g.drawString(s[2]+";       "+s[3]+";       "+s[4]+";",37, 518);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("j",354, 478);
       g.setColor(Color.red); Ind_nk(g,"\u2206","  j",326,478);
       Ind_n(g,"\u2206","  1",65,498); Ind_n(g,"\u2206","  2",332,498); Ind_n(g,"\u2206","  3",16,518);
       Ind_n(g,"\u2206","  4",225,518); Ind_n(g,"\u2206","  5",409,518);
     }
     if(sh==4){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("0.1.2.",10, 478);
       g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("Проанализируем относительные оценки: оценка       = "+ss+" > 0, так как М > 0,",54, 478);
       g.drawString("и, следовательно, текущее базисное решение     = 4,     = 14 и      =     =     = 0 не",12, 498);
       g.drawString("оптимально",12, 518);
       Ind_n(g,"x",""+bp[0],351,498); Ind_n(g,"x",""+bp[1],394,498);
       Ind_n(g,"x","1",459,498); Ind_n(g,"x","2",487,498); Ind_n(g,"x","3",515,498);
       g.setColor(Color.red);
       Ind_n(g,"\u2206","  "+n,410,478); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("Проанализируем относительные оценки: оценка       = "+ss,54, 478);
       g.setColor(new Color(0, 0, 80));
       g.drawString("Проанализируем относительные оценки: оценка",54, 478);
     }
     if(sh==5){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("0.1.2.1.",10, 478);
       g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("Анализируем коэффициенты столбца при переменной     : так как оба",66, 478);
       g.drawString("коэффициента положительны, то    = 2 и переменная      должна быть введена в",12, 498);
       g.drawString("число базисных",12, 518);
       Ind_n(g,"x",""+n,464,478);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("r",257, 497);
       g.setColor(Color.red);
       Ind_n(g,"x",""+n,397,498);
     }
     if(sh==6){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("0.1.2.2.",10, 478);
       g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("Определяем переменную, выводимую из базиса: для этого вычисляем",66, 478);
       g.drawString("отношение            . Выбираем наименьшее значение (2 < 7). Следовательно, из",12, 498);
       g.drawString("числа базисных должна быть удалена переменная     и заменена переменной",12, 518);
       Ind_n(g,"x","2",575,518);
       g.setColor(Color.red);
       g.drawString("2",399, 498);
       g.setFont(new java.awt.Font("SansSerif", 1, 13));
       g.drawString("БР/",95, 498); Ind_nk(g,"a","ir",118,498);
       Ind_n(g,"x",""+bp[p-1],380,518);
     }
     if(sh==7){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("0.2.1.",10, 478);
       g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("Вычисляем новое базисное решение, занося результаты пересчета в ",54, 478);
       g.drawString(". В                    в столбец       введена переменная     вместо",83, 498);
       Ind_n(g,"x","5",508,498);
       g.setFont(new java.awt.Font("SansSerif", 1, 13));
       g.drawString("БП",258, 498);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("Таблице 2",104, 498);
       g.setColor(Color.red);
       g.drawString("Таблицу 2",12, 498);
       Ind_n(g,"x","2",436,498);
     }
     if(sh==8){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("0.2.1.1.",10, 478);
       g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("Первой пересчитывается строка, соотвествующая введенной переменной",66, 478);
       g.drawString(". Она получается в результате деления каждого элемента выделенной строки               ",28, 498);
       g.drawString("на разрешающий элемент, равный",92, 518);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("Таблицы 1",12, 518);
       g.setColor(Color.red); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("2",349, 518); Ind_n(g,"x","2",12,498);
     }
     if(sh==9){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("0.2.1.2.",10, 478);
       g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("Остальные элементы пересчитывают по 'правилу прямоугольника'. Для",66, 478);
       g.drawString("второй сторки имеем:      14 -        = 10,      3 -         = 4,      2 -        = 0,      0 -         = 1,",12, 498);
       g.drawString("4*2",227, 492); g.drawString("-1*2",331, 492); g.drawString("2*2",433, 492);
       g.drawString("-1*2",527, 492); g.drawString("0*2",35, 512); g.drawString("1*2",131, 512);
       g.drawString("2",233, 506); g.drawString("2",341, 506); g.drawString("2",438, 506); g.drawString("2",537, 506);
       g.drawString("2",41, 526); g.drawString("2",137, 526);
       g.drawString("1 -        = 1,      0 -        = -1",12, 518);
       g.drawLine(227,493,247,493); g.drawLine(227,494,247,494);
       g.drawLine(332,493,356,493); g.drawLine(332,494,356,494);
       g.drawLine(432,493,453,493); g.drawLine(432,494,453,494);
       g.drawLine(529,493,553,493); g.drawLine(529,494,553,494);
       g.drawLine(34,513,55,513); g.drawLine(34,514,55,514);
       g.drawLine(131,513,152,513); g.drawLine(131,514,152,514);
       g.setColor(Color.red); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("",341, 518); Ind_n(g,"","",12,498);
     }
     if(sh==10){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("0.2.1.3.",10, 478);
       g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("Вычисляем оценки     ,    = 1 ,..., 5. Строка      пересчитывается по",66, 478);
       g.drawString("также по 'правилу прямоугольнка':        = -M+1-                  =   ,         = 0,",12, 498);
       g.drawString("      = -M -                  =-    ,             = 0 -                 = 0,             = 0 -                = ",31, 518);
       g.drawString("-1*(2M-1)    1",347, 492); g.drawString("2           2",372, 506);
       g.drawString("-1*(2M-1)      1",98, 512);g.drawString("2             2",123, 526);
       g.drawString("0*(2M-1)",287, 512);g.drawString("2",312, 526);
       g.drawString("1*(2M-1)    -2M+1",457, 512);g.drawString("2             2",486, 526);
       Ind_nk(g,"\u2206","  j",209,478);
       g.drawLine(346,493,407,493); g.drawLine(346,494,407,494); g.drawLine(423,493,432,493); g.drawLine(423,494,432,494);
       g.drawLine(100,513,159,513); g.drawLine(100,514,159,514); g.drawLine(182,513,191,513); g.drawLine(182,514,191,514);
       g.drawLine(285,513,342,513); g.drawLine(285,514,342,514);
       g.drawLine(458,513,512,513); g.drawLine(458,514,512,514); g.drawLine(528,513,570,513); g.drawLine(528,514,570,514);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("Таблице 1",531, 478); g.drawString("j",235, 478);
       g.setColor(Color.red); Ind_nk(g,"\u2206","  j",364,478);
       Ind_n(g,"\u2206","  1",271,498); Ind_n(g,"\u2206","  2",454,497); Ind_n(g,"\u2206","  3",36,518);
       Ind_n(g,"\u2206","  4",231,518); Ind_n(g,"\u2206","  5",406,518);
     }
     if(sh==11){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("0.2.2.",10, 478);
       g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("Проанализируем относительные оценки: оценка       = "+ss+" > 0 и,",54, 478);
       g.drawString("следовательно, текущее базисное решение     = 2,     = 10 и      =     =     = 0 не",12, 498);
       g.drawString("оптимально",12, 518);
       Ind_n(g,"x",""+bp[0],334,498); Ind_n(g,"x",""+bp[1],377,498);
       Ind_n(g,"x","1",442,498); Ind_n(g,"x","3",470,498); Ind_n(g,"x","5",498,498);
       g.setColor(Color.red);
       Ind_n(g,"\u2206","  "+n,410,478);
       g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("Проанализируем относительные оценки: оценка       = "+ss,54, 478);
       g.setColor(new Color(0, 0, 80));
       g.drawString("Проанализируем относительные оценки: оценка",54, 478);
     }
     if(sh==12){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("0.2.2.1.",10, 478);
       g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("Анализируем коэффициенты столбца при переменной     : так как столбец",66, 478);
       g.drawString("содержит один положительный коэффициент, то    = 1 и переменная      должна",12, 498);
       g.drawString("быть введена в число базисных",12, 518);
       Ind_n(g,"x",""+n,464,478);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("r",369, 497);
       g.setColor(Color.red);
       Ind_n(g,"x",""+n,510,498);
     }
     if(sh==13){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("0.2.2.2.",10, 478);
       g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("Определяем переменную, выводимую из базиса: для этого находим",66, 478);
       g.drawString("наименьшее из неотрицательных отношений            . Оно равно 5/2. Тогда, из",12, 498);
       g.drawString("числа базисных должна быть удалена переменная     и заменена переменной",12, 518);
       Ind_n(g,"x","1",575,518);
       g.setColor(Color.red);
       g.setFont(new java.awt.Font("SansSerif", 1, 13));
       g.drawString("БР/",345, 498); Ind_nk(g,"a","ir",368,498);
       Ind_n(g,"x",""+bp[p-1],380,518);
     }
     if(sh==14){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("0.3.1.",10, 478);
       g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("Вычисляем новое базисное решение, занося результаты пересчета в ",54, 478);
       g.drawString(".",83, 498);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.setColor(Color.red);
       g.drawString("Таблицу 3",12, 498);
     }
     if(sh==15){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("0.3.1.1.",10, 478);
       g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("Вычисляем оценки     ,    = 1 ,..., 5",66, 478);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("j",235, 478);
       g.setColor(Color.red); Ind_nk(g,"\u2206","  j",208,478);
     }
     if(sh==16){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("0.3.2.",10, 478);
       g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("Все оценки      не положительны, следовательно, решение     = "+tbn[1][0]+"/"+tbd[1][0]+",     = "+tbn[2][0]+"/"+tbd[2][0]+",",54, 478);
       g.drawString("=     =     = 0 является оптимальным",29, 498);
       Ind_n(g,"x",""+bp[0],484,478); Ind_n(g,"x",""+bp[1],548,478);
       Ind_n(g,"x","3",12,498); Ind_n(g,"x","4",40,498); Ind_n(g,"x","5",68,498);
       g.setColor(Color.red); Ind_nk(g,"\u2206","  j",139,478);
     }
     if(sh==17){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("0.4.",10, 478);
       g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("Решение задачи ЗЛП - 0               ,             , получается путем отбрасывания",40, 478);
       g.drawString("дополнительных переменных     ,     и искусственной переменной",12, 498);
       Ind_n(g,"x","3",234,498); Ind_n(g,"x","4",255,498); Ind_n(g,"x","5",487,498);
       g.setColor(Color.red);
       Ind_n(g,"x",""+bp[0],216,478); Ind_n(g,"x",""+bp[1],280,478);
       g.drawString("= "+tbn[1][0]+"/"+tbd[1][0]+"      = "+tbn[2][0]+"/"+tbd[2][0],232, 478);
     }
     if(sh==18){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("0.4.1.",10, 478);
       g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("Оптимальное решение задачи ЗЛП - 0      = 5/2,      = 13/4  целочисленным не",54, 478);
       g.drawString("является, f(   ) = -3/4. Включаем     = 0 в множество     номеров задач, подлежащих ",12, 498);
       g.drawString("ветвлению",12, 518);
       Ind_vn(g,"x","0","1",333,478); Ind_vn(g,"x","0","2",392,478); Ind_v(g,"x","0",94,498);
       g.setColor(Color.red); g.drawString("= 0",255, 498);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("k",241, 498); g.drawString("J",377, 498);
     }
     if(sh==19){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("0.4.2.",10, 478);
       g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("Так как     = 0, выбираем для ветвления задачу ЗЛП - 0 и исключаем           из",54, 478);
       g.drawString("множества",12, 498);
       g.setColor(Color.red); g.drawString("= 0",559, 478); g.drawString("= { 0 }",108, 498);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("k",545, 478); g.drawString("J",95, 498);
       g.setColor(new Color(0, 0, 80));
       g.drawString("k",109, 478);
     }
     if(sh==20){
       g.setColor(new Color(180, 0, 60));
       g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("0.4.3.1.", 10, 478);
       g.setColor(new Color(0, 0, 80));
       g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString(
           "Осуществим ветвление задачи ЗЛП - 0: выбираем координату     , так как ее",
           64, 478);
       g.drawString(
           "значение     = 5/2 имеет наибольшую дробную часть и формируем", 12,
           498);
       g.drawString(
           "дополнительные ограничения     \u2264 [5/2] = 2 и     \u2265 [5/2] + 1 = 3",
           12, 518);
       Ind_n(g, "x", "1", 516, 478);
       Ind_vn(g, "x", "0", "1", 81, 498);
       g.setColor(Color.red);
       g.drawString("дополнительные ограничения     \u2264 [5/2] = 2 и     \u2265 [5/2] + 1 = 3", 12, 518);
       Ind_n(g, "x", "1", 234, 518);
       Ind_n(g, "x", "1", 333, 518);
       g.setColor(new Color(0, 0, 80));
       g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("дополнительные ограничения     \u2264 [5/2] = 2 и", 12, 518);
       g.setColor(Color.red);
       g.drawString("дополнительные ограничения     \u2264 [5/2] = 2", 12, 518);
       g.setColor(new Color(0, 0, 80));
       g.drawString("дополнительные ограничения", 12, 518);

     }
     if(sh==21){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("0.4.3.2.",10, 478);
       g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("Сформируем две задачи ЗЛП - 2   +  ,     = 0;    = 1, 2",66, 478);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("k",339, 478); g.drawString("i",383, 478);
       g.setColor(Color.red); g.drawString("k",301, 478); g.drawString("i",324, 478);
       g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("ЗЛП - 2   +",250, 478);
     }
     if(sh==22){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("1.0.",10, 478);
       g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("Положим    = 1. Будем решать задачу ЗЛП - 1 без учета тебования",40, 478);
       g.drawString("целочисленности симплекс-методом: для этого запишем расширенную форму",12, 498);
       g.drawString("ЗЛП - 1",12, 518);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("i",110, 478);
       g.setColor(Color.red); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("задачу ЗЛП - 1",258, 478); g.drawString("расширенную форму",429, 498);
     }
     if((sh==23) || (sh==31)){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       int k=(sh-15)/8; g.drawString(k+".1.1.",10, 478);
       g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("Заполняем                    согласно алгоритму симплекс-метода и вычисляем",54, 478);
       g.drawString("относительные оценки      ,    = 1, ..., "+(k+5),12, 498);
       g.drawString("",12, 518);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("j",212, 498);
       g.setColor(Color.red); Ind_nk(g,"\u2206","  j",184,498);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("Таблицу 1",137, 478);
     }
     if(((sh==24) || (sh==26)) || ((sh==32) || (sh==34))){
       String ss1, ss2=""; int q=113, k=sh/8-2, q1=sh-17-k*8;
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString(k+"."+(sh/2-7-k*4)+".2.",10, 478);
       if(tbd[p][8]==1) ss1=""+tbn[p][8];
       else ss1=""+tbn[p][8]+"/"+tbd[p][8];
       for(int i=1; i<=c; i++)
       if((tbn[i][8]>0) && (tbn[i][8]<20000) &&(i!=p))
         if(tbd[i][8]==1) ss2=" < "+tbn[i][8];
         else ss2=" < "+tbn[i][8]+"/"+tbd[i][8];
       g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       if(sh!=34){
         g.drawString("Оценка      = "+ss+" > 0. Cледовательно переменная      должна быть введена в",54, 478);
         g.drawString("число базисных. Выбираем наименьшее значение из             ("+ss1+ss2+").",12, 498);
       }
       else{
         g.drawString("Оценка      = "+ss+" > 0. Cледовательно переменная      должна быть",54, 478);
         g.drawString("введена в число базисных. Выбираем наименьшее значение из             ("+ss1+ss2+").",12, 498);
       }
       g.drawString("Следовательно, из числа базисных должна быть удалена переменная",12, 518);
       g.setFont(new java.awt.Font("SansSerif", 1, 13));
       if(sh!=34){ g.drawString("БР/",405, 498); Ind_nk(g,"a","ir",428,498);}
       else {g.drawString("БР/",483, 498); Ind_nk(g,"a","ir",506,498);}
       g.setColor(Color.red); Ind_n(g,"x",""+bp[p-1],522,518);
       if(sh!=34) g.drawString(ss1,456, 498);
       else g.drawString(ss1,534, 498);
       Ind_n(g,"\u2206","  "+n,111,478); g.drawString("= "+ss,130, 478);
       if(sh!=34) Ind_n(g,"x",""+n,ss.length()*q+(389-3*q)*q1+14,478);
       else Ind_n(g,"x",""+n,443,478);
     }
     if(((sh==25) || (sh==27)) || ((sh==33) || (sh==35))){
       int k=sh/8-2;
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString(k+"."+((sh-13-k*8)/2)+".1.",10, 478);
       g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("Вычисляем новое базисное решение, занося результаты пересчета в ",54, 478);
       g.drawString(".",83, 498);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.setColor(Color.red);
       g.drawString("Таблицу "+((sh-1)/2-6-k*4),12, 498);
     }
     if(sh==28){
       String ss1="", ss2="";
       for(int i=0; i<c; i++){
         if(bp[i]==1)
           if(tbd[i+1][0]==1) ss1=""+tbn[i+1][0];
           else ss1=tbn[i+1][0]+"/"+tbd[i+1][0];
         if(bp[i]==2)
           if(tbd[i+1][0]==1) ss2=""+tbn[i+1][0];
           else ss2=tbn[i+1][0]+"/"+tbd[i+1][0];
       }
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("1.3.2.",10, 478);
       g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("Все оценки      не положитнльны, следовательно, решение оптимально.",54, 478);
       g.drawString("Оптимальное решение ЗЛП - 1     = ("+ss1+"; "+ss2+") является целочисленным",12, 498);
       Ind_v(g,"x","1",236,498);
       g.setColor(Color.red); Ind_nk(g,"\u2206","  j",141,478);
     }
     if(sh==29){
       String ss1="", ss2="";
       for(int i=0; i<c; i++){
         if(bp[i]==1)
           if(tbd[i+1][0]==1) ss1=""+tbn[i+1][0];
           else ss1=tbn[i+1][0]+"/"+tbd[i+1][0];
         if(bp[i]==2)
           if(tbd[i+1][0]==1) ss2=""+tbn[i+1][0];
           else ss2=tbn[i+1][0]+"/"+tbd[i+1][0];
       }
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("1.4.",10, 478);
       g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("Решение     - первое целочисленное. Полагаем    = f(   ) = -1 и включаем",40, 478);
       g.drawString("решение     в множество    . Так как     =    , то сравнивать значение    не с чем",12, 498);
       Ind_v(g,"x","1",80,498);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("J    O",269, 498); Ind_f(g,491,498);
       g.drawLine(292,496,305,488);
       g.drawLine(292,497,305,489);
       g.setColor(Color.red);
       Ind_v(g,"x","1",110,478); Ind_v(g,"x","1",419,478);
       Ind_f(g,387,478); g.drawString("= f(   ) = -1",398, 478);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("X",193, 498); Ind_v(g,"","*",206,496);
     }
     if(sh==30){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.0.",10, 478);
       g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("Проверяем выполнение условия    \u2264 2:    = 1 < 2. Положим    = 2. Будем решать",40, 478);
       g.drawString("задачу ЗЛП - 2 без учета тебования целочисленности симплекс-методом: для",12, 498);
       g.drawString("этого запишем расширенную форму ЗЛП - 2",12, 518);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("i",287, 478); g.drawString("i",326, 478); g.drawString("i",462, 478);
       g.setColor(Color.red); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("задачу ЗЛП - 2",12, 498); g.drawString("расширенную форму",122, 518);
     }
     if(sh==36){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.3.2",10, 478);
       g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("Решение задачи ЗЛП - 2 закончено (     \u2264 0), но из                     следует, что",54, 478);
       g.drawString("ограничения задачи ЗЛП - 2 несовместны - множество допутимых решений пусто,",12, 498);
       g.drawString("потому что искусственная переменная     в оптимальном решении не равна нулю",12, 518);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("Таблицы 3",405, 478);
       g.setColor(Color.red); g.drawString("Таблицы 3",405, 478);
       Ind_nk(g,"\u2206","  j",313,478); Ind_n(g,"х",""+bp[2],290,518); g.drawString("\u2264 0",332, 478);
     }
     if(sh==37){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.4.",10, 478);
       g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("Исключаем задачу ЗЛП - 2 из рассмотрения. Проверяем выполнение условия",40, 478);
       g.drawString("\u2264 2:    = 2",21, 498);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("i",12, 498); g.drawString("i",52, 498);
     }
     if(sh==38){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("3.",10, 478);
       g.setColor(new Color(0, 0, 80));
       g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("Так как множество    =    , а множество     содержит единственное решение, то",25, 478);
       g.drawString(",                     - решение исходной задачи.",104, 498);
       g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("J",161, 478); g.drawString("O",185, 478);
       g.drawString("X",300, 478); Ind_v(g,"","*",313,476);
       g.drawLine(184,476,198,466); g.drawLine(184,477,198,467);
       g.setColor(Color.red); g.setFont(new java.awt.Font("SansSerif", 1, 14));
       g.drawString("    =     = (2;3)   f(   ) =    = -1",13, 498);
       Ind_v(g,"x","*",15,498); Ind_v(g,"x","1",40,498);
       Ind_v(g,"x","*",121,498); Ind_f(g,155, 498);
       g.setFont(new java.awt.Font("SansSerif", 3, 11));
       g.drawString("T",98, 493);
     }
     //Всплывающая подсказка
     if((yy>=465) && (yy<=477)){
       String Help=""; int h=700, hl=0;
       if((xx>=11) && (xx<=19)){
         if(sh!=38) Help="Номер задачи ЗЛП";
         else Help="Шаг";
         h=15;
       }
       if((xx>=24) && (xx<=32)){
         if(((sh>1) && (sh<17)) || ((sh>22) && (sh<29)) || ((sh>30) && (sh<37))) Help="Номер таблицы";
         if((sh==1) || (sh==22) || (sh==30)) Help="Шаг";
         if((sh>=17) && (sh<=21)) Help="Шаг";
         if((sh==29) || (sh==37)) Help="Шаг";
         h=28;
       }
       if((xx>=37) && (xx<=45)){
         if(((sh>=2) && (sh<=16)) || ((sh>=18) && (sh<=21)) || ((sh>=23) && (sh<=28)) || ((sh>=31) && (sh<=36)))
           Help="Шаг";
         h=41;
       }
       if((xx>=50) && (xx<=58)){
         if((sh==3) || (sh==5) || (sh==6) || ((sh>=8) && (sh<=10)) || (sh==12) || (sh==13) || (sh==15)
             || (sh==20) || (sh==21)) Help="Подшаг";
         h=54;
       }
       if(Help!=""){
         if(Help=="Номер задачи ЗЛП") hl=Help.length()*7+3;
         if(Help=="Номер таблицы") hl=Help.length()*7+5;
         if(Help=="Шаг") hl=Help.length()*9;
         if(Help=="Подшаг") hl=Help.length()*8;
         g.setColor(new Color(245, 245, 255));
         g.fillRect(h,445,hl,18);
         g.setColor(Color.black); g.setFont(new java.awt.Font("SansSerif", 0, 12));
         g.drawRect(h,445,hl,18);
         g.drawString(Help,h+3,459);
       }
     }
     if(sh==1) jButton3.setEnabled(false);
     else jButton3.setEnabled(true);
     if(sh==38) jButton1.setEnabled(false);
     else jButton1.setEnabled(true);
  }
 }

  void jButton1_actionPerformed(ActionEvent e) {
    sh++;
    if (sh>38) sh=38;
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
//    int a,aa;
  //  a=e.getX()-5;
//    aa=e.getY()-22;
    xx=e.getX()-5;
    yy=e.getY()-22;
  //  jLabel2.setText("x="+Integer.toString(a)+"   y="+Integer.toString(aa));
    jPanel1.repaint();
  }
}
