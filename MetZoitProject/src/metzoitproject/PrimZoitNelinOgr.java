package metzoitproject;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class PrimZoitNelinOgr extends JApplet {
  //JPanel jPanel1 = new JPanel();
  Panel_paint jPanel1 = new Panel_paint();
  JLabel labelZagol = new JLabel();
  JButton button_last = new JButton();
  JButton button_refresh = new JButton();
  JButton button_next = new JButton();
  JButton buttonPlus = new JButton();
  JButton buttonMinus = new JButton();
  JButton buttonLeft = new JButton();
  JButton buttonRight = new JButton();
  JButton buttonUp = new JButton();
  JButton buttonDown = new JButton();
  int o1=20,o2=280,mash=25, i=1,step=1,x1=1,x2=2,vyb_t_ky=1,shag=1;
  double deltaZ=0.1,x11=2.455,x21=3,x12=3,x22=4;
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
    this.setSize(new Dimension(1000,900));
    this.getContentPane().setLayout(null);
    this.getContentPane().setBackground(new Color(247, 247, 255));
    jPanel1.setBackground(new Color(247, 247, 255));
    jPanel1.setBounds(new Rectangle(13, 28, 454, 453));
    labelZagol.setBackground(new Color(130, 0, 80));
    labelZagol.setFont(new java.awt.Font("Dialog", 1, 16));
    labelZagol.setForeground(new Color(130, 0, 80));
    labelZagol.setHorizontalAlignment(SwingConstants.CENTER);
    labelZagol.setText("Пример");
    labelZagol.setBounds(new Rectangle(206, 5, 67, 23));
    button_last.setBackground(new Color(220, 230, 255));
    button_last.setBounds(new Rectangle(70, 494, 100, 23));
    button_last.setFont(new java.awt.Font("Dialog", 1, 14));
    button_last.setForeground(new Color(0, 0, 60));
    button_last.setText("<==");
    button_last.addActionListener(new PrimZoitNelinOgr_button_last_actionAdapter(this));
    button_refresh.setBackground(new Color(220, 230, 255));
    button_refresh.setBounds(new Rectangle(190, 494, 100, 23));
    button_refresh.setFont(new java.awt.Font("Dialog", 1, 12));
    button_refresh.setForeground(new Color(0, 0, 60));
    button_refresh.setText("Обновить");
    button_refresh.addActionListener(new PrimZoitNelinOgr_button_refresh_actionAdapter(this));
    button_next.setBackground(new Color(220, 230, 255));
    button_next.setBounds(new Rectangle(310, 494, 100, 23));
    button_next.setFont(new java.awt.Font("Dialog", 1, 14));
    button_next.setForeground(new Color(0, 0, 60));
    button_next.setText("==>");
    button_next.addActionListener(new PrimZoitNelinOgr_button_next_actionAdapter(this));
    buttonPlus.setBackground(new Color(220, 230, 255));
    buttonPlus.setBounds(new Rectangle(310, 278, 20, 20));
    buttonPlus.setFont(new java.awt.Font("Dialog", 0, 12));
    buttonPlus.setForeground(new Color(0, 0, 60));
    buttonPlus.setMargin(new Insets(0, 0, 0, 0));
    buttonPlus.setText("+");
    buttonPlus.addActionListener(new PrimZoitNelinOgr_buttonPlus_actionAdapter(this));
    buttonMinus.setBackground(new Color(220, 230, 255));
    buttonMinus.setBounds(new Rectangle(333, 278, 20, 20));
    buttonMinus.setFont(new java.awt.Font("Dialog", 0, 12));
    buttonMinus.setForeground(new Color(0, 0, 60));
    buttonMinus.setMargin(new Insets(0, 0, 0, 0));
    buttonMinus.setText("-");
    buttonMinus.addActionListener(new PrimZoitNelinOgr_buttonMinus_actionAdapter(this));
    buttonLeft.setBackground(new Color(220, 230, 255));
    buttonLeft.setBounds(new Rectangle(356, 278, 20, 20));
    buttonLeft.setFont(new java.awt.Font("Dialog", 0, 12));
    buttonLeft.setForeground(new Color(0, 0, 60));
    buttonLeft.setMargin(new Insets(0, 0, 0, 0));
    buttonLeft.setText("\u2190");
    buttonLeft.addActionListener(new PrimZoitNelinOgr_buttonLeft_actionAdapter(this));
    buttonRight.setBackground(new Color(220, 230, 255));
    buttonRight.setBounds(new Rectangle(379, 278, 20, 20));
    buttonRight.setFont(new java.awt.Font("Dialog", 0, 12));
    buttonRight.setForeground(new Color(0, 0, 60));
    buttonRight.setMargin(new Insets(0, 0, 0, 0));
    buttonRight.setText("\u2192");
    buttonRight.addActionListener(new PrimZoitNelinOgr_buttonRight_actionAdapter(this));
    buttonUp.setBackground(new Color(220, 230, 255));
    buttonUp.setBounds(new Rectangle(402, 278, 20, 20));
    buttonUp.setFont(new java.awt.Font("Dialog", 0, 12));
    buttonUp.setForeground(new Color(0, 0, 60));
    buttonUp.setMargin(new Insets(0, 0, 0, 0));
    buttonUp.setText("\u2191");
    buttonUp.addActionListener(new PrimZoitNelinOgr_buttonUp_actionAdapter(this));
    buttonDown.setBackground(new Color(220, 230, 255));
    buttonDown.setBounds(new Rectangle(425, 278, 20, 20));
    buttonDown.setFont(new java.awt.Font("Dialog", 0, 12));
    buttonDown.setForeground(new Color(0, 0, 60));
    buttonDown.setMargin(new Insets(0, 0, 0, 0));
    buttonDown.setText("\u2193");
    buttonDown.addActionListener(new PrimZoitNelinOgr_buttonDown_actionAdapter(this));
    this.getContentPane().add(jPanel1, null);
    jPanel1.setLayout(null);
    jPanel1.add(buttonLeft, null);
    jPanel1.add(buttonMinus, null);
    jPanel1.add(buttonPlus, null);
    jPanel1.add(buttonDown, null);
    jPanel1.add(buttonUp, null);
    jPanel1.add(buttonRight, null);
    this.getContentPane().add(labelZagol, null);
    this.getContentPane().add(button_last, null);
    this.getContentPane().add(button_refresh, null);
    this.getContentPane().add(button_next, null);
  }
  class Panel_paint extends JPanel{
    public void paintComponent(Graphics g) {
      super.paintComponent(g); // 454,453
      Stringer2.setGraphics(g);
      Stringer3.setGraphics(g);
      Stringer4.setGraphics(g);
      Stringer5.setGraphics(g);
      BUKgarf.setGraphics(g);
      g.setColor(Color.white);
      g.fillRect(1, 80, 285, 225);
      g.fillRect(305, 80, 145, 75);
      g.fillRect(305, 175, 145, 75);
      g.fillRect(305, 270, 145, 35);
      g.fillRect(1, 325,450,127);
      g.setColor(new Color(157, 187, 255));
      g.drawRect(1, 80, 285, 225);
      g.drawRect(305, 80, 145, 75);
      g.drawRect(305, 175, 145, 75);
      g.drawRect(305, 270, 145, 35);
      g.drawRect(1, 325,450,127);

      g.setColor(new Color(180,0,60));
      g.setFont(new java.awt.Font("Dialog", 3, 12));
      g.drawString("Задача:", 5, 15);
      g.drawString("Графическая иллюстрация:", 5, 75);
      g.drawString("Величины:", 310, 75);
      g.drawString("Формулы:", 310, 170);
      g.drawString("Масштаб:", 310, 265);
      g.setFont(new java.awt.Font("Dialog", 3, 16));
      if (step>44) g.drawString("3."+shag,10,345);
      if (step<33 && step>=21) g.drawString("1."+shag,10,345);
      if (step>=33 && step<=44 && vyb_t_ky==1) g.drawString("2."+shag,10,345);
      if (step<21) g.drawString("0."+shag,10,345);
      g.setColor(new Color(0,0,80));
      g.setFont(new java.awt.Font("Dialog", 1, 14));
      Stringer3.drawString("             Найти минимум функции f(x)=x&{1}{2}+4x_{1}+1,5x&{2}{2}-8x_{2}-2x_{1}x_{2}", 10, 15);
      Stringer3.drawString("методом Зойтендейка при ограничениях g_{1}(x)=-x_{1}+x_{2}-4\u22640,", 10, 35);
      Stringer3.drawString("g_{2}(x)=x_{1}-4\u22640,  g_{3}(x)=0,5(x_{1}-2)^{2}-x_{2}\u22640,  g_{4}(x)=0,25x&{2}{2}-x_{2}-x_{1}+2\u22640", 10, 55);

      Stringer2.drawString("x^{0}=("+x1+";"+" "+x2+")^{T} - начальная",313,95);
      Stringer2.drawString("                    точка",313,110);
      if (step==10 || step==16 || (step==28 && vyb_t_ky==2) || (vyb_t_ky==1 && (step==31 || step==46 || step==50 || step==58))) {g.setColor(Color.RED);Stringer2.drawString("\u03b5_{0}=0,03 - малое число",313,125);
                     g.drawLine(308,117,290,107);g.drawLine(308,117,303,110);g.drawLine(308,117,300,117);}
      else {g.setColor(new Color(0,0,80));Stringer2.drawString("\u03b5_{0}=0,03 - малое число",313,125);}
      if (step==8 || ((step==21 || step==36) && vyb_t_ky==1) || ((step==33 || step==48) && vyb_t_ky==2)) {g.setColor(Color.RED);g.drawString("M=10 - число итераций",313,145);
                    g.drawLine(308,137,290,127);g.drawLine(308,137,303,130);g.drawLine(308,137,300,137);}
      else {g.setColor(new Color(0,0,80));g.drawString("M=10 - число итераций",313,145);}
      g.setColor(new Color(0,0,80));
      if ((vyb_t_ky==1 && (step==19 || step==34)) || (vyb_t_ky==2 && (step==19 || step==31 || step==46))) {g.setColor(Color.RED);Stringer2.drawString("x^{k+1}=x^{k}+t_{k}s^{k}",313,195);
                      g.drawLine(308,187,290,177);g.drawLine(308,187,303,180);g.drawLine(308,187,300,187);}
      else {g.setColor(new Color(0,0,80));Stringer2.drawString("x^{k+1}=x^{k}+t_{k}s^{k}",313,195);}
      if (step==10 || ((step==23 || step==38) && vyb_t_ky==1) || ((step==35 || step==50) && vyb_t_ky==2)) {g.setColor(Color.RED);Stringer2.drawString("-\u03b5_{k} \u2264 g_{j}(x^{k}) \u22640, j \u0454 J_{a}",313,215);
                     g.drawLine(308,207,290,197);g.drawLine(308,207,303,200);g.drawLine(308,207,300,207);}
      else {g.setColor(new Color(0,0,80));Stringer2.drawString("-\u03b5_{k} \u2264 g_{j}(x^{k}) \u22640, j \u0454 J_{a}",313,215);}
      g.setColor(new Color(0,0,80));
      if (step==16 || (step==28 && vyb_t_ky==2) || (vyb_t_ky==1 && (step==31 || step==46 || step==58))) {g.setColor(Color.RED);Stringer2.drawString("<\u2207f(x^{k}), s^{k}> \u2265 -\u03b5_{k}",313,240);
                     g.drawLine(308,232,290,222);g.drawLine(308,232,303,225);g.drawLine(308,232,300,232);}
      else {g.setColor(new Color(0,0,80));Stringer2.drawString("<\u2207f(x^{k}), s^{k}> \u2265 -\u03b5_{k}",313,240);}


      if ((step>=6 && (vyb_t_ky==1  || (vyb_t_ky==2 && (step<39 || (step>42 && step<54) || step>57))))){
               g.setColor(new Color(251,120,255));
               Polygon polygon1 = new Polygon(new int[] {o1+(int)(17*mash/16),o1+(int)(5*mash/4),o1+(int)(3*mash/2),o1+2*mash,o1+2*mash+(int)(mash/2),o1+3*mash,o1+3*mash+(int)(mash/2), o1+4*mash, o1+4*mash, o1+3*mash+(int)(mash/2), o1+3*mash, o1+2*mash+(int)(mash/2),o1+2*mash,o1+(int)(3*mash/2),o1+(int)(5*mash/4),o1+(int)(17*mash/16), o1+mash},new int[] {o2-(int)(3*mash/2),o2-mash,o2-(int)(mash/2),o2,o2-(int)(mash/8),o2 -(int)(mash/2),o2-mash, o2-2*mash, o2-5*mash-2*(int)(mash/4),o2-5*mash-2*(int)(mash/9),o2 -4*mash-4*(int)((mash+3)/6 +1),o2 -4*mash-4*(int)(mash/6 -1),o2 -4*mash-(int)(mash/7 -1),o2 -4*mash-(int)((mash+40)/10 -22 ),o2-3*mash, o2- 2*(mash+7) ,o2-2*mash}, 16);
               g.fillPolygon(polygon1);
               }

     /*    if ((vyb_t_ky==1 && ((step>=27 && step<=30) || (step>=42 && step<46))) || (vyb_t_ky==2 && ((step>=39 && step<=42) || (step>=54 && step<=57)))){
        g.setColor(new Color(0,0,80));
        g.drawLine(142,82,142,304);
        g.drawLine(142,82,145,87);
        g.drawLine(142,82,139,87);
        g.drawLine(2,193,284,193);
        g.drawLine(284,193,279,190);
        g.drawLine(284,193,279,196);
        BUKgarf.drawString("s_{2}",152,92);
        BUKgarf.drawString("s_{1}",274,183);
        BUKgarf.drawString("1",227,203);
        BUKgarf.drawString("-1",48,203);
        BUKgarf.drawString("1",147,110);
        BUKgarf.drawString("-1",147,283);
        g.setColor(Color.BLUE);
        int i=103;
        do
        {
          i+=10;
          g.drawLine(62,i,62,i+10);
          if (vyb_t_ky==1 && (step<29 || (step>=42 && step<=43))) g.drawLine(62,i,67,i);
          if (vyb_t_ky==2 && (step<41 || (step>=54 && step<=55))) g.drawLine(62,i,67,i);
          g.drawLine(222,i,222,i+10);
          if (vyb_t_ky==1 && (step<29 || (step>=42 && step<=43))) g.drawLine(222,i,217,i);
          if (vyb_t_ky==2 && (step<41 || (step>=54 && step<=55))) g.drawLine(222,i,217,i);
        }
        while(i<263);

        i=52;
        do
        {
          i+=10;
          g.drawLine(i,113,i+10,113);
          if (vyb_t_ky==1 && (step<29 || (step>=42 && step<=43))) g.drawLine(i,113,i,118);
          if (vyb_t_ky==2 && (step<41 || (step>=54 && step<=55))) g.drawLine(i,113,i,118);
          g.drawLine(i,273,i+10,273);
          if (vyb_t_ky==1 && (step<29 || (step>=42 && step<=43))) g.drawLine(i,273,i,268);
          if (vyb_t_ky==2 && (step<41 || (step>=54 && step<=55))) g.drawLine(i,273,i,268);
        }
        while(i<212);

        g.setColor(Color.magenta);
        if ((vyb_t_ky==1 && (step==28 || step==43)) || (vyb_t_ky==2 && (step==40 || step==55))) {
          i=82;
          do
          {
            g.drawLine(-i+193+142,i,-i+193+142-7,i+7);
            g.drawLine(-i+193+142,i,-i+193+142-2,i+7);
           i+=7;
          }
          while(i<299);
        }

        if ((vyb_t_ky==1 && step>=44 && step<=46) || (vyb_t_ky==2 && step>=56 && step<=57)) {
          if (step==44 || step==56) {g.setColor(Color.magenta);
          for(int j=0;j<=284;j+=20)
           for (i=2;i<284;i++)
             {
              if (193-j-(i-142)>=82 && 193-j-(i-142)<=304) g.drawLine(i,193-j-(i-142),i,193-j-(i-142));
              if (193+j-(i-142)>=82 && 193+j-(i-142)<=304) g.drawLine(i,193+j-(i-142),i,193+j-(i-142));
             }}
         g.setColor(Color.red);
         g.drawPolygon(new int[] {222,222,62},new int[]  {113,273,273},3);
         g.drawLine(142,193,42,93);
         g.drawLine(49,94,42,93);
         g.drawLine(43,100,42,93);
         if (vyb_t_ky==1) Stringer2.drawString("-\u2207f(x^{2})",57,99);
         if (vyb_t_ky==2) Stringer2.drawString("-\u2207f(x^{3})",57,99);
         if (step==57 || step==45){ g.setColor(Color.magenta); Stringer2.drawString("B",227,113); Stringer2.drawString("A",52,283);
           for (i = 62; i < 222; i++) {
             if (193 - (i - 142) >= 82 &&
                 193 - (i - 142) <= 304) g.drawLine(i,
                 193 - (i - 142) , i, 193 - (i - 142));
           }
         }

         }

         if (vyb_t_ky==1 && step>=29 && step<=30) {
          g.setColor(Color.red);
          g.drawPolygon(new int[] {222,222,62},new int[]  {113,273,273},3);
          g.drawLine(142,193,82,93);
          g.drawLine(82,103,82,93);
          g.drawLine(91,99,82,93);
          Stringer2.drawString("-\u2207f(x^{1})",91,99);
          if (step==29) {g.setColor(Color.magenta);
          for(int j=0;j<=284;j+=20)
           for (i=2;i<284;i++)
             {
              if (193-j-2*(i-142)/3>=82 && 193-j-2*(i-142)/3<=304) g.drawLine(i,193-j-2*(i-142)/3,i,193-j-2*(i-142)/3);
              if (193+j-2*(i-142)/3>=82 && 193+j-2*(i-142)/3<=304) g.drawLine(i,193+j-2*(i-142)/3,i,193+j-2*(i-142)/3);
             }}
         if (step==30){ g.setColor(Color.magenta); Stringer2.drawString("s^{1}",227,123);g.fillOval(219,110,6,6);
           for (i = 2; i < 284; i++) {
             if (166 - 2 * (i - 142) / 3 >= 82 &&
                 166 - 2 * (i - 142) / 3 <= 304) g.drawLine(i,
                 166 - 2 * (i - 142) / 3, i, 166 - 2 * (i - 142) / 3);
           }
         }
         }

         if (vyb_t_ky==2 && step>=41 && step<=42) {
         g.setColor(Color.red);
         g.drawPolygon(new int[] {222,222,62},new int[]  {113,273,273},3);
         g.drawLine(142,193,94,113);
         g.drawLine(94,123,94,113);
         g.drawLine(103,119,94,113);
         Stringer2.drawString("-\u2207f(x^{1})",99,103);
         if (step==41) {g.setColor(Color.magenta);
         for(int j=0;j<=284;j+=20)
          for (i=2;i<284;i++)
            {
             if (193-j-2*(i-142)/3.51>=82 && 193-j-2*(i-142)/3.51<=304) g.drawLine(i,(int)(193-j-2*(i-142)/3.51),i,(int)(193-j-2*(i-142)/3.51));
             if (193+j-2*(i-142)/3.51>=82 && 193+j-2*(i-142)/3.51<=304) g.drawLine(i,(int)(193+j-2*(i-142)/3.51),i,(int)(193+j-2*(i-142)/3.51));
            }}
        if (step==42){ g.setColor(Color.magenta); Stringer2.drawString("s^{1}",227,123);g.fillOval(219,110,6,6);
          for (i = 2; i < 284; i++) {
            if (158 - 2 * (i - 142) / 3.51 >= 82 &&
                158 - 2 * (i - 142) / 3.51 <= 304) g.drawLine(i,
                (int)(158 - 2 * (i - 142) / 3.51), i,(int)(158 - 2 * (i - 142) / 3.51));
          }
        }
        }




      }
*/
      //график------------------
      if (vyb_t_ky==1  || (vyb_t_ky==2 && (step<39 || (step>42 && step<54) || step>57))){
        g.setColor(new Color(0, 0, 80));
        if (o2 > 91 && o2 < 290) {
          g.drawLine(2, o2, 285, o2);
          g.drawLine(285, o2, 280, o2 - 3);
          g.drawLine(285, o2, 280, o2 + 3);
          BUKgarf.drawString("x_{1}", 270, o2 - 7);
          i = 1;
          do {
            if (o1 + i * mash > 5 && o1 + i * mash < 280) {
              g.drawLine(o1 + i * mash, o2 - 3, o1 + i * mash, o2 + 3);
              BUKgarf.drawString("" + i, o1 + i * mash - 4, o2 + 15);
            }
            i++;
          }
          while (o1 + i * mash < 285);

          i = 1;
          do {
            if (o1 - i * mash > 5 && o1 - i * mash < 280) {
              g.drawLine(o1 - i * mash, o2 - 3, o1 - i * mash, o2 + 3);
              BUKgarf.drawString("" + i, o1 - i * mash - 4, o2 + 15);
            }
            i++;
          }
          while (o1 - i * mash > 1);

        }
        if (o1 > 2 && o1 < 280) {
          g.drawLine(o1, 81, o1, 305);
          g.drawLine(o1, 81, o1 + 3, 87);
          g.drawLine(o1, 81, o1 - 3, 87);
          BUKgarf.drawString("x_{2}", o1 - 15, 90);
          i = 1;
          do {
            if (o2 + i * mash > 85 && o2 + i * mash < 300) {
              g.drawLine(o1 - 3, o2 + i * mash, o1 + 3, o2 + i * mash);
              BUKgarf.drawString("-" + i, o1 + 10, o2 + i * mash + 3);
            }
            i++;
          }
          while (o2 + i * mash < 300);

          i = 1;
          do {
            if (o2 - i * mash > 85 && o2 - i * mash < 300) {
              g.drawLine(o1 - 3, o2 - i * mash, o1 + 3, o2 - i * mash);
              BUKgarf.drawString("" + i, o1 + 10, o2 - i * mash + 3);
            }
            i++;
          }
          while (o2 - i * mash > 85);

        }

        //линии уровня-------------------
         g.setColor(Color.BLUE);
         g.setFont(new java.awt.Font("Dialog", 1, 16));
         g.drawString("f(x)",260,100);
         if (o1+2*mash-3>=2 && o1+2*mash-3<=284 && o2-4*mash-3>=81 && o2-4*mash-3<=304) g.fillOval(o1+2*(mash-2)-3,o2-4*(mash+3)-3,6,6);
         double r1,r2,r11,r21,k=10;
         for (double i = 0; i <= 10 * Math.PI; i = i + Math.PI / 11520) {
           r1=Math.cos(i/4)*(8*Math.sin(i/4)-4*Math.cos(i/4)-Math.sqrt(-28*Math.cos(i/4)*Math.cos(i/4)+8*Math.sin(i/2)+4))/(2+Math.sin(i/4)*Math.sin(i/4)-2*Math.sin(i/2));
           r2=Math.sin(i/4)*(8*Math.sin(i/4)-4*Math.cos(i/4)-Math.sqrt(-28*Math.cos(i/4)*Math.cos(i/4)+8*Math.sin(i/2)+4))/(2+Math.sin(i/4)*Math.sin(i/4)-2*Math.sin(i/2));
           r11=Math.cos(i/4)*(8*Math.sin(i/4)-4*Math.cos(i/4)-Math.sqrt(56-72 *Math.sin(i/2)+68*Math.sin(i/4)*Math.sin(i/4)))/(2+Math.sin(i/4)*Math.sin(i/4)-2*Math.sin(i/2));
           r21=Math.sin(i/4)*(8*Math.sin(i/4)-4*Math.cos(i/4)-Math.sqrt(56-72 *Math.sin(i/2)+68*Math.sin(i/4)*Math.sin(i/4)))/(2+Math.sin(i/4)*Math.sin(i/4)-2*Math.sin(i/2));
           if ((int)(o1+(mash-1)*r1)>=2 && (int)(o1+(mash-1)*r1)<=284 && (int)(o2-(mash+3)*r2)<=304 && (int)(o2-(mash+3) * r2)>= 81)
           g.drawLine((int)(o1+(mash-1)*r1),(int)(o2-(mash+3)*r2),(int)(o1+(mash-1)*r1),(int)(o2-(mash+3)*r2));
           if((int)(o1+(mash-1)*r11)>=2&&(int)(o1+(mash-1)*r11)<=284 && (int)(o2-(mash+3)*r21)<=304 && (int)(o2-(mash+3)*r21)>=81)
           g.drawLine((int)(o1+(mash-1)*r11),(int)(o2-(mash+3)*r21),(int)(o1+(mash-1)*r11),(int)(o2-(mash+3)*r21));
         }
               /* for (double i=-10;i<=10;i=i+0.05)
            for (double j=-10;j<=10;j=j+0.05)
             {
               if ((int)(j*j+1.5*i*i)==(int)(10+2*i*j+8*i-4*j)) g.drawLine((int)(o1+j*mash/4),(int)(o2-i*mash/4),(int)(o1+(j)*mash/4),(int)(o2-(i)*mash/4));
             }*/
         //--------------------------
      }
      //------------------------

      //1-ое ограничение-----------
      if (step>=2 && (vyb_t_ky==1  || (vyb_t_ky==2 && (step<39 || (step>42 && step<54) || step>57)))) {
      if (step>=6) g.setColor(Color.gray);
      if (step<6 || (((step==11 || step==36 || step==51) && vyb_t_ky==2) || ((step==24 || step==39) && vyb_t_ky==1))) g.setColor(Color.magenta);
      if (o1+7*mash+40<=284 && o1+7*mash>=2 && o2-10-7*mash>=81 && o2-7*mash<=304) Stringer2.drawString("g_{1}(x)\u22640",o1+7*mash-90, o2-7*mash);
      i=2;
      int t=0;
       do
        {
          if (o2+o1-i-1-4*mash>=81 && o2+o1-i-1-4*mash<=303)
           {
             if (step<6 || (((step==11 || step==36 || step==51) && vyb_t_ky==2) || ((step==24 || step==39) && vyb_t_ky==1))) g.setColor(Color.magenta);
             else if (step>=6) {if (i>=o1+4*mash && i<=o1+4*mash) g.setColor(Color.RED);
             else g.setColor(Color.gray);}
             g.drawLine(i, o2 + o1 - i - 4*mash, i + 1, o2 + o1 - i - 1 - 4*mash);
             t++;
             if (step>=6 && !(((step==11 || step==36 || step==51) && vyb_t_ky==2) || ((step==24 || step==39) && vyb_t_ky==1))) {if (i<o1+4*mash || i>o1+4*mash) if (t%7==0) g.drawLine(i, o2 + o1 - i - 4*mash, i + 3, o2 + o1 - i + 3 - 4*mash);}
             else if (t%7==0) g.drawLine(i, o2 + o1 - i - 4*mash, i + 3, o2 + o1 - i + 3 - 4*mash);
           }
          i++;
        }
       while(i+2<285);
      }
      //-----------

      //2-ое ограничение-----------
      if (step>=3 && (vyb_t_ky==1  || (vyb_t_ky==2 && (step<39 || (step>42 && step<54) || step>57)))) {
        g.setColor(Color.GRAY);
        if (o1+4*mash+50<=284 && o1+4*mash>=2 && o2-mash>=81 && o2-mash<=304) Stringer2.drawString("g_{2}(x)\u22640",o1+4*mash+10, o2-mash);
        if (o1+4*mash>=2 && o1+4*mash<=284) {g.drawLine(o1+4*mash,81,o1+4*mash,304);
        if ((step>=6 && step!=11) || (step==11 && vyb_t_ky!=3)) {g.setColor(Color.RED);
          if (o2-2*mash<=304 && o2-5*mash>=81) g.drawLine(o1+4*mash,o2-2*mash,o1+4*mash,o2-5*mash);
          if (o2-2*mash>=81 && o2-5*mash<81) g.drawLine(o1+4*mash,o2-2*mash,o1+4*mash,81);
          if (o2-2*mash>304 && o2-5*mash<=304) g.drawLine(o1+4*mash,o2-5*mash,o1+4*mash,304);}}
        int j=81;
        g.setColor(Color.GRAY);
        do
        {
         if ((step>=6 && step!=11) || (step==11 && vyb_t_ky!=3)) {if (j>o2-2*mash || j<o2-5*mash)
         if (o1+4*mash>=2 && o1+4*mash<=284) g.drawLine(o1+4*mash,j,o1+4*mash-5,j);}
         else if (o1+4*mash>=2 && o1+4*mash<=284) g.drawLine(o1+4*mash,j,o1+4*mash-5,j);
         j=j+10;
        }
        while(j<305);
      }
      //---------------------

      //3-ое ограничение-----------
      if (step>=4 && (vyb_t_ky==1  || (vyb_t_ky==2 && (step<39 || (step>42 && step<54) || step>57)))) {
      if (step>=6) g.setColor(Color.gray);
      if (step<6 || (step==11 && vyb_t_ky!=2)) g.setColor(Color.gray);
      if (o1+5*mash+50<=284 && o1+5*mash>=2 && o2-4*mash>=81 && o2-4*mash<=304) Stringer2.drawString("g_{3}(x)\u22640",o1+5*mash+10, o2-4*mash);
      for (double z=2; z<=283; z=z+deltaZ)
      {
       if (step==11 && vyb_t_ky!=2) g.setColor(Color.gray);
       else if (step>=6) g.setColor(Color.gray);
       if ((int)(o1+4*mash-mash*z)<=285 && (int)(o1+4*mash-mash*(z+deltaZ))>=2 && (int)(o2-mash*(z-2)*(z-2)/2)<=304 && (int)(o2-mash*(z+deltaZ-2)*(z+deltaZ-2)/2)>=81) {
       g.drawLine((int)(o1+4*mash-mash*z),(int)(o2-mash*(z-2)*(z-2)/2),(int)(o1+4*mash-mash*(z+deltaZ)),(int)(o2-mash*(z+deltaZ-2)*(z+deltaZ-2)/2));
       g.drawLine((int)(o1+4*mash-mash*z),(int)(o2-mash*(z-2)*(z-2)/2),(int)(o1+4*mash-mash*z)+3,(int)(o2-mash*(z-2)*(z-2)/2)-3);
       }
      }

       for (double z=2; z<=283; z=z+deltaZ)
       {
        if (step==11 && vyb_t_ky!=2) g.setColor(Color.gray);
        else if (step>=6) {if ((int)(o1+mash*z)>=o1+2*mash && (int)(o1+mash*(z+deltaZ))<=o1+4*mash) g.setColor(Color.RED);
        else g.setColor(Color.gray);}
        if ((int)(o2-mash*(z-2)*(z-2)/2)<=304 && (int)(o1+mash*(z+deltaZ))<=284 && (int)(o1+mash*z)>=2 && (int)(o2-mash*(z+deltaZ-2)*(z+deltaZ-2)/2)>=81)
        {g.drawLine((int)(o1+mash*z),(int)(o2-mash*(z-2)*(z-2)/2),(int)(o1+mash*(z+deltaZ)),(int)(o2-mash*(z+deltaZ-2)*(z+deltaZ-2)/2));
         if (step<6 || (step==11 && vyb_t_ky!=2)) g.drawLine((int)(o1+mash*z),(int)(o2-mash*(z-2)*(z-2)/2),(int)(o1+mash*z)-3,(int)(o2-mash*(z-2)*(z-2)/2)-3);
         else if (step>=6) if ((int)(o1+mash*(z+deltaZ))>o1+4*mash) g.drawLine((int)(o1+mash*z),(int)(o2-mash*(z-2)*(z-2)/2),(int)(o1+mash*z)-3,(int)(o2-mash*(z-2)*(z-2)/2)-3);}
      }
      }

      //---------------------------

      //4-ое ограничение-----------
      if (step>=5 && (vyb_t_ky==1  || (vyb_t_ky==2 && (step<39 || (step>42 && step<54) || step>57)))) {
        if (step>=6) g.setColor(Color.gray);
        if (step<6 || (step==11 && vyb_t_ky!=3)) g.setColor(Color.green);
        if (o1+6*mash+50<=284 && o1+6*mash>=2 && o2-6*mash>=81 && o2-6*mash<=304) Stringer2.drawString("g_{4}(x)\u22640",o1+6*mash, o2-6*mash);
        for (double z=2; z<=284; z+=deltaZ)
          {
           if (step==11 && vyb_t_ky!=3) g.setColor(Color.green);
           else if (step>=6) g.setColor(Color.gray);
           if ((int)(o1+mash*(1+(z-2)*(z-2)/4))>=2 && (int)(o1+mash*(1+(z+deltaZ-2)*(z+deltaZ-2)/4))<=284 && (int)(o2-mash*(z+deltaZ))>=82 && (int)(o2-mash*z)<=304)
            {g.drawLine((int)(o1+mash*(1+(z-2)*(z-2)/4)),(int)(o2-mash*z),(int)(o1+mash*(1+(z+deltaZ-2)*(z+deltaZ-2)/4)),(int)(o2-mash*(z+deltaZ)));
             g.drawLine((int)(o1+mash*(1+(z-2)*(z-2)/4)),(int)(o2-mash*z),(int)(o1+mash*(1+(z-2)*(z-2)/4)+3),(int)(o2-mash*z+3));}
          }
        for (double z=2; z<=284; z+=deltaZ)
          {
           if (step==11 && vyb_t_ky!=3) g.setColor(Color.green);
           else if (step>=6) {if ((int)(o1+mash*(1+(z-2)*(z-2)/4))>=o1+mash && (int)(o1+mash*(1+(z+deltaZ-2)*(z+deltaZ-2)/4))<=o1+2*mash) g.setColor(Color.RED);
           else g.setColor(Color.gray);}
           if ((int)(o1+mash*(1+(z-2)*(z-2)/4))>=2 && (int)(o1+mash*(1+(z+deltaZ-2)*(z+deltaZ-2)/4))<=284 && (int)(o2-4*mash+mash*z)>=82 && (int)(o2-4*mash+mash*(z+deltaZ))<=304)
             {g.drawLine((int)(o1+mash*(1+(z-2)*(z-2)/4)),(int)(o2-4*mash+mash*z),(int)(o1+mash*(1+(z+deltaZ-2)*(z+deltaZ-2)/4)),(int)(o2-4*mash+mash*(z+deltaZ)));
              if (step<6 || (step==11 && vyb_t_ky!=3)) g.drawLine((int)(o1+mash*(1+(z-2)*(z-2)/4)),(int)(o2-4*mash+mash*z),(int)(o1+mash*(1+(z-2)*(z-2)/4)+3),(int)(o2-4*mash+mash*z)-3);
              else if (step>=6) {if ((int)(o1+mash*(1+(z-2)*(z-2)/4))>o1+2*mash) g.drawLine((int)(o1+mash*(1+(z-2)*(z-2)/4)),(int)(o2-4*mash+mash*z),(int)(o1+mash*(1+(z-2)*(z-2)/4)+3),(int)(o2-4*mash+mash*z)-3);}}
          }

      }
      //---------------------------

      if (step>=6 && (vyb_t_ky==1  || (vyb_t_ky==2 && (step<39 || (step>42 && step<54) || step>57)))){
                     g.setColor(Color.RED);
                     g.fillOval(o1+x1*mash-3,o2-x2*mash-3,6,6);
                     if (vyb_t_ky==1) {Stringer2.drawString("x^{0}",o1+x1*mash+5,o2-x2*mash-10);}
                     if (vyb_t_ky==2) Stringer2.drawString("x^{0}",o1+x1*mash+5,o2-x2*mash+10);
                     if (vyb_t_ky==3) Stringer2.drawString("x^{0}",o1+x1*mash-20,o2-x2*mash+5);

      if (step==17) {if (vyb_t_ky==1) {g.setColor(Color.green); g.drawLine(o1+mash,o2-2*mash,o1+2*mash,(int)(o2-3*mash)); g.drawLine(o1+2*mash,o2-3*mash,o1+2*mash-3,o2-3*mash+6);  g.drawLine(o1+2*mash,o2-3*mash,o1+2*mash-6,o2-3*mash + 2);}
                     if (vyb_t_ky==2) {g.drawLine(o1+mash,o2-2*mash,o1+2*mash,(int)(o2-2*mash-0.6*mash)); g.drawLine(o1+2*mash,o2-2*mash-(int)(0.6*mash),o1+2*mash-5,o2-2*mash-(int)(0.6*mash));  g.drawLine(o1+2*mash,o2-2*mash-(int)(0.6*mash),o1+2*mash-3,o2-2*mash-(int)(0.6*mash)+5);}
                 }
      if (step>=19) {if (vyb_t_ky==1) {Stringer2.drawString("x^{1}",o1+2*mash-5,o2-3*mash-5);
                                       g.fillOval(o1+2*(mash+1),o2-3*mash-3,6,6);}
                     if (vyb_t_ky==2) {Stringer2.drawString("x^{1}",(int)(o1+1.59*mash+5),o2-(int)(2.35*mash)+10);
                                       g.fillOval((int)(o1+1.59*mash-3),o2-(int)(2.35*mash)-3,6,6);}
                     }
      if (step==29) {if (vyb_t_ky==2) {g.drawLine((int)(o1+1.59*mash),(int)(o2-2.35*mash),(int)(o1+1.59*mash-mash),(int)(o2-2.35*mash-mash));
                                       g.drawLine((int)(o1+1.59*mash-mash),(int)(o2-2.35*mash-mash),(int)(o1+1.59*mash-mash+5),(int)(o2-2.35*mash-mash+2));
                                       g.drawLine((int)(o1+1.59*mash-mash),(int)(o2-2.35*mash-mash),(int)(o1+1.59*mash-mash+3),(int)(o2-2.35*mash-mash+7));}}
      if (step>=31) {if (vyb_t_ky==2) {Stringer2.drawString("x^{2}",(int)(o1+1.47*mash-5),o2-(int)(2.47*mash)-5);
                                       g.fillOval((int)(o1+1.47*mash-3),o2-(int)(2.47*mash)-3,6,6);}
                                      }

      if (step==32) {if (vyb_t_ky==2) {g.drawLine(o1+3*mash,o2-4*mash,o1+3*mash-7,o2-4*mash+3);g.drawLine(o1+3*mash,o2-4*mash,o1+3*mash-3,o2-4*mash+7);}}
      if (step>=31 && step<57 && vyb_t_ky==1) {Stringer2.drawString("x^{2}",o1+2*mash-25,o2-3*mash-5);
                                               g.fillOval(o1+2*(mash-6),o2-4*mash+7,6,6);}
      if (step==44) {if (vyb_t_ky==2) {g.drawLine(o1+3*mash,o2-4*mash,o1+3*mash-7,o2-4*mash+3);g.drawLine(o1+3*mash,o2-4*mash,o1+3*mash-3,o2-4*mash+7);}}
      if ((step>=43 && step<=52)) {if (vyb_t_ky==1) {Stringer2.drawString("x^{3}",o1+2*mash+5,o2-4*mash-5);
                                       g.fillOval(o1+2*mash,o2-4*(mash+2),6,6);}
                     if (vyb_t_ky==2) {Stringer2.drawString("x^{3}",o1+3*mash-5,o2-4*mash-5);
                                       g.fillOval(o1+3*mash,o2-4*mash,6,6);}              }
               if (step==53){if (vyb_t_ky==1) {Stringer2.drawString("x^{*}",o1+2*mash+5,o2-4*mash-5);
                                       g.fillOval(o1+2*mash,o2-4*(mash+2),6,6);
               }              }
                }



      g.setColor(new Color(0,0,80));
      if (step==1) button_last.setEnabled(false); else button_last.setEnabled(true);
      g.setFont(new java.awt.Font("Dialog", 1, 14));
      if (step==1) g.drawString("Построим линии уровня f(x).",40,345);

      if (step==2) {g.drawString("Построим множество допустимых значений X:",40,345);
      Stringer4.drawString("X =  x | x \u0454 R^{2}, g_{j}(x)\u22640, j = 1,..,m   .",60,365);
      g.drawString(" {                                             }",80,365);
      Stringer4.drawString("Построим ограничение g_{1}(x)=-x_{1}+x_{2}-4\u22640.",40,385);}

      if (step==3) {Stringer4.drawString("Построим второе ограничение g_{2}(x)=x_{1}-4\u22640.",40,345);}
      if (step==4) {Stringer4.drawString("Построим третье ограничение g_{3}(x)=0,5(x_{1}-2)^{2}-x_{2}\u22640.",40,345);}
      if (step==5) {Stringer4.drawString("Построим четвертое ограничение g_{4}(x)=0,25x&{2}{2}-x_{2}-x_{1}+2\u22640.",40,345);}
      if (step==6) {Stringer4.drawString("Получили область допустимых значений X.",40,345);
                    Stringer4.drawString("Выберем x_{0} \u0454 X.",40,365);}
      if (step==7) {Stringer4.drawString("Положим k = 0.",40,345);}
      if (step==8) {Stringer4.drawString("Проверим k \u2264 M:",40,345);
                    Stringer4.drawString("k = 0 < M = 10.",40,365);}
      if (step==9) {Stringer4.drawString("Вычислим значения функций g_{j}(x^{0}), j = 1, 2 , 3, 4.",40,345);
                    Stringer4.drawString("g_{1}(x^{0}) = - "+x1+" + "+x2+" - 4 = "+(-x1+x2-4)+",",40,365);
                    Stringer4.drawString("g_{2}(x^{0}) = "+x1+" - 4 = "+(x1-4)+",",40,385);
                    Stringer4.drawString("g_{3}(x^{0}) = "+((2-x1)*(2-x1))/2+" - "+x2+" = "+((2-x1)*(2-x1)/2-x2)+",",40,405);
                    Stringer4.drawString("g_{4}(x^{0}) = "+x2*x2/4+" - "+x2+" - "+x1+ " + 2 = "+(x2*x2/4-x2-x1+2)+".",40,425);}
      if (step==10) {Stringer4.drawString("Проверяем выполнение условия  -\u03b5_{0}\u2264g_{j}(x^{0}) \u22640, j=1,2,3,4:",50,345);
                     Stringer4.drawString("g_{1}(x^{0}) = "+(-x1+x2-4),50,375);
                     if ((-x1+x2-4)!=0) Stringer4.drawString("< -\u03b5_{0} = -0.03",130,375);
                     Stringer4.drawString("g_{2}(x^{0}) = "+(x1-4),50,395);
                     if ((x1-4)!=0) Stringer4.drawString("< -\u03b5_{0} = -0.03",130,395);
                     Stringer4.drawString("g_{3}(x^{0}) = "+((x1-2)*(x1-2)/2-x2),250,375);
                     if (((x1-2)*(x1-2)/2-x2)!=0) Stringer4.drawString("< -\u03b5_{0} = -0.03",330,375);
                     Stringer4.drawString("g_{4}(x^{0}) = "+(x2*x2/4-x2-x1+2),250,395);
                     if ((x2*x2/4-x2-x1+2)!=0) Stringer4.drawString("< -\u03b5_{0} = -0.03",330,395);}
      if (step==11) {Stringer4.drawString("Активными считаются ограничения:",50,345);
                     g.drawString("{      }",410,385);
                     if (vyb_t_ky==1) {Stringer5.drawString("g_{4}(x)=0,25x&{2}{2}-x_{2}-x_{1}+2\u22640.",70,365);
                                       Stringer5.drawString("Множество индексов j активных ограничений J_{a} =   4 ",50,385);}
                     if (vyb_t_ky==2) {Stringer5.drawString("g_{1}(x)=x_{1}-4\u22640,  g_{4}(x)=0,25x&{2}{2}-x_{2}-x_{1}+2\u22640.",70,365);
                                       Stringer5.drawString("Множество индексов j активных ограничений J_{a} =  2, 4 .",50,385);}
                     if (vyb_t_ky==3) {Stringer5.drawString("g_{2}(x)=-x_{1}+x_{2}-1\u22640, g_{3}(x)=0,5(x_{1}-2)^{2}-x_{2}\u22640.",70,365);
                                       Stringer5.drawString("Множество индексов j активных ограничений J_{a} =  2, 3 .",50,385);}
                     }
      if (step==12) {if (vyb_t_ky==1) {Stringer4.drawString("Т.к. g_{4}(x) \u2264 0 - нелинейное ограничение, то",50,345);
                                       Stringer4.drawString("записываем следующую систему неравенств:",50,365);
                                       Stringer2.drawString("\u2207f(x^{0})^{T} s^{0} < \u03B7",60,385);
                                     //  Stringer2.drawString("\u2207g_{3}(x^{0})^{T} s^{0} < \u03B7",60,405);
                                       Stringer2.drawString("\u2207g_{4}(x^{0})^{T} s^{0} < \u03B7", 60, 405);
                                     //  Stringer2.drawString("-s&{2}{0} < \u03B7",310,405);
                                       Stringer2.drawString("-s&{1}{0} < \u03B7",310,405);
                                       Stringer2.drawString("\u2207f(x^{0}) =(2; -4)^{T},   \u2207g_{4}(x^{0}) = ( -1; "+(x2/2-1)+")^{T}",60,425);
                                       Stringer2.drawString("2s&{1}{0} - 4s&{2}{0} < \u03B7",310,385);
                                      }
                     if (vyb_t_ky==2) {Stringer4.drawString("Т.к. g_{4}(x) \u2264 0 - нелинейное ограничение, то",50,345);
                                       Stringer4.drawString("записываем следующую систему неравенств:",50,365);
                                       Stringer2.drawString("\u2207f(x^{0})^{T} s^{0} < \u03B7",60,385);
                                       Stringer2.drawString("\u2207g_{1}(x^{0})^{T} s^{0} < \u03B7",60,405);
                                       Stringer2.drawString("\u2207g_{4}(x^{0})^{T} s^{0} < \u03B7", 60, 425);
                                       Stringer2.drawString("-s&{1}{0}+s&{2}{0} < \u03B7",310,405);
                                       Stringer2.drawString("-s&{1}{0} < \u03B7",310,425);
                                       Stringer2.drawString("\u2207f(x^{0}) =(2; -4)^{T},    \u2207g_{1}(x^{0}) = (-1; 1)^{T},    \u2207g_{4}(x^{0}) = ( -1; 0)^{T}",50,445);
                                       Stringer2.drawString("2s&{1}{0} - 4s&{2}{0} < \u03B7",310,385);
                                      }
                     if (vyb_t_ky==3) {Stringer4.drawString("Т.к. g_{3}(x) \u2264 0 - нелинейное ограничение, то",50,345);
                                       Stringer4.drawString("записываем следующую систему неравенств:",50,365);
                                       Stringer4.drawString("\u2207g_{2}(x^{0})^{T} s^{0} < \u03B7",60,395);
                                       Stringer2.drawString("\u2207g_{3}(x^{0})^{T} s^{0} < \u03B7", 60, 420);
                                       Stringer2.drawString("s&{1}{0} < \u03B7",310,395);
                                       Stringer2.drawString("2s&{1}{0} - s&{2}{0} < \u03B7",310,420);
                                       Stringer2.drawString("\u2207f(x^{0}) =(8; -10)^{T},   \u2207g_{2}(x^{0}) = (1; 0)^{T},   \u2207g_{3}(x^{0}) = ( 2; -1)^{T}",50,445);
                                       Stringer2.drawString("8s&{1}{0} - 10s&{2}{0} < \u03B7",310,370);
                                      }
                     Stringer4.drawString("=>",230,405);


      }
      if (step==13) {Stringer4.drawString("Записываем задачу линейного программирования:",50,345);
                     Stringer4.drawString("\u03B7 \u2192 min,",60,365);
                     if (vyb_t_ky==1) {Stringer4.drawString("2s&{1}{0} - 4s&{2}{0} \u2264 \u03B7,",60,390);
                     Stringer4.drawString("-s&{1}{0} \u2264 \u03B7,",60,415);
                    // Stringer4.drawString("-s&{1}{0} - s&{2}{0} \u2264 \u03B7,",60,440);
                     }
                     if (vyb_t_ky==2) {Stringer4.drawString("2s&{1}{0} - 4s&{2}{0} \u2264 \u03B7,",60,390);
                     Stringer4.drawString("-s&{1}{0} + s&{2}{0} \u2264 \u03B7,",60,415);
                     Stringer4.drawString("-s&{1}{0} \u2264 \u03B7,",60,440);}
                     if (vyb_t_ky==3) {Stringer4.drawString("8s&{1}{0} - 10s&{2}{0} \u2264 \u03B7,",60,390);
                     Stringer4.drawString("s&{1}{0} \u2264 \u03B7,",60,415);
                     Stringer4.drawString("2s&{1}{0} - s&{2}{0} \u2264 \u03B7,",60,440);}
                     Stringer4.drawString("где | s&{1}{0} | \u2264 1,   | s&{2}{0} | \u2264 1, \u03B7 \u2264 0.",210,403);
      }
      if (step==14) {if (vyb_t_ky==1) {Stringer4.drawString("Наименьшее возможное значение \u03B7 ограничено нера-",50,345);
                                       Stringer4.drawString("венством -s&{1}{0} \u2264 \u03B7 при максимально допустимом значении",10,365);
                                       Stringer4.drawString("s&{1}{0} = 1, т.е. \u03B7 = -1. ",10,385);}
                     if (vyb_t_ky==2) {Stringer4.drawString("Умножив неравенство -s&{1}{0} + s&{2}{0} \u2264 \u03B7 на 2 и сложив его с",50,345);
                                       Stringer4.drawString("2s&{1}{0} - 4s&{2}{0} \u2264 \u03B7, получим -    s&{2}{0} \u2264 \u03B7.",30,370);
                                       g.drawLine(196,365,203,365);
                                       Stringer4.drawString("2",196,362);
                                       Stringer4.drawString("3",196,378);
                                       Stringer4.drawString("Теперь умножим неравенство -s&{1}{0} + s&{2}{0} \u2264 \u03B7 на 4 и сложим",30,395);
                                       Stringer4.drawString("его с 2s&{1}{0} - 4s&{2}{0} \u2264 \u03B7, получим -    s&{1}{0} \u2264 \u03B7.",10,415);
                                       g.drawLine(216,410,222,410);
                                       Stringer4.drawString("2",216,408);
                                       Stringer4.drawString("5",216,424);
                                      }
                     if (vyb_t_ky==3) {}
                    }
      if (step==15) {if (vyb_t_ky==1){Stringer4.drawString("Подставив s&{1}{0} = 1 и \u03B7 = -1 в неравенство 2s&{1}{0} - 4s&{2}{0} \u2264 \u03B7,",50,345);
                                      Stringer4.drawString("получим s&{2}{0} =0.75 .",10,365);
                                      Stringer4.drawString("Следовательно направление спуска s^{0} имеет координаты",30,385);
                                      Stringer4.drawString("(1; 0.75). Это можно получить, умножив на 2 второе нер-во и",10,405);
                                      Stringer4.drawString("сложив с первым, учитывая, что s&{1}{0} должно принимать",10,425);
                                      Stringer4.drawString("наибольшее значение s&{1}{0} = 1.",10,445);}
                     if (vyb_t_ky==2) {Stringer4.drawString("Таким образом для наибольшего возможного значения",45,345);
                                       Stringer4.drawString("s&{1}{0} = 1 соответствует наименьшее возможное  значение",45,365);
                                       Stringer4.drawString("\u03B7 = -0.4 и s&{2}{0} = 0.6. При этом все неравенства будут выполне-",10,385);
                                       Stringer4.drawString("ны. Т.е. s^{0} = (1; 0.6).",10,405);}
                    }
      if (step==16) {Stringer4.drawString("Пороверяем условие <\u2207f(x^{0}), s^{0}> \u2265 -\u03b5_{0}.",50,345);
                     if (vyb_t_ky==1) Stringer4.drawString("Т.к. <(2; -4), (1; 0.75)> = -1 < -\u03b5_{0} = -0.03 - условие не ",50,365);
                     if (vyb_t_ky==2) Stringer4.drawString("Т.к. <(2; -4), (1; 0.6)> = -0.4 < -\u03b5_{0} = -0.03 - условие не ",50,365);
                     if (vyb_t_ky==3) Stringer4.drawString("Т.к. <(8; -12), (0; 1)> = -12 < -\u03b5_{0} = -0.03 - условие не ",50,365);
                     Stringer4.drawString("выполняется, продолжаем искать точку минимума. ",10,385);
                    }
      if (step==17) {if (vyb_t_ky==1){Stringer4.drawString("При движении из точки x^{0} в направлении вектора",50,345);
                                      Stringer4.drawString("s^{0} проверяем: ",10,365);
                                    //  Stringer4.drawString("Выясним при каких t_{0} станут активными g_{1}(x) \u2264 0 , g_{2}(x) \u2264 0 ",25,385);
                                      Stringer4.drawString("       g_{1}(x^{0} + t_{0}s^{0}) =  0  => t&{0}{1} = -12,",10,385);
                                      Stringer4.drawString("       g_{2}(x^{0} + t_{0}s^{0})  =  0  => t&{0}{2} = 3,",10,405);
                                      Stringer4.drawString("       g_{3}(x^{0} + t_{0}s^{0})  =  0  => t&{0}{3} = 4.25 и t&{0}{3} = -0.75",10,425);
                                      Stringer4.drawString("       g_{4}(x^{0} + t_{0}s^{0})  =  0  => t&{0}{4} = 0 и t&{0}{3} = 7.1",10,445);
                                      g.drawLine(310,385,310,445);
                                      Stringer4.drawString("=> t&{0}{''} = 3.",310,425);}
                     if (vyb_t_ky==2){Stringer4.drawString("При движении из точки x^{0} в направлении вектора s^{0}",50,345);
                                      Stringer4.drawString("ограничения g_{1}(x) \u2264 0 и g_{4}(x) \u2264 0 нарушаться не будут. ",10,365);
                                      Stringer4.drawString("Выясним при каких t_{0} станут активными g_{2}(x) \u2264 0 и g_{3}(x) \u2264 0:",25,385);
                                      Stringer4.drawString("       g_{2}(x^{0} + t_{0}s^{0}) =  0  => t&{0}{2} = 3,",10,405);
                                      Stringer4.drawString("       g_{4}(x^{0} + t_{0}s^{0}) =  0  => t&{0}{4} = 3.96,",10,425);
                                      g.drawLine(300,395,300,425);
                                      Stringer4.drawString("=> t&{0}{*} = 3.",310,415);}}
      if (step==18) {if (vyb_t_ky==1){Stringer4.drawString("Значение t&{0}{'} выберем, минимизируя функцию ",50,345);
                                      Stringer4.drawString("f(x^{0} + t s^{0}) = 11 t^{2} -32 t -288 на отрезке [0, t&{0}{''}]. Получаем t&{0}{'} = 1,455",30,365);
                                      Stringer4.drawString("Откуда получаем t_{0} = min(t&{0}{''}, t&{0}{'}) = 1,455.",30,385);}
                     if (vyb_t_ky==2){Stringer4.drawString("Значение t_{0} выберем, минимизируя функцию ",50,345);
                                      Stringer4.drawString("f(x^{0} + t s^{0}) = 0.34 t^{2} -0.4 t - 9 на отрезке [0, t&{0}{*}].",30,365);
                                      Stringer4.drawString("Откуда получаем t_{0} = 0.59.",30,385);}
                    }
      if (step==19) {Stringer4.drawString("Получили следующую итерационную точку x^{1}:",50,345);
                     if (vyb_t_ky==1){Stringer4.drawString("x^{1} = (1; 2)^{T} + 1.455*(1; 0.75)^{T} = (2.455; 3)^{T}.",70,365);
                                      Stringer4.drawString(".",165,360);}
                     if (vyb_t_ky==2){Stringer4.drawString("x^{1} = (1; 2)^{T} + 0.59 (1; 0.6)^{T} = (1.59; 2.35)^{T}.",70,365);
                                      Stringer4.drawString("     .",165,360);}
                    }
      if (step==20) {Stringer4.drawString("Замечание",50,345);
      				 Stringer4.drawString("Выгоднее было бы сначала сразу найти t&{0}{'}",50,365);
      				 Stringer4.drawString("и проверить выполнение всех ограничений. ",50,385);
      				 Stringer4.drawString("Подставляя x_{1} во все g_{i}(x), получаем ",50,405);
      				 Stringer4.drawString("g_{i}(x)<0 для всех i, т.е. можно не находить t^{''}.",50,425);}
      if (step==21) {Stringer4.drawString(" Положим \u03b5_{1} = \u03b5_{0} и k = k + 1 = 0 + 1 = 1.",50,345);}
      
      if (step==22) {Stringer4.drawString(" Проверим k \u2264 M:",40,345);
                     Stringer4.drawString(" k = 1 < M = 10.",40,365);}
      if (step==23) {Stringer4.drawString(" Вычислим значения функций g_{j}(x^{1}), j = 1, 2 , 3, 4.",40,345);
                     if (vyb_t_ky==1){Stringer4.drawString("g_{1}(x^{1}) = - 2.455 + 3 - 4 = -3.455,",40,365);
                                      Stringer4.drawString("g_{2}(x^{1}) = 2 - 4 = -1.545,",40,385);
                                      Stringer4.drawString("g_{3}(x^{1}) = 0 - 3 = -2.89,",40,405);
                                      Stringer4.drawString("g_{4}(x^{1}) = 2.25 - 3 - 2 + 2 = -1.205.",40,425);}
                     if (vyb_t_ky==2){Stringer4.drawString("g_{1}(x^{1}) = - 1.59 + 2.35 - 1 = -0.24,",40,365);
                                      Stringer4.drawString("g_{2}(x^{1}) = 1.59 - 4 = -2.41,",40,385);
                                      Stringer4.drawString("g_{3}(x^{1}) = 0.08 - 2.35 = -2.27,",40,405);
                                      Stringer4.drawString("g_{4}(x^{1}) = 1.38 - 2.35 - 1.59 + 2 = -0.56.",40,425);}
                    }
      if (step==24) {Stringer4.drawString("Проверяем выполнение условия  -\u03b5_{1}\u2264g_{j}(x^{1}) \u22640, j=1,2,3,4:",50,345);
                     if (vyb_t_ky==1){Stringer4.drawString("g_{1}(x^{1}) = -3.455",40,375);
                     				  Stringer4.drawString("< -\u03b5_{0} = -0.03",140,375);
                                      Stringer4.drawString("g_{2}(x^{1}) = -1.545",40,395);
                                      Stringer4.drawString("< -\u03b5_{0} = -0.03",140,395);
                                      Stringer4.drawString("g_{3}(x^{1}) = -2.89",250,375);
                                      Stringer4.drawString("< -\u03b5_{0} = -0.03",350,375);
                                      Stringer4.drawString("g_{4}(x^{1}) = -1.205",250,395);
                                      Stringer4.drawString("< -\u03b5_{0} = -0.03",350,395);}
                     if (vyb_t_ky==2){Stringer4.drawString("g_{1}(x^{1}) = -024",50,375);
                                      Stringer4.drawString("< -\u03b5_{1} = -0.03",140,375);
                                      Stringer4.drawString("g_{2}(x^{1}) = -2.41",50,395);
                                      Stringer4.drawString("< -\u03b5_{1} = -0.03",140,395);
                                      Stringer4.drawString("g_{3}(x^{1}) = -2.27",250,375);
                                      Stringer4.drawString("< -\u03b5_{1} = -0.03",350,375);
                                      Stringer4.drawString("g_{4}(x^{1}) = -0.56",250,395);
                                      Stringer4.drawString("< -\u03b5_{1} = -0.03",350,395);}

                    }
      if (step==25) {if (vyb_t_ky==1){Stringer4.drawString("Активных ограничений нет:",50,345);
                                      g.drawString("{    }",410,365);
                                     // Stringer5.drawString("g_{1}(x) = x_{1} - 4 \u2264 0.",70,365);
                                      Stringer5.drawString("Множество индексов j активных ограничений J_{a} =  \u00D8.",50,365);}
                     if (vyb_t_ky==2){Stringer4.drawString("Активных ограничений нет.",50,345);
                                      g.drawString("{    }",410,365);
                                      Stringer5.drawString("Множество индексов j активных ограничений J_{a} =  \u00D8 .",50,365);}
                     if (vyb_t_ky==3){}}
      if (step==26) {if (vyb_t_ky==1) {Stringer4.drawString("Т.к. активных ограничений нет, записываем",50,345);
                                       Stringer4.drawString("следующее неравенство:",50,365);
                                       Stringer4.drawString("\u2207f(x^{1})^{T} s^{1} < \u03B7",60,395);
                                       Stringer4.drawString("\u2207f(x^{1}) =(2.91; -3.91)",60,415);
                                       Stringer4.drawString("2.91s&{1}{1} - 3.91s&{2}{1} < \u03B7",310,405);
                                      // Stringer4.drawString("-s&{1}{1} + s&{2}{1} < 0",310,415);
                                      // Stringer4.drawString("\u2207f(x^{1}) =(2; -3)^{T}, \u2207g_{1}(x^{1}) = (-1; 1)^{T}",50,445);
                                      // Stringer4.drawString("2s&{1}{1} - 3s&{2}{1} < 0",310,395);
                                       Stringer4.drawString("=>",230,405);}
                     if (vyb_t_ky==2) {Stringer4.drawString("Т.к. активных ограничений нет, записываем",50,345);
                                       Stringer4.drawString("следующее неравенство:",50,365);
                                       Stringer4.drawString("\u2207f(x^{1})^{T} s^{1} < \u03B7",60,405);
                                       Stringer4.drawString("\u2207f(x^{1}) =(2.48; -4.13)^{T}",170,445);
                                       Stringer4.drawString("2.48s&{1}{1} - 4.13s&{2}{1} < \u03B7",310,405);
                                       Stringer4.drawString("=>",230,405);}
                     if (vyb_t_ky==3) {Stringer4.drawString("\u2207g_{2}(x^{0})^{T} s^{0} < \u03B7",60,395);
                                       Stringer4.drawString("\u2207g_{3}(x^{0})^{T} s^{0} < \u03B7", 60, 420);
                                       Stringer4.drawString("s&{1}{0} < \u03B7",310,395);
                                       Stringer4.drawString("2s&{1}{0} - s&{2}{0} < \u03B7",310,420);
                                       Stringer4.drawString("\u2207f(x^{0}) =(8; -10)^{T}, \u2207g_{2}(x^{0}) = (1; 0)^{T}, \u2207g_{3}(x^{0}) = ( 2; -1)^{T}",50,445);
                                       Stringer4.drawString("8s&{1}{0} - 10s&{2}{0} < \u03B7",310,370);}}

        if (step==27) {Stringer4.drawString("Записываем задачу линейного программирования:",50,345);
                       if (vyb_t_ky==2) {Stringer4.drawString("F(s) = 2s&{1}{1} - 3s&{2}{1} \u2192 min,",60,370);
                                         Stringer4.drawString("-s&{1}{1} + s&{2}{1} \u2264 0,",60,395);
                                         Stringer4.drawString("| s&{1}{1} | \u2264 1,   | s&{2}{1} | \u2264 1.",60,420);}
                       if (vyb_t_ky==1) {Stringer4.drawString("\u03B7 \u2192 min,",60,365);
                                         Stringer4.drawString("2.91s&{1}{1} - 3.91s&{2}{1} \u2264 \u03B7,",60,390);
                                         Stringer4.drawString("| s&{1}{1} | \u2264 1,   | s&{2}{1} | \u2264 1,",60,415);
                                         Stringer4.drawString("\u03B7 \u2264 0.",60,440);}
                       if (vyb_t_ky==3) {Stringer4.drawString("8s&{1}{0} - 10s&{2}{0} \u2264 \u03B7,",60,390);
                                         Stringer4.drawString("s&{1}{0} \u2264 \u03B7,",60,415);
                                         Stringer4.drawString("2s&{1}{0} - s&{2}{0} \u2264 \u03B7,",60,440);}
       }
       if (step==28) {if (vyb_t_ky==2) {Stringer4.drawString("Т.к. наша задача является задачей в E^{2}, то будем",50,345);
                                        Stringer4.drawString("решать её графически.",30,365);
                                        Stringer4.drawString("Строим единичный квадрат:",50,385);
                                        Stringer4.drawString("| s&{1}{1} | \u2264 1,   | s&{2}{1} | \u2264 1.",60,410);
                                       }
                      if (vyb_t_ky==1) {Stringer4.drawString("Из неравенства 2.91s&{1}{1} - 3.91s&{2}{1} \u2264 \u03B7 следует, что \u03B7",50,345);
                                        Stringer4.drawString("достигает минимума при s&{1}{1} = -1 и s&{2}{1} = 1 и будет равна -6.82.",10,365);
                                        Stringer4.drawString("Следовательно направление спуска s^{1} имеет",30,385);
                                        Stringer4.drawString("координаты (-1; 1). Важно отметить, что если точка находится",10,405);
                                        Stringer4.drawString("внутри области, то движение на след. шаге будет  идти по",10,425);
                                        Stringer4.drawString("антиградиенту, что и получено выше.",10,445);
                                       }
       }
       if (step==29) {if (vyb_t_ky==2) {Stringer4.drawString("Построим область допустимых значений.",50,345);
                                        Stringer4.drawString("Построим ограничение:",50,365);
                                        Stringer4.drawString("-s&{1}{1} + s&{2}{1} \u2264 0",70,385);
                                       }
                      if (vyb_t_ky==1) {Stringer4.drawString("Пороверяем условие <\u2207f(x^{1}), s^{1}> \u2265 -\u03b5_{1}.",50,345);
                                        Stringer4.drawString("Т.к. <(2.91; -3.91), (-1; 1)> = -6.82 < -\u03b5_{1} = -0.03 - условие не ",50,365);
                                        Stringer4.drawString("выполняется, продолжаем искать точку минимума. ",10,385);}
       }

       if (step==30) {if (vyb_t_ky==2) {Stringer4.drawString("Получили область допустимых значений.",50,345);
                                        Stringer4.drawString("Строим линии уровня F(s) = 2s&{1}{1} - 3s&{2}{1}.",50,365);
                                        Stringer4.drawString("Находим минимальное значение F(s) на множестве,",50,385);
                                        Stringer4.drawString("перемещая её линии уровня по направлению антиградиента",10,405);
                                        Stringer4.drawString("- \u2207f(x^{1}).",10,425);
                                       }
                      if (vyb_t_ky==1){Stringer4.drawString("При движении из т. x^{1} в направлении вектора s^{1} найдём:",50,345);
                                       Stringer4.drawString("       g_{1}(x^{1} + t_{1}s^{1}) = 0  => t&{1}{1} = 1.728,",10, 365);
                                       Stringer4.drawString("       g_{2}(x^{1} + t_{1}s^{1}) = 0  => t&{1}{2} = -1.545,",10,385);
                                       Stringer4.drawString("       g_{3}(x^{1} + t_{1}s^{1}) = 0  => t&{1}{3} = -1.359 и 4.27,",10,405);
                                       Stringer4.drawString("       g_{4}(x^{1} + t_{1}s^{1}) = 0  => t&{1}{4} = 0.717 и -6.717,",10,425);
                                       g.drawLine(310,365,310,425);
                                       Stringer4.drawString("=> t&{1}{''} = 0.717.",310,415);}


       }
       if (step==31) {if (vyb_t_ky==2) {Stringer4.drawString("Последняя точка касания линии уровня будет точкой",50,345);
                                        Stringer4.drawString("минимума.",10,365);
                                        Stringer4.drawString("В нашем случае минимум достигается в точке (1; 1).",50,385);
                                        Stringer4.drawString("Следовательно направление спуска s^{1} имеет",50,405);
                                        Stringer4.drawString("координаты (1; 1).",10,425);
                                       }
                      if (vyb_t_ky==1){Stringer4.drawString("Значение t&{1}{'} выберем, минимизируя функцию ",50,345);
                                       Stringer4.drawString("f(x^{1} + t s^{1}) = 4.5 t^{2} - 6.82 t - 9.38 на отрезке [0, t&{1}{''}].",30,365);
                                       Stringer4.drawString("Откуда получаем t_{1} = min (t&{1}{'}, t&{1}{''}) = 0.717.",30,385);}

        }
        if (step==32) {if (vyb_t_ky==2) {Stringer4.drawString("Пороверяем условие <\u2207f(x^{1}), s^{1}> \u2265 -\u03b5_{1}.",50,345);
                                         Stringer4.drawString("Т.к. <(2; -3), (1; 1)> = -1 < -\u03b5_{1} = -0.03 - условие не ",50,365);
                                         Stringer4.drawString("выполняется, продолжаем искать точку минимума. ",10,385);}
                       if (vyb_t_ky==1) {Stringer4.drawString("Получили следующую итерационную точку x^{2}:",50,345);
                                         Stringer4.drawString("x^{2} = (2.455; 3)^{T} + 0.717 (-1; 1)^{T} = (1.738; 3.717)^{T}.",70,365);
                                         Stringer4.drawString("     .",165,360);}
                       
                       if (vyb_t_ky==3) Stringer4.drawString("Т.к. <(8; -12), (0; 1)> = -12 < -\u03b5_{0} = -0.03 - условие не ",50,365);
                      }
        if (step==33) {if (vyb_t_ky==2){Stringer4.drawString("При движении из точки x^{1} в направлении вектора",50,345);
                                        Stringer4.drawString("s^{1} ограничение g_{1}(x) \u2264 0 нарушаться не будет. Выясним",10,365);
                                        Stringer4.drawString("при каких t_{1} станут активными g_{2}(x) \u2264 0, g_{3}(x) \u2264 0, g_{4}(x) \u2264 0:",25,385);
                                        Stringer4.drawString("g_{2}(x^{1} + t_{1}s^{1}) =  0  => t&{1}{2} = 2,",30,405);
                                        Stringer4.drawString("g_{3}(x^{1} + t_{1}s^{1}) =  0  => t&{1}{3} \u2248 3.6.",30,425);
                                        Stringer4.drawString("g_{4}(x^{1} + t_{1}s^{1}) =  0  => t&{1}{4} = 3.",30,445);
                                        g.drawLine(300,395,300,445);
                                        Stringer4.drawString("=> t&{1}{*} = 2.",310,425);}
                       if (vyb_t_ky==1){Stringer4.drawString("Положим \u03b5_{2} = \u03b5_{1} и k = k + 1 = 1 + 1 = 2.",50,345);}
                      }
        if (step==34) {if (vyb_t_ky==2){Stringer4.drawString("Значение t_{1} выберем, минимизируя функцию ",50,345);
                                        Stringer4.drawString("f(x^{1} + t s^{1}) = 0.5 t^{2} - t - 10.5 на отрезке [0, t&{1}{*}].",30,365);
                                        Stringer4.drawString("Откуда получаем t_{1} = 1.",30,385);}
                       if (vyb_t_ky==1){Stringer4.drawString("Проверим k \u2264 M:",40,345);
                                        Stringer4.drawString("k = 2 < M = 10.",40,365);}
                      }
        if (step==35) {if (vyb_t_ky==2){Stringer4.drawString("Получили следующую итерационную точку x^{2}:",50,345);
                                        Stringer4.drawString("x^{2} = (2; 3)^{T} + 1*(1; 1)^{T} = (3; 4)^{T}.",70,365);
                                        Stringer4.drawString(".",165,360);}
                       if (vyb_t_ky==1){Stringer4.drawString("Вычислим значения функций g_{j}(x^{2}), j = 1, 2 , 3, 4.",40,345);
                                        Stringer4.drawString("g_{1}(x^{2}) =  -2.02,",40,365);
                                        Stringer4.drawString("g_{2}(x^{2}) =  -2.262,",40,385);
                                        Stringer4.drawString("g_{3}(x^{2}) =  -3.68,",40,405);
                                        Stringer4.drawString("g_{4}(x^{2}) =  0.",40,425);}
                      }
        if (step==36) {if (vyb_t_ky==2)Stringer4.drawString("Положим \u03b5_{2} = \u03b5_{1} и k = k + 1 = 1 + 1 = 2.",50,345);
                       if (vyb_t_ky==1){Stringer4.drawString("Проверяем выполнение условия  -\u03b5_{2}\u2264g_{j}(x^{2}) \u22640, j=1,2,3,4:",50,345);
                                        Stringer4.drawString("g_{1}(x^{2}) = -2.02",50,375);
                                        Stringer4.drawString("< -\u03b5_{2} = -0.03",140,375);
                                        Stringer4.drawString("g_{2}(x^{2}) = -2.262",50,395);
                                        Stringer4.drawString("< -\u03b5_{2} = -0.03",150,395);
                                        Stringer4.drawString("g_{3}(x^{2}) = -3.68",250,375);
                                        Stringer4.drawString("< -\u03b5_{2} = -0.03",350,375);
                                        Stringer4.drawString("g_{4}(x^{2}) = 0",250,395);
                                        }
                      }
        if (step==37) {if (vyb_t_ky==2){Stringer4.drawString("Проверим k \u2264 M:",40,345);
                                        Stringer4.drawString("k = 2 < M = 10.",40,365);}
                       if (vyb_t_ky==1){Stringer4.drawString("Активным считается ограничение:",50,345);
                                        g.drawString("{    }",410,385);
                                        Stringer5.drawString("g_{4}(x) = 0,25x&{2}{2}-x_{2}-x_{1}+2 \u2264 0.",70,365);
                                        Stringer5.drawString("Множество индексов j активных ограничений J_{a} =   4 .",50,385);}

                                       }
        if (step==38) {if (vyb_t_ky==2){Stringer4.drawString("Вычислим значения функций g_{j}(x^{2}), j = 1, 2 , 3, 4.",40,345);
                                        Stringer4.drawString("g_{1}(x^{2}) = - 3 + 4 - 1 = 0,",40,365);
                                        Stringer4.drawString("g_{2}(x^{2}) = 3 - 4 = -1,",40,385);
                                        Stringer4.drawString("g_{3}(x^{2}) = 0.5 - 4 = -3.5,",40,405);
                                        Stringer4.drawString("g_{4}(x^{2}) = 4 - 4 - 3 + 2 = -1.",40,425);}
        
                       if (vyb_t_ky==1) {Stringer4.drawString("Т.к. g_{4}(x) \u2264 0 - нелинейное ограничение, то",50,345);
                       					 Stringer4.drawString("записываем следующую систему неравенств:",50,365);
                       					 Stringer2.drawString("\u2207f(x^{2})^{T} s^{2} < \u03B7",60,385);
                       					 //  Stringer2.drawString("\u2207g_{3}(x^{0})^{T} s^{0} < \u03B7",60,405);
                       					 Stringer2.drawString("\u2207g_{4}(x^{2})^{T} s^{2} < \u03B7", 60, 405);
                       					 //  Stringer2.drawString("-s&{2}{0} < \u03B7",310,405);
                       					 Stringer2.drawString("-s&{1}{2}-1.1625s&{2}{2} < \u03B7",310,405);
                       					 Stringer2.drawString("\u2207f(x^{0}) =(0.042; -0.325)^{T},   \u2207g_{4}(x^{2}) = ( -1; -1.1625)^{T}",60,425);
                       					 Stringer2.drawString("0.042s&{1}{2} - 0.325s&{2}{2} < \u03B7",310,385);
                       					 }
                    	                /* Stringer4.drawString("Т.к. g_{1}(x) \u2264 0 является линейным ограничением, то",50,345);
                                         Stringer4.drawString("записываем следующую систему неравенств:",50,365);
                                         Stringer4.drawString("\u2207f(x^{2})^{T} s^{2} < 0",60,395);
                                         Stringer4.drawString("\u2207g_{2}(x^{1})^{T} s^{2} < 0",60,415);
                                         Stringer4.drawString("-s&{1}{2} + s&{2}{2} < 0",310,415);
                                         Stringer4.drawString("\u2207f(x^{2}) =(2; -3.53)^{T}, \u2207g_{1}(x^{2}) = (-1; 1)^{T}",50,445);
                                         Stringer4.drawString("2s&{1}{2} - 3.53s&{2}{2} < 0",310,395);
                                         Stringer4.drawString("=>",230,405);}*/

                      }
        if (step==39) {if (vyb_t_ky==2){Stringer4.drawString("Проверяем выполнение условия  -\u03b5_{2}\u2264g_{j}(x^{2}) \u22640, j=1,2,3,4:",50,345);
                                        Stringer4.drawString("g_{1}(x^{2}) = 0",50,375);
                                        Stringer4.drawString("g_{2}(x^{2}) = -1",50,395);
                                        Stringer4.drawString("< -\u03b5_{2} = -0.03",130,395);
                                        Stringer4.drawString("g_{3}(x^{2}) = -3.5",250,375);
                                        Stringer4.drawString("< -\u03b5_{2} = -0.03",350,375);
                                        Stringer4.drawString("g_{4}(x^{2}) = -1",250,395);
                                        Stringer4.drawString("< -\u03b5_{2} = -0.03",330,395);}
                       if (vyb_t_ky==1){
                    	   				Stringer4.drawString("Записываем задачу линейного программирования:",50,345);
                    	   				Stringer4.drawString("\u03B7 \u2192 min,",60,365);
                    	   				Stringer4.drawString("0.042s&{1}{2} - 0.325s&{2}{2} \u2264 \u03B7,",60,390);
                                        Stringer4.drawString("-s&{1}{2}-1.1625s&{2}{2} < \u03B7,",60,415);
                                        Stringer4.drawString("где | s&{1}{2} | \u2264 1,   | s&{2}{2} | \u2264 1, \u03B7 \u2264 0.",210,403);
                    	   				/*Stringer4.drawString("Записываем задачу линейного программирования:",50,345);
                                        Stringer4.drawString("F(s) = 2s&{1}{2} - 3.53s&{2}{2} \u2192 min,",60,370);
                                        Stringer4.drawString("-s&{1}{2} + s&{2}{2} \u2264 0,",60,395);
                                        Stringer4.drawString("| s&{1}{2} | \u2264 1,   | s&{2}{2} | \u2264 1.",60,420);*/
                                        }

                      }
        if (step==40) {if (vyb_t_ky==3){Stringer4.drawString("Активным считается ограничение:",50,345);
                                           g.drawString("{    }",410,385);
                                           Stringer5.drawString("g_{1}(x) = x_{1} - 4 \u2264 0.",70,365);
                                           Stringer5.drawString("Множество индексов j активных ограничений J_{a} =   1 .",50,385);}
                       if (vyb_t_ky==2){Stringer4.drawString("Т.к. наша задача является задачей в E^{2}, то будем",50,345);
                                        Stringer4.drawString("решать её графически.",30,365);
                                        Stringer4.drawString("Строим единичный квадрат:",50,385);
                                        Stringer4.drawString("| s&{1}{2} | \u2264 1,   | s&{2}{2} | \u2264 1.",60,410);
}
                       if (vyb_t_ky==1){Stringer4.drawString("Решая задачу линейного программирования, получаем:",50,345);
                       					Stringer4.drawString("направление спуска s^{2} имеет",50,365);
                       					Stringer4.drawString("координаты (0.8; 1)",50,385);
                       }  }
        if (step==41) {if (vyb_t_ky==2) {Stringer4.drawString("Т.к. g_{1}(x) \u2264 0 является линейным ограничением, то",50,345);
                                         Stringer4.drawString("записываем следующую систему неравенств:",50,365);
                                         Stringer4.drawString("\u2207f(x^{2})^{T} s^{2} < 0",60,395);
                                         Stringer4.drawString("\u2207g_{2}(x^{2})^{T} s^{2} < 0",60,415);
                                         Stringer4.drawString("-s&{1}{2} + s&{2}{2} < 0",310,415);
                                         Stringer4.drawString("\u2207f(x^{2}) =(2; -2)^{T}, \u2207g_{1}(x^{2}) = (-1; 1)^{T}",50,445);
                                         Stringer4.drawString("2s&{1}{2} - 2s&{2}{2} < 0",310,395);
                                         Stringer4.drawString("=>",230,405);}
                       if (vyb_t_ky==1) {
                    	   				 Stringer4.drawString("Пороверяем условие <\u2207f(x^{2}), s^{2}> \u2265 -\u03b5_{1}.",50,345);
                    	   				 Stringer4.drawString("Т.к. <(0.042; -0.325), (0.8; 1)> = -0.29 < -\u03b5_{1} = -0.03 - условие не ",50,365);
                    	   				 Stringer4.drawString("выполняется, продолжаем искать точку минимума. ",10,385);
                    	   				/*Stringer4.drawString("Построим область допустимых значений.",50,345);
                                         Stringer4.drawString("Построим ограничение:",50,365);
                                         Stringer4.drawString("-s&{1}{2} + s&{2}{2} \u2264 0",70,385);*/
                                          
                       }
                       if (vyb_t_ky==3) {Stringer4.drawString("\u2207g_{2}(x^{0})^{T} s^{0} < \u03B7",60,395);
                                         Stringer4.drawString("\u2207g_{3}(x^{0})^{T} s^{0} < \u03B7", 60, 420);
                                         Stringer4.drawString("s&{1}{0} < \u03B7",310,395);
                                         Stringer4.drawString("2s&{1}{0} - s&{2}{0} < \u03B7",310,420);
                                         Stringer4.drawString("\u2207f(x^{0}) =(8; -10)^{T}, \u2207g_{2}(x^{0}) = (1; 0)^{T}, \u2207g_{3}(x^{0}) = ( 2; -1)^{T}",50,445);
                                         Stringer4.drawString("8s&{1}{0} - 10s&{2}{0} < \u03B7",310,370);}}

         if (step==42) { if (vyb_t_ky==1) {
        	 							 /*Stringer4.drawString("Записываем задачу линейного программирования:",50,345);
                                           Stringer4.drawString("F(s) = 2s&{1}{2} - 2s&{2}{2} \u2192 min,",60,370);
                                           Stringer4.drawString("-s&{1}{2} + s&{2}{2} \u2264 0,",60,395);
                                           Stringer4.drawString("| s&{1}{2} | \u2264 1,   | s&{2}{2} | \u2264 1.",60,420);*/
        	 								Stringer4.drawString("При движении из т. x^{2} в направлении вектора s^{2} найдём:",50,345);
        	 								Stringer4.drawString("       g_{1}(x^{2} + t_{2}s^{2}) = 0  => t&{2}{1} = 10,",10, 365);
        	 								Stringer4.drawString("       g_{2}(x^{2} + t_{2}s^{2}) = 0  => t&{2}{2} = 2.8,",10,385);
        	 								Stringer4.drawString("       g_{3}(x^{2} + t_{2}s^{2}) = 0  => t&{2}{3} = -2 и 5.77,",10,405);
        	 								Stringer4.drawString("       g_{4}(x^{2} + t_{2}s^{2}) = 0  => t&{2}{4} = 0.73,",10,425);
        	 								g.drawLine(310,395,310,425);
        	 								Stringer4.drawString("=> t&{2}{''} = 0.73.",310,415); 
         }
                         if (vyb_t_ky==2) {Stringer4.drawString("Получили область допустимых значений.",50,345);
                                           Stringer4.drawString("Строим линии уровня F(s) = 2s&{1}{2} - 3.53s&{2}{2}.",50,365);
                                           Stringer4.drawString("Находим минимальное значение F(s) на множестве,",50,385);
                                           Stringer4.drawString("перемещая её линии уровня по направлению антиградиента",10,405);
                                           Stringer4.drawString("- \u2207f(x^{2}).",10,425);}
                                             if (vyb_t_ky==3) {Stringer4.drawString("8s&{1}{0} - 10s&{2}{0} \u2264 \u03B7,",60,390);
                                                               Stringer4.drawString("s&{1}{0} \u2264 \u03B7,",60,415);
                                                               Stringer4.drawString("2s&{1}{0} - s&{2}{0} \u2264 \u03B7,",60,440);}
                             }
         if (step==43) {if (vyb_t_ky==1) {
        	 							  Stringer4.drawString("Значение t&{2}{'} выберем, минимизируя функцию ",50,345);
        	 							  Stringer4.drawString("f(x^{3} + t s^{3}) =  0.54t^{2} -0.29 t -12.05 на отрезке [0, t&{2}{''}]. Получаем t&{3}{'}=0.26",30,365);
        	 							  Stringer4.drawString("Откуда получаем t_{2} = min(t&{2}{''}, t&{2}{'}) = 0.26.",30,385);
        	 							  /*Stringer4.drawString("Т.к. наша задача является задачей в E^{2}, то будем",50,345);
                                          Stringer4.drawString("решать её графически.",30,365);
                                          Stringer4.drawString("Строим единичный квадрат:",50,385);
                                          Stringer4.drawString("| s&{1}{2} | \u2264 1,   | s&{2}{2} | \u2264 1.",60,410);*/
                                         }
                        if (vyb_t_ky==2) {Stringer4.drawString("Последняя точка касания линии уровня будет точкой",50,345);
                                          Stringer4.drawString("минимума.",10,365);
                                          Stringer4.drawString("В нашем случае минимум достигается в точке (1; 1).",50,385);
                                          Stringer4.drawString("Следовательно направление спуска s^{2} имеет",50,405);
                                          Stringer4.drawString("координаты (1; 1).",10,425);}

                             }
         if (step==44) {if (vyb_t_ky==1) {Stringer4.drawString("Получили следующую итерационную точку x^{3}:",50,345);
         								  Stringer4.drawString("x^{3} = (1.738; 3.717)^{T} + 0.26*(0.8; 1)^{T} = (1.95; 3.98)^{T}.",70,365);
         								  //Stringer4.drawString(".",165,360);
        	 							  //Stringer4.drawString("Построим область допустимых значений.",50,345);
                                         // Stringer4.drawString("Построим ограничение:",50,365);
                                         // Stringer4.drawString("-s&{1}{2} + s&{2}{2} \u2264 0",70,385);
                                          }
                        if (vyb_t_ky==2) {Stringer4.drawString("Пороверяем условие <\u2207f(x^{2}), s^{2}> \u2265 -\u03b5_{2}.",50,345);
                                          Stringer4.drawString("Т.к. <(2; -3.53), (1; 1)> = -1.53 < -\u03b5_{2} = -0.03 - условие не ",50,365);
                                          Stringer4.drawString("выполняется, продолжаем искать точку минимума. ",10,385);}

                             }

         if (step==45) {if (vyb_t_ky==1) {Stringer4.drawString("Положим \u03b5_{3} = \u03b5_{2} и k = k + 1 = 1 + 2 = 3.",50,345);
        	 							  /*Stringer4.drawString("Получили область допустимых значений.",50,345);
                                          Stringer4.drawString("Строим линии уровня F(s) = 2s&{1}{2} - 2s&{2}{2}.",50,365);
                                          Stringer4.drawString("Находим минимальное значение F(s) на множестве,",50,385);
                                          Stringer4.drawString("перемещая её линии уровня по направлению антиградиента",10,405);
                                          Stringer4.drawString("- \u2207f(x^{2}).",10,425);*/
                                         }
                        if (vyb_t_ky==2) {Stringer4.drawString("При движении из точки x^{2} в направлении вектора",50,345);
                                          Stringer4.drawString("s^{2} ограничение g_{2}(x) \u2264 0 нарушаться не будет. Выясним",10,365);
                                          Stringer4.drawString("при каких t_{2} станут активными g_{2}(x) \u2264 0, g_{3}(x) \u2264 0, g_{4}(x) \u2264 0:",25,385);
                                          Stringer4.drawString("g_{2}(x^{2} + t_{2}s^{2}) =  0  => t&{2}{2} = 2.53,",30,405);
                                          Stringer4.drawString("g_{3}(x^{2} + t_{2}s^{2}) =  0  => t&{2}{3} \u2248 2.75.",30,425);
                                          Stringer4.drawString("g_{4}(x^{2} + t_{2}s^{2}) =  0  => t&{2}{4} \u2248 3.53.",30,445);
                                          g.drawLine(300,395,300,445);
                                          Stringer4.drawString("=> t&{1}{*} = 2.53.",310,425);}
                             }
         if (step==46) {if (vyb_t_ky==1) {Stringer4.drawString("Проверим k \u2264 M:",40,345);
         								  Stringer4.drawString("k = 3 < M = 10.",40,365);
        	 							  //Stringer4.drawString("Миинимум достигается в каждой точке отрезка AB.",50,345);
                                          //Stringer4.drawString("Следовательно направление спуска s^{2} имеет",50,365);
                                          //Stringer4.drawString("координаты (0; 0).",50,385);
                                         // button_next.setEnabled(true);
                                         }
                        if (vyb_t_ky==2) {Stringer4.drawString("Значение t_{2} выберем, минимизируя функцию ",50,345);
                                          Stringer4.drawString("f(x^{2} + t s^{2}) = 0.5 t^{2} - 1.53t - 9.8 на отрезке [0, t&{2}{*}].",30,365);
                                          Stringer4.drawString("Откуда получаем t_{2} = 1.53.",30,385);}
                              }
        /* if (step==46) {if (vyb_t_ky==1) {Stringer4.drawString("Пороверяем условие <\u2207f(x^{2}), s^{2}> \u2265 -\u03b5_{2}.",50,345);
                                          Stringer4.drawString("Т.к. <(2; -2), (0; 0)> = 0 > -\u03b5_{2} = -0.03",50,365);
                                          Stringer4.drawString("Следовательно мы нашли оптимальное решение данной",30,385);
                                          Stringer4.drawString("задачи:",10,405);
                                          Stringer4.drawString("x^{*} = x^{2} = (3; 4)^{T}.",70,425);
                                          button_next.setEnabled(false);}
                        if (vyb_t_ky==2){Stringer4.drawString("Получили следующую итерационную точку x^{3}:",50,345);
                                         Stringer4.drawString("x^{3} = (1.47; 2.47)^{T} + 1.53 (1; 1)^{T} = (3; 4)^{T}.",70,365);
                                         Stringer4.drawString(".",165,360);}
                                            if (vyb_t_ky==3) Stringer4.drawString("Т.к. <(8; -12), (0; 1)> = -12 < -\u03b5_{0} = -0.03 - условие не ",50,365);
                       }
         if (step==47) {if (vyb_t_ky==2)Stringer4.drawString("Положим \u03b5_{3} = \u03b5_{2} и k = k + 1 = 2 + 1 = 3.",50,345);
                                    }
         if (step==48) {if (vyb_t_ky==2){Stringer4.drawString("Проверим k \u2264 M:",40,345);
                                         Stringer4.drawString("k = 3 < M = 10.",40,365);}
                       }*/
         if (step==47) {if (vyb_t_ky==1){Stringer4.drawString("Вычислим значения функций g_{j}(x^{3}), j = 1, 2 , 3, 4.",40,345);
                                         Stringer4.drawString("g_{1}(x^{3}) = -1.97,",40,365);
                                         Stringer4.drawString("g_{2}(x^{3}) = -2.05,",40,385);
                                         Stringer4.drawString("g_{3}(x^{3}) = -3.95,",40,405);
                                         Stringer4.drawString("g_{4}(x^{3}) = 0.",40,425);}
                       }
         if (step==48) {if (vyb_t_ky==1){Stringer4.drawString("Проверяем выполнение условия  -\u03b5_{3}\u2264g_{j}(x^{3}) \u22640, j=1,2,3,4:",50,345);
                                         Stringer4.drawString("g_{1}(x^{3}) = -1.97",50,375);
                                         Stringer4.drawString("< -\u03b5_{3} = -0.03",140,375);
                                         Stringer4.drawString("g_{2}(x^{3}) = -2.05",50,395);
                                         Stringer4.drawString("< -\u03b5_{3} = -0.03",130,395);
                                         Stringer4.drawString("g_{3}(x^{3}) = -3.95",250,375);
                                         Stringer4.drawString("< -\u03b5_{3} = -0.03",350,375);
                                         Stringer4.drawString("g_{4}(x^{3}) = 0",250,395);
                                         }
                                    }
         if (step==49) {if (vyb_t_ky==1){Stringer4.drawString("Активным считается ограничение:",50,345);
                                         g.drawString("{    }",410,385);
                                         Stringer5.drawString("g_{4}(x) = 0,25x&{2}{2}-x_{2}-x_{1}+2 \u2264 0.",70,365);
                                         Stringer5.drawString("Множество индексов j активных ограничений J_{a} =   4 .",50,385);}
                                     }
         if (step==50) {if (vyb_t_ky==1) {Stringer4.drawString("Т.к. g_{4}(x) \u2264 0 является нелинейным ограничением, то",50,345);
                                          Stringer4.drawString("записываем следующую систему неравенств:",50,365);
                                          Stringer4.drawString("\u2207f(x^{3})^{T} s^{3} < 0",60,395);
                                          Stringer4.drawString("\u2207g_{3}(x^{3})^{T} s^{3} < 0",60,415);
                                          Stringer4.drawString("-s&{1}{3} + s&{2}{3} < 0",310,415);
                                          Stringer4.drawString("\u2207f(x^{3}) =(0; 0)^{T}, \u2207g_{1}(x^{3}) = (-1; 1)^{T}",50,445);
                                          Stringer4.drawString("0*s&{1}{3} + 0*s&{2}{3} < 0",310,395);
                                          Stringer4.drawString("=>",230,405);}
                                     }

         if (step==51) { if (vyb_t_ky==1) {Stringer4.drawString("Записываем задачу линейного программирования:",50,345);
                                           Stringer4.drawString("F(s) = 0*s&{1}{3} +0*s&{2}{3} \u2192 min,",60,370);
                                           Stringer4.drawString("-s&{1}{3} + s&{2}{3} \u2264 0,",60,395);
                                           Stringer4.drawString("| s&{1}{3} | \u2264 1,   | s&{2}{3} | \u2264 1.",60,420);}
                                           }
        /* if (step==51) {if (vyb_t_ky==1)  {Stringer4.drawString("Т.к. наша задача является задачей в E^{2}, то будем",50,345);
                                           Stringer4.drawString("решать её графически.",30,365);
                                           Stringer4.drawString("Строим единичный квадрат:",50,385);
                                           Stringer4.drawString("| s&{1}{3} | \u2264 1,   | s&{2}{3} | \u2264 1.",60,410);
                                          }}
         if (step==52) {if (vyb_t_ky==1) {Stringer4.drawString("Построим область допустимых значений.",50,345);
                                          Stringer4.drawString("Построим ограничение:",50,365);
                                          Stringer4.drawString("-s&{1}{3} + s&{2}{3} \u2264 0",70,385);}
                       }

         if (step==53) {if (vyb_t_ky==1) {Stringer4.drawString("Получили область допустимых значений.",50,345);
                                          Stringer4.drawString("Строим линии уровня F(s) = 2s&{1}{3} - 2s&{2}{3}.",50,365);
                                          Stringer4.drawString("Находим минимальное значение F(s) на множестве,",50,385);
                                          Stringer4.drawString("перемещая её линии уровня по направлению антиградиента",10,405);
                                          Stringer4.drawString("- \u2207f(x^{3}).",10,425);
                                         }
                        }*/
         if (step==52) {if (vyb_t_ky==1) {Stringer4.drawString("Решением является s&{1}{3}=0 и s&{2}{3}=0.",50,345);
                                          Stringer4.drawString("Следовательно направление спуска s^{3} имеет",50,365);
                                          Stringer4.drawString("координаты (0; 0).",50,385);
                                          button_next.setEnabled(true);}
                       }
         if (step==53) {if (vyb_t_ky==1) {Stringer4.drawString("Пороверяем условие <\u2207f(x^{3}), s^{3}> \u2265 -\u03b5_{3}.",50,345);
                                          Stringer4.drawString("Т.к. <(0; 0), (0; 0)> = 0 > -\u03b5_{3} = -0.03",50,365);
                                          Stringer4.drawString("Следовательно мы нашли оптимальное решение данной",30,385);
                                          Stringer4.drawString("задачи:",10,405);
                                          Stringer4.drawString("x^{*} = x^{3} = (1.95; 3.98)^{T}.",70,425);
                                          button_next.setEnabled(false);}
                        }














    }
  }

  void buttonPlus_actionPerformed(ActionEvent e) {
  if (o2-5*(mash+5)>=81 && o2<=304 && o1+4*(mash+5)<=285 && o1+mash+5>=2) mash=mash+5;
  if (mash>50) deltaZ=0.01;
  repaint();
  }

  void buttonLeft_actionPerformed(ActionEvent e) {
    if (o1+20+4*mash<=285) o1=o1+20;
    repaint();
  }

  void buttonRight_actionPerformed(ActionEvent e) {
    if (o1-20+mash>=2) o1=o1-20;
    repaint();
  }

  void buttonUp_actionPerformed(ActionEvent e) {
    if (o2+20<=304) o2=o2+20;
    repaint();
  }

  void buttonDown_actionPerformed(ActionEvent e) {
    if (o2-20-5*mash>=81) o2=o2-20;
    repaint();
  }

  void buttonMinus_actionPerformed(ActionEvent e) {
  if (mash>20) mash=mash-5;
  if (mash<=50) deltaZ=0.1;
   repaint();
  }

  void button_refresh_actionPerformed(ActionEvent e) {
   mash=25;
   o1=20;
   o2=280;
   step=1;
   shag=1;
   vyb_t_ky++;
   button_next.setEnabled(true);
   if (vyb_t_ky==4) vyb_t_ky=1;
   if (vyb_t_ky==1) {x1=2;x2=0;x11=2;x21=3;x12=3;x21=4;}
   if (vyb_t_ky==2) {x1=1;x2=2;x11=3;x21=3.8;}
   if (vyb_t_ky==3) {x1=4;x2=2;}
   repaint();
  }

  void button_next_actionPerformed(ActionEvent e) {
   step++;
   if (step==21 ||  step==33 || step==45) shag=0;
   shag++;
   repaint();
  }

  void button_last_actionPerformed(ActionEvent e) {
  step--;
  if (step==20) shag=21;
  if (step==32) shag=12;
  if (step==44) shag=10;
  shag--;
  repaint();
  }
}

