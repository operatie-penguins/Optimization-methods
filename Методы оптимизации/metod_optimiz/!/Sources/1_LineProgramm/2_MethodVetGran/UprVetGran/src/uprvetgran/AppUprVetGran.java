package uprvetgran;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.border.*;
import java.beans.*;
import javax.swing.event.*;

public class AppUprVetGran extends JApplet {
  MyPaint1 jPanel1 = new MyPaint1();
  MyPaint2 jPanel2 = new MyPaint2();
  MyPaint3 jPanel3 = new MyPaint3();
  JButton jButton1 = new JButton();
  JButton jButton2 = new JButton();
  JButton jButton3 = new JButton();
  JLabel jLabel1 = new JLabel();
  JTextField jTextField1 = new JTextField(6);
  JTextField jTextField2 = new JTextField(6);
  JTextField jTextField3 = new JTextField(6);
  JTextField jTextField4 = new JTextField(6);
  JTextField jTextField5 = new JTextField(6);
  JTextField jTextField6 = new JTextField(6);
  JTextField jTextField7 = new JTextField(6);
  JTextField jTextField8 = new JTextField(6);
  JTextField jTextField9 = new JTextField(6);
  JTextField jTextField10 = new JTextField(6);
  JTextField jTextField11 = new JTextField(6);
  JTextField jTextField12 = new JTextField(6);
  JTextField jTextField13 = new JTextField(6);
  JTextField jTextField14 = new JTextField(6);
  JTextField jTextField15 = new JTextField(7);
  JTextField jTextField16 = new JTextField(7);
  JTextField jTextField17 = new JTextField(7);
  JTextField jTextField18 = new JTextField(7);
  JTextField jTextField19 = new JTextField(7);
  JTextField jTextField20 = new JTextField(7);
  JTextField jTextField21 = new JTextField(7);
  JTextField jTextField22 = new JTextField(6);
  JTextField jTextField23 = new JTextField(5);
  JTextField jTextField24 = new JTextField(5);
  JRadioButton jRadioButton = new JRadioButton();
  JRadioButton jRadioButton1 = new JRadioButton();
  JRadioButton jRadioButton2 = new JRadioButton();
  JRadioButton jRadioButton3 = new JRadioButton();
  ButtonGroup buttonGroup1 = new ButtonGroup();
  JCheckBox jCheckBox1 = new JCheckBox();
  JCheckBox jCheckBoxRezult = new JCheckBox();
  // JLabel jLabel2 = new JLabel();
  public int[] Mist_knowledge=new int [40];
  public int[] Mist_calk=new int [40];
  public int[] Mist_under=new int [40];
  public int[] Mist_use=new int [40];
  public boolean shag=false, Right=true, RightPust=true, edt=false, Ch=false, entry=false, AddRAnswer=false;
  public int sh=0, step=0, tup=18,  slog=2, stepSM=0, stepVG=0, r=0, fnk=0, fdk=1, fn=-20000, fd=1, Numx=0, NX=0, zd1=0, zd2=0, otv=-1, otv0=-1, Kx=0, Ky=0, bpx=-1, Nfn=-1, pp=0, vrt = (int)(Math.random()*12);
  public String ots="", sm[]={""}, sf[]={""}, fun="", ss="", jj="", sx1="", sx2="", s0, s1, s2, s3, s4, s[]= {"","","","","","","","","","","",""}, Delta[]={"","","","","","","",""}, Delta1[]={"","","","","","","",""};
  public int a=0, c=0, a0=0, c0=0, an=0, cn=0, b=(600-120-(a+1)*60)/2, d=(int)Math.round(17*(3-c)/2), nm[]={0}, n=0, p=0, k=0, ki=0, otvn=0, RightAnswer=0,
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
                      {1,1,1,1,1,1,1,1,1} },
             Variant[]={0,1,2,3,4,5,6,7,8,9,10,11,1};
