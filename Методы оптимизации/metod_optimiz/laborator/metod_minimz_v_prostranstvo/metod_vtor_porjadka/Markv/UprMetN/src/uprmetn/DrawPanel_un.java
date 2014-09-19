package uprmetn;
/**
 * <p>Title: ����� ����������</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * <p>Company: </p>
 * @author sashka_drakon@mail.ru
 * @version 11.0
 */

import java.awt.*;
import javax.swing.*;
import java.text.*;

public class DrawPanel_un extends JPanel {
        Color ColorFon = new Color(247,247,255);//���� ����
  //������:
    Color ColorPanelFon = new Color(255,255,255);//���� ����
    Color ColorPanelRamka = new Color(157,187,255);//���� ����������
  //������� (����. "����������� �����������", "�������", "������" � �.�.):
    Color ColorSubTitle = new Color(180,0,60);//����
    Font FontSubTitle= new java.awt.Font("Dialog", 3, 12);//�����
  //���� "�������":
    Color ColorSolutionText = new Color(0,0,80);//���� ������
    Font FontSolutionText= new java.awt.Font("Dialog", 1, 14);//����� ������
    Color ColorSolutionNumber = new Color(180,0,60);//���� ������ ����
    Font FontSolutionNumber = new java.awt.Font("Dialog", 3, 16);//����� ������ ����
  //���� "����������� �����������":
    Color ColorGraficXY = new Color(50,50,50);//���� ������� ���������
    Font FontGraficXY= new java.awt.Font("Dialog", 1, 10);//����� �������� ������� �� ������� ��������
    Font FontGraficText= new java.awt.Font("Dialog", 1, 12);//����� ������
//////////////////
        public static int xOff = 1, yOff = -10, xLen = 340, yLen = 330;//270
        public static int xCen = 60, yCen = 240;
        public static double scale = 50;

      /*  static double[] x1s = {	0.0, -0.6, 0.8, -0.5, -0.5, 0.2, 0.2, 0.1, 0.3, -0.3, -0.6, 0.8};
       static double[] x2s = {	0.8, -0.8, 0.6, 0.3, 0.3, 0.2, -0.2, 0.1, 0.1, 0.1, -0.8, -0.6};
       static double[] scales = {140, 130, 150,150,150,150,150,150,150,180,150,150};
       static int xCens[] = {220, 170,40, 220,220, 220, 220, 250, 250, 240, 175, 150};
       static int yCens[] = {150, 30,150, 130,130, 60, 170, 100, 110, 90, 40, 120};
       static double[] aArr = {8,  8, 10, 5, 8,3, 15, 10, 12, 14, 9, 13};
       static double[] bArr = {0.6, -2.0/5,-0.5, 0.1,-0.2, 0.1, 0.1, 0.3, 0.3, 0.4, -0.5, 0.4};
       static double[] cArr = {12,  6, 4, 8, 3,20, 4, 10, 8, 15, 5, 10};
       static double[] dArr = {0.4, 0.6,0.5, 0.1, -0.1, 0.6, -0.6, 0.3, 0.4, 0.1, 0.7, 0.5};*/
     static double[] x1s = {0.9, -0.6, 0.8, -0.5, -0.5, 0.2, 0.2, 0.1, 0.3, -0.3, -0.6, 0.8};
        static double[] x2s = {0.75, -0.8, 0.6, 0.3, 0.3, 0.2, -0.2, 0.1, 0.1, 0.1, -0.8, -0.6};
        static double[] scales = {130, 130, 150,150,150,150,150,150,150,180,150,150};
        static int xCens[] = {150, 170,40, 220,220, 220, 220, 250, 250, 240, 175, 150};
        static int yCens[] = {120, 30,150, 130,130, 60, 170, 100, 110, 90, 40, 120};
        static double[] aArr = {10,  8, 10, 5, 8,3, 15, 10, 12, 14, 9, 13};
        static double[] bArr = {0.5, -2.0/5,-0.5, 0.1,-0.2, 0.1, 0.1, 0.3, 0.3, 0.4, -0.5, 0.4};
        static double[] cArr = {10,  6, 4, 8, 3,20, 4, 10, 8, 15, 5, 10};
        static double[] dArr = {0.5, 0.6,0.5, 0.1, -0.1, 0.6, -0.6, 0.3, 0.4, 0.1, 0.7, 0.5};
        public double m = 1000;
        public static  int M=20;

     public double[] Vektor = {1000,  500, 250, 125, 62.5,31.25, 15.625, 7.8125, 3.90625, 1.953125, 0.9765625, 0.48828125, 0.244140625, 0.1220703125 , 0.06103515625, 0.030517578125, 0.0152587890625, 0.00762939453125, 0.003814697265625, 0.0019073486328125, 0.00095367431640625, 0.000476837158203125, 0.0002384185791015625, 0.00011920928955078125 ,0.000059604644775390625, 0.0000298023223876953125 ,0.00001490116119384765625 ,0.000007450580596923828125, 0.0000037252902984619140625 ,0.00000186264514923095703125 , 0.000000931322574615478515625};
      // public double[] Vektor = {100,  50, 25, 12.5, 6.25,3.125, 1.5625, 0.78125, 0.390625, 0.1953125, 0.09765625, 0.048828125, 0.0244140625, 0.01220703125 , 0.006103515625, 0.0030517578125, 0.00152587890625, 0.000762939453125, 0.0003814697265625, 0.00019073486328125, 0.000095367431640625, 0.0000476837158203125, 0.00002384185791015625, 0.000011920928955078125 ,0.0000059604644775390625, 0.00000298023223876953125 ,0.000001490116119384765625 ,0.0000007450580596923828125, 0.00000037252902984619140625 ,0.000000186264514923095703125 , 0.0000000931322574615478515625};

///////////////////////// begin ///////////////////////////////////
        static int variantCounter;
        static int variantList[] = new int[12];//12
///////////////////////// end ///////////////////////////////////
        static int variant;
        static boolean showresult=false;

        public static QuadFunc_un f=new QuadFunc_un(1,0,1,0);
        public static int step ,k;

        public static int slozhnost;
        public static int nextStep;
        public static int nPoints, totalPoints;
        public static String c = "kakaja-to nadpis";
       // public static String b = "lopata";
        public static double xEnd, yEnd;

        public static double[] x1 = new double[260];
        public static double[] x2 = new double[260];

///////////////////////// begin ///////////////////////////////////
        public static void generateVariantList() {
          int tm, i, j, fl;
          for (i = 0; i < 12; i++) {
            while (true) {
              tm = (int) (12 * Math.random());
              fl = 0;
              for (j = 0; j < i; j++) {
                if (variantList[j] == tm) { fl = 1; break; }
              }
              if (fl == 0) { variantList[i] = tm; break; }
            }
          }
        }

        public static void nextVariant() {
          if (variantCounter < 11) {
            variantCounter++;
          } else {
            variantCounter = 0;
            generateVariantList();
          }
          setFunc(variantList[variantCounter]);
        }

        public static void reset() {
          k = 0; step = 0;
        }
///////////////////////// end ///////////////////////////////////

        public static void setFunc(int v) {
                variant = v;
                xCen = xCens[v];
                yCen = yCens[v];

                xEnd = -bArr[v];
                yEnd = -dArr[v];

                step = 0;
                k = 0;
                x1[0] = x1s[v];
                x2[0] = x2s[v];
                f = new QuadFunc_un(aArr[v], bArr[v], cArr[v], dArr[v]);
                f.setx1x2(x1[0], x2[0]);
                nPoints = 1;
                while (step != -1) {
                        go();
                        if (step == 12 ||step == 21 ||step == 30 ||step == 39||step == 48 ||step == 57||
                            step == 66 ||step == 75 ||step == 84 ||step == 93||step == 102 ||step == 111||
                            step == 120 ||step == 129 ||step == 138 ||step == 147||step == 156 ||step == 165||
                            step == 174 ||step == 183 ||step == 192 ||step == 201||step == 210 ||step == 219||
                            step == 228 ||step == 237 ||step == 246 ||step == 255||step == 264 ||step == 273||
                            step == 282 ||step == 291 ||step == 300 ||step == 309 )
 {
                                x1[nPoints] = f.x1New(k);
                                x2[nPoints] = f.x2New(k);
                                nPoints++;
                        }
                        step = nextStep;
                }
                step = 0;
                k = 0;
		//f.setx1x2( x1s[v], x1s[v]);
                f.setx1x2(x1[0], x2[0]);
                totalPoints = 1;
                go();

                setScale(scales[v]);
                Stringer_un.numCalcChoice = 0;
                Stringer_un.numCalcMist = 0;
                Stringer_un._numCalcChoice = 0;
                Stringer_un._numCalcMist = 0;
                Stringer_un.canGo = true;
        for(int i = 0; i < 20; ++i) {
                          Stringer_un.mist_calc[i] = 0;
                          Stringer_un.mist_under[i] = 0;
                  }
        }
        public static void moveCenter(int sx, int sy) {
                xCen += sx;
                yCen += sy;
                LevelLines_un.init(f, xOff, yOff, xLen, yLen, scale, xCen, yCen,
                                                new Color(100, 100, 150));
        }
        public static void setScale(double sc) {
                scale = sc;
                LevelLines_un.init(f, xOff, yOff, xLen, yLen, scale, xCen, yCen,
                                                new Color(100, 100, 150));
        }





/////////////////////////////////////////////////////////////////////////////
        public static void go() {
                switch (step) {



                  case 0:
                                c = "n{}";
                                c += "��� ������� �� ������ \"��������\" ���������� ����� ��������n{}"+
                                    "������� (�������� ������������).";
                                nextStep = step + 1;
                                break;
                      case 1:

                                c = "  ����� x^{0} = (" + f.x1Str() + "; " + f.x2Str() +"), \u03b5_{1} = " + f.eps1Str()+" > 0 ,"  +
                                  " \u03BC^{0} = "+f.Vektor[k]+",n{} M =" +M+" - ����������  ����� "+
                                    " ��������. "+
                                    "n{}������ ����� ������ ������� f(x). " ;
                           nextStep = step + 1;

                                break;
                        case 2:
                                c = "������ �������� \u2207f(x) = " + f.gradientStr() + "" +
                                "n{}n{}";
                                nextStep = step + 1;
                                break;
                        case 3:
                                c = "������ ������� �����: n{}H(x) = #{f_{x_{1}x_{1}}}{f_{x_{1}x_{2}}}{f_{x_{2}x_{1}}}{f_{x_{2}x_{2}}} = " +
                                     f.gesseStr() + "";
                                nextStep = step + 1;
                                break;
                        case 4:
                               c = "  �������� k = "+k+", \u03BC^{k} = \u03BC^{"+k+"} = "+f.Vektor[k]+"";
                                 nextStep = step + 1;
                                    break;

                        case 5:
                           c = "�������� �������� � ����� x^{" + k + "}: \u2207f(x^{" + k + "}) = #{" + f.g1Str() + "}{" +
                                        f.g2Str() + "}";
                                nextStep = step + 1;
                                break;
                        case 6:
                                c = "��������  �������� ���������: \u2225\u2207f(x^{" +
                                     k + "})\u2225 \u2264 \u03b5_{1}; ";
                                if (f.gNorm() <= f.eps1) {
                                        c += f.gNormStr() + " \u2264 " + f.eps1Str() + ",n{} ������� �����������, n{}"+
                                       // nextStep = 7;
                                        " ������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +"}e{} - n{}������� ����������� � �������.";
                                 nextStep =-1;

                                }
                                else {
                                      if (slozhnost >= 1) {
                                        c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������. n{}����� ������� %{��������� � ���������� ����}{������� �������} n{}!{choice}{1}";
                                      } else {
                                        c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������, �� ��������� � ���������� ����";
                                      }
                                        nextStep = step + 1;
                                }
                                break;
                        case 7:
                             if ( k < M )
                             { c = " �������� ���������� ������� k \u2265 M: k= " + k + " < "+"M = "+ M +"n{}" +
                                " ������� �� �����������, ������ ��������� � ���������� ����.";

                               nextStep = step + 1;
                             }
                             else

                             {   c= " �������� ���������� ������� k \u2265 M: k = " + k + " \u2265 "+ M +" = M  " +"n{}"+
                                 " ������� �����������,n{}������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +
                                   "}e{} - n{}������� ����������� � �������.";
                                   nextStep =-1;

                               }
                            break;



                        case 8:
                                c = "��������� ������� H(x^{" + k + "}) = " + f.hStr() + "";
                                nextStep = step + 1;
                                break;
                        case 9:

                              c = "  ��������� ������� H(x^{" + k + "})+\u03BC^{"+ k +"}*E = " +f.h_plusStr(k);
                                nextStep = step + 1;
                                break;
                      case 10:
                               c = "  ��������� �������� �������� ������� : n{}"+
                                 " [H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} = " + f.h_1_plusStr(k);
                               nextStep = step + 1;
                               break;

                    case 11:
                               c = " ������ ���������: n{}"+
                                   "d_{" + k + "} = -[H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} \u2207f(x^{" + k + "}) = - " + f.h_1_plusStr(k) + "#{" +
                                   f.g1Str() + "}{" + f.g2Str() + "} = " + "#{" + f.d1Str() + "}{" + f.d2Str() + "}";

                               nextStep = step + 1;
                     break;


                       case 12:
                        if (slozhnost >= 3) {
                         c = "������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                        k + "} = " +
                                        "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                        "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                        "#{?{0}}{?{1}} n{}!{field}{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}"+
                                        "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                        ;
                           } else {
                            c = "������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                        k + "} = " +
                                        "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                        "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                        "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                            }
                             nextStep = step + 1;
                              totalPoints++;
                              break;
                    case 13:

                     if (f.dFuncNorm_a() < f.dFuncNorm_b()) {
                       c = "  ��������� ���������� ������� f(x^{" + (k + 1) + "}) < f(x^{" + k + "}): n{}"+
                        "  f(x^{" + (k + 1) + "}) = " + f.dFuncNormStr_a() + " < "+ f.dFuncNormStr_b() + " = f(x^{" + k + "}) "+".n{}"+
                       " ������� �����������, ������� �������� k = k+1 = "+k+"+1 = "+(k+1)+" ,n{}\u03BC^{"+(k+1)+"} = \u03BC^{"+k+"}/2 = "+f.Vektor[k]/2 +
                       " � ��������� � ���� 5.";
                   // " n{}������ ������� �� �������� %{�������� �������� �������}{�������� ������������ �����} n{}!{choice}{1}";
                     //f.setx1x2(f.x1New(k), f.x2New(k));
                     // nextStep = 5;
                    // k++;

                    nextStep = step +1;

                      }
                       else {
                     c = "  f(x^{" + (k + 1) + "}) = " +f.dFuncNormStr_a() + " > "+ f.dFuncNormStr_b() + " = f(x^{" + k + "})"+".n{}" +
                   " ������� �� �����������, ������� �������� n{}\u03BC^{"+k+"} = 2 * \u03BC^{"+k+"} = 2 * "+f.Vektor[k]/2 +" = "+(2*f.Vektor[k]/2)+
                  " n{}� ��������� � ���� 9.";
                //f.setx1x2(f.x1New(k), f.x2New(k));
                 nextStep = step +1;//nextStep = -1;
               //  k++;
                // nextStep = step +1;
                // nextStep = 9;

                  }
//nextStep = -1;
                  break;

  // 2         //////////////////////////////////////////////////////////


                 case 14:
                   k++;
                    f.setx1x2(f.x1New(k), f.x2New(k));

                    c = "�������� �������� � ����� x^{" + k + "}: \u2207f(x^{" + k + "}) = #{" + f.g1Str() + "}{" +
                                 f.g2Str() + "}";
                         nextStep = step + 1;
                         break;
                 case 15:
                         c = "��������  �������� ���������: \u2225\u2207f(x^{" +
                              k + "})\u2225 \u2264 \u03b5_{1}; ";
                         if (f.gNorm() <= f.eps1) {
                                 c += f.gNormStr() + " \u2264 " + f.eps1Str() + ",n{} ������� �����������,"+
                                 " ������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +"}e{} - n{}������� ����������� � �������.";
                                 nextStep =-1;
                         }
                         else {
                               if (slozhnost >= 1) {
                                 c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������. n{}����� ������� %{��������� � ���������� ����}{������� �������} n{}!{choice}{1}";
                               } else {
                                 c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������, �� ��������� � ���������� ����";
                               }
                                 nextStep = step + 1;
                         }
                         break;
                 case 16:
                      if ( k < M )
                      { c = " �������� ���������� ������� k \u2265 M: k= " + k + " < "+"M = "+ M +"n{}" +
                         " ������� �� �����������, ������ ��������� � ���������� ����.";

                        nextStep = step + 1;
                      }
                      else

                      {   c= " �������� ���������� ������� k \u2265 M: k = " + k + " \u2265 "+ M +" = M  " +"n{}"+
                          " ������� �����������,n{}������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +
                            "}e{} - n{}������� ����������� � �������.";
                            nextStep =-1;

                        }
                     break;



                 case 17:
                         c = "��������� ������� H(x^{" + k + "}) = " + f.hStr() + "";
                         nextStep = step + 1;
                         break;
                 case 18:

                       c = "  ��������� ������� H(x^{" + k + "})+\u03BC^{"+ k +"}*E = " +f.h_plusStr(k);
                         nextStep = step + 1;
                         break;
               case 19:
                        c = "  ��������� �������� �������� ������� : n{}"+
                          " [H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} = " + f.h_1_plusStr(k);
                        nextStep = step + 1;
                        break;

             case 20:
                        c = " ������ ���������: n{}"+
                            "d_{" + k + "} = -[H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} \u2207f(x^{" + k + "}) = - " + f.h_1_plusStr(k) + "#{" +
                            f.g1Str() + "}{" + f.g2Str() + "} = " + "#{" + f.d1Str() + "}{" + f.d2Str() + "}";

                        nextStep = step + 1;
              break;


                case 21:
                 if (slozhnost >= 3) {
                  c = "������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                 k + "} = " +
                                 "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                 "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                 "#{?{0}}{?{1}} n{}!{field}{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}"+
                                 "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                 ;
                    } else {
                     c = "������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                 k + "} = " +
                                 "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                 "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                 "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                     }
                      nextStep = step + 1;
                       totalPoints++;
                       break;
             case 22:

              if (f.dFuncNorm_a() < f.dFuncNorm_b()) {
                c = "  ��������� ���������� ������� f(x^{" + (k + 1) + "}) < f(x^{" + k + "}): n{}"+
                 "  f(x^{" + (k + 1) + "}) = " + f.dFuncNormStr_a() + " < "+ f.dFuncNormStr_b() + " = f(x^{" + k + "}) "+".n{}"+
                " ������� �����������, ������� �������� k = k+1 = "+k+"+1 = "+(k+1)+" ,n{}\u03BC^{"+(k+1)+"} = \u03BC^{"+k+"}/2 = "+f.Vektor[k]/2 +
                " n{}� ��������� � ���� 5.";
            //  f.setx1x2(f.x1New(k), f.x2New(k));
              // nextStep = 5;
             nextStep = step +1;

               }
                else {
              c = "  f(x^{" + (k + 1) + "}) = " +f.dFuncNormStr_a() + " > "+ f.dFuncNormStr_b() + " = f(x^{" + k + "})"+".n{}" +
             " ������� �� �����������, ������� �������� n{}\u03BC^{"+k+"} = 2 * \u03BC^{"+k+"} = 2 * "+f.Vektor[k]/2 +" = "+(2*f.Vektor[k]/2)+
           " n{}� ��������� � ���� 9.";
         //f.setx1x2(f.x1New(), f.x2New());
         // nextStep = 9;
             nextStep = step +1;
           //nextStep = 9;

           }
//nextStep = -1;
           break;
