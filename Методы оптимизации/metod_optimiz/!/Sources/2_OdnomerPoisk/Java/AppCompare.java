import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.border.*;

public class AppCompare extends JApplet {
  boolean isStandalone = false;
  Panel_paint Panel_p = new Panel_paint();
GrPanel1 jPanel1 = new GrPanel1();
GrPanel2 jPanel2 = new GrPanel2();
GrPanel3 jPanel3 = new GrPanel3();
Color font_color = new Color(230, 230, 230);
JButton button_refresh = new JButton();
JButton button_next = new JButton();
JLabel label_method1=new JLabel("Метод 1");
JLabel label_method2=new JLabel("Метод 2");

JComboBox combobox_compare=new JComboBox();

public int language = 0, N, N1=6, N2=4, k;
public double a0 = -5, b0 = 15, epsi = 10.0, eps=0.4, final_interval=2,accuracy1=2.0, accuracy2=0.5;
public boolean stop_method1=false,stop_method2=false, stop_method3=false,stop_method3_1=true;//метки завершения работы метода
public int gold_calc=0,fib_calc=0;//0-вычисляются обе точки,1-не вычисляется первая точка,2-не вычисляется 2 точка
public int norms =2, normx = 390, normy = 250;//размеры графика функции
//коэффициенты функции
public double akof = 1, plusb = 8, x0_kof = 3;
public double gold_num=0.618;
public int ch_method = 0, ch_task = 0;
public double kof1 = 1, kof2 = 1;
public int iteration1=0,step1=0,iteration2=0,step2=0,iteration3=0,step3=0,iter3=0, function_calculations=8;
int iter[] = new int[] {0, 0}; //количество итераций в 2 методах
//целые значения точек в интервалах для 3 методов
public double[] a1 = new double[9]; public double[] b1 = new double[9];
public double[] y1 = new double[9]; public double[] z1 = new double[9];
public double[] a2 = new double[15]; public double[] b2 = new double[15];
public double[] y2 = new double[15]; public double[] z2 = new double[15];
public double[] a3 = new double[30]; public double[] b3 = new double[30];
public double[] y3 = new double[30]; public double[] z3 = new double[30];


  JLabel jLabel1 = new JLabel();
  JLabel jLabel2 = new JLabel();
  JLabel jLabel3 = new JLabel();
  JLabel jLabel4 = new JLabel();
  Border border1;
  JComboBox combobox_metods = new JComboBox();
  Border border2;
  JLabel jLabel5 = new JLabel();
  JLabel jLabel6 = new JLabel();
  JComboBox combobox_interval = new JComboBox();
  Border border3;
  JLabel jLabel8 = new JLabel();
  JComboBox combobox_accuracy = new JComboBox();
  JLabel jLabel9 = new JLabel();
  Border border4;
  JLabel jLabel11 = new JLabel();
  JButton button_previous = new JButton();
  JCheckBox jCheckBox1 = new JCheckBox();
  JCheckBox jCheckBox2 = new JCheckBox();
  Border border5;
  Border border6;
  Border border7;
  Border border8;
  /**Get a parameter value*/
  public String getParameter(String key, String def) {
    return isStandalone ? System.getProperty(key, def) :
      (getParameter(key) != null ? getParameter(key) : def);
  }

  /**Construct the applet*/
  public AppCompare() {
  }
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
      border5 = new EtchedBorder(EtchedBorder.RAISED,Color.white,new Color(0, 79, 151));
    border6 = new EtchedBorder(EtchedBorder.RAISED,Color.white,new Color(0, 98, 164));
    border7 = new EtchedBorder(EtchedBorder.RAISED,Color.white,new Color(0, 125, 178));
    border8 = new EtchedBorder(EtchedBorder.RAISED,Color.white,new Color(0, 125, 184));
    this.setSize(new Dimension(600, 500));
  this.getContentPane().setLayout(null);
  if (ch_method == 11 || ch_method == 22) Panel_p.setBounds(new Rectangle(5, 40, 210, 320));
  else Panel_p.setBounds(new Rectangle(10, 125, 235, 336));

  label_method1.setBounds(new Rectangle(256, 126, 213, 171));
  label_method2.setBounds(new Rectangle(257, 292, 214, 170));
  combobox_compare.setBackground(new Color(247, 247, 255));
  combobox_compare.setFont(new java.awt.Font("SansSerif", 1, 12));
  combobox_compare.setBorder(border6);
  combobox_compare.setBounds(new Rectangle(253, 70, 337, 22));
  combobox_compare.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        combobox_compare_itemStateChanged(e);
      }
    });
  combobox_compare.addItem(" вычисления до определенного интервала");
  combobox_compare.addItem(" определенное количество вычислений функции");
   jLabel1.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel1.setForeground(new Color(130, 0, 80));
    jLabel1.setText("Сравнение методов");
    jLabel1.setBounds(new Rectangle(224, 11, 175, 19));
    jLabel2.setFont(new java.awt.Font("Dialog", 3, 14));
    jLabel2.setForeground(new Color(180, 0, 80));
    jLabel2.setText("Выберите критерий сравнения:");
    jLabel2.setBounds(new Rectangle(7, 71, 246, 17));
    jLabel3.setFont(new java.awt.Font("Dialog", 3, 13));
    jLabel3.setForeground(new Color(180, 0, 80));
    jLabel3.setText("Начальные");
    jLabel3.setBounds(new Rectangle(466, 266, 86, 20));
    jLabel4.setFont(new java.awt.Font("Dialog", 3, 13));
    jLabel4.setForeground(new Color(180, 0, 80));
    jLabel4.setText("данные:");
    jLabel4.setBounds(new Rectangle(531, 280, 60, 17));
    combobox_metods.setBackground(new Color(247, 247, 255));
    combobox_metods.setFont(new java.awt.Font("SansSerif", 1, 13));
    combobox_metods.setBorder(border5);
    combobox_metods.setBounds(new Rectangle(265, 37, 325, 24));
    combobox_metods.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        combobox_metods_itemStateChanged(e);
      }
    });
    jLabel5.setFont(new java.awt.Font("Dialog", 3, 14));
    jLabel5.setForeground(new Color(180, 0, 80));
    jLabel5.setText("Выберите  методы для сравнения:");
    jLabel5.setBounds(new Rectangle(7, 39, 259, 17));
    combobox_metods.addItem(" дихотомии и золотого сечения");
    combobox_metods.addItem(" золотого сечения и Фибоначчи");
    jLabel6.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel6.setForeground(new Color(180, 0, 80));
    jLabel6.setText(" Начальный интервал");
    jLabel6.setBounds(new Rectangle(453, 123, 139, 17));
    combobox_interval.setBackground(new Color(247, 247, 255));
    combobox_interval.setFont(new java.awt.Font("SansSerif", 1, 13));
    combobox_interval.setBorder(border7);
    combobox_interval.setBounds(new Rectangle(494, 153, 92, 21));
    combobox_interval.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        combobox_interval_itemStateChanged(e);
      }
    });
    combobox_interval.addItem("[ -5; 15 ]");
    combobox_interval.addItem("[ 1; 19 ]");
    combobox_interval.addItem("[ -9; 12 ]");
    jLabel8.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel8.setForeground(new Color(180, 0, 80));
    jLabel8.setText("Точность:");
    jLabel8.setBounds(new Rectangle(462, 176, 71, 17));
    combobox_accuracy.setBackground(new Color(247, 247, 255));
    combobox_accuracy.setFont(new java.awt.Font("SansSerif", 1, 13));
    combobox_accuracy.setBorder(border8);
    combobox_accuracy.setBounds(new Rectangle(506, 193, 78, 21));
    combobox_accuracy.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        combobox_accuracy_itemStateChanged(e);
      }
    });
    combobox_accuracy.addItem(" 2.0");
    combobox_accuracy.addItem(" 1.3");
    combobox_accuracy.addItem(" 0.5");
    jLabel9.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel9.setForeground(new Color(180, 0, 80));
    jLabel9.setText("неопределенности:");
    jLabel9.setBounds(new Rectangle(467, 135, 125, 18));
    jLabel11.setFont(new java.awt.Font("Dialog", 1, 13));
    jLabel11.setForeground(new Color(0, 0, 220));
    jLabel11.setText("Метод  дихотомии");
    jLabel11.setBounds(new Rectangle(182, 108, 143, 17));
    button_refresh.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        button_refresh_actionPerformed(e);
      }
    });
    button_previous.setText("Предыдущий шаг");
    button_previous.setBounds(new Rectangle(401, 471, 141, 22));
    button_previous.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        button_previous_actionPerformed(e);
      }
    });
    jCheckBox1.setBackground(new Color(247, 247, 255));
    jCheckBox1.setFont(new java.awt.Font("Dialog", 3, 13));
    jCheckBox1.setForeground(new Color(180, 0, 80));
    jCheckBox1.setHorizontalTextPosition(SwingConstants.LEFT);
    jCheckBox1.setText("Формулы:       ");
    jCheckBox1.setBounds(new Rectangle(466, 220, 118, 18));
    jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        jCheckBox1_mouseClicked(e);
      }
    });
    jCheckBox2.setBackground(new Color(247, 247, 255));
    jCheckBox2.setFont(new java.awt.Font("Dialog", 3, 13));
    jCheckBox2.setForeground(new Color(180, 0, 80));
    jCheckBox2.setHorizontalTextPosition(SwingConstants.LEFT);
    jCheckBox2.setText("Результаты: ");
    jCheckBox2.setBounds(new Rectangle(466, 241, 118, 21));
    jCheckBox2.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        jCheckBox2_mouseClicked(e);
      }
    });
    button_next.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        button_next_actionPerformed(e);
      }
    });
    this.getContentPane().add(Panel_p, null);

  button_next.setText("Следующий шаг");
  button_refresh.setText("Обновить");
  button_refresh.addMouseListener(new MouseAdapter() {
   public void mouseClicked(MouseEvent e) {
    }});

  Panel_p.setToolTipText("Графическая иллюстрация");
  button_next.setBounds(new Rectangle(67, 470, 143, 23));
  button_refresh.setBounds(new Rectangle(252, 470, 110, 23));
  jPanel1.setBounds(new Rectangle(463, 300, 124, 160));
  jPanel1.setBackground(new Color(255, 255, 255));
  jPanel2.setBounds(new Rectangle(253, 125, 200, 336));
  jPanel2.setBackground(new Color(255, 255, 255));
  jPanel3.setBounds(new Rectangle(10, 110, 445, 320));
  jPanel3.setBackground(new Color(247, 247, 255));
  jPanel3.setVisible(false);
    this.getContentPane().add(jLabel1, null);
    this.getContentPane().add(combobox_compare, null);
    this.getContentPane().add(jLabel2, null);
    this.getContentPane().add(combobox_metods, null);
    this.getContentPane().add(jLabel5, null);
    //this.getContentPane().add(label_method2, null);
    this.getContentPane().add(button_refresh);
    this.getContentPane().add(jLabel11, null);
    this.getContentPane().add(jLabel4, null);
    this.getContentPane().add(jLabel3, null);
    this.getContentPane().add(jCheckBox2, null);
    this.getContentPane().add(jCheckBox1, null);
    this.getContentPane().add(combobox_accuracy, null);
    this.getContentPane().add(jLabel8, null);
    this.getContentPane().add(combobox_interval, null);
    this.getContentPane().add(jLabel9, null);
    this.getContentPane().add(jLabel6, null);
    this.getContentPane().add(button_next);
    this.getContentPane().add(button_previous, null);
   // this.getContentPane().add(label_method1, null);
    this.getContentPane().add(jPanel1, null);
    this.getContentPane().add(jPanel2, null);
    this.getContentPane().add(jPanel3, null);
    this.jPanel2.add(label_method1, null);
    this.jPanel2.add(label_method2, null);

  OptimizationBasic.setColor(Panel_p);
  OptimizationBasic.setColor(jPanel2);
  OptimizationBasic.setColor(getContentPane());
  OptimizationBasic.setColor(button_refresh);
  OptimizationBasic.setColor(button_next);
   OptimizationBasic.setColor(button_previous);
  OptimizationBasic.setColor(label_method1);
  OptimizationBasic.setColor(label_method2);
  }
  /**Get Applet information*/
  public String getAppletInfo() {
    return "Applet Information";
  }
  /**Get parameter info*/
  public String[][] getParameterInfo() {
    return null;
  }

  //static initializer for setting look & feel
  static {
    try {
      //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      //UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
    }
    catch(Exception e) {
    }
  }
  public double f(double x1) { return akof * x1 * (x1 - x0_kof) + plusb;}

  public void x1x2() { //обнуление результатов
    accuracy1=final_interval;
    if (combobox_metods.getSelectedIndex()==1 )
         { N1=Fib(a3[0],b3[0],final_interval);
          eps = (final_interval)/(double)(epsi);}
     else { N=function_calculations;
         eps = (final_interval)/(double)(epsi)*2.5;}
    a1[0] = a0; a2[0] = a0; a3[0] = a0; b1[0] = b0; b2[0] = b0; b3[0] = b0; iteration3=0;iter3=0;
    y1[0]=OptimizationBasic.round((b1[0]+a1[0]-eps)/2,3);
    z1[0]=OptimizationBasic.round((b1[0]+a1[0]+eps)/2,3);
    if (gold_calc!=1) y2[0]=OptimizationBasic.round(a2[0]+(b2[0]-a2[0])*(1-gold_num),3);
    if (gold_calc!=2) z2[0]=OptimizationBasic.round(a2[0]+(b2[0]-a2[0])*gold_num,3);
     y3[0]= OptimizationBasic.round(a3[0]+(b3[0]-a3[0])*Fibonachi(N1-2)/(double)(Fibonachi(N1)),3);
     z3[0]= OptimizationBasic.round(a3[0]+(b3[0]-a3[0])*Fibonachi(N1-1)/(double)(Fibonachi(N1)),3);
    step1=0;iteration1=0;step2=0;iteration2=0; step3=0;iteration3=0; gold_calc=0;
    String string_method1="<html><font color=red>Итерация "+iteration1+"."+step1+"<font color=#002A64><br>";
    String string_method2="<html><font color=red>Итерация "+iteration2+"."+step2+"<font color=#002A64><br>";
    String string_method3="<html><font color=red>Итерация "+iteration3+"."+step3+"<font color=#002A64><br>";
    string_method3 = string_method3+"Найдем число N - количество вычислений функции<br>";
    string_method3 = string_method3+"F<sub>N</sub> &gt (b<sub>0</sub>-a<sub>0</sub>) / \u2113<br>";
    string_method3 = string_method3+"F<sub>N</sub> = "+Fibonachi(N1)+" &gt (b<sub>0</sub>-a<sub>0</sub>) / \u2113 = "+OptimizationBasic.round((b0-a0)/final_interval,3)+"<br>";
    string_method3 = string_method3+"Поэтому <font color=red>N = "+N1+"<br>";
    if (combobox_metods.getSelectedIndex()==0) label_method1.setText(string_method1);
     else label_method1.setText(string_method3);
       label_method2.setText(string_method2);
    stop_method1=false;stop_method2=false; stop_method3=false; stop_method3_1=true;
    combobox_accuracy.setEnabled(true);
    button_previous.setEnabled(true);
  }

