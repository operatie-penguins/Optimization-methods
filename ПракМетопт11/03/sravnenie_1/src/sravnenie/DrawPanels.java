package sravnenie;

import java.awt.*;
import javax.swing.*;
import java.text.*;

public class DrawPanels extends JPanel {
        static boolean done1 = false;
        static boolean done2 = false;
        static boolean done3 = false;
//******************************************************************************
       //  Image pic;
  Color ColorFon = new Color(247,247,255);//���� ����
  //������:
    Color ColorPanelFon = new Color(255,255,255);//���� ����
    Color ColorPanelRamka = new Color(157,187,255);//���� ����������
  //������:
    Color ColorBtnBackground = new Color(220,230,255);//���� ���� ������
    Color ColorBtnForeground = new Color(0,0,60);//���� ������� �� ������
    Font FontBtn= new java.awt.Font("Dialog", 1, 12);//����� ������� �� ������(����� ������==> � <==)
    Font FontBtnStr= new java.awt.Font("Dialog", 1, 14);//����� �� ������� ==> � <==
  //���������:
    Color ColorTitle = new Color(130,0,80);//����
    Font FontTitle= new java.awt.Font("Dialog", 1, 16);//�����
  //������� (����. "����������� �����������", "�������", "������" � �.�.):
    Color ColorSubTitle = new Color(180,0,60);//����
    Font FontSubTitle= new java.awt.Font("Dialog", 3, 12);//�����
  //���� "�������":
    Color ColorSolutionText = new Color(0,0,80);//���� ������
    Font FontSolutionText= new java.awt.Font("Dialog", 1, 14);//����� ������
    Font FontSolutionIndex= new java.awt.Font("Dialog", 1, 11);//����� ��������
    Color ColorSolutionNumber = new Color(180,0,60);//���� ������ ����
    Font FontSolutionNumber = new java.awt.Font("Dialog", 3, 16);//����� ������ ����
  //���� "�������", "��������":
    Color ColorFormulaText = new Color(0,0,80);//���� ������
    Font FontFormulaText= new java.awt.Font("Dialog", 1, 12);//����� ������
    Font FontFormulaIndex= new java.awt.Font("Dialog", 1, 11);//����� ��������
  //���� "����������� �����������":
    Color ColorGraficXY = new Color(50,50,50);//���� ������� ���������
    Font FontGraficXY= new java.awt.Font("Dialog", 1, 10);//����� �������� ������� �� ������� ��������
    Font FontGraficText= new java.awt.Font("Dialog", 1, 10);//����� ������
    Font FontGraficIndex= new java.awt.Font("Dialog", 1, 11);//����� ��������
    //����� ������� �������� (����. x^2,f(x); ����� x � ����� 2)
  //���� "������":
    Color ColorTaskText = new Color(0,0,80);//���� ������� ���������
    Font FontTaskText= new java.awt.Font("Dialog", 1, 14);//
    Font FontTaskIndex= new java.awt.Font("Dialog", 1, 11);//
        private static Color levelLinesColor = new Color(0, 0, 128);
        static sravnenie owner;
        static void setOwner( sravnenie ow) {
                owner = ow;
        }
static boolean isDouble = false;
        public  int  x_r, y_r;
        public static int  t=0,xOff = 5, yOff = 1, xLen = 350, yLen = 270;
        public static int xCen = 60, yCen = 240;
        public static double scale = 30;
        static double[] x1s = {	0.0, -0.6, 0.8, -0.5, -0.5, 0.2, 0.2, 0.1, 0.3, -0.3, -0.6, 0.8};
        static double[] x2s = {	0.8, -0.8, 0.6, 0.3, 0.3, 0.2, -0.2, 0.1, 0.1, 0.1, -0.8, -0.6};
        static double[] scales = {140, 130, 150,150,150,150,150,150,150,180,150,150};
        static int xCens[] = {220, 170,40, 220,220, 220, 220, 250, 250, 240, 175, 150};
        static int yCens[] = {150, 30,150, 130,130, 60, 170, 100, 110, 90, 40, 120};
        static double[] aArr = {8,  8, 10, 5, 8,3, 15, 10, 12, 14, 9, 13};
        static double[] bArr = {0.6, -2.0/5,-0.5, 0.1,-0.2, 0.1, 0.1, 0.3, 0.3, 0.4, -0.5, 0.4};
        static double[] cArr = {12,  6, 4, 8, 3,20, 4, 10, 8, 15, 5, 10};
        static double[] dArr = {0.4, 0.6,0.5, 0.1, -0.1, 0.6, -0.6, 0.3, 0.4, 0.1, 0.7, 0.5};

        public double m = 1000, p;
        public static  int M=20;

       public double[] Vektor = {1000,  500, 250, 125, 62.5,31.25, 15.625, 7.8125, 3.90625, 1.953125, 0.9765625, 0.48828125, 0.244140625, 0.1220703125 , 0.06103515625, 0.030517578125, 0.0152587890625, 0.00762939453125, 0.003814697265625, 0.0019073486328125, 0.00095367431640625, 0.000476837158203125, 0.0002384185791015625, 0.00011920928955078125 ,0.000059604644775390625, 0.0000298023223876953125 ,0.00001490116119384765625 ,0.000007450580596923828125, 0.0000037252902984619140625 ,0.00000186264514923095703125 , 0.000000931322574615478515625};
       // public double[] Vektor = {100,  50, 25, 12.5, 6.25,3.125, 1.5625, 0.78125, 0.390625, 0.1953125, 0.09765625, 0.048828125, 0.0244140625, 0.01220703125 , 0.006103515625, 0.0030517578125, 0.00152587890625, 0.000762939453125, 0.0003814697265625, 0.00019073486328125, 0.000095367431640625, 0.0000476837158203125, 0.00002384185791015625, 0.000011920928955078125 ,0.0000059604644775390625, 0.00000298023223876953125 ,0.000001490116119384765625 ,0.0000007450580596923828125, 0.00000037252902984619140625 ,0.000000186264514923095703125 , 0.0000000931322574615478515625};

        static int variant, tt,tt_1;
        public static QuadFuncs f = new QuadFuncs(1, 0, 1, 0);
        //public static QuadFuncs f2 = new QuadFuncs(1, 0, 1, 0,true);
        public static QuadFuncs_r f2 = new QuadFuncs_r(1, 0, 1, 0);
        public static QuadFunc_prN  f3 = new QuadFunc_prN (1, 0, 1, 0);
        public static int step, iter, k;
        public static int nextStep;
        public static int nPoints, totalPoints;
        public static String c = "� lopata",b = "b ��������",cr="",crm="",br="",cm = " �m ��������";
        public static double xEnd, yEnd;
        public static double[] x1 = new double[300];
        public static double[] x2 = new double[300];

        public static double[] x1_m = new double[300];
        public static double[] x2_m = new double[300];

     //   public static double[] x1_r = new double[300];
     //   public static double[] x2_r = new double[300];

