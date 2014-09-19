import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.event.*;

public class AppUprDihotomia extends JApplet {
  Panel_mypaint jPanel1 = new Panel_mypaint();
  JLabel jLabel1 = new JLabel();
  JButton btnNext = new JButton();
  JButton btnNew = new JButton();
  JButton jButton1 = new JButton();
  JCheckBox jCheckBoxRezult = new JCheckBox();
  JRadioButton jRadioButton = new JRadioButton();
  JRadioButton jRadioButton1 = new JRadioButton();
  JRadioButton jRadioButton2 = new JRadioButton();
  ButtonGroup buttonGroup1 = new ButtonGroup();
  JTextField jTF1 = new JTextField();
  public int sh=-1, k=0, num=-1, slog=2, select=(int)(Math.random()*12), x1=330, y1=70, y2=290, x2=10,
            Variant[]={0,1,2,3,4,5,6,7,8,9,10,11,1}, XN=2, YN=67,
            w=50, //количество пикселов в 1 делении (на графике) x1
            all=13, //количество делений (всего) на графике x1
            otr=3, //количество делений (с отрицательным знаком) на графике x1
            ost=0,
            w2=25, //количество пикселов в 1 делении (на графике) x2
            all2=10, //количество делений (всего) на графике x2
            otr2=3, //количество делений (с отрицательным знаком) на графике x2
            ost2=0;
  public double y=0, z=0, E=0.3, l=0.5, scale=1.0;
  double [] a = new double[30];
  double [] b = new double[30];
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
    this.setSize(new Dimension(530, 472));
    jPanel1.setBackground(new Color(247, 247, 255));
    jPanel1.setBounds(new Rectangle(10, 0, 510, 431));
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
    btnNext.setBounds(new Rectangle(270,440, 100, 23));
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
    btnNew.setBounds(new Rectangle(140,440, 100, 23));
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
    this.getContentPane().add(btnNew,null);
    this.getContentPane().add(btnNext,null);
    this.jPanel1.add(jButton1,null);
    this.jPanel1.add(jCheckBoxRezult, null);
    this.jPanel1.add(jRadioButton, null);
    this.jPanel1.add(jRadioButton1, null);
    this.jPanel1.add(jRadioButton2, null);
    Proverka=-1;
  }

  public double roundC(double x) {       // округление до 3-его знака после ,
    return Math.round(x*Math.pow(10, 3))/Math.pow(10, 3);
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
    FontMetrics Fm1=g.getFontMetrics(new Font("SansSerif", 1, 11));
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
       Stringer.drawString("To find a minimum of function f(x) by method dihotomia",78,40);
     }
     else{
       g.setColor(new Color(180, 0, 80));
       Stringer.fonts[0]=new Font("SansSerif", 3, 13);
       Stringer.drawString("Задача: ",44,40);
       Stringer.drawString("Графическая иллюстрация:",10,63);
       Stringer.drawString("Величины:",368,63);
       Stringer.drawString("Формулы:  ",368,189);
       Stringer.drawString("Решение:  "+select,10,336);
       g.setColor(new Color(0, 0, 80));
        Stringer.fonts[0]=new Font("SansSerif", 1, 14);
       Stringer.drawString("Найти минимум функции f(x) методом дихотомии",101,40);
     }
    // Stringer.drawString(""+select,1,15); ///////////////////
   // Stringer.drawString(""+Math.round(198.6),1,15);
     g.setColor(new Color(255, 255, 255));
     g.fillRect(2,67,338,253);g.fillRect(360,67,145,106);g.fillRect(360,193,145,127);g.fillRect(2,340,505,90);
     g.setColor(new Color(157, 187, 255));
     g.drawRect(2,67,338,253);  g.drawRect(360,67,145,106);g.drawRect(360,193,145,127);g.drawRect(2,340,505,90);

     /*nach. velichini*/g.setColor(new Color(0, 0, 80));
     interval();
     Stringer.fonts[0]=new Font("SansSerif", 1, 12);
     Stringer.fonts[1]=new Font("SansSerif", 1, 9);
     if(language==0){
       Stringer.drawString("L_{0} = ["+a[0]+","+b[0]+"] - interval",365,85);
       Stringer.drawString("uncertainty",385,105);
       Stringer.drawString("\u03BE = "+E,365,125);
        Stringer.drawString("- small number ",416,125);
       Stringer.drawString("\u2113 = "+l,365,145);
       Stringer.drawString("- accuracy",416,145);
     }
     else{
       Stringer.drawString("L_{0} = ["+a[0]+","+b[0]+"] - интервал",365,85);
       Stringer.drawString("неопределенности",391,105);
       Stringer.drawString("\u03BE = "+E+"  - малое число",365,125);
    //  Stringer.drawString("- малое число",412,125);
       Stringer.drawString("\u2113 = "+l+"  - точность",365,145);
       //Stringer.drawString("- точность",412,145);
       if(sh>0) Stringer.drawString("k = "+k+"  - номер итерации",365,165);
       else Stringer.drawString("k  - номер итерации",365,165);
    //   Stringer.drawString("- номер итерации",406,165);
     }

    /*formula*/
    Stringer.fonts[1]=new Font("SansSerif", 1, 10);
    Stringer.drawString("y_{k} =",385,225);
    Stringer.drawString("( a_{k} + b_{k} - \u03BE )",413,212);
    Stringer.drawString("2",446,232);
    g.drawLine(412,220,482,220);
    g.drawLine(412,219,482,219);

    Stringer.drawString("z_{k} =",385,265);
    Stringer.drawString("( a_{k} + b_{k} + \u03BE )",413,252);
    Stringer.drawString("2",446,272);
    g.drawLine(412,260,482,260);
    g.drawLine(412,259,482,259);

    Stringer.drawString("x^{*} \u2248",380,305);
    Stringer.drawString("( a_{k+1} + b_{k+1} )",407,292);
    Stringer.drawString("2",440,312);
    g.drawLine(406,300,483,300);
    g.drawLine(406,299,483,299);

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
      Stringer.drawString(""+(num-1)/7+"."+(((num-1) % 7+1)+"."),xSt,ySt);
    }
    Stringer.fonts[0]=new Font("SansSerif", 1, 14);
    if(sh==-1){
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("При нажатии кнопки \"Обновить\" происходит смена варианта.",xSt,ySt);
    }
    if(sh>=0 && sh<7){
      g.setColor(new Color(0, 0, 80)); Stringer.fonts[0]=new Font("SansSerif", 1, 14);
      Stringer.fonts[1]=new Font("SansSerif", 1, 11);
      if(sh==0)
      {
        interval();
        if(language==0){
          Stringer.drawString("interval of uncertainty    L_{0} = [ a_{0} , b_{0} ] = [ "+a[0]+" , "+b[0]+" ]   ",xSt,ySt+20);
          Stringer.drawString("and let's assume  \u03BE = "+E+" ; \u2113 = "+l+" .",xSt,ySt+40);
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
          Stringer.drawString("\u03BE = "+E+" ; \u2113 = "+l+".",xSt,ySt+40);
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
        Stringer.drawString("L_{0} = ["+a[0]+","+b[0]+"]",365,85);
        Stringer.drawString("\u03BE = 0.3",365,125);
        Stringer.drawString("\u2113 = "+l,365,145);
        Stringer.drawString("k",365,165);
        ////////////////
      }
      Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
      Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
      if (sh>=0 && sh<=6){
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
        if(sh<6)
        {
          Stringer.drawString("a_{"+k+"}",(int)(XN+otr*w+a[k]*w-13),YN+(all2-otr2)*w2-6);
          Stringer.drawString("b_{"+k+"}",(int)(XN+otr*w+b[k]*w+5),YN+(all2-otr2)*w2-6);
        }
        g.drawLine((int)(XN+otr*w+a[k]*w),YN+(all2-otr2)*w2,(int)(XN+otr*w+b[k]*w),YN+(all2-otr2)*w2);
        g.drawLine((int)(XN+otr*w+a[k]*w),YN+(all2-otr2)*w2+1,(int)(XN+otr*w+b[k]*w),YN+(all2-otr2)*w2+1);
        Stringer.fonts[0]=new Font("SansSerif", 1, 14);
        Stringer.drawString("[",(int)(XN+otr*w+a[k]*w-2),YN+(all2-otr2)*w2+4);
        Stringer.drawString("]",(int)(XN+otr*w+b[k]*w-2),YN+(all2-otr2)*w2+4);
      }
      Stringer.fonts[0]=new Font("SansSerif", 1, 14);
      Stringer.fonts[1]=new Font("SansSerif", 1, 11);
    }
    Stringer.fonts[0] = new Font("SansSerif", 1, 14);
    if(sh==1){
      g.setColor(new Color(0, 0, 80));
      if(language==0) Stringer.drawString("Let's assume k = 0 ;",xSt+28,ySt);
      else Stringer.drawString("Положим k = 0.",xSt+28,ySt);
    }
    if (sh>=2 && sh<7){
      g.setColor(new Color(0, 0, 80));
      y=(Math.round((a[k]+b[k]-E)*1000/2.0))/1000.0;
      if (sh==2){
        if(slog==2)
        {
          btnNext.setEnabled(false);
          jButton1.setVisible(true);
          jButton1.setEnabled(true);
          jButton1.setLocation(375, 400);
          if(AddRAnswer==false){ RightAnswer++; AddRAnswer=true;}
          if(language==0){
            g.setColor(new Color(0, 0, 80));
            jTF1.setVisible(true);
            jTF1.setEnabled(true);
            if(b[k]>=0)
              jTF1.setBounds(new Rectangle(xSt+155+Fm.stringWidth("( "+a[k]+" + "+b[k]+" - "+E+")"), 380, 45, 20));
            else
              jTF1.setBounds(new Rectangle(xSt+155+Fm.stringWidth("( "+a[k]+" + ( "+b[k]+" ) - "+E+")"), 380, 45, 20));
            Stringer.drawString("We calculate    y_{k}  under the above-stated formula: ",xSt+28,ySt);
            if ( Proverka == 1 ){
              g.setColor(Color.blue); Stringer.fonts[0] = new Font("Dialog", 1, 14);
              Stringer.drawString("Correctly",xSt+370,ySt+30);
              btnNext.setEnabled(true);
              jTF1.setEnabled(false);
              jButton1.setEnabled(false);
            }
            if ( Proverka == 0 ){
              g.setColor(Color.red); Stringer.fonts[0] = new Font("Dialog", 1, 14);
              Stringer.drawString("Incorrectly",xSt+370,ySt+30);
            }
          }
          else{
            g.setColor(new Color(0, 0, 80)); Stringer.fonts[0] = new Font("SansSerif", 1, 14);
            jTF1.setVisible(true);
            jTF1.setEnabled(true);
            if(b[k]>=0)
              jTF1.setBounds(new Rectangle(xSt+155+Fm.stringWidth("( "+a[k]+" + "+b[k]+" - "+E+")"), 380, 45, 20));
            else
              jTF1.setBounds(new Rectangle(xSt+155+Fm.stringWidth("( "+a[k]+" + ( "+b[k]+" ) - "+E+")"), 380, 45, 20));
            Stringer.drawString("Вычислите  y_{k}  по вышеприведенной формуле: ",xSt+28,ySt);
            Stringer.fonts[0]=new Font("Dialog", 0, 11);
            Stringer.drawString("Вычислeния поизводятся с точностью до трех знаков после запятой.",xSt+5,ySt+65);
            Stringer.fonts[0] = new Font("SansSerif", 1, 14);
            if ( Proverka == 1 ){
              g.setColor(Color.blue); Stringer.fonts[0]=new Font("Dialog", 1, 14);
              Stringer.drawString("Правильно",xSt+370,ySt+30);
              btnNext.setEnabled(true);
              jTF1.setEnabled(false);
              jButton1.setEnabled(false);
            }
            if ( Proverka == 0 ){
              g.setColor(Color.red); Stringer.fonts[0]=new Font("Dialog", 1, 14);
              Stringer.drawString("Неправильно",xSt+370,ySt+30);
            }
          }
        }
        else
        {
          g.setColor(new Color(0, 0, 80)); Stringer.fonts[0] = new Font("SansSerif", 1, 14);
          if(language==0) Stringer.drawString("We calculate    y_{k}  under the above-stated formula: ",xSt,ySt);
          else Stringer.drawString("Вычисляем   y_{k}  по вышеприведенной формуле: ",xSt+28,ySt);
          Proverka=1;
        }
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("y_{"+k+"} =",xSt+5,ySt+35);
        Stringer.drawString("( a_{"+k+"} + b_{"+k+"} - \u03BE )",xSt+35,ySt+20);
        Stringer.drawString("2",xSt+72,ySt+40);
        g.drawLine(xSt+35,ySt+27,xSt+116,ySt+27);
        g.drawLine(xSt+35,ySt+28,xSt+116,ySt+28);
        Stringer.drawString("=",xSt+123,ySt+35);
        if(b[k]>=0){
          Stringer.drawString("( "+a[k]+" + "+b[k]+" - "+E+")",xSt+136,ySt+20);
          Stringer.drawString("2",xSt+135+(Fm.stringWidth("( "+a[k]+" + "+b[k]+" - "+E+")"))/2,ySt+40);
          if(slog==2) Stringer.drawString("= ",xSt+142+Fm.stringWidth("( "+a[k]+" + "+b[k]+" - "+E+")"),ySt+35);
          else Stringer.drawString("= "+y+".",xSt+142+Fm.stringWidth("( "+a[k]+" + "+b[k]+" - "+E+")"),ySt+35);
          g.drawLine(xSt+136,ySt+27,xSt+136+Fm.stringWidth("( "+a[k]+" + "+b[k]+" - "+E+")"),ySt+27);
          g.drawLine(xSt+136,ySt+28,xSt+136+Fm.stringWidth("( "+a[k]+" + "+b[k]+" - "+E+")"),ySt+28);
        }
        else{
          Stringer.drawString("( "+a[k]+" + ( "+(b[k])+" ) - "+E+")",xSt+136,ySt+20);
          Stringer.drawString("2",xSt+135+(Fm.stringWidth("( "+a[k]+" + ( "+(b[k])+" ) - "+E+")"))/2,ySt+40);
          if(slog==2) Stringer.drawString("= ",xSt+142+Fm.stringWidth("( "+a[k]+" + ( "+(b[k])+" ) - "+E+")"),ySt+35);
          else Stringer.drawString("= "+y+".",xSt+142+Fm.stringWidth("( "+a[k]+" + ( "+(b[k])+" ) - "+E+")"),ySt+35);
          g.drawLine(xSt+136,ySt+27,xSt+136+Fm.stringWidth("( "+a[k]+" + ( "+(b[k])+" ) - "+E+")"),ySt+27);
          g.drawLine(xSt+136,ySt+28,xSt+136+Fm.stringWidth("( "+a[k]+" + ( "+(b[k])+" ) - "+E+")"),ySt+28);
        }
        ////////////
        g.setColor(Color.red);
        Stringer.fonts[0]=new Font("SansSerif", 1, 12);
        Stringer.fonts[1]=new Font("SansSerif", 1, 10);
        Stringer.drawString("y_{k} =",385,225);
        Stringer.drawString("( a_{k} + b_{k} - \u03BE )",413,212);
        Stringer.drawString("2",446,232);
        g.drawLine(412,220,482,220);
        g.drawLine(412,219,482,219);
        Stringer.fonts[0]=new Font("SansSerif", 1, 14);
        Stringer.fonts[1]=new Font("SansSerif", 1, 11);
        g.setColor(Color.red);
        g.drawLine(361,197,380,216);
        g.drawLine(361,198,380,217);
             ///-----1------
        g.drawLine(371,217,380,217);
        g.drawLine(371,216,380,216);
        g.drawLine(375,215,380,215);
             ///-----2------
        g.drawLine(380,207,380,217);
        g.drawLine(379,209,379,217);
        g.drawLine(378,212,378,217);
        ///////////
      }
      if ( Proverka == 1 || sh>2){
        g.setColor(new Color(0, 120, 0));
        Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
        Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
        if(f(y)>=0)
        {
          for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y))+1; i<YN+(all2-otr2)*w2-5; i=i+9)
            g.drawLine((int)(otr*w+y*w+XN),i,(int)(otr*w+y*w+XN),i+6);
          if (sh>=0 && sh<6){
            Stringer.drawString("y_{"+k+"}",(int)(XN+otr*w+y*w-13),YN+(all2-otr2)*w2-8);
            Stringer.drawString(""+y,(int)(XN+otr*w+y*w-23),YN+(all2-otr2)*w2+12);
          }
        }
        if(f(y)<0)
        {
          for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
            g.drawLine((int)(otr*w+y*w+XN),i,(int)(otr*w+y*w+XN),i-6);
          if (sh>=0 && sh<6){
            Stringer.drawString("y_{"+k+"}",(int)(XN+otr*w+y*w-13),YN+(all2-otr2)*w2-8);
            Stringer.drawString(""+y,(int)(XN+otr*w+y*w-20),YN+(all2-otr2)*w2+12);
          }
        }

        g.fillOval((int)(otr*w+y*w+XN-3),YN+(all2-otr2)*w2-3,6,6);
        Stringer.fonts[0]=new Font("SansSerif", 1, 14);
        Stringer.fonts[1]=new Font("SansSerif", 1, 11);
      }
    }
    if (sh>=3 && sh<7){
      g.setColor(new Color(0, 0, 80));
      z=(Math.round((a[k]+b[k]+E)*1000/2.0))/1000.0;
      if (sh==3){
        if(slog==2)
        {
          if(AddRAnswer==false){ RightAnswer++; AddRAnswer=true;}
          btnNext.setEnabled(false);
          jButton1.setVisible(true);
          jButton1.setEnabled(true);
          jButton1.setLocation(375, 400);
          if(language==0){
            g.setColor(new Color(0, 0, 80)); Stringer.fonts[0]=new Font("SansSerif", 1, 14);
            jTF1.setVisible(true);
            jTF1.setEnabled(true);
            if(b[k]>=0) jTF1.setBounds(new Rectangle(xSt+155+Fm.stringWidth("( "+a[k]+" + "+b[k]+" + "+E+")"), 380, 45, 20));
            else jTF1.setBounds(new Rectangle(xSt+155+Fm.stringWidth("( "+a[k]+" + ( "+b[k]+" ) + "+E+")"), 380, 45, 20));
            Stringer.drawString("We calculate   z_{k}  under the above-stated formula: ",xSt,ySt);
            if ( Proverka == 1 ){
              g.setColor(Color.blue);
              Stringer.drawString("Correctly",xSt+370,ySt+30);
              btnNext.setEnabled(true);
              jTF1.setEnabled(false);
              jButton1.setEnabled(false);
            }
            if ( Proverka == 0 ){
              g.setColor(Color.red);
              Stringer.drawString("Incorrectly",xSt+370,ySt+30);
            }
          }
          else{
            g.setColor(new Color(0, 0, 80)); Stringer.fonts[0]=new Font("SansSerif", 1, 14);
            jTF1.setVisible(true);
            jTF1.setEnabled(true);
            if(b[k]>=0) jTF1.setBounds(new Rectangle(xSt+155+Fm.stringWidth("( "+a[k]+" + "+b[k]+" + "+E+")"), 380, 45, 20));
            else jTF1.setBounds(new Rectangle(xSt+155+Fm.stringWidth("( "+a[k]+" + ( "+b[k]+" ) + "+E+")"), 380, 45, 20));
            Stringer.drawString("Вычислите  z_{k}  по вышеприведенной формуле: ",xSt+28,ySt);
            Stringer.fonts[0]=new Font("Dialog", 0, 11);
            Stringer.drawString("Вычислeния поизводятся с точностью до трех знаков после запятой.",xSt+5,ySt+65);
            Stringer.fonts[0] = new Font("SansSerif", 1, 14);
            if( Proverka == 1 ){
              g.setColor(Color.blue); Stringer.fonts[0] = new Font("Dialog", 1, 14);
              Stringer.drawString("Правильно",xSt+370,ySt+30);
              btnNext.setEnabled(true);
              jTF1.setEnabled(false);
              jButton1.setEnabled(false);
            }
            if( Proverka == 0 ){
              g.setColor(Color.red); Stringer.fonts[0] = new Font("Dialog", 1, 14);
              Stringer.drawString("Неправильно",xSt+370,ySt+30);
            }
          }
        }
        else
        {
          g.setColor(new Color(0, 0, 80)); Stringer.fonts[0]=new Font("SansSerif", 1, 14);
          if(language==0) Stringer.drawString("We calculate   z_{k}  under the above-stated formula: ",xSt+28,ySt);
          else Stringer.drawString("Вычисляем  z_{k}  по вышеприведенной формуле: ",xSt+28,ySt);
          Proverka=1;
        }
        g.setColor(new Color(0, 0, 80)); Stringer.fonts[0]=new Font("SansSerif", 1, 14);
        Stringer.drawString("z_{"+k+"} =",xSt+5,ySt+35);
        Stringer.drawString("( a_{"+k+"} + b_{"+k+"} + \u03BE )",xSt+35,ySt+20);
        Stringer.drawString("2",xSt+70,ySt+40);
        g.drawLine(xSt+35,ySt+27,xSt+116,ySt+27);
        g.drawLine(xSt+35,ySt+28,xSt+116,ySt+28);
        Stringer.drawString("=",xSt+123,ySt+35);
        if(b[k]>=0){
          Stringer.drawString("( "+a[k]+" + "+b[k]+" + "+E+")",xSt+136,ySt+20);
          Stringer.drawString("2",xSt+135+(Fm.stringWidth("( "+a[k]+" + "+b[k]+" + "+E+")"))/2,ySt+40);
          if(slog==2) Stringer.drawString("= ",xSt+142+Fm.stringWidth("( "+a[k]+" + "+b[k]+" + "+E+")"),ySt+35);
          else Stringer.drawString("= "+z+".",xSt+142+Fm.stringWidth("( "+a[k]+" + "+b[k]+" + "+E+")"),ySt+35);
          g.drawLine(xSt+136,ySt+27,xSt+136+Fm.stringWidth("( "+a[k]+" + "+b[k]+" + "+E+")"),ySt+27);
          g.drawLine(xSt+136,ySt+28,xSt+136+Fm.stringWidth("( "+a[k]+" + "+b[k]+" + "+E+")"),ySt+28);
        }
        else{
          Stringer.drawString("( "+a[k]+" + ( "+(b[k])+" ) + "+E+")",xSt+136,ySt+20);
          Stringer.drawString("2",xSt+135+(Fm.stringWidth("( "+a[k]+" + ( "+(b[k])+" ) + "+E+")"))/2,ySt+40);
          if(slog==2) Stringer.drawString("= ",xSt+142+Fm.stringWidth("( "+a[k]+" + ( "+(b[k])+" ) + "+E+")"),ySt+35);
          else Stringer.drawString("= "+z+".",xSt+142+Fm.stringWidth("( "+a[k]+" + ( "+(b[k])+" ) + "+E+")"),ySt+35);
          g.drawLine(xSt+136,ySt+27,xSt+136+Fm.stringWidth("( "+a[k]+" + ( "+(b[k])+" ) + "+E+")"),ySt+27);
          g.drawLine(xSt+136,ySt+28,xSt+136+Fm.stringWidth("( "+a[k]+" + ( "+(b[k])+" ) + "+E+")"),ySt+28);
        }
        /////////////////
        g.setColor(Color.red);
        Stringer.fonts[0]=new Font("SansSerif", 1, 12);
        Stringer.fonts[1]=new Font("SansSerif", 1, 10);
        Stringer.drawString("z_{k} =",385,265);
        Stringer.drawString("( a_{k} + b_{k} + \u03BE )",413,252);
        Stringer.drawString("2",446,272);
        g.drawLine(412,260,482,260);
        g.drawLine(412,259,482,259);
        Stringer.fonts[0]=new Font("SansSerif", 1, 14);
        Stringer.fonts[1]=new Font("SansSerif", 1, 11);
        g.setColor(Color.red);
        g.drawLine(361,237,380,256);
        g.drawLine(361,238,380,257);
             ///-----1------
        g.drawLine(371,257,380,257);
        g.drawLine(371,256,380,256);
        g.drawLine(375,255,380,255);
             ///-----2------
        g.drawLine(380,247,380,257);
        g.drawLine(379,249,379,257);
        g.drawLine(378,252,378,257);
        ////////////////
      }
      if( Proverka == 1 || sh>3){
        g.setColor(new Color(98, 0, 170));
        Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
        Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
        if(f(z)>=0)
        {
          for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z))+1; i<YN+(all2-otr2)*w2-5; i=i+9)
            g.drawLine((int)(otr*w+z*w+XN),i,(int)(otr*w+z*w+XN),i+6);
          if (sh>=0 && sh<6){
            Stringer.drawString("z_{"+k+"}",(int)(XN+otr*w+z*w+5),YN+(all2-otr2)*w2-8);
            Stringer.drawString(""+z,(int)(XN+otr*w+z*w+2),YN+(all2-otr2)*w2+12);
          }
        }
        if(f(z)<0)
        {
          for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
            g.drawLine((int)(otr*w+z*w+XN),i,(int)(otr*w+z*w+XN),i-6);
          if (sh>=0 && sh<6){
            Stringer.drawString("z_{"+k+"}",(int)(XN+otr*w+z*w+5),YN+(all2-otr2)*w2-8);
            Stringer.drawString(""+z,(int)(XN+otr*w+z*w+2),YN+(all2-otr2)*w2+12);
          }
        }
        g.fillOval((int)(otr*w+z*w+XN-3),YN+(all2-otr2)*w2-3,6,6);
        Stringer.fonts[0]=new Font("SansSerif", 1, 14);
        Stringer.fonts[1]=new Font("SansSerif", 1, 11);
      }
    }
    if (sh>=4 && sh<7){
        //Proverka =-1;
        g.setColor(new Color(0, 0, 80)); Stringer.fonts[0]=new Font("SansSerif", 1, 14);
        if (sh==4){
          if (language==0)
            Stringer.drawString("We calculate meaning of function in a point   y_{"+k+"}:  f( y_{"+k+"} ) = "+(Math.round(f(y)*1000))/1000.0+".",xSt+28,ySt);
          else Stringer.drawString("Вычислим значение функции в точке  y_{"+k+"}:  f( y_{"+k+"} ) = "+(Math.round(f(y)*1000))/1000.0+".",xSt+28,ySt);
        }
        g.setColor(new Color(0, 120, 0));
        if(y<0){
          for( int i = (int)(XN+otr*w+y*w+1); i<XN+otr*w-5; i=i+9)
            g.drawLine(i,(int)(YN+(all2-otr2)*w2-f(y)*w2),i+6,(int)(YN+(all2-otr2)*w2-f(y)*w2));
        }
        else{
          for( int i = (int)(XN+otr*w+y*w-1); i>XN+otr*w+5; i=i-9)
            g.drawLine(i,(int)(YN+(all2-otr2)*w2-f(y)*w2),i-6,(int)(YN+(all2-otr2)*w2-f(y)*w2));
        }
        g.setColor(new Color(0, 120, 0));
        g.fillOval((int)(XN+otr*w-3),(int)(YN+(all2-otr2)*w2-f(y)*w2-3),6,6);
        Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
        Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
        if (f(y)<f(z)){
          if(y>=0) Stringer.drawString(""+(Math.round(f(y)*1000))/1000.0,XN+otr*w-5-Fm1.stringWidth(""+(Math.round(f(y)*1000))/1000.0),(int)(YN+(all2-otr2)*w2-f(y)*w2)+5);
          else Stringer.drawString(""+(Math.round(f(y)*1000))/1000.0,XN+otr*w+5,(int)(YN+(all2-otr2)*w2-f(y)*w2)+5);
        }
        else{
          if(y>=0) Stringer.drawString(""+(Math.round(f(y)*1000))/1000.0,XN+otr*w-5-Fm1.stringWidth(""+(Math.round(f(y)*1000))/1000.0),(int)(YN+(all2-otr2)*w2-f(y)*w2)-5);
          else Stringer.drawString(""+(Math.round(f(y)*1000))/1000.0,XN+otr*w+5,(int)(YN+(all2-otr2)*w2-f(y)*w2)-5);
        }
        Stringer.fonts[0]=new Font("SansSerif", 1, 14);
        Stringer.fonts[1]=new Font("SansSerif", 1, 11);
      }
        if (sh>=5 && sh<7){
          g.setColor(new Color(0, 0, 80)); Stringer.fonts[0]=new Font("SansSerif", 1, 14);
          if (sh==5){
            if (language==0) Stringer.drawString("We calculate meaning of function in a point   z_{"+k+"}:  f( z_{"+k+"} ) = "+(Math.round(f(z)*1000))/1000.0+".",xSt+28,ySt);
            else  Stringer.drawString("Вычислим значение функции в точке  z_{"+k+"}:  f( z_{"+k+"} ) = "+(Math.round(f(z)*1000))/1000.0+".",xSt+28,ySt);
          }
          g.setColor(new Color(98, 0, 170));
          if(z<0){
            for( int i = (int)(XN+otr*w+z*w+1); i<XN+otr*w-5; i=i+9)
              g.drawLine(i,(int)(YN+(all2-otr2)*w2-f(z)*w2),i+6,(int)(YN+(all2-otr2)*w2-f(z)*w2));
          }
          else{
            for( int i = (int)(XN+otr*w+z*w-1); i>XN+otr*w+5; i=i-9)
              g.drawLine(i,(int)(YN+(all2-otr2)*w2-f(z)*w2),i-6,(int)(YN+(all2-otr2)*w2-f(z)*w2));
          }
          g.fillOval((int)(XN+otr*w-3),(int)(YN+(all2-otr2)*w2-f(z)*w2-3),6,6);
          Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
          Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
          if (f(y)<f(z)){
            if(z>=0) Stringer.drawString(""+(Math.round(f(z)*1000))/1000.0,XN+otr*w-5-Fm1.stringWidth(""+(Math.round(f(z)*1000))/1000.0),(int)(YN+(all2-otr2)*w2-f(z)*w2)-5);
            else Stringer.drawString(""+(Math.round(f(z)*1000))/1000.0,XN+otr*w+5,(int)(YN+(all2-otr2)*w2-f(z)*w2)-5);
          }
          else{
            if(z>=0) Stringer.drawString(""+(Math.round(f(z)*1000))/1000.0,XN+otr*w-5-Fm1.stringWidth(""+(Math.round(f(z)*1000))/1000.0),(int)(YN+(all2-otr2)*w2-f(z)*w2)+5);
            else if(select!=1) Stringer.drawString(""+(Math.round(f(z)*1000))/1000.0,XN+otr*w+5,(int)(YN+(all2-otr2)*w2-f(z)*w2)+5);
                 else Stringer.drawString(""+(Math.round(f(z)*1000))/1000.0,XN+otr*w+5,(int)(YN+(all2-otr2)*w2-f(z)*w2)+2);
          }
          Stringer.fonts[0]=new Font("SansSerif", 1, 14);
          Stringer.fonts[1]=new Font("SansSerif", 1, 11);
        }
        if(sh>=6){
          g.setColor(new Color(0, 0, 80));  Stringer.fonts[0]=new Font("SansSerif", 1, 14);
          if (sh==6){
            btnNext.setEnabled(false);
            jRadioButton1.setVisible(true);
            jRadioButton1.setEnabled(true);
            jRadioButton2.setVisible(true);
            jRadioButton2.setEnabled(true);
            if(AddRAnswer==false){ RightAnswer++; AddRAnswer=true;}
            if((Math.round(f(y)*1000))/1000.0<(Math.round(f(z)*1000))/1000.0){
              if(language==0) Stringer.drawString("In this case  f( y_{"+k+"} ) < f( z_{"+k+"} ), therefore",xSt+28,ySt);
              else Stringer.drawString("В данном случае f( y_{"+k+"} ) < f( z_{"+k+"} ), поэтому",xSt+28,ySt);
            }
            else if((Math.round(f(y)*1000))/1000.0==(Math.round(f(z)*1000))/1000.0){
                   if(language==0) Stringer.drawString("In this case  f( y_{"+k+"} ) = f( z_{"+k+"} ), therefore",xSt+28,ySt);
                   else Stringer.drawString("В данном случае f( y_{"+k+"} ) = f( z_{"+k+"} ), поэтому",xSt+28,ySt);
                 }
                 else{
                   if(language==0) Stringer.drawString("In this case  f( y_{"+k+"} ) > f( z_{"+k+"} ), therefore",xSt+28,ySt);
                   else Stringer.drawString("В данном случае f( y_{"+k+"} ) > f( z_{"+k+"} ), поэтому",xSt+28,ySt);
                 }
            g.setColor(Color.black);  Stringer.fonts[0]=new Font("Dialog", 3, 13);
            Stringer.drawString("a_{"+(k+1)+"} = y_{"+k+"} = "+y+" , b_{"+(k+1)+"} = b_{"+k+"} = "+b[k],xSt+68,ySt+24);
            Stringer.drawString("a_{"+(k+1)+"} = a_{"+k+"} = "+a[k]+" , b_{"+(k+1)+"} = z_{"+k+"} = "+z,xSt+68,ySt+54);
            g.setColor(new Color(0, 0, 80));  Stringer.fonts[0]=new Font("SansSerif", 1, 14);
            if((!jRadioButton1.isSelected() && !jRadioButton2.isSelected()) ||
               (jRadioButton1.isSelected()==true && (Math.round(f(y)*1000))/1000.0<(Math.round(f(z)*1000))/1000.0) ||
               (jRadioButton2.isSelected()==true && (Math.round(f(y)*1000))/1000.0>(Math.round(f(z)*1000))/1000.0)
              )
            {
              Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
              Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
              g.setColor(new Color(0, 0, 130));
              Stringer.drawString("a_{"+k+"}",(int)(XN+otr*w+a[k]*w-13),YN+(all2-otr2)*w2-8);
              Stringer.drawString("b_{"+k+"}",(int)(XN+otr*w+b[k]*w+5),YN+(all2-otr2)*w2-8);
              g.setColor(new Color(0, 120, 0));
              if(f(y)>=0)
              {
                for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y))+1; i<YN+(all2-otr2)*w2-5; i=i+9)
                  g.drawLine((int)(otr*w+y*w+XN),i,(int)(otr*w+y*w+XN),i+6);
                Stringer.drawString("y_{"+k+"}",(int)(XN+otr*w+y*w-13),YN+(all2-otr2)*w2-8);
                Stringer.drawString(""+y,(int)(XN+otr*w+y*w-23),YN+(all2-otr2)*w2+12);
              }
              if(f(y)<0)
              {
                for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
                  g.drawLine((int)(otr*w+y*w+XN),i,(int)(otr*w+y*w+XN),i-6);
                Stringer.drawString("y_{"+k+"}",(int)(XN+otr*w+y*w-13),YN+(all2-otr2)*w2-8);
                Stringer.drawString(""+y,(int)(XN+otr*w+y*w-20),YN+(all2-otr2)*w2+12);
              }
              g.setColor(new Color(98, 0, 170));
              if(f(z)>=0)
              {
                for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z))+1; i<YN+(all2-otr2)*w2-5; i=i+9)
                  g.drawLine((int)(otr*w+z*w+XN),i,(int)(otr*w+z*w+XN),i+6);
                Stringer.drawString("z_{"+k+"}",(int)(XN+otr*w+z*w+5),YN+(all2-otr2)*w2-8);
                Stringer.drawString(""+z,(int)(XN+otr*w+z*w+2),YN+(all2-otr2)*w2+12);
              }
              if(f(z)<0)
              {
                for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
                  g.drawLine((int)(otr*w+z*w+XN),i,(int)(otr*w+z*w+XN),i-6);
                Stringer.drawString("z_{"+k+"}",(int)(XN+otr*w+z*w+5),YN+(all2-otr2)*w2-8);
                Stringer.drawString(""+z,(int)(XN+otr*w+z*w+2),YN+(all2-otr2)*w2+12);
              }
              Stringer.fonts[0]=new Font("SansSerif", 1, 14);
              Stringer.fonts[1]=new Font("SansSerif", 1, 11);
            }
            if((jRadioButton1.isSelected()==true && (Math.round(f(y)*1000))/1000.0<(Math.round(f(z)*1000))/1000.0) ||
               (jRadioButton2.isSelected()==true && (Math.round(f(y)*1000))/1000.0>(Math.round(f(z)*1000))/1000.0)){
              g.setColor(Color.red); Stringer.fonts[0]=new Font("Dialog", 1, 14);
              if(language==0) Stringer.drawString("Incorrectly",xSt+300,ySt+40);
              else Stringer.drawString("Неправильно",xSt+300,ySt+40);
              Stringer.fonts[0]=new Font("SansSerif", 1, 14);
              if(entry==false){ Mist_under[sh]++; entry=true;}
            }
            if((jRadioButton2.isSelected()==true && (Math.round(f(y)*1000))/1000.0<(Math.round(f(z)*1000))/1000.0) ||
               (jRadioButton1.isSelected()==true && (Math.round(f(y)*1000))/1000.0>(Math.round(f(z)*1000))/1000.0) ||
               ((jRadioButton1.isSelected()==true || jRadioButton2.isSelected()==true) && (Math.round(f(y)*1000))/1000.0==(Math.round(f(z)*1000))/1000.0))
            {
              g.setColor(Color.lightGray);  Stringer.fonts[0]=new Font("Dialog", 3, 13);
              if(jRadioButton2.isSelected()==true && (Math.round(f(y)*1000))/1000.0!=(Math.round(f(z)*1000))/1000.0)
              {
                jRadioButton1.setEnabled(false);
                Stringer.drawString("a_{"+(k+1)+"} = y_{"+k+"} = "+y+" , b_{"+(k+1)+"} = b_{"+k+"} = "+b[k],xSt+68,ySt+24);
              }
              if(jRadioButton1.isSelected()==true && (Math.round(f(y)*1000))/1000.0!=(Math.round(f(z)*1000))/1000.0)
              {
                jRadioButton2.setEnabled(false);
                Stringer.drawString("a_{"+(k+1)+"} = a_{"+k+"} = "+a[k]+" , b_{"+(k+1)+"} = z_{"+k+"} = "+z,xSt+68,ySt+54);
              }
              g.setColor(Color.blue); Stringer.fonts[0]=new Font("Dialog", 1, 14);
              if(language==0) Stringer.drawString("Correctly",xSt+300,ySt+40);
              else Stringer.drawString("Правильно",xSt+300,ySt+40);
            //--------------
              Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
              Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
              if(jRadioButton2.isSelected()==true){
                a[k+1]=a[k];
                b[k+1]=z;
                g.setColor(new Color(98, 0, 170));
                for (int i=(int)(YN+w2*(all2-otr2)-f(z)*w2);i<YN+w2*(all2-otr2)-3;i+=9)
                  g.drawLine((int)(z*w+XN+otr*w),i,(int)(z*w+XN+otr*w),i+6);
                g.fillOval((int)(z*w+XN+otr*w-3),YN+w2*(all2-otr2)-3,6,6);
                g.setColor(new Color(0, 120, 0));
                for (int i=(int)(YN+w2*(all2-otr2)-f(y)*w2);i<YN+w2*(all2-otr2)-3;i+=9)
                  g.drawLine((int)(y*w+XN+otr*w),i,(int)(y*w+XN+otr*w),i+6);
                g.fillOval((int)(y*w+XN+otr*w-3),YN+w2*(all2-otr2)-3,6,6);
                Stringer.drawString("y_{"+k+"}",(int)(y*w+XN+otr*w-13),YN+w2*(all2-otr2)-8);
                g.setColor(new Color(0, 0, 130));
                Stringer.drawString("a_{"+(k+1)+"} = a_{"+k+"}",(int)(a[k+1]*w+XN+otr*w-40),YN+w2*(all2-otr2)-8);
                g.setColor(new Color(98, 0, 170));
                for (int i=(int)(YN+w2*(all2-otr2)-f(z)*w2);i<YN+w2*(all2-otr2)-3;i+=9)
                  g.drawLine((int)(z*w+XN+otr*w),i,(int)(z*w+XN+otr*w),i+6);
                g.fillOval((int)(z*w+XN+otr*w-3),YN+w2*(all2-otr2)-3,6,6);
                Stringer.drawString("z_{"+k+"} = b_{"+(k+1)+"}",(int)(b[k+1]*w+XN+otr*w+5),YN+w2*(all2-otr2)-8);
                g.setColor(new Color(0, 0, 130));
                Stringer.drawString("b_{"+k+"}",(int)(XN+otr*w+b[k]*w+5),YN+(all2-otr2)*w2+10);
              }
              else if(jRadioButton1.isSelected()==true){
                a[k+1]=y;
                b[k+1]=b[k];
                g.setColor(new Color(0, 120, 0));
                for (int i=(int)(YN+w2*(all2-otr2)-f(y)*w2);i<YN+w2*(all2-otr2)-3;i+=9)
                  g.drawLine((int)(y*w+XN+otr*w),i,(int)(y*w+XN+otr*w),i+6);
                g.fillOval((int)(y*w+XN+otr*w-3),YN+w2*(all2-otr2)-3,6,6);
                g.setColor(new Color(98, 0, 170));
                for (int i=(int)(YN+w2*(all2-otr2)-f(z)*w2);i<YN+w2*(all2-otr2)-3;i+=9)
                  g.drawLine((int)(z*w+XN+otr*w),i,(int)(z*w+XN+otr*w),i+6);
                g.fillOval((int)(z*w+XN+otr*w-3),YN+w2*(all2-otr2)-3,6,6);
                Stringer.drawString("z_{"+k+"}",(int)(z*w+XN+otr*w+5),YN+w2*(all2-otr2)-8);
                g.setColor(new Color(0, 120, 0));
                Stringer.drawString("a_{"+(k+1)+"} = y_{"+k+"}",(int)(a[k+1]*w+XN+otr*w-40),YN+w2*(all2-otr2)-8);
                g.setColor(new Color(0, 0, 130));
                for (int i=(int)(YN+w2*(all2-otr2)-f(y)*w2);i<YN+w2*(all2-otr2)-3;i+=9)
                  g.drawLine((int)(y*w+XN+otr*w),i,(int)(y*w+XN+otr*w),i+6);
                g.fillOval((int)(y*w+XN+otr*w-3),YN+w2*(all2-otr2)-3,6,6);
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

      if(sh>=7){
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
        g.drawLine((int)(XN+otr*w+a[k+1]*w),YN+w2*(all2-otr2),(int)(XN+otr*w+b[k+1]*w),YN+w2*(all2-otr2));
        g.drawLine((int)(XN+otr*w+a[k+1]*w),YN+w2*(all2-otr2)+1,(int)(XN+otr*w+b[k+1]*w),YN+w2*(all2-otr2)+1);
        Stringer.fonts[0]=new Font("SansSerif", 1, 14);
        Stringer.fonts[1]=new Font("SansSerif", 1, 11);
        Stringer.drawString("[",(int)(XN+otr*w+a[k+1]*w-2),YN+(all2-otr2)*w2+4);
        Stringer.drawString("]",(int)(XN+otr*w+b[k+1]*w-2),YN+(all2-otr2)*w2+4);
        g.setColor(new Color(0, 0, 130));
        Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
        Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
        Stringer.drawString("a_{"+(k+1)+"}",(int)(a[k+1]*w+XN+otr*w-13),YN+(all2-otr2)*w2-8);
        Stringer.drawString("b_{"+(k+1)+"}",(int)(b[k+1]*w+XN+otr*w+5),YN+(all2-otr2)*w2-8);

        if( Proverka == 1 ){
          if(Math.abs(b[k+1]-a[k+1])<=l && sh==10){
            g.setColor(Color.red);
            g.fillOval((int)((a[k+1]+b[k+1])*w/2+XN+otr*w-3),YN+(all2-otr2)*w2-3,6,6);
            Stringer.drawString("x^{*}",(int)((a[k+1]+b[k+1])*w/2+XN+otr*w-10),YN+(all2-otr2)*w2+25);
            if((int)(YN+(all2-otr2)*w2-f((a[k+1]+b[k+1])/2.0)*w2)>YN+(all2-otr2)*w2){
              for(int i=(int)(YN+(all2-otr2)*w2-f((a[k+1]+b[k+1])/2.0)*w2);i>YN+(all2-otr2)*w2+3;i-=9)
                g.drawLine((int)((a[k+1]+b[k+1])*w/2.0+XN+otr*w),i,(int)((a[k+1]+b[k+1])*w/2.0+XN+otr*w),i-6);
            }
            else{
              for(int i=(int)(YN+(all2-otr2)*w2-f((a[k+1]+b[k+1])/2.0)*w2);i<YN+(all2-otr2)*w2-3;i+=9)
                g.drawLine((int)((a[k+1]+b[k+1])*w/2.0+XN+otr*w),i,(int)((a[k+1]+b[k+1])*w/2.0+XN+otr*w),i+6);
            }
            Stringer.drawString(""+(Math.round((a[k+1]+b[k+1])*1000/2)/1000.0),(int)((a[k+1]+b[k+1])*w/2+XN+otr*w-10),YN+(all2-otr2)*w2+15);
          }
          else{
            g.setColor(new Color(180, 0, 60));
            g.fillOval((int)((a[k+1]+b[k+1])*w/2+XN+otr*w-3),YN+(all2-otr2)*w2-3,6,6);
            if((int)(YN+(all2-otr2)*w2-f((a[k+1]+b[k+1])/2.0)*w2)>YN+(all2-otr2)*w2){
              for (int i=(int)(YN+(all2-otr2)*w2-f((a[k+1]+b[k+1])/2.0)*w2);i>YN+(all2-otr2)*w2+3;i-=9)
                g.drawLine((int)((a[k+1]+b[k+1])*w/2.0+XN+otr*w),i,(int)((a[k+1]+b[k+1])*w/2.0+XN+otr*w),i-6);
            }
            else{
              for (int i=(int)(YN+(all2-otr2)*w2-f((a[k+1]+b[k+1])/2.0)*w2);i<YN+(all2-otr2)*w2-3;i+=9)
                g.drawLine((int)((a[k+1]+b[k+1])*w/2.0+XN+otr*w),i,(int)((a[k+1]+b[k+1])*w/2.0+XN+otr*w),i+6);
            }
            Stringer.drawString(""+(Math.round((a[k+1]+b[k+1])*1000/2)/1000.0),(int)((a[k+1]+b[k+1])*w/2+XN+otr*w-10),YN+(all2-otr2)*w2+15);
          }
        }
        Stringer.fonts[0]=new Font("SansSerif", 1, 14);
        Stringer.fonts[1]=new Font("SansSerif", 1, 11);
      }

      if(sh==7){
        jRadioButton1.setVisible(true);
        jRadioButton1.setEnabled(true);
        jRadioButton2.setVisible(true);
        jRadioButton2.setEnabled(true);
        btnNext.setEnabled(false);
        if(AddRAnswer==false){ RightAnswer++; AddRAnswer=true;}
        g.setColor(Color.black); Stringer.fonts[0]=new Font("Dialog", 3, 13);
        if(language==0){
          Stringer.drawString("process of search to finish",xSt+68,ySt+24);
          Stringer.drawString("we pass to the following iteration",xSt+68,ySt+54);
        }
        else{
          Stringer.drawString("процесс поиска завершить",xSt+68,ySt+24);
          Stringer.drawString("переходим к следующей итерации",xSt+68,ySt+54);
        }
        if((jRadioButton2.isSelected() && Math.abs(b[k+1]-a[k+1])>l) ||
           (jRadioButton1.isSelected() && Math.abs(b[k+1]-a[k+1])<=l)){
          g.setColor(Color.blue);  Stringer.fonts[0]=new Font("Dialog", 1, 14);
          if(language==0) Stringer.drawString("Correctly",xSt+350,ySt+40);
          else Stringer.drawString("Правильно",xSt+350,ySt+40);
          btnNext.setEnabled(true);
          g.setColor(Color.lightGray); Stringer.fonts[0]=new Font("Dialog", 3, 13);
          if(jRadioButton2.isSelected()){
            jRadioButton1.setEnabled(false);
            Stringer.drawString("процесс поиска завершить",xSt+68,ySt+24);
          }
          if(jRadioButton1.isSelected()){
            jRadioButton2.setEnabled(false);
            Stringer.drawString("переходим к следующей итерации",xSt+68,ySt+54);
          }
        }
        if((jRadioButton1.isSelected() && Math.abs(b[k+1]-a[k+1])>l) ||
           (jRadioButton2.isSelected() && Math.abs(b[k+1]-a[k+1])<=l)){
          g.setColor(Color.red);  Stringer.fonts[0]=new Font("Dialog", 1, 14);
          if(language==0) Stringer.drawString("Incorrectly",xSt+350,ySt+40);
          else Stringer.drawString("Неправильно",xSt+350,ySt+40);
          if(entry==false){ Mist_under[sh]++; entry=true;}
        }
        g.setColor(new Color(0, 0, 80)); Stringer.fonts[0]=new Font("SansSerif", 1, 14);
        if(Math.abs(b[k+1]-a[k+1])>l){
          if(a[k+1]>0)
            if(language==0) Stringer.drawString("We calculate | L_{"+(2*(k+1))+"} |=| b_{"+(k+1)+"} - a_{"+(k+1)+"} | = | "+b[k+1]+" - "+a[k+1]+" | = "+roundC(b[k+1]-a[k+1])+" >  "+l+" = \u2113." ,xSt+28,ySt);
            else Stringer.drawString("Вычисляем | L_{"+(2*(k+1))+"} |=| b_{"+(k+1)+"} - a_{"+(k+1)+"} | = | "+b[k+1]+" - "+a[k+1]+" | = "+roundC(b[k+1]-a[k+1])+" >  "+l+" = \u2113." ,xSt+28,ySt);
          else
            if(language==0) Stringer.drawString("We calculate | L_{"+(2*(k+1))+"} |=| b_{"+(k+1)+"} - a_{"+(k+1)+"} | = | "+b[k+1]+" - ( "+a[k+1]+") | = "+roundC(b[k+1]-a[k+1])+" >  "+l+" = \u2113." ,xSt+28,ySt);
            else Stringer.drawString("Вычисляем | L_{"+(2*(k+1))+"} |=| b_{"+(k+1)+"} - a_{"+(k+1)+"} | = | "+b[k+1]+" - ( "+a[k+1]+") | = "+roundC(b[k+1]-a[k+1])+" >  "+l+" = \u2113." ,xSt+28,ySt);
        }
        else{
          g.setColor(new Color(0, 0, 130));
          Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
          Stringer.drawString(""+b[k+1],(int)(b[k+1]*w+XN+otr*w+5),YN+(all2-otr2)*w2+15);
          Stringer.drawString(""+a[k+1],(int)(a[k+1]*w+XN+otr*w-25),YN+(all2-otr2)*w2+15);
          Stringer.fonts[0]=new Font("SansSerif", 1, 14); g.setColor(new Color(0, 0, 80));
          if(a[k+1]>0){
            if(language==0) Stringer.drawString("We calculate | L_{"+(2*(k+1))+"} |=| b_{"+(k+1)+"} - a_{"+(k+1)+"} | = | "+b[k+1]+" - "+a[k+1]+" | = "+roundC(b[k+1]-a[k+1])+" <  "+l+" = \u2113",xSt+28,ySt);
            else Stringer.drawString("Вычисляем | L_{"+(2*(k+1))+"} |=| b_{"+(k+1)+"} - a_{"+(k+1)+"} | = | "+b[k+1]+" - "+a[k+1]+" | = "+roundC(b[k+1]-a[k+1])+" <  "+l+" = \u2113",xSt+28,ySt);
          }
          else{
            if(language==0) Stringer.drawString("We calculate | L_{"+(2*(k+1))+"} |=| b_{"+(k+1)+"} - a_{"+(k+1)+"} | = | "+b[k+1]+" - ( "+a[k+1]+") | = "+roundC(b[k+1]-a[k+1])+" <  "+l+" = \u2113",xSt+28,ySt);
            else Stringer.drawString("Вычисляем | L_{"+(2*(k+1))+"} |=| b_{"+(k+1)+"} - a_{"+(k+1)+"} | = | "+b[k+1]+" - ( "+a[k+1]+") | = "+roundC(b[k+1]-a[k+1])+" <  "+l+" = \u2113",xSt+28,ySt);
          }
          /////////////////
          g.setColor(Color.red);
          Stringer.fonts[0]=new Font("SansSerif", 1, 12);
          Stringer.drawString("\u2113 = "+l,365,145);
          Stringer.fonts[0]=new Font("SansSerif", 1, 14);
          g.drawLine(346,101+15,365,120+15);
          g.drawLine(346,102+15,365,121+15);
               ///-----1------
          g.drawLine(356,121+15,365,121+15);
          g.drawLine(358,120+15,365,120+15);
          g.drawLine(360,119+15,365,119+15);
               ///-----2------
          g.drawLine(365,111+15,365,121+15);
          g.drawLine(364,113+15,364,121+15);
          g.drawLine(363,116+15,363,121+15);
         /////////////////
        }
      }
      if(sh==8){
        g.setFont(new java.awt.Font("Dialog", 1, 14));
        g.setColor(new Color(0, 0, 80));
        if (Math.abs(b[k+1]-a[k+1])>l){
          if(language==0) Stringer.drawString("Let's assume  k = k + 1 = "+k+" + 1= "+(k+1)+ ";",xSt+28,ySt);
          else Stringer.drawString("Положим k = k + 1 = "+k+" + 1= "+(k+1)+ ";",xSt+28,ySt);
        }
        else{
        //////////////////////////////
          g.setColor(Color.red);
          Stringer.fonts[0]=new Font("SansSerif", 1, 12);
          Stringer.fonts[1]=new Font("SansSerif", 1, 10);
          Stringer.drawString("x^{*} \u2248",380,305);
          Stringer.drawString("( a_{k+1} + b_{k+1} )",407,292);
          Stringer.drawString("2",440,312);
          g.drawLine(406,300,483,300);
          g.drawLine(406,299,483,299);
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
          g.setColor(new Color(0, 0, 80));
          Stringer.drawString("    =",xSt+28,ySt+20);
          Stringer.drawString("x^{*}",xSt+28,ySt+18);
          Stringer.drawString("( a_{"+(k+1)+"} + b_{"+(k+1)+"} )",xSt+58,ySt+5);
          Stringer.drawString("2",xSt+80,ySt+25);
          g.drawLine(xSt+58,ySt+12,xSt+115,ySt+12);
          g.drawLine(xSt+58,ySt+13,xSt+115,ySt+13);
          Stringer.drawString("=",xSt+123,ySt+20);
          Stringer.drawString("( "+a[k+1]+" + "+b[k+1]+")",xSt+138,ySt+5);
          Stringer.drawString("2",xSt+136+Fm.stringWidth("( "+a[k+1]+" + "+b[k+1]+")")/2,ySt+25);
          Stringer.drawString("= "+(Math.round((a[k+1]+b[k+1])*1000/2)/1000.0),xSt+144+Fm.stringWidth("( "+a[k+1]+" + "+b[k+1]+")"),ySt+20);
          g.drawLine(xSt+138,ySt+12,xSt+138+Fm.stringWidth("( "+a[k+1]+" + "+b[k+1]+")"),ySt+12);
          g.drawLine(xSt+138,ySt+13,xSt+138+Fm.stringWidth("( "+a[k+1]+" + "+b[k+1]+")"),ySt+13);
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
          jCheckBoxRezult.setBounds(new Rectangle(xSt+174, ySt+45, 150, 23));
          jCheckBoxRezult.setVisible(true);  jCheckBoxRezult.setEnabled(true);
          g.setColor(Color.black);
          g.drawLine(xSt+158,ySt+38,xSt+318,ySt+38);
          g.drawLine(xSt+158,ySt+39,xSt+318,ySt+39);
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

          ///////////////////////
	  g.setColor(new Color(0, 0, 120));
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
    Proverka=-1;
    AddRAnswer=false;
    entry=false;
    if (sh<9){
      if (Math.abs(b[k+1]-a[k+1])>l && sh==8){
        sh=1;
        k++;
      }
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
    Proverka = -1;
    RightAnswer=0;
    AddRAnswer=false;
    entry=false;
    sh=-1;
    for (int j=0;j<30;j++){
      a[j]=0;b[j]=0;
    }
    l=0.5;E=0.3;k=0;num=-1;
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
    if((sh==2 || sh==3) && jTF1.isEnabled()==true && jTF1.getText().equals("")!=true){
      try{
        if((sh==2 && (Math.round((a[k]+b[k]-E)*1000/2.0))/1000.0== Double.parseDouble(jTF1.getText())) ||
           (sh==3 && (Math.round((a[k]+b[k]+E)*1000/2.0))/1000.0== Double.parseDouble(jTF1.getText()))){// ||
          // (sh==7 && (Math.round((a[k+1]+b[k+1])*1000/2))/1000.0== Double.parseDouble(jTF1.getText()))){
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
    else if((sh==2 || sh==3) && jTF1.isEnabled()==true && jTF1.getText().equals("")==true){
      Proverka = 0;
      jTF1.setForeground(Color.red);
      jPanel1.repaint();
    }
  }

  void jPanel1_mouseClicked(MouseEvent e){
    if(sh==8 && e.getX()>=458 && e.getX()<=473 && e.getY()>=103 && e.getY()<=118){
      jCheckBoxRezult.setSelected(false);
      Ch=false;
      jPanel1.repaint();
    }
  }

  void jCheckBoxRezult_stateChanged(ChangeEvent e) {
    if(jCheckBoxRezult.isSelected()==true && sh==8) Ch=true;
    else Ch=false;
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
}