void button_next_actionPerformed(ActionEvent e) {
  if ((step1 <=4)){ step1++; }
  if ((step2 <=4)){ step2++; } if ((step3 <=4)){ step3++; }
  if ((step1 >4)&&( !stop_method1)) {
      step1=1; iteration1++;   }
  if ((step2 >4)&&( !stop_method2)) {
      step2=1; iteration2++;    }
  if ((step3 >4)&&( !stop_method3)) {
      step3=1; iteration3++;    }
 if ((step3 >4)&&( !stop_method3_1)) {
      step3=1; iter3++;  }
    if (stop_method2==true && combobox_compare.getSelectedIndex()==1&&combobox_metods.getSelectedIndex()== 0)
     { (iteration2)=function_calculations-2; step2=5;}
    if (stop_method2==true && combobox_compare.getSelectedIndex()==1&&combobox_metods.getSelectedIndex()== 1)
     {  step2=5;}
    if (stop_method2==true && combobox_compare.getSelectedIndex()==0)
     {  step2=5;}
   if (stop_method3==true && combobox_compare.getSelectedIndex()==1&&stop_method3_1==true)
     {  step3=4; iteration3=N1-2;}
    if (stop_method3==true && combobox_compare.getSelectedIndex()==1&&stop_method3_1==true&&iter3==N2-2)
     {  step3=5; iter3=N2-2;}
    if (stop_method3==true && combobox_compare.getSelectedIndex()==0)
     {  step3=5;}
    if (stop_method1==true && combobox_compare.getSelectedIndex()==0)
     {  step1=5;}
    if (stop_method1==true && combobox_compare.getSelectedIndex()==1)
     {  (iteration1)=(function_calculations-1)/2; step1=5;}
    if (combobox_metods.getSelectedIndex()== 0 )
    { if ((!stop_method1)||(!stop_method2))  combobox_accuracy.setEnabled(false);
      if ((stop_method1==true)&&(stop_method2==true)) combobox_accuracy.setEnabled(true);}
    else{if ((!stop_method3)||(!stop_method2))  combobox_accuracy.setEnabled(false);
         if ((stop_method3==true)&&(stop_method2==true)) combobox_accuracy.setEnabled(true);
         if ((stop_method3_1==true)) combobox_accuracy.setEnabled(false);
         if ((step3==4)&&(iteration3==N1-2)) combobox_accuracy.setEnabled(true);}
    if (step1==5&&step2==5) {jPanel3.setBounds(new Rectangle(6, 120, 445, 340));
          jPanel3.setVisible(true);jPanel2.setVisible(false);
          Panel_p.setVisible(false);jLabel11.setVisible(false);}
    if (step3==5&&step2==5) {jPanel3.setBounds(new Rectangle(6, 120, 445, 340));
                jPanel3.setVisible(true);jPanel2.setVisible(false);
                Panel_p.setVisible(false);jLabel11.setVisible(false);}
        // if (step1==5&&step2==5) jPanel3.setVisible(true);
   Algoritm();
   Panel_p.repaint();
   jPanel2.repaint();
}

 void button_previous_actionPerformed(ActionEvent e) {
    if ((iteration1 ==0)&&(step1 <=4))   step1--;
    if ((iteration2 ==0)&&(step2 <=4))   step2--;
    if ((iteration3 ==0)&&(step3 <=4))   step3--;
    if ((iteration1 ==0)&&(step1 <=3)) step1=step1+1;
    if ((iteration2 ==0)&&(step2 <=3)) step2=step2+1;
    if ((iteration3 ==0)&&(step3 <=3)) step3=step3+1;
    if ((step1 ==4)&&(stop_method1==true))
     {  stop_method1=false; step1=4; }
    if ((step2 ==4)&&(stop_method2==true))
     { stop_method2=false; step2=4;}
     if ((step3 ==4)&&(stop_method3==true))
     { stop_method3=false; step3=4;}
      step1--; step2--;  step3--;
    if ((step1 <1)&&(iteration1 !=0))
     { step1=4;  iteration1--;}
    if ((step2 <1)&&(iteration2 !=0))
     { step2=4;  iteration2--;}
    if ((step3 <1)&&(iteration3 !=0))
     { step3=4;  iteration3--;}
    if ((step1 < 1)&&(iteration1==0)) step1=1;
    if ((step2 < 1)&&(iteration2==0)) step2=1;
    if ((step3 < 1)&&(iteration3==0)) step3=1;
    if (iteration1 < 0) iteration1=0;
    if (iteration2 < 0) iteration2=0;
    if (iteration3 < 0) iteration3=0;
     if (combobox_metods.getSelectedIndex()== 0 )
    { if ((!stop_method1)||(!stop_method2))  combobox_accuracy.setEnabled(false);
      if ((stop_method1==true)&&(stop_method2==true)) combobox_accuracy.setEnabled(true);}
     jPanel2.setVisible(true); Panel_p.setVisible(true);
    jLabel11.setVisible(true); jPanel3.setVisible(false);
    Panel_p.repaint();
    jPanel2.repaint(); jPanel3.repaint();
  }
public int Fib(double a, double b, double d) {
 int n = 1;
 while (Fibonachi(n - 1) < ((b - a) / d))
   {n++;}
 return (n -1);}

public int Fibonachi(int n) {
 int f0 = 1, f1 = 1, f = 0;
 for (int i = 2;i <= n;i++)
  {f = f0 + f1;f0 = f1;f1 = f;}
 return f1;
 }

 public void Algoritm() {
    double temp1=0,temp2=0;
    if (combobox_metods.getSelectedIndex()==0 ) { N=function_calculations;
         eps = (final_interval)/(double)(epsi)*2.5;}
    if (combobox_metods.getSelectedIndex()==0||(combobox_metods.getSelectedIndex()==1&&!stop_method3&&stop_method3_1==true))
     {a1[0] = a0; a2[0] = a0;  b1[0] = b0; b2[0] = b0;
     if (stop_method3_1==true){b3[0] = b0; a3[0] = a0;}}
    //метод дихотомии
    y1[0]=OptimizationBasic.round((b1[0]+a1[0]-eps)/2,3);
    z1[0]=OptimizationBasic.round((b1[0]+a1[0]+eps)/2,3);
    y1[iteration1]=OptimizationBasic.round((b1[iteration1]+a1[iteration1]-eps)/2,3);
    z1[iteration1]=OptimizationBasic.round((b1[iteration1]+a1[iteration1]+eps)/2,3);
    temp1=OptimizationBasic.round(f(y1[iteration1]),3);
    temp2=OptimizationBasic.round(f(z1[iteration1]),3);
    if (temp1<=temp2) {
	b1[iteration1+1]=z1[iteration1]; a1[iteration1+1]=a1[iteration1];}
    else {
	a1[iteration1+1]=y1[iteration1]; b1[iteration1+1]=b1[iteration1];}
    //метод зол сечения
    y2[0]=OptimizationBasic.round(a2[0]+(b2[0]-a2[0])*(1-gold_num),3);
    z2[0]=OptimizationBasic.round(a2[0]+(b2[0]-a2[0])*gold_num,3);
    if (gold_calc!=1) y2[iteration2]=OptimizationBasic.round(a2[iteration2]+(b2[iteration2]-a2[iteration2])*(1-gold_num),3);
    if (gold_calc!=2) z2[iteration2]=OptimizationBasic.round(a2[iteration2]+(b2[iteration2]-a2[iteration2])*gold_num,3);
    temp1=OptimizationBasic.round(f(y2[iteration2]),3);
    temp2=OptimizationBasic.round(f(z2[iteration2]),3);
    if (temp1<=temp2) {
	  b2[iteration2+1]=z2[iteration2]; a2[iteration2+1]=a2[iteration2];
          z2[iteration2+1]=y2[iteration2]; gold_calc=2;}
    else {
	 a2[iteration2+1]=y2[iteration2]; b2[iteration2+1]=b2[iteration2];
          y2[iteration2+1]=z2[iteration2];gold_calc=1;}
    //метод Фибоначчи
//if (stop_method3_1==true)
     { N1=Fib(a3[0],b3[0],accuracy1);
       eps = (accuracy1)/(double)(epsi);
      y3[0]= OptimizationBasic.round((a3[0]+(double)((Fibonachi(N1-2) / (double)(Fibonachi(N1)))*(double)(b3[0]-a3[0]))),3);
      z3[0]= OptimizationBasic.round((a3[0]+(double)((Fibonachi(N1-1) / (double)(Fibonachi(N1)))*(double)(b3[0]-a3[0]))),3);
   for( k=0; k<=N1-3; k++ )
   {  temp1=OptimizationBasic.round(f(y3[k]),3);
      temp2=OptimizationBasic.round(f(z3[k]),3);
    {  if (temp1<=temp2) {
	  b3[k+1]=z3[k]; a3[k+1]=a3[k];
          z3[k+1]=y3[k]; y3[k+1]= OptimizationBasic.round((a3[k+1]+(double)((Fibonachi(N1-k-3) /(double)(Fibonachi(N1-k-1)))*(double)(b3[k+1]-a3[k+1]))),3);fib_calc=1;}
      else {
	  a3[k+1]=y3[k]; b3[k+1]=b3[k];
          y3[k+1]=z3[k]; z3[k+1]= OptimizationBasic.round((a3[k+1]+(double)((Fibonachi(N1-k-2) /(double)(Fibonachi(N1-k-1)))*(double)(b3[k+1]-a3[k+1]))),3);fib_calc=2;}
        }
    y3[N1-2]=OptimizationBasic.round((b3[N1-2]+a3[N1-2])/2.0, 3);
    z3[N1-2]=y3[N1-2]; y3[N1-1]=y3[N1-2]; z3[N1-1]= OptimizationBasic.round( y3[N1-1]+eps,3);}
    temp1=OptimizationBasic.round(f(y3[N1-1]),3);
    temp2=OptimizationBasic.round(f(z3[N1-1]),3);
    if (temp1<=temp2) {  b3[N1-1]=z3[N1-1]; a3[N1-1]=a3[N1-2];}
    else              {  b3[N1-1]=b3[N1-2]; a3[N1-1]=y3[N1-1];}

   a3[N1]=a3[N1-1]; b3[N1]=b3[N1-1];
   y3[N1]= OptimizationBasic.round((a3[N1]+(double)((Fibonachi(N2-2) / (double)(Fibonachi(N2)))*(double)(b3[N1]-a3[N1]))),3);
   z3[N1]= OptimizationBasic.round((a3[N1]+(double)((Fibonachi(N2-1) / (double)(Fibonachi(N2)))*(double)(b3[N1]-a3[N1]))),3);
   k=N1; N2=Fib(a3[N1],b3[N1],final_interval); eps = (final_interval)/(double)(epsi);
   if (N2==2){
      temp1=OptimizationBasic.round(f(y3[k]),3);
      temp2=OptimizationBasic.round(f(z3[k]),3);
      if (temp1<=temp2) {
	  b3[k+1]=z3[k]; a3[k+1]=a3[k];}
      else {
	  a3[k+1]=y3[k]; b3[k+1]=b3[k];}
    }
   else {do
   {  temp1=OptimizationBasic.round(f(y3[k]),3);
      temp2=OptimizationBasic.round(f(z3[k]),3);
      if (temp1<=temp2) {
	  b3[k+1]=z3[k]; a3[k+1]=a3[k];
          z3[k+1]=y3[k]; y3[k+1]= OptimizationBasic.round((a3[k+1]+(double)((Fibonachi(N2-(k-N1)-3) /(double)(Fibonachi(N2-(k-N1)-1)))*(double)(b3[k+1]-a3[k+1]))),3);fib_calc=1;}
      else {
	  a3[k+1]=y3[k]; b3[k+1]=b3[k];
          y3[k+1]=z3[k]; z3[k+1]= OptimizationBasic.round((a3[k+1]+(double)((Fibonachi(N2-(k-N1)-2) /(double)(Fibonachi(N2-(k-N1)-1)))*(double)(b3[k+1]-a3[k+1]))),3);fib_calc=2;}
       k++; }
   while (k<=N1+N2-3);
    y3[N2+N1-2]=OptimizationBasic.round((b3[N2+N1-2]+a3[N2+N1-2])/2.0, 3);
    z3[N2+N1-2]=y3[N2+N1-2]; y3[N2+N1-1]=y3[N2+N1-2]; z3[N2+N1-1]= OptimizationBasic.round( y3[N2+N1-1]+eps,3);
    temp1=OptimizationBasic.round(f(y3[N2+N1-1]),3);
    temp2=OptimizationBasic.round(f(z3[N2+N1-1]),3);
    if (temp1<=temp2) {  b3[N2+N1-1]=z3[N2+N1-1]; a3[N2+N1-1]=a3[N2+N1-2];}
     else             {  b3[N2+N1-1]=b3[N2+N1-2]; a3[N2+N1-1]=y3[N2+N1-1];}}
    }

 }
  class  GrPanel1 extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
     //Algoritm();
     Stringer.setGraphics(g);
     Stringer.fonts[0] = new Font("SansSerif", 1, 12);
     Stringer.fonts[1] = new Font("SansSerif", 1, 12-3);
     Stringer.fonts[2] = new Font("SansSerif", 1, 12-3);
     g.setColor(new Color(0, 0, 80));
     g.setColor(new Color(157, 187, 255));
     g.drawRect(0,0,123,158);
     g.setColor(new Color(0, 0, 80));
     if ((combobox_compare.getSelectedIndex()==0)||((combobox_compare.getSelectedIndex()==1)&&(combobox_metods.getSelectedIndex()==1)))
     { g.setFont(new java.awt.Font("SansSerif", 3, 12+2));
       g.drawString("\u2113",5,84);}
     g.setFont(new java.awt.Font("SansSerif", 1, 12));
     g.drawString("\u03B5",5,134);
     g.setFont(new java.awt.Font("SansSerif", 1, 12));
     g.setColor(new Color(0, 0, 200));
     Stringer.drawString("f(x) = x^{2} - 3x + 8",5,17);
     g.setColor(new Color(0, 0, 80));
      //if (language==1)
     {Stringer.drawString("L_{0}= ["+a0+", "+b0+"] -",5,34);
     Stringer.drawString("нач. интервал",10,49);
     Stringer.drawString("неопределенности",10,64);
     if ((combobox_compare.getSelectedIndex()==0)||((combobox_compare.getSelectedIndex()==1)&&(combobox_metods.getSelectedIndex()==1)))
    { Stringer.drawString("= "+final_interval+" - допустимая",15,84);
     Stringer.drawString("длина конечного",10,99);
     Stringer.drawString("интервала",10,114);}
     Stringer.drawString("= "+OptimizationBasic.round(eps,2)+" - константа",15,134);
     Stringer.drawString("различимости",10,149);
      if ((combobox_compare.getSelectedIndex()==1)&&(combobox_metods.getSelectedIndex()==0))
     {Stringer.drawString("N = "+function_calculations+" - количество",5,84);
      Stringer.drawString("вычислений",10,99);
      Stringer.drawString("функции",10,117);}
     }
    }
 }
