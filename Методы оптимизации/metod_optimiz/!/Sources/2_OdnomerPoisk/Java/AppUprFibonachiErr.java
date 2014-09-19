import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.event.*;

public class AppUprFibonachiErr extends JApplet {
  Panel_mypaint jPanel1 = new Panel_mypaint();
  JLabel jLabel1 = new JLabel();
  JButton btnNext = new JButton();
  JButton btnNew = new JButton();
  JButton jButton1 = new JButton();
  JCheckBox jCheckBoxRezult = new JCheckBox();
  JCheckBox jCBFib = new JCheckBox();
  JRadioButton jRadioButton = new JRadioButton();
  JRadioButton jRadioButton1 = new JRadioButton();
  JRadioButton jRadioButton2 = new JRadioButton();
  JRadioButton jRadioButton3 = new JRadioButton();
  ButtonGroup buttonGroup1 = new ButtonGroup();
  JRadioButton jRadioBtnYes = new JRadioButton();
  JRadioButton jRadioBtnNo = new JRadioButton();
  JRadioButton jRadioBtnYN = new JRadioButton();
  ButtonGroup buttonGroupYesNo = new ButtonGroup();
  JTextField jTF1 = new JTextField();
  JTextField jTF3 = new JTextField();
  public double E=0.3, l=0.5, scale=1.0;
  public int sh=0, k=0, num=0, x1=330, y1=70, y2=290, x2=10, Fk=2,
            XN=2, YN=67, N=0, t=0, tt=0,
            Fibonachi[]={1,1,2,3,5,8,13,21,34,55,89},
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
  public int[] Mist_knowledge=new int [50];
  public int[] Mist_calk=new int [50];
  public int[] Mist_under=new int [50];
  public int[] Mist_use=new int [50];
  boolean Ch=true, ChF=false, AddRAnswer=false, entry=false, end=false;
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
    this.setSize(new Dimension(554, 522));
    jPanel1.setBackground(new Color(247, 247, 255));
    jPanel1.setBounds(new Rectangle(10, 0, 534, 481));
    jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        jPanel1_mouseClicked(e);
      }
    });
    this.getContentPane().setBackground(new Color(247, 247, 255));
    this.setFont(new java.awt.Font("SansSerif", 1, 14));
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel1.setForeground(new Color(130, 0, 80));
    jLabel1.setBounds(new Rectangle(47, 2, 440, 17));
    btnNext.setBackground(new Color(220, 230, 255));
    btnNext.setFont(new java.awt.Font("Dialog", 1, 14));
    btnNext.setForeground(new Color(0, 0, 60));
    btnNext.setVisible(true);
    btnNext.setText("==>");
    btnNext.setBounds(new Rectangle(282,490, 100, 23));
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
    btnNew.setBounds(new Rectangle(162,490, 100, 23));
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
    jTF1.setDisabledTextColor(Color.blue);
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
    jTF3.setDisabledTextColor(Color.blue);
    jTF3.setBounds(new Rectangle(355, 350, 45, 21));
    jTF3.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTF3_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jRadioButton1.setBackground(new Color(255, 255, 255));
    jRadioButton1.setFont(new java.awt.Font("Dialog", 3, 14));
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
    jRadioButton2.setFont(new java.awt.Font("Dialog", 3, 14));
    jRadioButton2.setForeground(new Color(0, 0, 40));
    jRadioButton2.setText("");
    jRadioButton2.setBounds(new Rectangle(53, 400, 16, 20));
    jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        jRadioButton2_itemStateChanged(e);
      }
    });
    jRadioButton3.setVisible(false); jRadioButton2.setEnabled(false);
    jRadioButton3.setBackground(new Color(255, 255, 255));
    jRadioButton3.setFont(new java.awt.Font("Dialog", 3, 13));
    jRadioButton3.setForeground(new Color(0, 0, 40));
    jRadioButton3.setText("");
    jRadioButton3.setBounds(new Rectangle(53, 400, 16, 20));
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
    jCBFib.setBackground(new Color(255, 255, 255));
    jCBFib.setFont(new java.awt.Font("SansSerif", 1, 12));
    jCBFib.setForeground(new Color(0, 0, 80));
    jCBFib.setText("числа Фибоначчи");
    jCBFib.setVisible(true);
    jCBFib.setEnabled(false);
    jCBFib.setOpaque(false);
    jCBFib.setSelected(false);
    jCBFib.setBounds(new Rectangle(365, 192, 150, 19));
    jCBFib.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(ChangeEvent e) {
       jCBFib_stateChanged(e);
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
    this.jPanel1.add(jTF3, null);
    this.getContentPane().add(btnNew,null);
    this.getContentPane().add(btnNext,null);
    this.jPanel1.add(jButton1,null);
    this.jPanel1.add(jCheckBoxRezult, null);
    this.jPanel1.add(jCBFib, null);
    this.jPanel1.add(jRadioButton, null);
    this.jPanel1.add(jRadioButton1, null);
    this.jPanel1.add(jRadioButton2, null);
    this.jPanel1.add(jRadioButton3, null);
    this.jPanel1.add(jRadioBtnYes, null);
    this.jPanel1.add(jRadioBtnNo, null);
    Proverka=-1;
  }

  public double f(double x){
    double j=0.0;
    j=x*x-x+1;
    return j;
  }

  public void Strelka(Graphics g,int sx,int sy){
     g.setColor(Color.red);
     g.drawLine(346-sx,101+25+sy,365-sx,120+25+sy);
     g.drawLine(346-sx,102+25+sy,365-sx,121+25+sy);
     ///-----1------
     g.drawLine(356-sx,121+25+sy,365-sx,121+25+sy);
     g.drawLine(358-sx,120+25+sy,365-sx,120+25+sy);
     g.drawLine(360-sx,119+25+sy,365-sx,119+25+sy);
     ///-----2------
     g.drawLine(365-sx,111+25+sy,365-sx,121+25+sy);
     g.drawLine(364-sx,113+25+sy,364-sx,121+25+sy);
     g.drawLine(363-sx,116+25+sy,363-sx,121+25+sy);
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
    FontMetrics FmD=g.getFontMetrics(new Font("Dialog", 3, 14));
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
       Stringer.drawString("To find a minimum of function f(x) by method Fibonachi",78,40);
     }
     else{
       g.setColor(new Color(180, 0, 80));
       Stringer.fonts[0]=new Font("SansSerif", 3, 13);
       Stringer.drawString("Задача: ",20,40);
       Stringer.drawString("Графическая иллюстрация:",10,63);
       Stringer.drawString("Величины:",368,63);
       Stringer.drawString("Формулы:  ",368,229);
       Stringer.drawString("Решение:  ",10,336);
       g.setColor(new Color(0, 0, 80));
        Stringer.fonts[0]=new Font("SansSerif", 1, 14);
       Stringer.drawString("Найти минимум функции f(x) = x^{ 2 }- x + 1 методом Фибоначчи",77,40);
     }
    // Stringer.drawString(""+select,1,15); ///////////////////
   // Stringer.drawString(""+Math.round(198.6),1,15);
     g.setColor(new Color(255, 255, 255));
     g.fillRect(2,67,338,253);g.fillRect(360,67,169,146);g.fillRect(360,233,169,87);g.fillRect(2,340,529,140);
     g.setColor(new Color(157, 187, 255));
     g.drawRect(2,67,338,253);  g.drawRect(360,67,169,146);g.drawRect(360,233,169,87);g.drawRect(2,340,529,140);

     /*nach. velichini*/g.setColor(new Color(0, 0, 80));
     Stringer.fonts[0]=new Font("SansSerif", 1, 12);
     Stringer.fonts[1]=new Font("SansSerif", 1, 9);
     Stringer.drawString("L_{0} = ["+a[0]+","+b[0]+"] - интервал",365,85);
     Stringer.drawString("неопределенности",416,103);
     Stringer.drawString("\u03BE = "+E+" - малое число",365,121);
     Stringer.drawString("\u2113 = "+l+" - точность",365,139);
     if(sh>0) Stringer.drawString("k = "+k+" - номер итерации",365,157);
     else Stringer.drawString("k - номер итерации",365,157);
     if(sh>1){
       Stringer.drawString("N = "+N+"  - количество",365,175);
       Stringer.drawString("вычислений функции",398,188);}
     else{
       Stringer.drawString("N - количество вычислений",365,175);
       Stringer.drawString("функции",476,188);}
     if(sh==3 && k>0 && k!=N-3){
       g.setColor(Color.red);
       Stringer.drawString("k = "+k,365,157);
     }
     if(sh>0) jCBFib.setEnabled(true);

      if(k==N-3 & end==true){
        t=N-1; tt=N-2;
      }
      else{
       t=k; tt=k;
      }

    /*formula*/
    Stringer.fonts[1]=new Font("SansSerif", 1, 10);
    if(sh>=7){
      if(sh==7){ g.setColor(Color.red); Strelka(g,-30,97);}
      Stringer.drawString("y_{N-1} = y_{N-2} = z_{N-2}",407,250);
      Stringer.drawString("z_{N-1} = y_{N-1} + \u03BE",410,272);
      if(sh==8){ g.setColor(Color.red); Strelka(g,-20,145);}
      else g.setColor(new Color(0, 0, 80));
      Stringer.drawString("x^{*} \u2248",390,306);
      Stringer.drawString("( a_{N-1} + b_{N-1} )",417,293);
      Stringer.drawString("2",452,313);
      g.drawLine(416,300,493,300);
      g.drawLine(416,301,493,301);
    }
    else if(sh>4 || k>0){
      if(sh>=5 && k==N-3 && end==true){
        if((t==0 && jRadioButton1.isSelected()==true) || ((t==1 || t==3) && jRadioButton2.isSelected()==true) ||
           (t==2 && jRadioButton3.isSelected()==true) && sh==5){
            g.setColor(Color.red); Strelka(g,-28,107);}
        Stringer.drawString("y_{N-1} = y_{N-2} = z_{N-2}",402,262);
        Stringer.drawString("z_{N-1} = y_{N-1} + \u03BE",407,292);
      }
      else{
        if(sh==5 && (jRadioButton1.isSelected()==true && (Math.round(f(y[k])*1000))/1000.0<=(Math.round(f(z[k])*1000))/1000.0)){
          g.setColor(Color.red); Strelka(g,0,100);}
        Stringer.drawString("y_{k+1}=a_{k+1}+            (b_{k+1}- a_{k+1})",363,261);
        Stringer.drawString("F_{N-k-3}",428,248);
        Stringer.drawString("F_{N-k-1}",428,269);
        g.drawLine(427,257,458,257);
        g.drawLine(427,256,458,256);
        g.setColor(new Color(0, 0, 80));
        if(sh==5 && (jRadioButton2.isSelected()==true && (Math.round(f(y[k])*1000))/1000.0>(Math.round(f(z[k])*1000))/1000.0)){
          g.setColor(Color.red); Strelka(g,0,141);}
        Stringer.drawString("z_{k+1}=a_{k+1}+            (b_{k+1}- a_{k+1})",363,302);
        Stringer.drawString("F_{N-k-2}",428,289);
        Stringer.drawString("F_{N-k-1}",428,310);
        g.drawLine(427,298,458,298);
        g.drawLine(427,297,458,297);
      }
    }
    else if(sh>2){
          if(sh==3){ g.setColor(Color.red); Strelka(g,-10,105);}
          Stringer.drawString("y_{0 }= a_{0 }+           (b_{0 }- a_{0})",382,261);
          Stringer.drawString("F_{N-2}",434,248);
          Stringer.drawString("F_{N}",439,269);
          g.drawLine(433,257,457,257);
          g.drawLine(433,256,457,256);

          Stringer.drawString("z_{0 }= a_{0 }+           (b_{0 }- a_{0})",382,302);
          Stringer.drawString("F_{N-1}",434,289);
          Stringer.drawString("F_{N}",439,310);
          g.drawLine(433,298,457,298);
          g.drawLine(433,297,457,297);
        }
        else{
          if(sh==0){ g.setColor(Color.red); Strelka(g,-25,105);}
          Stringer.drawString("F_{0} = F_{1} = 1",417,257);
          Stringer.drawString("F_{n} = F_{n-1} + F_{n-2}",406,281);
          Stringer.drawString("n = 2, 3, 4,...",415,308);
        }

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
    //чила Фибоначчи
    if(ChF==true){
      g.setColor(new Color(255, 255, 255));
      g.fillRect(366,210,122,115);
      g.setColor(new Color(157, 187, 255));
      g.drawRect(366,210,122,115);
      g.setColor(new Color(0, 0, 80)); Stringer.fonts[0] = new Font("SansSerif", 1, 13);
      Stringer.drawString("F_{0} = 1     F_{6} = 13",375, 224);
      Stringer.drawString("F_{1} = 1     F_{7} = 21",375, 242);
      Stringer.drawString("F_{2} = 2     F_{8} = 34",375, 260);
      Stringer.drawString("F_{3} = 3     F_{9} = 55",375, 278);
      Stringer.drawString("F_{4} = 5     F_{10} = 89",375, 296);
      Stringer.drawString("F_{5} = 8",375, 314);
      Stringer.fonts[0] = new Font("SansSerif", 1, 14);
    }
    //---------------------

    xSt=5;ySt=360;
    if(sh>=0)
    {
      g.setColor(new Color(180, 0, 60));
      Stringer.fonts[0]=new Font("SansSerif", 3, 16);
      Stringer.drawString(k+"."+num+".",xSt,ySt);
    }
    Stringer.fonts[0]=new Font("SansSerif", 1, 14);
    if(sh>=0){
      g.setColor(new Color(0, 0, 80)); Stringer.fonts[0]=new Font("SansSerif", 1, 14);
      Stringer.fonts[1]=new Font("SansSerif", 1, 11);
      if(sh==0)
      {
        Stringer.drawString("неопределенности  L_{0} = [ a_{0} , b_{0} ] = [ "+a[0]+" , "+b[0]+" ]  и положим  \u03BE = "+E+"; \u2113 = "+l+".",xSt,ySt+20);
        Stringer.drawString("Записываем последовательность чисел Фибоначчи до F_{10 }.",xSt,ySt+40);
        Stringer.drawString("Построим функцию  f(x) = x^{ 2 }- x + 1, зададим начальный интервал",xSt+28,ySt);
        g.setColor(Color.black);  Stringer.fonts[0]=new Font("Dialog", 3, 14);
        Stringer.drawString("Последовательность чисел Фибоначчи записана верно.", xSt+5, ySt+80);
        if(AddRAnswer==false){ RightAnswer++; AddRAnswer=true;}
        jRadioBtnYes.setLocation(xSt+420, ySt+67);
        jRadioBtnYes.setVisible(true);
        jRadioBtnYes.setEnabled(true);
        btnNext.setEnabled(false);
        jRadioBtnNo.setLocation(xSt+420, ySt+87);
        jRadioBtnNo.setVisible(true);
        jRadioBtnNo.setEnabled(true);
        String fib="F_{2} = ";
        for(int i=3; i<=10; i++)
          fib+=Fibonachi[i-1]+", F_{"+i+"} = ";
        Stringer.drawString(fib+Fibonachi[10]+".", xSt+5, ySt+60);
        jCBFib.setEnabled(true);
        if(jRadioBtnYes.isSelected()){
          g.setColor(Color.blue); Stringer.fonts[0]=new Font("Dialog", 1, 14);
          Stringer.drawString("Правильно",xSt+210,ySt+105);
          jRadioBtnNo.setEnabled(false);
          btnNext.setEnabled(true);
        }
        if(jRadioBtnNo.isSelected()){
          g.setColor(Color.red); Stringer.fonts[0]=new Font("Dialog", 1, 14);
          Stringer.drawString("Неправильно",xSt+205,ySt+105);
          if(!entry){ Mist_knowledge[sh]++; entry=true;}
        }
        ////////////////
        Stringer.fonts[0]=new Font("SansSerif", 1, 12);
        Stringer.fonts[1]=new Font("SansSerif", 1, 9);
        g.setColor(Color.red);
        Stringer.drawString("L_{0} = ["+a[0]+","+b[0]+"]",365,85);
        Stringer.drawString("\u03BE = "+E,365,121);
        Stringer.drawString("\u2113 = "+l,365,139);
        ////////////////
      }

      if(sh==1){
        if(AddRAnswer==false){ RightAnswer+=2; AddRAnswer=true;}
        g.setColor(new Color(0, 0, 80)); Stringer.fonts[0]=new Font("SansSerif", 1, 14);
        Stringer.fonts[1]=new Font("SansSerif", 1, 11);
        Stringer.drawString("Найдем количество N вычислений функции как наименьшее целое",xSt+30,ySt);
        Stringer.drawString("число, при котором выполняется условие F_{N} \u2265        .",xSt,ySt+30);
        Stringer.drawString("|L_{0}|",xSt+Fm.stringWidth("число, при котором выполняется условие FN > "),ySt+17);
        Stringer.drawString("\u2113",xSt+5+Fm.stringWidth("число, при котором выполняется условие FN > "),ySt+41);
        g.drawLine(xSt-2+Fm.stringWidth("число, при котором выполняется условие FN > "),ySt+26,xSt+20+Fm.stringWidth("число, при котором выполняется условие FN > "),ySt+26);
        g.drawLine(xSt-2+Fm.stringWidth("число, при котором выполняется условие FN > "),ySt+25,xSt+20+Fm.stringWidth("число, при котором выполняется условие FN > "),ySt+25);
        g.setColor(Color.black);  Stringer.fonts[0]=new Font("Dialog", 3, 14);
        Stringer.drawString("N = 6.",xSt+5+Fm.stringWidth("число, при котором выполняется условие FN > |L0|.  "),ySt+30);
        jRadioBtnYes.setLocation(xSt+430, ySt+17);
        jRadioBtnYes.setVisible(true);
        jRadioBtnYes.setEnabled(true);
        jRadioBtnNo.setLocation(xSt+430, ySt+37);
        jRadioBtnNo.setVisible(true);
        jRadioBtnNo.setEnabled(true);
        btnNext.setEnabled(false);
        if(jRadioBtnYes.isSelected()){
          g.setColor(Color.red); Stringer.fonts[0]=new Font("Dialog", 1, 14);
          Stringer.drawString("Неправильно",xSt+404,ySt+72);
          if(!entry){ Mist_calk[sh]++; entry=true;}
        }
        if(jRadioBtnNo.isSelected()){
          g.setColor(Color.blue); Stringer.fonts[0]=new Font("Dialog", 1, 14);
          Stringer.drawString("Правильно",xSt+408,ySt+72);
          jRadioBtnYes.setEnabled(false);
          g.setColor(Color.black);  Stringer.fonts[0]=new Font("Dialog", 3, 14);
          Stringer.drawString("Найдите N:  N = ",xSt+5,ySt+60);
          jTF1.setVisible(true);
          jTF1.setEnabled(true);
          jTF1.setBounds(new Rectangle(xSt+5+Fm.stringWidth("Найдите N:  N =  "), ySt+47, 30, 20));
          jButton1.setVisible(true);
          jButton1.setEnabled(true);
          jButton1.setLocation(170, 405);
          if ( Proverka == 1){
            g.setColor(Color.blue); Stringer.fonts[0]=new Font("Dialog", 1, 14);
            Stringer.drawString("Правильно",xSt+96,ySt+83);
            btnNext.setEnabled(true);
            jTF1.setEnabled(false);
            jButton1.setEnabled(false);
          }
          if ( Proverka == 0 ){
            g.setColor(Color.red); Stringer.fonts[0]=new Font("Dialog", 1, 14);
            Stringer.drawString("Неправильно",xSt+88,ySt+83);
          }
        }
      }
      Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
      Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
      if (sh>=0 && sh<6){
        g.setColor(new Color(0, 0, 130));
        if(f(a[tt])>0)
          for( int i = (int)(YN+(all2-otr2)*w2-w2*f(a[tt]))+1; i<YN+(all2-otr2)*w2; i=i+9)
            g.drawLine((int)(otr*w+a[tt]*w+XN),i,(int)(otr*w+a[tt]*w+XN),i+6);
        if(f(a[tt])<0)
          for( int i = (int)(YN+(all2-otr2)*w2-w2*f(a[tt]))-1; i>YN+(all2-otr2)*w2; i=i-9)
            g.drawLine((int)(otr*w+a[tt]*w+XN),i,(int)(otr*w+a[tt]*w+XN),i-6);
        if(f(b[tt])>0)
          for( int i = (int)(YN+(all2-otr2)*w2-w2*f(b[tt]))+1; i<YN+(all2-otr2)*w2; i=i+9)
            g.drawLine((int)(otr*w+b[tt]*w+XN),i,(int)(otr*w+b[tt]*w+XN),i+6);
        if(f(b[tt])<0)
          for( int i = (int)(YN+(all2-otr2)*w2-w2*f(b[tt]))-1; i>YN+(all2-otr2)*w2; i=i-9)
            g.drawLine((int)(otr*w+b[tt]*w+XN),i,(int)(otr*w+b[tt]*w+XN),i-6);
        if(sh<5)
        {
          Stringer.drawString("a_{"+tt+"}",(int)(XN+otr*w+a[tt]*w-13),YN+(all2-otr2)*w2-8);
          Stringer.drawString("b_{"+tt+"}",(int)(XN+otr*w+b[tt]*w+5),YN+(all2-otr2)*w2-8);
        }
        g.drawLine((int)(XN+otr*w+a[tt]*w),YN+(all2-otr2)*w2,(int)(XN+otr*w+b[tt]*w),YN+(all2-otr2)*w2);
        g.drawLine((int)(XN+otr*w+a[tt]*w),YN+(all2-otr2)*w2+1,(int)(XN+otr*w+b[tt]*w),YN+(all2-otr2)*w2+1);
        Stringer.fonts[0]=new Font("SansSerif", 1, 14);
        Stringer.drawString("[",(int)(XN+otr*w+a[tt]*w-2),YN+(all2-otr2)*w2+4);
        Stringer.drawString("]",(int)(XN+otr*w+b[tt]*w-2),YN+(all2-otr2)*w2+4);
      }
    }
    Stringer.fonts[0]=new Font("SansSerif", 1, 14);
    Stringer.fonts[1]=new Font("SansSerif", 1, 11);
    g.setColor(new Color(0, 0, 80));
    if(sh==2){
      g.setColor(new Color(0, 0, 80));
      if(k==0) Stringer.drawString("Положим k = 0.",xSt+30,ySt);
    }
    if(sh>=3 && sh<5 && N>=2){
      if(k==0){
        y[0]=(Math.round(a[0]*1000+Fibonachi[N-2]*(b[0]-a[0])*1000.0/Fibonachi[N]))/1000.0;
        z[0]=(Math.round(a[0]*1000+Fibonachi[N-1]*(b[0]-a[0])*1000.0/Fibonachi[N]))/1000.0;
      }
      if (sh==3 && k==0){
        if(AddRAnswer==false){ RightAnswer++; AddRAnswer=true;}
        Stringer.drawString("Вычисляем  y_{0} и z_{0}  по вышеприведенным формулам: ",xSt+30,ySt);
        String tmpSy="y_{0} = "+a[0]+" +        ("+b[0]+" - ", tmpSz="z_{0} = "+a[0]+" +        ("+b[0]+" - ";
        if(a[0]>=0){
          tmpSy+=a[0]+") = "+y[0]+";";
          tmpSz+=a[0]+") = "+z[0]+".";
        }
        else{
          tmpSy+="("+a[0]+")) = "+y[0]+";";
          tmpSz+="("+a[0]+")) = "+z[0]+";";
        }
        Stringer.drawString(tmpSy,xSt+5,ySt+22);
        Stringer.drawString(tmpSz,xSt+5,ySt+54);
        Stringer.drawString(""+Fibonachi[N-2],xSt+19+Fm.stringWidth("y0 = a0 + "),ySt+13);
        Stringer.drawString(""+Fibonachi[N-1],xSt+19+Fm.stringWidth("z0 = a0 + "),ySt+45);
        Stringer.drawString(""+Fibonachi[N],xSt+19+Fm.stringWidth("y0 = a0 + "),ySt+30);
        Stringer.drawString(""+Fibonachi[N],xSt+19+Fm.stringWidth("z0 = a0 + "),ySt+61);
        g.drawLine(xSt+12+Fm.stringWidth("y0 = a0 + "),ySt+16,xSt+33+Fm.stringWidth("y0 = a0 + "),ySt+16);
        g.drawLine(xSt+12+Fm.stringWidth("y0 = a0 + "),ySt+17,xSt+33+Fm.stringWidth("y0 = a0 + "),ySt+17);
        g.drawLine(xSt+12+Fm.stringWidth("z0 = a0 + "),ySt+48,xSt+33+Fm.stringWidth("z0 = a0 + "),ySt+48);
        g.drawLine(xSt+12+Fm.stringWidth("z0 = a0 + "),ySt+49,xSt+33+Fm.stringWidth("z0 = a0 + "),ySt+49);
        g.setColor(Color.black);  Stringer.fonts[0]=new Font("Dialog", 3, 14);
        Stringer.drawString("y_{0} и z_{0} вычислены правильно.",xSt+5,ySt+80);
        jRadioBtnYes.setLocation(xSt+230, ySt+67);
        jRadioBtnYes.setVisible(true);
        jRadioBtnYes.setEnabled(true);
        jRadioBtnNo.setLocation(xSt+230, ySt+87);
        jRadioBtnNo.setVisible(true);
        jRadioBtnNo.setEnabled(true);
        btnNext.setEnabled(false);
        if(jRadioBtnYes.isSelected()){
          g.setColor(Color.blue); Stringer.fonts[0]=new Font("Dialog", 1, 14);
          Stringer.drawString("Правильно",xSt+290,ySt+90);
          jRadioBtnNo.setEnabled(false);
          btnNext.setEnabled(true);
        }
        if(jRadioBtnNo.isSelected()){
          g.setColor(Color.red); Stringer.fonts[0]=new Font("Dialog", 1, 14);
          Stringer.drawString("Неправильно",xSt+290,ySt+90);
          if(!entry){ Mist_calk[sh]++; entry=true;}
        }
      }
      else if(sh==3 && k!=N-3) Stringer.drawString("Положим k = k + 1 = "+k+".",xSt+30,ySt);

      if(sh>=3){
        Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
        Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
        if(k!=0 || (k==0 && jTF1.isEnabled()==false)){
          g.setColor(new Color(0, 120, 0));
          if(f(y[t])>=0)
          {
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y[t]))+1; i<YN+(all2-otr2)*w2-5; i=i+9)
              g.drawLine((int)(otr*w+y[t]*w+XN),i,(int)(otr*w+y[t]*w+XN),i+6);
            Stringer.drawString("y_{"+t+"}",(int)(XN+otr*w+y[t]*w-13),YN+(all2-otr2)*w2-8);
          }
          if(f(y[t])<0)
          {
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y[t]))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
              g.drawLine((int)(otr*w+y[t]*w+XN),i,(int)(otr*w+y[t]*w+XN),i-6);
            Stringer.drawString("y_{"+t+"}",(int)(XN+otr*w+y[t]*w-13),YN+(all2-otr2)*w2-8);
          }
          Stringer.drawString(""+y[t],(int)(XN+otr*w+y[t]*w-Fm1.stringWidth(""+y[t])),YN+(all2-otr2)*w2+12);
          g.fillOval((int)(otr*w+y[t]*w+XN-3),YN+(all2-otr2)*w2-3,6,6);
        }
        if(k!=0 || (k==0 && jTF3.isEnabled()==false)){
          g.setColor(new Color(98, 0, 170));
          if(f(z[t])>=0)
          {
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z[t]))+1; i<YN+(all2-otr2)*w2-5; i=i+9)
              g.drawLine((int)(otr*w+z[t]*w+XN),i,(int)(otr*w+z[t]*w+XN),i+6);
            Stringer.drawString("z_{"+t+"}",(int)(XN+otr*w+z[t]*w+5),YN+(all2-otr2)*w2-8);
          }
          if(f(z[t])<0)
          {
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z[t]))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
              g.drawLine((int)(otr*w+z[t]*w+XN),i,(int)(otr*w+z[t]*w+XN),i-6);
            Stringer.drawString("z_{"+t+"}",(int)(XN+otr*w+z[t]*w+5),YN+(all2-otr2)*w2-8);
          }
          Stringer.drawString(""+z[t],(int)(XN+otr*w+z[t]*w)+1,YN+(all2-otr2)*w2+12);
          g.fillOval((int)(otr*w+z[t]*w+XN-3),YN+(all2-otr2)*w2-3,6,6);
        }
        Stringer.fonts[0]=new Font("SansSerif", 1, 14);
        Stringer.fonts[1]=new Font("SansSerif", 1, 11);
      }
    }
    if (sh>=4 && sh<=5){
      g.setColor(new Color(0, 0, 80)); Stringer.fonts[0]=new Font("SansSerif", 1, 14);
      if (sh==4){
        Stringer.drawString("Вычислим значение функции в точках  y_{"+t+"} и z_{"+t+"}:",xSt+30,ySt);
        Stringer.drawString("f( y_{"+t+"} ) = "+(Math.round(f(y[t])*1000))/1000.0+",",xSt+365,ySt);
        Stringer.drawString("f( z_{"+t+"} ) = "+(Math.round(f(z[t])*1000))/1000.0+".",xSt+365,ySt+20);
      }
      g.setColor(new Color(0, 120, 0));
      if(y[t]<0){
        for( int i = (int)(XN+otr*w+y[t]*w+1); i<XN+otr*w-5; i=i+9)
          g.drawLine(i,(int)(YN+(all2-otr2)*w2-f(y[t])*w2),i+6,(int)(YN+(all2-otr2)*w2-f(y[t])*w2));
      }
      else{
        for( int i = (int)(XN+otr*w+y[t]*w-1); i>XN+otr*w+5; i=i-9)
          g.drawLine(i,(int)(YN+(all2-otr2)*w2-f(y[t])*w2),i-6,(int)(YN+(all2-otr2)*w2-f(y[t])*w2));
      }
      g.setColor(new Color(0, 120, 0));
      g.fillOval((int)(XN+otr*w-3),(int)(YN+(all2-otr2)*w2-f(y[t])*w2-3),6,6);
      Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
      Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
      if (f(y[t])<f(z[t])){
        if(y[t]>=0) Stringer.drawString(""+(Math.round(f(y[t])*1000))/1000.0,XN+otr*w-5-Fm1.stringWidth(""+(Math.round(f(y[t])*1000))/1000.0),(int)(YN+(all2-otr2)*w2-f(y[t])*w2)+7);
        else Stringer.drawString(""+(Math.round(f(y[t])*1000))/1000.0,XN+otr*w+5,(int)(YN+(all2-otr2)*w2-f(y[t])*w2)+7);
      }
      else{
        if(y[t]>=0) Stringer.drawString(""+(Math.round(f(y[t])*1000))/1000.0,XN+otr*w-5-Fm1.stringWidth(""+(Math.round(f(y[t])*1000))/1000.0),(int)(YN+(all2-otr2)*w2-f(y[t])*w2)-3);
        else Stringer.drawString(""+(Math.round(f(y[t])*1000))/1000.0,XN+otr*w+5,(int)(YN+(all2-otr2)*w2-f(y[t])*w2)-3);
      }
      g.setColor(new Color(98, 0, 170));
      if(z[t]<0){
        for( int i = (int)(XN+otr*w+z[t]*w+1); i<XN+otr*w-5; i=i+9)
          g.drawLine(i,(int)(YN+(all2-otr2)*w2-f(z[t])*w2),i+6,(int)(YN+(all2-otr2)*w2-f(z[t])*w2));
      }
      else{
        for( int i = (int)(XN+otr*w+z[t]*w-1); i>XN+otr*w+5; i=i-9)
          g.drawLine(i,(int)(YN+(all2-otr2)*w2-f(z[t])*w2),i-6,(int)(YN+(all2-otr2)*w2-f(z[t])*w2));
      }
      g.fillOval((int)(XN+otr*w-3),(int)(YN+(all2-otr2)*w2-f(z[t])*w2-3),6,6);
      Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
      Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
      if (f(y[t])<f(z[t])){
        if(z[t]>=0) Stringer.drawString(""+(Math.round(f(z[t])*1000))/1000.0,XN+otr*w-5-Fm1.stringWidth(""+(Math.round(f(z[t])*1000))/1000.0),(int)(YN+(all2-otr2)*w2-f(z[t])*w2)-3);
        else Stringer.drawString(""+(Math.round(f(z[t])*1000))/1000.0,XN+otr*w+5,(int)(YN+(all2-otr2)*w2-f(z[t])*w2)-3);
      }
      else{
        if(z[t]>=0) Stringer.drawString(""+(Math.round(f(z[t])*1000))/1000.0,XN+otr*w-5-Fm1.stringWidth(""+(Math.round(f(z[t])*1000))/1000.0),(int)(YN+(all2-otr2)*w2-f(z[t])*w2)+7);
        else Stringer.drawString(""+(Math.round(f(z[t])*1000))/1000.0,XN+otr*w+5,(int)(YN+(all2-otr2)*w2-f(z[t])*w2)+7);
      }
      Stringer.fonts[0]=new Font("SansSerif", 1, 14);
      Stringer.fonts[1]=new Font("SansSerif", 1, 11);
    }
    if (sh>=5){
      g.setColor(new Color(0, 0, 80));  Stringer.fonts[0]=new Font("SansSerif", 1, 14);
      if(sh==5){
        jRadioButton1.setBounds(new Rectangle(xSt+237,ySt+7, 16, 20));
        jRadioButton1.setVisible(true);
        jRadioButton1.setEnabled(true);
        jRadioButton2.setBounds(new Rectangle(xSt+237,ySt+27, 16, 20));
        jRadioButton2.setVisible(true);
        jRadioButton2.setEnabled(true);
        if(AddRAnswer==false){ RightAnswer++; AddRAnswer=true;}
        Stringer.drawString("Сравним f( y_{"+t+"} ) и f( z_{"+t+"} ):",xSt+30,ySt);
        if((Math.round(f(y[t])*1000))/1000.0<=(Math.round(f(z[t])*1000))/1000.0)
          if(k!=N-3) Stringer.drawString("f( y_{"+t+"} ) \u2264 f( z_{"+t+"} ).",xSt+195,ySt);
          else Stringer.drawString("f( y_{"+t+"} ) \u2264 f( z_{"+t+"} ).",xSt+195,ySt);
        else
          if(k!=N-3) Stringer.drawString("f( y_{"+t+"} ) > f( z_{"+t+"} ).",xSt+195,ySt);
          else Stringer.drawString("f( y_{"+t+"} ) > f( z_{"+t+"} ).",xSt+195,ySt);
        g.setColor(Color.black);  Stringer.fonts[0]=new Font("Dialog", 1, 14);
        jRadioButton1.setText(""); jRadioButton2.setText(""); jRadioButton3.setText("");
        jRadioButton1.setEnabled(true); jRadioButton1.setVisible(true);
        jRadioButton2.setEnabled(true); jRadioButton2.setVisible(true);
        jRadioButton3.setEnabled(true); jRadioButton3.setVisible(true);
        jRadioButton1.setBounds(xSt+20,ySt+25,16,20);
        jRadioButton2.setBounds(xSt+20,ySt+45,16,20);
        jRadioButton3.setBounds(xSt+20,ySt+65,16,20);
        g.setColor(Color.black);  Stringer.fonts[0]=new Font("Dialog", 3, 14);
        switch (t)
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
            else btnNext.setEnabled(false);
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
            else btnNext.setEnabled(false);
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
            else btnNext.setEnabled(false);
            break;
          case 3:
            Stringer.drawString("Тогда новый интервал неопределенности будет [y_{3}, b_{3}].",xSt,ySt+20);
            Stringer.fonts[0]=new Font("Dialog", 3, 13);
            Stringer.drawString("Нет, должен быть [a_{3}, z_{3}]",xSt+40,ySt+40);
            Stringer.drawString("Нет, должен быть [z_{3}, b_{3}]",xSt+40,ySt+60);
            Stringer.drawString("Да",xSt+40,ySt+80);
            if(jRadioButton3.isSelected()==true)
            {
              g.setColor(Color.lightGray); Stringer.fonts[0]=new Font("Dialog", 3, 13);
              jRadioButton1.setEnabled(false); jRadioButton2.setEnabled(false);
              Stringer.drawString("Нет, должен быть [a_{3}, z_{3}]",xSt+40,ySt+40);
              Stringer.drawString("Нет, должен быть [z_{3}, b_{3}]",xSt+40,ySt+60);
            }
            else btnNext.setEnabled(false);
            break;
          case 4:
            Stringer.drawString("Тогда новый интервал неопределенности будет [y_{4}, b_{3}].",xSt,ySt+20);
            Stringer.fonts[0]=new Font("Dialog", 3, 13);
            Stringer.drawString("Нет, должен быть [a_{3}, z_{4}]",xSt+40,ySt+40);
            Stringer.drawString("Нет, должен быть [z_{4}, b_{3}]",xSt+40,ySt+60);
            Stringer.drawString("Да",xSt+40,ySt+80);
            if(jRadioButton1.isSelected()==true)
            {
              g.setColor(Color.lightGray); Stringer.fonts[0]=new Font("Dialog", 3, 13);
              jRadioButton3.setEnabled(false); jRadioButton2.setEnabled(false);
              Stringer.drawString("Нет, должен быть [z_{4}, b_{3}]",xSt+40,ySt+60);
              Stringer.drawString("Да",xSt+40,ySt+80);
            }
            else btnNext.setEnabled(false);
            break;
        }
        if((jRadioButton1.isSelected()==true && (t==0 || t==4)) || (jRadioButton2.isSelected()==true && t==3)){
          g.setColor(Color.blue); Stringer.fonts[0]=new Font("Dialog", 1, 14);
          Stringer.drawString("Правильно",xSt+230,ySt+61);
          if(end==false){
            a[tt+1]=a[tt];
            b[tt+1]=z[t];
            y[t+1]=Math.round((a[t+1]+b[t+1]-y[t])*1000)/1000.0;
            z[t+1]=y[t];
            g.setColor(new Color(0, 0, 80));  Stringer.fonts[0]=new Font("SansSerif", 1, 14);
            Stringer.drawString("Положим a_{"+(t+1)+"} = a_{"+k+"} = "+a[t]+",", xSt+320, ySt+40);
            Stringer.drawString("b_{"+(t+1)+"} = z_{"+t+"} = "+z[t]+"   и", xSt+392, ySt+60);
            Stringer.drawString("z_{"+(t+1)+"} = y_{"+t+"} = "+y[t]+".", xSt+392, ySt+80);
            Stringer.drawString("Вычисляем y_{"+(k+1)+"} по формуле.  y_{"+(t+1)+"} = "+y[t+1], xSt, ySt+105);
          }
          else{
            a[tt+1]=a[tt];
            b[tt+1]=z[t];
            g.setColor(new Color(0, 0, 80));  Stringer.fonts[0]=new Font("SansSerif", 1, 14);
            Stringer.drawString("Положим a_{N-1} = a_{N-2} = "+a[t]+"  и", xSt+320, ySt+50);
            Stringer.drawString("b_{N-1} = z_{N-1} = "+b[t]+".", xSt+392, ySt+70);
            btnNext.setEnabled(true);
          }
          Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
          Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
          g.setColor(new Color(0, 120, 0));
          if(f(y[t])>=0){
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y[t]))+1; i<YN+(all2-otr2)*w2-5; i=i+9)
              g.drawLine((int)(otr*w+y[t]*w+XN),i,(int)(otr*w+y[t]*w+XN),i+6);
          }
          if(f(y[t])<0){
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y[t]))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
              g.drawLine((int)(otr*w+y[t]*w+XN),i,(int)(otr*w+y[t]*w+XN),i-6);
          }
          Stringer.drawString("y_{"+t+"}",(int)(y[t]*w+XN+otr*w-13),YN+w2*(all2-otr2)-8);
          g.setColor(new Color(98, 0, 170));
          if(f(z[t])>=0){
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z[t]))+1; i<YN+(all2-otr2)*w2-5; i=i+9)
              g.drawLine((int)(otr*w+z[t]*w+XN),i,(int)(otr*w+z[t]*w+XN),i+6);
          }
          if(f(z[t])<0){
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z[t]))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
              g.drawLine((int)(otr*w+z[t]*w+XN),i,(int)(otr*w+z[t]*w+XN),i-6);
          }
          Stringer.drawString("z_{"+t+"} = b_{"+(tt+1)+"}",(int)(b[tt+1]*w+XN+otr*w+5),YN+w2*(all2-otr2)-8);
          Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
          Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
          g.setColor(new Color(0, 0, 130));
          Stringer.drawString("a_{"+(tt+1)+"} = a_{"+tt+"}",(int)(a[tt+1]*w+XN+otr*w-37),YN+w2*(all2-otr2)-8);
          Stringer.drawString("b_{"+tt+"}",(int)(XN+otr*w+b[tt]*w+5),YN+(all2-otr2)*w2+10);
        }
        if((jRadioButton2.isSelected()==true && t==1) || (t==2 && jRadioButton3.isSelected()==true)){
          g.setColor(Color.blue); Stringer.fonts[0]=new Font("Dialog", 1, 14);
          Stringer.drawString("Правильно",xSt+230,ySt+61);
          if(end==false){
            a[tt+1]=y[t];
            b[tt+1]=b[tt];
            y[t+1]=z[t];
            z[t+1]=Math.round((a[t+1]+b[t+1]-z[t])*1000)/1000.0;
            g.setColor(new Color(0, 0, 80));  Stringer.fonts[0]=new Font("SansSerif", 1, 14);
            Stringer.drawString("Положим a_{"+(t+1)+"} = y_{"+t+"} = "+y[t]+",", xSt+320, ySt+40);
            Stringer.drawString("b_{"+(t+1)+"} = b_{"+t+"} = "+b[t]+"   и", xSt+392, ySt+60);
            Stringer.drawString("y_{"+(t+1)+"} = z_{"+t+"} = "+z[t]+".", xSt+392, ySt+80);
            Stringer.drawString("Вычисляем z_{"+(t+1)+"} по формуле.  z_{"+(t+1)+"} = "+z[t+1], xSt, ySt+105);
          }
          else{
              a[tt+1]=y[t];
              b[tt+1]=b[tt];
              g.setColor(new Color(0, 0, 80));  Stringer.fonts[0]=new Font("SansSerif", 1, 14);
              Stringer.drawString("Положим a_{N-1} = y_{N-1} = "+a[t]+"  и", xSt+320, ySt+50);
              Stringer.drawString("b_{N-1} = b_{N-2} = "+b[t]+".", xSt+392, ySt+70);
              btnNext.setEnabled(true);
            }
            Stringer.fonts[0]=new Font("SansSerif", 1, 14);
            Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
            Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
            g.setColor(new Color(0, 120, 0));
            if(f(y[t])>=0){
              for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y[t]))+1; i<YN+(all2-otr2)*w2-5; i=i+9)
                g.drawLine((int)(otr*w+y[t]*w+XN),i,(int)(otr*w+y[t]*w+XN),i+6);
            }
            if(f(y[t])<0){
              for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y[t]))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
                g.drawLine((int)(otr*w+y[t]*w+XN),i,(int)(otr*w+y[t]*w+XN),i-6);
            }
            Stringer.drawString("a_{"+(tt+1)+"} = y_{"+t+"}",(int)(a[tt+1]*w+XN+otr*w-36),YN+w2*(all2-otr2)-8);
            g.setColor(new Color(98, 0, 170));
            if(f(z[t])>=0){
              for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z[t]))+1; i<YN+(all2-otr2)*w2-5; i=i+9)
                g.drawLine((int)(otr*w+z[t]*w+XN),i,(int)(otr*w+z[t]*w+XN),i+6);
            }
            if(f(z[t])<0){
              for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z[t]))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
                g.drawLine((int)(otr*w+z[t]*w+XN),i,(int)(otr*w+z[t]*w+XN),i-6);
            }
            Stringer.drawString("z_{"+t+"}",(int)(z[t]*w+XN+otr*w+5),YN+w2*(all2-otr2)-8);
            Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
            Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
            g.setColor(new Color(0, 0, 130));
            Stringer.drawString("b_{"+(tt+1)+"} = b_{"+t+"}",(int)(b[tt+1]*w+XN+otr*w+5),YN+w2*(all2-otr2)-8);
            Stringer.drawString("a_{"+tt+"}",(int)(XN+otr*w+a[tt]*w-13),YN+(all2-otr2)*w2+10);
        }
        if(((t==0 || t==4) && jRadioButton1.isSelected()==true) || ((t==1 || t==3) && jRadioButton2.isSelected()==true) ||
           (t==2 && jRadioButton3.isSelected()==true))
        {
          Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
          Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
          g.setColor(new Color(0, 0, 250));
          if(f(a[tt+1])>0)
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(a[tt+1]))+1; i<(int)(YN+(all2-otr2)*w2); i=i+9)
              g.drawLine((int)(otr*w+a[tt+1]*w+XN),i,(int)(otr*w+a[tt+1]*w+XN),i+6);
          if(f(a[tt+1])<0)
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(a[t+1]))-1; i>YN+(all2-otr2)*w2; i=i-9)
              g.drawLine((int)(otr*w+a[tt+1]*w+XN),i,(int)(otr*w+a[tt+1]*w+XN),i-6);
          if(f(b[tt+1])>0)
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(b[tt+1]))+1; i<YN+(all2-otr2)*w2; i=i+9)
              g.drawLine((int)(otr*w+b[tt+1]*w+XN),i,(int)(otr*w+b[tt+1]*w+XN),i+6);
          if(f(b[tt+1])<0)
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(b[tt+1]))-1; i>YN+(all2-otr2)*w2; i=i-9)
              g.drawLine((int)(otr*w+b[tt+1]*w+XN),i,(int)(otr*w+b[tt+1]*w+XN),i-6);
          g.drawLine((int)(XN+otr*w+a[tt+1]*w),(int)(YN+w2*(all2-otr2)),(int)(XN+otr*w+b[tt+1]*w),(int)(YN+w2*(all2-otr2)));
          g.drawLine((int)(XN+otr*w+a[tt+1]*w),(int)(YN+w2*(all2-otr2)+1),(int)(XN+otr*w+b[tt+1]*w),(int)(YN+w2*(all2-otr2)+1));
          Stringer.fonts[0]=new Font("SansSerif", 1, 14);
          Stringer.fonts[1]=new Font("SansSerif", 1, 11);
          Stringer.drawString("[",(int)(XN+otr*w+a[tt+1]*w-2),(int)(YN+(all2-otr2)*w2+4));
          Stringer.drawString("]",(int)(XN+otr*w+b[tt+1]*w-2),(int)(YN+(all2-otr2)*w2+4));
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
          Stringer.drawString("a_{"+tt+"}",(int)(XN+otr*w+a[tt]*w-13),(int)(YN+(all2-otr2)*w2-8));
          Stringer.drawString("b_{"+tt+"}",(int)(XN+otr*w+b[tt]*w+5),(int)(YN+(all2-otr2)*w2-8));
          g.setColor(new Color(0, 120, 0));
          if(f(y[t])>=0)
          {
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y[t]))+1; i<(int)(YN+(all2-otr2)*w2-5); i=i+9)
              g.drawLine((int)(otr*w+y[t]*w+XN),i,(int)(otr*w+y[t]*w+XN),i+6);
            Stringer.drawString("y_{"+t+"}",(int)(XN+otr*w+y[t]*w-13),(int)(YN+(all2-otr2)*w2-8));
          }
          if(f(y[t])<0)
          {
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y[t]))-1; i>(int)(YN+(all2-otr2)*w2+5); i=i-9)
              g.drawLine((int)(otr*w+y[t]*w+XN),i,(int)(otr*w+y[t]*w+XN),i-6);
            Stringer.drawString("y_{"+t+"}",(int)(XN+otr*w+y[t]*w-13),(int)(YN+(all2-otr2)*w2-8));
          }
          g.setColor(new Color(98, 0, 170));
          if(f(z[t])>=0)
          {
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z[t]))+1; i<(int)(YN+(all2-otr2)*w2-5); i=i+9)
              g.drawLine((int)(otr*w+z[t]*w+XN),i,(int)(otr*w+z[t]*w+XN),i+6);
            Stringer.drawString("z_{"+t+"}",(int)(XN+otr*w+z[t]*w+5),(int)(YN+(all2-otr2)*w2-8));
          }
          if(f(z[t])<0)
          {
            for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z[t]))-1; i>(int)(YN+(all2-otr2)*w2+5); i=i-9)
              g.drawLine((int)(otr*w+z[t]*w+XN),i,(int)(otr*w+z[t]*w+XN),i-6);
            Stringer.drawString("z_{"+t+"}",(int)(XN+otr*w+z[t]*w+5),(int)(YN+(all2-otr2)*w2-8));
          }
          Stringer.fonts[0]=new Font("SansSerif", 1, 14);
          Stringer.fonts[1]=new Font("SansSerif", 1, 11);
        }
        Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
        Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
        g.setColor(new Color(0, 120, 0));
        Stringer.drawString(""+y[t],(int)(XN+otr*w+y[t]*w-Fm1.stringWidth(""+y[t])),(int)(YN+(all2-otr2)*w2+12));
        g.fillOval((int)(otr*w+y[t]*w+XN-3),YN+(all2-otr2)*w2-3,6,6);
        g.setColor(new Color(98, 0, 170));
        Stringer.drawString(""+z[t],(int)(XN+otr*w+z[t]*w+1),(int)(YN+(all2-otr2)*w2+12));
        g.fillOval((int)(otr*w+z[t]*w+XN-3),YN+(all2-otr2)*w2-3,6,6);
        Stringer.fonts[0]=new Font("SansSerif", 1, 14);
        Stringer.fonts[1]=new Font("SansSerif", 1, 11);
      }
    }
    if(sh==6){
      if(AddRAnswer==false){ RightAnswer++; AddRAnswer=true;}
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
          Stringer.drawString("Да,   т.к. | b_{"+(k+1)+"} - a_{"+(k+1)+"} | > \u2113",xSt+40,ySt+45);
          Stringer.drawString("Да,   т.к. k \u2260 N-3",xSt+40,ySt+65);
          Stringer.drawString("Нет, т.к. | b_{"+(k+1)+"} - a_{"+(k+1)+"} | > \u03BE",xSt+40,ySt+85);
          if(jRadioButton2.isSelected())
          {
            jRadioButton1.setEnabled(false); jRadioButton3.setEnabled(false);
            g.setColor(Color.lightGray); Stringer.fonts[0]=new Font("Dialog", 3, 13);
            Stringer.drawString("Да,   т.к. | b_{"+(k+1)+"} - a_{"+(k+1)+"} | > \u2113",xSt+40,ySt+45);
            Stringer.drawString("Нет, т.к. | b_{"+(k+1)+"} - a_{"+(k+1)+"} | > \u03BE",xSt+40,ySt+85);
          }
          break;
        case 1:
          Stringer.drawString("Переходим к следующей итерации.",xSt+5,ySt+23);
          Stringer.fonts[0]=new Font("Dialog", 3, 13);
          Stringer.drawString("Да,   т.к. k \u2260 N-3",xSt+40,ySt+45);
          Stringer.drawString("Да,   т.к. | b_{"+(k+1)+"} - a_{"+(k+1)+"} | > \u03BE",xSt+40,ySt+65);
          Stringer.drawString("Нет, т.к. | b_{"+(k+1)+"} - a_{"+(k+1)+"} | > \u2113",xSt+40,ySt+85);
          if(jRadioButton1.isSelected())
          {
            jRadioButton2.setEnabled(false); jRadioButton3.setEnabled(false);
            g.setColor(Color.lightGray); Stringer.fonts[0]=new Font("Dialog", 3, 13);
            Stringer.drawString("Да,   т.к. | b_{"+(k+1)+"} - a_{"+(k+1)+"} | > \u03BE",xSt+40,ySt+65);
            Stringer.drawString("Нет, т.к. | b_{"+(k+1)+"} - a_{"+(k+1)+"} | > \u2113",xSt+40,ySt+85);
          }
          break;
        case 2:
          Stringer.drawString("Переходим к следующей итерации.",xSt+5,ySt+23);
          Stringer.fonts[0]=new Font("Dialog", 3, 13);
          Stringer.drawString("Да,   т.к. | b_{"+(k+1)+"} - a_{"+(k+1)+"} | \u2264 \u2113",xSt+40,ySt+45);
          Stringer.drawString("Да,   т.к. | b_{"+(k+1)+"} - a_{"+(k+1)+"} | > \u03BE",xSt+40,ySt+65);
          Stringer.drawString("Нет, т.к. k = N-3",xSt+40,ySt+85);
          if(jRadioButton3.isSelected())
          {
            jRadioButton1.setEnabled(false); jRadioButton2.setEnabled(false);
            g.setColor(Color.lightGray); Stringer.fonts[0]=new Font("Dialog", 3, 13);
            Stringer.drawString("Да,   т.к. | b_{"+(k+1)+"} - a_{"+(k+1)+"} | \u2264 \u2113",xSt+40,ySt+45);
            Stringer.drawString("Да,   т.к. | b_{"+(k+1)+"} - a_{"+(k+1)+"} | > \u03BE",xSt+40,ySt+65);
          }
          break;
      }
      //Stringer.drawString("процесс поиска завершить",xSt+68,ySt+24);
      if((jRadioButton2.isSelected() && k==0) || (jRadioButton1.isSelected() && k==1) || (jRadioButton3.isSelected() && (k==3 || k==2))){
        g.setColor(new Color(0, 0, 80)); Stringer.fonts[0]=new Font("SansSerif", 1, 14);
        Stringer.drawString("Проверяем условие окончания.",xSt+30,ySt);
        g.setColor(Color.blue);  Stringer.fonts[0]=new Font("Dialog", 1, 14);
        Stringer.drawString("Правильно",xSt+200,ySt+65);
        btnNext.setEnabled(true);
      }
      else
      {
        g.setColor(new Color(0, 0, 80)); Stringer.fonts[0]=new Font("SansSerif", 1, 14);
        Stringer.drawString("Проверяем условие окончания.",xSt+30,ySt);
        if(jRadioButton1.isSelected() || jRadioButton2.isSelected() || jRadioButton3.isSelected()){
          g.setColor(Color.red);  Stringer.fonts[0]=new Font("Dialog", 1, 14);
          if(language==0) Stringer.drawString("Incorrectly",xSt+350,ySt+40);
          else Stringer.drawString("Неправильно",xSt+200,ySt+65);
          if(entry==false){ Mist_knowledge[sh]++; entry=true;}
        }
      }

      if(AddRAnswer==false){ RightAnswer++; AddRAnswer=true;}
      Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
      Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
      g.setColor(new Color(0, 120, 0));
      if(f(y[k+1])>=0)
      {
        for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y[k+1]))+1; i<YN+(all2-otr2)*w2-5; i=i+9)
          g.drawLine((int)(otr*w+y[k+1]*w+XN),i,(int)(otr*w+y[k+1]*w+XN),i+6);
        Stringer.drawString("y_{"+(k+1)+"}",(int)(XN+otr*w+y[k+1]*w-13),YN+(all2-otr2)*w2-8);
      }
      if(f(y[k+1])<0)
      {
        for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y[k+1]))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
          g.drawLine((int)(otr*w+y[k+1]*w+XN),i,(int)(otr*w+y[k+1]*w+XN),i-6);
        Stringer.drawString("y_{"+(k+1)+"}",(int)(XN+otr*w+y[k+1]*w-13),YN+(all2-otr2)*w2-8);
      }
      Stringer.drawString(""+y[k+1],(int)(XN+otr*w+y[k+1]*w-Fm1.stringWidth(""+y[k+1])),YN+(all2-otr2)*w2+12);
      g.fillOval((int)(otr*w+y[k+1]*w+XN-3),YN+(all2-otr2)*w2-3,6,6);
      g.setColor(new Color(98, 0, 170));
      if(f(z[k+1])>=0)
      {
        for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z[k+1]))+1; i<YN+(all2-otr2)*w2-5; i=i+9)
          g.drawLine((int)(otr*w+z[k+1]*w+XN),i,(int)(otr*w+z[k+1]*w+XN),i+6);
        Stringer.drawString("z_{"+(k+1)+"}",(int)(XN+otr*w+z[k+1]*w+5),YN+(all2-otr2)*w2-8);
      }
      if(f(z[k+1])<0)
      {
        for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z[k+1]))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
          g.drawLine((int)(otr*w+z[k+1]*w+XN),i,(int)(otr*w+z[k+1]*w+XN),i-6);
        Stringer.drawString("z_{"+(k+1)+"}",(int)(XN+otr*w+z[k+1]*w+5),YN+(all2-otr2)*w2-8);
      }
      Stringer.drawString(""+z[k+1],(int)(XN+otr*w+z[k+1]*w)+1,YN+(all2-otr2)*w2+12);
      g.fillOval((int)(otr*w+z[k+1]*w+XN-3),YN+(all2-otr2)*w2-3,6,6);
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
      Stringer.drawString(""+a[k+1],(int)(XN+otr*w+a[k+1]*w-Fm1.stringWidth(""+a[k+1])),YN+(all2-otr2)*w2+12);
      Stringer.drawString(""+b[k+1],(int)(XN+otr*w+b[k+1]*w+1),YN+(all2-otr2)*w2+12);
      g.drawLine((int)(XN+otr*w+a[k+1]*w),YN+(all2-otr2)*w2,(int)(XN+otr*w+b[k+1]*w),YN+(all2-otr2)*w2);
      g.drawLine((int)(XN+otr*w+a[k+1]*w),YN+(all2-otr2)*w2+1,(int)(XN+otr*w+b[k+1]*w),YN+(all2-otr2)*w2+1);
      Stringer.fonts[0]=new Font("SansSerif", 1, 14);
      Stringer.drawString("[",(int)(XN+otr*w+a[k+1]*w-2),YN+(all2-otr2)*w2+4);
      Stringer.drawString("]",(int)(XN+otr*w+b[k+1]*w-2),YN+(all2-otr2)*w2+4);
      Stringer.fonts[1]=new Font("SansSerif", 1, 11);
    }

    if(sh==7){
      end=true;
      y[N-1]=z[N-2];
      z[N-1]=Math.round(y[N-1]*1000+E*1000)/1000.0;
      Stringer.drawString("Следует положить: y_{"+(N-1)+"} = y_{"+(N-2)+"} = z_{"+(N-2)+"} = "+y[N-1]+"  и  z_{"+(N-1)+"} = y_{"+(N-1)+"} + "+E+" = "+z[N-1]+".",xSt+30,ySt);
      Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
      Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
      g.setColor(new Color(0, 120, 0));
      if(f(y[N-1])>=0)
      {
        for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y[N-1]))+1; i<YN+(all2-otr2)*w2-5; i=i+9)
          g.drawLine((int)(otr*w+y[N-1]*w+XN),i,(int)(otr*w+y[N-1]*w+XN),i+6);
        Stringer.drawString("y_{"+(N-1)+"}",(int)(XN+otr*w+y[N-1]*w-13),YN+(all2-otr2)*w2-8);
      }
      if(f(y[N-1])<0)
      {
        for( int i = (int)(YN+(all2-otr2)*w2-w2*f(y[N-1]))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
          g.drawLine((int)(otr*w+y[N-1]*w+XN),i,(int)(otr*w+y[N-1]*w+XN),i-6);
        Stringer.drawString("y_{"+(N-1)+"}",(int)(XN+otr*w+y[N-1]*w-13),YN+(all2-otr2)*w2-8);
      }
      Stringer.drawString(""+y[N-1],(int)(XN+otr*w+y[N-1]*w-Fm1.stringWidth(""+y[N-1])),YN+(all2-otr2)*w2+12);
      g.fillOval((int)(otr*w+y[N-1]*w+XN-3),YN+(all2-otr2)*w2-3,6,6);
      g.setColor(new Color(98, 0, 170));
      if(f(z[N-1])>=0)
      {
        for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z[N-1]))+1; i<YN+(all2-otr2)*w2-5; i=i+9)
          g.drawLine((int)(otr*w+z[N-1]*w+XN),i,(int)(otr*w+z[N-1]*w+XN),i+6);
        Stringer.drawString("z_{"+(N-1)+"}",(int)(XN+otr*w+z[N-1]*w+5),YN+(all2-otr2)*w2-8);
      }
      if(f(z[N-1])<0)
      {
        for( int i = (int)(YN+(all2-otr2)*w2-w2*f(z[N-1]))-1; i>YN+(all2-otr2)*w2+5; i=i-9)
          g.drawLine((int)(otr*w+z[N-1]*w+XN),i,(int)(otr*w+z[N-1]*w+XN),i-6);
        Stringer.drawString("z_{"+(N-1)+"}",(int)(XN+otr*w+z[N-1]*w+5),YN+(all2-otr2)*w2-8);
      }
      Stringer.drawString(""+z[N-1],(int)(XN+otr*w+z[N-1]*w)+1,YN+(all2-otr2)*w2+12);
      g.fillOval((int)(otr*w+z[N-1]*w+XN-3),YN+(all2-otr2)*w2-3,6,6);
      g.setColor(new Color(0, 0, 130));
      if(f(a[N-2])>0)
        for( int i = (int)(YN+(all2-otr2)*w2-w2*f(a[N-2]))+1; i<YN+(all2-otr2)*w2; i=i+9)
          g.drawLine((int)(otr*w+a[N-2]*w+XN),i,(int)(otr*w+a[N-2]*w+XN),i+6);
      if(f(a[N-2])<0)
        for( int i = (int)(YN+(all2-otr2)*w2-w2*f(a[N-2]))-1; i>YN+(all2-otr2)*w2; i=i-9)
          g.drawLine((int)(otr*w+a[N-2]*w+XN),i,(int)(otr*w+a[N-2]*w+XN),i-6);
      if(f(b[N-2])>0)
        for( int i = (int)(YN+(all2-otr2)*w2-w2*f(b[N-2]))+1; i<YN+(all2-otr2)*w2; i=i+9)
          g.drawLine((int)(otr*w+b[N-2]*w+XN),i,(int)(otr*w+b[N-2]*w+XN),i+6);
      if(f(b[N-2])<0)
        for( int i = (int)(YN+(all2-otr2)*w2-w2*f(b[N-2]))-1; i>YN+(all2-otr2)*w2; i=i-9)
          g.drawLine((int)(otr*w+b[N-2]*w+XN),i,(int)(otr*w+b[N-2]*w+XN),i-6);
      Stringer.drawString("a_{"+(N-2)+"}",(int)(XN+otr*w+a[N-2]*w-13),YN+(all2-otr2)*w2-8);
      Stringer.drawString("b_{"+(N-2)+"}",(int)(XN+otr*w+b[N-2]*w+5),YN+(all2-otr2)*w2-8);
      g.drawLine((int)(XN+otr*w+a[N-2]*w),YN+(all2-otr2)*w2,(int)(XN+otr*w+b[N-2]*w),YN+(all2-otr2)*w2);
      g.drawLine((int)(XN+otr*w+a[N-2]*w),YN+(all2-otr2)*w2+1,(int)(XN+otr*w+b[N-2]*w),YN+(all2-otr2)*w2+1);
      Stringer.fonts[0]=new Font("SansSerif", 1, 14);
      Stringer.drawString("[",(int)(XN+otr*w+a[N-2]*w-2),YN+(all2-otr2)*w2+4);
      Stringer.drawString("]",(int)(XN+otr*w+b[N-2]*w-2),YN+(all2-otr2)*w2+4);
    }

    if(sh==8){
      Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
      Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
      g.setColor(new Color(0, 0, 130));
      if(f(a[N-1])>0)
        for( int i = (int)(YN+(all2-otr2)*w2-w2*f(a[N-1]))+1; i<YN+(all2-otr2)*w2; i=i+9)
          g.drawLine((int)(otr*w+a[N-1]*w+XN),i,(int)(otr*w+a[N-1]*w+XN),i+6);
      if(f(a[N-1])<0)
        for( int i = (int)(YN+(all2-otr2)*w2-w2*f(a[N-1]))-1; i>YN+(all2-otr2)*w2; i=i-9)
          g.drawLine((int)(otr*w+a[N-1]*w+XN),i,(int)(otr*w+a[N-1]*w+XN),i-6);
      if(f(b[N-1])>0)
        for( int i = (int)(YN+(all2-otr2)*w2-w2*f(b[N-1]))+1; i<YN+(all2-otr2)*w2; i=i+9)
          g.drawLine((int)(otr*w+b[N-1]*w+XN),i,(int)(otr*w+b[N-1]*w+XN),i+6);
      if(f(b[N-1])<0)
        for( int i = (int)(YN+(all2-otr2)*w2-w2*f(b[N-1]))-1; i>YN+(all2-otr2)*w2; i=i-9)
          g.drawLine((int)(otr*w+b[N-1]*w+XN),i,(int)(otr*w+b[N-1]*w+XN),i-6);
      Stringer.drawString("a_{"+(N-1)+"}",(int)(XN+otr*w+a[N-1]*w-13),YN+(all2-otr2)*w2-8);
      Stringer.drawString("b_{"+(N-1)+"}",(int)(XN+otr*w+b[N-1]*w+5),YN+(all2-otr2)*w2-8);
      g.drawLine((int)(XN+otr*w+a[N-1]*w),YN+(all2-otr2)*w2,(int)(XN+otr*w+b[N-1]*w),YN+(all2-otr2)*w2);
      g.drawLine((int)(XN+otr*w+a[N-1]*w),YN+(all2-otr2)*w2+1,(int)(XN+otr*w+b[N-1]*w),YN+(all2-otr2)*w2+1);
      Stringer.drawString(""+a[N-1],(int)(XN+otr*w+a[N-1]*w-Fm1.stringWidth(""+a[N-1])),YN+(all2-otr2)*w2+12);
      Stringer.drawString(""+b[N-1],(int)(XN+otr*w+b[N-1]*w)+1,YN+(all2-otr2)*w2+12);
      Stringer.fonts[0]=new Font("SansSerif", 1, 14);
      Stringer.drawString("[",(int)(XN+otr*w+a[N-1]*w-2),YN+(all2-otr2)*w2+4);
      Stringer.drawString("]",(int)(XN+otr*w+b[N-1]*w-2),YN+(all2-otr2)*w2+4);

      g.setColor(new Color(0, 0, 80));
      Stringer.drawString("В качестве приближенного решения можно взять середину",xSt+30,ySt);
      Stringer.drawString("последнего интервала:",xSt,ySt+33);
      Stringer.drawString("    =",xSt+173,ySt+35);
      Stringer.drawString("x^{*}",xSt+173,ySt+33);
      Stringer.drawString("( a_{"+(N-1)+"} + b_{"+(N-1)+"} )",xSt+203,ySt+20);
      Stringer.drawString("2",xSt+230,ySt+40);
      g.drawLine(xSt+203,ySt+27,xSt+260,ySt+27);
      g.drawLine(xSt+203,ySt+28,xSt+260,ySt+28);
      Stringer.drawString("=",xSt+269,ySt+35);
      Stringer.drawString("( "+a[N-1]+" + "+b[N-1]+")",xSt+283,ySt+20);
      Stringer.drawString("2",xSt+280+Fm.stringWidth("( "+a[N-1]+" + "+b[N-1]+")")/2,ySt+40);
      Stringer.drawString("= "+(Math.round((a[N-1]+b[N-1])*1000/2)/1000.0),xSt+289+Fm.stringWidth("( "+a[N-1]+" + "+b[N-1]+")"),ySt+35);
      g.drawLine(xSt+283,ySt+27,xSt+283+Fm.stringWidth("( "+a[N-1]+" + "+b[N-1]+")"),ySt+27);
      g.drawLine(xSt+283,ySt+28,xSt+283+Fm.stringWidth("( "+a[N-1]+" + "+b[N-1]+")"),ySt+28);
      g.setColor(Color.red);
      Stringer.fonts[0]=new Font("SansSerif", 1, ds-3);
      g.fillOval((int)((a[N-1]+b[N-1])*w/2+XN+otr*w-3),YN+(all2-otr2)*w2-3,6,6);
      if((int)(YN+(all2-otr2)*w2-f((a[N-1]+b[N-1])/2.0)*w2)>YN+(all2-otr2)*w2){
        for(int i=(int)(YN+(all2-otr2)*w2-f((a[N-1]+b[N-1])/2.0)*w2);i>YN+(all2-otr2)*w2+3;i-=9)
          g.drawLine((int)((a[N-1]+b[N-1])*w/2.0+XN+otr*w),i,(int)((a[N-1]+b[N-1])*w/2.0+XN+otr*w),i-6);}
      else{
        for(int i=(int)(YN+(all2-otr2)*w2-f((a[N-1]+b[N-1])/2.0)*w2);i<YN+(all2-otr2)*w2-3;i+=9)
          g.drawLine((int)((a[N-1]+b[N-1])*w/2.0+XN+otr*w),i,(int)((a[N-1]+b[N-1])*w/2.0+XN+otr*w),i+6);
      }
      Stringer.fonts[1]=new Font("SansSerif", 1, ds-5);
      Stringer.drawString("x^{*}",(int)((a[N-1]+b[N-1])*w/2+XN+otr*w),YN+(all2-otr2)*w2+20);
      Stringer.fonts[0]=new Font("SansSerif", 1, 14);
      Stringer.fonts[1]=new Font("SansSerif", 1, 11);
      btnNext.setEnabled(false);
      jCheckBoxRezult.setBounds(new Rectangle(xSt+195, ySt+62, 150, 23));
      jCheckBoxRezult.setVisible(true);  jCheckBoxRezult.setEnabled(true);
      g.setColor(Color.black);
      g.drawLine(xSt+179,ySt+55,xSt+339,ySt+55);
      g.drawLine(xSt+179,ySt+56,xSt+339,ySt+56);
      if(Ch==true)
      {
        int kolmist_calk=0, kolmist_under=0, kolmist_knowledge=0, kolmist_use=0, Vopros=0;
        g.setColor(new Color(190, 190, 190));
        g.fillRect(56,110,436,172);
        g.setColor(new Color(255, 255, 255));
        g.fillRect(49,103,436,172);
        g.setColor(new Color(247, 247, 255));
        g.fillRect(470,103,15,15);
        g.setColor(Color.blue);
        g.drawRect(49,103,436,172);
        g.drawRect(470,103,15,15); g.drawLine(470,103,485,118); g.drawLine(470,118,485,103);
        g.setColor(new Color(180, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 3, 13));
        g.drawString("Ваш результат:",218,122);
        for(int i=0; i<50; i++){
          kolmist_calk=kolmist_calk+Mist_calk[i];
          kolmist_under=kolmist_under+Mist_under[i];
          kolmist_knowledge=kolmist_knowledge+Mist_knowledge[i];
          kolmist_use=kolmist_use+Mist_use[i];
        }
        Vopros=RightAnswer+kolmist_calk+kolmist_under+kolmist_knowledge+kolmist_use;
        g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("Количество вопросов: "+Vopros,184,142);
        g.drawString("Количество правильных ответов: "+RightAnswer,139,162);
        g.drawString("Количество допущенных ошибок :",149,182);
        g.drawString("- на знание:           "+kolmist_knowledge,196,197);
        g.drawString("- на понимание:    "+kolmist_under,196,212);
        g.drawString("- на вычисление: "+kolmist_calk,196,227);
        g.setColor(Color.lightGray);
        g.drawString("- на применение: "+kolmist_use,196,242);
        g.setColor(new Color(0, 0, 80));
        if(Vopros!=0 && RightAnswer<=Vopros)
          g.drawString("Результат выполнения упражнения: "+(RightAnswer*100/Vopros)+"%",119,265);
        else
          g.drawString("Результат выполнения упражнения: 0%",119,265);
      }
    }
   /*     g.setColor(new Color(180, 0, 80));
      g.setFont(new java.awt.Font("SansSerif", 3, 13));
      int kolmist_calk=0, kolmist_under=0, kolmist_knowledge=0, kolmist_use=0;
      for(int i=0; i<10; i++){
        kolmist_calk=kolmist_calk+Mist_calk[i];
        kolmist_under=kolmist_under+Mist_under[i];
        kolmist_knowledge=kolmist_knowledge+Mist_knowledge[i];
        kolmist_use=kolmist_use+Mist_use[i];
      }
      g.drawString("RightAnswer="+RightAnswer+", calk="+kolmist_calk+", under="+kolmist_under+", knowledge="+kolmist_knowledge+", use="+kolmist_use,80,336);*/
   }
  }

  void btnNext_actionPerformed(ActionEvent e) {
    jRadioButton.setSelected(true); jRadioBtnYN.setSelected(true);
    jRadioButton1.setVisible(false); jRadioButton1.setEnabled(false);
    jRadioButton2.setVisible(false); jRadioButton2.setEnabled(false);
    jRadioButton3.setVisible(false); jRadioButton3.setEnabled(false);
    jRadioBtnYes.setVisible(false); jRadioBtnYes.setEnabled(false);
    jRadioBtnNo.setVisible(false); jRadioBtnNo.setEnabled(false);
    jButton1.setVisible(false);
    jButton1.setEnabled(false);
    jButton1.setVisible(false);
    jCBFib.setSelected(false);
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
    if (sh==6 && k!=N-3){ sh=3; k++; num=0;}
    else if(sh==5 && k==N-3 && end==true) sh=7;
    else if(sh==7) sh=3;
    num++;
    sh++;
    jPanel1.repaint();
    btnNext.setNextFocusableComponent(jButton1);
  }

  void btnNew_actionPerformed(ActionEvent e) {
    btnNext.setVisible(true); btnNext.setEnabled(true);
    jRadioButton.setSelected(true); jRadioBtnYN.setSelected(true);
    jRadioButton1.setVisible(false); jRadioButton1.setEnabled(false);
    jRadioButton2.setVisible(false); jRadioButton2.setEnabled(false);
    jRadioButton3.setVisible(false); jRadioButton3.setEnabled(false);
    jRadioBtnYes.setVisible(false); jRadioBtnYes.setEnabled(false);
    jRadioBtnNo.setVisible(false); jRadioBtnNo.setEnabled(false);
    jButton1.setVisible(false);
    jCheckBoxRezult.setSelected(true);
    jCheckBoxRezult.setVisible(false);
    jCheckBoxRezult.setEnabled(false);
    jCBFib.setSelected(false);
    jCBFib.setVisible(true);
    jCBFib.setEnabled(false);
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
    end=false;
    Ch=true; ChF=false;
    sh=-1; Fk=2;
    for (int j=1;j<10;j++){
      a[j]=0;b[j]=0;
      y[j]=0;z[j]=0;
    }
    l=0.5;E=0.3;k=0;num=-1;
    for(int i=0; i<50; i++){
      Mist_calk[i]=0;
      Mist_under[i]=0;
      Mist_knowledge[i]=0;
      Mist_use[i]=0;
    }
    jPanel1.repaint();
  }

  void jButton1_mouseClicked(MouseEvent e) {
    Proverka = -1; int j=0, i=-1;
    if(sh==0 || sh==1 || sh==5){
      if(jTF1.isEnabled()==true && jTF1.getText().equals("")!=true){
        try{
          if(sh==1)
            do{
              i++; j=i;
            } while(Fibonachi[i]<(Math.abs(b[k]-a[k])*1.0/l));
          if((sh==0 && Fibonachi[Fk] == Double.parseDouble(jTF1.getText())) ||
             (sh==1 && j == Double.parseDouble(jTF1.getText())) ||
             (sh==5 && ((jRadioButton1.isSelected() && y[k+1] == Double.parseDouble(jTF1.getText()) ) ||
                        (jRadioButton2.isSelected() && z[k+1] == Double.parseDouble(jTF1.getText()) ))
             )
            ){
            Proverka = 1;
            if(sh==1) N=j;
            if(sh==0){ jTF1.setText(""); Fk++;}
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
    }
    if(sh==3){
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
    }
    jPanel1.repaint();
  }

  void jPanel1_mouseClicked(MouseEvent e){
    if(sh==8 && e.getX()>=470 && e.getX()<=485 && e.getY()>=103 && e.getY()<=118){
      jCheckBoxRezult.setSelected(false);
      Ch=false;
      jPanel1.repaint();
    }
  }

  void jCheckBoxRezult_stateChanged(ChangeEvent e) {
    if(jCheckBoxRezult.isSelected()==true && sh==8){ Ch=true; jCBFib.setVisible(false);}
    else{ Ch=false;  jCBFib.setVisible(true);}
    jPanel1.repaint();
    jCheckBoxRezult.setOpaque(true);
  }

  void jCBFib_stateChanged(ChangeEvent e) {
    if(jCBFib.isSelected()==true) ChF=true;
    else ChF=false;
    jPanel1.repaint();
    jCBFib.setOpaque(true);
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
  void jTF1_inputMethodTextChanged(InputMethodEvent e) {
    jTF1.setForeground(new Color(0, 0, 80));
  }
  void jTF3_inputMethodTextChanged(InputMethodEvent e) {
    jTF3.setForeground(new Color(0, 0, 80));
  }
}