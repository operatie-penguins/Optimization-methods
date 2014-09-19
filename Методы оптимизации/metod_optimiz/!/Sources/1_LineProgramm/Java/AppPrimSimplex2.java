import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class AppPrimSimplex2 extends JApplet {
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
    this.setSize(new Dimension(676,436));
    this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseMoved(MouseEvent e) {
        this_mouseMoved(e);
      }
    });
    this.getContentPane().setLayout(null);
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel1.setForeground(new Color(130, 0, 80));
    jLabel1.setText("Пример");
    jLabel1.setBounds(new Rectangle(307, 0, 62, 17));
    jPanel1.setBounds(new Rectangle(5,18,666,386));
    jPanel1.setBackground(new Color(247, 247, 255));
    jButton1.setBackground(new Color(220, 230, 255));
    jButton1.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton1.setForeground(new Color(0, 0, 60));
    jButton1.setText("==>");
    jButton1.setBounds(new Rectangle(408, 406, 100, 23));
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton1_actionPerformed(e);
      }
    });
    jButton2.setBackground(new Color(220, 230, 255));
    jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton2.setForeground(new Color(0, 0, 60));
    jButton2.setText("Обновить");
    jButton2.setBounds(new Rectangle(288, 406, 100, 23));
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton2_actionPerformed(e);
      }
    });
    jButton3.setBackground(new Color(220, 230, 255));
    jButton3.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton3.setForeground(new Color(0, 0, 60));
    jButton3.setText("<==");
    jButton3.setBounds(new Rectangle(168, 406, 100, 23));
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

  public void Tabl1(Graphics g, int a, int c, int t, int h, boolean f, int bp[]){ //Рисует верхнюю таблицу
    if(h==0) g.setColor(Color.red); else g.setColor(new Color(180, 0, 80));
    g.setFont(new java.awt.Font("SansSerif", 3, 13));
    if(t>0) g.drawString("Таблица "+t+":",15,183);
    else g.drawString("Таблица:",15,183);
    g.setColor(new Color(255, 255, 255)); g.fillRect(7,187,482,2+17*(3+c));
    g.setColor(Color.black);
    for(int i=0; i<=a+1; i++)
      g.drawLine(128+i*60,188,128+i*60,290);
    for(int i=0; i<=3; i++)
      if(i==0) g.drawLine(8+i*40,188,8+i*40,290);
      else g.drawLine(8+i*40,188,8+i*40,273);
    for(int i=0; i<=3+c; i++)
      if(i==1) g.drawLine(128,188+i*17,488,188+i*17);
      else g.drawLine(8,188+i*17,488,188+i*17);
    g.setColor(new Color(157, 187, 255)); g.drawRect(7,187,482,2+17*(3+c));
    g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 13));
    if (f==true){
      g.drawString("БП",59,210); g.drawString("БР",99,210);
      g.drawString("БР/",139+60*a,219); Ind_nk(g,"a","ir",162+60*a,219);
      Ind_nk(g,"c","i",23,210); Ind_nk(g,"c","j",153+a*60,199);
      for(int i=1; i<=a; i++)
        Ind_n(g,"x",""+i,153+(i-1)*60,216);
      for(int i=0; i<c; i++)
        if(bp[i]>0) Ind_n(g,"x",""+bp[i],62,233+i*17);
      Ind_nbk(g,"\u2206","  j",153+a*60,235+c*17);
    }
  }

  public void Tb1(Graphics g, int a, int c,int tbn[][], int tbd[][], int bp[]){ //Заполняет верхнюю таблицу
    g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
    int l=0;
    String jj=""; int ii;
    for (int i=0; i<=c; i++)
      for (int j=0; j<=a; j++){
        int p; g.setColor(new Color(0, 0, 160));
        if(i==0) g.setColor(new Color(0, 0, 80));//g.setColor(new Color(150, 0, 80));
        if (j==0) p=40; else p=60;
        if(tbn[i][j]<20000){
          if((tbd[i][j]==1) || (tbn[i][j]==0)) jj=""+tbn[i][j];
          else jj=tbn[i][j]+"/"+tbd[i][j];
          ii=(int)(88+(p-40)*(3*j-1)+(p-jj.length()*8)/2);
          if (i==0){
            if (tbn[i][j]==1000) g.drawString("M",ii+10,202);
            else if (tbn[i][j]==-1000) g.drawString("-M",ii+10,202);
                 else g.drawString(jj,ii,202);
          }
          else g.drawString(jj,ii,219+i*17);
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
        ii=(int)(68+j*60+l/2);
        g.drawString(jj,ii,236+c*17);
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
      }
    }
    g.setColor(new Color(0, 0, 80));//g.setColor(new Color(90, 0, 90));
    for (int i=0; i<c; i++){
      if((bp[i]<20000) && (tbn[0][bp[i]]<20000)){
        jj=""+tbn[0][bp[i]];
        ii=(int)(8+(40-jj.length()*8)/2);
        if (tbn[0][bp[i]]==1000) g.drawString("M",ii+10,236+i*17);
        else if (tbn[0][bp[i]]==-1000) g.drawString("-M",ii+10,236+i*17);
             else g.drawString(jj,ii,236+i*17);
      }
    }
    g.setColor(new Color(0, 0, 80));//g.setColor(new Color(130, 0, 130));
    for(int i=1; i<=c; i++){
      jj="";
      if((tbn[i][8]<20000)&&(tbn[i][8]>-20000)){
        if(tbd[i][8]==1)
          jj=""+tbn[i][8];
        else jj=""+tbn[i][8]+"/"+tbd[i][8];
        ii=(int)(128+60*a+(60-jj.length()*8)/2);
        g.drawString(jj,ii,236+(i-1)*17);
      }
      if(tbn[i][8]==-20000){
        jj="--";
        ii=(int)(130+60*a+(60-jj.length()*8)/2);
        g.drawString(jj,ii,236+(i-1)*17);
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
  public void Valuation(int a, int c, int tbn[][], int tbd[][], int nm[], String sm[]){ //Находит максимальную по модулю отрицательную оценку
    double min=0.0; int minn=0, mind=1;
       for(int i=1; i<=a; i++)
         if((tbn[4][i]<0) && (min>(double)tbn[4][i]/tbd[4][i])){
           min=tbn[4][i]/tbd[4][i];
           nm[0]=i; minn=tbn[4][i]; mind=tbd[4][i];
         }
       int k;
       if(minn<20000){
         k=(int)Math.round(minn/1000.0);
         if(mind==1){
           if((k>=1)||(k<=-1)){
             if (minn-k*1000>0){
               if(k==1) sm[0]="M+"+(minn-k*1000);
               else if(k==-1) sm[0]="-M+"+(minn-k*1000);
                    else sm[0]=k+"M+"+(minn-k*1000);
             }
             else if (minn-k*1000<0){
                    if(k==1) sm[0]="M-"+(k*1000-minn);
                    else if(k==-1) sm[0]="-M-"+(k*1000-minn);
                         else sm[0]=k+"M-"+(k*1000-minn);
                  }
                  else{
                    if(k==1) sm[0]="M";
                    else if(k==-1) sm[0]="-M";
                         else sm[0]=k+"M";
                  }
           }
           else sm[0]=""+minn;
         }
         else{
           if((k>=1)||(k<=-1)){
             if (minn-k*1000>0){
               if(k==1) sm[0]="("+"M+"+(minn-k*1000)+")/"+mind;
               else if(k==-1) sm[0]="("+"-M+"+(minn-k*1000)+")/"+mind;
                    else sm[0]="("+k+"M+"+(minn-k*1000)+")/"+mind;
               }
             else if (minn-k*1000<0){
                    if(k==1) sm[0]="("+"M-"+(k*1000-minn)+")/"+mind;
                    else if(k==-1) sm[0]="("+"-M-"+(k*1000-minn)+")/"+mind;
                         else sm[0]="("+k+"M-"+(k*1000-minn)+")/"+mind;
                  }
                  else{
                    if(k==1) sm[0]="M/"+mind;
                    else if(k==-1) sm[0]="-M/"+mind;
                         else sm[0]="M/"+mind;
                  }
           }
           else sm[0]=minn+"/"+mind;
         }
       }
  }

  class  Panel_mypaint extends JPanel {
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Stringer.setGraphics(g);
      Stringer1.setGraphics(g);
      String s[]={"","","","","","",""}, sm[]={""}, ss="", jj="";
      int n=0, p=0, z=0, l=0, a=5, c=3, nm[]={0},
          bp[]={3,4,5,0},
          tbn[][]={ {20000,2,-3,0,0,0,20000,20000,20000},
                  {7,1,-2,1,0,0,20000,20000,20000},
                  {12,2,-1,0,1,0,20000,20000,20000},
                  {5,3,0,0,0,1,20000,20000,20000},
                  {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                  {20000,20000,20000,20000,20000,20000,20000,20000,20000} },
          tbd[][]={ {1,1,1,1,1,1,1,1,1},
                    {1,1,1,1,1,1,1,1,1},
                    {1,1,1,1,1,1,1,1,1},
                    {1,1,1,1,1,1,1,1,1},
                    {1,1,1,1,1,1,1,1,1},
                    {1,1,1,1,1,1,1,1,1} };
      g.setColor(new Color(180, 0, 80));
      g.setFont(new java.awt.Font("SansSerif", 3, 13));
      g.drawString("Задача:  ",65,15);
      g.drawString("Решение:",15,306);
      g.drawString("Обозначения:",525,57);
      g.drawString("Формулы:",517,182);
      g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
      Stringer.drawString("Найти решение f(x) = 2 x_{1} - 3 x_{2} \u2192 min  при ограничениях",120,15);
      Stringer.drawString("x_{1} - 2 x_{2} \u2264 7,  2 x_{1} - x_{2} \u2264 12,  3 x_{1} \u2264 5,   x_{1}, x_{2} \u2265 0, где x_{1}, x_{2} - целые, симплекс-методом",35,35);
      g.setColor(new Color(255, 255, 255));
      g.fillRect(7,62,172,105); g.fillRect(199,62,290,105); g.fillRect(509,62,150,105); g.fillRect(509,187,150,104); g.fillRect(7,311,652,70);
      g.setColor(new Color(157, 187, 255));
      g.drawRect(7,62,172,105); g.drawRect(199,62,290,105); g.drawRect(509,62,150,105);  g.drawRect(509,187,150,104); g.drawRect(7,311,652,70);
      g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 13));
      g.drawString("БП",520,90); g.drawString("БР",520,132);
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      g.drawString("- базисные",541,90); g.drawString("переменные",551,108);
      g.drawString("- базисное",541,132); g.drawString("решение",551,150);

      if(sh>=1){
        g.setColor(Color.red);
        if(sh==1) g.drawRect(7,62,172,105);
        if(sh==2) g.drawRect(199,62,290,105);
        g.setColor(new Color(180, 0, 80));
        g.setFont(new java.awt.Font("SansSerif", 3, 13));
        g.drawString("Задача:",13,57); g.drawString("Каноническая форма:",213,57);
        if(sh==1) g.setColor(Color.red); g.drawString("Задача:",13,57); g.setColor(new Color(180, 0, 80));
        if(sh==2) g.setColor(Color.red); g.drawString("Каноническая форма:",213,57);
        g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
        if(sh>=2){
          Stringer.drawString("f(x) = 2 x_{1} - 3 x_{2} + 0 x_{3} + 0 x_{4} + 0 x_{5} \u2192 min",204,77);
          Stringer.drawString("x_{1} - 2 x_{2} + 1 x_{3} + 0 x_{4} + 0 x_{5} = 7,",255,99);
          Stringer.drawString("2 x_{1} - 1 x_{2} + 0 x_{3} + 1 x_{4} + 0 x_{5} = 12,",243,119);
          Stringer.drawString("3 x_{1} + 0 x_{2} + 0 x_{3} + 0 x_{4} + 1 x_{5} =  5,",243,139);
          Stringer.drawString("x_{1},...,x_{5} \u2265 0.",317,159);
        }
        Stringer.drawString("f(x) = 2 x_{1} - 3 x_{2} \u2192 min",16,77);
        Stringer.drawString("x_{1} - 2 x_{2} \u2264 7,",50,99);
        Stringer.drawString("2 x_{1} - x_{2} \u2264 12,",44,119);
        Stringer.drawString("x_{1} \u2264 5,",73,139);
        Stringer.drawString("x_{1}, x_{2} \u2265 0.",62,159);
      }
      //Формулы
       if((sh>=7) && (sh<=11)){ g.setColor(Color.red); Stringer.Strelka(g,170,80);}
       else g.setColor(new Color(0, 0, 80));
       Ind_nbk(g,"\u2206","  j",550,202);
       Stringer1.drawString("= c_{j} - z_{j}",569,202);
       Stringer1.drawString("z_{j } = \u2211 c_{jB} a_{ij}",543,220);
       Stringer1.drawString("j = 1,...,m+n",547,240);
       Stringer1.drawString("i = 1,...,m",555,257);
       if((sh==12)){ g.setColor(Color.red); Stringer.Strelka(g,167,140);}
       else g.setColor(new Color(0, 0, 80));
       Ind_nbk(g,"\u2206","  r",539,277);
       Ind_nbk(g,"\u2206","  r",613,277);
       Stringer1.drawString("|     | = max |     |",534,277);
       g.setFont(new java.awt.Font("SansSerif", 1, 11));
       g.drawString("\u2206  < 0",578,287);
       g.setFont(new java.awt.Font("SansSerif", 2, 9));
       g.drawString(" r",585,289);

      if(sh<14){
      if(sh==3){
        Tabl1(g,a,c,0,0,true,bp);
        g.setColor(new Color(255, 255, 255));
        g.fillRect(49,223,39,50);
        g.fillRect(129,206,299,16);
        g.setColor(Color.black);
        for(int i=0; i<a; i++)
            g.drawLine(188+i*60,206,188+i*60,223);
        g.drawLine(49,239,88,239);
        g.drawLine(49,256,88,256);
      }
      if(sh>=4){
        Tabl1(g,a,c,0,1,true,bp);
        Tb1(g,a,c,tbn,tbd,bp);
      }
      if(sh==4){
        g.setColor(new Color(255, 255, 255));
        g.fillRect(9,223,419,50);
        g.setColor(Color.black);
        for(int i=0; i<3; i++)
            g.drawLine(48+i*40,223,48+i*40,274);
        for(int i=0; i<a; i++)
            g.drawLine(188+i*60,223,188+i*60,274);
        g.drawLine(9,239,428,239);
        g.drawLine(9,256,428,256);
      }
       if(sh==5){
        g.setColor(new Color(255, 255, 255));
        g.fillRect(129,223,299,50);
        g.setColor(Color.black);
        for(int i=0; i<a; i++)
            g.drawLine(188+i*60,223,188+i*60,274);
        g.drawLine(129,239,428,239);
        g.drawLine(129,256,428,256);
      }
      if(sh>=7){
        ModifyArray(a,c,tbn,tbd,bp);
        Tb1(g,a,c,tbn,tbd,bp);
      }
      if((sh>=7) && (sh<=11))
      {
        g.setColor(new Color(255, 255, 255));
        g.fillRect(189+(sh-7)*60,223+17*c,60*(a-1-(sh-7))-1,16);
        g.setColor(Color.black);
        for(int i=0; i<a; i++)
            g.drawLine(248+i*60,274,248+i*60,290);
        g.setColor(new Color(0,0,255));
        for(int i=0; i<=2;i++)
        {
           Stringer.drawString(""+tbn[0][bp[i]],24,236+i*17);
        }
        if(sh==7)
        {
          for(int i=1; i<=3;i++)
          {
             Stringer.drawString(""+tbn[i][1],154,219+i*17);
          }
          g.setColor(Color.red);
          Stringer.drawString(""+tbn[0][1],154,202);
          g.setColor(new Color (180,0,80));
          Stringer.drawString(""+tbn[4][1],154,287);
        }
        if(sh==8)
        {
          for(int i=1; i<3;i++)
          {
             Stringer.drawString(""+tbn[i][2],210,219+i*17);
          }
          Stringer.drawString(""+tbn[3][2],214,219+3*17);
          g.setColor(Color.red);
          Stringer.drawString(""+tbn[0][2],210,202);
          g.setColor(new Color (180,0,80));
          Stringer.drawString(""+tbn[4][2],210,287);
        }
        if(sh==9)
        {
          for(int i=1; i<=3;i++)
          {
             Stringer.drawString(""+tbn[i][3],274,219+i*17);
          }
          g.setColor(Color.red);
          Stringer.drawString(""+tbn[0][3],274,202);
          g.setColor(new Color (180,0,80));
          Stringer.drawString(""+tbn[4][3],274,287);
        }
        if(sh==10)
        {
          for(int i=1; i<=3;i++)
          {
             Stringer.drawString(""+tbn[i][4],334,219+i*17);
          }
          g.setColor(Color.red);
          Stringer.drawString(""+tbn[0][4],334,202);
          g.setColor(new Color (180,0,80));
          Stringer.drawString(""+tbn[4][4],334,287);
        }
        if(sh==11)
        {
          for(int i=1; i<=3;i++)
          {
             Stringer.drawString(""+tbn[i][5],394,219+i*17);
          }
          g.setColor(Color.red);
          Stringer.drawString(""+tbn[0][5],394,202);
          g.setColor(new Color (180,0,80));
          Stringer.drawString(""+tbn[4][5],394,287);
        }
      }
      if((sh==12) || (sh==13))
      {
        g.setColor(new Color(230, 230, 255));
        g.fillRect(189,189,59,16+17*5);
        g.setColor(Color.black);
        for(int i=0; i<=c+1; i++)
           g.drawLine(188,205+i*17,289,205+i*17);
        Tb1(g,a,c,tbn,tbd,bp);
        g.setColor(new Color (0,0,80));
        Stringer.drawString("x_{2}",213,216);
        g.setColor(Color.red);
        Stringer.drawString(""+tbn[4][1],154,287);
      }
      if(sh>=13)
      {
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
          Tb1(g,a,c,tbn,tbd,bp);
          g.setColor(Color.red);
          for(int i=1; i<3;i++)
          {
             Stringer.drawString(""+tbn[i][2],210,219+i*17);
          }
          Stringer.drawString(""+tbn[3][2],214,219+3*17);
       }
      }

     //Коментарии
    if(sh==2){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("1.",10, 331);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Приведем исходную задачу к канонической форме.",26, 331);
     }
     if(sh==3){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.",10, 331);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Исходные данные занесем в симплекс-таблицу.",26, 331);
     }
     if(sh==4){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.1.",10, 331);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Занесем в                 переменные и коэффициенты при них.",40, 331);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("Таблицу",117, 331);
     }
     if(sh==5){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.2.",10, 331);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Занесем в                 базисные переменные, их коэффициенты и свободные члены.",40, 331);
       g.setFont(new java.awt.Font("SansSerif", 3, 14));
       g.drawString("Таблицу",117, 331);
     }
     if(sh==6){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("2.3.",10, 331);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Занесем в таблицу оставшиеся коэффициенты.",40, 331);
     }
     if(sh==7){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("3.1.",10, 331);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Вычислим значениe      = c_{1} - z_{1} по вышеприведенной формуле",40, 331);
       Stringer.drawString("= "+tbn[0][1]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][1]+" + "+tbn[0][bp[1]]+" * "+tbn[2][1]+" + "+tbn[0][bp[2]]+" * "+tbn[3][1]+" ) = "+tbn[4][1]+".",245, 356);
       Ind_nb(g,"\u2206","  1",192,331); Ind_nb(g,"\u2206","  1",225,356);
       g.setColor(new Color (180,0,80));
       Stringer.drawString("= "+tbn[0][1]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][1]+" + "+tbn[0][bp[1]]+" * "+tbn[2][1]+" + "+tbn[0][bp[2]]+" * "+tbn[3][1]+" ) = "+tbn[4][1],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][1]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][1]+" + "+tbn[0][bp[1]]+" * "+tbn[2][1]+" + "+tbn[0][bp[2]]+" * "+tbn[3][1]+" ) = ",245, 356);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][1]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][1]+" + "+tbn[0][bp[1]]+" * "+tbn[2][1]+" + "+tbn[0][bp[2]]+" * "+tbn[3][1],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][1]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][1]+" + "+tbn[0][bp[1]]+" * "+tbn[2][1]+" + "+tbn[0][bp[2]]+" * ",245, 356);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][1]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][1]+" + "+tbn[0][bp[1]]+" * "+tbn[2][1]+" + "+tbn[0][bp[2]],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][1]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][1]+" + "+tbn[0][bp[1]]+" * "+tbn[2][1]+" + ",245, 356);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][1]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][1]+" + "+tbn[0][bp[1]]+" * "+tbn[2][1],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][1]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][1]+" + "+tbn[0][bp[1]]+" * ",245, 356);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][1]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][1]+" + "+tbn[0][bp[1]],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][1]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][1]+" + ",245, 356);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][1]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][1],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][1]+" - ( "+tbn[0][bp[0]]+" * ",245, 356);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][1]+" - ( "+tbn[0][bp[0]],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][1]+" - ( ",245, 356);
       g.setColor(Color.red);
       Stringer.drawString("= "+tbn[0][1],245, 356);
     }
     if(sh==8){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("3.2.",10, 331);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Вычислим значениe      = c_{2} - z_{2} по вышеприведенной формуле",40, 331);
       Stringer.drawString("= "+tbn[0][2]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][2]+" + "+tbn[0][bp[1]]+" * "+tbn[2][2]+" + "+tbn[0][bp[2]]+" * "+tbn[3][2]+" ) = "+tbn[4][2]+".",245, 356);
       Ind_nb(g,"\u2206","  2",192,331); Ind_nb(g,"\u2206","  2",225,356);
       g.setColor(new Color (180,0,80));
       Stringer.drawString("= "+tbn[0][2]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][2]+" + "+tbn[0][bp[1]]+" * "+tbn[2][2]+" + "+tbn[0][bp[2]]+" * "+tbn[3][2]+" ) = "+tbn[4][2],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][2]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][2]+" + "+tbn[0][bp[1]]+" * "+tbn[2][2]+" + "+tbn[0][bp[2]]+" * "+tbn[3][2]+" ) = ",245, 356);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][2]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][2]+" + "+tbn[0][bp[1]]+" * "+tbn[2][2]+" + "+tbn[0][bp[2]]+" * "+tbn[3][2],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][2]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][2]+" + "+tbn[0][bp[1]]+" * "+tbn[2][2]+" + "+tbn[0][bp[2]]+" * ",245, 356);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][2]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][2]+" + "+tbn[0][bp[1]]+" * "+tbn[2][2]+" + "+tbn[0][bp[2]],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][2]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][2]+" + "+tbn[0][bp[1]]+" * "+tbn[2][2]+" + ",245, 356);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][2]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][2]+" + "+tbn[0][bp[1]]+" * "+tbn[2][2],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][2]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][2]+" + "+tbn[0][bp[1]]+" * ",245, 356);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][2]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][2]+" + "+tbn[0][bp[1]],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][2]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][2]+" + ",245, 356);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][2]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][2],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][2]+" - ( "+tbn[0][bp[0]]+" * ",245, 356);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][2]+" - ( "+tbn[0][bp[0]],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][2]+" - ( ",245, 356);
       g.setColor(Color.red);
       Stringer.drawString("= "+tbn[0][2],245, 356);
     }
     if(sh==9){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("3.3.",10, 331);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Вычислим значениe      = c_{3} - z_{3} по вышеприведенной формуле",40, 331);
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][3]+" + "+tbn[0][bp[1]]+" * "+tbn[2][3]+" + "+tbn[0][bp[2]]+" * "+tbn[3][3]+" ) = "+tbn[4][3]+".",245, 356);
       Ind_nb(g,"\u2206","  3",192,331); Ind_nb(g,"\u2206","  3",225,356);
       g.setColor(new Color (180,0,80));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][3]+" + "+tbn[0][bp[1]]+" * "+tbn[2][3]+" + "+tbn[0][bp[2]]+" * "+tbn[3][3]+" ) = "+tbn[4][3],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][3]+" + "+tbn[0][bp[1]]+" * "+tbn[2][3]+" + "+tbn[0][bp[2]]+" * "+tbn[3][3]+" ) = ",245, 356);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][3]+" + "+tbn[0][bp[1]]+" * "+tbn[2][3]+" + "+tbn[0][bp[2]]+" * "+tbn[3][3],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][3]+" + "+tbn[0][bp[1]]+" * "+tbn[2][3]+" + "+tbn[0][bp[2]]+" * ",245, 356);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][3]+" + "+tbn[0][bp[1]]+" * "+tbn[2][3]+" + "+tbn[0][bp[2]],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][3]+" + "+tbn[0][bp[1]]+" * "+tbn[2][3]+" + ",245, 356);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][3]+" + "+tbn[0][bp[1]]+" * "+tbn[2][3],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][3]+" + "+tbn[0][bp[1]]+" * ",245, 356);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][3]+" + "+tbn[0][bp[1]],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][3]+" + ",245, 356);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][3],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * ",245, 356);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][3]+" - ( ",245, 356);
       g.setColor(Color.red);
       Stringer.drawString("= "+tbn[0][3],245, 356);
     }
     if(sh==10){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("3.4.",10, 331);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Вычислим значениe      = c_{4} - z_{4} по вышеприведенной формуле",40, 331);
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][4]+" + "+tbn[0][bp[1]]+" * "+tbn[2][4]+" + "+tbn[0][bp[2]]+" * "+tbn[3][4]+" ) = "+tbn[4][4]+".",245, 356);
       Ind_nb(g,"\u2206","  4",192,331); Ind_nb(g,"\u2206","  4",225,356);
       g.setColor(new Color (180,0,80));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][4]+" + "+tbn[0][bp[1]]+" * "+tbn[2][4]+" + "+tbn[0][bp[2]]+" * "+tbn[3][4]+" ) = "+tbn[4][4],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][4]+" + "+tbn[0][bp[1]]+" * "+tbn[2][4]+" + "+tbn[0][bp[2]]+" * "+tbn[3][4]+" ) = ",245, 356);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][4]+" + "+tbn[0][bp[1]]+" * "+tbn[2][4]+" + "+tbn[0][bp[2]]+" * "+tbn[3][4],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][4]+" + "+tbn[0][bp[1]]+" * "+tbn[2][4]+" + "+tbn[0][bp[2]]+" * ",245, 356);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][4]+" + "+tbn[0][bp[1]]+" * "+tbn[2][4]+" + "+tbn[0][bp[2]],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][4]+" + "+tbn[0][bp[1]]+" * "+tbn[2][4]+" + ",245, 356);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][4]+" + "+tbn[0][bp[1]]+" * "+tbn[2][4],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][4]+" + "+tbn[0][bp[1]]+" * ",245, 356);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][4]+" + "+tbn[0][bp[1]],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][4]+" + ",245, 356);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][4],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]]+" * ",245, 356);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][3]+" - ( "+tbn[0][bp[0]],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][3]+" - ( ",245, 356);
       g.setColor(Color.red);
       Stringer.drawString("= "+tbn[0][3],245, 356);
     }
     if(sh==11){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("3.5.",10, 331);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("Вычислим значениe      = c_{5} - z_{5} по вышеприведенной формуле",40, 331);
              Stringer.drawString("= "+tbn[0][5]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][5]+" + "+tbn[0][bp[1]]+" * "+tbn[2][5]+" + "+tbn[0][bp[2]]+" * "+tbn[3][5]+" ) = "+tbn[4][5]+".",245, 356);
       Ind_nb(g,"\u2206","  5",192,331); Ind_nb(g,"\u2206","  5",225,356);
       g.setColor(new Color (180,0,80));
       Stringer.drawString("= "+tbn[0][5]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][5]+" + "+tbn[0][bp[1]]+" * "+tbn[2][5]+" + "+tbn[0][bp[2]]+" * "+tbn[3][5]+" ) = "+tbn[4][5],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][5]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][5]+" + "+tbn[0][bp[1]]+" * "+tbn[2][5]+" + "+tbn[0][bp[2]]+" * "+tbn[3][5]+" ) = ",245, 356);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][5]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][5]+" + "+tbn[0][bp[1]]+" * "+tbn[2][5]+" + "+tbn[0][bp[2]]+" * "+tbn[3][5],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][5]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][5]+" + "+tbn[0][bp[1]]+" * "+tbn[2][5]+" + "+tbn[0][bp[2]]+" * ",245, 356);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][5]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][5]+" + "+tbn[0][bp[1]]+" * "+tbn[2][5]+" + "+tbn[0][bp[2]],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][5]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][5]+" + "+tbn[0][bp[1]]+" * "+tbn[2][5]+" + ",245, 356);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][5]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][5]+" + "+tbn[0][bp[1]]+" * "+tbn[2][5],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][5]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][5]+" + "+tbn[0][bp[1]]+" * ",245, 356);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][5]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][5]+" + "+tbn[0][bp[1]],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][5]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][5]+" + ",245, 356);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][5]+" - ( "+tbn[0][bp[0]]+" * "+tbn[1][5],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][5]+" - ( "+tbn[0][bp[0]]+" * ",245, 356);
       g.setColor(new Color(0,0,255));
       Stringer.drawString("= "+tbn[0][5]+" - ( "+tbn[0][bp[0]],245, 356);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("= "+tbn[0][5]+" - ( ",245, 356);
       g.setColor(Color.red);
       Stringer.drawString("= "+tbn[0][5],245, 356);
     }
     if(sh==12){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("4.",10, 331);
       g.setColor(new Color(0, 0, 80));
       Stringer1.drawString("Выберем максимальное по модулю отрицательное значение |     | по вышеприведенной",25, 331);
       Stringer.drawString("формуле.      = -3 - выбранное значение. Тогда столбец x_{2} - ведущий. Переменную x_{2}",12, 351);
       Stringer.drawString("вводим в базис.",12, 371);
       Ind_nbk(g,"\u2206","  r",477,331);
       g.setColor(Color.red);
       Ind_nb(g,"\u2206","  2",86,351);
       Stringer.drawString("формуле.      = -3",12,351);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("формуле.",12,351);
     }
     if(sh==13){
       g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
       g.drawString("5.",10, 331);
       g.setColor(new Color(0, 0, 80));
       Stringer1.drawString("Выберем ведущую строку. Все a_{ir} \u2264 0, следовательно, функция f(x) не ограничена на",25, 331);
       Stringer.drawString("допустимом множистве.",12, 351);
       g.setColor(Color.red);
       Stringer1.drawString("Выберем ведущую строку. Все a_{ir}",25, 331);
       g.setColor(new Color(0, 0, 80));
       Stringer1.drawString("Выберем ведущую строку. Все",25, 331);
     }
     if(sh==1) jButton3.setEnabled(false);
     else jButton3.setEnabled(true);
     if(sh==13) jButton1.setEnabled(false);
     else jButton1.setEnabled(true);
  }
 }

  void jButton1_actionPerformed(ActionEvent e) {
    sh++;
    if (sh>13) sh=13;
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
 //   jLabel2.setText("x="+Integer.toString(a)+"   y="+Integer.toString(aa));
    jPanel1.repaint();
  }
}
