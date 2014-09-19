package sravnenie;
import java.text.*;

public class QuadFuncs_m implements FunctionContainers_m {
        static NumberFormat nf_m = NumberFormat.getInstance();
        public double a = 0.0;
        public double b = 0.0;
        public double c = 0.0;
        public double d = 0.0;
        public double x1_m = 0.0;
        public double x2_m = 0.0;
        public double eps1 = 0.1;
       public boolean is2;
        public double m = 1000;
        public static  int M=20;
        public int k ;
        public double[] Vektor = {1000,  500, 250, 125, 62.5,31.25, 15.625, 7.8125, 3.90625, 1.953125, 0.9765625, 0.48828125, 0.244140625, 0.1220703125 , 0.06103515625, 0.030517578125, 0.0152587890625, 0.00762939453125, 0.003814697265625, 0.0019073486328125, 0.00095367431640625, 0.000476837158203125, 0.0002384185791015625, 0.00011920928955078125 ,0.000059604644775390625, 0.0000298023223876953125 ,0.00001490116119384765625 ,0.000007450580596923828125, 0.0000037252902984619140625 ,0.00000186264514923095703125 , 0.000000931322574615478515625};

        public QuadFuncs_m() {nf_m.setMaximumFractionDigits(3);}
        public QuadFuncs_m(double a, double b, double c, double d, boolean is2) {
                this.a = a;
                this.b = b;
                this.c = c;
                this.d = d;
                this.is2 = is2;
                nf_m.setMaximumFractionDigits(3);
        }

        public void setx1x2_m(double x1_m, double x2_m) {
              this.x1_m = x1_m;
              this.x2_m = x2_m;
      }


        public String normalize(double d) {
                d = (int)(d*100000)*1./100000;
                String s;
                if(d == (int)d) {s = String.valueOf((int)d);return s;}
                else s = String.valueOf(d);
                if(s.length() <= 1) return s;
                while (s.charAt(s.length() - 1) == '0'){
                  s = s.substring(0, s.length() - 1);
                }
                return s;
        }

        public double g1_m() {
             double r = 1 - 0.75*Math.cos(1.5*x1_m) - 0.25*Math.cos(x1_m/2);
             if(x1_m < 0) r = -r;
             return r;
     }
     public double g2_m() {
             double r = 1 - 0.75*Math.cos(1.5*x2_m) - 0.25*Math.cos(x2_m/2);
             if(x1_m < 0) r = -r;
             return r;
     }


       public double gNorm_m() {
             double gr1_m = g1_m();
             double gr2_m = g2_m();
             return Math.sqrt(gr1_m*gr1_m + gr2_m*gr2_m);
     }


        public double[][] h_m() {
             double[][] matrix = new double[2][2];
             matrix[0][0] = 1.125*Math.sin(1.5/2*x1_m) + 0.125*Math.sin(x1_m/2);//12 * a * (x1 + b) * (x1 + b);
             matrix[0][1] = 0;
             matrix[1][0] = 0;
             matrix[1][1] = 1.125*Math.sin(1.5/2*x2_m) + 0.125*Math.sin(x2_m/2);//12 * c * (x2 + d) * (x2 + d);
             return matrix;
     }



        //////////////////////// �������  H(x)+Ny*E//////////////////////////////////////////////
              public double[][] h_plus(int k) {
                              double[][] matrix = new double[2][2];

                                matrix[0][0] = 1.125*Math.sin(1.5/2*x1_m) + 0.125*Math.sin(x1_m/2)+Vektor[k];
                                matrix[0][1] = 0;
                                matrix[1][0] = 0;
                                matrix[1][1] = 1.125*Math.sin(1.5/2*x2_m) + 0.125*Math.sin(x2_m/2) + Vektor[k];

                              return matrix;
                      }
       //////////////////////// �������  [H(x)+Ny*E]^{-1}//////////////////////////////////////////////

              public double[][] h_1_plus(int k) {
                              double[][] matrix = new double[2][2];
                              double   m_plus,m1_plus;

                                 m_plus  =  1.125*Math.sin(1.5/2*x2_m) + 0.125*Math.sin(x2_m/2)+Vektor[k];
                                m1_plus =  1.125*Math.sin(1.5/2*x1_m) + 0.125*Math.sin(x1_m/2)+Vektor[k];

                                if((m_plus*m1_plus)>0)
                                 {
                                   matrix[0][0] = m_plus/(m_plus*m1_plus);
                                   matrix[0][1] = 0;
                                   matrix[1][0] = 0;
                                   matrix[1][1] = m1_plus /(m_plus * m1_plus);
                                 }

                              return matrix;
                      }
                      public double d1_m(int k) {
                             double[][] h = h_1_plus(k);
                             return - h[0][0] * g1_m() - h[0][1] * g2_m();
                     }
                     public double d2_m(int k) {
                             double[][] h = h_1_plus(k);
                             return - h[1][0] * g1_m() - h[1][1] * g2_m();
                     }

