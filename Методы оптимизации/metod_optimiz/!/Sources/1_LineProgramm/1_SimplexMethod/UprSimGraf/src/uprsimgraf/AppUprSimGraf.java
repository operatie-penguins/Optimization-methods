package uprsimgraf;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.event.*;

public class AppUprSimGraf extends JApplet {
  JButton jButton1 = new JButton();
  JButton jButton2 = new JButton();
  JButton jButton3 = new JButton();
  JLabel jLabel1 = new JLabel();
  JRadioButton jRadioButton = new JRadioButton();
  JRadioButton jRadioButton1 = new JRadioButton();
  JRadioButton jRadioButton2 = new JRadioButton();
  ButtonGroup buttonGroup1 = new ButtonGroup();
  JTextField jTextField1 = new JTextField(3);
  JTextField jTextField2 = new JTextField(3);
  JCheckBox jCheckBoxRezult = new JCheckBox();
  Panel_mypaint jPanel1 = new Panel_mypaint();
  public int[] Mist_knowledge=new int [10];
  public int[] Mist_calk=new int [10];
  public int[] Mist_under=new int [10];
  public int[] Mist_use=new int [10];
  public int sh=0, // шаг
             w=18, //количество пикселов в 1 делении (на графике)
             k=18, //количество делений (всего) на графике
             kk=3, //количество делений (с отрицательным знаком) на графике
             XY[]={0,0,0,0}, //координаты линий x1=XY[0], y1=XY[1], x2=XY[2], y2=XY[3]
             X=0, //координата x щелчка мыши
             Y=0, //координата y щелчка мыши
             slog=2, //сложность 0 - *, 1 - ** или 2 - ***
             vrt = (int)(Math.random()*12), //вариант
             AddMist=0,
             q1=0,
             q2=0,
             t1=1,
             t2=1,
             tmp=0,
             Variant[]={0,1,2,3,4,5,6,7,8,9,10,11,1},
             task[][]={{0,0,0,0},  // функция
                       {0,0,0,0},  // первое ограничеие
                       {0,0,0,0}}; // второе ограничение
         double c1=0.0, //свободный член в строящейся прямой
                f=0.0, //значение функции f(x)
                minx=0.0, miny=0.0, maxx=0.0, maxy=0.0;
         String s="",//прямая
                s1="",//не полная запись прямой (без свободного члена)
                s2="";//не полная запись функции (без свободного члена)
         boolean fortify=false, //true - если прямая закреплена
                 Right=true, //true - если градиент посчитан правильно
                 entry=false, // true - если нажата кнопка закрепить
                 Ch=true;
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
    this.setSize(new Dimension(k*w+206, k*w+241));
    this.getContentPane().setLayout(null);
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel1.setForeground(new Color(130, 0, 80));
    jLabel1.setText("Упражнение");
    jLabel1.setBounds(new Rectangle(215, 4, 99, 17));
    jPanel1.setBounds(new Rectangle(5,21,k*w+196,k*w+176));
    jPanel1.setBackground(new Color(247, 247, 255));
    jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        jPanel1_mouseClicked(e);
      }
    });
    jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseDragged(MouseEvent e) {
        jPanel1_mouseDragged(e);
      }
    });
    jButton1.setBackground(new Color(220, 230, 255));
    jButton1.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton1.setForeground(new Color(0, 0, 60));
    jButton1.setText("==>");
    jButton1.setBounds(new Rectangle((k*w-4)/2+120, k*w+210, 100, 23));
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton1_actionPerformed(e);
      }
    });
    jButton2.setBackground(new Color(220, 230, 255));
    jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton2.setForeground(new Color(0, 0, 60));
    jButton2.setText("Обновить");
    jButton2.setBounds(new Rectangle((k*w-4)/2, k*w+210, 100, 23));
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton2_actionPerformed(e);
      }
    });
    jButton3.setBackground(new Color(220, 230, 255));
    jButton3.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton3.setForeground(new Color(0, 0, 60));
    jButton3.setText("Закрепить");
    jButton3.setBounds(new Rectangle(k*w/2+216, 365, 100, 23));
    jButton3.setEnabled(false);
    jButton3.setVisible(false);
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton3_actionPerformed(e);
      }
    });
    jRadioButton1.setBackground(new Color(255, 255, 255));
    jRadioButton1.setFont(new java.awt.Font("Dialog", 3, 13));
    jRadioButton1.setForeground(new Color(0, 0, 40));
    jRadioButton1.setText(" ");
    jRadioButton1.setBounds(new Rectangle(87, 200, 111, 25));
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
    jRadioButton2.setText(" ");
    jRadioButton2.setBounds(new Rectangle(87, 200, 111, 25));
    jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        jRadioButton2_itemStateChanged(e);
      }
    });
    jRadioButton.setBounds(new Rectangle(20, 200, 10, 5));
    jRadioButton.setVisible(false);
    jRadioButton.setSelected(true);
    buttonGroup1.add(jRadioButton);
    buttonGroup1.add(jRadioButton1);
    buttonGroup1.add(jRadioButton2);
    jTextField1.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField1.setForeground(new Color(0, 0, 120));
    jTextField1.setText("");
    jTextField1.setVisible(false); jTextField1.setEnabled(false);
    jTextField1.setDisabledTextColor(Color.blue);
    jTextField1.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField2.setVisible(false); jTextField2.setEnabled(false);
    jTextField2.setDisabledTextColor(Color.blue);
    jTextField2.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField2.setText("");
    jTextField2.setForeground(new Color(0, 0, 120));
    jTextField2.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField1.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField1_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField2.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField2_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
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
    jCheckBoxRezult.setBounds(new Rectangle((k*w+40)/2+7, k*w+135, 150, 23));
    jCheckBoxRezult.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(ChangeEvent e) {
        jCheckBoxRezult_stateChanged(e);
      }
    });
    this.getContentPane().add(jPanel1, null);
    this.getContentPane().add(jButton1, null);
    this.getContentPane().add(jButton2, null);
    this.getContentPane().add(jLabel1, null);
    this.jPanel1.add(jRadioButton, null);
    this.jPanel1.add(jRadioButton1, null);
    this.jPanel1.add(jRadioButton2, null);
    this.jPanel1.add(jTextField1, null);
    this.jPanel1.add(jTextField2, null);
    this.jPanel1.add(jCheckBoxRezult, null);
    this.jPanel1.add(jButton3, null);
    SetVariant();
  }

  public void Coordinate(int a, int b, double c)
  {
    for(int i = 0; i < 4; i++)
      XY[i]=0;
    if(a == 0 || b == 0)
    {
      if(a == 0 && b > -k && b<(k-kk))
      {
        XY[0]=8;
        XY[2]=w*k+6;
        XY[1]=(k-kk)*w+65-b*w;
        XY[3]=XY[1];
      }
      if(b == 0 && a > -k && a < (k-kk))
      {
        XY[1]=66;
        XY[3]=w*k+64;
        XY[0]=kk*w+7+a*w;
        XY[2]=XY[0];
      }
    }
    else
    {
      if(((c-a*(-kk))>=(-kk)*b && (c-a*(-kk))<=(k-kk)*b && b>0) || ((c-a*(-kk))<=(-kk)*b && (c-a*(-kk))>=(k-kk)*b && b<0))
      {
        XY[0]=8;
        XY[1]=(k-kk)*w+65-(int)((c-a*(-kk))*w/b);
      }
      if(((c-b*(-kk))>=(-kk)*a && (c-b*(-kk))<=(k-kk)*a && a>0) || ((c-b*(-kk))<=(-kk)*a && (c-b*(-kk))>=(k-kk)*a && a<0))
      {
        if(XY[0]!=0)
        {
          XY[3]=k*w+64;
          XY[2]=kk*w+8+(int)((c-b*(-kk))*w/a);
        }
        else
        {
          XY[0]=kk*w+8+(int)((c-b*(-kk))*w/a);
          XY[1]=k*w+64;
        }
      }
      if(XY[0]==0 || XY[3]==0)
      {
        if(((c-a*(k-kk))>=(-kk)*b && (c-a*(k-kk))<=(k-kk)*b && b>0) || ((c-a*(k-kk))<=(-kk)*b && (c-a*(k-kk))>=(k-kk)*b && b<0))
        {
          if(XY[0]==0)
          {
            XY[0]=w*k+6;
            XY[1]=(k-kk)*w+65-(int)((c-a*(k-kk))*w/b);
          }
          else
          {
            XY[2]=w*k+6;
            XY[3]=(k-kk)*w+65-(int)((c-a*(k-kk))*w/b);
          }
        }
        if(((c-b*(k-kk))>=(-kk)*a && (c-b*(k-kk))<=(k-kk)*a && a>0) || ((c-b*(k-kk))<=(-kk)*a && (c-b*(k-kk))>=(k-kk)*a && a<0))
        {
          if(XY[0]==0)
          {
            XY[1]=66;
            XY[0]=kk*w+8+(int)((c-b*(k-kk))*w/a);
          }
          else
          {
            XY[3]=66;
            XY[2]=kk*w+8+(int)((c-b*(k-kk))*w/a);
          }
        }
      }
      if(a==-b && c==0)
      {
        XY[0]=8;
        XY[1]=k*w+64;
        XY[2]=k*w+6;
        XY[3]=66;
      }
    /*  if(a==b)
      {
        XY[0]=8;
        XY[1]=66;
        XY[2]=k*w+6;
        XY[3]=k*w+64;

      }*/
    }
  }

  public void StraightLine(int a, int b, int c)
  {
    if(a>0)
    {
      s=a+"x_{1} ";
      if(b>0) s=s+"+ "+b+"x_{2} ";
      if(b<0) s=s+"- "+Math.abs(b)+"x_{2} ";
    }
    else if(a<0)
        {
          s="- "+Math.abs(a)+"x_{1} ";
          if(b>0) s=s+"+ "+b+"x_{2} ";
          if(b<0) s=s+"- "+Math.abs(b)+"x_{2} ";
        }
        else
        {
          if(b>0) s=b+"x_{2} ";
          if(b<0) s="- "+Math.abs(b)+"x_{2} ";
        }
        s1=s;
        if(s.equals("")==false) s=s+"= "+c;
        else s="0 = "+c;
  }

  public void SetVariant()
  {
    switch(vrt)
    {
      case 0:
        task[0][0]=-1; task[0][1]=1; task[0][2]=700; task[0][3]=75;
        task[1][0]=-1; task[1][1]=2; task[1][2]=4; task[1][3]=1;
        task[2][0]=3; task[2][1]=2; task[2][2]=14; task[2][3]=-1;
        q1=27; q2=16;
        maxx=0; maxy=7; minx=2.5; miny=3.25;
        break;
      case 1:
        task[0][0]=-1; task[0][1]=2; task[0][2]=500; task[0][3]=-400;
        task[1][0]=-1; task[1][1]=1; task[1][2]=2; task[1][3]=-1;
        task[2][0]=1; task[2][1]=1; task[2][2]=4; task[2][3]=-1;
        maxx=1; maxy=3; minx=4; miny=0;
        q1=18; q2=30;
        break;
      case 2:
        task[0][0]=1; task[0][1]=4; task[0][2]=2400; task[0][3]=0;
        task[1][0]=2; task[1][1]=3; task[1][2]=18; task[1][3]=-1;
        task[2][0]=3; task[2][1]=9; task[2][2]=54; task[2][3]=-1;
        maxx=0; maxy=6; minx=0; miny=0;
        q1=24; q2=8;
        break;
      case 3:
        task[0][0]=1; task[0][1]=-1; task[0][2]=1400/3; task[0][3]=-200;
        task[1][0]=-1; task[1][1]=2; task[1][2]=4; task[1][3]=-1;
        task[2][0]=3; task[2][1]=2; task[2][2]=14; task[2][3]=-1;
        maxx=14.0/3; maxy=0; minx=0; miny=2;
        q1=30; q2=15;
        break;
      case 4:
        task[0][0]=1; task[0][1]=-1; task[0][2]=0; task[0][3]=0;
        task[1][0]=-1; task[1][1]=2; task[1][2]=8; task[1][3]=1;
        task[2][0]=3; task[2][1]=2; task[2][2]=6; task[2][3]=-1;
        q1=31; q2=18;
        break;
      case 5:
        task[0][0]=-2; task[0][1]=4; task[0][2]=800; task[0][3]=-2800/3;
        task[1][0]=-1; task[1][1]=2; task[1][2]=4; task[1][3]=-1;
        task[2][0]=3; task[2][1]=2; task[2][2]=14; task[2][3]=-1;
        maxx=-0.4; maxy=3.7; minx=14.0/3; miny=0;
        q1=18; q2=14;
        break;
      case 6:
        task[0][0]=3; task[0][1]=-1; task[0][2]=1800; task[0][3]=-400;
        task[1][0]=6; task[1][1]=6; task[1][2]=36; task[1][3]=-1;
        task[2][0]=4; task[2][1]=8; task[2][2]=32; task[2][3]=-1;
        maxx=6; maxy=0; minx=0; miny=4;
        q1=29; q2=9;
        break;
      case 7:
        task[0][0]=2; task[0][1]=-2; task[0][2]=800; task[0][3]=-1600;
        task[1][0]=1; task[1][1]=2; task[1][2]=16; task[1][3]=-1;
        task[2][0]=5; task[2][1]=2; task[2][2]=20; task[2][3]=-1;
        maxx=4; maxy=0; minx=0; miny=8;
        q1=24; q2=15;
        break;
      case 8:
        task[0][0]=1; task[0][1]=3; task[0][2]=4700/3; task[0][3]=100;
        task[1][0]=1; task[1][1]=-1; task[1][2]=1; task[1][3]=1;
        task[2][0]=1; task[2][1]=2; task[2][2]=12; task[2][3]=-1;
        maxx=14.0/3; maxy=11.0/3; minx=1; miny=0;
        q1=25; q2=35;
        break;
      case 9:
        task[0][0]=-1; task[0][1]=2; task[0][2]=200; task[0][3]=-400;
        task[1][0]=1; task[1][1]=1; task[1][2]=4; task[1][3]=-1;
        task[2][0]=-1; task[2][1]=2; task[2][2]=2; task[2][3]=-1;
        maxx=1.5; maxy=2.5; minx=4; miny=0;
        q1=20; q2=27;
        break;
      case 10:
        task[0][0]=-1; task[0][1]=-1; task[0][2]=-200; task[0][3]=-700;
        task[1][0]=-1; task[1][1]=2; task[1][2]=4; task[1][3]=1;
        task[2][0]=3; task[2][1]=2; task[2][2]=14; task[2][3]=-1;
        maxx=0; maxy=2; minx=0; miny=7;
        q1=27; q2=15;
        break;
      case 11:
        task[0][0]=1; task[0][1]=-1; task[0][2]=700; task[0][3]=75;
        task[1][0]=2; task[1][1]=-3; task[1][2]=10; task[1][3]=1;
        task[2][0]=1; task[2][1]=2; task[2][2]=4; task[2][3]=-1;
        q1=25; q2=18;
        break;
    }
  }

  class  Panel_mypaint extends JPanel {
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Stringer.setGraphics(g);
      g.setColor(new Color(180, 0, 80));
      Stringer.fonts[0] = new Font("SansSerif", 3, 13);
     // Stringer.drawString(vrt+"",0,10);
      Stringer.drawString("Задача:  ",q1,17);
      Stringer.drawString("Решение:  ",15,k*w+80);
      Stringer.drawString("Графическая иллюстрация:",15,60);
      Stringer.drawString("Задача:",k*w+35,60);
      Stringer.drawString("Текущее состояние:",k*w+35,163);
      Stringer.fonts[0] = new Font("SansSerif", 1, 14);
      g.setColor(new Color(255, 255, 255));
      g.fillRect(7,65,k*w,k*w); g.fillRect(7,k*w+85,k*w+181,90); g.fillRect(k*w+27,65,486-k*w,83); g.fillRect(k*w+27,168,486-k*w,221);
      g.setColor(new Color(157, 187, 255));
      g.drawRect(7,65,k*w,k*w); g.drawRect(7,k*w+85,k*w+181,90); g.drawRect(k*w+27,65,486-k*w,83); g.drawRect(k*w+27,168,486-k*w,221);
      g.drawLine(520,0,520,500);// Stringer.drawString("f(x)="+f,252, k*w+125);

      String ss[]={"","","","","",""};
      g.setColor(new Color(0, 0, 80));
      ss[0]="Найти максимум и минимум функции  f(x) = ";
      ss[1]="при ограничениях ";
      if(task[0][0]>1) ss[2]=ss[2]+task[0][0]+"x_{1}";
      if(task[0][0]<-1) ss[2]=ss[2]+"- "+Math.abs(task[0][0])+"x_{1}";
      if(task[0][0]==1) ss[2]=ss[2]+"x_{1}";
      if(task[0][0]==-1) ss[2]=ss[2]+"- x_{1}";
      if(task[0][1]>0){
        if(task[0][1]!=1) ss[2]=ss[2]+"+ "+task[0][1]+" x_{2} ";
        else ss[2]=ss[2]+"+ x_{2} ";
      }
      if(task[0][1]<0){
        if(Math.abs(task[0][1])!=1) ss[2]=ss[2]+"- "+Math.abs(task[0][1])+" x_{2} ";
        else ss[2]=ss[2]+"- x_{2} ";
      }
      s2=ss[2];
      ss[2]=ss[2]+"\u2192 extr";
      ss[0]=ss[0]+ss[2];
      ss[2]="f(x) = "+ss[2];
      for(int i=1; i<=2; i++){
        for(int j=1; j<=2; j++){
          if(j==1 && task[i][j-1]>0){
            if(task[i][j-1]!=1) ss[i+2]=ss[i+2]+task[i][j-1]+" x_{"+j+"}";
            else ss[i+2]=ss[i+2]+"x_{"+j+"}";
          }
          else if(j>1 && task[i][j-1]>0){
                 if(task[i][j-1]!=1) ss[i+2]=ss[i+2]+"+ "+task[i][j-1]+" x_{"+j+"}";
                 else ss[i+2]=ss[i+2]+"+ x_{"+j+"}";
          }
          if(task[i][j-1]<0){
            if(task[i][j-1]!=-1) ss[i+2]=ss[i+2]+"- "+Math.abs(task[i][j-1])+" x_{"+j+"}";
            else ss[i+2]=ss[i+2]+"- x_{"+j+"}";
          }
        }
        if(task[i][3]==1) ss[i+2]=ss[i+2]+" \u2265 ";
        if(task[i][3]==-1) ss[i+2]=ss[i+2]+" \u2264 ";
        if(task[i][3]==0) ss[i+2]=ss[i+2]+" = ";
        if(task[i][2]>=0) ss[i+2]=ss[i+2]+task[i][2];
        else ss[1]=ss[1]+"- "+Math.abs(task[i][2]);
        ss[1]=ss[1]+ss[i+2]+",  ";
      }
      ss[1]=ss[1]+" x_{1}, x_{2} \u2265 0, графически";
      ss[5]="x_{1}, x_{2} \u2265 0";
      Stringer.drawString(ss[0],q1+57,17);
      Stringer.drawString(ss[1],q2,37);

      if(sh==0)
      {
        for(int i=0; i<10; i++){
            Mist_calk[i]=0;
            Mist_under[i]=0;
            Mist_knowledge[i]=0;
            Mist_use[i]=0;
        }
        AddMist=0;  X=0; Y=0; c1=0.0; f=0.0; s=""; s1="";
      }
      //
      g.setColor(new Color(0, 0, 80));
      Stringer.drawString(ss[2],k*w+27+(486-k*w-ss[2].length()*5)/2,80);
      Stringer.drawString(ss[3],k*w+27+(486-k*w-ss[3].length()*4)/2,100);
      Stringer.drawString(ss[4],k*w+27+(486-k*w-ss[4].length()*4)/2,120);
      Stringer.drawString(ss[5],k*w+27+(486-k*w-ss[5].length()*4)/2,140);

      if((sh>7 || (sh==7 && (fortify==true || (slog==0 && jRadioButton2.isSelected()==true)))) && vrt!=4 && vrt!=11)
      {
        int xp[]={0,0,0,0}, yp[]={0,0,0,0}, kp=1;
        switch(vrt)
        {
          case 0:
            xp[0]=kk*w+7; xp[1]=kk*w+7; xp[2]=kk*w+7+w*5/2; xp[3]=0;
            yp[0]=65+(k-kk)*w-w*2; yp[1]=65+(k-kk)*w-7*w; yp[2]=65+(k-kk)*w-w*13/4; yp[3]=0;
            kp=3;
            break;
          case 1:
            xp[0]=kk*w+7; xp[1]=kk*w+7; xp[2]=kk*w+7+w*1; xp[3]=kk*w+8+w*4;
            yp[0]=65+(k-kk)*w; yp[1]=65+(k-kk)*w-2*w; yp[2]=65+(k-kk)*w-w*3; yp[3]=65+(k-kk)*w;
            kp=4;
            break;
          case 2:
            xp[0]=kk*w+7; xp[1]=kk*w+7; xp[2]=kk*w+7+w*9; xp[3]=0;
            yp[0]=65+(k-kk)*w; yp[1]=65+(k-kk)*w-6*w; yp[2]=65+(k-kk)*w; yp[3]=0;
            kp=3;
            break;
          case 3:
            xp[0]=kk*w+7; xp[1]=kk*w+7; xp[2]=kk*w+7+w*5/2; xp[3]=kk*w+8+w*14/3;
            yp[0]=65+(k-kk)*w; yp[1]=65+(k-kk)*w-2*w; yp[2]=65+(k-kk)*w-w*13/4; yp[3]=65+(k-kk)*w;
            kp=4;
            break;
          case 4:
            break;
          case 5:
            xp[0]=kk*w+7; xp[1]=kk*w+7; xp[2]=kk*w+7+w*5/2; xp[3]=kk*w+8+w*14/3;
            yp[0]=65+(k-kk)*w; yp[1]=65+(k-kk)*w-2*w; yp[2]=65+(k-kk)*w-w*13/4; yp[3]=65+(k-kk)*w;
            kp=4;
            break;
          case 6:
            xp[0]=kk*w+7; xp[1]=kk*w+7; xp[2]=kk*w+7+w*4; xp[3]=kk*w+8+w*6;
            yp[0]=65+(k-kk)*w; yp[1]=65+(k-kk)*w-4*w; yp[2]=65+(k-kk)*w-w*2; yp[3]=65+(k-kk)*w;
            kp=4;
            break;
          case 7:
            xp[0]=kk*w+7; xp[1]=kk*w+7; xp[2]=kk*w+7+w*1; xp[3]=kk*w+8+w*4;
            yp[0]=65+(k-kk)*w; yp[1]=65+(k-kk)*w-8*w; yp[2]=65+(k-kk)*w-w*15/2; yp[3]=65+(k-kk)*w;
            kp=4;
            break;
          case 8:
            xp[0]=kk*w+7+w*1; xp[1]=kk*w+7+w*14/3; xp[2]=kk*w+7+w*12;
            yp[0]=65+(k-kk)*w; yp[1]=65+(k-kk)*w-w*11/3; yp[2]=65+(k-kk)*w;
            kp=3;
            break;
          case 9:
            xp[0]=kk*w+7; xp[1]=kk*w+7; xp[2]=kk*w+7+w*2; xp[3]=kk*w+8+w*4;
            yp[0]=65+(k-kk)*w; yp[1]=65+(k-kk)*w-1*w; yp[2]=65+(k-kk)*w-w*2; yp[3]=65+(k-kk)*w;
            kp=4;
            break;
          case 10:
            xp[0]=kk*w+7; xp[1]=kk*w+7; xp[2]=kk*w+7+w*5/2;
            yp[0]=65+(k-kk)*w-w*2; yp[1]=65+(k-kk)*w-w*7; yp[2]=65+(k-kk)*w-w*13/4;
            kp=3;
            break;
          case 11:
            break;
        }
        g.setColor(new Color(227, 227, 255));
        g.fillPolygon(xp,yp,kp);
      }

      //координатная плоскость
      g.setColor(Color.black);
      g.drawLine(kk*w+7,71,kk*w+7,k*w+64);
      g.drawLine(8,(k-kk)*w+65,k*w+5,(k-kk)*w+65);
      Stringer.drawString("x_{2}",kk*w+13,76); Stringer.drawString("x_{1}",k*w-8,(k-kk)*w+55);
      int a1[]={kk*w+2,kk*w+7,kk*w+12}, b1[]={72,65,72};
      int a2[]={k*w+1,k*w+6,k*w+1}, b2[]={(k-kk)*w+60,(k-kk)*w+65,(k-kk)*w+70};
      g.fillPolygon(a1,b1,3);
      g.fillPolygon(a2,b2,3);
      Stringer.fonts[0] = new Font("SansSerif", 1, 11);
      for(int i=1-kk; i<(k-kk); i++){
        g.setColor(Color.black);
        g.drawLine(kk*w+4,(k-kk)*w+65-w*i,kk*w+10,(k-kk)*w+65-w*i);
        g.drawLine(kk*w+7+w*i,(k-kk)*w+62,kk*w+7+w*i,(k-kk)*w+68);
        g.setColor(Color.darkGray);
        if(i%2==0 && i!=0){
          Stringer.drawString(""+i,kk*w+4+w*i-(int)(i/9)*2,(k-kk)*w+80);
          Stringer.drawString(""+i,kk*w-7-(int)(i/9)*4,(k-kk)*w+69-w*i);
        }
      }
      Stringer.drawString("0",kk*w-1,(k-kk)*w+76);
      Stringer.fonts[0] = new Font("SansSerif", 1, 14); g.setColor(new Color(0, 0, 80));

      if(sh>=2)
      {
        g.setColor(Color.magenta);
        Stringer.drawString("x_{1 }= 0,  x_{2 }= 0",k*w+27+(486-k*w-("x_{1}=0,  x_{2}=0").length()*5)/2,188);
        g.drawLine(kk*w+7,73,kk*w+7,64+k*w);
        g.drawLine(8,65+(k-kk)*w,k*w,65+(k-kk)*w);
        if(sh>2 || fortify==true || slog==0)
        {
          g.drawLine(kk*w+7,73,kk*w+7,64+(k-kk)*w);
          g.drawLine(kk*w+7,65+(k-kk)*w,k*w,65+(k-kk)*w);
          for(int j = 65+(k-kk)*w; j>70; j=j-13)
            g.drawLine(kk*w+7,j,kk*w+15,j-8);
          for(int i = kk*w+7; i<k*w-13; i=i+13)
            g.drawLine(i,65+(k-kk)*w,i+8,57+(k-kk)*w);
        }
      }
      if(sh>=3)
      {
        StraightLine(task[1][0], task[1][1], task[1][2]);
        if(sh==3 && fortify==false && slog==2)
        {
          if(c1>1.0*task[1][2]-0.2 && c1<1.0*task[1][2]+0.2) g.setColor(new Color(0,0,200));
          else g.setColor(Color.gray);
          Coordinate(task[1][0], task[1][1], c1);
          StraightLine(task[1][0], task[1][1], task[1][2]);
          Stringer.drawString(s1+"= "+c1,k*w+27+(486-k*w-(s1+"="+c1).length()*5)/2,208);
          jButton3.setBounds(new Rectangle(k*w/2+221, 360, 100, 23));
          jButton3.setText("Закрепить");
          jButton3.setVisible(true);
          jButton3.setEnabled(true);
          jButton1.setEnabled(false);
        }
        else
        {
          g.setColor(new Color(0,0,200));
          Coordinate(task[1][0], task[1][1], task[1][2]);
          StraightLine(task[1][0], task[1][1], task[1][2]);
          Stringer.drawString(s1+"= "+task[1][2],k*w+27+(486-k*w-(s1+"="+task[1][2]).length()*5)/2,208);
      //    Stringer.drawString(""+s,k*w+40,165);
          if(sh==3)
          {
            jButton3.setEnabled(false);
            jButton3.setVisible(false);
            jButton1.setEnabled(true);
          }
        }
        g.drawLine(XY[0], XY[1], XY[2], XY[3]);
      }
      if(sh>4 || (sh==4 && (fortify==true || slog==0)))
      {
        if(slog==0)
        {
          t1=-1;
          if(((int)(65+(k-kk)*w-w*(task[1][2]-task[1][0]*(-kk))/task[1][1])>=65 && (task[1][0]*(-kk)+task[1][1]*(k-kk))*task[1][3]>task[1][2]*task[1][3]) ||
             ((int)(65+(k-kk)*w-w*(task[1][2]-task[1][0]*(k-kk))/task[1][1])>=65 && (task[1][0]*(k-kk)+task[1][1]*(k-kk))*task[1][3]>task[1][2]*task[1][3]))
          t1=1;
        }
        if(task[1][0]*task[1][1]>0)
        {
          if(XY[0]<XY[2])
            for(int i = XY[0]+5; i < XY[2]-5; i=i+10)
            {
              if(65+w*(k-kk)-(task[1][2]*w-task[1][0]*(i-7-kk*w))/task[1][1]-t1*10>65 && 65+w*(k-kk)-(task[1][2]*w-task[1][0]*(i-7-kk*w))/task[1][1]-t1*10<65+k*w)
                tmp=65+w*(k-kk)-(task[1][2]*w-task[1][0]*(i-7-kk*w))/task[1][1]-t1*10;
              else if(65+w*(k-kk)-(task[1][2]*w-task[1][0]*(i-7-kk*w))/task[1][1]-t1*10<=65) tmp=66;
                   else if(65+w*(k-kk)-(task[1][2]*w-task[1][0]*(i-7-kk*w))/task[1][1]-t1*10>=65+k*w) tmp=64+k*w;
              g.drawLine(i,65+w*(k-kk)-(task[1][2]*w-task[1][0]*(i-7-kk*w))/task[1][1],i,tmp);
            }
          else if(XY[0]>XY[2])
                  for(int i = XY[2]+5; i < XY[0]-5; i=i+10)
                  {
                    if(65+w*(k-kk)-(task[1][2]*w-task[1][0]*(i-7-kk*w))/task[1][1]-t1*10>65 && 65+w*(k-kk)-(task[1][2]*w-task[1][0]*(i-7-kk*w))/task[1][1]-t1*10<65+k*w)
                      tmp=65+w*(k-kk)-(task[1][2]*w-task[1][0]*(i-7-kk*w))/task[1][1]-t1*10;
                    else if(65+w*(k-kk)-(task[1][2]*w-task[1][0]*(i-7-kk*w))/task[1][1]-t1*10<=65) tmp=66;
                         else if(65+w*(k-kk)-(task[1][2]*w-task[1][0]*(i-7-kk*w))/task[1][1]-t1*10>=65+k*w) tmp=64+k*w;
                    g.drawLine(i,65+w*(k-kk)-(task[1][2]*w-task[1][0]*(i-7-kk*w))/task[1][1],i,tmp);
                  }
        }
        if(task[1][0]*task[1][1]<0)
        {
          if(XY[0]<XY[2])
            for(int i = XY[2]-5; i > XY[0]+5; i=i-10)
            {
              if(65+w*(k-kk)-(task[1][2]*w-task[1][0]*(i-7-kk*w))/task[1][1]-t1*10>65 && 65+w*(k-kk)-(task[1][2]*w-task[1][0]*(i-7-kk*w))/task[1][1]-t1*10<65+k*w)
                tmp=65+w*(k-kk)-(task[1][2]*w-task[1][0]*(i-7-kk*w))/task[1][1]-t1*10;
              else if(65+w*(k-kk)-(task[1][2]*w-task[1][0]*(i-7-kk*w))/task[1][1]-t1*10<=65) tmp=66;
                   else if(65+w*(k-kk)-(task[1][2]*w-task[1][0]*(i-7-kk*w))/task[1][1]-t1*10>=65+k*w) tmp=64+k*w;
              g.drawLine(i,65+w*(k-kk)-(task[1][2]*w-task[1][0]*(i-7-kk*w))/task[1][1],i,tmp);
            }
          else if(XY[0]>XY[2])
                  for(int i = XY[0]-5; i > XY[2]+5; i=i-10)
                  {
                    if(65+w*(k-kk)-(task[1][2]*w-task[1][0]*(i-7-kk*w))/task[1][1]-t1*10>65 && 65+w*(k-kk)-(task[1][2]*w-task[1][0]*(i-7-kk*w))/task[1][1]-t1*10<65+k*w)
                      tmp=65+w*(k-kk)-(task[1][2]*w-task[1][0]*(i-7-kk*w))/task[1][1]-t1*10;
                    else if(65+w*(k-kk)-(task[1][2]*w-task[1][0]*(i-7-kk*w))/task[1][1]-t1*10<=65) tmp=66;
                         else if(65+w*(k-kk)-(task[1][2]*w-task[1][0]*(i-7-kk*w))/task[1][1]-t1*10>=65+k*w) tmp=64+k*w;
                    g.drawLine(i,65+w*(k-kk)-(task[1][2]*w-task[1][0]*(i-7-kk*w))/task[1][1],i,tmp);
                  }
        }
      }
      if(sh>=5)
      {
        if(sh==5 && fortify==false && slog==2)
        {
          if(c1>1.0*task[2][2]-0.2 && c1<1.0*task[2][2]+0.2) g.setColor(new Color(0, 120, 0));
          else g.setColor(Color.gray);
          Coordinate(task[2][0], task[2][1], c1);
          StraightLine(task[2][0], task[2][1], task[2][2]);
          Stringer.drawString(s1+"= "+c1,k*w+27+(486-k*w-(s1+"="+c1).length()*5)/2,228);
          jButton3.setBounds(new Rectangle(k*w/2+221, 360, 100, 23));
          jButton3.setText("Закрепить");
          jButton3.setVisible(true);
          jButton3.setEnabled(true);
          jButton1.setEnabled(false);
        }
        else
        {
          g.setColor(new Color(0, 120, 0));
          Coordinate(task[2][0], task[2][1], task[2][2]);
          StraightLine(task[2][0], task[2][1], task[2][2]);
          Stringer.drawString(s1+"= "+task[2][2],k*w+27+(486-k*w-(s1+"="+task[2][2]).length()*5)/2,228);
          if(sh==5)
          {
            jButton3.setEnabled(false);
            jButton3.setVisible(false);
            jButton1.setEnabled(true);
          }
        }
        g.drawLine(XY[0], XY[1], XY[2], XY[3]);
      }
      if(sh>6 || (sh==6 && (fortify==true || slog==0)))
      {
        if(slog==0)
        {
          t2=-1;
          if(((int)(65+(k-kk)*w-w*(task[2][2]-task[2][0]*(-kk))/task[1][1])>=65 && (task[2][0]*(-kk)+task[2][1]*(k-kk))*task[2][3]>task[2][2]*task[2][3]) ||
             ((int)(65+(k-kk)*w-w*(task[2][2]-task[2][0]*(k-kk))/task[1][1])>=65 && (task[2][0]*(k-kk)+task[2][1]*(k-kk))*task[2][3]>task[2][2]*task[2][3]))
          t2=1;
        }
        if(task[2][0]*task[2][1]>0)
        {
          if(XY[0]<XY[2])
            for(int i = XY[0]+5; i < XY[2]-5; i=i+10)
            {
              if(65+w*(k-kk)-(task[2][2]*w-task[2][0]*(i-7-kk*w))/task[2][1]-t2*10>65 && 65+w*(k-kk)-(task[2][2]*w-task[2][0]*(i-7-kk*w))/task[2][1]-t2*10<65+k*w)
                tmp=65+w*(k-kk)-(task[2][2]*w-task[2][0]*(i-7-kk*w))/task[2][1]-t2*10;
              else if(65+w*(k-kk)-(task[2][2]*w-task[2][0]*(i-7-kk*w))/task[2][1]-t2*10<=65) tmp=66;
                   else if(65+w*(k-kk)-(task[2][2]*w-task[2][0]*(i-7-kk*w))/task[2][1]-t2*10>=65+k*w) tmp=64+k*w;
              g.drawLine(i,65+w*(k-kk)-(task[2][2]*w-task[2][0]*(i-7-kk*w))/task[2][1],i,tmp);
            }
          else if(XY[0]>XY[2])
                  for(int i = XY[2]+5; i < XY[0]-5; i=i+10)
                  {
                    if(65+w*(k-kk)-(task[2][2]*w-task[2][0]*(i-7-kk*w))/task[2][1]-t2*10>65 && 65+w*(k-kk)-(task[2][2]*w-task[2][0]*(i-7-kk*w))/task[2][1]-t2*10<65+k*w)
                      tmp=65+w*(k-kk)-(task[2][2]*w-task[2][0]*(i-7-kk*w))/task[2][1]-t2*10;
                    else if(65+w*(k-kk)-(task[2][2]*w-task[2][0]*(i-7-kk*w))/task[2][1]-t2*10<=65) tmp=66;
                         else if(65+w*(k-kk)-(task[2][2]*w-task[2][0]*(i-7-kk*w))/task[2][1]-t2*10>=65+k*w) tmp=64+k*w;
                    g.drawLine(i,65+w*(k-kk)-(task[2][2]*w-task[2][0]*(i-7-kk*w))/task[2][1],i,tmp);
                  }
        }
        if(task[2][0]*task[2][1]<0)
        {
          if(XY[0]<XY[2])
            for(int i = XY[2]-5; i > XY[0]+5; i=i-10)
            {
              if(65+w*(k-kk)-(task[2][2]*w-task[2][0]*(i-7-kk*w))/task[2][1]-t2*10>65 && 65+w*(k-kk)-(task[2][2]*w-task[2][0]*(i-7-kk*w))/task[2][1]-t2*10<65+k*w)
                tmp=65+w*(k-kk)-(task[2][2]*w-task[2][0]*(i-7-kk*w))/task[2][1]-t2*10;
              else if(65+w*(k-kk)-(task[2][2]*w-task[2][0]*(i-7-kk*w))/task[2][1]-t2*10<=65) tmp=66;
                   else if(65+w*(k-kk)-(task[2][2]*w-task[2][0]*(i-7-kk*w))/task[2][1]-t2*10>=65+k*w) tmp=64+k*w;
              g.drawLine(i,65+w*(k-kk)-(task[2][2]*w-task[2][0]*(i-7-kk*w))/task[2][1],i,tmp);
            }
          else if(XY[0]>XY[2])
                  for(int i = XY[0]-5; i > XY[2]+5; i=i-10)
                  {
                    if(65+w*(k-kk)-(task[2][2]*w-task[2][0]*(i-7-kk*w))/task[2][1]-t2*10>65 && 65+w*(k-kk)-(task[2][2]*w-task[2][0]*(i-7-kk*w))/task[2][1]-t2*10<65+k*w)
                      tmp=65+w*(k-kk)-(task[2][2]*w-task[2][0]*(i-7-kk*w))/task[2][1]-t2*10;
                    else if(65+w*(k-kk)-(task[2][2]*w-task[2][0]*(i-7-kk*w))/task[2][1]-t2*10<=65) tmp=66;
                         else if(65+w*(k-kk)-(task[2][2]*w-task[2][0]*(i-7-kk*w))/task[2][1]-t2*10>=65+k*w) tmp=64+k*w;
                    g.drawLine(i,65+w*(k-kk)-(task[2][2]*w-task[2][0]*(i-7-kk*w))/task[2][1],i,tmp);
                  }
        }
      }
      if((sh>8 || (sh==8 && entry==true && Right==true)) && vrt!=4 && vrt!=11)
      {
        g.setColor(Color.black);
        g.drawLine(w*kk+7,65+(k-kk)*w,w*kk+7+task[0][0]*w,65+(k-kk)*w-task[0][1]*w);
        int d=0, d1=0, d2=0;
        if(Math.abs(task[0][0])/Math.abs(task[0][1])>1)
          d=Math.abs(task[0][0])/Math.abs(task[0][1]);
        if(Math.abs(task[0][1])/Math.abs(task[0][0])>1)
          d=-Math.abs(task[0][1])/Math.abs(task[0][0]);
        d1=task[0][0]/Math.abs(task[0][0]);
        d2=task[0][1]/Math.abs(task[0][1]);
        int xg[]={w*kk+7+task[0][0]*w, w*kk+7+task[0][0]*w-d*d1, w*kk+7+task[0][0]*w-5*d1};
        int yg[]={65+(k-kk)*w-task[0][1]*w, 65+(k-kk)*w-task[0][1]*w+5*d2, 65+(k-kk)*w-task[0][1]*w-d*d2};
        g.fillPolygon(xg,yg,3);
        Stringer.fonts[1] = new Font("SansSerif", 3, 11);
        Stringer.drawString("\u25bcf(x) = ("+task[0][0]+"; "+task[0][1]+")^{T}",k*w+27+(486-k*w-("\u25bcf(x) = ("+task[0][0]+"; "+task[0][1]+")^{T}").length()*5)/2,248);
        Stringer.fonts[1] = new Font("SansSerif", 1, 11);
      }
      if(sh>=9 && vrt!=4 && vrt!=11)
      {
        if(sh==9 && fortify==false)
        {
          if(f>=task[0][2]/100.0-0.1 && f<=task[0][2]/100.0+0.1) g.setColor(Color.red);
          else g.setColor(new Color(255, 140, 0));
          Coordinate(task[0][0], task[0][1], f);
          g.drawLine(XY[0], XY[1], XY[2], XY[3]);
          StraightLine(task[0][0], task[0][1], 0);
          Stringer.drawString("f(x) = "+s2+"= "+f,k*w+27+(486-k*w-("f(x) = "+s2+"="+f).length()*5)/2,268);
          jButton3.setBounds(new Rectangle(k*w/2+221, 360, 100, 23));
          jButton3.setText("Закрепить");
          jButton3.setVisible(true);
          jButton3.setEnabled(true);
          jButton1.setEnabled(false);
        }
        else
        {
          if(sh==9) g.setColor(Color.red);
          else g.setColor(new Color(200, 0, 100));
          Stringer.fonts[1] = new Font("SansSerif", 3, 11);
          if(vrt!=5 && vrt!=9)
          {
            g.fillOval((int)(kk*w+5+maxx*w),(int)(63+(k-kk)*w-maxy*w),6,6);
            Stringer.drawString("x_{max} = "+(int)(maxx*100)/100.0,k*w+27+(486-k*w-("x_{max} = "+(int)(maxx*100)/100.0).length()*5)/2,289);
            Stringer.drawString("y_{max} = "+(int)(maxy*100)/100.0,k*w+27+(486-k*w-("y_{max} = "+(int)(maxy*100)/100.0).length()*5)/2,309);
          }
          else if(vrt==5)
               {
                 g.drawLine(kk*w+7,65+(k-kk)*w-2*w,kk*w+7+w*5/2,(int)(65+(k-kk)*w-13.0/4*w));
                 g.drawLine(kk*w+7,65+(k-kk)*w-2*w+1,kk*w+7+w*5/2,(int)(65+(k-kk)*w-13.0/4*w+1));
                 Stringer.drawString("x_{max} = 2 y_{max }- 4",k*w+27+(486-k*w-("x_{max}= 2 y_{max} - 4").length()*5)/2,289);
                 Stringer.drawString("y_{max} = [ 2; 3.25 ]",k*w+27+(486-k*w-("y_{max} = [ 2; 3.25 ]").length()*5)/2,310);
               }
               else if(vrt==9)
                    {
                      g.drawLine(kk*w+7,65+(k-kk)*w-1*w,kk*w+7+w*2,(int)(65+(k-kk)*w-2*w));
                      g.drawLine(kk*w+7,65+(k-kk)*w-1*w+1,kk*w+7+w*2,(int)(65+(k-kk)*w-2*w+1));
                      Stringer.drawString("x_{max} = 2 y_{max }- 2",k*w+27+(486-k*w-("x_{max} = 2 y_{max} - 2").length()*5)/2,289);
                      Stringer.drawString("y_{max} = [ 1; 2 ]",k*w+27+(486-k*w-("y_{max } = [ 1; 2 ]").length()*5)/2,310);
                    }
          Stringer.drawString("f_{max}",(int)(kk*w+5+maxx*w+13),(int)(63+(k-kk)*w-maxy*w+9));
          Stringer.drawString("f_{max} = "+(int)(100*task[0][0]*maxx+100*task[0][1]*maxy)/100.0,k*w+27+(486-k*w-("f_{max} = "+(int)(100*task[0][0]*maxx+100*task[0][1]*maxy)/100.0).length()*5)/2,269);
          Stringer.fonts[1] = new Font("SansSerif", 1, 11);
          if(sh==9)
          {
            jButton3.setEnabled(false);
            jButton3.setVisible(false);
            jButton1.setEnabled(true);
          }
        }
      }
      if(sh>=10 && vrt!=4 && vrt!=11)
      {
        if(sh==10 && fortify==false)
        {
          if(f>=task[0][3]/100.0-0.1 && f<=task[0][3]/100.0+0.1) g.setColor(Color.red);
          else g.setColor(new Color(255, 140, 0));
          Coordinate(task[0][0], task[0][1], f);
          g.drawLine(XY[0], XY[1], XY[2], XY[3]);
          StraightLine(task[0][0], task[0][1], 0);
          Stringer.drawString("f(x) = "+s2+"= "+f,k*w+27+(486-k*w-("f(x) = "+s2+"="+f).length()*5)/2,332);
          jButton3.setBounds(new Rectangle(k*w/2+221, 360, 100, 23));
          jButton3.setText("Закрепить");
          jButton3.setVisible(true);
          jButton3.setEnabled(true);
          jButton1.setEnabled(false);
        }
        else
        {
          if(sh==10) g.setColor(Color.red);
          else g.setColor(new Color(200, 0, 100));
          g.fillOval((int)(minx*w+kk*w+5),(int)(63+(k-kk)*w-miny*w),6,6);
          Stringer.fonts[1] = new Font("SansSerif", 3, 11);
          Stringer.drawString("f_{min}",(int)(minx*w+kk*w+5+13),(int)(63+(k-kk)*w-miny*w+9));
          Stringer.drawString("f_{min} = "+(int)(100*task[0][0]*minx+100*task[0][1]*miny)/100.0,k*w+27+(486-k*w-("f_{min} = "+(int)(100*task[0][0]*minx+100*task[0][1]*miny)/100.0).length()*5)/2,334);
          Stringer.drawString("x_{min} = "+(int)(minx*100)/100.0,k*w+27+(486-k*w-("x_{min} = "+(int)(minx*100)/100.0).length()*5)/2,354);
          Stringer.drawString("y_{min} = "+(int)(miny*100)/100.0,k*w+27+(486-k*w-("y_{min} = "+(int)(miny*100)/100.0).length()*5)/2,374);
          Stringer.fonts[1] = new Font("SansSerif", 1, 11);
          if(sh==10)
          {
            jButton3.setEnabled(false);
            jButton3.setVisible(false);
            jButton1.setEnabled(true);
          }
        }
      }
      if(sh==11)
      {
        if(Ch==true)
        {
          int kolmist_calk=0, kolmist_under=0, kolmist_knowledge=0, kolmist_use=0, RightAnswer=0, Vopros=0;
          if(slog==0) RightAnswer=5;
          if(slog==1) RightAnswer=9;
          if(slog==2) RightAnswer=11;
          if(vrt==4 || vrt==11)
          {
            if(slog==0) RightAnswer=1;
            if(slog==1) RightAnswer=4;
            if(slog==2) RightAnswer=6;
          }
          g.setColor(new Color(190, 190, 190));
          g.fillRect((k*w-240)/2+6,110,436,173);
          g.setColor(new Color(255, 255, 255));
          g.fillRect((k*w-240)/2,103,436,173);
          g.setColor(new Color(247, 247, 255));
          g.fillRect((k*w-240)/2+421,103,15,15);
          g.setColor(Color.blue);
          g.drawRect((k*w-240)/2,103,436,173);
          g.drawRect((k*w-240)/2+421,103,15,15);
          g.drawLine((k*w-240)/2+421,103,(k*w-240)/2+436,118);
          g.drawLine((k*w-240)/2+421,118,(k*w-240)/2+436,103);
          g.setColor(new Color(180, 0, 80));
          Stringer.fonts[0] = new Font("SansSerif", 3, 13);
          Stringer.drawString("Ваш результат:",(k*w+90)/2,122);
          for(int i=0; i<10; i++){
            kolmist_calk=kolmist_calk+Mist_calk[i];
            kolmist_under=kolmist_under+Mist_under[i];
            kolmist_knowledge=kolmist_knowledge+Mist_knowledge[i];
            kolmist_use=kolmist_use+Mist_use[i];
          }
          Vopros=RightAnswer+kolmist_calk+kolmist_under+kolmist_knowledge+kolmist_use;
          g.setColor(new Color(0, 0, 80));
          Stringer.fonts[0] = new Font("SansSerif", 3, 14);
          Stringer.drawString("Количество вопросов: "+Vopros,(k*w+23)/2,142);
          Stringer.drawString("Количество правильных ответов: "+RightAnswer,(k*w-60)/2,162);
          Stringer.drawString("Количество допущенных ошибок :",(k*w-40)/2,182);
          if(vrt==4 || vrt==11) g.setColor(Color.lightGray);
          Stringer.drawString("- на знание:           "+kolmist_knowledge,(k*w+60)/2,197);
          g.setColor(new Color(0, 0, 80));
          Stringer.drawString("- на понимание:    "+kolmist_under,(k*w+60)/2,212);
          if(vrt==4 || vrt==11) g.setColor(Color.lightGray);
          Stringer.drawString("- на вычисление: "+kolmist_calk,(k*w+60)/2,227);
          g.setColor(Color.lightGray);
          Stringer.drawString("- на применение: "+kolmist_use,(k*w+60)/2,242);
          g.setColor(new Color(0, 0, 80));
          if(Vopros!=0 && RightAnswer<=Vopros)
            Stringer.drawString("Результат выполнения упражнения: "+(RightAnswer*100/Vopros)+"%",(k*w-108)/2,265);
          else
            Stringer.drawString("Результат выполнения упражнения: 0%",(k*w-108)/2,265);
          Stringer.fonts[0] = new Font("SansSerif", 1, 14);
        }
      }

      //Решение
      if(sh==0){
        g.setColor(new Color(0, 0, 80));
        Stringer.fonts[0] = new Font("SansSerif", 1, 14);
        Stringer.drawString("При нажатии кнопки \"Обновить\" происходит смена варианта.",12, k*w+105);
      }
      if(sh==1)
      {
        g.setColor(new Color(180, 0, 60));
        Stringer.fonts[0] = new Font("SansSerif", 3, 16);
        Stringer.drawString("1.",10, k*w+105);
        g.setColor(new Color(0, 0, 80)); Stringer.fonts[0] = new Font("SansSerif", 1, 14);
        Stringer.drawString("Решим задачу линейного программирования. Для этого построим",26, k*w+105);
        Stringer.drawString("множество допустимых решений.",12, k*w+125);
      }
      if(sh==2)
      {
        g.setColor(new Color(180, 0, 60));
        Stringer.fonts[0] = new Font("SansSerif", 3, 16);
        Stringer.drawString("2.",10, k*w+105);
        g.setColor(new Color(0, 0, 80)); Stringer.fonts[0] = new Font("SansSerif", 1, 14);
        if(slog>=1)
        {
          Stringer.drawString("Курсором мыши укажите область, где x_{1} и x_{2} \u2265 0.",26, k*w+105);
          jButton1.setEnabled(false);
          if(entry==true)
            if(fortify==true)
            {
              g.setColor(Color.blue); Stringer.fonts[0] = new Font("Dialog", 1, 14);
              Stringer.drawString("Правильно",(k*w+102)/2+7,k*w+145);
              jButton1.setEnabled(true);
              if(AddMist==0) AddMist=1;
            }
            else
            {
              g.setColor(Color.red); Stringer.fonts[0] = new Font("Dialog", 1, 14);
              Stringer.drawString("Неправильно, так как точка данной области",(k*w-115)/2+7,k*w+135);
              Stringer.drawString("не удовлетворяет ограничению x_{1} и x_{2} \u2265 0",(k*w-104)/2+7,k*w+155);
              if(AddMist==0){ Mist_under[2]++; AddMist=1;}
            }
        }
        else
        {
          Stringer.drawString("Определяем область, где x_{1} и x_{2} \u2265 0.",26, k*w+105);
        }
      }
      if(sh==3)
      {
        g.setColor(new Color(180, 0, 60));
        Stringer.fonts[0] = new Font("SansSerif", 3, 16);
        Stringer.drawString("3.",10, k*w+105);
        g.setColor(new Color(0, 0, 80)); Stringer.fonts[0] = new Font("SansSerif", 1, 14);
        StraightLine(task[1][0], task[1][1], task[1][2]);
        if(slog==2)
        {
          Stringer.drawString("Передвигая линию с помощью мыши, постройте прямую",26, k*w+105);
          Stringer.drawString(s+".",12, k*w+125);
          if(entry==true)
            if(fortify==true)
            {
              g.setColor(Color.blue); Stringer.fonts[0] = new Font("Dialog", 1, 14);
              Stringer.drawString("Правильно",(k*w+102)/2+7,k*w+145);
              if(AddMist==0) AddMist=1;
            }
            else
            {
              g.setColor(Color.red); Stringer.fonts[0] = new Font("Dialog", 1, 14);
              Stringer.drawString("Неправильно, так как значение "+s1+"= "+c1+"  \u2260  "+task[1][2],(k*w-179)/2+7,k*w+155);
              if(AddMist==0){ Mist_under[3]++; AddMist=1;}
            }
        }
        else
        {
          Stringer.drawString("Cтроим прямую "+s+".",26, k*w+105);
        }
      }
      if(sh==4)
      {
        g.setColor(new Color(180, 0, 60));
        Stringer.fonts[0] = new Font("SansSerif", 3, 16);
        Stringer.drawString("4.",10, k*w+105);
        g.setColor(new Color(0, 0, 80)); Stringer.fonts[0] = new Font("SansSerif", 1, 14);
        StraightLine(task[1][0], task[1][1], task[1][2]);
        if(slog>=1)
        {
          Stringer.drawString("Курсором укажите область, определенную ограничением ",26, k*w+105);
          if(task[1][3]==1)
            Stringer.drawString(s1+"\u2265 "+task[1][2]+".",12, k*w+125);
          else if(task[1][3]==-1)
            Stringer.drawString(s1+"\u2264 "+task[1][2]+".",12, k*w+125);
          jButton1.setEnabled(false);
          if(entry==true)
            if(fortify==true)
            {
              g.setColor(Color.blue); Stringer.fonts[0] = new Font("Dialog", 1, 14);
              Stringer.drawString("Правильно",(k*w+102)/2+7,k*w+145);
              jButton1.setEnabled(true);
              if(AddMist==0) AddMist=1;
            }
            else
            {
              g.setColor(Color.red); Stringer.fonts[0] = new Font("Dialog", 1, 14);
              Stringer.drawString("Неправильно, так как точка данной области",(k*w-120)/2+7,k*w+145);
              Stringer.drawString("не удовлетворяет ограничению",(k*w-40)/2+7,k*w+165);
              if(AddMist==0){ Mist_under[4]++; AddMist=1;}
            }
        }
        else
        {
          if(task[1][3]==1)
            Stringer.drawString("Определяем допустимую область для ограничения "+s1+"\u2265 "+task[1][2]+".",26, k*w+105);
          else if(task[1][3]==-1)
            Stringer.drawString("Определяем допустимую область для ограничения "+s1+"\u2264 "+task[1][2]+".",26, k*w+105);
        }
      }
      if(sh==5)
      {
        g.setColor(new Color(180, 0, 60));
        Stringer.fonts[0] = new Font("SansSerif", 3, 16);
        Stringer.drawString("5.",10, k*w+105);
        g.setColor(new Color(0, 0, 80)); Stringer.fonts[0] = new Font("SansSerif", 1, 14);
        StraightLine(task[2][0], task[2][1], task[2][2]);
        if(slog==2)
        {
          Stringer.drawString("Передвигая линию с помощью мыши, постройте прямую",26, k*w+105);
          Stringer.drawString(s+".",12, k*w+125);
          if(entry==true)
            if(fortify==true)
            {
              g.setColor(Color.blue); Stringer.fonts[0] = new Font("Dialog", 1, 14);
              Stringer.drawString("Правильно",(k*w+102)/2+7,k*w+145);
              if(AddMist==0) AddMist=1;
            }
            else
            {
              g.setColor(Color.red); Stringer.fonts[0] = new Font("Dialog", 1, 14);
              Stringer.drawString("Неправильно, так как значение "+s1+"= "+c1+"  \u2260  "+task[1][2],(k*w-169)/2+7,k*w+155);
              if(AddMist==0){ Mist_under[5]++; AddMist=1;}
            }
        }
        else
        {
          Stringer.drawString("Cтроим прямую "+s+".",26, k*w+105);
        }
      }
      if(sh==6)
      {
        g.setColor(new Color(180, 0, 60));
        Stringer.fonts[0] = new Font("SansSerif", 3, 16);
        Stringer.drawString("6.",10, k*w+105);
        g.setColor(new Color(0, 0, 80)); Stringer.fonts[0] = new Font("SansSerif", 1, 14);
        StraightLine(task[2][0], task[2][1], task[2][2]);
        if(slog>=1)
        {
          Stringer.drawString("Курсором укажите область, определенную ограничением",26, k*w+105);
          if(task[2][3]==1)
            Stringer.drawString(s1+"\u2265 "+task[2][2]+".",12, k*w+125);
          else if(task[2][3]==-1)
            Stringer.drawString(s1+"\u2264 "+task[2][2]+".",12, k*w+125);
          jButton1.setEnabled(false);
          if(entry==true)
            if(fortify==true)
            {
              g.setColor(Color.blue); Stringer.fonts[0] = new Font("Dialog", 1, 14);
              Stringer.drawString("Правильно",(k*w+102)/2+7,k*w+145);
              jButton1.setEnabled(true);
              if(AddMist==0) AddMist=1;
            }
            else
            {
              g.setColor(Color.red); Stringer.fonts[0] = new Font("Dialog", 1, 14);
              Stringer.drawString("Неправильно, так как точка данной области",(k*w-129)/2+7,k*w+145);
              Stringer.drawString("не удовлетворяет ограничению",(k*w-46)/2+7,k*w+165);
              if(AddMist==0){ Mist_under[6]++; AddMist=1;}
            }
        }
        else
        {

          if(task[1][3]==1)
            Stringer.drawString("Определяем допустимую область для ограничения "+s1+"\u2265 "+task[2][2]+".",26, k*w+105);
          else if(task[1][3]==-1)
            Stringer.drawString("Определяем допустимую область для ограничения "+s1+"\u2264 "+task[2][2]+".",26, k*w+105);
        }
      }
      if(sh==7)
      {
        g.setColor(new Color(180, 0, 60));
        Stringer.fonts[0] = new Font("SansSerif", 3, 16);
        Stringer.drawString("7.",10, k*w+105);
        Stringer.fonts[0] = new Font("Dialog", 3, 14);
        g.setColor(new Color(0, 0, 40));
        Stringer.drawString("Допустимая область ",26, k*w+105);
        jRadioButton1.setText("пустая");
        jRadioButton1.setBounds(new Rectangle(190, k*w+90,80,20));
        jRadioButton2.setText("не пустая");
        jRadioButton2.setBounds(new Rectangle(190, k*w+110,100,20));
        jRadioButton1.setVisible(true);
        jRadioButton1.setEnabled(true);
        jRadioButton2.setVisible(true);
        jRadioButton2.setEnabled(true);
        jButton1.setEnabled(false);
        if(vrt==4 || vrt==11)
        {
          if(jRadioButton1.isSelected()==true)
          {
            g.setColor(Color.blue); Stringer.fonts[0] = new Font("Dialog", 1, 14);
            Stringer.drawString("Правильно",300,k*w+115);
            jRadioButton2.setEnabled(false);
            if(AddMist==0) AddMist=1;
            jButton1.setEnabled(true);
          }
          if(jRadioButton2.isSelected()==true)
          {
            g.setColor(Color.red); Stringer.fonts[0] = new Font("Dialog", 1, 14);
            Stringer.drawString("Неправильно",300,k*w+115);
            if(AddMist==0){ Mist_under[7]++; AddMist=1;}
          }
        }
        else
        {
          if(jRadioButton2.isSelected()==true)
          {
            g.setColor(Color.blue); Stringer.fonts[0] = new Font("Dialog", 1, 14);
            Stringer.drawString("Правильно",300,k*w+115);
            jRadioButton1.setEnabled(false);
            if(AddMist==0) AddMist=1;
            g.setColor(new Color(0, 0, 80)); Stringer.fonts[0] = new Font("SansSerif", 1, 14);
            if(slog>=1)
            {
              Stringer.drawString("Курсором мыши укажите допустимую область.",12, k*w+145);
              jButton1.setEnabled(false);
              if(entry==true)
                if(fortify==true)
                {
                  g.setColor(Color.blue); Stringer.fonts[0] = new Font("Dialog", 1, 14);
                  Stringer.drawString("Правильно",(k*w+102)/2+7,k*w+165);
                  jButton1.setEnabled(true);
                  if(AddMist==1) AddMist=2;
                }
                else
                {
                  g.setColor(Color.red); Stringer.fonts[0] = new Font("Dialog", 1, 14);
                  Stringer.drawString("Неправильно, так как точка данной области",(k*w-120)/2+7,k*w+156);
                  Stringer.drawString("не удовлетворяет всем ограничениям",(k*w-90)/2+7,k*w+170);
                  if(AddMist==1){ Mist_under[7]++; AddMist=2;}
                }
            }
            else
            {
              Stringer.drawString("Определяем допустимую область решений задачи.",12, k*w+145);
              jButton1.setEnabled(true);
            }
          }
          if(jRadioButton1.isSelected()==true)
          {
            g.setColor(Color.red); Stringer.fonts[0] = new Font("Dialog", 1, 14);
            Stringer.drawString("Неправильно",300,k*w+115);
            if(AddMist==0){ Mist_under[7]++; AddMist=1;}
          }
        }
      }
      if(sh==8)
      {
        g.setColor(new Color(180, 0, 60));
        Stringer.fonts[0] = new Font("SansSerif", 3, 16);
        Stringer.drawString("8.",10, k*w+105);
        g.setColor(new Color(0, 0, 80)); Stringer.fonts[0] = new Font("SansSerif", 1, 14);
        Stringer.fonts[1] = new Font("SansSerif", 3, 11);
        Stringer.drawString("Вычислите градиент  \u25bcf(x) = (        ;        )^{T}.",26, k*w+105);
        Stringer.fonts[1] = new Font("SansSerif", 1, 11);
        jTextField1.setBounds(new Rectangle(242,k*w+93,30,17));
        jTextField2.setBounds(new Rectangle(278,k*w+93,30,17));
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        if(entry==false)
        {
          jTextField1.setEnabled(true);
          jTextField2.setEnabled(true);
        }
        if(entry==false || Right==false)
        {
          jButton3.setBounds(new Rectangle(350, k*w+120, 100, 23));
          jButton3.setText("Проверить");
          jButton3.setVisible(true);
          jButton3.setEnabled(true);
          jButton1.setEnabled(false);
        }
        if(entry==true && Right==true)
        {
          g.setColor(Color.blue); Stringer.fonts[0] = new Font("Dialog", 1, 14);
          Stringer.drawString("Правильно",(k*w+102)/2+7,k*w+145);
          jButton3.setEnabled(false);
          jButton3.setVisible(false);
          jButton1.setEnabled(true);
          if(AddMist==0) AddMist=1;
        }
        else if(entry==true && Right==false)
        {
          g.setColor(Color.red); Stringer.fonts[0] = new Font("Dialog", 1, 14);
          Stringer.drawString("Неправильно",(k*w+84)/2+7,k*w+145);
        }
      }
      if(sh==9)
      {
        g.setColor(new Color(180, 0, 60));
        Stringer.fonts[0] = new Font("SansSerif", 3, 16);
        Stringer.drawString("9.",10, k*w+105);
        g.setColor(new Color(0, 0, 80)); Stringer.fonts[0] = new Font("SansSerif", 1, 14);
        Stringer.drawString("Передвигая курсором мыши линию уровня функции f(x), найдите",26, k*w+105);
        Stringer.drawString("максимум функции f(x) на допустимой области.",12, k*w+125);
        jButton3.setText("Проверить");
        jButton3.setEnabled(true);
        jButton1.setEnabled(false);
        if(fortify==true && entry==true)
        {
          g.setColor(Color.blue); Stringer.fonts[0] = new Font("Dialog", 1, 14);
          Stringer.drawString("Правильно",(k*w+102)/2+7,k*w+155);
          jButton3.setEnabled(false);
          jButton1.setEnabled(true);
          if(AddMist==0) AddMist=1;
        }
        else if(entry==true && fortify==false)
        {
          g.setColor(Color.red); Stringer.fonts[0] = new Font("Dialog", 1, 14);
          Stringer.drawString("Неправильно, наибольшее возрастание функции",(k*w-155)/2+7,k*w+147);
          Stringer.drawString("происходит в направлении градиента",(k*w-67)/2+7,k*w+162);
          if(AddMist==0){ Mist_knowledge[9]++; AddMist=1;}
        }
      }
      if(sh==10)
      {
        g.setColor(new Color(180, 0, 60));
        Stringer.fonts[0] = new Font("SansSerif", 3, 16);
        Stringer.drawString("10.",10, k*w+105);
        g.setColor(new Color(0, 0, 80)); Stringer.fonts[0] = new Font("SansSerif", 1, 14);
        Stringer.drawString("Передвигая курсором мыши линию уровня функции f(x), найдите",34, k*w+105);
        Stringer.drawString("минимум функции f(x) на допустимой области.",12, k*w+125);
        jButton3.setText("Проверить");
        jButton3.setEnabled(true);
        jButton1.setEnabled(false);
        if(fortify==true && entry==true)
        {
          g.setColor(Color.blue); Stringer.fonts[0] = new Font("Dialog", 1, 14);
          Stringer.drawString("Правильно",(k*w+102)/2+7,k*w+155);
          jButton3.setEnabled(false);
          jButton1.setEnabled(true);
          if(AddMist==0) AddMist=1;
        }
        else if(entry==true && fortify==false)
        {
          g.setColor(Color.red); Stringer.fonts[0] = new Font("Dialog", 1, 14);
          Stringer.drawString("Неправильно, наибольшее убывание функции",(k*w-150)/2+7,k*w+147);
          Stringer.drawString("происходит в направлении антиградиента",(k*w-110)/2+7,k*w+162);
          if(AddMist==0){ Mist_knowledge[9]++; AddMist=1;}
        }
      }
      if(sh==11)
      {
        g.setColor(new Color(180, 0, 60));
        Stringer.fonts[0] = new Font("SansSerif", 3, 16);
        if(vrt!=4 && vrt!=11)
        {
          Stringer.drawString("11.",10, k*w+105);
          g.setColor(new Color(0, 0, 80)); Stringer.fonts[0] = new Font("SansSerif", 1, 14);
          Stringer.drawString("Максимум и минимум функции найдены.",34, k*w+105);
        }
        else
        {
          Stringer.drawString("7.",10, k*w+105);
          g.setColor(new Color(0, 0, 80)); Stringer.fonts[0] = new Font("SansSerif", 1, 14);
          Stringer.drawString("Задача не имеет решения, так как допустимая область пустая.",26, k*w+105);
        }
        jCheckBoxRezult.setBounds(new Rectangle((k*w+40)/2+7, k*w+140, 150, 23));
        jCheckBoxRezult.setVisible(true);  jCheckBoxRezult.setEnabled(true);
        g.setColor(Color.black);
        g.drawLine((k*w+14)/2+7, k*w+135, (k*w+14)/2+157, k*w+135);
        g.drawLine((k*w+14)/2+7, k*w+136, (k*w+14)/2+157, k*w+136);
        jButton1.setEnabled(false);
      }

   /*   g.setColor(new Color(180, 0, 80));
      g.setFont(new java.awt.Font("SansSerif", 3, 13));
      int kolmist_calk=0, kolmist_under=0, kolmist_knowledge=0, kolmist_use=0;
      for(int i=0; i<10; i++){
        kolmist_calk=kolmist_calk+Mist_calk[i];
        kolmist_under=kolmist_under+Mist_under[i];
        kolmist_knowledge=kolmist_knowledge+Mist_knowledge[i];
        kolmist_use=kolmist_use+Mist_use[i];
      }
      g.drawString("kolmist_calk="+kolmist_calk+", kolmist_under="+kolmist_under+", kolmist_knowledge="+kolmist_knowledge+", kolmist_use="+kolmist_use,90,k*w+82);*/
    }
  }

  void jPanel1_mouseClicked(MouseEvent e) {
    X=e.getX(); Y=e.getY();
    if(sh==2 && fortify==false && X>7 && X<k*w+7 && Y>65 && Y<k*w+65 && slog>=1)
    {
      entry=true; AddMist=0;
      if(X>kk*w+7 && X<k*w+7 && Y>65 && Y<(k-kk)*w+65)
        fortify=true;
      jPanel1.repaint();
    }
    if(fortify==false  && (sh==3 || sh==5) && X>7 && X<k*w+7 && Y>65 && Y<k*w+65 && slog==2)
    {
      entry=false;
      if(sh==3) c1=10*task[1][0]*(X-kk*w-7)/w+10*task[1][1]*((k-kk)*w+65-Y)/w;
      if(sh==5) c1=10*task[2][0]*(X-kk*w-7)/w+10*task[2][1]*((k-kk)*w+65-Y)/w;
      c1=c1/10.0;
      jPanel1.repaint();
    }
    if((sh==4 || sh==6 || (sh==7 && jRadioButton2.isSelected()==true)) && X>7 && X<k*w+7 && Y>65 && Y<k*w+65 && slog>=1)
    {
      entry=true; AddMist=0;
      double xx=0.0, yy=0.0;
      xx=1.0*(X-7-kk*w)/w;
      yy=1.0*(65+(k-kk)*w-Y)/w;
      if((sh==4 && (task[1][0]*xx+task[1][1]*yy)*task[1][3]>task[1][2]*task[1][3]) ||
         (sh==6 && (task[2][0]*xx+task[2][1]*yy)*task[2][3]>task[2][2]*task[2][3]) ||
         (sh==7 && (task[1][0]*xx+task[1][1]*yy)*task[1][3]>task[1][2]*task[1][3]
                && (task[2][0]*xx+task[2][1]*yy)*task[2][3]>task[2][2]*task[2][3]
                && xx>=0 && yy>=0)
        )
      {
        fortify=true;
        if(sh==4 && (int)(65+(k-kk)*w-w*(task[1][2]-task[1][0]*xx)/task[1][1])>=Y)
          t1=1;
          else if(sh==4 && (int)(65+(k-kk)*w-w*(task[1][2]-task[1][0]*xx)/task[1][1])<Y)
                  t1=-1;
        if(sh==6 && 65+(k-kk)*w-w*(task[2][2]-task[2][0]*xx)/task[2][1]>=Y)
          t2=1;
        else if(sh==6 && 65+(k-kk)*w-w*(task[2][2]-task[2][0]*xx)/task[2][1]<Y)
            t2=-1;
      }
      jPanel1.repaint();
    }
    if((sh==9 || sh==10) && fortify==false)
    {
      f=task[0][0]*100*(X-w*kk-7)/w+task[0][1]*100*(65+w*(k-kk)-Y)/w;
      f=f/100.0;
      jPanel1.repaint();
    }
    if(sh==11 && X>=(k*w-240)/2+421 && Y>=103 && X<=(k*w-240)/2+436 && Y<=118)
    {
      Ch=false;
      jCheckBoxRezult.setSelected(false);
      jPanel1.repaint();
    }
  }

  void jPanel1_mouseDragged(MouseEvent e) {
    X=e.getX(); Y=e.getY();
    if(fortify==false && (sh==3 || sh==5) && X>7 && X<k*w+7 && Y>65 && Y<k*w+65)
    {
      if(sh==3) c1=10*task[1][0]*(X-kk*w-7)/w+10*task[1][1]*((k-kk)*w+65-Y)/w;
      if(sh==5) c1=10*task[2][0]*(X-kk*w-7)/w+10*task[2][1]*((k-kk)*w+65-Y)/w;
      c1=c1/10.0;
      entry=false;
    }
    if((sh==9 || sh==10) && fortify==false)
    {
      f=task[0][0]*100*(X-w*kk-7)/w+task[0][1]*100*(65+w*(k-kk)-Y)/w;
      f=f/100.0;
      entry=false;
    }
    jPanel1.repaint();
  }

  void jButton1_actionPerformed(ActionEvent e) {
    if((vrt==4 || vrt==11) && sh==7) sh=10;
    sh++;
    c1=0.0; f=0.0; AddMist=0;
    fortify=false; entry=false; Ch=true; Right=true;
    if (sh>11) sh=11;
    jRadioButton.setSelected(true); jButton1.setEnabled(true);
    jRadioButton1.setVisible(false); jRadioButton1.setEnabled(false);
    jRadioButton2.setVisible(false); jRadioButton2.setEnabled(false);
    jTextField1.setText(""); jTextField1.setVisible(false); jTextField1.setEnabled(false);
    jTextField2.setText(""); jTextField2.setVisible(false); jTextField2.setEnabled(false);
    jCheckBoxRezult.setSelected(true); jCheckBoxRezult.setVisible(false); jCheckBoxRezult.setEnabled(false);
    jTextField1.setForeground(new Color(0, 0, 120));
    jTextField2.setForeground(new Color(0, 0, 120));
    jButton3.setEnabled(false); jButton3.setVisible(false);
    jPanel1.repaint();
  }
  void jButton2_actionPerformed(ActionEvent e) {
  if(Variant[12]!=12)
    {
      for(int i=0; i<=(12-Variant[12]); i++)
        if(vrt==Variant[i])
        {
          Variant[i]=Variant[12-Variant[12]];
          Variant[12-Variant[12]]=vrt;
        }
      vrt=Variant[(int)(Math.random()*(12-Variant[12]))];
      Variant[12]++;
    }
    else
    {
      for(int i=0; i<12; i++)
        Variant[i]=i;
      Variant[12]=1;
      vrt=(int)(Math.random()*12);
    }
    sh=0; t1=1; t2=1; fortify=false; entry=false; Ch=true; Right=true;
    jRadioButton.setSelected(true);
    jButton3.setEnabled(false); jButton3.setVisible(false); jButton1.setEnabled(true);
    jRadioButton1.setVisible(false); jRadioButton1.setEnabled(false);
    jRadioButton2.setVisible(false); jRadioButton2.setEnabled(false);
    jTextField1.setText(""); jTextField1.setVisible(false); jTextField1.setEnabled(false);
    jTextField2.setText(""); jTextField2.setVisible(false); jTextField2.setEnabled(false);
    jCheckBoxRezult.setSelected(true); jCheckBoxRezult.setVisible(false); jCheckBoxRezult.setEnabled(false);
    SetVariant();
    jPanel1.repaint();
  }
  void jButton3_actionPerformed(ActionEvent e) {
    AddMist=0;
    if((c1>1.0*task[1][2]-0.2 && c1<1.0*task[1][2]+0.2 && sh==3)
    || (c1>1.0*task[2][2]-0.2 && c1<1.0*task[2][2]+0.2 && sh==5))
      fortify=true;
    if(sh==8)
    {
      Right=true;
      if((jTextField1.isEnabled()==true) && (jTextField1.getText().equals("")!=true)){
      try{
        if(task[0][0]==(int)(Double.parseDouble(jTextField1.getText()))){
          jTextField1.setEnabled(false);
        }
        else{ Right=false; Mist_calk[8]++; jTextField1.setForeground(Color.red);}
      }
      catch(Exception ee){
        Right=false; Mist_calk[8]++; jTextField1.setForeground(Color.red);
      }
    }
    else if((jTextField1.isEnabled()==true) && (jTextField1.getText().equals("")==true)) Right=false;
    if((jTextField2.isEnabled()==true) && (jTextField2.getText().equals("")!=true)){
      try{
        if(task[0][1]==(int)(Double.parseDouble(jTextField2.getText()))){
          jTextField2.setEnabled(false);
        }
        else { Right=false; Mist_calk[8]++; jTextField2.setForeground(Color.red);}
      }
      catch(Exception ee){
        Right=false; Mist_calk[8]++; jTextField2.setForeground(Color.red);
      }
    }
    else if((jTextField2.isEnabled()==true) && (jTextField2.getText().equals("")==true)) Right=false;
    }
    if((sh==9 && f>=task[0][2]/100.0-0.1 && f<=task[0][2]/100.0+0.1) ||
       (sh==10 && f>=task[0][3]/100.0-0.1 && f<=task[0][3]/100.0+0.1))
      fortify=true;
    entry=true;
    jPanel1.repaint();
  }
  void jRadioButton1_itemStateChanged(ItemEvent e) {
    jPanel1.repaint();
  }
  void jRadioButton2_itemStateChanged(ItemEvent e) {
    jPanel1.repaint();
  }
  void jTextField1_inputMethodTextChanged(InputMethodEvent e) {
    jTextField1.setForeground(new Color(0, 0, 120));
  }
    void jTextField2_inputMethodTextChanged(InputMethodEvent e) {
    jTextField2.setForeground(new Color(0, 0, 120));
  }
  void jCheckBoxRezult_stateChanged(ChangeEvent e) {
    if(jCheckBoxRezult.isSelected()==true && sh==11) Ch=true;
    else Ch=false;
    jPanel1.repaint();
    jCheckBoxRezult.setOpaque(true);
  }
}