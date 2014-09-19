package strvetgran;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class AppStrVetGran extends JApplet {
  JButton jButton1 = new JButton();
  JButton jButton2 = new JButton();
  JButton jButton3 = new JButton();
  JLabel jLabel1 = new JLabel();
  public int sh=1;
  Panel_mypaint jPanel1 = new Panel_mypaint();

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
    this.setSize(new Dimension(700, 408));
    this.getContentPane().setLayout(null);
    jPanel1.setBounds(new Rectangle(5,22,695,352));
    jPanel1.setBackground(new Color(247, 247, 255));
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel1.setForeground(new Color(130, 0, 80));
    jLabel1.setText("Идея поиска максимума функции методом ветвей и границ");
    jLabel1.setBounds(new Rectangle(109, 4, 473, 17));
    jButton1.setBackground(new Color(220, 230, 255));
    jButton1.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton1.setForeground(new Color(0, 0, 60));
    jButton1.setText("==>");
    jButton1.setBounds(new Rectangle(440, 377, 100, 23));
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton1_actionPerformed(e);
      }
    });
    jButton2.setBackground(new Color(220, 230, 255));
    jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton2.setForeground(new Color(0, 0, 60));
    jButton2.setText("Обновить");
    jButton2.setBounds(new Rectangle(300, 377, 100, 23));
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton2_actionPerformed(e);
      }
    });
    jButton3.setBackground(new Color(220, 230, 255));
    jButton3.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton3.setForeground(new Color(0, 0, 60));
    jButton3.setText("<==");
    jButton3.setBounds(new Rectangle(160, 377, 100, 23));
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton3_actionPerformed(e);
      }
    });
    this.getContentPane().add(jButton1, null);
    this.getContentPane().add(jButton2, null);
    this.getContentPane().add(jButton3, null);
    this.getContentPane().add(jLabel1, null);
    this.getContentPane().add(jPanel1, null);
  }

  public void Ind_n(Graphics g,String a, String b, int x, int y){
    g.setFont(new java.awt.Font("SansSerif", 1, 15));
    g.drawString(""+a,x,y);
    g.setFont(new java.awt.Font("SansSerif", 3, 11));
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
    g.setFont(new java.awt.Font("SansSerif", 3, 11));
    g.drawString(""+c+" ",x+a.length()*8,y+5);
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
  }
  public void Ind_f(Graphics g, int x, int y){
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
    Stringer.drawString("f",x,y);
    g.drawLine(x-2,y+2,x+5,y+2);
    g.drawLine(x-2,y+1,x+5,y+1);
  }

  class  Panel_mypaint extends JPanel {
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Stringer.setGraphics(g);
      g.setColor(new Color(255, 255, 255)); g.fillRect(560,10,130,199);
      g.setColor(new Color(157, 187, 255)); g.drawRect(560,10,130,199);
      g.setColor(new Color(180, 0, 60));
      g.setFont(new java.awt.Font("SansSerif", 1, 14));
      //Задача ЗЛП
      Stringer.drawString("Задача ЗЛП:",581,26);
      g.setColor(new Color(0,0,80));
      g.setFont(new java.awt.Font("SansSerif", 1, 15));
      g.drawString("\u2211",571,121);
      Stringer.drawString("f(x) =           \u2192 max",563,56);
      Stringer.drawString("            \u2264    ,  где",571,121);
      Stringer.drawString("\u2265 0 - целые,",590,155);
      Stringer.fonts[0]=new Font("SansSerif", 1, 15);
      Stringer.fonts[1]=new Font("SansSerif", 3, 11);
      Stringer.drawString("\u2211 c_{j }x_{j}",601,56);
      Stringer.drawString("\u2211 a_{ij }x_{j}    b_{i}",571,121);
      Stringer.drawString("x_{j}",574,155);
      Stringer.fonts[0]=new Font("SansSerif", 1, 14);
      Stringer.fonts[1]=new Font("SansSerif", 1, 11);
      Stringer.drawString("при ограничениях",561,93);
      Stringer.drawString("= 1, ... ,    ,",595,181);
      Stringer.drawString("= 1, ... ,    .",595,202);
      Stringer.fonts[0]=new Font("SansSerif", 1, 11);
      Stringer.drawString("=1",604,69);
      Stringer.drawString("=1",574,134);
      Stringer.fonts[0]=new Font("SansSerif", 3, 11);
      Stringer.drawString("j",599,69);
      Stringer.drawString("n",604,43);
      Stringer.drawString("j",569,134);
      Stringer.drawString("n",574,108);
      Stringer.fonts[0]=new Font("SansSerif", 3, 14);
      Stringer.drawString("i              m",586,180);
      Stringer.drawString("j              n",586,202);

      //Схема
      Stringer.fonts[0]=new Font("SansSerif", 1, 14);
      g.setColor(Color.black);
      int x1[]={137,142,147}, y1[]={100,95,100};
      int x2[]={408,413,418}, y2[]={190,185,190};
      if((sh>=1) && (sh<5)){
        g.setColor(new Color(255, 255, 255)); g.fillRect(210,20,134,34);
        g.setColor(new Color(157, 187, 255)); g.drawRect(210,20,134,34);
        g.drawLine(211,35,343,35);
        g.setColor(new Color(180, 0, 60));
        Stringer.drawString("ЗЛП - 0",254,33);
        if(sh>=2){
          g.setColor(Color.red);
          Stringer.drawString("x^{0},  f(x^{0})",252, 50);
          if(sh>=3){
            g.setColor(new Color(0,0,80));
            Stringer.drawString("x^{0},  f(x^{0})",252, 50);
            g.setColor(new Color(255, 255, 255)); g.fillRect(70,100,134,34);
            g.setColor(Color.red);
            g.drawRect(70,100,134,34);
            g.setColor(new Color(157, 187, 255));
            g.drawLine(71,115,203,115);
            g.drawLine(272,54,137,100);
            g.fillPolygon(x1,y1,3);
            g.setColor(new Color(0,0,80));
            g.setFont(new java.awt.Font("SansSerif", 1, 14));
            Stringer.drawString("целочисленное",81,112);
            Stringer.drawString("Задача решена",83,130);
            if(sh>=4){
              g.setColor(new Color(255, 255, 255)); g.fillRect(351,100,134,34);
              g.setColor(Color.red); g.drawRect(351,100,134,34);
              g.setColor(new Color(157, 187, 255)); g.drawRect(70,100,134,34);
              g.drawLine(352,115,484,115);
              g.drawLine(282,54,418,100);
              g.fillPolygon(x2,y1,3);
              g.setColor(new Color(0,0,80));
              g.setFont(new java.awt.Font("SansSerif", 1, 14));
              Stringer.drawString("нецелочисленное",354,112);
              Stringer.drawString("Следующий шаг",361,130);
            }
          }
        }
      }
      if(sh>=5){
        g.setColor(new Color(255, 255, 255)); g.fillRect(210,10,134,48);
        g.setColor(new Color(157, 187, 255)); g.drawRect(210,10,134,48);
        g.drawLine(211,25,343,25);
        g.setColor(new Color(180, 0, 60));
        Stringer.drawString("ЗЛП - 0",254,23);
        g.setColor(new Color(0,0,80));
        Stringer.drawString("x^{0},  f(x^{0})",252, 40);
        Stringer.drawString("нецелочисленное",213,56);
        g.setColor(new Color(255, 255, 255));
        g.fillRect(70,100,134,48);
        g.fillRect(351,100,134,48);
        g.setColor(Color.red);
        g.drawRect(70,100,134,48);
        g.drawRect(351,100,134,48);
        g.setColor(new Color(157, 187, 255));
        g.drawLine(71,115,203,115);
        g.drawLine(353,115,484,115);
        g.drawLine(272,58,137,100);
        g.drawLine(282,58,418,100);
        g.fillPolygon(x1,y1,3);
        g.fillPolygon(x2,y1,3);
        g.setColor(new Color(180, 0, 60));
        Stringer.drawString("ЗЛП - 1",117,113);
        Stringer.drawString("ЗЛП - 2",396,113);
        if(sh>=6){
          g.setColor(new Color(157, 187, 255));
          g.drawRect(70,100,134,48);
          g.drawRect(351,100,134,48);
          if(sh>=8){
             if(sh==8) g.setColor(Color.red);
             else g.setColor(new Color(0,0,80));
             Stringer.fonts[1]=new Font("SansSerif", 3, 11);
             Stringer.drawString("x_{k} \u2264",114,81);
             Ind_vn(g,"x","0","k",147,81);
             Stringer.drawString("x_{k} \u2265        + 1",374,81);
             Ind_vn(g,"x","0","k",407,81);
             Stringer.fonts[0]=new Font("SansSerif", 0, 20);
             Stringer.drawString("[  ]",143,83);
             Stringer.drawString("[  ]",403,83);
             Stringer.fonts[0]=new Font("SansSerif", 1, 14);
             Stringer.fonts[1]=new Font("SansSerif", 1, 11);
             if(sh==10 || sh==11){
               g.setColor(Color.red);
               Stringer.drawString("x^{1},  f(x^{1})",113,130);
               Stringer.drawString("x^{2},  f(x^{2})",394,130);
             }
             if(sh>=11){
               Stringer.drawString("нецелочисленное",73,145);
               Stringer.drawString("нецелочисленное",354,145);
             }
             if(sh>=12){
               Stringer.drawString("x^{1},  f(x^{1}) > f(x^{2})",87,130);
               if(sh<=16) Stringer.drawString("x^{2},  f(x^{2})",394,130);
               g.setColor(new Color(255, 255, 255));
               g.fillRect(0,190,134,48);
               g.fillRect(140,190,134,48);
               if(sh==12){
                 g.setColor(Color.red);
                 g.drawRect(0,190,134,48);
                 g.drawRect(140,190,134,48);
                 Stringer.drawString("x^{1},  f(x^{1}) > f(x^{2})",87,130);
                 g.setColor(new Color(0,0,80));
                 Stringer.drawString("x^{1},",87,130);
               }
               g.setColor(new Color(157, 187, 255));
               g.drawLine(1,205,133,205);
               g.drawLine(141,205,273,205);
               g.drawLine(132,148,67,190);
               g.drawLine(142,148,207,190);
               int x3[]={64,69,74}, x4[]={200,205,210};
               g.fillPolygon(x3,y2,3); g.fillPolygon(x4,y2,3);
               g.setColor(new Color(180,0,60));
               Stringer.drawString("ЗЛП - 3",44,203);
               Stringer.drawString("ЗЛП - 4",184,203);
               g.setColor(new Color(0,0,80));
               Stringer.fonts[1]=new Font("SansSerif", 3, 11);
               Stringer.drawString("x_{j} \u2264",30,174);
               Ind_vn(g,"x","0","j",61,171);
               Stringer.drawString("x_{j} \u2265        + 1",186,174);
               Ind_vn(g,"x","0","j",217,171);
               Stringer.fonts[0]=new Font("SansSerif", 0, 20);
               Stringer.drawString("[  ]",57,173);
               Stringer.drawString("[  ]",213,173);
               Stringer.fonts[0]=new Font("SansSerif", 1, 14);
               Stringer.fonts[1]=new Font("SansSerif", 1, 11);
               if((sh>=12) && (sh<14)){
                 g.setColor(new Color(0,0,80));
                 Stringer.drawString("x^{3},  f(x^{3})",41,220);
                 Stringer.drawString("x^{4},  f(x^{4})",182,220);
               }
               if(sh>=13){
                 g.setColor(new Color(157, 187, 255));
                 g.drawRect(0,190,134,48);
                 g.drawRect(140,190,134,48);
                 if(sh>=14){
                   g.setColor(new Color(255, 255, 255)); g.fillRect(560,215,130,23);
                   g.setColor(new Color(157, 187, 255)); g.drawRect(560,215,130,23);
                   g.setColor(new Color(0,0,80));
                   Stringer.drawString("нецелочисленное",3,235);
                   if((sh==14) || (sh==15)) Stringer.drawString("x^{3},  f(x^{3})",41,220);
                   Stringer.drawString("x^{4},  f(x^{4}) =",170,220);
                   g.setColor(Color.red);
                   if(sh==14){
                     g.drawLine(536,225,556,225);
                     int x5[]={556,561,556}, y5[]={220,225,230};
                     g.fillPolygon(x5,y5,3);
                   }
                   Ind_f(g,241,220);
                   Stringer.drawString("целочисленное",150,235);
                   Stringer.fonts[0]=new Font("SansSerif", 3, 15);
                   Stringer.drawString("X^{  *}",567, 231);
                   Stringer.fonts[0]=new Font("SansSerif", 1, 14);
                   Stringer.drawString("=   x^{4}, f(x^{4}) =",587, 231);
                   g.setFont(new Font("SansSerif", 1, 14));
                   g.drawString("{                    }",597,231);
                   Ind_f(g,671,231);
                   if(sh>=15){
                     g.setColor(new Color(0,0,80));
                     Stringer.drawString("целочисленное",150,235);
                     Stringer.fonts[0]=new Font("SansSerif", 3, 15);
                     Stringer.drawString("X^{  *}",567, 231);
                     Stringer.fonts[0]=new Font("SansSerif", 1, 14);
                     Stringer.drawString("=   x^{4}, f(x^{4}) =",587, 231);
                     g.setFont(new Font("SansSerif", 1, 14));
                     g.drawString("{                    }",597,231);
                     Ind_f(g,671,231);
                     Ind_f(g,241,220);
                     Stringer.drawString("целочисленное",150,235);
                    if(sh>=16){
                      g.setColor(Color.red);
                      Stringer.drawString("x^{3}, f(x^{3}) <",30,220);
                      Ind_f(g,101,220);
                      g.setColor(new Color(0,0,80));
                      Stringer.drawString("x^{3},",30,220);
                      if(sh>=17){
                        g.setColor(new Color(255, 255, 255));
                        g.fillRect(281,190,134,48); g.fillRect(421,190,134,48);
                        g.setColor(Color.red);
                        g.drawRect(281,190,134,48); g.drawRect(421,190,134,48);
                        g.setColor(new Color(157, 187, 255));
                        g.drawLine(282,205,414,205);
                        g.drawLine(422,205,554,205);
                        g.drawLine(413,148,348,190);
                        g.drawLine(423,148,488,190);
                        int x5[]={345,350,355}, x6[]={481,486,491};
                        g.fillPolygon(x5,y2,3); g.fillPolygon(x6,y2,3);
                        g.setColor(new Color(180,0,60));
                        Stringer.drawString("ЗЛП - 5",325,203);
                        Stringer.drawString("ЗЛП - 6",465,203);
                        g.setColor(Color.red);
                        Stringer.drawString("x^{2}, f(x_{2}) > ",381,130);
                        Ind_f(g,452,130);
                        g.setColor(new Color(0,0,80));
                        Stringer.drawString("x^{2},",381,130);
                        Stringer.drawString("x^{3}, f(x^{3}) <",30,220);
                        Ind_f(g,101,220);
                        Stringer.fonts[1]=new Font("SansSerif", 3, 11);
                        Stringer.drawString("x_{j} \u2264",311,171);
                        g.setFont(new java.awt.Font("SansSerif", 1, 14));
                        Ind_vn(g,"x","0","j",342,171);
                        Stringer.drawString("x_{j} \u2265        + 1",467,174);
                        g.setFont(new java.awt.Font("SansSerif", 1, 14));
                        Ind_vn(g,"x","0","j",498,171);
                        Stringer.fonts[0]=new Font("SansSerif", 0, 20);
                        Stringer.drawString("[  ]",338,173);
                        Stringer.drawString("[  ]",494,173);
                        Stringer.fonts[0]=new Font("SansSerif", 1, 14);
                        Stringer.fonts[1]=new Font("SansSerif", 1, 11);
                        if(sh>=18){
                          g.setColor(Color.red);
                          Stringer.drawString("X =",331,220);
                          Stringer.drawString("O",356,220);
                          g.drawLine(356,219,366,211);
                          g.drawLine(356,218,366,210);
                          g.setColor(new Color(0,0,80));
                          Stringer.drawString("x^{2}, f(x_{2}) > ",381,130);
                          Ind_f(g,452,130);
                          g.setColor(new Color(157, 187, 255));
                          g.drawRect(421,190,134,48);
                          if(sh>=19){
                            g.drawRect(281,190,134,48);
                            g.setColor(Color.red);
                            g.drawRect(421,190,134,48);
                            Stringer.drawString("x^{6}, f(x_{6}) <",451,220);
                            Ind_f(g,524,220);
                            Stringer.drawString("целочисленное",436,235);
                            g.setColor(new Color(0,0,80));
                            Stringer.drawString("x^{6},",451,220);
                            Stringer.drawString("X =",331,220);
                            Stringer.drawString("O",356,220);
                            g.drawLine(356,219,366,211);
                            g.drawLine(356,218,366,210);
                            if(sh>=20){
                              g.setColor(new Color(157, 187, 255));
                              g.drawRect(421,190,134,48);
                              g.setColor(new Color(0,0,80));
                              Stringer.drawString("x^{6}, f(x_{6}) <",451,220);
                              Ind_f(g,524,220);
                              Stringer.drawString("целочисленное",436,235);
                              if(sh>=21){
                                g.setColor(Color.red);
                                Stringer.drawString("   f(x^{4}) =",184,220);
                                Ind_f(g,241,220);
                                Stringer.drawString("x^{4}  f(x^{4}) =",607, 231);
                                Ind_f(g,671,231);
      } } } } } } } } } } } } }
      //Коментарии
      g.setColor(new Color(255, 255, 255)); g.fillRect(0,245,690,102);
      g.setColor(new Color(157, 187, 255)); g.drawRect(0,245,690,102);
         //Шаг
         g.setColor(new Color(180, 0, 60));
         g.setFont(new java.awt.Font("SansSerif", 3, 16));
         g.drawString(""+sh+". ",4, 263);

      g.setColor(new Color(0, 0, 80));
      if(sh==1){
        Stringer.drawString("Задача ЗЛП - 0 решается симплекс-методом без учета ограничений на целочисленность",20, 263);
        Stringer.drawString("переменных. Считается, что она имеет решение.",5, 283);
      }
      if(sh==2){
        Stringer.drawString("На полученном оптимальном решении     = (    ,...,    )  вычисляется значение целевой",20, 263);
        Stringer.drawString("функции f(x^{0}).",5, 283);
        g.setColor(Color.red);
        Stringer.drawString("= (    ,...,    )",318, 263);
        Stringer.drawString("функции f(x^{0})",5, 283);
        Ind_v(g,"x","0",303,263); Ind_vn(g,"x","0","1",335,263); Ind_vn(g,"x","0","n",372,263);
        g.setFont(new java.awt.Font("SansSerif", 3, 11));
        g.drawString("T",390, 256);
        g.setColor(new Color(0, 0, 80)); Stringer.drawString("функции",5, 283);
      }
      if(sh==3){
        Stringer.drawString("Если решение x^{0} является целочисленным, то задача решена.",20, 263);
      }
      if(sh==4){
        Stringer.drawString("Если решение x^{0} нецелочисленное, то значение f(x^{0}) является верхней границей",20, 263);
        Stringer.drawString("возможных оптимальных значений f(x) на целочисленных решениях.",5, 283);
      }
      if(sh==5){
        Stringer.drawString("При нецелочисленном решении задача подлежит ветвлению на две: ЗЛП - 1 и ЗЛП - 2.",20, 263);
        Stringer.drawString("Целью ветвления является разбиение множества допустимых решений, определяемого",5, 283);
        Stringer.drawString("ограничениями, на два подмножества путем построения дополнительных ограничений.",5, 303);
      }
      if(sh==6){
        Stringer.drawString("Дополнительные ограничения строятся таким образом, чтобы исключить нецелочисленную",20, 263);
        Stringer.drawString("точку x^{0} и сделать решение, по крайней мере, одной из задач целочисленным по одной",5, 283);
        Stringer.drawString("выбранной координате     .",5, 303);
        Ind_n(g,"x","k",177,303);
      }
      if(sh==7){
        Stringer.drawString("Координатой      может быть:",20, 263);
        Stringer.drawString("1. Нецелочисленная      с наименьшим или набольшим индексом.",10, 282);
        Stringer.drawString("2. Нецелочисленная      с наименьшей или набольшей дробной частью.",10, 301);
        Stringer.drawString("3. Нецелочисленная     , которой соответствует набольший коэффициент в целевой функции.",10, 320);
        Stringer.drawString("4. Нецелочисленная     , определяемая физичеким содержанием задачи.",10, 339);
        Ind_n(g,"x","k",120,263); Ind_n(g,"x","k",161,282); Ind_n(g,"x","k",161,301); Ind_n(g,"x","k",161,320); Ind_n(g,"x","k",161,339);
      }
      if(sh==8){
        Stringer.drawString("Для построения дополнительных ограничений выделяется целая часть        значения",20, 263);
        Stringer.drawString("координаты     . Дополнительные ограничения имеют вид                для ЗЛП - 1 и                + 1",5, 283);
        Stringer.drawString("для ЗЛП - 2.",5, 303);
        Ind_vn(g,"x","0","k",545,263); Ind_vn(g,"x","0","k",96,283);
        g.setColor(Color.red);
        Stringer.drawString("+ 1",641, 283);
        Ind_n(g,"x","k",426,283); Ind_vn(g,"x","0","k",459,283);
        Ind_n(g,"x","k",583,283); Ind_vn(g,"x","0","k",616,283);
        Stringer.drawString("\u2264",443, 285); Stringer.drawString("\u2265",601, 285);
        g.setFont(new java.awt.Font("SansSerif", 0, 20));
        g.drawString("[  ]",455, 285); g.drawString("[  ]",612, 285);
        g.setColor(new Color(0,0,80)); g.drawString("[  ]",541, 265);
      }
      if(sh==9){
        Stringer.drawString("Задачи ЗЛП - 1 и ЗЛП - 2 решаются самостоятельно симплекс-методом без учета",20, 263);
        Stringer.drawString("требований на целочиленность значений координат     ,   = 1,...,   .",5, 283);
        Ind_n(g,"x","j",385,283);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("j           n",408, 283);
      }
      if(sh==10){
        Stringer.drawString("На полученных оптимальных решениях задач ЗЛП - 1 и ЗЛП - 2 вычисляются значения",28, 263);
        Stringer.drawString("функции f(x).",5, 283);
        g.setColor(Color.red); Stringer.drawString("функции f(x)",5, 283);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("функции",5, 283);
      }
      if(sh==11){
        Stringer.drawString("Если ни одна из задач не имеет целочисленного решения, то выбирается задача для",28, 263);
        Stringer.drawString("приоритетного дальнейшего ветвления по установленному правилу: например,",5, 283);
        Stringer.drawString("приоритетному ветвлению подлежит та задача, в которой значение f(x) на оптимальном",5, 303);
        Stringer.drawString("нецелочисленном решении максимально.",5, 323);
      }
      if(sh==12){
        Stringer.drawString("Допустим, что f(   ) > f(   ) и задача ЗЛП - 1 первой ветвится на ЗЛП - 3 и ЗЛП - 4, которые",28, 263);
        Stringer.drawString("решаются симплекс-методом без учета требований на целочисленность с последующим",5, 283);
        Stringer.drawString("анализом решений.",5, 303);
        g.setColor(Color.red);
        Stringer.drawString("f(   ) > f(   )                                                                   ЗЛП - 3",131, 263);
        Stringer.drawString("ЗЛП - 4",536, 263);
        Ind_v(g,"x","1",141,263); Ind_v(g,"x","2",183,263);
      }
      if(sh==13){
        Stringer.drawString("Процесс ветвления продолжается до тех пор, пока не будет получено в одной из ветвей",28, 263);
        Stringer.drawString("целочисленное решение.",5, 283);
      }
      if(sh==14){
        Stringer.drawString("Пусть задача ЗЛП - 4 имеет целочисленное решение. Обозначим через    - значение",28, 263);
        Stringer.drawString("функции на первом целочисленном решении:   = f(x^{4}). Соответствующее целочисленное",5, 283);
        Stringer.drawString("решение включается в множество      возможных оптимальных решений исходной задачи",5, 303);
        Stringer.drawString("Дальнейшее ветвление задачи с целочисленным решением не производится.",5, 323);
        Ind_f(g,341,283);
        g.setColor(Color.red);
        Stringer.drawString("целочисленное",226, 263);
        Ind_f(g,548,263);
        g.setFont(new java.awt.Font("SansSerif", 3, 15));
        g.drawString("X",258, 303); Ind_v(g,"","*",272,303);
      }
      if(sh==15){
        Stringer.drawString("После того, как найдено первое целочиленное решение, вопрос о дальнейшем",28, 263);
        Stringer.drawString("ветвлении других задач решается на основании сравнения значений f(x^{k}) на оптимальных",5, 283);
        Stringer.drawString("нецелочисленных решениях в оставшихся ветвях со значением   .",5, 303);
        Ind_f(g,475,303);
      }
      if(sh==16){
        Stringer.drawString("Допустим f(x^{3}) <   . Тогда задача ЗЛП - 3 далее не ветвится.",28, 263);
        g.setColor(Color.red);
        Stringer.drawString("f(x^{3}) <",100, 263);
        Ind_f(g,144,263);
      }
      if(sh==17){
        Stringer.drawString("Пусть f(x^{2}) >   . Если f(x^{k}) >   , то соответствующая этому номеру    задача ветвится далее.",28, 263);
        Stringer.drawString("Следовательно задача ЗЛП - 2 подлежит ветвлению на задачи ЗЛП - 5 и ЗЛП - 6.",5, 283);
        Ind_f(g,216,263);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("k",483, 263);
        g.setColor(Color.red); Ind_f(g,114,263);
        Stringer.drawString("Пусть f(x^{2}) >",28, 263);
        Stringer.drawString("ЗЛП - 5",458, 283); Stringer.drawString("ЗЛП - 6",525, 283);
        g.setColor(new Color(0, 0, 80)); Stringer.drawString("Пусть",28, 263);
      }
      if(sh==18){
        Stringer.drawString("Допустим задача ЗЛП - 5 не имеет решения, так как множество допустимых решений пусто.",28, 263);
        Stringer.drawString("Тогда задача ЗЛП - 5 далее не рассматривается.",5, 283);
        g.setColor(Color.red);
        Stringer.drawString("ЗЛП - 5",152, 263);
      }
      if(sh==19){
        Stringer.drawString("Пусть задача ЗЛП - 6 имеет целочисленное решение и далее не ветвится. Так как  f(   ) <   ,",28, 263);
        Stringer.drawString("целочисленное решение не включается в множество     .",5, 283);
        g.setFont(new java.awt.Font("SansSerif", 3, 15));
        g.drawString("X",395, 283); Ind_v(g,"","*",410,283);
        g.setColor(Color.red); Ind_v(g,"x","6",632,263); Ind_f(g,666,263);
        Stringer.drawString("целочисленное                                                                       f(   ) <   ",226, 263);
      }
      if(sh==20){
        Stringer.drawString("Таким образом, ветвление какой-либо задачи заканчивается, если выполняется одно из",28, 263);
        Stringer.drawString("условий:",5, 282);
        Stringer.drawString("- решение целочисленное;",5, 301);
        Stringer.drawString("- значение целевой функции данной задачи не больше   ;",5, 320);
        Stringer.drawString("- множество допустимых решений пусто.",5, 339);
        Ind_f(g,407,320);
      }
      if(sh==21){
        Stringer.drawString("Если ветвление всех задач закончено, то в множестве     выбирается решение (решения),",28, 263);
        Stringer.drawString("которому соответствует наибольшее значение целевой функции. Оно является решением",5, 283);
        Stringer.drawString("исходной задачи. Если множество     пустое, то исходная задача не имеет решения.",5, 303);
        Stringer.drawString("Таким образом, решение задачи ЗЛП будет           ,              .",5, 323);
        g.setFont(new java.awt.Font("SansSerif", 3, 15));
        g.drawString("X",424, 263); g.drawString("X",255, 303);
        Ind_v(g,"","*",438,263); Ind_v(g,"","*",269,303);
        g.setColor(Color.red);
        Ind_v(g,"x","*",321,323); Ind_v(g,"x","4",345,323);
        Ind_v(g,"x","*",381,323);
        Ind_f(g,413,323);
        Stringer.drawString("=       f(   ) =",335, 323);
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