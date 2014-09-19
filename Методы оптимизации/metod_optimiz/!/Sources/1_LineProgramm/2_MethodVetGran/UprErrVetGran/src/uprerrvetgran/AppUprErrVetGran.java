package uprerrvetgran;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.border.*;
import java.beans.*;
import javax.swing.event.*;

public class AppUprErrVetGran extends JApplet {
  MyPaint1 jPanel1 = new MyPaint1();
  MyPaint2 jPanel2 = new MyPaint2();
  MyPaint3 jPanel3 = new MyPaint3();
  JButton jButton1 = new JButton();
  JButton jButton2 = new JButton();
  JButton jButton3 = new JButton();
  JLabel jLabel1 = new JLabel();
  JTextField jTextField5 = new JTextField(6);
  JTextField jTextField9 = new JTextField(6);
  JTextField jTextField13 = new JTextField(6);
  JTextField jTextField16 = new JTextField(7);
  JTextField jTextField23 = new JTextField(5);
  JTextField jTextField24 = new JTextField(5);
  JRadioButton jRadioButton = new JRadioButton();
  JRadioButton jRadioButton1 = new JRadioButton();
  JRadioButton jRadioButton2 = new JRadioButton();
  JRadioButton jRadioButton3 = new JRadioButton();
  ButtonGroup buttonGroup1 = new ButtonGroup();
  JRadioButton jRadioBtnYes = new JRadioButton();
  JRadioButton jRadioBtnNo = new JRadioButton();
  JRadioButton jRadioBtnYN = new JRadioButton();
  ButtonGroup buttonGroupYesNo = new ButtonGroup();
  JCheckBox jCheckBox1 = new JCheckBox();
  JCheckBox jCheckBoxRezult = new JCheckBox();
  // JLabel jLabel2 = new JLabel();
  public int[] Mist_knowledge=new int [40];
  public int[] Mist_calk=new int [40];
  public int[] Mist_under=new int [40];
  public int[] Mist_use=new int [40];
  public boolean shag=false, Right=true, RightPust=true, edt=false, Ch=false, entry=false, AddRAnswer=false;
  public int RightAnswer=47, AddMist=0, sh=1, step=0, tup=18, stepSM=0, stepVG=0, r=0, fnk=0, fdk=1, fn=-20000, fd=1, Numx=0, otv=-1, otv0=-1, Kx=0, Ky=0, bpx=-1, Nfn=-1, pp=0;
  public String ots="", sm[]={""}, sf[]={""}, fun="", ss="", jj="", sx1="", sx2="", s0, s1, s2, s3, s4, s[]= {"","","","","","","","","","","",""}, Delta[]={"","","","","","","",""};
  public int a=0, c=0, a0=0, c0=0, an=0, cn=0, b=(600-120-(a+1)*60)/2, d=(int)Math.round(17*(3-c)/2), nm[]={0}, n=0, p=0, k=0, ki=0, otvn=0,
             bp[]={0,0,0,0}, bp0[]={0,0,0,0}, XVG[]={0,0,0,0,0,0,0}, XPr[]={0,0,0,0,0,0,0}, J[]={0,0,0,0,0,0,0}, JPr[]={0,0,0,0,0,0,0},
             Xn[][]={ {20000,20000,20000},
                      {20000,20000,20000},
                      {20000,20000,20000} },
             Xd[][]={ {1,1,1},
                      {1,1,1},
                      {1,1,1} },
             tbn[][]={ {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                       {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                       {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                       {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                       {20000,20000,20000,20000,20000,20000,20000,20000,20000} },
             tbd[][]={ {1,1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1,1} },
             tbn0[][]={ {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                       {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                       {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                       {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                       {20000,20000,20000,20000,20000,20000,20000,20000,20000} },
             tbd0[][]={ {1,1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1,1} },
             tn[][]={ {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                      {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                      {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                      {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                      {20000,20000,20000,20000,20000,20000,20000,20000,20000} },
             td[][]={ {1,1,1,1,1,1,1,1,1},
                      {1,1,1,1,1,1,1,1,1},
                      {1,1,1,1,1,1,1,1,1},
                      {1,1,1,1,1,1,1,1,1},
                      {1,1,1,1,1,1,1,1,1} };
  static int xx,yy;

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
    this.setSize(new Dimension(627, 579));
    this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseMoved(MouseEvent e) {
        this_mouseMoved(e);
      }
    });
    this.getContentPane().setLayout(null);
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel1.setForeground(new Color(130, 0, 80));
    jLabel1.setText("Тестовое упражнение с запланированными ошибками");
    jLabel1.setBounds(new Rectangle(75, 0, 440, 17));
    jPanel1.setLayout(null);
    jPanel1.setBounds(new Rectangle(5,6,621,174));
    jPanel1.setBackground(new Color(247, 247, 255));
    jPanel2.setLayout(null);
    jPanel2.setBackground(new Color(247, 247, 255));
    jPanel2.setBounds(new Rectangle(5,180,621,180));
    jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        jPanel1_mouseClicked(e);
      }
    });
    jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        jPanel2_mouseClicked(e);
      }
    });
    jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        jPanel3_mouseClicked(e);
      }
    });
    jPanel3.setLayout(null);
    jPanel3.setBounds(new Rectangle(5,361,621,171));
    jPanel3.setBackground(new Color(247, 247, 255));
    jButton1.setBackground(new Color(220, 230, 255));
    jButton1.setNextFocusableComponent(jButton2);
    jButton1.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton1.setForeground(new Color(0, 0, 60));
    jButton1.setText("==>");
    jButton1.setBounds(new Rectangle(383, 544, 100, 23));
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton1_actionPerformed(e);
      }
    });
    jButton2.setBackground(new Color(220, 230, 255));
    jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton2.setForeground(new Color(0, 0, 60));
    jButton2.setText("Обновить");
    jButton2.setBounds(new Rectangle(263, 544, 100, 23));
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton2_actionPerformed(e);
      }
    });
    jButton3.setBackground(new Color(220, 230, 255));
    jButton3.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton3.setForeground(new Color(0, 0, 60));
    jButton3.setText("Проверить");
    jButton3.setBounds(new Rectangle(143, 544, 100, 23));
    //jButton3.setVisible(false);
    jButton3.setEnabled(false);
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton3_actionPerformed(e);
      }
    });
  //  jLabel2.setText("");
 //   jLabel2.setBounds(new Rectangle(5, 3, 189, 17));
    jTextField5.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField5.setForeground(new Color(0, 0, 120));
    jTextField5.setText("");
    jTextField5.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField5.setVisible(false);
    jTextField5.setDisabledTextColor(Color.blue);
    jTextField5.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField9.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField9.setForeground(new Color(0, 0, 120));
    jTextField9.setText("");
    jTextField9.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField9.setVisible(false);
    jTextField9.setDisabledTextColor(Color.blue);
    jTextField9.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField13.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField13.setForeground(new Color(0, 0, 120));
    jTextField13.setText("");
    jTextField13.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField13.setVisible(false);
    jTextField13.setDisabledTextColor(Color.blue);
    jTextField13.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField16.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField16.setForeground(new Color(0, 0, 120));
    jTextField16.setText("");
    jTextField16.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField16.setVisible(false);
    jTextField16.setDisabledTextColor(Color.blue);
    jTextField16.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField23.setVisible(false);
    jTextField23.setDisabledTextColor(Color.blue);
    jTextField23.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField23.setText("");
    jTextField23.setForeground(new Color(0, 0, 120));
    jTextField23.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField24.setVisible(false);
    jTextField24.setDisabledTextColor(Color.blue);
    jTextField24.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField24.setText("");
    jTextField24.setForeground(new Color(0, 0, 120));
    jTextField24.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField5.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField5_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField9.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField9_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField13.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField13_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField16.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField16_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField23.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField23_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField24.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField24_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
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
    jRadioButton1.setVisible(false);
    jRadioButton2.setVisible(false);
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
    jRadioButton3.setVisible(false);
    jRadioButton3.setBackground(new Color(255, 255, 255));
    jRadioButton3.setFont(new java.awt.Font("Dialog", 3, 13));
    jRadioButton3.setForeground(new Color(0, 0, 40));
    jRadioButton3.setText(" ");
    jRadioButton3.setBounds(new Rectangle(87, 200, 111, 25));
    jRadioButton3.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        jRadioButton3_itemStateChanged(e);
      }
    });
    jRadioButton.setBounds(new Rectangle(20, 200, 10, 5));
    jRadioButton.setVisible(false);
    jRadioBtnYes.setBackground(new Color(255, 255, 255));
    jRadioBtnYes.setFont(new java.awt.Font("Dialog", 3, 13));
    jRadioBtnYes.setForeground(new Color(0, 0, 40));
    jRadioBtnYes.setText("Да");
    jRadioBtnYes.setVisible(false);
    jRadioBtnYes.setBounds(new Rectangle(67, 87, 30, 20));
    jRadioBtnYes.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        jRadioBtnYes_itemStateChanged(e);
      }
    });
    jRadioBtnNo.setVisible(false);
    jRadioBtnNo.setBackground(new Color(255, 255, 255));
    jRadioBtnNo.setFont(new java.awt.Font("Dialog", 3, 13));
    jRadioBtnNo.setForeground(new Color(0, 0, 40));
    jRadioBtnNo.setText("Нет");
    jRadioBtnNo.setBounds(new Rectangle(107, 87, 30, 20));
    jRadioBtnNo.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        jRadioBtnNo_itemStateChanged(e);
      }
    });
    jRadioBtnYN.setVisible(false);
    jRadioBtnYN.setBounds(new Rectangle(107, 87, 30, 20));
    jCheckBox1.setBackground(new Color(255, 255, 255));
    jCheckBox1.setFont(new java.awt.Font("SansSerif", 3, 13));
    jCheckBox1.setForeground(new Color(180, 0, 80));
    jCheckBox1.setText("Таблица");
    jCheckBox1.setVisible(false);
    jCheckBox1.setEnabled(false);
    jCheckBox1.setOpaque(false);
    jCheckBox1.setBounds(new Rectangle(510, 100, 98, 23));
    jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(ChangeEvent e) {
        jCheckBox1_stateChanged(e);
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
    jCheckBoxRezult.setBounds(new Rectangle(246, 135, 150, 23));
    jCheckBoxRezult.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(ChangeEvent e) {
        jCheckBoxRezult_stateChanged(e);
      }
    });
    buttonGroup1.add(jRadioButton);
    buttonGroup1.add(jRadioButton1);
    buttonGroup1.add(jRadioButton2);
    buttonGroup1.add(jRadioButton3);
    buttonGroupYesNo.add(jRadioBtnYes);
    buttonGroupYesNo.add(jRadioBtnNo);
    buttonGroupYesNo.add(jRadioBtnYN);
    this.getContentPane().add(jPanel1, null);
    this.getContentPane().add(jPanel2, null);
    this.getContentPane().add(jPanel3, null);
    this.jPanel1.setLayout(null);
    this.jPanel2.setLayout(null);
    this.jPanel3.setLayout(null);
    this.jPanel1.add(jLabel1, null);
    this.getContentPane().add(jButton1, null);
    this.getContentPane().add(jButton2, null);
    this.getContentPane().add(jButton3, null);
    this.jPanel2.add(jTextField5, null);
    this.jPanel2.add(jTextField9, null);
    this.jPanel2.add(jTextField13, null);
    this.jPanel2.add(jTextField16, null);
    this.jPanel3.add(jRadioButton, null);
    this.jPanel3.add(jRadioButton1, null);
    this.jPanel3.add(jRadioButton2, null);
    this.jPanel3.add(jRadioButton3, null);
    this.jPanel3.add(jRadioBtnYes, null);
    this.jPanel3.add(jRadioBtnNo, null);
    this.jPanel3.add(jTextField23, null);
    this.jPanel3.add(jTextField24, null);
    this.jPanel3.add(jCheckBox1, null);
    this.jPanel3.add(jCheckBoxRezult, null);
  }

  public void Ind_n(Graphics g,String a, String b, int x, int y){
    g.setFont(new java.awt.Font("SansSerif", 1, 15));
    g.drawString(""+a,x,y);
    g.setFont(new java.awt.Font("SansSerif", 1, 11));
    g.drawString(""+b+" ",x+a.length()*8,y+5);
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
  }
  public void Ind_nk(Graphics g,String a, String b, int x, int y){
    g.setFont(new java.awt.Font("SansSerif", 1, 15));
    g.drawString(""+a,x,y);
    g.setFont(new java.awt.Font("SansSerif", 3, 11));
    g.drawString(""+b+" ",x+a.length()*8,y+2);
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
  }
  public void Ind_v(Graphics g,String a, String b, int x, int y){
    g.setFont(new java.awt.Font("SansSerif", 1, 15));
    g.drawString(""+a,x,y);
    g.setFont(new java.awt.Font("SansSerif", 1, 11));
    g.drawString(""+b+"  ",x+a.length()*8,y-4);
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
  }
  public void Ind_vn(Graphics g,String a, String b, String c, int x, int y){
    g.setFont(new java.awt.Font("SansSerif", 1, 15));
    g.drawString(""+a,x,y);
    g.setFont(new java.awt.Font("SansSerif", 1, 11));
    g.drawString(""+b+"  ",x+a.length()*8,y-4);
    g.drawString(""+c+" ",x+a.length()*8,y+5);
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
  }
  public void Ind_f(Graphics g, int x, int y){
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
    g.drawString("f",x,y);
    g.drawLine(x-2,y+2,x+5,y+2);
    g.drawLine(x-2,y+1,x+5,y+1);
  }
  public void Tabl1(Graphics g, int a, int c, int t, int h, boolean f, int bp[]){ //Рисует таблицу
    int b=(600-120-(a+1)*60)/2, d=(int)Math.round(17*(3-c)/2);
    if(h==0) g.setColor(Color.red); else g.setColor(new Color(180, 0, 80));
    g.setFont(new java.awt.Font("SansSerif", 3, 13));
    g.drawString("Таблица "+t+":",15+b,tup-5+d);
    g.setColor(new Color(255, 255, 255)); g.fillRect(b+7,tup+d,602-2*b,2+17*(3+c));
    g.setColor(Color.black); // g.setColor(new Color(0, 0, 80));
    for(int i=0; i<=a+1; i++)
      g.drawLine(b+128+i*60,tup+1+d,b+128+i*60,tup+103-d);
    for(int i=0; i<=3; i++)
      if(i==0) g.drawLine(b+8+i*40,tup+1+d,b+8+i*40,tup+103-d);
      else g.drawLine(b+8+i*40,tup+1+d,b+8+i*40,tup+86-d);
    for(int i=0; i<=3+c; i++)
      if(i==1) g.drawLine(b+128,d+tup+1+i*17,608-b,d+tup+1+i*17);
      else g.drawLine(b+8,d+tup+1+i*17,608-b,d+tup+1+i*17);
    g.setColor(new Color(157, 187, 255)); g.drawRect(b+7,tup+d,602-2*b,2+17*(3+c));
    g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 13));
    if (f==true){
      g.drawString("БП",b+59,tup+23+d); g.drawString("БР",b+99,tup+23+d);
      g.drawString("БР/",b+139+60*a,tup+32+d); Ind_nk(g,"a","ir",b+162+60*a,tup+32+d);
      Ind_nk(g,"c","i",b+23,tup+23+d); Ind_nk(g,"c","j",b+153+a*60,tup+12+d);
      for(int i=1; i<=a; i++)
        Ind_n(g,"x",""+i,b+153+(i-1)*60,tup+29+d);
      for(int i=0; i<c; i++)
        if(bp[i]>0) Ind_n(g,"x",""+bp[i],b+62,tup+46+d+i*17);
      Ind_nk(g,"\u2206","  j",b+153+a*60,tup+48+c*17+d);
    }
  }
  public void Tabl2(Graphics g, int a0, int c0, int t, int h, boolean f, int bp0[]){ //Рисует  таблицу
    int b0=(600-120-(a+1)*60)/2, d0=(int)Math.round(17*(3-c0)/2);
    if(h==0) g.setColor(Color.red); else g.setColor(new Color(180, 0, 80));
    g.setFont(new java.awt.Font("SansSerif", 3, 13));
    g.drawString("Таблица "+t+":",b0+15,49+d0);
    g.setColor(new Color(255, 255, 255)); g.fillRect(b0+7,54+d0,602-2*b0,2+17*(3+c0));
    g.setColor(Color.black);
    for(int i=0; i<=a0+1; i++)
      g.drawLine(b0+128+i*60,55+d0,b0+128+i*60,55+d0+(c0+3)*17);
    for(int i=0; i<=3; i++)
      if(i==0) g.drawLine(b0+8+i*40,55+d0,b+8+i*40,55+d0+(c0+3)*17);
      else g.drawLine(b0+8+i*40,55+d0,b+8+i*40,55+d0+(c0+2)*17);
    for(int i=0; i<=3+c0; i++)
      if(i==1) g.drawLine(b0+128,55+d0+i*17,608-b0,55+d0+i*17);
      else g.drawLine(b0+8,55+d0+i*17,608-b0,55+d0+i*17);
    g.setColor(new Color(157, 187, 255)); g.drawRect(b0+7,54+d0,602-2*b0,2+17*(3+c0));
    g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 13));
    if (f==true){
      g.drawString("БП",b0+59,77+d0); g.drawString("БР",b0+99,77+d0);
      g.drawString("БР/",b0+139+60*a0,86+d0); Ind_nk(g,"a","ir",b0+162+60*a0,86+d0);
      Ind_nk(g,"c","i",b0+23,77+d0); Ind_nk(g,"c","j",b0+153+a0*60,66+d0);
      for(int i=1; i<=a0; i++)
        Ind_n(g,"x",""+i,b0+153+(i-1)*60,83+d0);
      for(int i=0; i<c0; i++)
        if(bp0[i]>0) Ind_n(g,"x",""+bp0[i],b0+62,100+d0+i*17);
      Ind_nk(g,"\u2206","  j",b0+153+a0*60,102+d0+c0*17);
    }
  }
  public void Tb1(Graphics g, int a, int c,int tbn[][], int tbd[][], int bp[]){ //Заполняет таблицу
    g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
    int b=(600-120-(a+1)*60)/2, d=(int)Math.round(17*(3-c)/2), l=0;
    String jj=""; int ii;
    for (int i=0; i<=c; i++)
      for (int j=0; j<=a; j++){
        int p; g.setColor(new Color(0, 0, 160));
        if(i==0) g.setColor(new Color(0, 0, 80));
        if (j==0) p=40; else p=60;
        if(tbn[i][j]<20000){
          if((tbd[i][j]==1) || (tbn[i][j]==0)) jj=""+tbn[i][j];
          else jj=tbn[i][j]+"/"+tbd[i][j];
          ii=(int)(b+88+(p-40)*(3*j-1)+(p-jj.length()*8)/2);
          if (i==0){
            if (tbn[i][j]==1000) g.drawString("M",ii+10,tup+15+d);
            else if (tbn[i][j]==-1000) g.drawString("-M",ii+10,tup+15+d);
                 else g.drawString(jj,ii,tup+15+d);
          }
          else g.drawString(jj,ii,tup+32+i*17+d);
        }
      }
    int kf; g.setColor(new Color(0, 0, 80));
    for (int j=1; j<=a; j++){
      if(tbn[4][j]<20000){
        kf=(int)Math.round(tbn[4][j]/1000.0);
        if((tbd[4][j]==1) || (tbn[4][j]==0)){
          if((kf>=1)||(kf<=-1)){
            if (tbn[4][j]-kf*1000>0){
              if(kf==1) jj="M+"+(tbn[4][j]-kf*1000);
              else if(kf==-1) jj="-M+"+(tbn[4][j]-kf*1000);
                   else jj=kf+"M+"+(tbn[4][j]-kf*1000);
            }
            else if (tbn[4][j]-kf*1000<0){
                   if(kf==1) jj="M-"+(kf*1000-tbn[4][j]);
                   else if(kf==-1) jj="-M-"+(kf*1000-tbn[4][j]);
                        else jj=kf+"M-"+(kf*1000-tbn[4][j]);
                 }
                 else{
                   if(kf==1) jj="M";
                   else if(kf==-1) jj="-M";
                        else jj=kf+"M";
                 }
          }
          else jj=""+tbn[4][j];
        }
        else{
          if((kf>=1)||(kf<=-1)){
            if (tbn[4][j]-kf*1000>0){
              if(kf==1) jj="("+"M+"+(tbn[4][j]-kf*1000)+")/"+tbd[4][j];
              else if(kf==-1) jj="("+"-M+"+(tbn[4][j]-kf*1000)+")/"+tbd[4][j];
                   else jj="("+kf+"M+"+(tbn[4][j]-kf*1000)+")/"+tbd[4][j];
              }
            else if (tbn[4][j]-kf*1000<0){
                   if(kf==1) jj="("+"M-"+(kf*1000-tbn[4][j])+")/"+tbd[4][j];
                   else if(kf==-1) jj="("+"-M-"+(kf*1000-tbn[4][j])+")/"+tbd[4][j];
                        else jj="("+kf+"M-"+(kf*1000-tbn[4][j])+")/"+tbd[4][j];
                 }
                 else{
                   if(kf==1) jj="M/"+tbd[4][j];
                   else if(kf==-1) jj="-M/"+tbd[4][j];
                        else jj=kf+"M/"+tbd[4][j];
                 }
          }
          else jj=tbn[4][j]+"/"+tbd[4][j];
        }
        l=60-jj.length()*8;
        if(l<0){
          g.setFont(new java.awt.Font("SansSerif", 1, 13));
          l=(60-jj.length()*6);
        }
        ii=(int)(b+68+j*60+l/2);
        Delta[j]=jj;
        g.drawString(jj,ii,tup+49+c*17+d);
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
      }
    }
    g.setColor(new Color(0, 0, 80));
    for (int i=0; i<c; i++){
      if((bp[i]<20000) && (tbn[0][bp[i]]<20000)){
        jj=""+tbn[0][bp[i]];
        ii=(int)(b+8+(40-jj.length()*8)/2);
        if (tbn[0][bp[i]]==1000) g.drawString("M",ii+10,tup+49+d+i*17);
        else if (tbn[0][bp[i]]==-1000) g.drawString("-M",ii+10,tup+49+d+i*17);
             else g.drawString(jj,ii,tup+49+d+i*17);
      }
    }
    g.setColor(new Color(0, 0, 80));
    for(int i=1; i<=c; i++){
      jj="";
      if((tbn[i][8]<20000)&&(tbn[i][8]>-20000)){
        if((tbd[i][8]==1) || (tbn[i][8]==0))
          jj=""+tbn[i][8];
        else jj=""+tbn[i][8]+"/"+tbd[i][8];
        ii=(int)(b+128+60*a+(60-jj.length()*8)/2);
        g.drawString(jj,ii,tup+49+d+(i-1)*17);
      }
      if(tbn[i][8]==-20000){
        jj="--";
        ii=(int)(b+130+60*a+(60-jj.length()*8)/2);
        g.drawString(jj,ii,tup+49+d+(i-1)*17);
      }
    }
  }
  public void Tb2(Graphics g, int a0, int c0, int pp, int nn, int tbn0[][], int tbd0[][], int bp0[]){ //Заполняет  таблицу
    g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
    int b0=(600-120-(a0+1)*60)/2, d0=(int)Math.round(17*(3-c0)/2), tup0=54, l=0;
    String jj=""; int ii;
    for (int i=0; i<=c0; i++)
      for (int j=0; j<=a0; j++){
        int p; g.setColor(new Color(0, 0, 160));
        if(i==0) g.setColor(new Color(0, 0, 80));
        if (j==0) p=40; else p=60;
        if(tbn0[i][j]<20000){
          if((tbd0[i][j]==1) || (tbn0[i][j]==0)) jj=""+tbn0[i][j];
          else jj=tbn0[i][j]+"/"+tbd0[i][j];
          ii=(int)(b0+88+(p-40)*(3*j-1)+(p-jj.length()*8)/2);
          if (i==0){
            if (tbn0[i][j]==1000) g.drawString("M",ii+10,tup0+15+d0);
            else if (tbn0[i][j]==-1000) g.drawString("-M",ii+10,tup0+15+d0);
                 else g.drawString(jj,ii,tup0+15+d0);
          }
          else g.drawString(jj,ii,tup0+32+i*17+d0);
        }
      }
    int kf; g.setColor(new Color(0, 0, 80));
    for (int j=1; j<=a0; j++){
      if(tbn0[4][j]<20000){
        kf=(int)Math.round(tbn0[4][j]/1000.0);
        if((tbd0[4][j]==1) || (tbn0[4][j]==0)){
          if((kf>=1)||(kf<=-1)){
            if (tbn0[4][j]-kf*1000>0){
              if(kf==1) jj="M+"+(tbn0[4][j]-kf*1000);
              else if(kf==-1) jj="-M+"+(tbn0[4][j]-kf*1000);
                   else jj=kf+"M+"+(tbn0[4][j]-kf*1000);
            }
            else if (tbn0[4][j]-kf*1000<0){
                   if(kf==1) jj="M-"+(kf*1000-tbn0[4][j]);
                   else if(kf==-1) jj="-M-"+(kf*1000-tbn0[4][j]);
                        else jj=kf+"M-"+(kf*1000-tbn0[4][j]);
                 }
                 else{
                   if(kf==1) jj="M";
                   else if(kf==-1) jj="-M";
                        else jj=kf+"M";
                 }
          }
          else jj=""+tbn0[4][j];
        }
        else{
          if((kf>=1)||(kf<=-1)){
            if (tbn0[4][j]-kf*1000>0){
              if(kf==1) jj="("+"M+"+(tbn0[4][j]-kf*1000)+")/"+tbd0[4][j];
              else if(kf==-1) jj="("+"-M+"+(tbn0[4][j]-kf*1000)+")/"+tbd0[4][j];
                   else jj="("+kf+"M+"+(tbn0[4][j]-kf*1000)+")/"+tbd0[4][j];
              }
            else if (tbn0[4][j]-kf*1000<0){
                   if(kf==1) jj="("+"M-"+(kf*1000-tbn0[4][j])+")/"+tbd0[4][j];
                   else if(kf==-1) jj="("+"-M-"+(kf*1000-tbn0[4][j])+")/"+tbd0[4][j];
                        else jj="("+kf+"M-"+(kf*1000-tbn0[4][j])+")/"+tbd0[4][j];
                 }
                 else{
                   if(kf==1) jj="M/"+tbd0[4][j];
                   else if(kf==-1) jj="-M/"+tbd0[4][j];
                        else jj=kf+"M/"+tbd0[4][j];
                 }
          }
          else jj=tbn0[4][j]+"/"+tbd0[4][j];
        }
        l=60-jj.length()*8;
        if(l<0){
          g.setFont(new java.awt.Font("SansSerif", 1, 13));
          l=(60-jj.length()*6);
        }
        ii=(int)(b0+68+j*60+l/2);
        g.drawString(jj,ii,tup0+49+c0*17+d0);
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
      }
    }
    g.setColor(new Color(0, 0, 80));
    for (int i=0; i<c0; i++){
      if((bp0[i]<20000) && (tbn0[0][bp0[i]]<20000)){
        jj=""+tbn0[0][bp0[i]];
        ii=(int)(b0+8+(40-jj.length()*8)/2);
        if (tbn0[0][bp0[i]]==1000) g.drawString("M",ii+10,tup0+49+d0+i*17);
        else if (tbn0[0][bp0[i]]==-1000) g.drawString("-M",ii+10,tup0+49+d0+i*17);
             else g.drawString(jj,ii,tup0+49+d0+i*17);
      }
    }
    g.setColor(new Color(0, 0, 80));
    for(int i=1; i<=c0; i++){
      jj="";
      if((tbn0[i][8]<20000)&&(tbn0[i][8]>-20000)){
        if((tbd0[i][8]==1) || (tbn0[i][8]==0))
          jj=""+tbn0[i][8];
        else jj=""+tbn0[i][8]+"/"+tbd0[i][8];
        ii=(int)(b0+128+60*a0+(60-jj.length()*8)/2);
        g.drawString(jj,ii,tup0+49+d0+(i-1)*17);
      }
      if(tbn0[i][8]==-20000){
        jj="--";
        ii=(int)(b0+130+60*a0+(60-jj.length()*8)/2);
        g.drawString(jj,ii,tup0+49+d0+(i-1)*17);
      }
    }
    g.setColor(Color.red);
    if(tbd0[pp][nn]!=1) jj=tbn0[pp][nn]+"/"+tbd0[pp][nn];
    else jj=""+tbn0[pp][nn];
    Stringer.drawString(jj,(int)(b+88+20*(3*n-1)+(60-jj.length()*8)/2),tup0+32+p*17+d0);
  }
  public int MaxDel(int n, int m){ //Макимальный общий делитель из 2 чисел
    int s=1;
    for (int i=Math.min(Math.abs(n),Math.abs(m)); i>1; i--){
      if (((Math.max(Math.abs(n),Math.abs(m))%i)==0) && ((Math.min(Math.abs(n),Math.abs(m))%i)==0)){
        s=i;
        break;
      }
    }
    return s;
  }
  public int MaxDel3(int n, int m, int l){ //Макимальный общий делитель из 3 чисел
    int s=1;
    for (int i=Math.min((Math.min(Math.abs(n),Math.abs(m))),Math.abs(l)); i>1; i--){
      if ( ((Math.abs(n)%i)==0) && ((Math.abs(m)%i)==0) && ((Math.abs(l)%i)==0) ){
        s=i;
        break;
      }
    }
    return s;
  }
  public void ModifyArray(int a, int c, int tbn[][], int tbd[][], int bp[]){ //Вычисляет оценки
    int mn[]={0,0,0}, md[]={1,1,1}, kf=1;
    for(int i=1; i<=a; i++){
      for(int j=0; j<c; j++){
        mn[j]=tbn[j+1][i]*tbn[0][bp[j]];
        md[j]=tbd[j+1][i]*tbd[0][bp[j]];
        }
      tbn[4][i]=tbn[0][i]; tbd[4][i]=tbd[0][i];
      for(int j=0; j<c; j++)
        if(mn[j]<20000){
          kf=MaxDel(tbd[4][i],md[j]);
          tbn[4][i]=tbn[4][i]*md[j]/kf; mn[j]=mn[j]*tbd[4][i]/kf;
          tbd[4][i]=tbd[4][i]*md[j]/kf; md[j]=tbd[4][i]; // общий знаменатель
          tbn[4][i]=tbn[4][i]-mn[j];
      }
      if((Math.round(tbn[4][i]/1000.0)<1) && (Math.round(tbn[4][i]/1000.0)>-1)){
        kf=MaxDel(tbn[4][i],tbd[4][i]);
        tbn[4][i]=tbn[4][i]/kf; tbd[4][i]=tbd[4][i]/kf;
      }
       else{
        int j=1;
        kf=(int)Math.round(tbn[4][i]/1000.0);
        j=MaxDel3(tbn[4][i]-kf*1000,tbd[4][i],kf);
        tbd[4][i]=tbd[4][i]/j;
        tbn[4][i]=tbn[4][i]/j;
      }
    }
  }
  public void ModifyFanc(int tn[][], int td[][], int Xn[][], int Xd[][], String sf[]){
    sf[0]="f(x^{"+k+"}) = ";
    if(tn[0][1]>=0) sf[0]=sf[0]+tn[0][1]+" * ";
    if(tn[0][1]<0) sf[0]=sf[0]+"- "+Math.abs(tn[0][1])+" * ";
    if(Xd[k][1]==1){
      if(Xn[k][1]>=0) sf[0]=sf[0]+Xn[k][1]+" ";
      else sf[0]=sf[0]+"( "+Math.abs(Xn[k][1])+" ) ";
    }
    else{
      if(Xn[k][1]>0) sf[0]=sf[0]+Xn[k][1]+"/"+Xd[k][1]+" ";
      else if(Xn[k][1]==0) sf[0]=sf[0]+Xn[k][1]+" ";
           else sf[0]=sf[0]+"( "+Math.abs(Xn[k][1])+"/"+Xd[k][1]+" ) ";
    }
     if(tn[0][2]>=0) sf[0]=sf[0]+"+ "+tn[0][2]+" * ";
    if(tn[0][2]<0) sf[0]=sf[0]+"- "+Math.abs(tn[0][2])+" * ";
    if(Xd[k][2]==1){
      if(Xn[k][2]>=0) sf[0]=sf[0]+Xn[k][2]+" = ";
      else sf[0]=sf[0]+"( "+Math.abs(Xn[k][2])+" ) = ";
    }
    else{
      if(Xn[k][2]>0) sf[0]=sf[0]+Xn[k][2]+"/"+Xd[k][2]+" = ";
      else if(Xn[k][2]==0) sf[0]=sf[0]+Xn[k][2]+" = ";
      else sf[0]=sf[0]+"( "+Math.abs(Xn[k][2])+"/"+Xd[k][2]+" ) = ";
    }
  }
  public void ModifyArray1(int a, int c, int tbn[][], int tbd[][], int p, int n){  //Пересчет таблицы
    int tbn1=0, tbd1=0, kf=0, t=1;
    for(int i=1; i<=4 ; i++){
      if((c==2) && (i==3)) i++;
      if(i!=p){
        for(int j=0; j<=a; j++)
          if(tbn[i][j]<20000)
            if(j!=n){
              tbn1=tbn[p][j]*tbn[i][n]*tbd[p][n];
              tbd1=tbd[p][j]*tbd[i][n]*tbn[p][n];
             if(tbn1!=0){
              t=MaxDel(tbd[i][j],tbd1);
              tbn[i][j]=(tbn[i][j]*tbd1/t)-(tbn1*tbd[i][j]/t);
              tbd[i][j]=tbd[i][j]*tbd1/t;
              kf=(int)Math.round(tbn[i][j]/1000.0);
              if( ( ((kf>-1) && (kf<1)) && (i==4)) || (i<4)){
                t=MaxDel(tbn[i][j],tbd[i][j]);
                tbd[i][j]=tbd[i][j]/t;
                tbn[i][j]=tbn[i][j]/t;
              }
              if(((kf<=-1) || (kf>=1)) && (i==4)){
                t=1;
                if(tbn[i][j]==kf*1000) t=MaxDel(tbd[i][j],kf);
                else t=MaxDel3(tbn[i][j]-kf*1000,tbd[i][j],kf);
                tbd[i][j]=tbd[i][j]/t;
                tbn[i][j]=tbn[i][j]/t;
              }
            }}
        tbn[i][n]=0; tbd[i][n]=1;
      }
    }
    tbn1=tbn[p][n]; tbd1=tbd[p][n];
    for(int i=0; i<=a; i++){
      tbn[p][i]=tbn[p][i]*tbd1;
      tbd[p][i]=tbd[p][i]*tbn1;
      t=MaxDel(tbn[p][i],tbd[p][i]);
      tbn[p][i]=tbn[p][i]/t;
      tbd[p][i]=tbd[p][i]/t;
   }
  }
  public void ModifyF(int an, int c, int tbn[][], int Xn[][], int Xd[][], int k){  //Вычисление значения Функции
    int mn=0, md=1, kf=1; fnk=0;fdk=1;
    for(int i=1; i<=an; i++){
      mn=tn[0][i]*Xn[k][i];
      md=Xd[k][i];
      if(mn!=0){
        kf=MaxDel(mn,md);
        mn=mn/kf; md=md/kf;
        kf=MaxDel(fdk,md);
        fnk=fnk*md/kf; mn=mn*fdk/kf; fdk=fdk*md/kf;
        fnk=fnk+mn;
        kf=MaxDel(fnk,fdk);
        fnk=fnk/kf; fdk=fdk/kf;
      }
    }
  }
  public void Valuation(int a, int c, int tbn[][], int tbd[][], int nm[], String sm[]){ //Находит максимальную оценку
    double max=-1.0; int maxn=-1, maxd=1;
    nm[0]=-1; sm[0]="";
       for(int i=1; i<=a; i++)
         if((tbn[4][i]>0) && (max<(double)tbn[4][i]/tbd[4][i])){
           max=tbn[4][i]/tbd[4][i];
           nm[0]=i; maxn=tbn[4][i]; maxd=tbd[4][i];
         }
       int kf;
       if(maxn>-1){
         kf=(int)Math.round(maxn/1000.0);
         if(maxd==1){
           if((kf>=1)||(kf<=-1)){
             if (maxn-kf*1000>0){
               if(kf==1) sm[0]="M+"+(maxn-kf*1000);
               else if(kf==-1) sm[0]="-M+"+(maxn-kf*1000);
                    else sm[0]=kf+"M+"+(maxn-kf*1000);
             }
             else if (maxn-kf*1000<0){
                    if(kf==1) sm[0]="M-"+(kf*1000-maxn);
                    else if(kf==-1) sm[0]="-M-"+(kf*1000-maxn);
                         else sm[0]=kf+"M-"+(kf*1000-maxn);
                  }
                  else{
                    if(kf==1) sm[0]="M";
                    else if(kf==-1) sm[0]="-M";
                         else sm[0]=kf+"M";
                  }
           }
           else sm[0]=""+maxn;
         }
         else{
           if((kf>=1)||(kf<=-1)){
             if (maxn-kf*1000>0){
               if(kf==1) sm[0]="("+"M+"+(maxn-kf*1000)+")/"+maxd;
               else if(kf==-1) sm[0]="("+"-M+"+(maxn-kf*1000)+")/"+maxd;
                    else sm[0]="("+kf+"M+"+(maxn-kf*1000)+")/"+maxd;
               }
             else if (maxn-kf*1000<0){
                    if(kf==1) sm[0]="("+"M-"+(kf*1000-maxn)+")/"+maxd;
                    else if(kf==-1) sm[0]="("+"-M-"+(kf*1000-maxn)+")/"+maxd;
                         else sm[0]="("+kf+"M-"+(kf*1000-maxn)+")/"+maxd;
                  }
                  else{
                    if(kf==1) sm[0]="M/"+maxd;
                    else if(kf==-1) sm[0]="-M/"+maxd;
                         else sm[0]="M/"+maxd;
                  }
           }
           else sm[0]=maxn+"/"+maxd;
         }
       }
  }

  public void ModifyProblem(int a, int c, int tn[][], int td[][], int tbn[][], int tbd[][], String s[]){ //условия задачи
    for(int i=2; i<=11; i++)
      s[i]="";
    s[2]="f(x) = ";
    if(tn[0][1]>1) s[2]=s[2]+tn[0][1]+" x_{1}";
    if(tn[0][1]<-1) s[2]=s[2]+"- "+Math.abs(tn[0][1])+" x_{1}";
    if(tn[0][1]==1) s[2]=s[2]+"x_{1}"; if(tn[0][1]==-1) s[2]=s[2]+"- x_{1}";
    if(tn[0][1]!=0){
      if((tn[0][2]>0) && (tn[0][2]!=20000)){
        if(tn[0][2]!=1) s[2]=s[2]+"+ "+tn[0][2]+" x_{2} \u2192 max";
        else s[2]=s[2]+"+ x_{2} \u2192 max";
      }
    }
    else{
      if((tn[0][2]>0) && (tn[0][2]!=20000)){
        if(tn[0][2]!=1) s[2]=s[2]+tn[0][2]+" x_{2} \u2192 max";
        else s[2]=s[2]+"x_{2} \u2192 max";
      }
    }
    if(tn[0][2]<0){
      if(Math.abs(tn[0][2])!=1) s[2]=s[2]+"- "+Math.abs(tn[0][2])+" x_{2} \u2192 max";
      else s[2]=s[2]+"- x_{2} \u2192 max";
    }
    if (tn[0][2]==0) s[2]=s[2]+"\u2192 max";
    for(int i=1; i<=c; i++)
      if(tn[i][0]<20000){
        for(int j=1; j<=an; j++){
          if((j==1) && (tn[i][j]>0)){
            if(tn[i][j]!=1) s[i+2]=s[i+2]+tn[i][j]+" x_{"+j+"}";
            else s[i+2]=s[i+2]+"x_{"+j+"}";
          }
          else if((j>1) && (tn[i][j]>0)){
                 if((tn[i][1]!=0) || (j>2)) s[i+2]=s[i+2]+"+ ";
                 if(tn[i][j]!=1) s[i+2]=s[i+2]+tn[i][j]+" x_{"+j+"}";
                 else s[i+2]=s[i+2]+"x_{"+j+"}";
               }
          if(tn[i][j]<0){
            if(tn[i][j]!=-1) s[i+2]=s[i+2]+"- "+Math.abs(tn[i][j])+" x_{"+j+"}";
            else s[i+2]=s[i+2]+"- x_{"+j+"}";
          }
          if(td[i][j]!=1) s[i+2]=s[i+2]+"/"+td[i][j]+"";
          else s[i+2]=s[i+2]+"";
        }
        if(tn[i][8]==1) s[i+2]=s[i+2]+" \u2264 ";
        if(tn[i][8]==-1) s[i+2]=s[i+2]+" \u2265 ";
        if(tn[i][0]>=0) s[i+2]=s[i+2]+tn[i][0];
        else s[i+2]=s[i+2]+"- "+Math.abs(tn[i][0]);
        if(td[i][0]!=1) s[i+2]=s[i+2]+"/"+td[i][0]+",";
        else s[i+2]=s[i+2]+",";
      }
    s[10]="x_{1}, x_{2} \u2265 0.";
    s[6]="f(x) = ";
    if(tbn[0][1]>1) s[6]=s[6]+tbn[0][1]+" x_{1}";
    if(tbn[0][1]<-1) s[6]=s[6]+"- "+Math.abs(tbn[0][1])+" x_{1}";
    if(tbn[0][1]==1) s[6]=s[6]+"x_{1}"; if(tbn[0][1]==-1) s[6]=s[6]+"- x_{1}";
    int kf=0;
    for(int i=2; i<=a; i++){
      kf=(int)Math.round(tbn[0][i]/1000.0);
      if(kf==0){
        if((tbn[0][1]!=0) || (i>2)){
          if(tbn[0][i]>0){
            if(tbn[0][i]!=1) s[6]=s[6]+"+ "+tbn[0][i]+" x_{"+i+"}";
            else s[6]=s[6]+"+ x_{"+i+"}";
          }
         }
        else{
          if(tbn[0][i]>0){
            if(tbn[0][i]!=1) s[6]=s[6]+tbn[0][i]+" x_{"+i+"}";
            else s[6]=s[6]+"x_{"+i+"}";
          }
        }
        if(tbn[0][i]<0){
          if(Math.abs(tbn[0][i])!=1) s[6]=s[6]+"- "+Math.abs(tbn[0][i])+" x_{"+i+"}";
          else s[6]=s[6]+"- x_{"+i+"}";
        }
      }
      else if(kf==-1){
        s[6]=s[6]+"- M x_{"+i+"}";
      }
    }
    s[6]=s[6]+" \u2192 max";
    for(int i=1; i<=c; i++)
      if(tbn[i][0]<20000){
        for(int j=1; j<=a; j++){
          if((j==1) && (tbn[i][j]>0)){
            if(tbn[i][j]!=1) s[i+6]=s[i+6]+tbn[i][j]+" x_{"+j+"}";
            else s[i+6]=s[i+6]+"x_{"+j+"}";
          }
          else if((j>1) && (tbn[i][j]>0)){
                 if((tn[i][1]!=0) || (j>2)) s[i+6]=s[i+6]+"+ ";
                 if(tbn[i][j]!=1) s[i+6]=s[i+6]+tbn[i][j]+" x_{"+j+"}";
                 else s[i+6]=s[i+6]+"x_{"+j+"}";
               }
          if(tbn[i][j]<0){
            if(tbn[i][j]!=-1) s[i+6]=s[i+6]+"- "+Math.abs(tbn[i][j])+" x_{"+j+"}";
            else s[i+6]=s[i+6]+"- x_{"+j+"}";
          }
          if(tbd[i][j]!=1) s[i+6]=s[i+6]+"/"+tbd[i][j]+"";
          else s[i+6]=s[i+6]+"";
        }
        if(tbn[i][0]>=0) s[i+6]=s[i+6]+"= "+tbn[i][0];
        else s[i+6]=s[i+6]+"= - "+Math.abs(tbn[i][0]);
        if(tbd[i][0]!=1) s[i+6]=s[i+6]+"/"+tbd[i][0]+",";
        else s[i+6]=s[i+6]+",";
      }
    if(a==2) s[11]="x_{1}, x_{2} \u2265 0.";
    else s[11]="x_{1},...,x_{"+a+"} \u2265 0.";
  }


  public void ModifyRasForma(int at[], int ct[], int tn[][], int td[][], int tbn[][], int tbd[][], String s[]){ //расширенная форма
    int a=at[0], c=ct[0];
    for(int i=0; i<c; i++)
      bp[i]=0;
    for(int i=0; i<5; i++)
      for(int j=0; j<9; j++){
        tbn[i][j]=20000; tbd[i][j]=1;
      }
    for(int i=0; i<5; i++)
      for(int j=0; j<8; j++){
        tbn[i][j]=tn[i][j];
        tbd[i][j]=td[i][j];
      }
    for(int i=1; i<=c; i++){
      if(tn[i][8]==1){
        a++;
        for(int j=0; j<=c; j++) tbn[j][a]=0;
        tbn[i][a]=1;
      }
      if(tn[i][8]==-1){
        a++;
        for(int j=0; j<=c; j++) tbn[j][a]=0;
        tbn[i][a]=-1;
      }
    }
    boolean bpr=false;
    for(int i=1; i<=c; i++)
      for(int j=1; j<=a; j++){
        if((tbn[i][j]==1) && (tbd[i][j]==1)){
          bpr=true;
          for(int u=1; u<=c; u++)
            if((tbn[u][j]!=0) && (u!=i)) bpr=false;
          if(bpr==true) bp[i-1]=j;
        }
      }
    for(int i=0; i<c; i++)
      if(bp[i]==0){
        a++;
        for(int j=1; j<=c; j++) tbn[j][a]=0;
        tbn[i+1][a]=1; tbn[0][a]=-1000;
        bp[i]=a;
      }
    at[0]=a;
    ModifyProblem(a,c,tn,td,tbn,tbd,s);
  }

  public void SetParam(){
    jRadioButton.setSelected(true); jRadioBtnYN.setSelected(true);
    jRadioButton1.setEnabled(false); jRadioButton1.setVisible(false);
    jRadioButton2.setEnabled(false); jRadioButton2.setVisible(false);
    jRadioButton3.setEnabled(false); jRadioButton3.setVisible(false);
    jRadioBtnYes.setSelected(false); jRadioBtnYes.setVisible(false); jRadioBtnYes.setEnabled(false);
    jRadioBtnNo.setSelected(false); jRadioBtnNo.setVisible(false); jRadioBtnNo.setEnabled(false);
    jCheckBox1.setSelected(false); jCheckBox1.setEnabled(false); jCheckBox1.setVisible(false);
    jCheckBoxRezult.setSelected(true); jCheckBoxRezult.setVisible(false); jCheckBoxRezult.setEnabled(false);
    jTextField5.setText(""); jTextField9.setText(""); jTextField13.setText("");
    jTextField16.setText("");
    jTextField5.setVisible(false); jTextField5.setEnabled(false);
    jTextField9.setVisible(false); jTextField9.setEnabled(false);
    jTextField13.setVisible(false); jTextField13.setEnabled(false);
    jTextField16.setVisible(false); jTextField16.setEnabled(false);
    jTextField23.setVisible(false); jTextField23.setEnabled(false);
    jTextField24.setVisible(false); jTextField24.setEnabled(false);
    jButton3.setEnabled(false);
    jTextField5.setForeground(new Color(0, 0, 120));
    jTextField9.setForeground(new Color(0, 0, 120));
    jTextField13.setForeground(new Color(0, 0, 120));
    jTextField16.setForeground(new Color(0, 0, 120));
    jTextField23.setForeground(new Color(0, 0, 120));
    jTextField24.setForeground(new Color(0, 0, 120));
  }

  class MyPaint2 extends JPanel {
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
        Stringer.setGraphics(g);
        FontMetrics Fm=g.getFontMetrics();
        if((stepSM==0) && (stepVG==0)){
          a=0; c=0; fnk=0; fdk=1; Numx=0; fn=-20000; fd=1; step=0; r=0; sh=1;
          shag=false; Right=true; RightPust=true; edt=false; Ch=false;
          otv=-1; Kx=0; Ky=0; bpx=-1; nm[0]=0; n=0; p=0; k=0; ki=0; otvn=0; pp=0;
          ots=""; sm[0]=""; ss=""; jj="";
          for(int i=0; i<12; i++)
            s[i]="";
          for(int i=0; i<7; i++)
            Delta[i]="";
          for(int i=0; i<3; i++)
            bp[i]=0;
          for(int i=0; i<5; i++)
            for(int j=0; j<9; j++){
              tbn[i][j]=20000; tn[i][j]=20000;
              tbd[i][j]=1; td[i][j]=1;
            }
          for(int i=0; i<=2; i++)
            for(int j=0; j<=2; j++){
              Xn[i][j]=20000;
              Xd[i][j]=1;
            }
          for(int i=0; i<=6; i++){
            XVG[i]=0; XPr[i]=0;
            J[i]=0; JPr[i]=0;
          }
          for(int i=0; i<40; i++){
            Mist_calk[i]=0;
            Mist_under[i]=0;
            Mist_knowledge[i]=0;
            Mist_use[i]=0;
          }
        int at[]={2}, ct[]={2}; an=at[0]; cn=ct[0];
        tn[0][1]=5; tn[0][2]=1;
        tn[1][0]=10; tn[1][1]=3; tn[1][2]=1; tn[1][8]=1;
        tn[2][0]=9; tn[2][1]=-3; tn[2][2]=7; tn[2][8]=1;
        ModifyRasForma(at,ct,tn,td,tbn,tbd,s);a=at[0]; c=ct[0];
        jPanel2.repaint(); jPanel1.repaint();
      }
      b=(600-120-(a+1)*60)/2; d=(int)Math.round(17*(3-c)/2);
      if(stepSM==0){
        if(sh==1){
          stepSM=1;
          stepVG=1;
        }
        else{
          stepSM=1;
          stepVG=1;
          sh=1;
        }
        otv0=-1;
      }
      if((stepSM==1) && (stepVG==1)){
        if((sh-2)%5==0){
          r=0;
          Tabl1(g,a,c,1,0,true,bp);
          Tb1(g,a,c,tbn,tbd,bp);
          if ((edt == false || Right == false || RightPust == false) && (k==0 || k==2)){
              jButton1.setEnabled(false);
            }

          if(otv==1 && k==0)
            if (Kx >= 309 + b && Kx <= 368 + b && Ky >= tup + d + 53 && Ky <= tup + d + 69) {
              entry = true;
              if (edt == false && entry == true) {
                jTextField9.setBounds(new Rectangle(129 + b + 180, tup + d + 53, 60, 17));
                jTextField9.setVisible(true);
                jTextField9.setEnabled(true);
                jButton3.setEnabled(true);
              }
            }
          if (entry == false && k==0){
            g.setColor(new Color(255, 255, 255));
            g.fillRect(309 + b, tup + d + 53, 59, 16);
            g.setColor(new Color(0, 0, 160));
            jj = "0";
            g.drawString(jj, (int) (b + 308 + (60 - jj.length() * 8) / 2), tup + 66 + d);
          }
          if(otv==1 && k==2)
            if (Kx >= 369 + b && Kx <= 428 + b && Ky >= tup + d + 70 && Ky <= tup + d + 86) {
              entry = true;
              if (edt == false && entry == true) {
                jTextField13.setBounds(new Rectangle(369 + b, tup + d + 70, 60, 17));
                jTextField13.setVisible(true);
                jTextField13.setEnabled(true);
                jButton3.setEnabled(true);
              }
            }
          if (entry == false && k==2) {
            g.setColor(new Color(255, 255, 255));
            g.fillRect(369 + b, tup + d + 70, 59, 16);
            g.setColor(new Color(0, 0, 160));
            jj = "1";
            g.drawString(jj, (int) (b + 368 + (60 - jj.length() * 8) / 2), tup + 83 + d);
          }
        }
        if((sh-2)%5==1){
          ModifyArray(a,c,tbn,tbd,bp);
          Tabl1(g,a,c,1,1,true,bp);
          Tb1(g,a,c,tbn,tbd,bp);
          g.setColor(Color.red);
          Ind_nk(g,"\u2206","  j",b+153+a*60,tup+48+c*17+d);
          g.setColor(new Color(0, 0, 80));
          int kf=0;
        }
        if((sh-2)%5==2){
          n=0; Valuation(a,c,tbn,tbd,nm,sm); n=nm[0]; ss=sm[0];
          Tabl1(g,a,c,1,1,true,bp);
          Tb1(g,a,c,tbn,tbd,bp);
          g.setColor(Color.red);
          Ind_nk(g,"\u2206","  j",b+153+a*60,tup+48+c*17+d);
          g.setColor(new Color(0, 0, 80));
        }
        if((sh-2)%5==3){
          Tabl1(g,a,c,1+r,1,true,bp);
          Tb1(g,a,c,tbn,tbd,bp);
          g.setColor(new Color(230, 230, 255));
          g.fillRect(129+b,tup+d+2+17,a*60-1,16);
          g.setColor(Color.black);
          for(int i=0; i<=a; i++)
          {
            g.drawLine(b+128+i*60,tup+d+2+17,b+128+i*60,tup+18+d+17);
            if(i!=a) Ind_n(g,"x",""+(i+1),b+153+i*60,tup+29+d);
          }
          if(jRadioBtnNo.isSelected()==true)
          {
            if(otv!=1){
              if(((Kx>=69+b+n*60) && (Kx<=128+b+n*60)) && ((Ky>=tup+d+19) && (Ky<=tup+d+35))){
                g.setColor(Color.red);
                Ind_n(g,"x",""+n,b+153+(n-1)*60,tup+29+d);
                otv=1; jPanel3.repaint();
              }
              else if((Ky>=tup+d+19) && (Ky<=tup+d+35))
                   {
                    otv=-1;
                    for(int i=1; i<=a; i++)
                      if(((Kx>=69+b+i*60) && (Kx<=128+b+i*60)))
                      {
                        g.setColor(Color.red);
                        Ind_n(g,"x",""+i,b+153+(i-1)*60,tup+29+d);
                        otv=0;
                        jPanel3.repaint();
                      }
                   }
                   else
                     {otv=-1; jPanel3.repaint();}
            }
            else{
              g.setColor(Color.red);
              Ind_n(g,"x",""+n,b+153+(n-1)*60,tup+29+d);
            }
          }
          else{
            g.setColor(Color.red);
            Ind_n(g,"x",""+(n+1+r),b+153+(n+r)*60,tup+29+d);
          }
        }
        if((sh-2)%5==4){
          double min=20000.0; int minn=0, mind=1;
          for(int i=1; i<=c; i++)
          if(tbn[i][n]>0){
            minn=tbn[i][0]*tbd[i][n]; mind=tbd[i][0]*tbn[i][n];
            tbn[i][8]=minn/MaxDel(minn,mind); tbd[i][8]=mind/MaxDel(minn,mind);
            if(min>((double)tbn[i][0]/tbd[i][0])*((double)tbd[i][n]/tbn[i][n])){
              min=((double)tbn[i][0]/tbd[i][0])*((double)tbd[i][n]/tbn[i][n]);
              p=i;
            }
          }
          else tbn[i][8]=-20000;
        Tabl1(g,a,c,1+r,1,true,bp);
        g.setColor(new Color(230, 230, 255));
        g.fillRect(49+b,tup+d+36,39,17*c-1);
        g.setColor(Color.black);
        for(int i=2; i<=c; i++)
          g.drawLine(b+48,tup+18+d+17*i,b+48+40,tup+18+d+17*i);
        for(int i=0; i<c; i++)
          if(bp[i]>0) Ind_n(g,"x",""+bp[i],b+62,tup+46+d+i*17);
        Tb1(g,a,c,tbn,tbd,bp);
        if(p==1 || jRadioBtnNo.isSelected()==false){
          g.setColor(Color.red);
          if(k==1 && r==0) Ind_n(g,"x",""+bp[1],b+62,tup+63+d);
          else Ind_n(g,"x",""+bp[0],b+62,tup+46+d);
        }
        else{
          if(otv!=1){
            if(((Kx>=49+b) && (Kx<=89+b)) && ((Ky>=tup+d+36) && (Ky<=tup+d+52)))
              bpx=0;
            else if(((Kx>=49+b) && (Kx<=89+b)) && ((Ky>=tup+d+53) && (Ky<=tup+d+69)))
              bpx=1;
            else if(((Kx>=49+b) && (Kx<=89+b)) && ((Ky>=tup+d+70) && (Ky<=tup+d+86)) && (c>=3))
              bpx=2;
            else if(((Kx>=49+b) && (Kx<=89+b)) && ((Ky>=tup+d+87) && (Ky<=tup+d+103)) && (c==4))
              bpx=3;
            else bpx=-1;
            if((tbn[bpx+1][8]==-20000) && (bpx>=0)){
              g.setColor(new Color(230, 230, 255));
              g.fillRect(69+b+n*60,tup+d+2+17*(bpx+2),59,16);
            }
          }
          Tb1(g,a,c,tbn,tbd,bp);
          if(((((double)tbn[bpx+1][0]/tbd[bpx+1][0])*((double)tbd[bpx+1][n]/tbn[bpx+1][n]))==min) && (tbn[bpx+1][n]>0) && (bpx>=0)){
            g.setColor(Color.red); p=bpx+1;
            Ind_n(g,"x",""+bp[bpx],b+62,tup+46+d+bpx*17);
            otv=1; jPanel3.repaint();
          }
          else if(bpx>=0)
                 {otv=0; jPanel3.repaint();}
               else
                 {otv=-1; jPanel3.repaint();}
        }
          shag=true;
          r=0;
        }
      }
      if((stepSM==2) && (stepVG==1)){
        if((sh-2)%5==0){
          bp[p-1]=n;
        for(int i=1; i<=c+1; i++){
          tbn[i][8]=20000; tbd[i][8]=1;
        }
        ModifyArray1(a,c,tbn,tbd,p,n);
        Tabl1(g,a,c,1+r,0,true,bp);
        Tb1(g,a,c,tbn,tbd,bp);
        if((edt==false || Right==false || RightPust==false) && ((r==1 && k==0) || (k==1 && r==2))){
            jButton1.setEnabled(false);
        }
        if(r==1 && k==0)
          if(otv==1)
           if(Kx>=189+b && Kx<=248+b && Ky>=tup+d+(c+2)*17+2 && Ky<=tup+d+(c+2)*17+18){
              entry=true;
              if(edt==false && entry==true){
                jTextField16.setBounds(new Rectangle(189+b,tup+d+(c+2)*17+2,60,17));
                jTextField16.setVisible(true); jTextField16.setEnabled(true);
                jButton3.setEnabled(true);
              }
            }
        if(entry==false && k==0){
          g.setColor(new Color(255,255,255));
          g.fillRect(189+b,tup+d+(c+2)*17+2,59,16);
          g.setColor(new Color(0,0,80));
          jj="1/3";
          g.drawString(jj,(int)(b+188+(60-jj.length()*8)/2),tup+d+(c+2)*17+14);
        }
        if(r==2 && k==1)
          if(otv==1)
            if(Kx>=369+b && Kx<=428+b && Ky>=tup+d+53 && Ky<=tup+d+69){
               entry=true;
               if(edt==false && entry==true){
                 jTextField5.setBounds(new Rectangle(189+b+180,tup+d+53,60,17));
                 jTextField5.setVisible(true); jTextField5.setEnabled(true);
                 jButton3.setEnabled(true);
               }
             }
         if(entry==false && k==1 && r==2){
           g.setColor(new Color(255,255,255));
           g.fillRect(369+b,tup+d+53,59,16);
           g.setColor(new Color(0,0,160));
           jj="-18";
           g.drawString(jj,(int)(b+368+(60-jj.length()*8)/2),tup+66+d);
         }
      }
      if((sh-2)%5==1){
        sh++;
        jPanel2.repaint();
        jPanel1.repaint();
        jPanel3.repaint();
      }
      if((sh-2)%5==2){
        n=0; Valuation(a,c,tbn,tbd,nm,sm); n=nm[0]; ss=sm[0];
        Tabl1(g,a,c,1+r,1,true,bp);
        Tb1(g,a,c,tbn,tbd,bp);
        g.setColor(Color.red);
        Ind_nk(g,"\u2206","  j",b+153+a*60,tup+48+c*17+d);
        g.setColor(new Color(0, 0, 80));
      }
      if((sh-2)%5==3){
        Tabl1(g,a,c,1+r,1,true,bp);
        Tb1(g,a,c,tbn,tbd,bp);
        g.setColor(new Color(230, 230, 255));
        g.fillRect(129+b,tup+d+2+17,a*60-1,16);
        g.setColor(Color.black);
        for(int i=0; i<=a; i++)
        {
          g.drawLine(b+128+i*60,tup+d+2+17,b+128+i*60,tup+18+d+17);
          if(i!=a) Ind_n(g,"x",""+(i+1),b+153+i*60,tup+29+d);
        }
        if(jRadioBtnNo.isSelected()==true)
        {
          if(otv!=1){
            if(((Kx>=69+b+n*60) && (Kx<=128+b+n*60)) && ((Ky>=tup+d+19) && (Ky<=tup+d+35))){
              g.setColor(Color.red);
              Ind_n(g,"x",""+n,b+153+(n-1)*60,tup+29+d);
              otv=1; jPanel3.repaint();
            }
            else if((Ky>=tup+d+19) && (Ky<=tup+d+35))
                 {
                  otv=-1;
                  for(int i=1; i<=a; i++)
                    if(((Kx>=69+b+i*60) && (Kx<=128+b+i*60)))
                    {
                      g.setColor(Color.red);
                      Ind_n(g,"x",""+i,b+153+(i-1)*60,tup+29+d);
                      otv=0;
                      jPanel3.repaint();
                    }
                 }
                 else
                   {otv=-1; jPanel3.repaint();}
          }
          else{
            g.setColor(Color.red);
            Ind_n(g,"x",""+n,b+153+(n-1)*60,tup+29+d);
          }
        }
        else{
          g.setColor(Color.red);
          Ind_n(g,"x",""+(n+1+r),b+153+(n+r)*60,tup+29+d);
        }
     }
     if((sh-2)%5==4){
        double min=20000.0; int minn=0, mind=1;
        for(int i=1; i<=c; i++)
        if(tbn[i][n]>0){
          minn=tbn[i][0]*tbd[i][n]; mind=tbd[i][0]*tbn[i][n];
          tbn[i][8]=minn/MaxDel(minn,mind); tbd[i][8]=mind/MaxDel(minn,mind);
          if(min>((double)tbn[i][0]/tbd[i][0])*((double)tbd[i][n]/tbn[i][n])){
            min=((double)tbn[i][0]/tbd[i][0])*((double)tbd[i][n]/tbn[i][n]);
            p=i;
          }
        }
        else tbn[i][8]=-20000;
        Tabl1(g,a,c,1+r,1,true,bp);
        g.setColor(new Color(230, 230, 255));
        g.fillRect(49+b,tup+d+36,39,17*c-1);
        g.setColor(Color.black);
        for(int i=2; i<=c; i++)
          g.drawLine(b+48,tup+18+d+17*i,b+48+40,tup+18+d+17*i);
        for(int i=0; i<c; i++)
          if(bp[i]>0) Ind_n(g,"x",""+bp[i],b+62,tup+46+d+i*17);
        Tb1(g,a,c,tbn,tbd,bp);
        if(p==1 || jRadioBtnNo.isSelected()==false){
          g.setColor(Color.red);
          Ind_n(g,"x",""+bp[0],b+62,tup+46+d);
        }
        else{
          if(otv!=1){
            if(((Kx>=49+b) && (Kx<=89+b)) && ((Ky>=tup+d+36) && (Ky<=tup+d+52)))
              bpx=0;
            else if(((Kx>=49+b) && (Kx<=89+b)) && ((Ky>=tup+d+53) && (Ky<=tup+d+69)))
              bpx=1;
            else if(((Kx>=49+b) && (Kx<=89+b)) && ((Ky>=tup+d+70) && (Ky<=tup+d+86)) && (c>=3))
              bpx=2;
            else if(((Kx>=49+b) && (Kx<=89+b)) && ((Ky>=tup+d+87) && (Ky<=tup+d+103)) && (c==4))
              bpx=3;
            else bpx=-1;
            if((tbn[bpx+1][8]==-20000) && (bpx>=0)){
              g.setColor(new Color(230, 230, 255));
              g.fillRect(69+b+n*60,tup+d+2+17*(bpx+2),59,16);
            }
          }
          Tb1(g,a,c,tbn,tbd,bp);
          if(((((double)tbn[bpx+1][0]/tbd[bpx+1][0])*((double)tbd[bpx+1][n]/tbn[bpx+1][n]))==min) && (tbn[bpx+1][n]>0) && (bpx>=0)){
            g.setColor(Color.red); p=bpx+1;
            Ind_n(g,"x",""+bp[bpx],b+62,tup+46+d+bpx*17);
            otv=1; jPanel3.repaint();
          }
          else if(bpx>=0)
                 {otv=0; jPanel3.repaint();}
               else
                 {otv=-1; jPanel3.repaint();}
        }
      }
    }
    if(stepVG==2){
      if(edt==false)
        if(k%2==1){
          for(int i=0; i<=an; i++)
            tn[c][i]=0;
          tn[c][1]=1; tn[c][0]=(int)(Xn[k-1][1]/Xd[k-1][1])+1; tn[c][8]=-1;
          int at[]={an}, ct[]={c};
          ModifyRasForma(at,ct,tn,td,tbn,tbd,s);
          a=at[0]; c=ct[0]; k++; r=2; edt=true;
          jPanel1.repaint(); jPanel3.repaint();
        }
        else{
          stepVG=3; jPanel2.repaint();
        }
    }
    if(stepVG==3){
      int MaxFn=0, MaxFd=1, kk=-1;
      for(int i=0; i<=6; i++)
        if(J[i]==1){
          MaxFn=-20000; MaxFd=1;
          ModifyF(an,c,tbn,Xn,Xd,i);
          if((double)MaxFn/MaxFd<(double)fnk/fdk)           //==
           MaxFn=fnk; MaxFd=fdk; kk=i; J[kk]=0;
        }
      if(kk>=0){ k=2*kk+1; stepVG=4; }
      else {stepVG=5; jPanel2.repaint();}
    }
    if(stepVG==4){
        if(edt==false){
        c++;
        for(int i=0; i<=an; i++)
          tn[c][i]=0;
        tn[c][1]=1; tn[c][0]=(int)(Xn[k-1][1]/Xd[k-1][1]); tn[c][8]=1;
        int at[]={an}, ct[]={c};
        ModifyRasForma(at,ct,tn,td,tbn,tbd,s);
        a=at[0]; c=ct[0]; edt=true;
        jPanel1.repaint(); jPanel3.repaint();
       }
    }

    if(stepVG==5){
      double Maxf=-20000; sx1=""; sx2="";
      for(int i=0; i<=2; i++)
        if(XVG[i]==1){
          ModifyF(an,c,tbn,Xn,Xd,i);
          if((double)fnk/fdk>Maxf){
            Maxf=(double)fnk/fdk; otvn=i;
            sx1="x^{*} = x^{"+i+"} = ("+Xn[i][1]+"; "+Xn[i][2]+"), f(x^{*}) = f(x^{"+i+"}) = "+(int)(Maxf);
          }
          else if((double)fnk/fdk==Maxf){
                 sx2="x^{*} = x^{"+i+"} = ("+Xn[i][1]+"; "+Xn[i][2]+"), f(x^{*}) = f(x^{"+i+"}) = "+(int)(Maxf);
                 otvn=3;
               }
        }
        sh=200; jPanel1.repaint(); jPanel3.repaint();
    }

    if(((stepSM==3) && (stepVG==1)) || (stepVG==5)){
      if(((sh-2)%5==3) && (stepVG!=5)){
        Tabl1(g,a,c,r+1,1,true,bp);
        Tb1(g,a,c,tbn,tbd,bp);
        boolean fl=false;
        for(int i=1; i<=c; i++)
          if((tbn[0][bp[i-1]]==-1000) && (tbn[i][0]!=0)) fl=true;
        if(fl==false){    //если непустое множество
          for(int i=1; i<=an; i++)
            Xn[k][i]=0;
          for(int i=1; i<=c; i++)
            if((bp[i-1]<=2) && (tbn[0][bp[i-1]]<20000)){
              Xn[k][bp[i-1]]=tbn[i][0];
              Xd[k][bp[i-1]]=tbd[i][0];
            }///////{
          Numx=0;
          for(int i=an; i>0; i--)
            if((Xd[k][i]>1) && (Xn[k][i]!=0)){
              Numx=i;
            }
          if(Numx>0){   //если нецелое
            Xn[k][0]=0;
            if(fn==-20000) J[k]=1;
            else{
              ModifyF(an,c,tbn,Xn,Xd,k);
              if((double)fnk/fdk>(double)fn/fd) J[k]=1;
            }
          }
          else{   //если целое
            Xn[k][0]=1;
            if(fn==-20000){     //если первое целое
              ModifyF(an,c,tbn,Xn,Xd,k); fn=fnk; fd=fdk;
              XVG[k]=1; Nfn=k;
              for(int i=0; i<k; i++)
                if(J[i]==1){
                  ModifyF(an,c,tbn,Xn,Xd,i);
                  if((double)fnk/fdk<=(double)fn/fd) J[i]=0;
                }
            }
            else{    //не первое целое
              ModifyF(an,c,tbn,Xn,Xd,k);
              if((double)fnk/fdk>=(double)fn/fd) XVG[k]=1;
            }
          }
          ModifyF(an,c,tbn,Xn,Xd,k);
          if((fdk==1) || (fnk==0)) fun=""+fnk;
          else fun=fnk+"/"+fdk;
        }
        else Xn[k][0]=-1;//пустое
        if(edt==false){
          edt=true;
          jPanel3.repaint();
        }
      }
      if((((sh-2)%5==4) || ((sh-2)%5<=2)) || (stepVG==5)){
        g.setColor(new Color(180, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 3, 13));
        g.drawString("Схема решения:",148,tup-3);
        g.setColor(new Color(255, 255, 255)); g.fillRect(140,tup+1,336,158);
        g.setColor(new Color(157, 187, 255)); g.drawRect(140,tup+1,336,158);
        g.setColor(Color.black);
        g.drawRect(245,tup+6,126,48);
        g.drawLine(245,tup+21,371,tup+21);
        g.drawLine(353,tup+21,353,tup+54);
        if((k==0) && ((sh-2)%5!=1) && ((sh-2)%5!=2)) g.setColor(Color.red);
        else g.setColor(new Color(180, 0, 80));
        Stringer.drawString("ЗЛП - 0",283,tup+19);
        g.setColor(new Color(0, 0, 80));
        String resh="x^{0}=(", resh1="x^{0}=(", resh2="x^{0}=(", resh3="x^{0}=(", resh4="x^{0}=(";
        for(int i=1; i<=an; i++)
          if((Xd[0][i]!=1) && ((Xn[0][i]!=0))){
            resh=resh+Xn[0][i]+"/"+Xd[0][i];
            if(i!=an){
              resh2=resh;
              resh=resh+"; ";
              resh3=resh;
            }
            else{
              resh4=resh;
              resh=resh+")^{T}";
            }
          }
          else{
            resh=resh+Xn[0][i];
            if(i!=an){
              resh2=resh;
              resh=resh+"; ";
              resh3=resh;
            }
            else{
              resh4=resh;
              resh=resh+")^{T}";
            }
          }
        ModifyF(an,c,tbn,Xn,Xd,0); g.setColor(new Color(0, 0, 80));
        Stringer.drawString(resh,(108-Fm.stringWidth(resh)*5/4)/2+245,tup+36);
        if((otv==1) && (k==0)){
          g.setColor(Color.red);
          Stringer.drawString(resh2,(108-Fm.stringWidth(resh)*5/4)/2+245,tup+36);
          g.setColor(new Color(0, 0, 80));
          Stringer.drawString(resh1,(108-Fm.stringWidth(resh)*5/4)/2+245,tup+36);
        }
        if((otv==2) && (k==0)){
          g.setColor(Color.red);
          Stringer.drawString(resh4,(108-Fm.stringWidth(resh)*5/4)/2+245,tup+36);
          g.setColor(new Color(0, 0, 80));
          Stringer.drawString(resh3,(108-Fm.stringWidth(resh)*5/4)/2+245,tup+36);
        }
        if(fdk==1)
          Stringer.drawString("f(x^{0}) = "+fnk,(108-Fm.stringWidth("f(x^{0} = "+fnk)*3/2)/2+245,tup+51);
        else
          Stringer.drawString("f(x^{0}) = "+fnk+"/"+fdk,(108-Fm.stringWidth("f(x^{0} = "+fnk+"/"+fdk)*3/2)/2+245,tup+51);
         Stringer.drawString("Н",357,tup+46);
         boolean ff=false;
        if((k>=1) || (((stepSM==3) && (stepVG==1)) && (((sh-2)%5==1) || ((sh-2)%5==2))))
          for(int j=1; j<=2; j++){
            if((k==0) && (edt==false)){
               jTextField23.setEnabled(true);  jTextField24.setEnabled(true);
            }
            g.setColor(Color.black);
            g.drawRect(145+(j-1)*200,tup+106,126,48);
            g.drawLine(145+(j-1)*200,tup+121,271+(j-1)*200,tup+121);
            if(j==1) g.drawLine(303,tup+54,208,tup+106);
            if(j==2) g.drawLine(313,tup+54,408,tup+106);
            if(((j==k) || (k==0)) && (stepVG!=5)) g.setColor(Color.red);
            else g.setColor(new Color(180, 0, 80));
            Stringer.drawString("ЗЛП - "+j,183+(j-1)*200,tup+119);
            if(((stepSM==3) && (stepVG==1)) && ((sh-2)%5==1)) g.setColor(Color.red);
            else g.setColor(new Color(0, 0, 80));
            if(((k==0) && (edt==true) && (Right==true) && (RightPust==true)) || (k>0) || (stepVG==5) || ((sh-2)%5==2)){
              Stringer.drawString("x_{1} \u2264 "+(int)(Xn[0][1]/Xd[0][1]),203,tup+85);
              Stringer.drawString("x_{1} \u2265 "+(int)((Xn[0][1]/Xd[0][1])+1),380,tup+85);
            }
            if(j<=k){
             if(Xn[j][0]!=-1){
              String reshx="x^{"+j+"}= (";
              for(int i=1; i<=an; i++)
                if((Xd[j][i]!=1) && (Xn[j][i]!=0)){
                  reshx=reshx+Xn[j][i]+"/"+Xd[j][i];
                  if(i!=an) reshx=reshx+"; ";
                  else reshx=reshx+")^{T}";
                }
                else{
                  reshx=reshx+Xn[j][i];
                  if(i!=an) reshx=reshx+"; ";
                    else reshx=reshx+")^{T}";
                }
              ModifyF(an,c,tbn,Xn,Xd,j); g.setColor(new Color(0, 0, 80));
              if((otvn==j) || (otvn==3) || ((j==k) && (stepVG!=5) && ((sh-2)%5==4))) g.setColor(Color.red);
              Stringer.drawString(reshx,(108-Fm.stringWidth(reshx)*6/5)/2+145+(j-1)*200,tup+136);
              if(fdk==1){
                if((fnk==fn) && (ff==false)){
                  Stringer.drawString("/{f}{} = f(x^{"+j+"}) = "+fnk,(108-Fm.stringWidth("/{f}{} = f(x^{"+j+"}) = "+fnk)*3/2)/2+158+(j-1)*200,tup+150);
                  ff=true;
                }
                else
                  Stringer.drawString("f(x^{"+j+"}) = "+fnk,(108-Fm.stringWidth("f(x^{"+j+"}) = "+fnk)*3/2)/2+150+(j-1)*200,tup+150);
              }
              else
                Stringer.drawString("f(x^{"+j+"}) = "+fnk+"/"+fdk,(108-Fm.stringWidth("f(x^{"+j+"}) = "+fnk+"/"+fdk)*3/2)/2+145+(j-1)*200,tup+150);
             }
             else{
               g.setColor(new Color(0, 0, 80));
               if((otvn==j) || (otvn==3) || ((j==k) && (stepVG!=5) && ((sh-2)%5==4))) g.setColor(Color.red);
                Stringer.drawString("X = \u00D8",188+(j-1)*200,tup+140);
              }
              g.setColor(new Color(0, 0, 80));
              if(Xn[j][0]==1) Stringer.drawString("Ц",257+(j-1)*200,tup+146);
              if(Xn[j][0]==0) Stringer.drawString("Н",257+(j-1)*200,tup+146);
              g.setColor(Color.black);
              if(Xn[j][0]!=-1)
              g.drawLine(253+(j-1)*200,tup+121,253+(j-1)*200,tup+154);
            }
          }
        }
      }
      if(stepVG==5)
      {
        if(Ch==true)
        {
          int kolmist_calk=0, kolmist_under=0, kolmist_knowledge=0, kolmist_use=0, Vopros=0;
          g.setColor(new Color(190, 190, 190));
          g.fillRect(97,10,436,172);
          g.setColor(new Color(255, 255, 255));
          g.fillRect(90,3,436,172);
          g.setColor(new Color(247, 247, 255));
          g.fillRect(511,3,15,15);
          g.setColor(Color.blue);
          g.drawRect(90,3,436,172);
          g.drawRect(511,3,15,15); g.drawLine(511,3,526,18); g.drawLine(511,18,526,3);
          g.setColor(new Color(180, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 3, 13));
          g.drawString("Ваш результат:",259,22);
          for(int i=0; i<40; i++){
            kolmist_calk=kolmist_calk+Mist_calk[i];
            kolmist_under=kolmist_under+Mist_under[i];
            kolmist_knowledge=kolmist_knowledge+Mist_knowledge[i];
            kolmist_use=kolmist_use+Mist_use[i];
          }
          Vopros=RightAnswer+kolmist_calk+kolmist_under+kolmist_knowledge+kolmist_use;
          g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 3, 14));
          g.drawString("Количество вопросов: "+Vopros,225,42);
          g.drawString("Количество правильных ответов: "+RightAnswer,180,62);
          g.drawString("Количество допущенных ошибок :",182,82);
          g.drawString("- на знание:           "+kolmist_knowledge,237,97);
          g.drawString("- на понимание:    "+kolmist_under,237,112);
          g.setColor(Color.lightGray);
          g.drawString("- на вычисление: "+kolmist_calk,237,127);
          g.setColor(Color.lightGray);
          g.drawString("- на применение: "+kolmist_use,237,142);
          g.setColor(new Color(0, 0, 80));
          if(Vopros!=0 && RightAnswer<=Vopros)
            g.drawString("Результат выполнения упражнения: "+(RightAnswer*100/Vopros)+"%",160,165);
          else
            g.drawString("Результат выполнения упражнения: 0%",160,165);
        }
      }
    }
  }

  class MyPaint1 extends JPanel {
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Stringer.setGraphics(g);
      if(sh<=2){
        s0=""; s1=""; s2=""; s3=""; s4="";
        for(int i=0; i<=1; i++)
          s[i]="";
        s[0]="Найти оптимальное решение задачи  f(x) = ";
        if(tn[0][1]>1) s[0]=s[0]+tn[0][1]+" x_{1} ";
        if(tn[0][1]<-1) s[0]=s[0]+"- "+Math.abs(tn[0][1])+" x_{1}";
        if(tn[0][1]==1) s[0]=s[0]+"x_{1} "; if(tn[0][1]==-1) s[0]=s[0]+"- x_{1}";
       if(tn[0][2]!=20000){
        if(tn[0][1]!=0){
          if(tn[0][2]>0){
            if(tn[0][2]!=1) s[0]=s[0]+"+ "+tn[0][2]+" x_{2} \u2192 max при ограничениях";
            else s[0]=s[0]+"+ x_{2} \u2192 max при ограничениях";
          }
        }
        else{
          if(tn[0][2]>0){
            if(tn[0][2]!=1) s[0]=s[0]+tn[0][2]+" x_{2} \u2192 max при ограничениях";
            else s[0]=s[0]+"x_{2} \u2192 max при ограничениях";
          }
        }
        if(tn[0][2]<0){
          if(Math.abs(tn[0][2])!=1) s[0]=s[0]+"- "+Math.abs(tn[0][2])+" x_{2} \u2192 max при ограничениях";
          else s[0]=s[0]+"- x_{2} \u2192 max при ограничениях";
        }
        if(tn[0][2]==0) s[0]=s[0]+"\u2192 max при ограничениях";
       }
       else s[0]=s[0]+"\u2192 max при ограничениях";
        for(int i=1; i<=cn; i++){
          for(int j=1; j<=an; j++){
            if((j==1) && (tn[i][j]>0) && (tn[i][j]!=20000)){
              if(tn[i][j]!=1) s[1]=s[1]+tn[i][j]+" x_{"+j+"}";
              else s[1]=s[1]+"x_{"+j+"}";
            }
            else if((j>1) && (tn[i][j]>0) && (tn[i][j]!=20000)){
                   if(tn[i][j]!=1) s[1]=s[1]+"+ "+tn[i][j]+" x_{"+j+"}";
                   else s[1]=s[1]+"+ x_{"+j+"}";
            }
            if(tn[i][j]<0){
              if(tn[i][j]!=-1) s[1]=s[1]+"- "+Math.abs(tn[i][j])+" x_{"+j+"}";
              else s[1]=s[1]+"- x_{"+j+"}";
            }
            if(td[i][j]!=1) s[1]=s[1]+"/"+td[i][j]+" ";
            else s[1]=s[1]+"";
          }
          if(tn[i][8]==1) s[1]=s[1]+" \u2264 ";
          if(tn[i][8]==-1) s[1]=s[1]+" \u2265 ";
          if(tn[i][0]>=0) s[1]=s[1]+tn[i][0];
          else s[1]=s[1]+"- "+Math.abs(tn[i][0]);
          if(td[i][0]!=1) s[1]=s[1]+"/"+td[i][0]+",  ";
          else s[1]=s[1]+",  ";
        }
        s[1]=s[1]+" x_{1}, x_{2} \u2265 0, где x_{1}, x_{2} - целые, методом ветвей и границ";
      }
      g.setColor(new Color(180, 0, 80));
      g.setFont(new java.awt.Font("SansSerif", 3, 13));
      g.drawString("Обозначения:",477,82);
      g.setColor(new Color(255, 255, 255));
      g.fillRect(7,87,210,85); g.fillRect(237,87,210,85); g.fillRect(467,87,142,85);
      g.setColor(new Color(157, 187, 255));
      g.drawRect(7,87,210,85); g.drawRect(237,87,210,85); g.drawRect(467,87,142,85);
      g.setColor(new Color(0, 0, 80));
      if(((stepSM==3) && (stepVG==1)) && (((sh-2)%5==4) || ((sh-2)%5<=2)) || (stepVG==5)){
        Stringer.drawString("Н - нецелочислен-",471,108); Stringer.drawString("ное решение",494,124);
        Stringer.drawString("Ц - целочисленное",471,144); Stringer.drawString("решение",495,160);
      }
      else{
        g.setFont(new java.awt.Font("SansSerif", 1, 13));
        g.drawString("БП",477,108); g.drawString("БР",476,144);
        Stringer.drawString("- базисные",497,108); Stringer.drawString("переменные",507,124);
        Stringer.drawString("- базисное",497,144); Stringer.drawString("решение",507,160);
      }
      g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
      Stringer.drawString(s[0],61,38);
      Stringer.drawString(s[1],12,58);
      int at[]={an}, ct[]={cn};
      if(stepVG==5) ModifyRasForma(at,ct,tn,td,tbn,tbd,s);
      FontMetrics Fm=g.getFontMetrics();
      Stringer.drawString(s[2],(210-s[2].length()*6+28)/2+7,102);
      Stringer.drawString(s[3],(210-s[3].length()*4)/2+8,124);
      Stringer.drawString(s[4],(210-s[4].length()*4)/2+6,144);
      if((stepSM==3) && (stepVG==1) && ((sh-2)%5==2)){
        Stringer.drawString(s[2],(210-s[2].length()*6+28)/2+237,102);
        Stringer.drawString(s[3],(210-s[3].length()*4)/2+237,124);
        Stringer.drawString(s[4],(210-s[4].length()*4)/2+236,144);
        s[5]="x_{1} \u2265 "+(int)((Xn[0][1]/Xd[0][1])+1);
        Stringer.drawString(s[5]+"   "+s[10],(210-s[5].length()*5-s[10].length()*5+20)/2+242,164);
        s[5]="x_{1} \u2264 "+(int)(Xn[0][1]/Xd[0][1]);
        Stringer.drawString(s[5]+"   "+s[10],(210-s[5].length()*5-s[10].length()*5+20)/2+15,164);
      }
      else{
        Stringer.drawString(s[5]+"   "+s[10],(210-s[5].length()*3-s[10].length()*6+20)/2+5,164);
        if(sh!=0){
          Stringer.drawString(s[6],(210-s[6].length()*6+28)/2+237,102);
          Stringer.drawString(s[7],(210-s[7].length()*4)/2+237,124);
          Stringer.drawString(s[8],(210-s[8].length()*4)/2+233,144);
          Stringer.drawString(s[9]+"   "+s[11],(210-s[9].length()*3-s[11].length()*6+20)/2+238,164);
        }
      }
      g.setColor(new Color(180, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 3, 13));
      g.drawString("Задача:  ",6,38);

      if(sh>=0){
        if((sh==1) || (stepVG==2) || ((stepSM==3) && (stepVG==1) && ((sh-2)%5==2)) || (stepVG==4)){
          g.setColor(Color.red);
          g.drawRect(7,87,210,85); g.drawRect(237,87,210,85);
        }
        g.setColor(new Color(180, 0, 80));
        if((sh==1) || (stepVG==2) || ((stepSM==3) && (stepVG==1) && ((sh-2)%5==2)) || (stepVG==4)) g.setColor(Color.red);
        g.setFont(new java.awt.Font("SansSerif", 3, 13));
        if((stepSM==3) && (stepVG==1) && ((sh-2)%5==2) && (sh<200)){
          g.drawString("Задача ЗЛП - 1:",15,82); g.drawString("Задача ЗЛП - 2:",245,82);
        }
        else{ if(sh<200 && sh!=0){
                g.drawString("Задача ЗЛП - "+k+":",15,82); g.drawString("Расширенная форма:",245,82);
              }
              else{
                 g.drawString("Задача ЗЛП:",15,82); g.drawString("Расширенная форма:",245,82);
              }
        }
        g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
      }
      if(((stepSM==2) && (stepVG==1)) && ((sh-2)%5==0)){
        if(Ch==true){
          int b0=(600-120-(a0+1)*60)/2, d0=(int)Math.round(17*(3-c0)/2);
          g.setColor(new Color(190, 190, 190));
          g.fillRect(b0+7,41+d0,602-2*b0+14,2+17*(3+c0)+27);
          g.setColor(new Color(255, 255, 255));
          g.fillRect(b0,34+d0,602-2*b0+14,2+17*(3+c0)+27);
          g.setColor(Color.blue);
          g.drawRect(b0,34+d0,602-2*b0+14,2+17*(3+c0)+27);
          Tabl2(g,a0,c0,r,1,true,bp0);
          Tb2(g,a0,c0,p,n,tbn0,tbd0,bp0);
        }
      }
    }
  }

  class MyPaint3 extends JPanel {
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Stringer.setGraphics(g);
      StringerD.setGraphics(g);
      FontMetrics Fm=g.getFontMetrics();
      String otvet="";
      g.setColor(new Color(180, 0, 80));
      g.setFont(new java.awt.Font("SansSerif", 3, 13));
      g.drawString("Задачи подлежащие ветвлению:",15,12);
      g.drawString("Возможные оптимальные решения:",286,12);
      g.drawString("Решение:",15,55);
      g.setColor(new Color(255, 255, 255));
      g.fillRect(7,60,602,110); g.fillRect(7,17,251,23); g.fillRect(278,17,331,23);
      g.setColor(new Color(157, 187, 255));
      g.drawRect(7,60,602,110); g.drawRect(7,17,251,23); g.drawRect(278,17,331,23);
      boolean JNull=true, XNull=true; String JS="= ", XS="";
//     g.drawString("otv="+otv+"   fnk="+fnk+"     fdk"+fdk,100,55);

      if(sh==1){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("0.0.",10, 80);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Положим    = 0. Будем решать исходную задачу ЗЛП - 0 без учета тебования",40, 80);
        Stringer.drawString("целочисленности симплекс-методом: для этого запишем расширенную форму",12, 100);
        Stringer.drawString("ЗЛП - 0.",12, 120);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("k",110, 80);
        g.setColor(Color.red);
        Stringer.drawString("Положим    = 0. Будем решать исходную задачу ЗЛП - 0",40, 80);
        Stringer.drawString("целочисленности симплекс-методом: для этого запишем расширенную форму",12, 100);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Положим    = 0. Будем решать исходную",40, 80);
        Stringer.drawString("целочисленности симплекс-методом: для этого запишем",12, 100);
      }
      if((stepVG==4) || (stepVG==2)){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString(k+".0.",10, 80);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Положим    = "+k+". Будем решать задачу ЗЛП - "+k+" без учета тебования",40, 80);
        Stringer.drawString("целочисленности симплекс-методом: для этого запишем расширенную форму",12, 100);
        Stringer.drawString("ЗЛП - "+k+".",12, 120);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("i",110, 80);
        g.setColor(Color.red);
        Stringer.drawString("Положим    = "+k+". Будем решать задачу ЗЛП - "+k,40, 80);
        Stringer.drawString("целочисленности симплекс-методом: для этого запишем расширенную форму",12, 100);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Положим    = "+k+". Будем решать",40, 80);
        Stringer.drawString("целочисленности симплекс-методом: для этого запишем",12, 100);
      }
      if(stepSM==1 && stepVG==1 && (sh-2)%5==0){
        otvet="";
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString(k+".1.1.",10, 80);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Заполняем                    согласно алгоритму симплекс-метода.",54, 80);
        g.setColor(Color.red); g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("Таблицу 1",137, 80);
        g.setColor(new Color(0, 0, 40)); g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("Таблица заполнена правильно.",90, 105);
        jRadioBtnYes.setBounds(new Rectangle(325,83,60,20));
        jRadioBtnNo.setBounds(new Rectangle(325,103,60,20));
        jRadioBtnYes.setVisible(true); jRadioBtnYes.setEnabled(true);
        jRadioBtnNo.setVisible(true); jRadioBtnNo.setEnabled(true);
        if(k!=1){
          if(jRadioBtnYes.isSelected()==true){
            if(AddMist==0){Mist_under[3]++; AddMist=1;} g.setColor(Color.red); StringerD.drawString("Неправильно",385,106);}
          if(jRadioBtnNo.isSelected()==true){
            g.setColor(Color.blue);
            StringerD.drawString("Правильно",385,106);
            jRadioBtnYes.setEnabled(false);
            g.setColor(new Color(0, 0, 80));
            Stringer.drawString("Укажите ячейку таблицы, которая заполнена неправильно.",45,136);
            g.setColor(Color.red);
            if(otv==1){
              if(entry==true || (Kx >= 309 + b && Kx <= 368 + b && Ky >= tup + d + 53 && Ky <= tup + d + 69 && k==0)
                || (Kx >= 369 + b && Kx <= 428 + b && Ky >= tup + d + 70 && Ky <= tup + d + 86 && k==2)){
                entry=true; if(AddMist==0) AddMist=1;
                g.setColor(Color.blue);
                StringerD.drawString("Правильно",485,136);
                g.setColor(new Color(0, 0, 80));
                Stringer.drawString("Заполните ячейку таблицы.",150,156);
                if(edt==true){
                  if((Right==false) || (RightPust==false)){
                    g.setColor(Color.red);
                    StringerD.drawString("Неправильно",370,156);
                  }
                  else{
                    g.setColor(Color.blue);
                    StringerD.drawString("Правильно",370,156);
                  }
                }
              }
              else if(entry==false){
                g.setColor(Color.red); if(AddMist==1){Mist_under[3]++; AddMist=2;}
                StringerD.drawString("Неправильно, данная ячейка таблицы заполнена верно",108,156);
              }
            }
            else if(otv==2)
            {
              g.setColor(Color.red);
              StringerD.drawString("Не попали в область",240,156);
            }
          }
        }
        else
        {
          if(jRadioBtnNo.isSelected()==true){
            if(AddMist==0){Mist_under[3]++; AddMist=1;}
            g.setColor(Color.red); StringerD.drawString("Неправильно",405,106);
          }
          if(jRadioBtnYes.isSelected()==true){
            if(AddMist==0) AddMist=1;
            g.setColor(Color.blue);
            StringerD.drawString("Правильно",405,106);
            jRadioBtnNo.setEnabled(false);
            jButton1.setEnabled(true);
          }
          else jButton1.setEnabled(false);
        }
      }
      if(((stepSM==1) && (stepVG==1)) && ((sh-2)%5==1)){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString(k+".1.1.1.",10, 80);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Вычисляем относительные оценки      ,    = 1, ..., "+a+".",64, 80);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("j",349, 80);
        g.setColor(Color.red); Ind_nk(g,"\u2206","  j",321,80);
        g.setColor(new Color(0, 0, 40)); g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("Оценки вычислены правильно.",90, 110);
        jRadioBtnYes.setBounds(new Rectangle(325,88,60,20));
        jRadioBtnNo.setBounds(new Rectangle(325,108,60,20));
        jRadioBtnYes.setVisible(true); jRadioBtnYes.setEnabled(true);
        jRadioBtnNo.setVisible(true); jRadioBtnNo.setEnabled(true);
        if(jRadioBtnNo.isSelected()==true){ if(AddMist==0){Mist_calk[4]++; AddMist=1;} g.setColor(Color.red); StringerD.drawString("Неправильно",385,111);}
        if(jRadioBtnYes.isSelected()==true){
          if(AddMist==0) AddMist=1;
          g.setColor(Color.blue);
          StringerD.drawString("Правильно",385,111);
          jRadioBtnNo.setEnabled(false);
          jButton1.setEnabled(true);
        }
        else jButton1.setEnabled(false);
      }
      if(((stepSM==1) || (stepSM==2)) && (stepVG==1) && ((sh-2)%5==2)){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString(k+"."+(r+1)+".2.",10, 80);
        jRadioBtnYes.setBounds(new Rectangle(385,88,60,20));
        jRadioBtnNo.setBounds(new Rectangle(385,108,60,20));
        jRadioBtnYes.setVisible(true); jRadioBtnYes.setEnabled(true);
        jRadioBtnNo.setVisible(true); jRadioBtnNo.setEnabled(true);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Проанализируйте относительные оценки     .",54, 80);
        g.setColor(Color.red);
        Ind_nk(g,"\u2206","  j",354,80);
        g.setColor(new Color(0, 0, 40)); g.setFont(new java.awt.Font("Dialog", 3, 14));
        if(k!=1){
          g.drawString("Текущее базисное решение не оптимально.",50,105);
          if((k==2 || k==0) && r==0){
            if (jRadioBtnNo.isSelected() == true) {
              if (AddMist == 0) {
                Mist_under[5]++;
                AddMist = 1;
              }
              g.setColor(Color.red);
              StringerD.drawString("Неправильно", 445, 111);
            }
            if (jRadioBtnYes.isSelected() == true) {
              if(AddMist==0) AddMist = 1;
              g.setColor(Color.blue);
              StringerD.drawString("Правильно", 445, 111);
              jRadioBtnNo.setEnabled(false);
              jButton1.setEnabled(true);
            }
            else jButton1.setEnabled(false);

          }
          else{
            if (jRadioBtnYes.isSelected() == true) {
              if (AddMist == 0) {
                Mist_under[5]++;
                AddMist = 1;
              }
              g.setColor(Color.red);
              StringerD.drawString("Неправильно", 445, 111);
            }
            if (jRadioBtnNo.isSelected() == true) {
              if(AddMist==0) AddMist = 1;
              g.setColor(Color.blue);
              StringerD.drawString("Правильно", 445, 111);
              jRadioBtnYes.setEnabled(false);
              jButton1.setEnabled(true);
            }
            else jButton1.setEnabled(false);
          }
        }
        else{
          g.drawString("Текущее базисное решение оптимально.",75,105);
          if(k==1 && r==2){
            if (jRadioBtnNo.isSelected() == true) {
              if (AddMist == 0) {
                Mist_under[5]++;
                if(AddMist==0) AddMist = 1;
                g.setColor(Color.red);
                StringerD.drawString("Неправильно", 445, 111);
              }
              g.setColor(Color.red);
            }
            if (jRadioBtnYes.isSelected() == true) {
              if(AddMist==0) AddMist = 1;
              g.setColor(Color.blue);
              StringerD.drawString("Правильно", 445, 111);
              jRadioBtnNo.setEnabled(false);
              jButton1.setEnabled(true);
            }
            else jButton1.setEnabled(false);

          }
          else{
            if (jRadioBtnYes.isSelected() == true) {
              if (AddMist == 0) {
                Mist_under[5]++;
                AddMist = 1;
                g.setColor(Color.red);
                StringerD.drawString("Неправильно", 445, 111);
              }
              g.setColor(Color.red);
            }
            if (jRadioBtnNo.isSelected() == true) {
              if(AddMist==0) AddMist = 1;
              g.setColor(Color.blue);
              StringerD.drawString("Правильно", 445, 111);
              jRadioBtnYes.setEnabled(false);
              jButton1.setEnabled(true);
            }
            else jButton1.setEnabled(false);
          }
        }
      }
      if(((stepSM==1) || (stepSM==2)) && (stepVG==1) && ((sh-2)%5==3)){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString(k+"."+(r+1)+".2.1.",10, 80);
        g.setColor(new Color(0, 0, 40)); g.setFont(new java.awt.Font("Dialog", 3, 14));
        g.drawString("Вводим в базис переменную     .",65, 80);
        if(jRadioBtnNo.isSelected()==false) g.setColor(Color.red);
        Ind_n(g,"x",""+(n+1+r),270,80);
        jRadioBtnYes.setBounds(new Rectangle(309,65,60,20));
        jRadioBtnNo.setBounds(new Rectangle(309,85,60,20));
        jRadioBtnYes.setVisible(true); jRadioBtnYes.setEnabled(true);
        jRadioBtnNo.setVisible(true); jRadioBtnNo.setEnabled(true);
        if(jRadioBtnYes.isSelected()==true){ if(AddMist==0){Mist_under[6]++; AddMist=1;} g.setColor(Color.red); StringerD.drawString("Неправильно",370,88);}
        if(jRadioBtnNo.isSelected()==true){
          if(AddMist==0) AddMist=1;
          g.setColor(Color.blue);
          StringerD.drawString("Правильно",370,88);
          jRadioBtnYes.setEnabled(false);
          g.setColor(new Color(0, 0, 80));
          Stringer.drawString("Курсором мыши укажите в таблице переменную, которая должна быть введена в",12, 120);
          Stringer.drawString("базис.",12, 140);
          jRadioButton.setVisible(true);
          jRadioButton.setEnabled(true);
          jButton1.setEnabled(false);
          if(otv==0){
            g.setColor(Color.red); if(AddMist==1){Mist_under[6]++; AddMist=2;}
            StringerD.drawString("Неправильно, так как оценка при данной переменной",110,145);
            StringerD.drawString("не является максимальной.",201,160);
          }
          else if(otv==1){
                 if(AddMist==1) AddMist=2;
                 g.setColor(Color.blue);
                 StringerD.drawString("Правильно",267,150);
                 jButton1.setEnabled(true);
               }
               else if(edt==true)
               {
                 g.setColor(Color.red);
                 StringerD.drawString("Не попали в выделенную область",180,150);
               }
        }
        else jButton1.setEnabled(false);
      }
      if(((stepSM==1) || (stepSM==2)) && (stepVG==1)  && ((sh-2)%5==4)){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString(k+"."+(r+1)+".2.2.",10, 80);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Определяем переменную, выводимую из базиса: для этого вычисляем",63, 80);
        Stringer.drawString("отношение БР/a_{ir}.",12, 100);
        jRadioBtnYes.setVisible(true); jRadioBtnYes.setEnabled(true);
        jRadioBtnNo.setVisible(true); jRadioBtnNo.setEnabled(true);
        g.setColor(new Color(0, 0, 40)); g.setFont(new java.awt.Font("Dialog", 3, 14));
        g.drawString("Из базиса должна быть выведена переменная     .",145, 100);
        jRadioBtnYes.setBounds(new Rectangle(515,85,60,20));
        jRadioBtnNo.setBounds(new Rectangle(515,105,60,20));
        g.setColor(Color.red);
        if(k==1 &&  r==0) Stringer.drawString("x_{"+bp[1]+"}",480,100);
        else Stringer.drawString("x_{"+bp[0]+"}",480,100);
        if(p==1){
          if(jRadioBtnNo.isSelected()==true){ if(AddMist==0){Mist_under[7]++; AddMist=1;} g.setColor(Color.red); StringerD.drawString("Неправильно",410,118);}
          if(jRadioBtnYes.isSelected()==true){
            if(AddMist==0) AddMist=1;
            g.setColor(Color.blue);
            StringerD.drawString("Правильно",420,118);
            jRadioBtnNo.setEnabled(false);
            jButton1.setEnabled(true);
          }
          else jButton1.setEnabled(false);
        }
        else if(p>1){
          if(jRadioBtnYes.isSelected()==true){ if(AddMist==0){Mist_under[7]++; AddMist=1;} g.setColor(Color.red); StringerD.drawString("Неправильно",410,118);}
          if(jRadioBtnNo.isSelected()==true){
            if(AddMist==0) AddMist=1;
            g.setColor(Color.blue);
            StringerD.drawString("Правильно",420,118);
            jRadioBtnYes.setEnabled(false);
            g.setColor(new Color(0, 0, 80));
            Stringer.drawString("Курсором мыши укажите переменную, которая должна быть выведена из базиса.",12, 137);
            jRadioButton.setVisible(true);
            jRadioButton.setEnabled(true);
            jButton1.setEnabled(false);
            if((otv==0)){
              g.setColor(Color.red);
              if(tbn[bpx+1][8]!=-20000){
                if(AddMist==1){Mist_under[7]++; AddMist=2;}
                StringerD.drawString("Неправильно, так как отношение БР/a_{ir} при переменной x_{"+bp[bpx]+"} не минимально.",33,158);
              }
              else{
                StringerD.drawString("Неправильно, т.к. коэффициент при переменной x_{"+bp[bpx]+"} в столбце соответствующему",15,150);
                StringerD.drawString("переменной x_{"+n+"}, вводимой в базис, не является положительным.",77,165);
                if(AddMist==1){Mist_under[7]++; AddMist=2;}
              }
            }
            else if(otv==1){
                   if(AddMist==1) AddMist=2;
                   g.setColor(Color.blue);
                   StringerD.drawString("Правильно",267,158);
                   jButton1.setEnabled(true);
                 }
                 else if(edt==true)
                   {
                     g.setColor(Color.red);
                     StringerD.drawString("Не попали в выделенную область",180,160);
                   }
          }
          else jButton1.setEnabled(false);
        }
      }
      if(((stepSM==2) && (stepVG==1)) && ((sh-2)%5==0)){
        otvet="";
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString(k+"."+(r+1)+".1.",10, 80);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Вычисляем новое базисное решение и заносим результаты пересчета в",54, 80);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("Таблицу "+(r+1)+".",12, 100);
        g.setColor(Color.red);
        g.drawString("Таблицу "+(r+1),12, 100);
        jCheckBox1.setText("Таблица "+r);
        jCheckBox1.setVisible(true);  jCheckBox1.setEnabled(true);
        g.setColor(new Color(0, 0, 40)); g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("Таблица пересчитана правильно.",91, 100);
        jRadioBtnYes.setBounds(new Rectangle(350,83,55,20));
        jRadioBtnNo.setBounds(new Rectangle(350,103,55,20));
        jRadioBtnYes.setVisible(true); jRadioBtnYes.setEnabled(true);
        jRadioBtnNo.setVisible(true); jRadioBtnNo.setEnabled(true);
        if((r==1 && k==0) || (k==1 && r==2)){
          if(jRadioBtnYes.isSelected()==true){ if(AddMist==0){Mist_calk[8]++; AddMist=1;} g.setColor(Color.red); StringerD.drawString("Неправильно",405,106);}
          if(jRadioBtnNo.isSelected()==true){
            if(AddMist==0) AddMist=1;
            g.setColor(Color.blue);
            StringerD.drawString("Правильно",405,106);
            jRadioBtnYes.setEnabled(false);
            g.setColor(new Color(0, 0, 80));
            Stringer.drawString("Укажите ячейку таблицы, которая заполнена неправильно.",45,136);
            g.setColor(Color.red);
            if(otv==1){
              if(entry==true || (Kx>=189+b && Kx<=248+b && Ky>=tup+d+(c+2)*17+2 && Ky<=tup+d+(c+2)*17+18 && r==1 && k==0)
                || (Kx>=369+b && Kx<=428+b && Ky>=tup+d+53 && Ky<=tup+d+69 && k==1 && r==2)){
                g.setColor(Color.blue); entry=true; AddMist=2;
                StringerD.drawString("Правильно",485,136);
                g.setColor(new Color(0, 0, 80));
                Stringer.drawString("Заполните ячейку таблицы.",150,156);
                if(edt==true){
                  if((Right==false) || (RightPust==false)){
                    g.setColor(Color.red);
                    StringerD.drawString("Неправильно",370,156);
                  }
                  else{
                    g.setColor(Color.blue);
                    StringerD.drawString("Правильно",370,156);
                  }
                }
              }
              else if(entry==false){
                g.setColor(Color.red); if(AddMist==1){Mist_calk[8]++; AddMist=2;}
                StringerD.drawString("Неправильно, данная ячейка таблицы заполнена верно",108,156);
              }
            }
            else if(otv==2)
            {
              g.setColor(Color.red);
              StringerD.drawString("Не попали в область",240,156);
            }
          }
        }
        else{
          jButton1.setEnabled(false);
          if(jRadioBtnNo.isSelected()==true){ if(AddMist==0){Mist_calk[8]++; AddMist=1;} g.setColor(Color.red); StringerD.drawString("Неправильно",405,106);}
          if(jRadioBtnYes.isSelected()==true){
            if(AddMist==0) AddMist=1;
            g.setColor(Color.blue);
            StringerD.drawString("Правильно",405,106);
            jRadioBtnNo.setEnabled(false);
            jButton1.setEnabled(true);
          }
        }
      }
      if(((stepSM==3) && (stepVG==1)) && ((sh-2)%5==3)){
        otvet=""; ModifyFanc(tn,td,Xn,Xd,sf);
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString(k+"."+(r+1)+".3.",10, 80);
        g.setColor(new Color(0, 0, 40)); g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("Оптимальное решение задачи ЗЛП - "+k+" ",54, 80);
        if(k==2){
          otv0=3;
          g.drawString("нецелочисленное.", 332, 80);
          g.setColor(Color.red);
          g.drawString("нецелочисленное", 332, 80);
          jRadioBtnYes.setBounds(new Rectangle(480,65,60,20));
          jRadioBtnNo.setBounds(new Rectangle(480,85,60,20));
        }
        else{
          switch (Xn[k][0])
          {
            case 1:
              otv0=1;
              g.drawString("целочисленное.", 332, 80);
              g.setColor(Color.red);
              g.drawString("целочисленное", 332, 80);
              jRadioBtnYes.setBounds(new Rectangle(460,65,60,20));
              jRadioBtnNo.setBounds(new Rectangle(460,85,60,20));
              break;
            case 0:
              otv0=2;
              g.drawString("нецелочисленное.", 332, 80);
              g.setColor(Color.red);
              g.drawString("нецелочисленное", 332, 80);
              jRadioBtnYes.setBounds(new Rectangle(480,65,60,20));
              jRadioBtnNo.setBounds(new Rectangle(480,85,60,20));
              break;
            case -1:
              otv0=3;
              g.drawString("пустое множество.", 332, 80);
              g.setColor(Color.red);
              g.drawString("пустое множество", 332, 80);
              jRadioBtnYes.setBounds(new Rectangle(490,65,60,20));
              jRadioBtnNo.setBounds(new Rectangle(490,85,60,20));
              break;
            default:
              jPanel3.repaint();
          }
        }
        jRadioBtnYes.setVisible(true); jRadioBtnYes.setEnabled(true);
        jRadioBtnNo.setVisible(true); jRadioBtnNo.setEnabled(true);
        if((jRadioBtnNo.isSelected()==true && k<=1) || (jRadioBtnYes.isSelected()==true && k==2)){
          if(AddMist==0){Mist_knowledge[18]++; AddMist=1;}
          g.setColor(Color.red); StringerD.drawString("Неправильно",320+20*otv0,98);
        }
        if((jRadioBtnYes.isSelected()==true && k<=1) || (jRadioBtnNo.isSelected()==true && k==2)){
          if(AddMist==0) AddMist = 1;
          g.setColor(Color.blue);
          StringerD.drawString("Правильно", 335 + 20 * otv0, 98);
          if (jRadioBtnNo.isSelected()==true) jRadioBtnYes.setEnabled(false);
          if(jRadioBtnYes.isSelected()==true) jRadioBtnNo.setEnabled(false);
          jButton1.setEnabled(true);
          if (otv0 != 3) {
            g.setColor(new Color(0, 0, 80));
            Stringer.drawString("Значение целевой функции на оптимальном решении:", 120, 125);
            Stringer.drawString(sf[0] + fun + ".",380 - Fm.stringWidth(sf[0]) * 5 / 3, 150);
          }
          else{
            g.setColor(new Color(0, 0, 40)); g.setFont(new java.awt.Font("SansSerif", 3, 14));
            g.drawString("Оптимальное решение задачи ЗЛП - " + k + " является", 12, 120);
            jRadioButton1.setText("целочисленным");
            jRadioButton1.setBounds(new Rectangle(368, 105, 170, 20));
            jRadioButton2.setText("нецелочисленным");
            jRadioButton2.setBounds(new Rectangle(368, 125, 190, 20));
            jRadioButton3.setText("пустым множеством");
            jRadioButton3.setBounds(new Rectangle(368, 145, 198, 20));
            jRadioButton1.setVisible(true);
            jRadioButton1.setEnabled(true);
            jRadioButton2.setVisible(true);
            jRadioButton2.setEnabled(true);
            jRadioButton3.setVisible(true);
            jRadioButton3.setEnabled(true);
            jButton1.setEnabled(false);
            if (otv != -1) {
              if (otv == 3) {
                jRadioButton1.setEnabled(false);
                jRadioButton2.setEnabled(false);
                jButton1.setEnabled(true);
                edt = true;
                g.setColor(Color.blue);
                StringerD.drawString("Правильно", 280, 142);
                otv0 = otv;
                if(AddMist==1) AddMist = 2;
                jButton1.setEnabled(true);
              }
              else{
                g.setColor(Color.red);
                StringerD.drawString("Неправильно", 270, 142);
                if (AddMist == 1) {
                  Mist_knowledge[18]++;
                  if(AddMist==1) AddMist = 2;
                }
              }
            }
          }
        }
        else jButton1.setEnabled(false);
      }

      if(((stepSM==3) && (stepVG==1)) && ((sh-2)%5==4)){
        otvet="";
        jButton1.setEnabled(false);
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString(k+"."+(r+2)+".1.",10, 80);
        if((otv0==1) && (Nfn==k)){
          g.setColor(new Color(0, 0, 80));
          Stringer.drawString("Так как x^{"+k+"} - первое целочиcленное решение, то полагаем     = f(x^{"+k+"}) = "+fn+".",54, 80);
          g.setColor(Color.red); Ind_f(g,475,80);
          g.setColor(new Color(0, 0, 40)); g.setFont(new java.awt.Font("SansSerif", 3, 14));
          g.drawString("Номер задачи k = "+k+" включаем в множество J.",40, 100);
          jRadioBtnYes.setBounds(new Rectangle(380,85,60,20));
          jRadioBtnNo.setBounds(new Rectangle(380,105,60,20));
        }
        else{
          g.setColor(new Color(0, 0, 40)); g.setFont(new java.awt.Font("SansSerif", 3, 14));
          g.drawString("Номер задачи k = "+k+" включаем в множество J.",54, 80);
          jRadioBtnYes.setBounds(new Rectangle(385,65,60,20));
          jRadioBtnNo.setBounds(new Rectangle(385,85,60,20));
        }
        jRadioBtnYes.setVisible(true); jRadioBtnYes.setEnabled(true);
        jRadioBtnNo.setVisible(true); jRadioBtnNo.setEnabled(true);
        if(((otv0==1 || otv0==3) && jRadioBtnNo.isSelected()==true) || (otv0==2 && jRadioBtnYes.isSelected()==true)){
          if(jRadioBtnYes.isSelected()==true) jRadioBtnNo.setEnabled(false);
          if(jRadioBtnNo.isSelected()==true) jRadioBtnYes.setEnabled(false);
          if(AddMist==0) AddMist=1;
          g.setColor(Color.blue);
          StringerD.drawString("Правильно",267,130);
          for(int i=0; i<=6; i++)
            JPr[i]=J[i];
          jButton1.setEnabled(true);
        }
        else{
          g.setColor(Color.red);
          if(otv0==3 && jRadioBtnYes.isSelected()==true){
            StringerD.drawString("Неправильно, так как множество допустимых решений задачи ЗЛП - "+k+" пусто.",35,135);
            if(AddMist==0){Mist_knowledge[37]++; AddMist=1;}
          }
          if(otv0==2 && jRadioBtnNo.isSelected()==true){
            StringerD.drawString("Неправильно, так как решение задачи, ЗЛП - "+k+" нецелочисленное и",70,140);
            StringerD.drawString("значение     еще не найдено.",206,155);
            Ind_f(g,279,155);
            if(AddMist==0){Mist_knowledge[18]++; AddMist=1;}
          }
          if(otv0==1 && jRadioBtnYes.isSelected()==true){
            StringerD.drawString("Неправильно, так как ветвление задачи в которой получено",93,140);
            StringerD.drawString("целочисленное решение далее не производится.",128,155);
            if(AddMist==0){Mist_knowledge[18]++; AddMist=1;}
          }
        }
      }
      if(((stepSM==3) && (stepVG==1)) && ((sh-2)%5==0)){
        otvet=""; int vr=0;
        jButton1.setEnabled(false);
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString(k+"."+(r+2)+".2.",10, 80);
        g.setColor(new Color(0, 0, 40)); g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("Включаем решение      в множество     .",54, 80);
        g.drawString("X",316,80); Ind_v(g,"","*",329,78); Ind_v(g,"x",""+k,200,80);
        jRadioBtnYes.setBounds(new Rectangle(355,65,60,20));
        jRadioBtnNo.setBounds(new Rectangle(355,85,60,20));
        jRadioBtnYes.setVisible(true); jRadioBtnYes.setEnabled(true);
        jRadioBtnNo.setVisible(true); jRadioBtnNo.setEnabled(true);
        if((XVG[k]==0 && jRadioBtnNo.isSelected()==true) || (XVG[k]==1 && jRadioBtnYes.isSelected()==true)){
          if(jRadioBtnYes.isSelected()==true) jRadioBtnNo.setEnabled(false);
          if(jRadioBtnNo.isSelected()==true) jRadioBtnYes.setEnabled(false);
          g.setColor(Color.blue);
          StringerD.drawString("Правильно",267,130);
          if(AddMist==0) AddMist=1;
          for(int i=0; i<=6; i++)
            XPr[i]=XVG[i];
          jButton1.setEnabled(true);
        }
        else{
          g.setColor(Color.red);
          if(otv0!=1 && jRadioBtnYes.isSelected()==true){
            StringerD.drawString("Неправильно, так как решение задачи ЗЛП - "+k+" не является целочисленным.",37,130);
            if(AddMist==0){Mist_knowledge[29]++; AddMist=1;}
          }
          if(otv0==1 && jRadioBtnYes.isSelected()==true){
            StringerD.drawString("Неправильно, так как f(x^{"+k+"}) < /{f}{} .",202,130);
            if(AddMist==0){Mist_knowledge[29]++; AddMist=1;}
          }
          if(otv0==1 && jRadioBtnNo.isSelected()==true){
            int Z=0;
            for(int i=0; i<k; i++)
              if(XVG[i]==1) Z++;
            if(Z>0){
              StringerD.drawString("Неправильно, так как решение задачи ЗЛП - "+k+" целочисленное и",80,130);
              StringerD.drawString("значение функции f(x^{"+k+"}) \u2265 /{f}{}!",211,145);
              if(AddMist==0){Mist_knowledge[29]++; AddMist=1;}
            }
            else{
              StringerD.drawString("Неправильно, так как решение задачи ЗЛП - "+k+" - первое целочисленное решение!",17,130);
              if(AddMist==0){Mist_knowledge[29]++; AddMist=1;}
            }
          }
        }
      }
      if(((stepSM==3) && (stepVG==1)) && ((sh-2)%5==1)){
        otvet=""; ModifyFanc(tn,td,Xn,Xd,sf);
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString(k+"."+(r+2)+".3.",10, 80);
        g.setColor(new Color(0, 0, 40));
        Ind_n(g,"x","1",432,80); g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("Для ветвления задачи ЗЛП - "+k+"  выберем координату    .",54, 80);
        jRadioBtnYes.setBounds(new Rectangle(460,65,55,20));
        jRadioBtnNo.setBounds(new Rectangle(460,85,55,20));
        jRadioBtnYes.setVisible(true); jRadioBtnYes.setEnabled(true);
        jRadioBtnNo.setVisible(true); jRadioBtnNo.setEnabled(true);
        if(edt==false)
          jButton1.setEnabled(false);
        if((jRadioBtnYes.isSelected()==true && (Xd[k][1]!=1)) || (jRadioBtnNo.isSelected()==true && (Xd[k][2]!=1))){
          if(AddMist==0) AddMist=1;
          g.setColor(Color.blue);
          StringerD.drawString("Правильно",515,88);
          g.setColor(new Color(0, 0, 80));
          Stringer.drawString("Формируем дополнительные ограничения:",20, 115);
          Stringer.drawString("для ЗЛП - 1  x_{1} \u2264 "+(int)(Xn[k][1]/Xd[k][1])+"     и     для ЗЛП - 2  x_{1} \u2265 "+(int)((Xn[k][1]/Xd[k][1])+1)+".",160, 140);
          jButton1.setEnabled(true);
        }
        else if(jRadioBtnYes.isSelected()==true || jRadioBtnNo.isSelected()==true){
          if(AddMist==0) Mist_knowledge[18]++; AddMist=1;
          g.setColor(Color.red);
          StringerD.drawString("Неправильно, так как координата должна быть нецелочисленной.",72,135);
        }
      }
      if(((stepSM==3) && (stepVG==1)) && ((sh-2)%5==2)){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString(k+"."+(r+2)+".3.1.",10, 80);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Сформируем две задачи ЗЛП - 2   +  ,     = 0;    = 1, 2.",66, 80);
        g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("k",339, 80); g.drawString("i",383, 80);
        g.setColor(Color.red); g.drawString("k",301, 80); g.drawString("i",324, 80);
        Stringer.drawString("Сформируем две задачи ЗЛП - 2   +",66, 80);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Сформируем две задачи",66, 80);
      }
      if(stepVG==5){
        int ind1=-1, ind2=-1;
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("3.",10, 80);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Проверяем выполнение условия    \u2264 2:    = 2. Множество     =    , тогда решением",25, 80);
        if((sx1.equals("")==false) && (sx2.equals("")==false))
          Stringer.drawString("исходной задачи будет: "+sx1+"  и  "+sx2+".",13, 100);
        else
          Stringer.drawString("исходной задачи будет: "+sx1+sx2+".",13, 100);
        ind1=sx1.indexOf(", "); ind2=sx2.indexOf(", ");
        if((ind2!=-1) && (ind1!=-1)){
          g.setColor(Color.red); Stringer.drawString(sx1+"  и  "+sx2,187, 100);
          g.setColor(new Color(0, 0, 80)); Stringer.drawString(sx1+"  и  "+sx2.substring(0,ind2+1),187, 100);
          g.setColor(Color.red); Stringer.drawString(sx1+"  и  "+sx2.substring(0,ind2),187, 100);
          g.setColor(new Color(0, 0, 80)); Stringer.drawString(sx1+"  и  ",187, 100);
        }
        if(ind1!=-1){
          g.setColor(Color.red); Stringer.drawString(sx1,187, 100);
          g.setColor(new Color(0, 0, 80)); Stringer.drawString(sx1.substring(0,ind1+1),187, 100);
          g.setColor(Color.red); Stringer.drawString(sx1.substring(0,ind1),187, 100);
        }
        g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("i",272, 80); g.drawString("i",312, 80);
        g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("J",435, 80); g.drawString("O",460, 80);
        g.drawLine(459,78,473,68); g.drawLine(459,79,473,69);
        jCheckBoxRezult.setVisible(true);  jCheckBoxRezult.setEnabled(true);
        g.setColor(Color.black);
        g.drawLine(230,128,390,128); g.drawLine(230,129,390,129);
        jButton3.setEnabled(false); jButton1.setEnabled(false);
      }

      JS="= ";
      if(sh>=1){
        g.setColor(new Color(0, 0, 80));
        g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("J",16, 35);
        g.setFont(new java.awt.Font("SansSerif", 1, 16));
        for(int i=0; i<=6; i++)
          if(JPr[i]!=0){
            if(JNull==true) JS=JS+"{ "+i;
            else JS=JS+", "+i;
            JNull=false;
          }
        if(JNull==false){
          JS=JS+" }";
          if(((stepSM==3) && (stepVG==1)) && ((sh-2)%5==4))
          g.setColor(Color.red);
          else g.setColor(new Color(0, 0, 80));
          g.setFont(new java.awt.Font("SansSerif", 3, 16));
          g.drawString("J",16, 35);
          g.setFont(new java.awt.Font("SansSerif", 1, 16));
          g.drawString(JS,28, 35);
        }
        else{
          g.setFont(new java.awt.Font("SansSerif", 3, 16));
          g.drawString("= O",28, 35);
          g.drawLine(40,33,54,23);
          g.drawLine(40,34,54,24);
        }
      }
      XS=""; String XSS[]={"", "", ""}; int inds1=-1, inds2=-1;
      for(int i=1; i<=2; i++)
        XSS[i]="";
      if(sh>=1){
        g.setColor(new Color(0, 0, 80)); boolean ff=false;
        for(int i=1; i<=k; i++)
          if(XPr[i]!=0){
            if(XNull==false) XS=XS+"; ";
            XS=XS+"x^{"+i+"}=(";
            XSS[i]="x^{"+i+"}=(";
              for(int j=1; j<=an; j++){
                if((Xd[i][j]==1) || (Xn[i][j]==0)){
                  XS=XS+""+Xn[i][j];
                  XSS[i]=XSS[i]+""+Xn[i][j];
                }
                else{
                  XS=XS+Xn[i][j]+"/"+Xd[i][j];
                  XSS[i]=XSS[i]+Xn[i][j]+"/"+Xd[i][j];
                }
                if(j!=an){
                  XS=XS+"; ";
                  XSS[i]=XSS[i]+"; ";
                }
                else{
                  XS=XS+"),  ";
                  XSS[i]=XSS[i]+"),  ";
                }
              }
              ModifyF(an,c,tbn,Xn,Xd,i);
              if(((double)fnk/fdk==(double)fn/fd) && (ff==false)){
                XS=XS+"/{f}{} =f(x^{"+i+"})="+fn;
                XSS[i]=XSS[i]+"/{f}{} =f(x^{"+i+"})="+fn;
                ff=true;
              }
              else if(ff==true){
                     XS=XS+"f(x^{"+i+"})="+fnk+" ";
                     XSS[i]=XSS[i]+"f(x^{"+i+"})="+fnk+" ";
                   }
            XNull=false;
          }
        if(XNull==false){
          g.setColor(new Color(0, 0, 80));
          Stringer.drawString(XS,318, 35);
          g.drawString("}",Fm.stringWidth(XS)*4/3+308, 35);
          if(XSS[1].equals("")==false)
            inds1=XS.indexOf(XSS[1]);
          if(XSS[2].equals("")==false)
            inds2=XS.indexOf(XSS[2]);
          if((((stepSM==3) && (stepVG==1)) && ((sh-2)%5==0))){
            g.setColor(Color.red);
            if((k==1) && (inds1!=-1))
              Stringer.drawString(XS,318,35);
            if((k==2) && (inds2!=-1)){
              Stringer.drawString(XS,318,35);
              if(inds1!=-1){
                g.setColor(new Color(0, 0, 80));
                Stringer.drawString(XS.substring(0,inds2),318,35);
              }
            }
          }
          if(stepVG==5){
            g.setColor(Color.red);
            if(otvn==1)
              Stringer.drawString(XS,318,35);
            if(otvn==2){
              Stringer.drawString(XS,318,35);
              g.setColor(new Color(0, 0, 80));
              Stringer.drawString(XS.substring(0,inds2),318,35);
            }
            if(otvn==3){
              Stringer.drawString(XS,318,35);
              g.setColor(new Color(0, 0, 80));
              Stringer.drawString(XS.substring(0,inds2),318,35);
              g.setColor(Color.red);
              Stringer.drawString(XS.substring(0,inds2-2),318,35);
            }
          }
          g.setColor(new Color(0, 0, 80));
          g.setFont(new java.awt.Font("SansSerif", 3, 16));
          g.drawString("X =",283, 35);
          g.setFont(new java.awt.Font("SansSerif", 1, 16));
          Ind_v(g,"","*",296,33);
          g.drawString("= {",301, 35);
        }
        else{
          g.setColor(new Color(0, 0, 80));
          g.setFont(new java.awt.Font("SansSerif", 3, 16));
          g.drawString("X = O",283, 35);
          g.setFont(new java.awt.Font("SansSerif", 1, 16));
          Ind_v(g,"","*",296,33);
          g.drawLine(310,33,324,23);
          g.drawLine(310,34,324,24);
        }
      }
      if(sh==200) jButton1.setEnabled(false);
/*      g.setColor(new Color(180, 0, 80));
      g.setFont(new java.awt.Font("SansSerif", 3, 13));
      int kolmist_calk=0, kolmist_under=0, kolmist_knowledge=0, kolmist_use=0;
      for(int i=0; i<40; i++){
        kolmist_calk=kolmist_calk+Mist_calk[i];
        kolmist_under=kolmist_under+Mist_under[i];
        kolmist_knowledge=kolmist_knowledge+Mist_knowledge[i];
        kolmist_use=kolmist_use+Mist_use[i];
      }
      g.drawString("kolmist_calk="+kolmist_calk+", kolmist_under="+kolmist_under+", kolmist_knowledge="+kolmist_knowledge+", kolmist_use="+kolmist_use,100,55);*/

    }
  }

  void jButton1_actionPerformed(ActionEvent e) {
    SetParam();
    if(stepVG!=-1){
      if(((stepSM==3) && (stepVG==1)) && ((sh-2)%5==4) && (otv0==3))
        sh++;
      if((stepVG==4) && ((sh-2)%5==3)){
         stepVG=1; stepSM=1; sh=1;
      }
      if(stepVG==2){
        stepSM=1; stepVG=1; sh=1;
      }
      if(((stepSM==3) && (stepVG==1)) && ((sh-2)%5==0))
        if(k==1) stepVG=2;
        else if(k==2) stepVG=5;
      if(((stepSM==3) && (stepVG==1)) && ((sh-2)%5==2))
        stepVG=2;
      sh++; otv=-1; bpx=-1;
      if((sh-2)%5==0){
        if(shag==true){
          stepSM=2; shag=false;
        }
        if(stepSM==2) r++;
      }
    }
    else sh=201;
    if (sh>200) sh=200;
    edt=false; Right=true; RightPust=true; Ch=false; entry=false; AddRAnswer=false; pp=0; AddMist=0;
    if(((stepSM==2) && (stepVG==1)) && ((sh-2)%5==0)){
      for(int i=0; i<=4; i++)
        for(int j=0; j<=8; j++){
          tbn0[i][j]=tbn[i][j];
          tbd0[i][j]=tbd[i][j];
       }
      for(int i=0; i<=2; i++){
        bp0[i]=bp[i];
      }
      a0=a; c0=c;
    }
    if(((stepSM==3) && (stepVG==1)) && ((sh-2)%5==1))
      for(int i=0; i<=6; i++)
        JPr[i]=0;
    if((((stepSM==1) || (stepSM==2)) && (stepVG==1)) && ((sh-3)%5==2))
      if(n==-1) stepSM=3;
    otv=-1; Kx=0; Ky=0;
    jPanel2.repaint();
    jPanel1.repaint();
    jPanel3.repaint();
  }

  void jButton2_actionPerformed(ActionEvent e) {
    sh=1; stepSM=0; stepVG=0; edt=false; otv=-1; bpx=-1; entry=false;
    Right=true; RightPust=true; shag=false; AddMist=0;
    SetParam();
    jButton1.setEnabled(true);
    jPanel2.repaint();
    jPanel1.repaint();
    jPanel3.repaint();
  }

  void jButton3_actionPerformed(ActionEvent e) {
    Right=true; RightPust=true; edt=true; ots=""; int index=-1; double Number=20000; String txt="";
    if((jTextField5.isEnabled()==true) && (jTextField5.getText().equals("")!=true)){
      txt=jTextField5.getText();
      if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
        index=txt.indexOf("/");
        try{
          if(index==-1) Number=Double.parseDouble(txt);
          else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
          if((double)tbn[2][5]/tbd[2][5]==Number){
            jTextField5.setText(""); jTextField5.setVisible(false); jTextField5.setEnabled(false);
          }
          else{ Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField5.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField5.setForeground(Color.red);
        }
      }
      else{ Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField5.setForeground(Color.red);}
    }
    else if((jTextField5.isEnabled()==true) && (jTextField5.getText().equals("")==true)) RightPust=false;
    if((jTextField9.isEnabled()==true) && (jTextField9.getText().equals("")!=true)){
      txt=jTextField9.getText();
      if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
        index=txt.indexOf("/");
        try{
          if(index==-1) Number=Double.parseDouble(txt);
          else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
          if((double)tbn[2][4]/tbd[2][4]==Number){
            jTextField9.setText(""); jTextField9.setVisible(false); jTextField9.setEnabled(false);
          }
          else{ Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField9.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField9.setForeground(Color.red);
        }
      }
      else{ Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField9.setForeground(Color.red);}
    }
    else if((jTextField9.isEnabled()==true) && (jTextField9.getText().equals("")==true)) RightPust=false;
    if((jTextField13.isEnabled()==true) && (jTextField13.getText().equals("")!=true)){
      txt=jTextField13.getText();
      if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
        index=txt.indexOf("/");
        try{
          if(index==-1) Number=Double.parseDouble(txt);
          else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
          if((double)tbn[3][5]/tbd[3][5]==Number){
            jTextField13.setText(""); jTextField13.setVisible(false); jTextField13.setEnabled(false);
          }
          else{ Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField13.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField13.setForeground(Color.red);
        }
      }
      else{ Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField13.setForeground(Color.red);}
    }
    else if((jTextField13.isEnabled()==true) && (jTextField13.getText().equals("")==true)) RightPust=false;
    if((jTextField16.isEnabled()==true) && (jTextField16.getText().equals("")!=true)){
      if((((int)Math.round(tbn[4][2]/1000.0))>-1) && (((int)Math.round(tbn[4][2]/1000.0))<1)){
        txt=jTextField16.getText();
        if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
          index=txt.indexOf("/");
          try{
            if(index==-1) Number=Double.parseDouble(txt);
            else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
            if((double)tbn[4][2]/tbd[4][2]==Number){
              jTextField16.setText(""); jTextField16.setVisible(false); jTextField16.setEnabled(false);
            }
            else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{2}";
                  if(stepSM==1) Mist_calk[3]++; else Mist_calk[10]++; jTextField16.setForeground(Color.red);}
          }
          catch(Exception ee){
            Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{2}";
            if(stepSM==1) Mist_calk[3]++; else Mist_calk[10]++; jTextField16.setForeground(Color.red);
          }
        }
        else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{2}";
              if(stepSM==1) Mist_calk[3]++; else Mist_calk[10]++; jTextField16.setForeground(Color.red);}
      }
      else if(jTextField16.getText().equals(Delta[2])==true){
             jTextField16.setText(""); jTextField16.setVisible(false); jTextField16.setEnabled(false);
           }
           else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{2}";
                  if(stepSM==1) Mist_calk[3]++; else Mist_calk[10]++; jTextField16.setForeground(Color.red);}
    }
    else if((jTextField16.isEnabled()==true) && (jTextField16.getText().equals("")==true)) RightPust=false;
    if((jTextField23.isEnabled()==true) && (jTextField23.getText().equals("")!=true)){
      try{
        if((int)(Xn[k][1]/Xd[k][1])==(int)(Double.parseDouble(jTextField23.getText()))){
          jTextField23.setEnabled(false);
        }
        else{ Right=false; Mist_calk[20]++; jTextField23.setForeground(Color.red);}
      }
      catch(Exception ee){
        Right=false; Mist_calk[20]++; jTextField23.setForeground(Color.red);
      }
    }
    else if((jTextField23.isEnabled()==true) && (jTextField23.getText().equals("")==true)) RightPust=false;
    if((jTextField24.isEnabled()==true) && (jTextField24.getText().equals("")!=true)){
      try{
        if((int)(Xn[k][1]/Xd[k][1])+1==(int)(Double.parseDouble(jTextField24.getText()))){
          jTextField24.setEnabled(false);
        }
        else{ Right=false; Mist_calk[20]++; jTextField24.setForeground(Color.red);}
      }
      catch(Exception ee){
        Right=false; Mist_calk[20]++; jTextField24.setForeground(Color.red);
      }
    }
    else if((jTextField24.isEnabled()==true) && (jTextField24.getText().equals("")==true)) RightPust=false;
    if((Right==true) && (RightPust==true)){
      jButton3.setEnabled(false);
      jButton1.setEnabled(true);
    }
    jPanel1.repaint();
    jPanel2.repaint();
    jPanel3.repaint();
  }

  void this_mouseMoved(MouseEvent e) {
    int a,aa;
    xx=e.getX();
    yy=e.getY();
    a=e.getX();
    aa=e.getY();
    if((xx>=5)&&(xx<=621)) a=xx-5;
    if((yy>=18)&&(yy<=191)) aa=yy-18;
    if((yy>=192)&&(yy<=346)) aa=yy-192;
    if((yy>=373)&&(yy<=544)) aa=yy-373;
 //   jLabel2.setText("x="+Integer.toString(a)+"   y="+Integer.toString(aa));
  }

  void jRadioButton1_itemStateChanged(ItemEvent e) {
    if((((stepSM==1) || (stepSM==2)) && (stepVG==1)) && ((sh-2)%5==2))
      if(n==-1) Right=false;
    otv=1; entry=false;
    jPanel3.repaint();
    if(((stepSM==3) && (stepVG==1)) && ((sh-2)%5==1))
      jPanel2.repaint();
  }

  void jRadioButton2_itemStateChanged(ItemEvent e) {
    if((((stepSM==1) || (stepSM==2)) && (stepVG==1)) && ((sh-2)%5==2))
      if(n>0) Right=false;
    otv=2; entry=false;
    if(((stepSM==3) && (stepVG==1)) && ((sh-2)%5==1))
      jPanel2.repaint();
    jPanel3.repaint();
  }

  void jRadioButton3_itemStateChanged(ItemEvent e) {
    otv=3; entry=false;
    jPanel3.repaint();
  }

  void jPanel1_mouseClicked(MouseEvent e){
    if((stepSM==1 || stepSM==2) && stepVG==1 && (sh-2)%5==0 && jRadioBtnNo.isSelected()==true && entry==false){
      otv=2;
     // edt=true;
      jPanel3.repaint();
    }
    if((stepSM==1 || stepSM==2) && stepVG==1  && ((sh-2)%5==3 || (sh-2)%5==4) && jRadioBtnNo.isSelected()==true){
      edt=true;
      if(otv!=1) otv=-1;
      jPanel3.repaint();
    }
  }

  void jPanel2_mouseClicked(MouseEvent e){
    if((stepSM==1 || stepSM==2) && stepVG==1 && (sh-2)%5==0 && jRadioBtnNo.isSelected()==true){
      if(entry==false)
      {
        Kx=e.getX(); Ky=e.getY();
        if(Kx>=8+b && Kx<=607-b && Ky>=tup+d+1 && Ky<=tup+d+17*(3+c)){
          otv=1; AddMist=1;
          jPanel2.repaint();
        }
        else
          otv=2;
          jPanel2.repaint();
          jPanel3.repaint();
      }
    }
    if((stepSM==1 || stepSM==2) && stepVG==1  && ((sh-2)%5==3 || (sh-2)%5==4) && jRadioBtnNo.isSelected()==true){
        edt=true; entry=false;
        Kx=e.getX(); Ky=e.getY();
        jPanel2.repaint();
        AddMist=1;
       // jPanel3.repaint();
    }
    if(stepVG==5 && e.getX()>=511 && e.getX()<=526 && e.getY()>=3 && e.getY()<=18){
      jCheckBoxRezult.setSelected(false);
      Ch=false;
      jPanel2.repaint();
    }
  }

  void jPanel3_mouseClicked(MouseEvent e){
    if((stepSM==1 || stepSM==2) && stepVG==1 && (sh-2)%5==0 && jRadioBtnNo.isSelected()==true && entry==false){
      otv=2;
     // edt=true;
      jPanel3.repaint();
    }
    if((stepSM==1 || stepSM==2) && stepVG==1  && ((sh-2)%5==3 || (sh-2)%5==4) && jRadioBtnNo.isSelected()==true){
      edt=true;
      if(otv!=1) otv=-1;
      jPanel3.repaint();
    }
  }

  void jRadioBtnYes_itemStateChanged(ItemEvent e) {
    jPanel3.repaint();
  }

  void jRadioBtnNo_itemStateChanged(ItemEvent e) {
    if((stepSM==1 || stepSM==2) && stepVG==1  && ((sh-2)%5==3 || (sh-2)%5==4))
    jPanel2.repaint();
    jPanel3.repaint();
  }

  void jCheckBox1_stateChanged(ChangeEvent e) {
    if(jCheckBox1.isSelected()==true) Ch=true;
    else Ch=false;
    jPanel1.repaint();
    jCheckBox1.setOpaque(true);
  }
  void jCheckBoxRezult_stateChanged(ChangeEvent e) {
    if(jCheckBoxRezult.isSelected()==true && stepVG==5) Ch=true;
    else Ch=false;
    jPanel2.repaint();
    jCheckBoxRezult.setOpaque(true);
  }

  void jTextField5_inputMethodTextChanged(InputMethodEvent e) {
    jTextField5.setForeground(new Color(0, 0, 120));
  }
  void jTextField9_inputMethodTextChanged(InputMethodEvent e) {
    jTextField9.setForeground(new Color(0, 0, 120));
  }
  void jTextField13_inputMethodTextChanged(InputMethodEvent e) {
    jTextField13.setForeground(new Color(0, 0, 120));
  }
  void jTextField16_inputMethodTextChanged(InputMethodEvent e) {
    jTextField16.setForeground(new Color(0, 0, 120));
  }
  void jTextField23_inputMethodTextChanged(InputMethodEvent e) {
    jTextField23.setForeground(new Color(0, 0, 120));
  }
  void jTextField24_inputMethodTextChanged(InputMethodEvent e) {
    jTextField24.setForeground(new Color(0, 0, 120));
  }
}