//////    3     /////////////////////////////////////////////////////////////////
        case 23:
                    k++;
                    f.setx1x2(f.x1New(k), f.x2New(k));

                      c = "�������� �������� � ����� x^{" + k + "}: \u2207f(x^{" + k + "}) = #{" + f.g1Str() + "}{" +
                                   f.g2Str() + "}";
                           nextStep = step + 1;
                           break;
                   case 24:
                           c = "��������  �������� ���������: \u2225\u2207f(x^{" +
                                k + "})\u2225 \u2264 \u03b5_{1}; ";
                           if (f.gNorm() <= f.eps1) {
                                   c += f.gNormStr() + " \u2264 " + f.eps1Str() + ",n{} ������� �����������, "+
                                   " ������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +"}e{} - n{}������� ����������� � �������.";
                                 nextStep =-1;
                           }
                           else {
                                 if (slozhnost >= 1) {
                                   c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������. n{}����� ������� %{��������� � ���������� ����}{������� �������} n{}!{choice}{1}";
                                 } else {
                                   c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������, �� ��������� � ���������� ����";
                                 }
                                   nextStep = step + 1;
                           }
                           break;
                   case 25:
                        if ( k < M )
                        { c = " �������� ���������� ������� k \u2265 M: k= " + k + " < "+"M = "+ M +"n{}" +
                           " ������� �� �����������, ������ ��������� � ���������� ����.";

                          nextStep = step + 1;
                        }
                        else

                        {   c= " �������� ���������� ������� k \u2265 M: k = " + k + " \u2265 "+ M +" = M  " +"n{}"+
                            " ������� �����������,n{}������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +
                              "}e{} - n{}������� ����������� � �������.";
                              nextStep =-1;

                          }
                       break;



                   case 26:
                           c = "��������� ������� H(x^{" + k + "}) = " + f.hStr() + "";
                           nextStep = step + 1;
                           break;
                   case 27:

                         c = "  ��������� ������� H(x^{" + k + "})+\u03BC^{"+ k +"}*E = " +f.h_plusStr(k);
                           nextStep = step + 1;
                           break;
                 case 28:
                          c = "  ��������� �������� �������� ������� : n{}"+
                            " [H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} = " + f.h_1_plusStr(k);
                          nextStep = step + 1;
                          break;

               case 29:
                          c = " ������ ���������: n{}"+
                              "d_{" + k + "} = -[H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} \u2207f(x^{" + k + "}) = - " + f.h_1_plusStr(k) + "#{" +
                              f.g1Str() + "}{" + f.g2Str() + "} = " + "#{" + f.d1Str() + "}{" + f.d2Str() + "}";

                          nextStep = step + 1;
                break;


                  case 30:
                   if (slozhnost >= 3) {
                    c = "������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                   k + "} = " +
                                   "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                   "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                   "#{?{0}}{?{1}} n{}!{field}{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}"+
                                   "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                   ;
                      } else {
                       c = "������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                   k + "} = " +
                                   "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                   "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                   "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                       }
                        nextStep = step + 1;
                         totalPoints++;
                         break;
               case 31:

                if (f.dFuncNorm_a() < f.dFuncNorm_b()) {
                  c = "  ��������� ���������� ������� f(x^{" + (k + 1) + "}) < f(x^{" + k + "}): n{}"+
                   "  f(x^{" + (k + 1) + "}) = " + f.dFuncNormStr_a() + " < "+ f.dFuncNormStr_b() + " = f(x^{" + k + "}) "+".n{}"+
                  " ������� �����������, ������� �������� k = k+1 = "+k+"+1 = "+(k+1)+" ,n{}\u03BC^{"+(k+1)+"} = \u03BC^{"+k+"}/2 = "+f.Vektor[k]/2 +
                  " n{}� ��������� � ���� 5.";
               // f.setx1x2(f.x1New(k), f.x2New(k));
                // nextStep = 5;
               nextStep = step +1;

                 }
                  else {
                c = "  f(x^{" + (k + 1) + "}) = " +f.dFuncNormStr_a() + " > "+ f.dFuncNormStr_b() + " = f(x^{" + k + "})"+".n{}" +
               " ������� �� �����������, ������� �������� n{}\u03BC^{"+k+"} = 2 * \u03BC^{"+k+"} = 2 * "+f.Vektor[k]/2 +" = "+(2*f.Vektor[k]/2)+
             " n{}� ��������� � ���� 9.";
           //f.setx1x2(f.x1New(), f.x2New());
           // nextStep = 9;
                 nextStep = step +1;
            // nextStep = 9;

             }
//  nextStep = -1;
             break;
     //////    4     /////////////////////////////////////////////////////////////////
              case 32:
                    k++;
                    f.setx1x2(f.x1New(k), f.x2New(k));
                           c = "�������� �������� � ����� x^{" + k + "}: \u2207f(x^{" + k + "}) = #{" + f.g1Str() + "}{" +
                                        f.g2Str() + "}";
                                nextStep = step + 1;
                                break;
                        case 33:
                                c = "��������  �������� ���������: \u2225\u2207f(x^{" +
                                     k + "})\u2225 \u2264 \u03b5_{1}; ";
                                if (f.gNorm() <= f.eps1) {
                                        c += f.gNormStr() + " \u2264 " + f.eps1Str() + ",n{} ������� �����������, "+
                                        " ������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +"}e{} - n{}������� ����������� � �������.";
                                      nextStep =-1;
                                }
                                else {
                                      if (slozhnost >= 1) {
                                        c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������. n{}����� ������� %{��������� � ���������� ����}{������� �������} n{}!{choice}{1}";
                                      } else {
                                        c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������, �� ��������� � ���������� ����";
                                      }
                                        nextStep = step + 1;
                                }
                                break;
                        case 34:
                             if ( k < M )
                             { c = " �������� ���������� ������� k \u2265 M: k= " + k + " < "+"M = "+ M +"n{}" +
                                " ������� �� �����������, ������ ��������� � ���������� ����.";

                               nextStep = step + 1;
                             }
                             else

                             {   c= " �������� ���������� ������� k \u2265 M: k = " + k + " \u2265 "+ M +" = M  " +"n{}"+
                                 " ������� �����������,n{}������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +
                                   "}e{} - n{}������� ����������� � �������.";
                                   nextStep =-1;

                               }
                            break;



                        case 35:
                                c = "��������� ������� H(x^{" + k + "}) = " + f.hStr() + "";
                                nextStep = step + 1;
                                break;
                        case 36:

                              c = "  ��������� ������� H(x^{" + k + "})+\u03BC^{"+ k +"}*E = " +f.h_plusStr(k);
                                nextStep = step + 1;
                                break;
                      case 37:
                               c = "  ��������� �������� �������� ������� : n{}"+
                                 " [H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} = " + f.h_1_plusStr(k);
                               nextStep = step + 1;
                               break;

                    case 38:
                               c = " ������ ���������: n{}"+
                                   "d_{" + k + "} = -[H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} \u2207f(x^{" + k + "}) = - " + f.h_1_plusStr(k) + "#{" +
                                   f.g1Str() + "}{" + f.g2Str() + "} = " + "#{" + f.d1Str() + "}{" + f.d2Str() + "}";

                               nextStep = step + 1;
                     break;


                       case 39:
                        if (slozhnost >= 3) {
                         c = "������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                        k + "} = " +
                                        "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                        "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                        "#{?{0}}{?{1}} n{}!{field}{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}"+
                                        "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                        ;
                           } else {
                            c = "������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                        k + "} = " +
                                        "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                        "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                        "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                            }
                             nextStep = step + 1;
                              totalPoints++;
                              break;
                    case 40:

                     if (f.dFuncNorm_a() < f.dFuncNorm_b()) {
                       c = "  ��������� ���������� ������� f(x^{" + (k + 1) + "}) < f(x^{" + k + "}): n{}"+
                        "  f(x^{" + (k + 1) + "}) = " + f.dFuncNormStr_a() + " < "+ f.dFuncNormStr_b() + " = f(x^{" + k + "}) "+".n{}"+
                       " ������� �����������, ������� �������� k = k+1 = "+k+"+1 = "+(k+1)+" ,n{}\u03BC^{"+(k+1)+"} = \u03BC^{"+k+"}/2 = "+f.Vektor[k]/2 +
                       " n{}� ��������� � ���� 5.";
                    // f.setx1x2(f.x1New(k), f.x2New(k));
                     // nextStep = 5;
                    nextStep = step +1;

                      }
                       else {
                     c = "  f(x^{" + (k + 1) + "}) = " +f.dFuncNormStr_a() + " > "+ f.dFuncNormStr_b() + " = f(x^{" + k + "})"+".n{}" +
                    " ������� �� �����������, ������� �������� n{}\u03BC^{"+k+"} = 2 * \u03BC^{"+k+"} = 2 * "+f.Vektor[k]/2 +" = "+(2*f.Vektor[k]/2)+
                  " n{}� ��������� � ���� 9.";
                //f.setx1x2(f.x1New(), f.x2New());
                // nextStep = 9;
                      nextStep = step +1;
                 // nextStep = 9;

                  }
// nextStep = -1;
                  break;
          //////    6     /////////////////////////////////////////////////////////////////
                   case 41:
                     k++;
                    f.setx1x2(f.x1New(k), f.x2New(k));
                                c = "�������� �������� � ����� x^{" + k + "}: \u2207f(x^{" + k + "}) = #{" + f.g1Str() + "}{" +
                                             f.g2Str() + "}";
                                     nextStep = step + 1;
                                     break;
                             case 42:
                                     c = "��������  �������� ���������: \u2225\u2207f(x^{" +
                                          k + "})\u2225 \u2264 \u03b5_{1}; ";
                                     if (f.gNorm() <= f.eps1) {
                                             c += f.gNormStr() + " \u2264 " + f.eps1Str() + ",n{} ������� �����������, "+
                                             " ������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +"}e{} - n{}������� ����������� � �������.";
                                           nextStep =-1;
                                     }
                                     else {
                                           if (slozhnost >= 1) {
                                             c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������. n{}����� ������� %{��������� � ���������� ����}{������� �������} n{}!{choice}{1}";
                                           } else {
                                             c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������, �� ��������� � ���������� ����";
                                           }
                                             nextStep = step + 1;
                                     }
                                     break;
                             case 43:
                                  if ( k < M )
                                  { c = " �������� ���������� ������� k \u2265 M: k= " + k + " < "+"M = "+ M +"n{}" +
                                     " ������� �� �����������, ������ ��������� � ���������� ����.";

                                    nextStep = step + 1;
                                  }
                                  else

                                  {   c= " �������� ���������� ������� k \u2265 M: k = " + k + " \u2265 "+ M +" = M  " +"n{}"+
                                      " ������� �����������,n{}������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +
                                        "}e{} - n{}������� ����������� � �������.";
                                        nextStep =-1;

                                    }
                                 break;



                             case 44:
                                     c = "��������� ������� H(x^{" + k + "}) = " + f.hStr() + "";
                                     nextStep = step + 1;
                                     break;
                             case 45:

                                   c = "  ��������� ������� H(x^{" + k + "})+\u03BC^{"+ k +"}*E = " +f.h_plusStr(k);
                                     nextStep = step + 1;
                                     break;
                           case 46:
                                    c = "  ��������� �������� �������� ������� : n{}"+
                                      " [H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} = " + f.h_1_plusStr(k);
                                    nextStep = step + 1;
                                    break;

                         case 47:
                                    c = " ������ ���������: n{}"+
                                        "d_{" + k + "} = -[H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} \u2207f(x^{" + k + "}) = - " + f.h_1_plusStr(k) + "#{" +
                                        f.g1Str() + "}{" + f.g2Str() + "} = " + "#{" + f.d1Str() + "}{" + f.d2Str() + "}";

                                    nextStep = step + 1;
                          break;


                            case 48:
                             if (slozhnost >= 3) {
                              c = "������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                             k + "} = " +
                                             "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                             "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                             "#{?{0}}{?{1}} n{}!{field}{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}"+
                                             "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                             ;
                                } else {
                                 c = "������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                             k + "} = " +
                                             "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                             "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                             "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                 }
                                  nextStep = step + 1;
                                   totalPoints++;
                                   break;
                         case 49:

                          if (f.dFuncNorm_a() < f.dFuncNorm_b()) {
                            c = "  ��������� ���������� ������� f(x^{" + (k + 1) + "}) < f(x^{" + k + "}): n{}"+
                             "  f(x^{" + (k + 1) + "}) = " + f.dFuncNormStr_a() + " < "+ f.dFuncNormStr_b() + " = f(x^{" + k + "}) "+".n{}"+
                            " ������� �����������, ������� �������� k = k+1 = "+k+"+1 = "+(k+1)+" ,n{}\u03BC^{"+(k+1)+"} = \u03BC^{"+k+"}/2 = "+f.Vektor[k]/2 +
                            " n{}� ��������� � ���� 5.";
                         // f.setx1x2(f.x1New(k), f.x2New(k));
                          // nextStep = 5;
                         nextStep = step +1;

                           }
                            else {
                          c = "  f(x^{" + (k + 1) + "}) = " +f.dFuncNormStr_a() + " > "+ f.dFuncNormStr_b() + " = f(x^{" + k + "})"+".n{}" +
                         " ������� �� �����������, ������� �������� n{}\u03BC^{"+k+"} = 2 * \u03BC^{"+k+"} = 2 * "+f.Vektor[k]/2 +" = "+(2*f.Vektor[k]/2)+
                       " n{}� ��������� � ���� 9.";
                     //f.setx1x2(f.x1New(), f.x2New());
                     // nextStep = 9;
                            nextStep = step +1;
                      // nextStep = 9;

                       }
//  nextStep = -1;
                       break;
               //////    7     /////////////////////////////////////////////////////////////////
                    case 50:
                      k++;
                    f.setx1x2(f.x1New(k), f.x2New(k));
                                     c = "�������� �������� � ����� x^{" + k + "}: \u2207f(x^{" + k + "}) = #{" + f.g1Str() + "}{" +
                                                  f.g2Str() + "}";
                                          nextStep = step + 1;
                                          break;
                                  case 51:
                                          c = "��������  �������� ���������: \u2225\u2207f(x^{" +
                                               k + "})\u2225 \u2264 \u03b5_{1}; ";
                                          if (f.gNorm() <= f.eps1) {
                                                  c += f.gNormStr() + " \u2264 " + f.eps1Str() + ",n{} ������� �����������, "+
                                                  " ������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +"}e{} -n{} ������� ����������� � �������.";
                                                nextStep =-1;
                                          }
                                          else {
                                                if (slozhnost >= 1) {
                                                  c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������. n{}����� ������� %{��������� � ���������� ����}{������� �������} n{}!{choice}{1}";
                                                } else {
                                                  c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������, �� ��������� � ���������� ����";
                                                }
                                                  nextStep = step + 1;
                                          }
                                          break;
                                  case 52:
                                       if ( k < M )
                                       { c = " �������� ���������� ������� k \u2265 M: k= " + k + " < "+"M = "+ M +"n{}" +
                                          " ������� �� �����������, ������ ��������� � ���������� ����.";

                                         nextStep = step + 1;
                                       }
                                       else

                                       {   c= " �������� ���������� ������� k \u2265 M: k = " + k + " \u2265 "+ M +" = M  " +"n{}"+
                                           " ������� �����������,n{}������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +
                                             "}e{} - n{}������� ����������� � �������.";
                                             nextStep =-1;

                                         }
                                      break;



                                  case 53:
                                          c = "��������� ������� H(x^{" + k + "}) = " + f.hStr() + "";
                                          nextStep = step + 1;
                                          break;
                                  case 54:

                                        c = "  ��������� ������� H(x^{" + k + "})+\u03BC^{"+ k +"}*E= " +f.h_plusStr(k);
                                          nextStep = step + 1;
                                          break;
                                case 55:
                                         c = "  ��������� �������� �������� ������� : n{}"+
                                           " [H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} = " + f.h_1_plusStr(k);
                                         nextStep = step + 1;
                                         break;

                              case 56:
                                         c = " ������ ���������: n{}"+
                                             "d_{" + k + "} = -[H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} \u2207f(x^{" + k + "}) = - " + f.h_1_plusStr(k) + "#{" +
                                             f.g1Str() + "}{" + f.g2Str() + "} = " + "#{" + f.d1Str() + "}{" + f.d2Str() + "}";

                                         nextStep = step + 1;
                               break;


                                 case 57:
                                  if (slozhnost >= 3) {
                                   c = "������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                  k + "} = " +
                                                  "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                  "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                  "#{?{0}}{?{1}} n{}!{field}{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}"+
                                                  "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                                  ;
                                     } else {
                                      c = "������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                  k + "} = " +
                                                  "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                  "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                  "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                      }
                                       nextStep = step + 1;
                                        totalPoints++;
                                        break;
                              case 58:

                               if (f.dFuncNorm_a() < f.dFuncNorm_b()) {
                                 c = "  ��������� ���������� ������� f(x^{" + (k + 1) + "}) < f(x^{" + k + "}): n{}"+
                                  "  f(x^{" + (k + 1) + "}) = " + f.dFuncNormStr_a() + " < "+ f.dFuncNormStr_b() + " = f(x^{" + k + "}) "+".n{}"+
                                 " ������� �����������, ������� �������� k = k+1 = "+k+"+1 = "+(k+1)+" ,n{}\u03BC^{"+(k+1)+"} = \u03BC^{"+k+"}/2 = "+f.Vektor[k]/2 +
                                 " n{}� ��������� � ���� 5.";
                              // f.setx1x2(f.x1New(k), f.x2New(k));
                               // nextStep = 5;
                              nextStep = step +1;

                                }
                                 else {
                               c = "  f(x^{" + (k + 1) + "}) = " +f.dFuncNormStr_a() + " > "+ f.dFuncNormStr_b() + " = f(x^{" + k + "})"+".n{}" +
                              " ������� �� �����������, ������� �������� n{}\u03BC^{"+k+"} = 2 * \u03BC^{"+k+"} = 2 * "+f.Vektor[k]/2 +" = "+(2*f.Vektor[k]/2)+
                            " n{}� ��������� � ���� 9.";
                          //f.setx1x2(f.x1New(), f.x2New());
                          // nextStep = 9;
                                nextStep = step +1;
                           // nextStep = 9;

                            }
//  nextStep = -1;
                            break;
                    //////    8     /////////////////////////////////////////////////////////////////
                             case 59:
                               k++;
                              f.setx1x2(f.x1New(k), f.x2New(k));
                                          c = "�������� �������� � ����� x^{" + k + "}: \u2207f(x^{" + k + "}) = #{" + f.g1Str() + "}{" +
                                                       f.g2Str() + "}";
                                               nextStep = step + 1;
                                               break;
                                       case 60:
                                               c = "��������  �������� ���������: \u2225\u2207f(x^{" +
                                                    k + "})\u2225 \u2264 \u03b5_{1}; ";
                                               if (f.gNorm() <= f.eps1) {
                                                       c += f.gNormStr() + " \u2264 " + f.eps1Str() + ",n{} ������� �����������, "+
                                                       " ������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +"}e{} - n{}������� ����������� � �������.";
                                                     nextStep =-1;
                                               }
                                               else {
                                                     if (slozhnost >= 1) {
                                                       c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������. n{}����� ������� %{��������� � ���������� ����}{������� �������} n{}!{choice}{1}";
                                                     } else {
                                                       c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������, �� ��������� � ���������� ����";
                                                     }
                                                       nextStep = step + 1;
                                               }
                                               break;
                                       case 61:
                                            if ( k < M )
                                            { c = " �������� ���������� ������� k \u2265 M: k= " + k + " < "+"M = "+ M +"n{}" +
                                               " ������� �� �����������, ������ ��������� � ���������� ����.";

                                              nextStep = step + 1;
                                            }
                                            else

                                            {   c= " �������� ���������� ������� k \u2265 M: k = " + k + " \u2265 "+ M +" = M  " +"n{}"+
                                                " ������� �����������,n{}������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +
                                                  "}e{} - n{}������� ����������� � �������.";
                                                  nextStep =-1;

                                              }
                                           break;



                                       case 62:
                                               c = "��������� ������� H(x^{" + k + "}) = " + f.hStr() + "";
                                               nextStep = step + 1;
                                               break;
                                       case 63:

                                             c = "  ��������� ������� H(x^{" + k + "})+\u03BC^{"+ k +"}*E = " +f.h_plusStr(k);
                                               nextStep = step + 1;
                                               break;
                                     case 64:
                                              c = "  ��������� �������� �������� ������� : n{}"+
                                                " [H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} = " + f.h_1_plusStr(k);
                                              nextStep = step + 1;
                                              break;

                                   case 65:
                                              c = " ������ ���������: n{}"+
                                                  "d_{" + k + "} = -[H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} \u2207f(x^{" + k + "}) = - " + f.h_1_plusStr(k) + "#{" +
                                                  f.g1Str() + "}{" + f.g2Str() + "} = " + "#{" + f.d1Str() + "}{" + f.d2Str() + "}";

                                              nextStep = step + 1;
                                    break;


                                      case 66:
                                       if (slozhnost >= 3) {
                                        c = "������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                       k + "} = " +
                                                       "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                       "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                       "#{?{0}}{?{1}} n{}!{field}{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}"+
                                                       "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                                       ;
                                          } else {
                                           c = "������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                       k + "} = " +
                                                       "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                       "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                       "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                           }
                                            nextStep = step + 1;
                                             totalPoints++;
                                             break;
                                   case 67:

                                    if (f.dFuncNorm_a() < f.dFuncNorm_b()) {
                                      c = "  ��������� ���������� ������� f(x^{" + (k + 1) + "}) < f(x^{" + k + "}): n{}"+
                                       "  f(x^{" + (k + 1) + "}) = " + f.dFuncNormStr_a() + " < "+ f.dFuncNormStr_b() + " = f(x^{" + k + "}) "+".n{}"+
                                      " ������� �����������, ������� �������� k = k+1 = "+k+"+1 = "+(k+1)+" ,n{}\u03BC^{"+(k+1)+"} = \u03BC^{"+k+"}/2 = "+f.Vektor[k]/2 +
                                      " n{}� ��������� � ���� 5.";
                                 //   f.setx1x2(f.x1New(k), f.x2New(k));
                                    // nextStep = 5;
                                   nextStep = step +1;

                                     }
                                      else {
                                    c = "  f(x^{" + (k + 1) + "}) = " +f.dFuncNormStr_a() + " > "+ f.dFuncNormStr_b() + " = f(x^{" + k + "})"+".n{}" +
                                   " ������� �� �����������, ������� �������� n{}\u03BC^{"+k+"} = 2 * \u03BC^{"+k+"} = 2 * "+f.Vektor[k]/2 +" = "+(2*f.Vektor[k]/2)+
                                 " n{}� ��������� � ���� 9.";
                               //f.setx1x2(f.x1New(), f.x2New());
                                nextStep = step +1;
                                // nextStep = step +1;
                                   //  nextStep = -1;
                                // nextStep = 9;

                                 }