        public static String[] cs = new String[300];
        public static String[] csm = new String[300];
        public static String[] bs = new String[300];
        public static String[] crs = new String[300];
        public static String[] crsm = new String[300];
        public static String[] steps = new String[300];
        public static int[] realsteps = new int[300];
        public static int count, cc,xc,yc,xb,yb,ccm;
        public static boolean[] incPoints = new boolean[300];
        static {
                setFunc(0);
        }
   //     public static void setPar(int y){
 // t=y;
 //}
 public static void moveCenter(int sx, int sy) {
             xCen += sx;
             yCen += sy;
             LevelLiness.init(f, xOff, yOff, xLen, yLen, scale, xCen, yCen,levelLinesColor);
     }
     public static void setScale(double sc) {
             scale = sc;
             LevelLiness.init(f, xOff, yOff, xLen, yLen, scale, xCen, yCen,levelLinesColor);
     }
/*
     public static void moveCenter_2(int sx, int sy) {
            xCen += sx;
            yCen += sy;
            LevelLiness_r.init(f2, xOff, yOff, xLen, yLen, scale, xCen, yCen,levelLinesColor);
    }
    public static void setScale_2(double sc) {
            scale = sc;
            LevelLiness_r.init(f2, xOff, yOff, xLen, yLen, scale, xCen, yCen,levelLinesColor);
    }
*/


     public static void moveCenter_m(int sx, int sy) {
            xCen += sx;
            yCen += sy;
            LevelLines_prN.init(f3, xOff, yOff, xLen, yLen, scale, xCen, yCen,levelLinesColor);
    }
    public static void setScale_m(double sc) {
            scale = sc;
            LevelLines_prN.init(f3, xOff, yOff, xLen, yLen, scale, xCen, yCen,levelLinesColor);
    }

        public static void setFunc(int v) {


                isDouble = false;
                count = 0;
                //v = 5;
               variant = 0;
               //  variant = 0;
                xCen = xCens[v];
                yCen = yCens[v];
                xEnd = -bArr[v];
                yEnd = -dArr[v];
                step = 0;
                k = 0;
                x1[0] = x1s[v];
                x2[0] = x2s[v];

                x1_m[0] = x1s[v];
                x2_m[0] = x2s[v];

              //  x1_r[0] = x1s[v];
              //  x2_r[0] = x2s[v];
                f = new QuadFuncs(aArr[v], bArr[v], cArr[v], dArr[v]);
                f.setx1x2(x1[0], x2[0]);

                f2 = new QuadFuncs_r(aArr[v], bArr[v], cArr[v], dArr[v]);
                f2.setx1x2(x1[0], x2[0]);

                f3 = new QuadFunc_prN(aArr[v], bArr[v], cArr[v], dArr[v]);
                f3.setx1x2(x1_m[0], x2_m[0]);
                nPoints = 1;
                while (step != -1) {
                        go();
                        cs[count] = c;
                        csm[count] = cm;
                        bs[count] = b;
                        crs[count] = cr;
                        crsm[count] = crm;
                        realsteps[count] = step;
                        int z = k;
                        if (step == 11 && nextStep != -1) {
                                z = k + 1;
                        }
                        steps[count] = "" + z + "." + step + ".";
                        incPoints[count] = false;

                        if (step == 9||step == 17) {
                                x1[nPoints] = f.x1New();
                                x2[nPoints] = f.x2New();

                                x1_m[nPoints] = f3.x1New_m(k);
                                x2_m[nPoints] = f3.x2New_m(k);

                            //    x1_r[nPoints] = f2.x1New();
                            //    x2_r[nPoints] = f2.x2New();

                                nPoints++;
                                incPoints[count] = true;
                        }
                        step = nextStep;
                        count++;
                }
                step = 0;
                k = 0;
                f.setx1x2(x1[0], x2[0]);
               // f2.setx1x2(x1_r[0], x2_r[0]);
                f3.setx1x2(x1_m[0], x2_m[0]);
                totalPoints = 1;
                cc = 0;
                ccm = 0;
                setScale(scales[v]);
                setScale_m(scales[v]);
             //   setScale_2(scales[v]);
                 done1 = false;
                 done2 = false;
                 done3 = false;
        }

