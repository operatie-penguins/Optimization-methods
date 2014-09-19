import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class Applet4 extends JApplet {
  JButton jButton1 = new JButton();
  JButton jButton2 = new JButton();
  JButton jButton3 = new JButton();
  Panel_mypaint jPanel1 = new Panel_mypaint();
  public int sh=1;
//  boolean b1flag=true,b2flag=false;
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
    this.setSize(new Dimension(610, 440));
    this.getContentPane().setLayout(null);
    jButton1.setBackground(new Color(220, 230, 255));
    jButton1.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton1.setForeground(new Color(0, 0, 60));
    jButton1.setText("==>");
    jButton1.setBounds(new Rectangle(374, 405, 100, 23));
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton1_actionPerformed(e);
      }
    });
    jButton2.setBackground(new Color(220, 230, 255));
    jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton2.setForeground(new Color(0, 0, 60));
    jButton2.setText("Обновить");
    jButton2.setBounds(new Rectangle(254, 405, 100, 23));
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton2_actionPerformed(e);
      }
    });
    jButton3.setBackground(new Color(220, 230, 255));
    jButton3.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton3.setForeground(new Color(0, 0, 60));
    jButton3.setText("<==");
    jButton3.setBounds(new Rectangle(134, 405, 100, 23));
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton3_actionPerformed(e);
      }
    });
    jPanel1.setBounds(new Rectangle(7, -8, 600, 400));
    jPanel1.setBackground(new Color(247, 247, 255));
    this.getContentPane().add(jButton1, null);
    this.getContentPane().add(jButton2, null);
    this.getContentPane().add(jButton3, null);
    this.getContentPane().add(jPanel1, null);

  }
 public void Ind_n(Graphics g,String a, String b, int x, int y)
   {g.setFont(new java.awt.Font("SansSerif", 1, 15));
    g.drawString(""+a,x,y);
    g.setFont(new java.awt.Font("SansSerif", 1, 11));
    g.drawString(""+b+" ",x+a.length()*8,y+4);
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
  }
 public void Ind_v(Graphics g,String a, String b, int x, int y)
   {g.setFont(new java.awt.Font("SansSerif", 1, 15));
    g.drawString(""+a,x,y);
    g.setFont(new java.awt.Font("SansSerif", 1, 11));
    g.drawString(""+b+"  ",x+a.length()*8,y-4);
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
  }
 class  Panel_mypaint extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
     g.setFont(new java.awt.Font("Dialog", 1, 16));
     g.setColor(new Color(130, 0, 80));
     g.drawString("Идея нахождения начального базисного решения",90,26);
     if (sh==1){jButton3.setForeground(new Color(192, 192, 192));}
       else{jButton3.setForeground(new Color(0, 0, 60));}
     if (sh==10){jButton1.setForeground(new Color(192, 192, 192));}
       else{jButton1.setForeground(new Color(0, 0, 80));}
     Stringer.setGraphics(g);
     g.setFont(new java.awt.Font("SansSerif", 1, 14));
     g.setColor(new Color(255, 255, 255));
     g.fillRect(5,55,190,65);
     if (sh>3){g.fillRect(200,55,190,65);}
     if (sh>2){g.fillRect(5,138,190,85);}
     if (sh>4){g.fillRect(200,138,190,115);}
     if (sh>5){g.fillRect(395,55,195,65);}
     if (sh==7){g.fillRect(395,138,195,115);}
     if (sh>7){g.fillRect(395,138,195,153);}
     g.fillRect(5,309,585,90);
     g.setColor(new Color(157, 187, 255));
     g.drawRect(5,309,585,90);
     if (sh<3){g.setColor(Color.red);}
     g.drawRect(5,55,190,65);
     if (sh>3)
       {if (sh==4){g.setColor(Color.red);}
          else{g.setColor(new Color(157, 187, 255));}
        g.drawRect(200,55,190,65);}
     if (sh>2)
       {if (sh==3){g.setColor(Color.red);}
          else{g.setColor(new Color(157, 187, 255));}
        g.drawRect(5,138,190,85);}
     if (sh>4)
        {if (sh==5){g.setColor(Color.red);}
          else{g.setColor(new Color(157, 187, 255));}
        g.drawRect(200,138,190,115);}
     if (sh>5)
        {if (sh==6){g.setColor(Color.red);}
          else{g.setColor(new Color(157, 187, 255));}
        g.drawRect(395,55,195,65);}
     if (sh==7){
        g.setColor(Color.red);
        g.drawRect(395,138,195,115);}
     if (sh>7)
        {if (sh==8){g.setColor(Color.red);}
          else{g.setColor(new Color(157, 187, 255));}
        g.drawRect(395,138,195,153);}

     g.setColor(new Color(180, 0, 80));
     g.setFont(new java.awt.Font("SansSerif", 3, 13));
     g.drawString("Исходная задача 1:",40,50);
     if (sh>3){g.drawString("Исходная задача 2:",235,50);}
     if (sh>5){g.drawString("Исходная задача 3:",430,50);}
     g.setColor(new Color(0, 0, 80));
     g.setFont(new java.awt.Font("SansSerif", 1, 14));
     Stringer.drawString("f(x) = \u2211 c_{j}x_{j} \u2192 max, j = 1...n", 9, 70);
     Stringer.drawString(" \u2211 a_{ij}x_{j} = b_{i}, i = 1...m; m < n", 9, 90);
     Stringer.drawString(" x_{j} \u2265 0, j = 1...n", 49, 110);
     g.setColor(Color.red);
     Stringer.drawString(" \u2211 a_{ij}x_{j} =", 9, 90);
     g.setColor(new Color(0, 0, 80));
     Stringer.drawString(" \u2211 a_{ij}x_{j}", 9, 90);
     if (sh>2)
       {g.setColor(new Color(0, 0, 80));
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        Stringer.drawString("f(x) = \u2211 c_{j}x_{j} \u2192 max, j = 1...n", 9, 155);
        Stringer.drawString(" x_{i} + \u2211 a&{ij}{*}x_{j} = b&{i}{*}", 48, 175);
        Stringer.drawString("i = 1...m, j = m+1...n;", 35, 195);
        Stringer.drawString(" x_{j} \u2265 0, j = 1...n", 49, 215);
        if (sh==3){g.setColor(Color.red);}
          else{g.setColor(new Color(157, 187, 255));}
        g.drawLine(95,121,95,133);g.drawLine(105,121,105,133);
        g.drawLine(100,136,90,131);g.drawLine(100,136,110,131);}
     if (sh>3)
       {g.setColor(new Color(0, 0, 80));
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        Stringer.drawString("f(x) = \u2211 c_{j}x_{j} \u2192 max, j = 1...n", 204, 70);
        Stringer.drawString(" \u2211 c_{ij}x_{j} \u2264 b_{i}, i = 1...m; m < n", 204, 90);
        Stringer.drawString(" x_{j} \u2265 0, j = 1...n", 244, 110);
        g.setColor(Color.red);
        Stringer.drawString(" \u2211 c_{ij}x_{j} \u2264", 204, 90);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString(" \u2211 c_{ij}x_{j}", 204, 90);
        }
     if (sh>4)
       {g.setColor(new Color(0, 0, 80));
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        Stringer.drawString("f(x) = \u2211 c_{j}x_{j} \u2192 max, j = 1...n", 204, 153);
        Stringer.drawString(" \u2211(a_{ij}x_{j}) + d_{i}x_{k} = b_{i}", 233, 173);
        g.setFont(new java.awt.Font("SansSerif", 1, 12));
        g.drawString("j = 1...n, i = 1...m, k = m+1...2m", 213, 193);
        Stringer.drawString("d_{k} =", 240, 218);
        Stringer.drawString("0, k-m \u2260 i", 280, 208);
        Stringer.drawString("1, k-m = i", 280, 228);
        g.drawLine(270,203,270,223);g.drawLine(270,203,275,203);g.drawLine(270,223,275,223);
        Stringer.drawString("x_{j} \u2265 0, j = 1...n+2m", 232, 243);
        if (sh==5){g.setColor(Color.red);}
          else{g.setColor(new Color(157, 187, 255));}
        g.drawLine(290,121,290,133);g.drawLine(300,121,300,133);
        g.drawLine(295,136,285,131);g.drawLine(295,136,305,131);
        }
     if (sh>5)
       {g.setColor(new Color(0, 0, 80));
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        Stringer.drawString("f(x) = \u2211 c_{j}x_{j} \u2192 max, j = 1...n", 402, 70);
        Stringer.drawString(" \u2211 c_{ij}x_{j} \u2265 b_{i}, i = 1...m; m < n", 401, 90);
        Stringer.drawString(" x_{j} \u2265 0, j = 1...n", 441, 110);
        g.setColor(Color.red);
        Stringer.drawString(" \u2211 c_{ij}x_{j} \u2265", 401, 90);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString(" \u2211 c_{ij}x_{j}", 401, 90);
        }
     if (sh>6){
        if (sh<9)g.setColor(Color.red);
        else g.setColor(new Color(157, 187, 255));
        g.drawLine(487,121,487,133);g.drawLine(497,121,497,133);
        g.drawLine(492,136,482,131);g.drawLine(492,136,502,131);
        if (sh==7){
        g.setColor(new Color(0, 0, 80));
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        Stringer.drawString("f(x) = \u2211 c_{j}x_{j} \u2192 max, j = 1...n", 402, 153);
        Stringer.drawString("\u2211(a_{ij}x_{j}) - d_{i}x_{k} = b_{i},  j = 1...n,", 403, 173);
        Stringer.drawString("i = 1...m, k = m+1...2m", 421, 193);
        Stringer.drawString("d_{k} =", 433, 218);
        Stringer.drawString("0, k-m \u2260 i", 473, 208);
        Stringer.drawString("1, k-m = i", 473, 228);
        g.drawLine(463,203,463,223);g.drawLine(463,203,468,203);g.drawLine(463,223,468,223);
        Stringer.drawString("x_{j} \u2265 0, j = 1...n+2m", 435, 243);}}
     if (sh>7)
       {g.setColor(new Color(0, 0, 80));
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        Stringer.drawString("f(x) = \u2211(c_{j}x_{j}) - M \u2211 y_{t}\u2192max;", 402, 153);
        Stringer.drawString("\u2211(a_{ij}x_{j}) - d_{i}x_{k} + z_{t}y_{t} = b_{i}", 418, 173);
        g.setFont(new java.awt.Font("SansSerif", 1, 12));
        Stringer.drawString("d_{k} =", 440, 203);
        Stringer.drawString("0, k-m \u2260 i", 480, 193);
        Stringer.drawString("1, k-m = i", 480, 208);
        g.drawLine(470,188,470,203);g.drawLine(470,188,475,188);g.drawLine(470,203,475,203);
        Stringer.drawString("z_{t} =", 440, 233);
        Stringer.drawString("0, t \u2260 i", 480, 223);
        Stringer.drawString("1, t = i", 480, 238);
        g.drawLine(470,218,470,233);g.drawLine(470,218,475,218);g.drawLine(470,233,475,233);
        g.setFont(new java.awt.Font("SansSerif", 1, 12));
        g.drawString("j = 1...n, i = 1...m,", 445, 253);
        g.drawString("k = m+1...2m, t = 1...m", 430, 268);
        Stringer.drawString("x_{j}\u22650,_{ }j=1...n+2m; y_{t}\u22650,_{ }t=1...m", 399, 283);
      }
     g.setColor(new Color(0, 0, 80));
     g.setFont(new java.awt.Font("SansSerif", 1, 14));
     if (sh==1)
      {Stringer.drawString("Ограничения в исходной задаче даны в виде равенств. Требуется выделить", 17, 329);
       Stringer.drawString("базисные переменные.", 10, 349);
      }
     if (sh==2)
      {Stringer.drawString("Если в ограничениях имеются ровно m(кол-во ограничений) переменных, ", 17, 329);
       Stringer.drawString("коэффициенты которых образуют единичную матрицу. Тогда эти переменные и", 10, 349);
       Stringer.drawString("будут являться базисными. Т.е. исходная задача представлена в канонической", 10, 369);
       Stringer.drawString("форме.", 10, 389);
      }
     if (sh==3)
      {Stringer.drawString("Если в ограничениях нет таких переменных, то используются преобразования",15,329);
       Stringer.drawString("Гаусса-Жордана, приводя таким образом исходную задачу к канонической", 10, 349);
       Stringer.drawString("форме. Тогда базисное решение имеет вид:", 10, 369);
       Stringer.drawString("x_{i} = b&{i}{*},  i = 1...m,  x_{m+1} = ... = 0.", 195, 389);
       g.setColor(Color.red);
       Stringer.drawString("x_{i} = b&{i}{*},  i = 1...m,  x_{m+1} = ... = 0", 195, 389);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("x_{i} = b&{i}{*},  i = 1...m,", 195, 389);
       g.setColor(Color.red);
       Stringer.drawString("x_{i} = b&{i}{*},  i = 1...m", 195, 389);
       g.setColor(new Color(0, 0, 80));
       Stringer.drawString("x_{i} = b&{i}{*},", 195, 389);
       g.setColor(Color.red);
       Stringer.drawString("x_{i} = b&{i}{*}", 195, 389);
      }
     if (sh==4)
      {Stringer.drawString("Ограничения в исходной задаче даны в виде неравенств \u2264. Требуется", 15, 329);
       Stringer.drawString("выделить базисные переменные.", 10, 349);
      }
     if (sh==5)
      {g.setFont(new java.awt.Font("SansSerif", 1, 14));
       Stringer.drawString("В каждое уравнение вводится дополнительная переменная с коэффициентом", 15, 329);
       Stringer.drawString("+1, а в остальные с коэффициентом 0. Эти дополнительные переменные и", 10, 349);
       Stringer.drawString("будут являться базисными. Исходная задача представлена в канонической", 10, 369);
       Stringer.drawString("форме.", 10, 389);
      }
     if (sh==6)
      {Stringer.drawString("Ограничения в исходной задаче даны в виде неравенств \u2265. Требуется", 15, 329);
       Stringer.drawString("выделить базисные переменные.", 10, 349);
      }
     if (sh==7)
      {Stringer.drawString("В каждое уравнение вводится дополнительная переменная с коэффициентом ", 15, 329);
       Stringer.drawString("-1, а в остальные с коэффициентом 0. Эти дополнительные переменные не", 10, 349);
       Stringer.drawString("будут являться базисными. Исходная задача представлена в канонической", 10, 369);
       Stringer.drawString("форме.", 10, 389);
      }
     if (sh==8)
      {Stringer.drawString("В каждое уравнение вводится искусственная переменная с коэффициентом +1,", 15, 329);
       Stringer.drawString("а в остальные с коэффициентом 0. Искусственные переменные будут являться", 10, 349);
       Stringer.drawString("базисными. Также они входят в целевую функцию с коэффициентом -М. Исход-", 10, 369);
       Stringer.drawString("ная задача представлена в расширенной форме, т.е. приведена к М-задаче.", 10, 389);
      }
     if (sh==9)
      {Stringer.drawString("Ограничения в исходной задаче даны в виде равенств и неравенств. При этом", 15, 329);
       Stringer.drawString("для кахдого ограничения используется рассмотренный выше тот или иной", 10, 349);
       Stringer.drawString("спoсоб преобразования. Задача приводится либо к канонической, либо к", 10, 369);
       Stringer.drawString("расширенной форме.", 10, 389);
      }
     if (sh==10)
      {Stringer.drawString("После всех преобразований задача решается симплекс методом.", 15, 329);}
  }//end paintComponent
 }//end class  Panel_mypaint

  void jButton1_actionPerformed(ActionEvent e) {
    sh++;
    if (sh>10) sh=10;
    jPanel1.repaint();
  }

  void jButton3_actionPerformed(ActionEvent e) {
    sh--;
    if (sh<1)sh=1;
    jPanel1.repaint();
  }

  void jButton2_actionPerformed(ActionEvent e) {
    sh=1;
    jPanel1.repaint();
  }

}