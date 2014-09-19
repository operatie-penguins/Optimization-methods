import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.event.*;

public class AppUprErrDihotomia extends JApplet {
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
  ButtonGroup buttonGroup1 = new ButtonGroup();
  JTextField jTF1 = new JTextField();
  public double y=0, z=0, E=0.3, l=0.5, scale=1.0, all=5.0, otr=2.0, all2=5, otr2=1;
  public int sh=0, k=0, num=0, slog=0, x1=330, y1=70, y2=290, x2=10, XN=2, YN=67,
           // all=5, //количество делений (всего) на графике x1
          //  otr=2, //количество делений (с отрицательным знаком) на графике x1
            w=(int)(scale*338/all), //количество пикселов в 1 делении (на графике) x1
            ost=(int)(338-w*all),
          //  all2=10, //количество делений (всего) на графике x2
           // otr2=1, //количество делений (с отрицательным знаком) на графике x2
            w2=(int)(scale*253/all2), //количество пикселов в 1 делении (на графике) x2
            ost2=(int)(253-w2*all2);
  double [] a = {-1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
  double [] b = {2.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
  public int[] Mist_knowledge=new int [50];
  public int[] Mist_calk=new int [50];
  public int[] Mist_under=new int [50];
  public int[] Mist_use=new int [50];
  boolean Ch=true, entry=false;
  public int language=1, Proverka = -1, RightAnswer=20;

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
    this.setSize(new Dimension(530, 512));
    jPanel1.setBackground(new Color(247, 247, 255));
    jPanel1.setBounds(new Rectangle(10, 0, 510, 471));
    jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        jPanel1_mouseClicked(e);
      }
    });
    this.getContentPane().setBackground(new Color(247, 247, 255));
    this.setFont(new java.awt.Font("SansSerif", 1, 14));
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel1.setForeground(new Color(130, 0, 80));
    jLabel1.setBounds(new Rectangle(32, 5, 440, 17));
    btnNext.setBackground(new Color(220, 230, 255));
    btnNext.setFont(new java.awt.Font("Dialog", 1, 14));
    btnNext.setForeground(new Color(0, 0, 60));
    btnNext.setVisible(true);
    btnNext.setText("==>");
    btnNext.setBounds(new Rectangle(270, 480, 100, 23));
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
    btnNew.setBounds(new Rectangle(140, 480, 100, 23));
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
    jRadioButton1.setForeground(new Color(0, 0, 0));
    jRadioButton1.setText("");
    jRadioButton1.setBounds(new Rectangle(53, 370, 30, 20));
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
    jRadioButton2.setBounds(new Rectangle(53, 400, 30, 20));
    jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        jRadioButton2_itemStateChanged(e);
      }
    });
    jRadioButton3.setVisible(false); jRadioButton2.setEnabled(false);
    jRadioButton3.setBackground(new Color(255, 255, 255));
    jRadioButton3.setFont(new java.awt.Font("Dialog", 3, 13));
    jRadioButton3.setForeground(new Color(0, 0, 0));
    jRadioButton3.setText("");
    jRadioButton3.setBounds(new Rectangle(53, 400, 30, 20));
    jRadioButton3.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        jRadioButton3_itemStateChanged(e);
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
    buttonGroup1.add(jRadioButton3);
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
    this.jPanel1.add(jRadioButton3, null);
    Proverka=-1;
  }

  public double roundC(double x) {       // округление до 3-его знака после ,
    return Math.round(x*Math.pow(10, 3))/Math.pow(10, 3);
  }

  public double f(double x){
    double j=0.0;
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
    FontMetrics Fm1=g.getFontMetrics(new Font("SansSerif", 1, 11));
    g.setColor(Color.black);
    int xSt,ySt,xSt1,ySt1;
    if(language==0){
      jLabel1.setText("Test example with preplaned mistakes");
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
       Stringer.drawString("To find a minimum of function f(x) by method dihotomia",78,40);
     }
     else{
       g.setColor(new Color(180, 0, 80));
       Stringer.fonts[0]=new Font("SansSerif", 3, 13);
       Stringer.drawString("Задача: ",9,40);
       Stringer.drawString("Графическая иллюстрация:",10,63);
       Stringer.drawString("Величины:",368,63);
       Stringer.drawString("Формулы:  ",368,189);
       Stringer.drawString("Решение:  ",10,336);
       g.setColor(new Color(0, 0, 80));
        Stringer.fonts[0]=new Font("SansSerif", 1, 14);
       Stringer.drawString("Найти минимум функции f(x) = x^{ 2 }- x + 1 методом дихотомии",66,40);
     }
   // Stringer.drawString(""+Math.round(198.6),1,15);
     g.setColor(new Color(255, 255, 255));
     g.fillRect(2,67,338,253);g.fillRect(360,67,145,106);g.fillRect(360,193,145,127);g.fillRect(2,340,503,130);
     g.setColor(new Color(157, 187, 255));
     g.drawRect(2,67,338,253);  g.drawRect(360,67,145,106);g.drawRect(360,193,145,127);g.drawRect(2,340,503,130);

     /*nach. velichini*/g.setColor(new Color(0, 0, 80));
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
    g.drawLine((int)(otr*w+XN),YN+6,(int)(otr*w+XN),(int)(all2*w2+YN-1+ost2));
    g.drawLine(XN+1,(int)((all2-otr2)*w2+YN),(int)(all*w+XN-2+ost),(int)((all2-otr2)*w2+YN));
    Stringer.drawString("f(x)",(int)(otr*w+XN+6),YN+11); Stringer.drawString("x",(int)(all*w+XN-13+ost),(int)((all2-otr2)*w2+YN+10));
    int a1[]={(int)(otr*w+XN-5),(int)(otr*w+XN),(int)(otr*w+XN+5)}, b1[]={YN+7,YN,YN+7};
    int a2[]={(int)(all*w+XN-6+ost),(int)(all*w+XN-1+ost),(int)(all*w+XN-6+ost)}, b2[]={(int)((all2-otr2)*w2+YN-5),(int)((all2-otr2)*w2+YN),(int)((all2-otr2)*w2+YN+5)};
    g.fillPolygon(a1,b1,3);
    g.fillPolygon(a2,b2,3);
    Stringer.fonts[0] = new Font("SansSerif", 1, ds-3);
    for(int i=(int)(0.1-otr); i<(int)(all-otr+0.9); i++){
      g.setColor(Color.black);
      g.drawLine((int)(otr*w+XN+w*i),(int)((all2-otr2)*w2+YN-3),(int)(otr*w+XN+w*i),(int)((all2-otr2)*w2+YN+3));
      g.setColor(Color.darkGray);
      if((i%2==0 || w>15) && i!=0) Stringer.drawString(""+i,(int)(otr*w+XN-3+w*i-(int)(i/9)*2),(int)((all2-otr2)*w2+YN+16));
    }
    for(int i=(int)(0.1-otr2); i<(int)(all2-otr2+0.9); i++){
      g.setColor(Color.black);
      g.drawLine((int)(otr*w+XN-3),(int)((all2-otr2)*w2+YN-w2*i),(int)(otr*w+XN+3),(int)((all2-otr2)*w2+YN-w2*i));
      g.setColor(Color.darkGray);
      if((i%2==0 || w2>15) && i!=0) Stringer.drawString(""+i,(int)(otr*w+XN-14-(int)(i/9)*4),(int)((all2-otr2)*w2+YN+4-w2*i));
    }
    Stringer.drawString("0",(int)(otr*w+XN-8),(int)((all2-otr2)*w2+YN+11));
    g.setColor(Color.blue);
    Stringer.fonts[0] = new Font("Dialog", 1, ds-2);
    Stringer.drawString("f(x) = x^{ 2} - x + 1",180,80);
    Stringer.fonts[0] = new Font("SansSerif", 1, 14);
    g.setColor(new Color(0, 0, 230));
    for(int i=XN+1; i<338+XN; i++)
      if((int)(YN+(all2-otr2)*w2-w2*f(1.0*(i-XN-otr*w)/w))>=YN && (int)(YN+(all2-otr2)*w2-w2*f(1.0*(i-XN-otr*w)/w))<YN+253 &&
         (int)(YN+(all2-otr2)*w2-w2*f(1.0*(i+1-XN-otr*w)/w))>=YN && (int)(YN+(all2-otr2)*w2-w2*f(1.0*(i+1-XN-otr*w)/w))<YN+253)
      g.drawLine(i,(int)(YN+(all2-otr2)*w2-w2*f(1.0*(i-XN-otr*w)/w)),i+1,(int)(YN+(all2-otr2)*w2-w2*f(1.0*(i+1-XN-otr*w)/w)));

    //---------------------

    xSt=5;ySt=360;
    g.setColor(new Color(180, 0, 60));
    Stringer.fonts[0]=new Font("SansSerif", 3, 16);
    Stringer.drawString(""+(num-1)/7+"."+(((num-1) % 7+1)+"."),xSt,ySt);
    Stringer.fonts[0]=new Font("SansSerif", 1, 14);
    if(sh>=0 && sh<7){
      g.setColor(new Color(0, 0, 80)); Stringer.fonts[0]=new Font("SansSerif", 1, 14);
      Stringer.fonts[1]=new Font("SansSerif", 1, 11);
      if(sh==0)
      {
        if(language==0){
          Stringer.drawString("interval of uncertainty    L_{0} = [ a_{0} , b_{0} ] = [ "+a[0]+" , "+b[0]+" ]   ",xSt,ySt+20);
          Stringer.drawString("and let's assume  \u03BE = "+E+" ; \u2113 = "+l+" .",xSt,ySt+40);
          Stringer.drawString("Let's construct function  f(x) = x^{ 2 }- x + 1, let's set initial ",xSt,ySt);
        }
        else
        {
          Stringer.drawString("интервал неопределенности   L_{0} = [ a_{0} , b_{0} ] = [ "+a[0]+" , "+b[0]+" ]   и положим",xSt,ySt+20);
          Stringer.drawString("\u03BE = "+E+" ; \u2113 = "+l+".",xSt,ySt+40);
          Stringer.drawString("Построим функцию  f(x) = x^{ 2 }- x + 1, зададим начальный ",xSt+28,ySt);
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
          Stringer.drawString("a_{"+k+"}",(int)(XN+otr*w+a[k]*w-13),(int)(YN+(all2-otr2)*w2-8));
          Stringer.drawString("b_{"+k+"}",(int)(XN+otr*w+b[k]*w+5),(int)(YN+(all2-otr2)*w2-8));
        }
        g.drawLine((int)(XN+otr*w+a[k]*w),(int)(YN+(all2-otr2)*w2),(int)(XN+otr*w+b[k]*w),(int)(YN+(all2-otr2)*w2));
        g.drawLine((int)(XN+otr*w+a[k]*w),(int)(YN+(all2-otr2)*w2+1),(int)(XN+otr*w+b[k]*w),(int)(YN+(all2-otr2)*w2+1));
        Stringer.fonts[0]=new Font("SansSerif", 1, 14);
        Stringer.drawString("[",(int)(XN+otr*w+a[k]*w-2),(int)(YN+(all2-otr2)*w2+4));
        Stringer.drawString("]",(int)(XN+otr*w+b[k]*w-2),(int)(YN+(all2-otr2)*w2+4));
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
        g.setColor(Color.black); Stringer.fonts[0] = new Font("Dialog", 3, 14);
        Stringer.drawString("Точка y_{"+k+"} найдена правильно.",xSt+100,ySt+65);
        jRadioButton1.setText("Да"); jRadioButton2.setText("Нет");
        jRadioButton1.setEnabled(true); jRadioButton1.setVisible(true);
        jRadioButton2.setEnabled(true); jRadioButton2.setVisible(true);
        jRadioButton1.setBounds(xSt+315,ySt+50,60,20);
        jRadioButton2.setBounds(xSt+315,ySt+70,60,20);
        g.setColor(new Color(0, 0, 80)); Stringer.fonts[0] = new Font("SansSerif", 1, 14);
        if(language==0) Stringer.drawString("We calculate    y_{k}  under the above-stated formula: ",xSt,ySt);
        else Stringer.drawString("Вычисляем  y_{k}  по вышеприведенной формуле: ",xSt+28,ySt);
        btnNext.setEnabled(false);
        if((jRadioButton1.isSelected()==true && (k==0 || k==2)) || (jRadioButton2.isSelected()==true && (k==1 || k==3)))
        {
          g.setColor(Color.blue);
          Stringer.drawString("Правильно",xSt+380,ySt+75);
          if(jRadioButton1.isSelected()==true) jRadioButton2.setEnabled(false);
          if(jRadioButton2.isSelected()==true) jRadioButton1.setEnabled(false);
          if(k==0 || k==2){ btnNext.setEnabled(true); Proverka=1;}
          else
          {
            g.setColor(new Color(0, 0, 80)); Stringer.fonts[0] = new Font("SansSerif", 1, 14);
            if(language==0) Stringer.drawString("Calculate  z_{k}.",xSt,ySt);
            else Stringer.drawString("Вычислите  z_{"+k+"}.",xSt+5,ySt+90);
            Stringer.fonts[0]=new Font("Dialog", 0, 11);
            Stringer.drawString("Вычислeния поизводятся с точностью до трех знаков после запятой.",xSt+75,ySt+105);
            Stringer.fonts[0]=new Font("SansSerif", 1, 14);
            jTF1.setVisible(true);
            jTF1.setEnabled(true);
            jButton1.setVisible(true);
            jButton1.setEnabled(true);
            jButton1.setLocation(xSt+220+Fm.stringWidth("( "+a[k]+" + ( "+b[k]+" ) - "+E+")"), 378);
            if(b[k]>=0) jTF1.setBounds(new Rectangle(xSt+155+Fm.stringWidth("( "+a[k]+" + "+b[k]+" - "+E+")"), 380, 45, 20));
            else jTF1.setBounds(new Rectangle(xSt+155+Fm.stringWidth("( "+a[k]+" + ( "+b[k]+" ) - "+E+")"), 380, 45, 20));
            if( Proverka == 1 ){
              g.setColor(Color.blue); Stringer.fonts[0] = new Font("Dialog", 1, 14);
              Stringer.drawString("Правильно",xSt+130,ySt+90);
              btnNext.setEnabled(true);
              jTF1.setEnabled(false);
              jButton1.setEnabled(false);
            }
            if( Proverka == 0 ){
              g.setColor(Color.red); Stringer.fonts[0] = new Font("Dialog", 1, 14);
              Stringer.drawString("Неправильно",xSt+130,ySt+90);
              if(!entry){Mist_calk[sh]++; entry=true;}
            }
          }
        }
        else if(k==1 || k==3)
        {
          g.setColor(new Color(0, 120, 0));
          Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
          Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
          if(f((y*1000-Math.round(E*1000/2.0))/1000.0)>=0)
          {
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f((y*1000-Math.round(E*1000/2.0))/1000.0))+1; i<YN+(all2-otr2)*w2-5; i=i+9)
              g.drawLine((int)(otr*w+((y*1000-Math.round(E*1000/2.0))/1000.0)*w+XN),i,(int)(otr*w+((y*1000-Math.round(E*1000/2.0))/1000.0)*w+XN),i+6);
            Stringer.drawString("y_{"+k+"}",(int)(XN+otr*w+((y*1000-Math.round(E*1000/2.0))/1000.0)*w+5),(int)(YN+(all2-otr2)*w2-8));
            Stringer.drawString(""+((y*1000-Math.round(E*1000/2.0))/1000.0),(int)(XN+otr*w+((y*1000-Math.round(E*1000/2.0))/1000.0)*w+2),(int)(YN+(all2-otr2)*w2+12));
          }
          if(f((y-Math.round(E*1000/2.0)/1000.0))<0)
          {
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f((y*1000-Math.round(E*1000/2.0))/1000.0))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
              g.drawLine((int)(otr*w+((y*1000-Math.round(E*1000/2.0))/1000.0)*w+XN),i,(int)(otr*w+((y*1000-Math.round(E*1000/2.0))/1000.0)*w+XN),i-6);
            Stringer.drawString("y_{"+k+"}",(int)(XN+otr*w+((y*1000-Math.round(E*1000/2.0))/1000.0)*w+5),(int)(YN+(all2-otr2)*w2-8));
            Stringer.drawString(""+((y*1000-Math.round(E*1000/2.0))/1000.0),(int)(XN+otr*w+((y*1000-Math.round(E*1000/2.0))/1000.0)*w+2),(int)(YN+(all2-otr2)*w2+12));
          }
          g.fillOval((int)(otr*w+(y-Math.round(E*1000/2.0)/1000.0)*w+XN-3),(int)(YN+(all2-otr2)*w2-3),6,6);
          Stringer.fonts[0]=new Font("SansSerif", 1, 14);
          Stringer.fonts[1]=new Font("SansSerif", 1, 11);
        }
        if((jRadioButton1.isSelected()==true && (k==1 || k==3)) || (jRadioButton2.isSelected()==true && (k==0 || k==2)))
        {
          g.setColor(Color.red);
          Stringer.drawString("Неправильно",xSt+380,ySt+80);
          if(!entry){Mist_calk[sh]++; entry=true;}
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
          if(jTF1.isVisible()==false)
            if(k==1 || k==3) Stringer.drawString("= "+((y*1000-Math.round(E*1000/2.0))/1000.0)+".",xSt+142+Fm.stringWidth("( "+a[k]+" + "+b[k]+" - "+E+")"),ySt+35);
            else Stringer.drawString("= "+y+".",xSt+142+Fm.stringWidth("( "+a[k]+" + "+b[k]+" - "+E+")"),ySt+35);
          else Stringer.drawString("= ",xSt+142+Fm.stringWidth("( "+a[k]+" + "+b[k]+" - "+E+")"),ySt+35);
          g.drawLine(xSt+136,ySt+27,xSt+136+Fm.stringWidth("( "+a[k]+" + "+b[k]+" - "+E+")"),ySt+27);
          g.drawLine(xSt+136,ySt+28,xSt+136+Fm.stringWidth("( "+a[k]+" + "+b[k]+" - "+E+")"),ySt+28);
        }
        else{
          Stringer.drawString("( "+a[k]+" + ( "+(b[k])+" ) - "+E+")",xSt+136,ySt+20);
          Stringer.drawString("2",xSt+135+(Fm.stringWidth("( "+a[k]+" + ( "+(b[k])+" ) - "+E+")"))/2,ySt+40);
          if(jTF1.isVisible()==false)
            if(k==1 || k==3) Stringer.drawString("= "+((y*1000-Math.round(E*1000/2.0))/1000.0)+".",xSt+142+Fm.stringWidth("( "+a[k]+" + ( "+(b[k])+" ) - "+E+")"),ySt+35);
            else Stringer.drawString("= "+y+".",xSt+142+Fm.stringWidth("( "+a[k]+" + ( "+(b[k])+" ) - "+E+")"),ySt+35);
          else Stringer.drawString("= ",xSt+142+Fm.stringWidth("( "+a[k]+" + ( "+(b[k])+" ) - "+E+")"),ySt+35);
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
            Stringer.drawString("y_{"+k+"}",(int)(XN+otr*w+y*w-13),(int)(YN+(all2-otr2)*w2-8));
            Stringer.drawString(""+y,(int)(XN+otr*w+y*w-23),(int)(YN+(all2-otr2)*w2+12));
          }
        }
        if(f(y)<0)
        {
          for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y))-1; i>(int)(YN+(all2-otr2)*w2+5); i=i-9)
            g.drawLine((int)(otr*w+y*w+XN),i,(int)(otr*w+y*w+XN),i-6);
          if (sh>=0 && sh<6){
            Stringer.drawString("y_{"+k+"}",(int)(XN+otr*w+y*w-13),(int)(YN+(all2-otr2)*w2-8));
            Stringer.drawString(""+y,(int)(XN+otr*w+y*w-20),(int)(YN+(all2-otr2)*w2+12));
          }
        }

        g.fillOval((int)(otr*w+y*w+XN-3),(int)(YN+(all2-otr2)*w2-3),6,6);
        Stringer.fonts[0]=new Font("SansSerif", 1, 14);
        Stringer.fonts[1]=new Font("SansSerif", 1, 11);
      }
    }
    if (sh>=3 && sh<7){
      g.setColor(new Color(0, 0, 80));
      z=(Math.round((a[k]+b[k]+E)*1000/2.0))/1000.0;
      if (sh==3){
        g.setColor(Color.black); Stringer.fonts[0] = new Font("Dialog", 3, 14);
        Stringer.drawString("Точка z_{"+k+"} найдена правильно.",xSt+100,ySt+65);
        jRadioButton1.setText("Да"); jRadioButton2.setText("Нет");
        jRadioButton1.setEnabled(true); jRadioButton1.setVisible(true);
        jRadioButton2.setEnabled(true); jRadioButton2.setVisible(true);
        jRadioButton1.setBounds(xSt+315,ySt+50,60,20);
        jRadioButton2.setBounds(xSt+315,ySt+70,60,20);
        g.setColor(new Color(0, 0, 80)); Stringer.fonts[0] = new Font("SansSerif", 1, 14);
        if(language==0) Stringer.drawString("We calculate  z_{k}  under the above-stated formula: ",xSt,ySt);
        else Stringer.drawString("Вычисляем  z_{k}  по вышеприведенной формуле: ",xSt+28,ySt);
        btnNext.setEnabled(false);
        if((jRadioButton2.isSelected()==true && (k==0 || k==2)) || (jRadioButton1.isSelected()==true && (k==1 || k==3)))
        {
          g.setColor(Color.blue);
          Stringer.drawString("Правильно",xSt+380,ySt+75);
          if(jRadioButton1.isSelected()==true) jRadioButton2.setEnabled(false);
          if(jRadioButton2.isSelected()==true) jRadioButton1.setEnabled(false);
          if(k==1 || k==3){ btnNext.setEnabled(true); Proverka=1;}
          else
          {
            g.setColor(new Color(0, 0, 80)); Stringer.fonts[0] = new Font("SansSerif", 1, 14);
            if(language==0) Stringer.drawString("Calculate  z_{k}.",xSt,ySt);
            else Stringer.drawString("Вычислите  z_{"+k+"}.",xSt+5,ySt+90);
            Stringer.fonts[0]=new Font("Dialog", 0, 11);
            Stringer.drawString("Вычислeния поизводятся с точностью до трех знаков после запятой.",xSt+75,ySt+105);
            Stringer.fonts[0]=new Font("SansSerif", 1, 14);
            jTF1.setVisible(true);
            jTF1.setEnabled(true);
            jButton1.setVisible(true);
            jButton1.setEnabled(true);
            jButton1.setLocation(xSt+220+Fm.stringWidth("( "+a[k]+" + ( "+b[k]+" ) + "+E+")"), 378);
            if(b[k]>=0) jTF1.setBounds(new Rectangle(xSt+155+Fm.stringWidth("( "+a[k]+" + "+b[k]+" + "+E+")"), 380, 45, 20));
            else jTF1.setBounds(new Rectangle(xSt+155+Fm.stringWidth("( "+a[k]+" + ( "+b[k]+" ) + "+E+")"), 380, 45, 20));
            if( Proverka == 1 ){
              g.setColor(Color.blue); Stringer.fonts[0] = new Font("Dialog", 1, 14);
              Stringer.drawString("Правильно",xSt+130,ySt+90);
              btnNext.setEnabled(true);
              jTF1.setEnabled(false);
              jButton1.setEnabled(false);
            }
            if( Proverka == 0 ){
              g.setColor(Color.red); Stringer.fonts[0] = new Font("Dialog", 1, 14);
              Stringer.drawString("Неправильно",xSt+130,ySt+90);
              if(!entry){Mist_calk[sh]++; entry=true;}
            }
          }
        }
        else if(k==0 || k==2)
        {
          g.setColor(new Color(98, 0, 170));
          Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
          Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
          if(f((z*1000+Math.round(E*1000/2.0))/1000.0)>=0)
          {
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f((z*1000+Math.round(E*1000/2.0))/1000.0))+1; i<YN+(all2-otr2)*w2-5; i=i+9)
              g.drawLine((int)(otr*w+((z*1000+Math.round(E*1000/2.0))/1000.0)*w+XN),i,(int)(otr*w+((z*1000+Math.round(E*1000/2.0))/1000.0)*w+XN),i+6);
            Stringer.drawString("z_{"+k+"}",(int)(XN+otr*w+((z*1000+Math.round(E*1000/2.0))/1000.0)*w+5),(int)(YN+(all2-otr2)*w2-8));
            Stringer.drawString(""+((z*1000+Math.round(E*1000/2.0))/1000.0),(int)(XN+otr*w+((z*1000+Math.round(E*1000/2.0))/1000.0)*w+2),(int)(YN+(all2-otr2)*w2+12));
          }
          if(f((z+Math.round(E*1000/2.0)/1000.0))<0)
          {
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f((z+Math.round(E*1000/2.0)/1000.0)))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
              g.drawLine((int)(otr*w+((z*1000+Math.round(E*1000/2.0))/1000.0)*w+XN),i,(int)(otr*w+((z*1000+Math.round(E*1000/2.0))/1000.0)*w+XN),i-6);
            Stringer.drawString("z_{"+k+"}",(int)(XN+otr*w+((z*1000+Math.round(E*1000/2.0))/1000.0)*w+5),(int)(YN+(all2-otr2)*w2-8));
            Stringer.drawString(""+(z+Math.round(E*1000/2.0)/1000.0),(int)(XN+otr*w+((z*1000+Math.round(E*1000/2.0))/1000.0)*w+2),(int)(YN+(all2-otr2)*w2+12));
          }
          g.fillOval((int)(otr*w+(z+Math.round(E*1000/2.0)/1000.0)*w+XN-3),(int)(YN+(all2-otr2)*w2-3),6,6);
          Stringer.fonts[0]=new Font("SansSerif", 1, 14);
          Stringer.fonts[1]=new Font("SansSerif", 1, 11);
        }
        if((jRadioButton2.isSelected()==true && (k==1 || k==3)) || (jRadioButton1.isSelected()==true && (k==0 || k==2)))
        {
          g.setColor(Color.red);
          Stringer.drawString("Неправильно",xSt+380,ySt+75);
          if(!entry){Mist_calk[sh]++; entry=true;}
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
          if(jTF1.isVisible()==false)
            if(k==0 || k==2) Stringer.drawString("= "+((z*1000+Math.round(E*1000/2.0))/1000.0)+".",xSt+142+Fm.stringWidth("( "+a[k]+" + "+b[k]+" + "+E+")"),ySt+35);
            else Stringer.drawString("= "+z+".",xSt+142+Fm.stringWidth("( "+a[k]+" + "+b[k]+" + "+E+")"),ySt+35);
          else Stringer.drawString("= ",xSt+142+Fm.stringWidth("( "+a[k]+" + "+b[k]+" + "+E+")"),ySt+35);
          g.drawLine(xSt+136,ySt+27,xSt+136+Fm.stringWidth("( "+a[k]+" + "+b[k]+" + "+E+")"),ySt+27);
          g.drawLine(xSt+136,ySt+28,xSt+136+Fm.stringWidth("( "+a[k]+" + "+b[k]+" + "+E+")"),ySt+28);
        }
        else{
          Stringer.drawString("( "+a[k]+" + ( "+(b[k])+" ) + "+E+")",xSt+136,ySt+20);
          Stringer.drawString("2",xSt+135+(Fm.stringWidth("( "+a[k]+" + ( "+(b[k])+" ) + "+E+")"))/2,ySt+40);
          if(jTF1.isVisible()==false)
            if(k==0 || k==2) Stringer.drawString("= "+((z*1000+Math.round(E*1000/2.0))/1000.0)+".",xSt+142+Fm.stringWidth("( "+a[k]+" + ( "+(b[k])+" ) + "+E+")"),ySt+35);
            else Stringer.drawString("= "+z+".",xSt+142+Fm.stringWidth("( "+a[k]+" + ( "+(b[k])+" ) + "+E+")"),ySt+35);
          else Stringer.drawString("= ",xSt+142+Fm.stringWidth("( "+a[k]+" + ( "+(b[k])+" ) + "+E+")"),ySt+35);
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
            Stringer.drawString("z_{"+k+"}",(int)(XN+otr*w+z*w+5),(int)(YN+(all2-otr2)*w2-8));
            Stringer.drawString(""+z,(int)(XN+otr*w+z*w+2),(int)(YN+(all2-otr2)*w2+12));
          }
        }
        if(f(z)<0)
        {
          for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
            g.drawLine((int)(otr*w+z*w+XN),i,(int)(otr*w+z*w+XN),i-6);
          if (sh>=0 && sh<6){
            Stringer.drawString("z_{"+k+"}",(int)(XN+otr*w+z*w+5),(int)(YN+(all2-otr2)*w2-8));
            Stringer.drawString(""+z,(int)(XN+otr*w+z*w+2),(int)(YN+(all2-otr2)*w2+12));
          }
        }
        g.fillOval((int)(otr*w+z*w+XN-3),(int)(YN+(all2-otr2)*w2-3),6,6);
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
        if (f(y)<f(z))
          if(y>=0) Stringer.drawString(""+(Math.round(f(y)*1000))/1000.0,(int)(XN+otr*w-5-Fm1.stringWidth(""+(Math.round(f(y)*1000))/1000.0)),(int)(YN+(all2-otr2)*w2-f(y)*w2)+8);
          else  Stringer.drawString(""+(Math.round(f(y)*1000))/1000.0,(int)(XN+otr*w+5),(int)(YN+(all2-otr2)*w2-f(y)*w2)+8);
        else
          if(y>=0) Stringer.drawString(""+(Math.round(f(y)*1000))/1000.0,(int)(XN+otr*w-5-Fm1.stringWidth(""+(Math.round(f(y)*1000))/1000.0)),(int)(YN+(all2-otr2)*w2-f(y)*w2)-2);
          else Stringer.drawString(""+(Math.round(f(y)*1000))/1000.0,(int)(XN+otr*w+5),(int)(YN+(all2-otr2)*w2-f(y)*w2)-2);
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
          if (f(y)<f(z))
            if(z>=0) Stringer.drawString(""+(Math.round(f(z)*1000))/1000.0,(int)(XN+otr*w-5-Fm1.stringWidth(""+(Math.round(f(z)*1000))/1000.0)),(int)(YN+(all2-otr2)*w2-f(z)*w2)-2);
            else Stringer.drawString(""+(Math.round(f(z)*1000))/1000.0,(int)(XN+otr*w+5),(int)(YN+(all2-otr2)*w2-f(z)*w2)-2);
          else
            if(z>=0) Stringer.drawString(""+(Math.round(f(z)*1000))/1000.0,(int)(XN+otr*w-5-Fm1.stringWidth(""+(Math.round(f(z)*1000))/1000.0)),(int)(YN+(all2-otr2)*w2-f(z)*w2)+8);
            else Stringer.drawString(""+(Math.round(f(z)*1000))/1000.0,(int)(XN+otr*w+5),(int)(YN+(all2-otr2)*w2-f(z)*w2)+8);
          Stringer.fonts[0]=new Font("SansSerif", 1, 14);
          Stringer.fonts[1]=new Font("SansSerif", 1, 11);
        }
        if(sh>=6){
          g.setColor(new Color(0, 0, 80));  Stringer.fonts[0]=new Font("SansSerif", 1, 14);
          if (sh==6){
            btnNext.setEnabled(false);
            if((Math.round(f(y)*1000))/1000.0<(Math.round(f(z)*1000))/1000.0){
              if(language==0) Stringer.drawString("In this case  f( y_{"+k+"} ) < f( z_{"+k+"} ), therefore",xSt+28,ySt);
              else Stringer.drawString("Сравним f( y_{"+k+"} ) и  f( z_{"+k+"} ): f( y_{"+k+"} ) < f( z_{"+k+"} ).",xSt+28,ySt);
            }
            else if((Math.round(f(y)*1000))/1000.0==(Math.round(f(z)*1000))/1000.0){
                   if(language==0) Stringer.drawString("In this case  f( y_{"+k+"} ) = f( z_{"+k+"} ), therefore",xSt+28,ySt);
                   else Stringer.drawString("Сравним f( y_{"+k+"} ) и  f( z_{"+k+"} ): f( y_{"+k+"} ) = f( z_{"+k+"} ).",xSt+28,ySt);
                 }
                 else{
                   if(language==0) Stringer.drawString("In this case  f( y_{"+k+"} ) > f( z_{"+k+"} ), therefore",xSt+28,ySt);
                   else Stringer.drawString("Сравним f( y_{"+k+"} ) и  f( z_{"+k+"} ): f( y_{"+k+"} ) > f( z_{"+k+"} ).",xSt+28,ySt);
                 }
            jRadioButton1.setText(""); jRadioButton2.setText(""); jRadioButton3.setText("");
            jRadioButton1.setEnabled(true); jRadioButton1.setVisible(true);
            jRadioButton2.setEnabled(true); jRadioButton2.setVisible(true);
            jRadioButton3.setEnabled(true); jRadioButton3.setVisible(true);
            jRadioButton1.setBounds(xSt+20,ySt+30,16,20);
            jRadioButton2.setBounds(xSt+20,ySt+50,16,20);
            jRadioButton3.setBounds(xSt+20,ySt+70,16,20);
            g.setColor(Color.black);  Stringer.fonts[0]=new Font("Dialog", 3, 14);
            switch (k)
            {
              case 0:
                Stringer.drawString("Тогда новый интервал неопределенности будет [y_{0}, z_{0}].",xSt,ySt+20);
                Stringer.fonts[0]=new Font("Dialog", 3, 13);
                Stringer.drawString("Нет, должен быть [a_{0}, z_{0}]",xSt+40,ySt+45);
                Stringer.drawString("Нет, должен быть [z_{0}, b_{0}]",xSt+40,ySt+65);
                Stringer.drawString("Да",xSt+40,ySt+85);
                if(jRadioButton1.isSelected()==true)
                {
                  g.setColor(new Color(0, 0, 80));  Stringer.fonts[0]=new Font("SansSerif", 1, 14);
                  Stringer.drawString("Положим a_{1} = a_{0} = "+a[0]+";",xSt+279,ySt+70);
                  Stringer.drawString("b_{1} = z_{0} = "+z+".",xSt+350,ySt+90);
                  g.setColor(Color.lightGray); Stringer.fonts[0]=new Font("Dialog", 3, 13);
                  jRadioButton2.setEnabled(false); jRadioButton3.setEnabled(false);
                  Stringer.drawString("Нет, должен быть [z_{0}, b_{0}]",xSt+40,ySt+65);
                  Stringer.drawString("Да",xSt+40,ySt+85);
                  g.setColor(Color.blue); Stringer.fonts[0]=new Font("Dialog", 1, 14);
                  Stringer.drawString("Правильно",xSt+230,ySt+46);
                  Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
                  Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
                  a[k+1]=a[k];
                  b[k+1]=z;
                  g.setColor(new Color(98, 0, 170));
                  for (int i=(int)(YN+w2*(all2-otr2)-f(z)*w2);i<YN+w2*(all2-otr2)-3;i+=9)
                    g.drawLine((int)(z*w+XN+otr*w),i,(int)(z*w+XN+otr*w),i+6);
                  Stringer.drawString(""+z,(int)(XN+otr*w+z*w+2),(int)(YN+(all2-otr2)*w2+12));
                  g.fillOval((int)(z*w+XN+otr*w-3),(int)(YN+w2*(all2-otr2)-3),6,6);
                  g.setColor(new Color(0, 120, 0));
                  for (int i=(int)(YN+w2*(all2-otr2)-f(y)*w2);i<YN+w2*(all2-otr2)-3;i+=9)
                    g.drawLine((int)(y*w+XN+otr*w),i,(int)(y*w+XN+otr*w),i+6);
                  Stringer.drawString(""+y,(int)(XN+otr*w+y*w-23),(int)(YN+(all2-otr2)*w2+12));
                  g.fillOval((int)(y*w+XN+otr*w-3),(int)(YN+w2*(all2-otr2)-3),6,6);
                  Stringer.drawString("y_{"+k+"}",(int)(y*w+XN+otr*w-13),(int)(YN+w2*(all2-otr2)-8));
                  g.setColor(new Color(0, 0, 130));
                  Stringer.drawString("a_{"+(k+1)+"} = a_{"+k+"}",(int)(a[k+1]*w+XN+otr*w-40),(int)(YN+w2*(all2-otr2)-8));
                  g.setColor(new Color(98, 0, 170));
                  for (int i=(int)(YN+w2*(all2-otr2)-f(z)*w2);i<(int)(YN+w2*(all2-otr2)-3); i+=9)
                    g.drawLine((int)(z*w+XN+otr*w),i,(int)(z*w+XN+otr*w),i+6);
                  g.fillOval((int)(z*w+XN+otr*w-3),(int)(YN+w2*(all2-otr2)-3),6,6);
                  Stringer.drawString("z_{"+k+"} = b_{"+(k+1)+"}",(int)(b[k+1]*w+XN+otr*w+5),(int)(YN+w2*(all2-otr2)-8));
                  g.setColor(new Color(0, 0, 130));
                  Stringer.drawString("b_{"+k+"}",(int)(XN+otr*w+b[k]*w+5),(int)(YN+(all2-otr2)*w2-8));
                }
                break;
              case 1:
                Stringer.drawString("Тогда новый интервал неопределенности будет [a_{1}, z_{1}].",xSt,ySt+20);
                Stringer.fonts[0]=new Font("Dialog", 3, 13);
                Stringer.drawString("Нет, должен быть [a_{1}, y_{1}]",xSt+40,ySt+45);
                Stringer.drawString("Нет, должен быть [y_{1}, b_{1}]",xSt+40,ySt+65);
                Stringer.drawString("Да",xSt+40,ySt+85);
                if(jRadioButton2.isSelected()==true)
                {
                  g.setColor(new Color(0, 0, 80));  Stringer.fonts[0]=new Font("SansSerif", 1, 14);
                  Stringer.drawString("Положим a_{2} = y_{1} = "+y+";",xSt+279,ySt+70);
                  Stringer.drawString("b_{2} = b_{1} = "+b[1]+".",xSt+350,ySt+90);
                  g.setColor(Color.lightGray); Stringer.fonts[0]=new Font("Dialog", 3, 13);
                  jRadioButton1.setEnabled(false); jRadioButton3.setEnabled(false);
                  Stringer.drawString("Нет, должен быть [a_{1}, y_{1}]",xSt+40,ySt+45);
                  Stringer.drawString("Да",xSt+40,ySt+85);
                  g.setColor(Color.blue); Stringer.fonts[0]=new Font("Dialog", 1, 14);
                  Stringer.drawString("Правильно",xSt+230,ySt+46);
                  Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
                  Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
                  a[k+1]=y;
                  b[k+1]=b[k];
                  g.setColor(new Color(0, 120, 0));
                  for (int i=(int)(YN+w2*(all2-otr2)-f(y)*w2);i<(int)(YN+w2*(all2-otr2)-3); i+=9)
                    g.drawLine((int)(y*w+XN+otr*w),i,(int)(y*w+XN+otr*w),i+6);
                  g.fillOval((int)(y*w+XN+otr*w-3),(int)(YN+w2*(all2-otr2)-3),6,6);
                  Stringer.drawString(""+y,(int)(XN+otr*w+y*w-23),(int)(YN+(all2-otr2)*w2+12));
                  g.setColor(new Color(98, 0, 170));
                  for (int i=(int)(YN+w2*(all2-otr2)-f(z)*w2);i<YN+w2*(all2-otr2)-3;i+=9)
                    g.drawLine((int)(z*w+XN+otr*w),i,(int)(z*w+XN+otr*w),i+6);
                  Stringer.drawString(""+z,(int)(XN+otr*w+z*w+2),(int)(YN+(all2-otr2)*w2+12));
                  g.fillOval((int)(z*w+XN+otr*w-3),(int)(YN+w2*(all2-otr2)-3),6,6);
                  Stringer.drawString("z_{"+k+"}",(int)(z*w+XN+otr*w+5),(int)(YN+w2*(all2-otr2)-8));
                  g.setColor(new Color(0, 120, 0));
                  Stringer.drawString("a_{"+(k+1)+"} = y_{"+k+"}",(int)(a[k+1]*w+XN+otr*w-38),(int)(YN+w2*(all2-otr2)-8));
                  g.setColor(new Color(0, 0, 130));
                  for (int i=(int)(YN+w2*(all2-otr2)-f(y)*w2);i<(int)(YN+w2*(all2-otr2)-3); i+=9)
                    g.drawLine((int)(y*w+XN+otr*w),i,(int)(y*w+XN+otr*w),i+6);
                  g.fillOval((int)(y*w+XN+otr*w-3),(int)(YN+w2*(all2-otr2)-3),6,6);
                  Stringer.drawString("b_{"+(k+1)+"} = b_{"+k+"}",(int)(b[k+1]*w+XN+otr*w+5),(int)(YN+w2*(all2-otr2)-8));
                  Stringer.drawString("a_{"+k+"}",(int)(XN+otr*w+a[k]*w-13),(int)(YN+(all2-otr2)*w2-8));
                }
                break;
              case 2:
                Stringer.drawString("Тогда новый интервал неопределенности будет [y_{2}, b_{2}].",xSt,ySt+20);
                Stringer.fonts[0]=new Font("Dialog", 3, 13);
                Stringer.drawString("Нет, должен быть [a_{2}, z_{2}]",xSt+40,ySt+45);
                Stringer.drawString("Нет, должен быть [z_{2}, b_{2}]",xSt+40,ySt+65);
                Stringer.drawString("Да",xSt+40,ySt+85);
                if(jRadioButton3.isSelected()==true)
                {
                  g.setColor(new Color(0, 0, 80));  Stringer.fonts[0]=new Font("SansSerif", 1, 14);
                  Stringer.drawString("Положим a_{3} = y_{2} = "+y+";",xSt+279,ySt+70);
                  Stringer.drawString("b_{3} = b_{2} = "+b[2]+".",xSt+350,ySt+90);
                  g.setColor(Color.lightGray); Stringer.fonts[0]=new Font("Dialog", 3, 13);
                  jRadioButton1.setEnabled(false); jRadioButton2.setEnabled(false);
                  Stringer.drawString("Нет, должен быть [a_{2}, z_{2}]",xSt+40,ySt+45);
                  Stringer.drawString("Нет, должен быть [z_{2}, b_{2}]",xSt+40,ySt+65);
                  g.setColor(Color.blue); Stringer.fonts[0]=new Font("Dialog", 1, 14);
                  Stringer.drawString("Правильно",xSt+230,ySt+46);
                  Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
                  Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
                  a[k+1]=y;
                  b[k+1]=b[k];
                  g.setColor(new Color(0, 120, 0));
                  for (int i=(int)(YN+w2*(all2-otr2)-f(y)*w2);i<(int)(YN+w2*(all2-otr2)-3); i+=9)
                    g.drawLine((int)(y*w+XN+otr*w),i,(int)(y*w+XN+otr*w),i+6);
                  g.fillOval((int)(y*w+XN+otr*w-3),(int)(YN+w2*(all2-otr2)-3),6,6);
                  Stringer.drawString(""+y,(int)(XN+otr*w+y*w-23),(int)(YN+(all2-otr2)*w2+12));
                  g.setColor(new Color(98, 0, 170));
                  for (int i=(int)(YN+w2*(all2-otr2)-f(z)*w2);i<YN+w2*(all2-otr2)-3;i+=9)
                    g.drawLine((int)(z*w+XN+otr*w),i,(int)(z*w+XN+otr*w),i+6);
                  Stringer.drawString(""+z,(int)(XN+otr*w+z*w+2),(int)(YN+(all2-otr2)*w2+12));
                  g.fillOval((int)(z*w+XN+otr*w-3),(int)(YN+w2*(all2-otr2)-3),6,6);
                  Stringer.drawString("z_{"+k+"}",(int)(z*w+XN+otr*w+5),(int)(YN+w2*(all2-otr2)-8));
                  g.setColor(new Color(0, 120, 0));
                  Stringer.drawString("a_{"+(k+1)+"} = y_{"+k+"}",(int)(a[k+1]*w+XN+otr*w-38),(int)(YN+w2*(all2-otr2)-8));
                  g.setColor(new Color(0, 0, 130));
                  for (int i=(int)(YN+w2*(all2-otr2)-f(y)*w2);i<(int)(YN+w2*(all2-otr2)-3); i+=9)
                    g.drawLine((int)(y*w+XN+otr*w),i,(int)(y*w+XN+otr*w),i+6);
                  g.fillOval((int)(y*w+XN+otr*w-3),(int)(YN+w2*(all2-otr2)-3),6,6);
                  Stringer.drawString("b_{"+(k+1)+"} = b_{"+k+"}",(int)(b[k+1]*w+XN+otr*w+5),(int)(YN+w2*(all2-otr2)-8));
                  Stringer.drawString("a_{"+k+"}",(int)(XN+otr*w+a[k]*w-13),(int)(YN+(all2-otr2)*w2-8));
                }
                break;
              case 3:
                Stringer.drawString("Тогда новый интервал неопределенности будет [a_{3}, b_{3}].",xSt,ySt+20);
                Stringer.fonts[0]=new Font("Dialog", 3, 13);
                Stringer.drawString("Нет, должен быть [a_{3}, z_{3}]",xSt+40,ySt+45);
                Stringer.drawString("Нет, должен быть [y_{3}, b_{3}]",xSt+40,ySt+65);
                Stringer.drawString("Да",xSt+40,ySt+85);
                if(jRadioButton2.isSelected()==true)
                {
                  g.setColor(new Color(0, 0, 80));  Stringer.fonts[0]=new Font("SansSerif", 1, 14);
                  Stringer.drawString("Положим a_{4} = y_{3} = "+y+";",xSt+279,ySt+70);
                  Stringer.drawString("b_{4} = b_{3} = "+b[3]+".",xSt+350,ySt+90);
                  g.setColor(Color.lightGray); Stringer.fonts[0]=new Font("Dialog", 3, 13);
                  jRadioButton1.setEnabled(false); jRadioButton3.setEnabled(false);
                  Stringer.drawString("Нет, должен быть [a_{3}, z_{3}]",xSt+40,ySt+45);
                  Stringer.drawString("Да",xSt+40,ySt+85);
                  g.setColor(Color.blue); Stringer.fonts[0]=new Font("Dialog", 1, 14);
                  Stringer.drawString("Правильно",xSt+230,ySt+46);
                  Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
                  Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
                  a[k+1]=y;
                  b[k+1]=b[k];
                  g.setColor(new Color(0, 120, 0));
                  for (int i=(int)(YN+w2*(all2-otr2)-f(y)*w2);i<(int)(YN+w2*(all2-otr2)-3); i+=9)
                    g.drawLine((int)(y*w+XN+otr*w),i,(int)(y*w+XN+otr*w),i+6);
                  g.fillOval((int)(y*w+XN+otr*w-3),(int)(YN+w2*(all2-otr2)-3),6,6);
                  Stringer.drawString(""+y,(int)(XN+otr*w+y*w-23),(int)(YN+(all2-otr2)*w2+12));
                  g.setColor(new Color(98, 0, 170));
                  for (int i=(int)(YN+w2*(all2-otr2)-f(z)*w2);i<YN+w2*(all2-otr2)-3;i+=9)
                    g.drawLine((int)(z*w+XN+otr*w),i,(int)(z*w+XN+otr*w),i+6);
                  Stringer.drawString(""+z,(int)(XN+otr*w+z*w+2),(int)(YN+(all2-otr2)*w2+12));
                  g.fillOval((int)(z*w+XN+otr*w-3),(int)(YN+w2*(all2-otr2)-3),6,6);
                  Stringer.drawString("z_{"+k+"}",(int)(z*w+XN+otr*w+5),(int)(YN+w2*(all2-otr2)-8));
                  g.setColor(new Color(0, 120, 0));
                  Stringer.drawString("a_{"+(k+1)+"} = y_{"+k+"}",(int)(a[k+1]*w+XN+otr*w-38),(int)(YN+w2*(all2-otr2)-8));
                  g.setColor(new Color(0, 0, 130));
                  for (int i=(int)(YN+w2*(all2-otr2)-f(y)*w2);i<(int)(YN+w2*(all2-otr2)-3); i+=9)
                    g.drawLine((int)(y*w+XN+otr*w),i,(int)(y*w+XN+otr*w),i+6);
                  g.fillOval((int)(y*w+XN+otr*w-3),(int)(YN+w2*(all2-otr2)-3),6,6);
                  Stringer.drawString("b_{"+(k+1)+"} = b_{"+k+"}",(int)(b[k+1]*w+XN+otr*w+5),(int)(YN+w2*(all2-otr2)-8));
                  Stringer.drawString("a_{"+k+"}",(int)(XN+otr*w+a[k]*w-13),(int)(YN+(all2-otr2)*w2-8));
                }
                break;
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
              Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
              Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
              g.setColor(new Color(0, 0, 130));
              Stringer.drawString("a_{"+k+"}",(int)(XN+otr*w+a[k]*w-13),(int)(YN+(all2-otr2)*w2-8));
              Stringer.drawString("b_{"+k+"}",(int)(XN+otr*w+b[k]*w+5),(int)(YN+(all2-otr2)*w2-8));
              g.setColor(new Color(0, 120, 0));
              if(f(y)>=0)
              {
                for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y))+1; i<(int)(YN+(all2-otr2)*w2-5); i=i+9)
                  g.drawLine((int)(otr*w+y*w+XN),i,(int)(otr*w+y*w+XN),i+6);
                Stringer.drawString("y_{"+k+"}",(int)(XN+otr*w+y*w-13),(int)(YN+(all2-otr2)*w2-8));
                Stringer.drawString(""+y,(int)(XN+otr*w+y*w-23),(int)(YN+(all2-otr2)*w2+12));
              }
              if(f(y)<0)
              {
                for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y))-1; i>(int)(YN+(all2-otr2)*w2+5); i=i-9)
                  g.drawLine((int)(otr*w+y*w+XN),i,(int)(otr*w+y*w+XN),i-6);
                Stringer.drawString("y_{"+k+"}",(int)(XN+otr*w+y*w-13),(int)(YN+(all2-otr2)*w2-8));
                Stringer.drawString(""+y,(int)(XN+otr*w+y*w-20),(int)(YN+(all2-otr2)*w2+12));
              }
              g.setColor(new Color(98, 0, 170));
              if(f(z)>=0)
              {
                for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z))+1; i<(int)(YN+(all2-otr2)*w2-5); i=i+9)
                  g.drawLine((int)(otr*w+z*w+XN),i,(int)(otr*w+z*w+XN),i+6);
                Stringer.drawString("z_{"+k+"}",(int)(XN+otr*w+z*w+5),(int)(YN+(all2-otr2)*w2-8));
                Stringer.drawString(""+z,(int)(XN+otr*w+z*w+2),(int)(YN+(all2-otr2)*w2+12));
              }
              if(f(z)<0)
              {
                for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z))-1; i>(int)(YN+(all2-otr2)*w2+5); i=i-9)
                  g.drawLine((int)(otr*w+z*w+XN),i,(int)(otr*w+z*w+XN),i-6);
                Stringer.drawString("z_{"+k+"}",(int)(XN+otr*w+z*w+5),(int)(YN+(all2-otr2)*w2-8));
                Stringer.drawString(""+z,(int)(XN+otr*w+z*w+2),(int)(YN+(all2-otr2)*w2+12));
              }
              Stringer.fonts[0]=new Font("SansSerif", 1, 14);
              Stringer.fonts[1]=new Font("SansSerif", 1, 11);
              g.setColor(new Color(0, 0, 80));  Stringer.fonts[0]=new Font("SansSerif", 1, 14);
              if(jRadioButton1.isSelected() || jRadioButton2.isSelected() || jRadioButton3.isSelected())
              {
                g.setColor(Color.red); Stringer.fonts[0]=new Font("Dialog", 1, 14);
                Stringer.drawString("Неправильно",xSt+230,ySt+46);
                Stringer.fonts[0]=new Font("SansSerif", 1, 14);
                if(!entry){Mist_under[sh]++; entry=true;}
              }
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
        g.drawLine((int)(XN+otr*w+a[k+1]*w),(int)(YN+w2*(all2-otr2)),(int)(XN+otr*w+b[k+1]*w),(int)(YN+w2*(all2-otr2)));
        g.drawLine((int)(XN+otr*w+a[k+1]*w),(int)(YN+w2*(all2-otr2)+1),(int)(XN+otr*w+b[k+1]*w),(int)(YN+w2*(all2-otr2)+1));
        Stringer.fonts[0]=new Font("SansSerif", 1, 14);
        Stringer.fonts[1]=new Font("SansSerif", 1, 11);
        Stringer.drawString("[",(int)(XN+otr*w+a[k+1]*w-2),(int)(YN+(all2-otr2)*w2+4));
        Stringer.drawString("]",(int)(XN+otr*w+b[k+1]*w-2),(int)(YN+(all2-otr2)*w2+4));
        g.setColor(new Color(0, 0, 130));
        Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
        Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
        Stringer.drawString("a_{"+(k+1)+"}",(int)(a[k+1]*w+XN+otr*w-13),(int)(YN+(all2-otr2)*w2-8));
        Stringer.drawString("b_{"+(k+1)+"}",(int)(b[k+1]*w+XN+otr*w+5),(int)(YN+(all2-otr2)*w2-8));

        if( Proverka == 1 ){
          if(Math.abs(b[k+1]-a[k+1])<=l && sh==10){
            g.setColor(Color.red);
            g.fillOval((int)((a[k+1]+b[k+1])*w/2.0+XN+otr*w-3),(int)(YN+(all2-otr2)*w2-3),6,6);
            Stringer.drawString("x^{*}",(int)((a[k+1]+b[k+1])*w/2.0+XN+otr*w-10),(int)(YN+(all2-otr2)*w2+25));
            if((int)(YN+(all2-otr2)*w2-f((a[k+1]+b[k+1])/2.0)*w2)>(int)(YN+(all2-otr2)*w2)){
              for(int i=(int)(YN+(all2-otr2)*w2-f((a[k+1]+b[k+1])/2.0)*w2); i>(int)(YN+(all2-otr2)*w2+3); i-=9)
                g.drawLine((int)((a[k+1]+b[k+1])*w/2.0+XN+otr*w),i,(int)((a[k+1]+b[k+1])*w/2.0+XN+otr*w),i-6);
            }
            else{
              for(int i=(int)(YN+(all2-otr2)*w2-f((a[k+1]+b[k+1])/2.0)*w2); i<(int)(YN+(all2-otr2)*w2-3); i+=9)
                g.drawLine((int)((a[k+1]+b[k+1])*w/2.0+XN+otr*w),i,(int)((a[k+1]+b[k+1])*w/2.0+XN+otr*w),i+6);
            }
            Stringer.drawString(""+(Math.round((a[k+1]+b[k+1])*1000/2.0)/1000.0),(int)((a[k+1]+b[k+1])*w/2.0+XN+otr*w-10),(int)(YN+(all2-otr2)*w2+15));
          }
          else{
            g.setColor(new Color(180, 0, 60));
            g.fillOval((int)((a[k+1]+b[k+1])*w/2.0+XN+otr*w-3),(int)(YN+(all2-otr2)*w2-3),6,6);
            if((int)(YN+(all2-otr2)*w2-f((a[k+1]+b[k+1])/2.0)*w2)>(int)(YN+(all2-otr2)*w2)){
              for (int i=(int)(YN+(all2-otr2)*w2-f((a[k+1]+b[k+1])/2.0)*w2); i>(int)(YN+(all2-otr2)*w2+3); i-=9)
                g.drawLine((int)((a[k+1]+b[k+1])*w/2.0+XN+otr*w),i,(int)((a[k+1]+b[k+1])*w/2.0+XN+otr*w),i-6);
            }
            else{
              for (int i=(int)(YN+(all2-otr2)*w2-f((a[k+1]+b[k+1])/2.0)*w2); i<(int)(YN+(all2-otr2)*w2-3); i+=9)
                g.drawLine((int)((a[k+1]+b[k+1])*w/2.0+XN+otr*w),i,(int)((a[k+1]+b[k+1])*w/2.0+XN+otr*w),i+6);
            }
            Stringer.drawString(""+(Math.round((a[k+1]+b[k+1])*1000/2.0)/1000.0),(int)((a[k+1]+b[k+1])*w/2.0+XN+otr*w-10),(int)(YN+(all2-otr2)*w2+15));
          }
        }
        Stringer.fonts[0]=new Font("SansSerif", 1, 14);
        Stringer.fonts[1]=new Font("SansSerif", 1, 11);
      }

      if(sh==7){
        btnNext.setEnabled(false);
        jRadioButton1.setText(""); jRadioButton2.setText(""); jRadioButton3.setText("");
        jRadioButton1.setEnabled(true); jRadioButton1.setVisible(true);
        jRadioButton2.setEnabled(true); jRadioButton2.setVisible(true);
        jRadioButton3.setEnabled(true); jRadioButton3.setVisible(true);
        jRadioButton1.setBounds(xSt+20,ySt+30,16,20);
        jRadioButton2.setBounds(xSt+20,ySt+50,16,20);
        jRadioButton3.setBounds(xSt+20,ySt+70,16,20);
        g.setColor(Color.black); Stringer.fonts[0]=new Font("Dialog", 3, 14);
        switch (k)
        {
          case 0:
            Stringer.drawString("Переходим к следующей итерации.",xSt+5,ySt+23);
            Stringer.fonts[0]=new Font("Dialog", 3, 13);
            Stringer.drawString("Да,   т.к. | L_{"+2*(k+1)+"} | > \u03BE",xSt+40,ySt+45);
            Stringer.drawString("Да,   т.к. | L_{"+2*(k+1)+"} | > \u2113",xSt+40,ySt+65);
            Stringer.drawString("Нет, т.к. | L_{"+2*(k+1)+"} | < \u03BE",xSt+40,ySt+85);
            if(jRadioButton2.isSelected())
            {
              jRadioButton1.setEnabled(false); jRadioButton3.setEnabled(false);
              g.setColor(Color.lightGray); Stringer.fonts[0]=new Font("Dialog", 3, 13);
              Stringer.drawString("Да,   т.к. | L_{"+2*(k+1)+"} | > \u03BE",xSt+40,ySt+45);
              Stringer.drawString("Нет, т.к. | L_{"+2*(k+1)+"} | < \u03BE",xSt+40,ySt+85);
            }
            break;
          case 1:
            Stringer.drawString("Переходим к следующей итерации.",xSt+5,ySt+23);
            Stringer.fonts[0]=new Font("Dialog", 3, 13);
            Stringer.drawString("Да,   т.к. | L_{"+2*(k+1)+"} | > \u2113",xSt+40,ySt+45);
            Stringer.drawString("Да,   т.к. | L_{"+2*(k+1)+"} | > \u03BE",xSt+40,ySt+65);
            Stringer.drawString("Нет, т.к. | L_{"+2*(k+1)+"} | < \u2113",xSt+40,ySt+85);
            if(jRadioButton1.isSelected())
            {
              jRadioButton2.setEnabled(false); jRadioButton3.setEnabled(false);
              g.setColor(Color.lightGray); Stringer.fonts[0]=new Font("Dialog", 3, 13);
              Stringer.drawString("Да,   т.к. | L_{"+2*(k+1)+"} | > \u03BE",xSt+40,ySt+65);
              Stringer.drawString("Нет, т.к. | L_{"+2*(k+1)+"} | < \u2113",xSt+40,ySt+85);
            }
            break;
          case 2:
            Stringer.drawString("Переходим к следующей итерации.",xSt+5,ySt+23);
            Stringer.fonts[0]=new Font("Dialog", 3, 13);
            Stringer.drawString("Да,   т.к. | L_{"+2*(k+1)+"} | > \u03BE",xSt+40,ySt+45);
            Stringer.drawString("Да,   т.к. | L_{"+2*(k+1)+"} | > \u2113",xSt+40,ySt+65);
            Stringer.drawString("Нет, т.к. | L_{"+2*(k+1)+"} | < \u03BE",xSt+40,ySt+85);
            if(jRadioButton2.isSelected())
            {
              jRadioButton1.setEnabled(false); jRadioButton3.setEnabled(false);
              g.setColor(Color.lightGray); Stringer.fonts[0]=new Font("Dialog", 3, 13);
              Stringer.drawString("Да,   т.к. | L_{"+2*(k+1)+"} | > \u03BE",xSt+40,ySt+45);
              Stringer.drawString("Нет, т.к. | L_{"+2*(k+1)+"} | < \u03BE",xSt+40,ySt+85);
            }
            break;
          case 3:
            Stringer.drawString("Переходим к следующей итерации.",xSt+5,ySt+23);
            Stringer.fonts[0]=new Font("Dialog", 3, 13);
            Stringer.drawString("Да,   т.к. | L_{"+2*(k+1)+"} | > \u03BE",xSt+40,ySt+45);
            Stringer.drawString("Да,   т.к. | L_{"+2*(k+1)+"} | < \u2113",xSt+40,ySt+65);
            Stringer.drawString("Нет, т.к. | L_{"+2*(k+1)+"} | < \u2113",xSt+40,ySt+85);
            if(jRadioButton3.isSelected())
            {
              jRadioButton1.setEnabled(false); jRadioButton2.setEnabled(false);
              g.setColor(Color.lightGray); Stringer.fonts[0]=new Font("Dialog", 3, 13);
              Stringer.drawString("Да,   т.к. | L_{"+2*(k+1)+"} | > \u03BE",xSt+40,ySt+45);
              Stringer.drawString("Да,   т.к. | L_{"+2*(k+1)+"} | < \u2113",xSt+40,ySt+65);
            }
            break;
        }
        //Stringer.drawString("процесс поиска завершить",xSt+68,ySt+24);
        if((jRadioButton2.isSelected() && (k==0 || k==2)) || (jRadioButton1.isSelected() && k==1) || (jRadioButton3.isSelected() && k==3)){
          g.setColor(new Color(0, 0, 80)); Stringer.fonts[0]=new Font("SansSerif", 1, 14);
          if(Math.abs(b[k+1]-a[k+1])>l){
            if(a[k+1]>0)
              if(language==0) Stringer.drawString("We calculate | L_{"+(2*(k+1))+"} |=| b_{"+(k+1)+"} - a_{"+(k+1)+"} | = | "+b[k+1]+" - "+a[k+1]+" | = "+roundC(b[k+1]-a[k+1])+"  >  "+l+" = \u2113." ,xSt+28,ySt);
              else Stringer.drawString("Вычисляем | L_{"+(2*(k+1))+"} |=| b_{"+(k+1)+"} - a_{"+(k+1)+"} | = | "+b[k+1]+" - "+a[k+1]+" | = "+roundC(b[k+1]-a[k+1])+"  >  "+l+" = \u2113." ,xSt+28,ySt);
            else
              if(language==0) Stringer.drawString("We calculate | L_{"+(2*(k+1))+"} |=| b_{"+(k+1)+"} - a_{"+(k+1)+"} | = | "+b[k+1]+" - ( "+a[k+1]+") | = "+roundC(b[k+1]-a[k+1])+"  >  "+l+" = \u2113." ,xSt+28,ySt);
              else Stringer.drawString("Вычисляем | L_{"+(2*(k+1))+"} |=| b_{"+(k+1)+"} - a_{"+(k+1)+"} | = | "+b[k+1]+" - ( "+a[k+1]+") | = "+roundC(b[k+1]-a[k+1])+"  >  "+l+" = \u2113." ,xSt+28,ySt);
          }
          else{
            g.setColor(new Color(0, 0, 130));
            Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
            Stringer.drawString(""+b[k+1],(int)(b[k+1]*w+XN+otr*w+5),(int)(YN+(all2-otr2)*w2+15));
            Stringer.drawString(""+a[k+1],(int)(a[k+1]*w+XN+otr*w-25),(int)(YN+(all2-otr2)*w2+15));
            Stringer.fonts[0]=new Font("SansSerif", 1, 14); g.setColor(new Color(0, 0, 80));
            if(a[k+1]>0)
              if(language==0) Stringer.drawString("We calculate | L_{"+(2*(k+1))+"} |=| b_{"+(k+1)+"} - a_{"+(k+1)+"} | = | "+b[k+1]+" - "+a[k+1]+" | = "+roundC(b[k+1]-a[k+1])+"  <  "+l+" = \u2113.",xSt+28,ySt);
              else Stringer.drawString("Вычисляем | L_{"+(2*(k+1))+"} |=| b_{"+(k+1)+"} - a_{"+(k+1)+"} | = | "+b[k+1]+" - "+a[k+1]+" | = "+roundC(b[k+1]-a[k+1])+"  <  "+l+" = \u2113.",xSt+28,ySt);
            else
              if(language==0) Stringer.drawString("We calculate | L_{"+(2*(k+1))+"} |=| b_{"+(k+1)+"} - a_{"+(k+1)+"} | = | "+b[k+1]+" - ( "+a[k+1]+") | = "+roundC(b[k+1]-a[k+1])+"  <  "+l+" = \u2113.",xSt+28,ySt);
              else Stringer.drawString("Вычисляем | L_{"+(2*(k+1))+"} |=| b_{"+(k+1)+"} - a_{"+(k+1)+"} | = | "+b[k+1]+" - ( "+a[k+1]+") | = "+roundC(b[k+1]-a[k+1])+"  <  "+l+" = \u2113.",xSt+28,ySt);
          }
          g.setColor(Color.blue);  Stringer.fonts[0]=new Font("Dialog", 1, 14);
          Stringer.drawString("Правильно",xSt+200,ySt+65);
          btnNext.setEnabled(true);
        }
        else
        {
          g.setColor(new Color(0, 0, 80)); Stringer.fonts[0]=new Font("SansSerif", 1, 14);
          if(a[k+1]>0)
            if(language==0) Stringer.drawString("We calculate | L_{"+(2*(k+1))+"} |=| b_{"+(k+1)+"} - a_{"+(k+1)+"} | = | "+b[k+1]+" - "+a[k+1]+" | = "+roundC(b[k+1]-a[k+1])+"." ,xSt+28,ySt);
            else Stringer.drawString("Вычисляем | L_{"+(2*(k+1))+"} |=| b_{"+(k+1)+"} - a_{"+(k+1)+"} | = | "+b[k+1]+" - "+a[k+1]+"| = "+roundC(b[k+1]-a[k+1])+"." ,xSt+28,ySt);
          else
            if(language==0) Stringer.drawString("We calculate | L_{"+(2*(k+1))+"} |=| b_{"+(k+1)+"} - a_{"+(k+1)+"} | = | "+b[k+1]+" - ( "+a[k+1]+") | = "+roundC(b[k+1]-a[k+1])+"." ,xSt+28,ySt);
            else Stringer.drawString("Вычисляем | L_{"+(2*(k+1))+"} |=| b_{"+(k+1)+"} - a_{"+(k+1)+"} | = | "+b[k+1]+" - ( "+a[k+1]+") | = "+roundC(b[k+1]-a[k+1])+"." ,xSt+28,ySt);
          if(jRadioButton1.isSelected() || jRadioButton2.isSelected() || jRadioButton3.isSelected()){
            g.setColor(Color.red);  Stringer.fonts[0]=new Font("Dialog", 1, 14);
            if(language==0) Stringer.drawString("Incorrectly",xSt+350,ySt+40);
            else Stringer.drawString("Неправильно",xSt+200,ySt+65);
            if(entry==false){ Mist_knowledge[sh]++; entry=true;}
          }
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
          g.setFont(new java.awt.Font("Dialog", 1, 14));
          g.setColor(new Color(0, 0, 80));
          Stringer.drawString("В качестве приближеннонго решения можно взять середину",xSt+28,ySt);
          Stringer.drawString("интервала [a_{"+(k+1)+"}, b_{"+(k+1)+"}]:",xSt,ySt+33);
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
          Stringer.drawString("    =",xSt+138,ySt+35);
          Stringer.drawString("x^{*}",xSt+138,ySt+33);
          Stringer.drawString("( a_{"+(k+1)+"} + b_{"+(k+1)+"} )",xSt+168,ySt+20);
          Stringer.drawString("2",xSt+193,ySt+40);
          g.drawLine(xSt+168,ySt+27,xSt+225,ySt+27);
          g.drawLine(xSt+168,ySt+28,xSt+225,ySt+28);
          Stringer.drawString("=",xSt+233,ySt+35);
          Stringer.drawString("( "+a[k+1]+" + "+b[k+1]+")",xSt+248,ySt+20);
          Stringer.drawString("2",xSt+246+Fm.stringWidth("( "+a[k+1]+" + "+b[k+1]+")")/2,ySt+40);
          Stringer.drawString("= "+(Math.round((a[k+1]+b[k+1])*1000/2)/1000.0),xSt+254+Fm.stringWidth("( "+a[k+1]+" + "+b[k+1]+")"),ySt+35);
          g.drawLine(xSt+248,ySt+27,xSt+248+Fm.stringWidth("( "+a[k+1]+" + "+b[k+1]+")"),ySt+27);
          g.drawLine(xSt+248,ySt+28,xSt+248+Fm.stringWidth("( "+a[k+1]+" + "+b[k+1]+")"),ySt+28);
          g.setColor(Color.red);
          Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
          g.fillOval((int)((a[k+1]+b[k+1])*w/2+XN+otr*w-3),(int)(YN+(all2-otr2)*w2-3),6,6);
          if((int)(YN+(all2-otr2)*w2-f((a[k+1]+b[k+1])/2.0)*w2)>(int)(YN+(all2-otr2)*w2)){
            for(int i=(int)(YN+(all2-otr2)*w2-f((a[k+1]+b[k+1])/2.0)*w2); i>(int)(YN+(all2-otr2)*w2+3); i-=9)
              g.drawLine((int)((a[k+1]+b[k+1])*w/2.0+XN+otr*w),i,(int)((a[k+1]+b[k+1])*w/2.0+XN+otr*w),i-6);}
          else{
            for(int i=(int)(YN+(all2-otr2)*w2-f((a[k+1]+b[k+1])/2.0)*w2); i<(int)(YN+(all2-otr2)*w2-3); i+=9)
              g.drawLine((int)((a[k+1]+b[k+1])*w/2.0+XN+otr*w),i,(int)((a[k+1]+b[k+1])*w/2.0+XN+otr*w),i+6);
          }
          Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
          Stringer.drawString("x^{*}",(int)((a[k+1]+b[k+1])*w/2+XN+otr*w),(int)(YN+(all2-otr2)*w2+20));
          Stringer.fonts[0]=new Font("SansSerif", 1, 14);
          Stringer.fonts[1]=new Font("SansSerif", 1, 11);
          btnNext.setEnabled(false);
          jCheckBoxRezult.setBounds(new Rectangle(xSt+174, ySt+67, 150, 23));
          jCheckBoxRezult.setVisible(true);  jCheckBoxRezult.setEnabled(true);
          g.setColor(Color.black);
          g.drawLine(xSt+158,ySt+60,xSt+318,ySt+60);
          g.drawLine(xSt+158,ySt+61,xSt+318,ySt+61);
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
    jRadioButton3.setVisible(false); jRadioButton3.setEnabled(false);
    jButton1.setVisible(false);
    jButton1.setEnabled(false);
    jButton1.setVisible(false);
    jTF1.setVisible(false);
    jTF1.setEnabled(false);
    jTF1.setText("");
    jTF1.setForeground(new Color(0, 0, 80));
    Proverka=-1;
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
    jRadioButton3.setVisible(false); jRadioButton3.setEnabled(false);
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
    entry=false;
    sh=0; k=0; num=0;
    for (int j=1;j<10;j++){
      a[j]=0;b[j]=0;
    }
    for(int i=0; i<50; i++){
      Mist_calk[i]=0;
      Mist_under[i]=0;
      Mist_knowledge[i]=0;
      Mist_use[i]=0;
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
  void jTF1_inputMethodTextChanged(InputMethodEvent e) {
    jTF1.setForeground(new Color(0, 0, 80));
  }
}