        public void showEndMsg(Graphics g)  {
                int SM = -383;
                count = -8;
                g.setColor(new Color(197, 197, 197,120));
                g.fillRect(12, 392 + SM, 490, 300 + count * 10);
                g.setColor(ColorFon);
                g.fillRect(10 - 5, 385 + SM, 490, 300 + count * 10);
                g.setColor(ColorPanelRamka);
                g.drawRect(10 - 5, 385 + SM, 490, 300 + count * 10);
                g.setFont(FontSubTitle);
                g.setColor(ColorSubTitle);
                g.drawString("�����", 225 - 10, 400 + SM);
                        g.setColor(ColorPanelFon);
                        g.fillRect(10 - 5+10, 385 + SM+20, 490-20, 300 + count * 10-20-10);
                        g.setColor(ColorPanelRamka);
                        g.drawRect(10 - 5+10, 385 + SM+20, 490-20, 300 + count * 10-20-10);
                        String c =
                                "�����()()() �������, ����� �������-������� ��� ����� ������n{}" +
                                "����������� ��� ������ ������� ����� �� 2 ��������,n{} " +
                                "��� ����� ������� �� 4 ��������.n{}" +
                                "������� ��������, ��� ��� ���������� ����� ��������, ���n{}" +
                                "� ������ �������-�������, ������ ������� ��� ������ �������n{}" +
                                "������������� �� 22 ��������.n{}" +
                                "������ �������: ��� ������� ������� - �����, ��������,n{}" +
                                "� ������� ������ ����������� ������ ���� �� �����������n{}" +
                                "�������, ���������������� ������������ ����� �������-�������.";
                        Stringers.setFontSizes(12,10,8);
                        g.setColor(ColorSolutionText);
                        Stringers.drawString(c, 30,40);
                        return;
        }
        public void showResult(Graphics g)
        {
                int SM = -383;
                count = -8;
                g.setColor(new Color(197, 197, 197));
                g.fillRect(25, 400 + SM, 490, 305 + count * 10);
                g.setColor(ColorFon);
                g.fillRect(10 - 5, 385 + SM, 490, 300 + count * 10);
                g.setColor(ColorPanelRamka);
                g.drawRect(10 - 5, 385 + SM, 490, 300 + count * 10);
                g.setFont(FontSubTitle);
                g.setColor(ColorSubTitle);
                g.drawString("���������", 225 - 10, 400 + SM);
                if(false) {
                        g.setColor(ColorPanelFon);
                        g.fillRect(10 - 5+10, 385 + SM+20, 490-20, 300 + count * 10-20-10);
                        g.setColor(ColorPanelRamka);
                        g.drawRect(10 - 5+10, 385 + SM+20, 490-20, 300 + count * 10-20-10);
                        String c =
                                "����� �������, ����� �������-������� ��� ����� ������n{}" +
                                "����������� ��� ������ ������� ����� �� 2 ��������,n{} " +
                                "��� ����� ������� �� 4 ��������.n{}" +
                                "������� ��������, ��� ��� ���������� ����� ��������, ���n{}" +
                                "� ������ �������-�������, ������ ������� ��� ������ �������n{}" +
                                "������������� �� 22 ��������.n{}" +
                                "������ �������: ��� ������� ������� - �����, ��������,n{}" +
                                "� ������� ������ ����������� ������ ���� �� �����������n{}" +
                                "�������, ���������������� ������������ ����� �������-�������.";
                        Stringers.setFontSizes(12,10,8);
                        g.setColor(ColorSolutionText);
                        Stringers.drawString(c, 30,40);
                        return;
                }
                g.setColor(ColorPanelFon);
                g.fillRect(25 - 5, 45, 225, 250 + count * 10);
                g.fillRect(260 - 5, 45, 225, 250 + count * 10);
                g.setColor(ColorPanelRamka);
                g.drawRect(25 - 5, 45, 225, 250 + count * 10);
                g.drawRect(260 - 5, 45, 225, 250 + count * 10);
                g.setColor(ColorSubTitle);
                Stringers.drawString("����� �������:",30,40);
                Stringers.drawString("����� �������-�������:",265-5,40);
                String s1="", s2="";
                double xx1, xx2;
                if(cc >= 9) {
                        xx1 = 2.153; xx2 = 2.604;
                        s1 += "1) f("+ f.normalize(xx1) +"; "+ f.normalize(xx2) +") = " + f.funcStr(xx1, xx2)+"n{}";
                        xx1 = 0.013; xx2 = 2.145;
                        s2 += "1) f("+ f.normalize(xx1) +"; "+ f.normalize(xx2) +") = " + f.funcStr(xx1, xx2)+"n{}";
                }
                if(cc >= 17) {
                        xx1 = 1.088; xx2 = 1.107;
                        s1 += "2) f("+ f.normalize(xx1) +"; "+ f.normalize(xx2) +") = " + f.funcStr(xx1, xx2)+"n{}";
                        xx1 = 0.003; xx2 = 0.015;
                        s2 += "2) f("+ f.normalize(xx1) +"; "+ f.normalize(xx2) +") = " + f.funcStr(xx1, xx2)+"n{}";
                }
                if(cc >= 25) {
                        xx1 = 0.844; xx2 = 0.858;
                        s1 += "3) f("+ f.normalize(xx1) +"; "+ f.normalize(xx2) +") = " + f.funcStr(xx1, xx2)+"n{}";
                }
                if(cc >= 33) {
                        xx1 = 0.723; xx2 = 0.734;
                        s1 += "4) f("+ f.normalize(xx1) +"; "+ f.normalize(xx2) +") = " + f.funcStr(xx1, xx2)+"n{}";
                }
                g.setColor(ColorSolutionText);
                Stringers.setFontSizes(12,10,8);
                Stringers.drawString(s1,30,60);
                Stringers.drawString(s2,260,60);
        }
        public static void go() {

                switch (step) {
                 case 0:
                  c = "   �� ����������� ���������� ����������� � = f(x_{1}, x_{2})";
                   nextStep = step + 1;
                    break;
                case 1:
                 c = "   ������ x^{0} = (" + f.x1Str() + "; " + f.x2Str() + "), \u03b5_{1} = " +
                 f.eps1Str() + ", \u03b5_{2} = " + f.eps2Str() + "," + " \u03BC^{0} = "+f3.Vektor[k]+"."+
                  "n{}������ ����� ������ ������� f(x).";
                  nextStep = step + 1;
                  break;

               case 2:
                c = "   ������ �������� \u2207f(x) = " + f.gradientStr() + "";
                nextStep = step + 1;
               break;

               case 3:
                 c = "   ������ ������� ����� H(x) = #{f_{x_{1}x_{1}}}{f_{x_{1}x_{2}}}{f_{x_{2}x_{1}}}{f_{x_{2}x_{2}}} = n{}n{}" +
                 f.gesseStr() + "";
                 nextStep = step + 1;
                  break;

               case 4:
               c = "";
               cm ="";
                c += "  �������� �������� � ����� x^{" + k + "}: \u2207f(x^{" + k +
                "}) = #{" + f2.g1Str() + "}{" + f2.g2Str() + "}";
            cm += "  �������� �������� � ����� x^{" + k + "''}: \u2207f(x^{" + k +//r{}n{}
               "}) = #{" + f3.g1Str() + "}{" +f3.g2Str() + "}e{}";
             nextStep = step + 1;
                break;
               case 5:
                  c = "";
                  cm ="";
                  c +="  �������� ���������� �������� ��������� \u2225\u2207f(x^{" + k + "})\u2225 \u2264 \u03b5_{1}:n{}";
                  if (f.gNorm() <= f.eps1) {
                      c += f.gNormStr() + " \u2264 " + f.eps1Str() +
                       ", ������� �����������, ������ r{}x^{*} = x^{" + (k + 1) +
                        "} = #{" + f.x1Str() + "}{" + f.x2Str() +
                         "}e{} - ������� �����������.";
                         nextStep = -1;
                         }
                         else {
                        // c += f.gNormStr() + " > " + f.eps1Str() +
                        // ", ������� �� �����������, ��������� � ���������� n{}����.";
                          nextStep = step + 1;
                          }
                  if (f2.gNorm() <= f2.eps1) {
                    c += f2.gNormStr() + " \u2264 " + f2.eps1Str() +
                     ", ������� �����������, ������ x^{**} = x^{" + (k) +
                     "'} = #{" + f.x1Str() + "}{" + f.x2Str() +
                     "}e{} - ������� �����������.";
                     nextStep = -1;
                     }
                      else {
                       c += f2.gNormStr() + " > " + f2.eps1Str() +
                        ", ������� �� �����������, ��������� � ���������� n{}����.r{}";
                        nextStep = step + 1;
                          }
             if (f3.gNorm() <= f3.eps1)
                         {
                         cm+=f3.gNormStr() + "\u2264 " + f3.eps1Str() +
                         ", ������� �����������, ������ x^{***} = x^{" + (k) +
                          "''} = "+"#{"+ f3. x1NewStr(k)+"}{"+f3. x2NewStr(k)+"}"+ " - ������� n{}�����������.";
                          nextStep = -1;
                        }
                           else
                            {
                               cm+=f3.gNormStr() + " > " +f3.eps1Str() +
                                ", ������� �� �����������, ��������� � ���������� n{}����.r{}";;
                              nextStep = step + 1;
                            }
                 break;
                        case 6:
                                c = "";
                                cm ="";

                              c += "r{}n{}��������� ������� H(x^{" + k + "'}) = " + f2.hStr();
                            //  cm+="��������� ������� H(x^{" + k + "''}) = " + f3.hStr() + "n{}"+
                              //cm+="��������� ������� H(x^{" + k + "''})+\u03BC^{"+ k +"}*E = " + f3.h_plusStr(k);
                                cm+= "  ��������� ������� H(x^{" + k + "})+\u03BC^{"+ k +"}*E = " +f3.h_plusStr(k);
                              nextStep = step + 1;
                         break;

                        case 7:
                                c = "";
                                cm ="";

                                c += "��������� �������� �������� �������: H^{-1}(x^{" + k +
                                        "}) = " + f.h_1Str() + "";
                             //if(step==7)  { cm += "��������� �������� �������� �������: [H(x^{" + k +
                               //        "''})+\u03BC^{"+ k +"}*E]^{-1}= " + f3.h_1_plusStr(k) + "e{}";}
                                cm += " ��������� �������� �������� �������: [H(x^{" + k +
                                       "''})+\u03BC^{"+ k +"}*E]^{-1}= " + f3.h_1_plusStr(k);
                                  // c += " ��������� �������� �������� �������: H^{-1}(x^{" + k +
                                     //   "'}) = " + f2.h_1Str();
                              nextStep = step + 1;
                                break;
                        case 8:
                                c = "";
                                cm ="";
                                if(k != 0) c += "R{}";
                                c += "��������� d_{" + k + "} = -H^{-1}(x^{" + k +
                                        "})\u2207f(x^{" + k + "}) = - " + f.h_1Str() + "#{" +
                                        f.g1Str() + "}{" +
                                        f.g2Str() + "} = " + "#{" + f.d1Str() + "}{" + f.d2Str() +
                                        "}";

                                        String d1 = f2.d1()<0 ? "(" + f2.d1Str() + ")" : f2.d1Str();
                                        String d2 = f2.d2()<0 ? "(" + f2.d2Str() + ")" : f2.d2Str();
                                        String qq = (k == 0)? "" : " r{}d_{" + k + "} = " + "(" + f2.d1Str() + "; " + f2.d2Str() +")^{T}. ";
                                        c += "n{}r{}n{}������� t_{" + k + "} �� �������"+
                                                " ������� �������� �������.n{}"+
                                                "f(" + f2.x1Str() + "+t_{" + k + "}\u2027"  +"("+ f2.d1Str()+")" +", "+ f2.x2Str() + "+t_{" + k + "}\u2027"  + "("+f2.d2Str()+")" +")\u2192min; " +
                                                "t_{" + k + "} = " +  f2. step_rStr() + "e{}";

                                   cm+= "���������"+
                                   "d_{" + k + "} = -[H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} \u2207f(x^{" + k + "}) = - " + f3.h_1_plusStr(0) + "#{" +
                                   f3.g1Str() + "}{" + f3.g2Str() + "} = " + "#{" + f3.d1Str(0) + "}{" + f3.d2Str(0) + "}";

                               nextStep = step + 1;
                                break;
                        case 9:
                                c = "R{}������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                        k + "} = " +
                                        "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                        "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                        "#{" + f.x1NewStr() + "}{" + f.x2NewStr() + "}";

                                        c += "r{}n{}������� ����� x^{" + (k + 1) + "'} = x^{" + k +
                                                "'} + t_{"+k+"}d^{" +
                                                k + "} = " +
                                                "#{" + f2.x1Str() + "}{" + f2.x2Str() + "} + " +
                                                f2.step_rStr() +
                                                " #{" + f2.d1Str() + "}{" + f2.d2Str() + "} = " +
                                                "#{" + f2.x1New_rStr() + "}{" + f2.x2New_rStr() + "}e{}";
                             cm = "  ������� ����� x^{" + (k + 1) + "''} = x^{" + k + "''} + d^{" +
                              k + "} = " +
                             "#{" + f3.x1Str() + "}{" + f3.x2Str() + "} + #{" + f3.d1Str(k) + "}{" + f3.d2Str(k) + "} = " +
                             "#{"+ f3. x1NewStr(k)+"}{"+f3. x2NewStr(k)+"}";

                               nextStep = step + 1;
                                totalPoints++;
                                break;
                        case 10:
                                c = "";
                                 cm = "";
                                c += "R{}";
                                c += "��������� ���������� ������� \u2225x^{" + (k + 1) +
                                        "} - x^{" + k + "}\u2225 = < \u03b5_{2}: ";
                                if (f.dxNorm() < f.eps2) {
                                        c += f.dxNormStr() +
                                                " < " + f.eps2Str() + ", " +
                                                "n{}������� �����������, ������ x^{*} = x^{" + (k + 1) +
                                                "} = (" + f.x1NewStr() + ", " + f.x2NewStr() +
                                                ")^{T} - ���������� ������� ����������� n{}� �������.";
                                       nextStep = -1;
                               }
                                else {
                                        c += f.dxNormStr() +
                                                " > " + f.eps2Str() + ",n{}" +
                                                "������� �� �����������, ��������� � ���������� ����.";
                                            nextStep = step + 1;
                                }

                                c += "r{}n{}��������� ���������� ������� \u2225x^{" + (k + 1) +
                                        "'} - x^{" + k + "'}\u2225 = < \u03b5_{2}: ";
                                if (f2.dxNorm() < f2.eps2) {
                                        c += f2.dxNormStr() +
                                                " < " + f2.eps2Str() + ",n{}" +
                                                "������� �����������, ������ r{}x^{*} = x^{" + (k+1) +
                                                "} = #{" + f2.x1New_rStr() + "}{" + f2.x2New_rStr() +
                                                "} e{}- ������� ����������� � �������, �������n{}�� 3 ��������.";
                                         }
                                else {
                                        c += f2.dxNormStr() +
                                                " > " + f2.eps2Str() + ",n{}" +
                                                "������� �� �����������, ��������� � ���������� ����.r{}";
                                              nextStep = step + 1;
                                }

                     cm+="� ������ ���������� �� ����������� ������� �� �������� ������������ n{}�����.";

                   break;
                   case 11:
                        c = "";
                        cm+= "";
                         c+= "R{}";

                                   cm+= " ��������� ���������� ������� f(x^{" + (k + 1) + "''}) < f(x^{" + k + "''}): n{}";
                                              if (f3.dFuncNorm_a() < f3.dFuncNorm_b())
                                           {
                                              cm+= "f(x^{" + (k + 1) + "''}) = " + f3.dFuncNormStr_a() + " < "+ f3.dFuncNormStr_b() + " = f(x^{" + k + "''}) "+".n{}"+
                                                " ������� �����������, ������� �������� k = k+1 = "+k+"+1 = "+(k+1)+" ,n{}\u03BC^{"+(k+1)+"} = \u03BC^{"+k+"}/2 = "+f3.Vektor[k]/2 +
                                                " � ��������� � ���� 4.";
                                               nextStep = step+1;
                                                f3.setx1x2(f3.x1New_m(k), f3.x2New_m(k));
                                                k++;
                                                }
                                               else {
                                                cm+= " f(x^{" + (k + 1) + "''}) = " +f3.dFuncNormStr_a() + " > "+ f3.dFuncNormStr_b() + " = f(x^{" +k + "''})"+".n{}" +
                                               " ������� �� �����������, ������� �������� n{}\u03BC^{"+k+"} = 2 * \u03BC^{"+k+"} = 2 * "+f3.Vektor[k]/2 +" = "+(2*f3.Vektor[k]/2)+
                                                " n{}� ��������� � ���� 6.";

                                                  // nextStep = step+1;
                                                       }
                                c += "r{}n{}��������� ���������� �������" +
                                        "\u2225f(x^{" + (k + 1) + "'}) - f(x^{" + k +
                                        "'})\u2225 < \u03b5_{2}: ";
                                if (f2.dFuncNorm() < f2.eps2) {
                                        c += f2.dFuncNormStr() + " < " + f2.eps2Str() +",������� �����������,������ n{}x^{*} = x_{" +
                                                (k + 1) +"} = #{" + f2.x1New_rStr() + "}{" + f2.x2New_rStr() +"}- ������� ����������� � �������.";

                                        nextStep = step+1;
                                }
                                else {
                                        c += f2.dFuncNormStr() + " > " + f2.eps2Str() +
                                                ", n{}������� �� �����������, ������� k = " + (k + 1) +
                                                " � ��������� � ���� 4.";
                                             //f2.setx1x2(f2.x1New_r(), f2.x2New_r());
                                           // k++;
                                           nextStep = step+1;
                                }
//nextStep = -1;
                      break;
  //////////////////////////////////////////////////////////////
case 12:
 // int kk;
//  kk = k;
 // k++;
 // k=kk;
  //f2.setx1x2(f2.x1New_r(), f2.x2New_r());
 f3.setx1x2(f3.x1New_m(k), f3.x2New_m(k));
           c = "";
           cm ="";
           if(k ==1 ){  c += "  �������� �������� � ����� x^{" + k + "}: \u2207f(x^{" + k +
            "}) = #{" + 0 + "}{" + 0 + "}";}

        cm += "  �������� �������� � ����� x^{" + k + "''}: \u2207f(x^{" + k +//r{}n{}
           "}) = #{" + f3.g1Str() + "}{" +f3.g2Str() + "}e{}";
         nextStep = step + 1;
            break;
           case 13:
              c = "";
              cm ="";
              cm +="  �������� ���������� �������� ��������� \u2225\u2207f(x^{" + k + "})\u2225 \u2264 \u03b5_{1}:n{}";
              if (f.gNorm() <= f.eps1) {
                  c += f.gNormStr() + " \u2264 " + f.eps1Str() +
                   ", ������� �����������, ������ r{}x^{*} = x^{" + (k + 1) +
                    "} = #{" + f.x1Str() + "}{" + f.x2Str() +
                     "}n{} - ������� �����������.";
                     nextStep = -1;
                     }
                     else {
                    // c += f.gNormStr() + " > " + f.eps1Str() +
                    // ", ������� �� �����������, ��������� � ���������� n{}����.";
                      nextStep = step + 1;
                      }
              if (f2.gNorm() <= f2.eps1) {
                c += f2.gNormStr() + " \u2264 " + f2.eps1Str() +
                 ", ������� �����������, ������ x^{**} = x^{" + (k) +
                 "'} = #{" + f.x1Str() + "}{" + f.x2Str() +
                 "}n{} - ������� �����������.";
                 nextStep = -1;
                 }
                  else {
                   c += f2.gNormStr() + " > " + f2.eps1Str() +
                    ", ������� �� �����������, ��������� � ���������� n{}����.r{}";
                    nextStep = step + 1;
                      }
         if (f3.gNorm() <= f3.eps1)
                     {
                     cm+=f3.gNormStr() + "\u2264 " + f3.eps1Str() +
                     ", ������� �����������, ������ x^{***} = x^{" + (k) +
                      "''} = "+"#{"+ f3. x1NewStr(k)+"}{"+f3. x2NewStr(k)+"}"+ " - n{}������� �����������.";
                      nextStep = -1;
                    }
                       else
                        {
                           cm+=f3.gNormStr() + " > " +f3.eps1Str() +
                            ", ������� �� �����������, ��������� � ���������� n{}����.r{}";;
                          nextStep = step + 1;
                        }
             break;
                    case 14:
                            c = "";
                            cm ="";
                            cm+="��������� ������� H(x^{" + k + "''}) = " + f3.hStr() + "n{}"+"n{}"+
                              "��������� ������� H(x^{" + k + "''})+\u03BC^{"+ k +"}*E = " + f3.h_plusStr(k);
                          nextStep = step + 1;
                     break;

                    case 15:
                            c = "";
                            cm ="";
                            cm += " ��������� �������� �������� �������: [H(x^{" + k +
                                   "''})+\u03BC^{"+ k +"}*E]^{-1}= " + f3.h_1_plusStr(k);

                          nextStep = step + 1;
                            break;
                    case 16:
                            c = "";
                            cm ="";
                            if(k != 0) c += "R{}";

                               cm+= "���������"+
                               "d_{" + k + "} = -[H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} \u2207f(x^{" + k + "}) = - " + f3.h_1_plusStr(k) + "#{" +
                               f3.g1Str() + "}{" + f3.g2Str() + "} = " + "#{" + f3.d1Str(k) + "}{" + f3.d2Str(k) + "}";

                           nextStep = step + 1;
                            break;
                    case 17:
                            c = "R{}������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                    k + "} = " +
                                    "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                    "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                    "#{" + f.x1NewStr() + "}{" + f.x2NewStr() + "}";