                     public double dFuncNorm_a() {
                     double a = func_m(x1New_m(k), x1New_m(k));
                     return a;
                     }
                     public double dFuncNorm_b() {
                     double b = func_m();
                     return b;
                     }




        public double x1New_m(int k) {
        // return x1 + d1_m();
           //   if(!is2)
                       return x1_m + d1_m(k);
             //  else return x1_m + step()*d1_m(k);

       }

       public double x2New_m(int k ) {
      //   if(!is2)
                return x1_m + d2_m(k);
      //  else return x1_m + step()*d2_m(k);

       }



        public double func_m() {
               return Math.abs(x1_m - Math.sin(x1_m)*Math.cos(x1_m)) + Math.abs(x2_m - Math.sin(x2_m)*Math.cos(x2_m));
       }
       public double func_m(double x1_m, double x2_m) {
               return Math.abs(x1_m - Math.sin(x1_m)*Math.cos(x1_m)) + Math.abs(x2_m - Math.sin(x2_m)*Math.cos(x2_m));
       }

     //  public double step() {
      //        if(x1_m != 4) return 195;
       //        return 2.159;
      //  }
      //  public String stepStr() {
      ///          return normalize(step());
      // }
        public String gradientStr() {
                String bs = b > 0 ? " + " + b : " - " + (-b);
                String ds = d > 0 ? " + " + d : " - " + (-d);
                return "#{1 - 0.75\u00b7cos 1.5x_{1} - 0.25\u00b7cos 0.5x_{1}}{1 - 0.75\u00b7cos 1.5x_{2} - 0.25\u00b7cos 0.5x_{2}}";
        }

        public String g1_mStr() {
             return normalize(g1_m());
     }
       public String g2_mStr() {
             return normalize(g2_m());
     }


        public String gNorm_mStr() {
               return normalize(gNorm_m());
       }

        public String gesseStr() {
                String bs = b > 0 ? " + " + b : " - " + (-b);
                String ds = d > 0 ? " + " + d : " - " + (-d);
                return "#{1.125\u00b7sin 1.5x_{1}+0.125\u00b7sin 0.5x_{1}}{0}{0}{1.125\u00b7sin 1.5x_{2}+0.125\u00b7sin 0.5x_{2}}";
        }


        public String h_mStr() {
           double[][] matrix = h_m();
           return "#{" + normalize(matrix[0][0]) + "}{" +
           normalize(matrix[0][1]) + "}{" + normalize(matrix[1][0]) + "}{" +
           normalize(matrix[1][1]) + "}";
   }


        public String h_plusStr() {

           double[][] matrix =  h_plus(k);
           return "#{" + normalize(matrix[0][0]) + "}{" +
           normalize(matrix[0][1]) + "}{" + normalize(matrix[1][0]) + "}{" +
           normalize(matrix[1][1]) + "}";
       }


        public String h_1_plusStr() {
                 double[][] matrix = h_1_plus(k);
                 return "#{" + normalize(matrix[0][0]) + "}{" +
                 normalize(matrix[0][1]) + "}{" + normalize(matrix[1][0]) + "}{" +
                 normalize(matrix[1][1]) + "}";

        }


        public String d1_mStr() {
              return normalize(d1_m(k));
        }
        public String d2_mStr() {
              return normalize(d2_m(k));
        }

        public String x1_mStr() {
               return normalize(x1_m);
       }
       public String x2_mStr() {
               return normalize(x2_m);
       }

        public String eps1Str() {
                return normalize(eps1);
        }

        public String func_mStr() {
               return normalize(func_m());
       }

         public String dFuncNormStr_a() {
             return normalize(dFuncNorm_a());
         }
         public String dFuncNormStr_b() {
           return normalize(dFuncNorm_b());
         }
          public String x1New_mStr() {
              return normalize(x1New_m(k));
               }
          public String x2New_mStr() {
             return normalize(x2New_m(k));
               }


        public String func_mStr(double x1_m, double x2_m) {
              return normalize(func_m(x1_m,x2_m));
      }

}
