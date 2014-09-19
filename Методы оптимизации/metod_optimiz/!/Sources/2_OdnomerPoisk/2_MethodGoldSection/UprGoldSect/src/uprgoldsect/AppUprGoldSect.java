package uprgoldsect;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.event.*;

public class AppUprGoldSect extends JApplet {
  Panel_mypaint jPanel1 = new Panel_mypaint();
  JLabel jLabel1 = new JLabel();
  JButton btnNext = new JButton();
  JButton btnNew = new JButton();
  JButton jButton1 = new JButton();
  JButton Plus = new JButton();
  JButton Minus = new JButton();
  JCheckBox jCheckBoxRezult = new JCheckBox();
  JRadioButton jRadioButton = new JRadioButton();
  JRadioButton jRadioButton1 = new JRadioButton();
  JRadioButton jRadioButton2 = new JRadioButton();
  ButtonGroup buttonGroup1 = new ButtonGroup();
  JTextField jTF1 = new JTextField();
  JTextField jTF3 = new JTextField();
  JTextField jTF2 = new JTextField();
  public int sh=-1, k=0, num=-1, slog=0, select=(int)(Math.random()*12), x1=330, y1=70, y2=290, x2=10,
            Variant[]={0,1,2,3,4,5,6,7,8,9,10,11,1}, XN=2, YN=67,
            w=50, //количество пикселов в 1 делении (на графике) x1
            all=13, //количество делений (всего) на графике x1
            otr=3, //количество делений (с отрицательным знаком) на графике x1
            ost=0,
            w2=25, //количество пикселов в 1 делении (на графике) x2
            all2=10, //количество делений (всего) на графике x2
            otr2=3, //количество делений (с отрицательным знаком) на графике x2
            ost2=0;
  public double l=1.0, scale=1.0;
  double [] a = new double[30];
  double [] b = new double[30];
  double [] y = new double[30];
  double [] z = new double[30];
  public int[] Mist_knowledge=new int [50];
  public int[] Mist_calk=new int [50];
  public int[] Mist_under=new int [50];
  public int[] Mist_use=new int [50];
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
    try{
      if(getParameter("slog").equals("*")){ slog=0; }
      else if(getParameter("slog").equals("**")){ slog=1; }
      else slog=2;
    }
    catch(Exception e) {System.out.println("No parameters");}
  }
  /**Component initialization*/
  private void jbInit() throws Exception {
    this.getContentPane().setBackground(new Color(247, 247, 255));
    this.setSize(new Dimension(550, 492));
    jPanel1.setBackground(new Color(247, 247, 255));
    jPanel1.setBounds(new Rectangle(10, 0, 530, 451));
    jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        jPanel1_mouseClicked(e);
      }
    });
    this.getContentPane().setBackground(new Color(247, 247, 255));
    this.setFont(new java.awt.Font("SansSerif", 1, 14));
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel1.setForeground(new Color(130, 0, 80));
    jLabel1.setBounds(new Rectangle(205, 2, 106, 17));
    btnNext.setBackground(new Color(220, 230, 255));
    btnNext.setFont(new java.awt.Font("Dialog", 1, 14));
    btnNext.setForeground(new Color(0, 0, 60));
    btnNext.setVisible(true);
    btnNext.setText("==>");
    btnNext.setBounds(new Rectangle(270,460, 100, 23));
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
    btnNew.setBounds(new Rectangle(140,460, 100, 23));
    btnNew.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btnNew_actionPerformed(e);
      }
    });
    Plus.setBackground(new Color(220, 230, 255));
    Plus.setFont(new java.awt.Font("SansSerif", 1, 14));
    Plus.setForeground(new Color(0, 0, 60));
    Plus.setBorder(BorderFactory.createRaisedBevelBorder());
    Plus.setText("+");
    Plus.setBounds(new Rectangle(478,170, 21, 21));
    Plus.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Plus_actionPerformed(e);
      }
    });
    Minus.setBackground(new Color(220, 230, 255));
    Minus.setFont(new java.awt.Font("SansSerif", 1, 16));
    Minus.setForeground(new Color(0, 0, 60));
    Minus.setBorder(BorderFactory.createRaisedBevelBorder());
    Minus.setText("-");
    Minus.setBounds(new Rectangle(504,170, 21, 21));
    Minus.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Minus_actionPerformed(e);
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
    jTF2.setFont(new java.awt.Font("Dialog", 3, 13));
    jTF2.setEditable(false);
    jTF2.setText(""+l);
    jTF2.setVisible(true);
    jTF2.setBackground(new Color(255, 255, 255));
    jTF2.setForeground(new Color(0, 0, 80));
    jTF2.setBounds(new Rectangle(438, 171, 35, 20));
    jRadioButton1.setBackground(new Color(255, 255, 255));
    jRadioButton1.setFont(new java.awt.Font("Dialog", 3, 13));
    jRadioButton1.setForeground(new Color(0, 0, 40));
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
    jRadioButton2.setForeground(new Color(0, 0, 40));
    jRadioButton2.setText("");
    jRadioButton2.setBounds(new Rectangle(53, 400, 16, 20));
    jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        jRadioButton2_itemStateChanged(e);
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
    buttonGroup1.add(jRadioButton);
    buttonGroup1.add(jRadioButton1);
    buttonGroup1.add(jRadioButton2);
    this.getContentPane().add(jPanel1, null);
    jPanel1.setLayout(null);
    this.jPanel1.add(jLabel1, null);
    this.jPanel1.add(jTF1, null);
    this.jPanel1.add(jTF3, null);
    this.jPanel1.add(jTF2, null);
    this.getContentPane().add(btnNew,null);
    this.getContentPane().add(btnNext,null);
    this.jPanel1.add(jButton1,null);
    this.jPanel1.add(Plus,null);
    this.jPanel1.add(Minus,null);
    this.jPanel1.add(jCheckBoxRezult, null);
    this.jPanel1.add(jRadioButton, null);
    this.jPanel1.add(jRadioButton1, null);
    this.jPanel1.add(jRadioButton2, null);
    Proverka=-1;
  }

  public double f(double x){
    double j=0.0;
    if (select==0)  j=2*x*(x-1)+5;
    if (select==1)  j=5*x*(x+2)+6;
    if (select==2)  j=2*x*(x+2);
    if (select==3)  j=x*(x-2)+2;
    if (select==4)  j=x*(x+2)+0.5;
    if (select==5)  j=x*(x-5)+6;
    if (select==6)  j=x*(x+4)-1;
    if (select==7)  j=2*x*(x-1)+1;
    if (select==8)  j=0.5*x*(x-6)+5.5;
    if (select==9)  j=0.5*x*(x-1)+1;
    if (select==10)  j=3*x*(x-2)+7;
    if (select==11)   j=2*x*(x-7)+20;
    return j;
  }

  public void vibor(){
    if(select==0){
      all=5; otr=2;
      all2=11; otr2=1;
    }
    if(select==1){
      all=5; otr=3;
      all2=25; otr2=2;
    }
    if(select==2){
      all=4; otr=3;
      all2=4; otr2=3;
    }
    if(select==3){
      all=5; otr=1;
      all2=7; otr2=1;
    }
    if(select==4){
      all=5; otr=3;
      all2=5; otr2=1;
    }
    if(select==5){
      all=6; otr=1;
      all2=8; otr2=1;
    }
    if(select==6){
      all=5; otr=4;
      all2=7; otr2=6;
    }
    if(select==7){
      all=5; otr=2;
      all2=7; otr2=1;
    }
    if(select==8){
      all=7; otr=1;
      all2=5; otr2=1;
    }
    if(select==9){
      all=5; otr=2;
      all2=4; otr2=1;
    }
    if(select==10){
      all=4; otr=1;
      all2=13; otr2=1;
    }
    if(select==11){
      all=7; otr=1;
      all2=6; otr2=5;
    }
    w=(int)(scale*338/all); w2=(int)(scale*253/all2);
    ost=338-w*all; ost2=253-w2*all2;
  }
  void interval(){
    if (select==0){a[0]=-1;b[0]=2;}
    if (select==1){a[0]=-2;b[0]=1;}
    if (select==2){a[0]=-2;b[0]=0;}
    if (select==3){a[0]=0;b[0]=3;}
    if (select==4){a[0]=-2;b[0]=1;}
    if (select==5){a[0]=0;b[0]=4;}
    if (select==6){a[0]=-3;b[0]=0;}
    if (select==7){a[0]=-1;b[0]=2;}
    if (select==8){a[0]=2;b[0]=5;}
    if (select==9){a[0]=-1;b[0]=2;}
    if (select==10){a[0]=0;b[0]=2.5;}
    if (select==11){a[0]=2;b[0]=5;}
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
    vibor();
    if(language==0){
      jLabel1.setText("Exercise");
      btnNew.setText("To update");
      jButton1.setText("Check");
    }
    else{
      jLabel1.setText("Упражнение");
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
       Stringer.drawString("To find a minimum of function f(x) by a method golden section",78,40);
     }
     else{
       g.setColor(new Color(180, 0, 80));
       Stringer.fonts[0]=new Font("SansSerif", 3, 13);
       Stringer.drawString("Задача: ",25,40);
       Stringer.drawString("Графическая иллюстрация:",10,63);
       Stringer.drawString("Величины:",368,63);
       Stringer.drawString("Точность:  ",360,185);
       Stringer.drawString("Формулы:  ",368,209);
       Stringer.drawString("Решение:  ",10,336);
       g.setColor(new Color(0, 0, 80));
        Stringer.fonts[0]=new Font("SansSerif", 1, 14);
       Stringer.drawString("Найти минимум функции f(x) методом золотого сечения",80,40);
     }
    // Stringer.drawString(""+select,1,15); ///////////////////
   // Stringer.drawString(""+Math.round(198.6),1,15);
     g.setColor(new Color(255, 255, 255));
     g.fillRect(2,67,338,253);g.fillRect(360,67,165,87);g.fillRect(360,213,165,107);g.fillRect(2,340,523,110);
     g.setColor(new Color(157, 187, 255));
     g.drawRect(2,67,338,253);g.drawRect(360,67,165,87);g.drawRect(360,213,165,107);g.drawRect(2,340,523,110);

     /*nach. velichini*/g.setColor(new Color(0, 0, 80));
     interval();
     Stringer.fonts[0]=new Font("SansSerif", 1, 12);
     Stringer.fonts[1]=new Font("SansSerif", 1, 9);
     if(language==0){
       Stringer.drawString("L_{0} = ["+a[0]+","+b[0]+"] - interval",365,85);
       Stringer.drawString("uncertainty",385,105);
       Stringer.drawString("\u2113 = "+l,365,145);
       Stringer.drawString("- accuracy",416,145);
     }
     else{
       Stringer.drawString("L_{0} = ["+a[0]+","+b[0]+"]",365,82);
       Stringer.drawString("-  начальный",443,82);
       Stringer.drawString("интервал",465,97);
       Stringer.drawString("неопределенности",408,112);
       Stringer.drawString("\u2113 = "+l+" - допустимая длина",365,132);
       Stringer.drawString("конечного интервала",395,147);
     //  if(sh>0) Stringer.drawString("k = "+k+"  - номер итерации",365,165);
     //  else Stringer.drawString("k  - номер итерации",365,165);
    //   Stringer.drawString("- номер итерации",406,165);
     }

    /*formula*/
    Stringer.fonts[1]=new Font("SansSerif", 1, 10);
    Stringer.drawString("y_{0} = a_{0 }+               (b_{0 }- a_{0})",375,242);
    Stringer.drawString("3 - \u221A5",429,231);
    Stringer.drawString("2",441,249);
    g.drawLine(426,237,462,237);
    g.drawLine(426,236,462,236);

    Stringer.drawString("z_{0} = a_{0} + b_{0} - y_{0}",398,269);

    Stringer.drawString("x^{*} \u2248",390,306);
    Stringer.drawString("( a_{k+1} + b_{k+1} )",417,293);
    Stringer.drawString("2",452,313);
    g.drawLine(416,300,493,300);
    g.drawLine(416,301,493,301);

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
    switch(select)
    {
      case 0:
        Stringer.drawString("f(x) = 2*x*(x-1)+ 5",165,80);
        break;
      case 1:
        Stringer.drawString("f(x) = 5*x*(x+2)+ 6",57,80);
        break;
      case 2:
        Stringer.drawString("f(x) = 2*x*(x+2)",120,80);
        break;
      case 3:
        Stringer.drawString("f(x) = x*(x-2)+ 2",139,80);
        break;
      case 4:
        Stringer.drawString("f(x) = x*(x+2)+ 0.5",57,80);
        break;
      case 5:
        Stringer.drawString("f(x) = x*(x-5)+ 6",158,80);
        break;
      case 6:
        Stringer.drawString("f(x) = x*(x+4)- 1",105,80);
        break;
      case 7:
        Stringer.drawString("f(x) = 2*x*(x-1)+ 1",168,80);
        break;
      case 8:
        Stringer.drawString("f(x) = 0.5*x*(x-6)+ 5.5",133,80);
        break;
      case 9:
        Stringer.drawString("f(x) = 0.5*x*(x-1)+ 1",173,80);
        break;
      case 10:
        Stringer.drawString("f(x) = 3*x*(x-2)+ 7",143,80);
        break;
      case 11:
        Stringer.drawString("f(x) = 2*x*(x-7)+ 20",168,80);
        break;
    }
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
    if(sh==-1){
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("При нажатии кнопки \"Обновить\" происходит смена варианта.",xSt,ySt);
    }
    if(sh>=0 && sh<5){
      g.setColor(new Color(0, 0, 80)); Stringer.fonts[0]=new Font("SansSerif", 1, 14);
      Stringer.fonts[1]=new Font("SansSerif", 1, 11);
      if(sh==0)
      {
        interval();
        if(language==0){
          Stringer.drawString("interval of uncertainty    L_{0} = [ a_{0} , b_{0} ] = [ "+a[0]+" , "+b[0]+" ]   ",xSt,ySt+20);
          Stringer.drawString("and let's assume \u2113 = "+l+" .",xSt,ySt+40);
          if (select==0){ Stringer.drawString("Let's construct function  f(x) = 2*x*(x-1)+ 5 , let's set initial ",xSt,ySt);}
          if (select==1){ Stringer.drawString("Let's construct function  f(x) = 5*x*(x+2)+ 6 , let's set initial ",xSt,ySt);}
          if (select==2){ Stringer.drawString("Let's construct function  f(x) = 2*x*(x+2) , let's set initial ",xSt,ySt);}
          if (select==3){ Stringer.drawString("Let's construct function  f(x) = x*(x-2)+ 2 , let's set initial ",xSt,ySt);}
          if (select==4){ Stringer.drawString("Let's construct function  f(x) = x*(x+2)+ 0.5 , let's set initial ",xSt,ySt);}
          if (select==5){ Stringer.drawString("Let's construct function  f(x) = x*(x-5)+ 6 , let's set initial ",xSt,ySt);}
          if (select==6){ Stringer.drawString("Let's construct function  f(x) = x*(x+4)- 1 , let's set initial ",xSt,ySt);}
          if (select==7){ Stringer.drawString("Let's construct function  f(x) = 2*x*(x-1)+ 1 , let's set initial ",xSt,ySt);}
          if (select==8){ Stringer.drawString("Let's construct function  f(x) = 0.5*x*(x-6)+ 5.5 , let's set initial ",xSt,ySt);}
          if (select==9){ Stringer.drawString("Let's construct function  f(x) = 0.5*x*(x-1)+ 1 , let's set initial ",xSt,ySt);}
          if (select==10){ Stringer.drawString("Let's construct function  f(x) = 3*x*(x-2)+ 7 , let's set initial ",xSt,ySt);}
          if (select==11){ Stringer.drawString("Let's construct function  f(x) = 2*x*(x-7)+ 20 , let's set initial ",xSt,ySt);}
        }
        else
        {
          Stringer.drawString("интервал неопределенности   L_{0} = [ a_{0} , b_{0} ] = [ "+a[0]+" , "+b[0]+" ]   и положим",xSt,ySt+20);
          Stringer.drawString("\u2113 = "+l+".",xSt,ySt+40);
          if (select==0){ Stringer.drawString("Построим функцию  f(x) = 2*x*(x-1) + 5, зададим начальный ",xSt+28,ySt);}
          if (select==1){ Stringer.drawString("Построим функцию  f(x) = 5*x*(x+2) + 6, зададим начальный ",xSt+28,ySt);}
          if (select==2){ Stringer.drawString("Построим функцию  f(x) = 2*x*(x+2), зададим начальный ",xSt+28,ySt);}
          if (select==3){ Stringer.drawString("Построим функцию  f(x) = x*(x-2) + 2, зададим начальный ",xSt+28,ySt);}
          if (select==4){ Stringer.drawString("Построим функцию  f(x) = x*(x+2) + 0.5, зададим начальный ",xSt+28,ySt);}
          if (select==5){ Stringer.drawString("Построим функцию  f(x) = x*(x-5) + 6, зададим начальный ",xSt+28,ySt);}
          if (select==6){ Stringer.drawString("Построим функцию  f(x) = x*(x+4) - 1, зададим начальный ",xSt+28,ySt);}
          if (select==7){ Stringer.drawString("Построим функцию  f(x) = 2*x*(x-1) + 1, зададим начальный ",xSt+28,ySt);}
          if (select==8){ Stringer.drawString("Построим функцию  f(x) = 0.5*x*(x-6) + 5.5, зададим начальный ",xSt+28,ySt);}
          if (select==9){ Stringer.drawString("Построим функцию  f(x) = 0.5*x*(x-1) + 1, зададим начальный ",xSt+28,ySt);}
          if (select==10){ Stringer.drawString("Построим функцию  f(x) = 3*x*(x-2) + 7, зададим начальный ",xSt+28,ySt);}
          if (select==11){ Stringer.drawString("Построим функцию  f(x) = 2*x*(x-7) + 20, зададим начальный ",xSt+28,ySt);}
        }
        ////////////////
        Stringer.fonts[0]=new Font("SansSerif", 1, 12);
        Stringer.fonts[1]=new Font("SansSerif", 1, 9);
        g.setColor(Color.red);
        Stringer.drawString("L_{0} = ["+a[0]+","+b[0]+"]",365,82);
        Stringer.drawString("\u2113 = "+l,365,132);
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
          Stringer.drawString(""+y[k],(int)(XN+otr*w+y[k]*w-Fm1.stringWidth(""+y[k])),YN+(all2-otr2)*w2+12);
        }
        if(f(y[k])<0)
        {
          for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y[k]))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
            g.drawLine((int)(otr*w+y[k]*w+XN),i,(int)(otr*w+y[k]*w+XN),i-6);
          Stringer.drawString("y_{"+k+"}",(int)(XN+otr*w+y[k]*w-13),YN+(all2-otr2)*w2-8);
          Stringer.drawString(""+y[k],(int)(XN+otr*w+y[k]*w-Fm1.stringWidth(""+y[k])),YN+(all2-otr2)*w2+12);
        }
        g.setColor(new Color(98, 0, 170));
        if(f(z[0])>=0)
        {
          for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z[k]))+1; i<YN+(all2-otr2)*w2-5; i=i+9)
            g.drawLine((int)(otr*w+z[k]*w+XN),i,(int)(otr*w+z[k]*w+XN),i+6);
          Stringer.drawString("z_{"+k+"}",(int)(XN+otr*w+z[k]*w+5),YN+(all2-otr2)*w2-8);
          Stringer.drawString(""+z[k],(int)(XN+otr*w+z[k]*w+2),YN+(all2-otr2)*w2+12);
        }
        if(f(z[k])<0)
        {
          for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z[k]))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
            g.drawLine((int)(otr*w+z[k]*w+XN),i,(int)(otr*w+z[k]*w+XN),i-6);
          Stringer.drawString("z_{"+k+"}",(int)(XN+otr*w+z[k]*w+5),YN+(all2-otr2)*w2-8);
          Stringer.drawString(""+z[k],(int)(XN+otr*w+z[k]*w+2),YN+(all2-otr2)*w2+12);
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
        if(slog==0){
          btnNext.setEnabled(false);
          if(AddRAnswer==false){ RightAnswer++; AddRAnswer=true;}
          Stringer.drawString("Вычисляем \u2206: ",xSt+28,ySt);
          if(b[k]>=0) Stringer.drawString("\u2206 = |a_{"+k+"} - b_{"+k+"}| = |"+a[k]+" - "+b[k]+"| = "+Math.round(Math.abs(a[k]-b[k])*1000)/1000.0,xSt+135,ySt);
          else Stringer.drawString("\u2206 = |a_{"+k+"} - b_{"+k+"}| = |"+a[k]+" - ("+b[k]+")| = "+Math.round(Math.abs(a[k]-b[k])*1000)/1000.0,xSt+135,ySt);
          jRadioButton1.setBounds(new Rectangle(13, ySt+10, 16, 20));
            jRadioButton1.setVisible(true);
            jRadioButton1.setEnabled(true);
            jRadioButton2.setBounds(new Rectangle(13, ySt+35, 16, 20));
            jRadioButton2.setVisible(true);
            jRadioButton2.setEnabled(true);
            g.setColor(Color.black); Stringer.fonts[0]=new Font("Dialog", 3, 13);
            Stringer.drawString("процесс поиска завершить",xSt+28,ySt+24);
            Stringer.drawString("переходим к следующей итерации",xSt+28,ySt+49);
            if((jRadioButton2.isSelected() && Math.abs(a[k]-b[k])>l) ||
               (jRadioButton1.isSelected() && Math.abs(a[k]-b[k])<=l)){
              g.setColor(Color.blue);  Stringer.fonts[0]=new Font("Dialog", 1, 14);
              Stringer.drawString("Правильно",xSt+200,ySt+75);
              btnNext.setEnabled(true);
              g.setColor(Color.lightGray); Stringer.fonts[0]=new Font("Dialog", 3, 13);
              if(jRadioButton2.isSelected()){
                jRadioButton1.setEnabled(false);
                Stringer.drawString("процесс поиска завершить",xSt+28,ySt+24);
              }
              if(jRadioButton1.isSelected()){
                jRadioButton2.setEnabled(false);
                Stringer.drawString("переходим к следующей итерации",xSt+28,ySt+49);
              }
            }
            if((jRadioButton1.isSelected() && Math.abs(b[k]-a[k])>l) ||
               (jRadioButton2.isSelected() && Math.abs(b[k]-a[k])<=l)){
              g.setColor(Color.red);  Stringer.fonts[0]=new Font("Dialog", 1, 14);
               if(jRadioButton1.isSelected()) Stringer.drawString("Неправильно, так как \u2206 > \u2113",xSt+143,ySt+75);
               if(jRadioButton2.isSelected()) Stringer.drawString("Неправильно, так как \u2206 \u2264 \u2113",xSt+143,ySt+75);
              if(entry==false){ Mist_knowledge[sh]++; entry=true;}
            }
        }
        else{
          Stringer.drawString("Вычислите \u2206: ",xSt+28,ySt);
          if(b[k]>=0) Stringer.drawString("\u2206 = |a_{"+k+"} - b_{"+k+"}| = |"+a[k]+" - "+b[k]+"| = ",xSt+135,ySt);
          else Stringer.drawString("\u2206 = |a_{"+k+"} - b_{"+k+"}| = |"+a[k]+" - ("+b[k]+")| = ",xSt+135,ySt);
          jTF1.setVisible(true);
          jTF1.setEnabled(true);
          if(b[k]>=0) jTF1.setBounds(new Rectangle(xSt+135+Fm.stringWidth("D = |a"+k+" - b"+k+"| = |"+a[k]+" - "+b[k]+"| = "), ySt-14, 45, 20));
          else jTF1.setBounds(new Rectangle(xSt+135+Fm.stringWidth("D = |a"+k+" - b"+k+"| = |"+a[k]+" - ("+b[k]+")| = "), ySt-14, 45, 20));
          btnNext.setEnabled(false);
          jButton1.setVisible(true);
          jButton1.setEnabled(true);
          jButton1.setLocation(xSt+180+Fm.stringWidth("D = |a"+k+" - b"+k+"| = |"+a[k]+" - ("+b[k]+")| = "), ySt+10);
          if(AddRAnswer==false){ RightAnswer+=2; AddRAnswer=true;}
          Stringer.fonts[0]=new Font("Dialog", 1, 14);
          if( Proverka == 1 ){
            g.setColor(Color.blue);
            Stringer.drawString("Правильно",xSt+185+Fm.stringWidth("D = |a"+k+" - b"+k+"| = |"+a[k]+" - ("+b[k]+")| = "),ySt);
            jButton1.setEnabled(false);
            jTF1.setEnabled(false);
            jRadioButton1.setBounds(new Rectangle(13, ySt+10, 16, 20));
            jRadioButton1.setVisible(true);
            jRadioButton1.setEnabled(true);
            jRadioButton2.setBounds(new Rectangle(13, ySt+35, 16, 20));
            jRadioButton2.setVisible(true);
            jRadioButton2.setEnabled(true);
            g.setColor(Color.black); Stringer.fonts[0]=new Font("Dialog", 3, 13);
            Stringer.drawString("процесс поиска завершить",xSt+28,ySt+24);
            Stringer.drawString("переходим к следующей итерации",xSt+28,ySt+49);
            if((jRadioButton2.isSelected() && Math.abs(a[k]-b[k])>l) ||
               (jRadioButton1.isSelected() && Math.abs(a[k]-b[k])<=l)){
              g.setColor(Color.blue);  Stringer.fonts[0]=new Font("Dialog", 1, 14);
              Stringer.drawString("Правильно",xSt+200,ySt+75);
              btnNext.setEnabled(true);
              g.setColor(Color.lightGray); Stringer.fonts[0]=new Font("Dialog", 3, 13);
              if(jRadioButton2.isSelected()){
                jRadioButton1.setEnabled(false);
                Stringer.drawString("процесс поиска завершить",xSt+28,ySt+24);
              }
              if(jRadioButton1.isSelected()){
                jRadioButton2.setEnabled(false);
                Stringer.drawString("переходим к следующей итерации",xSt+28,ySt+49);
              }
            }
            if((jRadioButton1.isSelected() && Math.abs(b[k]-a[k])>l) ||
               (jRadioButton2.isSelected() && Math.abs(b[k]-a[k])<=l)){
              g.setColor(Color.red);  Stringer.fonts[0]=new Font("Dialog", 1, 14);
               if(jRadioButton1.isSelected()) Stringer.drawString("Неправильно, так как \u2206 > \u2113",xSt+143,ySt+75);
               if(jRadioButton2.isSelected()) Stringer.drawString("Неправильно, так как \u2206 \u2264 \u2113",xSt+143,ySt+75);
              if(entry==false){ Mist_knowledge[sh]++; entry=true;}
            }
          }
          if( Proverka == 0 ){
            g.setColor(Color.red);
            Stringer.drawString("Неправильно",xSt+183+Fm.stringWidth("D = |a"+k+" - b"+k+"| = |"+a[k]+" - ("+b[k]+")| = "),ySt);
          }
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
          if(slog<2){
            Stringer.drawString("Вычисляем  y_{0} и z_{0}  по вышеприведенным формулам: ",xSt+28,ySt);
            String tmpSy="y_{0} = "+a[0]+" + 0.38196 * ("+b[0]+" - ", tmpSz="z_{0} = "+a[0]+" + ";
            if(a[0]>=0) tmpSy+=a[0]+") = "+y[0]+";";
            else tmpSy+="("+a[0]+")) = "+y[0]+";";
            if(b[0]>=0) tmpSz+=b[0]+" - ";
            else tmpSz+="("+b[0]+") - ";
            if(y[0]>=0) tmpSz+=y[0]+" = "+z[0]+",";
            else tmpSz+="("+y[0]+") = "+z[0]+",";
            Stringer.drawString(tmpSy,xSt+5,ySt+22);
            Stringer.drawString(tmpSz,xSt+5,ySt+44);
            Stringer.drawString("3 - \u221A5",xSt+10,ySt+65);
            Stringer.drawString("= 0.38196.",xSt+55,ySt+73);
            Stringer.drawString("2",xSt+22,ySt+83);
            g.drawLine(xSt+7,ySt+71,xSt+48,ySt+71);
            g.drawLine(xSt+7,ySt+70,xSt+48,ySt+70);
          }
          else{
            Stringer.drawString("Вычислите  y_{0} и z_{0}  по вышеприведенным формулам, где",xSt+28,ySt);
            Stringer.drawString("y_{0} = ",xSt+155,ySt+28);
            Stringer.drawString("z_{0} = ",xSt+270,ySt+28);
            Stringer.drawString("3 - \u221A5",xSt+5,ySt+20);
            Stringer.drawString("= 0.38196:",xSt+50,ySt+28);
            Stringer.drawString("2",xSt+17,ySt+38);
            g.drawLine(xSt+2,ySt+26,xSt+43,ySt+26);
            g.drawLine(xSt+2,ySt+25,xSt+43,ySt+25);
            if(Proverka==-1){
              jTF1.setEnabled(true);
              jTF3.setEnabled(true);
            }
            jTF1.setVisible(true);
            jTF3.setVisible(true);
            jTF1.setBounds(new Rectangle(xSt+185, ySt+14, 45, 20));
            jTF3.setBounds(new Rectangle(xSt+300, ySt+14, 45, 20));
            btnNext.setEnabled(false);
            jButton1.setVisible(true);
            jButton1.setEnabled(true);
            jButton1.setLocation(xSt+390, ySt+14);
            if(AddRAnswer==false){ RightAnswer+=2; AddRAnswer=true;}
            Stringer.fonts[0]=new Font("Dialog", 1, 14);
            if( Proverka == 1 ){
              g.setColor(Color.blue);
              Stringer.drawString("Правильно",xSt+200,ySt+65);
              jButton1.setEnabled(false);
              btnNext.setEnabled(true);
            }
            if( Proverka == 0 ){
              g.setColor(Color.red);
              String ss=" Неправильно, пересчитайте ";
              int t=0;
              if(jTF1.isEnabled()==true) ss+="y_{0}";
              if(jTF1.isEnabled()==true && jTF3.isEnabled()==true){ ss+=" и "; t=4;}
              if(jTF3.isEnabled()==true) ss+="z_{0}";
              Stringer.drawString(ss,xSt+249-Fm.stringWidth(ss.substring(t))/2,ySt+65);
            }
          }
          ////////////
          g.setColor(Color.red);
          Stringer.fonts[0]=new Font("SansSerif", 1, 12);
          Stringer.fonts[1]=new Font("SansSerif", 1, 10);
          Stringer.fonts[1]=new Font("SansSerif", 1, 10);
          Stringer.drawString("y_{0} = a_{0 }+               (b_{0 }- a_{0})",375,242);
          Stringer.drawString("3 - \u221A5",429,231);
          Stringer.drawString("2",441,249);
          g.drawLine(426,237,462,237);
          g.drawLine(426,236,462,236);
          Stringer.drawString("z_{0} = a_{0} + b_{0} - y_{0}",398,269);
          Stringer.fonts[0]=new Font("SansSerif", 1, 14);
          Stringer.fonts[1]=new Font("SansSerif", 1, 11);
          g.setColor(Color.red);
          g.drawLine(351,207,370,226);
          g.drawLine(351,208,370,227);
               ///-----1------
          g.drawLine(361,227,370,227);
          g.drawLine(361,226,370,226);
          g.drawLine(365,225,370,225);
               ///-----2------
          g.drawLine(370,217,370,227);
          g.drawLine(369,219,369,227);
          g.drawLine(368,222,368,227);
          ///////////
        }
      }
      else if(sh==2) Stringer.drawString("Положим k = k + 1 = "+k+".",xSt+28,ySt);
      if(((sh>2 && k>0) || k==0) && sh<4)
      {
        Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
        Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
        if(k!=0 || (k==0 && jTF1.isEnabled()==false && slog==2) || slog!=2){
          g.setColor(new Color(0, 120, 0));
          if(f(y[k])>=0)
          {
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y[k]))+1; i<YN+(all2-otr2)*w2-5; i=i+9)
              g.drawLine((int)(otr*w+y[k]*w+XN),i,(int)(otr*w+y[k]*w+XN),i+6);
            Stringer.drawString("y_{"+k+"}",(int)(XN+otr*w+y[k]*w-13),YN+(all2-otr2)*w2-8);
            Stringer.drawString(""+y[k],(int)(XN+otr*w+y[k]*w-Fm1.stringWidth(""+y[k])),YN+(all2-otr2)*w2+12);
          }
          if(f(y[k])<0)
          {
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y[k]))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
              g.drawLine((int)(otr*w+y[k]*w+XN),i,(int)(otr*w+y[k]*w+XN),i-6);
            Stringer.drawString("y_{"+k+"}",(int)(XN+otr*w+y[k]*w-13),YN+(all2-otr2)*w2-8);
            Stringer.drawString(""+y[k],(int)(XN+otr*w+y[k]*w-Fm1.stringWidth(""+y[k])),YN+(all2-otr2)*w2+12);
          }
          g.fillOval((int)(otr*w+y[k]*w+XN-3),YN+(all2-otr2)*w2-3,6,6);
        }
        if(k!=0 || (k==0 && jTF3.isEnabled()==false && slog==2) || slog!=2){
          g.setColor(new Color(98, 0, 170));
          if(f(z[0])>=0)
          {
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z[k]))+1; i<YN+(all2-otr2)*w2-5; i=i+9)
              g.drawLine((int)(otr*w+z[k]*w+XN),i,(int)(otr*w+z[k]*w+XN),i+6);
            Stringer.drawString("z_{"+k+"}",(int)(XN+otr*w+z[k]*w+5),YN+(all2-otr2)*w2-8);
            Stringer.drawString(""+z[k],(int)(XN+otr*w+z[k]*w+2),YN+(all2-otr2)*w2+12);
          }
          if(f(z[k])<0)
          {
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z[k]))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
              g.drawLine((int)(otr*w+z[k]*w+XN),i,(int)(otr*w+z[k]*w+XN),i-6);
            Stringer.drawString("z_{"+k+"}",(int)(XN+otr*w+z[k]*w+5),YN+(all2-otr2)*w2-8);
            Stringer.drawString(""+z[k],(int)(XN+otr*w+z[k]*w+2),YN+(all2-otr2)*w2+12);
          }
          g.fillOval((int)(otr*w+z[k]*w+XN-3),YN+(all2-otr2)*w2-3,6,6);
        }
        Stringer.fonts[0]=new Font("SansSerif", 1, 14);
        Stringer.fonts[1]=new Font("SansSerif", 1, 11);
      }
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
        if(select!=1 && select!=4 && select!=2 && select!=6) Stringer.drawString(""+(Math.round(f(y[k])*1000))/1000.0,XN+otr*w-30,(int)(YN+(all2-otr2)*w2-f(y[k])*w2)+7);
        else Stringer.drawString(""+(Math.round(f(y[k])*1000))/1000.0,XN+otr*w+5,(int)(YN+(all2-otr2)*w2-f(y[k])*w2)+7);
      }
      else{
        if(select!=1 && select!=4 && select!=2 && select!=6) Stringer.drawString(""+(Math.round(f(y[k])*1000))/1000.0,XN+otr*w-30,(int)(YN+(all2-otr2)*w2-f(y[k])*w2)-3);
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
        if(select!=1 && select!=4 && select!=2 && select!=6) Stringer.drawString(""+(Math.round(f(z[k])*1000))/1000.0,XN+otr*w-30,(int)(YN+(all2-otr2)*w2-f(z[k])*w2)-3);
        else Stringer.drawString(""+(Math.round(f(z[k])*1000))/1000.0,XN+otr*w+5,(int)(YN+(all2-otr2)*w2-f(z[k])*w2)-3);
      }
      else{
        if(select!=1 && select!=4 && select!=2 && select!=6) Stringer.drawString(""+(Math.round(f(z[k])*1000))/1000.0,XN+otr*w-30,(int)(YN+(all2-otr2)*w2-f(z[k])*w2)+7);
        else if(select!=1) Stringer.drawString(""+(Math.round(f(z[k])*1000))/1000.0,XN+otr*w+5,(int)(YN+(all2-otr2)*w2-f(z[k])*w2)+7);
             else Stringer.drawString(""+(Math.round(f(z[k])*1000))/1000.0,XN+otr*w+5,(int)(YN+(all2-otr2)*w2-f(z[k])*w2)+2);
      }
      Stringer.fonts[0]=new Font("SansSerif", 1, 14);
      Stringer.fonts[1]=new Font("SansSerif", 1, 11);
    }

    if (sh>=4){
      g.setColor(new Color(0, 0, 80));  Stringer.fonts[0]=new Font("SansSerif", 1, 14);
      if(sh==4){
        btnNext.setEnabled(false);
        jRadioButton1.setLocation(xSt+237,ySt+7);
        jRadioButton1.setVisible(true);
        jRadioButton1.setEnabled(true);
        jRadioButton2.setLocation(xSt+237,ySt+27);
        jRadioButton2.setVisible(true);
        jRadioButton2.setEnabled(true);
        if(AddRAnswer==false){ RightAnswer++; AddRAnswer=true;}
        Stringer.drawString("Сравним f( y_{"+k+"} ) и f( z_{"+k+"} ):",xSt+28,ySt);
        if((Math.round(f(y[k])*1000))/1000.0<=(Math.round(f(z[k])*1000))/1000.0)
          Stringer.drawString("f( y_{"+k+"} ) \u2264 f( z_{"+k+"} ), тогда новым интервалом",xSt+195,ySt);
        else Stringer.drawString("f( y_{"+k+"} ) > f( z_{"+k+"} ), тогда новым интервалом",xSt+195,ySt);
        Stringer.drawString("неопределенности [a_{"+(k+1)+"}, b_{"+(k+1)+"}] будет",xSt,ySt+20);
        g.setColor(Color.black);  Stringer.fonts[0]=new Font("Dialog", 1, 13);
        Stringer.drawString("[a_{"+k+"}, z_{"+k+"}]", xSt+254 ,ySt+20);
        Stringer.drawString("[y_{"+k+"}, b_{"+k+"}]", xSt+254, ySt+40);
        Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
        Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
        g.setColor(new Color(0, 120, 0));
        g.fillOval((int)(otr*w+y[k]*w+XN-3),YN+(all2-otr2)*w2-3,6,6);
        Stringer.drawString(""+y[k],(int)(XN+otr*w+y[k]*w-Fm1.stringWidth(""+y[k])),YN+(all2-otr2)*w2+12);
        g.setColor(new Color(98, 0, 170));
        g.fillOval((int)(otr*w+z[k]*w+XN-3),YN+(all2-otr2)*w2-3,6,6);
        Stringer.drawString(""+z[k],(int)(XN+otr*w+z[k]*w+2),YN+(all2-otr2)*w2+12);
        Stringer.fonts[0]=new Font("SansSerif", 1, 14);
        Stringer.fonts[1]=new Font("SansSerif", 1, 11);
        g.setColor(new Color(0, 0, 80));
        if((!jRadioButton1.isSelected() && !jRadioButton2.isSelected()) ||
           (jRadioButton1.isSelected()==true && (Math.round(f(y[k])*1000))/1000.0>(Math.round(f(z[k])*1000))/1000.0) ||
           (jRadioButton2.isSelected()==true && (Math.round(f(y[k])*1000))/1000.0<=(Math.round(f(z[k])*1000))/1000.0)
          )
        {
          Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
          Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
          g.setColor(new Color(0, 0, 130));
          Stringer.drawString("a_{"+k+"}",(int)(XN+otr*w+a[k]*w-13),YN+(all2-otr2)*w2-8);
          Stringer.drawString("b_{"+k+"}",(int)(XN+otr*w+b[k]*w+5),YN+(all2-otr2)*w2-8);
          g.setColor(new Color(0, 120, 0));
          if(f(y[k])>=0)
          {
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y[k]))+1; i<YN+(all2-otr2)*w2-5; i=i+9)
              g.drawLine((int)(otr*w+y[k]*w+XN),i,(int)(otr*w+y[k]*w+XN),i+6);
            Stringer.drawString("y_{"+k+"}",(int)(XN+otr*w+y[k]*w-13),YN+(all2-otr2)*w2-8);
          }
          if(f(y[k])<0)
          {
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y[k]))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
              g.drawLine((int)(otr*w+y[k]*w+XN),i,(int)(otr*w+y[k]*w+XN),i-6);
            Stringer.drawString("y_{"+k+"}",(int)(XN+otr*w+y[k]*w-13),YN+(all2-otr2)*w2-8);
          }
          g.setColor(new Color(98, 0, 170));
          if(f(z[k])>=0)
          {
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z[k]))+1; i<YN+(all2-otr2)*w2-5; i=i+9)
              g.drawLine((int)(otr*w+z[k]*w+XN),i,(int)(otr*w+z[k]*w+XN),i+6);
            Stringer.drawString("z_{"+k+"}",(int)(XN+otr*w+z[k]*w+5),YN+(all2-otr2)*w2-8);
          }
          if(f(z[k])<0)
          {
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z[k]))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
              g.drawLine((int)(otr*w+z[k]*w+XN),i,(int)(otr*w+z[k]*w+XN),i-6);
            Stringer.drawString("z_{"+k+"}",(int)(XN+otr*w+z[k]*w+5),YN+(all2-otr2)*w2-8);
          }
          Stringer.fonts[0]=new Font("SansSerif", 1, 14);
          Stringer.fonts[1]=new Font("SansSerif", 1, 11);
        }
        if((jRadioButton1.isSelected()==true && (Math.round(f(y[k])*1000))/1000.0>(Math.round(f(z[k])*1000))/1000.0) ||
           (jRadioButton2.isSelected()==true && (Math.round(f(y[k])*1000))/1000.0<=(Math.round(f(z[k])*1000))/1000.0)){
          g.setColor(Color.red); Stringer.fonts[0]=new Font("Dialog", 1, 14);
          if(language==0) Stringer.drawString("Incorrectly",xSt+300,ySt+40);
          else Stringer.drawString("Неправильно",xSt+305,ySt+30);
          Stringer.fonts[0]=new Font("SansSerif", 1, 14);
          if(entry==false){ Mist_under[sh]++; entry=true;}
        }
        if((jRadioButton1.isSelected()==true && (Math.round(f(y[k])*1000))/1000.0<=(Math.round(f(z[k])*1000))/1000.0) ||
           (jRadioButton2.isSelected()==true && (Math.round(f(y[k])*1000))/1000.0>(Math.round(f(z[k])*1000))/1000.0))
        {
          g.setColor(Color.lightGray);  Stringer.fonts[0]=new Font("Dialog", 1, 13);
          if(jRadioButton2.isSelected()==true){
            jRadioButton1.setEnabled(false);
            Stringer.drawString("[a_{"+k+"}, z_{"+k+"}]", xSt+254 ,ySt+20);
          }
          if(jRadioButton1.isSelected()==true){
            jRadioButton2.setEnabled(false);
            Stringer.drawString("[y_{"+k+"}, b_{"+k+"}]", xSt+254, ySt+40);
          }
          g.setColor(Color.blue); Stringer.fonts[0]=new Font("Dialog", 1, 14);
          if(language==0) Stringer.drawString("Correctly",xSt+300,ySt+40);
          else Stringer.drawString("Правильно",xSt+305,ySt+30);
        //--------------
          if(jRadioButton1.isSelected()==true){
            a[k+1]=a[k];
            b[k+1]=z[k];
            y[k+1]=Math.round((a[k+1]+b[k+1]-y[k])*1000)/1000.0;
            z[k+1]=y[k];
            g.setColor(new Color(0, 0, 80));  Stringer.fonts[0]=new Font("SansSerif", 1, 14);
            Stringer.drawString("Положим a_{"+(k+1)+"} = a_{"+k+"} = "+a[k]+",   b_{"+(k+1)+"} = z_{"+k+"} = "+z[k]+"   и   y_{"+(k+1)+"} = a_{"+(k+1)+"} + b_{"+(k+1)+"} - y_{"+k+"} = "+Math.round((a[k+1]+b[k+1]-y[k])*1000)/1000.0+",", xSt, ySt+60);
            Stringer.drawString("z_{"+(k+1)+"} = y_{"+k+"} = "+y[k], xSt, ySt+80);
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
          else if(jRadioButton2.isSelected()==true){
            a[k+1]=y[k];
            b[k+1]=b[k];
            y[k+1]=z[k];
            z[k+1]=Math.round((a[k+1]+b[k+1]-z[k])*1000)/1000.0;
            g.setColor(new Color(0, 0, 80));  Stringer.fonts[0]=new Font("SansSerif", 1, 14);
            Stringer.drawString("Положим a_{"+(k+1)+"} = y_{"+k+"} = "+y[k]+",   b_{"+(k+1)+"} = b_{"+k+"} = "+b[k]+"   и   y_{"+(k+1)+"} = z_{"+k+"} = "+z[k]+",", xSt, ySt+60);
            Stringer.drawString("z_{"+(k+1)+"} = a_{"+(k+1)+"} + b_{"+(k+1)+"} - z_{"+k+"} = "+Math.round((a[k+1]+b[k+1]-z[k])*1000)/1000.0, xSt, ySt+80);
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
          Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
          Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
          g.setColor(new Color(0, 0, 250));
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
          g.drawLine((int)(XN+otr*w+a[k+1]*w),YN+w2*(all2-otr2),(int)(XN+otr*w+b[k+1]*w),YN+w2*(all2-otr2));
          g.drawLine((int)(XN+otr*w+a[k+1]*w),YN+w2*(all2-otr2)+1,(int)(XN+otr*w+b[k+1]*w),YN+w2*(all2-otr2)+1);
          Stringer.fonts[0]=new Font("SansSerif", 1, 14);
          Stringer.fonts[1]=new Font("SansSerif", 1, 11);
          Stringer.drawString("[",(int)(XN+otr*w+a[k+1]*w-2),YN+(all2-otr2)*w2+4);
          Stringer.drawString("]",(int)(XN+otr*w+b[k+1]*w-2),YN+(all2-otr2)*w2+4);
          btnNext.setEnabled(true);
        }
      }
    }

    if(sh==5){
      g.setFont(new java.awt.Font("Dialog", 1, 14));
      g.setColor(new Color(0, 0, 80));
      g.setColor(Color.red);
      Stringer.fonts[0]=new Font("SansSerif", 1, 12);
      Stringer.fonts[1]=new Font("SansSerif", 1, 10);
      Stringer.drawString("x^{*} \u2248",390,306);
      Stringer.drawString("( a_{k+1} + b_{k+1} )",417,293);
      Stringer.drawString("2",452,313);
      g.drawLine(416,300,493,300);
      g.drawLine(416,301,493,301);
      Stringer.fonts[0]=new Font("SansSerif", 1, 14);
      Stringer.fonts[1]=new Font("SansSerif", 1, 11);
      g.setColor(Color.red);
      g.drawLine(356,277,375,296);
      g.drawLine(356,278,375,297);
           ///-----1------
      g.drawLine(366,297,375,297);
      g.drawLine(366,296,375,296);
      g.drawLine(370,295,375,295);
           ///-----2------
      g.drawLine(375,287,375,297);
      g.drawLine(374,289,374,297);
      g.drawLine(373,292,373,297);
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
      jCheckBoxRezult.setBounds(new Rectangle(xSt+175, ySt+62, 150, 23));
      jCheckBoxRezult.setVisible(true);  jCheckBoxRezult.setEnabled(true);
      g.setColor(Color.black);
      g.drawLine(xSt+159,ySt+55,xSt+319,ySt+55);
      g.drawLine(xSt+159,ySt+56,xSt+319,ySt+56);
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
        for(int i=0; i<50; i++){
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
    jRadioButton.setSelected(true);
    jRadioButton1.setVisible(false); jRadioButton1.setEnabled(false);
    jRadioButton2.setVisible(false); jRadioButton2.setEnabled(false);
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
    btnNext.setNextFocusableComponent(jButton1);
  }

  void btnNew_actionPerformed(ActionEvent e) {
    btnNext.setVisible(true); btnNext.setEnabled(true);
    jRadioButton.setSelected(true);
    jRadioButton1.setVisible(false); jRadioButton1.setEnabled(false);
    jRadioButton2.setVisible(false); jRadioButton2.setEnabled(false);
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
    jTF2.setVisible(true);
    Proverka = -1;
    RightAnswer=0;
    AddRAnswer=false;
    entry=false;
    sh=-1;
    for (int j=0;j<30;j++){
      a[j]=0; b[j]=0;
      y[j]=0; z[j]=0;
    }
    k=0; num=-1;
    for(int i=0; i<50; i++){
      Mist_calk[i]=0;
      Mist_under[i]=0;
      Mist_knowledge[i]=0;
      Mist_use[i]=0;
    }
    if(Variant[12]!=12)
    {
      for(int i=0; i<=(12-Variant[12]); i++)
        if(select==Variant[i])
        {
          Variant[i]=Variant[12-Variant[12]];
          Variant[12-Variant[12]]=select;
        }
      select=Variant[(int)(Math.random()*(12-Variant[12]))];
      Variant[12]++;
    }
    else
    {
      for(int i=0; i<12; i++)
        Variant[i]=i;
      Variant[12]=1;
      select=(int)(Math.random()*12);
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
      jPanel1.repaint();
    }
    else if(sh==1 && jTF1.isEnabled()==true && jTF1.getText().equals("")==true){
      Proverka = 0;
      jTF1.setForeground(Color.red);
      jPanel1.repaint();
    }
    if(sh==2){
       Proverka = 1;
       if(jTF1.isEnabled()==true && jTF1.getText().equals("")!=true){
        try{
          if(Math.round(y[0]*1000)/1000.0 == Double.parseDouble(jTF1.getText()) ){
            jTF1.setDisabledTextColor(Color.blue);
            jTF1.setEnabled(false);
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
      else if(jTF1.isEnabled()==true && jTF1.getText().equals("")==true){
        Proverka = 0;
        jTF1.setForeground(Color.red);
      }
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
      jPanel1.repaint();
    }
  }

  void jPanel1_mouseClicked(MouseEvent e){
    if(sh==5 && e.getX()>=458 && e.getX()<=473 && e.getY()>=103 && e.getY()<=118){
      jCheckBoxRezult.setSelected(false);
      Ch=false;
      jPanel1.repaint();
    }
  }

  void jCheckBoxRezult_stateChanged(ChangeEvent e) {
    if(jCheckBoxRezult.isSelected()==true && sh==5){ Ch=true; jTF2.setVisible(false);}
    else{ Ch=false; jTF2.setVisible(true);}
    jPanel1.repaint();
    jCheckBoxRezult.setOpaque(true);
  }

  void jRadioButton1_itemStateChanged(ItemEvent e) {
    jPanel1.repaint();
  }
  void jRadioButton2_itemStateChanged(ItemEvent e) {
    jPanel1.repaint();
  }
  void jTF1_inputMethodTextChanged(InputMethodEvent e) {
    jTF1.setForeground(new Color(0, 0, 80));
  }
  void jTF3_inputMethodTextChanged(InputMethodEvent e) {
    jTF3.setForeground(new Color(0, 0, 80));
  }
  void Plus_actionPerformed(ActionEvent e) {
    if(l<1.5){
      l=Math.round(l*10+1)/10.0;
      jTF2.setText(""+l);
      jPanel1.repaint();
    }
  }
  void Minus_actionPerformed(ActionEvent e) {
    if(l>0.3)
    {
      l=Math.round(l*10-1)/10.0;
      jTF2.setText(""+l);
      jPanel1.repaint();
    }
  }
}