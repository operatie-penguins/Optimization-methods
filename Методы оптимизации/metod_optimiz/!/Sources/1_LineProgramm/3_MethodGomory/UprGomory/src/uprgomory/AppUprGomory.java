package uprgomory;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.border.*;
import java.beans.*;
import javax.swing.event.*;

public class AppUprGomory extends JApplet {
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
  JTextField jTextField25 = new JTextField(6);
  JTextField jTextField26 = new JTextField(6);
  JTextField jTextField27 = new JTextField(6);
  JTextField jTextField28 = new JTextField(5);
  JTextField jTextField29 = new JTextField(6);
  JTextField jTextField30 = new JTextField(6);
  JTextField jTextField31 = new JTextField(6);
  JTextField jTextField32 = new JTextField(6);
  JTextField jTextField33 = new JTextField(6);
  JTextField jTextField34 = new JTextField(6);
  JRadioButton jRadioButton = new JRadioButton();
  JRadioButton jRadioButton1 = new JRadioButton();
  JRadioButton jRadioButton2 = new JRadioButton();
  JRadioButton jRadioButton3 = new JRadioButton();
  ButtonGroup buttonGroup1 = new ButtonGroup();
  JCheckBox jCheckBox1 = new JCheckBox();
  JCheckBox jCheckBoxRezult = new JCheckBox();
//  JLabel jLabel2 = new JLabel();
  static int xx,yy;
  public int[] Mist_knowledge=new int [40];
  public int[] Mist_calk=new int [40];
  public int[] Mist_under=new int [40];
  public int[] Mist_use=new int [40];
  public boolean Ch=false, entry=false, Right=true, RightPust=true, edt=false, IntF=false, fl=false, AddRAnswer=false;
  public int RightAnswer=0, sh=0, zd1=0, zd2=0, r=0, tup=18, bpx=-1, x=-1, slog=0,
             Kx=0, Ky=0, otv=-1, Numx=0, vrt = (int)(Math.random()*12);
  public String sm[]={""}, ss="", jj="", ogr="", ots="", s[]= {"","","","","","","","","","","",""}, Delta[]={"","","","","","","",""}, Delta1[]={"","","","","","","",""};
  public int a=0, c=0, a0=0, c0=0, an=0, cn=0, b=(600-120-(a+1)*60)/2, d=(int)Math.round(17*(4-c)/2), n=0, p=0, k=0, nm[]={0}, step1=0, step2=0,
             bp[]={0,0,0,0,0}, bp0[]={0,0,0,0,0},
             tbn[][]={ {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                       {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                       {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                       {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                       {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                       {20000,20000,20000,20000,20000,20000,20000,20000,20000} },
             tbd[][]={ {1,1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1,1} },
             tbn0[][]={ {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                       {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                       {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                        {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                       {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                       {20000,20000,20000,20000,20000,20000,20000,20000,20000} },
             tbd0[][]={ {1,1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1,1} },
             tn[][]={ {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                      {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                      {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                      {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                      {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                      {20000,20000,20000,20000,20000,20000,20000,20000,20000} },
             td[][]={ {1,1,1,1,1,1,1,1,1},
                      {1,1,1,1,1,1,1,1,1},
                      {1,1,1,1,1,1,1,1,1},
                      {1,1,1,1,1,1,1,1,1},
                      {1,1,1,1,1,1,1,1,1},
                      {1,1,1,1,1,1,1,1,1} },
              Ogrn[]={20000,20000,20000,20000,20000,20000,20000,20000,20000},
              Ogrd[]={1,1,1,1,1,1,1,1,1},
              Variant[]={0,1,2,3,4,5,6,7,8,9,10,11,1},
              Vr[]={0,0,0,0};

 /* public String variant[]={"        Вариант 1", "        Вариант 2", "        Вариант 3", "        Вариант 4",
                           "        Вариант 5", "        Вариант 6", "        Вариант 7", "        Вариант 8",
                           "        Вариант 9", "        Вариант 10", "        Вариант 11", "        Вариант 12"};
  public String slognost[]={" *", " **", " ***"};
  Border border1;
  JComboBox jComboBox1 = new JComboBox(variant);
  JComboBox jComboBox2 = new JComboBox(slognost);*/


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
    this.setSize(new Dimension(627, 501));
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
    jPanel2.setBounds(new Rectangle(5,180,621,140));
    this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseMoved(MouseEvent e) {
        this_mouseMoved(e);
      }
    });
    jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        jPanel2_mouseClicked(e);
      }
    });
    jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        jPanel1_mouseClicked(e);
      }
    });
    jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        jPanel3_mouseClicked(e);
      }
    });
    jPanel3.setLayout(null);
    jPanel3.setBounds(new Rectangle(5,322,621,128));
    jPanel3.setBackground(new Color(247, 247, 255));
    jButton1.setBackground(new Color(220, 230, 255));
    jButton1.setNextFocusableComponent(jButton2);
    jButton1.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton1.setForeground(new Color(0, 0, 60));
    jButton1.setText("==>");
    jButton1.setBounds(new Rectangle(383, 466, 100, 23));
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton1_actionPerformed(e);
      }
    });
    jButton2.setBackground(new Color(220, 230, 255));
    jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton2.setForeground(new Color(0, 0, 60));
    jButton2.setText("Обновить");
    jButton2.setBounds(new Rectangle(263, 466, 100, 23));
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton2_actionPerformed(e);
      }
    });
    jButton3.setBackground(new Color(220, 230, 255));
    jButton3.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton3.setForeground(new Color(0, 0, 120));
    jButton3.setText("Проверить");
    jButton3.setBounds(new Rectangle(143, 466, 100, 23));
   // jButton3.setBounds(new Rectangle(495, 93, 100, 23));
    jButton3.setEnabled(false);
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton3_actionPerformed(e);
      }
    });
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
    jTextField1.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField1_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField2.setVisible(false);
    jTextField2.setNextFocusableComponent(jTextField3);
    jTextField2.setDisabledTextColor(Color.blue);
    jTextField2.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField2.setText("");
    jTextField2.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField2.setForeground(new Color(0, 0, 120));
    jTextField2.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField2.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField2_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField3.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField3.setForeground(new Color(0, 0, 120));
    jTextField3.setText("");
    jTextField3.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField3.setVisible(false);
    jTextField3.setNextFocusableComponent(jTextField4);
    jTextField3.setDisabledTextColor(Color.blue);
    jTextField3.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField3.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField3_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField4.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField4.setForeground(new Color(0, 0, 120));
    jTextField4.setText("");
    jTextField4.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField4.setVisible(false);
    jTextField4.setNextFocusableComponent(jTextField5);
    jTextField4.setDisabledTextColor(Color.blue);
    jTextField4.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField4.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField4_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField5.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField5.setForeground(new Color(0, 0, 120));
    jTextField5.setText("");
    jTextField5.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField5.setVisible(false);
    jTextField5.setNextFocusableComponent(jTextField6);
    jTextField5.setDisabledTextColor(Color.blue);
    jTextField5.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField5.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField5_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField6.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField6.setForeground(new Color(0, 0, 120));
    jTextField6.setText("");
    jTextField6.setVisible(false);
    jTextField6.setNextFocusableComponent(jTextField7);
    jTextField6.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField6.setDisabledTextColor(Color.blue);
    jTextField6.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField6.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField6_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField7.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField7.setForeground(new Color(0, 0, 120));
    jTextField7.setText("");
    jTextField7.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField7.setVisible(false);
    jTextField7.setNextFocusableComponent(jTextField8);
    jTextField7.setDisabledTextColor(Color.blue);
    jTextField7.setBounds(new Rectangle(20, 528, 39, 17));
    jTextField7.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField7_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField8.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField8.setForeground(new Color(0, 0, 120));
    jTextField8.setText("");
    jTextField8.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField8.setVisible(false);
    jTextField8.setNextFocusableComponent(jTextField9);
    jTextField8.setDisabledTextColor(Color.blue);
    jTextField8.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField8.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField8_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField9.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField9.setForeground(new Color(0, 0, 120));
    jTextField9.setText("");
    jTextField9.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField9.setVisible(false);
    jTextField9.setNextFocusableComponent(jTextField10);
    jTextField9.setDisabledTextColor(Color.blue);
    jTextField9.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField9.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField9_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField10.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField10.setForeground(new Color(0, 0, 120));
    jTextField10.setText("");
    jTextField10.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField10.setVisible(false);
    jTextField10.setNextFocusableComponent(jTextField11);
    jTextField10.setDisabledTextColor(Color.blue);
    jTextField10.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField10.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField10_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField11.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField11.setForeground(new Color(0, 0, 120));
    jTextField11.setText("");
    jTextField11.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField11.setVisible(false);
    jTextField11.setNextFocusableComponent(jTextField12);
    jTextField11.setDisabledTextColor(Color.blue);
    jTextField11.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField11.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField11_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField12.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField12.setForeground(new Color(0, 0, 120));
    jTextField12.setText("");
    jTextField12.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField12.setVisible(false);
    jTextField12.setNextFocusableComponent(jTextField13);
    jTextField12.setDisabledTextColor(Color.blue);
    jTextField12.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField12.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField12_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField13.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField13.setForeground(new Color(0, 0, 120));
    jTextField13.setText("");
    jTextField13.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField13.setVisible(false);
    jTextField13.setNextFocusableComponent(jTextField14);
    jTextField13.setDisabledTextColor(Color.blue);
    jTextField13.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField13.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField13_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField14.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField14.setForeground(new Color(0, 0, 120));
    jTextField14.setText("");
    jTextField14.setVisible(false);
    jTextField14.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField14.setNextFocusableComponent(jTextField15);
    jTextField14.setDisabledTextColor(Color.blue);
    jTextField14.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField14.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField14_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField15.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField15.setForeground(new Color(0, 0, 120));
    jTextField15.setText("");
    jTextField15.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField15.setVisible(false);
    jTextField15.setNextFocusableComponent(jTextField16);
    jTextField15.setDisabledTextColor(Color.blue);
    jTextField15.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField15.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField15_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField16.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField16.setForeground(new Color(0, 0, 120));
    jTextField16.setText("");
    jTextField16.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField16.setVisible(false);
    jTextField16.setNextFocusableComponent(jTextField17);
    jTextField16.setDisabledTextColor(Color.blue);
    jTextField16.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField16.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField16_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField17.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField17.setForeground(new Color(0, 0, 120));
    jTextField17.setText("");
    jTextField17.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField17.setVisible(false);
    jTextField17.setNextFocusableComponent(jTextField18);
    jTextField17.setDisabledTextColor(Color.blue);
    jTextField17.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField17.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField17_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField18.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField18.setForeground(new Color(0, 0, 120));
    jTextField18.setText("");
    jTextField18.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField18.setVisible(false);
    jTextField18.setNextFocusableComponent(jTextField19);
    jTextField18.setDisabledTextColor(Color.blue);
    jTextField18.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField18.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField18_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField19.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField19.setForeground(new Color(0, 0, 120));
    jTextField19.setText("");
    jTextField19.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField19.setVisible(false);
    jTextField19.setNextFocusableComponent(jTextField20);
    jTextField19.setDisabledTextColor(Color.blue);
    jTextField19.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField19.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField19_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField20.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField20.setForeground(new Color(0, 0, 120));
    jTextField20.setText("");
    jTextField20.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField20.setVisible(false);
    jTextField20.setNextFocusableComponent(jTextField21);
    jTextField20.setDisabledTextColor(Color.blue);
    jTextField20.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField20.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField20_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField21.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField21.setForeground(new Color(0, 0, 120));
    jTextField21.setText("");
    jTextField21.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField21.setVisible(false);
    jTextField21.setNextFocusableComponent(jTextField22);
    jTextField21.setDisabledTextColor(Color.blue);
    jTextField21.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField21.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField21_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField22.setVisible(false);
    jTextField22.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField22.setNextFocusableComponent(jTextField23);
    jTextField22.setDisabledTextColor(Color.blue);
    jTextField22.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField22.setText("");
    jTextField22.setForeground(new Color(0, 0, 120));
    jTextField22.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField22.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField22_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField23.setVisible(false);
    jTextField23.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField23.setNextFocusableComponent(jTextField24);
    jTextField23.setDisabledTextColor(Color.blue);
    jTextField23.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField23.setText("");
    jTextField23.setForeground(new Color(0, 0, 120));
    jTextField23.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField23.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField23_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField24.setVisible(false);
    jTextField24.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField24.setNextFocusableComponent(jTextField25);
    jTextField24.setDisabledTextColor(Color.blue);
    jTextField24.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField24.setText("");
    jTextField24.setForeground(new Color(0, 0, 120));
    jTextField24.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField24.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField24_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField25.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField25.setForeground(new Color(0, 0, 120));
    jTextField25.setNextFocusableComponent(jTextField26);
    jTextField25.setText("");
    jTextField25.setVisible(false);
    jTextField25.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField25.setDisabledTextColor(Color.blue);
    jTextField25.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField25.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField25_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField26.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField26.setForeground(new Color(0, 0, 120));
    jTextField26.setText("");
    jTextField26.setNextFocusableComponent(jTextField27);
    jTextField26.setVisible(false);
    jTextField26.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField26.setDisabledTextColor(Color.blue);
    jTextField26.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField26.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField26_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField27.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField27.setForeground(new Color(0, 0, 120));
    jTextField27.setText("");
    jTextField27.setVisible(false);
    jTextField27.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField27.setNextFocusableComponent(jTextField28);
    jTextField27.setDisabledTextColor(Color.blue);
    jTextField27.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField27_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField28.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField28.setForeground(new Color(0, 0, 120));
    jTextField28.setText("");
    jTextField28.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField28.setVisible(false);
    jTextField28.setNextFocusableComponent(jTextField29);
    jTextField28.setDisabledTextColor(Color.blue);
    jTextField28.setBounds(new Rectangle(20, 528, 39, 17));
    jTextField28.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField28_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField29.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField29.setForeground(new Color(0, 0, 120));
    jTextField29.setText("");
    jTextField29.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField29.setVisible(false);
    jTextField29.setNextFocusableComponent(jTextField1);
    jTextField29.setDisabledTextColor(Color.blue);
    jTextField29.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField29.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField29_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField30.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField30.setForeground(new Color(0, 0, 120));
    jTextField30.setText("");
    jTextField30.setHorizontalAlignment(SwingConstants.RIGHT);
    jTextField30.setVisible(false);
 //   jTextField30.setNextFocusableComponent(jTextField31);
    jTextField30.setDisabledTextColor(Color.blue);
    jTextField30.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField30.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField30_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField31.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField31.setForeground(new Color(0, 0, 120));
    jTextField31.setText("");
    jTextField31.setHorizontalAlignment(SwingConstants.RIGHT);
    jTextField31.setVisible(false);
//    jTextField31.setNextFocusableComponent(jTextField32);
    jTextField31.setDisabledTextColor(Color.blue);
    jTextField31.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField31.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField31_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField32.setVisible(false);
 //   jTextField32.setNextFocusableComponent(jTextField33);
    jTextField32.setDisabledTextColor(Color.blue);
    jTextField32.setHorizontalAlignment(SwingConstants.RIGHT);
    jTextField32.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField32.setText("");
    jTextField32.setForeground(new Color(0, 0, 120));
    jTextField32.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField32.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField32_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField33.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField33.setForeground(new Color(0, 0, 120));
 //   jTextField33.setNextFocusableComponent(jTextField30);
    jTextField33.setText("");
    jTextField33.setVisible(false);
    jTextField33.setHorizontalAlignment(SwingConstants.RIGHT);
    jTextField33.setDisabledTextColor(Color.blue);
    jTextField33.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField33.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField33_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField34.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField34.setForeground(new Color(0, 0, 120));
 //   jTextField34.setNextFocusableComponent(jTextField30);
    jTextField34.setText("");
    jTextField34.setVisible(false);
    jTextField34.setHorizontalAlignment(SwingConstants.RIGHT);
    jTextField34.setDisabledTextColor(Color.blue);
    jTextField34.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField34.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField34_inputMethodTextChanged(e);
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
//    jLabel2.setText("Label");
//    jLabel2.setBounds(new Rectangle(20, 2, 189, 17));
    jCheckBox1.setBackground(new Color(255, 255, 255));
    jCheckBox1.setFont(new java.awt.Font("SansSerif", 3, 13));
    jCheckBox1.setForeground(new Color(180, 0, 80));
    jCheckBox1.setText("Таблица");
    jCheckBox1.setVisible(false);
    jCheckBox1.setEnabled(false);
    jCheckBox1.setOpaque(false);
    jCheckBox1.setBounds(new Rectangle(505, 67, 103, 23));
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
    this.getContentPane().add(jPanel2, null);
    this.getContentPane().add(jPanel3, null);
    this.jPanel2.setLayout(null);
    this.jPanel2.setLayout(null);
    this.jPanel3.setLayout(null);
    this.jPanel1.add(jLabel1,null);
   // this.getContentPane().add(jLabel1, null);