//  nextStep = -1;
                                 break;
                         //////    9     /////////////////////////////////////////////////////////////////
                                  case 68:
                                    k++;
                                    f.setx1x2(f.x1New(k), f.x2New(k));
                                               c = "�������� �������� � ����� x^{" + k + "}: \u2207f(x^{" + k + "}) = #{" + f.g1Str() + "}{" +
                                                            f.g2Str() + "}";
                                                    nextStep = step + 1;
                                                    break;
                                            case 69:
                                                    c = "��������  �������� ���������: \u2225\u2207f(x^{" +
                                                         k + "})\u2225 \u2264 \u03b5_{1}; ";
                                                    if (f.gNorm() <= f.eps1) {
                                                            c += f.gNormStr() + " \u2264 " + f.eps1Str() + ",n{} ������� �����������, "+
                                                            " ������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +"}e{} - n{}������� ����������� � �������.";
                                                          nextStep =-1;
                                                    }
                                                    else {
                                                          if (slozhnost >= 1) {
                                                            c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������. n{}����� ������� %{��������� � ���������� ����}{������� �������} n{}!{choice}{1}";
                                                          } else {
                                                            c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������, �� ��������� � ���������� ����";
                                                          }
                                                            nextStep = step + 1;
                                                    }
                                                    break;
                                            case 70:
                                                 if ( k < M )
                                                 { c = " �������� ���������� ������� k \u2265 M: k= " + k + " < "+"M = "+ M +"n{}" +
                                                    " ������� �� �����������, ������ ��������� � ���������� ����.";

                                                   nextStep = step + 1;
                                                 }
                                                 else

                                                 {   c= " �������� ���������� ������� k \u2265 M: k = " + k + " \u2265 "+ M +" = M  " +"n{}"+
                                                     " ������� �����������,n{}������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +
                                                       "}e{} - n{}������� ����������� � �������.";
                                                       nextStep =-1;

                                                   }
                                                break;



                                            case 71:
                                                    c = "��������� ������� H(x^{" + k + "}) = " + f.hStr() + "";
                                                    nextStep = step + 1;
                                                    break;
                                            case 72:

                                                  c = "  ��������� ������� H(x^{" + k + "})+\u03BC^{"+ k +"}*E = " +f.h_plusStr(k);
                                                    nextStep = step + 1;
                                                    break;
                                          case 73:
                                                   c = "  ��������� �������� �������� ������� : n{}"+
                                                     " [H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} = " + f.h_1_plusStr(k);
                                                   nextStep = step + 1;
                                                   break;

                                        case 74:
                                                   c = " ������ ���������: n{}"+
                                                       "d_{" + k + "} = -[H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} \u2207f(x^{" + k + "}) = - " + f.h_1_plusStr(k) + "#{" +
                                                       f.g1Str() + "}{" + f.g2Str() + "} = " + "#{" + f.d1Str() + "}{" + f.d2Str() + "}";

                                                   nextStep = step + 1;
                                         break;


                                           case 75:
                                            if (slozhnost >= 3) {
                                             c = "������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                            k + "} = " +
                                                            "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                            "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                            "#{?{0}}{?{1}} n{}!{field}{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}"+
                                                            "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                                            ;
                                               } else {
                                                c = "������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                            k + "} = " +
                                                            "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                            "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                            "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                                }
                                                 nextStep = step + 1;
                                                  totalPoints++;
                                                  break;
                                        case 76:

                                         if (f.dFuncNorm_a() < f.dFuncNorm_b()) {
                                           c = "  ��������� ���������� ������� f(x^{" + (k + 1) + "}) < f(x^{" + k + "}): n{}"+
                                            "  f(x^{" + (k + 1) + "}) = " + f.dFuncNormStr_a() + " < "+ f.dFuncNormStr_b() + " = f(x^{" + k + "}) "+".n{}"+
                                           " ������� �����������, ������� �������� k = k+1 = "+k+"+1 = "+(k+1)+" ,n{}\u03BC^{"+(k+1)+"} = \u03BC^{"+k+"}/2 = "+f.Vektor[k]/2 +
                                           " n{}� ��������� � ���� 5.";
                                        // f.setx1x2(f.x1New(k), f.x2New(k));
                                         // nextStep = 5;
                                        nextStep = step +1;

                                          }
                                           else {
                                         c = "  f(x^{" + (k + 1) + "}) = " +f.dFuncNormStr_a() + " > "+ f.dFuncNormStr_b() + " = f(x^{" + k + "})"+".n{}" +
                                        " ������� �� �����������, ������� ��������n{} \u03BC^{"+k+"} = 2 * \u03BC^{"+k+"} = 2 * "+f.Vektor[k]/2 +" = "+(2*f.Vektor[k]/2)+
                                      " n{}� ��������� � ���� 9.";
                                    //f.setx1x2(f.x1New(), f.x2New());
                                    // nextStep = 9;
                                   nextStep = step +1;
                                     //nextStep = -1;
                                     // nextStep = 9;

                                      }
//  nextStep = -1;
                                      break;
                              //////    10     /////////////////////////////////////////////////////////////////
                                       case 77:
                                         k++;
                                    f.setx1x2(f.x1New(k), f.x2New(k));
                                                    c = "�������� �������� � ����� x^{" + k + "}: \u2207f(x^{" + k + "}) = #{" + f.g1Str() + "}{" +
                                                                 f.g2Str() + "}";
                                                         nextStep = step + 1;
                                                         break;
                                                 case 78:
                                                         c = "��������  �������� ���������: \u2225\u2207f(x^{" +
                                                              k + "})\u2225 \u2264 \u03b5_{1}; ";
                                                         if (f.gNorm() <= f.eps1) {
                                                                 c += f.gNormStr() + " \u2264 " + f.eps1Str() + ",n{} ������� �����������, "+
                                                                 " ������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +"}e{} -n{} ������� ����������� � �������.";
                                                               nextStep =-1;
                                                         }
                                                         else {
                                                               if (slozhnost >= 1) {
                                                                 c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������. n{}����� ������� %{��������� � ���������� ����}{������� �������} n{}!{choice}{1}";
                                                               } else {
                                                                 c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������, �� ��������� � ���������� ����";
                                                               }
                                                                 nextStep = step + 1;
                                                         }
                                                         break;
                                                 case 79:
                                                      if ( k < M )
                                                      { c = " �������� ���������� ������� k \u2265 M: k= " + k + " < "+"M = "+ M +"n{}" +
                                                         " ������� �� �����������, ������ ��������� � ���������� ����.";

                                                        nextStep = step + 1;
                                                      }
                                                      else

                                                      {   c= " �������� ���������� ������� k \u2265 M: k = " + k + " \u2265 "+ M +" = M  " +"n{}"+
                                                          " ������� �����������,n{}������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +
                                                            "}e{} - n{}������� ����������� � �������.";
                                                            nextStep =-1;

                                                        }
                                                     break;



                                                 case 80:
                                                         c = "��������� ������� H(x^{" + k + "}) = " + f.hStr() + "";
                                                         nextStep = step + 1;
                                                         break;
                                                 case 81:

                                                       c = "  ��������� ������� H(x^{" + k + "})+\u03BC^{"+ k +"}*E = " +f.h_plusStr(k);
                                                         nextStep = step + 1;
                                                         break;
                                               case 82:
                                                        c = "  ��������� �������� �������� ������� : n{}"+
                                                          " [H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} = " + f.h_1_plusStr(k);
                                                        nextStep = step + 1;
                                                        break;

                                             case 83:
                                                        c = " ������ ���������: n{}"+
                                                            "d_{" + k + "} = -[H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} \u2207f(x^{" + k + "}) = - " + f.h_1_plusStr(k) + "#{" +
                                                            f.g1Str() + "}{" + f.g2Str() + "} = " + "#{" + f.d1Str() + "}{" + f.d2Str() + "}";

                                                        nextStep = step + 1;
                                              break;


                                                case 84:
                                                 if (slozhnost >= 3) {
                                                  c = "������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                                 k + "} = " +
                                                                 "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                                 "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                                 "#{?{0}}{?{1}} n{}!{field}{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}"+
                                                                 "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                                                 ;
                                                    } else {
                                                     c = "������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                                 k + "} = " +
                                                                 "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                                 "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                                 "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                                     }
                                                      nextStep = step + 1;
                                                       totalPoints++;
                                                       break;
                                             case 85:

                                              if (f.dFuncNorm_a() < f.dFuncNorm_b()) {
                                                c = "  ��������� ���������� ������� f(x^{" + (k + 1) + "}) < f(x^{" + k + "}): n{}"+
                                                 "  f(x^{" + (k + 1) + "}) = " + f.dFuncNormStr_a() + " < "+ f.dFuncNormStr_b() + " = f(x^{" + k + "}) "+".n{}"+
                                                " ������� �����������, ������� �������� k = k+1 = "+k+"+1 = "+(k+1)+" ,n{}\u03BC^{"+(k+1)+"} = \u03BC^{"+k+"}/2 = "+f.Vektor[k]/2 +
                                                " n{}� ��������� � ���� 5.";
                                             // f.setx1x2(f.x1New(k), f.x2New(k));
                                              // nextStep = 5;
                                             nextStep = step +1;

                                               }
                                                else {
                                              c = "  f(x^{" + (k + 1) + "}) = " +f.dFuncNormStr_a() + " > "+ f.dFuncNormStr_b() + " = f(x^{" + k + "})"+".n{}" +
                                             " ������� �� �����������, ������� �������� n{}\u03BC^{"+k+"} = 2 * \u03BC^{"+k+"} = 2 * "+f.Vektor[k]/2 +" = "+(2*f.Vektor[k]/2)+
                                           " n{}� ��������� � ���� 9.";
                                         //f.setx1x2(f.x1New(), f.x2New());
                                         // nextStep = 9;
                                              nextStep = step +1;
                                          // nextStep = 9;

                                           }
//  nextStep = -1;
  break;
//////    11     /////////////////////////////////////////////////////////////////
         case 86:
           k++;
            f.setx1x2(f.x1New(k), f.x2New(k));
                      c = "�������� �������� � ����� x^{" + k + "}: \u2207f(x^{" + k + "}) = #{" + f.g1Str() + "}{" +
                                   f.g2Str() + "}";
                           nextStep = step + 1;
                           break;
                   case 87:
                           c = "��������  �������� ���������: \u2225\u2207f(x^{" +
                                k + "})\u2225 \u2264 \u03b5_{1}; ";
                           if (f.gNorm() <= f.eps1) {
                                   c += f.gNormStr() + " \u2264 " + f.eps1Str() + ",n{} ������� �����������, "+
                                   " ������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +"}e{} -n{} ������� ����������� � �������.";
                                 nextStep =-1;
                           }
                           else {
                                 if (slozhnost >= 1) {
                                   c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������. n{}����� ������� %{��������� � ���������� ����}{������� �������} n{}!{choice}{1}";
                                 } else {
                                   c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������, �� ��������� � ���������� ����";
                                 }
                                   nextStep = step + 1;
                           }
                           break;
                   case 88:
                        if ( k < M )
                        { c = " �������� ���������� ������� k \u2265 M: k= " + k + " < "+"M = "+ M +"n{}" +
                           " ������� �� �����������, ������ ��������� � ���������� ����.";

                          nextStep = step + 1;
                        }
                        else

                        {   c= " �������� ���������� ������� k \u2265 M: k = " + k + " \u2265 "+ M +" = M  " +"n{}"+
                            " ������� �����������,n{}������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +
                              "}e{} -n{} ������� ����������� � �������.";
                              nextStep =-1;

                          }
                       break;



                   case 89:
                           c = "��������� ������� H(x^{" + k + "}) = " + f.hStr() + "";
                           nextStep = step + 1;
                           break;
                   case 90:

                         c = "  ��������� ������� H(x^{" + k + "})+\u03BC^{"+ k +"}*E = " +f.h_plusStr(k);
                           nextStep = step + 1;
                           break;
                 case 91:
                          c = "  ��������� �������� �������� ������� : n{}"+
                            " [H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} = " + f.h_1_plusStr(k);
                          nextStep = step + 1;
                          break;

               case 92:
                          c = " ������ ���������: n{}"+
                              "d_{" + k + "} = -[H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} \u2207f(x^{" + k + "}) = - " + f.h_1_plusStr(k) + "#{" +
                              f.g1Str() + "}{" + f.g2Str() + "} = " + "#{" + f.d1Str() + "}{" + f.d2Str() + "}";

                          nextStep = step + 1;
                break;


                  case 93:
                   if (slozhnost >= 3) {
                    c = "������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                   k + "} = " +
                                   "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                   "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                   "#{?{0}}{?{1}} n{}!{field}{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}"+
                                   "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                   ;
                      } else {
                       c = "������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                   k + "} = " +
                                   "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                   "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                   "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                       }
                        nextStep = step + 1;
                         totalPoints++;
                         break;
               case 94:

                if (f.dFuncNorm_a() < f.dFuncNorm_b()) {
                  c = "    ��������� ���������� ������� f(x^{" + (k + 1) + "}) < f(x^{" + k + "}): n{}"+
                   "  f(x^{" + (k + 1) + "}) = " + f.dFuncNormStr_a() + " < "+ f.dFuncNormStr_b() + " = f(x^{" + k + "}) "+".n{}"+
                  " ������� �����������, ������� �������� k = k+1 = "+k+"+1 = "+(k+1)+" ,n{}\u03BC^{"+(k+1)+"} = \u03BC^{"+k+"}/2 = "+f.Vektor[k]/2 +
                  " n{}� ��������� � ���� 5.";
                //f.setx1x2(f.x1New(k), f.x2New(k));
                // nextStep = 5;
               nextStep = step +1;

                 }
                  else {
                c = "    f(x^{" + (k + 1) + "}) = " +f.dFuncNormStr_a() + " > "+ f.dFuncNormStr_b() + " = f(x^{" + k + "})"+".n{}" +
               " ������� �� �����������, ������� �������� n{}\u03BC^{"+k+"} = 2 * \u03BC^{"+k+"} = 2 * "+f.Vektor[k]/2 +" = "+(2*f.Vektor[k]/2)+
             " n{}� ��������� � ���� 9.";
           //f.setx1x2(f.x1New(), f.x2New());
           // nextStep = 9;
                nextStep = step +1;
            // nextStep = 9;

             }