class PrimZoitNelinOgr_buttonPlus_actionAdapter implements java.awt.event.ActionListener {
  PrimZoitNelinOgr adaptee;

  PrimZoitNelinOgr_buttonPlus_actionAdapter(PrimZoitNelinOgr adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.buttonPlus_actionPerformed(e);
  }
}

class PrimZoitNelinOgr_buttonLeft_actionAdapter implements java.awt.event.ActionListener {
  PrimZoitNelinOgr adaptee;

  PrimZoitNelinOgr_buttonLeft_actionAdapter(PrimZoitNelinOgr adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.buttonLeft_actionPerformed(e);
  }
}

class PrimZoitNelinOgr_buttonRight_actionAdapter implements java.awt.event.ActionListener {
  PrimZoitNelinOgr adaptee;

  PrimZoitNelinOgr_buttonRight_actionAdapter(PrimZoitNelinOgr adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.buttonRight_actionPerformed(e);
  }
}

class PrimZoitNelinOgr_buttonUp_actionAdapter implements java.awt.event.ActionListener {
  PrimZoitNelinOgr adaptee;

  PrimZoitNelinOgr_buttonUp_actionAdapter(PrimZoitNelinOgr adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.buttonUp_actionPerformed(e);
  }
}

class PrimZoitNelinOgr_buttonDown_actionAdapter implements java.awt.event.ActionListener {
  PrimZoitNelinOgr adaptee;

