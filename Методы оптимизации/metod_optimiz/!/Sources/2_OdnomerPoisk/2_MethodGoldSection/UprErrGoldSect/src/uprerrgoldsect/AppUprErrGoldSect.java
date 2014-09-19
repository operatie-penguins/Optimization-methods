package uprerrgoldsect;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.event.*;

public class AppUprErrGoldSect extends JApplet {
  Panel_mypaint jPanel1 = new Panel_mypaint();
  JLabel jLabel1 = new JLabel();
  JButton btnNext = new JButton();
  JButton btnNew = new JButton();
  JButton jButton1 = new JButton();
  JCheckBox jCheckBoxRezult = new JCheckBox();
  JRadioButton jRadioButton = new JRadioButton();
  JRadioButton jRadioButton1 = new JRadioButton();
  JRadioButton jRadioButton2 = new JRadioButton();
  JRadioButton jRadioButton3 = new JRadioButton();
  JRadioButton jRadioButton4 = new JRadioButton();
  ButtonGroup buttonGroup1 = new ButtonGroup();
  JRadioButton jRadioBtnYes = new JRadioButton();
  JRadioButton jRadioBtnNo = new JRadioButton();
  JRadioButton jRadioBtnYN = new JRadioButton();
  ButtonGroup buttonGroupYesNo = new ButtonGroup();
  JTextField jTF1 = new JTextField();
  JTextField jTF3 = new JTextField();
  public double l=0.5, scale=1.0;
  public int sh=0, k=0, num=0, slog=2, select=0, x1=330, y1=70, y2=290, x2=10,
            XN=2, YN=67,
            all=5, //количество делений (всего) на графике x1
            otr=2, //количество делений (с отрицательным знаком) на графике x1
            w=(int)(scale*338/all), //количество пикселов в 1 делении (на графике) x1
            ost=338-w*all,
            all2=5, //количество делений (всего) на графике x2
            otr2=1, //количество делений (с отрицательным знаком) на графике x2
            w2=(int)(scale*253/all2), //количество пикселов в 1 делении (на графике) x2
            ost2=253-w2*all2;
  double [] a = {-1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
  double [] b = {2.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
  double [] y = new double[10];
  double [] z = new double[10];
  public int[] Mist_knowledge=new int [10];
  public int[] Mist_calk=new int [10];
  public int[] Mist_under=new int [10];
  public int[] Mist_use=new int [10];
  boolean Ch=true, AddRAnswer=false, entry=false;
  public int language=1, Proverka = -1, RightAnswer=0;

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
    this.setSize(new Dimension(550, 522));
    jPanel1.setBackground(new Color(247, 247, 255));
    jPanel1.setBounds(new Rectangle(10, 0, 530, 481));
    jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        jPanel1_mouseClicked(e);
      }
    });
    this.getContentPane().setBackground(new Color(247, 247, 255));
    this.setFont(new java.awt.Font("SansSerif", 1, 14));
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel1.setForeground(new Color(130, 0, 80));
    jLabel1.setBounds(new Rectangle(45, 2, 440, 17));
    btnNext.setBackground(new Color(220, 230, 255));
    btnNext.setFont(new java.awt.Font("Dialog", 1, 14));
    btnNext.setForeground(new Color(0, 0, 60));
    btnNext.setVisible(true);
    btnNext.setText("==>");
    btnNext.setBounds(new Rectangle(270,490, 100, 23));
    btnNext.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btnNext_actionPerformed(e);
      }
    });
    this.getContentPane().setLayout(null);
    btnNew.setBackground(new Color(220, 230, 255));
    btnNew.setFont(new java.awt.Font("Dialog", 1, 12));
    btnNew.setForeground(new Color(0, 0, 60));
    btnNew.setMaximumSize(new Dimension(129, 27));
    btnNew.setMinimumSize(new Dimension(129, 27));
    btnNew.setPreferredSize(new Dimension(129, 27));
    btnNew.setBounds(new Rectangle(140,490, 100, 23));
    btnNew.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btnNew_actionPerformed(e);
      }
    });
    jTF1.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTF1.setEnabled(false);
    jTF1.setVisible(false);
    jTF1.setText("");
    jTF1.setForeground(new Color(0, 0, 80));
    jTF1.setBounds(new Rectangle(355, 350, 45, 21));
    jTF1.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTF1_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTF3.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTF3.setEnabled(false);
    jTF3.setVisible(false);
    jTF3.setText("");
    jTF3.setForeground(new Color(0, 0, 80));
    jTF3.setBounds(new Rectangle(355, 350, 45, 21));
    jTF3.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTF3_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jRadioButton1.setBackground(new Color(255, 255, 255));
    jRadioButton1.setFont(new java.awt.Font("Dialog", 3, 13));
    jRadioButton1.setForeground(new Color(0, 0, 0));
    jRadioButton1.setText("");
    jRadioButton1.setBounds(new Rectangle(53, 370, 16, 20));
    jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        jRadioButton1_itemStateChanged(e);
      }
    });
    jRadioButton1.setVisible(false); jRadioButton1.setEnabled(false);
    jRadioButton2.setVisible(false); jRadioButton2.setEnabled(false);
    jRadioButton2.setBackground(new Color(255, 255, 255));
    jRadioButton2.setFont(new java.awt.Font("Dialog", 3, 13));
    jRadioButton2.setForeground(new Color(0, 0, 0));
    jRadioButton2.setText("");
    jRadioButton2.setBounds(new Rectangle(53, 400, 16, 20));
    jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        jRadioButton2_itemStateChanged(e);
      }
    });
    jRadioButton3.setVisible(false); jRadioButton3.setEnabled(false);
    jRadioButton3.setBackground(new Color(255, 255, 255));
    jRadioButton3.setFont(new java.awt.Font("Dialog", 3, 13));
    jRadioButton3.setForeground(new Color(0, 0, 0));
    jRadioButton3.setText("");
    jRadioButton3.setBounds(new Rectangle(53, 400, 16, 20));
    jRadioButton3.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        jRadioButton3_itemStateChanged(e);
      }
    });
    jRadioButton4.setVisible(false); jRadioButton4.setEnabled(false);
    jRadioButton4.setBackground(new Color(255, 255, 255));
    jRadioButton4.setFont(new java.awt.Font("Dialog", 3, 13));
    jRadioButton4.setForeground(new Color(0, 0, 0));
    jRadioButton4.setText("");
    jRadioButton4.setBounds(new Rectangle(53, 400, 16, 20));
    jRadioButton4.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        jRadioButton4_itemStateChanged(e);
      }
    });
    jRadioButton.setBounds(new Rectangle(20, 200, 10, 5));
    jRadioButton.setVisible(false);
    jRadioButton.setSelected(true);
    jButton1.setBackground(new Color(220, 230, 255));
    jButton1.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton1.setForeground(new Color(0, 0, 60));
    jButton1.setBounds(new Rectangle(355,371,95, 23));
    jButton1.setVisible(false);
    jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        jButton1_mouseClicked(e);
      }
     });
     jCheckBoxRezult.setBackground(new Color(255, 255, 255));
     jCheckBoxRezult.setFont(new java.awt.Font("SansSerif", 3, 13));
     jCheckBoxRezult.setForeground(new Color(180, 0, 80));
     jCheckBoxRezult.setText("Ваш результат");
     jCheckBoxRezult.setVisible(false);
     jCheckBoxRezult.setEnabled(false);
     jCheckBoxRezult.setOpaque(false);
     jCheckBoxRezult.setSelected(true);
     jCheckBoxRezult.setBounds(new Rectangle(246, 87, 150, 23));
     jCheckBoxRezult.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(ChangeEvent e) {
        jCheckBoxRezult_stateChanged(e);
      }
    });
    jRadioBtnYes.setVisible(false);
    jRadioBtnYes.setBackground(new Color(255, 255, 255));
    jRadioBtnYes.setFont(new java.awt.Font("Dialog", 3, 13));
    jRadioBtnYes.setForeground(new Color(0, 0, 0));
    jRadioBtnYes.setText("Да");
    jRadioBtnYes.setBounds(new Rectangle(20, 386, 60, 20));
    jRadioBtnYes.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        jRadioBtnYes_itemStateChanged(e);
      }
    });
    jRadioBtnNo.setVisible(false);
    jRadioBtnNo.setBackground(new Color(255, 255, 255));
    jRadioBtnNo.setFont(new java.awt.Font("Dialog", 3, 13));
    jRadioBtnNo.setForeground(new Color(0, 0, 0));
    jRadioBtnNo.setText("Нет");
    jRadioBtnNo.setBounds(new Rectangle(20, 406, 60, 20));
    jRadioBtnNo.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        jRadioBtnNo_itemStateChanged(e);
      }
    });
    jRadioBtnYN.setVisible(false);
    jRadioBtnYN.setBounds(new Rectangle(107, 87, 30, 20));
    buttonGroupYesNo.add(jRadioBtnYes);
    buttonGroupYesNo.add(jRadioBtnNo);
    buttonGroupYesNo.add(jRadioBtnYN);
    buttonGroup1.add(jRadioButton);
    buttonGroup1.add(jRadioButton1);
    buttonGroup1.add(jRadioButton2);
    buttonGroup1.add(jRadioButton3);
    buttonGroup1.add(jRadioButton4);
    this.getContentPane().add(jPanel1, null);
    jPanel1.setLayout(null);
    this.jPanel1.add(jLabel1, null);
    this.jPanel1.add(jTF1, null);
    this.jPanel1.add(jTF3, null);
    this.getContentPane().add(btnNew,null);
    this.getContentPane().add(btnNext,null);
    this.jPanel1.add(jButton1,null);
    this.jPanel1.add(jCheckBoxRezult, null);
    this.jPanel1.add(jRadioButton, null);
    this.jPanel1.add(jRadioButton1, null);
    this.jPanel1.add(jRadioButton2, null);
    this.jPanel1.add(jRadioButton3, null);
    this.jPanel1.add(jRadioButton4, null);
    this.jPanel1.add(jRadioBtnYes, null);
    this.jPanel1.add(jRadioBtnNo, null);
    Proverka=-1;
  }

  public double f(double x){
    double j;
    j=x*x-x+1;
    return j;
  }


  class  Panel_mypaint extends JPanel {
   public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Stringer.setGraphics(g);
    int ds=14;
    Stringer.fonts[0]=new Font("SansSerif", 1, ds);
    Stringer.fonts[1]=new Font("SansSerif", 1, ds-3);
    Stringer.fonts[2]=new Font("SansSerif", 1, ds-5);
    FontMetrics Fm=g.getFontMetrics(new Font("SansSerif", 1, 14));
    FontMetrics Fm1=g.getFontMetrics(new Font("SansSerif", 1, ds-3));
    g.setColor(Color.black);
    int xSt,ySt,xSt1,ySt1;
    if(language==0){
      jLabel1.setText("Exercise");
      btnNew.setText("To update");
      jButton1.setText("Check");
    }
    else{
      jLabel1.setText("Тестовое упражнение с запланированными ошибками");
      btnNew.setText("Обновить");
      jButton1.setText("Проверка");
    }
     if(language==0){
       g.setColor(new Color(180, 0, 80));
       Stringer.fonts[0]=new Font("SansSerif", 3, 13);
       Stringer.drawString("Task:  ",15,40);
       Stringer.drawString("Graphic illustration:                                                         Let's set sizes:",10,63);
       Stringer.drawString(" The formulas:  ",363,189);
       Stringer.drawString("The decision:  ",15,336);
       g.setColor(new Color(0, 0, 80));
        Stringer.fonts[0]=new Font("SansSerif", 1, 14);
       Stringer.drawString("To find a minimum of function f(x) by method a method golden section",78,40);
     }
     else{
       g.setColor(new Color(180, 0, 80));
       Stringer.fonts[0]=new Font("SansSerif", 3, 13);
       Stringer.drawString("Задача: ",0,40);
       Stringer.drawString("Графическая иллюстрация:",10,63);
       Stringer.drawString("Величины:",368,63);
       Stringer.drawString("Формулы:  ",368,176);
       Stringer.drawString("Решение:  ",10,336);
       g.setColor(new Color(0, 0, 80));
        Stringer.fonts[0]=new Font("SansSerif", 1, 14);
       Stringer.drawString("Найти минимум функции f(x)=x^{ 2 }- x + 1 методом золотого сечения",55,40);
     }
    // Stringer.drawString(""+select,1,15); ///////////////////
   // Stringer.drawString(""+Math.round(198.6),1,15);
     g.setColor(new Color(255, 255, 255));
     g.fillRect(2,67,338,253);g.fillRect(360,67,165,93);g.fillRect(360,180,165,140);g.fillRect(2,340,523,140);
     g.setColor(new Color(157, 187, 255));
     g.drawRect(2,67,338,253);g.drawRect(360,67,165,93);g.drawRect(360,180,165,140);g.drawRect(2,340,523,140);

     /*nach. velichini*/g.setColor(new Color(0, 0, 80));
     Stringer.fonts[0]=new Font("SansSerif", 1, 12);
     Stringer.fonts[1]=new Font("SansSerif", 1, 9);
     if(language==0){
       Stringer.drawString("L_{0} = ["+a[0]+","+b[0]+"] - interval",365,85);
       Stringer.drawString("uncertainty",385,105);
       Stringer.drawString("\u2113 = "+l,365,145);
       Stringer.drawString("- accuracy",416,145);
     }
     else{
       Stringer.drawString("L_{0} = ["+a[0]+","+b[0]+"]",365,85);
       Stringer.drawString("-  начальный",443,85);
       Stringer.drawString("интервал",465,100);
       Stringer.drawString("неопределенности",408,115);
       Stringer.drawString("\u2113 = "+l+" - допустимая длина",365,135);
       Stringer.drawString("конечного интервала",395,150);
     }

    /*formula*/
    Stringer.fonts[1]=new Font("SansSerif", 1, 10);
    Stringer.drawString("y_{0} = a_{0 }+               (b_{0 }- a_{0})",375,212);
    Stringer.drawString("3 - \u221A5",429,201);
    Stringer.drawString("2",441,222);
    g.drawLine(426,207,462,207);
    g.drawLine(426,206,462,206);

    Stringer.drawString("z_{0} = a_{0} + b_{0} - y_{0}",398,254);

    Stringer.drawString("x^{*} \u2248",389,301);
    Stringer.drawString("( a_{k+1} + b_{k+1} )",416,288);
    Stringer.drawString("2",451,311);
    g.drawLine(415,295,492,295);
    g.drawLine(415,296,492,296);

    //-------------
    //координатная плоскость
    g.setColor(Color.black);
    Stringer.fonts[0]=new Font("SansSerif", 1, 11);
    Stringer.fonts[1]=new Font("SansSerif", 1, 9);
    g.drawLine(otr*w+XN,YN+6,otr*w+XN,all2*w2+YN-1+ost2);
    g.drawLine(XN+1,(all2-otr2)*w2+YN,all*w+XN-2+ost,(all2-otr2)*w2+YN);
    Stringer.drawString("f(x)",otr*w+XN+6,YN+11); Stringer.drawString("x",all*w+XN-11+ost,(all2-otr2)*w2+YN+13);
    int a1[]={otr*w+XN-5,otr*w+XN,otr*w+XN+5}, b1[]={YN+7,YN,YN+7};
    int a2[]={all*w+XN-6+ost,all*w+XN-1+ost,all*w+XN-6+ost}, b2[]={(all2-otr2)*w2+YN-5,(all2-otr2)*w2+YN,(all2-otr2)*w2+YN+5};
    g.fillPolygon(a1,b1,3);
    g.fillPolygon(a2,b2,3);
    Stringer.fonts[0] = new Font("SansSerif", 1, ds-3);
    for(int i=1-otr; i<(all-otr); i++){
      g.setColor(Color.black);
      g.drawLine(otr*w+XN+w*i,(all2-otr2)*w2+YN-3,otr*w+XN+w*i,(all2-otr2)*w2+YN+3);
      g.setColor(Color.darkGray);
      if((i%2==0 || w>15) && i!=0) Stringer.drawString(""+i,otr*w+XN-3+w*i-(int)(i/9)*2,(all2-otr2)*w2+YN+16);
    }
    for(int i=1-otr2; i<(all2-otr2); i++){
      g.setColor(Color.black);
      g.drawLine(otr*w+XN-3,(all2-otr2)*w2+YN-w2*i,otr*w+XN+3,(all2-otr2)*w2+YN-w2*i);
      g.setColor(Color.darkGray);
      if((i%2==0 || w2>15) && i!=0) Stringer.drawString(""+i,otr*w+XN-14-(int)(i/9)*4,(all2-otr2)*w2+YN+4-w2*i);
    }
    Stringer.drawString("0",otr*w+XN-8,(all2-otr2)*w2+YN+11);
    g.setColor(Color.blue);
    Stringer.fonts[0] = new Font("Dialog", 1, ds-2);
    Stringer.drawString("f(x) = x^{ 2 }- x + 1",168,80);
    Stringer.fonts[0] = new Font("SansSerif", 1, 14);
    g.setColor(new Color(0, 0, 230));
    for(int i=XN+1; i<338+XN; i++)
      if((int)(YN+(all2-otr2)*w2-w2*f(1.0*(i-XN-otr*w)/w))>=YN && (int)(YN+(all2-otr2)*w2-w2*f(1.0*(i-XN-otr*w)/w))<YN+253 &&
         (int)(YN+(all2-otr2)*w2-w2*f(1.0*(i+1-XN-otr*w)/w))>=YN && (int)(YN+(all2-otr2)*w2-w2*f(1.0*(i+1-XN-otr*w)/w))<YN+253)
      g.drawLine(i,(int)(YN+(all2-otr2)*w2-w2*f(1.0*(i-XN-otr*w)/w)),i+1,(int)(YN+(all2-otr2)*w2-w2*f(1.0*(i+1-XN-otr*w)/w)));

    //---------------------

    xSt=5;ySt=360;
    if(sh>=0)
    {
      g.setColor(new Color(180, 0, 60));
      Stringer.fonts[0]=new Font("SansSerif", 3, 16);
      Stringer.drawString(""+(num-1)/5+"."+(((num-1) % 5+1)+"."),xSt,ySt);
    }
    Stringer.fonts[0]=new Font("SansSerif", 1, 14);
    if(sh>=0 && sh<5){
      g.setColor(new Color(0, 0, 80)); Stringer.fonts[0]=new Font("SansSerif", 1, 14);
      Stringer.fonts[1]=new Font("SansSerif", 1, 11);
      if(sh==0)
      {
        if(language==0){
          Stringer.drawString("interval of uncertainty    L_{0} = [ a_{0} , b_{0} ] = [ "+a[0]+" , "+b[0]+" ]   ",xSt,ySt+20);
          Stringer.drawString("and let's assume \u2113 = "+l+" .",xSt,ySt+40);
          Stringer.drawString("Let's construct function  f(x) = x^{ 2 }- x + 1 , let's set initial ",xSt,ySt);
        }
        else
        {
          Stringer.drawString("интервал неопределенности   L_{0} = [ a_{0} , b_{0} ] = [ "+a[0]+" , "+b[0]+" ]   и положим",xSt,ySt+20);
          Stringer.drawString("\u2113 = "+l+".",xSt,ySt+40);
          Stringer.drawString("Построим функцию  f(x) = x^{ 2 }- x + 1, зададим начальный ",xSt+28,ySt);}
        ////////////////
        Stringer.fonts[0]=new Font("SansSerif", 1, 12);
        Stringer.fonts[1]=new Font("SansSerif", 1, 9);
        g.setColor(Color.red);
        Stringer.drawString("L_{0} = ["+a[0]+","+b[0]+"]",365,85);
        Stringer.drawString("\u2113 = "+l,365,135);
        ////////////////
      }
      Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
      Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
      if (sh>=0){
        g.setColor(new Color(0, 0, 130));
        if(f(a[k])>0)
          for( int i = (int)(YN+(all2-otr2)*w2-w2*f(a[k]))+1; i<YN+(all2-otr2)*w2; i=i+9)
            g.drawLine((int)(otr*w+a[k]*w+XN),i,(int)(otr*w+a[k]*w+XN),i+6);
        if(f(a[k])<0)
          for( int i = (int)(YN+(all2-otr2)*w2-w2*f(a[k]))-1; i>YN+(all2-otr2)*w2; i=i-9)
            g.drawLine((int)(otr*w+a[k]*w+XN),i,(int)(otr*w+a[k]*w+XN),i-6);
        if(f(b[k])>0)
          for( int i = (int)(YN+(all2-otr2)*w2-w2*f(b[k]))+1; i<YN+(all2-otr2)*w2; i=i+9)
            g.drawLine((int)(otr*w+b[k]*w+XN),i,(int)(otr*w+b[k]*w+XN),i+6);
        if(f(b[k])<0)
          for( int i = (int)(YN+(all2-otr2)*w2-w2*f(b[k]))-1; i>YN+(all2-otr2)*w2; i=i-9)
            g.drawLine((int)(otr*w+b[k]*w+XN),i,(int)(otr*w+b[k]*w+XN),i-6);
        if(sh<4)
        {
          Stringer.drawString("a_{"+k+"}",(int)(XN+otr*w+a[k]*w-13),YN+(all2-otr2)*w2-8);
          Stringer.drawString("b_{"+k+"}",(int)(XN+otr*w+b[k]*w+5),YN+(all2-otr2)*w2-8);
        }
        g.drawLine((int)(XN+otr*w+a[k]*w),YN+(all2-otr2)*w2,(int)(XN+otr*w+b[k]*w),YN+(all2-otr2)*w2);
        g.drawLine((int)(XN+otr*w+a[k]*w),YN+(all2-otr2)*w2+1,(int)(XN+otr*w+b[k]*w),YN+(all2-otr2)*w2+1);
        Stringer.fonts[0]=new Font("SansSerif", 1, 14);
        Stringer.drawString("[",(int)(XN+otr*w+a[k]*w-2),YN+(all2-otr2)*w2+4);
        Stringer.drawString("]",(int)(XN+otr*w+b[k]*w-2),YN+(all2-otr2)*w2+4);
      }
      Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
      Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
      if(k>0 && sh<4){
        g.setColor(new Color(0, 120, 0));
        if(f(y[k])>=0)
        {
          for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y[k]))+1; i<YN+(all2-otr2)*w2-5; i=i+9)
            g.drawLine((int)(otr*w+y[k]*w+XN),i,(int)(otr*w+y[k]*w+XN),i+6);
          Stringer.drawString("y_{"+k+"}",(int)(XN+otr*w+y[k]*w-13),YN+(all2-otr2)*w2-8);
          Stringer.drawString(""+y[k],(int)(XN+otr*w+y[k]*w-Fm1.stringWidth(""+y[k])),YN+(all2-otr2)*w2+15);
        }
        if(f(y[k])<0)
        {
          for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y[k]))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
            g.drawLine((int)(otr*w+y[k]*w+XN),i,(int)(otr*w+y[k]*w+XN),i-6);
          Stringer.drawString("y_{"+k+"}",(int)(XN+otr*w+y[k]*w-13),YN+(all2-otr2)*w2-8);
          Stringer.drawString(""+y[k],(int)(XN+otr*w+y[k]*w-Fm1.stringWidth(""+y[k])),YN+(all2-otr2)*w2+15);
        }
        g.setColor(new Color(98, 0, 170));
        if(f(z[0])>=0)
        {
          for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z[k]))+1; i<YN+(all2-otr2)*w2-5; i=i+9)
            g.drawLine((int)(otr*w+z[k]*w+XN),i,(int)(otr*w+z[k]*w+XN),i+6);
          Stringer.drawString("z_{"+k+"}",(int)(XN+otr*w+z[k]*w+5),YN+(all2-otr2)*w2-8);
          Stringer.drawString(""+z[k],(int)(XN+otr*w+z[k]*w+2),YN+(all2-otr2)*w2+15);
        }
        if(f(z[k])<0)
        {
          for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z[k]))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
            g.drawLine((int)(otr*w+z[k]*w+XN),i,(int)(otr*w+z[k]*w+XN),i-6);
          Stringer.drawString("z_{"+k+"}",(int)(XN+otr*w+z[k]*w+5),YN+(all2-otr2)*w2-8);
          Stringer.drawString(""+z[k],(int)(XN+otr*w+z[k]*w+2),YN+(all2-otr2)*w2+15);
        }
        g.setColor(new Color(0, 120, 0));
        g.fillOval((int)(otr*w+y[k]*w+XN-3),YN+(all2-otr2)*w2-3,6,6);
        g.setColor(new Color(98, 0, 170));
        g.fillOval((int)(otr*w+z[k]*w+XN-3),YN+(all2-otr2)*w2-3,6,6);
      }
      Stringer.fonts[0]=new Font("SansSerif", 1, 14);
      Stringer.fonts[1]=new Font("SansSerif", 1, 11);
    }
    Stringer.fonts[0] = new Font("SansSerif", 1, 14);
    if(sh==1){
      g.setColor(new Color(0, 0, 80));
      if(k==0) Stringer.drawString("Положим k = 0.",xSt+28,ySt);
      else{
        Stringer.drawString("Вычисляем \u2206: ",xSt+28,ySt);
        if(k==1 || k==3)
          if(b[k]>=0) Stringer.drawString("\u2206 = |a_{"+k+"} - b_{"+k+"}| = |"+a[k]+" - "+b[k]+"| = "+Math.round(Math.abs(a[k]-b[k])*1000)/1000.0+".",xSt+135,ySt);
          else Stringer.drawString("\u2206 = |a_{"+k+"} - b_{"+k+"}| = |"+a[k]+" - ("+b[k]+")| = "+Math.round(Math.abs(a[k]-b[k])*1000)/1000.0+".",xSt+135,ySt);
        else if(jRadioBtnNo.isSelected())
                if(b[k]>=0) Stringer.drawString("\u2206 = |a_{"+k+"} - b_{"+k+"}| = |"+a[k]+" - "+b[k]+"| = ",xSt+135,ySt);
                else Stringer.drawString("\u2206 = |a_{"+k+"} - b_{"+k+"}| = |"+a[k]+" - ("+b[k]+")| = ",xSt+135,ySt);
             else
               if(b[k]>=0) Stringer.drawString("\u2206 = |a_{"+k+"} - b_{"+k+"}| = |"+a[k]+" - "+b[k]+"| = "+Math.round(Math.abs(y[k]-b[k])*1000)/1000.0+".",xSt+135,ySt);
               else Stringer.drawString("\u2206 = |a_{"+k+"} - b_{"+k+"}| = |"+a[k]+" - ("+b[k]+")| = "+Math.round(Math.abs(y[k]-b[k])*1000)/1000.0+".",xSt+135,ySt);
        if(AddRAnswer==false){
          if(k==1 || k==3) RightAnswer+=2;
          else RightAnswer+=3;
          AddRAnswer=true;
          btnNext.setEnabled(false);
        }
        g.setColor(Color.black); Stringer.fonts[0]=new Font("Dialog", 3, 14);
        Stringer.drawString("Величина \u2206 вычислено верно.",xSt+3,ySt+21);
        jRadioBtnYes.setVisible(true);
        jRadioBtnYes.setEnabled(true);
        jRadioBtnNo.setVisible(true);
        jRadioBtnNo.setEnabled(true);
        if(((k==1 || k==3) && jRadioBtnYes.isSelected()) || ((k==2 || k==4) && jRadioBtnNo.isSelected())){
          g.setColor(Color.blue);  Stringer.fonts[0]=new Font("Dialog", 1, 14);
          Stringer.drawString("Правильно",xSt+80,ySt+50);
          jRadioButton1.setText("Нет, т.к. \u2206 > \u2113");
          jRadioButton2.setText("Да,   т.к. \u2206 > \u2113");
          jRadioButton1.setBounds(xSt+265,ySt+26,130,20);
          jRadioButton2.setBounds(xSt+265,ySt+46,130,20);
          switch (k)
          {
            case 1:
              jRadioBtnNo.setEnabled(false);
              jRadioButton1.setEnabled(true); jRadioButton1.setVisible(true);
              jRadioButton2.setEnabled(true); jRadioButton2.setVisible(true);
              g.setColor(Color.black); Stringer.fonts[0]=new Font("Dialog", 3, 14);
              Stringer.drawString("Переходим к следующей итерации.",xSt+253,ySt+21);
              if(jRadioButton2.isSelected())
              {
                jRadioButton1.setEnabled(false);
                g.setColor(Color.blue);  Stringer.fonts[0]=new Font("Dialog", 1, 14);
                Stringer.drawString("Правильно",xSt+410,ySt+50);
                btnNext.setEnabled(true);
              }
              else if(jRadioButton1.isSelected()){
                g.setColor(Color.red);  Stringer.fonts[0]=new Font("Dialog", 1, 14);
                Stringer.drawString("Неправильно",xSt+410,ySt+50);
                if(entry==false){ Mist_knowledge[sh]++; entry=true;}
              }
              break;
            case 2:
              jRadioBtnYes.setEnabled(false);
              jTF1.setBounds(xSt+125+Fm.stringWidth("D = |a_ - b_| = |"+a[k]+" - ("+b[k]+")| = "),ySt-14,45,20);
              jTF1.setVisible(true); jTF1.setEnabled(true);
              jButton1.setVisible(true);
              jButton1.setEnabled(true);
              jButton1.setLocation(xSt+190+Fm.stringWidth("D = |a"+k+" - b"+k+"| = |"+a[k]+" - ("+b[k]+")| = "), ySt-15);
              g.setColor(new Color(0, 0, 80)); Stringer.fonts[0]=new Font("Dialog", 0, 11);
              Stringer.drawString("Вычислeния поизводятся с точностью до трех знаков после запятой.",xSt+77,ySt+115);
              Stringer.fonts[0]=new Font("SansSerif", 1, 14);
              g.setColor(new Color(0, 0, 80)); Stringer.fonts[0]=new Font("SansSerif", 1, 14);
              Stringer.drawString("Вычислите \u2206.",xSt+3,ySt+80);
              if(Proverka==1){
                g.setColor(Color.blue);
                Stringer.drawString("Правильно",xSt+5,ySt+100);
                jButton1.setEnabled(false);
                jTF1.setEnabled(false);
                jRadioButton1.setEnabled(true); jRadioButton1.setVisible(true);
                jRadioButton2.setEnabled(true); jRadioButton2.setVisible(true);
                g.setColor(Color.black); Stringer.fonts[0]=new Font("Dialog", 3, 14);
                Stringer.drawString("Переходим к следующей итерации.",xSt+253,ySt+21);
                if(jRadioButton2.isSelected())
                {
                  jRadioButton1.setEnabled(false);
                  g.setColor(Color.blue);  Stringer.fonts[0]=new Font("Dialog", 1, 14);
                  Stringer.drawString("Правильно",xSt+410,ySt+50);
                  btnNext.setEnabled(true);
                }
                else if(jRadioButton1.isSelected()){
                  g.setColor(Color.red);  Stringer.fonts[0]=new Font("Dialog", 1, 14);
                  Stringer.drawString("Неправильно",xSt+410,ySt+50);
                  if(entry==false){ Mist_knowledge[sh]++; entry=true;}
                }
              }
              else if(Proverka==0){
                g.setColor(Color.red);
                Stringer.drawString("Неправильно",xSt+5,ySt+100);
              }
              break;
            case 3:
              jRadioBtnNo.setEnabled(false);
              jRadioButton1.setEnabled(true); jRadioButton1.setVisible(true);
              jRadioButton2.setEnabled(true); jRadioButton2.setVisible(true);
              g.setColor(Color.black); Stringer.fonts[0]=new Font("Dialog", 3, 14);
              Stringer.drawString("Переходим к следующей итерации.",xSt+253,ySt+21);
              if(jRadioButton2.isSelected())
              {
                jRadioButton1.setEnabled(false);
                g.setColor(Color.blue);  Stringer.fonts[0]=new Font("Dialog", 1, 14);
                Stringer.drawString("Правильно",xSt+410,ySt+50);
                btnNext.setEnabled(true);
              }
              else if(jRadioButton1.isSelected()){
                g.setColor(Color.red);  Stringer.fonts[0]=new Font("Dialog", 1, 14);
                Stringer.drawString("Неправильно",xSt+410,ySt+50);
                if(entry==false){ Mist_knowledge[sh]++; entry=true;}
              }
              break;
            case 4:
              jRadioBtnYes.setEnabled(false);
              jTF1.setBounds(xSt+125+Fm.stringWidth("D = |a_ - b_| = |"+a[k]+" - ("+b[k]+")| = "),ySt-14,45,20);
              jTF1.setVisible(true); jTF1.setEnabled(true);
              jButton1.setVisible(true);
              jButton1.setEnabled(true);
              jButton1.setLocation(xSt+190+Fm.stringWidth("D = |a"+k+" - b"+k+"| = |"+a[k]+" - ("+b[k]+")| = "), ySt-15);
              g.setColor(new Color(0, 0, 80)); Stringer.fonts[0]=new Font("SansSerif", 1, 14);
              g.setColor(new Color(0, 0, 80)); Stringer.fonts[0]=new Font("Dialog", 0, 11);
              Stringer.drawString("Вычислeния поизводятся с точностью до трех знаков после запятой.",xSt+77,ySt+115);
              Stringer.fonts[0]=new Font("SansSerif", 1, 14);
              Stringer.drawString("Вычислите \u2206.",xSt+3,ySt+80);
              if(Proverka==1){
                g.setColor(Color.blue);
                Stringer.drawString("Правильно",xSt+5,ySt+100);
                jButton1.setEnabled(false);
                jTF1.setEnabled(false);
                jRadioButton1.setEnabled(true); jRadioButton1.setVisible(true);
                jRadioButton2.setEnabled(true); jRadioButton2.setVisible(true);
                g.setColor(Color.black); Stringer.fonts[0]=new Font("Dialog", 3, 14);
                Stringer.drawString("Переходим к следующей итерации.",xSt+253,ySt+21);
                if(jRadioButton1.isSelected())
                {
                  jRadioButton2.setEnabled(false);
                  g.setColor(Color.blue);  Stringer.fonts[0]=new Font("Dialog", 1, 14);
                  Stringer.drawString("Правильно",xSt+410,ySt+50);
                  btnNext.setEnabled(true);
                }
                else if(jRadioButton2.isSelected()){
                  g.setColor(Color.red);  Stringer.fonts[0]=new Font("Dialog", 1, 14);
                  Stringer.drawString("Неправильно",xSt+410,ySt+50);
                  if(entry==false){ Mist_knowledge[sh]++; entry=true;}
                }
              }
              else if(Proverka==0){
                g.setColor(Color.red);
                Stringer.drawString("Неправильно",xSt+5,ySt+100);
              }
              break;
          }
        }
        else if(jRadioBtnYes.isSelected() || jRadioBtnNo.isSelected()) {
          g.setColor(Color.red);  Stringer.fonts[0]=new Font("Dialog", 1, 14);
          Stringer.drawString("Неправильно",xSt+80,ySt+50);
          if(entry==false){ Mist_calk[sh]++; entry=true;}
        }
      }
    }
    if (sh>=2 && sh<=4){
      g.setColor(new Color(0, 0, 80)); Stringer.fonts[0] = new Font("SansSerif", 1, 14);
      if(k==0)
      {
        y[0]=(Math.round(a[0]*1000+0.38196*(b[0]-a[0])*1000))/1000.0;
        z[0]=Math.round((a[0]+b[0]-y[0])*1000)/1000.0;
        if (sh==2){
          Stringer.drawString("Вычисляем  y_{0} и z_{0}  по вышеприведенным формулам, где",xSt+28,ySt);
          Stringer.drawString("y_{0} = "+y[0],xSt+155,ySt+28);
          if(!jRadioButton2.isSelected()) Stringer.drawString("z_{0} = "+Math.round(z[0]*1000-10)/1000.0,xSt+270,ySt+28);
          else Stringer.drawString("z_{0} = ",xSt+270,ySt+28);
          Stringer.drawString("3 - \u221A5",xSt+5,ySt+20);
          Stringer.drawString("= 0.38196:",xSt+50,ySt+28);
          Stringer.drawString("2",xSt+17,ySt+38);
          g.drawLine(xSt+2,ySt+26,xSt+43,ySt+26);
          g.drawLine(xSt+2,ySt+25,xSt+43,ySt+25);
          jRadioButton1.setBounds(xSt+10,ySt+65,16,20);
          jRadioButton2.setBounds(xSt+10,ySt+85,16,20);
          jRadioButton3.setBounds(xSt+100,ySt+65,16,20);
          jRadioButton4.setBounds(xSt+100,ySt+85,16,20);
          jRadioButton1.setVisible(true); jRadioButton1.setEnabled(true);
          jRadioButton2.setVisible(true); jRadioButton2.setEnabled(true);
          jRadioButton3.setVisible(true); jRadioButton3.setEnabled(true);
          jRadioButton4.setVisible(true); jRadioButton4.setEnabled(true);
          if(AddRAnswer==false){ RightAnswer+=2; AddRAnswer=true;}
          g.setColor(Color.black); Stringer.fonts[0]=new Font("Dialog", 3, 14);
          Stringer.drawString("Укажите что вычисленно неправильно:",xSt+5,ySt+57);
          Stringer.fonts[0]=new Font("Dialog", 3, 13);
          Stringer.drawString("y_{0}",xSt+30,ySt+78);
          Stringer.drawString("z_{0}",xSt+30,ySt+98);
          Stringer.drawString("y_{0} и z_{0}",xSt+120,ySt+78);
          Stringer.drawString("все правильно",xSt+120,ySt+98);
          btnNext.setEnabled(false);
          if(jRadioButton2.isSelected()==true)
          {
            g.setColor(new Color(0, 0, 80)); Stringer.fonts[0]=new Font("Dialog", 0, 11);
            Stringer.drawString("Вычислeния поизводятся с точностью до трех знаков после запятой.",xSt+77,ySt+115);
            Stringer.fonts[0]=new Font("SansSerif", 1, 14);
            g.setColor(Color.lightGray); Stringer.fonts[0]=new Font("Dialog", 3, 13);
            Stringer.drawString("y_{0}",xSt+30,ySt+78);
            Stringer.drawString("y_{0} и z_{0}",xSt+120,ySt+78);
            Stringer.drawString("все правильно",xSt+120,ySt+98);
            jRadioButton1.setEnabled(false);
            jRadioButton3.setEnabled(false);
            jRadioButton4.setEnabled(false);
            Stringer.fonts[0]=new Font("Dialog", 1, 14);
            g.setColor(Color.blue);
            Stringer.drawString("Правильно",xSt+238,ySt+85);
            if(Proverka==-1) jTF3.setEnabled(true);
            jTF3.setVisible(true);
            jTF3.setBounds(new Rectangle(xSt+300, ySt+14, 45, 20));
            jButton1.setVisible(true);
            jButton1.setEnabled(true);
            jButton1.setLocation(xSt+390, ySt+14);
            if( Proverka == 1 ){
              g.setColor(Color.blue);
              Stringer.drawString("Правильно",xSt+398,ySt+55);
              jButton1.setEnabled(false);
              btnNext.setEnabled(true);
            }
            if( Proverka == 0 ){
              g.setColor(Color.red);
              Stringer.drawString("Неправильно",xSt+389,ySt+55);
            }
          }
          else if(jRadioButton1.isSelected()==true || jRadioButton3.isSelected()==true || jRadioButton4.isSelected()==true){
            Stringer.fonts[0]=new Font("Dialog", 1, 14);
            g.setColor(Color.red);
            Stringer.drawString("Неправильно",xSt+238,ySt+85);
            if(!entry){Mist_calk[sh]++; entry=true;}
          }
          ////////////
          g.setColor(Color.red);
          Stringer.fonts[0]=new Font("SansSerif", 1, 12);
          Stringer.fonts[1]=new Font("SansSerif", 1, 10);
          Stringer.drawString("y_{0} = a_{0 }+               (b_{0 }- a_{0})",375,212);
          Stringer.drawString("3 - \u221A5",429,201);
          Stringer.drawString("2",441,222);
          g.drawLine(426,207,462,207);
          g.drawLine(426,206,462,206);
          Stringer.drawString("z_{0} = a_{0} + b_{0} - y_{0}",398,254);
          Stringer.fonts[0]=new Font("SansSerif", 1, 14);
          Stringer.fonts[1]=new Font("SansSerif", 1, 11);
          g.setColor(Color.red);
          g.drawLine(351,177,370,196);
          g.drawLine(351,178,370,197);
               ///-----1------
          g.drawLine(361,197,370,197);
          g.drawLine(361,196,370,196);
          g.drawLine(365,195,370,195);
               ///-----2------
          g.drawLine(370,187,370,197);
          g.drawLine(369,189,369,197);
          g.drawLine(368,192,368,197);
          ///////////
        }
      }
      else if(sh==2) Stringer.drawString("Положим k = k + 1 = "+k+".",xSt+28,ySt);
      if(((sh>2 && k>0) || k==0) && sh<4)
      {
        Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
        Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
        g.setColor(new Color(0, 120, 0));
        if(f(y[k])>=0)
        {
          for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y[k]))+1; i<YN+(all2-otr2)*w2-5; i=i+9)
            g.drawLine((int)(otr*w+y[k]*w+XN),i,(int)(otr*w+y[k]*w+XN),i+6);
          Stringer.drawString("y_{"+k+"}",(int)(XN+otr*w+y[k]*w-13),YN+(all2-otr2)*w2-8);
          Stringer.drawString(""+y[k],(int)(XN+otr*w+y[k]*w-Fm1.stringWidth(""+y[k])),YN+(all2-otr2)*w2+15);
        }
        if(f(y[k])<0)
        {
          for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y[k]))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
            g.drawLine((int)(otr*w+y[k]*w+XN),i,(int)(otr*w+y[k]*w+XN),i-6);
          Stringer.drawString("y_{"+k+"}",(int)(XN+otr*w+y[k]*w-13),YN+(all2-otr2)*w2-8);
          Stringer.drawString(""+y[k],(int)(XN+otr*w+y[k]*w-Fm1.stringWidth(""+y[k])),YN+(all2-otr2)*w2+15);
        }
        g.fillOval((int)(otr*w+y[k]*w+XN-3),YN+(all2-otr2)*w2-3,6,6);
        g.setColor(new Color(98, 0, 170));
        if(k==0 && !jRadioButton2.isSelected() && sh==2){
          if(f(Math.round(z[0]*1000-10)/1000.0)>=0)
          {
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(Math.round(z[0]*1000-10)/1000.0))+1; i<YN+(all2-otr2)*w2-5; i=i+9)
              g.drawLine((int)(otr*w+Math.round(z[0]*1000-10)/1000.0*w+XN),i,(int)(otr*w+Math.round(z[0]*1000-10)/1000.0*w+XN),i+6);
            Stringer.drawString("z_{"+k+"}",(int)(XN+otr*w+Math.round(z[0]*1000-10)/1000.0*w+5),YN+(all2-otr2)*w2-8);
            Stringer.drawString(""+Math.round(z[0]*1000-10)/1000.0,(int)(XN+otr*w+Math.round(z[0]*1000-10)/1000.0*w+2),YN+(all2-otr2)*w2+15);
          }
          if(f(Math.round(z[0]*1000-10)/1000.0)<0)
          {
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(Math.round(z[0]*1000-10)/1000.0))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
              g.drawLine((int)(otr*w+Math.round(z[0]*1000-10)/1000.0*w+XN),i,(int)(otr*w+Math.round(z[0]*1000-10)/1000.0*w+XN),i-6);
            Stringer.drawString("z_{"+k+"}",(int)(XN+otr*w+Math.round(z[0]*1000-10)/1000.0*w+5),YN+(all2-otr2)*w2-8);
            Stringer.drawString(""+Math.round(z[0]*1000-10)/1000.0,(int)(XN+otr*w+Math.round(z[0]*1000-10)/1000.0*w+2),YN+(all2-otr2)*w2+15);
          }
           g.fillOval((int)(otr*w+Math.round(z[0]*1000-10)/1000.0*w+XN-3),YN+(all2-otr2)*w2-3,6,6);
        }
        else if(k!=0 || (jRadioButton2.isSelected() && Proverka==1) || sh!=2){
          if(f(z[k])>=0)
          {
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z[k]))+1; i<YN+(all2-otr2)*w2-5; i=i+9)
              g.drawLine((int)(otr*w+z[k]*w+XN),i,(int)(otr*w+z[k]*w+XN),i+6);
            Stringer.drawString("z_{"+k+"}",(int)(XN+otr*w+z[k]*w+5),YN+(all2-otr2)*w2-8);
            Stringer.drawString(""+z[k],(int)(XN+otr*w+z[k]*w+2),YN+(all2-otr2)*w2+15);
          }
          if(f(z[k])<0)
          {
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z[k]))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
              g.drawLine((int)(otr*w+z[k]*w+XN),i,(int)(otr*w+z[k]*w+XN),i-6);
            Stringer.drawString("z_{"+k+"}",(int)(XN+otr*w+z[k]*w+5),YN+(all2-otr2)*w2-8);
            Stringer.drawString(""+z[k],(int)(XN+otr*w+z[k]*w+2),YN+(all2-otr2)*w2+15);
          }
          g.fillOval((int)(otr*w+z[k]*w+XN-3),YN+(all2-otr2)*w2-3,6,6);
        }
      }
      Stringer.fonts[0]=new Font("SansSerif", 1, 14);
      Stringer.fonts[1]=new Font("SansSerif", 1, 11);
    }

    if (sh>=3 && sh<=4){
      g.setColor(new Color(0, 0, 80)); Stringer.fonts[0]=new Font("SansSerif", 1, 14);
      if (sh==3){
        Stringer.drawString("Вычислим значение функции в точках  y_{"+k+"} и z_{"+k+"}:",xSt+28,ySt);
        Stringer.drawString("f( y_{"+k+"} ) = "+(Math.round(f(y[k])*1000))/1000.0+",",xSt+365,ySt);
        Stringer.drawString("f( z_{"+k+"} ) = "+(Math.round(f(z[k])*1000))/1000.0+".",xSt+365,ySt+20);
      }
      g.setColor(new Color(0, 120, 0));
      if(y[k]<0){
        for( int i = (int)(XN+otr*w+y[k]*w+1); i<XN+otr*w-5; i=i+9)
          g.drawLine(i,(int)(YN+(all2-otr2)*w2-f(y[k])*w2),i+6,(int)(YN+(all2-otr2)*w2-f(y[k])*w2));
      }
      else{
        for( int i = (int)(XN+otr*w+y[k]*w-1); i>XN+otr*w+5; i=i-9)
          g.drawLine(i,(int)(YN+(all2-otr2)*w2-f(y[k])*w2),i-6,(int)(YN+(all2-otr2)*w2-f(y[k])*w2));
      }
      g.setColor(new Color(0, 120, 0));
      g.fillOval((int)(XN+otr*w-3),(int)(YN+(all2-otr2)*w2-f(y[k])*w2-3),6,6);
      Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
      Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
      if (f(y[k])<f(z[k])){
        if(y[k]>=0) Stringer.drawString(""+(Math.round(f(y[k])*1000))/1000.0,XN+otr*w-5-Fm1.stringWidth(""+(Math.round(f(y[k])*1000))/1000.0),(int)(YN+(all2-otr2)*w2-f(y[k])*w2)+7);
        else Stringer.drawString(""+(Math.round(f(y[k])*1000))/1000.0,XN+otr*w+5,(int)(YN+(all2-otr2)*w2-f(y[k])*w2)+7);
      }
      else{
        if(y[k]>=0) Stringer.drawString(""+(Math.round(f(y[k])*1000))/1000.0,XN+otr*w-5-Fm1.stringWidth(""+(Math.round(f(y[k])*1000))/1000.0),(int)(YN+(all2-otr2)*w2-f(y[k])*w2)-3);
        else Stringer.drawString(""+(Math.round(f(y[k])*1000))/1000.0,XN+otr*w+5,(int)(YN+(all2-otr2)*w2-f(y[k])*w2)-3);
      }
      g.setColor(new Color(98, 0, 170));
      if(z[k]<0){
        for( int i = (int)(XN+otr*w+z[k]*w+1); i<XN+otr*w-5; i=i+9)
          g.drawLine(i,(int)(YN+(all2-otr2)*w2-f(z[k])*w2),i+6,(int)(YN+(all2-otr2)*w2-f(z[k])*w2));
      }
      else{
        for( int i = (int)(XN+otr*w+z[k]*w-1); i>XN+otr*w+5; i=i-9)
          g.drawLine(i,(int)(YN+(all2-otr2)*w2-f(z[k])*w2),i-6,(int)(YN+(all2-otr2)*w2-f(z[k])*w2));
      }
      g.fillOval((int)(XN+otr*w-3),(int)(YN+(all2-otr2)*w2-f(z[k])*w2-3),6,6);
      Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
      Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
      if (f(y[k])<f(z[k])){
        if(z[k]>=0) Stringer.drawString(""+(Math.round(f(z[k])*1000))/1000.0,XN+otr*w-5-Fm1.stringWidth(""+(Math.round(f(z[k])*1000))/1000.0),(int)(YN+(all2-otr2)*w2-f(z[k])*w2)-3);
        else Stringer.drawString(""+(Math.round(f(z[k])*1000))/1000.0,XN+otr*w+5,(int)(YN+(all2-otr2)*w2-f(z[k])*w2)-3);
      }
      else{
        if(z[k]>=0) Stringer.drawString(""+(Math.round(f(z[k])*1000))/1000.0,XN+otr*w-5-Fm1.stringWidth(""+(Math.round(f(z[k])*1000))/1000.0),(int)(YN+(all2-otr2)*w2-f(z[k])*w2)+7);
        else Stringer.drawString(""+(Math.round(f(z[k])*1000))/1000.0,XN+otr*w+5,(int)(YN+(all2-otr2)*w2-f(z[k])*w2)+7);
      }
      Stringer.fonts[0]=new Font("SansSerif", 1, 14);
      Stringer.fonts[1]=new Font("SansSerif", 1, 11);
    }

    if (sh>=4){
      g.setColor(new Color(0, 0, 80));  Stringer.fonts[0]=new Font("SansSerif", 1, 14);
      if(sh==4){
        jRadioButton1.setLocation(xSt+237,ySt+7);
        jRadioButton1.setVisible(true);
        jRadioButton1.setEnabled(true);
        jRadioButton2.setLocation(xSt+237,ySt+27);
        jRadioButton2.setVisible(true);
        jRadioButton2.setEnabled(true);
        if(AddRAnswer==false){ RightAnswer++; AddRAnswer=true;btnNext.setEnabled(false);}
        Stringer.drawString("Сравним f( y_{"+k+"} ) и f( z_{"+k+"} ):",xSt+28,ySt);
        if((Math.round(f(y[k])*1000))/1000.0<=(Math.round(f(z[k])*1000))/1000.0)
          Stringer.drawString("f( y_{"+k+"} ) \u2264 f( z_{"+k+"} ).",xSt+195,ySt);
        else Stringer.drawString("f( y_{"+k+"} ) > f( z_{"+k+"} ).",xSt+195,ySt);
        g.setColor(Color.black);  Stringer.fonts[0]=new Font("Dialog", 1, 14);
        jRadioButton1.setText(""); jRadioButton2.setText(""); jRadioButton3.setText("");
        jRadioButton1.setEnabled(true); jRadioButton1.setVisible(true);
        jRadioButton2.setEnabled(true); jRadioButton2.setVisible(true);
        jRadioButton3.setEnabled(true); jRadioButton3.setVisible(true);
        jRadioButton1.setBounds(xSt+20,ySt+25,16,20);
        jRadioButton2.setBounds(xSt+20,ySt+45,16,20);
        jRadioButton3.setBounds(xSt+20,ySt+65,16,20);
        g.setColor(Color.black);  Stringer.fonts[0]=new Font("Dialog", 3, 14);
        switch (k)
        {
          case 0:
            Stringer.drawString("Тогда новый интервал неопределенности будет [y_{0}, z_{0}].",xSt,ySt+20);
            Stringer.fonts[0]=new Font("Dialog", 3, 13);
            Stringer.drawString("Нет, должен быть [a_{0}, z_{0}]",xSt+40,ySt+40);
            Stringer.drawString("Нет, должен быть [z_{0}, b_{0}]",xSt+40,ySt+60);
            Stringer.drawString("Да",xSt+40,ySt+80);
            if(jRadioButton1.isSelected()==true)
            {
              g.setColor(Color.lightGray); Stringer.fonts[0]=new Font("Dialog", 3, 13);
              jRadioButton2.setEnabled(false); jRadioButton3.setEnabled(false);
              Stringer.drawString("Нет, должен быть [z_{0}, b_{0}]",xSt+40,ySt+60);
              Stringer.drawString("Да",xSt+40,ySt+80);
            }
            break;
          case 1:
            Stringer.drawString("Тогда новый интервал неопределенности будет [a_{1}, z_{1}].",xSt,ySt+20);
            Stringer.fonts[0]=new Font("Dialog", 3, 13);
            Stringer.drawString("Нет, должен быть [a_{1}, y_{1}]",xSt+40,ySt+40);
            Stringer.drawString("Нет, должен быть [y_{1}, b_{1}]",xSt+40,ySt+60);
            Stringer.drawString("Да",xSt+40,ySt+80);
            if(jRadioButton2.isSelected()==true)
            {
              g.setColor(Color.lightGray); Stringer.fonts[0]=new Font("Dialog", 3, 13);
              jRadioButton1.setEnabled(false); jRadioButton3.setEnabled(false);
              Stringer.drawString("Нет, должен быть [a_{1}, y_{1}]",xSt+40,ySt+40);
              Stringer.drawString("Да",xSt+40,ySt+80);
            }
            break;
          case 2:
            Stringer.drawString("Тогда новый интервал неопределенности будет [y_{2}, b_{2}].",xSt,ySt+20);
            Stringer.fonts[0]=new Font("Dialog", 3, 13);
            Stringer.drawString("Нет, должен быть [a_{2}, z_{2}]",xSt+40,ySt+40);
            Stringer.drawString("Нет, должен быть [z_{2}, b_{2}]",xSt+40,ySt+60);
            Stringer.drawString("Да",xSt+40,ySt+80);
            if(jRadioButton3.isSelected()==true)
            {
              g.setColor(Color.lightGray); Stringer.fonts[0]=new Font("Dialog", 3, 13);
              jRadioButton1.setEnabled(false); jRadioButton2.setEnabled(false);
              Stringer.drawString("Нет, должен быть [a_{2}, z_{2}]",xSt+40,ySt+40);
              Stringer.drawString("Нет, должен быть [z_{2}, b_{2}]",xSt+40,ySt+60);
            }
            break;
          case 3:
            Stringer.drawString("Тогда новый интервал неопределенности будет [a_{3}, b_{3}].",xSt,ySt+20);
            Stringer.fonts[0]=new Font("Dialog", 3, 13);
            Stringer.drawString("Нет, должен быть [z_{3}, b_{3}]",xSt+40,ySt+40);
            Stringer.drawString("Нет, должен быть [a_{3}, z_{3}]",xSt+40,ySt+60);
            Stringer.drawString("Да",xSt+40,ySt+80);
            if(jRadioButton2.isSelected()==true)
            {
              g.setColor(Color.lightGray); Stringer.fonts[0]=new Font("Dialog", 3, 13);
              jRadioButton1.setEnabled(false); jRadioButton3.setEnabled(false);
              Stringer.drawString("Нет, должен быть [z_{3}, b_{3}]",xSt+40,ySt+40);
              Stringer.drawString("Да",xSt+40,ySt+80);
            }
            break;
        }
        if((jRadioButton1.isSelected()==true && k==0) || (jRadioButton2.isSelected()==true && k==3)){
          g.setColor(Color.blue); Stringer.fonts[0]=new Font("Dialog", 1, 14);
          Stringer.drawString("Правильно",xSt+230,ySt+61);
          a[k+1]=a[k];
          b[k+1]=z[k];
          y[k+1]=Math.round((a[k+1]+b[k+1]-y[k])*1000)/1000.0;
          z[k+1]=y[k];
          g.setColor(new Color(0, 0, 80));  Stringer.fonts[0]=new Font("SansSerif", 1, 14);
          Stringer.drawString("Положим a_{"+(k+1)+" }= a_{"+k+" }= "+a[k]+", b_{"+(k+1)+" }= z_{"+k+" }= "+z[k]+" и y_{"+(k+1)+" }= a_{"+(k+1)+"}+b_{"+(k+1)+"}-y_{"+k+" }= "+Math.round((a[k+1]+b[k+1]-y[k])*1000)/1000.0+", z_{"+(k+1)+" }= y_{"+k+" }= "+y[k], xSt, ySt+100);
          Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
          Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
          g.setColor(new Color(98, 0, 170));
          if(f(z[k])>=0){
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z[k]))+1; i<YN+(all2-otr2)*w2-5; i=i+9)
              g.drawLine((int)(otr*w+z[k]*w+XN),i,(int)(otr*w+z[k]*w+XN),i+6);
          }
          if(f(z[k])<0){
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z[k]))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
              g.drawLine((int)(otr*w+z[k]*w+XN),i,(int)(otr*w+z[k]*w+XN),i-6);
          }
          Stringer.drawString("z_{"+k+"} = b_{"+(k+1)+"}",(int)(b[k+1]*w+XN+otr*w+5),YN+w2*(all2-otr2)-8);
          g.setColor(new Color(0, 120, 0));
          if(f(y[k])>=0){
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y[k]))+1; i<YN+(all2-otr2)*w2-5; i=i+9)
              g.drawLine((int)(otr*w+y[k]*w+XN),i,(int)(otr*w+y[k]*w+XN),i+6);
          }
          if(f(y[k])<0){
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y[k]))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
              g.drawLine((int)(otr*w+y[k]*w+XN),i,(int)(otr*w+y[k]*w+XN),i-6);
          }
          Stringer.drawString("y_{"+k+"}",(int)(y[k]*w+XN+otr*w-13),YN+w2*(all2-otr2)-8);
          g.setColor(new Color(0, 0, 130));
          Stringer.drawString("a_{"+(k+1)+"} = a_{"+k+"}",(int)(a[k+1]*w+XN+otr*w-37),YN+w2*(all2-otr2)-8);
          Stringer.drawString("b_{"+k+"}",(int)(XN+otr*w+b[k]*w+5),YN+(all2-otr2)*w2+10);
        }
        if((jRadioButton2.isSelected()==true && k==1) || (k==2 && jRadioButton3.isSelected()==true)){
          g.setColor(Color.blue); Stringer.fonts[0]=new Font("Dialog", 1, 14);
          Stringer.drawString("Правильно",xSt+230,ySt+61);
          a[k+1]=y[k];
          b[k+1]=b[k];
          y[k+1]=z[k];
          z[k+1]=Math.round((a[k+1]+b[k+1]-z[k])*1000)/1000.0;
          g.setColor(new Color(0, 0, 80));  Stringer.fonts[0]=new Font("SansSerif", 1, 14);
          Stringer.drawString("Положим a_{"+(k+1)+" }= y_{"+k+" }= "+y[k]+", b_{"+(k+1)+" }= b_{"+k+" }= "+b[k]+" и y_{"+(k+1)+" }= z_{"+k+" }= "+z[k]+", z_{"+(k+1)+" }=a_{"+(k+1)+"}+b_{"+(k+1)+"}-z_{"+k+"}= "+Math.round((a[k+1]+b[k+1]-z[k])*1000)/1000.0, xSt, ySt+100);
          Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
          Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
          g.setColor(new Color(0, 120, 0));
          if(f(y[k])>=0){
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y[k]))+1; i<YN+(all2-otr2)*w2-5; i=i+9)
              g.drawLine((int)(otr*w+y[k]*w+XN),i,(int)(otr*w+y[k]*w+XN),i+6);
          }
          if(f(y[k])<0){
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y[k]))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
              g.drawLine((int)(otr*w+y[k]*w+XN),i,(int)(otr*w+y[k]*w+XN),i-6);
          }
          Stringer.drawString("a_{"+(k+1)+"} = y_{"+k+"}",(int)(a[k+1]*w+XN+otr*w-36),YN+w2*(all2-otr2)-8);
          g.setColor(new Color(98, 0, 170));
          if(f(z[k])>=0){
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z[k]))+1; i<YN+(all2-otr2)*w2-5; i=i+9)
              g.drawLine((int)(otr*w+z[k]*w+XN),i,(int)(otr*w+z[k]*w+XN),i+6);
          }
          if(f(z[k])<0){
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z[k]))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
              g.drawLine((int)(otr*w+z[k]*w+XN),i,(int)(otr*w+z[k]*w+XN),i-6);
          }
          Stringer.drawString("z_{"+k+"}",(int)(z[k]*w+XN+otr*w+5),YN+w2*(all2-otr2)-8);
          g.setColor(new Color(0, 0, 130));
          Stringer.drawString("b_{"+(k+1)+"} = b_{"+k+"}",(int)(b[k+1]*w+XN+otr*w+5),YN+w2*(all2-otr2)-8);
          Stringer.drawString("a_{"+k+"}",(int)(XN+otr*w+a[k]*w-13),YN+(all2-otr2)*w2+10);
        }
        if((k==0 && jRadioButton1.isSelected()==true) || ((k==1 || k==3) && jRadioButton2.isSelected()==true) ||
           (k==2 && jRadioButton3.isSelected()==true))
        {
          Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
          Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
          g.setColor(new Color(0, 0, 250));
          if(f(a[k+1])>0)
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(a[k+1]))+1; i<(int)(YN+(all2-otr2)*w2); i=i+9)
              g.drawLine((int)(otr*w+a[k+1]*w+XN),i,(int)(otr*w+a[k+1]*w+XN),i+6);
          if(f(a[k+1])<0)
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(a[k+1]))-1; i>YN+(all2-otr2)*w2; i=i-9)
              g.drawLine((int)(otr*w+a[k+1]*w+XN),i,(int)(otr*w+a[k+1]*w+XN),i-6);
          if(f(b[k+1])>0)
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(b[k+1]))+1; i<YN+(all2-otr2)*w2; i=i+9)
              g.drawLine((int)(otr*w+b[k+1]*w+XN),i,(int)(otr*w+b[k+1]*w+XN),i+6);
          if(f(b[k+1])<0)
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(b[k+1]))-1; i>YN+(all2-otr2)*w2; i=i-9)
              g.drawLine((int)(otr*w+b[k+1]*w+XN),i,(int)(otr*w+b[k+1]*w+XN),i-6);
          g.drawLine((int)(XN+otr*w+a[k+1]*w),(int)(YN+w2*(all2-otr2)),(int)(XN+otr*w+b[k+1]*w),(int)(YN+w2*(all2-otr2)));
          g.drawLine((int)(XN+otr*w+a[k+1]*w),(int)(YN+w2*(all2-otr2)+1),(int)(XN+otr*w+b[k+1]*w),(int)(YN+w2*(all2-otr2)+1));
          Stringer.fonts[0]=new Font("SansSerif", 1, 14);
          Stringer.fonts[1]=new Font("SansSerif", 1, 11);
          Stringer.drawString("[",(int)(XN+otr*w+a[k+1]*w-2),(int)(YN+(all2-otr2)*w2+4));
          Stringer.drawString("]",(int)(XN+otr*w+b[k+1]*w-2),(int)(YN+(all2-otr2)*w2+4));
          btnNext.setEnabled(true);
        }
        else
        {
          g.setColor(new Color(0, 0, 80));  Stringer.fonts[0]=new Font("SansSerif", 1, 14);
          if(jRadioButton1.isSelected() || jRadioButton2.isSelected() || jRadioButton3.isSelected())
          {
            g.setColor(Color.red); Stringer.fonts[0]=new Font("Dialog", 1, 14);
            Stringer.drawString("Неправильно",xSt+230,ySt+61);
            Stringer.fonts[0]=new Font("SansSerif", 1, 14);
            if(!entry){Mist_under[sh]++; entry=true;}
          }
          Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
          Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
          g.setColor(new Color(0, 0, 130));
          Stringer.drawString("a_{"+k+"}",(int)(XN+otr*w+a[k]*w-13),(int)(YN+(all2-otr2)*w2-8));
          Stringer.drawString("b_{"+k+"}",(int)(XN+otr*w+b[k]*w+5),(int)(YN+(all2-otr2)*w2-8));
          g.setColor(new Color(0, 120, 0));
          if(f(y[k])>=0)
          {
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y[k]))+1; i<(int)(YN+(all2-otr2)*w2-5); i=i+9)
              g.drawLine((int)(otr*w+y[k]*w+XN),i,(int)(otr*w+y[k]*w+XN),i+6);
            Stringer.drawString("y_{"+k+"}",(int)(XN+otr*w+y[k]*w-13),(int)(YN+(all2-otr2)*w2-8));
          }
          if(f(y[k])<0)
          {
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y[k]))-1; i>(int)(YN+(all2-otr2)*w2+5); i=i-9)
              g.drawLine((int)(otr*w+y[k]*w+XN),i,(int)(otr*w+y[k]*w+XN),i-6);
            Stringer.drawString("y_{"+k+"}",(int)(XN+otr*w+y[k]*w-13),(int)(YN+(all2-otr2)*w2-8));
          }
          g.setColor(new Color(98, 0, 170));
          if(f(z[k])>=0)
          {
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z[k]))+1; i<(int)(YN+(all2-otr2)*w2-5); i=i+9)
              g.drawLine((int)(otr*w+z[k]*w+XN),i,(int)(otr*w+z[k]*w+XN),i+6);
            Stringer.drawString("z_{"+k+"}",(int)(XN+otr*w+z[k]*w+5),(int)(YN+(all2-otr2)*w2-8));
          }
          if(f(z[k])<0)
          {
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z[k]))-1; i>(int)(YN+(all2-otr2)*w2+5); i=i-9)
              g.drawLine((int)(otr*w+z[k]*w+XN),i,(int)(otr*w+z[k]*w+XN),i-6);
            Stringer.drawString("z_{"+k+"}",(int)(XN+otr*w+z[k]*w+5),(int)(YN+(all2-otr2)*w2-8));
          }
          Stringer.fonts[0]=new Font("SansSerif", 1, 14);
          Stringer.fonts[1]=new Font("SansSerif", 1, 11);
        }
        Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
        Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
        g.setColor(new Color(0, 120, 0));
        Stringer.drawString(""+y[k],(int)(XN+otr*w+y[k]*w-Fm1.stringWidth(""+y[k])),(int)(YN+(all2-otr2)*w2+15));
        g.fillOval((int)(otr*w+y[k]*w+XN-3),YN+(all2-otr2)*w2-3,6,6);
        g.setColor(new Color(98, 0, 170));
        Stringer.drawString(""+z[k],(int)(XN+otr*w+z[k]*w+2),(int)(YN+(all2-otr2)*w2+15));
        g.fillOval((int)(otr*w+z[k]*w+XN-3),YN+(all2-otr2)*w2-3,6,6);
        Stringer.fonts[0]=new Font("SansSerif", 1, 14);
        Stringer.fonts[1]=new Font("SansSerif", 1, 11);
      }
    }

    if(sh==5){
      g.setFont(new java.awt.Font("Dialog", 1, 14));
      g.setColor(new Color(0, 0, 80));
      g.setColor(Color.red);
      Stringer.fonts[0]=new Font("SansSerif", 1, 12);
      Stringer.fonts[1]=new Font("SansSerif", 1, 10);
      Stringer.drawString("x^{*} \u2248",389,301);
      Stringer.drawString("( a_{k+1} + b_{k+1} )",416,288);
      Stringer.drawString("2",451,311);
      g.drawLine(415,295,492,295);
      g.drawLine(415,296,492,296);
      Stringer.fonts[0]=new Font("SansSerif", 1, 14);
      Stringer.fonts[1]=new Font("SansSerif", 1, 11);
      g.setColor(Color.red);
      g.drawLine(355,272,374,291);
      g.drawLine(355,273,374,292);
           ///-----1------
      g.drawLine(365,292,374,292);
      g.drawLine(365,291,374,291);
      g.drawLine(369,290,374,290);
           ///-----2------
      g.drawLine(374,282,374,292);
      g.drawLine(373,284,373,292);
      g.drawLine(372,287,372,292);
    //////////////////////////////
    Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
      Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
      if (sh>=0){
        g.setColor(new Color(0, 0, 130));
        if(f(a[k+1])>0)
          for( int i = (int)(YN+(all2-otr2)*w2-w2*f(a[k+1]))+1; i<YN+(all2-otr2)*w2; i=i+9)
            g.drawLine((int)(otr*w+a[k+1]*w+XN),i,(int)(otr*w+a[k+1]*w+XN),i+6);
        if(f(a[k+1])<0)
          for( int i = (int)(YN+(all2-otr2)*w2-w2*f(a[k+1]))-1; i>YN+(all2-otr2)*w2; i=i-9)
            g.drawLine((int)(otr*w+a[k+1]*w+XN),i,(int)(otr*w+a[k+1]*w+XN),i-6);
        if(f(b[k+1])>0)
          for( int i = (int)(YN+(all2-otr2)*w2-w2*f(b[k+1]))+1; i<YN+(all2-otr2)*w2; i=i+9)
            g.drawLine((int)(otr*w+b[k+1]*w+XN),i,(int)(otr*w+b[k+1]*w+XN),i+6);
        if(f(b[k+1])<0)
          for( int i = (int)(YN+(all2-otr2)*w2-w2*f(b[k+1]))-1; i>YN+(all2-otr2)*w2; i=i-9)
            g.drawLine((int)(otr*w+b[k+1]*w+XN),i,(int)(otr*w+b[k+1]*w+XN),i-6);
        Stringer.drawString("a_{"+(k+1)+"}",(int)(XN+otr*w+a[k+1]*w-13),YN+(all2-otr2)*w2-8);
        Stringer.drawString("b_{"+(k+1)+"}",(int)(XN+otr*w+b[k+1]*w+5),YN+(all2-otr2)*w2-8);
        g.drawLine((int)(XN+otr*w+a[k+1]*w),YN+(all2-otr2)*w2,(int)(XN+otr*w+b[k+1]*w),YN+(all2-otr2)*w2);
        g.drawLine((int)(XN+otr*w+a[k+1]*w),YN+(all2-otr2)*w2+1,(int)(XN+otr*w+b[k+1]*w),YN+(all2-otr2)*w2+1);
        Stringer.fonts[0]=new Font("SansSerif", 1, 14);
        Stringer.drawString("[",(int)(XN+otr*w+a[k+1]*w-2),YN+(all2-otr2)*w2+4);
        Stringer.drawString("]",(int)(XN+otr*w+b[k+1]*w-2),YN+(all2-otr2)*w2+4);
      }

      g.setColor(new Color(0, 0, 80));
      Stringer.drawString("В качестве приближенного решения можно взять середину",xSt+28,ySt);
      Stringer.drawString("последнего интервала:",xSt,ySt+33);
      Stringer.drawString("    =",xSt+173,ySt+35);
      Stringer.drawString("x^{*}",xSt+173,ySt+33);
      Stringer.drawString("( a_{"+(k+1)+"} + b_{"+(k+1)+"} )",xSt+203,ySt+20);
      Stringer.drawString("2",xSt+230,ySt+40);
      g.drawLine(xSt+203,ySt+27,xSt+260,ySt+27);
      g.drawLine(xSt+203,ySt+28,xSt+260,ySt+28);
      Stringer.drawString("=",xSt+269,ySt+35);
      Stringer.drawString("( "+a[k+1]+" + "+b[k+1]+")",xSt+283,ySt+20);
      Stringer.drawString("2",xSt+280+Fm.stringWidth("( "+a[k+1]+" + "+b[k+1]+")")/2,ySt+40);
      Stringer.drawString("= "+(Math.round((a[k+1]+b[k+1])*1000/2)/1000.0),xSt+289+Fm.stringWidth("( "+a[k+1]+" + "+b[k+1]+")"),ySt+35);
      g.drawLine(xSt+283,ySt+27,xSt+283+Fm.stringWidth("( "+a[k+1]+" + "+b[k+1]+")"),ySt+27);
      g.drawLine(xSt+283,ySt+28,xSt+283+Fm.stringWidth("( "+a[k+1]+" + "+b[k+1]+")"),ySt+28);
      g.setColor(Color.red);
      Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
      g.fillOval((int)((a[k+1]+b[k+1])*w/2+XN+otr*w-3),YN+(all2-otr2)*w2-3,6,6);
      if((int)(YN+(all2-otr2)*w2-f((a[k+1]+b[k+1])/2.0)*w2)>YN+(all2-otr2)*w2){
        for(int i=(int)(YN+(all2-otr2)*w2-f((a[k+1]+b[k+1])/2.0)*w2);i>YN+(all2-otr2)*w2+3;i-=9)
          g.drawLine((int)((a[k+1]+b[k+1])*w/2.0+XN+otr*w),i,(int)((a[k+1]+b[k+1])*w/2.0+XN+otr*w),i-6);}
      else{
        for(int i=(int)(YN+(all2-otr2)*w2-f((a[k+1]+b[k+1])/2.0)*w2);i<YN+(all2-otr2)*w2-3;i+=9)
          g.drawLine((int)((a[k+1]+b[k+1])*w/2.0+XN+otr*w),i,(int)((a[k+1]+b[k+1])*w/2.0+XN+otr*w),i+6);
      }
      Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
      Stringer.drawString("x^{*}",(int)((a[k+1]+b[k+1])*w/2+XN+otr*w),YN+(all2-otr2)*w2+20);
      Stringer.fonts[0]=new Font("SansSerif", 1, 14);
      Stringer.fonts[1]=new Font("SansSerif", 1, 11);
      btnNext.setEnabled(false);
      jCheckBoxRezult.setBounds(new Rectangle(xSt+175, ySt+67, 150, 23));
      jCheckBoxRezult.setVisible(true);  jCheckBoxRezult.setEnabled(true);
      g.setColor(Color.black);
      g.drawLine(xSt+159,ySt+60,xSt+319,ySt+60);
      g.drawLine(xSt+159,ySt+61,xSt+319,ySt+61);
      if(Ch==true)
      {
        int kolmist_calk=0, kolmist_under=0, kolmist_knowledge=0, kolmist_use=0, Vopros=0;
        g.setColor(new Color(190, 190, 190));
        g.fillRect(44,110,436,172);
        g.setColor(new Color(255, 255, 255));
        g.fillRect(37,103,436,172);
        g.setColor(new Color(247, 247, 255));
        g.fillRect(458,103,15,15);
        g.setColor(Color.blue);
        g.drawRect(37,103,436,172);
        g.drawRect(458,103,15,15); g.drawLine(458,103,473,118); g.drawLine(458,118,473,103);
        g.setColor(new Color(180, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 3, 13));
        g.drawString("Ваш результат:",206,122);
        for(int i=0; i<10; i++){
          kolmist_calk=kolmist_calk+Mist_calk[i];
          kolmist_under=kolmist_under+Mist_under[i];
          kolmist_knowledge=kolmist_knowledge+Mist_knowledge[i];
          kolmist_use=kolmist_use+Mist_use[i];
        }
        Vopros=RightAnswer+kolmist_calk+kolmist_under+kolmist_knowledge+kolmist_use;
        g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("Количество вопросов: "+Vopros,172,142);
        g.drawString("Количество правильных ответов: "+RightAnswer,127,162);
        g.drawString("Количество допущенных ошибок :",129,182);
        g.drawString("- на знание:           "+kolmist_knowledge,184,197);
        g.drawString("- на понимание:    "+kolmist_under,184,212);
        if(slog==0) g.setColor(Color.lightGray);
        g.drawString("- на вычисление: "+kolmist_calk,184,227);
        g.setColor(Color.lightGray);
        g.drawString("- на применение: "+kolmist_use,184,242);
        g.setColor(new Color(0, 0, 80));
        if(Vopros!=0 && RightAnswer<=Vopros)
          g.drawString("Результат выполнения упражнения: "+(RightAnswer*100/Vopros)+"%",107,265);
        else
          g.drawString("Результат выполнения упражнения: 0%",107,265);
      }
    }
   }
 }

  void btnNext_actionPerformed(ActionEvent e) {
    jRadioButton.setSelected(true); jRadioBtnYN.setSelected(true);
    jRadioButton1.setVisible(false); jRadioButton1.setEnabled(false);
    jRadioButton2.setVisible(false); jRadioButton2.setEnabled(false);
    jRadioButton3.setVisible(false); jRadioButton3.setEnabled(false);
    jRadioButton4.setVisible(false); jRadioButton4.setEnabled(false);
    jRadioBtnYes.setVisible(false); jRadioBtnYes.setEnabled(false);
    jRadioBtnNo.setVisible(false); jRadioBtnNo.setEnabled(false);
    jButton1.setVisible(false);
    jButton1.setEnabled(false);
    jButton1.setVisible(false);
    jTF1.setVisible(false);
    jTF1.setEnabled(false);
    jTF1.setText("");
    jTF1.setForeground(new Color(0, 0, 80));
    jTF3.setVisible(false);
    jTF3.setEnabled(false);
    jTF3.setText("");
    jTF3.setForeground(new Color(0, 0, 80));
    Proverka=-1;
    AddRAnswer=false;
    entry=false;
    if (sh<5){
      if (sh==4){
        sh=0;
        k++;
      }
      else if(k>0 && sh==1 && Math.abs(b[k]-a[k])<=l){ sh=4; k--;}
      num++;
      sh++;
      jPanel1.repaint();
    }
  }

  void btnNew_actionPerformed(ActionEvent e) {
    btnNext.setVisible(true); btnNext.setEnabled(true);
    jRadioButton.setSelected(true); jRadioBtnYN.setSelected(true);
    jRadioButton1.setVisible(false); jRadioButton1.setEnabled(false);
    jRadioButton2.setVisible(false); jRadioButton2.setEnabled(false);
    jRadioButton3.setVisible(false); jRadioButton3.setEnabled(false);
    jRadioButton4.setVisible(false); jRadioButton4.setEnabled(false);
    jButton1.setVisible(false);
    jCheckBoxRezult.setSelected(true);
    jCheckBoxRezult.setVisible(false);
    jCheckBoxRezult.setEnabled(false);
    jButton1.setVisible(false);
    jButton1.setEnabled(false);
    jTF1.setVisible(false);
    jTF1.setEnabled(false);
    jTF1.setText("");
    jTF3.setVisible(false);
    jTF3.setEnabled(false);
    jTF3.setText("");
    Proverka = -1;
    RightAnswer=0;
    AddRAnswer=false;
    entry=false;
    sh=0;
    for (int j=1;j<10;j++){
      a[j]=0; b[j]=0;
      y[j]=0; z[j]=0;
    }
    k=0; num=0;
    for(int i=0; i<10; i++){
      Mist_calk[i]=0;
      Mist_under[i]=0;
      Mist_knowledge[i]=0;
      Mist_use[i]=0;
    }
    jPanel1.repaint();
  }

  void jButton1_mouseClicked(MouseEvent e) {
    Proverka = -1;
    if(sh==1 && jTF1.isEnabled()==true && jTF1.getText().equals("")!=true){
      try{
        if(sh==1 && Math.round(Math.abs(a[k]-b[k])*1000)/1000.0 == Double.parseDouble(jTF1.getText()) ){
          Proverka = 1;
          jTF1.setDisabledTextColor(Color.blue);
        }
        else{
          Mist_calk[sh]++;
          Proverka = 0;
          jTF1.setForeground(Color.red);
        }
      }
      catch(Exception ee){
        Mist_calk[sh]++;
        Proverka = 0;
        jTF1.setForeground(Color.red);
      }
    }
    else if(sh==1 && jTF1.isEnabled()==true && jTF1.getText().equals("")==true){
      Proverka = 0;
      jTF1.setForeground(Color.red);
    }
    if(sh==2){
      Proverka = 1;
      if(jTF3.isEnabled()==true && jTF3.getText().equals("")!=true){
        try{
          if(Math.round(z[0]*1000)/1000.0 == Double.parseDouble(jTF3.getText()) ){
            jTF3.setDisabledTextColor(Color.blue);
            jTF3.setEnabled(false);
          }
          else{
            Mist_calk[sh]++;
            Proverka = 0;
            jTF3.setForeground(Color.red);
          }
        }
        catch(Exception ee){
          Mist_calk[sh]++;
          Proverka = 0;
          jTF3.setForeground(Color.red);
        }
      }
      else if(jTF3.isEnabled()==true && jTF3.getText().equals("")==true){
        Proverka = 0;
        jTF3.setForeground(Color.red);
      }
    }
    jPanel1.repaint();
  }

  void jPanel1_mouseClicked(MouseEvent e){
    if(sh==5 && e.getX()>=458 && e.getX()<=473 && e.getY()>=103 && e.getY()<=118){
      jCheckBoxRezult.setSelected(false);
      Ch=false;
      jPanel1.repaint();
    }
  }

  void jCheckBoxRezult_stateChanged(ChangeEvent e) {
    if(jCheckBoxRezult.isSelected()==true && sh==5) Ch=true;
    else Ch=false;
    jPanel1.repaint();
    jCheckBoxRezult.setOpaque(true);
  }

  void jRadioBtnYes_itemStateChanged(ItemEvent e) {
    entry=false;
    jPanel1.repaint();
  }
  void jRadioBtnNo_itemStateChanged(ItemEvent e) {
    entry=false;
    jPanel1.repaint();
  }

  void jRadioButton1_itemStateChanged(ItemEvent e) {
    entry=false;
    jPanel1.repaint();
  }
  void jRadioButton2_itemStateChanged(ItemEvent e) {
    entry=false;
    jPanel1.repaint();
  }
  void jRadioButton3_itemStateChanged(ItemEvent e) {
    entry=false;
    jPanel1.repaint();
  }
  void jRadioButton4_itemStateChanged(ItemEvent e) {
    entry=false;
    jPanel1.repaint();
  }
  void jTF1_inputMethodTextChanged(InputMethodEvent e) {
    jTF1.setForeground(new Color(0, 0, 80));
  }
   void jTF3_inputMethodTextChanged(InputMethodEvent e) {
    jTF3.setForeground(new Color(0, 0, 80));
  }
}