//  nextStep = -1;
             break;
     //////    12    /////////////////////////////////////////////////////////////////
              case 95:
                k++;
               f.setx1x2(f.x1New(k), f.x2New(k));
                           c = "      �������� �������� � ����� x^{" + k + "}: \u2207f(x^{" + k + "}) = #{" + f.g1Str() + "}{" +
                                        f.g2Str() + "}";
                                nextStep = step + 1;
                                break;
                        case 96:
                                c = "      ��������  �������� ���������: \u2225\u2207f(x^{" +
                                     k + "})\u2225 \u2264 \u03b5_{1}; ";
                                if (f.gNorm() <= f.eps1) {
                                        c += f.gNormStr() + " \u2264 " + f.eps1Str() + ",n{} ������� �����������, "+
                                        " ������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +"}e{} -n{} ������� ����������� � �������.";
                                      nextStep =-1;
                                }
                                else {
                                      if (slozhnost >= 1) {
                                        c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������. n{}����� ������� %{��������� � ���������� ����}{������� �������} n{}!{choice}{1}";
                                      } else {
                                        c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������, �� ��������� � ���������� ����";
                                      }
                                        nextStep = step + 1;
                                }
                                break;
                        case 97:
                             if ( k < M )
                             { c = "     �������� ���������� ������� k \u2265 M: k= " + k + " < "+"M = "+ M +"n{}" +
                                " ������� �� �����������, ������ ��������� � ���������� ����.";

                               nextStep = step + 1;
                             }
                             else

                             {   c= "     �������� ���������� ������� k \u2265 M: k = " + k + " \u2265 "+ M +" = M  " +"n{}"+
                                 " ������� �����������,n{}������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +
                                   "}e{} - n{}������� ����������� � �������.";
                                   nextStep =-1;

                               }
                            break;



                        case 98:
                                c = "     ��������� ������� H(x^{" + k + "}) = " + f.hStr() + "";
                                nextStep = step + 1;
                                break;
                        case 99:

                              c = "       ��������� ������� H(x^{" + k + "})+\u03BC^{"+ k +"}*E = " +f.h_plusStr(k);
                                nextStep = step + 1;
                                break;
                      case 100:
                               c = "      ��������� �������� �������� ������� : n{}"+
                                 " [H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} = " + f.h_1_plusStr(k);
                               nextStep = step + 1;
                               break;

                    case 101:
                               c = "        ������ ���������: n{}"+
                                   "d_{" + k + "} = -[H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} \u2207f(x^{" + k + "}) = - " + f.h_1_plusStr(k) + "#{" +
                                   f.g1Str() + "}{" + f.g2Str() + "} = " + "#{" + f.d1Str() + "}{" + f.d2Str() + "}";

                               nextStep = step + 1;
                     break;


                       case 102:
                        if (slozhnost >= 3) {
                         c = "      ������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                        k + "} = " +
                                        "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                        "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                        "#{?{0}}{?{1}} n{}!{field}{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}"+
                                        "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                        ;
                           } else {
                            c = "      ������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                        k + "} = " +
                                        "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                        "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                        "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                            }
                             nextStep = step + 1;
                              totalPoints++;
                              break;
                    case 103:

                     if (f.dFuncNorm_a() < f.dFuncNorm_b()) {
                       c = "      ��������� ���������� ������� f(x^{" + (k + 1) + "}) < f(x^{" + k + "}): n{}"+
                        "  f(x^{" + (k + 1) + "}) = " + f.dFuncNormStr_a() + " < "+ f.dFuncNormStr_b() + " = f(x^{" + k + "}) "+".n{}"+
                       " ������� �����������, ������� �������� k = k+1 = "+k+"+1 = "+(k+1)+" ,n{}\u03BC^{"+(k+1)+"} = \u03BC^{"+k+"}/2 = "+f.Vektor[k]/2 +
                       " n{}� ��������� � ���� 5.";
                    // f.setx1x2(f.x1New(k), f.x2New(k));
                     // nextStep = 5;
                    nextStep = step +1;

                      }
                       else {
                     c = "      f(x^{" + (k + 1) + "}) = " +f.dFuncNormStr_a() + " > "+ f.dFuncNormStr_b() + " = f(x^{" + k + "})"+".n{}" +
                     " ������� �� �����������, ������� �������� n{}\u03BC^{"+k+"} = 2 * \u03BC^{"+k+"} = 2 * "+f.Vektor[k]/2 +" = "+(2*f.Vektor[k]/2)+
                  " n{}� ��������� � ���� 9.";
                //f.setx1x2(f.x1New(), f.x2New());
                // nextStep = 9;
                     nextStep = step +1;
                 // nextStep = 9;

                  }
 //nextStep = -1;
                  break;
          //////    13     /////////////////////////////////////////////////////////////////
                  case 104:
                    k++;
               f.setx1x2(f.x1New(k), f.x2New(k));
                                c = "       �������� �������� � ����� x^{" + k + "}: \u2207f(x^{" + k + "}) = #{" + f.g1Str() + "}{" +
                                             f.g2Str() + "}";
                                     nextStep = step + 1;
                                     break;
                             case 105:
                                     c = "      ��������  �������� ���������: \u2225\u2207f(x^{" +
                                          k + "})\u2225 \u2264 \u03b5_{1}; ";
                                     if (f.gNorm() <= f.eps1) {
                                             c += f.gNormStr() + " \u2264 " + f.eps1Str() + ",n{} ������� �����������, "+
                                             " ������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +"}e{} - n{}������� ����������� � �������.";
                                           nextStep =-1;
                                     }
                                     else {
                                           if (slozhnost >= 1) {
                                             c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������. n{}����� ������� %{��������� � ���������� ����}{������� �������} n{}!{choice}{1}";
                                           } else {
                                             c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������, �� ��������� � ���������� ����";
                                           }
                                             nextStep = step + 1;
                                     }
                                     break;
                             case 106:
                                  if ( k < M )
                                  { c = "       �������� ���������� ������� k \u2265 M: k= " + k + " < "+"M = "+ M +"n{}" +
                                     " ������� �� �����������, ������ ��������� � ���������� ����.";

                                    nextStep = step + 1;
                                  }
                                  else

                                  {   c= "      �������� ���������� ������� k \u2265 M: k = " + k + " \u2265 "+ M +" = M  " +"n{}"+
                                      " ������� �����������,n{}������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +
                                        "}e{} - n{}������� ����������� � �������.";
                                        nextStep =-1;

                                    }
                                 break;



                             case 107:
                                     c = "       ��������� ������� H(x^{" + k + "}) = " + f.hStr() + "";
                                     nextStep = step + 1;
                                     break;
                             case 108:

                                   c = "      ��������� ������� H(x^{" + k + "})+\u03BC^{"+ k +"}*E = " +f.h_plusStr(k);
                                     nextStep = step + 1;
                                     break;
                           case 109:
                                    c = "      ��������� �������� �������� ������� : n{}"+
                                      " [H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} = " + f.h_1_plusStr(k);
                                    nextStep = step + 1;
                                    break;

                         case 110:
                                    c = "       ������ ���������: n{}"+
                                        "d_{" + k + "} = -[H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} \u2207f(x^{" + k + "}) = - " + f.h_1_plusStr(k) + "#{" +
                                        f.g1Str() + "}{" + f.g2Str() + "} = " + "#{" + f.d1Str() + "}{" + f.d2Str() + "}";

                                    nextStep = step + 1;
                          break;


                            case 111:
                             if (slozhnost >= 3) {
                              c = "      ������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                             k + "} = " +
                                             "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                             "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                             "#{?{0}}{?{1}} n{}!{field}{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}"+
                                             "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                             ;
                                } else {
                                 c = "       ������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                             k + "} = " +
                                             "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                             "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                             "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                 }
                                  nextStep = step + 1;
                                   totalPoints++;
                                   break;
                         case 112:

                          if (f.dFuncNorm_a() < f.dFuncNorm_b()) {
                            c = "        ��������� ���������� ������� f(x^{" + (k + 1) + "}) < f(x^{" + k + "}): n{}"+
                             "  f(x^{" + (k + 1) + "}) = " + f.dFuncNormStr_a() + " < "+ f.dFuncNormStr_b() + " = f(x^{" + k + "}) "+".n{}"+
                            " ������� �����������, ������� �������� k = k+1 = "+k+"+1 = "+(k+1)+" ,n{}\u03BC^{"+(k+1)+"} = \u03BC^{"+k+"}/2 = "+f.Vektor[k]/2 +
                            " n{}� ��������� � ���� 5.";
                          //f.setx1x2(f.x1New(k), f.x2New(k));
                          // nextStep = 5;
                         nextStep = step +1;

                           }
                            else {
                          c = "      f(x^{" + (k + 1) + "}) = " +f.dFuncNormStr_a() + " > "+ f.dFuncNormStr_b() + " = f(x^{" + k + "})"+".n{}" +
                        " ������� �� �����������, ������� �������� n{}\u03BC^{"+k+"} = 2 * \u03BC^{"+k+"} = 2 * "+f.Vektor[k]/2 +" = "+(2*f.Vektor[k]/2)+
                       " n{}� ��������� � ���� 9.";
                     //f.setx1x2(f.x1New(), f.x2New());
                     // nextStep = 9;
                           nextStep = step +1;
                      // nextStep = 9;

                       }
//  nextStep = -1;
                       break;
               //////    15    /////////////////////////////////////////////////////////////////
                        case 113:
                          k++;
               f.setx1x2(f.x1New(k), f.x2New(k));
                                     c = "     �������� �������� � ����� x^{" + k + "}: \u2207f(x^{" + k + "}) = #{" + f.g1Str() + "}{" +
                                                  f.g2Str() + "}";
                                          nextStep = step + 1;
                                          break;
                                  case 114:
                                          c = "      ��������  �������� ���������: \u2225\u2207f(x^{" +
                                               k + "})\u2225 \u2264 \u03b5_{1}; ";
                                          if (f.gNorm() <= f.eps1) {
                                                  c += f.gNormStr() + " \u2264 " + f.eps1Str() + ",n{} ������� �����������, "+
                                                  " ������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +"}e{} - n{}������� ����������� � �������.";
                                                nextStep =-1;
                                          }
                                          else {
                                                if (slozhnost >= 1) {
                                                  c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������. n{}����� ������� %{��������� � ���������� ����}{������� �������} n{}!{choice}{1}";
                                                } else {
                                                  c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������, �� ��������� � ���������� ����";
                                                }
                                                  nextStep = step + 1;
                                          }
                                          break;
                                  case 115:
                                       if ( k < M )
                                       { c = "      �������� ���������� ������� k \u2265 M: k= " + k + " < "+"M = "+ M +"n{}" +
                                          " ������� �� �����������, ������ ��������� � ���������� ����.";

                                         nextStep = step + 1;
                                       }
                                       else

                                       {   c= "     �������� ���������� ������� k \u2265 M: k = " + k + " \u2265 "+ M +" = M  " +"n{}"+
                                           " ������� �����������,n{}������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +
                                             "}e{} - n{}������� ����������� � �������.";
                                             nextStep =-1;

                                         }
                                      break;



                                  case 116:
                                          c = "     ��������� ������� H(x^{" + k + "}) = " + f.hStr() + "";
                                          nextStep = step + 1;
                                          break;
                                  case 117:

                                        c = "      ��������� ������� H(x^{" + k + "})+\u03BC^{"+ k +"}*E = " +f.h_plusStr(k);
                                          nextStep = step + 1;
                                          break;
                                case 118:
                                         c = "       ��������� �������� �������� ������� : n{}"+
                                           " [H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} = " + f.h_1_plusStr(k);
                                         nextStep = step + 1;
                                         break;

                              case 119:
                                         c = "       ������ ���������: n{}"+
                                             "d_{" + k + "} = -[H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} \u2207f(x^{" + k + "}) = - " + f.h_1_plusStr(k) + "#{" +
                                             f.g1Str() + "}{" + f.g2Str() + "} = " + "#{" + f.d1Str() + "}{" + f.d2Str() + "}";

                                         nextStep = step + 1;
                               break;


                                 case 120:
                                  if (slozhnost >= 3) {
                                   c = "       ������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                  k + "} = " +
                                                  "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                  "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                  "#{?{0}}{?{1}} n{}!{field}{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}"+
                                                  "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                                  ;
                                     } else {
                                      c = "      ������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                  k + "} = " +
                                                  "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                  "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                  "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                      }
                                       nextStep = step + 1;
                                        totalPoints++;
                                        break;
                              case 121:

                               if (f.dFuncNorm_a() < f.dFuncNorm_b()) {
                                 c = "       ��������� ���������� ������� f(x^{" + (k + 1) + "}) < f(x^{" + k + "}): n{}"+
                                  "  f(x^{" + (k + 1) + "}) = " + f.dFuncNormStr_a() + " < "+ f.dFuncNormStr_b() + " = f(x^{" + k + "}) "+".n{}"+
                                 " ������� �����������, ������� �������� k = k+1 = "+k+"+1 = "+(k+1)+" ,n{}\u03BC^{"+(k+1)+"} = \u03BC^{"+k+"}/2 = "+f.Vektor[k]/2 +
                                 " n{}� ��������� � ���� 5.";
                              // f.setx1x2(f.x1New(k), f.x2New(k));
                               // nextStep = 5;
                              nextStep = step +1;

                                }
                                 else {
                               c = "       f(x^{" + (k + 1) + "}) = " +f.dFuncNormStr_a() + " > "+ f.dFuncNormStr_b() + " = f(x^{" + k + "})"+".n{}" +
                              " ������� �� �����������, ������� �������� n{}\u03BC^{"+k+"} = 2 * \u03BC^{"+k+"} = 2 * "+f.Vektor[k]/2 +" = "+(2*f.Vektor[k]/2)+
                            " n{}� ��������� � ���� 9.";
                          //f.setx1x2(f.x1New(), f.x2New());
                          // nextStep = 9;
                              nextStep = step +1;
                           // nextStep = 9;

                            }
//  nextStep = -1;
                            break;
                    //////    16     /////////////////////////////////////////////////////////////////
                             case 122:
                               k++;
               f.setx1x2(f.x1New(k), f.x2New(k));
                                          c = "      �������� �������� � ����� x^{" + k + "}: \u2207f(x^{" + k + "}) = #{" + f.g1Str() + "}{" +
                                                       f.g2Str() + "}";
                                               nextStep = step + 1;
                                               break;
                                       case 123:
                                               c = "      ��������  �������� ���������: \u2225\u2207f(x^{" +
                                                    k + "})\u2225 \u2264 \u03b5_{1}; ";
                                               if (f.gNorm() <= f.eps1) {
                                                       c += f.gNormStr() + " \u2264 " + f.eps1Str() + ",n{} ������� �����������, "+
                                                       " ������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +"}e{} - n{}������� ����������� � �������.";
                                                     nextStep =-1;
                                               }
                                               else {
                                                     if (slozhnost >= 1) {
                                                       c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������. n{}����� ������� %{��������� � ���������� ����}{������� �������} n{}!{choice}{1}";
                                                     } else {
                                                       c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������, �� ��������� � ���������� ����";
                                                     }
                                                       nextStep = step + 1;
                                               }
                                               break;
                                       case 124:
                                            if ( k < M )
                                            { c = "     �������� ���������� ������� k \u2265 M: k= " + k + " < "+"M = "+ M +"n{}" +
                                               " ������� �� �����������, ������ ��������� � ���������� ����.";

                                              nextStep = step + 1;
                                            }
                                            else

                                            {   c= "     �������� ���������� ������� k \u2265 M: k = " + k + " \u2265 "+ M +" = M  " +"n{}"+
                                                " ������� �����������,n{}������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +
                                                  "}e{} - n{}������� ����������� � �������.";
                                                  nextStep =-1;

                                              }
                                           break;



                                       case 125:
                                               c = "      ��������� ������� H(x^{" + k + "}) = " + f.hStr() + "";
                                               nextStep = step + 1;
                                               break;
                                       case 126:

                                             c = "     ��������� ������� H(x^{" + k + "})+\u03BC^{"+ k +"}*E = " +f.h_plusStr(k);
                                               nextStep = step + 1;
                                               break;
                                     case 127:
                                              c = "      ��������� �������� �������� ������� : n{}"+
                                                " [H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} = " + f.h_1_plusStr(k);
                                              nextStep = step + 1;
                                              break;

                                   case 128:
                                              c = "     ������ ���������: n{}"+
                                                  "d_{" + k + "} = -[H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} \u2207f(x^{" + k + "}) = - " + f.h_1_plusStr(k) + "#{" +
                                                  f.g1Str() + "}{" + f.g2Str() + "} = " + "#{" + f.d1Str() + "}{" + f.d2Str() + "}";

                                              nextStep = step + 1;
                                    break;


                                      case 129:
                                       if (slozhnost >= 3) {
                                        c = "     ������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                       k + "} = " +
                                                       "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                       "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                       "#{?{0}}{?{1}} n{}!{field}{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}"+
                                                       "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                                       ;
                                          } else {
                                           c = "     ������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                       k + "} = " +
                                                       "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                       "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                       "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                           }
                                            nextStep = step + 1;
                                             totalPoints++;
                                             break;
                                   case 130:

                                    if (f.dFuncNorm_a() < f.dFuncNorm_b()) {
                                      c = "      ��������� ���������� ������� f(x^{" + (k + 1) + "}) < f(x^{" + k + "}): n{}"+
                                       "  f(x^{" + (k + 1) + "}) = " + f.dFuncNormStr_a() + " < "+ f.dFuncNormStr_b() + " = f(x^{" + k + "}) "+".n{}"+
                                      " ������� �����������, ������� �������� k = k+1 = "+k+"+1 = "+(k+1)+" ,n{}\u03BC^{"+(k+1)+"} = \u03BC^{"+k+"}/2 = "+f.Vektor[k]/2 +
                                      " n{}� ��������� � ���� 5.";
                                   // f.setx1x2(f.x1New(k), f.x2New(k));
                                    // nextStep = 5;
                                   nextStep = step +1;

                                     }
                                      else {
                                    c = "     f(x^{" + (k + 1) + "}) = " +f.dFuncNormStr_a() + " > "+ f.dFuncNormStr_b() + " = f(x^{" + k + "})"+".n{}" +
                                   " ������� �� �����������, ������� �������� n{}\u03BC^{"+k+"} = 2 * \u03BC^{"+k+"} = 2 * "+f.Vektor[k]/2 +" = "+(2*f.Vektor[k]/2)+
                                 " n{}� ��������� � ���� 9.";
                               //f.setx1x2(f.x1New(), f.x2New());
                               // nextStep = 9;
                                    nextStep = step +1;
                                // nextStep = 9;

                                 }
//  nextStep = -1;
                                 break;
                         //////    17     /////////////////////////////////////////////////////////////////
                                  case 131:
                                    k++;
               f.setx1x2(f.x1New(k), f.x2New(k));
                                               c = "      �������� �������� � ����� x^{" + k + "}: \u2207f(x^{" + k + "}) = #{" + f.g1Str() + "}{" +
                                                            f.g2Str() + "}";
                                                    nextStep = step + 1;
                                                    break;
                                            case 132:
                                                    c = "     ��������  �������� ���������: \u2225\u2207f(x^{" +
                                                         k + "})\u2225 \u2264 \u03b5_{1}; ";
                                                    if (f.gNorm() <= f.eps1) {
                                                            c += f.gNormStr() + " \u2264 " + f.eps1Str() + ",n{} ������� �����������, "+
                                                            " ������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +"}e{} - n{}������� ����������� � �������.";
                                                          nextStep =-1;
                                                    }
                                                    else {
                                                          if (slozhnost >= 1) {
                                                            c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������. n{}����� ������� %{��������� � ���������� ����}{������� �������} n{}!{choice}{1}";
                                                          } else {
                                                            c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������, �� ��������� � ���������� ����";
                                                          }
                                                            nextStep = step + 1;
                                                    }
                                                    break;
                                            case 133:
                                                 if ( k < M )
                                                 { c = "     �������� ���������� ������� k \u2265 M: k= " + k + " < "+"M = "+ M +"n{}" +
                                                    " ������� �� �����������, ������ ��������� � ���������� ����.";

                                                   nextStep = step + 1;
                                                 }
                                                 else

                                                 {   c= "     �������� ���������� ������� k \u2265 M: k = " + k + " \u2265 "+ M +" = M  " +"n{}"+
                                                     " ������� �����������,n{}������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +
                                                       "}e{} - n{}������� ����������� � �������.";
                                                       nextStep =-1;

                                                   }
                                                break;



                                            case 134:
                                                    c = "     ��������� ������� H(x^{" + k + "}) = " + f.hStr() + "";
                                                    nextStep = step + 1;
                                                    break;
                                            case 135:

                                                  c = "     ��������� ������� H(x^{" + k + "})+\u03BC^{"+ k +"}*E = " +f.h_plusStr(k);
                                                    nextStep = step + 1;
                                                    break;
                                          case 136:
                                                   c = "       ��������� �������� �������� ������� : n{}"+
                                                     " [H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} = " + f.h_1_plusStr(k);
                                                   nextStep = step + 1;
                                                   break;

                                        case 137:
                                                   c = "     ������ ���������: n{}"+
                                                       "d_{" + k + "} = -[H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} \u2207f(x^{" + k + "}) = - " + f.h_1_plusStr(k) + "#{" +
                                                       f.g1Str() + "}{" + f.g2Str() + "} = " + "#{" + f.d1Str() + "}{" + f.d2Str() + "}";

                                                   nextStep = step + 1;
                                         break;


                                           case 138:
                                            if (slozhnost >= 3) {
                                             c = "     ������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                            k + "} = " +
                                                            "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                            "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                            "#{?{0}}{?{1}} n{}!{field}{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}"+
                                                            "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                                            ;
                                               } else {
                                                c = "       ������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                            k + "} = " +
                                                            "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                            "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                            "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                                }
                                                 nextStep = step + 1;
                                                  totalPoints++;
                                                  break;
                                        case 139:

                                         if (f.dFuncNorm_a() < f.dFuncNorm_b()) {
                                           c = "      ��������� ���������� ������� f(x^{" + (k + 1) + "}) < f(x^{" + k + "}): n{}"+
                                            "  f(x^{" + (k + 1) + "}) = " + f.dFuncNormStr_a() + " < "+ f.dFuncNormStr_b() + " = f(x^{" + k + "}) "+".n{}"+
                                           " ������� �����������, ������� �������� k = k+1 = "+k+"+1 = "+(k+1)+" ,n{}\u03BC^{"+(k+1)+"} = \u03BC^{"+k+"}/2 = "+f.Vektor[k]/2 +
                                           " n{}� ��������� � ���� 5.";
                                        // f.setx1x2(f.x1New(k), f.x2New(k));
                                         // nextStep = 5;
                                        nextStep = step +1;

                                          }
                                           else {
                                         c = "      f(x^{" + (k + 1) + "}) = " +f.dFuncNormStr_a() + " > "+ f.dFuncNormStr_b() + " = f(x^{" + k + "})"+".n{}" +
                                        " ������� �� �����������, ������� �������� n{}\u03BC^{"+k+"} = 2 * \u03BC^{"+k+"} = 2 * "+f.Vektor[k]/2 +" = "+(2*f.Vektor[k]/2)+
                                      " n{}� ��������� � ���� 9.";
                                    //f.setx1x2(f.x1New(), f.x2New());
                                    // nextStep = 9;
                                          nextStep = step +1;
                                     // nextStep = 9;

                                      }