/*  public String variant[]={"        Вариант 1", "        Вариант 2", "        Вариант 3", "        Вариант 4",
                           "        Вариант 5", "        Вариант 6", "        Вариант 7", "        Вариант 8",
                           "        Вариант 9", "        Вариант 10", "        Вариант 11", "        Вариант 12"};
  public String slognost[]={" *", " **", " ***"};
  Border border1;
  JComboBox jComboBox1 = new JComboBox(variant);
  JComboBox jComboBox2 = new JComboBox(slognost);*/
  static int xx,yy;

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
    this.setSize(new Dimension(627, 579));
    this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseMoved(MouseEvent e) {
        this_mouseMoved(e);
      }
    });
    this.getContentPane().setLayout(null);
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel1.setForeground(new Color(130, 0, 80));
    jLabel1.setText("Упражнение");
    jLabel1.setBounds(new Rectangle(254, 1, 99, 17));
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
  /*  jComboBox1.setBackground(new Color(250, 250, 252));
    jComboBox1.setFont(new java.awt.Font("SansSerif", 2, 13));
    jComboBox1.setForeground(new Color(0, 0, 120));
    border1 = BorderFactory.createEtchedBorder(new Color(247, 247, 255),new Color(157, 187, 255));
    jComboBox1.setBorder(border1);
    jComboBox1.setNextFocusableComponent(jButton1);
    jComboBox1.setMaximumRowCount(6);
    jComboBox1.setBounds(new Rectangle(186, 44, 147, 24));
    jComboBox1.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        jComboBox1_itemStateChanged(e);
      }
    });
    jComboBox2.setBackground(new Color(250, 250, 252));
    jComboBox2.setFont(new java.awt.Font("SansSerif", 2, 13));
    jComboBox2.setForeground(new Color(0, 0, 120));
    jComboBox2.setBorder(border1);
    jComboBox2.setNextFocusableComponent(jButton1);
    jComboBox2.setMaximumRowCount(3);
    jComboBox2.setBounds(new Rectangle(538, 44, 52, 24));
    jComboBox2.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        jComboBox2_itemStateChanged(e);
      }
    });*/
    jTextField1.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField1.setForeground(new Color(0, 0, 120));
    jTextField1.setText("");
    jTextField1.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField1.setVisible(false);
    jTextField1.setNextFocusableComponent(jTextField2);
    jTextField1.setDisabledTextColor(Color.blue);
    jTextField1.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField2.setVisible(false);
    jTextField2.setNextFocusableComponent(jTextField3);
    jTextField2.setDisabledTextColor(Color.blue);
    jTextField2.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField2.setText("");
    jTextField2.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField2.setForeground(new Color(0, 0, 120));
    jTextField2.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField3.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField3.setForeground(new Color(0, 0, 120));
    jTextField3.setText("");
    jTextField3.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField3.setVisible(false);
    jTextField3.setNextFocusableComponent(jTextField4);
    jTextField3.setDisabledTextColor(Color.blue);
    jTextField3.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField4.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField4.setForeground(new Color(0, 0, 120));
    jTextField4.setText("");
    jTextField4.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField4.setVisible(false);
    jTextField4.setNextFocusableComponent(jTextField5);
    jTextField4.setDisabledTextColor(Color.blue);
    jTextField4.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField5.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField5.setForeground(new Color(0, 0, 120));
    jTextField5.setText("");
    jTextField5.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField5.setVisible(false);
    jTextField5.setNextFocusableComponent(jTextField6);
    jTextField5.setDisabledTextColor(Color.blue);
    jTextField5.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField6.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField6.setForeground(new Color(0, 0, 120));
    jTextField6.setText("");
    jTextField6.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField6.setVisible(false);
    jTextField6.setNextFocusableComponent(jTextField7);
    jTextField6.setDisabledTextColor(Color.blue);
    jTextField6.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField7.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField7.setForeground(new Color(0, 0, 120));
    jTextField7.setText("");
    jTextField7.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField7.setVisible(false);
    jTextField7.setNextFocusableComponent(jTextField8);
    jTextField7.setDisabledTextColor(Color.blue);
    jTextField7.setBounds(new Rectangle(20, 528, 39, 17));
    jTextField8.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField8.setForeground(new Color(0, 0, 120));
    jTextField8.setText("");
    jTextField8.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField8.setVisible(false);
    jTextField8.setNextFocusableComponent(jTextField9);
    jTextField8.setDisabledTextColor(Color.blue);
    jTextField8.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField9.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField9.setForeground(new Color(0, 0, 120));
    jTextField9.setText("");
    jTextField9.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField9.setVisible(false);
    jTextField9.setNextFocusableComponent(jTextField10);
    jTextField9.setDisabledTextColor(Color.blue);
    jTextField9.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField10.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField10.setForeground(new Color(0, 0, 120));
    jTextField10.setText("");
    jTextField10.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField10.setVisible(false);
    jTextField10.setNextFocusableComponent(jTextField11);
    jTextField10.setDisabledTextColor(Color.blue);
    jTextField10.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField11.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField11.setForeground(new Color(0, 0, 120));
    jTextField11.setText("");
    jTextField11.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField11.setVisible(false);
    jTextField11.setNextFocusableComponent(jTextField12);
    jTextField11.setDisabledTextColor(Color.blue);
    jTextField11.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField12.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField12.setForeground(new Color(0, 0, 120));
    jTextField12.setText("");
    jTextField12.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField12.setVisible(false);
    jTextField12.setNextFocusableComponent(jTextField13);
    jTextField12.setDisabledTextColor(Color.blue);
    jTextField12.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField13.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField13.setForeground(new Color(0, 0, 120));
    jTextField13.setText("");
    jTextField13.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField13.setVisible(false);
    jTextField13.setNextFocusableComponent(jTextField14);
    jTextField13.setDisabledTextColor(Color.blue);
    jTextField13.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField14.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField14.setForeground(new Color(0, 0, 120));
    jTextField14.setText("");
    jTextField14.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField14.setVisible(false);
    jTextField14.setNextFocusableComponent(jTextField15);
    jTextField14.setDisabledTextColor(Color.blue);
    jTextField14.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField15.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField15.setForeground(new Color(0, 0, 120));
    jTextField15.setText("");
    jTextField15.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField15.setVisible(false);
    jTextField15.setNextFocusableComponent(jTextField16);
    jTextField15.setDisabledTextColor(Color.blue);
    jTextField15.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField16.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField16.setForeground(new Color(0, 0, 120));
    jTextField16.setText("");
    jTextField16.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField16.setVisible(false);
    jTextField16.setNextFocusableComponent(jTextField17);
    jTextField16.setDisabledTextColor(Color.blue);
    jTextField16.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField17.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField17.setForeground(new Color(0, 0, 120));
    jTextField17.setText("");
    jTextField17.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField17.setVisible(false);
    jTextField17.setNextFocusableComponent(jTextField18);
    jTextField17.setDisabledTextColor(Color.blue);
    jTextField17.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField18.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField18.setForeground(new Color(0, 0, 120));
    jTextField18.setText("");
    jTextField18.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField18.setVisible(false);
    jTextField18.setNextFocusableComponent(jTextField19);
    jTextField18.setDisabledTextColor(Color.blue);
    jTextField18.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField19.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField19.setForeground(new Color(0, 0, 120));
    jTextField19.setText("");
    jTextField19.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField19.setVisible(false);
    jTextField19.setNextFocusableComponent(jTextField20);
    jTextField19.setDisabledTextColor(Color.blue);
    jTextField19.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField20.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField20.setForeground(new Color(0, 0, 120));
    jTextField20.setText("");
    jTextField20.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField20.setVisible(false);
    jTextField20.setNextFocusableComponent(jTextField21);
    jTextField20.setDisabledTextColor(Color.blue);
    jTextField20.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField21.setVisible(false);
    jTextField21.setNextFocusableComponent(jTextField1);
    jTextField21.setDisabledTextColor(Color.blue);
    jTextField21.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField21.setText("");
    jTextField21.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField21.setForeground(new Color(0, 0, 120));
    jTextField21.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField22.setVisible(false);
    jTextField22.setDisabledTextColor(Color.blue);
    jTextField22.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField22.setText("");
    jTextField22.setForeground(new Color(0, 0, 120));
    jTextField22.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField23.setVisible(false);
    //jTextField23.setNextFocusableComponent(jTextField24);
    jTextField23.setDisabledTextColor(Color.blue);
    jTextField23.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField23.setText("");
    jTextField23.setForeground(new Color(0, 0, 120));
    jTextField23.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField24.setVisible(false);
  //  jTextField24.setNextFocusableComponent(jTextField23);
    jTextField24.setDisabledTextColor(Color.blue);
    jTextField24.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField24.setText("");
    jTextField24.setForeground(new Color(0, 0, 120));
    jTextField24.setFont(new java.awt.Font("SansSerif", 1, 14));
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
    jTextField3.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField3_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField4.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField4_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField5.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField5_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField6.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField6_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField7.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField7_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField8.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField8_inputMethodTextChanged(e);
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
    jTextField10.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField10_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField11.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField11_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField12.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField12_inputMethodTextChanged(e);
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
    jTextField14.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField14_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField15.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField15_inputMethodTextChanged(e);
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
    jTextField17.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField17_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField18.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField18_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField19.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField19_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField20.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField20_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField21.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField21_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField22.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField22_inputMethodTextChanged(e);
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
    jCheckBox1.setBackground(new Color(255, 255, 255));
    jCheckBox1.setFont(new java.awt.Font("SansSerif", 3, 13));
    jCheckBox1.setForeground(new Color(180, 0, 80));
    jCheckBox1.setText("Таблица");
    jCheckBox1.setVisible(false);
    jCheckBox1.setEnabled(false);
    jCheckBox1.setOpaque(false);
    jCheckBox1.setBounds(new Rectangle(500, 110, 90, 23));
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
    this.getContentPane().add(jPanel1, null);
    this.getContentPane().add(jPanel2, null);
    this.getContentPane().add(jPanel3, null);
    this.jPanel1.setLayout(null);
    this.jPanel2.setLayout(null);
    this.jPanel3.setLayout(null);
    this.jPanel1.add(jLabel1, null);
   // this.getContentPane().add(jLabel1, null);
 //   this.getContentPane().add(jLabel2, null);
 //   this.jPanel1.add(jComboBox1, null);
 //  this.jPanel1.add(jComboBox2, null);
    this.getContentPane().add(jButton1, null);
    this.getContentPane().add(jButton2, null);
    this.getContentPane().add(jButton3, null);
    this.jPanel2.add(jTextField1, null);
    this.jPanel2.add(jTextField2, null);
    this.jPanel2.add(jTextField3, null);
    this.jPanel2.add(jTextField4, null);
    this.jPanel2.add(jTextField5, null);
    this.jPanel2.add(jTextField7, null);
    this.jPanel2.add(jTextField8, null);
    this.jPanel2.add(jTextField6, null);
    this.jPanel2.add(jTextField9, null);
    this.jPanel2.add(jTextField10, null);
    this.jPanel2.add(jTextField11, null);
    this.jPanel2.add(jTextField12, null);
    this.jPanel2.add(jTextField13, null);
    this.jPanel2.add(jTextField14, null);
    this.jPanel2.add(jTextField15, null);
    this.jPanel2.add(jTextField16, null);
    this.jPanel2.add(jTextField17, null);
    this.jPanel2.add(jTextField18, null);
    this.jPanel2.add(jTextField19, null);
    this.jPanel2.add(jTextField20, null);
    this.jPanel2.add(jTextField21, null);
    this.jPanel3.add(jRadioButton, null);
    this.jPanel3.add(jRadioButton1, null);
    this.jPanel3.add(jRadioButton2, null);
    this.jPanel3.add(jRadioButton3, null);
    this.jPanel3.add(jTextField22, null);
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
    String jj="", jj1=""; int ii;
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
              if(kf==1){ jj="M+"+(tbn[4][j]-kf*1000); jj1=(tbn[4][j]-kf*1000)+"+M";}
              else if(kf==-1){ jj="-M+"+(tbn[4][j]-kf*1000); jj1=(tbn[4][j]-kf*1000)+"-M+";}
                   else if(kf>0) {jj=kf+"M+"+(tbn[4][j]-kf*1000); jj1=(tbn[4][j]-kf*1000)+"+"+kf+"M";}
                        else  {jj=kf+"M+"+(tbn[4][j]-kf*1000); jj1=(tbn[4][j]-kf*1000)+kf+"M";}
            }
            else if (tbn[4][j]-kf*1000<0){
                   if(kf==1){ jj="M-"+(kf*1000-tbn[4][j]); jj1="-"+(kf*1000-tbn[4][j])+"+M";}
                   else if(kf==-1){ jj="-M-"+(kf*1000-tbn[4][j]); jj1="-"+(kf*1000-tbn[4][j])+"-M";}
                        else if(kf>0) { jj=kf+"M-"+(kf*1000-tbn[4][j]); jj1="-"+(kf*1000-tbn[4][j])+"+"+kf+"M"; }
                             else { jj=kf+"M-"+(kf*1000-tbn[4][j]); jj1="-"+(kf*1000-tbn[4][j])+kf+"M"; }
                 }
                 else{
                   if(kf==1){ jj="M"; jj1="M";}
                   else if(kf==-1){ jj="-M"; jj1="-M";}
                        else {jj=kf+"M"; jj1=kf+"M";}
                 }
          }
          else{ jj=""+tbn[4][j]; jj1=""+tbn[4][j];}
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
          jj1=jj;
        }
        l=60-jj.length()*8;
        if(l<0){
          g.setFont(new java.awt.Font("SansSerif", 1, 13));
          l=(60-jj.length()*6);
        }
        ii=(int)(b+68+j*60+l/2);
        Delta[j]=jj; Delta1[j]=jj1;
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

  class MyPaint2 extends JPanel {
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
        Stringer.setGraphics(g);
        FontMetrics Fm=g.getFontMetrics();
        if((stepSM==0) && (stepVG==0)){
          a=0; c=0; fnk=0; fdk=1; Numx=0; fn=-20000; fd=1; step=0; r=0; sh=0;
          shag=false; Right=true; RightPust=true; edt=false; Ch=false;
          NX=0; zd1=0; zd2=0; otv=-1; Kx=0; Ky=0; bpx=-1; nm[0]=0; n=0; p=0; k=0; ki=0; otvn=0; pp=0;
          ots=""; sm[0]=""; ss=""; jj="";
          for(int i=0; i<12; i++)
            s[i]="";
          for(int i=0; i<7; i++){
            Delta[i] = "";
            Delta1[i] = "";
          }
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
        jTextField1.setText(""); jTextField2.setText(""); jTextField3.setText("");
        jTextField4.setText(""); jTextField5.setText(""); jTextField6.setText("");
        jTextField7.setText(""); jTextField8.setText(""); jTextField9.setText("");
        jTextField10.setText(""); jTextField11.setText(""); jTextField12.setText("");
        jTextField13.setText(""); jTextField14.setText(""); jTextField15.setText("");
        jTextField16.setText(""); jTextField17.setText(""); jTextField18.setText("");
        jTextField19.setText(""); jTextField20.setText(""); jTextField21.setText("");
        jTextField1.setVisible(false); jTextField1.setEnabled(false);
        jTextField2.setVisible(false); jTextField2.setEnabled(false);
        jTextField3.setVisible(false); jTextField3.setEnabled(false);
        jTextField4.setVisible(false); jTextField4.setEnabled(false);
        jTextField5.setVisible(false); jTextField5.setEnabled(false);
        jTextField6.setVisible(false); jTextField6.setEnabled(false);
        jTextField7.setVisible(false); jTextField7.setEnabled(false);
        jTextField8.setVisible(false); jTextField8.setEnabled(false);
        jTextField9.setVisible(false); jTextField9.setEnabled(false);
        jTextField10.setVisible(false); jTextField10.setEnabled(false);
        jTextField11.setVisible(false); jTextField11.setEnabled(false);
        jTextField12.setVisible(false); jTextField12.setEnabled(false);
        jTextField13.setVisible(false); jTextField13.setEnabled(false);
        jTextField14.setVisible(false); jTextField14.setEnabled(false);
        jTextField15.setVisible(false); jTextField15.setEnabled(false);
        jTextField16.setVisible(false); jTextField16.setEnabled(false);
        jTextField17.setVisible(false); jTextField17.setEnabled(false);
        jTextField18.setVisible(false); jTextField18.setEnabled(false);
        jTextField19.setVisible(false); jTextField19.setEnabled(false);
        jTextField20.setVisible(false); jTextField20.setEnabled(false);
        jTextField21.setVisible(false); jTextField21.setEnabled(false);
        jRadioButton1.setVisible(false); jRadioButton1.setEnabled(false);
        jRadioButton2.setVisible(false); jRadioButton2.setEnabled(false);
        jRadioButton3.setVisible(false); jRadioButton3.setEnabled(false);
        jTextField22.setVisible(false); jTextField22.setEnabled(false);
        jTextField23.setVisible(false); jTextField23.setEnabled(false);
        jTextField24.setVisible(false); jTextField24.setEnabled(false);
        jTextField22.setText(""); jTextField23.setText(""); jTextField24.setText("");
        jCheckBox1.setSelected(false); jCheckBox1.setVisible(false); jCheckBox1.setEnabled(false);
        jCheckBoxRezult.setVisible(false); jCheckBoxRezult.setEnabled(false);
        jButton3.setEnabled(false); //jButton3.setVisible(false);
        jRadioButton.setSelected(true); jButton1.setEnabled(true);
        jTextField1.setForeground(new Color(0, 0, 120));
        jTextField2.setForeground(new Color(0, 0, 120));
        jTextField3.setForeground(new Color(0, 0, 120));
        jTextField4.setForeground(new Color(0, 0, 120));
        jTextField5.setForeground(new Color(0, 0, 120));
        jTextField6.setForeground(new Color(0, 0, 120));
        jTextField7.setForeground(new Color(0, 0, 120));
        jTextField8.setForeground(new Color(0, 0, 120));
        jTextField9.setForeground(new Color(0, 0, 120));
        jTextField10.setForeground(new Color(0, 0, 120));
        jTextField11.setForeground(new Color(0, 0, 120));
        jTextField12.setForeground(new Color(0, 0, 120));
        jTextField13.setForeground(new Color(0, 0, 120));
        jTextField14.setForeground(new Color(0, 0, 120));
        jTextField15.setForeground(new Color(0, 0, 120));
        jTextField16.setForeground(new Color(0, 0, 120));
        jTextField17.setForeground(new Color(0, 0, 120));
        jTextField18.setForeground(new Color(0, 0, 120));
        jTextField19.setForeground(new Color(0, 0, 120));
        jTextField20.setForeground(new Color(0, 0, 120));
        jTextField21.setForeground(new Color(0, 0, 120));
        jTextField22.setForeground(new Color(0, 0, 120));
        jTextField23.setForeground(new Color(0, 0, 120));
        jTextField24.setForeground(new Color(0, 0, 120));
        if(vrt==0){
          int at[]={2}, ct[]={2}; an=at[0]; cn=ct[0];
          tn[0][1]=0; tn[0][2]=1;
          tn[1][0]=6; tn[1][1]=1; tn[1][2]=2; tn[1][8]=1;
          tn[2][0]=1; tn[2][1]=-3; tn[2][2]=2; tn[2][8]=1;
          ModifyRasForma(at,ct,tn,td,tbn,tbd,s);a=at[0]; c=ct[0];
        }
        if(vrt==1){
          int at[]={2}, ct[]={2}; an=at[0]; cn=ct[0];
          tn[0][1]=1; tn[0][2]=2;
          tn[1][0]=1; tn[1][1]=-1; tn[1][2]=1; tn[1][8]=1;
          tn[2][0]=6; tn[2][1]=2; tn[2][2]=1; tn[2][8]=1;
          ModifyRasForma(at,ct,tn,td,tbn,tbd,s);a=at[0]; c=ct[0];
        }
        if(vrt==2){
          int at[]={2}, ct[]={2}; an=at[0]; cn=ct[0];
          tn[0][1]=-6; tn[0][2]=-1;
          tn[1][0]=6; tn[1][1]=2; tn[1][2]=1; tn[1][8]=-1;
          tn[2][0]=-4; tn[2][1]=-2; tn[2][2]=2; tn[2][8]=1;
          ModifyRasForma(at,ct,tn,td,tbn,tbd,s);a=at[0]; c=ct[0];
        }
        if(vrt==3){
          int at[]={2}, ct[]={2}; an=at[0]; cn=ct[0];
          tn[0][1]=4; tn[0][2]=-3;
          tn[1][0]=15; tn[1][1]=2; tn[1][2]=5; tn[1][8]=1;
          tn[2][0]=40; tn[2][1]=7; tn[2][2]=5; tn[2][8]=1;
          ModifyRasForma(at,ct,tn,td,tbn,tbd,s);a=at[0]; c=ct[0];
        }
        if(vrt==4){
          int at[]={2}, ct[]={2}; an=at[0]; cn=ct[0];
          tn[0][1]=3; tn[0][2]=1;
          tn[1][0]=5; tn[1][1]=-1; tn[1][2]=3; tn[1][8]=1;
          tn[2][0]=7; tn[2][1]=3; tn[2][2]=1; tn[2][8]=1;
          ModifyRasForma(at,ct,tn,td,tbn,tbd,s);a=at[0]; c=ct[0];
        }
        if(vrt==5){
          int at[]={2}, ct[]={2}; an=at[0]; cn=ct[0];
          tn[0][1]=4; tn[0][2]=2;
          tn[1][0]=6; tn[1][1]=-3; tn[1][2]=2; tn[1][8]=1;
          tn[2][0]=28; tn[2][1]=5; tn[2][2]=3; tn[2][8]=1;
          ModifyRasForma(at,ct,tn,td,tbn,tbd,s);a=at[0]; c=ct[0];
        }
        if(vrt==6){
          int at[]={2}, ct[]={2}; an=at[0]; cn=ct[0];
          tn[0][1]=-4; tn[0][2]=3;
          tn[1][0]=7; tn[1][1]=-1; tn[1][2]=2; tn[1][8]=1;
          tn[2][0]=8; tn[2][1]=4; tn[2][2]=-3; tn[2][8]=1;
          ModifyRasForma(at,ct,tn,td,tbn,tbd,s);a=at[0]; c=ct[0];
        }
        if(vrt==7){
          int at[]={2}, ct[]={2}; an=at[0]; cn=ct[0];
          tn[0][1]=1; tn[0][2]=4;
          tn[1][0]=22; tn[1][1]=3; tn[1][2]=4; tn[1][8]=1;
          tn[2][0]=3; tn[2][1]=1; tn[2][2]=-2; tn[2][8]=-1;
          ModifyRasForma(at,ct,tn,td,tbn,tbd,s);a=at[0]; c=ct[0];
        }
        if(vrt==8){
          int at[]={2}, ct[]={2}; an=at[0]; cn=ct[0];
          tn[0][1]=2; tn[0][2]=-8;
          tn[1][0]=16; tn[1][1]=1; tn[1][2]=2; tn[1][8]=1;
          tn[2][0]=40; tn[2][1]=6; tn[2][2]=2; tn[2][8]=1;
          ModifyRasForma(at,ct,tn,td,tbn,tbd,s);a=at[0]; c=ct[0];
        }
        if(vrt==9){
          int at[]={2}, ct[]={2}; an=at[0]; cn=ct[0];
          tn[0][1]=2; tn[0][2]=-1;
          tn[1][0]=-3; tn[1][1]=-1; tn[1][2]=-4; tn[1][8]=1;
          tn[2][0]=11; tn[2][1]=4; tn[2][2]=-1; tn[2][8]=1;
          ModifyRasForma(at,ct,tn,td,tbn,tbd,s);a=at[0]; c=ct[0];
        }
        if(vrt==10){
          int at[]={2}, ct[]={2};
          tn[0][1]=-4; tn[0][2]=2; an=at[0]; cn=ct[0];
          tn[1][0]=16; tn[1][1]=2; tn[1][2]=1; tn[1][8]=1;
          tn[2][0]=20; tn[2][1]=1; tn[2][2]=3; tn[2][8]=1;
          ModifyRasForma(at,ct,tn,td,tbn,tbd,s);a=at[0]; c=ct[0];
        }
        if(vrt==11){
          int at[]={2}, ct[]={2}; an=at[0]; cn=ct[0];
          tn[0][1]=1; tn[0][2]=0;
          tn[1][0]=2; tn[1][1]=4; tn[1][2]=-6; tn[1][8]=1;
          tn[2][0]=6; tn[2][1]=2; tn[2][2]=1; tn[2][8]=1;
          ModifyRasForma(at,ct,tn,td,tbn,tbd,s);a=at[0]; c=ct[0];
        }
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
          sh=0;
        }
        otv0=-1;
      }
      if((stepSM==1) && (stepVG==1)){
        if((sh-2)%5==0){
          r=0;
          Tabl1(g,a,c,1,0,true,bp);
          Tb1(g,a,c,tbn,tbd,bp);
          if(slog>=1)
          {
            if(edt==false){
              if(k==0){
                jTextField1.setBounds(new Rectangle(129+b+60,tup+d+2,60,17));
                jTextField2.setBounds(new Rectangle(129+b+180,tup+d+2,60,17));
                jTextField1.setVisible(true); jTextField1.setEnabled(true);
                jTextField2.setVisible(true); jTextField2.setEnabled(true);
              }
              jTextField3.setBounds(new Rectangle(129+b,tup+d+36,60,17));
              jTextField4.setBounds(new Rectangle(129+b+120,tup+d+36,60,17));
              jTextField7.setBounds(new Rectangle(89+b,tup+d+53,40,17));
              jTextField8.setBounds(new Rectangle(129+b+60,tup+d+53,60,17));
              jTextField9.setBounds(new Rectangle(129+b+180,tup+d+53,60,17));
              jTextField3.setVisible(true); jTextField3.setEnabled(true);
              jTextField4.setVisible(true); jTextField4.setEnabled(true);
              jTextField7.setVisible(true); jTextField7.setEnabled(true);
              jTextField8.setVisible(true); jTextField8.setEnabled(true);
              jTextField9.setVisible(true); jTextField9.setEnabled(true);
              if(c==3){
                jTextField11.setBounds(new Rectangle(129+b,tup+d+70,60,17));
                jTextField12.setBounds(new Rectangle(129+b+120,tup+d+70,60,17));
                jTextField11.setVisible(true); jTextField11.setEnabled(true);
                jTextField12.setVisible(true); jTextField12.setEnabled(true);
              }
              if(a>=5){
                jTextField5.setBounds(new Rectangle(129+b+240,tup+d+36,60,17));
                jTextField5.setVisible(true); jTextField5.setEnabled(true);
                if(c==3){
                  jTextField13.setBounds(new Rectangle(129+b+240,tup+d+70,60,17));
                  jTextField13.setVisible(true); jTextField13.setEnabled(true);
                }
              }
              if(a>=6){
                jTextField10.setBounds(new Rectangle(129+b+300,tup+d+53,60,17));
                jTextField10.setVisible(true); jTextField10.setEnabled(true);
              }
              if(a>=7){
                jTextField6.setBounds(new Rectangle(129+b+360,tup+d+36,60,17));
                jTextField6.setVisible(true); jTextField6.setEnabled(true);
                if(c==3){
                  jTextField14.setBounds(new Rectangle(129+b+360,tup+d+70,60,17));
                  jTextField14.setVisible(true); jTextField14.setEnabled(true);
                }
              }
              if(AddRAnswer==false){
                if(k==0) RightAnswer=RightAnswer+2;
                RightAnswer=RightAnswer+5;
                if(c==3)RightAnswer=RightAnswer+2;
                if(a>=5){
                  RightAnswer++;
                  if(c==3)RightAnswer++;
                }
                if(a>=6){
                  RightAnswer++;
                }
                if(a>=7){
                  RightAnswer++;
                  if(c==3) RightAnswer++;
                }
                AddRAnswer=true;
              }
              jButton1.setEnabled(false);
              jButton3.setEnabled(true); //jButton3.setVisible(true);
            }
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
          if(slog==2)
          {
            if(edt==false){
              kf=(int)Math.round(tbn[4][1]/1000.0);
              if((tbd[4][1]==1) || (kf==0) || (tbn[4][1]-kf*1000==0)){
                jTextField15.setBounds(new Rectangle(129+b,tup+d+(c+2)*17+2,60,16));
                jTextField15.setVisible(true); jTextField15.setEnabled(true);
              }
              kf=(int)Math.round(tbn[4][2]/1000.0);
              if((tbd[4][2]==1) || (kf==0) || (tbn[4][2]-kf*1000==0)){
                jTextField16.setBounds(new Rectangle(129+b+60,tup+d+(c+2)*17+2,60,16));
                jTextField16.setVisible(true); jTextField16.setEnabled(true);
              }
              kf=(int)Math.round(tbn[4][3]/1000.0);
              if((tbd[4][3]==1) || (kf==0) || (tbn[4][3]-kf*1000==0)){
                jTextField17.setBounds(new Rectangle(129+b+120,tup+d+(c+2)*17+2,60,16));
                jTextField17.setVisible(true); jTextField17.setEnabled(true);
              }
              kf=(int)Math.round(tbn[4][4]/1000.0);
              if((tbd[4][4]==1) || (kf==0) || (tbn[4][4]-kf*1000==0)){
                jTextField18.setBounds(new Rectangle(129+b+180,tup+d+(c+2)*17+2,60,16));
                jTextField18.setVisible(true); jTextField18.setEnabled(true);
              }
              if(a>=5){
                kf=(int)Math.round(tbn[4][5]/1000.0);
                if((tbd[4][5]==1) || (kf==0) || (tbn[4][5]-kf*1000==0)){
                  jTextField19.setBounds(new Rectangle(129+b+240,tup+d+(c+2)*17+2,60,16));
                  jTextField19.setVisible(true); jTextField19.setEnabled(true);
                }
              }
              if(a>=6){
                kf=(int)Math.round(tbn[4][6]/1000.0);
                if((tbd[4][6]==1) || (kf==0) || (tbn[4][6]-kf*1000==0)){
                  jTextField20.setBounds(new Rectangle(129+b+300,tup+d+(c+2)*17+2,60,16));
                  jTextField20.setVisible(true); jTextField20.setEnabled(true);
                }
              }
              if(a>=7){
                kf=(int)Math.round(tbn[4][7]/1000.0);
                if((tbd[4][7]==1) || (kf==0) || (tbn[4][7]-kf*1000==0)){
                  jTextField21.setBounds(new Rectangle(129+b+360,tup+d+(c+2)*17+2,60,16));
                  jTextField21.setVisible(true); jTextField21.setEnabled(true);
                }
              }
              if(AddRAnswer==false){
                for(int i=1; i<=a; i++)
                {
                  kf=(int)Math.round(tbn[4][i]/1000.0);
                  if((tbd[4][i]==1) || (kf==0) || (tbn[4][i]-kf*1000==0))
                    RightAnswer++;
                }
                AddRAnswer=true;
              }
              jButton1.setEnabled(false);
              jButton3.setEnabled(true); //jButton3.setVisible(true);
            }
          }
        }
        if((sh-2)%5==2){
          n=0; Valuation(a,c,tbn,tbd,nm,sm); n=nm[0]; ss=sm[0];
          Tabl1(g,a,c,1,1,true,bp);
          Tb1(g,a,c,tbn,tbd,bp);
          g.setColor(Color.red);
          Ind_nk(g,"\u2206","  j",b+153+a*60,tup+48+c*17+d);
          g.setColor(new Color(0, 0, 80));
          if(AddRAnswer==false){RightAnswer++; AddRAnswer=true;}
        }
        if((sh-2)%5==3){
          Tabl1(g,a,c,1,1,true,bp);
          Tb1(g,a,c,tbn,tbd,bp);
          g.setColor(new Color(230, 230, 255));
          g.fillRect(129+b,tup+d+2+17,a*60-1,16);
          g.setColor(Color.black);
          for(int i=0; i<=a; i++)
          {
            g.drawLine(b+128+i*60,tup+d+2+17,b+128+i*60,tup+18+d+17);
            if(i!=a) Ind_n(g,"x",""+(i+1),b+153+i*60,tup+29+d);
          }
          if(slog>=1)
          {
            if(AddRAnswer==false){RightAnswer++; AddRAnswer=true;}
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
          else
          {
            g.setColor(Color.red);
            Ind_n(g,"x",""+n,b+153+(n-1)*60,tup+29+d);
          }
        }
        if((sh-2)%5==4){
          double min=20000.0; int minn=0, mind=1;
          if(AddRAnswer==false){RightAnswer++; AddRAnswer=true;}
          for(int i=1; i<=c; i++)
            if(tbn[i][n]>0){
              minn=tbn[i][0]*tbd[i][n]; mind=tbd[i][0]*tbn[i][n];
              tbn[i][8]=minn/MaxDel(minn,mind); tbd[i][8]=mind/MaxDel(minn,mind);
              if(min>((double)tbn[i][0]/tbd[i][0])*((double)tbd[i][n]/tbn[i][n])){
                min=((double)tbn[i][0]/tbd[i][0])*((double)tbd[i][n]/tbn[i][n]);
              }
            }
            else tbn[i][8]=-20000;
          Tabl1(g,a,c,1,1,true,bp);
          g.setColor(new Color(230, 230, 255));
          g.fillRect(49+b,tup+d+36,39,17*c-1);
          g.setColor(Color.black);
          for(int i=2; i<=c; i++)
            g.drawLine(b+48,tup+18+d+17*i,b+48+40,tup+18+d+17*i);
          for(int i=0; i<c; i++)
            if(bp[i]>0) Ind_n(g,"x",""+bp[i],b+62,tup+46+d+i*17);
          if(otv!=1){
            if(((Kx>=49+b) && (Kx<=89+b)) && ((Ky>=tup+d+36) && (Ky<=tup+d+52)))
              bpx=0;
            else if(((Kx>=49+b) && (Kx<=89+b)) && ((Ky>=tup+d+53) && (Ky<=tup+d+69)))
              bpx=1;
            else if(((Kx>=49+b) && (Kx<=89+b)) && ((Ky>=tup+d+70) && (Ky<=tup+d+86)) && (c==3))
              bpx=2;
            else bpx=-1;
            if((tbn[bpx+1][8]==-20000) && (bpx>=0) && (otv!=1)){
              g.setColor(new Color(230, 230, 255));
              g.fillRect(69+b+n*60,tup+d+2+17*(bpx+2),59,16);
            }
          }
          Tb1(g,a,c,tbn,tbd,bp);
          if(bpx>=0){
            if(((((double)tbn[bpx+1][0]/tbd[bpx+1][0])*((double)tbd[bpx+1][n]/tbn[bpx+1][n]))==min) && (tbn[bpx+1][n]>0)){
              g.setColor(Color.red); p=bpx+1; pp=bpx;
              Ind_n(g,"x",""+bp[bpx],b+62,tup+46+d+bpx*17);
              otv=1; jPanel3.repaint();
            }
            else if(otv!=1)
                   {otv=0; jPanel3.repaint();}
                 else{
                   g.setColor(Color.red); bpx=pp;
                   Ind_n(g,"x",""+bp[bpx],b+62,tup+46+d+bpx*17);
                 }
          }
          else if(otv!=1) {otv=-1; jPanel3.repaint();}
               else{
                 g.setColor(Color.red); bpx=pp;
                 Ind_n(g,"x",""+bp[bpx],b+62,tup+46+d+bpx*17);
               }
          shag=true;
          r=0;
        }
      }
      if((stepSM==2) && (stepVG==1)){
        if((sh-2)%5==0){
          bp[p-1]=n;
       //   if(r==0) r=1;
          for(int i=1; i<=c+1; i++){
            tbn[i][8]=20000; tbd[i][8]=1;
          }
          ModifyArray1(a,c,tbn,tbd,p,n);
          Tabl1(g,a,c,1+r,0,true,bp);
          Tb1(g,a,c,tbn,tbd,bp);
          if(slog==2)
          {
            if(edt==false){
              jTextField3.setBounds(new Rectangle(129+b,tup+d+36,60,17));
              jTextField4.setBounds(new Rectangle(129+b+120,tup+d+36,60,17));
              jTextField7.setBounds(new Rectangle(89+b,tup+d+53,40,17));
              jTextField8.setBounds(new Rectangle(129+b+60,tup+d+53,60,17));
              jTextField9.setBounds(new Rectangle(129+b+180,tup+d+53,60,17));
              jTextField3.setVisible(true); jTextField3.setEnabled(true);
              jTextField4.setVisible(true); jTextField4.setEnabled(true);
              jTextField7.setVisible(true); jTextField7.setEnabled(true);
              jTextField8.setVisible(true); jTextField8.setEnabled(true);
              jTextField9.setVisible(true); jTextField9.setEnabled(true);
              if(c==3){
                jTextField11.setBounds(new Rectangle(129+b,tup+d+70,60,17));
                jTextField12.setBounds(new Rectangle(129+b+120,tup+d+70,60,17));
                jTextField11.setVisible(true); jTextField11.setEnabled(true);
                jTextField12.setVisible(true); jTextField12.setEnabled(true);
              }
              if(a>=5){
                jTextField5.setBounds(new Rectangle(129+b+240,tup+d+36,60,17));
                jTextField5.setVisible(true); jTextField5.setEnabled(true);
                if(c==3){
                  jTextField13.setBounds(new Rectangle(129+b+240,tup+d+70,60,17));
                  jTextField13.setVisible(true); jTextField13.setEnabled(true);
                }
              }
              if(a>=6){
                jTextField10.setBounds(new Rectangle(129+b+300,tup+d+53,60,17));
                jTextField10.setVisible(true); jTextField10.setEnabled(true);
              }
              if(a>=7){
                jTextField6.setBounds(new Rectangle(129+b+360,tup+d+36,60,17));
                jTextField6.setVisible(true); jTextField6.setEnabled(true);
                if(c==3){
                  jTextField14.setBounds(new Rectangle(129+b+360,tup+d+70,60,17));
                  jTextField14.setVisible(true); jTextField14.setEnabled(true);
                }
              }
              int kf=0;
              kf=(int)Math.round(tbn[4][1]/1000.0);
              if((tbd[4][1]==1) || (kf==0) || (tbn[4][1]-kf*1000==0)){
                jTextField15.setBounds(new Rectangle(129+b,tup+d+(c+2)*17+2,60,16));
                jTextField15.setVisible(true); jTextField15.setEnabled(true);
              }
              kf=(int)Math.round(tbn[4][2]/1000.0);
              if((tbd[4][2]==1) || (kf==0) || (tbn[4][2]-kf*1000==0)){
                jTextField16.setBounds(new Rectangle(129+b+60,tup+d+(c+2)*17+2,60,16));
                jTextField16.setVisible(true); jTextField16.setEnabled(true);
              }
              kf=(int)Math.round(tbn[4][3]/1000.0);
              if((tbd[4][3]==1) || (kf==0) || (tbn[4][3]-kf*1000==0)){
                jTextField17.setBounds(new Rectangle(129+b+120,tup+d+(c+2)*17+2,60,16));
                jTextField17.setVisible(true); jTextField17.setEnabled(true);
              }
              kf=(int)Math.round(tbn[4][4]/1000.0);
              if((tbd[4][4]==1) || (kf==0) || (tbn[4][4]-kf*1000==0)){
                jTextField18.setBounds(new Rectangle(129+b+180,tup+d+(c+2)*17+2,60,16));
                jTextField18.setVisible(true); jTextField18.setEnabled(true);
              }
              if(a>=5){
                kf=(int)Math.round(tbn[4][5]/1000.0);
                if((tbd[4][5]==1) || (kf==0) || (tbn[4][5]-kf*1000==0)){
                  jTextField19.setBounds(new Rectangle(129+b+240,tup+d+(c+2)*17+2,60,16));
                  jTextField19.setVisible(true); jTextField19.setEnabled(true);
                }
              }
              if(a>=6){
                kf=(int)Math.round(tbn[4][6]/1000.0);
                if((tbd[4][6]==1) || (kf==0) || (tbn[4][6]-kf*1000==0)){
                  jTextField20.setBounds(new Rectangle(129+b+300,tup+d+(c+2)*17+2,60,16));
                  jTextField20.setVisible(true); jTextField20.setEnabled(true);
                }
              }
              if(a==7){
                kf=(int)Math.round(tbn[4][7]/1000.0);
                if((tbd[4][7]==1) || (kf==0) || (tbn[4][7]-kf*1000==0)){
                  jTextField21.setBounds(new Rectangle(129+b+360,tup+d+(c+2)*17+2,60,16));
                  jTextField21.setVisible(true); jTextField21.setEnabled(true);
                }
              }
              if(AddRAnswer==false){
                RightAnswer=RightAnswer+5;
                if(c==3)RightAnswer=RightAnswer+2;
                if(a>=5){
                  RightAnswer++;
                  if(c==3)RightAnswer++;
                }
                if(a>=6){
                  RightAnswer++;
                }
                if(a>=7){
                  RightAnswer++;
                  if(c==3) RightAnswer++;
                }
                for(int i=1; i<=a; i++)
                {
                  kf=(int)Math.round(tbn[4][i]/1000.0);
                  if((tbd[4][i]==1) || (kf==0) || (tbn[4][i]-kf*1000==0))
                    RightAnswer++;
                }
                AddRAnswer=true;
              }
              jButton1.setEnabled(false);
              jButton3.setEnabled(true); //jButton3.setVisible(true);
            }
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
          if(AddRAnswer==false){RightAnswer++; AddRAnswer=true;}
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
          if(slog>=1)
          {
            if(AddRAnswer==false){RightAnswer++; AddRAnswer=true;}
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
          else
          {
            g.setColor(Color.red);
            Ind_n(g,"x",""+n,b+153+(n-1)*60,tup+29+d);
          }
       }
       if((sh-2)%5==4){
          double min=20000.0; int minn=0, mind=1;
          if(AddRAnswer==false){RightAnswer++; AddRAnswer=true;}
          for(int i=1; i<=c; i++)
            if(tbn[i][n]>0){
              minn=tbn[i][0]*tbd[i][n]; mind=tbd[i][0]*tbn[i][n];
              tbn[i][8]=minn/MaxDel(minn,mind); tbd[i][8]=mind/MaxDel(minn,mind);
              if(min>((double)tbn[i][0]/tbd[i][0])*((double)tbd[i][n]/tbn[i][n])){
                min=((double)tbn[i][0]/tbd[i][0])*((double)tbd[i][n]/tbn[i][n]);
              }
            }
            else tbn[i][8]=-20000;
          Tabl1(g,a,c,1,0,true,bp);
          g.setColor(new Color(230, 230, 255));
          g.fillRect(49+b,tup+d+36,39,17*c-1);
          g.setColor(Color.black);
          for(int i=2; i<=c; i++)
            g.drawLine(b+48,tup+18+d+17*i,b+48+40,tup+18+d+17*i);
          for(int i=0; i<c; i++)
            if(bp[i]>0) Ind_n(g,"x",""+bp[i],b+62,tup+46+d+i*17);
          if(otv!=1){
            if(((Kx>=49+b) && (Kx<=89+b)) && ((Ky>=tup+d+36) && (Ky<=tup+d+52)))
              bpx=0;
            else if(((Kx>=49+b) && (Kx<=89+b)) && ((Ky>=tup+d+53) && (Ky<=tup+d+69)))
              bpx=1;
            else if(((Kx>=49+b) && (Kx<=89+b)) && ((Ky>=tup+d+70) && (Ky<=tup+d+86)) && (c==3))
              bpx=2;
            else bpx=-1;
            if((tbn[bpx+1][8]==-20000) && (bpx>=0) && (otv!=1)){
              g.setColor(new Color(230, 230, 255));
              g.fillRect(69+b+n*60,tup+d+2+17*(bpx+2),59,16);
            }
          }
          Tb1(g,a,c,tbn,tbd,bp);
          if(bpx>=0){
            if(((((double)tbn[bpx+1][0]/tbd[bpx+1][0])*((double)tbd[bpx+1][n]/tbn[bpx+1][n]))==min) && (tbn[bpx+1][n]>0) && (bpx>=0)){
              g.setColor(Color.red); p=bpx+1; pp=bpx;
              Ind_n(g,"x",""+bp[bpx],b+62,tup+46+d+bpx*17);
              otv=1; jPanel3.repaint();
            }
            else if(otv!=1)
                   {otv=0; jPanel3.repaint();}
                 else{
                   g.setColor(Color.red); bpx=pp;
                   Ind_n(g,"x",""+bp[bpx],b+62,tup+46+d+bpx*17);
                 }
          }
          else if(otv!=1) {otv=-1; jPanel3.repaint();}
               else{
                 g.setColor(Color.red); bpx=pp;
                 Ind_n(g,"x",""+bp[bpx],b+62,tup+46+d+bpx*17);
               }
        }
      }
      if(stepVG==2){
        if(edt==false)
          if(k%2==1){
            for(int i=0; i<=an; i++)
              tn[c][i]=0;
            tn[c][NX]=1; tn[c][0]=(int)(Xn[k-1][NX]/Xd[k-1][NX])+1; tn[c][8]=-1;
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
          tn[c][NX]=1; tn[c][0]=(int)(Xn[k-1][NX]/Xd[k-1][NX]); tn[c][8]=1;
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
          if((edt==false) && (slog>=1)){
            jButton1.setEnabled(false);
            jButton3.setEnabled(false);
          }
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
          if(slog==0)
          {
            g.setColor(Color.red);
            for(int i=1; i<=c; i++)
            {
              if(tbn[i][0]<20000){
                if((tbd[i][0]==1) || (tbn[i][0]==0)) jj=""+tbn[i][0];
                else jj=tbn[i][0]+"/"+tbd[i][0];
                Stringer.drawString(jj,(int)(b+108-jj.length()*4),tup+32+i*17+d);
              }
            }
          }
          if(AddRAnswer==false){
            if(slog==1) RightAnswer++;
            if(slog==2) RightAnswer=RightAnswer+2;
            AddRAnswer=true;
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
              if(((NX>0) && (k==0) && (edt==true) && (Right==true) && (RightPust==true)) || (k>0) || (stepVG==5) || ((sh-2)%5==2)){
                Stringer.drawString("x_{"+NX+"} \u2264 "+(int)(Xn[0][NX]/Xd[0][NX]),203,tup+85);
                Stringer.drawString("x_{"+NX+"} \u2265 "+(int)((Xn[0][NX]/Xd[0][NX])+1),380,tup+85);
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
          if(slog!=2) g.setColor(Color.lightGray);
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
        zd1=0; zd2=0;
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
      int qq=0;
      g.setColor(new Color(180, 0, 80));
      g.setFont(new java.awt.Font("SansSerif", 3, 13));
      g.drawString("Обозначения:",477,82);
  //    g.drawString("Выберите вариант:",36,60);
  //    g.drawString("Выберите сложность:",370,60);
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
      int q=0;
      if(vrt==0){ zd1=27; zd2=16; q=10;}
      if(vrt==1){ zd1=6; zd2=28; q=28;}
      if(vrt==2){ zd1=3; zd2=12; qq=4; q=28;}
      if(vrt==3){ zd1=2; zd2=6; q=28;}
      if(vrt==4){ zd1=7; zd2=22; qq=-1; q=28;}
      if(vrt==5){ zd1=0; zd2=4; qq=-1; q=28;}
      if(vrt==6){ zd1=1; zd2=14; q=34;}
      if(vrt==7){ zd1=7; zd2=18; qq=-4; q=28;}
      if(vrt==8){ zd1=2; zd2=13; q=28;}
      if(vrt==9){ zd1=8; zd2=17; q=28;}
      if(vrt==10){ zd1=1; zd2=28; qq=1; q=28;}
      if(vrt==11){ zd1=14; zd2=17; qq=-1; q=10;}
      Stringer.drawString(s[0],zd1+53,38);
      Stringer.drawString(s[1],zd2,58);
      int at[]={an}, ct[]={cn};
      if(stepVG==5) ModifyRasForma(at,ct,tn,td,tbn,tbd,s);
      FontMetrics Fm=g.getFontMetrics();
      Stringer.drawString(s[2],(210-s[2].length()*6+q)/2+7,102);
      Stringer.drawString(s[3],(210-s[3].length()*4)/2+7,124);
      Stringer.drawString(s[4],(210-s[4].length()*4)/2+7,144);
      if((stepSM==3) && (stepVG==1) && ((sh-2)%5==2)){
        Stringer.drawString(s[2],(210-s[2].length()*6+q)/2+237,102);
        Stringer.drawString(s[3],(210-s[3].length()*4)/2+237,124);
        Stringer.drawString(s[4],(210-s[4].length()*4)/2+237,144);
        s[5]="x_{"+NX+"} \u2265 "+(int)((Xn[0][NX]/Xd[0][NX])+1);
        Stringer.drawString(s[5]+"   "+s[10],(210-s[5].length()*5-s[10].length()*5+20)/2+242,164);
        s[5]="x_{"+NX+"} \u2264 "+(int)(Xn[0][NX]/Xd[0][NX]);
        Stringer.drawString(s[5]+"   "+s[10],(210-s[5].length()*5-s[10].length()*5+20)/2+12,164);
      }
      else{
        Stringer.drawString(s[5]+"   "+s[10],(210-s[5].length()*3-s[10].length()*6+20)/2,164);
        if(sh!=0){
          if((vrt==2) || (vrt==7) || (vrt>=10))
            Stringer.drawString(s[6],(210-Fm.stringWidth(s[6])*3/4)/2+237,102);
          else
            Stringer.drawString(s[6],(210-s[6].length()*6+q)/2+237,102);
          Stringer.drawString(s[7],(210-s[7].length()*4)/2+qq+237,124);
          Stringer.drawString(s[8],(210-s[8].length()*4)/2-qq+237,144);
          Stringer.drawString(s[9]+"   "+s[11],(210-s[9].length()*3-s[11].length()*6+20)/2+235,164);
        }
      }
      g.setColor(new Color(180, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 3, 13));
      g.drawString("Задача:  ",zd1,38);

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
     //   jComboBox1.setVisible(false); jComboBox1.setEnabled(false);
     //   jComboBox2.setVisible(false); jComboBox2.setEnabled(false);
        g.setColor(new Color(190, 190, 190));
        g.fillRect(b0+7,41+d0,602-2*b0+14,2+17*(3+c0)+27);
        g.setColor(new Color(255, 255, 255));
        g.fillRect(b0,34+d0,602-2*b0+14,2+17*(3+c0)+27);
        g.setColor(Color.blue);
        g.drawRect(b0,34+d0,602-2*b0+14,2+17*(3+c0)+27);
        Tabl2(g,a0,c0,r,1,true,bp0);
        Tb2(g,a0,c0,p,n,tbn0,tbd0,bp0);
      }
    /*  else{
        jComboBox1.setVisible(true); jComboBox1.setEnabled(true);
        jComboBox2.setVisible(true); jComboBox2.setEnabled(true);
      }*/
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
     // g.drawString(""+sh+"   "+stepSM+"    "+stepVG+"    c="+c+"    k="+k,100,55);
//     g.drawString("otv="+otv+"   fnk="+fnk+"     fdk"+fdk,100,55);
      if(sh==0){
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("При нажатии кнопки \"Обновить\" происходит смена варианта.",12, 80);
      }
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
        jButton3.setEnabled(false);
      }
      if(((stepSM==1) && (stepVG==1)) && ((sh-2)%5==0)){
        otvet="";
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString(k+".1.1.",10, 80);
        g.setColor(new Color(0, 0, 80));
        if(slog>=1)
        {
          Stringer.drawString("Заполните                    согласно алгоритму симплекс-метода.",54, 80);
          g.setColor(Color.red); g.setFont(new java.awt.Font("SansSerif", 3, 14));
          g.drawString("Таблицу 1",133, 80);
          g.setColor(Color.red);
          if(edt==true){
            if((Right==false) || (RightPust==false)){
           /*   StringerD.drawString("Неправильно",258,130);
              if(Right==false) otvet="( Таблица заполнена неверно. ";
              else otvet="(";
              if(RightPust==false) otvet=otvet+" Не оставляйте поля пустыми. )";
              else otvet=otvet+")";*/
              otvet="Неправильно, внесите заново необходимые элементы таблицы";
              StringerD.drawString(otvet,(600-Fm.stringWidth(otvet)*11/6)/2,130);
            }
            else{
              g.setColor(Color.blue);
              StringerD.drawString("Правильно",267,130);
            }
          }
        }
        else{
          Stringer.drawString("Заполняем                    согласно алгоритму симплекс-метода.",54, 80);
          g.setColor(Color.red); g.setFont(new java.awt.Font("SansSerif", 3, 14));
          g.drawString("Таблицу 1",135, 80);
        }
      }
      if(((stepSM==1) && (stepVG==1)) && ((sh-2)%5==1)){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString(k+".1.1.1.",10, 80);
        g.setColor(new Color(0, 0, 80));
        if(slog==2)
        {
          Stringer.drawString("Вычислите относительные оценки      ,    = 1, ..., "+a+".",66, 80);
          g.setFont(new java.awt.Font("SansSerif", 3, 14));
          g.drawString("j",350, 80);
          g.setColor(Color.red); Ind_nk(g,"\u2206","  j",322,80);
          if(edt==true){
            if((Right==false) || (RightPust==false)){
              StringerD.drawString("Неправильно",258,130);
              if(Right==false) otvet="( Пересчитайте оценки: "+ots+" . ";
              else otvet="(";
              if(RightPust==false) otvet=otvet+" Не оставляйте поля пустыми. )";
              else otvet=otvet+")";
              StringerD.drawString(otvet,4+(602-(Fm.stringWidth(otvet)-4*((int)Fm.stringWidth(ots)/10))*11/6)/2,150);
            }
            else{
              g.setColor(Color.blue);
              StringerD.drawString("Правильно",267,130);
            }
          }
        }
        else
        {
          Stringer.drawString("Вычисляем относительные оценки      ,    = 1, ..., "+a+".",66, 80);
          g.setFont(new java.awt.Font("SansSerif", 3, 14));
          g.drawString("j",353, 80);
          g.setColor(Color.red); Ind_nk(g,"\u2206","  j",325,80);
        }
      }
      if(((stepSM==1) || (stepSM==2)) && (stepVG==1) && ((sh-2)%5==2)){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString(k+"."+(r+1)+".2.",10, 80);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Проанализируйте относительные оценки     .",54, 80);
        g.setColor(Color.red);
        Ind_nk(g,"\u2206","  j",355,80);
        g.setColor(new Color(0, 0, 40)); g.setFont(new java.awt.Font("Dialog", 3, 14));
        g.drawString("Текущее базисное решение ",50,105);
        jRadioButton1.setText("оптимально");
        jRadioButton1.setBounds(new Rectangle(253,90,135,20));
        jRadioButton2.setText("не оптимально");
        jRadioButton2.setBounds(new Rectangle(253,110,160,20));
        jRadioButton1.setVisible(true);
        jRadioButton1.setEnabled(true);
        jRadioButton2.setVisible(true);
        jRadioButton2.setEnabled(true);
        jButton1.setEnabled(false);
        if(Right==false){
          g.setColor(Color.blue);
          StringerD.drawString("Правильно",267,150);
          jButton1.setEnabled(true);
          if(otv==2) jRadioButton1.setEnabled(false);
          else jRadioButton2.setEnabled(false);
        }
        else if(jRadioButton.isSelected()==false){
               g.setColor(Color.red);
               if(otv==1){
                 StringerD.drawString("Неправильно, так как не все оценки       \u2264 0.",152,150);
                 Ind_nk(g,"\u2206","  j",414,150);
                 if(entry==false) Mist_under[4]++; entry=true;
               }
               else if(otv==2){
                      StringerD.drawString("Неправильно, так как все оценки       \u2264 0.",163,150);
                      Ind_nk(g,"\u2206","  j",404,150);
                      if(entry==false) Mist_under[16]++; entry=true;
                    }
             }
      }
      if(((stepSM==1) || (stepSM==2)) && (stepVG==1) && ((sh-2)%5==3)){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString(k+"."+(r+1)+".2.1.",10, 80);
        g.setColor(new Color(0, 0, 80));
        if(slog>=1)
        {
          Stringer.drawString("Курсором мыши укажите в таблице переменную, которая должна быть",66, 80);
          Stringer.drawString("введена в базис.",12, 100);
          jRadioButton.setVisible(true);
          jRadioButton.setEnabled(true);
          jButton1.setEnabled(false);
          if(otv==0){
            g.setColor(Color.red); if(entry==false) Mist_under[5]++; entry=true;
            StringerD.drawString("Неправильно, так как оценка при данной переменной не является максимальной.",14,130);
          }
          else if(otv==1){
                 g.setColor(Color.blue);
                 StringerD.drawString("Правильно",267,130);
                 jButton1.setEnabled(true);
               }
               else if(edt==true)
               {
                 g.setColor(Color.red);
                 StringerD.drawString("Не попали в выделенную область",180,130);
               }
        }
        else
        {
          Stringer.drawString("Вводим в базис переменную     , т.к. оценка при переменной     ",66, 80);
          Stringer.drawString("максимальна.",12, 100);
          Ind_n(g,"x",""+n,280,80); Ind_n(g,"x",""+n,506,80);
        }
      }
      if(((stepSM==1) || (stepSM==2)) && (stepVG==1)  && ((sh-2)%5==4)){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString(k+"."+(r+1)+".2.2.",10, 80);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Определяем переменную, выводимую из базиса:  для этого вычисляем",66, 80);
        Stringer.drawString("отношение БР/a_{ir}. Курсором мыши укажите в таблице переменную, которая",12, 100);
        Stringer.drawString("должна быть выведена из базиса.",12, 120);
        jRadioButton.setVisible(true);
        jRadioButton.setEnabled(true);
        jButton1.setEnabled(false);
        if((otv==0)){
          g.setColor(Color.red);
          if(tbn[bpx+1][8]!=-20000){
            if(entry==false) Mist_under[6]++; entry=true;
            StringerD.drawString("Неправильно, так как отношение БР/a_{ir} при переменной x_{"+bp[bpx]+"}",99,140);
            StringerD.drawString("не является минимальным.",209,160);
          }
          else{
            StringerD.drawString("Неправильно, т.к. коэффициент при переменной x_{"+bp[bpx]+"} в столбце соответствующему",15,140);
            StringerD.drawString("переменной x{"+n+"}, вводимой в базис, не является положительным.",81,160);
            if(entry==false) Mist_under[13]++; entry=true;
          }
        }
        else if(otv==1){
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
      if(((stepSM==2) && (stepVG==1)) && ((sh-2)%5==0)){
        otvet="";
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString(k+"."+(r+1)+".1.",10, 80);
        g.setColor(new Color(0, 0, 80));
        if(slog==2)
        {
          Stringer.drawString("Вычислите новое базисное решение и занесите результаты пересчета в",54, 80);
          g.setFont(new java.awt.Font("SansSerif", 3, 14));
          g.drawString("Таблицу "+(r+1)+".",12, 100);
          g.setColor(Color.red);
          g.drawString("Таблицу "+(r+1),12, 100);
          jCheckBox1.setText("Таблица "+r);
          jCheckBox1.setVisible(true);  jCheckBox1.setEnabled(true);
          g.setColor(Color.red);
          if(edt==true){
            if((Right==false) || (RightPust==false)){
             /* StringerD.drawString("Неправильно",258,130);
              if(Right==false) otvet="( Таблица заполнена неверно. ";
              else otvet="(";
              if(RightPust==false) otvet=otvet+" Не оставляйте поля пустыми. )";
              else otvet=otvet+")";*/
              otvet="Неправильно, внесите заново необходимые элементы таблицы";
              StringerD.drawString(otvet,(600-Fm.stringWidth(otvet)*11/6)/2,150);
            }
            else{
              g.setColor(Color.blue);
              StringerD.drawString("Правильно",267,130);
              jButton1.setEnabled(true);
            }
          }
        }
        else
        {
          Stringer.drawString("Вычисляем новое базисное решение и заносим результаты пересчета в",54, 80);
          g.setFont(new java.awt.Font("SansSerif", 3, 14));
          g.drawString("Таблицу "+(r+1)+".",12, 100);
          g.setColor(Color.red);
          g.drawString("Таблицу "+(r+1),12, 100);
          jCheckBox1.setText("Таблица "+r);
          jCheckBox1.setVisible(true);  jCheckBox1.setEnabled(true);
        }
      }
      if(((stepSM==3) && (stepVG==1)) && ((sh-2)%5==3)){
        otvet=""; ModifyFanc(tn,td,Xn,Xd,sf);
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString(k+"."+(r+1)+".3.",10, 80);
        if(slog>=1)
        {
          g.setColor(new Color(0, 0, 40)); g.setFont(new java.awt.Font("SansSerif", 3, 14));
          g.drawString("Оптимальное решение задачи ЗЛП - "+k+" является",54, 80);
          jRadioButton1.setText("целочисленным");
          jRadioButton1.setBounds(new Rectangle(410,65,170,20));
          jRadioButton2.setText("нецелочисленным");
          jRadioButton2.setBounds(new Rectangle(410,85,190,20));
          jRadioButton3.setText("пустым множеством");
          jRadioButton3.setBounds(new Rectangle(410,105,198,20));
          jRadioButton1.setVisible(true); jRadioButton1.setEnabled(true);
          jRadioButton2.setVisible(true); jRadioButton2.setEnabled(true);
          jRadioButton3.setVisible(true); jRadioButton3.setEnabled(true);
          if(otv!=-1){
            if(((otv==1) && (Xn[k][0]==1)) || ((otv==2) && (Xn[k][0]==0)) || ((otv==3) && (Xn[k][0]==-1))){
              if(otv==1){ jRadioButton2.setEnabled(false); jRadioButton3.setEnabled(false);}
              if(otv==2){ jRadioButton1.setEnabled(false); jRadioButton3.setEnabled(false);}
              if(otv==3){ jRadioButton1.setEnabled(false); jRadioButton2.setEnabled(false); jButton1.setEnabled(true); edt=true;}
              g.setColor(Color.blue);
              StringerD.drawString("Правильно",267,112); otv0=otv;
              if((otv0!=3) && (k>0)){
                if(slog==2)
                {
                  jButton3.setEnabled(true); //jButton3.setVisible(true);
                  g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
                  Stringer.drawString("Вычислите значение целевой функции на оптимальном решении:",20, 135);
                  Stringer.drawString(sf[0],345-Fm.stringWidth(sf[0])*5/3, 160);
                  jTextField22.setVisible(true); jTextField22.setEnabled(true);
                  jTextField22.setBounds(new Rectangle(345,143,50,23));
                  if(edt==true){
                    if((Right==false) || (RightPust==false)){
                      g.setColor(Color.red);
                      if(Right==false) otvet="Неправильно";
                      else  if(RightPust==false) otvet="Не оставляйте поле пустым.";
                              StringerD.drawString(otvet,402,160);
                    }
                    else{
                      g.setColor(Color.blue);
                      StringerD.drawString("Правильно",402,160);
                      jTextField22.setEnabled(false); //jButton1.setEnabled(true);
                      jButton3.setEnabled(false); //jButton3.setVisible(false);
                    }
                  }
                }
                else if((otv0!=3) && (k>0))
                {
                  g.setColor(new Color(0, 0, 80));
                  Stringer.drawString("Значение целевой функции на оптимальном решении:",100, 138);
                  Stringer.drawString(sf[0]+fun+".",350-Fm.stringWidth(sf[0])*5/3, 160);
                  jButton1.setEnabled(true); edt=true;
                }
              }
              else
               jButton1.setEnabled(true);
            }
            else{
              if(Xn[k][0]==-1){
                int u=0;
                for(int i=0; i<=c; i++)
                  if((tbn[0][bp[i]]==-1000) && (tbn[i+1][0]!=0))
                    u=bp[i];
                g.setColor(Color.red);
                StringerD.drawString("( Так как искусственная переменная x_{"+u+"} в оптимальном решении не равна нулю. )",20,140);
              }
              g.setColor(Color.red);
              StringerD.drawString("Неправильно",258,125); if(entry==false) Mist_knowledge[18]++; entry=true;
            }
          }
        }
        else
        {
          g.setColor(new Color(0, 0, 80));
          Stringer.drawString("Оптимальное решение задачи ЗЛП - "+k+" ",54, 80);
          switch (Xn[k][0])
          {
            case 1:
              otv0=1;
              Stringer.drawString("целочисленное.", 332, 80);
              Stringer.drawString("Значение целевой функции на оптимальном решении:",54, 110);
              Stringer.drawString(sf[0]+fun+".",380-Fm.stringWidth(sf[0])*5/3, 135);
              break;
            case 0:
              otv0=2;
              Stringer.drawString("нецелочисленное.", 332, 80);
              Stringer.drawString("Значение целевой функции на оптимальном решении:",54, 110);
              Stringer.drawString(sf[0]+fun+".",380-Fm.stringWidth(sf[0])*5/3, 135);
              break;
            case -1:
              otv0=3;
              Stringer.drawString("пустое множество.", 332, 80);
              break;
            default:
              jPanel3.repaint();
          }
        }
      }

      if(((stepSM==3) && (stepVG==1)) && ((sh-2)%5==4)){
        otvet="";
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString(k+"."+(r+2)+".1.",10, 80);
        if((otv0==1) && (Nfn==k)){
          g.setColor(new Color(0, 0, 80));
          Stringer.drawString("Так как x^{"+k+"} - первое целочиcленное решение, то полагаем     = f(x^{"+k+"}) = "+fn+".",54, 80);
          g.setColor(Color.red); Ind_f(g,475,80);
          g.setColor(new Color(0, 0, 40)); g.setFont(new java.awt.Font("SansSerif", 3, 14));
          g.drawString("Выберете один из вариантов:",20, 100);
          jRadioButton1.setBounds(new Rectangle(242,85,358,20));
          jRadioButton2.setBounds(new Rectangle(242,105,358,20));
        }
        else{
          g.setColor(new Color(0, 0, 40)); g.setFont(new java.awt.Font("SansSerif", 3, 14));
          g.drawString("Выберете один из вариантов:",50, 80);
          jRadioButton1.setBounds(new Rectangle(142,85,378,20));
          jRadioButton2.setBounds(new Rectangle(142,107,378,20));
        }
        jRadioButton1.setText("номер задачи k = "+k+" включаем в множество J");
        jRadioButton2.setText("номер задачи k = "+k+" не включаем в множество J");
        jRadioButton1.setVisible(true); jRadioButton1.setEnabled(true);
        jRadioButton2.setVisible(true); jRadioButton2.setEnabled(true);
        jButton3.setEnabled(false); jButton1.setEnabled(false);
        if(otv!=-1){
          if((((otv0==1) || (otv0==3)) && (otv==2)) || ((otv0==2) && (otv==1))){
            if(otv==1) jRadioButton2.setEnabled(false);
            if(otv==2) jRadioButton1.setEnabled(false);
            g.setColor(Color.blue);
            StringerD.drawString("Правильно",267,150);
            for(int i=0; i<=6; i++)
              JPr[i]=J[i];
            jButton1.setEnabled(true);
          }
          else{
            g.setColor(Color.red);
            if((otv0==2) && (otv==2)){
              StringerD.drawString("Неправильно, так как решение задачи, ЗЛП - "+k+" нецелочисленное и",70,145);
              StringerD.drawString("значение     еще не найдено.",206,160);
              Ind_f(g,279,160); if(entry==false) Mist_knowledge[18]++; entry=true;
            }
            if((otv0==3) && (otv==1)){
              StringerD.drawString("Неправильно, так как множество допустимых решений задачи ЗЛП - "+k+" пусто.",35,150);
              if(entry==false) Mist_knowledge[37]++; entry=true;
            }
            if((otv0==1) && (otv==1)){
              StringerD.drawString("Неправильно, так как ветвление задачи в которой получено",93,145);
              StringerD.drawString("целочисленное решение далее не производится.",128,160);
              if(entry==false) Mist_knowledge[18]++; entry=true;
            }
          }
        }
        if(AddRAnswer==false){ RightAnswer++; AddRAnswer=true;}
      }
      if(((stepSM==3) && (stepVG==1)) && ((sh-2)%5==0)){
        otvet=""; int vr=0;
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString(k+"."+(r+2)+".2.",10, 80);
        if(slog>=1)
        {
          if(AddRAnswer==false){ RightAnswer++; AddRAnswer=true;}
          g.setColor(new Color(0, 0, 40)); g.setFont(new java.awt.Font("SansSerif", 3, 14));
          g.drawString("Включить решение      в множество     ?",54, 80);
          g.drawString("X",316,80); Ind_v(g,"","*",329,78); Ind_v(g,"x",""+k,202,80);
          jRadioButton1.setBounds(new Rectangle(350,65,130,20));
          jRadioButton2.setBounds(new Rectangle(350,85,140,20));
          jRadioButton1.setText("включить");
          jRadioButton2.setText("не включать");
          jRadioButton1.setVisible(true); jRadioButton1.setEnabled(true);
          jRadioButton2.setVisible(true); jRadioButton2.setEnabled(true);
          jButton3.setEnabled(false); jButton1.setEnabled(false);
          if(otv!=-1){
            if(((XVG[k]==0) && (otv==2)) || ((XVG[k]==1) && (otv==1))){
              if(otv==1) jRadioButton2.setEnabled(false);
              if(otv==2) jRadioButton1.setEnabled(false);
              g.setColor(Color.blue);
              StringerD.drawString("Правильно",267,130);
              for(int i=0; i<=6; i++)
                XPr[i]=XVG[i];
              jButton1.setEnabled(true);
            }
            else{
              g.setColor(Color.red); if(entry==false) Mist_knowledge[29]++; entry=true;
              if((otv0!=1) && (otv==1))
                StringerD.drawString("Неправильно, так как решение задачи ЗЛП - "+k+" не является целочисленным.",37,130);
              if((otv0==1) && (otv==1))
                StringerD.drawString("Неправильно, так как f(x^{"+k+"}) < /{f}{} .",202,130);
              if((otv0==1) && (otv==2)){
                int Z=0;
                for(int i=0; i<k; i++)
                  if(XVG[i]==1) Z++;
                if(Z>0){
                  StringerD.drawString("Неправильно, так как решение задачи ЗЛП - "+k+" целочисленное и",80,130);
                  StringerD.drawString("значение функции f(x^{"+k+"}) \u2265 /{f}{}!",211,145);
                }
                else
                  StringerD.drawString("Неправильно, так как решение задачи ЗЛП - "+k+" - первое целочисленное решение!",17,130);
              }
            }
          }
        }
        else
        {
          if(XVG[k]==0)
          {
            g.setColor(new Color(0, 0, 80));
            Stringer.drawString("Решение      не включаем в множество     .",54, 80);
            g.setFont(new java.awt.Font("SansSerif", 3, 14));
            g.drawString("X",337,80); Ind_v(g,"","*",350,78); Ind_v(g,"x",""+k,124,80);
          }
          if(XVG[k]==1)
          {
            g.setColor(new Color(0, 0, 80));
            Stringer.drawString("Решение      включаем в множество     .",54, 80);
            g.setFont(new java.awt.Font("SansSerif", 3, 14));
            g.drawString("X",316,80); Ind_v(g,"","*",329,78); Ind_v(g,"x",""+k,124,80);
          }
          for(int i=0; i<=6; i++)
            XPr[i]=XVG[i];
        }
      }
      if(((stepSM==3) && (stepVG==1)) && ((sh-2)%5==1)){
        otvet=""; ModifyFanc(tn,td,Xn,Xd,sf);
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString(k+"."+(r+2)+".3.",10, 80);
        g.setColor(new Color(0, 0, 40)); g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("Выберите координату для ветвления задачи ЗЛП - "+k+":",54, 80);
        jRadioButton1.setText("первая координата");
        jRadioButton1.setBounds(new Rectangle(444,65,164,20));
        jRadioButton2.setText("вторая координата");
        jRadioButton2.setBounds(new Rectangle(444,85,164,20));
        jRadioButton1.setVisible(true); jRadioButton1.setEnabled(true);
        jRadioButton2.setVisible(true); jRadioButton2.setEnabled(true);
        if(edt==false)
          jButton1.setEnabled(false);
        if(otv!=-1){
          if(((otv==1) && (Xd[k][1]!=1)) || ((otv==2) && (Xd[k][2]!=1))){
            //jButton3.setVisible(true);
            NX=otv;
            g.setColor(new Color(0, 0, 80));
            if(slog==2)
            {
              if(AddRAnswer==false){ RightAnswer=RightAnswer+3; AddRAnswer=true;}
              jButton3.setEnabled(true);
              Stringer.drawString("Сформируйте дополнительные ограничения:",20, 115);
              Stringer.drawString("для ЗЛП - 1  x_{"+NX+"} \u2264                и     для ЗЛП - 2  x_{"+NX+"} \u2265           .",128, 140);
              jTextField23.setVisible(true);
              jTextField23.setBounds(new Rectangle(248,124,35,21));
              jTextField24.setVisible(true);
              jTextField24.setBounds(new Rectangle(454,124,35,21));
              if(edt==true){
                if((Right==false) || (RightPust==false)){
                  g.setColor(Color.red);
                  if(RightPust==true){
                    if((jTextField23.isEnabled()==true) && (jTextField24.isEnabled()==true))
                      StringerD.drawString("Неправильно составлены оба ограничения.",151,160);
                    else if((jTextField23.isEnabled()==true))
                           StringerD.drawString("Неправильно составлено первое ограничение.",138,160);
                           else if((jTextField24.isEnabled()==true))
                                  StringerD.drawString("Неправильноо составлено второе ограничение.",139,160);
                  }
                  else{
                    if(Right==true)
                      StringerD.drawString("Не оставляйте пустые поля.",208,160);
                    else if(jTextField23.getText().equals("")==true)
                           StringerD.drawString("Неправильно составлено второе ограничение. Не оставляйте пустые поля.",37,160);
                         else if(jTextField24.getText().equals("")==true)
                                StringerD.drawString("Неправильно составлено первое ограничение. Не оставляйте пустые поля.",37,160);
                  }
                }
                else{
                  if(otv==1) jRadioButton2.setEnabled(false);
                  if(otv==2) jRadioButton1.setEnabled(false);
                  g.setColor(Color.blue);
                  StringerD.drawString("Правильно",267,160);
            //      jButton1.setEnabled(true);
                  jButton3.setEnabled(false); //jButton3.setVisible(false);
                }
              }
            }
            else
            {
              if(AddRAnswer==false){ RightAnswer++; AddRAnswer=true;}
              Stringer.drawString("Формируем дополнительные ограничения:",20, 115);
              Stringer.drawString("для ЗЛП - 1  x_{"+NX+"} \u2264 "+(int)(Xn[k][NX]/Xd[k][NX])+"     и     для ЗЛП - 2  x_{"+NX+"} \u2265 "+(int)((Xn[k][NX]/Xd[k][NX])+1)+".",160, 140);
              jButton1.setEnabled(true);
            }
          }
          else{
            jButton3.setEnabled(false); //jButton3.setVisible(false);
            jTextField23.setVisible(false); jTextField24.setVisible(false);
            if(entry==false) Mist_under[20]++; entry=true;
            g.setColor(Color.red);
            StringerD.drawString("Неправильно, так как координата должна быть нецелочисленной.",72,135);
          }
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
        jButton3.setEnabled(false);
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

    }
  }

  void jButton1_actionPerformed(ActionEvent e) {
    jRadioButton.setSelected(true);
    jRadioButton1.setEnabled(false); jRadioButton1.setVisible(false);
    jRadioButton2.setEnabled(false); jRadioButton2.setVisible(false);
    jRadioButton3.setEnabled(false); jRadioButton3.setVisible(false);
    jCheckBox1.setSelected(false); jCheckBox1.setEnabled(false); jCheckBox1.setVisible(false);
    jCheckBoxRezult.setSelected(true); jCheckBoxRezult.setVisible(false); jCheckBoxRezult.setEnabled(false);
   // jComboBox1.setVisible(true); jComboBox1.setEnabled(true);
   // jComboBox2.setVisible(true); jComboBox2.setEnabled(true);
    jTextField22.setText(""); jTextField22.setEnabled(false); jTextField22.setVisible(false);
    jTextField23.setText(""); jTextField23.setEnabled(false); jTextField23.setVisible(false);
    jTextField24.setText(""); jTextField24.setEnabled(false); jTextField24.setVisible(false);
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
    edt=false; Right=true; RightPust=true; Ch=false; entry=false; AddRAnswer=false; pp=0;
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
    sh=0; stepSM=0; stepVG=0; edt=false; otv=-1; bpx=-1; entry=false;
    Right=true; RightPust=true; shag=false;
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
    jPanel2.repaint();
    jPanel1.repaint();
    jPanel3.repaint();
  }

  void jButton3_actionPerformed(ActionEvent e) {
    Right=true; RightPust=true; edt=true; ots=""; int index=-1; double Number=20000; String txt="";
    if((jTextField1.isEnabled()==true) && (jTextField1.getText().equals("")!=true)){
      try{
        if(tbn[0][2]==(int)(Double.parseDouble(jTextField1.getText()))){
          jTextField1.setText(""); jTextField1.setVisible(false); jTextField1.setEnabled(false);
        }
        else{ Right=false; Mist_under[2]++; jTextField1.setForeground(Color.red);}
      }
      catch(Exception ee){
        Right=false; Mist_under[2]++; jTextField1.setForeground(Color.red);
      }
    }
    else if((jTextField1.isEnabled()==true) && (jTextField1.getText().equals("")==true)) RightPust=false;
    if((jTextField2.isEnabled()==true) && (jTextField2.getText().equals("")!=true)){
       try{
        if(tbn[0][4]==(int)(Double.parseDouble(jTextField2.getText()))){
          jTextField2.setText(""); jTextField2.setVisible(false); jTextField2.setEnabled(false);
        }
        else { Right=false; Mist_under[3]++; jTextField2.setForeground(Color.red);}
      }
      catch(Exception ee){
        Right=false; Mist_under[3]++; jTextField2.setForeground(Color.red);
      }
    }
    else if((jTextField2.isEnabled()==true) && (jTextField2.getText().equals("")==true)) RightPust=false;
    if((jTextField3.isEnabled()==true) && (jTextField3.getText().equals("")!=true)){
      txt=jTextField3.getText();
      if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
        index=txt.indexOf("/");
        try{
          if(index==-1) Number=Double.parseDouble(txt);
          else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
          if((double)tbn[1][1]/tbd[1][1]==Number){
            jTextField3.setText(""); jTextField3.setVisible(false); jTextField3.setEnabled(false);
          }
          else{ Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField3.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField3.setForeground(Color.red);
        }
      }
      else{ Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField3.setForeground(Color.red);}
    }
    else if((jTextField3.isEnabled()==true) && (jTextField3.getText().equals("")==true)) RightPust=false;
    if((jTextField4.isEnabled()==true) && (jTextField4.getText().equals("")!=true)){
      txt=jTextField4.getText();
      if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
        index=txt.indexOf("/");
        try{
          if(index==-1) Number=Double.parseDouble(txt);
          else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
          if((double)tbn[1][3]/tbd[1][3]==Number){
            jTextField4.setText(""); jTextField4.setVisible(false); jTextField4.setEnabled(false);
          }
          else{ Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField4.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField4.setForeground(Color.red);
        }
      }
      else{ Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField4.setForeground(Color.red);}
    }
    else if((jTextField4.isEnabled()==true) && (jTextField4.getText().equals("")==true)) RightPust=false;
    if((jTextField5.isEnabled()==true) && (jTextField5.getText().equals("")!=true)){
      txt=jTextField5.getText();
      if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
        index=txt.indexOf("/");
        try{
          if(index==-1) Number=Double.parseDouble(txt);
          else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
          if((double)tbn[1][5]/tbd[1][5]==Number){
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
    if((jTextField6.isEnabled()==true) && (jTextField6.getText().equals("")!=true)){
      txt=jTextField6.getText();
      if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
        index=txt.indexOf("/");
        try{
          if(index==-1) Number=Double.parseDouble(txt);
          else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
          if((double)tbn[1][7]/tbd[1][7]==Number){
            jTextField6.setText(""); jTextField6.setVisible(false); jTextField6.setEnabled(false);
          }
          else{ Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField6.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField6.setForeground(Color.red);
        }
      }
      else{ Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField6.setForeground(Color.red);}
    }
    else if((jTextField6.isEnabled()==true) && (jTextField6.getText().equals("")==true)) RightPust=false;
    if((jTextField7.isEnabled()==true) && (jTextField7.getText().equals("")!=true)){
      txt=jTextField7.getText();
      if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
        index=txt.indexOf("/");
        try{
          if(index==-1) Number=Double.parseDouble(txt);
          else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
          if((double)tbn[2][0]/tbd[2][0]==Number){
            jTextField7.setText(""); jTextField7.setVisible(false); jTextField7.setEnabled(false);
          }
          else{ Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField7.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField7.setForeground(Color.red);
        }
      }
      else{ Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField7.setForeground(Color.red);}
    }
    else if((jTextField7.isEnabled()==true) && (jTextField7.getText().equals("")==true)) RightPust=false;
    if((jTextField8.isEnabled()==true) && (jTextField8.getText().equals("")!=true)){
      txt=jTextField8.getText();
      if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
        index=txt.indexOf("/");
        try{
          if(index==-1) Number=Double.parseDouble(txt);
          else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
          if((double)tbn[2][2]/tbd[2][2]==Number){
            jTextField8.setText(""); jTextField8.setVisible(false); jTextField8.setEnabled(false);
          }
          else{ Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField8.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField8.setForeground(Color.red);
        }
      }
      else{ Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField8.setForeground(Color.red);}
    }
    else if((jTextField8.isEnabled()==true) && (jTextField8.getText().equals("")==true)) RightPust=false;
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
    if((jTextField10.isEnabled()==true) && (jTextField10.getText().equals("")!=true)){
      txt=jTextField10.getText();
      if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
        index=txt.indexOf("/");
        try{
          if(index==-1) Number=Double.parseDouble(txt);
          else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
          if((double)tbn[2][6]/tbd[2][6]==Number){
            jTextField10.setText(""); jTextField10.setVisible(false); jTextField10.setEnabled(false);
          }
          else{ Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField10.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField10.setForeground(Color.red);
        }
      }
      else{ Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField10.setForeground(Color.red);}
    }
    else if((jTextField10.isEnabled()==true) && (jTextField10.getText().equals("")==true)) RightPust=false;
    if((jTextField11.isEnabled()==true) && (jTextField11.getText().equals("")!=true)){
      txt=jTextField11.getText();
      if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
        index=txt.indexOf("/");
        try{
          if(index==-1) Number=Double.parseDouble(txt);
          else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
          if((double)tbn[3][1]/tbd[3][1]==Number){
            jTextField11.setText(""); jTextField11.setVisible(false); jTextField11.setEnabled(false);
          }
          else{ Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField11.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField11.setForeground(Color.red);
        }
      }
      else{ Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField11.setForeground(Color.red);}
    }
    else if((jTextField11.isEnabled()==true) && (jTextField11.getText().equals("")==true)) RightPust=false;
    if((jTextField12.isEnabled()==true) && (jTextField12.getText().equals("")!=true)){
      txt=jTextField12.getText();
      if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
        index=txt.indexOf("/");
        try{
          if(index==-1) Number=Double.parseDouble(txt);
          else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
          if((double)tbn[3][3]/tbd[3][3]==Number){
            jTextField12.setText(""); jTextField12.setVisible(false); jTextField12.setEnabled(false);
          }
          else{ Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField12.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField12.setForeground(Color.red);
        }
      }
      else{ Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField12.setForeground(Color.red);}
    }
    else if((jTextField12.isEnabled()==true) && (jTextField12.getText().equals("")==true)) RightPust=false;
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
    if((jTextField14.isEnabled()==true) && (jTextField14.getText().equals("")!=true)){
      txt=jTextField14.getText();
      if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
        index=txt.indexOf("/");
        try{
          if(index==-1) Number=Double.parseDouble(txt);
          else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
          if((double)tbn[3][7]/tbd[3][7]==Number){
            jTextField14.setText(""); jTextField14.setVisible(false); jTextField14.setEnabled(false);
          }
          else{ Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField14.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField14.setForeground(Color.red);
        }
      }
      else{ Right=false; if(stepSM==1) Mist_under[2]++; else Mist_calk[8]++; jTextField14.setForeground(Color.red);}
    }
    else if((jTextField14.isEnabled()==true) && (jTextField14.getText().equals("")==true)) RightPust=false;
    if((jTextField15.isEnabled()==true) && (jTextField15.getText().equals("")!=true)){
      if((((int)Math.round(tbn[4][1]/1000.0))>-1) && (((int)Math.round(tbn[4][1]/1000.0))<1)){
        txt=jTextField15.getText();
        if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
          index=txt.indexOf("/");
          try{
            if(index==-1) Number=Double.parseDouble(txt);
            else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
            if((double)tbn[4][1]/tbd[4][1]==Number){
              jTextField15.setText(""); jTextField15.setVisible(false); jTextField15.setEnabled(false);
            }
            else{ Right=false; ots=ots+" \u2206_{1}"; if(stepSM==1) Mist_calk[3]++; else Mist_calk[10]++; jTextField15.setForeground(Color.red);}
          }
          catch(Exception ee){
            Right=false; ots=ots+" \u2206_{1}"; if(stepSM==1) Mist_calk[3]++; else Mist_calk[10]++; jTextField15.setForeground(Color.red);
          }
        }
        else{ Right=false; ots=ots+" \u2206_{1}";  if(stepSM==1) Mist_calk[3]++; else Mist_calk[10]++; jTextField15.setForeground(Color.red);}
      }
      else if(jTextField15.getText().equals(Delta[1])==true || jTextField15.getText().equals(Delta1[1])==true){
             jTextField15.setText(""); jTextField15.setVisible(false); jTextField15.setEnabled(false);
           }
           else{ Right=false; ots=ots+" \u2206_{1}";  if(stepSM==1) Mist_calk[3]++; else Mist_calk[10]++; jTextField15.setForeground(Color.red);}
    }
    else if((jTextField15.isEnabled()==true) && (jTextField15.getText().equals("")==true)) RightPust=false;
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
      else if(jTextField16.getText().equals(Delta[2])==true || jTextField16.getText().equals(Delta1[2])==true){
             jTextField16.setText(""); jTextField16.setVisible(false); jTextField16.setEnabled(false);
           }
           else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{2}";
                  if(stepSM==1) Mist_calk[3]++; else Mist_calk[10]++; jTextField16.setForeground(Color.red);}
    }
    else if((jTextField16.isEnabled()==true) && (jTextField16.getText().equals("")==true)) RightPust=false;
    if((jTextField17.isEnabled()==true) && (jTextField17.getText().equals("")!=true)){
      if((((int)Math.round(tbn[4][3]/1000.0))>-1) && (((int)Math.round(tbn[4][3]/1000.0))<1)){
        txt=jTextField17.getText();
        if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
          index=txt.indexOf("/");
          try{
            if(index==-1) Number=Double.parseDouble(txt);
            else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
            if((double)tbn[4][3]/tbd[4][3]==Number){
              jTextField17.setText(""); jTextField17.setVisible(false); jTextField17.setEnabled(false);
            }
            else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{3}";
                   if(stepSM==1) Mist_calk[3]++; else Mist_calk[10]++; jTextField17.setForeground(Color.red);}
          }
          catch(Exception ee){
            Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{3}";
            if(stepSM==1) Mist_calk[3]++; else Mist_calk[10]++; jTextField17.setForeground(Color.red);
          }
        }
        else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{3}";
              if(stepSM==1) Mist_calk[3]++; else Mist_calk[10]++; jTextField17.setForeground(Color.red);}
      }
      else if(jTextField17.getText().equals(Delta[3])==true || jTextField17.getText().equals(Delta1[3])==true){
             jTextField17.setText(""); jTextField17.setVisible(false); jTextField17.setEnabled(false);
           }
           else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{3}";
                 if(stepSM==1) Mist_calk[3]++; else Mist_calk[10]++; jTextField17.setForeground(Color.red);}
    }
    else if((jTextField17.isEnabled()==true) && (jTextField17.getText().equals("")==true)) RightPust=false;
    if((jTextField18.isEnabled()==true) && (jTextField18.getText().equals("")!=true)){
      if((((int)Math.round(tbn[4][4]/1000.0))>-1) && (((int)Math.round(tbn[4][4]/1000.0))<1)){
        txt=jTextField18.getText();
        if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
          index=txt.indexOf("/");
          try{
            if(index==-1) Number=Double.parseDouble(txt);
            else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
            if((double)tbn[4][4]/tbd[4][4]==Number){
              jTextField18.setText(""); jTextField18.setVisible(false); jTextField18.setEnabled(false);
            }
            else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{4}";
                   if(stepSM==1) Mist_calk[3]++; else Mist_calk[10]++; jTextField18.setForeground(Color.red);}
          }
          catch(Exception ee){
            Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{4}";
            if(stepSM==1) Mist_calk[3]++; else Mist_calk[10]++; jTextField18.setForeground(Color.red);
          }
        }
        else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{4}";
              if(stepSM==1) Mist_calk[3]++; else Mist_calk[10]++; jTextField18.setForeground(Color.red);}
      }
      else if(jTextField18.getText().equals(Delta[4])==true || jTextField18.getText().equals(Delta1[4])==true){
             jTextField18.setText(""); jTextField18.setVisible(false); jTextField18.setEnabled(false);
           }
           else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{4}";
                 if(stepSM==1) Mist_calk[3]++; else Mist_calk[10]++; jTextField18.setForeground(Color.red);}
    }
    else if((jTextField18.isEnabled()==true) && (jTextField18.getText().equals("")==true)) RightPust=false;
    if((jTextField19.isEnabled()==true) && (jTextField19.getText().equals("")!=true)){
      if((((int)Math.round(tbn[4][5]/1000.0))>-1) && (((int)Math.round(tbn[4][5]/1000.0))<1)){
        txt=jTextField19.getText();
        if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
          index=txt.indexOf("/");
          try{
            if(index==-1) Number=Double.parseDouble(txt);
            else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
            if((double)tbn[4][5]/tbd[4][5]==Number){
              jTextField19.setText(""); jTextField19.setVisible(false); jTextField19.setEnabled(false);
            }
            else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{5}";
                  if(stepSM==1) Mist_calk[3]++; else Mist_calk[10]++; jTextField19.setForeground(Color.red);}
          }
          catch(Exception ee){
            Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{5}";
            if(stepSM==1) Mist_calk[3]++; else Mist_calk[10]++; jTextField19.setForeground(Color.red);
          }
        }
        else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{5}";
              if(stepSM==1) Mist_calk[3]++; else Mist_calk[10]++; jTextField19.setForeground(Color.red);}
      }
      else if(jTextField19.getText().equals(Delta[5])==true || jTextField19.getText().equals(Delta1[5])==true){
             jTextField19.setText(""); jTextField19.setVisible(false); jTextField19.setEnabled(false);
           }
           else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{5}";
                 if(stepSM==1) Mist_calk[3]++; else Mist_calk[10]++; jTextField19.setForeground(Color.red);}
    }
    else if((jTextField19.isEnabled()==true) && (jTextField19.getText().equals("")==true)) RightPust=false;
    if((jTextField20.isEnabled()==true) && (jTextField20.getText().equals("")!=true)){
      if((((int)Math.round(tbn[4][6]/1000.0))>-1) && (((int)Math.round(tbn[4][6]/1000.0))<1)){
        txt=jTextField20.getText();
        if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
          index=txt.indexOf("/");
          try{
            if(index==-1) Number=Double.parseDouble(txt);
            else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
            if((double)tbn[4][6]/tbd[4][6]==Number){
              jTextField20.setText(""); jTextField20.setVisible(false); jTextField20.setEnabled(false);
            }
            else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{6}";
                  if(stepSM==1) Mist_calk[3]++; else Mist_calk[10]++; jTextField20.setForeground(Color.red);}
          }
          catch(Exception ee){
            Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{6}";
            if(stepSM==1) Mist_calk[3]++; else Mist_calk[10]++; jTextField20.setForeground(Color.red);
          }
        }
        else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{6}";
              if(stepSM==1) Mist_calk[3]++; else Mist_calk[10]++; jTextField20.setForeground(Color.red);}
      }
      else if(jTextField20.getText().equals(Delta[6])==true || jTextField20.getText().equals(Delta1[6])==true){
             jTextField20.setText(""); jTextField20.setVisible(false); jTextField20.setEnabled(false);
           }
           else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{6}";
                 if(stepSM==1) Mist_calk[3]++; else Mist_calk[10]++; jTextField20.setForeground(Color.red);}
    }
    else if((jTextField20.isEnabled()==true) && (jTextField20.getText().equals("")==true)) RightPust=false;
    if((jTextField21.isEnabled()==true) && (jTextField21.getText().equals("")!=true)){
      if((((int)Math.round(tbn[4][7]/1000.0))>-1) && (((int)Math.round(tbn[4][7]/1000.0))<1)){
        txt=jTextField21.getText();
        if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
          index=txt.indexOf("/");
          try{
            if(index==-1) Number=Double.parseDouble(txt);
            else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
            if((double)tbn[4][7]/tbd[4][7]==Number){
              jTextField21.setText(""); jTextField21.setVisible(false); jTextField21.setEnabled(false);
            }
            else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{7}";
                  if(stepSM==1) Mist_calk[3]++; else Mist_calk[10]++; jTextField21.setForeground(Color.red);}
          }
          catch(Exception ee){
            Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{7}";
            if(stepSM==1) Mist_calk[3]++; else Mist_calk[10]++; jTextField21.setForeground(Color.red);
          }
        }
        else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{7}";
              if(stepSM==1) Mist_calk[3]++; else Mist_calk[10]++; jTextField21.setForeground(Color.red);}
      }
      else if(jTextField21.getText().equals(Delta[7])==true || jTextField21.getText().equals(Delta1[7])==true){
             jTextField21.setText(""); jTextField21.setVisible(false); jTextField21.setEnabled(false);
           }
           else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{7}";
              if(stepSM==1) Mist_calk[3]++; else Mist_calk[10]++; jTextField21.setForeground(Color.red);}
    }
    else if((jTextField21.isEnabled()==true) && (jTextField21.getText().equals("")==true)) RightPust=false;
    if((jTextField22.isEnabled()==true) && (jTextField22.getText().equals("")!=true)){
      txt=jTextField22.getText(); ModifyF(an,c,tbn,Xn,Xd,k);
      if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
        index=txt.indexOf("/");
        try{
          if(index==-1) Number=Double.parseDouble(txt);
          else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
          if((double)fnk/fdk==Number){
            jTextField22.setEnabled(false);
          }
          else{ Right=false; Mist_calk[0]++; jTextField22.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; Mist_calk[0]++; jTextField22.setForeground(Color.red);
        }
      }
      else{ Right=false; Mist_calk[0]++; jTextField22.setForeground(Color.red);}
    }
    else if((jTextField22.isEnabled()==true) && (jTextField22.getText().equals("")==true)) RightPust=false;
    if((jTextField23.isEnabled()==true) && (jTextField23.getText().equals("")!=true)){
      try{
        if((int)(Xn[k][NX]/Xd[k][NX])==(int)(Double.parseDouble(jTextField23.getText()))){
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
        if((int)(Xn[k][NX]/Xd[k][NX])+1==(int)(Double.parseDouble(jTextField24.getText()))){
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

/*  void jComboBox1_itemStateChanged(ItemEvent e) {
    vrt=jComboBox1.getSelectedIndex();
    sh=1; stepSM=0; stepVG=0; entry=false;
    jPanel1.repaint();
    jPanel2.repaint();
    jPanel3.repaint();
  }

  void jComboBox2_itemStateChanged(ItemEvent e) {
    slog=jComboBox2.getSelectedIndex();
    sh=1; stepSM=0; stepVG=0; entry=false;
    jPanel1.repaint();
    jPanel2.repaint();
    jPanel3.repaint();
  }*/

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
    if(((stepSM==1) || (stepSM==2)) && (stepVG==1)  && (((sh-2)%5==3) || ((sh-2)%5==4))){
      if(otv!=1) otv=-1;
      edt=true;
      jPanel3.repaint();
    }
  }

  void jPanel2_mouseClicked(MouseEvent e){
    if(((stepSM==1) || (stepSM==2)) && (stepVG==1)  && (((sh-2)%5==3) || ((sh-2)%5==4))){
        edt=true; entry=false;
        Kx=e.getX(); Ky=e.getY();
        jPanel2.repaint();
       // jPanel3.repaint();
    }
    if(stepVG==5 && e.getX()>=511 && e.getX()<=526 && e.getY()>=3 && e.getY()<=18){
      jCheckBoxRezult.setSelected(false);
      Ch=false;
      jPanel2.repaint();
      //jCheckBoxRezult.setOpaque(true);
    }
  }

  void jPanel3_mouseClicked(MouseEvent e){
    if(((stepSM==1) || (stepSM==2)) && (stepVG==1)  && (((sh-2)%5==3) || ((sh-2)%5==4))){
      if(otv!=1) otv=-1;
      edt=true;
      jPanel3.repaint();
    }
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

  void jTextField1_inputMethodTextChanged(InputMethodEvent e) {
    jTextField1.setForeground(new Color(0, 0, 120));
  }
  void jTextField2_inputMethodTextChanged(InputMethodEvent e) {
    jTextField2.setForeground(new Color(0, 0, 120));
  }
  void jTextField3_inputMethodTextChanged(InputMethodEvent e) {
    jTextField3.setForeground(new Color(0, 0, 120));
  }
  void jTextField4_inputMethodTextChanged(InputMethodEvent e) {
    jTextField4.setForeground(new Color(0, 0, 120));
  }
  void jTextField5_inputMethodTextChanged(InputMethodEvent e) {
    jTextField5.setForeground(new Color(0, 0, 120));
  }
  void jTextField6_inputMethodTextChanged(InputMethodEvent e) {
    jTextField6.setForeground(new Color(0, 0, 120));
  }
  void jTextField7_inputMethodTextChanged(InputMethodEvent e) {
    jTextField7.setForeground(new Color(0, 0, 120));
  }
  void jTextField8_inputMethodTextChanged(InputMethodEvent e) {
    jTextField8.setForeground(new Color(0, 0, 120));
  }
  void jTextField9_inputMethodTextChanged(InputMethodEvent e) {
    jTextField9.setForeground(new Color(0, 0, 120));
  }
  void jTextField10_inputMethodTextChanged(InputMethodEvent e) {
    jTextField10.setForeground(new Color(0, 0, 120));
  }
  void jTextField11_inputMethodTextChanged(InputMethodEvent e) {
    jTextField11.setForeground(new Color(0, 0, 120));
  }
  void jTextField12_inputMethodTextChanged(InputMethodEvent e) {
    jTextField12.setForeground(new Color(0, 0, 120));
  }
  void jTextField13_inputMethodTextChanged(InputMethodEvent e) {
    jTextField13.setForeground(new Color(0, 0, 120));
  }
  void jTextField14_inputMethodTextChanged(InputMethodEvent e) {
    jTextField14.setForeground(new Color(0, 0, 120));
  }
  void jTextField15_inputMethodTextChanged(InputMethodEvent e) {
    jTextField15.setForeground(new Color(0, 0, 120));
  }
  void jTextField16_inputMethodTextChanged(InputMethodEvent e) {
    jTextField16.setForeground(new Color(0, 0, 120));
  }
  void jTextField17_inputMethodTextChanged(InputMethodEvent e) {
    jTextField17.setForeground(new Color(0, 0, 120));
  }
  void jTextField18_inputMethodTextChanged(InputMethodEvent e) {
    jTextField18.setForeground(new Color(0, 0, 120));
  }
  void jTextField19_inputMethodTextChanged(InputMethodEvent e) {
    jTextField19.setForeground(new Color(0, 0, 120));
  }
  void jTextField20_inputMethodTextChanged(InputMethodEvent e) {
    jTextField20.setForeground(new Color(0, 0, 120));
  }
  void jTextField21_inputMethodTextChanged(InputMethodEvent e) {
    jTextField21.setForeground(new Color(0, 0, 120));
  }
  void jTextField22_inputMethodTextChanged(InputMethodEvent e) {
    jTextField22.setForeground(new Color(0, 0, 120));
  }
  void jTextField23_inputMethodTextChanged(InputMethodEvent e) {
    jTextField23.setForeground(new Color(0, 0, 120));
  }
  void jTextField24_inputMethodTextChanged(InputMethodEvent e) {
    jTextField24.setForeground(new Color(0, 0, 120));
  }
}