  PrimZoitNelinOgr_buttonDown_actionAdapter(PrimZoitNelinOgr adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.buttonDown_actionPerformed(e);
  }
}

class PrimZoitNelinOgr_buttonMinus_actionAdapter implements java.awt.event.ActionListener {
  PrimZoitNelinOgr adaptee;

  PrimZoitNelinOgr_buttonMinus_actionAdapter(PrimZoitNelinOgr adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.buttonMinus_actionPerformed(e);
  }
}

class PrimZoitNelinOgr_button_refresh_actionAdapter implements java.awt.event.ActionListener {
  PrimZoitNelinOgr adaptee;

  PrimZoitNelinOgr_button_refresh_actionAdapter(PrimZoitNelinOgr adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.button_refresh_actionPerformed(e);
  }
}

class PrimZoitNelinOgr_button_next_actionAdapter implements java.awt.event.ActionListener {
  PrimZoitNelinOgr adaptee;

  PrimZoitNelinOgr_button_next_actionAdapter(PrimZoitNelinOgr adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.button_next_actionPerformed(e);
  }
}

class PrimZoitNelinOgr_button_last_actionAdapter implements java.awt.event.ActionListener {
  PrimZoitNelinOgr adaptee;

  PrimZoitNelinOgr_button_last_actionAdapter(PrimZoitNelinOgr adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.button_last_actionPerformed(e);
  }
}
