package strmetn_1;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class DrawPanel_strn extends JPanel {
        private int step,tt;
  Color ColorFon = new Color(247,247,255);//���� ����
  Color ColorPanelFon = new Color(255,255,255);//���� ���� ������
  Color ColorPanelRamka = new Color(157,187,255);//���� ���������� ������
  Color ColorSubTitle = new Color(180,0,80);//���� �������
  Font FontSubTitle = new java.awt.Font("Dialog",3,12); //����� �������
  Color ColorSolutionText = new Color(0,0,80);//���� ������ �������
  Font FontSolutionText = new java.awt.Font("Dialog",1,14); //����� ������ �������
  Font FontSolutionIndex = new java.awt.Font("Dialog",1,11); //����� �������� ������
  Color ColorSolutionNumber = new Color(180,0,60);//���� ������ ����
  Font FontSolutionNumber = new java.awt.Font("Dialog",3,16); //����� ������ ����
  Color ColorFormulaText = new Color(0,0,80);//���� ������ ������
  Font FontFormulaText = new java.awt.Font("Dialog",1,12); //����� ������ ������
  Font FontFormulaIndex = new java.awt.Font("Dialog",3,11); //����� ��������
  Color ColorGraficXY = new Color(50,50,50);//���� ������� ���������
  Font FontGraficXY = new java.awt.Font("Dialog",1,10); //����� �������� ������� �� ������� ���������
  Font FontGraficText = new java.awt.Font("Dialog",1,12); //����� ������ � ����.�������.
  Font FontGraficIndex = new java.awt.Font("Dialog",1,11); //����� �������� � ����.
public  Color ColorGrafic_line = new Color(220,40,245);//���� grafika
public  Color ColorGrafic = new Color(0,0,150);//���� grafika

        private int xCen = 130, yCen = 130;
        private RenderingHints renderingHints = new RenderingHints(RenderingHints.
                KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        private Font stepFont = new java.awt.Font("Dialog", 3, 18);
        private Color textColor = new Color(0, 0, 80);
        private QuadraticFunction_strn qf = new QuadraticFunction_strn(2.0, 1.0, 1.0, 0.0, 0.0, 0.0);
          //  2.0, 0.8, 1.0, 0.0,
            //    0.0, 0.0);
        public DrawPanel_strn() {
                try {
                        jbInit();
                }
                catch (Exception ex) {
                        ex.printStackTrace();
                }
                step = 1;
                LevelLines_strn.init(qf, 0, 0, 260, 260+40, 1,  xCen, yCen,SystemColor.activeCaption);
                renderingHints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        }

        void jbInit() throws Exception {
                this.setBackground(ColorFon);
                this.setEnabled(true);
                this.setBorder(BorderFactory.createEtchedBorder());
                this.setLayout(null);
                this.setSize(new Dimension(296, 306));

        }

        public void setStep(int step) {
                this.step = step;
                repaint();
        }
        private void highlight(Graphics g, int y1, int y2) {//�������
                g.setColor(Color.red);
                int s=-68-15,s2=y1-101;
            g.drawLine(346+s,101+s2,365+s,120+s2);
            g.drawLine(346+s,102+s2,365+s,121+s2);
            ///-----1------
            g.drawLine(356+s,121+s2,365+s,121+s2);
            g.drawLine(358+s,120+s2,365+s,120+s2);
            g.drawLine(360+s,119+s2,365+s,119+s2);
            ///-----2------
            g.drawLine(365+s,111+s2,365+s,121+s2);
            g.drawLine(364+s,113+s2,364+s,121+s2);
            g.drawLine(363+s,116+s2,363+s,121+s2);
        }
        protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                int t=6, k=5;
                g.setColor(ColorPanelFon);
                g.fillRect(0,25-k,241,325);
                g.fillRect(266-t,25-k,200+t,325);
                g.fillRect(0,375-k-k,466,100);
                g.setColor(ColorPanelRamka);
                g.drawRect(0,25-k,241,325);
                g.drawRect(0,305-k,241,45);
                g.drawRect(266-t,25-k,200+t,325);
                g.drawRect(0,375-k-k,466,100);

                g2d.setColor(ColorGraficXY);
                g2d.drawLine(130, 25-k, 130, 305-k);
                g2d.drawLine(2, 175-k, 260-20, 175-k);
                g2d.drawLine(240, 175-k, 230, 173-k);
                g2d.drawLine(240, 175-k, 230, 177-k);
              g2d.drawLine(130, 25-k, 132, 35-k);
                g2d.drawLine(130, 25-k, 128, 35-k);
                int u=49;
                g2d.setColor(ColorGrafic);
               g2d.drawLine(143-u+8-20+8,136-k-2*u+16+21,145-u+8-10,141-k-2*u+16+27);
               g2d.drawLine(102-0*u+5,134-k-u+5+28,104-0*u+6,139-k-u+5+32);
                g2d.drawLine(73+u,176-k-u+30,75+u,181-k-u+30+1);
                g2d.setColor(ColorSolutionText);
                Stringer_strN.setGraphics(g);
                Stringer_strN.setPanel(this);
                Stringer_strN.setFontSizes(14,11,0);

                 g2d.setColor(ColorSubTitle );
                 Stringer_strN.drawString("0.5", 167,182);
                 Stringer_strN.drawString("1",122,81);
                 g2d.drawLine(129, 77, 137, 77);
                 g2d.drawLine(175, 160, 175, 170);
                  g2d.setColor(ColorSolutionText);
  if(step==1){
  Stringer_strN.drawString("������ x^{0} - ��������� �����, \u03b5_{1} > 0 - ����� ������������� ", 25, 390-k);
  Stringer_strN.drawString("�����, M - ���������� ����� ��������, E-��������� �������.", 5, 410-k);
  tt=1;
   g2d.setColor(Color.red);
   highlight(g,30,64-k);
    }
  if(step==2){
  Stringer_strN.drawString("������� k = 0, \u00B5^{k} = \u00B5^{0}.", 25, 390-k);
  Stringer_strN.drawString("������ ������� ����� H(x) � �������� \u2207f(x).", 25, 410-k);
  tt=2;
  g2d.setColor(Color.red);
  highlight(g,140,104-k);
  }
  if(step==3){
  Stringer_strN.drawString("�������� �������� \u2207f(x^{k}) � ����� x^{k}.", 25, 390-k);
  tt=3;
  g2d.setColor(Color.red);
  highlight(g,200,104-k);
  }
  if(step==4){
  Stringer_strN.drawString("�������� ���������� �������� ���������: ||\u2207f(x^{k})|| \u2264 \u03b5_{1}.", 25, 390-k);
  Stringer_strN.drawString("", 5, 410-k);
  tt=4;
  g2d.setColor(Color.red);
  highlight(g,250,104-k);
  }
  if(step==5){
  Stringer_strN.drawString("���� ����������� ���������, �� ������ ������� � x* = x^{k}.", 25, 390-k);
  Stringer_strN.drawString("���� ���, �� ��������� � ���������� ����.", 5, 410-k);
  tt=5;
  }
  if(step==6){
  Stringer_strN.drawString("�������� ���������� ������� k \u2265 M :", 25, 390-k);
  Stringer_strN.drawString("", 5, 410-k);
  tt=6;
  g2d.setColor(Color.red);
  highlight(g,265,108-k);
  }
  if(step==7){
  Stringer_strN.drawString("���� ����������� ���������, �� ������ ������� � x* = x^{k}.", 25, 390-k);
  Stringer_strN.drawString("����� ��������� � ���������� ����.", 5, 410-k);
  tt=7;
  }
  if(step==8){
  Stringer_strN.drawString("�������� �������� ������� H(x^{k}).", 25, 390-k);
  Stringer_strN.drawString("", 5, 410-k);
  tt=8;
  g2d.setColor(Color.red);
  highlight(g,140,104-k);
  }
  if(step==9){
  Stringer_strN.drawString("�������� �������� ������� H(x^{k}) + \u00B5^{k} * E, ��� E - ���������", 25, 390-k);
  Stringer_strN.drawString("������� , \u00B5^{k} - ������������������ ������������� �����.", 5, 410-k);
  tt=9;
  }
  if(step==10){
  Stringer_strN.drawString("�������� �������� ������� [H(x^{k}) + \u00B5^{k} * E]^{-1}, ������� ", 32, 390-k);
  Stringer_strN.drawString("������ ���� ������������ ���������� (������ \u00B5^{k}).", 5, 410-k);
  tt=10;
  }
  if(step==11){
  Stringer_strN.drawString("�������� d^{k} = - [H(x^{k}) + \u00B5^{k} * E]^{-1}*\u2207f(x^{k}). ", 32, 390-k);
  Stringer_strN.drawString("", 5, 410-k);
  tt=11;
  g2d.setColor(Color.red);
  highlight(g,105,107-k);
  }
  if(step==12){
  Stringer_strN.drawString("������ ����� ����� x^{k+1} = x^{k} + d^{k}.", 32, 390-k);
  Stringer_strN.drawString("", 5, 410-k);
  tt=12;
  g2d.setColor(Color.red);
  highlight(g,75,107-k);
  }
  if(step==13){
  Stringer_strN.drawString("��������� ���������� ������� f(x^{k+1}) < f(x^{k}) : ", 32, 390-k);
  Stringer_strN.drawString("", 5, 410-k);
  tt=13;
  g2d.setColor(Color.red);
  highlight(g,297,100-k);
  }
  if(step==14){
  Stringer_strN.drawString("���� ����������� �����������, �� ������� k = k + 1, ", 32, 390-k);
  Stringer_strN.drawString(" \u00B5^{k+1} = \u00B5^{k}/2 � ������� � ���� 3. ��������� ������� ����� ", 5, 410-k);
  Stringer_strN.drawString("����� �� �������, �� ������� ��������� ����� x^{k},������� ", 5, 430-k);
  Stringer_strN.drawString("�������� ��������� ������������ ����� �������� x^{*}.", 5, 450-k);

  tt=14;
  }
  if(step==15){
 Stringer_strN.drawString("���� ����������� �� �����������, �� �������  \u00B5^{k+1} = 2*\u00B5^{k} ", 32, 390-k);
 Stringer_strN.drawString("� ������� � ���� 9.", 5, 410-k);

 tt=15;
 }

  if(step == 5 || step == 7) {
    g.setColor(Color.red);
    Stringer_strN.setFontSizes(12, 10, 8);
    g.fillOval(172, 75, 6, 6);
    Stringer_strN.drawString("x* = x^{0}", 174 + 3-6, 54 - 3+20-k);

  }
                g2d.setFont(FontSubTitle);
                g2d.setColor(ColorSubTitle);
                g2d.drawString("����������� �����������:",5,22-k);
                g2d.drawString("�������:",5,372-k-k);
                g2d.drawString("�������:",271-t,22-k);
                g2d.setColor(ColorGrafic);
                Stringer_strN.setFontSizes(12, 10, 8);
                Stringer_strN.drawString("f(x)=(x_{1}, x_{2})",5,39-k);
                g2d.setFont(FontSolutionNumber);
                g2d.setColor(ColorSolutionNumber);
////////////////////////////////////////////////
                g2d.drawString(" " + tt + ".", 3, 390-k);
                g2d.setColor(ColorSolutionText);
                Stringer_strN.setFontSizes(12, 10, 8);
                wasArrow = false;
                Stringer_strN.drawString("��������� ������:", 270-2, 40-k);
                Stringer_strN.drawString("��������� ������������ �����:", 270-2, 90-k);
                Stringer_strN.drawString("������� ����������:", 270, 123-k);
                Stringer_strN.drawString("������� �����:", 270, 157-k);
                Stringer_strN.drawString("������� ���������:", 270, 263-k);
                Stringer_strN.drawString("��������:", 270, 213-k);
                Stringer_strN.drawString("�������� �������� �������:",270, 315-k);

                if(step==1){
                   g2d.setColor(Color.red);
                   Stringer_strN.drawString("x^{0}, \u03b5_{1} > 0, M, E - #{1 0}{0 1}n{}n{}", 290, 65-k);
               }
               else g2d.setColor(ColorSolutionText);
              Stringer_strN.drawString("x^{0}, \u03b5_{1} > 0, M, E - #{1 0}{0 1}n{}n{}", 290, 65-k);


                if(step==12){
                 // highlight(g,30,64-k);
                  g2d.setColor(Color.red);
                }
                else g2d.setColor(ColorSolutionText);

                Stringer_strN.drawString("x^{k+1} = x^{k} + d^{k}n{}", 290, 110-k);
                g2d.setColor(ColorGraficXY);
                Stringer_strN.drawString("x_{1}",227,169-3*k);
                Stringer_strN.drawString("x_{2}",135,36-k);

                if(step==2 || step==8){
                  //highlight(g,117,100-k);
                  g2d.setColor(Color.red);
                }
                else g2d.setColor(ColorSolutionText);
                Stringer_strN.drawString("H(x) = #{ f_{x_{1}x_{1}}}{f_{x_{1}x_{2}}}{f_{x_{2}x_{1}}}{f_{x_{2}x_{2}}}n{}n{}n{}", 290, 180-k);

                if(step==3 ){

                 g2d.setColor(Color.red);

                 Stringer_strN.drawString ( "\u2207f(x^{k}) = #{\u2202 f(x_{1},x_{2})}}}{\u2202 f(x_{1},x_{2})}{\u2202 x_{2}}}{\u2202 x_{2}} ",269,236-k);
                Stringer_strN.drawString( "________ ,", 316, 230-k+3);
                 Stringer_strN.drawString("\u2202 x_{1}", 322, 243-k+3);
               Stringer_strN.drawString( "________", 379, 230-k+3);

               }
               else {g2d.setColor(ColorSolutionText);
 Stringer_strN.drawString ( "\u2207f(x^{k}) = #{\u2202 f(x_{1},x_{2})}}}{\u2202 f(x_{1},x_{2})}{\u2202 x_{2}}}{\u2202 x_{2}} ",269,236-k);
             Stringer_strN.drawString( "________ ,", 316, 230-k+3);
              Stringer_strN.drawString("\u2202 x_{1}", 322, 243-k+3);
            Stringer_strN.drawString( "________", 379, 230-k+3);

               }

                 if(step==4 ){
                g2d.setColor(Color.red);
                  Stringer_strN.drawString( "||\u2207f(x^{k})|| \u2264 \u03b5_{1}n{}", 290, 280-k);
                }
                else{ g2d.setColor(ColorSolutionText);
                Stringer_strN.drawString( "||\u2207f(x^{k})|| \u2264 \u03b5_{1}n{}", 290, 280-k);}

                if(step==6 ){
                g2d.setColor(Color.red);
                Stringer_strN.drawString("k \u2265 M", 290, 300-k);
               }
               else{ g2d.setColor(ColorSolutionText);
                Stringer_strN.drawString("k \u2265 M", 290, 300-k);

               }

               if(step==11 ){
               g2d.setColor(Color.red);
             Stringer_strN.drawString("d^{k} = - [H(x^{k}) + \u00B5^{k} * E]^{-1}*\u2207f(x^{k}). ", 270, 143-k);
              }
              else{ g2d.setColor(ColorSolutionText);
               Stringer_strN.drawString("d^{k} = - [H(x^{k}) + \u00B5^{k} * E]^{-1}*\u2207f(x^{k}). ", 270, 143-k);

              }
              if(step==13){
                 // highlight(g,200,224-k);
                  g2d.setColor(Color.red);
                }
                else g2d.setColor(ColorSolutionText);


                Stringer_strN.drawString("f(x^{k+1}) < f(x^{k})",270, 335-k);

                Stringer_strN.setFontSizes(14, 11, 8);
                LevelLines_strn.setGraphics(g);
       // LevelLines_strn.drawLevelLine(174-10, 54+5-k+2);
      // LevelLines_strn.drawLevelLine(111-20, 54+40-k);

        LevelLines_strn.drawLevelLine(60+2, 82-k);
        LevelLines_strn.drawLevelLine(70+2, 92-k);
        LevelLines_strn.drawLevelLine(80+2, 102-k);
        LevelLines_strn.drawLevelLine(90+2, 112-k);
        LevelLines_strn.drawLevelLine(100+2, 122-k);
        LevelLines_strn.drawLevelLine(110+2, 132-k);
        LevelLines_strn.drawLevelLine(110+12, 122+20-k);
        LevelLines_strn.drawLevelLine(50+2, 122-k);
        LevelLines_strn.drawLevelLine(40+2, 62-k);
      g2d.setColor(Color.red);
        LevelLines_strn.drawLevelLine(40, 42-k);
          LevelLines_strn.drawLevelLine(30+2, 52-k);
                if(step!=5 && step!=7){
                  if(step>= 0&&step < 12) g.setColor(Color.red);
                  if(step >= 12&&step <= 14) g.setColor(ColorSubTitle);
                  //g.fillOval(172, 75, 6, 6);

                    g.fillOval(172, 75, 6, 6);

                       // g.drawLine(175, 77, 175, 170);
                 // g.drawLine(129, 77, 175, 77);
                   g2d.setColor(ColorSubTitle );
                   for(int i = 0; i <=46;i=i+5) {
                  g.drawLine(129+i, 77, 129+(i+1), 77);
                   }

                   for(int j = 0; j <=93;j=j+5) {
                  g.drawLine(175, 77+j, 175, 77+(j+1));
                }
                  Stringer_strN.setFontSizes(12, 10, 8);
                  Stringer_strN.drawString("x^{0}", 174 + 3, 75-k);
                }
                if(step==5 && step==7){
                  if(step>= 0&&step < 12) g.setColor(Color.red);
                  if(step >= 12&&step <= 14) g.setColor(ColorSubTitle);
                 // g.fillOval(174-6, 54 + 20 - 4, 5, 5);
                  g.fillOval(172, 75, 6, 6);
                }
                if(step < 3) return;
                g.setColor(step == 3? ColorGrafic_line: ColorGrafic_line);
               // g.drawLine(142-6, 76+25, 175-6, 55+20-2);
                 g.drawLine(143,99, 176, 75);
               // g.drawLine(142-6, 75+25, 175-6, 54+20-2);
                //g.drawLine(142-6, 76+25, 142+5-6, 76-0+25);
               g.drawLine(143, 99, 148, 99);
               g.drawLine(143, 99, 144, 94);
                //g.drawLine(142-6, 75+25, 142+3-6, 75-6+25);

               for(int i=145;i<130+80;i++)
                {
                  int y,y1;
                 // y = (int)(1.35*i-155.5);
                 // y1 = (int)(1.35*(i+1)-155.5);
                 // g.drawLine(i, y, i+1, y1);
               }
                Stringer_strN.setFontSizes(12, 10, 8);
                Stringer_strN.drawString("-\u2207f(x^{0})", 115-22,65+37);
                if (step < 12) return;
                if(step >= 12) g.setColor(Color.blue);
                g.fillOval(161, 85, 6, 6);//130 - 2, 130 - 2+15-k, 5, 5
                g2d.setColor(ColorSubTitle );
                 for(int i = 0; i <=39;i=i+5) {
                g.drawLine(129+i, 87, 129+(i+1), 87);
                 }

                 for(int j = 0; j <=80;j=j+5) {
                g.drawLine(164, 87+j, 164, 87+(j+1));
              }

                Stringer_strN.drawString("x^{1}",150, 89);//g.fillOval();130 - 12, 130 - 3+15-k
               // if( step == 14) {
               //     g.setColor(Color.red);
                //      Stringer_strN.drawString("x^{*}=", 130, 83);//130 - 8-21, 130 - 3+15-k
               // }
                if(step == 5 || step == 7) {
                    g.setColor(Color.red);
                      Stringer_strN.drawString("= x^{*}", 174 + 15-6, 54 - 3+20-k);
                }
                 if(step==15){
                  Stringer_strN.drawString("x^{*} = x^{k}",132, 168);
                   g.setColor(Color.red);
                  g.fillOval(125,163, 6, 6);
                  g.setColor(Color.blue);
                 g.fillOval(161, 85, 6, 6);
                 }
        }
        static boolean wasArrow;
        public void sc(Graphics g, int[] s, int x, int y) {
                g.setColor(ColorSolutionText);
                for(int i = 0; i < s.length;++i) {
                        if(step != s[i]) continue;
                        g.setColor(Color.red);
                        y+=5;
                        strelka(g, x, y);
                        break;
                }
        }
        public void strelka(Graphics g,int x,int y){
          if(wasArrow) return;
                wasArrow = true;
                x=x-25-10;
            y=y-25-7-10;
          g.setColor(Color.red);
          g.drawLine(x,y,x+19,y+19);
          g.drawLine(x,y+1,x+19,y+20);
          ///-----1------
          g.drawLine(x+10,y+20,x+19,y+20);
          g.drawLine(x+12,y+19,x+19,y+19);
          g.drawLine(x+14,y+18,x+19,y+18);
          ///-----2------
          g.drawLine(x+19,y+10,x+19,y+20);
          g.drawLine(x+18,y+12,x+18,y+20);
          g.drawLine(x+17,y+15,x+17,y+20);
        }
}
