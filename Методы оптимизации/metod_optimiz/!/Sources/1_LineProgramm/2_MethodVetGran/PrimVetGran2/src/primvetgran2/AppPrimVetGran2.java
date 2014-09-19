package primvetgran2;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class AppPrimVetGran2 extends JApplet {
  JButton jButton1 = new JButton();
  JButton jButton2 = new JButton();
  JButton jButton3 = new JButton();
  JLabel jLabel1 = new JLabel();
  Panel_mypaint jPanel1 = new Panel_mypaint();
  public int sh=1;

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
    this.setSize(new Dimension(695, 485));
    this.getContentPane().setLayout(null);
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel1.setForeground(new Color(130, 0, 80));
    jLabel1.setText("Пример");
    jLabel1.setBounds(new Rectangle(310, 4, 62, 17));
    jPanel1.setBounds(new Rectangle(5,21,684,421));
    jPanel1.setBackground(new Color(247, 247, 255));
    jButton1.setBackground(new Color(220, 230, 255));
    jButton1.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton1.setForeground(new Color(0, 0, 60));
    jButton1.setText("==>");
    jButton1.setBounds(new Rectangle(417, 455, 100, 23));
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton1_actionPerformed(e);
      }
    });
    jButton2.setBackground(new Color(220, 230, 255));
    jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton2.setForeground(new Color(0, 0, 60));
    jButton2.setText("Обновить");
    jButton2.setBounds(new Rectangle(297, 455, 100, 23));
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton2_actionPerformed(e);
      }
    });
    jButton3.setBackground(new Color(220, 230, 255));
    jButton3.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton3.setForeground(new Color(0, 0, 60));
    jButton3.setText("<==");
    jButton3.setBounds(new Rectangle(177, 455, 100, 23));
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton3_actionPerformed(e);
      }
    });
    this.getContentPane().add(jPanel1, null);
    this.getContentPane().add(jButton1, null);
    this.getContentPane().add(jButton2, null);
    this.getContentPane().add(jButton3, null);
    this.getContentPane().add(jLabel1, null);
  }

  public void Ind_n(Graphics g,String a, String b, int x, int y){
    g.setFont(new java.awt.Font("SansSerif", 1, 15));
    g.drawString(""+a,x,y);
    g.setFont(new java.awt.Font("SansSerif", 1, 11));
    g.drawString(""+b+" ",x+a.length()*8,y+5);
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
    g.setFont(new java.awt.Font("SansSerif", 1, 11));
    g.drawString(""+c+" ",x+a.length()*8,y+5);
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
  }
  public void Ind_f(Graphics g, int x, int y){
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
    g.drawString("f",x,y);
    g.drawLine(x-2,y+2,x+5,y+2);
    g.drawLine(x-2,y+1,x+5,y+1);
  }

  class  Panel_mypaint extends JPanel {
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Stringer.setGraphics(g);
      g.setColor(new Color(180, 0, 80));
      g.setFont(new java.awt.Font("SansSerif", 3, 13));
      g.drawString("Задача:  ",12,17);
      g.drawString("Графическая иллюстрация:",15,62);
      g.drawString("Схема решения:",278,62);
      g.drawString("Множество задач подлежащих ветвлению:",15,304);
      g.drawString("Множество возможных оптимальных решений:",340,304);
      g.drawString("Решение:  ",15,347);
      g.setColor(new Color(0, 0, 80));
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      Stringer.drawString("Найти целочисленное решение задачи  f(x) = x_{1}+ 2 x_{2} \u2192 max  при ограничениях",71,17);
      Stringer.drawString("x_{1}+ x_{2} \u2264 4,  x_{2} \u2264 2.8,  x_{1}, x_{2} \u2265 0, где x_{1}, x_{2} - целые, методом ветвей и границ",92,37);
      g.setColor(new Color(255, 255, 255));
      g.fillRect(7,67,240,220); g.fillRect(267,67,410,220); g.fillRect(7,350,670,70); g.fillRect(7,307,305,23); g.fillRect(332,307,347,23);
      g.setColor(new Color(157, 187, 255));
      g.drawRect(7,67,240,220); g.drawRect(267,67,410,220); g.drawRect(7,350,670,70); g.drawRect(7,307,305,23); g.drawRect(332,307,347,23);
      //График
      g.setColor(Color.black);
      g.drawLine(27,73,27,286);
      g.drawLine(8,267,242,267);
      Ind_n(g,"x","2",11,78); Ind_n(g,"x","1",232,279);
      int a1[]={22,27,32}, b1[]={74,67,74};
      int a2[]={241,246,241}, b2[]={262,267,272};
      g.fillPolygon(a1,b1,3);
      g.fillPolygon(a2,b2,3);
      int i;
      g.setFont(new java.awt.Font("SansSerif", 1, 11));
      g.setColor(Color.darkGray);
      g.drawString("0",17,281);
      for(i=0; i<4; i++){
        g.setColor(Color.black);
        g.drawLine(24,227-40*i,30,227-40*i);
        g.drawLine(67+40*i,264,67+40*i,270);
        g.setColor(Color.darkGray);
        g.drawString(""+(i+1),65+40*i,281);
      }
      for(i=0; i<4; i++)
        g.drawString(""+(i+1),17,232-40*i);
      if((sh>=1) && (sh<=3)){
        g.setColor(new Color(0, 0, 80));
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("+     = 4",165,221);
        Ind_n(g,"x","1",150,220); Ind_n(g,"x","2",176,220);
        g.drawString("= 2.8",185,149);
        Ind_n(g,"x","2",170,148);
        g.drawLine(8,88,206,286); g.drawLine(8,89,206,287);
        g.drawLine(8,155,246,155); g.drawLine(8,156,246,156);
        g.setColor(new Color(227, 227, 255));
        int a3[]={28,75,186,28}, b3[]={157,157,267,267};
        g.fillPolygon(a3,b3,4);
        for(i=0; i<4; i++){
          g.setColor(Color.black);
          g.drawLine(24,227-40*i,30,227-40*i);
          g.drawLine(67+40*i,264,67+40*i,270);
        }
        g.setColor(new Color(0, 0, 80));
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        for (i=157; i<267; i=i+4)
          g.drawLine(75,i,75,i+2);
        g.drawLine(27,267,27+40,267-2*40);
        int a4[]={61,67,68}, b4[]={191,187,194};
        g.fillPolygon(a4,b4,3);
        for(i=27; i<61; i=i+7)
          g.drawLine(i+6,187,i+10,187);
        for(i=267; i>193; i=i-7)
          g.drawLine(67,i-6,67,i-10);
        g.drawString("\u25bcf",40,257);
        if(sh==1) g.setColor(Color.red);
        else g.setColor(new Color(180, 0, 80));
        g.drawString("ЗЛП - 0",105,82);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        if(sh==1) g.setColor(Color.red);
        else g.setColor(new Color(0, 0, 80));
        g.drawString("A",75,150);
        g.setColor(Color.red);
        g.fillOval(74,154,4,4);
      }
      if((sh>=6) && (sh<=7)){
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        if (sh==6) g.setColor(Color.red);
        else g.setColor(new Color(180, 0, 80));
        g.drawString("ЗЛП - 1",105,82);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        if (sh==6) g.setColor(Color.red);
        else g.setColor(new Color(0, 0, 80));
        g.drawString("B",75,150);
        g.setColor(new Color(0, 0, 80));
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("+     = 4",165,221);
        Ind_n(g,"x","1",150,220); Ind_n(g,"x","2",176,220);
        g.drawString("= 2.8",185,149);
        Ind_n(g,"x","2",170,148);
        Ind_n(g,"x","1",73,110); g.drawString("= 1",89,111);
        g.drawLine(8,88,206,286); g.drawLine(8,89,206,287);
        g.drawLine(8,155,246,155); g.drawLine(8,156,246,156);
        g.setColor(new Color(255, 255, 255));
        g.fillRect(63,270,10,10);
        g.setFont(new java.awt.Font("SansSerif", 1, 11));
        g.setColor(Color.darkGray);
        g.drawString("1",60,281);
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.setColor(new Color(0, 0, 80));
        g.drawLine(67,68,67,286); g.drawLine(68,68,68,286);
        g.setColor(new Color(227, 227, 255));
        int a9[]={28,67,67,28}, b9[]={157,157,267,267};
        g.fillPolygon(a9,b9,4);
        for(i=0; i<4; i++){
          g.setColor(Color.black);
          g.drawLine(24,227-40*i,30,227-40*i);
          g.drawLine(67+40*i,264,67+40*i,270);
        }
        g.setColor(new Color(0, 0, 80));
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawLine(27,267,27+40,267-2*40);
        int a4[]={61,67,68}, b4[]={191,187,194};
        g.fillPolygon(a4,b4,3);
        for(i=27; i<61; i=i+7){
          g.drawLine(i+6,187,i+10,187);
        }
        g.drawString("\u25bcf",40,257);
        g.setColor(Color.red);
        g.fillOval(66,154,4,4);
      }
      if(((sh>=9) && (sh<=10)) || (sh==21)){
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        if(sh==9) g.setColor(Color.red);
        else g.setColor(new Color(180, 0, 80));
        g.drawString("ЗЛП - 2",117,82);
        if((sh==9) || (sh==21)) g.setColor(Color.red);
        else g.setColor(new Color(0, 0, 80));
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        if(sh==21) Ind_v(g,"x","*",113,190);
        else g.drawString("C",113,190);
        g.setColor(new Color(0, 0, 80));
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("+     = 4",165,221);
        Ind_n(g,"x","1",150,220); Ind_n(g,"x","2",176,220);
        g.drawString("= 2.8",185,149);
        Ind_n(g,"x","2",170,148);
        Ind_n(g,"x","1",113,110); g.drawString("= 2",129,111);
        g.drawLine(8,88,206,286); g.drawLine(8,89,206,287);
        g.drawLine(8,155,246,155); g.drawLine(8,156,246,156);
        g.setColor(new Color(255, 255, 255));
        g.fillRect(103,270,10,15);
        g.setFont(new java.awt.Font("SansSerif", 1, 11));
        g.setColor(Color.darkGray);
        g.drawString("2",100,281);
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.setColor(new Color(0, 0, 80));
        g.drawLine(107,68,107,286); g.drawLine(108,68,108,286);
        g.setColor(new Color(227, 227, 255));
        int a10[]={109,109,185}, b10[]={190,267,267};
        g.fillPolygon(a10,b10,3);
        for(i=0; i<4; i++){
          g.setColor(Color.black);
          g.drawLine(24,227-40*i,30,227-40*i);
          g.drawLine(67+40*i,264,67+40*i,270);
        }
        g.setColor(new Color(0, 0, 80));
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawLine(27,267,27+40,267-2*40);
        int a4[]={61,67,68}, b4[]={191,187,194};
        g.fillPolygon(a4,b4,3);
        for(i=27; i<61; i=i+7){
          g.drawLine(i+6,187,i+10,187);
        }
        for(i=267; i>193; i=i-7){
          g.drawLine(67,i-6,67,i-10);
        }
        g.drawString("\u25bcf",40,257);
        g.setColor(Color.red);
        g.fillOval(107,187,4,4);
      }
      if((sh>=16) && (sh<=18)){
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        if(sh==16) g.setColor(Color.red);
        else g.setColor(new Color(180, 0, 80));
        g.drawString("ЗЛП - 3",105,82);
        if(sh==16) g.setColor(Color.red);
        else g.setColor(new Color(0, 0, 80));
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("D",73,183);
        g.setColor(new Color(0, 0, 80));
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("+     = 4",184,246);
        Ind_n(g,"x","1",169,245); Ind_n(g,"x","2",195,245);
        g.drawString("= 2.8",185,149);
        Ind_n(g,"x","2",170,148);
        Ind_n(g,"x","1",73,110); g.drawString("= 1",89,111);
        Ind_n(g,"x","2",176,203); g.drawString("= 2",191,203);
        g.drawLine(8,88,206,286); g.drawLine(8,89,206,287);
        g.drawLine(8,155,246,155); g.drawLine(8,156,246,156);
        g.setColor(new Color(255, 255, 255));
        g.fillRect(63,270,10,10); g.fillRect(16,180,10,15);
        g.setFont(new java.awt.Font("SansSerif", 1, 11));
        g.setColor(Color.darkGray);
        g.drawString("1",60,281); g.drawString("2",18,185);
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.setColor(new Color(0, 0, 80));
        g.drawLine(67,68,67,286); g.drawLine(68,68,68,286);
        g.drawLine(8,187,246,187); g.drawLine(8,188,246,188);
        g.setColor(new Color(227, 227, 255));
        int a11[]={28,67,67,28}, b11[]={189,189,267,267};
        g.fillPolygon(a11,b11,4);
        for(i=0; i<4; i++){
          g.setColor(Color.black);
          g.drawLine(24,227-40*i,30,227-40*i);
          g.drawLine(67+40*i,264,67+40*i,270);
        }
        g.setColor(new Color(0, 0, 80));
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawLine(27,267,27+40,267-2*40);
        int a4[]={61,67,68}, b4[]={191,187,194};
        g.fillPolygon(a4,b4,3);
        g.drawString("\u25bcf",40,257);
        g.setColor(Color.red);
        g.fillOval(67,186,4,4);
      }
      if((sh>=19) && (sh<=20)){
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        if(sh==19) g.setColor(Color.red);
        else g.setColor(new Color(180, 0, 80));
        g.drawString("ЗЛП - 4",105,82);
        g.setColor(new Color(0, 0, 80));
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("+     = 4",165,221);
        Ind_n(g,"x","1",150,220); Ind_n(g,"x","2",176,220);
        g.drawString("= 2.8",185,172);
        Ind_n(g,"x","2",170,171);
        Ind_n(g,"x","1",73,110); g.drawString("= 1",89,111);
        Ind_n(g,"x","2",176,140); g.drawString("= 3",191,141);
        g.drawLine(8,88,206,286); g.drawLine(8,89,206,287);
        g.drawLine(8,155,246,155); g.drawLine(8,156,246,156);
        g.setColor(new Color(255, 255, 255));
        g.fillRect(63,270,10,10); g.fillRect(16,140,10,15);
        g.setFont(new java.awt.Font("SansSerif", 1, 11));
        g.setColor(Color.darkGray);
        g.drawString("1",60,281); g.drawString("3",18,145);
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.setColor(new Color(0, 0, 80));
        g.drawLine(67,68,67,286); g.drawLine(68,68,68,286);
        g.drawLine(8,147,246,147); g.drawLine(8,148,246,148);
        g.setColor(new Color(227, 227, 255));
        g.setColor(new Color(0, 0, 80));
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawLine(27,267,27+40,267-2*40);
        int a4[]={61,67,68}, b4[]={191,187,194};
        g.fillPolygon(a4,b4,3);
        for(i=27; i<61; i=i+7){
          g.drawLine(i+6,187,i+10,187);
        }
        g.drawString("\u25bcf",40,257);
        g.setColor(Color.black);
        for(i=100; i<150; i=i+20){
          g.drawLine(i+3,157,i+7,161);
        }
        for(i=100; i<150; i=i+20){
          g.drawLine(i+3,146,i+7,142);
        }
      }
       //Схема
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      if(sh>=1){
        g.setColor(Color.red);
        g.drawRect(412,70,120,48);
        g.setColor(Color.black);
        g.drawLine(412,85,532,85);
        g.drawLine(514,85,514,118);
        g.setColor(new Color(180, 0, 80));
        g.drawString("ЗЛП - 0",450,83);
        g.setColor(Color.red);
        Ind_v(g,"x","0",417,100);
        g.drawString("= (1.2; 2.8)",434,100);
        g.setFont(new java.awt.Font("SansSerif", 3, 11));
        g.drawString("T",503, 95);
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("f(   ) = 6.8",432, 115);
        Ind_v(g,"x","0",441,115);
        g.drawString("Н",518, 110);
        if(sh>=2){
          g.setColor(new Color(0, 0, 80));
          Ind_v(g,"x","0",417,100);
          g.drawString("= (1.2; 2.8)",434,100);
          g.setFont(new java.awt.Font("SansSerif", 3, 11));
          g.drawString("T",503, 95);
          g.setFont(new java.awt.Font("SansSerif", 1, 14));
          g.drawString("f(   ) = 6.8",432, 115);
          Ind_v(g,"x","0",441,115);
          g.drawString("Н",518, 110);
        }
        if(sh==3){
          g.setColor(Color.red);
          g.drawString("1.2",451,100);
        }
        if(sh>=4){
          g.setColor(Color.red);
          Ind_n(g,"x","1",381,139);
          g.drawString("\u2264",398, 141);
          g.drawString("1",408, 140);
          Ind_n(g,"x","1",531,139);
          g.drawString("\u2265",548, 141);
          g.drawString("2",560, 140);
          g.setColor(Color.black);
          g.drawLine(467,118,397,153);
          int a5[]={395,400,405}, b5[]={153,148,153};
          g.fillPolygon(a5,b5,3);
          g.drawRect(337,153,120,48);
          g.drawLine(337,168,457,168);
          g.drawLine(477,118,547,153);
          int a6[]={539,544,549}, b6[]={153,148,153};
          g.fillPolygon(a6,b6,3);
          g.drawRect(487,153,120,48);
          g.drawLine(487,168,607,168);
          g.setColor(new Color(180, 0, 80));
          g.drawString("ЗЛП - 1",375,166);
          g.drawString("ЗЛП - 2",525,166);
        }
        if(sh>=5){
          g.setColor(Color.black);
          g.drawRect(412,70,120,48);
          g.setColor(Color.red);
          g.drawRect(337,153,120,48);
          g.drawRect(487,153,120,48);
          g.setColor(new Color(0, 0, 80));
          Ind_n(g,"x","1",381,139);
          g.drawString("\u2264",398, 141);
          g.drawString("1",408, 140);
          Ind_n(g,"x","1",531,139);
          g.drawString("\u2265",548, 141);
          g.drawString("2",560, 140);
          if(sh>=6){
            g.setColor(Color.black);
            g.drawRect(487,153,120,48);
            g.drawLine(439,168,439,201);
            g.setColor(Color.red);
            Ind_v(g,"x","1",348,183);
            g.drawString("= (1; 2.8)",365,183);
            g.setFont(new java.awt.Font("SansSerif", 3, 11));
            g.drawString("T",422, 179);
            g.setFont(new java.awt.Font("SansSerif", 1, 14));
            g.drawString("f(   ) = 6.6",356, 198);
            Ind_v(g,"x","1",365,198);
          }
          if(sh>=7){
            g.setColor(new Color(0, 0, 80));
            Ind_v(g,"x","1",348,183);
            g.drawString("= (1; 2.8)",365,183);
            g.setFont(new java.awt.Font("SansSerif", 3, 11));
            g.drawString("T",422, 179);
            g.setFont(new java.awt.Font("SansSerif", 1, 14));
            g.drawString("f(   ) = 6.6",356, 198);
            Ind_v(g,"x","1",365,198);
            g.setColor(Color.red);
            g.drawString("Н",443, 193);
            if(sh>=8){
              g.setColor(Color.black);
              g.drawRect(337,153,120,48);
              g.setColor(new Color(0, 0, 80));
              g.drawString("Н",443, 193);
              if(sh>=9){
                g.setColor(Color.black);
                g.drawLine(589,168,589,201);
                g.setColor(Color.red);
                g.drawRect(487,153,120,48);
                Ind_v(g,"x","2",503,183);
                g.drawString("= (2; 2)",520,183);
                g.setFont(new java.awt.Font("SansSerif", 3, 11));
                g.drawString("T",565, 179);
                g.setFont(new java.awt.Font("SansSerif", 1, 14));
                g.drawString("f(   ) = 6",511, 198);
                Ind_v(g,"x","2",520,198);
                if(sh>=10){
                  g.drawString("Ц",593, 193);
                  g.setColor(new Color(0, 0, 80));
                  Ind_v(g,"x","2",503,183);
                  g.drawString("= (2; 2)",520,183);
                  g.setFont(new java.awt.Font("SansSerif", 3, 11));
                  g.drawString("T",565, 179);
                  g.setFont(new java.awt.Font("SansSerif", 1, 14));
                  g.drawString("f(   ) = 6",511, 198);
                  Ind_v(g,"x","2",520,198);
                  if(sh>=11){
                    g.setColor(new Color(0, 0, 80));
                    g.drawString("Ц",593, 193);
                    g.setColor(Color.black);
                    g.drawRect(487,153,120,48);
                    if((sh>=12) && (sh<=14)){
                      g.setColor(Color.red);
                      g.drawRect(337,153,120,48);
                    }
                    if(sh>=13) g.drawString("2.8",398,183);
                    if(sh>=14){
                      g.setColor(Color.red);
                      Ind_n(g,"x","2",310,222);
                      g.drawString("\u2264",327, 224);
                      g.drawString("2",339, 223);
                      Ind_n(g,"x","2",445,222);
                      g.drawString("\u2265",462, 224);
                      g.drawString("3",474, 223);
                      g.setColor(Color.black);
                      g.drawLine(392,201,330,236);
                      int a7[]={327,332,337}, b7[]={236,231,236};
                      g.fillPolygon(a7,b7,3);
                      g.drawRect(270,236,120,48);
                      g.drawLine(270,251,390,251);
                      g.drawLine(402,201,460,236);
                      int a8[]={453,458,463}, b8[]={236,231,236};
                      g.fillPolygon(a8,b8,3);
                      g.drawRect(400,236,120,48);
                      g.drawLine(400,251,520,251);
                      g.setColor(new Color(180, 0, 80));
                      g.drawString("ЗЛП - 3",308,249);
                      g.drawString("ЗЛП - 4",438,249);
                      if(sh>=15){
                        g.setColor(new Color(0, 0, 80));
                        Ind_n(g,"x","2",310,222);
                        g.drawString("\u2264",327, 224);
                        g.drawString("2",339, 223);
                        Ind_n(g,"x","2",445,222);
                        g.drawString("\u2265",462, 224);
                        g.drawString("3",474, 223);
                        g.setColor(Color.black);
                        g.setColor(Color.red);
                        g.drawRect(270,236,120,48);
                        g.drawRect(400,236,120,48);
                        if(sh>=16){
                          g.setColor(Color.black);
                          g.drawRect(400,236,120,48);
                          g.drawLine(372,251,372,284);
                          g.setColor(Color.red);
                          Ind_v(g,"x","3",286,266);
                          g.drawString("= (1; 2)",303,266);
                          g.setFont(new java.awt.Font("SansSerif", 3, 11));
                          g.drawString("T",348, 262);
                          g.setFont(new java.awt.Font("SansSerif", 1, 14));
                          g.drawString("f(   ) = 5",294, 281);
                          Ind_v(g,"x","3",303,281);
                          if(sh>=17){
                            g.setColor(new Color(0, 0, 80));
                            Ind_v(g,"x","3",286,266);
                            g.drawString("= (1; 2)",303,266);
                            g.setFont(new java.awt.Font("SansSerif", 3, 11));
                            g.drawString("T",348, 262);
                            g.setFont(new java.awt.Font("SansSerif", 1, 14));
                            g.drawString("f(   ) = 5",294, 281);
                            Ind_v(g,"x","3",303,281);
                            g.setColor(Color.red);
                            g.drawString("Ц",376, 276);
                            if(sh>=18){
                              g.setColor(new Color(0, 0, 80));
                              g.drawString("Ц",376, 276);
                              g.setColor(Color.black);
                              g.drawRect(270,236,120,48);
                              if(sh>=19){
                                g.setColor(Color.red);
                                g.drawString("X = O",446,270);
                                g.drawLine(471,269,481,261);
                                g.drawLine(471,268,481,260);
                              }
                              if(sh>=20){
                                g.setColor(new Color(0, 0, 80));
                                g.drawString("X = O",446,270);
                                g.drawLine(471,269,481,261);
                                g.drawLine(471,268,481,260);
                                if(sh==21){
                                  g.setColor(Color.red);
                                  Ind_v(g,"x","2",503,183);
                                  g.drawString("= (2; 2)",520,183);
                                  g.setFont(new java.awt.Font("SansSerif", 3, 11));
                                  g.drawString("T",565, 179);
                                  g.setFont(new java.awt.Font("SansSerif", 1, 14));
                                  g.drawString("f(   ) = 6",511, 198);
                                  Ind_v(g,"x","2",520,198);
      } } } } } } } } } } } } } }
      //Множества
      if(sh==1){
        g.setColor(Color.red);
        g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("J",15, 325); g.drawString("0",49, 325);
        g.setFont(new java.awt.Font("SansSerif", 1, 16));
        g.drawString("= {   }",29, 325);
      }
      if((sh==2) || (sh==13)){
        g.setColor(Color.red);
        g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("J",15, 325); g.drawString("O",41, 325);
        g.setFont(new java.awt.Font("SansSerif", 1, 16));
        g.drawString("=",29, 325);
        g.drawLine(40,323,54,313);
        g.drawLine(40,324,54,314);
      }
      if(((sh>=3) && (sh<=6)) || (sh>=14)){
        g.setColor(new Color(0, 0, 80));
        g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("J",15, 325); g.drawString("O",41, 325);
        g.setFont(new java.awt.Font("SansSerif", 1, 16));
        g.drawString("=",29, 325);
        g.drawLine(40,323,54,313);
        g.drawLine(40,324,54,314);
      }
      if(sh==7){
        g.setColor(Color.red);
        g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("J",15, 325); g.drawString("1",49, 325);
        g.setFont(new java.awt.Font("SansSerif", 1, 16));
        g.drawString("= {   }",29, 325);
      }
      if((sh>=8) && (sh<=12)){
        g.setColor(new Color(0, 0, 80));
        g.setFont(new java.awt.Font("SansSerif", 1, 16));
        g.drawString("= {   }",29, 325);
        g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("J",15, 325); g.drawString("1",49, 325);
      }
      if(sh==12){
        g.setColor(Color.red);
        g.drawString("1",49, 325);
      }
      if((sh>=1) && (sh<=9)){
        g.setColor(new Color(0, 0, 80));
        g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("X = O",340, 325);
        Ind_v(g,"","*",353,323);
        g.drawLine(367,323,381,313);
        g.drawLine(367,324,381,314);
      }
      if(sh==10){
        g.setColor(Color.red);
        Ind_v(g,"x","2",379,325); Ind_v(g,"x","2",483,325);
        g.drawString("= (2; 2)     = f(   ) = 6",396, 325);
        Ind_f(g,453, 325);
        g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("X",340, 325);
        Ind_v(g,"","*",353,323);
        g.setFont(new java.awt.Font("SansSerif", 1, 16));
        g.drawString("= {                ,                    } ",360, 325);
      }
      if(sh>=11){
        if(sh==21) g.setColor(Color.red);
        else g.setColor(new Color(0, 0, 80));
        Ind_v(g,"x","2",379,325); Ind_v(g,"x","2",483,325);
        g.drawString("= (2; 2)     = f(   ) = 6",396, 325);
        Ind_f(g,453, 325);
        g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("X",340, 325);
        Ind_v(g,"","*",353,323);
        g.setFont(new java.awt.Font("SansSerif", 1, 16));
        g.drawString("= {                ,                    } ",360, 325);
      }
      //Коментарии
      if(sh==1){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("0.1.",10, 370);
        g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("Положим    = 0. Решаем исходную задачу ЗЛП - 0 без учета тебования целочисленности,",40, 370);
        g.drawString("графически. Максимум достигается в точке    =    = (1.2; 2.8) , f(   ) = 6.8. Решение не является",12, 390);
        g.drawString("целочисленным. Включаем номер     = 0 в множество",12, 410);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("k",110, 370);
        g.setColor(Color.red); g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("=    = (1.2; 2.8)   f(   ) = 6.8",341, 390);
        g.drawString("= 0",282, 410);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("k",268, 410);
        g.drawString("A",329, 390); g.drawString("J",403, 410);
        Ind_v(g,"x","0",350,390); Ind_v(g,"x","0",456,390);
        g.setFont(new java.awt.Font("SansSerif", 3, 11));
        g.drawString("T",434, 385);
      }
      if(sh==2){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("0.2.",10, 370);
        g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("Так как    = 0, выбираем для ветвления задачу ЗЛП - 0. Исключаем    = 0 из множества",40, 370);
        g.setColor(Color.red);
        g.drawString("   = 0",518, 370);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("J",658, 370); g.drawString("k",518, 370);
        g.setColor(new Color(0, 0, 80)); g.drawString("k",92, 370);
      }
      if(sh==3){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("0.3.",10, 370);
        g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("Осуществим ветвление задачи ЗЛП - 0. Выберем нецелочисленную координату с",40, 370);
        g.drawString("наименьшим индексом:     = 1.2",12, 390);
        g.setColor(Color.red);
        g.drawString("ЗЛП - 0",268, 370);
        g.drawString("= 1.2",204, 390);
        Ind_vn(g,"x","0","1",187,390);
      }
      if(sh==4){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("0.3.1.",10, 370);
        g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("Сформируем дополнительные ограничения:",54, 370);
        g.drawString("для ЗЛП - 1 и",463, 370);
        g.drawString("для ЗЛП - 2",12, 390);
        g.setColor(Color.red);
        g.drawString("\u2264  1.2  = 1",396, 370);
        Ind_n(g,"x","1",380,370);
        g.drawString("\u2265  1.2  + 1 = 2",578, 370);
        Ind_n(g,"x","1",562,370);
        g.setFont(new java.awt.Font("SansSerif", 0, 19));
        g.drawString("[    ]",407, 370); g.drawString("[    ]",589, 370);
      }
      if(sh==5){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("0.3.2.",10, 370);
        g.setColor(new Color(0, 0, 80));
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("k   i  k        i",287, 370);
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("Сформируем две задачи ЗЛП - 2  +  ,    = 0;   = 1, 2:",54, 370);
        g.drawString("f(x) =    + 2     \u2192 max  при ограничениях     +     \u2264 4,      \u2264 2.8,      ,     \u2265 0,      \u2264 1;",70, 390);
        g.drawString("f(x) =    + 2     \u2192 max  при ограничениях     +     \u2264 4,      \u2264 2.8,      ,     \u2265 0,      \u2265 2",70, 410);
        Ind_n(g,"x","1",108,390); Ind_n(g,"x","2",143,390); Ind_n(g,"x","1",349,390); Ind_n(g,"x","2",375,390);
        Ind_n(g,"x","2",422,390); Ind_n(g,"x","1",485,390); Ind_n(g,"x","2",506,390); Ind_n(g,"x","1",554,390);
        Ind_n(g,"x","1",108,410); Ind_n(g,"x","2",143,410); Ind_n(g,"x","1",349,410); Ind_n(g,"x","2",375,410);
        Ind_n(g,"x","2",422,410); Ind_n(g,"x","1",485,410); Ind_n(g,"x","2",506,410); Ind_n(g,"x","1",554,410);
        g.setColor(Color.red);
        g.drawString("ЗЛП - 1:",12, 390);
        g.drawString("ЗЛП - 2:",12, 410);
      }
      if(sh==6){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("1.1.",10, 370);
        g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("Полагаем    = 1. Решаем задачу ЗЛП - 1 графически. Максимум достигается в точке ",40, 370);
        g.drawString("     =     = (1; 2.8) ,  f(   ) = 6.6",12, 390);
        g.setColor(Color.red); g.drawString("ЗЛП - 1",267, 370);
        g.drawString("     =     = (1; 2.8)    f(   ) = 6.6",12, 390);
        Ind_v(g,"x","1",14,390); Ind_v(g,"x","1",143,390);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.setColor(new Color(0, 0, 80)); g.drawString("i",115, 370);
        g.setColor(Color.red); g.drawString("B",44, 390);
        g.setFont(new java.awt.Font("SansSerif", 3, 11));
        g.drawString("T",117, 385);
      }
      if(sh==7){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("1.2.",10, 370);
        g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("Решение     - нецелочисленное, и значение    еще не найдено. Поэтому включаем",40, 370);
        g.drawString("номер     = 1 в множество",12, 390);
        Ind_v(g,"x","1",109,370); Ind_f(g,357, 370);
        g.setColor(Color.red);
        g.drawString("нецелочисленное",134, 370);
        g.drawString("= 1",78, 390);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("k",63, 390); g.drawString("J",199, 390);
      }
      if(sh==8){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("1.3.",10, 370);
        g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("Проверяем выполнение условия    \u2264 2:    = 1 < 2. Полагаем   = 2",40, 370);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("i",286, 370); g.drawString("i",325, 370); g.drawString("i",461, 370);
      }
      if(sh==9){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("2.1.",10, 370);
        g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("Решаем задачу ЗЛП - 2 графически. Получаем решение в точке      =     = (2; 2) ,  f(   ) = 6",40, 370);
        g.setColor(Color.red);
        g.drawString("ЗЛП - 2",153, 370); g.drawString("=     = (2; 2) ,  f(   ) = 6",520, 370);
        Ind_v(g,"x","2",502,370); Ind_v(g,"x","2",619,370);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("C",532, 370);
        g.setFont(new java.awt.Font("SansSerif", 3, 11));
        g.drawString("T",593, 365);
      }
      if(sh==10){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("2.2.",10, 370);
        g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("Решение     - первое целочисленнное. Полагаем    = f(   ) = 6 и включаем решение     в",40, 370);
        g.drawString("множество",15, 390);
        Ind_v(g,"x","2",109,370);
        g.setColor(Color.red);
        Ind_v(g,"x","2",427,370);
        g.drawString("= f(   ) = 6",406, 370);
        Ind_f(g,395, 370); Ind_v(g,"x","2",631,370);
        g.drawString("целочисленнное",191, 370);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("X",98, 390); Ind_v(g,"","*",110,388);
      }
      if(sh==11){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("2.3.",10, 370);
        g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("Сравним значение f(   ) с   . Так как f(   ) = 6.6 >    = 6, оставляем задачу ЗЛП - 1 для ",40, 370);
        g.drawString("дальнейшего ветвления. Проверим выполнение условия    \u2264 2:    = 2",15, 390);
        Ind_v(g,"x","1",187,370); Ind_f(g,223, 370);
        Ind_v(g,"x","1",300,370); Ind_f(g,370, 370);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("i",439, 390); g.drawString("i",478, 390);
      }
      if(sh==12){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("1.4.",10, 370);
        g.setColor(new Color(0, 0, 80));
        g.drawString("O",204, 370);
        g.drawLine(203,368,217,358); g.drawLine(203,369,217,359);
        g.setFont(new java.awt.Font("SansSerif", 1, 16));
        g.drawString("{  }",173, 370);
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("Имеем     = 1 и     =  1  \u2260   . Выбираем задачу ЗЛП - 1 для ветвления и исключаем     = 1 из",40, 370);
        g.drawString("множества",15, 390);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("k",95, 370); g.drawString("J",149, 370);
        g.setColor(Color.red); g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("ЗЛП - 1                                                         = 1",355, 370);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("k",619, 370); g.drawString("J",100, 390);
      }
      if(sh==13){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("1.5.",10, 370);
        g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("Осуществим ветвление задачи ЗЛП - 1. Выберем нецелочисленную координату с",40, 370);
        g.drawString("наименьшим индексом:     = 2.8",12, 390);
        g.setColor(Color.red);
        g.drawString("ЗЛП - 1",268, 370);
        g.drawString("= 2.8",204, 390);
        Ind_vn(g,"x","1","2",187,390);
      }
      if(sh==14){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("1.5.1.",10, 370);
        g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("Сформируем дополнительные ограничения:",54, 370);
        g.drawString("для ЗЛП - 3 и",463, 370);
        g.drawString("для ЗЛП - 3",12, 390);
        g.setColor(Color.red);
        g.drawString("\u2264  2.8  = 2",396, 370);
        Ind_n(g,"x","2",380,370);
        g.drawString("\u2265  2.8  + 1 = 3",578, 370);
        Ind_n(g,"x","2",562,370);
        g.setFont(new java.awt.Font("SansSerif", 0, 19));
        g.drawString("[    ]",407, 370); g.drawString("[    ]",589, 370);
      }
      if(sh==15){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("1.5.2.",10, 370);
        g.setColor(new Color(0, 0, 80));
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("k   i  k        i",287, 370);
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("Сформируем две задачи ЗЛП - 2  +  ,    = 1;   = 1, 2:",54, 370);
        g.drawString("f(x) =    + 2     \u2192 max  при ограничениях     +     \u2264 4,      \u2264 2.8,      ,     \u2265 0,      \u2264 1,      \u2264 2;",70, 390);
        g.drawString("f(x) =    + 2     \u2192 max  при ограничениях     +     \u2264 4,      \u2264 2.8,      ,     \u2265 0,      \u2264 1,      \u2265 3",70, 410);
        Ind_n(g,"x","1",108,390); Ind_n(g,"x","2",143,390); Ind_n(g,"x","1",349,390); Ind_n(g,"x","2",375,390);
        Ind_n(g,"x","2",422,390); Ind_n(g,"x","1",485,390); Ind_n(g,"x","2",506,390); Ind_n(g,"x","1",554,390);
        Ind_n(g,"x","2",602,390);
        Ind_n(g,"x","1",108,410); Ind_n(g,"x","2",143,410); Ind_n(g,"x","1",349,410); Ind_n(g,"x","2",375,410);
        Ind_n(g,"x","2",422,410); Ind_n(g,"x","1",485,410); Ind_n(g,"x","2",506,410); Ind_n(g,"x","1",554,410);
        Ind_n(g,"x","2",602,410);
        g.setColor(Color.red);
        g.drawString("ЗЛП - 3:",12, 390);
        g.drawString("ЗЛП - 4:",12, 410);
      }
      if(sh==16){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("3.1.",10, 370);
        g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("Полагаем    = 1. Решаем задачу ЗЛП - 3 графически. Максимум достигается в точке ",40, 370);
        g.drawString("     =     = (1; 2) ,  f(   ) = 6.6",12, 390);
        g.setColor(Color.red);
        g.drawString("ЗЛП - 3",267, 370);
        g.drawString("     =     = (1; 2)    f(   ) = 6.6",12, 390);
        Ind_v(g,"x","3",14,390); Ind_v(g,"x","3",131,390);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.setColor(new Color(0, 0, 80)); g.drawString("i",115, 370);
        g.setColor(Color.red); g.drawString("D",44, 390);
        g.setFont(new java.awt.Font("SansSerif", 3, 11));
        g.drawString("T",106, 385);
      }
      if(sh==17){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("3.2.",10, 370);
        g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("Решение     - целочисленное. Так как значение    уже найдено, то сравним f(   ) = 5 с   .",40, 370);
        g.drawString("Имеем f(   ) = 5 <   = 6, поэтому не включаем решение     в множество    . Задача ЗЛП - 3",12, 390);
        g.drawString("исключается из дальнейшего рассмотрения",12, 410);
        Ind_v(g,"x","3",109,370); Ind_f(g,379, 370); Ind_v(g,"x","3",582,370); Ind_f(g,640, 370);
        Ind_v(g,"x","3",75,390); Ind_f(g,133, 390); Ind_v(g,"x","3",398,390);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("X",510, 390); Ind_v(g,"","*",523,388);
        g.setColor(Color.red); g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("целочисленное",134, 370);
      }
      if(sh==18){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("3.3.",10, 370);
        g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("Проверим выполнение условия    \u2264 2:    = 1 < 2. Полагаем   = 2",40, 370);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("i",278, 370); g.drawString("i",317, 370); g.drawString("i",453, 370);
      }
      if(sh==19){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("4.1.",10, 370);
        g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("Решаем задачу ЗЛП - 4 графически. В этой задаче ограничения не совместны,",40, 370);
        g.drawString("множество допустимых решений пустое. Исключаем задачу ЗЛП - 4 из дальнейшего",12, 390);
        g.drawString("рассмотрения",12, 410);
        g.setColor(Color.red);
        g.drawString("ЗЛП - 4",153, 370);
      }
      if(sh==20){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("4.2.",10, 370);
        g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("Проверяем выполнение условия    \u2264 2:    = 2",40, 370);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("i",286, 370); g.drawString("i",325, 370);
      }
      if(sh==21){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("5.1.",10, 370);
        g.setColor(new Color(0, 0, 80));
        g.drawString("O",249, 370);
        g.drawLine(248,368,262,358); g.drawLine(248,369,262,359);
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("Так как    \u2260 0 и множество    =    , а множество     содержит единственное решение, то",40, 370);
        g.drawString(",                    - решение исходной задачи.",104, 390);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("k",93, 370); g.drawString("J",225, 370);
        g.drawString("X",364, 370); Ind_v(g,"","*",377,368);
        g.setColor(Color.red); g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("    =     = (2;2)   f(   ) =    = 6",13, 390);
        Ind_v(g,"x","*",15,390); Ind_v(g,"x","2",40,390);
        Ind_v(g,"x","*",121,390); Ind_f(g,155, 390);
        g.setFont(new java.awt.Font("SansSerif", 3, 11));
        g.drawString("T",98, 385);
      }
      if(sh==1) jButton3.setEnabled(false);
      else jButton3.setEnabled(true);
      if(sh==21) jButton1.setEnabled(false);
      else jButton1.setEnabled(true);
    }
  }
  void jButton1_actionPerformed(ActionEvent e) {
    sh++;
    if (sh>21) sh=21;
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
}