class  GrPanel3 extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
     Stringer.setGraphics(g);
     g.setFont(new java.awt.Font("SansSerif", 1, 11));
     FontMetrics F=g.getFontMetrics();
     Stringer.fonts[0] = new Font("SansSerif", 1, 12);
     Stringer.fonts[1] = new Font("SansSerif", 1, 12-3);
     Stringer.fonts[2] = new Font("SansSerif", 1, 12-3);

      //Выводы
  if (step1==5||step2==5||step3==5)
      {g.setColor(new Color(200, 200, 220)); g.fillRect(0, 3, 422, 294);
      g.setColor(new Color(120, 120, 140));  g.drawRect(3, 1, 440, 291);
      g.setColor(new Color(247, 247, 255));  g.fillRect(4, 2, 439, 290);
      g.setColor(new Color(255, 255, 255));  g.fillRect(10, 30, 425, 250);
      g.setColor(new Color(157, 187, 255));  g.drawRect(10, 30, 424, 249);
      g.setColor(new Color(160, 0, 70));
      g.setFont(new java.awt.Font("SansSerif", 3, 14));
      g.drawString("Выводы",200,18);
      }
 // if (stop_method3==true&&stop_method2==true&&stop_method3_1==true) button_next.setEnabled(false);
 // if (stop_method3==true&&stop_method2==true&&(combobox_metods.getSelectedIndex()==1)&&(combobox_compare.getSelectedIndex()==1)) button_previous.setEnabled(false);
  if (stop_method1==true&&stop_method2==true&&(step1==5||step2==5)&&combobox_metods.getSelectedIndex()==0)
  { g.setColor(new Color(0, 0, 120));
    Stringer.fonts[0] = new Font("SansSerif", 1, 13);
    Stringer.drawString( "При фиксированной точности в методе дихотомии",30, 50);
    Stringer.drawString( "количество вычислений функции больше, т.к. на каждой",20, 65);
    Stringer.drawString( "итерации производиться по 2 вычисления.  А в методе ",20, 80);
    Stringer.drawString( "золотого сечения на каждой итерации после нулевой ",20, 95);
    Stringer.drawString( "используется 1 из результатов предыдущих вычислений.",20, 110);
    Stringer.drawString( "При этом конечный интервал неопределенности примерно ",20, 125);
    Stringer.drawString( "одинаковый: в методе дихотомии при малых \u03B5 и низкой ",20, 140);
    Stringer.drawString( "точности длина последнего интервала будет меньше, чем",20, 155);
    Stringer.drawString( "в методе золотого сечения, в остальных случаях последний",20, 170);
    Stringer.drawString( "метод выигрывает.",20, 185);
    Stringer.drawString( "При определенном количестве вычислений функции в",30, 205);
    Stringer.drawString( "методе золотого сечения длина конечного интервала ",20, 220);
    Stringer.drawString( "неопределенности безусловно будет меньше, чем в",20, 235);
    Stringer.drawString( "методе дихотомии.",20, 250);
     }
    if(  combobox_compare.getSelectedIndex()==0)
   if (stop_method3==true&&stop_method2==true&&stop_method3_1==true&&(step3==5||step2==5)&&combobox_metods.getSelectedIndex()==1)
  { g.setColor(new Color(0, 0, 120));
    Stringer.fonts[0] = new Font("SansSerif", 1, 13);
    Stringer.drawString( "При фиксированной точности в методах золотого сечения",30, 50);
    Stringer.drawString( "и Фибоначчи количество вычислений функции одинаково, ",20, 65);
    Stringer.drawString( "только в последнем методе мы знаем это число заранее. ",20, 80);
    Stringer.drawString( "И еще одно достоинство метода Фибоначчи в том, что ",20, 95);
    Stringer.drawString( "конечный интервал неопределенности будет меньше, чем",20, 110);
    Stringer.drawString( "в методе золотого сечения.",20, 125);
    }
     if(  combobox_compare.getSelectedIndex()==1&&combobox_metods.getSelectedIndex()==1)
   {  if (stop_method3==true&&stop_method2==true&&stop_method3_1==true)
    { g.setColor(new Color(0, 0, 120));
      Stringer.fonts[0] = new Font("SansSerif", 1, 13);
      Stringer.drawString( "В методе золотого сечения при изменении допустимой ",30, 50);
      Stringer.drawString( "длины конечного интервала неопределенности, после ",20, 65);
      Stringer.drawString( "нахождения решения для более низкой точности, можно ",20, 80);
      Stringer.drawString( "продолжать вычисления с последнего шага. А в методе ",20, 95);
      Stringer.drawString( "Фибоначчи при тех же условиях приходиться заново ",20, 110);
      Stringer.drawString( "начинать вычисления с  L_{N}-ого интервала. Тем самым общее ",20, 125);
      Stringer.drawString( "количество вычислений функции за два прохождения в ",20, 140);
      Stringer.drawString( "методе Фибоначчи больше, чем в методе золотого сечения.",20, 155);
     }
    }

     if( jCheckBox1.isSelected()== true)
    {  g.setColor(new Color(200, 200, 220)); g.fillRect(0, 3, 442, 294);
       g.setColor(new Color(120, 120, 140));g.drawRect(3, 1, 443, 291);
      g.setColor(new Color(247, 247, 255));g.fillRect(4, 2, 442, 290);
     g.setColor(new Color(0, 0, 80));
     Stringer.drawString("Метод дихотомии",22,37);
     Stringer.drawString("Метод Фибоначчи",313,37);
      g.setColor(new Color(255, 255, 255));
      g.fillRect(6, 40, 135, 250);g.fillRect(146, 40, 135, 250);g.fillRect(286, 40, 157, 250);
      g.setColor(new Color(157, 187, 255));
      g.drawRect(6, 40, 134, 249); g.drawRect(146, 40, 134, 249);g.drawRect(286, 40, 156, 249);
      g.setColor(new Color(160, 0, 70));
      g.setFont(new java.awt.Font("SansSerif", 3, 14));
      g.drawString("Формулы",190,18);
      g.setColor(new Color(0, 0, 80));
      Stringer.drawString("Метод золотого сечения",144,37);
     // дихотомия
       Stringer.drawString("y_{k} = ",20,80);
       Stringer.drawString("(a_{k} + b_{k} - \u03B5)",F.stringWidth("y0 = ")+20,70);
       g.drawLine(F.stringWidth("y0 = ")+20,75,F.stringWidth("y0 = ")+75,75);
       Stringer.drawString( "2",F.stringWidth("y0 = a0 + ")+22,87);
        Stringer.drawString("z_{k} = ",20,115);
       Stringer.drawString("(a_{k} + b_{k} + \u03B5)",F.stringWidth("z0 = ")+20,106);
       g.drawLine(F.stringWidth("z0 = ")+20,110,F.stringWidth("z0 = ")+78,110);
       Stringer.drawString( "2",F.stringWidth("z0 = a0 + ")+22,123);
       Stringer.drawString("| L_{k+1}| = | a_{k+1} - b_{k+1}|",18,143);
       Stringer.drawString( "Условие остановки:",10,218);
       Stringer.drawString( "| L_{k+1}| < ",40,233);
       g.setFont(new java.awt.Font("SansSerif", 3, 12+2));
       g.drawString("\u2113",F.stringWidth("|Lk+1| < ")+43,233);
     // золотое сечение
       Stringer.drawString("y_{0} = a_{0} +",152,70);
       Stringer.drawString("(b_{0}-a_{0})",F.stringWidth("y0 = a0 + 3 -^5 ")+157,70);
       Stringer.drawString( "3 -\u221A5",F.stringWidth("y0 = a0 + ")+152,62);
       g.drawLine(F.stringWidth("y0 = a0 + ")+152,64,F.stringWidth("y0 = a0 +")+186,64);
       Stringer.drawString( "2",F.stringWidth("y0 = a0 + ")+161,76);
        Stringer.drawString("z_{0} = a_{0} +",152,105);
       Stringer.drawString("(b_{0}-a_{0})",F.stringWidth("z0 = a0 + -1 +^5 ")+155,105);
       Stringer.drawString( "-1 +\u221A5",F.stringWidth("z0 = a0 + ")+152,98);
       g.drawLine(F.stringWidth("z0 = a0 + ")+152,100,F.stringWidth("z0 = a0 + ")+186,100);
       Stringer.drawString( "2",F.stringWidth("z0 = a0 + -1")+157,113);
       Stringer.drawString("y_{k+1}= a_{k+1} + b_{k+1}- y_{k}",152,135);
       Stringer.drawString("z_{k+1}= a_{k+1} + b_{k+1}- z_{k}",152,158);
       Stringer.drawString("\u2206 = |a_{k+1} - b_{k+1}| = |L_{k+1}|",152,188);
       Stringer.drawString( "Условие остановки:",152,218);
       Stringer.drawString( "\u2206 < ",192,233);
       g.setFont(new java.awt.Font("SansSerif", 3, 12+2));
       g.drawString("\u2113",F.stringWidth("л < ")+194,233);
      //Фибоначчи
       String s1="y0 = a0 + ";
     Stringer.drawString("z_{0} = a_{0} +",294,105);
     Stringer.drawString("(b_{0}-a_{0})",F.stringWidth(s1+"FN-2 ")+296,105);
     Stringer.drawString("y_{0} = a_{0} +",294,70);
     Stringer.drawString("(b_{0}-a_{0})",F.stringWidth(s1+"FN-3 ")+296,70);
     Stringer.drawString( "F_{N-2}",F.stringWidth(s1)+296,60);
     g.drawLine(F.stringWidth(s1)+295,66,F.stringWidth(s1)+317,66);
     Stringer.drawString( "F_{N}",F.stringWidth(s1)+298,79);
     Stringer.drawString( "F_{N-1}",F.stringWidth(s1)+296,95);
     Stringer.drawString( "F_{N}",F.stringWidth(s1)+298,114);
     g.drawLine(F.stringWidth(s1)+295,101,F.stringWidth(s1)+317,101);
       s1="yk+1=ak+1+";
     Stringer.drawString("z_{k+1}=a_{k+1}+",292,183);
     Stringer.drawString("(b_{k+1}-a_{k+1})",F.stringWidth(s1+"FN-k-2")+289,183);
     Stringer.drawString("y_{k+1}=a_{k+1}+",292,145);
     Stringer.drawString("(b_{k+1}-a_{k+1})",F.stringWidth(s1+"FN-k-3")+289,145);
     Stringer.drawString( "F_{N-k-3}",F.stringWidth(s1)+290,135);
     g.drawLine(F.stringWidth(s1)+290,141,F.stringWidth(s1)+320,141);
     Stringer.drawString( "F_{N-k-1}",F.stringWidth(s1)+290,154);
     Stringer.drawString( "F_{N-k-2}",F.stringWidth(s1)+290,173);
     Stringer.drawString( "F_{N-k-1}",F.stringWidth(s1)+290,191);
     g.drawLine(F.stringWidth(s1)+290,179,F.stringWidth(s1)+320,179);
     Stringer.drawString( "Условие остановки:",294,218);
     Stringer.drawString( "k = N - 3",336,233);
    }
     if( jCheckBox2.isSelected()== true)
    {  g.setColor(new Color(200, 200, 220));  g.fillRect(0, 3, 443, 357);
       g.setColor(new Color(120, 120, 140));  g.drawRect(2, 1, 447, 354);
       g.setColor(new Color(247, 247, 255));  g.fillRect(3, 2, 446, 353);
      g.setColor(new Color(255, 255, 255));
      g.fillRect(6, 35, 146, 316);g.fillRect(155, 35, 143, 316);g.fillRect(301, 35, 144, 316);
      g.setColor(new Color(157, 187, 255));
      g.drawRect(6, 35, 145, 315); g.drawRect(155, 35, 142, 315);g.drawRect(301, 35, 143, 315);
      g.setColor(new Color(160, 0, 70));
      g.setFont(new java.awt.Font("SansSerif", 3, 14));
      g.drawString("Результаты",180,15);
      g.setColor(new Color(0, 0, 80));
      Stringer.drawString("Метод золотого сечения",155,30);
      Stringer.drawString("Метод дихотомии",27,30);
      Stringer.drawString("Метод Фибоначчи",323,30);
      int j;
      if (!stop_method1)
       {  Stringer.drawString( "L_{0}=["+a1[0]+"; "+b1[0]+"]",10, 60);
         for(j=0; j<=iteration1; j++) //дихотомия
            Stringer.drawString( "L_{"+j*2+"}=["+a1[j]+"; "+b1[j]+"]",10, 60+j*35);
         Stringer.fonts[0] = new Font("SansSerif", 1, 11);
        for(j=0; j<=iteration1; j++)
           Stringer.drawString("f("+OptimizationBasic.round(y1[j],2)+")="+OptimizationBasic.round(f(y1[j]),2)+", f("+OptimizationBasic.round(z1[j],2)+")="+OptimizationBasic.round(f(z1[j]),2)+"",9, 75+j*35);}
         g.setColor(new Color(200, 0, 0));
         Stringer.fonts[0] = new Font("SansSerif", 1, 12);
         if (stop_method1==true)
         { j=iteration1+1;
          Stringer.drawString( "x^{*}=("+a1[j]+"+"+b1[j]+")/2="+OptimizationBasic.round((a1[j]+b1[j])/2,2)+"",10, 82+(j)*35);
         g.setColor(new Color(0, 0, 80));
         for(j=0; j<=iteration1+1; j++)
         Stringer.drawString( "L_{"+j*2+"}=["+a1[j]+"; "+b1[j]+"]",10, 60+j*35);
          Stringer.fonts[0] = new Font("SansSerif", 1, 11);
         for(j=0; j<=iteration1; j++)
           Stringer.drawString("f("+OptimizationBasic.round(y1[j],2)+")="+OptimizationBasic.round(f(y1[j]),2)+", f("+OptimizationBasic.round(z1[j],2)+")="+OptimizationBasic.round(f(z1[j]),2)+"",9, 75+j*35);}//дихотомия
       Stringer.fonts[0] = new Font("SansSerif", 1, 12);
       g.setColor(new Color(0, 0, 80)); //золотое сечение
       Stringer.drawString( "L_{0}=["+a2[0]+"; "+b2[0]+"]",162, 50);
      if (!stop_method2)
       { for(j=2; j<=iteration2+1; j++)
         Stringer.drawString( "L_{"+j+"}=["+a2[j-1]+"; "+b2[j-1]+"]",162, 50+(j-1)*35);
        Stringer.fonts[0] = new Font("SansSerif", 1, 11);
        for(j=0; j<=iteration2; j++)
         Stringer.drawString("f("+OptimizationBasic.round(y2[j],2)+")="+OptimizationBasic.round(f(y2[j]),2)+",  f("+OptimizationBasic.round(z2[j],2)+")="+OptimizationBasic.round(f(z2[j]),2)+"",158, 66+j*35);
         }
        if (stop_method2==true)
         {g.setColor(new Color(200, 0, 0)); Stringer.fonts[0] = new Font("SansSerif", 1, 12); j=iteration2+1;
          Stringer.drawString( "x^{*}=("+a2[j]+"+"+b2[j]+")/2="+OptimizationBasic.round((a2[j]+b2[j])/2,2)+"",158, 68+(j)*35);
          g.setColor(new Color(0, 0, 80));
          for(j=2; j<=iteration2+2; j++)
           Stringer.drawString( "L_{"+j+"}=["+a2[j-1]+"; "+b2[j-1]+"]",162, 50+(j-1)*35);
        Stringer.fonts[0] = new Font("SansSerif", 1, 11);
           for(j=0; j<=iteration2; j++)
         Stringer.drawString("f("+OptimizationBasic.round(y2[j],2)+")="+OptimizationBasic.round(f(y2[j]),2)+",  f("+OptimizationBasic.round(z2[j],2)+")="+OptimizationBasic.round(f(z2[j]),2)+"",158, 66+j*35);
        }
         Stringer.fonts[0] = new Font("SansSerif", 1, 12);
         Stringer.drawString( "L_{0}=["+a3[0]+"; "+b3[0]+"]",308, 50);//Фибоначчи
       if (!stop_method3&&stop_method3_1==true)
      { for(j=2; j<=iteration3+1; j++)
          Stringer.drawString( "L_{"+j+"}=["+a3[j-1]+"; "+b3[j-1]+"]",308, 50+(j-1)*35);
           Stringer.fonts[0] = new Font("SansSerif", 1, 11);
        // for(j=0; j<=N1-2; j++)
         for(j=0; j<=iteration3; j++)
          Stringer.drawString("f("+OptimizationBasic.round(y3[j],2)+")="+OptimizationBasic.round(f(y3[j]),2)+",  f("+OptimizationBasic.round(z3[j],2)+")="+OptimizationBasic.round(f(z3[j]),2)+"",306, 66+j*35);
         }
         if (stop_method3==true)
         { g.setColor(new Color(200, 0, 0)); j=N1-1; Stringer.fonts[0] = new Font("SansSerif", 1, 12);
         Stringer.drawString( "x^{*}=("+a3[j]+"+"+b3[j]+")/2="+OptimizationBasic.round((a3[j]+b3[j])/2,2)+"",308, 68+(j)*35);
          g.setColor(new Color(0, 0, 80));
         for(j=2; j<=N1; j++)
            Stringer.drawString( "L_{"+j+"}=["+a3[j-1]+"; "+b3[j-1]+"]",308, 50+(j-1)*35);
         Stringer.fonts[0] = new Font("SansSerif", 1, 11);
         for(j=0; j<=N1-2; j++)
           Stringer.drawString("f("+OptimizationBasic.round(y3[j],2)+")="+OptimizationBasic.round(f(y3[j]),2)+",  f("+OptimizationBasic.round(z3[j],2)+")="+OptimizationBasic.round(f(z3[j]),2)+"",306, 66+j*35);
           }
   if (stop_method3==true&&stop_method3_1==false&&combobox_compare.getSelectedIndex()==1)
      {  g.setColor(new Color(255, 255, 255));  g.fillRect(301, 35, 144, 316);
        g.setColor(new Color(157, 187, 255));  g.drawRect(301, 35, 143, 315);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString( "L_{0}=["+a3[0]+"; "+b3[0]+"]",308, 50);
        for(j=2; j<=N1+iter3; j++)
         Stringer.drawString( "L_{"+j+"}=["+a3[j-1]+"; "+b3[j-1]+"]",308, 50+(j-1)*31);
          Stringer.fonts[0] = new Font("SansSerif", 1, 11);
        for(j=0; j<=N1+iter3-1; j++)
         Stringer.drawString("f("+OptimizationBasic.round(y3[j],2)+")="+OptimizationBasic.round(f(y3[j]),2)+",  f("+OptimizationBasic.round(z3[j],2)+")="+OptimizationBasic.round(f(z3[j]),2)+"",306, 64+j*31);
         }
         if (stop_method3==true&&stop_method2==true&&stop_method3_1==true)
         { g.setColor(new Color(255, 255, 255));  g.fillRect(301, 35, 144, 316);
          g.setColor(new Color(157, 187, 255));  g.drawRect(301, 35, 143, 315);
          g.setColor(new Color(200, 0, 0)); j=N1+N2-1; Stringer.fonts[0] = new Font("SansSerif", 1, 12);
          Stringer.drawString( "x^{*}=("+a3[j]+"+"+b3[j]+")/2="+OptimizationBasic.round((a3[j]+b3[j])/2,2)+"",303, 66+(j)*31);
          g.setColor(new Color(0, 0, 80));
          Stringer.drawString( "L_{0}=["+a3[0]+"; "+b3[0]+"]",308, 50);
          for(j=2; j<=N1+N2; j++)
            Stringer.drawString( "L_{"+j+"}=["+a3[j-1]+"; "+b3[j-1]+"]",308, 50+(j-1)*31);
          Stringer.fonts[0] = new Font("SansSerif", 1, 11);
          for(j=0; j<=N1+N2-2; j++)
          Stringer.drawString("f("+OptimizationBasic.round(y3[j],2)+")="+OptimizationBasic.round(f(y3[j]),2)+",  f("+OptimizationBasic.round(z3[j],2)+")="+OptimizationBasic.round(f(z3[j]),2)+"",306, 64+j*31);}
         }

   }
 }
  class  GrPanel2 extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
     //Algoritm();
     Stringer.setGraphics(g);
      Stringer.fonts[0] = new Font("SansSerif", 1, 12);
     Stringer.fonts[1] = new Font("SansSerif", 1, 12-3);
     Stringer.fonts[2] = new Font("SansSerif", 1, 12-3);
  g.setColor(new Color(247, 247, 255));
  g.fillRect(0, 160, 200, 16);
  g.setColor(new Color(157, 187, 255));
  g.drawRect(0, 0,199, 160);g.drawRect(0, 176, 199, 159);

  g.setColor(new Color(0, 0, 220));
  g.setFont(new java.awt.Font("Dialog", 1, 13));
  g.drawString("сечения",0, 172);
  label_method1.setBounds(new Rectangle(5, 3, 213, 171));
  label_method2.setBounds(new Rectangle(5, 180, 214, 170));
  double temp1=0,temp2=0;
   String string_method1="<html><font color=red>Итерация "+iteration1+"."+step1+"<font color=#002A64><br>";
   String string_method2="<html><font color=red>Итерация "+iteration2+"."+step2+"<font color=#002A64><br>";
   String string_method3="<html><font color=red>Итерация "+(iteration3+iter3)+"."+step3+"<font color=#002A64><br>";
   if (step3==0)  {
    string_method3 = string_method3+"Найдем число N - количество вычислений функции<br>";
    string_method3 = string_method3+"F<sub>N</sub> &gt (b<sub>"+iteration3+"</sub>-a<sub>"+iteration3+"</sub>) / \u2113<br>";
    if (!stop_method3)
    {string_method3 = string_method3+"F<sub>N</sub> = "+Fibonachi(N1)+" &gt (b<sub>"+iteration3+"</sub>-a<sub>"+iteration3+"</sub>) / \u2113 = "+OptimizationBasic.round((b3[iteration3]-a3[iteration3])/final_interval,3)+"<br>";
     string_method3 = string_method3+"Поэтому <font color=red>N = "+N1+"<br>";}
    if (!stop_method3_1)
    {string_method3 = string_method3+"F<sub>N</sub> = "+Fibonachi(N2)+" &gt (b<sub>"+iteration3+"</sub>-a<sub>"+iteration3+"</sub>) / \u2113 = "+OptimizationBasic.round((b3[iteration3]-a3[iteration3])/final_interval,3)+"<br>";
     string_method3 = string_method3+"Поэтому <font color=red>N = "+N2+"<br>";}
    }
  //выводится информация по методу половинного деления
  if (!stop_method1) switch (step1){
   case 1:string_method1=string_method1+"Вычислим<br>";
   string_method1=string_method1+"y<sub>"+iteration1+"</sub>=(b<sub>"+iteration1+"</sub>+a<sub>"+iteration1+"</sub>-\u03B5)/2="+y1[iteration1]+"<br>";
   string_method1=string_method1+"z<sub>"+iteration1+"</sub>=(b<sub>"+iteration1+"</sub>+a<sub>"+iteration1+"</sub>+\u03B5)/2="+z1[iteration1];
  break;
  case 2:string_method1=string_method1+"Вычислим значение функции в точках y<sub>"+iteration1+"</sub> и z<sub>"+iteration1+"</sub>:<br>";
  temp1=OptimizationBasic.round(f(y1[iteration1]),3);
  temp2=OptimizationBasic.round(f(z1[iteration1]),3);
  string_method1=string_method1+"f(y<sub>"+iteration1+"</sub>)="+temp1+"<br>";
  string_method1=string_method1+"f(z<sub>"+iteration1+"</sub>)="+temp2+"<br>";
  break;
  case 3:string_method1=string_method1+"Сравним значение функции в точках y<sub>"+iteration1+"</sub> и z<sub>"+iteration1+"</sub>:<br>";
  temp1=OptimizationBasic.round(f(y1[iteration1]),3);
  temp2=OptimizationBasic.round(f(z1[iteration1]),3);
  if (temp1<=temp2) {string_method1=string_method1+"f(y<sub>"+iteration1+"</sub>) &lt f(z<sub>"+iteration1+"</sub>)<br>";
	string_method1=string_method1+"Поэтому a<sub>"+(iteration1+1)+"</sub>=a<sub>"+iteration1+"</sub>, b<sub>"+(iteration1+1)+"</sub>=z<sub>"+iteration1+"</sub>";}
	else {string_method1=string_method1+"f(y<sub>"+iteration1+"</sub>) &gt f(z<sub>"+iteration1+"</sub>)<br>";
	string_method1=string_method1+"Поэтому a<sub>"+(iteration1+1)+"</sub>=y<sub>"+iteration1+"</sub>, b<sub>"+(iteration1+1)+"</sub>=b<sub>"+iteration1+"</sub>";}
  break;
  case 4:string_method1=string_method1+"Проверим условие окончания:<br>";
  temp1=OptimizationBasic.round((b1[iteration1+1]-a1[iteration1+1]),3);
  if (temp1<=final_interval&&combobox_compare.getSelectedIndex()==0) {stop_method1=true;}
  if (2*(iteration1+1)>=function_calculations&&combobox_compare.getSelectedIndex()==1) {stop_method1=true;}
  if (combobox_compare.getSelectedIndex()==0)
	if (!stop_method1) {string_method1=string_method1+"(b<sub>"+(iteration1+1)+"</sub>-a<sub>"+(iteration1+1)+"</sub>) &lt \u2113<br>";
	string_method1=string_method1+"(b<sub>"+(iteration1+1)+"</sub>-a<sub>"+(iteration1+1)+"</sub>)="+temp1+" &gt "+final_interval+"<br>";
	string_method1=string_method1+"Продолжаем вычисления";}
	else {string_method1=string_method1+"(b<sub>"+(iteration1+1)+"</sub>-a<sub>"+(iteration1+1)+"</sub>) &lt \u2113<br>";
	string_method1=string_method1+"(b<sub>"+(iteration1+1)+"</sub>-a<sub>"+(iteration1+1)+"</sub>)="+temp1+" &lt "+final_interval+"<br>";
	string_method1=string_method1+"Решение найдено!<br>Произведено <font color=red>"+2*(iteration1+1)+" вычислений функции";
	if ((combobox_metods.getSelectedIndex()==0))label_method1.setText(string_method1);
        }
  if (combobox_compare.getSelectedIndex()==1)
	if (!stop_method1) {string_method1=string_method1+"Вычислено значений функции:<br>"+2*(iteration1+1)+" &lt "+function_calculations+"<br>";
	string_method1=string_method1+"Продолжаем вычисления";}
	else {string_method1=string_method1+"вычислено значений функции:<br>"+2*(iteration1+1)+" &gt ="+function_calculations+"<br>";
	string_method1=string_method1+"Решение найдено!<br>Конечный интервал неопределенности:<br><font color=red>";
	string_method1=string_method1+"(b<sub>"+(iteration1+1)+"</sub>-a<sub>"+(iteration1+1)+"</sub>)="+temp1+"<br>";
	if ((combobox_metods.getSelectedIndex()==0)) label_method1.setText(string_method1);
        }
  break;

  default:;break;
}
//выводится информация по методу золотого сечения
if (!stop_method2) switch (step2){
case 1:string_method2=string_method2+"Вычислим<br>";
 if (iteration2==0){ gold_calc=0;
  string_method2=string_method2+"y<sub>"+iteration2+"</sub>=a<sub>"+iteration2+"</sub>+(b<sub>"+iteration2+"</sub>-a<sub>"+iteration2+"</sub>)*"+(1-gold_num)+"="+y2[iteration2]+"<br>";
  string_method2=string_method2+"z<sub>"+iteration2+"</sub>=a<sub>"+iteration2+"</sub>+(b<sub>"+iteration2+"</sub>-a<sub>"+iteration2+"</sub>)*"+gold_num+"="+z2[iteration2]+"<br>";}
 else
    {temp1=OptimizationBasic.round(f(y3[iteration2-1]),3);
     temp2=OptimizationBasic.round(f(z3[iteration2-1]),3);
  if (temp1<=temp2)string_method2=string_method2+"y<sub>"+iteration2+"</sub>=a<sub>"+iteration2+"</sub>+(b<sub>"+iteration2+"</sub>-a<sub>"+iteration2+"</sub>)*"+(1-gold_num)+"="+y2[iteration2]+"<br>";
	else string_method2=string_method2+"y<sub>"+iteration2+"</sub>=z<sub>"+(iteration2-1)+"</sub>="+y2[iteration2]+"<br>";
  if (temp1>temp2) string_method2=string_method2+"z<sub>"+iteration2+"</sub>=a<sub>"+iteration2+"</sub>+(b<sub>"+iteration2+"</sub>-a<sub>"+iteration2+"</sub>)*"+gold_num+"="+z2[iteration2]+"<br>";
	else string_method2=string_method2+"z<sub>"+iteration2+"</sub>=y<sub>"+(iteration2-1)+"</sub>="+z2[iteration2]+"<br>";}
break;
case 2: if (iteration2==0) gold_calc=0;
string_method2=string_method2+"Вычислим значение функции в точках y<sub>"+iteration2+"</sub> и z<sub>"+iteration2+"</sub>:<br>";
temp1=OptimizationBasic.round(f(y2[iteration2]),3);
temp2=OptimizationBasic.round(f(z2[iteration2]),3);
if (gold_calc!=1) string_method2=string_method2+"f(y<sub>"+iteration2+"</sub>)="+temp1+"<br>";
	else string_method2=string_method2+"f(y<sub>"+iteration2+"</sub>)=f(z<sub>"+(iteration2-1)+"</sub>)="+temp1+"<br>";
if (gold_calc!=2) string_method2=string_method2+"f(z<sub>"+iteration2+"</sub>)="+temp2+"<br>";
	else string_method2=string_method2+"f(z<sub>"+iteration2+"</sub>)=f(y<sub>"+(iteration2-1)+"</sub>)="+temp2+"<br>";
break;
case 3:string_method2=string_method2+"Сравним значение функции в точках y<sub>"+iteration2+"</sub> и z<sub>"+iteration2+"</sub>:<br>";
temp1=OptimizationBasic.round(f(y2[iteration2]),3);
temp2=OptimizationBasic.round(f(z2[iteration2]),3);
if (temp1<=temp2) {string_method2=string_method2+"f(y<sub>"+iteration2+"</sub>) &lt f(z<sub>"+iteration2+"</sub>)<br>";
	string_method2=string_method2+"Поэтому a<sub>"+(iteration2+1)+"</sub>=a<sub>"+iteration2+"</sub>, b<sub>"+(iteration2+1)+"</sub>=z<sub>"+iteration2+"</sub>, z<sub>"+(iteration2+1)+"</sub>=y<sub>"+iteration2+"</sub>"; }
	else {string_method2=string_method2+"f(y<sub>"+iteration2+"</sub>) &gt f(z<sub>"+iteration2+"</sub>)<br>";
	string_method2=string_method2+"Поэтому a<sub>"+(iteration2+1)+"</sub>=y<sub>"+iteration2+"</sub>, b<sub>"+(iteration2+1)+"</sub>=b<sub>"+iteration2+"</sub>, y<sub>"+(iteration2+1)+"</sub>=z<sub>"+iteration2+"</sub>";}
break;
case 4:string_method2=string_method2+"Проверим условие окончания:<br>";
temp2=OptimizationBasic.round((b2[iteration2+1]-a2[iteration2+1]),3);
if (temp2<=final_interval&&combobox_compare.getSelectedIndex()==0 && combobox_metods.getSelectedIndex()==0) {stop_method2=true; combobox_accuracy.setEnabled(true);}
if ((iteration2+2)>=function_calculations&&combobox_compare.getSelectedIndex()==1 && combobox_metods.getSelectedIndex()==0) {stop_method2=true; combobox_accuracy.setEnabled(true);}
if (temp2<=final_interval&&combobox_compare.getSelectedIndex()==1 && combobox_metods.getSelectedIndex()==1) {stop_method2=true; combobox_accuracy.setEnabled(true);}
if (temp2<=final_interval&&combobox_compare.getSelectedIndex()==0 && combobox_metods.getSelectedIndex()==1) {stop_method2=true; combobox_accuracy.setEnabled(true);}
if ((combobox_compare.getSelectedIndex()==0)||(combobox_compare.getSelectedIndex()==1 && combobox_metods.getSelectedIndex()==1))
	if (!stop_method2) {string_method2=string_method2+"(b<sub>"+(iteration2+1)+"</sub>-a<sub>"+(iteration2+1)+"</sub>) &lt \u2113<br>";
	string_method2=string_method2+"(b<sub>"+(iteration2+1)+"</sub>-a<sub>"+(iteration2+1)+"</sub>)="+temp2+" &gt "+final_interval+"<br>";
	string_method2=string_method2+"Продолжаем вычисления";}
	else {string_method2=string_method2+"(b<sub>"+(iteration2+1)+"</sub>-a<sub>"+(iteration2+1)+"</sub>) &lt \u2113<br>";
	string_method2=string_method2+"(b<sub>"+(iteration2+1)+"</sub>-a<sub>"+(iteration2+1)+"</sub>)="+temp2+" &lt "+final_interval+"<br>";
	string_method2=string_method2+"Решение найдено!<br>Произведено <font color=red>"+(iteration2+2)+" вычислений функции";
	label_method2.setText(string_method2);}
if (combobox_compare.getSelectedIndex()==1 && combobox_metods.getSelectedIndex()==0)
	if (!stop_method2) {string_method2=string_method2+"Вычислено значений функции:<br>"+(iteration2+2)+" &lt "+function_calculations+"<br>";
	string_method2=string_method2+"Продолжаем вычисления";}
	else {string_method2=string_method2+"вычислено значений функции:<br>"+(iteration2+2)+" &gt ="+function_calculations+"<br>";
	string_method2=string_method2+"Решение найдено!<br>Конечный интервал неопределенности:<br><font color=red>";
	string_method2=string_method2+"(b<sub>"+(iteration2+1)+"</sub>-a<sub>"+(iteration2+1)+"</sub>)="+temp2+"<br>";
	label_method2.setText(string_method2);}

break;
default:;break;}
//выводится информация по методу Фибоначчи
if (combobox_metods.getSelectedIndex()==1 && combobox_compare.getSelectedIndex()==1)
{if (!stop_method3_1) switch (step3){
case 1:string_method3=string_method3+"Вычислим<br>";
 if (iter3==0) {fib_calc=0;
 string_method3=string_method3+"y<sub>"+iter3+"</sub>=a<sub>"+iter3+"</sub>+(b<sub>"+iter3+"</sub>-a<sub>"+iter3+"</sub>)*"+Fibonachi(N2-2)+"/"+Fibonachi(N2)+"="+y3[iter3+N1]+"<br>";
 string_method3=string_method3+"z<sub>"+iter3+"</sub>=a<sub>"+iter3+"</sub>+(b<sub>"+iter3+"</sub>-a<sub>"+iter3+"</sub>)*"+Fibonachi(N2-1)+"/"+Fibonachi(N2)+"="+z3[iter3+N1]+"<br>";}
  else{
   if (iter3==N2-2){
     string_method3=string_method3+"y<sub>"+iter3+"</sub>=z<sub>"+iter3+"</sub>=(a<sub>"+iter3+"</sub>+ b<sub>"+iter3+"</sub>)* 1/2 ="+y3[iter3+N1]+"<br>";
     string_method3=string_method3+"y<sub>"+(iter3+1)+"</sub>=y<sub>"+iter3+"</sub>=z<sub>"+iter3+"</sub>="+y3[iter3+N1+1]+"<br>";
     string_method3=string_method3+"z<sub>"+(iter3+1)+"</sub>=y<sub>"+iter3+"</sub>+ \u03B5 ="+z3[iter3+N1+1]+"<br>";}
   else
    {temp1=OptimizationBasic.round(f(y3[iter3+N1-1]),3);
     temp2=OptimizationBasic.round(f(z3[iter3+N1-1]),3);
     if (temp1<=temp2) string_method3=string_method3+"y<sub>"+iter3+"</sub>=a<sub>"+iter3+"</sub>+(b<sub>"+iter3+"</sub>-a<sub>"+iter3+"</sub>)*"+Fibonachi(N2-iter3+1-3)+"/"+Fibonachi(N2-iter3+1-1)+"="+y3[iter3+N1]+"<br>";
	else string_method3=string_method3+"y<sub>"+iter3+"</sub>=z<sub>"+(iter3-1)+"</sub>="+y3[iter3+N1]+"<br>";
     if (temp1>temp2) string_method3=string_method3+"z<sub>"+iter3+"</sub>=a<sub>"+iter3+"</sub>+(b<sub>"+iter3+"</sub>-a<sub>"+iter3+"</sub>)*"+Fibonachi(N2-iter3+1-2)+"/"+Fibonachi(N2-iter3+1-1)+"="+z3[iter3+N1]+"<br>";
	else string_method3=string_method3+"z<sub>"+iter3+"</sub>=y<sub>"+(iter3-1)+"</sub>="+z3[iter3+N1]+"<br>";}}
break;
case 2: if (iter3==0||iter3==N2-2) fib_calc=0;
string_method3=string_method3+"Вычислим значение функции в точках y<sub>"+iter3+"</sub> и z<sub>"+iter3+"</sub>:<br>";
temp1=OptimizationBasic.round(f(y3[iter3+N1]),3);
temp2=OptimizationBasic.round(f(z3[iter3+N1]),3);
if (iter3==0){
if (fib_calc!=2) string_method3=string_method3+"f(y<sub>"+iter3+"</sub>)="+temp1+"<br>";
if (fib_calc!=1) string_method3=string_method3+"f(z<sub>"+iter3+"</sub>)="+temp2+"<br>";
	}
else{
 if (iter3==N2-2){string_method3=string_method3+"f(y<sub>"+(iter3+1)+"</sub>)="+OptimizationBasic.round(f(y3[iter3+N1+1]),3)+"<br>";
                      string_method3=string_method3+"f(z<sub>"+(iter3+1)+"</sub>)="+OptimizationBasic.round(f(z3[iter3+N1+1]),3)+"<br>";}
 else
 {if (f(y3[iter3+N1-1]) <= f(z3[iter3+N1-1]))string_method3=string_method3+"f(y<sub>"+iter3+"</sub>)="+temp1+"<br>";
	else string_method3=string_method3+"f(y<sub>"+iter3+"</sub>)=f(z<sub>"+(iter3-1)+"</sub>)="+temp1+"<br>";
  if (f(y3[iter3+N1-1]) > f(z3[iter3+N1-1])) string_method3=string_method3+"f(z<sub>"+iter3+"</sub>)="+temp2+"<br>";
	else string_method3=string_method3+"f(z<sub>"+iter3+"</sub>)=f(y<sub>"+(iter3-1)+"</sub>)="+temp2+"<br>";}}
break;
case 3:string_method3=string_method3+"Сравним значение функции в точках y<sub>"+iter3+"</sub> и z<sub>"+iter3+"</sub>:<br>";
temp1=OptimizationBasic.round(f(y3[iter3+N1]),3);
temp2=OptimizationBasic.round(f(z3[iter3+N1]),3);
 if (iter3==N2-2){  temp1=OptimizationBasic.round(f(y3[iter3+1+N1]),3);
                    temp2=OptimizationBasic.round(f(z3[iter3+1+N1]),3);}
 if (temp1<=temp2) {
  if (iter3==N2-2){ string_method3=string_method3+"f(y<sub>"+(iter3+1)+"</sub>) &lt f(z<sub>"+(iter3+1)+"</sub>)<br>";
      string_method3=string_method3+"Поэтому a<sub>"+(iter3+1)+"</sub>=a<sub>"+iter3+"</sub>, b<sub>"+(iter3+1)+"</sub>=z<sub>"+(iter3+1)+"</sub>";}
   else
    {  string_method3=string_method3+"f(y<sub>"+iter3+"</sub>) &lt f(z<sub>"+iter3+"</sub>)<br>";
      string_method3=string_method3+"Поэтому a<sub>"+(iter3+1)+"</sub>=a<sub>"+iter3+"</sub>, b<sub>"+(iter3+1)+"</sub>=z<sub>"+iter3+"</sub>, z<sub>"+(iter3+1)+"</sub>=y<sub>"+iter3+"</sub>";} }
 else {
  if (iter3==N2-2){
    string_method3=string_method3+"f(y<sub>"+(iter3+1)+"</sub>) &gt f(z<sub>"+(iter3+1)+"</sub>)<br>";
    string_method3=string_method3+"Поэтому a<sub>"+(iter3+1)+"</sub>=y<sub>"+(iter3+1)+"</sub>, b<sub>"+(iter3+1)+"</sub>=b<sub>"+iter3+"</sub>";}
  else
     {string_method3=string_method3+"f(y<sub>"+iter3+"</sub>) &gt f(z<sub>"+iter3+"</sub>)<br>";
     string_method3=string_method3+"Поэтому a<sub>"+(iter3+1)+"</sub>=y<sub>"+iter3+"</sub>, b<sub>"+(iter3+1)+"</sub>=b<sub>"+iter3+"</sub>, y<sub>"+(iter3+1)+"</sub>=z<sub>"+iter3+"</sub>";}}
break;
case 4:string_method3=string_method3+"Проверим условие окончания:<br>";
temp2=OptimizationBasic.round((b3[iter3+1+N1]-a3[iter3+1+N1]),3);
if (iter3==N2-2 ){ stop_method3_1=true; combobox_accuracy.setEnabled(false);}
if (combobox_compare.getSelectedIndex()==1)
	if (iter3 < N2-3) {string_method3=string_method3+"k = N -3 <br>";
	string_method3=string_method3+"k = "+iter3+" \u2260 "+N2+" - 3 = "+(N2-3)+"<br>";
	string_method3=string_method3+"Продолжаем вычисления";}
	else {
         if (iter3==N2-2){  string_method3=string_method3+"k = "+iter3+" = N - 2 = "+(N2-2)+"<br>";
          string_method3=string_method3+"(b<sub>"+(iter3+1)+"</sub>-a<sub>"+(iter3+1)+"</sub>)="+OptimizationBasic.round((b3[iter3+1+N1]-a3[iter3+1+N1]),3)+" &lt "+final_interval+"<br>";
          string_method3=string_method3+"Решение найдено!<br>На данном этапе количество вычислений функции равно <font color=red>"+(N2)+"<font color=#002A64> <br>";
           string_method3=string_method3+"Всего произведено <font color=red>"+(N1+N2)+"<br>вычислений функции";}
         else {string_method3=string_method3+"k = N -3 <br>";
	   string_method3=string_method3+"k = "+iter3+" = "+N2+" - 3 <br>";
	   string_method3=string_method3+"Следует произвести конечные вычисления<br>";}
	if ((combobox_metods.getSelectedIndex()==1))label_method1.setText(string_method3);
        }
break;
default: break;
 }}