                         cm = "  ������� ����� x^{" + (k + 1) + "''} = x^{" + k + "''} + d^{" +
                          k + "} = " +
                         "#{" + f3.x1Str() + "}{" + f3.x2Str() + "} + #{" + f3.d1Str(k) + "}{" + f3.d2Str(k) + "} = " +
                         "#{"+ f3. x1NewStr(k)+"}{"+f3. x2NewStr(k)+"}";

                           nextStep = step + 1;
                            totalPoints++;
                            break;
                    case 18:
                            c = "";
                             cm = "";
                            c += "R{}";
                            c += "��������� ���������� ������� \u2225x^{" + (k + 1) +
                                    "} - x^{" + k + "}\u2225 = < \u03b5_{2}: ";
                            if (f.dxNorm() < f.eps2) {
                                    c += f.dxNormStr() +
                                            " < " + f.eps2Str() + ", " +
                                            "n{}������� �����������, ������ x^{*} = x^{" + (k + 1) +
                                            "} = (" + f.x1NewStr() + ", " + f.x2NewStr() +
                                            ")^{T} - ���������� ������� ����������� n{}� �������.";
                                   nextStep = -1;
                           }
                            else {
                                    c += f.dxNormStr() +
                                            " > " + f.eps2Str() + ",n{}" +
                                            "������� �� �����������, ��������� � ���������� ����.";
                                        nextStep = step + 1;
                            }