//  nextStep = -1;
                                      break;
                              //////    18     /////////////////////////////////////////////////////////////////
                                       case 140:
                                         k++;
               f.setx1x2(f.x1New(k), f.x2New(k));
                                                    c = "     �������� �������� � ����� x^{" + k + "}: \u2207f(x^{" + k + "}) = #{" + f.g1Str() + "}{" +
                                                                 f.g2Str() + "}";
                                                         nextStep = step + 1;
                                                         break;
                                                 case 141:
                                                         c = "     ��������  �������� ���������: \u2225\u2207f(x^{" +
                                                              k + "})\u2225 \u2264 \u03b5_{1}; ";
                                                         if (f.gNorm() <= f.eps1) {
                                                                 c += f.gNormStr() + " \u2264 " + f.eps1Str() + ",n{} ������� �����������, "+
                                                                 " ������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +"}e{} - n{}������� ����������� � �������.";
                                                               nextStep =-1;
                                                         }
                                                         else {
                                                               if (slozhnost >= 1) {
                                                                 c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������. n{}����� ������� %{��������� � ���������� ����}{������� �������} n{}!{choice}{1}";
                                                               } else {
                                                                 c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������, �� ��������� � ���������� ����";
                                                               }
                                                                 nextStep = step + 1;
                                                         }
                                                         break;
                                                 case 142:
                                                      if ( k < M )
                                                      { c = "     �������� ���������� ������� k \u2265 M: k= " + k + " < "+"M = "+ M +"n{}" +
                                                         " ������� �� �����������, ������ ��������� � ���������� ����.";

                                                        nextStep = step + 1;
                                                      }
                                                      else

                                                      {   c= "     �������� ���������� ������� k \u2265 M: k = " + k + " \u2265 "+ M +" = M  " +"n{}"+
                                                          " ������� �����������,n{}������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +
                                                            "}e{} - n{}������� ����������� � �������.";
                                                            nextStep =-1;

                                                        }
                                                     break;



                                                 case 143:
                                                         c = "     ��������� ������� H(x^{" + k + "}) = " + f.hStr() + "";
                                                         nextStep = step + 1;
                                                         break;
                                                 case 144:

                                                       c = "    ��������� ������� H(x^{" + k + "})+\u03BC^{"+ k +"}*E = " +f.h_plusStr(k);
                                                         nextStep = step + 1;
                                                         break;
                                               case 145:
                                                        c = "     ��������� �������� �������� ������� : n{}"+
                                                          " [H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} = " + f.h_1_plusStr(k);
                                                        nextStep = step + 1;
                                                        break;

                                             case 146:
                                                        c = "     ������ ���������: n{}"+
                                                            "d_{" + k + "} = -[H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} \u2207f(x^{" + k + "}) = - " + f.h_1_plusStr(k) + "#{" +
                                                            f.g1Str() + "}{" + f.g2Str() + "} = " + "#{" + f.d1Str() + "}{" + f.d2Str() + "}";

                                                        nextStep = step + 1;
                                              break;


                                                case 147:
                                                 if (slozhnost >= 3) {
                                                  c = "     ������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                                 k + "} = " +
                                                                 "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                                 "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                                 "#{?{0}}{?{1}} n{}!{field}{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}"+
                                                                 "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                                                 ;
                                                    } else {
                                                     c = "     ������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                                 k + "} = " +
                                                                 "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                                 "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                                 "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                                     }
                                                      nextStep = step + 1;
                                                       totalPoints++;
                                                       break;
                                             case 148:

                                              if (f.dFuncNorm_a() < f.dFuncNorm_b()) {
                                                c = "      ��������� ���������� ������� f(x^{" + (k + 1) + "}) < f(x^{" + k + "}): n{}"+
                                                 "  f(x^{" + (k + 1) + "}) = " + f.dFuncNormStr_a() + " < "+ f.dFuncNormStr_b() + " = f(x^{" + k + "}) "+".n{}"+
                                                " ������� �����������, ������� �������� k = k+1 = "+k+"+1 = "+(k+1)+" ,n{}\u03BC^{"+(k+1)+"} = \u03BC^{"+k+"}/2 = "+f.Vektor[k]/2 +
                                                " n{}� ��������� � ���� 5.";
                                             // f.setx1x2(f.x1New(k), f.x2New(k));
                                              // nextStep = 5;
                                             nextStep = step +1;

                                               }
                                                else {
                                              c = "       f(x^{" + (k + 1) + "}) = " +f.dFuncNormStr_a() + " > "+ f.dFuncNormStr_b() + " = f(x^{" + k + "})"+".n{}" +
                                             " ������� �� �����������, ������� �������� n{}\u03BC^{"+k+"} = 2 * \u03BC^{"+k+"} = 2 * "+f.Vektor[k]/2 +" = "+(2*f.Vektor[k]/2)+
                                           " n{}� ��������� � ���� 9.";
                                         //f.setx1x2(f.x1New(), f.x2New());
                                         // nextStep = 9;
                                              nextStep = step +1;
                                          // nextStep = 9;

                                           }
 // nextStep = -1;
 break;
//////    19     /////////////////////////////////////////////////////////////////
         case 149:
           k++;
               f.setx1x2(f.x1New(k), f.x2New(k));
                      c = "      �������� �������� � ����� x^{" + k + "}: \u2207f(x^{" + k + "}) = #{" + f.g1Str() + "}{" +
                                   f.g2Str() + "}";
                           nextStep = step + 1;
                           break;
                   case 150:
                           c = "     ��������  �������� ���������: \u2225\u2207f(x^{" +
                                k + "})\u2225 \u2264 \u03b5_{1}; ";
                           if (f.gNorm() <= f.eps1) {
                                   c += f.gNormStr() + " \u2264 " + f.eps1Str() + ",n{} ������� �����������, "+
                                   " ������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +"}e{} -n{} ������� ����������� � �������.";
                                 nextStep =-1;
                           }
                           else {
                                 if (slozhnost >= 1) {
                                   c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������. n{}����� ������� %{��������� � ���������� ����}{������� �������} n{}!{choice}{1}";
                                 } else {
                                   c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������, �� ��������� � ���������� ����";
                                 }
                                   nextStep = step + 1;
                           }
                           break;
                   case 151:
                        if ( k < M )
                        { c = "      �������� ���������� ������� k \u2265 M: k= " + k + " < "+"M = "+ M +"n{}" +
                           " ������� �� �����������, ������ ��������� � ���������� ����.";

                          nextStep = step + 1;
                        }
                        else

                        {   c= "     �������� ���������� ������� k \u2265 M: k = " + k + " \u2265 "+ M +" = M  " +"n{}"+
                            " ������� �����������,n{}������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +
                              "}e{} - n{}������� ����������� � �������.";
                              nextStep =-1;

                          }
                       break;



                   case 152:
                           c = "      ��������� ������� H(x^{" + k + "}) = " + f.hStr() + "";
                           nextStep = step + 1;
                           break;
                   case 153:

                         c = "     ��������� ������� H(x^{" + k + "})+\u03BC^{"+ k +"}*E = " +f.h_plusStr(k);
                           nextStep = step + 1;
                           break;
                 case 154:
                          c = "      ��������� �������� �������� ������� : n{}"+
                            " [H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} = " + f.h_1_plusStr(k);
                          nextStep = step + 1;
                          break;

               case 155:
                          c = "     ������ ���������: n{}"+
                              "d_{" + k + "} = -[H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} \u2207f(x^{" + k + "}) = - " + f.h_1_plusStr(k) + "#{" +
                              f.g1Str() + "}{" + f.g2Str() + "} = " + "#{" + f.d1Str() + "}{" + f.d2Str() + "}";

                          nextStep = step + 1;
                break;


                  case 156:
                   if (slozhnost >= 3) {
                    c = "    ������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                   k + "} = " +
                                   "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                   "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                   "#{?{0}}{?{1}} n{}!{field}{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}"+
                                   "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                   ;
                      } else {
                       c = "     ������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                   k + "} = " +
                                   "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                   "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                   "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                       }
                        nextStep = step + 1;
                         totalPoints++;
                         break;
               case 157:

                if (f.dFuncNorm_a() < f.dFuncNorm_b()) {
                  c = "      ��������� ���������� ������� f(x^{" + (k + 1) + "}) < f(x^{" + k + "}): n{}"+
                   "  f(x^{" + (k + 1) + "}) = " + f.dFuncNormStr_a() + " < "+ f.dFuncNormStr_b() + " = f(x^{" + k + "}) "+".n{}"+
                  " ������� �����������, ������� �������� k = k+1 = "+k+"+1 = "+(k+1)+" ,n{}\u03BC^{"+(k+1)+"} = \u03BC^{"+k+"}/2 = "+f.Vektor[k]/2 +
                  " n{}� ��������� � ���� 5.";
               // f.setx1x2(f.x1New(k), f.x2New(k));
                // nextStep = 5;
               nextStep = step +1;

                 }
                  else {
                c = "     f(x^{" + (k + 1) + "}) = " +f.dFuncNormStr_a() + " > "+ f.dFuncNormStr_b() + " = f(x^{" + k + "})"+".n{}" +
               " ������� �� �����������, ������� �������� n{}\u03BC^{"+k+"} = 2 * \u03BC^{"+k+"} = 2 * "+f.Vektor[k]/2 +" = "+(2*f.Vektor[k]/2)+
             " n{}� ��������� � ���� 9.";
           //f.setx1x2(f.x1New(), f.x2New());
           // nextStep = 9;
                 nextStep = step +1;
            // nextStep = 9;

             }
//  nextStep = -1;
             break;
     //////    20     /////////////////////////////////////////////////////////////////
              case 158:
                k++;
               f.setx1x2(f.x1New(k), f.x2New(k));
                           c = "      �������� �������� � ����� x^{" + k + "}: \u2207f(x^{" + k + "}) = #{" + f.g1Str() + "}{" +
                                        f.g2Str() + "}";
                                nextStep = step + 1;
                                break;
                        case 159:
                                c = "      ��������  �������� ���������: \u2225\u2207f(x^{" +
                                     k + "})\u2225 \u2264 \u03b5_{1}; ";
                                if (f.gNorm() <= f.eps1) {
                                        c += f.gNormStr() + " \u2264 " + f.eps1Str() + ",n{} ������� �����������, "+
                                        " ������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +"}e{} - n{}������� ����������� � �������.";
                                      nextStep =-1;
                                }
                                else {
                                      if (slozhnost >= 1) {
                                        c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������. n{}����� ������� %{��������� � ���������� ����}{������� �������} n{}!{choice}{1}";
                                      } else {
                                        c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������, �� ��������� � ���������� ����";
                                      }
                                        nextStep = step + 1;
                                }
                                break;
                        case 160:
                             if ( k < M )
                             { c = "     �������� ���������� ������� k \u2265 M: k= " + k + " < "+"M = "+ M +"n{}" +
                                " ������� �� �����������, ������ ��������� � ���������� ����.";

                               nextStep = step + 1;
                             }
                             else

                             {   c= "     �������� ���������� ������� k \u2265 M: k = " + k + " \u2265 "+ M +" = M  " +"n{}"+
                                 " ������� �����������,n{}������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +
                                   "}e{} - n{}������� ����������� � �������.";
                                   nextStep =-1;

                               }
                            break;



                        case 161:
                                c ="     ��������� ������� H(x^{" + k + "}) = " + f.hStr() + "";
                                nextStep = step + 1;
                                break;
                        case 162:

                              c = "       ��������� ������� H(x^{" + k + "})+\u03BC^{"+ k +"}*E = " +f.h_plusStr(k);
                                nextStep = step + 1;
                                break;
                      case 163:
                               c = "      ��������� �������� �������� ������� : n{}"+
                                 " [H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} = " + f.h_1_plusStr(k);
                               nextStep = step + 1;
                               break;

                    case 164:
                               c = "     ������ ���������: n{}"+
                                   "d_{" + k + "} = -[H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} \u2207f(x^{" + k + "}) = - " + f.h_1_plusStr(k) + "#{" +
                                   f.g1Str() + "}{" + f.g2Str() + "} = " + "#{" + f.d1Str() + "}{" + f.d2Str() + "}";

                               nextStep = step + 1;
                     break;


                       case 165:
                        if (slozhnost >= 3) {
                         c = "      ������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                        k + "} = " +
                                        "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                        "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                        "#{?{0}}{?{1}} n{}!{field}{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}"+
                                        "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                        ;
                           } else {
                            c = "     ������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                        k + "} = " +
                                        "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                        "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                        "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                            }
                             nextStep = step + 1;
                              totalPoints++;
                              break;
                    case 166:

                     if (f.dFuncNorm_a() < f.dFuncNorm_b()) {
                       c = "      ��������� ���������� ������� f(x^{" + (k + 1) + "}) < f(x^{" + k + "}): n{}"+
                        "  f(x^{" + (k + 1) + "}) = " + f.dFuncNormStr_a() + " < "+ f.dFuncNormStr_b() + " = f(x^{" + k + "}) "+".n{}"+
                       " ������� �����������, ������� �������� k = k+1 = "+k+"+1 = "+(k+1)+" ,n{}\u03BC^{"+(k+1)+"} = \u03BC^{"+k+"}/2 = "+f.Vektor[k]/2 +
                       " n{}� ��������� � ���� 5.";
                    // f.setx1x2(f.x1New(k), f.x2New(k));
                     // nextStep = 5;
                    nextStep = step +1;

                      }
                       else {
                     c = "      f(x^{" + (k + 1) + "}) = " +f.dFuncNormStr_a() + " > "+ f.dFuncNormStr_b() + " = f(x^{" + k + "})"+".n{}" +
                     " ������� �� �����������, ������� �������� n{}\u03BC^{"+k+"} = 2 * \u03BC^{"+k+"} = 2 * "+f.Vektor[k]/2 +" = "+(2*f.Vektor[k]/2)+
                  " n{}� ��������� � ���� 9.";
                //f.setx1x2(f.x1New(), f.x2New());
                // nextStep = 9;
                      nextStep = step +1;
                 // nextStep = 9;

                  }
//  nextStep = -1;
                  break;
          //////    21     /////////////////////////////////////////////////////////////////
                   case 167:
                     k++;
               f.setx1x2(f.x1New(k), f.x2New(k));
                                c = "      �������� �������� � ����� x^{" + k + "}: \u2207f(x^{" + k + "}) = #{" + f.g1Str() + "}{" +
                                             f.g2Str() + "}";
                                     nextStep = step + 1;
                                     break;
                             case 168:
                                     c = "       ��������  �������� ���������: \u2225\u2207f(x^{" +
                                          k + "})\u2225 \u2264 \u03b5_{1}; ";
                                     if (f.gNorm() <= f.eps1) {
                                             c += f.gNormStr() + " \u2264 " + f.eps1Str() + ",n{} ������� �����������, "+
                                             " ������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +"}e{} - n{}������� ����������� � �������.";
                                           nextStep =-1;
                                     }
                                     else {
                                           if (slozhnost >= 1) {
                                             c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������. n{}����� ������� %{��������� � ���������� ����}{������� �������} n{}!{choice}{1}";
                                           } else {
                                             c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������, �� ��������� � ���������� ����";
                                           }
                                             nextStep = step + 1;
                                     }
                                     break;
                             case 169:
                                  if ( k < M )
                                  { c = "     �������� ���������� ������� k \u2265 M: k= " + k + " < "+"M = "+ M +"n{}" +
                                     " ������� �� �����������, ������ ��������� � ���������� ����.";

                                    nextStep = step + 1;
                                  }
                                  else

                                  {   c= "      �������� ���������� ������� k \u2265 M: k = " + k + " \u2265 "+ M +" = M  " +"n{}"+
                                      " ������� �����������,n{}������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +
                                        "}e{} -n{} ������� ����������� � �������.";
                                        nextStep =-1;

                                    }
                                 break;



                             case 170:
                                     c = "     ��������� ������� H(x^{" + k + "}) = " + f.hStr() + "";
                                     nextStep = step + 1;
                                     break;
                             case 171:

                                   c = "     ��������� ������� H(x^{" + k + "})+\u03BC^{"+ k +"}*E = " +f.h_plusStr(k);
                                     nextStep = step + 1;
                                     break;
                           case 172:
                                    c = "      ��������� �������� �������� ������� : n{}"+
                                      " [H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} = " + f.h_1_plusStr(k);
                                    nextStep = step + 1;
                                    break;

                         case 173:
                                    c = "      ������ ���������: n{}"+
                                        "d_{" + k + "} = -[H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} \u2207f(x^{" + k + "}) = - " + f.h_1_plusStr(k) + "#{" +
                                        f.g1Str() + "}{" + f.g2Str() + "} = " + "#{" + f.d1Str() + "}{" + f.d2Str() + "}";

                                    nextStep = step + 1;
                          break;


                            case 174:
                             if (slozhnost >= 3) {
                              c = "     ������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                             k + "} = " +
                                             "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                             "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                             "#{?{0}}{?{1}} n{}!{field}{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}"+
                                             "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                             ;
                                } else {
                                 c = "     ������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                             k + "} = " +
                                             "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                             "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                             "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                 }
                                  nextStep = step + 1;
                                   totalPoints++;
                                   break;
                         case 175:

                          if (f.dFuncNorm_a() < f.dFuncNorm_b()) {
                            c = "      ��������� ���������� ������� f(x^{" + (k + 1) + "}) < f(x^{" + k + "}): n{}"+
                             "  f(x^{" + (k + 1) + "}) = " + f.dFuncNormStr_a() + " < "+ f.dFuncNormStr_b() + " = f(x^{" + k + "}) "+".n{}"+
                            " ������� �����������, ������� �������� k = k+1 = "+k+"+1 = "+(k+1)+" ,n{}\u03BC^{"+(k+1)+"} = \u03BC^{"+k+"}/2 = "+f.Vektor[k]/2 +
                            " n{}� ��������� � ���� 5.";
                        //  f.setx1x2(f.x1New(k), f.x2New(k));
                          // nextStep = 5;
                         nextStep = step +1;

                           }
                            else {
                          c = "     f(x^{" + (k + 1) + "}) = " +f.dFuncNormStr_a() + " > "+ f.dFuncNormStr_b() + " = f(x^{" + k + "})"+".n{}" +
                         " ������� �� �����������, ������� �������� n{}\u03BC^{"+k+"} = 2 * \u03BC^{"+k+"} = 2 * "+f.Vektor[k]/2 +" = "+(2*f.Vektor[k]/2)+
                       " n{}� ��������� � ���� 9.";
                     //f.setx1x2(f.x1New(), f.x2New());
                     // nextStep = 9;
                            nextStep = step +1;
                      // nextStep = 9;

                       }