//    this.getContentPane().add(jLabel2, null);
 //   this.jPanel1.add(jComboBox1, null);
 //   this.jPanel1.add(jComboBox2, null);
    this.getContentPane().add(jButton1, null);
    this.getContentPane().add(jButton2, null);
    this.getContentPane().add(jButton3, null);
 //   this.jPanel3.add(jButton3, null);
    this.jPanel2.add(jTextField1, null);
    this.jPanel2.add(jTextField2, null);
    this.jPanel2.add(jTextField3, null);
    this.jPanel2.add(jTextField4, null);
    this.jPanel2.add(jTextField5, null);
    this.jPanel2.add(jTextField6, null);
    this.jPanel2.add(jTextField7, null);
    this.jPanel2.add(jTextField8, null);
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
    this.jPanel2.add(jTextField22, null);
    this.jPanel2.add(jTextField23, null);
    this.jPanel2.add(jTextField24, null);
    this.jPanel2.add(jTextField25, null);
    this.jPanel2.add(jTextField26, null);
    this.jPanel2.add(jTextField27, null);
    this.jPanel2.add(jTextField28, null);
    this.jPanel2.add(jTextField29, null);
    this.jPanel3.add(jTextField30, null);
    this.jPanel3.add(jTextField31, null);
    this.jPanel3.add(jTextField32, null);
    this.jPanel3.add(jTextField33, null);
    this.jPanel3.add(jTextField34, null);
    this.jPanel3.add(jRadioButton, null);
    this.jPanel3.add(jRadioButton1, null);
    this.jPanel3.add(jRadioButton2, null);
    this.jPanel3.add(jRadioButton3, null);
    this.jPanel3.add(jCheckBox1, null);
    this.jPanel3.add(jCheckBoxRezult, null);
  }

  public void Ind_nkr1(Graphics g,String a, String b, int x, int y){
    g.setFont(new java.awt.Font("SansSerif", 3, 11));
    g.drawString(""+a,x,y);
    g.setFont(new java.awt.Font("SansSerif", 3, 8));
    g.drawString(""+b+" ",x+a.length()*5,y+5);
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
  }
  public void Ind_nkr2(Graphics g,String a, String b, int x, int y){
    g.setFont(new java.awt.Font("SansSerif", 3, 14));
    g.drawString(""+a,x,y);
    g.setFont(new java.awt.Font("SansSerif", 3, 10));
    g.drawString(""+b+" ",x+a.length()*4,y+5);
    g.setFont(new java.awt.Font("SansSerif", 1, 14));
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
    int b=(600-120-(a+1)*60)/2, d=(int)Math.round(17*(4-c)/2);
    if(h==0) g.setColor(Color.red); else g.setColor(new Color(180, 0, 80));
    g.setFont(new java.awt.Font("SansSerif", 3, 13));
    g.drawString("Таблица "+t+":",15+b,tup-5+d);
    g.setColor(new Color(255, 255, 255)); g.fillRect(b+7,tup+d,602-2*b,2+17*(3+c));
    g.setColor(Color.black);
    for(int i=0; i<=a+1; i++)
      g.drawLine(b+128+i*60,tup+1+d,b+128+i*60,tup+120-d);
    for(int i=0; i<=3; i++)
      if(i==0) g.drawLine(b+8+i*40,tup+1+d,b+8+i*40,tup+120-d);
      else g.drawLine(b+8+i*40,tup+1+d,b+8+i*40,tup+102-d);
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
    int b0=(600-120-(a0+1)*60)/2, d0=(int)Math.round(17*(4-c0)/2);
    if(h==0) g.setColor(Color.red); else g.setColor(new Color(180, 0, 80));
    g.setFont(new java.awt.Font("SansSerif", 3, 13));
    g.drawString("Таблица "+t+":",b0+15,32+d0);
    g.setColor(new Color(255, 255, 255)); g.fillRect(b0+7,37+d0,542-2*b0,2+17*(3+c0));
    g.setColor(Color.black);
    for(int i=0; i<=a0+1; i++)
      g.drawLine(b0+128+i*60,38+d0,b0+128+i*60,38+d0+(c0+3)*17);
    for(int i=0; i<=3; i++)
      if(i==0) g.drawLine(b0+8+i*40,38+d0,b0+8+i*40,38+d0+(c0+3)*17);
      else g.drawLine(b0+8+i*40,38+d0,b0+8+i*40,38+d0+(c0+2)*17);
    for(int i=0; i<=3+c0; i++)
      if(i==1) g.drawLine(b0+128,38+d0+i*17,608-b0,38+d0+i*17);
      else g.drawLine(b0+8,38+d0+i*17,608-b0,38+d0+i*17);
    g.setColor(new Color(157, 187, 255)); g.drawRect(b0+7,37+d0,602-2*b0,2+17*(3+c0));
    g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 13));
    if (f==true){
      g.drawString("БП",b0+59,60+d0); g.drawString("БР",b0+99,60+d0);
      g.drawString("БР/",b0+139+60*a0,69+d0); Ind_nk(g,"a","ir",b0+162+60*a0,69+d0);
      Ind_nk(g,"c","i",b0+23,60+d0); Ind_nk(g,"c","j",b0+153+a0*60,49+d0);
      for(int i=1; i<=a0; i++)
        Ind_n(g,"x",""+i,b0+153+(i-1)*60,66+d0);
      for(int i=0; i<c0; i++)
        if(bp0[i]>0) Ind_n(g,"x",""+bp0[i],b0+62,83+d0+i*17);
      Ind_nk(g,"\u2206","  j",b0+153+a0*60,85+d0+c0*17);
    }
  }
  public void Tb1(Graphics g, int a, int c,int tbn[][], int tbd[][], int bp[]){ //Заполняет таблицу
    g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
    int b=(600-120-(a+1)*60)/2, d=(int)Math.round(17*(4-c)/2), l=0;
    String jj="", jj1=""; int ii;
    for (int i=0; i<=c; i++)
      for (int j=0; j<=a; j++){
        int pp; g.setColor(new Color(0, 0, 160));
        if(i==0) g.setColor(new Color(0, 0, 80));
        if (j==0) pp=40; else pp=60;
        if(tbn[i][j]<20000){
          if((tbd[i][j]==1) || (tbn[i][j]==0)) jj=""+tbn[i][j];
          else jj=tbn[i][j]+"/"+tbd[i][j];
          ii=(int)(b+88+(pp-40)*(3*j-1)+(pp-jj.length()*8)/2);
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
      if(tbn[5][j]<20000){
        kf=(int)Math.round(tbn[5][j]/1000.0);
        if((tbd[5][j]==1) || (tbn[5][j]==0)){
          if((kf>=1)||(kf<=-1)){
            if (tbn[5][j]-kf*1000>0){
              if(kf==1){ jj="M+"+(tbn[5][j]-kf*1000); jj1=(tbn[5][j]-kf*1000)+"+M";}
              else if(kf==-1){ jj="-M+"+(tbn[5][j]-kf*1000); jj1=(tbn[5][j]-kf*1000)+"-M+";}
                   else if(kf>0) {jj=kf+"M+"+(tbn[5][j]-kf*1000); jj1=(tbn[5][j]-kf*1000)+"+"+kf+"M";}
                        else  {jj=kf+"M+"+(tbn[5][j]-kf*1000); jj1=(tbn[5][j]-kf*1000)+kf+"M";}
            }
            else if (tbn[5][j]-kf*1000<0){
                   if(kf==1){ jj="M-"+(kf*1000-tbn[5][j]); jj1="-"+(kf*1000-tbn[5][j])+"+M";}
                   else if(kf==-1){ jj="-M-"+(kf*1000-tbn[5][j]); jj1="-"+(kf*1000-tbn[5][j])+"-M";}
                        else if(kf>0) { jj=kf+"M-"+(kf*1000-tbn[5][j]); jj1="-"+(kf*1000-tbn[5][j])+"+"+kf+"M"; }
                             else { jj=kf+"M-"+(kf*1000-tbn[5][j]); jj1="-"+(kf*1000-tbn[5][j])+kf+"M"; }
                 }
                 else{
                   if(kf==1){ jj="M"; jj1="M";}
                   else if(kf==-1){ jj="-M"; jj1="-M";}
                        else {jj=kf+"M"; jj1=kf+"M";}
                 }
          }
          else{ jj=""+tbn[5][j]; jj1=""+tbn[5][j];}
        }
        else{
          if((kf>=1)||(kf<=-1)){
            if (tbn[5][j]-kf*1000>0){
              if(kf==1) jj="("+"M+"+(tbn[5][j]-kf*1000)+")/"+tbd[5][j];
              else if(kf==-1) jj="("+"-M+"+(tbn[5][j]-kf*1000)+")/"+tbd[5][j];
                   else jj="("+kf+"M+"+(tbn[5][j]-kf*1000)+")/"+tbd[5][j];
              }
            else if (tbn[5][j]-kf*1000<0){
                   if(kf==1) jj="("+"M-"+(kf*1000-tbn[5][j])+")/"+tbd[5][j];
                   else if(kf==-1) jj="("+"-M-"+(kf*1000-tbn[5][j])+")/"+tbd[5][j];
                        else jj="("+kf+"M-"+(kf*1000-tbn[5][j])+")/"+tbd[5][j];
                 }
                 else{
                   if(kf==1) jj="M/"+tbd[5][j];
                   else if(kf==-1) jj="-M/"+tbd[5][j];
                        else jj=kf+"M/"+tbd[5][j];
                 }
          }
          else jj=tbn[5][j]+"/"+tbd[5][j];
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
  public void Tb2(Graphics g, int a0, int c0, int pp1, int nn1, int tbn0[][], int tbd0[][], int bp0[]){ //Заполняет  таблицу
    g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
    int b0=(600-120-(a0+1)*60)/2, d0=(int)Math.round(17*(4-c0)/2), tup0=37, l=0;
    String jj=""; int ii;
    for (int i=0; i<=c0; i++)
      for (int j=0; j<=a0; j++){
        int pp; g.setColor(new Color(0, 0, 160));
        if(i==0) g.setColor(new Color(0, 0, 80));
        if (j==0) pp=40; else pp=60;
        if(tbn0[i][j]<20000){
          if((tbd0[i][j]==1) || (tbn0[i][j]==0)) jj=""+tbn0[i][j];
          else jj=tbn0[i][j]+"/"+tbd0[i][j];
          ii=(int)(b0+88+(pp-40)*(3*j-1)+(pp-jj.length()*8)/2);
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
      if(tbn0[5][j]<20000){
        kf=(int)Math.round(tbn0[5][j]/1000.0);
        if((tbd0[5][j]==1) || (tbn0[5][j]==0)){
          if((kf>=1)||(kf<=-1)){
            if (tbn0[5][j]-kf*1000>0){
              if(kf==1) jj="M+"+(tbn0[5][j]-kf*1000);
              else if(kf==-1) jj="-M+"+(tbn0[5][j]-kf*1000);
                   else jj=kf+"M+"+(tbn0[5][j]-kf*1000);
            }
            else if (tbn0[5][j]-kf*1000<0){
                   if(kf==1) jj="M-"+(kf*1000-tbn0[5][j]);
                   else if(kf==-1) jj="-M-"+(kf*1000-tbn0[5][j]);
                        else jj=kf+"M-"+(kf*1000-tbn0[5][j]);
                 }
                 else{
                   if(kf==1) jj="M";
                   else if(kf==-1) jj="-M";
                        else jj=kf+"M";
                 }
          }
          else jj=""+tbn0[5][j];
        }
        else{
          if((kf>=1)||(kf<=-1)){
            if (tbn0[5][j]-kf*1000>0){
              if(kf==1) jj="("+"M+"+(tbn0[5][j]-kf*1000)+")/"+tbd0[5][j];
              else if(kf==-1) jj="("+"-M+"+(tbn0[5][j]-kf*1000)+")/"+tbd0[5][j];
                   else jj="("+kf+"M+"+(tbn0[5][j]-kf*1000)+")/"+tbd0[5][j];
              }
            else if (tbn0[5][j]-kf*1000<0){
                   if(kf==1) jj="("+"M-"+(kf*1000-tbn0[5][j])+")/"+tbd0[5][j];
                   else if(kf==-1) jj="("+"-M-"+(kf*1000-tbn0[5][j])+")/"+tbd0[5][j];
                        else jj="("+kf+"M-"+(kf*1000-tbn0[5][j])+")/"+tbd0[5][j];
                 }
                 else{
                   if(kf==1) jj="M/"+tbd0[5][j];
                   else if(kf==-1) jj="-M/"+tbd0[5][j];
                        else jj=kf+"M/"+tbd0[5][j];
                 }
          }
          else jj=tbn0[5][j]+"/"+tbd0[5][j];
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
    if(sh!=16) {g.setColor(Color.red);
    if(tbd0[pp1][nn1]!=1) jj=tbn0[pp1][nn1]+"/"+tbd0[pp1][nn1];
    else jj=""+tbn0[pp1][nn1];
    Stringer.drawString(jj,(int)(b+88+20*(3*n-1)+(60-jj.length()*8)/2),tup0+32+p*17+d0);}
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
    int mn[]={0,0,0,0}, md[]={1,1,1,1}, kf=1;
    for(int i=1; i<=a; i++){
      for(int j=0; j<c; j++){
        mn[j]=tbn[j+1][i]*tbn[0][bp[j]];
        md[j]=tbd[j+1][i]*tbd[0][bp[j]];
        }
      tbn[5][i]=tbn[0][i]; tbd[5][i]=tbd[0][i];
      for(int j=0; j<c; j++)
        if(mn[j]<20000){
          kf=MaxDel(tbd[5][i],md[j]);
          tbn[5][i]=tbn[5][i]*md[j]/kf; mn[j]=mn[j]*tbd[5][i]/kf;
          tbd[5][i]=tbd[5][i]*md[j]/kf; md[j]=tbd[5][i]; // общий знаменатель
          tbn[5][i]=tbn[5][i]-mn[j];
      }
      if((Math.round(tbn[5][i]/1000.0)<1) && (Math.round(tbn[5][i]/1000.0)>-1)){
        kf=MaxDel(tbn[5][i],tbd[5][i]);
        tbn[5][i]=tbn[5][i]/kf; tbd[5][i]=tbd[5][i]/kf;
      }
       else{
        int j=1;
        kf=(int)Math.round(tbn[5][i]/1000.0);
        j=MaxDel3(tbn[5][i]-kf*1000,tbd[5][i],kf);
        tbd[5][i]=tbd[5][i]/j;
        tbn[5][i]=tbn[5][i]/j;
      }
    }
  }

   public void ModifyArray1(int a, int c, int tbn[][], int tbd[][], int p, int n){  //Пересчет таблицы
    int tbn1=0, tbd1=0, kf=0, t=1;
    for(int i=1; i<=5 ; i++){
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
              if( ( ((kf>-1) && (kf<1)) && (i==5)) || (i<5)){
                t=MaxDel(tbn[i][j],tbd[i][j]);
                tbd[i][j]=tbd[i][j]/t;
                tbn[i][j]=tbn[i][j]/t;
              }
              if(((kf<=-1) || (kf>=1)) && (i==5)){
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

  public void ModifyProblem(int a, int c, int tn[][], int td[][], int tbn[][], int tbd[][], String s[]){ //условия задачи
    for(int i=2; i<=11; i++)
      s[i]="";
    s[2]="f(x) = ";
    if(tn[0][1]>1) s[2]=s[2]+tn[0][1]+" x_{1}";
    if(tn[0][1]<-1) s[2]=s[2]+"-"+Math.abs(tn[0][1])+" x_{1}";
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
    for(int i=0; i<6; i++)
      for(int j=0; j<9; j++){
        tbn[i][j]=20000; tbd[i][j]=1;
      }
    for(int i=0; i<6; i++)
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

  public void Valuation(int a, int c, int tbn[][], int tbd[][], int nm[], String sm[]){ //Находит максимальную оценку
    double max=-1.0; int maxn=-1, maxd=1;
    nm[0]=-1; sm[0]="";
       for(int i=1; i<=a; i++)
         if((tbn[5][i]>0) && (max<(double)tbn[5][i]*1.0/tbd[5][i])){
           max=(double)tbn[5][i]*1.0/tbd[5][i];
           nm[0]=i; maxn=tbn[5][i]; maxd=tbd[5][i];
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

  public void IntPart(int a, int Ogrn[], int Ogrd[]){
    int t, q;
    for(int i=0; i<=a; i++)
      if((Ogrn[i]!=0) && (Ogrd[i]!=1)){
        if((Ogrn[i]>0) && (Ogrn[i]>Ogrd[i]))
          Ogrn[i]=Ogrn[i]-(Ogrd[i]*(int)(Ogrn[i]/Ogrd[i]));
        if(Ogrn[i]<0)
          Ogrn[i]=Ogrn[i]-(Ogrd[i]*((int)(Ogrn[i]/Ogrd[i])-1));
      }
      else{Ogrn[i]=0; Ogrd[i]=1;};

  }

  class MyPaint1 extends JPanel {
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Stringer.setGraphics(g);
      Stringer1.setGraphics(g);
      zd1=0; zd2=0;
      for(int i=0; i<=1; i++)
        s[i]="";
      s[0]="Найти целочисленное решение задачи f(x) = ";
      if(tn[0][1]>1) s[0]=s[0]+tn[0][1]+"x_{1}";
      if(tn[0][1]<-1) s[0]=s[0]+"-"+Math.abs(tn[0][1])+"x_{1}";
      if(tn[0][1]==1) s[0]=s[0]+"x_{1}"; if(tn[0][1]==-1) s[0]=s[0]+"- x_{1}";
      if(tn[0][2]!=20000){
        if(tn[0][1]!=0){
          if(tn[0][2]>0){
            if(tn[0][2]!=1) s[0]=s[0]+"+ "+tn[0][2]+"x_{2} \u2192 max при ограничениях";
            else s[0]=s[0]+"+ x_{2} \u2192 max при ограничениях";
          }
        }
        else{
          if(tn[0][2]>0){
            if(tn[0][2]!=1) s[0]=s[0]+tn[0][2]+"x_{2} \u2192 max при ограничениях";
            else s[0]=s[0]+"x_{2} \u2192 max при ограничениях";
          }
        }
        if(tn[0][2]<0){
          if(Math.abs(tn[0][2])!=1) s[0]=s[0]+"- "+Math.abs(tn[0][2])+"x_{2} \u2192 max при ограничениях";
          else s[0]=s[0]+"- x_{2} \u2192 max при ограничениях";
        }
        if(tn[0][2]==0) s[0]=s[0]+" \u2192 max при ограничениях";
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
      s[1]=s[1]+" x_{1}, x_{2} \u2265 0, где x_{1}, x_{2} - целые, методом Гомори";
      int qq=0;
      g.setColor(new Color(180, 0, 80));
      g.setFont(new java.awt.Font("SansSerif", 3, 13));
      g.drawString("Обозначения:",477,82);
     // g.drawString("Выберите вариант:",36,60);
     // g.drawString("Выберите сложность:",370,60);
      g.setColor(new Color(255, 255, 255));
      g.fillRect(7,87,210,85); g.fillRect(237,87,210,85); g.fillRect(467,87,142,85);
      g.setColor(new Color(157, 187, 255));
      g.drawRect(7,87,210,85); g.drawRect(237,87,210,85); g.drawRect(467,87,142,85);
      g.setColor(new Color(0, 0, 80));
      g.setFont(new java.awt.Font("SansSerif", 1, 13));
      g.drawString("БП",477,108); g.drawString("БР",476,144);
        g.setFont(new java.awt.Font("SansSerif", 1, 14));
        g.drawString("- базисные",497,108); g.drawString("переменные",507,124);
        g.drawString("- базисное",497,144); g.drawString("решение",507,160);
      g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
      if(vrt==0){ zd1=23; zd2=47; }
      if(vrt==1){ zd1=6; zd2=59; }
      if(vrt==2){ zd1=3; zd2=42; qq=4; }
      if(vrt==3){ zd1=3; zd2=36; }
      if(vrt==4){ zd1=5; zd2=52; qq=-1; }
      if(vrt==5){ zd1=2; zd2=37; qq=-1; }
      if(vrt==6){ zd1=0; zd2=48; }
      if(vrt==7){ zd1=5; zd2=49; qq=-4; }
      if(vrt==8){ zd1=4; zd2=43; }
      if(vrt==9){ zd1=8; zd2=47; }
      if(vrt==10){ zd1=0; zd2=49; qq=1; }
      if(vrt==11){ zd1=23; zd2=53; qq=-1; }
      Stringer.drawString(s[0],zd1+51,38);
      Stringer.drawString(s[1],zd2,58);
      int at[]={an}, ct[]={cn};
      int q=0; FontMetrics Fm=g.getFontMetrics();
      if((vrt==0) || (vrt==11)) q=10; else  q=28;
      Stringer.drawString(s[2],(210-s[2].length()*6+q)/2+7,102);
      Stringer.drawString(s[3],(210-s[3].length()*4)/2+7,124);
      Stringer.drawString(s[4],(210-s[4].length()*4)/2+7,144);
      Stringer.drawString(s[5]+"   "+s[10],(218-s[5].length()*3-s[10].length()*6+20)/2,164);
      if(sh>=2){
        if((vrt==2) || (vrt==7) || (vrt>=10))
          Stringer.drawString(s[6],(210-Fm.stringWidth(s[6])*3/4)/2+237,102);
        else
          Stringer.drawString(s[6],(210-s[6].length()*6+q)/2+237,102);
        Stringer.drawString(s[7],(210-s[7].length()*4)/2+qq+237,124);
        Stringer.drawString(s[8],(210-s[8].length()*4)/2-qq+237,144);
        Stringer.drawString(s[9]+"   "+s[11],(218-s[9].length()*3-s[11].length()*6+20)/2+235,164);
      }
      g.setColor(new Color(180, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 3, 13));
      g.drawString("Задача:  ",zd1,38);

      if(sh==2){
        g.setColor(Color.red);
        g.drawRect(237,87,210,85);
      }
      g.setColor(new Color(180, 0, 80));
      if(sh==1) g.setColor(Color.red);
      g.setFont(new java.awt.Font("SansSerif", 3, 13));
      g.drawString("Задача ЗЛП:",15,82);
      if(sh==2) g.setColor(Color.red);
      else g.setColor(new Color(180, 0, 80));
      g.drawString("Расширенная форма:",245,82);
      g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
      if((sh==8) || (sh==16))
        if(Ch==true){
          int b0=(600-120-(a0+1)*60)/2, d0=(int)Math.round(17*(4-c0)/2);
    //      jComboBox1.setVisible(false); jComboBox1.setEnabled(false);
    //      jComboBox2.setVisible(false); jComboBox2.setEnabled(false);
          g.setColor(new Color(190, 190, 190));
          g.fillRect(b0+7,17+d0,602-2*b0+14,2+17*(3+c0)+27);
          g.setColor(new Color(255, 255, 255));
          g.fillRect(b0,17+d0,602-2*b0+14,2+17*(3+c0)+27);
          g.setColor(Color.blue);
          g.drawRect(b0,17+d0,602-2*b0+14,2+17*(3+c0)+27);
          Tabl2(g,a0,c0,r,1,true,bp0);
          Tb2(g,a0,c0,p,n,tbn0,tbd0,bp0);
        }
       /* else if((sh<11) || (sh>15)){
          jComboBox1.setVisible(true); jComboBox1.setEnabled(true);
          jComboBox2.setVisible(true); jComboBox2.setEnabled(true);
        }*/
      if((sh>=11) && (sh<=15))
        if(Ch==true){
       //   jComboBox1.setVisible(false); jComboBox1.setEnabled(false);
       //   jComboBox2.setVisible(false); jComboBox2.setEnabled(false);
          g.setColor(new Color(190, 190, 190));
          g.fillRect(67,57,542-2*30+14,2+17*5+27);
          g.setColor(new Color(255, 255, 255));
          g.fillRect(60,50,542-2*30+14,2+17*5+27);
          g.setColor(Color.blue);
          g.drawRect(60,50,542-2*30+14,2+17*5+27);
          g.setColor(new Color(180, 0, 80));
          g.setFont(new java.awt.Font("SansSerif", 3, 13));
          g.drawString("Формула:",75,65);
          g.setColor(new Color(255, 255, 255)); g.fillRect(67,70,542-2*30,2+17*5);
          g.setColor(new Color(157, 187, 255)); g.drawRect(67,70,542-2*30,2+17*5);
          g.setColor(new Color(0, 0, 80));
          if(sh==11){
            Stringer1.drawString("x_{i} = x&{i}{*} - \u2211 a_{ik} x_{k}, где",240,86);
            Ind_nkr1(g,"k\u2208 I","НБ",287,100);
            Ind_nkr2(g,"I","НБ",70,135);
            Stringer1.drawString("x&{i}{*} - оптимальное нецелочисленное значение x_{i},",70,118);
            Stringer1.drawString("- множество индексов небазисных переменных в оптимальном",88,135);
            Stringer1.drawString("нецелочисленном решении.",97,152);
          }
          if(sh==12){
            Stringer1.drawString("\u2211 a_{ik} x_{k} \u2261 x&{i}{*}",264,90);
            Ind_nkr1(g,"k\u2208 I","НБ",256,104);
            Ind_nkr1(g,"c","",321,78); Ind_nkr1(g,"c","",474,110);
            g.setFont(new java.awt.Font("SansSerif", 2, 15));
            g.drawString("a    b                        сравнимыми по модулю 1  a \u2261 b",148,122);
            g.drawString("a - b -                                     дробной частью вещественного числа a",71,137);
            g.drawString("a",530,152);
            Stringer.drawString("Два числа    и    называются                                              (        ), если",71,122);
            Stringer.drawString("целое число. Тогда",113,137);
            Stringer.drawString("называется наименьшее неотрицательное число, сравнимое с   .",71,152);
          }
          if(sh==13){
            Stringer1.drawString("Для дробных частей всех коэффициентов a_{ik} и x&{i}{*}:",72,87);
            Stringer1.drawString("\u2211 (a_{ik}) x_{k} \u2261 (x&{i}{* }),   0 \u2264 (a_{ik}) \u2264 1,   0 \u2264 (x&{i}{* }) \u2264 1",171,120);
            Ind_nkr1(g,"k\u2208 I","НБ",163,134);
            Ind_nkr1(g,"c","",238,108);
          }
          if(sh==14){
            Stringer.drawString("Новое ограничение :",72,87);
            Stringer1.drawString("\u2211 (a_{ik}) x_{k} \u2265 (x&{i}{* })",252,112);
            Ind_nkr1(g,"k\u2208 I","НБ",244,126);
          }
          if(sh==15){
            Stringer.drawString("Новое ограничение в виде равенства:",72,87);
            Stringer1.drawString("\u2211 (a_{ik}) x_{k} - x_{\u03C5} = (x&{i}{* }),",239,112);
            Ind_nkr1(g,"k\u2208 I","НБ",231,126);
            Stringer1.drawString("где x_{\u03C5} - дополнительная переменная",72,150);
          }
        }
       /* else if(sh!=8){
          jComboBox1.setVisible(true); jComboBox1.setEnabled(true);
          jComboBox2.setVisible(true); jComboBox2.setEnabled(true);
        }*/
   //   g.drawString(""+sh,10,50);
      if(sh==18){
        if(Ch==true)
        {
          int kolmist_calk=0, kolmist_under=0, kolmist_knowledge=0, kolmist_use=0, Vopros=0;
          g.setColor(new Color(190, 190, 190));
          g.fillRect(97,142,436,40);
          g.setColor(new Color(255, 255, 255));
          g.fillRect(90,135,436,40);
          g.setColor(new Color(247, 247, 255));
          g.fillRect(511,135,15,15);
          g.setColor(Color.blue);
          g.drawRect(90,135,436,40);
          g.drawRect(511,135,15,15); g.drawLine(511,135,526,150); g.drawLine(511,150,526,135);
          g.setColor(new Color(180, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 3, 13));
          g.drawString("Ваш результат:",259,150);
          g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 3, 14));
          for(int i=0; i<40; i++){
            kolmist_calk=kolmist_calk+Mist_calk[i];
            kolmist_under=kolmist_under+Mist_under[i];
            kolmist_knowledge=kolmist_knowledge+Mist_knowledge[i];
            kolmist_use=kolmist_use+Mist_use[i];
          }
          Vopros=RightAnswer+kolmist_calk+kolmist_under+kolmist_knowledge+kolmist_use;
          g.drawString("Количество вопросов: "+Vopros,225,170);
        }
      }
    }
  }

  class MyPaint2 extends JPanel {
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Stringer.setGraphics(g);
      FontMetrics Fm=g.getFontMetrics();
      if(sh<1){
        a=0; c=0; r=0; Numx=0; RightAnswer=0;
        Ch=false; Right=true; RightPust=true; edt=false; entry=false; IntF=false; fl=false;
        n=0; p=0; k=0; otv=-1; Kx=0; Ky=0; bpx=-1; nm[0]=0; step1=0; step2=0;  x=-1;
        sm[0]=""; ss=""; jj=""; ots=""; ogr="";
        for(int i=0; i<12; i++)
          s[i]="";
        for(int i=0; i<7; i++){
          Delta[i] = "";
          Delta1[i] = "";
        }
        for(int i=0; i<4; i++){
          bp[i]=0; bp0[i]=0;
          Vr[i]=0;
        }
        for(int i=0; i<6; i++)
          for(int j=0; j<9; j++){
            tbn[i][j]=20000; tn[i][j]=20000;
            tbd[i][j]=1; td[i][j]=1;
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
        jTextField25.setText(""); jTextField26.setText(""); jTextField27.setText("");
        jTextField28.setText(""); jTextField29.setText(""); jTextField30.setText("");
        jTextField31.setText(""); jTextField32.setText(""); jTextField33.setText("");
        jTextField34.setText("");
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
        jTextField25.setVisible(false); jTextField25.setEnabled(false);
        jTextField26.setVisible(false); jTextField26.setEnabled(false);
        jTextField27.setVisible(false); jTextField27.setEnabled(false);
        jTextField28.setVisible(false); jTextField28.setEnabled(false);
        jTextField29.setVisible(false); jTextField29.setEnabled(false);
        jTextField30.setVisible(false); jTextField30.setEnabled(false);
        jTextField31.setVisible(false); jTextField31.setEnabled(false);
        jTextField32.setVisible(false); jTextField32.setEnabled(false);
        jTextField33.setVisible(false); jTextField33.setEnabled(false);
        jTextField24.setVisible(false); jTextField34.setEnabled(false);
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
        jTextField25.setForeground(new Color(0, 0, 120));
        jTextField26.setForeground(new Color(0, 0, 120));
        jTextField27.setForeground(new Color(0, 0, 120));
        jTextField28.setForeground(new Color(0, 0, 120));
        jTextField29.setForeground(new Color(0, 0, 120));
        jTextField30.setForeground(new Color(0, 0, 120));
        jTextField31.setForeground(new Color(0, 0, 120));
        jTextField32.setForeground(new Color(0, 0, 120));
        jTextField33.setForeground(new Color(0, 0, 120));
        jTextField34.setForeground(new Color(0, 0, 120));
        jCheckBox1.setSelected(false); jCheckBox1.setVisible(false); jCheckBox1.setEnabled(false);
        jCheckBoxRezult.setSelected(true); jCheckBoxRezult.setVisible(false); jCheckBoxRezult.setEnabled(false);
        jButton3.setEnabled(false); jButton1.setEnabled(true);
        jRadioButton.setSelected(true);
        if(vrt==0){
          int at[]={2}, ct[]={2}; an=at[0]; cn=ct[0];
          tn[0][1]=0; tn[0][2]=1;
          tn[1][0]=6; tn[1][1]=1; tn[1][2]=2; tn[1][8]=1;
          tn[2][0]=1; tn[2][1]=-3; tn[2][2]=2; tn[2][8]=1;
          ModifyRasForma(at,ct,tn,td,tbn,tbd,s); a=at[0]; c=ct[0];
        }
        if(vrt==1){
          int at[]={2}, ct[]={2}; an=at[0]; cn=ct[0];
          tn[0][1]=1; tn[0][2]=2;
          tn[1][0]=1; tn[1][1]=-1; tn[1][2]=1; tn[1][8]=1;
          tn[2][0]=6; tn[2][1]=2; tn[2][2]=1; tn[2][8]=1;
          ModifyRasForma(at,ct,tn,td,tbn,tbd,s); a=at[0]; c=ct[0];
        }
        if(vrt==2){
          int at[]={2}, ct[]={2}; an=at[0]; cn=ct[0];
          tn[0][1]=-6; tn[0][2]=-1;
          tn[1][0]=6; tn[1][1]=2; tn[1][2]=1; tn[1][8]=-1;
          tn[2][0]=-4; tn[2][1]=-2; tn[2][2]=2; tn[2][8]=1;
          ModifyRasForma(at,ct,tn,td,tbn,tbd,s); a=at[0]; c=ct[0];
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
          ModifyRasForma(at,ct,tn,td,tbn,tbd,s); a=at[0]; c=ct[0];
        }
        if(vrt==5){
          int at[]={2}, ct[]={2}; an=at[0]; cn=ct[0];
          tn[0][1]=4; tn[0][2]=2;
          tn[1][0]=6; tn[1][1]=-3; tn[1][2]=2; tn[1][8]=1;
          tn[2][0]=28; tn[2][1]=5; tn[2][2]=3; tn[2][8]=1;
          ModifyRasForma(at,ct,tn,td,tbn,tbd,s); a=at[0]; c=ct[0];
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
          ModifyRasForma(at,ct,tn,td,tbn,tbd,s); a=at[0]; c=ct[0];
        }
        if(vrt==9){
          int at[]={2}, ct[]={2}; an=at[0]; cn=ct[0];
          tn[0][1]=2; tn[0][2]=-1;
          tn[1][0]=-3; tn[1][1]=-1; tn[1][2]=-4; tn[1][8]=1;
          tn[2][0]=11; tn[2][1]=4; tn[2][2]=-1; tn[2][8]=1;
          ModifyRasForma(at,ct,tn,td,tbn,tbd,s); a=at[0]; c=ct[0];
        }
        if(vrt==10){
          int at[]={2}, ct[]={2};
          tn[0][1]=-4; tn[0][2]=2; an=at[0]; cn=ct[0];
          tn[1][0]=16; tn[1][1]=2; tn[1][2]=1; tn[1][8]=1;
          tn[2][0]=20; tn[2][1]=1; tn[2][2]=3; tn[2][8]=1;
          ModifyRasForma(at,ct,tn,td,tbn,tbd,s); a=at[0]; c=ct[0];
        }
        if(vrt==11){
          int at[]={2}, ct[]={2}; an=at[0]; cn=ct[0];
          tn[0][1]=1; tn[0][2]=0;
          tn[1][0]=2; tn[1][1]=4; tn[1][2]=-6; tn[1][8]=1;
          tn[2][0]=6; tn[2][1]=2; tn[2][2]=1; tn[2][8]=1;
          ModifyRasForma(at,ct,tn,td,tbn,tbd,s); a=at[0]; c=ct[0];
        }
  //      jPanel2.repaint(); jPanel1.repaint();
      }
      b=(600-120-(a+1)*60)/2; d=(int)Math.round(17*(4-c)/2);

      if(sh==3){
        Tabl1(g,a,c,1,0,true,bp);
        Tb1(g,a,c,tbn,tbd,bp);
        if(slog>=1)
        {
          if(edt==false){
            jTextField1.setBounds(new Rectangle(129+b+60,tup+d+2,60,17));
            jTextField2.setBounds(new Rectangle(129+b+180,tup+d+2,60,17));
            jTextField1.setVisible(true); jTextField1.setEnabled(true);
            jTextField2.setVisible(true); jTextField2.setEnabled(true);
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
            if(a>=5){
              jTextField5.setBounds(new Rectangle(129+b+240,tup+d+36,60,17));
              jTextField5.setVisible(true); jTextField5.setEnabled(true);
              if(AddRAnswer==false){ RightAnswer=8; AddRAnswer=true;}
            }
            else if(AddRAnswer==false){ RightAnswer=7; AddRAnswer=true;}
            jButton1.setEnabled(false);
            jButton3.setEnabled(true);
          }
        }
      }
      if(sh==4){
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
            kf=(int)Math.round(tbn[5][1]/1000.0);
            if((tbd[5][1]==1) || (kf==0) || (tbn[5][1]-kf*1000==0)){
              jTextField23.setBounds(new Rectangle(129+b,tup+d+(c+2)*17+2,60,16));
              jTextField23.setVisible(true); jTextField23.setEnabled(true);
            }
            kf=(int)Math.round(tbn[5][2]/1000.0);
            if((tbd[5][2]==1) || (kf==0) || (tbn[5][2]-kf*1000==0)){
              jTextField24.setBounds(new Rectangle(129+b+60,tup+d+(c+2)*17+2,60,16));
              jTextField24.setVisible(true); jTextField24.setEnabled(true);
            }
            kf=(int)Math.round(tbn[5][3]/1000.0);
            if((tbd[5][3]==1) || (kf==0) || (tbn[5][3]-kf*1000==0)){
              jTextField25.setBounds(new Rectangle(129+b+120,tup+d+(c+2)*17+2,60,16));
              jTextField25.setVisible(true); jTextField25.setEnabled(true);
            }
            kf=(int)Math.round(tbn[5][4]/1000.0);
            if((tbd[5][4]==1) || (kf==0) || (tbn[5][4]-kf*1000==0)){
              jTextField26.setBounds(new Rectangle(129+b+180,tup+d+(c+2)*17+2,60,16));
              jTextField26.setVisible(true); jTextField26.setEnabled(true);
            }
            if(a>=5){
              kf=(int)Math.round(tbn[5][5]/1000.0);
              if((tbd[5][5]==1) || (kf==0) || (tbn[5][5]-kf*1000==0)){
                jTextField27.setBounds(new Rectangle(129+b+240,tup+d+(c+2)*17+2,60,16));
                jTextField27.setVisible(true); jTextField27.setEnabled(true);
              }
            }
            if(AddRAnswer==false){
              for(int i=1; i<=a; i++)
              {
                kf=(int)Math.round(tbn[5][i]/1000.0);
                if((tbd[5][i]==1) || (kf==0) || (tbn[5][i]-kf*1000==0))
                  RightAnswer++;
              }
              AddRAnswer=true;
            }
            jButton1.setEnabled(false);
            jButton3.setEnabled(true);
          }
        }
      }
      if(sh==5){
        n=0; Valuation(a,c,tbn,tbd,nm,sm); n=nm[0]; ss=sm[0];
        Tabl1(g,a,c,1+r,1,true,bp);
        Tb1(g,a,c,tbn,tbd,bp);
        g.setColor(Color.red);
        Ind_nk(g,"\u2206","  j",b+153+a*60,tup+48+c*17+d);
        g.setColor(new Color(0, 0, 80));
      }
      if(sh==6){
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
      if(sh==7){
        double min=20000.0; int minn=0, mind=1; p=0;
        for(int i=1; i<=c; i++)
          if(tbn[i][n]>0){
            minn=tbn[i][0]*tbd[i][n]; mind=tbd[i][0]*tbn[i][n];
            tbn[i][8]=minn/MaxDel(minn,mind); tbd[i][8]=mind/MaxDel(minn,mind);
            if(min>((double)tbn[i][0]/tbd[i][0])*((double)tbd[i][n]/tbn[i][n])){
              min=((double)tbn[i][0]/tbd[i][0])*((double)tbd[i][n]/tbn[i][n]);
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
      if(sh==8){
        bp[p-1]=n;
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
            if(c>=3){
              jTextField12.setBounds(new Rectangle(129+b,tup+d+70,60,17));
              jTextField14.setBounds(new Rectangle(129+b+120,tup+d+70,60,17));
              jTextField12.setVisible(true); jTextField12.setEnabled(true);
              jTextField14.setVisible(true); jTextField14.setEnabled(true);
            }
            if(c==4){
              jTextField19.setBounds(new Rectangle(89+b,tup+d+87,40,17));
              jTextField20.setBounds(new Rectangle(129+b+60,tup+d+87,60,17));
              jTextField21.setBounds(new Rectangle(129+b+180,tup+d+87,60,17));
              jTextField19.setVisible(true); jTextField19.setEnabled(true);
              jTextField20.setVisible(true); jTextField20.setEnabled(true);
              jTextField21.setVisible(true); jTextField21.setEnabled(true);
            }
            if(a>=5){
              jTextField5.setBounds(new Rectangle(129+b+240,tup+d+36,60,17));
              jTextField5.setVisible(true); jTextField5.setEnabled(true);
              if(c>=3){
                jTextField16.setBounds(new Rectangle(129+b+240,tup+d+70,60,17));
                jTextField16.setVisible(true); jTextField16.setEnabled(true);
              }
            }
            if(a>=6){
              jTextField10.setBounds(new Rectangle(129+b+300,tup+d+53,60,17));
              jTextField10.setVisible(true); jTextField10.setEnabled(true);
              if(c==4){
                jTextField22.setBounds(new Rectangle(129+b+300,tup+d+87,60,17));
                jTextField22.setVisible(true); jTextField22.setEnabled(true);
              }
            }
            if(a>=7){
              jTextField6.setBounds(new Rectangle(129+b+360,tup+d+36,60,17));
              jTextField6.setVisible(true); jTextField6.setEnabled(true);
              if(c>=3){
                jTextField18.setBounds(new Rectangle(129+b+360,tup+d+70,60,17));
                jTextField18.setVisible(true); jTextField18.setEnabled(true);
              }
            }
            int kf=0;
            kf=(int)Math.round(tbn[5][1]/1000.0);
            if((tbd[5][1]==1) || (kf==0) || (tbn[5][1]-kf*1000==0)){
              jTextField23.setBounds(new Rectangle(129+b,tup+d+(c+2)*17+2,60,16));
              jTextField23.setVisible(true); jTextField23.setEnabled(true);
            }
            kf=(int)Math.round(tbn[5][2]/1000.0);
            if((tbd[5][2]==1) || (kf==0) || (tbn[5][2]-kf*1000==0)){
              jTextField24.setBounds(new Rectangle(129+b+60,tup+d+(c+2)*17+2,60,16));
              jTextField24.setVisible(true); jTextField24.setEnabled(true);
            }
            kf=(int)Math.round(tbn[5][3]/1000.0);
            if((tbd[5][3]==1) || (kf==0) || (tbn[5][3]-kf*1000==0)){
              jTextField25.setBounds(new Rectangle(129+b+120,tup+d+(c+2)*17+2,60,16));
              jTextField25.setVisible(true); jTextField25.setEnabled(true);
            }
            kf=(int)Math.round(tbn[5][4]/1000.0);
            if((tbd[5][4]==1) || (kf==0) || (tbn[5][4]-kf*1000==0)){
              jTextField26.setBounds(new Rectangle(129+b+180,tup+d+(c+2)*17+2,60,16));
              jTextField26.setVisible(true); jTextField26.setEnabled(true);
            }
            if(a>=5){
              kf=(int)Math.round(tbn[5][5]/1000.0);
              if((tbd[5][5]==1) || (kf==0) || (tbn[5][5]-kf*1000==0)){
                jTextField27.setBounds(new Rectangle(129+b+240,tup+d+(c+2)*17+2,60,16));
                jTextField27.setVisible(true); jTextField27.setEnabled(true);
              }
            }
            if(a>=6){
              kf=(int)Math.round(tbn[5][6]/1000.0);
              if((tbd[5][6]==1) || (kf==0) || (tbn[5][6]-kf*1000==0)){
                jTextField28.setBounds(new Rectangle(129+b+300,tup+d+(c+2)*17+2,60,16));
                jTextField28.setVisible(true); jTextField28.setEnabled(true);
              }
            }
            if(a==7){
              kf=(int)Math.round(tbn[5][7]/1000.0);
              if((tbd[5][7]==1) || (kf==0) || (tbn[5][7]-kf*1000==0)){
                jTextField29.setBounds(new Rectangle(129+b+360,tup+d+(c+2)*17+2,60,16));
                jTextField29.setVisible(true); jTextField29.setEnabled(true);
              }
            }
            if(AddRAnswer==false){
              RightAnswer=RightAnswer+5;
              if(c>=3)RightAnswer=RightAnswer+2;
              if(c==4)RightAnswer=RightAnswer+3;
              if(a>=5){
                RightAnswer++;
                if(c>=3) RightAnswer++;
              }
              if(a>=6){
                RightAnswer++;
                if(c==4) RightAnswer++;
              }
              if(a==7){
                RightAnswer++;
                if(c>=3) RightAnswer++;
              }
              for(int i=1; i<=a; i++)
              {
                kf=(int)Math.round(tbn[5][i]/1000.0);
                if((tbd[5][i]==1) || (kf==0) || (tbn[5][i]-kf*1000==0))
                  RightAnswer++;
              }
              AddRAnswer=true;
            }
            jButton1.setEnabled(false);
            jButton3.setEnabled(true);
          }
        }
      }
      if(sh==9){
        Tabl1(g,a,c,r+1,1,true,bp);
        Tb1(g,a,c,tbn,tbd,bp);
        fl=false;
        for(int i=1; i<=c; i++)
          if((tbn[0][bp[i-1]]==-1000) && (tbn[i][0]!=0)) fl=true; //пустое
        if(fl==false){    //если непустое множество
          IntF=true;
          for(int i=1; i<=c; i++)
            if((tbd[i][0]>1) && (tbn[i][0]!=0) && (bp[i-1]<=2)){
              IntF=false;
            }
        }
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
        if(edt==false){
          if(slog>=1) jButton1.setEnabled(false);
          edt=true;
          jPanel3.repaint();
        }
      }
      if(sh==10){
        double max=-20000.0;
        for(int i=1; i<=c; i++){
          if(tbn[i][0]>=0){
            if(((1.0*tbn[i][0])%(tbd[i][0]*1.0))/(tbd[i][0]*1.0)>max)
              max=((1.0*tbn[i][0])%(tbd[i][0]*1.0))/(tbd[i][0]*1.0);
          }
          else{
            if((tbd[i][0]+(1.0*tbn[i][0])%(tbd[i][0]*1.0))/(tbd[i][0]*1.0)>max)
              max=(tbd[i][0]+(1.0*tbn[i][0])%(tbd[i][0]*1.0))/(tbd[i][0]*1.0);
          }
        }
        Tabl1(g,a,c,1+r,1,true,bp);
        Tb1(g,a,c,tbn,tbd,bp);
        g.setColor(new Color(230, 230, 255));
        g.fillRect(49+b,tup+d+36,39,17*c-1);
        g.setColor(Color.black);
        for(int i=2; i<=c; i++)
          g.drawLine(b+48,tup+18+d+17*i,b+48+40,tup+18+d+17*i);
        for(int i=0; i<c; i++)
          if(bp[i]>0) Ind_n(g,"x",""+bp[i],b+62,tup+46+d+i*17);
        if(((Kx>=49+b) && (Kx<=89+b)) && ((Ky>=tup+d+36) && (Ky<=tup+d+52)))
          bpx=0;
        else if(((Kx>=49+b) && (Kx<=89+b)) && ((Ky>=tup+d+53) && (Ky<=tup+d+69)))
          bpx=1;
        else if(((Kx>=49+b) && (Kx<=89+b)) && ((Ky>=tup+d+70) && (Ky<=tup+d+86)) && (c>=3))
          bpx=2;
        else if(((Kx>=49+b) && (Kx<=89+b)) && ((Ky>=tup+d+87) && (Ky<=tup+d+103)) && (c==4))
          bpx=3;
        else bpx=-1;
        if(bpx>=0){
          if(((tbn[bpx+1][0]>=0) && (((1.0*tbn[bpx+1][0])%(tbd[bpx+1][0]*1.0))/(tbd[bpx+1][0]*1.0)==max)) ||
            ((tbn[bpx+1][0]<0) && ((tbd[bpx+1][0]+(1.0*tbn[bpx+1][0])%(tbd[bpx+1][0]*1.0))/(tbd[bpx+1][0]*1.0)==max))){
            g.setColor(Color.red);
            Ind_n(g,"x",""+bp[bpx],b+62,tup+46+d+bpx*17);
            Numx=bpx;
            otv=1; jPanel3.repaint();
          }
          else if(otv!=1)
                 {otv=0; jPanel3.repaint();}
               else{
                 g.setColor(Color.red);
                 Ind_n(g,"x",""+bp[Numx],b+62,tup+46+d+Numx*17);
                }
        }
        else if(otv!=1) {otv=-1; jPanel3.repaint();}
             else{
                 g.setColor(Color.red);
                 Ind_n(g,"x",""+bp[Numx],b+62,tup+46+d+Numx*17);
                }
      }
      if(sh==11){
        for(int i=0; i<=a; i++){
          Ogrn[i]=tbn[Numx+1][i];
          Ogrd[i]=tbd[Numx+1][i];
        }
        Tabl1(g,a,c,1+r,1,true,bp);
        g.setColor(new Color(230, 230, 255));
        g.fillRect(89+b,tup+d+2+17*(Numx+2),a*60+39,16);
        g.setColor(Color.black);
        for(int i=0; i<=a; i++)
          g.drawLine(b+128+i*60,tup+d+2+17*(Numx+2),b+128+i*60,tup+18+d+17*(Numx+2));
        g.setColor(Color.red);
        Ind_n(g,"x",""+bp[Numx],b+62,tup+46+d+Numx*17);
        Tb1(g,a,c,tbn,tbd,bp);
        g.setColor(new Color(0, 0, 80));
      }
      if((sh>=12) && (sh<=15)){
        Tabl1(g,a,c,1+r,1,true,bp);
        g.setColor(new Color(230, 230, 255));
        g.fillRect(89+b,tup+d+2+17*(Numx+2),a*60+39,16);
        g.setColor(Color.black);
        for(int i=0; i<=a; i++)
          g.drawLine(b+128+i*60,tup+d+2+17*(Numx+2),b+128+i*60,tup+18+d+17*(Numx+2));
        Tb1(g,a,c,tbn,tbd,bp);
      }
      if(sh==13){
        IntPart(a,Ogrn,Ogrd);
      }
      if(sh==16){
        for(int i=0; i<c; i++)
          tbn[i][a]=0;
        for(int i=0; i<=a; i++){
          tbn[c][i]=Ogrn[i];
          tbd[c][i]=Ogrd[i];
        }
        Tabl1(g,a,c,r+1,0,true,bp);
        Tb1(g,a,c,tbn,tbd,bp);
        if(slog>=1)
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
            jButton1.setEnabled(false);
            if(c>=3){
              jTextField12.setBounds(new Rectangle(129+b,tup+d+70,60,17));
              jTextField14.setBounds(new Rectangle(129+b+120,tup+d+70,60,17));
              jTextField12.setVisible(true); jTextField12.setEnabled(true);
              jTextField14.setVisible(true); jTextField14.setEnabled(true);
              if(c==3){
                jTextField11.setBounds(new Rectangle(89+b,tup+d+70,40,17));
                jTextField13.setBounds(new Rectangle(129+b+60,tup+d+70,60,17));
                jTextField15.setBounds(new Rectangle(129+b+180,tup+d+70,60,17));
                jTextField11.setVisible(true); jTextField11.setEnabled(true);
                jTextField13.setVisible(true); jTextField13.setEnabled(true);
                jTextField15.setVisible(true); jTextField15.setEnabled(true);
              }
              if(c==4){
                jTextField19.setBounds(new Rectangle(89+b,tup+d+87,40,17));
                jTextField20.setBounds(new Rectangle(129+b+60,tup+d+87,60,17));
                jTextField21.setBounds(new Rectangle(129+b+180,tup+d+87,60,17));
                jTextField19.setVisible(true); jTextField19.setEnabled(true);
                jTextField20.setVisible(true); jTextField20.setEnabled(true);
                jTextField21.setVisible(true); jTextField21.setEnabled(true);
                jTextField11.setBounds(new Rectangle(129+b,tup+d+87,60,17));
                jTextField13.setBounds(new Rectangle(129+b+120,tup+d+87,60,17));
                jTextField15.setBounds(new Rectangle(129+b+240,tup+d+87,60,17));
                jTextField11.setVisible(true); jTextField11.setEnabled(true);
                jTextField13.setVisible(true); jTextField13.setEnabled(true);
                jTextField15.setVisible(true); jTextField15.setEnabled(true);
                jTextField10.setNextFocusableComponent(jTextField12);
                jTextField11.setNextFocusableComponent(jTextField20);
                jTextField12.setNextFocusableComponent(jTextField14);
                jTextField13.setNextFocusableComponent(jTextField21);
                jTextField14.setNextFocusableComponent(jTextField16);
                jTextField15.setNextFocusableComponent(jTextField22);
                jTextField16.setNextFocusableComponent(jTextField18);
                jTextField17.setNextFocusableComponent(jTextField23);
                jTextField19.setNextFocusableComponent(jTextField11);
                jTextField20.setNextFocusableComponent(jTextField13);
                jTextField21.setNextFocusableComponent(jTextField15);
                jTextField22.setNextFocusableComponent(jTextField17);
              }
            }
            if(a>=5){
              jTextField5.setBounds(new Rectangle(129+b+240,tup+d+36,60,17));
              jTextField5.setVisible(true); jTextField5.setEnabled(true);
              if(c>=3){
                jTextField16.setBounds(new Rectangle(129+b+240,tup+d+70,60,17));
                jTextField16.setVisible(true); jTextField16.setEnabled(true);
              }
            }
            if(a>=6){
              jTextField10.setBounds(new Rectangle(129+b+300,tup+d+53,60,17));
              jTextField10.setVisible(true); jTextField10.setEnabled(true);
              if(c==3){
                jTextField17.setBounds(new Rectangle(129+b+300,tup+d+70,60,17));
                jTextField17.setVisible(true); jTextField17.setEnabled(true);
              }
              if(c==4){
                jTextField22.setBounds(new Rectangle(129+b+300,tup+d+87,60,17));
                jTextField22.setVisible(true); jTextField22.setEnabled(true);
              }
            }
            if(a==7){
              jTextField6.setBounds(new Rectangle(129+b+360,tup+d+36,60,17));
              jTextField6.setVisible(true); jTextField6.setEnabled(true);
              if(c>=3){
                jTextField18.setBounds(new Rectangle(129+b+360,tup+d+70,60,17));
                jTextField18.setVisible(true); jTextField18.setEnabled(true);
              }
               if(c==4){
                jTextField17.setBounds(new Rectangle(129+b+360,tup+d+87,60,17));
                jTextField17.setVisible(true); jTextField17.setEnabled(true);
              }
            }
            if(AddRAnswer==false){
              RightAnswer=RightAnswer+5;
              if(c==3) RightAnswer=RightAnswer+5;
              if(c==4) RightAnswer=RightAnswer+8;
              if(a>=5){
                RightAnswer++;
                if(c>=3) RightAnswer++;
              }
              if(a>=6){
                RightAnswer++;
                if(c>=3) RightAnswer++;
              }
              if(a==7){
                RightAnswer++;
                if(c>=3) RightAnswer++;
                if(c==4) RightAnswer++;
              }
              AddRAnswer=true;
            }
            jButton1.setEnabled(false);
            jButton3.setEnabled(true);
          }
        }
      }
      if(sh==17){
        double min=20000.0; int nn=0;
        for(int i=1; i<=a; i++)
         if((tbn[5][i]<0) && (min>Math.abs((double)(tbn[5][i]*1.0)/tbd[5][i]))){
           min=Math.abs((double)(tbn[5][i]*1.0)/tbd[5][i]);
         }
        Tabl1(g,a,c,r+1,1,true,bp);
        Tb1(g,a,c,tbn,tbd,bp);
        g.setColor(new Color(230, 230, 255));
        g.fillRect(129+b,tup+d+2+17,a*60-1,16);
        g.setColor(Color.black);
        for(int i=0; i<=a; i++)
        {
          g.drawLine(b+128+i*60,tup+d+2+17,b+128+i*60,tup+18+d+17);
          if(i!=a) Ind_n(g,"x",""+(i+1),b+153+i*60,tup+29+d);
        }
        g.setColor(Color.red);
        Stringer.drawString("?",b+64,tup+32+d+c*17);
        if(((Ky>=tup+d+19) && (Ky<=tup+d+35)) && ((Kx>=69+b+1*60) && (Kx<=128+b+7*60))){
          if((Kx>=69+b+1*60) && (Kx<=128+b+1*60)) nn=1;
          if((Kx>=69+b+2*60) && (Kx<=128+b+2*60)) nn=2;
          if((Kx>=69+b+3*60) && (Kx<=128+b+3*60)) nn=3;
          if((Kx>=69+b+4*60) && (Kx<=128+b+4*60)) nn=4;
          if((Kx>=69+b+5*60) && (Kx<=128+b+5*60)) nn=5;
          if((Kx>=69+b+6*60) && (Kx<=128+b+6*60) && (a>=6)) nn=6;
          if((Kx>=69+b+7*60) && (Kx<=128+b+7*60) && (a==7)) nn=7;
          if((tbn[5][nn]<0) && (min==Math.abs((double)(tbn[5][nn]*1.0)/tbd[5][nn]))){
            n=nn;
            otv=1;
          }
          else if(otv!=1) {otv=0; jPanel3.repaint();}
        }
        else if(otv!=1) {otv=-1; jPanel3.repaint();}
        if(otv==1){
          g.setColor(Color.red);
          Ind_n(g,"x",""+n,b+153+(n-1)*60,tup+29+d);
          jPanel3.repaint();
        }
        if (step2<=1) p=3; else p=4;
      }
      if(sh==18)
      {
        Tabl1(g,a,c,r+1,1,true,bp);
        Tb1(g,a,c,tbn,tbd,bp);
        if(Ch==true)
        {
          int kolmist_calk=0, kolmist_under=0, kolmist_knowledge=0, kolmist_use=0, Vopros=0;
          g.setColor(new Color(190, 190, 190));
          g.fillRect(97,-1,436,142);
          g.setColor(new Color(255, 255, 255));
          g.fillRect(90,-1,436,134);
        //  g.setColor(new Color(247, 247, 255));
        //  g.fillRect(541,-1,15,15);
          g.setColor(Color.blue);
          g.drawRect(90,-1,436,134);
         // g.drawRect(541,-1,15,15); g.drawLine(541,0,556,15); g.drawLine(541,15,556,0);
          g.setColor(new Color(180, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 3, 13));
         // g.drawString("Ваш результат:",259,14);
          for(int i=0; i<40; i++){
            kolmist_calk=kolmist_calk+Mist_calk[i];
            kolmist_under=kolmist_under+Mist_under[i];
            kolmist_knowledge=kolmist_knowledge+Mist_knowledge[i];
            kolmist_use=kolmist_use+Mist_use[i];
          }
          Vopros=RightAnswer+kolmist_calk+kolmist_under+kolmist_knowledge+kolmist_use;
          g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 3, 14));
        //  g.drawString("Количество вопросов: "+Vopros,220,35);
          g.drawString("Количество правильных ответов: "+RightAnswer,180,15);
          g.drawString("Количество допущенных ошибок :",182,35);
          g.drawString("- на знание:           "+kolmist_knowledge,237,50);
          g.drawString("- на понимание:    "+kolmist_under,237,65);
          g.drawString("- на вычисление: "+kolmist_calk,237,80);
          g.drawString("- на применение: "+kolmist_use,237,95);
          g.setColor(new Color(0, 0, 80));
          if(Vopros!=0 && RightAnswer<=Vopros)
            g.drawString("Результат выполнения упражнения: "+(RightAnswer*100/Vopros)+"%",163,120);
          else
            g.drawString("Результат выполнения упражнения: 0%",163,120);
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
      g.drawString("Решение:",15,12);
      g.setColor(new Color(255, 255, 255)); g.fillRect(7,17,602,110);
      g.setColor(new Color(157, 187, 255)); g.drawRect(7,17,602,110);
      if(sh==0){
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("При нажатии кнопки \"Обновить\" происходит смена варианта.",12, 37);
      }
      if(sh==1){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("1.",10, 37);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Так как задача уже имеет ограничения с целочисленными коэффициентами в",26, 37);
        Stringer.drawString("левой и правой частях, то переходим к следующему шагу.",12, 57);
      }
      if(sh==2){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("2.",10, 37);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Будем решать задачу без учета тебования целочисленности симплекс-методом:",26, 37);
        Stringer.drawString("для этого запишем расширенную форму ЗЛП.",12, 57);
        g.setColor(Color.red);
        Stringer.drawString("для этого запишем расширенную форму",12, 57);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("для этого запишем",12, 57);
      }
      if(sh==3){
        otvet="";
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("2.1.",10, 37);
        g.setColor(new Color(0, 0, 80));
        if(slog>=1)
        {
          Stringer.drawString("Заполните                    согласно алгоритму симплекс-метода.",40, 37);
          g.setColor(Color.red); g.setFont(new java.awt.Font("SansSerif", 3, 14));
          g.drawString("Таблицу 1",119, 37);
          g.setColor(Color.red);
          if(edt==true){
            if((Right==false) || (RightPust==false)){
             /* StringerD.drawString("Неправильно",258,87);
              if(Right==false) otvet="( Таблица заполнена неверно. ";
              else otvet="(";
              if(RightPust==false) otvet=otvet+" Не оставляйте поля пустыми. )";
              else otvet=otvet+")";*/
              otvet="Неправильно, внесите заново необходимые элементы таблицы";
              StringerD.drawString(otvet,(600-Fm.stringWidth(otvet)*11/6)/2,97);
            }
            else{
              g.setColor(Color.blue);
              StringerD.drawString("Правильно",267,87);
            }
          }
        }
        else
        {
          Stringer.drawString("Заполняем                    согласно алгоритму симплекс-метода.",40, 37);
          g.setColor(Color.red); g.setFont(new java.awt.Font("SansSerif", 3, 14));
          g.drawString("Таблицу 1",123, 37);
        }
      }
      if(sh==4){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("2.1.0.",10, 37);
        g.setColor(new Color(0, 0, 80));
        if(slog==2)
        {
          Stringer.drawString("Вычислите относительные оценки      ,    = 1, ..., "+a+".",54, 37);
          g.setFont(new java.awt.Font("SansSerif", 3, 14));
          g.drawString("j",338, 37);
          g.setColor(Color.red); Ind_nk(g,"\u2206","  j",310,37);
          if(edt==true){
            if((Right==false) || (RightPust==false)){
              StringerD.drawString("Неправильно",258,87);
              if(Right==false) otvet="( Пересчитайте оценки: "+ots+". ";
              else otvet="(";
              if(RightPust==false) otvet=otvet+" Не оставляйте поля пустыми. )";
              else otvet=otvet+")";
              StringerD.drawString(otvet,(620-(Fm.stringWidth(otvet)-4*((int)Fm.stringWidth(ots)/10))*11/6)/2,107);
            }
            else{
              g.setColor(Color.blue);
              StringerD.drawString("Правильно",267,87);
            }
          }
        }
        else
        {
          Stringer.drawString("Вычисляем относительные оценки      ,    = 1, ..., "+a+".",54, 37);
          g.setFont(new java.awt.Font("SansSerif", 3, 14));
          g.drawString("j",341, 37);
          g.setColor(Color.red); Ind_nk(g,"\u2206","  j",313,37);
        }
      }
      if(sh==5){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        if(step2==0){
          g.drawString("2."+(1+r)+".1.",10, 37);
          g.setColor(new Color(0, 0, 80));
          Stringer.drawString("Проанализируйте относительные оценки     .",54, 37);
          g.setColor(Color.red);
          Ind_nk(g,"\u2206","  j",355,37);
        }
        else{
          g.drawString((step2*10+2)+"."+(1+r-step1)+".1.",10, 37);
          g.setColor(new Color(0, 0, 80));
          Stringer.drawString("Проанализируйте относительные оценки     .",63, 37);
          g.setColor(Color.red);
          Ind_nk(g,"\u2206","  j",364,37);
        }
        g.setColor(new Color(0, 0, 40)); g.setFont(new java.awt.Font("Dialog", 3, 14));
        g.drawString("Текущее базисное решение ",50,62);
        jRadioButton1.setText("оптимально");
        jRadioButton1.setBounds(new Rectangle(253,47,155,20));
        jRadioButton2.setText("не оптимально");
        jRadioButton2.setBounds(new Rectangle(253,67,180,20));
        if(AddRAnswer==false){ RightAnswer++; AddRAnswer=true;}
        jRadioButton1.setVisible(true);
        jRadioButton1.setEnabled(true);
        jRadioButton2.setVisible(true);
        jRadioButton2.setEnabled(true);
        jButton1.setEnabled(false);
        if(Right==false){
          g.setColor(Color.blue);
          StringerD.drawString("Правильно",267,107);
          jButton1.setEnabled(true);
          if(otv==2) jRadioButton1.setEnabled(false);
          else jRadioButton2.setEnabled(false);
        }
        else if(jRadioButton.isSelected()==false){
               g.setColor(Color.red);
               if(otv==1){
                 StringerD.drawString("Неправильно, так как не все оценки       \u2264 0.",154,107);
                 Ind_nk(g,"\u2206","  j",416,107);
                 if(entry==false) Mist_under[5]++; entry=true;
               }
               else if(otv==2){
                      StringerD.drawString("Неправильно, так как все оценки       \u2264 0.",162,107);
                      Ind_nk(g,"\u2206","  j",405,107);
                      if(entry==false) Mist_under[17]++; entry=true;
                    }
             }
      }
      if(sh==6){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        if(slog>=1)
        {
          if(step2==0){
            g.drawString("2."+(1+r)+".2.",10, 37);
            g.setColor(new Color(0, 0, 80));
            Stringer.drawString("Курсором мыши укажите в таблице переменную, которая должна быть",54, 37);
          }
          else{
            g.drawString((step2*10+2)+"."+(1+r-step1)+".2.",10, 37);
            g.setColor(new Color(0, 0, 80));
            Stringer.drawString("Курсором мыши укажите в таблице переменную, которая должна быть",63, 37);
          }
          Stringer.drawString("введена в базис.",12, 57);
          if(AddRAnswer==false){ RightAnswer++; AddRAnswer=true;}
          jRadioButton.setVisible(true);
          jRadioButton.setEnabled(true);
          jButton1.setEnabled(false);
          if(otv==0){
            g.setColor(Color.red); if(entry==false) Mist_under[6]++; entry=true;
            StringerD.drawString("Неправильно, так как оценка при данной переменной",110,87);
            StringerD.drawString("не является максимальной.",201,107);
          }
          else if(otv==1){
                 g.setColor(Color.blue);
                 StringerD.drawString("Правильно",267,87);
                 jButton1.setEnabled(true);
               }
               else if(edt==true)
               {
                 g.setColor(Color.red);
                 StringerD.drawString("Не попали в выделенную область",180,87);
               }
        }
        else
        {
           if(step2==0){
            g.drawString("2."+(1+r)+".2.",10, 37);
            g.setColor(new Color(0, 0, 80));
            Stringer.drawString("Вводим в базис переменную     , т.к. оценка при переменной     ",54, 37);
            Stringer.drawString("максимальна.",12, 57);
            Ind_n(g,"x",""+n,268,37); Ind_n(g,"x",""+n,494,37);
          }
          else{
            g.drawString((step2*10+2)+"."+(1+r-step1)+".2.",10, 37);
            g.setColor(new Color(0, 0, 80));
            Stringer.drawString("Вводим в базис переменную     , т.к. оценка при переменной     ",63, 37);
            Stringer.drawString("максимальна.",12, 57);
            Ind_n(g,"x",""+n,277,37); Ind_n(g,"x",""+n,503,37);
          }
        }
      }
      if(sh==7){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        if(step2==0){
          g.drawString("2."+(1+r)+".3.",10, 37);
          g.setColor(new Color(0, 0, 80));
          Stringer.drawString("Определяем переменную, выводимую из базиса: для этого вычисляем",54, 37);
        }
        else{
          g.drawString((step2*10+2)+"."+(1+r-step1)+".3.",10, 37);
          g.setColor(new Color(0, 0, 80));
          Stringer.drawString("Определяем переменную, выводимую из базиса: для этого вычисляем",63, 37);
        }
        Stringer.drawString("отношение БР/a_{ir}. Курсором мыши укажите в таблице переменную, которая",12, 57);
        Stringer.drawString("должна быть выведена из базиса.",12, 77);
        g.setColor(Color.red);
        Stringer.drawString("отношение БР/a_{ir}",12, 57);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("отношение",12, 57);
        if(AddRAnswer==false){ RightAnswer++; AddRAnswer=true;}
        jRadioButton.setVisible(true);
        jRadioButton.setEnabled(true);
        jButton1.setEnabled(false);
        if((otv==0)){
          g.setColor(Color.red);
          if(tbn[bpx+1][8]!=-20000){
            if(entry==false) Mist_under[7]++; entry=true;
            StringerD.drawString("Неправильно, так как отношение БР/a_{ir} при переменной x_{"+bp[bpx]+"}",98,97);
            StringerD.drawString("не является минимальным.",208,117);
          }
          else{
            StringerD.drawString("Неправильно, т.к. коэффициент при переменной x_{"+bp[bpx]+"} в столбце соответствующему",15,97);
            StringerD.drawString("переменной x_{"+n+"}, вводимой в базис, не является положительным.",77,117);
            if(entry==false) Mist_under[7]++; entry=true;
          }
        }
        else if(otv==1){
               g.setColor(Color.blue);
               StringerD.drawString("Правильно",267,102);
               jButton1.setEnabled(true);
             }
             else if(edt==true)
               {
                 g.setColor(Color.red);
                 StringerD.drawString("Не попали в выделенную область",180,107);
               }
      }
      if(sh==8){
        otvet="";
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        if(slog==2)
        {
          if(step2==0){
            g.drawString("2."+(r+1)+".",10, 37);
            g.setColor(new Color(0, 0, 80));
            Stringer.drawString("Вычислите новое базисное решение и занесите результаты пересчета в",40, 37);
          }
          else{
            g.drawString((step2*10+2)+"."+(1+r-step1)+".",10, 37);
            g.setColor(new Color(0, 0, 80));
            Stringer.drawString("Вычислите новое базисное решение и занесите результаты пересчета в",48, 37);
          }
          g.setFont(new java.awt.Font("SansSerif", 3, 14));
          g.drawString("Таблицу "+(r+1)+".",12, 57);
          g.setColor(Color.red);
          g.drawString("Таблицу "+(r+1),12, 57);
          jCheckBox1.setText("Таблица "+r);
          jCheckBox1.setVisible(true);  jCheckBox1.setEnabled(true);
          g.setColor(Color.red);
          if(edt==true){
            if((Right==false) || (RightPust==false)){
            /*  StringerD.drawString("Неправильно",258,87);
              if(Right==false) otvet="( Таблица заполнена неверно. ";
              else otvet="(";
              if(RightPust==false) otvet=otvet+" Не оставляйте поля пустыми. )";
              else otvet=otvet+")";*/
              otvet="Неправильно, внесите заново необходимые элементы таблицы";
              StringerD.drawString(otvet,(600-Fm.stringWidth(otvet)*11/6)/2,97);
            }
            else{
              g.setColor(Color.blue);
              StringerD.drawString("Правильно",267,87);
              jButton1.setEnabled(true);
            }
          }
        }
        else
        {
          if(step2==0){
            g.drawString("2."+(r+1)+".",10, 37);
            g.setColor(new Color(0, 0, 80));
            Stringer.drawString("Вычисляем новое базисное решение и заносим результаты пересчета в",40, 37);
          }
          else{
            g.drawString((step2*10+2)+"."+(1+r-step1)+".",10, 37);
            g.setColor(new Color(0, 0, 80));
            Stringer.drawString("Вычисляем новое базисное решение и заносим результаты пересчета в",48, 37);
          }
          g.setFont(new java.awt.Font("SansSerif", 3, 14));
          g.drawString("Таблицу "+(r+1)+".",12, 57);
          g.setColor(Color.red);
          g.drawString("Таблицу "+(r+1),12, 57);
          jCheckBox1.setText("Таблица "+r);
          jCheckBox1.setVisible(true);  jCheckBox1.setEnabled(true);
        }
      }
      if(sh==9){
        otvet=""; int ki=0;
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        if(step2>=1){ ki=1; g.drawString((step2*10+3)+".",10, 37);}
        else g.drawString("3.",10, 37);
        if(slog>=1)
        {
          g.setColor(new Color(0, 0, 40)); g.setFont(new java.awt.Font("SansSerif", 3, 14));
          g.drawString("Оптимальное решение задачи ЗЛП является",26+ki*9, 37);
          jRadioButton1.setText("целочисленным");
          jRadioButton1.setBounds(new Rectangle(358+ki*9,22,200,20));
          jRadioButton2.setText("нецелочисленным");
          jRadioButton2.setBounds(new Rectangle(358+ki*9,42,220,20));
          jRadioButton3.setText("пустым множеством");
          jRadioButton3.setBounds(new Rectangle(358+ki*9,62,238,20));
          if(AddRAnswer==false){ RightAnswer++; AddRAnswer=true;}
          jRadioButton1.setVisible(true); jRadioButton1.setEnabled(true);
          jRadioButton2.setVisible(true); jRadioButton2.setEnabled(true);
          jRadioButton3.setVisible(true); jRadioButton3.setEnabled(true);
          if(otv!=-1){
            if(((otv==1) && (IntF==true) && (fl==false)) || ((otv==2) && (IntF==false) && (fl==false)) || ((otv==3) && (fl==true))){
              if(otv==1){ jRadioButton2.setEnabled(false); jRadioButton3.setEnabled(false);}
              if(otv==2){ jRadioButton1.setEnabled(false); jRadioButton3.setEnabled(false);}
              if(otv==3){ jRadioButton1.setEnabled(false); jRadioButton2.setEnabled(false);}
              g.setColor(Color.blue);
              StringerD.drawString("Правильно",267,77);
              jButton1.setEnabled(true);
            }
            else{
              if(fl==true){
                int u=0;
                for(int i=0; i<=c; i++)
                  if((tbn[0][bp[i]]==-1000) && (tbn[i+1][0]!=0))
                    u=bp[i];
                g.setColor(Color.red);
                StringerD.drawString("( Так как искусственная переменная x_{"+u+"} в оптимальном решении не равна нулю. )",50,120);
              }
              g.setColor(Color.red);
              StringerD.drawString("Неправильно",250,77); if(entry==false) Mist_under[18]++; entry=true;
            }
          }
        }
        else
        {
          g.setColor(new Color(0, 0, 80));
          Stringer.drawString("Оптимальное решение задачи ЗЛП - "+k+" ",26+ki*9, 37);
          if((IntF==true) && (fl==false))
          {
            Stringer.drawString("целочисленное.", 304+ki*9, 37);
            otv=1;
          }
          if((IntF==false) && (fl==false))
            Stringer.drawString("нецелочисленное.", 304+ki*9, 37);
           if(fl==true)
            Stringer.drawString("пустое множество.", 304+ki*9, 37);
            //jPanel3.repaint();
        }
      }
      if(sh==10){
        int ki=0;
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        if(step2>=1){ ki=1; g.drawString((step2*10+4)+".",10, 37);}
        else g.drawString("4.",10, 37);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Выберите нецелочисленную переменную x_{i}, из числа базисных, по которой",26+ki*9, 37);
        Stringer.drawString("будет строиться новое ограничение.",12, 57);
        if(AddRAnswer==false){ RightAnswer++; AddRAnswer=true;}
        jRadioButton.setVisible(true);
        jRadioButton.setEnabled(true);
        jButton1.setEnabled(false);
        if((otv==0)){
          g.setColor(Color.red);
          if(tbd[bpx+1][0]==1){
            if(entry==false) Mist_knowledge[20]++; entry=true;
            StringerD.drawString("Неправильно, так как переменная x_{"+bp[bpx]+"} целочисленная.",112,97);
          }
          else{
            StringerD.drawString("Неправильно, так как дробная часть переменной x_{"+bp[bpx]+"} не является максимальной.",21,97);
            if(entry==false) Mist_knowledge[20]++; entry=true;
          }
        }
        else if(otv==1){
               g.setColor(Color.blue);
               StringerD.drawString("Правильно",267,97);
               jButton1.setEnabled(true);
             }
             else if(edt==true)
               {
                 g.setColor(Color.red);
                 StringerD.drawString("Не попали в выделенную область",180,97);
               }
      }
      if(sh==11){
        String ogran=""; int l=0;
        if(slog>=1)
        {
          ogran="x_{"+bp[Numx]+" }=            ";
          for(int i=1; i<=a; i++)
            if((bp[0]!=i) && (bp[1]!=i) && (bp[2]!=i)){
              ogran=ogran+"+            x_{"+i+" }";
              Vr[l]=i;
              l++;
            }
          if(edt==false){
            jTextField30.setBounds(new Rectangle(224-(l-2)*45,55,40,17));
            jTextField31.setBounds(new Rectangle(281-(l-2)*45,55,40,17));
            jTextField32.setBounds(new Rectangle(355-(l-2)*45,55,40,17));
            jTextField30.setVisible(true); jTextField30.setEnabled(true);
            jTextField31.setVisible(true); jTextField31.setEnabled(true);
            jTextField32.setVisible(true); jTextField32.setEnabled(true);
            if(l>=3){
              jTextField33.setBounds(new Rectangle(427-(l-2)*45,55,40,17));
              jTextField33.setVisible(true); jTextField33.setEnabled(true);
            }
            if(l==4){
              jTextField34.setBounds(new Rectangle(401-(l-2)*45,55,40,17));
              jTextField34.setVisible(true); jTextField34.setEnabled(true);
            }
            if(AddRAnswer==false){
              RightAnswer=RightAnswer+3;
              if(l>=3) RightAnswer++;
              if(l==4) RightAnswer++;
              AddRAnswer=true;
            }
            jButton1.setEnabled(false);
            jButton3.setEnabled(true);
          }
        }
        else
        {
          ogran="x_{"+bp[Numx]+" }= "+tbn[Numx+1][0];
          if((tbn[Numx+1][0]!=0) && (tbd[Numx+1][0]!=1))
            ogran=ogran+"/"+tbd[Numx+1][0];
          ogran=ogran+" ";
          for(int i=1; i<=a; i++)
            if((bp[0]!=i) && (bp[1]!=i) && (bp[2]!=i)){
              if(tbn[Numx+1][i]>=0) ogran=ogran+"- ";
              else ogran=ogran+"+ ";
              ogran=ogran+Math.abs(tbn[Numx+1][i]);
              if((tbn[Numx+1][i]!=0) && (tbd[Numx+1][i]!=1))
                 ogran=ogran+"/"+tbd[Numx+1][i];
              ogran=ogran+" x_{"+i+" }";
              Vr[l]=i;
              l++;
            }
        }
        int ki=0;
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        if(step2>=1){ ki=1; g.drawString((step2*10+5)+".",10, 37);}
        else g.drawString("5.",10, 37);
        g.setColor(new Color(0, 0, 80));
        if(slog>=1)
        {
          Stringer.drawString("Запишите уравнение пользуясь оптимальной",26+ki*9, 37);
          Stringer.drawString(ogran+".",195-(l-2)*45, 67);
          g.setFont(new java.awt.Font("SansSerif", 3, 14));
          g.drawString("Таблицей "+(r+1),360+ki*9, 37);
          jCheckBox1.setText("Формула");
          jCheckBox1.setVisible(true);  jCheckBox1.setEnabled(true);
          g.setColor(Color.red);
          if(edt==true){
            if((Right==false) || (RightPust==false)){
              if(Right==false) otvet="Неправильно";
              if(RightPust==false) otvet=otvet+" Не оставляйте поля пустыми.";
              StringerD.drawString(otvet,(620-Fm.stringWidth(otvet)*11/6)/2,107);
            }
            else{
              g.setColor(Color.blue);
              StringerD.drawString("Правильно",267,107);
            }
          }
        }
        else
        {
           Stringer.drawString("Запишим уравнение пользуясь оптимальной",26+ki*9, 37);
           Stringer.drawString(ogran+".",240-(l-2)*45, 67);
           g.setFont(new java.awt.Font("SansSerif", 3, 14));
           g.drawString("Таблицей "+(r+1),355+ki*9, 37);
           jCheckBox1.setText("Формула");
           jCheckBox1.setVisible(true);  jCheckBox1.setEnabled(true);
        }
      }
      if(sh==12){
        int ki=0;
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        if(step2>=1){ ki=1; g.drawString((step2*10+6)+".",10, 37);}
        else g.drawString("6.",10, 37);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Так как значение должно быть целым, получаем",26+ki*9, 37);
        jCheckBox1.setText("Формула");
        jCheckBox1.setVisible(true);  jCheckBox1.setEnabled(true);
        jj=""; int l=0;
        for (int i=1; i<=a; i++)
          if(Ogrn[i]<20000){
            if((bp[Numx]!=i) && (Ogrn[i]!=0)){
              l++;
              if(l>1) jj=jj+"+ ";
              if((Ogrd[i]==1)) jj=jj+Ogrn[i];
              else if(((Ogrn[i]>=10) && (Ogrd[i]<10)) || ((Ogrn[i]<0) && (Ogrn[i]>-10) && (Ogrd[i]<10)))
                     jj=jj+"|{"+Ogrn[i]+"}{ "+Ogrd[i]+"}";
                   else if((Ogrn[i]>0) && (Ogrn[i]<10) && (Ogrd[i]>=10))
                          jj=jj+"|{ "+Ogrn[i]+"}{"+Ogrd[i]+"}";
                        else jj=jj+"|{"+Ogrn[i]+"}{"+Ogrd[i]+"}";
              jj=jj+" x_{"+i+" }";
            }
         }
         jj=jj+"\u2261@{@{ C}} ";
         if((Ogrd[0]==1) || (Ogrn[0]==0)) jj=jj+Ogrn[0];
         else if((Ogrn[0]>=10) && (Ogrd[0]<10))
                     jj=jj+"|{"+Ogrn[0]+"}{ "+Ogrd[0]+"}";
                   else if((Ogrn[0]<10) && (Ogrd[0]>=10))
                          jj=jj+"|{ "+Ogrn[0]+"}{"+Ogrd[0]+"}";
                        else jj=jj+"|{"+Ogrn[0]+"}{"+Ogrd[0]+"}";
         Stringer.drawString(jj+" .",(int)(612-Fm.stringWidth(jj)*0.55)/2,77);
      }
      if(sh==13){
        String ogran=""; int l=0;
        for(int i=1; i<=a; i++)
          if((bp[0]!=i) && (bp[1]!=i) && (bp[2]!=i)){
            if(l>0)
              ogran=ogran+"+            x_{"+i+" }";
            else
              ogran=ogran+"           x_{"+i+" }";
            Vr[l]=i;
            l++;
          }
        ogran=ogran+"\u2261@{@{ C}}            ";
        if(edt==false){
          jTextField30.setBounds(new Rectangle(355+(l-2)*36,55,40,17));
          jTextField31.setBounds(new Rectangle(209-(l-2)*38,55,40,17));
          jTextField32.setBounds(new Rectangle(282-(l-2)*38,55,40,17));
          jTextField30.setVisible(true); jTextField30.setEnabled(true);
          jTextField31.setVisible(true); jTextField31.setEnabled(true);
          jTextField32.setVisible(true); jTextField32.setEnabled(true);
          if(l>=3){
            jTextField33.setBounds(new Rectangle(355-(l-2)*38,55,40,17));
            jTextField33.setVisible(true); jTextField33.setEnabled(true);
          }
          if(l==4){
            jTextField34.setBounds(new Rectangle(428-(l-2)*45,55,40,17));
            jTextField34.setVisible(true); jTextField34.setEnabled(true);
          }
          if(AddRAnswer==false){
              RightAnswer=RightAnswer+3;
              if(l>=3) RightAnswer++;
              if(l==4) RightAnswer++;
              AddRAnswer=true;
            }
          jButton1.setEnabled(false);
          jButton3.setEnabled(true);
        }
        int ki=0;
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        if(step2>=1){ ki=1; g.drawString((step2*10+7)+".",10, 37);}
        else g.drawString("7.",10, 37);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Запишите неотрицательные дробные части всех коэффициентов",26+ki*9, 37);
        Stringer.drawString(ogran+".",208-(l-2)*38, 67);
        jCheckBox1.setText("Формула");
        jCheckBox1.setVisible(true);  jCheckBox1.setEnabled(true);
        g.setColor(Color.red);
        if(edt==true){
          if((Right==false) || (RightPust==false)){
            if(Right==false) otvet="Неправильно";
            if(RightPust==false) otvet=otvet+" Не оставляйте поля пустыми";
            StringerD.drawString(otvet,(620-Fm.stringWidth(otvet)*11/6)/2,97);
          }
          else{
            g.setColor(Color.blue);
            StringerD.drawString("Правильно",267,97);
          }
        }
      }
      if(sh==14){
        int ki=0;
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        if(step2>=1){ ki=1; g.drawString((step2*10+8)+".",10, 37);}
        else g.drawString("8.",10, 37);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Таким образом, новое ограничение будет иметь вид:",26+ki*9, 37);
        jCheckBox1.setText("Формула");
        jCheckBox1.setVisible(true);  jCheckBox1.setEnabled(true);
        jj=""; int l=0;
        for (int i=1; i<=a; i++)
          if(Ogrn[i]<20000){
            if((bp[Numx]!=i) && (Ogrn[i]!=0)){
              l++;
              if(l>1) jj=jj+"+ ";
              if((Ogrd[i]==1)) jj=jj+Ogrn[i];
              else if((Ogrn[i]>=10) && (Ogrd[i]<10))
                     jj=jj+"|{"+Ogrn[i]+"}{ "+Ogrd[i]+"}";
                   else if((Ogrn[i]<10) && (Ogrd[i]>=10))
                          jj=jj+"|{ "+Ogrn[i]+"}{"+Ogrd[i]+"}";
                        else jj=jj+"|{"+Ogrn[i]+"}{"+Ogrd[i]+"}";
              jj=jj+" x_{"+i+" }";
            }
         }
         jj=jj+"\u2265 ";
         if((Ogrd[0]==1) || (Ogrn[0]==0)) jj=jj+Ogrn[0];
         else if((Ogrn[0]>=10) && (Ogrd[0]<10))
                     jj=jj+"|{"+Ogrn[0]+"}{ "+Ogrd[0]+"}";
                   else if((Ogrn[0]<10) && (Ogrd[0]>=10))
                          jj=jj+"|{ "+Ogrn[0]+"}{"+Ogrd[0]+"}";
                        else jj=jj+"|{"+Ogrn[0]+"}{"+Ogrd[0]+"}";
         Stringer.drawString(jj+" .",(int)(612-Fm.stringWidth(jj)*0.55)/2,77);
      }
      if(sh==15){
        int ki=0; String ogran="";
        jj=""; int l=0;
        for (int i=1; i<=a+1; i++)
          if(Ogrn[i]<20000){
            if((bp[Numx]!=i) && (Ogrn[i]!=0)){
              if(ogran.equals("")==true) ogran=ogran+"x_{"+i+" }";
              else ogran=ogran+"+            x_{"+i+" }";
            Vr[l]=i;
              l++;
              if(l>1 && i<=a) jj=jj+"+ ";
              if((Ogrd[i]==1)){
                if(Ogrn[i]>=0) jj=jj+"+ "+Math.abs(Ogrn[i]);
                else jj=jj+"- "+Math.abs(Ogrn[i]);
              }
              else if((Ogrn[i]>=10) && (Ogrd[i]<10))
                     jj=jj+"|{"+Ogrn[i]+"}{ "+Ogrd[i]+"}";
                   else if((Ogrn[i]<10) && (Ogrd[i]>=10))
                          jj=jj+"|{ "+Ogrn[i]+"}{"+Ogrd[i]+"}";
                        else jj=jj+"|{"+Ogrn[i]+"}{"+Ogrd[i]+"}";
              if(i==(a+1)) jj=jj+"* x_{"+i+" }";
              else jj=jj+" x_{"+i+" }";
            }
          }
        jj=jj+"= ";
        if((Ogrd[0]==1) || (Ogrn[0]==0)) jj=jj+Ogrn[0];
        else if((Ogrn[0]>=10) && (Ogrd[0]<10))
               jj=jj+"|{"+Ogrn[0]+"}{ "+Ogrd[0]+"}";
             else if((Ogrn[0]<10) && (Ogrd[0]>=10))
                    jj=jj+"|{ "+Ogrn[0]+"}{"+Ogrd[0]+"}";
                  else jj=jj+"|{"+Ogrn[0]+"}{"+Ogrd[0]+"}";
        ogr=jj;
        ogran=ogran+" = ";
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        if(step2>=1){ ki=1; g.drawString((step2*10+9)+".",10, 37);}
        else g.drawString("9.",10, 37);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Запишите ограничение в виде равенства пользуясь формулой.",26+ki*9, 37);
        Stringer.drawString(ogran+".",251-(l-2)*38, 67);
        jCheckBox1.setText("Формула");
        jCheckBox1.setVisible(true);  jCheckBox1.setEnabled(true);
         if(edt==false){
          jTextField30.setBounds(new Rectangle(355+(l-2)*36,55,40,17));
          jTextField31.setBounds(new Rectangle(209-(l-2)*38,55,40,17));
          jTextField32.setBounds(new Rectangle(282-(l-2)*38,55,40,17));
          jTextField30.setVisible(true); jTextField30.setEnabled(true);
          jTextField31.setVisible(true); jTextField31.setEnabled(true);
          jTextField32.setVisible(true); jTextField32.setEnabled(true);
          if(l>=3){
            jTextField33.setBounds(new Rectangle(355-(l-2)*38,55,40,17));
            jTextField33.setVisible(true); jTextField33.setEnabled(true);
          }
          if(l==4){
            jTextField34.setBounds(new Rectangle(428-(l-2)*38,55,40,17));
            jTextField34.setVisible(true); jTextField34.setEnabled(true);
          }
          if(AddRAnswer==false){
              RightAnswer=RightAnswer+3;
              if(l>=3) RightAnswer++;
              if(l==4) RightAnswer++;
              AddRAnswer=true;
            }
          jButton1.setEnabled(false);
          jButton3.setEnabled(true);
        }
        if(edt==true){
          if((Right==false) || (RightPust==false)){
            if(Right==false) otvet="Неправильно";
            if(RightPust==false) otvet=otvet+" Не оставляйте поля пустыми";
            g.setColor(Color.red);
            StringerD.drawString(otvet,(620-Fm.stringWidth(otvet)*11/6)/2,97);
          }
          else{
            g.setColor(Color.blue);
            StringerD.drawString("Правильно",267,97);
          }
        }
      }
      if(sh==16){
        otvet=""; int ki=0;
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        if(step2>=1){ ki=1; g.drawString((step2*10)+".",10, 37);}
        else g.drawString("10.",10, 37);
        g.setColor(new Color(0, 0, 80));
        if(slog>=1)
        {
          Stringer.drawString("Заполните расширенную                    на базе                     и нового ограничения",35, 37);
          Stringer.drawString(ogr+" .",12,62);
          g.setFont(new java.awt.Font("SansSerif", 3, 14));
          g.drawString("Таблицы "+r,350, 37);
          g.setColor(Color.red);
          g.drawString("Таблицу "+(r+1),217, 37);
          jCheckBox1.setText("Таблица "+r);
          jCheckBox1.setVisible(true);  jCheckBox1.setEnabled(true);
          if(edt==true){
            if((Right==false) || (RightPust==false)){
             /* StringerD.drawString("Неправильно",258,87);
              if(Right==false) otvet="( Таблица заполнена неверно. ";
              else otvet="(";
              if(RightPust==false) otvet=otvet+" Не оставляйте поля пустыми. )";
              else otvet=otvet+")";*/
              otvet="Неправильно, внесите заново необходимые элементы таблицы";
              StringerD.drawString(otvet,(600-Fm.stringWidth(otvet)*11/6)/2,97);
            }
            else{
              g.setColor(Color.blue);
              StringerD.drawString("Правильно",267,87);
            }
          }
        }
        else
        {
          Stringer.drawString("Заполняем расширенную                    на базе                     и нового ограничения",35, 37);
          Stringer.drawString(ogr+".",12,62);
          g.setFont(new java.awt.Font("SansSerif", 3, 14));
          g.drawString("Таблицы "+r,352, 37);
          g.setColor(Color.red);
          g.drawString("Таблицу "+(r+1),219, 37);
          jCheckBox1.setText("Таблица "+r);
          jCheckBox1.setVisible(true);  jCheckBox1.setEnabled(true);
        }
      }
      if(sh==17){
        int ki=0;
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        if(step2>=1){ ki=1; g.drawString((step2*10+1)+".",10, 37);}
        else g.drawString("11.",10, 37);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Курсором мыши укажите в таблице переменную, которую нужно ввести в",35, 37);
        Stringer.drawString("базис.",12, 57);
        if(AddRAnswer==false){ RightAnswer++; AddRAnswer=true;}
        jRadioButton.setVisible(true);
        jRadioButton.setEnabled(true);
        jButton1.setEnabled(false);
        if(otv==0){
          g.setColor(Color.red); if(entry==false) Mist_under[27]++; entry=true;
          StringerD.drawString("Неправильно, так как оценка при данной переменной",110,87);
          StringerD.drawString("не является наименьшей по модулю из отрицательных оценок.",72,107);
        }
        else if(otv==1){
               g.setColor(Color.blue);
               StringerD.drawString("Правильно",267,87);
               jButton1.setEnabled(true);
             }
             else if(edt==true)
             {
               g.setColor(Color.red);
               StringerD.drawString("Не попали в выделенную область",180,97);
             }
      }
      if(sh==18){
        otvet="Решение изходной задачи: x^{* }= ("; boolean flag=false; int ki=0;
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        if(step2>=1){ ki=1; g.drawString((step2*10+4)+".",10, 37);}
        else g.drawString("14.",10, 37);
        g.setColor(new Color(0, 0, 80));
        for(int i=0; i<c; i++)
          if(bp[i]==1){ flag=true; otvet=otvet+tbn[i+1][0]+"; ";}
        if(flag==false) otvet=otvet+"0; ";
        flag=false;
        for(int i=0; i<c; i++)
          if(bp[i]==2){ flag=true; otvet=otvet+tbn[i+1][0]+").";}
        if(flag==false) otvet=otvet+"0).";
        g.setColor(Color.red);
        Stringer.drawString(otvet,35, 37);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Решение изходной задачи:",35, 37);
        jCheckBoxRezult.setVisible(true);  jCheckBoxRezult.setEnabled(true);
        g.setColor(Color.black);
        g.drawLine(230,80,390,80); g.drawLine(230,81,390,81);
      /*  g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("Вы  совершили  следующее  количество  ошибок :",40,67);
        for(int i=0; i<40; i++){
          kolmist_calk=kolmist_calk+Mist_calk[i];
          kolmist_under=kolmist_under+Mist_under[i];
        }
        if(slog==2)
        {
          g.drawString("на вычисление - "+kolmist_calk+" ;",410,67);
          g.drawString("на понимание   - "+kolmist_under+" .",410,87);
        }
        else
          g.drawString(""+kolmist_under+" .",403,67);*/
     }
     if(sh==18) jButton1.setEnabled(false);
    }
  }

  void jPanel2_mouseClicked(MouseEvent e){
    if((sh==6) || (sh==7) || (sh==10) || (sh==17)){
      edt=true; entry=false;
      Kx=e.getX(); Ky=e.getY();
      jPanel2.repaint();
    //  jPanel3.repaint();
    }
  }
  void jPanel1_mouseClicked(MouseEvent e){
    if(sh==18 && e.getX()>=511 && e.getX()<=526 && e.getY()>=135 && e.getY()<=150){
      jCheckBoxRezult.setSelected(false);
      Ch=false;
      jPanel1.repaint();
      jPanel2.repaint();
      //jCheckBoxRezult.setOpaque(true);
    }
     if((sh==6) || (sh==7) || (sh==10) || (sh==17)){
      edt=true;
      jPanel3.repaint();
    }
  }
  void jPanel3_mouseClicked(MouseEvent e){
    if((sh==6) || (sh==7) || (sh==10) || (sh==17)){
      edt=true;
      jPanel3.repaint();
    }
  }

  void this_mouseMoved(MouseEvent e) {
    int a,aa;
    xx=e.getX();
    yy=e.getY();
    a=e.getX();
    aa=e.getY();
    if((xx>=5)&&(xx<=621)) a=xx-5;
    if((yy>=26)&&(yy<=199)) aa=yy-26;
    if((yy>=200)&&(yy<=340)) aa=yy-200;
    if((yy>=342)&&(yy<=470)) aa=yy-342;
 //   jLabel2.setText("x="+Integer.toString(a)+"   y="+Integer.toString(aa));

  }

  void jButton1_actionPerformed(ActionEvent e) {
    jRadioButton.setSelected(true);
    jRadioButton1.setEnabled(false); jRadioButton1.setVisible(false);
    jRadioButton2.setEnabled(false); jRadioButton2.setVisible(false);
    jRadioButton3.setEnabled(false); jRadioButton3.setVisible(false);
    jCheckBox1.setSelected(false); jCheckBox1.setEnabled(false); jCheckBox1.setVisible(false);
 //  jComboBox1.setVisible(true); jComboBox1.setEnabled(true);
 //   jComboBox2.setVisible(true); jComboBox2.setEnabled(true);
    jTextField30.setText(""); jTextField30.setEnabled(false); jTextField30.setVisible(false);
    jTextField31.setText(""); jTextField31.setEnabled(false); jTextField31.setVisible(false);
    jTextField32.setText(""); jTextField32.setEnabled(false); jTextField32.setVisible(false);
    jTextField33.setText(""); jTextField33.setEnabled(false); jTextField33.setVisible(false);
    jTextField34.setText(""); jTextField34.setEnabled(false); jTextField34.setVisible(false);
    jTextField10.setNextFocusableComponent(jTextField11);
    jTextField11.setNextFocusableComponent(jTextField12);
    jTextField12.setNextFocusableComponent(jTextField13);
    jTextField13.setNextFocusableComponent(jTextField14);
    jTextField14.setNextFocusableComponent(jTextField15);
    jTextField15.setNextFocusableComponent(jTextField16);
    jTextField16.setNextFocusableComponent(jTextField17);
    jTextField17.setNextFocusableComponent(jTextField18);
    jTextField19.setNextFocusableComponent(jTextField20);
    jTextField20.setNextFocusableComponent(jTextField21);
    jTextField21.setNextFocusableComponent(jTextField22);
    jTextField22.setNextFocusableComponent(jTextField23);
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
    jTextField25.setForeground(new Color(0, 0, 120));
    jTextField26.setForeground(new Color(0, 0, 120));
    jTextField27.setForeground(new Color(0, 0, 120));
    jTextField28.setForeground(new Color(0, 0, 120));
    jTextField29.setForeground(new Color(0, 0, 120));
    jTextField30.setForeground(new Color(0, 0, 120));
    jTextField31.setForeground(new Color(0, 0, 120));
    jTextField32.setForeground(new Color(0, 0, 120));
    jTextField33.setForeground(new Color(0, 0, 120));
    jTextField34.setForeground(new Color(0, 0, 120));
    if((sh==9) && (otv==1)) sh=18;
    if(sh==8) sh=4;
    if((sh==5) && (n<=0)) sh=8;
    if(sh==15) step2++;
    if(sh==16) n=0;
    if(sh==17){ tbn[5][a]=0; sh=7; step1=r+1; if(step2==0) step2=1; }
    sh++;
    if (sh>18) sh=18;
    if((sh==8) || (sh==16)){
      for(int i=0; i<=5; i++)
        for(int j=0; j<=8; j++){
          tbn0[i][j]=tbn[i][j];
          tbd0[i][j]=tbd[i][j];
       }
      for(int i=0; i<=2; i++){
        bp0[i]=bp[i];
      }
      a0=a; c0=c; r++;
    }
    if(sh==15){
      Ogrn[a+1]=-1;
      Ogrd[a+1]=1;
    }
    if(sh==16){ a++; c++;}
    edt=false; Right=true; RightPust=true; Ch=false; entry=false; AddRAnswer=false;
    otv=-1; bpx=-1; Kx=0; Ky=0;
    jPanel2.repaint();
    jPanel1.repaint();
    jPanel3.repaint();
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
    sh=0; AddRAnswer=false;
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
          else{ Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField3.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField3.setForeground(Color.red);
        }
      }
      else{ Right=false; jTextField3.setForeground(Color.red);}
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
          else{ Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField4.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField4.setForeground(Color.red);
        }
      }
      else{ Right=false; jTextField4.setForeground(Color.red);}
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
          else{ Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField5.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField5.setForeground(Color.red);
        }
      }
      else{ Right=false; jTextField5.setForeground(Color.red);}
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
          else{ Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField6.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField6.setForeground(Color.red);
        }
      }
      else{ Right=false; jTextField6.setForeground(Color.red);}
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
          else{ Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField7.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField7.setForeground(Color.red);
        }
      }
      else{ Right=false; jTextField7.setForeground(Color.red);}
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
          else{ Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField8.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField8.setForeground(Color.red);
        }
      }
      else{ Right=false; jTextField8.setForeground(Color.red);}
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
          else{ Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField9.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField9.setForeground(Color.red);
        }
      }
      else{ Right=false; jTextField9.setForeground(Color.red);}
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
          else{ Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField10.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField10.setForeground(Color.red);
        }
      }
      else{ Right=false; jTextField10.setForeground(Color.red);}
    }
    else if((jTextField10.isEnabled()==true) && (jTextField10.getText().equals("")==true)) RightPust=false;
    if((jTextField11.isEnabled()==true) && (jTextField11.getText().equals("")!=true)){
      txt=jTextField11.getText();
      if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
        index=txt.indexOf("/");
        try{
          if(index==-1) Number=Double.parseDouble(txt);
          else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
          if((((double)tbn[3][0]/tbd[3][0]==Number) && (c==3)) || (((double)tbn[4][1]/tbd[4][1]==Number) && (c==4))){
            jTextField11.setText(""); jTextField11.setVisible(false); jTextField11.setEnabled(false);
          }
          else{ Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField11.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField11.setForeground(Color.red);
        }
      }
      else{ Right=false; jTextField11.setForeground(Color.red);}
    }
    else if((jTextField11.isEnabled()==true) && (jTextField11.getText().equals("")==true)) RightPust=false;
    if((jTextField12.isEnabled()==true) && (jTextField12.getText().equals("")!=true)){
      txt=jTextField12.getText();
      if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
        index=txt.indexOf("/");
        try{
          if(index==-1) Number=Double.parseDouble(txt);
          else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
          if((double)tbn[3][1]/tbd[3][1]==Number){
            jTextField12.setText(""); jTextField12.setVisible(false); jTextField12.setEnabled(false);
          }
          else{ Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField12.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField12.setForeground(Color.red);
        }
      }
      else{ Right=false; jTextField12.setForeground(Color.red);}
    }
    else if((jTextField12.isEnabled()==true) && (jTextField12.getText().equals("")==true)) RightPust=false;
    if((jTextField13.isEnabled()==true) && (jTextField13.getText().equals("")!=true)){
      txt=jTextField13.getText();
      if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
        index=txt.indexOf("/");
        try{
          if(index==-1) Number=Double.parseDouble(txt);
          else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
          if((((double)tbn[3][2]/tbd[3][2]==Number) && (c==3)) || (((double)tbn[4][3]/tbd[4][3]==Number) && (c==4))){
            jTextField13.setText(""); jTextField13.setVisible(false); jTextField13.setEnabled(false);
          }
          else{ Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField13.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField13.setForeground(Color.red);
        }
      }
      else{ Right=false; jTextField13.setForeground(Color.red);}
    }
    else if((jTextField13.isEnabled()==true) && (jTextField13.getText().equals("")==true)) RightPust=false;
    if((jTextField14.isEnabled()==true) && (jTextField14.getText().equals("")!=true)){
      txt=jTextField14.getText();
      if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
        index=txt.indexOf("/");
        try{
          if(index==-1) Number=Double.parseDouble(txt);
          else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
          if((double)tbn[3][3]/tbd[3][3]==Number){
            jTextField14.setText(""); jTextField14.setVisible(false); jTextField14.setEnabled(false);
          }
          else{ Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField14.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField14.setForeground(Color.red);
        }
      }
      else{ Right=false; jTextField14.setForeground(Color.red);}
    }
    else if((jTextField14.isEnabled()==true) && (jTextField14.getText().equals("")==true)) RightPust=false;
    if((jTextField15.isEnabled()==true) && (jTextField15.getText().equals("")!=true)){
      txt=jTextField15.getText();
      if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
        index=txt.indexOf("/");
        try{
          if(index==-1) Number=Double.parseDouble(txt);
          else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
          if((((double)tbn[3][4]/tbd[3][4]==Number) && (c==3)) || (((double)tbn[4][5]/tbd[4][5]==Number) && (c==4))){
            jTextField15.setText(""); jTextField15.setVisible(false); jTextField15.setEnabled(false);
          }
          else{ Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField15.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField15.setForeground(Color.red);
        }
      }
      else{ Right=false; jTextField15.setForeground(Color.red);}
    }
    else if((jTextField15.isEnabled()==true) && (jTextField15.getText().equals("")==true)) RightPust=false;
    if((jTextField16.isEnabled()==true) && (jTextField16.getText().equals("")!=true)){
      txt=jTextField16.getText();
      if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
        index=txt.indexOf("/");
        try{
          if(index==-1) Number=Double.parseDouble(txt);
          else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
          if((double)tbn[3][5]/tbd[3][5]==Number){
            jTextField16.setText(""); jTextField16.setVisible(false); jTextField16.setEnabled(false);
          }
          else{ Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField16.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField16.setForeground(Color.red);
        }
      }
      else{ Right=false; jTextField16.setForeground(Color.red);}
    }
    else if((jTextField16.isEnabled()==true) && (jTextField16.getText().equals("")==true)) RightPust=false;
    if((jTextField17.isEnabled()==true) && (jTextField17.getText().equals("")!=true)){
      txt=jTextField17.getText();
      if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
        index=txt.indexOf("/");
        try{
          if(index==-1) Number=Double.parseDouble(txt);
          else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
          if((((double)tbn[3][6]/tbd[3][6]==Number) && (c==3)) || (((double)tbn[4][7]/tbd[4][7]==Number) && (c==4))){
            jTextField17.setText(""); jTextField17.setVisible(false); jTextField17.setEnabled(false);
          }
          else{ Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField17.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField17.setForeground(Color.red);
        }
      }
      else{ Right=false; jTextField17.setForeground(Color.red);}
    }
    else if((jTextField17.isEnabled()==true) && (jTextField17.getText().equals("")==true)) RightPust=false;
    if((jTextField18.isEnabled()==true) && (jTextField18.getText().equals("")!=true)){
      txt=jTextField18.getText();
      if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
        index=txt.indexOf("/");
        try{
          if(index==-1) Number=Double.parseDouble(txt);
          else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
          if((double)tbn[3][7]/tbd[3][7]==Number){
            jTextField18.setText(""); jTextField18.setVisible(false); jTextField18.setEnabled(false);
          }
          else{ Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField18.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField18.setForeground(Color.red);
        }
      }
      else{ Right=false; jTextField18.setForeground(Color.red);}
    }
    else if((jTextField18.isEnabled()==true) && (jTextField18.getText().equals("")==true)) RightPust=false;
    if((jTextField19.isEnabled()==true) && (jTextField19.getText().equals("")!=true)){
      txt=jTextField19.getText();
      if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
        index=txt.indexOf("/");
        try{
          if(index==-1) Number=Double.parseDouble(txt);
          else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
          if((double)tbn[4][0]/tbd[4][0]==Number){
            jTextField19.setText(""); jTextField19.setVisible(false); jTextField19.setEnabled(false);
          }
          else{ Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField19.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField19.setForeground(Color.red);
        }
      }
      else{ Right=false; jTextField19.setForeground(Color.red);}
    }
    else if((jTextField19.isEnabled()==true) && (jTextField19.getText().equals("")==true)) RightPust=false;
    if((jTextField20.isEnabled()==true) && (jTextField20.getText().equals("")!=true)){
      txt=jTextField20.getText();
      if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
        index=txt.indexOf("/");
        try{
          if(index==-1) Number=Double.parseDouble(txt);
          else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
          if((double)tbn[4][2]/tbd[4][2]==Number){
            jTextField20.setText(""); jTextField20.setVisible(false); jTextField20.setEnabled(false);
          }
          else{ Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField20.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField20.setForeground(Color.red);
        }
      }
      else{ Right=false; jTextField20.setForeground(Color.red);}
    }
    else if((jTextField20.isEnabled()==true) && (jTextField20.getText().equals("")==true)) RightPust=false;
    if((jTextField21.isEnabled()==true) && (jTextField21.getText().equals("")!=true)){
      txt=jTextField21.getText();
      if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
        index=txt.indexOf("/");
          try{
          if(index==-1) Number=Double.parseDouble(txt);
          else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
          if((double)tbn[4][4]/tbd[4][4]==Number){
            jTextField21.setText(""); jTextField21.setVisible(false); jTextField21.setEnabled(false);
          }
          else{ Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField21.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField21.setForeground(Color.red);
        }
      }
      else{ Right=false; jTextField21.setForeground(Color.red);}
    }
    else if((jTextField21.isEnabled()==true) && (jTextField21.getText().equals("")==true)) RightPust=false;
    if((jTextField22.isEnabled()==true) && (jTextField22.getText().equals("")!=true)){
      txt=jTextField22.getText();
      if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
        index=txt.indexOf("/");
        try{
          if(index==-1) Number=Double.parseDouble(txt);
          else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
          if((double)tbn[4][6]/tbd[4][6]==Number){
            jTextField22.setText(""); jTextField22.setVisible(false); jTextField22.setEnabled(false);
          }
          else{ Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField22.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==3) Mist_under[3]++; else if(sh==16) Mist_under[26]++; else Mist_calk[8]++; jTextField22.setForeground(Color.red);
        }
      }
      else{ Right=false; jTextField22.setForeground(Color.red);}
    }
    else if((jTextField22.isEnabled()==true) && (jTextField22.getText().equals("")==true)) RightPust=false;
    if((jTextField23.isEnabled()==true) && (jTextField23.getText().equals("")!=true)){
      if((((int)Math.round(tbn[5][1]/1000.0))>-1) && (((int)Math.round(tbn[5][1]/1000.0))<1)){
        txt=jTextField23.getText();
        if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
          index=txt.indexOf("/");
          try{
            if(index==-1) Number=Double.parseDouble(txt);
            else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
            if((double)tbn[5][1]/tbd[5][1]==Number){
              jTextField23.setText(""); jTextField23.setVisible(false); jTextField23.setEnabled(false);
            }
            else{ Right=false; ots=ots+" \u2206_{1}"; if(sh==4) Mist_calk[4]++; else Mist_calk[10]++; jTextField23.setForeground(Color.red);}
          }
          catch(Exception ee){
            Right=false; ots=ots+" \u2206_{1}"; if(sh==4) Mist_calk[4]++; else Mist_calk[10]++; jTextField23.setForeground(Color.red);
          }
        }
        else{ Right=false; ots=ots+" \u2206_{1}"; jTextField23.setForeground(Color.red);}
      }
      else if(jTextField23.getText().equals(Delta[1])==true || jTextField23.getText().equals(Delta1[1])==true){
             jTextField23.setText(""); jTextField23.setVisible(false); jTextField23.setEnabled(false);
           }
           else{ Right=false; ots=ots+" \u2206_{1}"; if(sh==4) Mist_calk[4]++; else Mist_calk[10]++; jTextField23.setForeground(Color.red);}
    }
    else if((jTextField23.isEnabled()==true) && (jTextField23.getText().equals("")==true)) RightPust=false;
    if((jTextField24.isEnabled()==true) && (jTextField24.getText().equals("")!=true)){
      if((((int)Math.round(tbn[5][2]/1000.0))>-1) && (((int)Math.round(tbn[5][2]/1000.0))<1)){
        txt=jTextField24.getText();
        if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
          index=txt.indexOf("/");
          try{
            if(index==-1) Number=Double.parseDouble(txt);
            else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
            if((double)tbn[5][2]/tbd[5][2]==Number){
              jTextField24.setText(""); jTextField24.setVisible(false); jTextField24.setEnabled(false);
            }
            else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{2}";
                  if(sh==4) Mist_calk[4]++; else Mist_calk[10]++; jTextField24.setForeground(Color.red);}
          }
          catch(Exception ee){
            Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{2}";
            if(sh==4) Mist_calk[4]++; else Mist_calk[10]++; jTextField24.setForeground(Color.red);
          }
        }
        else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{2}"; jTextField24.setForeground(Color.red);}
      }
      else if(jTextField24.getText().equals(Delta[2])==true || jTextField24.getText().equals(Delta1[2])==true){
             jTextField24.setText(""); jTextField24.setVisible(false); jTextField24.setEnabled(false);
           }
           else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{2}";
                  if(sh==4) Mist_calk[4]++; else Mist_calk[10]++; jTextField24.setForeground(Color.red);}
    }
    else if((jTextField24.isEnabled()==true) && (jTextField24.getText().equals("")==true)) RightPust=false;
    if((jTextField25.isEnabled()==true) && (jTextField25.getText().equals("")!=true)){
      if((((int)Math.round(tbn[5][3]/1000.0))>-1) && (((int)Math.round(tbn[5][3]/1000.0))<1)){
        txt=jTextField25.getText();
        if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
          index=txt.indexOf("/");
          try{
            if(index==-1) Number=Double.parseDouble(txt);
            else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
            if((double)tbn[5][3]/tbd[5][3]==Number){
              jTextField25.setText(""); jTextField25.setVisible(false); jTextField25.setEnabled(false);
            }
            else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{3}";
                   if(sh==4) Mist_calk[4]++; else Mist_calk[10]++;  jTextField25.setForeground(Color.red);}
          }
          catch(Exception ee){
            Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{3}";
            if(sh==4) Mist_calk[4]++; else Mist_calk[10]++; jTextField25.setForeground(Color.red);
          }
        }
        else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{3}"; jTextField25.setForeground(Color.red);}
      }
      else if(jTextField25.getText().equals(Delta[3])==true || jTextField25.getText().equals(Delta1[3])==true){
             jTextField25.setText(""); jTextField25.setVisible(false); jTextField25.setEnabled(false);
           }
           else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{3}";
                  if(sh==4) Mist_calk[4]++; else Mist_calk[10]++; jTextField25.setForeground(Color.red);}
    }
    else if((jTextField25.isEnabled()==true) && (jTextField25.getText().equals("")==true)) RightPust=false;
    if((jTextField26.isEnabled()==true) && (jTextField26.getText().equals("")!=true)){
      if((((int)Math.round(tbn[5][4]/1000.0))>-1) && (((int)Math.round(tbn[5][4]/1000.0))<1)){
        txt=jTextField26.getText();
        if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
          index=txt.indexOf("/");
          try{
            if(index==-1) Number=Double.parseDouble(txt);
            else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
            if((double)tbn[5][4]/tbd[5][4]==Number){
              jTextField26.setText(""); jTextField26.setVisible(false); jTextField26.setEnabled(false);
            }
            else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{4}";
                   if(sh==4) Mist_calk[4]++; else Mist_calk[10]++; jTextField26.setForeground(Color.red);}
          }
          catch(Exception ee){
            Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{4}";
            if(sh==4) Mist_calk[4]++; else Mist_calk[10]++; jTextField26.setForeground(Color.red);
          }
        }
        else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{4}"; jTextField26.setForeground(Color.red);}
      }
      else if(jTextField26.getText().equals(Delta[4])==true || jTextField26.getText().equals(Delta1[4])==true){
             jTextField26.setText(""); jTextField26.setVisible(false); jTextField26.setEnabled(false);
           }
           else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{4}";
                  if(sh==4) Mist_calk[4]++; else Mist_calk[10]++; jTextField26.setForeground(Color.red);}
    }
    else if((jTextField26.isEnabled()==true) && (jTextField26.getText().equals("")==true)) RightPust=false;
    if((jTextField27.isEnabled()==true) && (jTextField27.getText().equals("")!=true)){
      if((((int)Math.round(tbn[5][5]/1000.0))>-1) && (((int)Math.round(tbn[5][5]/1000.0))<1)){
        txt=jTextField27.getText();
        if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
          index=txt.indexOf("/");
          try{
            if(index==-1) Number=Double.parseDouble(txt);
            else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
            if((double)tbn[5][5]/tbd[5][5]==Number){
              jTextField27.setText(""); jTextField27.setVisible(false); jTextField27.setEnabled(false);
            }
            else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{5}";
                  if(sh==4) Mist_calk[4]++; else Mist_calk[10]++; jTextField27.setForeground(Color.red);}
          }
          catch(Exception ee){
            Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{5}";
            if(sh==4) Mist_calk[4]++; else Mist_calk[10]++; jTextField27.setForeground(Color.red);
          }
        }
        else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{5}"; jTextField27.setForeground(Color.red);}
      }
      else if(jTextField27.getText().equals(Delta[5])==true || jTextField27.getText().equals(Delta1[5])==true){
             jTextField27.setText(""); jTextField27.setVisible(false); jTextField27.setEnabled(false);
           }
           else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{5}";
                 if(sh==4) Mist_calk[4]++; else Mist_calk[10]++; jTextField27.setForeground(Color.red);}
    }
    else if((jTextField27.isEnabled()==true) && (jTextField27.getText().equals("")==true)) RightPust=false;
    if((jTextField28.isEnabled()==true) && (jTextField28.getText().equals("")!=true)){
      if((((int)Math.round(tbn[5][6]/1000.0))>-1) && (((int)Math.round(tbn[5][6]/1000.0))<1)){
        txt=jTextField28.getText();
        if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
          index=txt.indexOf("/");
          try{
            if(index==-1) Number=Double.parseDouble(txt);
            else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
            if((double)tbn[5][6]/tbd[5][6]==Number){
              jTextField28.setText(""); jTextField28.setVisible(false); jTextField28.setEnabled(false);
            }
            else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{6}";
                  if(sh==4) Mist_calk[4]++; else Mist_calk[10]++; jTextField28.setForeground(Color.red);}
          }
          catch(Exception ee){
            Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{6}";
            if(sh==4) Mist_calk[4]++; else Mist_calk[10]++; jTextField28.setForeground(Color.red);
          }
        }
        else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{6}"; jTextField28.setForeground(Color.red);}
      }
      else if(jTextField28.getText().equals(Delta[6])==true || jTextField28.getText().equals(Delta1[6])==true){
             jTextField28.setText(""); jTextField28.setVisible(false); jTextField28.setEnabled(false);
           }
           else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{6}";
                 if(sh==4) Mist_calk[4]++; else Mist_calk[10]++; jTextField28.setForeground(Color.red);}
    }
    else if((jTextField28.isEnabled()==true) && (jTextField28.getText().equals("")==true)) RightPust=false;
    if((jTextField29.isEnabled()==true) && (jTextField29.getText().equals("")!=true)){
      if((((int)Math.round(tbn[5][7]/1000.0))>-1) && (((int)Math.round(tbn[5][7]/1000.0))<1)){
        txt=jTextField29.getText();
        if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
          index=txt.indexOf("/");
          try{
            if(index==-1) Number=Double.parseDouble(txt);
            else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
            if((double)tbn[5][7]/tbd[5][7]==Number){
              jTextField29.setText(""); jTextField29.setVisible(false); jTextField29.setEnabled(false);
            }
            else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{7}";
                  if(sh==4) Mist_calk[4]++; else Mist_calk[10]++; jTextField29.setEnabled(false);}
          }
          catch(Exception ee){
            Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{7}";
            if(sh==4) Mist_calk[4]++; else Mist_calk[10]++; jTextField29.setForeground(Color.red);
          }
        }
        else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{7}"; jTextField29.setForeground(Color.red);}
      }
      else if(jTextField29.getText().equals(Delta[6])==true || jTextField29.getText().equals(Delta1[6])==true){
             jTextField29.setText(""); jTextField29.setVisible(false); jTextField29.setEnabled(false);
           }
           else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{7}";
                 if(sh==4) Mist_calk[4]++; else Mist_calk[10]++; jTextField29.setForeground(Color.red);}
    }
    else if((jTextField29.isEnabled()==true) && (jTextField29.getText().equals("")==true)) RightPust=false;
    if((jTextField30.isEnabled()==true) && (jTextField30.getText().equals("")!=true)){
      txt=jTextField30.getText();
      if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
        index=txt.indexOf("/");
        try{
          if(index==-1) Number=Double.parseDouble(txt);
          else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
          if( (( (double)(tbn[Numx+1][0])/tbd[Numx+1][0]==Number ) && (sh==11)) ||
              (( (double)Ogrn[0]/Ogrd[0]==Number ) && (sh==13 || sh==15))){
            jTextField30.setEnabled(false);
          }
          else{ Right=false; if(sh==11) Mist_under[21]++; else if(sh==15) Mist_use[25]++; else Mist_calk[23]++; jTextField30.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==11) Mist_under[21]++; else if(sh==15) Mist_use[25]++; else Mist_calk[23]++; jTextField30.setForeground(Color.red);
        }
      }
      else{ Right=false; jTextField30.setForeground(Color.red);}
    }
    else if((jTextField30.isEnabled()==true) && (jTextField30.getText().equals("")==true)) RightPust=false;
    if((jTextField31.isEnabled()==true) && (jTextField31.getText().equals("")!=true)){
      txt=jTextField31.getText();
      if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
        index=txt.indexOf("/");
        try{
          if(index==-1) Number=Double.parseDouble(txt);
          else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
          if( (( (double)(-tbn[Numx+1][Vr[0]])/tbd[Numx+1][Vr[0]]==Number ) && (sh==11)) ||
              (( (double)Ogrn[Vr[0]]/Ogrd[Vr[0]]==Number ) && (sh==13 || sh==15))){
            jTextField31.setEnabled(false);
          }
          else{ Right=false; if(sh==11) Mist_under[21]++; else if(sh==15) Mist_use[25]++; else Mist_calk[23]++; jTextField31.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==11) Mist_under[21]++; else if(sh==15) Mist_use[25]++; else Mist_calk[23]++; jTextField31.setForeground(Color.red);
        }
      }
      else{ Right=false; jTextField31.setForeground(Color.red);}
    }
    else if((jTextField31.isEnabled()==true) && (jTextField31.getText().equals("")==true)) RightPust=false;
    if((jTextField32.isEnabled()==true) && (jTextField32.getText().equals("")!=true)){
      txt=jTextField32.getText();
      if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
        index=txt.indexOf("/");
        try{
          if(index==-1) Number=Double.parseDouble(txt);
          else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
          if( (( (double)(-tbn[Numx+1][Vr[1]])/tbd[Numx+1][Vr[1]]==Number ) && (sh==11)) ||
              (( (double)Ogrn[Vr[1]]/Ogrd[Vr[1]]==Number ) && (sh==13 || sh==15))){
            jTextField32.setEnabled(false);
          }
          else{ Right=false; if(sh==11) Mist_under[21]++; else if(sh==15) Mist_use[25]++; else Mist_calk[23]++; jTextField32.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==11) Mist_under[21]++; else if(sh==15) Mist_use[25]++; else Mist_calk[23]++; jTextField32.setForeground(Color.red);
        }
      }
      else{ Right=false; jTextField32.setForeground(Color.red);}
    }
    else if((jTextField32.isEnabled()==true) && (jTextField32.getText().equals("")==true)) RightPust=false;
    if((jTextField33.isEnabled()==true) && (jTextField33.getText().equals("")!=true)){
      txt=jTextField33.getText();
      if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
        index=txt.indexOf("/");
        try{
          if(index==-1) Number=Double.parseDouble(txt);
          else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
          if( (( (double)(-tbn[Numx+1][Vr[2]])/tbd[Numx+1][Vr[2]]==Number ) && (sh==11)) ||
              (( (double)Ogrn[Vr[2]]/Ogrd[Vr[2]]==Number ) && (sh==13 || sh==15))){
            jTextField33.setEnabled(false);
          }
          else{ Right=false; if(sh==11) Mist_under[21]++; else if(sh==15) Mist_use[25]++; else Mist_calk[23]++; jTextField33.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==11) Mist_under[21]++; else if(sh==15) Mist_use[25]++; else Mist_calk[23]++; jTextField33.setForeground(Color.red);
        }
      }
      else{ Right=false; jTextField33.setForeground(Color.red);}
    }
    else if((jTextField33.isEnabled()==true) && (jTextField33.getText().equals("")==true)) RightPust=false;
    if((jTextField34.isEnabled()==true) && (jTextField34.getText().equals("")!=true)){
      txt=jTextField34.getText();
      if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
        index=txt.indexOf("/");
        try{
          if(index==-1) Number=Double.parseDouble(txt);
          else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
          if( (( (double)(-tbn[Numx+1][Vr[3]])/tbd[Numx+1][Vr[3]]==Number ) && (sh==11)) ||
              (( (double)Ogrn[Vr[3]]/Ogrd[Vr[3]]==Number ) && (sh==13 || sh==15))){
            jTextField34.setEnabled(false);
          }
          else{ Right=false; if(sh==11) Mist_under[21]++; else if(sh==15) Mist_use[25]++; else Mist_calk[23]++; jTextField34.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==11) Mist_under[21]++; else if(sh==15) Mist_use[25]++; else Mist_calk[23]++; jTextField34.setForeground(Color.red);
        }
      }
      else{ Right=false; jTextField34.setForeground(Color.red);}
    }
    else if((jTextField34.isEnabled()==true) && (jTextField34.getText().equals("")==true)) RightPust=false;
    if((Right==true) && (RightPust==true)){
      jButton3.setEnabled(false);
      jButton1.setEnabled(true);
    }
    jPanel1.repaint();
    jPanel2.repaint();
    jPanel3.repaint();
  }

 /* void jComboBox1_itemStateChanged(ItemEvent e) {
    vrt=jComboBox1.getSelectedIndex();
    sh=1; entry=false;
    jPanel1.repaint();
    jPanel2.repaint();
    jPanel3.repaint();
  }

  void jComboBox2_itemStateChanged(ItemEvent e) {
    slog=jComboBox2.getSelectedIndex();
    sh=1; entry=false;
    jPanel1.repaint();
    jPanel2.repaint();
    jPanel3.repaint();
  }*/

  void jRadioButton1_itemStateChanged(ItemEvent e) {
    if(sh==5)
      if(n==-1) Right=false;
    entry=false;
    otv=1;
    jPanel3.repaint();
  }

  void jRadioButton2_itemStateChanged(ItemEvent e) {
    if(sh==5)
      if(n>0) Right=false;
    otv=2; entry=false;
    jPanel3.repaint();
  }

  void jRadioButton3_itemStateChanged(ItemEvent e) {
    otv=3; entry=false;
    jPanel3.repaint();
  }

  void jCheckBox1_stateChanged(ChangeEvent e) {
    if(jCheckBox1.isSelected()==true) Ch=true;
    else Ch=false;
    jPanel1.repaint();
    jCheckBox1.setOpaque(true);
  }
  void jCheckBoxRezult_stateChanged(ChangeEvent e) {
    if(jCheckBoxRezult.isSelected()==true && sh==18) Ch=true;
    else Ch=false;
    jPanel1.repaint();
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
  void jTextField25_inputMethodTextChanged(InputMethodEvent e) {
    jTextField25.setForeground(new Color(0, 0, 120));
  }
  void jTextField26_inputMethodTextChanged(InputMethodEvent e) {
    jTextField26.setForeground(new Color(0, 0, 120));
  }
  void jTextField27_inputMethodTextChanged(InputMethodEvent e) {
    jTextField27.setForeground(new Color(0, 0, 120));
  }
  void jTextField28_inputMethodTextChanged(InputMethodEvent e) {
    jTextField28.setForeground(new Color(0, 0, 120));
  }
  void jTextField29_inputMethodTextChanged(InputMethodEvent e) {
    jTextField29.setForeground(new Color(0, 0, 120));
  }
  void jTextField30_inputMethodTextChanged(InputMethodEvent e) {
    jTextField30.setForeground(new Color(0, 0, 120));
  }
  void jTextField31_inputMethodTextChanged(InputMethodEvent e) {
    jTextField31.setForeground(new Color(0, 0, 120));
  }
  void jTextField32_inputMethodTextChanged(InputMethodEvent e) {
    jTextField32.setForeground(new Color(0, 0, 120));
  }
  void jTextField33_inputMethodTextChanged(InputMethodEvent e) {
    jTextField33.setForeground(new Color(0, 0, 120));
  }
  void jTextField34_inputMethodTextChanged(InputMethodEvent e) {
    jTextField34.setForeground(new Color(0, 0, 120));
  }
}