                 cm+="� ������ ���������� �� ����������� ������� �� �������� ������������ n{}�����.";

               break;
               case 19:
               //  int kkk=k;
                 //int kkkk;
                    c = "";
                    cm+= "";
                     c+= "R{}";
                     c += "��������� ���������� �������" +
                                    "|f(x^{" + (k + 1) + "}) - f(x^{" + k +
                                    "})| < \u03b5_{2}: ";
                            if (f.dFuncNorm() < f.eps2) {
                                    c += f.dFuncNormStr() + " < " + f.eps2Str() +
                                            ", ������� �����������, ������ n{}x^{*} = x^{" +
                                            (k + 1) +
                                            "} = #{" + f.x1NewStr() + "}{" + f.x2NewStr() +
                                            "} - ������� ����������� � �������.";

                                nextStep = -1;
                               }
                             else {
                                     c += f.dFuncNormStr() + " > " + f.eps2Str() +
                                            ", n{}������� �� �����������, ������� k = " + (k + 1) +
                                            " � ��������� � ���� 4.";
                                   nextStep = step+1;

                               }
                               cm+= " ��������� ���������� ������� f(x^{" + (k + 1) + "''}) < f(x^{" + k + "''}): n{}";
                                          if (f3.dFuncNorm_a() < f3.dFuncNorm_b())
                                       {
                                          cm+= "f(x^{" + (k + 1) + "''}) = " + f3.dFuncNormStr_a() + " < "+ f3.dFuncNormStr_b() + " = f(x^{" +k + "''}) "+".n{}"+
                                            " ������� �����������, ������� �������� k = k+1 = "+k+"+1 = "+(k+1)+" ,n{}\u03BC^{"+(k+1)+"} = \u03BC^{"+k+"}/2 = "+f3.Vektor[k]/2 +
                                            " � ��������� � ���� 4.";
                                         f3.setx1x2(f3.x1New_m(k), f3.x2New_m(k));
                                          nextStep = 12;
                                            k=k+1;

                                            }
                                           else {
                                            cm+= " f(x^{" + (k + 1) + "''}) = " +f3.dFuncNormStr_a() + " > "+ f3.dFuncNormStr_b() + " = f(x^{" +k + "''})"+".n{}" +
                                           " ������� �� �����������, ������� �������� n{}\u03BC^{"+k+"} = 2 * \u03BC^{"+k+"} = 2 * "+f3.Vektor[k]/2 +" = "+(2*f3.Vektor[k]/2)+
                                            " n{}� ��������� � ���� 6.";

                                               nextStep = step+1;
                                                   }

//nextStep = -1;
                  break;