//  nextStep = -1;
                       break;
               //////    22     /////////////////////////////////////////////////////////////////
                        case 176:
                          k++;
               f.setx1x2(f.x1New(k), f.x2New(k));
                                     c = "      �������� �������� � ����� x^{" + k + "}: \u2207f(x^{" + k + "}) = #{" + f.g1Str() + "}{" +
                                                  f.g2Str() + "}";
                                          nextStep = step + 1;
                                          break;
                                  case 177:
                                          c = "     ��������  �������� ���������: \u2225\u2207f(x^{" +
                                               k + "})\u2225 \u2264 \u03b5_{1}; ";
                                          if (f.gNorm() <= f.eps1) {
                                                  c += f.gNormStr() + " \u2264 " + f.eps1Str() + ",n{} ������� �����������, "+
                                                  " ������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +"}e{} - n{}������� ����������� � �������.";
                                                nextStep =-1;
                                          }
                                          else {
                                                if (slozhnost >= 1) {
                                                  c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������. n{}����� ������� %{��������� � ���������� ����}{������� �������} n{}!{choice}{1}";
                                                } else {
                                                  c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������, �� ��������� � ���������� ����";
                                                }
                                                  nextStep = step + 1;
                                          }
                                          break;
                                  case 178:
                                       if ( k < M )
                                       { c = "      �������� ���������� ������� k \u2265 M: k= " + k + " < "+"M = "+ M +"n{}" +
                                          " ������� �� �����������, ������ ��������� � ���������� ����.";

                                         nextStep = step + 1;
                                       }
                                       else

                                       {   c= "     �������� ���������� ������� k \u2265 M: k = " + k + " \u2265 "+ M +" = M  " +"n{}"+
                                           " ������� �����������,n{}������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +
                                             "}e{} - n{}������� ����������� � �������.";
                                             nextStep =-1;

                                         }
                                      break;



                                  case 179:
                                          c = "      ��������� ������� H(x^{" + k + "}) = " + f.hStr() + "";
                                          nextStep = step + 1;
                                          break;
                                  case 180:

                                        c = "     ��������� ������� H(x^{" + k + "})+\u03BC^{"+ k +"}*E = " +f.h_plusStr(k);
                                          nextStep = step + 1;
                                          break;
                                case 181:
                                         c = "      ��������� �������� �������� ������� : n{}"+
                                           " [H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} = " + f.h_1_plusStr(k);
                                         nextStep = step + 1;
                                         break;

                              case 182:
                                         c = "      ������ ���������: n{}"+
                                             "d_{" + k + "} = -[H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} \u2207f(x^{" + k + "}) = - " + f.h_1_plusStr(k) + "#{" +
                                             f.g1Str() + "}{" + f.g2Str() + "} = " + "#{" + f.d1Str() + "}{" + f.d2Str() + "}";

                                         nextStep = step + 1;
                               break;


                                 case 183:
                                  if (slozhnost >= 3) {
                                   c = "     ������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                  k + "} = " +
                                                  "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                  "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                  "#{?{0}}{?{1}} n{}!{field}{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}"+
                                                  "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                                  ;
                                     } else {
                                      c = "      ������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                  k + "} = " +
                                                  "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                  "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                  "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                      }
                                       nextStep = step + 1;
                                        totalPoints++;
                                        break;
                              case 184:

                               if (f.dFuncNorm_a() < f.dFuncNorm_b()) {
                                 c = "       ��������� ���������� ������� f(x^{" + (k + 1) + "}) < f(x^{" + k + "}): n{}"+
                                  "  f(x^{" + (k + 1) + "}) = " + f.dFuncNormStr_a() + " < "+ f.dFuncNormStr_b() + " = f(x^{" + k + "}) "+".n{}"+
                                 " ������� �����������, ������� �������� k = k+1 = "+k+"+1 = "+(k+1)+" ,n{}\u03BC^{"+(k+1)+"} = \u03BC^{"+k+"}/2 = "+f.Vektor[k]/2 +
                                 " n{}� ��������� � ���� 5.";
                              // f.setx1x2(f.x1New(k), f.x2New(k));
                               // nextStep = 5;
                              nextStep = step +1;

                                }
                                 else {
                               c = "      f(x^{" + (k + 1) + "}) = " +f.dFuncNormStr_a() + " > "+ f.dFuncNormStr_b() + " = f(x^{" + k + "})"+".n{}" +
                               " ������� �� �����������, ������� �������� n{}\u03BC^{"+k+"} = 2 * \u03BC^{"+k+"} = 2 * "+f.Vektor[k]/2 +" = "+(2*f.Vektor[k]/2)+
                            " n{}� ��������� � ���� 9.";
                          //f.setx1x2(f.x1New(), f.x2New());
                          // nextStep = 9;
                               nextStep = step +1;
                           // nextStep = 9;

                            }
 // nextStep = -1;
                            break;
                    //////    23     /////////////////////////////////////////////////////////////////
                             case 185:
                               k++;
               f.setx1x2(f.x1New(k), f.x2New(k));
                                          c = "       �������� �������� � ����� x^{" + k + "}: \u2207f(x^{" + k + "}) = #{" + f.g1Str() + "}{" +
                                                       f.g2Str() + "}";
                                               nextStep = step + 1;
                                               break;
                                       case 186:
                                               c = "      ��������  �������� ���������: \u2225\u2207f(x^{" +
                                                    k + "})\u2225 \u2264 \u03b5_{1}; ";
                                               if (f.gNorm() <= f.eps1) {
                                                       c += f.gNormStr() + " \u2264 " + f.eps1Str() + ",n{} ������� �����������, "+
                                                       " ������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +"}e{} - n{}������� ����������� � �������.";
                                                     nextStep =-1;
                                               }
                                               else {
                                                     if (slozhnost >= 1) {
                                                       c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������. n{}����� ������� %{��������� � ���������� ����}{������� �������} n{}!{choice}{1}";
                                                     } else {
                                                       c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������, �� ��������� � ���������� ����";
                                                     }
                                                       nextStep = step + 1;
                                               }
                                               break;
                                       case 187:
                                            if ( k < M )
                                            { c = "      �������� ���������� ������� k \u2265 M: k= " + k + " < "+"M = "+ M +"n{}" +
                                               " ������� �� �����������, ������ ��������� � ���������� ����.";

                                              nextStep = step + 1;
                                            }
                                            else

                                            {   c= "      �������� ���������� ������� k \u2265 M: k = " + k + " \u2265 "+ M +" = M  " +"n{}"+
                                                " ������� �����������,n{}������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +
                                                  "}e{} -n{} ������� ����������� � �������.";
                                                  nextStep =-1;

                                              }
                                           break;



                                       case 188:
                                               c = "      ��������� ������� H(x^{" + k + "}) = " + f.hStr() + "";
                                               nextStep = step + 1;
                                               break;
                                       case 189:

                                             c = "       ��������� ������� H(x^{" + k + "})+\u03BC^{"+ k +"}*E = " +f.h_plusStr(k);
                                               nextStep = step + 1;
                                               break;
                                     case 190:
                                              c = "      ��������� �������� �������� ������� : n{}"+
                                                " [H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} = " + f.h_1_plusStr(k);
                                              nextStep = step + 1;
                                              break;

                                   case 191:
                                              c = "      ������ ���������: n{}"+
                                                  "d_{" + k + "} = -[H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} \u2207f(x^{" + k + "}) = - " + f.h_1_plusStr(k) + "#{" +
                                                  f.g1Str() + "}{" + f.g2Str() + "} = " + "#{" + f.d1Str() + "}{" + f.d2Str() + "}";

                                              nextStep = step + 1;
                                    break;


                                      case 192:
                                       if (slozhnost >= 3) {
                                        c = "     ������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                       k + "} = " +
                                                       "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                       "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                       "#{?{0}}{?{1}} n{}!{field}{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}"+
                                                       "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                                       ;
                                          } else {
                                           c = "     ������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                       k + "} = " +
                                                       "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                       "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                       "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                           }
                                            nextStep = step + 1;
                                             totalPoints++;
                                             break;
                                   case 193:

                                    if (f.dFuncNorm_a() < f.dFuncNorm_b()) {
                                      c = "     ��������� ���������� ������� f(x^{" + (k + 1) + "}) < f(x^{" + k + "}): n{}"+
                                       "  f(x^{" + (k + 1) + "}) = " + f.dFuncNormStr_a() + " < "+ f.dFuncNormStr_b() + " = f(x^{" + k + "}) "+".n{}"+
                                      " ������� �����������, ������� �������� k = k+1 = "+k+"+1 = "+(k+1)+" ,n{}\u03BC^{"+(k+1)+"} = \u03BC^{"+k+"}/2 = "+f.Vektor[k]/2 +
                                      " n{}� ��������� � ���� 5.";
                                  //  f.setx1x2(f.x1New(k), f.x2New(k));
                                    // nextStep = 5;
                                   nextStep = step +1;

                                     }
                                      else {
                                    c = "      f(x^{" + (k + 1) + "}) = " +f.dFuncNormStr_a() + " > "+ f.dFuncNormStr_b() + " = f(x^{" + k + "})"+".n{}" +
                                    " ������� �� �����������, ������� �������� n{}\u03BC^{"+k+"} = 2 * \u03BC^{"+k+"} = 2 * "+f.Vektor[k]/2 +" = "+(2*f.Vektor[k]/2)+
                                 " n{}� ��������� � ���� 9.";
                               //f.setx1x2(f.x1New(), f.x2New());
                               // nextStep = 9;
                                     nextStep = step +1;
                                // nextStep = 9;

                                 }
 //nextStep = -1;
                                 break;
                        //////    24     /////////////////////////////////////////////////////////////////
                                 case 194:
                                   k++;
               f.setx1x2(f.x1New(k), f.x2New(k));
                                              c = "     �������� �������� � ����� x^{" + k + "}: \u2207f(x^{" + k + "}) = #{" + f.g1Str() + "}{" +
                                                            f.g2Str() + "}";
                                                    nextStep = step + 1;
                                                    break;
                                            case 195:
                                                    c = "     ��������  �������� ���������: \u2225\u2207f(x^{" +
                                                         k + "})\u2225 \u2264 \u03b5_{1}; ";
                                                    if (f.gNorm() <= f.eps1) {
                                                            c += f.gNormStr() + " \u2264 " + f.eps1Str() + ",n{} ������� �����������, "+
                                                            " ������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +"}e{} - n{}������� ����������� � �������.";
                                                          nextStep =-1;
                                                    }
                                                    else {
                                                          if (slozhnost >= 1) {
                                                            c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������. n{}����� ������� %{��������� � ���������� ����}{������� �������} n{}!{choice}{1}";
                                                          } else {
                                                            c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������, �� ��������� � ���������� ����";
                                                          }
                                                            nextStep = step + 1;
                                                    }
                                                    break;
                                            case 196:
                                                 if ( k < M )
                                                 { c = "      �������� ���������� ������� k \u2265 M: k= " + k + " < "+"M = "+ M +"n{}" +
                                                    " ������� �� �����������, ������ ��������� � ���������� ����.";

                                                   nextStep = step + 1;
                                                 }
                                                 else

                                                 {   c= "       �������� ���������� ������� k \u2265 M: k = " + k + " \u2265 "+ M +" = M  " +"n{}"+
                                                     " ������� �����������,n{}������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +
                                                       "}e{} -n{} ������� ����������� � �������.";
                                                       nextStep =-1;

                                                   }
                                                break;



                                            case 197:
                                                    c = "       ��������� ������� H(x^{" + k + "}) = " + f.hStr() + "";
                                                    nextStep = step + 1;
                                                    break;
                                            case 198:

                                                  c = "     ��������� ������� H(x^{" + k + "})+\u03BC^{"+ k +"}*E = " +f.h_plusStr(k);
                                                    nextStep = step + 1;
                                                    break;
                                          case 199:
                                                   c = "     ��������� �������� �������� ������� : n{}"+
                                                     " [H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} = " + f.h_1_plusStr(k);
                                                   nextStep = step + 1;
                                                   break;

                                        case 200:
                                                   c = "      ������ ���������: n{}"+
                                                       "d_{" + k + "} = -[H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} \u2207f(x^{" + k + "}) = - " + f.h_1_plusStr(k) + "#{" +
                                                       f.g1Str() + "}{" + f.g2Str() + "} = " + "#{" + f.d1Str() + "}{" + f.d2Str() + "}";

                                                   nextStep = step + 1;
                                         break;


                                           case 201:
                                            if (slozhnost >= 3) {
                                             c = "     ������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                            k + "} = " +
                                                            "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                            "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                            "#{?{0}}{?{1}} n{}!{field}{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}"+
                                                            "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                                            ;
                                               } else {
                                                c = "    ������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                            k + "} = " +
                                                            "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                            "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                            "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                                }
                                                 nextStep = step + 1;
                                                  totalPoints++;
                                                  break;
                                        case 202:

                                         if (f.dFuncNorm_a() < f.dFuncNorm_b()) {
                                           c = "      ��������� ���������� ������� f(x^{" + (k + 1) + "}) < f(x^{" + k + "}): n{}"+
                                            "  f(x^{" + (k + 1) + "}) = " + f.dFuncNormStr_a() + " < "+ f.dFuncNormStr_b() + " = f(x^{" + k + "}) "+".n{}"+
                                           " ������� �����������, ������� �������� k = k+1 = "+k+"+1 = "+(k+1)+" ,n{}\u03BC^{"+(k+1)+"} = \u03BC^{"+k+"}/2 = "+f.Vektor[k]/2 +
                                           " n{}� ��������� � ���� 5.";
                                        // f.setx1x2(f.x1New(k), f.x2New(k));
                                         // nextStep = 5;
                                        nextStep = step +1;

                                          }
                                           else {
                                         c = "      f(x^{" + (k + 1) + "}) = " +f.dFuncNormStr_a() + " > "+ f.dFuncNormStr_b() + " = f(x^{" + k + "})"+".n{}" +
                                        " ������� �� �����������, ������� �������� n{}\u03BC^{"+k+"} = 2 * \u03BC^{"+k+"} = 2 * "+f.Vektor[k]/2 +" = "+(2*f.Vektor[k]/2)+
                                      " n{}� ��������� � ���� 9.";
                                    //f.setx1x2(f.x1New(), f.x2New());
                                    // nextStep = 9;
                                       nextStep = step +1;
                                     // nextStep = 9;

                                      }
 // nextStep = -1;
                                      break;
                              //////    25     /////////////////////////////////////////////////////////////////
                                      case 203:
                                        k++;
               f.setx1x2(f.x1New(k), f.x2New(k));
                                                    c = "    �������� �������� � ����� x^{" + k + "}: \u2207f(x^{" + k + "}) = #{" + f.g1Str() + "}{" +
                                                                 f.g2Str() + "}";
                                                         nextStep = step + 1;
                                                         break;
                                                 case 204:
                                                         c = "      ��������  �������� ���������: \u2225\u2207f(x^{" +
                                                              k + "})\u2225 \u2264 \u03b5_{1}; ";
                                                         if (f.gNorm() <= f.eps1) {
                                                                 c += f.gNormStr() + " \u2264 " + f.eps1Str() + ",n{} ������� �����������, "+
                                                                 " ������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +"}e{} -n{} ������� ����������� � �������.";
                                                               nextStep =-1;
                                                         }
                                                         else {
                                                               if (slozhnost >= 1) {
                                                                 c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������. n{}����� ������� %{��������� � ���������� ����}{������� �������} n{}!{choice}{1}";
                                                               } else {
                                                                 c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������, �� ��������� � ���������� ����";
                                                               }
                                                                 nextStep = step + 1;
                                                         }
                                                         break;
                                                 case 205:
                                                      if ( k < M )
                                                      { c = "      �������� ���������� ������� k \u2265 M: k= " + k + " < "+"M = "+ M +"n{}" +
                                                         " ������� �� �����������, ������ ��������� � ���������� ����.";

                                                        nextStep = step + 1;
                                                      }
                                                      else

                                                      {   c= "      �������� ���������� ������� k \u2265 M: k = " + k + " \u2265 "+ M +" = M  " +"n{}"+
                                                          " ������� �����������,n{}������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +
                                                            "}e{} - n{}������� ����������� � �������.";
                                                            nextStep =-1;

                                                        }
                                                     break;



                                                 case 206:
                                                         c = "       ��������� ������� H(x^{" + k + "}) = " + f.hStr() + "";
                                                         nextStep = step + 1;
                                                         break;
                                                 case 207:

                                                       c = "     ��������� ������� H(x^{" + k + "})+\u03BC^{"+ k +"}*E = " +f.h_plusStr(k);
                                                         nextStep = step + 1;
                                                         break;
                                               case 208:
                                                        c = "      ��������� �������� �������� ������� : n{}"+
                                                          " [H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} = " + f.h_1_plusStr(k);
                                                        nextStep = step + 1;
                                                        break;

                                             case 209:
                                                        c = "       ������ ���������: n{}"+
                                                            "d_{" + k + "} = -[H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} \u2207f(x^{" + k + "}) = - " + f.h_1_plusStr(k) + "#{" +
                                                            f.g1Str() + "}{" + f.g2Str() + "} = " + "#{" + f.d1Str() + "}{" + f.d2Str() + "}";

                                                        nextStep = step + 1;
                                              break;


                                                case 210:
                                                 if (slozhnost >= 3) {
                                                  c = "     ������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                                 k + "} = " +
                                                                 "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                                 "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                                 "#{?{0}}{?{1}} n{}!{field}{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}"+
                                                                 "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                                                 ;
                                                    } else {
                                                     c = "     ������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                                 k + "} = " +
                                                                 "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                                 "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                                 "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                                     }
                                                      nextStep = step + 1;
                                                       totalPoints++;
                                                       break;
                                             case 211:

                                              if (f.dFuncNorm_a() < f.dFuncNorm_b()) {
                                                c = "      ��������� ���������� ������� f(x^{" + (k + 1) + "}) < f(x^{" + k + "}): n{}"+
                                                 "  f(x^{" + (k + 1) + "}) = " + f.dFuncNormStr_a() + " < "+ f.dFuncNormStr_b() + " = f(x^{" + k + "}) "+".n{}"+
                                                " ������� �����������, ������� �������� k = k+1 = "+k+"+1 = "+(k+1)+" ,n{}\u03BC^{"+(k+1)+"} = \u03BC^{"+k+"}/2 = "+f.Vektor[k]/2 +
                                                " n{}� ��������� � ���� 5.";
                                            //  f.setx1x2(f.x1New(k), f.x2New(k));
                                              // nextStep = 5;
                                             nextStep = step +1;

                                               }
                                                else {
                                              c = "     f(x^{" + (k + 1) + "}) = " +f.dFuncNormStr_a() + " > "+ f.dFuncNormStr_b() + " = f(x^{" + k + "})"+".n{}" +
                                             " ������� �� �����������, ������� �������� n{}\u03BC^{"+k+"} = 2 * \u03BC^{"+k+"} = 2 * "+f.Vektor[k]/2 +" = "+(2*f.Vektor[k]/2)+
                                           " n{}� ��������� � ���� 9.";
                                         //f.setx1x2(f.x1New(), f.x2New());
                                         // nextStep = 9;
                                              nextStep = step +1;
                                          // nextStep = 9;

                                           }
  //nextStep = -1;