if (!stop_method3) switch (step3){
case 1:string_method3=string_method3+"Вычислим<br>";
 if (iteration3==0) {fib_calc=0;
 string_method3=string_method3+"y<sub>"+iteration3+"</sub>=a<sub>"+iteration3+"</sub>+(b<sub>"+iteration3+"</sub>-a<sub>"+iteration3+"</sub>)*"+Fibonachi(N1-2)+"/"+Fibonachi(N1)+"="+y3[iteration3]+"<br>";
 string_method3=string_method3+"z<sub>"+iteration3+"</sub>=a<sub>"+iteration3+"</sub>+(b<sub>"+iteration3+"</sub>-a<sub>"+iteration3+"</sub>)*"+Fibonachi(N1-1)+"/"+Fibonachi(N1)+"="+z3[iteration3]+"<br>";}
  else{
   if (iteration3==N1-2){
     string_method3=string_method3+"y<sub>"+iteration3+"</sub>=z<sub>"+iteration3+"</sub>=(a<sub>"+iteration3+"</sub>+ b<sub>"+iteration3+"</sub>)* 1/2="+y3[iteration3]+"<br>";
     string_method3=string_method3+"y<sub>"+(iteration3+1)+"</sub>=y<sub>"+iteration3+"</sub>=z<sub>"+iteration3+"</sub>="+y3[iteration3+1]+"<br>";
     string_method3=string_method3+"z<sub>"+(iteration3+1)+"</sub>=y<sub>"+iteration3+"</sub>+ \u03B5 ="+z3[iteration3+1]+"<br>";}
   else
    {temp1=OptimizationBasic.round(f(y3[iteration3-1]),3);
     temp2=OptimizationBasic.round(f(z3[iteration3-1]),3);
     if (temp1<=temp2) string_method3=string_method3+"y<sub>"+iteration3+"</sub>=a<sub>"+iteration3+"</sub>+(b<sub>"+iteration3+"</sub>-a<sub>"+iteration3+"</sub>)*"+Fibonachi(N1-iteration3+1-3)+"/"+Fibonachi(N1-iteration3+1-1)+"="+y3[iteration3]+"<br>";
	else string_method3=string_method3+"y<sub>"+iteration3+"</sub>=z<sub>"+(iteration3-1)+"</sub>="+y3[iteration3]+"<br>";
     if (temp1>temp2) string_method3=string_method3+"z<sub>"+iteration3+"</sub>=a<sub>"+iteration3+"</sub>+(b<sub>"+iteration3+"</sub>-a<sub>"+iteration3+"</sub>)*"+Fibonachi(N1-iteration3+1-2)+"/"+Fibonachi(N1-iteration3+1-1)+"="+z3[iteration3]+"<br>";
	else string_method3=string_method3+"z<sub>"+iteration3+"</sub>=y<sub>"+(iteration3-1)+"</sub>="+z3[iteration3]+"<br>";}}
break;
case 2: if (iteration3==0||iteration3==N1-2) fib_calc=0;
string_method3=string_method3+"Вычислим значение функции в точках y<sub>"+iteration3+"</sub> и z<sub>"+iteration3+"</sub>:<br>";
temp1=OptimizationBasic.round(f(y3[iteration3]),3);
temp2=OptimizationBasic.round(f(z3[iteration3]),3);
if (iteration3==0){
if (fib_calc!=2) string_method3=string_method3+"f(y<sub>"+iteration3+"</sub>)="+temp1+"<br>";
if (fib_calc!=1) string_method3=string_method3+"f(z<sub>"+iteration3+"</sub>)="+temp2+"<br>";
	}
else{
 if (iteration3==N1-2){string_method3=string_method3+"f(y<sub>"+(iteration3+1)+"</sub>)="+OptimizationBasic.round(f(y3[iteration3+1]),3)+"<br>";
                      string_method3=string_method3+"f(z<sub>"+(iteration3+1)+"</sub>)="+OptimizationBasic.round(f(z3[iteration3+1]),3)+"<br>";}
 else
 {if (f(y3[iteration3-1]) <= f(z3[iteration3-1]))string_method3=string_method3+"f(y<sub>"+iteration3+"</sub>)="+temp1+"<br>";
	else string_method3=string_method3+"f(y<sub>"+iteration3+"</sub>)=f(z<sub>"+(iteration3-1)+"</sub>)="+temp1+"<br>";
  if (f(y3[iteration3-1])>f(z3[iteration3-1])) string_method3=string_method3+"f(z<sub>"+iteration3+"</sub>)="+temp2+"<br>";
	else string_method3=string_method3+"f(z<sub>"+iteration3+"</sub>)=f(y<sub>"+(iteration3-1)+"</sub>)="+temp2+"<br>";}}
break;
case 3:string_method3=string_method3+"Сравним значение функции в точках y<sub>"+iteration3+"</sub> и z<sub>"+iteration3+"</sub>:<br>";
temp1=OptimizationBasic.round(f(y3[iteration3]),3);
temp2=OptimizationBasic.round(f(z3[iteration3]),3);
 if (iteration3==N1-2){temp1=OptimizationBasic.round(f(y3[iteration3+1]),3);
                      temp2=OptimizationBasic.round(f(z3[iteration3+1]),3);}
 if (temp1<=temp2) {
  if (iteration3==N1-2){ string_method3=string_method3+"f(y<sub>"+(iteration3+1)+"</sub>) &lt f(z<sub>"+(iteration3+1)+"</sub>)<br>";
      string_method3=string_method3+"Поэтому a<sub>"+(iteration3+1)+"</sub>=a<sub>"+iteration3+"</sub>, b<sub>"+(iteration3+1)+"</sub>=z<sub>"+(iteration3+1)+"</sub>";}
   else
    {  string_method3=string_method3+"f(y<sub>"+iteration3+"</sub>) &lt f(z<sub>"+iteration3+"</sub>)<br>";
      string_method3=string_method3+"Поэтому a<sub>"+(iteration3+1)+"</sub>=a<sub>"+iteration3+"</sub>, b<sub>"+(iteration3+1)+"</sub>=z<sub>"+iteration3+"</sub>, z<sub>"+(iteration3+1)+"</sub>=y<sub>"+iteration3+"</sub>";} }
 else {
  if (iteration3==N1-2){
    string_method3=string_method3+"f(y<sub>"+(iteration3+1)+"</sub>) &gt f(z<sub>"+(iteration3+1)+"</sub>)<br>";
    string_method3=string_method3+"Поэтому a<sub>"+(iteration3+1)+"</sub>=y<sub>"+(iteration3+1)+"</sub>, b<sub>"+(iteration3+1)+"</sub>=b<sub>"+iteration3+"</sub>";}
  else
     {string_method3=string_method3+"f(y<sub>"+iteration3+"</sub>) &gt f(z<sub>"+iteration3+"</sub>)<br>";
     string_method3=string_method3+"Поэтому a<sub>"+(iteration3+1)+"</sub>=y<sub>"+iteration3+"</sub>, b<sub>"+(iteration3+1)+"</sub>=b<sub>"+iteration3+"</sub>, y<sub>"+(iteration3+1)+"</sub>=z<sub>"+iteration3+"</sub>";}}
break;
case 4:string_method3=string_method3+"Проверим условие окончания:<br>";
temp2=OptimizationBasic.round((b3[iteration3+1]-a3[iteration3+1]),3);
if (iteration3==N1-2 ) {stop_method3=true; }
//if ((iteration3+2)>=function_calculations&&combobox_compare.getSelectedIndex()==1) stop_method3=true;
if (combobox_compare.getSelectedIndex()==0)
	if (iteration3 < N1-3) {string_method3=string_method3+"k = N -3 <br>";
	string_method3=string_method3+"k = "+iteration3+" \u2260 "+N1+" - 3 = "+(N1-3)+"<br>";
	string_method3=string_method3+"Продолжаем вычисления";}
	else {
         if (iteration3==N1-2){ string_method3=string_method3+"k = "+iteration3+" = N - 2 = "+(N1-2)+"<br>";
         string_method3=string_method3+"(b<sub>"+(iteration3+1)+"</sub>-a<sub>"+(iteration3+1)+"</sub>)="+temp2+" &lt "+final_interval+"<br>";
         string_method3=string_method3+"Решение найдено!<br>Произведено <font color=red>"+(N1)+" вычислений функции";}
         else {string_method3=string_method3+"k = N -3 <br>";
	   string_method3=string_method3+"k = "+iteration3+" = "+N1+" - 3 <br>";
	   string_method3=string_method3+"Следует произвести конечные вычисления<br>";}
	if ((combobox_metods.getSelectedIndex()==1))label_method1.setText(string_method3);
        }
if (combobox_compare.getSelectedIndex()==1)
	if (iteration3 < N1-3) {string_method3=string_method3+"k = N -3 <br>";
	string_method3=string_method3+"k = "+iteration3+" \u2260 "+N1+" - 3 = "+(N1-3)+"<br>";
	string_method3=string_method3+"Продолжаем вычисления";}
	else {
         if (iteration3==N1-2){ string_method3=string_method3+"k = "+iteration3+" = N - 2 = "+(N1-2)+"<br>";
         string_method3=string_method3+"(b<sub>"+(iteration3+1)+"</sub>-a<sub>"+(iteration3+1)+"</sub>)="+temp2+" &lt "+final_interval+"<br>";
         string_method3=string_method3+"Решение найдено!<br>Произведено <font color=red>"+(N1)+" вычислений функции";
         iteration3=iteration3+1;}
         else {string_method3=string_method3+"k = N -3 <br>";
	   string_method3=string_method3+"k = "+iteration3+" = "+N1+" - 3 <br>";
	   string_method3=string_method3+"Следует произвести конечные вычисления<br>";}
	if ((combobox_metods.getSelectedIndex()==1))label_method1.setText(string_method3);
        }
break;
default:;break;
 }
  if ((!stop_method1)&&(combobox_metods.getSelectedIndex()==0)) label_method1.setText(string_method1);
  if (!stop_method2) label_method2.setText(string_method2);
  if ((!stop_method3)&&(combobox_metods.getSelectedIndex()==1)) label_method1.setText(string_method3);
  if ((!stop_method3_1)&&(combobox_metods.getSelectedIndex()==1)&&(combobox_compare.getSelectedIndex()==1)) label_method1.setText(string_method3);
  if (stop_method3==true&&stop_method2==true&&stop_method3_1==true&&(combobox_compare.getSelectedIndex()==1)&&iter3==0) button_next.setEnabled(false);
  if (stop_method3==true&&stop_method2==true&&(combobox_metods.getSelectedIndex()==1)&&(combobox_compare.getSelectedIndex()==1)) button_previous.setEnabled(false);
  //if (stop_method1==true&&stop_method2==true) button_next.setEnabled(false);
   }
  }
  class Panel_paint extends JPanel {
  public void paintComponent(Graphics g) {
  super.paintComponent(g);
  Stringer.setGraphics(g);
 // g.setColor(Color.black);
  double maxf = Math.max(f(a0), f(b0));
  switch (ch_method) {
  case 12:g.drawString("", 10, 15);break;
  }
   Stringer.fonts[0] = new Font("SansSerif", 1, 12);
   Stringer.fonts[1] = new Font("SansSerif", 1, 12-3);
   Stringer.fonts[2] = new Font("SansSerif", 1, 12-3);

  g.setColor(new Color(247, 247, 255));
  g.fillRect(0, 160, 235, 16);
  g.setColor(new Color(157, 187, 255));
  g.drawRect(0, 0, 234, 160);g.drawRect(0, 176, 234, 159);
  g.setColor(Color.black);
  kof1 = normy / Math.max(f(a0), f(b0)) / norms;
  kof2 = normx / (double) (b0 - a0) / norms;

  int x0 = 20, y0 = 135, j=0;
// линия Oy
  g.drawLine(x0- (int)((a0)*kof2), y0+18, x0- (int)((a0)*kof2), (int)(y0-f(b0)*kof1)-7);
  g.drawLine(x0- (int)((a0)*kof2)+3, (int)(y0-f(b0)*kof1)-2, x0- (int)((a0)*kof2), (int)(y0-f(b0)*kof1)-7);
  g.drawLine(x0-(int)((a0)*kof2)-3, (int)(y0-f(b0)*kof1)-2, x0- (int)((a0)*kof2), (int)(y0-f(b0)*kof1)-7);
  // линия Ox
  g.drawLine(x0-18, y0+10, x0 + normx / norms+16, y0+10);


for (int i = 0; i < normx / norms +3;i+=5) {
	double temp11=f(a0 + i / kof2)*kof1;
//	g.drawLine(i + x0,y0-(int)temp11, i + x0,y0);
}

  for (j = 1; j<7; j++)
     g.drawLine(x0-(int)((a0)*kof2)-3, (int)(double)(y0-(j*(f(0)*kof1+15)))+10, x0-(int)((a0)*kof2)+ 3, (int)(double)(y0-(j*(f(0)*kof1+15)))+10);
  g.drawLine( x0 + normx / norms+11, y0+7, x0 + normx / norms+16, y0+10);
  g.drawLine( x0 + normx / norms+11, y0+13, x0 + normx / norms+16, y0+10);
  if (combobox_interval.getSelectedIndex()==1)
  { for (j = 1; j<b0; j++)
    g.drawLine((x0+ (int)((Math.abs(a0-1)+j)*kof2)), y0+10, (x0+ (int)((Math.abs(a0-1)+j)*kof2)), y0+7);
    g.drawLine((x0+ (int)((Math.abs(a0-1))*kof2)), y0+14, (x0+ (int)((Math.abs(a0-1))*kof2)), y0+7);
    g.drawString("1",x0+ (int)((Math.abs(a0-1))*kof2)-2, y0+23);}
  else
   {for (j = (int)(a0); j<b0; j++)
   g.drawLine((x0+ (int)((Math.abs(a0)+j)*kof2)), y0+10, (x0+ (int)((Math.abs(a0)+j)*kof2)), y0+7);
   g.drawLine((x0+ (int)((Math.abs(a0)+1)*kof2)), y0+14, (x0+ (int)((Math.abs(a0)+1)*kof2)), y0+7);
   g.drawString("1",x0+ (int)((Math.abs(a0)+1)*kof2)-2, y0+23);}
 g.drawString("0",x0- (int)(((a0))*kof2)-5, y0+23);
   g.setFont(new java.awt.Font("SansSerif", 1, 12));
   g.drawString("x",x0 + normx / norms+10, y0+6);
   g.drawString("f(x)",x0-(int)((a0)*kof2)+7, (int)(y0-f(b0)*kof1)+2);
//левая линия
  g.drawLine(x0, y0+10, x0, (int)(y0-f(a0)*kof1)-5);
//правая линия
  g.drawLine(x0+ normx / norms, y0+10, x0+ normx / norms, (int)(y0-f(b0)*kof1)-5);
   double temp1, temp2, temp3, temp4;
    g.setColor(new Color(0, 0, 150));
   for (int i = -x0; i < normx / norms +3;i++) {          //график
	temp1=(y0 - f(a0 + i / kof2)*kof1);
	temp2=(y0 - f(a0 + (i + 1) / kof2)*kof1);
	g.drawLine(i + x0,(int)temp1-5, i + 1 + x0,(int)temp2-5);}

   if (combobox_metods.getSelectedIndex()==0) //рисуется картинка метода дихотомии
 {
  if ((step1 >= 1)&&(step1!=4))         //линии y, z
  { g.setColor(new Color(0, 0, 200));
    temp1=(y1[iteration1]-a0)*kof2; temp2=(z1[iteration1]-a0)*kof2;
    temp3=f(y1[iteration1])*kof1;
    Stringer.drawString("y_{"+iteration1+"}",x0+ (int)(temp1)-5,y0+20);
    g.drawLine(x0+ (int)(temp1), y0+10, x0+ (int)(temp1), (int)(y0-temp3)-5);
    g.fillOval(x0+ (int)(temp1)-1, (int)(y0-temp3-2)-5,4,4);
    temp3=f(z1[iteration1])*kof1;
    g.setColor(new Color(170, 0, 183));
    Stringer.drawString("z_{"+iteration1+"}",x0+ (int)(temp2)+2,y0+20);
    g.drawLine(x0+ (int)(temp2), y0+10, x0+ (int)(temp2), (int)(y0-temp3)-5);
    g.fillOval(x0+ (int)(temp2)-1, (int)(y0-temp3-2)-5,4,4);}

  temp1=(a1[iteration1]-a0)*kof2;temp2=(b1[iteration1]-a0)*kof2;
  g.setColor(new Color(140, 0, 80));
  g.setFont(new java.awt.Font("SansSerif", 1, 12));
  if (step1<4)
  {Stringer.drawString("a_{"+iteration1+"}",x0+ (int)(temp1)-15,y0+20);
   Stringer.drawString("b_{"+iteration1+"}",x0+ (int)(temp2)+8,y0+20);}
  g.setColor(Color.red);
 //линиии a, b
   temp3=f(a1[iteration1])*kof1;
   temp4=f(b1[iteration1])*kof1;
   if (step1 >=4)
   { g.setColor(new Color(140, 0, 80));
     g.setFont(new java.awt.Font("SansSerif", 1, 12));
     temp3=f(a1[iteration1+1])*kof1;  temp4=f(b1[iteration1+1])*kof1;
     temp1=(a1[iteration1+1]-a0)*kof2; temp2=(b1[iteration1+1]-a0)*kof2;
     Stringer.drawString("a_{"+(iteration1+1)+"}",x0+ (int)(temp1)-15,y0+20);
     Stringer.drawString("b_{"+(iteration1+1)+"}",x0+ (int)(temp2)+8,y0+20);
     g.setColor(Color.red);
     g.drawLine(x0+ (int)(temp1), y0+10, x0+ (int)(temp2), y0+10);
     }
   g.drawLine(x0+ (int)(temp1), y0+10, x0+ (int)(temp1), (int)(y0-temp3)-5);
   g.drawLine(x0+ (int)(temp2), y0+10, x0+ (int)(temp2), (int)(y0-temp4)-5);
     }//дихотомия the end

  else//рисуется картинка метода Фибоначчи
 {   //линии y, z
  if (!stop_method3){ k=iteration3; N=N1;}
  if (!stop_method3_1) {k=iter3; N=N2;}
  if ((step3 >= 1)&&(step3!=4))
   { if(k==N-2){ g.setColor(new Color(0, 0, 200));
      temp1=(y3[iteration3+iter3+1]-a0)*kof2; temp2=(z3[iteration3+iter3+1]-a0)*kof2;
      temp3=f(y3[iteration3+iter3+1])*kof1;
      if(k==0) {Stringer.drawString("y_{"+(k)+"}",x0+ (int)(temp1)-5,y0+20);}
      else Stringer.drawString("y_{"+(k+1)+"}",x0+ (int)(temp1)-5,y0+20);
      g.drawLine(x0+ (int)(temp1), y0+10, x0+ (int)(temp1), (int)(y0-temp3)-5);
      g.fillOval(x0+ (int)(temp1)-1, (int)(y0-temp3-2)-5,4,4);
      temp3=f(z3[iteration3+iter3+1])*kof1;
      g.setColor(new Color(170, 0, 183));
      if(k==0) Stringer.drawString("z_{"+(k)+"}",x0+ (int)(temp2)+2,y0+20);
      else Stringer.drawString("z_{"+(k+1)+"}",x0+ (int)(temp2)+2,y0+20);
      g.drawLine(x0+ (int)(temp2), y0+10, x0+ (int)(temp2), (int)(y0-temp3)-5);
      g.fillOval(x0+ (int)(temp2)-1, (int)(y0-temp3-2)-5,4,4);
    }
     if (k < N-2){
    g.setColor(new Color(0, 0, 200));
    if(!stop_method3_1){ temp1=(y3[iteration3+iter3+1]-a0)*kof2; temp2=(z3[iteration3+iter3+1]-a0)*kof2;
      temp3=f(y3[iteration3+iter3+1])*kof1; temp4=f(z3[iteration3+iter3+1])*kof1;}
    else
    { temp1=(y3[iteration3+iter3]-a0)*kof2; temp2=(z3[iteration3+iter3]-a0)*kof2;
      temp3=f(y3[iteration3+iter3])*kof1; temp4=f(z3[iteration3+iter3])*kof1;}
    Stringer.drawString("y_{"+k+"}",x0+ (int)(temp1)-5,y0+20);
    g.drawLine(x0+ (int)(temp1), y0+10, x0+ (int)(temp1), (int)(y0-temp3)-5);
    g.fillOval(x0+ (int)(temp1)-1, (int)(y0-temp3-2)-5,4,4);
    g.setColor(new Color(170, 0, 183));
    Stringer.drawString("z_{"+k+"}",x0+ (int)(temp2)+2,y0+20);
    g.drawLine(x0+ (int)(temp2), y0+10, x0+ (int)(temp2), (int)(y0-temp4)-5);
    g.fillOval(x0+ (int)(temp2)-1, (int)(y0-temp4-2)-5,4,4);}}
  if(!stop_method3_1)  { temp1=(a3[iteration3+iter3+1]-a0)*kof2;temp2=(b3[iteration3+iter3+1]-a0)*kof2;}
  else {temp1=(a3[iteration3+iter3]-a0)*kof2;temp2=(b3[iteration3+iter3]-a0)*kof2;}
  g.setColor(new Color(140, 0, 80));
  g.setFont(new java.awt.Font("SansSerif", 1, 12));
  if (step3<4)
  {
   Stringer.drawString("a_{"+k+"}",x0+ (int)(temp1)-15,y0+20);
   Stringer.drawString("b_{"+k+"}",x0+ (int)(temp2)+8,y0+20);}
  g.setColor(Color.red);
//линиии a, b
   temp3=f(a3[iteration3+iter3])*kof1;
   temp4=f(b3[iteration3+iter3])*kof1;
   if (step3 >=4)
    {if (!stop_method3_1) iteration3=iteration3+1;
     if (stop_method3==true&&stop_method3_1==true) k=k-3;
     if (stop_method3==true&&iter3==N2-2) k=iter3;
     g.setColor(new Color(140, 0, 80));
     g.setFont(new java.awt.Font("SansSerif", 1, 12));
     if (stop_method3_1==true&&stop_method3==true) iter3=iter3+1;
     temp3=f(a3[iteration3+iter3+1])*kof1;  temp4=f(b3[iteration3+iter3+1])*kof1;
     temp1=(a3[iteration3+iter3+1]-a0)*kof2; temp2=(b3[iteration3+iter3+1]-a0)*kof2;
     Stringer.drawString("a_{"+(k+1)+"}",x0+ (int)(temp1)-15,y0+20);
     Stringer.drawString("b_{"+(k+1)+"}",x0+ (int)(temp2)+8,y0+20);
     g.setColor(Color.red);
     g.drawLine(x0+ (int)(temp1), y0+10, x0+ (int)(temp2), y0+10);
     if (!stop_method3_1) iteration3=iteration3-1;
     if (stop_method3==true&&stop_method3_1==true) k=k+3;
      if (stop_method3_1==true&&stop_method3==true) iter3=iter3-1;
     }
   g.drawLine(x0+ (int)(temp1), y0+10, x0+ (int)(temp1), (int)(y0-temp3)-5);
   g.drawLine(x0+ (int)(temp2), y0+10, x0+ (int)(temp2), (int)(y0-temp4)-5);
      }// Фибоначчи the end
//рисуется картинка метода золотого сечения
  x0 = 20; y0 = 285;
  g.setColor(new Color(0, 0, 220));
  g.setFont(new java.awt.Font("Dialog", 1, 13));
  g.drawString("Метод золотого",133, 172);
  g.setColor(Color.black);
 // g.drawLine(x0, y0+35, x0 + normx / norms, y0+35);
  g.drawLine(x0, y0+35, x0, (int)(y0-f(a0)*kof1)+35-15);
  g.drawLine(x0+ normx / norms, y0+35, x0+ normx / norms, (int)(y0-f(b0)*kof1)+35-15);
  // линия Oy
  for (j = 1; j<6; j++)
     g.drawLine(x0-(int)((a0)*kof2)-3, (int)(double)(y0-(j*(f(0)*kof1+15)))+10+25, x0-(int)((a0)*kof2)+ 3, (int)(double)(y0-(j*(f(0)*kof1+15)))+10+25);
 g.setFont(new java.awt.Font("Dialog", 0, 9));
 g.setFont(new java.awt.Font("Dialog", 1, 13));
  g.drawLine(x0- (int)((a0)*kof2), y0+18+25, x0- (int)((a0)*kof2), (int)(y0-f(b0)*kof1)-7+25);
  g.drawLine(x0- (int)((a0)*kof2)+3, (int)(y0-f(b0)*kof1)-2+25, x0- (int)((a0)*kof2), (int)(y0-f(b0)*kof1)-7+25);
  g.drawLine(x0- (int)((a0)*kof2)-3, (int)(y0-f(b0)*kof1)-2+25, x0-(int)((a0)*kof2), (int)(y0-f(b0)*kof1)-7+25);
  // линия Ox
  g.drawLine(x0-18, y0+10+25, x0 + normx / norms+16, y0+10+25);
  g.drawLine( x0 + normx / norms+11, y0+7+25, x0 + normx / norms+16, y0+10+25);
  g.drawLine( x0 + normx / norms+11, y0+13+25, x0 + normx / norms+16, y0+10+25);
  if (combobox_interval.getSelectedIndex()==1)
  { for (j = 1; j<b0; j++)
    g.drawLine((x0+ (int)((Math.abs(a0-1)+j)*kof2)), y0+10+25, (x0+ (int)((Math.abs(a0-1)+j)*kof2)), y0+7+25);
    g.drawLine((x0+ (int)((Math.abs(a0-1))*kof2)), y0+14+25, (x0+ (int)((Math.abs(a0-1))*kof2)), y0+7+25);
    g.setFont(new java.awt.Font("SansSerif", 0, 9));
    g.drawString("1",x0+ (int)((Math.abs(a0-1))*kof2)-2, y0+23+25);}
  else
 {for (j = (int)(a0); j<b0; j++)
 g.drawLine((x0+ (int)((Math.abs(a0)+j)*kof2)), y0+10+25, (x0+ (int)((Math.abs(a0)+j)*kof2)), y0+7+25);
 g.drawLine(x0+ (int)((Math.abs(a0)+1)*kof2), y0+14+25, x0+ (int)((Math.abs(a0)+1)*kof2), y0+7+25);
 g.setFont(new java.awt.Font("SansSerif", 0, 9));
 g.drawString("1",x0+ (int)((Math.abs(a0)+1)*kof2)-2, y0+23+25);}
 g.drawString("0",x0- (int)(((a0))*kof2)-5, y0+23+25);
   g.setFont(new java.awt.Font("SansSerif", 1, 12));
   g.drawString("x",x0 + normx / norms+10, y0+6+25);
   g.drawString("f(x)",x0-(int)((a0)*kof2)+7, (int)(y0-f(b0)*kof1)+27);
  temp1=(y2[iteration2]-a0)*kof2; temp2=(z2[iteration2]-a0)*kof2;
  if ((step2 >= 1)&&(step2 !=4))
 { temp3=f(y2[iteration2])*kof1;
  g.setColor(new Color(0, 0, 200));
  Stringer.drawString("y_{"+iteration2+"}",x0+ (int)(temp1)-5,y0+10+35);
  g.drawLine(x0+ (int)(temp1), y0+35, x0+ (int)(temp1), (int)(y0-temp3)+35-15);
  g.fillOval(x0+ (int)(temp1)-1, (int)(y0-temp3-2)+35-15,4,4);
  g.setColor(new Color(170, 0, 183));
  temp3=f(z2[iteration2])*kof1;
  Stringer.drawString("z_{"+iteration2+"}",x0+ (int)(temp2)+2,y0+10+35);
  g.drawLine(x0+ (int)(temp2), y0+35, x0+ (int)(temp2), (int)(y0-temp3)+35-15);
  g.fillOval(x0+ (int)(temp2)-1, (int)(y0-temp3-2)+35-15,4,4);
  }
  g.setColor(Color.black);
  g.setFont(new java.awt.Font("SansSerif", 1, 12));
  temp1=(a2[iteration2]-a0)*kof2;temp2=(b2[iteration2]-a0)*kof2;
  g.setColor(new Color(140, 0, 80));
  if (step2 < 4)
  {Stringer.drawString("a_{"+iteration2+"}",x0+ (int)(temp1)-15,y0+10+35);
   Stringer.drawString("b_{"+iteration2+"}",x0+ (int)(temp2)+8,y0+10+35);}
  g.setColor(Color.red);
   temp3=f(a2[iteration2])*kof1;
    temp4=f(b2[iteration2])*kof1;
  if (step2 >=4)
   { g.setColor(new Color(140, 0, 80));
      temp3=f(a2[iteration2+1])*kof1;  temp4=f(b2[iteration2+1])*kof1;
     temp1=(a2[iteration2+1]-a0)*kof2;temp2=(b2[iteration2+1]-a0)*kof2;
     Stringer.drawString("a_{"+(iteration2+1)+"}",x0+ (int)(temp1)-15,y0+10+35);
     Stringer.drawString("b_{"+(iteration2+1)+"}",x0+ (int)(temp2)+8,y0+10+35);
     g.setColor(Color.red);
     g.drawLine(x0+ (int)(temp1), y0+35, x0+ (int)(temp2), y0+35);}
 g.drawLine(x0+ (int)(temp1), y0+35, x0+ (int)(temp1), (int)(y0-temp3)+35-15);
 g.drawLine(x0+ (int)(temp2), y0+35, x0+ (int)(temp2), (int)(y0-temp4)+35-15);
//g.drawString(""+y1[0]+"k="+kof2,x0,y0-50);
  g.setColor(new Color(0, 0, 150));
  int r;
  if (combobox_interval.getSelectedIndex()==2)  r=-2;
   else r=-x0;
  for (int i = r;i < normx / norms +2;i++) {
	temp1=(y0 - f(a0 + i / kof2)*kof1);
	temp2=(y0 - f(a0 + (i + 1) / kof2)*kof1);
	g.drawLine(i + x0,(int)temp1+20, i+1+ x0, (int)temp2+20);}
   }
  }
  void combobox_compare_itemStateChanged(ItemEvent e) {
   x1x2(); button_next.setEnabled(true);
   jPanel2.setVisible(true); Panel_p.setVisible(true);
   jLabel11.setVisible(true); jPanel3.setVisible(false);
   Panel_p.repaint();
  }

  void combobox_interval_itemStateChanged(ItemEvent e) {
    if (combobox_interval.getSelectedIndex()==0)
    { a0 = -5.0; b0 = 15.0;}
    if (combobox_interval.getSelectedIndex()==1)
    { a0 = 1.0; b0 = 19.0;}
    if (combobox_interval.getSelectedIndex()==2)
    { a0 = -9.0; b0 = 12.0;}
    x1x2();Panel_p.repaint();
  }

  void combobox_accuracy_itemStateChanged(ItemEvent e) {
    if (combobox_accuracy.getSelectedIndex()==0)
    { final_interval=2.0;}
    if (combobox_accuracy.getSelectedIndex()==1)
    { final_interval=1.3;}
    if (combobox_accuracy.getSelectedIndex()==2)
    { final_interval=0.5;}
    if (combobox_metods.getSelectedIndex()==0||(combobox_metods.getSelectedIndex()==1&&combobox_compare.getSelectedIndex()==0))
       x1x2();
   if (combobox_metods.getSelectedIndex()==1 && combobox_compare.getSelectedIndex()==1)
   { if (iteration3==0) {accuracy1=final_interval; x1x2();}
     else accuracy2=final_interval;
      if (accuracy1<accuracy2) {
         JOptionPane.showMessageDialog(null,"<html>Уже произведены вычисления с более высокой точностью!<br>Точность следует уменьшить.");
         accuracy2=accuracy1; final_interval=accuracy1;
          if (final_interval==1.3)combobox_accuracy.setSelectedIndex(1);
          if (final_interval==0.5)combobox_accuracy.setSelectedIndex(2);
          stop_method2=true; stop_method3=true;}
      else
      {  if (iteration3==0) x1x2();
        else
        { stop_method2=false; stop_method3_1=false; stop_method3=true;
          step3=0; iter3=0;a3[N1]=a3[iteration3]; b3[N1]=b3[iteration3]; N2=Fib(a3[N1],b3[N1], accuracy2);
          button_previous.setEnabled(false);}
      }}
      Algoritm(); //show();
    button_next.setEnabled(true);
    Panel_p.repaint();  jPanel1.repaint();
    jPanel2.repaint(); jPanel3.repaint();
  }

  void button_refresh_actionPerformed(ActionEvent e) {
   x1x2();//show();
   button_next.setEnabled(true);
   jPanel3.setVisible(false);
   jPanel2.setVisible(true); Panel_p.setVisible(true);
    jLabel11.setVisible(true);
    Panel_p.repaint();jPanel2.repaint();
  }

  void combobox_metods_itemStateChanged(ItemEvent e) {
   if (combobox_metods.getSelectedIndex()==1)
    {jLabel11.setText("Метод Фибоначчи");
     combobox_compare.removeItemAt(1);
     combobox_compare.addItem(" вычисления с последующим изменением точности");}
    else {jLabel11.setText("Метод дихотомии");
    combobox_compare.removeItemAt(1);
    combobox_compare.addItem(" определенное количество вычислений функции");}
   x1x2(); Algoritm(); button_next.setEnabled(true);
   jPanel2.setVisible(true); Panel_p.setVisible(true);
   jLabel11.setVisible(true); jPanel3.setVisible(false);
   Panel_p.repaint();
   jPanel2.repaint(); jPanel1.repaint();
  }

  void jCheckBox1_mouseClicked(MouseEvent e) {
   if( jCheckBox1.isSelected()== true)
   { jPanel3.setVisible(true);jPanel2.setVisible(false);
     Panel_p.setVisible(false);jLabel11.setVisible(false);
     jPanel3.setBounds(new Rectangle(4, 125, 447, 330));
     jCheckBox2.setSelected(false);
    }
   else
   { jPanel2.setVisible(true); Panel_p.setVisible(true);
    jLabel11.setVisible(true); jPanel3.setVisible(false);}
  }

  void jCheckBox2_mouseClicked(MouseEvent e) {
   if( jCheckBox2.isSelected()== true)
   { jPanel3.setVisible(true); jPanel2.setVisible(false);
     Panel_p.setVisible(false); jLabel11.setVisible(false);
     jPanel3.setBounds(new Rectangle(3, 100, 452, 370));
     jCheckBox1.setSelected(false);
    }
   else
   { jPanel2.setVisible(true);Panel_p.setVisible(true);
     jLabel11.setVisible(true); jPanel3.setVisible(false);}
  }

}