                        default:
                                c = "����������� ����� �����!!";
                }
        }
        Image img1;
        public DrawPanels() {
                try {
                        jbInit();
                } catch (Exception ex) {
                        ex.printStackTrace();
                }
                Stringers.setPanel(this);
        }
        void jbInit() throws Exception {
                this.setBackground(ColorFon);
                this.setLayout(null);
        }
        protected void paintComponent(Graphics g) {
                owner.nextButton.setEnabled(cc < 300);//35
                owner.jButton1.setEnabled(cc > 0);
              //   int k;
                owner.nextButton.setEnabled(ccm < 300);//35
                owner.jButton1.setEnabled(ccm > 0);
                super.paintComponent(g);
                if(owner.resultBox.isSelected()) showResult(g);
                step = realsteps[cc];
                step = realsteps[ccm];
                Graphics2D g2d = (Graphics2D) g;
                g2d.translate(0, 25);
                Stringers.setGraphics(g);
                LevelLiness.setGraphics(g);
                LevelLines_prN.setGraphics(g);
               // LevelLiness_r.setGraphics(g);
                //paneli
if(cc <= 7) {
                g.setColor(ColorPanelFon);
                g.fillRect(xOff, yOff, xLen, yLen);
                g.fillRect(xOff+xLen+18, yOff, 141+30, 57);
                g.fillRect(xOff+xLen+18, yOff+57+20, 141+30, 127+20);
                g.fillRect(xOff+xLen+18, yOff+57+127+40+20, 141, 26);
                g.fillRect(xOff, yOff+yLen+20, xOff+xLen+18+141+70, 257);

                g.setColor(ColorPanelRamka);
                g.drawRect(xOff, yOff, xLen, yLen);
                g.drawRect(xOff+xLen+18, yOff, 141+30, 57);
                g.drawRect(xOff+xLen+18, yOff+57+20, 141+30, 127+20);
                g.drawRect(xOff+xLen+18, yOff+57+127+40+20, 141, 26);
                g.drawRect(xOff, yOff+yLen+20, xOff+xLen+18+141+70, 257);
}
        else {
                g.setColor(ColorPanelFon);
                g.fillRect(xOff, yOff, xLen, yLen);
                g.fillRect(xOff+xLen+18, yOff, 141+30, 57);
                g.fillRect(xOff+xLen+18, yOff+57+20, 141+30, 127+20);
                g.fillRect(xOff+xLen+18, yOff+57+127+40+20, 141, 26);
                g.fillRect(xOff, yOff+yLen+20, xOff+xLen+18+141+40+30, 76);
                g.fillRect(xOff, yOff+yLen+20+96, xOff+xLen+18+141+40+30, 76+40);
                //g.fillRect(xOff, yOff+yLen+20+192+40, xOff+xLen+18+141+40+30, 76);

                g.setColor(ColorPanelRamka);
                g.drawRect(xOff, yOff, xLen, yLen);
                g.drawRect(xOff+xLen+18, yOff, 141+30, 57);
                g.drawRect(xOff+xLen+18, yOff+57+20, 141+30, 127+20);
                g.drawRect(xOff+xLen+18, yOff+57+127+40+20, 141, 26);
                g.drawRect(xOff, yOff+yLen+20, xOff+xLen+18+141+40+30, 76);
                g.drawRect(xOff, yOff+yLen+20+96, xOff+xLen+18+141+40+30, 76+40);
               // g.drawRect(xOff, yOff+yLen+20+192+40, xOff+xLen+18+141+40+30, 76);
        }
        g2d.setClip(xOff, yOff, xLen, yLen);
                if(step != 0)drawAxes(g);
                g2d.setClip(null);
                g2d.setFont(FontSolutionNumber);
                g2d.setColor(ColorSolutionNumber);
                String ss = cs[cc];
                String ss2 = null;
               // String ss3 = null;
                String ss_3 = csm[ccm];
                int ind = ss.indexOf("r{}");
                if(ind != -1) {
                        ss2 = ss.substring(ind+3);

                        ss = ss.substring(0,ind);
                }
                Stringers.setFontSizes(14, 10, 8);
/////////////////////////////////reshenie
              //  if(cc>=9){   g2d.setColor(Color.magenta);
                   //                           g2d.fillOval(223,37, 5, 5);
                    //                          g2d.setColor(Color.magenta);
                    //                          g2d.drawLine(225,37, 142, 205);
                    //                          g2d.fillOval(140, 204, 5, 5);
                    //              }

                g.setColor(ColorSolutionText);
tt = 310;
if(cc<=7) {Stringers.drawString(ss, 50, 320);}
if(cc>12) {Stringers.drawString("", 50, 320);}
//if(step==2 || step==3  || step==4  || step==6 || step==7 || step==8 || step==9) tt=320;
//55
             //  if (cc==13) break;
               // double  p = f2.gNorm();
               //  p=0;
               //   g.setColor(Color.red);
                //                      Stringers.drawString("����������� � ������� x^{**} = x^{2'} = (0,003; 0,015)^{T} ������� n{}�� 2 ��������.", 50 , 300);
//;}

                tt_1 = 418;
                if(step==1  || step==10 ||step==5||step==11) tt_1=418;
                if(step==2 || step==3 || step==4 || step==6 || step==7 || step==8 || step==9) tt_1=418;
                 if(ccm>=6) Stringers.drawString( ss_3, 50,tt_1);//55
                  if(ccm>=93) { g.setColor(Color.red);
                  Stringers.drawString( ss_3, 50,418);}
                // if(ccm==6&&k==0)
                // {
                //  Stringers.drawString("��������� ������� H(x^{" + k + "''})+\u03BC^{"+ k +"}*E = " + f3.h_plusStr(k), 50,418);
                // }
                // if(ccm==7&&k==0)
                // {Stringers.drawString("��������� �������� �������� �������: [H(x^{" + k + "''})+\u03BC^{"+ k +"}*E]^{-1}= " + f3.h_1_plusStr(k), 50,418);
                // }

                g2d.setFont(FontSubTitle);
                g2d.setColor(ColorSubTitle);
                if(cc>7) {
                   g2d.drawString("����� �������-�������: ", xOff+5, yOff+yLen+20-3);
                  g2d.drawString("����� ����������: ", xOff+5, yOff+yLen+20+96-3);
                  // g2d.drawString("����� �������: ", xOff+5, yOff+yLen+20-3);
                  g2d.setColor(Color.magenta);
                  g2d.fillOval(190,yOff+yLen+10-3,8,8);
                 // g2d.setColor(Color.blue);
                 // g2d.fillOval(130,yOff+yLen+10-3,8,8);
                  g2d.setColor(Color.red);
                  g2d.fillOval(150,yOff+yLen+10-3+96,8,8);
                }
                else g2d.drawString("�������: ", xOff+5, yOff+yLen+20-3);
                if(ss2 != null) {
                        g.setColor(ColorSolutionText);
                        Stringers.drawString(ss2, 50, 300);//388
                        g2d.setFont(FontSubTitle);
                        g2d.setColor(ColorSubTitle);
                }
               //else if(cc>=13||ccm>=13){
                 if(cc>=12){ c= "  �������� ���������� �������� ��������� \u2225\u2207f(x^{" + k + "})\u2225 \u2264 \u03b5_{1}: "+
                                              "  0 "+ " \u2264 " + f2.eps1Str() +
                                               ", n{} ������� �����������, ������ x^{**} = x^{" + (k+1) +
                                               "'} = #{" + - 0.600199 + "}{" + - 0.400399 +
                                               "}e{} - ������� �����������.";


                      g.setColor(Color.magenta);
                       Stringers.drawString(c, 50 , 320);
                }



                g2d.setColor(ColorSolutionNumber);
                g2d.setFont(FontSolutionNumber);

                     if(cc<=7||cc>7){
                            g2d.drawString(steps[cc], 10, 310);
                          }

                  //  }
                         if (!steps[ccm].equals("3.12"))
                         { if(ccm > 7)   g2d.drawString(steps[ccm], 10,408);//408

                          }
                   if(ss2 != null)
                       {
                        if (!steps[cc].equals("3.12")){
                         if(step== 8 || step==10 || step==11 || step==5 ||(step==6 && k==2) || step==12|| cc<7||cc==94) g2d.drawString(steps[cc], 10, 310);//408
                         if(step== 9 ||step==4 ||step==6 || step==7|| cc<7) g2d.drawString(steps[cc], 10,310);//419

                         }
                         if(cc == 94){ Stringers.drawString("11.6", 10,310);}
                }
               // else if(cc>=21)g2d.drawString("2.6", 10, 550);
///////////////////////////////////////////////////////////////////////////////
                if(step != 0) {
                  for (int i = 0; i < nPoints; ++i) {
                     //   LevelLiness.drawLevelLine(x1[i], x2[i]);
                       // LevelLiness_r.drawLevelLine_r(x1_r[i], x2_r[i]);
                        LevelLines_prN.drawLevelLine_m(x1_m[i], x2_m[i]);
                }
               // LevelLiness.drawLevelLine(2.5, 0);
               // LevelLiness.drawLevelLine(4, 0);
                // LevelLines_prN.drawLevelLine_m(2, 0);
                 // LevelLiness_m.drawLevelLine_m(4, 0);
 ////////////////////////////////////////////////////////////////////////
                g2d.setClip(xOff, yOff, xLen, yLen);
               int x = 0, y = 0, x_1 = 0, y_1 = 0, xLast = -1, yLast = -1 ;

                x = xOff + xCen + (int) (0 * scale);
                y = yOff + yCen - (int) (0 * scale);
                g2d.fillOval(x - 2, y - 2, 5, 5);

                for (int i = 0; i < totalPoints; ++i) {
                    g2d.setColor(i == totalPoints - 1 ? Color.red : Color.red);
                     x = xOff + xCen + (int) (scale * x1_m[i]);
                     y = yOff + yCen - (int) (scale * x2_m[i]);
                     if(i==0)
                     { g2d.setColor(Color.red);
                      g2d.fillOval(x - 2, y - 2, 5, 5);}
                     if(i>0)
                    {
                      x_1 = xOff + xCen + (int) (scale * x1_m[i-1]);
                      y_1 = yOff + yCen - (int) (scale * x2_m[i-1]);
                     g2d.setColor(Color.red);
                     g2d.fillOval(x - 2, y - 2, 5, 5);
                     g2d.setColor(Color.red);
                     g2d.drawLine(x, y, x_1, y_1);
                      x_1 = x;
                      y_1 = y;
                     }

                        Stringers.drawString("x^{" + i + "''}", x+13, y + 6);
                        if (cc == count - 1&&i==11) {
                           Stringers.drawString("x^{***}=", x - 23, y - 1);
                       }
////////////////////////////////////////////////////////////////////////////////////////////////////
                       // for (int i = 0; i < totalPoints; ++i) {
                    //  public  int  x_r, y_r;
                           g2d.setColor(i == totalPoints - 1 ? Color.magenta : Color.magenta);
                             if(i==0) {   x_r = xOff + xCen + (int) (scale * x1[i]);
                                 y_r = yOff + yCen - (int) (scale * x2[i]);}
                              // x = xOff + xCen + (int) (scale * (0.013));
				//y = yOff + yCen - (int) (scale * (2.145));
                                if(i>0)
                           {
                                int xLast2 = xOff + xCen + (int) (scale * (-0.600199));
                                int yLast2 = yOff + yCen - (int) (scale * (-0.400399));
                                g2d.fillOval(x_r - 2, y_r - 2, 5, 5);
                                g2d.fillOval(xLast2-2, yLast2-2, 5, 5);
                                g2d.drawLine(x_r, y_r, xLast2, yLast2);
                                xLast2 = x_r;
                                yLast2 = y_r;

                           }
                             Stringers.drawString("x^{"+0+"'}", x_r-20 , y_r-3);
                             Stringers.drawString("x^{"+0+"'}", x_r-20 , y_r-3);
                           //  if (cc == count - 1) {
                          // Stringers.drawString("x^{**}=", x -20, y - 4);
                  //  }

////////////////////////////////////////////////////////////////////////////////
                        //g2d.setColor(i == totalPoints - 1 ? Color.blue : Color.blue);
                       // x = xOff + xCen + (int) (scale * x1[i]);
                       // y = yOff + yCen - (int) (scale * x2[i]);
                       // g2d.fillOval(x - 2, y - 2, 5, 5);


                       // if (i > 0) {
                         //       g2d.drawLine(x, y, xLast, yLast);

                       // }
                       // xLast = x;
                       // yLast = y;

                         //  Stringers.drawString("x^{" + i + "}", x - 6, y - 3);

                   }

          g2d.setClip(null);
                if (cc == count - 1) {
                    //    Stringers.drawString("x^{*}=", x - 26, y - 3);

                 }
 //////////////////////////////////////////////////////////////////////
}
                Stringers.setFontSizes(12, 10, 8);
                if(true) {
//velicini
                sc(g, new int[] {1} , 380, yOff + 5);
                Stringers.drawString("x^{0} = (" + f.normalize(x1[0]) + "; " + f.normalize(x2[0]) + ")^{T} ", xOff+xLen+18+5, yOff + 15 + 4-5);
                sc(g, new int[] {1, 5}, 380, yOff + 25);
                Stringers.drawString("\u03b5_{1} = " + f.eps1, xOff+xLen+18+5, yOff + 30 + 8 -10);
                sc(g, new int[] {1, 10, 11}, 380, yOff + 40);
                Stringers.drawString("\u03b5_{2} = " + f.eps2, xOff+xLen+18+5, yOff + 45 + 4 +7-15);
                Stringers.drawString("k \u2265  M = "+ M +" - ���.�����." , xOff+xLen+18+5, yOff + 45 + 4 +7);
                g2d.setColor(ColorSolutionText);
                Stringers.drawString("-���. �����", 443, yOff + 15 + 4-5);
                Stringers.drawString("-����� �����", 427, yOff + 75 / 2 + 9 -10);
                g2d.setColor(ColorSolutionText);
                sc(g, new int[] {9}, 380, yOff + 125 - 39);
                Stringers.drawString("x^{k+1} = x^{k} + t_{k}d^{k}", xOff+xLen+18+15, yOff + 125-30);
                sc(g, new int[] {8}, 380, yOff + 145 - 39);
                Stringers.drawString("d^{k} = -H^{-1}(x^{k})\u2207f(x^{k})", xOff+xLen+18+15, yOff + 145-30);
                Stringers.drawString("d^{k} = -[H(x^{k}) + \u03BC^{0} *E]^{-1}\u2207f(x^{k})", xOff+xLen+18+15, yOff + 215);
                sc(g, new int[] {8}, 380, yOff + 165 - 39);
                Stringers.drawString("f(x^{k}+t_{k}d^{k})\u2192min", xOff+xLen+18+15, yOff + 165-30);
                sc(g, new int[] {5}, 380, yOff + 185 - 39);
                Stringers.drawString("\u2225\u2207f(x^{k})\u2225 \u2264 \u03b5_{1}", xOff+xLen+18+15, yOff + 185-30);
                sc(g, new int[] {10}, 380, yOff + 205 - 39);
                Stringers.drawString("\u2225x^{k+1} - x^{k}\u2225 < \u03b5_{2}", xOff+xLen+18+15, yOff + 205-30);
                sc(g, new int[] {11}, 380, yOff + 225 - 39);
                Stringers.drawString("|f(x^{k+1}) - f(x^{k})| < \u03b5_{2}", xOff+xLen+18+15, yOff + 225-30);
                Stringers.setFontSizes(14, 10, 8);
        }
                g2d.setColor(ColorSolutionText);
                if(true) {
                g2d.setFont(FontSubTitle);
                g2d.setColor(ColorSubTitle);
                g2d.drawString("�������: ", xOff+xLen+18+5, yOff+57+20-3);
                g2d.drawString("����������� �����������: ", xOff + 4, yOff - 4);
                g2d.drawString("��������: ", xOff+xLen+18+5, yOff - 4);
                g2d.drawString("������: ", xOff - 1, -55);
                g2d.drawString("�������: ", xOff+xLen+18+5, yOff+57+127+40-3+20);
                g2d.setColor(Color.blue);
                g2d.setFont(FontSolutionText);
                String s;
                g2d.setColor(levelLinesColor);
                 //s = "����� ������� ������ f(x) = | x_{1} - sin x_{1}cos /{x_{1}}{2} | + | x_{2} - sin x_{2}cos /{x_{2}}{2} |";
                s = "����� ������� ������ f(x) = 8*(x_{1} + 0.6)^{4} + 12*(x_{2} + 0.4)^{4}";
                int xx = 200; //Stringers.drawString(s, 3, yLen-3);
                Stringers.drawString(s, 55, -55);
        }
                if(step == 0) {
                        g2d.drawImage(img1, xOff+1, yOff+1, this);
                }
                g2d.translate(0, -25);
              //  if (cc==30) showEndMsg(g);
               // if(owner.resultBox.isSelected()) showResult(g);
        }
        private void drawAxes(Graphics g) {
                int xc = xCen + xOff;
                int yc = yCen + yOff;
                int xe = xOff + xLen - 1;
                int ye = yOff + yLen - 1;
                g.setColor(ColorGraficXY);
                g.drawLine(xc, yOff, xc, ye);
                g.drawLine(xOff, yc, xe, yc);
                g.drawLine(xe, yc, xe - 4, yc - 2);
                g.drawLine(xe, yc, xe - 4, yc + 2);
                g.drawLine(xc, yOff, xc + 2, yOff + 4);
                g.drawLine(xc, yOff, xc - 2, yOff + 4);
                Stringers.setFontSizes(10, 8, 8);
                Stringers.drawString("x_{1}", xe - 15, yc - 7);
                Stringers.drawString("x_{2}", xc + 5, yOff + 10);
                double dx = scale;
                int j = 1;
                wasArrow = false;
                g.drawString("0", xc - 7, yc - 15);
                for (int x = xc + (int) scale; x < xe - 20; x += scale, j++) {
                        g.drawString("" + j, x - 5, yc - 15);
                        g.drawLine(x, yc - 3, x, yc + 3);
                }
                j = -1;
                for (int x = xc - (int) scale; x > xOff; x -= scale, j--) {
                        g.drawString("" + j, x - 5, yc - 15);
                        g.drawLine(x, yc - 3, x, yc + 3);
                }
                j = -1;
                for (int y = yc + (int) scale; y < ye; y += scale, j--) {
                        g.drawString("" + j, xc - 10, y - 3);
                        g.drawLine(xc - 3, y, xc + 3, y);
                }
                j = 1;
                for (int y = yc - (int) scale; y > yOff + 20; y -= scale, j++) {
                        g.drawString("" + j, xc - 11, y - 3);
                        g.drawLine(xc - 3, y, xc + 3, y);
                }
        }
        static boolean wasArrow;
        public void sc(Graphics g, int[] s, int x, int y) {
                g.setColor(ColorSolutionText);
                for (int i = 0; i < s.length; ++i) {
                        if (step != s[i]) {
                                continue;
                        }
                        g.setColor(Color.red);
                        y += 5;
                        strelka(g, x, y);
                        return;
                }
                wasArrow=false;
        }
        public void strelka(Graphics g, int x, int y) {
                if (wasArrow) {
                        return;
                }
                wasArrow = true;
                x = x - 25;
                y = y - 25;
                g.setColor(Color.red);
                g.drawLine(x, y, x + 19, y + 19);
                g.drawLine(x, y + 1, x + 19, y + 20);
                ///-----1------
                g.drawLine(x + 10, y + 20, x + 19, y + 20);
                g.drawLine(x + 12, y + 19, x + 19, y + 19);
                g.drawLine(x + 14, y + 18, x + 19, y + 18);
                ///-----2------
                g.drawLine(x + 19, y + 10, x + 19, y + 20);
                g.drawLine(x + 18, y + 12, x + 18, y + 20);
                g.drawLine(x + 17, y + 15, x + 17, y + 20);
        }
}