break;
                                   //////    26    /////////////////////////////////////////////////////////////////
                                           case 212:
                                             k++;
               f.setx1x2(f.x1New(k), f.x2New(k));
                                                         c = "     �������� �������� � ����� x^{" + k + "}: \u2207f(x^{" + k + "}) = #{" + f.g1Str() + "}{" +
                                                                      f.g2Str() + "}";
                                                              nextStep = step + 1;
                                                              break;
                                                      case 213:
                                                              c = "    ��������  �������� ���������: \u2225\u2207f(x^{" +
                                                                   k + "})\u2225 \u2264 \u03b5_{1}; ";
                                                              if (f.gNorm() <= f.eps1) {
                                                                      c += f.gNormStr() + " \u2264 " + f.eps1Str() + ",n{} ������� �����������, "+
                                                                      " ������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +"}e{} - n{}������� ����������� � �������.";
                                                                    nextStep =-1;
                                                              }
                                                              else {
                                                                    if (slozhnost >= 1) {
                                                                      c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������. n{}����� ������� %{��������� � ���������� ����}{������� �������} n{}!{choice}{1}";
                                                                    } else {
                                                                      c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������, �� ��������� � ���������� ����";
                                                                    }
                                                                      nextStep = step + 1;
                                                              }
                                                              break;
                                                      case 214:
                                                           if ( k < M )
                                                           { c = "      �������� ���������� ������� k \u2265 M: k= " + k + " < "+"M = "+ M +"n{}" +
                                                              " ������� �� �����������, ������ ��������� � ���������� ����.";

                                                             nextStep = step + 1;
                                                           }
                                                           else

                                                           {   c= "      �������� ���������� ������� k \u2265 M: k = " + k + " \u2265 "+ M +" = M  " +"n{}"+
                                                               " ������� �����������,n{}������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +
                                                                 "}e{} - n{}������� ����������� � �������.";
                                                                 nextStep =-1;

                                                             }
                                                          break;



                                                      case 215:
                                                              c = "    ��������� ������� H(x^{" + k + "}) = " + f.hStr() + "";
                                                              nextStep = step + 1;
                                                              break;
                                                      case 216:

                                                            c = "     ��������� ������� H(x^{" + k + "})+\u03BC^{"+ k +"}*E = " +f.h_plusStr(k);
                                                              nextStep = step + 1;
                                                              break;
                                                    case 217:
                                                             c = "     ��������� �������� �������� ������� : n{}"+
                                                               " [H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} = " + f.h_1_plusStr(k);
                                                             nextStep = step + 1;
                                                             break;

                                                  case 218:
                                                             c = "       ������ ���������: n{}"+
                                                                 "d_{" + k + "} = -[H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} \u2207f(x^{" + k + "}) = - " + f.h_1_plusStr(k) + "#{" +
                                                                 f.g1Str() + "}{" + f.g2Str() + "} = " + "#{" + f.d1Str() + "}{" + f.d2Str() + "}";

                                                             nextStep = step + 1;
                                                   break;


                                                     case 219:
                                                      if (slozhnost >= 3) {
                                                       c = "      ������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                                      k + "} = " +
                                                                      "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                                      "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                                      "#{?{0}}{?{1}} n{}!{field}{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}"+
                                                                      "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                                                      ;
                                                         } else {
                                                          c = "     ������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                                      k + "} = " +
                                                                      "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                                      "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                                      "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                                          }
                                                           nextStep = step + 1;
                                                            totalPoints++;
                                                            break;
                                                  case 220:

                                                   if (f.dFuncNorm_a() < f.dFuncNorm_b()) {
                                                     c = "       ��������� ���������� ������� f(x^{" + (k + 1) + "}) < f(x^{" + k + "}): n{}"+
                                                      "  f(x^{" + (k + 1) + "}) = " + f.dFuncNormStr_a() + " < "+ f.dFuncNormStr_b() + " = f(x^{" + k + "}) "+".n{}"+
                                                     " ������� �����������, ������� �������� k = k+1 = "+k+"+1 = "+(k+1)+" ,n{}\u03BC^{"+(k+1)+"} = \u03BC^{"+k+"}/2 = "+f.Vektor[k]/2 +
                                                     " n{}� ��������� � ���� 5.";
                                                //   f.setx1x2(f.x1New(k), f.x2New(k));
                                                   // nextStep = 5;
                                                  nextStep = step +1;

                                                    }
                                                     else {
                                                   c = "       f(x^{" + (k + 1) + "}) = " +f.dFuncNormStr_a() + " > "+ f.dFuncNormStr_b() + " = f(x^{" + k + "})"+".n{}" +
                                                   " ������� �� �����������, ������� �������� n{}\u03BC^{"+k+"} = 2 * \u03BC^{"+k+"} = 2 * "+f.Vektor[k]/2 +" = "+(2*f.Vektor[k]/2)+
                                                " n{}� ��������� � ���� 9.";
                                              //f.setx1x2(f.x1New(), f.x2New());
                                              // nextStep = 9;
                                                 nextStep = step +1;
                                               // nextStep = 9;

                                                }
 // nextStep = -1;
                                                break;
                                        //////    27     /////////////////////////////////////////////////////////////////
                                                 case 221:
                                                   k++;
               f.setx1x2(f.x1New(k), f.x2New(k));
                                                              c = "      �������� �������� � ����� x^{" + k + "}: \u2207f(x^{" + k + "}) = #{" + f.g1Str() + "}{" +
                                                                           f.g2Str() + "}";
                                                                   nextStep = step + 1;
                                                                   break;
                                                           case 222:
                                                                   c = "      ��������  �������� ���������: \u2225\u2207f(x^{" +
                                                                        k + "})\u2225 \u2264 \u03b5_{1}; ";
                                                                   if (f.gNorm() <= f.eps1) {
                                                                           c += f.gNormStr() + " \u2264 " + f.eps1Str() + ",n{} ������� �����������, "+
                                                                           " ������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +"}e{} -n{} ������� ����������� � �������.";
                                                                         nextStep =-1;
                                                                   }
                                                                   else {
                                                                         if (slozhnost >= 1) {
                                                                           c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������. n{}����� ������� %{��������� � ���������� ����}{������� �������} n{}!{choice}{1}";
                                                                         } else {
                                                                           c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������, �� ��������� � ���������� ����";
                                                                         }
                                                                           nextStep = step + 1;
                                                                   }
                                                                   break;
                                                           case 223:
                                                                if ( k < M )
                                                                { c = "      �������� ���������� ������� k \u2265 M: k= " + k + " < "+"M = "+ M +"n{}" +
                                                                   " ������� �� �����������, ������ ��������� � ���������� ����.";

                                                                  nextStep = step + 1;
                                                                }
                                                                else

                                                                {   c= "      �������� ���������� ������� k \u2265 M: k = " + k + " \u2265 "+ M +" = M  " +"n{}"+
                                                                    " ������� �����������,n{}������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +
                                                                      "}e{} - n{}������� ����������� � �������.";
                                                                      nextStep =-1;

                                                                  }
                                                               break;



                                                           case 224:
                                                                   c = "      ��������� ������� H(x^{" + k + "}) = " + f.hStr() + "";
                                                                   nextStep = step + 1;
                                                                   break;
                                                           case 225:

                                                                 c = "     ��������� ������� H(x^{" + k + "})+\u03BC^{"+ k +"}*E = " +f.h_plusStr(k);
                                                                   nextStep = step + 1;
                                                                   break;
                                                         case 226:
                                                                  c = "      ��������� �������� �������� ������� : n{}"+
                                                                    " [H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} = " + f.h_1_plusStr(k);
                                                                  nextStep = step + 1;
                                                                  break;

                                                       case 227:
                                                                  c = "      ������ ���������: n{}"+
                                                                      "d_{" + k + "} = -[H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} \u2207f(x^{" + k + "}) = - " + f.h_1_plusStr(k) + "#{" +
                                                                      f.g1Str() + "}{" + f.g2Str() + "} = " + "#{" + f.d1Str() + "}{" + f.d2Str() + "}";

                                                                  nextStep = step + 1;
                                                        break;


                                                          case 228:
                                                           if (slozhnost >= 3) {
                                                            c = "     ������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                                           k + "} = " +
                                                                           "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                                           "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                                           "#{?{0}}{?{1}} n{}!{field}{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}"+
                                                                           "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                                                           ;
                                                              } else {
                                                               c = "     ������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                                           k + "} = " +
                                                                           "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                                           "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                                           "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                                               }
                                                                nextStep = step + 1;
                                                                 totalPoints++;
                                                                 break;
                                                       case 229:

                                                        if (f.dFuncNorm_a() < f.dFuncNorm_b()) {
                                                          c = "       ��������� ���������� ������� f(x^{" + (k + 1) + "}) < f(x^{" + k + "}): n{}"+
                                                           "  f(x^{" + (k + 1) + "}) = " + f.dFuncNormStr_a() + " < "+ f.dFuncNormStr_b() + " = f(x^{" + k + "}) "+".n{}"+
                                                          " ������� �����������, ������� �������� k = k+1 = "+k+"+1 = "+(k+1)+" ,n{}\u03BC^{"+(k+1)+"} = \u03BC^{"+k+"}/2 = "+f.Vektor[k]/2 +
                                                          " n{}� ��������� � ���� 5.";
                                                       // f.setx1x2(f.x1New(k), f.x2New(k));
                                                        // nextStep = 5;
                                                       nextStep = step +1;
                                                       k++;

                                                         }
                                                          else {
                                                        c = "      f(x^{" + (k + 1) + "}) = " +f.dFuncNormStr_a() + " > "+ f.dFuncNormStr_b() + " = f(x^{" + k + "})"+".n{}" +
                                                       " ������� �� �����������, ������� �������� n{}\u03BC^{"+k+"} = 2 * \u03BC^{"+k+"} = 2 * "+f.Vektor[k]/2 +" = "+(2*f.Vektor[k]/2)+
                                                     " n{}� ��������� � ���� 9.";
                                                   //f.setx1x2(f.x1New(), f.x2New());
                                                   // nextStep = 9;
                                                         nextStep = step +1;
                                                    // nextStep = 9;

                                                     }
  nextStep = -1;
                                                     break;
                                             //////    28     /////////////////////////////////////////////////////////////////
    /*                                                  case 230:
                                                                   c = "�������� �������� � ����� x^{" + k + "}: \u2207f(x^{" + k + "}) = #{" + f.g1Str() + "}{" +
                                                                                f.g2Str() + "}";
                                                                        nextStep = step + 1;
                                                                        break;
                                                                case 231:
                                                                        c = "��������  �������� ���������: \u2225\u2207f(x^{" +
                                                                             k + "})\u2225 \u2264 \u03b5_{1}; ";
                                                                        if (f.gNorm() <= f.eps1) {
                                                                                c += f.gNormStr() + " \u2264 " + f.eps1Str() + ",n{} ������� �����������, "+
                                                                                " ������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +"}e{} - ������� ����������� � �������.";
                                                                              nextStep =-1;
                                                                        }
                                                                        else {
                                                                              if (slozhnost >= 1) {
                                                                                c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������. n{}����� ������� %{��������� � ���������� ����}{������� �������} n{}!{choice}{1}";
                                                                              } else {
                                                                                c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������, �� ��������� � ���������� ����";
                                                                              }
                                                                                nextStep = step + 1;
                                                                        }
                                                                        break;
                                                                case 232:
                                                                     if ( k < M )
                                                                     { c = " �������� ���������� ������� k \u2265 M: k= " + k + " < "+"M = "+ M +"n{}" +
                                                                        " ������� �� �����������, ������ ��������� � ���������� ����.";

                                                                       nextStep = step + 1;
                                                                     }
                                                                     else

                                                                     {   c= " �������� ���������� ������� k \u2265 M: k = " + k + " \u2265 "+ M +" = M  " +"n{}"+
                                                                         " ������� �����������,n{}������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +
                                                                           "}e{} - ������� ����������� � �������.";
                                                                           nextStep =-1;

                                                                       }
                                                                    break;



                                                                case 233:
                                                                        c = "��������� ������� H(x^{" + k + "}) = " + f.hStr() + "";
                                                                        nextStep = step + 1;
                                                                        break;
                                                                case 234:

                                                                      c = "  ��������� ������� H(x^{" + k + "})+\u03BC^{"+ k +"}*E = " +f.h_plusStr(26);
                                                                        nextStep = step + 1;
                                                                        break;
                                                              case 235:
                                                                       c = "  ��������� �������� �������� ������� : n{}"+
                                                                         " [H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} = " + f.h_1_plusStr(26);
                                                                       nextStep = step + 1;
                                                                       break;

                                                            case 236:
                                                                       c = " ������ ���������: n{}"+
                                                                           "d_{" + k + "} = -[H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} \u2207f(x^{" + k + "}) = - " + f.h_1_plusStr(26) + "#{" +
                                                                           f.g1Str() + "}{" + f.g2Str() + "} = " + "#{" + f.d1Str() + "}{" + f.d2Str() + "}";

                                                                       nextStep = step + 1;
                                                             break;


                                                               case 337:
                                                                if (slozhnost >= 3) {
                                                                 c = "������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                                                k + "} = " +
                                                                                "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                                                "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                                                "#{?{0}}{?{1}} n{}!{field}{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}"+
                                                                                "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                                                                ;
                                                                   } else {
                                                                    c = "������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                                                k + "} = " +
                                                                                "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                                                "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                                                "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                                                    }
                                                                     nextStep = step + 1;
                                                                      totalPoints++;
                                                                      break;
                                                            case 338:

                                                             if (f.dFuncNorm_a() < f.dFuncNorm_b()) {
                                                               c = "  ��������� ���������� ������� f(x^{" + (k + 1) + "}) < f(x^{" + k + "}): n{}"+
                                                                "  f(x^{" + (k + 1) + "}) = " + f.dFuncNormStr_a() + " < "+ f.dFuncNormStr_b() + " = f(x^{" + k + "}) "+".n{}"+
                                                               " ������� �����������, ������� �������� k = k+1 = "+k+"+1 = "+(k+1)+" ,n{}\u03BC^{"+(k+1)+"} = \u03BC^{"+k+"}/2 = "+f.Vektor[26]/2 +
                                                               " n{}� ��������� � ���� 5.";
                                                             f.setx1x2(f.x1New(), f.x2New());
                                                             // nextStep = 5;
                                                            nextStep = step +1;

                                                              }
                                                               else {
                                                             c = "  f(x^{" + (k + 1) + "}) = " +f.dFuncNormStr_a() + " > "+ f.dFuncNormStr_b() + " = f(x^{" + k + "})"+".n{}" +
                                                            " ������� �� �����������, ������� �������� \u03BC^{"+k+"} = 2 * \u03BC^{"+k+"}" +
                                                          " n{}� ��������� � ���� 9.";
                                                        //f.setx1x2(f.x1New(), f.x2New());
                                                        // nextStep = 9;
                                                              nextStep = -1;
                                                         // nextStep = 9;

                                                          }
 // nextStep = -1;
                                                          break;
                                                 //////    29     /////////////////////////////////////////////////////////////////
                                                       case 239:
                                                                        c = "�������� �������� � ����� x^{" + k + "}: \u2207f(x^{" + k + "}) = #{" + f.g1Str() + "}{" +
                                                                                     f.g2Str() + "}";
                                                                             nextStep = step + 1;
                                                                             break;
                                                                     case 240:
                                                                             c = "��������  �������� ���������: \u2225\u2207f(x^{" +
                                                                                  k + "})\u2225 \u2264 \u03b5_{1}; ";
                                                                             if (f.gNorm() <= f.eps1) {
                                                                                     c += f.gNormStr() + " \u2264 " + f.eps1Str() + ",n{} ������� �����������, "+
                                                                                     " ������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +"}e{} - ������� ����������� � �������.";
                                                                                   nextStep =-1;
                                                                             }
                                                                             else {
                                                                                   if (slozhnost >= 1) {
                                                                                     c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������. n{}����� ������� %{��������� � ���������� ����}{������� �������} n{}!{choice}{1}";
                                                                                   } else {
                                                                                     c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������, �� ��������� � ���������� ����";
                                                                                   }
                                                                                     nextStep = step + 1;
                                                                             }
                                                                             break;
                                                                     case 241:
                                                                          if ( k < M )
                                                                          { c = " �������� ���������� ������� k \u2265 M: k= " + k + " < "+"M = "+ M +"n{}" +
                                                                             " ������� �� �����������, ������ ��������� � ���������� ����.";

                                                                            nextStep = step + 1;
                                                                          }
                                                                          else

                                                                          {   c= " �������� ���������� ������� k \u2265 M: k = " + k + " \u2265 "+ M +" = M  " +"n{}"+
                                                                              " ������� �����������,n{}������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +
                                                                                "}e{} - ������� ����������� � �������.";
                                                                                nextStep =-1;

                                                                            }
                                                                         break;



                                                                     case 242:
                                                                             c = "��������� ������� H(x^{" + k + "}) = " + f.hStr() + "";
                                                                             nextStep = step + 1;
                                                                             break;
                                                                     case 243:

                                                                           c = "  ��������� ������� H(x^{" + k + "})+\u03BC^{"+ k +"}*E = " +f.h_plusStr(27);
                                                                             nextStep = step + 1;
                                                                             break;
                                                                   case 244:
                                                                            c = "  ��������� �������� �������� ������� : n{}"+
                                                                              " [H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} = " + f.h_1_plusStr(27);
                                                                            nextStep = step + 1;
                                                                            break;

                                                                 case 245:
                                                                            c = " ������ ���������: n{}"+
                                                                                "d_{" + k + "} = -[H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} \u2207f(x^{" + k + "}) = - " + f.h_1_plusStr(27) + "#{" +
                                                                                f.g1Str() + "}{" + f.g2Str() + "} = " + "#{" + f.d1Str() + "}{" + f.d2Str() + "}";

                                                                            nextStep = step + 1;
                                                                  break;


                                                                    case 246:
                                                                     if (slozhnost >= 3) {
                                                                      c = "������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                                                     k + "} = " +
                                                                                     "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                                                     "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                                                     "#{?{0}}{?{1}} n{}!{field}{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}"+
                                                                                     "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                                                                     ;
                                                                        } else {
                                                                         c = "������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                                                     k + "} = " +
                                                                                     "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                                                     "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                                                     "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                                                         }
                                                                          nextStep = step + 1;
                                                                           totalPoints++;
                                                                           break;
                                                                 case 247:

                                                                  if (f.dFuncNorm_a() < f.dFuncNorm_b()) {
                                                                    c = "  ��������� ���������� ������� f(x^{" + (k + 1) + "}) < f(x^{" + k + "}): n{}"+
                                                                     "  f(x^{" + (k + 1) + "}) = " + f.dFuncNormStr_a() + " < "+ f.dFuncNormStr_b() + " = f(x^{" + k + "}) "+".n{}"+
                                                                    " ������� �����������, ������� �������� k = k+1 = "+k+"+1 = "+(k+1)+" ,n{}\u03BC^{"+(k+1)+"} = \u03BC^{"+k+"}/2 = "+f.Vektor[27]/2 +
                                                                    " n{}� ��������� � ���� 5.";
                                                                  f.setx1x2(f.x1New(), f.x2New());
                                                                  // nextStep = 5;
                                                                 nextStep = step +1;

                                                                   }
                                                                    else {
                                                                  c = "  f(x^{" + (k + 1) + "}) = " +f.dFuncNormStr_a() + " > "+ f.dFuncNormStr_b() + " = f(x^{" + k + "})"+".n{}" +
                                                                 " ������� �� �����������, ������� �������� \u03BC^{"+k+"} = 2 * \u03BC^{"+k+"}" +
                                                               " n{}� ��������� � ���� 9.";
                                                             //f.setx1x2(f.x1New(), f.x2New());
                                                             // nextStep = 9;
                                                                   nextStep = -1;
                                                              // nextStep = 9;

                                                               }
//  nextStep = -1;
                                                               break;
                                                       //////    30     /////////////////////////////////////////////////////////////////
                                                                case 248:
                                                                             c = "�������� �������� � ����� x^{" + k + "}: \u2207f(x^{" + k + "}) = #{" + f.g1Str() + "}{" +
                                                                                          f.g2Str() + "}";
                                                                                  nextStep = step + 1;
                                                                                  break;
                                                                          case 249:
                                                                                  c = "��������  �������� ���������: \u2225\u2207f(x^{" +
                                                                                       k + "})\u2225 \u2264 \u03b5_{1}; ";
                                                                                  if (f.gNorm() <= f.eps1) {
                                                                                          c += f.gNormStr() + " \u2264 " + f.eps1Str() + ",n{} ������� �����������, "+
                                                                                          " ������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +"}e{} - ������� ����������� � �������.";
                                                                                        nextStep =-1;
                                                                                  }
                                                                                  else {
                                                                                        if (slozhnost >= 1) {
                                                                                          c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������. n{}����� ������� %{��������� � ���������� ����}{������� �������} n{}!{choice}{1}";
                                                                                        } else {
                                                                                          c +=f.gNormStr() + " > " + f.eps1Str() + ",n{} ������� �� �����������, �� ��������� � ���������� ����";
                                                                                        }
                                                                                          nextStep = step + 1;
                                                                                  }
                                                                                  break;
                                                                          case 250:
                                                                               if ( k < M )
                                                                               { c = " �������� ���������� ������� k \u2265 M: k= " + k + " < "+"M = "+ M +"n{}" +
                                                                                  " ������� �� �����������, ������ ��������� � ���������� ����.";

                                                                                 nextStep = step + 1;
                                                                               }
                                                                               else

                                                                               {   c= " �������� ���������� ������� k \u2265 M: k = " + k + " \u2265 "+ M +" = M  " +"n{}"+
                                                                                   " ������� �����������,n{}������ r{}x^{*} = x_{" + (k) +"} = #{" + f.x1Str() + "}{" + f.x2Str() +
                                                                                     "}e{} - ������� ����������� � �������.";
                                                                                     nextStep =-1;

                                                                                 }
                                                                              break;



                                                                          case 251:
                                                                                  c = "��������� ������� H(x^{" + k + "}) = " + f.hStr() + "";
                                                                                  nextStep = step + 1;
                                                                                  break;
                                                                          case 252:

                                                                                c = "  ��������� ������� H(x^{" + k + "})+\u03BC^{"+ k +"}*E = " +f.h_plusStr(28);
                                                                                  nextStep = step + 1;
                                                                                  break;
                                                                        case 253:
                                                                                 c = "  ��������� �������� �������� ������� : n{}"+
                                                                                   " [H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} = " + f.h_1_plusStr(28);
                                                                                 nextStep = step + 1;
                                                                                 break;

                                                                      case 254:
                                                                                 c = " ������ ���������: n{}"+
                                                                                     "d_{" + k + "} = -[H(x^{" + k + "})+\u03BC^{"+ k +"}*E]^{-1} \u2207f(x^{" + k + "}) = - " + f.h_1_plusStr(28) + "#{" +
                                                                                     f.g1Str() + "}{" + f.g2Str() + "} = " + "#{" + f.d1Str() + "}{" + f.d2Str() + "}";

                                                                                 nextStep = step + 1;
                                                                       break;


                                                                         case 255:
                                                                          if (slozhnost >= 3) {
                                                                           c = "������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                                                          k + "} = " +
                                                                                          "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                                                          "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                                                          "#{?{0}}{?{1}} n{}!{field}{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}"+
                                                                                          "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                                                                          ;
                                                                             } else {
                                                                              c = "������� ����� x^{" + (k + 1) + "} = x^{" + k + "} + d^{" +
                                                                                          k + "} = " +
                                                                                          "#{" + f.x1Str() + "}{" + f.x2Str() + "} + " +
                                                                                          "#{" + f.d1Str() + "}{" + f.d2Str() + "} = " +
                                                                                          "#{"+ f.x1NewStr()+"}{"+ f.x2NewStr()+"}";
                                                                              }
                                                                               nextStep = step + 1;
                                                                                totalPoints++;
                                                                                break;
                                                                      case 256:

                                                                       if (f.dFuncNorm_a() < f.dFuncNorm_b()) {
                                                                         c = "  ��������� ���������� ������� f(x^{" + (k + 1) + "}) < f(x^{" + k + "}): n{}"+
                                                                          "  f(x^{" + (k + 1) + "}) = " + f.dFuncNormStr_a() + " < "+ f.dFuncNormStr_b() + " = f(x^{" + k + "}) "+".n{}"+
                                                                         " ������� �����������, ������� �������� k = k+1 = "+k+"+1 = "+(k+1)+" ,n{}\u03BC^{"+(k+1)+"} = \u03BC^{"+k+"}/2 = "+f.Vektor[28]/2 +
                                                                         " n{}� ��������� � ���� 5.";
                                                                       f.setx1x2(f.x1New(), f.x2New());
                                                                       // nextStep = 5;
                                                                      nextStep = step +1;

                                                                        }
                                                                         else {
                                                                       c = "  f(x^{" + (k + 1) + "}) = " +f.dFuncNormStr_a() + " > "+ f.dFuncNormStr_b() + " = f(x^{" + k + "})"+".n{}" +
                                                                      " ������� �� �����������, ������� �������� \u03BC^{"+k+"} = 2 * \u03BC^{"+k+"}" +
                                                                    " n{}� ��������� � ���� 9.";
                                                                  //f.setx1x2(f.x1New(), f.x2New());
                                                                  // nextStep = 9;
                                                                        nextStep = -1;
                                                                   // nextStep = 9;

                                                                    }
 nextStep = -1;
                                                                    break;
*/
    /*       case 257:
                       c = "����� r{}x^{*} = x^{" + (k) +
                        "} = #{" + f.x1NewStr() + "}{" + f.x2NewStr() +
                        "} e{}- ������� �����������.";
                        nextStep = -1;
                         break;*/




                 default:
                  c = "���������s� ����� ����� ���� - ����� ��-��-��-��-��!!";


                }
        }
        public DrawPanel_un() {
                try {
                        jbInit();
                } catch (Exception ex) {
                        ex.printStackTrace();
                }
                Stringer_un.setPanel(this);
        }
        void jbInit() throws Exception {
                this.setBackground(ColorFon);
                this.setLayout(null);
///////////////////////// begin ///////////////////////////////////
                generateVariantList();
                variantCounter = 1000;
                nextVariant();
///////////////////////// end ///////////////////////////////////
        }
        protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.translate (0, 50);
                Stringer_un.setGraphics(g);
                LevelLines_un.setGraphics(g);
                //paneli
                g.setColor(ColorPanelFon);
                g.fillRect(xOff, yOff, xLen, yLen);
                g.fillRect(xOff+xLen+18, yOff, 493-xLen+60, 57+20);
                g.fillRect(xOff+xLen+18, yOff+57+40, 493-xLen+60, 115+60);
                g.fillRect(xOff+xLen+18, yOff+57+20+130+25+60, 493-xLen, 38);
                g.fillRect(xOff, yOff+yLen+20, xOff+511+60, 125);
                g.setColor(ColorPanelRamka);
                g.drawRect(xOff, yOff, xLen, yLen);
                g.drawRect(xOff+xLen+18, yOff, 493-xLen+60, 57+20);
                g.drawRect(xOff+xLen+18, yOff+57+40, 493-xLen+60, 115+60);
                g.drawRect(xOff+xLen+18, yOff+57+20+130+25+60, 493-xLen, 38);
                g.drawRect(xOff, yOff+yLen+20, xOff+511+60, 125);
                g2d.setClip(xOff, yOff, xLen, yLen);
//system koordinat
                drawAxes(g);
//risuet  strelki
                g2d.setClip(null);
//pishet nadpis
                g2d.setColor(ColorSolutionText);
//shag
                if(step>0 && step!=0 && step!=2 && step!=4 && step!=6 && step!=7
                  && step!=8 && step!=9 && step!=12) {
                  g2d.setFont(FontSolutionNumber);
                      g2d.setColor(ColorSolutionNumber);
                  g2d.drawString("" + k + "." + step + "", 5, yOff+yLen+20+20+10);
                  g2d.setColor(ColorSolutionText);
                  g2d.setFont(FontSolutionText);
                  Stringer_un.drawString(c, 40, yOff+yLen+20+20+10);
                }
                if(step==2 || step==4 || step==6 || step==7
                  || step==8 || step==9 ||step==12){
                  g2d.setFont(FontSolutionNumber);
                      g2d.setColor(ColorSolutionNumber);
                  g2d.drawString("" + k + "." + step + "", 5, yOff+yLen+20+20+15+10);
                  g2d.setColor(ColorSolutionText);
                  g2d.setFont(FontSolutionText);
                  Stringer_un.drawString(c, 40, yOff+yLen+20+20+15+10);
                }
                if(step==0) Stringer_un.drawString(c, 20, yOff+yLen+20+20+10);
//risuet linii urovnja
                for (int i = 0; i < nPoints; ++i) {LevelLines_un.drawLevelLine(x1[i], x2[i]);}
//risuet tocki
                g2d.setClip(xOff, yOff, xLen, yLen);
                g2d.setColor(Color.red);
                int x = 0, y = 0, xLast = -1, yLast = -1;
                x = xOff + xCen + (int)(xEnd * scale);
                y = yOff + yCen - (int)(yEnd * scale);
                g2d.fillOval(x-2, y-2, 5, 5);
                for (int i = 0; i < totalPoints; ++i) {
                        g2d.setColor(i == totalPoints - 1 ? Color.red : ColorSolutionNumber);
                        x = xOff + xCen + (int) (scale * x1[i]);
                        y = yOff + yCen - (int) (scale * x2[i]);
                        g2d.fillOval(x - 2, y - 2, 5, 5);
                        if (i > 0) g2d.drawLine(x, y, xLast, yLast);
                        xLast = x;
                        yLast = y;
                        Stringer_un.drawString("x^{" + i + "}", x -5, y -5);
                }
                g2d.setClip(null);
                if(nextStep == -1) { Stringer_un.drawString("x^{*}=", x -5, y -5);}
                Stringer_un.setFontSizes(12, 11, 8);




//��������� ������




                sc(g, new int[]{1}, xOff+xLen+18+7, yOff+15+2);
////////////////////////////////////////// FIX 'x1[variant]' ...
                Stringer_un.drawString("x^{0} = (" + x1[0] + "; " + x2[0] + ")^{T} ", xOff+xLen+18+10, yOff+15+4);
                sc(g, new int[]{1}, xOff+xLen+18+7, yOff+30+2);
                Stringer_un.drawString("\u03b5_{1} = " + f.eps1, xOff+xLen+18+10, yOff+34);
                sc(g, new int[]{1},xOff+xLen+18+7, yOff+45+2);
              // g2d.setColor(ColorSolutionText);
                Stringer_un.drawString("- ��������� �����", xOff+xLen+18+100, yOff+15+4);
                Stringer_un.drawString("- ����� �����", xOff+xLen+100, yOff+15+19);
                Stringer_un.drawString("M = "+M+ "  - ����� ��������", xOff+xLen+28, yOff+42+10);
                Stringer_un.drawString("\u03BC^{0} = "+m+ " -������������� �����", xOff+xLen+28, yOff+42+30);
//� ��������
                sc(g, new int[]{12,21,30,39,48,57,66,75,84,93,102,111,120,129,138,147,156,165,174,183,192,201,210,219,228,237,246,255,264,273,282,291,300,309}, xOff+xLen+18+7, yOff+57+20+30-2);
                Stringer_un.drawString("x^{k+1} = x^{k} + d^{k}", xOff+xLen+18+10, yOff+57+20+40);
                sc(g, new int[]{11,20,29,38,47,56,65,74,83,92,101,110,119,128,137,146,155,164,173,182,191,200,209,218,227,236,245,254,263,272,281,290,299,308}, xOff+xLen+18+7, yOff+57+20+60-2);
                Stringer_un.drawString("d^{k} = -[H(x^{k})+\u03BC^{k}*E]^{-1}\u2207f(x^{k})",xOff+xLen+18+10,yOff+57+20+62);
//� ��������
                sc(g, new int[]{6,15,24,33,42,51,60,69,78,87,96,105,114,123,132,141,150,159,168,177,186,195,204,213,222,231,240,249,258,267,276,285,294,303}, xOff+xLen+18+7, yOff+54+20+90-2);
                Stringer_un.drawString("||\u2207f(x^{k})|| \u2264 \u03b5_{1}", xOff+xLen+18+10, yOff+57+20+84);
                sc(g, new int[]{7,16,25,34,43,52,61,70,79,88,97,106,115,124,133,142,151,160,169,178,187,196,205,214,223,232,241,250,259,268,277,286,295,304}, xOff+xLen+18+7, yOff+54+20+105-2);
                Stringer_un.drawString("k \u2265 M ", xOff+xLen+18+10, yOff+57+20+106);
                sc(g, new int[]{13,22,31,40,49,58,67,76,85,94,103,112,121,130,139,148,157,166,175,184,193,202,211,220,229,238,247,256,265,274,283,292,301,310}, xOff+xLen+18+7, yOff+57+20+120-2);
                Stringer_un.drawString("f(x^{k+1}) < f(x^{k})", xOff+xLen+18+10, yOff+57+20+128);
                Stringer_un.drawString("\u03BC^{k+1} = \u03BC^{k}/2", xOff+xLen+140, yOff+69+20+90+10);
                Stringer_un.drawString("\u002B", xOff+xLen+120, yOff+69+20+92+10);
                g.drawLine(xOff+xLen+110,yOff+69+20+100+10,xOff+xLen+135,yOff+69+20+90+10);

                sc(g, new int[]{2,5,14,23,32,41,50,59,68,77,86,95,104,113,122,131,140,149,158,167,176,185,194,203,212,221,230,239,248,257,266,275,284,293,302,311}, xOff+xLen+18+7, yOff+54+40+128);
                Stringer_un.drawString("\u2207f(x^{k})", xOff+xLen+18+10, yOff+57+20+128+20);
                sc(g, new int[]{3,8,17,26,35,44,53,62,71,80,89,98,107,116,125,134,143,152,161,170,179,188,197,206,215,224,233,242,251,260,269,278,287,296,305}, xOff+xLen+18+7, yOff+54+60+128);
                Stringer_un.drawString("H(x^{k})", xOff+xLen+18+10, yOff+57+20+128+40);
               sc(g, new int[]{9,18,27,36,45,54,63,72,81,90,99,108,117,126,135,144,153,162,171,180,189,198,207,216,225,234,243,252,261,270,279,288,297,306,315}, xOff+xLen+18+7, yOff+54+20+128+60);
                Stringer_un.drawString("H(x^{k}) + \u03BC^{k} * E   ;", xOff+xLen+18+10, yOff+54+20+128+60);
                sc(g, new int[]{10,19,28,37,46,55,64,73,82,91,100,109,118,127,136,145,154,163,172,181,190,199,208,217,226,235,244,253,262,271,280,289,298,307}, xOff+xLen+120+9, yOff+50+20+128+60);
                Stringer_un.drawString("[H(x^{k}) + \u03BC^{k} * E]^{-1}", xOff+xLen+18+10+100, yOff+54+20+128+60);
                /////////////////////////////////////////////
               // Stringer_un.drawString("d^{k} = -[H(x^{k})+\u03BC^{k}*E]^{-1}\u2207f(x^{k})",xOff+xLen+28+5,yOff+69+20+45);

              //sc(g, new int[]{7,16,25,34,43,52,61,70,79,88,97,106,115,124,133,142,151,160,169,178,187,196,205}, xOff+xLen+18+9, yOff+69+20+130);
              //Stringer_un.drawString("k \u2265 M         (E - ��������� �������)", xOff+xLen+28+5, yOff+69+20+140);

            //  sc(g, new int[]{6,15,24,33,42,51,60,69,78,87,96,105,114,123,132,141,150,159,168,177,186,195,204}, xOff+xLen+18+9, yOff+69+20+61);
             //  Stringer_un.drawString("||\u2207f(x^{k})|| \u2264 \u03b5_{1}", xOff+xLen+28+5, yOff+69+20+70);

              // sc(g, new int[]{13,22,31,40,49,58,67,76,85,94,103,112,121,130,139,148,157,166,175,184,193,202}, xOff+xLen+18+9, yOff+69+111);
                 //  Stringer_un.drawString("f(x^{k+1}) < f(x^{k})", xOff+xLen+28+5, yOff+69+20+105);
                 sc(g, new int[]{100}, xOff+xLen+18+7, yOff+65+20+90+10);



              //  sc(g, new int[]{0}, xOff+xLen+18+9, yOff+69+111);
              Stringer_un.drawString("\u03BC^{k+1} = 2*\u03BC^{k}", xOff+xLen+140, yOff+69+20+120+10);
            // g.setColor(Color.black);
               Stringer_un.drawString("\u2013", xOff+xLen+120, yOff+69+20+115+10);
            g.drawLine(xOff+xLen+110,yOff+69+20+100+10,xOff+xLen+135,yOff+69+20+110+10);

    ////////////////////////////////////////////////////////////////////////////
                if(step==9 && slozhnost==3){
                  g.setFont(FontGraficXY);
                  g.setColor(Color.darkGray);
                  g.drawString("���������� ������������� �� ���� ������ ����� �������",100,400);
                }
                Stringer_un.setFontSizes(14, 11, 8);
                if(nextStep == -1 && showresult) {
                  int x1=50,y1=30,xx=300,yy=200;
                  g.setColor(new Color(192,192,192,120));
                  g.fillRect(x1+7,y1+7,xx,yy);
                  g.setColor(ColorPanelFon);
                  g.fillRect(x1,y1,xx,yy);
                  g.setColor(ColorPanelRamka);
                  g.drawRect(x1,y1,xx,yy);
                  String c;
                  g.setColor(ColorSubTitle);
                  g.setFont(FontSubTitle);
                  g.drawString("��� ���������:",x1+100, y1+20);
                  g.setColor(ColorSolutionText);
                  int numMist = (slozhnost == 3 ? k : 0);
                  int numChoice = (slozhnost == 3 ? 1 + k * 2 : 1 + k * slozhnost);
                  int percents = (int) ((Stringer_un._numCalcChoice + Stringer_un._numCalcMist) * 100 / (slozhnost * k));
                  g.drawString("���������� ��������: " + (slozhnost * k) + "",x1+30,y1+40);
                  g.drawString("���������� ���������� �������: " + (Stringer_un._numCalcChoice + Stringer_un._numCalcMist),x1+30,y1+60 );
                  g.drawString("���������� ���������� ������:",x1+30,y1+80);
                  g.setColor(Color.lightGray);
                  g.drawString(" - �� ������:  0 ",x1+50,y1+100);
                  g.setColor(ColorSolutionText);
                  g.drawString(" - �� ���������:    " + (numChoice - Stringer_un._numCalcChoice-1) ,x1+50,y1+120);
                  if (slozhnost == 3) {
                    g.drawString(" - �� ����������:   " + (numMist - Stringer_un._numCalcMist) ,x1+50,y1+140);
                  }
                  if (slozhnost != 3) {
                    g.drawString(" - �� ����������:  0 ",x1+50,y1+140);
                  }
                  g.setColor(Color.lightGray);
                  g.drawString(" - �� ����������:  0 ",x1+50,y1+160);
                  g.setColor(ColorSolutionText);
                  g.drawString("��������� ���������� ����������: " + percents + "%",x1+30,y1+180);
                }
                g2d.setColor(ColorSolutionText);
//nadpisi
                g2d.setFont(FontSubTitle);
                g2d.setColor(ColorSubTitle);
                g2d.drawString("�������: ", xOff+xLen+18+7, yOff+57+40-3);
                g2d.drawString("����������� �����������: ", 7, yOff-3);
                g2d.drawString("��������: ", xOff+xLen+18+7, yOff-3);
                g2d.drawString("�������: ", xOff+xLen+18+7, yOff+57+20+130+25-3+60);
                g2d.drawString("�������: ", 7, yOff+yLen+20-3);
                g2d.drawString("������: ", 7, -35);
                g2d.setFont(FontSolutionText);
                g2d.setColor(ColorSolutionText);
                g2d.drawString("����� ������� ������� f(x) ������� ����������", 65, -35);
//pishet funktiu
                g2d.setColor(Color.blue);
                double a = aArr[variant];
                String b = bArr[variant] > 0 ? " + " + bArr[variant] : " - " + (-bArr[variant]);
                double c = cArr[variant];
                String d = dArr[variant] > 0 ? " + " + dArr[variant] : " - " + (-dArr[variant]);
                int xx = 200;
                g.setColor(new Color(100, 100, 150));
                Stringer_un.setFontSizes(12,10,8);
                Stringer_un.drawString("f(x) = " + f.normalize(a) + "(x_{1}" + b + ")^{4} +" + f.normalize(c) + "(x_{2}" + d + ")^{4}", 10, 12);
                g2d.translate (0, -50);
                Stringer_un.setFontSizes(14,10,10);
                g.setColor(ColorSolutionText);
                if(step==0)Stringer_un.drawString("������� ���������: "+slozhnost,180,yOff+yLen+20+80);
}
//system koordinat
        private void drawAxes(Graphics g) {
                int xc = xCen + xOff;
                int yc = yCen + yOff;
                int xe = xOff + xLen - 1;
                int ye = yOff + yLen - 1;
                g.setColor(ColorGraficXY);
                g.drawLine(xc, yOff, xc, ye);
                g.drawLine(xOff, yc, xe, yc);
                g.drawLine(xe, yc, xe - 6, yc - 3);
                g.drawLine(xe, yc, xe - 6, yc + 3);
                g.drawLine(xc, yOff, xc + 3, yOff + 6);
                g.drawLine(xc, yOff, xc - 3, yOff + 6);
                g.setColor(ColorGraficXY);
                Stringer_un.setFontSizes(10,8,8);
                Stringer_un.drawString("x_{1}", xe - 15, yc - 10);
                Stringer_un.drawString("x_{2}", xc + 5, yOff + 10);
                g.setFont(FontGraficXY);
                double dx = scale;
                int j = 1;
                wasArrow = false;
                g.drawString("0", xc - 8, yc + 15);
                for (int x = xc + (int) scale; x < xe - 20; x += scale, j++) {
                        g.drawString("" + j, x - 5, yc + 15);
                        g.drawLine(x, yc - 3, x, yc + 3);
                }
                j = -1;
                for (int x = xc - (int) scale; x > xOff; x -= scale, j--) {
                        g.drawString("" + j, x - 5, yc + 15);
                        g.drawLine(x, yc - 3, x, yc + 3);
                }
                j = -1;
                for (int y = yc + (int) scale; y < ye; y += scale, j--) {
                        g.drawString("" + j, xc - 10, y - 3);
                        g.drawLine(xc - 3, y, xc + 3, y);
                }
                j = 1;
                for (int y = yc - (int) scale; y > yOff + 20; y -= scale, j++) {
                        g.drawString("" + j, xc - 8, y - 3);
                        g.drawLine(xc - 3, y, xc + 3, y);
                }
                Stringer_un.setFontSizes(14,10,10);
        }
  static boolean wasArrow;
//risuet strelku
  public void sc(Graphics g, int[] s, int x, int y) {
    g.setColor(ColorSolutionText);
    for(int i = 0; i < s.length;++i) {
      if(step != s[i]) continue;
      g.setColor(Color.red);
      y+=5;
      strelka(g, x, y);
      //break;
    }
  }
  public void strelka(Graphics g,int x,int y){
    if( wasArrow) return;
    wasArrow = true;
    x=x-25;
    y=y-25;
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
