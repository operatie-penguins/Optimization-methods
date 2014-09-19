package uprsimras;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.border.*;
import java.beans.*;
import javax.swing.event.*;

public class AppUprSimRas extends JApplet {
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
  JTextField jTextField23 = new JTextField(5);
  JTextField jTextField24 = new JTextField(5);
  JTextField jTextField25 = new JTextField(6);
  JTextField jTextField26 = new JTextField(6);
  JTextField jTextField27 = new JTextField(6);
  JRadioButton jRadioButton = new JRadioButton();
  JRadioButton jRadioButton1 = new JRadioButton();
  JRadioButton jRadioButton2 = new JRadioButton();
  ButtonGroup buttonGroup1 = new ButtonGroup();
  JCheckBox jCheckBox = new JCheckBox();
  JCheckBox jCheckBox1 = new JCheckBox();
  JCheckBox jCheckBox2 = new JCheckBox();
  JCheckBox jCheckBox3 = new JCheckBox();
  JCheckBox jCheckBox4 = new JCheckBox();
  JCheckBox jCheckBox5 = new JCheckBox();
  JCheckBox jCheckBoxRezult = new JCheckBox();
//  JLabel jLabel2 = new JLabel();
  static int xx,yy;
  public int[] Mist_knowledge=new int [10];
  public int[] Mist_calk=new int [10];
  public int[] Mist_under=new int [10];
  public int[] Mist_use=new int [10];
  public boolean Ch=false, entry=false, Right=true, RightPust=true, edt=false, bazis[]={false, false, false, false, false}, AddRAnswer=false;
  public int sh=0, zd1=0, zd2=0, r=0, tup=18, bpx=-1, slog=0,
             Kx=0, Ky=0, otv=-1, Numx=0, vrt = (int)(Math.random()*12), RightAnswer=0;
  public String sm[]={""}, jj="", ots="", s[]= {"","","","","","","","","","","",""}, Delta[]={"","","","","","","","","",""}, Delta1[]={"","","","","","","","","",""};;
  public int a=0, c=0, a0=0, c0=0, an=0, cn=0, b=(600-120-(a+1)*60)/2, d=(int)Math.round(17*(2-c)/2), n=0, p=0, k=0, nm[]={0},
             bp[]={0,0}, bp0[]={0,0},
             tbn[][]={ {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                       {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                       {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                       {20000,20000,20000,20000,20000,20000,20000,20000,20000} },
             tbd[][]={ {1,1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1,1} },
             tbn0[][]={ {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                        {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                        {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                       {20000,20000,20000,20000,20000,20000,20000,20000,20000} },
             tbd0[][]={ {1,1,1,1,1,1,1,1,1},
                        {1,1,1,1,1,1,1,1,1},
                        {1,1,1,1,1,1,1,1,1},
                        {1,1,1,1,1,1,1,1,1} },
             tn[][]={ {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                      {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                      {20000,20000,20000,20000,20000,20000,20000,20000,20000},
                      {20000,20000,20000,20000,20000,20000,20000,20000,20000} },
             td[][]={ {1,1,1,1,1,1,1,1,1},
                      {1,1,1,1,1,1,1,1,1},
                      {1,1,1,1,1,1,1,1,1},
                      {1,1,1,1,1,1,1,1,1} },
              Variant[]={0,1,2,3,4,5,6,7,8,9,10,11,1};

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
    jPanel3.setBounds(new Rectangle(5,322,621,128));
    jPanel3.setBackground(new Color(247, 247, 255));
    jButton1.setBackground(new Color(220, 230, 255));
    jButton1.setNextFocusableComponent(jButton2);
    jButton1.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton1.setForeground(new Color(0, 0, 60));
    jButton1.setText("==>");
    jButton1.setBounds(new Rectangle(383, 466, 100, 23));
    jButton1.setEnabled(true);
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
    jTextField1.setVisible(false); jTextField1.setEnabled(false);
    jTextField1.setNextFocusableComponent(jTextField2);
    jTextField1.setDisabledTextColor(Color.blue);
    jTextField1.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField2.setVisible(false); jTextField2.setEnabled(false);
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
    jTextField3.setVisible(false); jTextField3.setEnabled(false);
    jTextField3.setNextFocusableComponent(jTextField4);
    jTextField3.setDisabledTextColor(Color.blue);
    jTextField3.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField4.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField4.setForeground(new Color(0, 0, 120));
    jTextField4.setText("");
    jTextField4.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField4.setVisible(false); jTextField4.setEnabled(false);
    jTextField4.setNextFocusableComponent(jTextField5);
    jTextField4.setDisabledTextColor(Color.blue);
    jTextField4.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField5.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField5.setForeground(new Color(0, 0, 120));
    jTextField5.setText("");
    jTextField5.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField5.setVisible(false); jTextField5.setEnabled(false);
    jTextField5.setNextFocusableComponent(jTextField6);
    jTextField5.setDisabledTextColor(Color.blue);
    jTextField5.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField6.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField6.setForeground(new Color(0, 0, 120));
    jTextField6.setText("");
    jTextField6.setVisible(false); jTextField6.setEnabled(false);
    jTextField6.setNextFocusableComponent(jTextField7);
    jTextField6.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField6.setDisabledTextColor(Color.blue);
    jTextField6.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField7.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField7.setForeground(new Color(0, 0, 120));
    jTextField7.setText("");
    jTextField7.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField7.setVisible(false); jTextField7.setEnabled(false);
    jTextField7.setNextFocusableComponent(jTextField8);
    jTextField7.setDisabledTextColor(Color.blue);
    jTextField7.setBounds(new Rectangle(20, 528, 39, 17));
    jTextField8.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField8.setForeground(new Color(0, 0, 120));
    jTextField8.setText("");
    jTextField8.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField8.setVisible(false); jTextField8.setEnabled(false);
    jTextField8.setNextFocusableComponent(jTextField9);
    jTextField8.setDisabledTextColor(Color.blue);
    jTextField8.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField9.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField9.setForeground(new Color(0, 0, 120));
    jTextField9.setText("");
    jTextField9.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField9.setVisible(false); jTextField9.setEnabled(false);
    jTextField9.setNextFocusableComponent(jTextField23);
    jTextField9.setDisabledTextColor(Color.blue);
    jTextField9.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField23.setVisible(false); jTextField23.setEnabled(false);
    jTextField23.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField23.setNextFocusableComponent(jTextField24);
    jTextField23.setDisabledTextColor(Color.blue);
    jTextField23.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField23.setText("");
    jTextField23.setForeground(new Color(0, 0, 120));
    jTextField23.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField24.setVisible(false); jTextField24.setEnabled(false);
    jTextField24.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField24.setNextFocusableComponent(jTextField25);
    jTextField24.setDisabledTextColor(Color.blue);
    jTextField24.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField24.setText("");
    jTextField24.setForeground(new Color(0, 0, 120));
    jTextField24.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField25.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField25.setForeground(new Color(0, 0, 120));
    jTextField25.setNextFocusableComponent(jTextField26);
    jTextField25.setText("");
    jTextField25.setVisible(false); jTextField25.setEnabled(false);
    jTextField25.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField25.setDisabledTextColor(Color.blue);
    jTextField25.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField26.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField26.setForeground(new Color(0, 0, 120));
    jTextField26.setText("");
    jTextField26.setNextFocusableComponent(jTextField27);
    jTextField26.setVisible(false); jTextField26.setEnabled(false);
    jTextField26.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField26.setDisabledTextColor(Color.blue);
    jTextField26.setBounds(new Rectangle(20, 258, 39, 17));
    jTextField27.setFont(new java.awt.Font("SansSerif", 1, 14));
    jTextField27.setForeground(new Color(0, 0, 120));
    jTextField27.setText("");
    jTextField27.setVisible(false); jTextField27.setEnabled(false);
    jTextField27.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField27.setNextFocusableComponent(jTextField1);
    jTextField27.setDisabledTextColor(Color.blue);
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
    jTextField25.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField25_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField26.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField26_inputMethodTextChanged(e);
      }
      public void caretPositionChanged(InputMethodEvent e) {
      }
    });
    jTextField27.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void inputMethodTextChanged(InputMethodEvent e) {
        jTextField27_inputMethodTextChanged(e);
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
//    jLabel2.setText("Label");
//    jLabel2.setBounds(new Rectangle(20, 2, 189, 17));
    jCheckBox.setBackground(new Color(255, 255, 255));
    jCheckBox.setFont(new java.awt.Font("SansSerif", 3, 13));
    jCheckBox.setForeground(new Color(180, 0, 80));
    jCheckBox.setText("Таблица");
    jCheckBox.setSelected(false);
    jCheckBox.setVisible(false);
    jCheckBox.setEnabled(false);
    jCheckBox.setOpaque(false);
    jCheckBox.setBounds(new Rectangle(505, 67, 103, 23));
    jCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(ChangeEvent e) {
        jCheckBox_stateChanged(e);
      }
    });
    jCheckBox1.setBackground(new Color(255, 255, 255));
    jCheckBox1.setFont(new java.awt.Font("SansSerif", 3, 14));
    jCheckBox1.setForeground(new Color(0, 0, 40));
    jCheckBox1.setText("x1");
    jCheckBox1.setSelected(false);
    jCheckBox1.setVisible(false);
    jCheckBox1.setEnabled(false);
    jCheckBox1.setOpaque(false);
    jCheckBox1.setBounds(new Rectangle(100, 47, 45, 23));
    jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(ChangeEvent e) {
        jCheckBox1_stateChanged(e);
      }
    });
    jCheckBox2.setBackground(new Color(255, 255, 255));
    jCheckBox2.setFont(new java.awt.Font("SansSerif", 3, 14));
    jCheckBox2.setForeground(new Color(0, 0, 40));
    jCheckBox2.setText("x2");
    jCheckBox2.setSelected(false);
    jCheckBox2.setVisible(false);
    jCheckBox2.setEnabled(false);
    jCheckBox2.setOpaque(false);
    jCheckBox2.setBounds(new Rectangle(200, 47, 45, 23));
    jCheckBox2.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(ChangeEvent e) {
        jCheckBox2_stateChanged(e);
      }
    });
    jCheckBox3.setBackground(new Color(255, 255, 255));
    jCheckBox3.setFont(new java.awt.Font("SansSerif", 3, 14));
    jCheckBox3.setForeground(new Color(0, 0, 40));
    jCheckBox3.setText("x3");
    jCheckBox3.setSelected(false);
    jCheckBox3.setVisible(false);
    jCheckBox3.setEnabled(false);
    jCheckBox3.setOpaque(false);
    jCheckBox3.setBounds(new Rectangle(300, 47, 45, 23));
    jCheckBox3.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(ChangeEvent e) {
        jCheckBox3_stateChanged(e);
      }
    });
    jCheckBox4.setBackground(new Color(255, 255, 255));
    jCheckBox4.setFont(new java.awt.Font("SansSerif", 3, 14));
    jCheckBox4.setForeground(new Color(0, 0, 40));
    jCheckBox4.setText("x4");
    jCheckBox4.setSelected(false);
    jCheckBox4.setVisible(false);
    jCheckBox4.setEnabled(false);
    jCheckBox4.setOpaque(false);
    jCheckBox4.setBounds(new Rectangle(400, 47, 45, 23));
    jCheckBox4.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(ChangeEvent e) {
        jCheckBox4_stateChanged(e);
      }
    });
    jCheckBox5.setBackground(new Color(255, 255, 255));
    jCheckBox5.setFont(new java.awt.Font("SansSerif", 3, 14));
    jCheckBox5.setForeground(new Color(0, 0, 40));
    jCheckBox5.setText("x5");
    jCheckBox5.setSelected(false);
    jCheckBox5.setVisible(false);
    jCheckBox5.setEnabled(false);
    jCheckBox5.setOpaque(false);
    jCheckBox5.setBounds(new Rectangle(500, 47, 45, 23));
    jCheckBox5.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(ChangeEvent e) {
        jCheckBox5_stateChanged(e);
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
    this.jPanel2.add(jTextField23, null);
    this.jPanel2.add(jTextField24, null);
    this.jPanel2.add(jTextField25, null);
    this.jPanel2.add(jTextField26, null);
    this.jPanel2.add(jTextField27, null);
    this.jPanel3.add(jRadioButton, null);
    this.jPanel3.add(jRadioButton1, null);
    this.jPanel3.add(jRadioButton2, null);
    this.jPanel3.add(jCheckBox, null);
    this.jPanel3.add(jCheckBox1, null);
    this.jPanel3.add(jCheckBox2, null);
    this.jPanel3.add(jCheckBox3, null);
    this.jPanel3.add(jCheckBox4, null);
    this.jPanel3.add(jCheckBox5, null);
    this.jPanel3.add(jCheckBoxRezult, null);
    SetStartParam();
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

  public void Tabl1(Graphics g, int a, int c, int t, int h, boolean f, int bp[]){ //Рисует таблицу
    int b=(600-120-(a+1)*60)/2, d=(int)Math.round(17*(2-c)/2);
    if(h==0) g.setColor(Color.red); else g.setColor(new Color(180, 0, 80));
    g.setFont(new java.awt.Font("SansSerif", 3, 13));
    g.drawString("Таблица "+t+":",15+b,tup-5+d);
    g.setColor(new Color(255, 255, 255)); g.fillRect(b+7,tup+d,602-2*b,2+17*(3+c));
    g.setColor(Color.black);
    for(int i=0; i<=a+1; i++)
      g.drawLine(b+128+i*60,tup+1+d,b+128+i*60,tup+86-d);
    for(int i=0; i<=3; i++)
      if(i==0) g.drawLine(b+8+i*40,tup+1+d,b+8+i*40,tup+86-d);
      else g.drawLine(b+8+i*40,tup+1+d,b+8+i*40,tup+68-d);
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
    int b=(600-120-(a+1)*60)/2, d=(int)Math.round(17*(2-c)/2), l=0;
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
      if(tbn[3][j]<20000){
        kf=(int)Math.round(tbn[3][j]/1000.0);
        if((tbd[3][j]==1) || (tbn[3][j]==0)){
          if((kf>=1)||(kf<=-1)){
            if (tbn[3][j]-kf*1000>0){
              if(kf==1){ jj="M+"+(tbn[3][j]-kf*1000); jj1=(tbn[3][j]-kf*1000)+"+M";}
              else if(kf==-1){ jj="-M+"+(tbn[3][j]-kf*1000); jj1=(tbn[3][j]-kf*1000)+"-M";}
                   else if(kf>0) {jj=kf+"M+"+(tbn[3][j]-kf*1000); jj1=(tbn[3][j]-kf*1000)+"+"+kf+"M";}
                        else  {jj=kf+"M+"+(tbn[3][j]-kf*1000); jj1=(tbn[3][j]-kf*1000)+kf+"M";}
            }
            else if (tbn[3][j]-kf*1000<0){
                   if(kf==1){ jj="M-"+(kf*1000-tbn[3][j]); jj1="-"+(kf*1000-tbn[3][j])+"+M";}
                   else if(kf==-1){ jj="-M-"+(kf*1000-tbn[3][j]); jj1="-"+(kf*1000-tbn[3][j])+"-M";}
                        else if(kf>0) { jj=kf+"M-"+(kf*1000-tbn[3][j]); jj1="-"+(kf*1000-tbn[3][j])+"+"+kf+"M"; }
                             else { jj=kf+"M-"+(kf*1000-tbn[3][j]); jj1="-"+(kf*1000-tbn[3][j])+kf+"M"; }
                 }
                 else{
                   if(kf==1){ jj="M"; jj1="M";}
                   else if(kf==-1){ jj="-M"; jj1="-M";}
                        else {jj=kf+"M"; jj1=kf+"M";}
                 }
          }
          else{ jj=""+tbn[3][j]; jj1=""+tbn[3][j];}
        }
        else{
          if((kf>=1)||(kf<=-1)){
            if (tbn[3][j]-kf*1000>0){
              if(kf==1) jj="("+"M+"+(tbn[3][j]-kf*1000)+")/"+tbd[3][j];
              else if(kf==-1) jj="("+"-M+"+(tbn[3][j]-kf*1000)+")/"+tbd[3][j];
                   else jj="("+kf+"M+"+(tbn[3][j]-kf*1000)+")/"+tbd[3][j];
              }
            else if (tbn[3][j]-kf*1000<0){
                   if(kf==1) jj="("+"M-"+(kf*1000-tbn[3][j])+")/"+tbd[3][j];
                   else if(kf==-1) jj="("+"-M-"+(kf*1000-tbn[3][j])+")/"+tbd[3][j];
                        else jj="("+kf+"M-"+(kf*1000-tbn[3][j])+")/"+tbd[3][j];
                 }
                 else{
                   if(kf==1) jj="M/"+tbd[3][j];
                   else if(kf==-1) jj="-M/"+tbd[3][j];
                        else jj=kf+"M/"+tbd[3][j];
                 }
          }
          else jj=tbn[3][j]+"/"+tbd[3][j];
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
      if(tbn0[3][j]<20000){
        kf=(int)Math.round(tbn0[3][j]/1000.0);
        if((tbd0[3][j]==1) || (tbn0[3][j]==0)){
          if((kf>=1)||(kf<=-1)){
            if (tbn0[3][j]-kf*1000>0){
              if(kf==1) jj="M+"+(tbn0[3][j]-kf*1000);
              else if(kf==-1) jj="-M+"+(tbn0[3][j]-kf*1000);
                   else jj=kf+"M+"+(tbn0[3][j]-kf*1000);
            }
            else if (tbn0[3][j]-kf*1000<0){
                   if(kf==1) jj="M-"+(kf*1000-tbn0[3][j]);
                   else if(kf==-1) jj="-M-"+(kf*1000-tbn0[3][j]);
                        else jj=kf+"M-"+(kf*1000-tbn0[3][j]);
                 }
                 else{
                   if(kf==1) jj="M";
                   else if(kf==-1) jj="-M";
                        else jj=kf+"M";
                 }
          }
          else jj=""+tbn0[3][j];
        }
        else{
          if((kf>=1)||(kf<=-1)){
            if (tbn0[3][j]-kf*1000>0){
              if(kf==1) jj="("+"M+"+(tbn0[3][j]-kf*1000)+")/"+tbd0[3][j];
              else if(kf==-1) jj="("+"-M+"+(tbn0[3][j]-kf*1000)+")/"+tbd0[3][j];
                   else jj="("+kf+"M+"+(tbn0[3][j]-kf*1000)+")/"+tbd0[3][j];
              }
            else if (tbn0[3][j]-kf*1000<0){
                   if(kf==1) jj="("+"M-"+(kf*1000-tbn0[3][j])+")/"+tbd0[3][j];
                   else if(kf==-1) jj="("+"-M-"+(kf*1000-tbn0[3][j])+")/"+tbd0[3][j];
                        else jj="("+kf+"M-"+(kf*1000-tbn0[3][j])+")/"+tbd0[3][j];
                 }
                 else{
                   if(kf==1) jj="M/"+tbd0[3][j];
                   else if(kf==-1) jj="-M/"+tbd0[3][j];
                        else jj=kf+"M/"+tbd0[3][j];
                 }
          }
          else jj=tbn0[3][j]+"/"+tbd0[3][j];
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
      tbn[3][i]=tbn[0][i]; tbd[3][i]=tbd[0][i];
      for(int j=0; j<c; j++)
        if(mn[j]<20000){
          kf=MaxDel(tbd[3][i],md[j]);
          tbn[3][i]=tbn[3][i]*md[j]/kf; mn[j]=mn[j]*tbd[3][i]/kf;
          tbd[3][i]=tbd[3][i]*md[j]/kf; md[j]=tbd[3][i]; // общий знаменатель
          tbn[3][i]=tbn[3][i]-mn[j];
      }
      if((Math.round(tbn[3][i]/1000.0)<1) && (Math.round(tbn[3][i]/1000.0)>-1)){
        kf=MaxDel(tbn[3][i],tbd[3][i]);
        tbn[3][i]=tbn[3][i]/kf; tbd[3][i]=tbd[3][i]/kf;
      }
       else{
        int j=1;
        kf=(int)Math.round(tbn[3][i]/1000.0);
        j=MaxDel3(tbn[3][i]-kf*1000,tbd[3][i],kf);
        tbd[3][i]=tbd[3][i]/j;
        tbn[3][i]=tbn[3][i]/j;
      }
    }
  }

   public void ModifyArray1(int a, int c, int tbn[][], int tbd[][], int p, int n){  //Пересчет таблицы
    int tbn1=0, tbd1=0, kf=0, t=1;
    for(int i=1; i<=3 ; i++){
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
    for(int i=2; i<=4; i++)
    {
      if((tn[0][i]>0) && (tn[0][i]!=20000)){
        if(tn[0][i]!=1) s[2]=s[2]+"+ "+tn[0][i]+" x_{"+i+"} ";
        else s[2]=s[2]+"+ x_{"+i+"} ";
      }
      if(tn[0][i]<0){
        if(Math.abs(tn[0][i])!=1) s[2]=s[2]+"- "+Math.abs(tn[0][i])+" x_{"+i+"} ";
        else s[2]=s[2]+"- x_{"+i+"} ";
      }
    }
    s[2]=s[2]+"\u2192 max";
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
        if(tn[i][8]==0)  s[i+2]=s[i+2]+" = ";
        if(tn[i][0]>=0) s[i+2]=s[i+2]+tn[i][0];
        else s[i+2]=s[i+2]+"- "+Math.abs(tn[i][0]);
        if(td[i][0]!=1) s[i+2]=s[i+2]+"/"+td[i][0]+",";
        else s[i+2]=s[i+2]+",";
      }
    if(vrt!=1 && vrt!=2)
      s[10]="x_{1}, x_{2} \u2265 0.";
    else s[10]="x_{1},...,x_{4} \u2265 0.";
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

  public void ModifyKanForma(int at[], int ct[], int tn[][], int td[][], int tbn[][], int tbd[][], String s[]){ //расширенная форма
    int a=at[0], c=ct[0];
    for(int i=0; i<c; i++)
      bp[i]=0;
    for(int i=0; i<=3; i++)
      for(int j=0; j<9; j++){
        tbn[i][j]=20000; tbd[i][j]=1;
      }
    for(int i=0; i<=3; i++)
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
    at[0]=a;
    ModifyProblem(a,c,tn,td,tbn,tbd,s);
  }

  public void ModifyRasForma(int at[], int ct[], int tn[][], int td[][], int tbn[][], int tbd[][], String s[]){ //расширенная форма
    int a=at[0], c=ct[0];
    for(int i=0; i<c; i++)
      bp[i]=0;
    for(int i=0; i<=3; i++)
      for(int j=0; j<9; j++){
        tbn[i][j]=20000; tbd[i][j]=1;
      }
    for(int i=0; i<=3; i++)
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
         if((tbn[3][i]>0) && (max<(double)tbn[3][i]*1.0/tbd[3][i])){
           max=(double)tbn[3][i]*1.0/tbd[3][i];
           nm[0]=i; maxn=tbn[3][i]; maxd=tbd[3][i];
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

  public void SetParam()
  {
    edt=false; Right=true; RightPust=true; Ch=false; entry=false;
    otv=-1; bpx=-1; Kx=0; Ky=0;
    if(sh==3) SetVariant();
    jPanel1.repaint();
    jPanel2.repaint();
    jPanel3.repaint();
  }

   public void SetStartParam()
  {
        a=0; c=0; r=0; Numx=0;
        Ch=false; Right=true; RightPust=true; edt=false; entry=false; AddRAnswer=false;
        n=0; p=0; k=0; otv=-1; Kx=0; Ky=0; bpx=-1; nm[0]=0;
        sm[0]=""; jj=""; ots="";
        for(int i=0; i<12; i++)
          s[i]="";
        for(int i=0; i<=9; i++){
          Delta[i] = ""; Delta1[i] = "";
        }
        for(int i=0; i<10; i++){
          Mist_calk[i]=0;
          Mist_under[i]=0;
          Mist_knowledge[i]=0;
          Mist_use[i]=0;
        }
        SetVariant();
  }

  public void SetVariant()
  {
        for(int i=0; i<2; i++){
          bp[i]=0; bp0[i]=0;
        }
        for(int i=0; i<=3; i++)
          for(int j=0; j<9; j++){
            tbn[i][j]=20000; tn[i][j]=20000;
            tbd[i][j]=1; td[i][j]=1;
          }
        if(vrt==0){
          int at[]={2}, ct[]={2}; an=at[0]; cn=ct[0];
          tn[0][1]=1; tn[0][2]=-1;
          tn[1][0]=4; tn[1][1]=-1; tn[1][2]=2; tn[1][8]=-1;
          tn[2][0]=14; tn[2][1]=3; tn[2][2]=2; tn[2][8]=1;
          if(sh==1) ModifyKanForma(at,ct,tn,td,tbn,tbd,s);
          else ModifyRasForma(at,ct,tn,td,tbn,tbd,s); a=at[0]; c=ct[0];
        }
        if(vrt==1){
          int at[]={4}, ct[]={2}; an=at[0]; cn=ct[0];
          tn[0][1]=-1; tn[0][2]=2; tn[0][3]=-1; tn[0][4]=-1;
          tn[1][0]=2; tn[1][1]=-1; tn[1][2]=1; tn[1][3]=1; tn[1][4]=0; tn[1][8]=0;
          tn[2][0]=4; tn[2][1]=1; tn[2][2]=1; tn[2][3]=0; tn[2][4]=1; tn[2][8]=0;
          if(sh==1) ModifyKanForma(at,ct,tn,td,tbn,tbd,s);
          else ModifyRasForma(at,ct,tn,td,tbn,tbd,s); a=at[0]; c=ct[0];
        }
        if(vrt==2){
          int at[]={4}, ct[]={2}; an=at[0]; cn=ct[0];
          tn[0][1]=1; tn[0][2]=4; tn[0][3]=-10; tn[0][4]=0;
          tn[1][0]=18; tn[1][1]=2; tn[1][2]=3; tn[1][3]=4; tn[1][4]=0; tn[1][8]=0;
          tn[2][0]=54; tn[2][1]=3; tn[2][2]=9; tn[2][3]=0; tn[2][4]=1; tn[2][8]=0;
          if(sh==1) ModifyKanForma(at,ct,tn,td,tbn,tbd,s);
          else ModifyRasForma(at,ct,tn,td,tbn,tbd,s); a=at[0]; c=ct[0];
        }
        if(vrt==3){
          int at[]={2}, ct[]={2}; an=at[0]; cn=ct[0];
          tn[0][1]=1; tn[0][2]=-1;
          tn[1][0]=4; tn[1][1]=-1; tn[1][2]=2; tn[1][8]=1;
          tn[2][0]=14; tn[2][1]=3; tn[2][2]=2; tn[2][8]=1;
          if(sh==1) ModifyKanForma(at,ct,tn,td,tbn,tbd,s);
          else ModifyRasForma(at,ct,tn,td,tbn,tbd,s); a=at[0]; c=ct[0];
        }
        if(vrt==4){
          int at[]={2}, ct[]={2}; an=at[0]; cn=ct[0];
          tn[0][1]=1; tn[0][2]=-1;
          tn[1][0]=16; tn[1][1]=-4; tn[1][2]=2; tn[1][8]=-1;
          tn[2][0]=14; tn[2][1]=3; tn[2][2]=2; tn[2][8]=1;
          if(sh==1) ModifyKanForma(at,ct,tn,td,tbn,tbd,s);
          else ModifyRasForma(at,ct,tn,td,tbn,tbd,s); a=at[0]; c=ct[0];
        }
        if(vrt==5){
          int at[]={2}, ct[]={2}; an=at[0]; cn=ct[0];
          tn[0][1]=-2; tn[0][2]=4;
          tn[1][0]=4; tn[1][1]=-1; tn[1][2]=2; tn[1][8]=1;
          tn[2][0]=14; tn[2][1]=3; tn[2][2]=2; tn[2][8]=1;
          if(sh==1) ModifyKanForma(at,ct,tn,td,tbn,tbd,s);
          else ModifyRasForma(at,ct,tn,td,tbn,tbd,s); a=at[0]; c=ct[0];
        }
        if(vrt==6){
          int at[]={2}, ct[]={2}; an=at[0]; cn=ct[0];
          tn[0][1]=3; tn[0][2]=-4;
          tn[1][0]=36; tn[1][1]=6; tn[1][2]=6; tn[1][8]=1;
          tn[2][0]=32; tn[2][1]=4; tn[2][2]=8; tn[2][8]=1;
          if(sh==1) ModifyKanForma(at,ct,tn,td,tbn,tbd,s);
          else ModifyRasForma(at,ct,tn,td,tbn,tbd,s); a=at[0]; c=ct[0];
        }
        if(vrt==7){
          int at[]={2}, ct[]={2}; an=at[0]; cn=ct[0];
          tn[0][1]=2; tn[0][2]=-14;
          tn[1][0]=16; tn[1][1]=1; tn[1][2]=2; tn[1][8]=1;
          tn[2][0]=20; tn[2][1]=5; tn[2][2]=2; tn[2][8]=1;
          if(sh==1) ModifyKanForma(at,ct,tn,td,tbn,tbd,s);
          else ModifyRasForma(at,ct,tn,td,tbn,tbd,s); a=at[0]; c=ct[0];
        }
        if(vrt==8){
          int at[]={2}, ct[]={2}; an=at[0]; cn=ct[0];
          tn[0][1]=1; tn[0][2]=3;
          tn[1][0]=1; tn[1][1]=1; tn[1][2]=-1; tn[1][8]=-1;
          tn[2][0]=12; tn[2][1]=1; tn[2][2]=2; tn[2][8]=1;
          if(sh==1) ModifyKanForma(at,ct,tn,td,tbn,tbd,s);
          else ModifyRasForma(at,ct,tn,td,tbn,tbd,s); a=at[0]; c=ct[0];
        }
        if(vrt==9){
          int at[]={2}, ct[]={2}; an=at[0]; cn=ct[0];
          tn[0][1]=2; tn[0][2]=-3;
          tn[1][0]=4; tn[1][1]=1; tn[1][2]=1; tn[1][8]=1;
          tn[2][0]=2; tn[2][1]=-1; tn[2][2]=2; tn[2][8]=-1;
          if(sh==1) ModifyKanForma(at,ct,tn,td,tbn,tbd,s);
          else ModifyRasForma(at,ct,tn,td,tbn,tbd,s); a=at[0]; c=ct[0];
        }
        if(vrt==10){
          int at[]={2}, ct[]={2};
          tn[0][1]=-1; tn[0][2]=-1; an=at[0]; cn=ct[0];
          tn[1][0]=4; tn[1][1]=-1; tn[1][2]=2; tn[1][8]=-1;
          tn[2][0]=14; tn[2][1]=3; tn[2][2]=2; tn[2][8]=1;
          if(sh==1) ModifyKanForma(at,ct,tn,td,tbn,tbd,s);
          else ModifyRasForma(at,ct,tn,td,tbn,tbd,s); a=at[0]; c=ct[0];
        }
        if(vrt==11){
          int at[]={2}, ct[]={2}; an=at[0]; cn=ct[0];
          tn[0][1]=1; tn[0][2]=-1;
          tn[1][0]=4; tn[1][1]=-4; tn[1][2]=1; tn[1][8]=-1;
          tn[2][0]=4; tn[2][1]=1; tn[2][2]=2; tn[2][8]=1;
          if(sh==1) ModifyKanForma(at,ct,tn,td,tbn,tbd,s);
          else ModifyRasForma(at,ct,tn,td,tbn,tbd,s); a=at[0]; c=ct[0];
        }
  }

  class MyPaint1 extends JPanel {
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Stringer.setGraphics(g);
      Stringer1.setGraphics(g);
      zd1=0; zd2=0;
      for(int i=0; i<=1; i++)
        s[i]="";
      s[0]="Найти решение задачи f(x) = ";
      if(tn[0][1]>1) s[0]=s[0]+tn[0][1]+"x_{1}";
      if(tn[0][1]<-1) s[0]=s[0]+"- "+Math.abs(tn[0][1])+"x_{1}";
      if(tn[0][1]==1) s[0]=s[0]+"x_{1}"; if(tn[0][1]==-1) s[0]=s[0]+"- x_{1}";
     for(int i=2; i<=4; i++)
      {
        if((tn[0][i]>0) && (tn[0][i]!=20000)){
          if(tn[0][i]!=1) s[0]=s[0]+"+ "+tn[0][i]+" x_{"+i+"} ";
          else s[0]=s[0]+"+ x_{"+i+"} ";
        }
        if(tn[0][i]<0){
          if(Math.abs(tn[0][i])!=1) s[0]=s[0]+"- "+Math.abs(tn[0][i])+" x_{"+i+"} ";
          else s[0]=s[0]+"- x_{"+i+"} ";
        }
      }
      s[0]=s[0]+"\u2192 max при ограничениях";
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
        if(tn[i][8]==0) s[1]=s[1]+" = ";
        if(tn[i][0]>=0) s[1]=s[1]+tn[i][0];
        else s[1]=s[1]+"- "+Math.abs(tn[i][0]);
        if(td[i][0]!=1) s[1]=s[1]+"/"+td[i][0]+",  ";
        else s[1]=s[1]+",  ";
      }
      s[1]=s[1]+" x_{1}, x_{2}";
      for (int i=3; i<=4; i++)
        if(tn[0][i]<20000) s[1]=s[1]+", x_{"+i+"}";
      s[1]=s[1]+" \u2265 0, симплекс-методом";
      int qq=0, q=0;
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
      if(vrt==0){ zd1=66; zd2=92; q=32; }
      if(vrt==1){ zd1=40; zd2=70; q=64; qq=-1; }
      if(vrt==2){ zd1=38; zd2=40; q=40; qq=3; }
      if(vrt==3){ zd1=65; zd2=95; q=31; }
      if(vrt==4){ zd1=65; zd2=85; q=33; }
      if(vrt==5){ zd1=51; zd2=92; q=30; qq=-1; }
      if(vrt==6){ zd1=57; zd2=91; q=30; }
      if(vrt==7){ zd1=55; zd2=99; q=30; }
      if(vrt==8){ zd1=61; zd2=111; q=31; qq=4;}
      if(vrt==9){ zd1=55; zd2=110; q=34; qq=2; }
      if(vrt==10){ zd1=61; zd2=99; q=32; qq=1; }
      if(vrt==11){ zd1=63; zd2=105; q=32; qq=-1; }
      Stringer.drawString(s[0],zd1+51,38);
      Stringer.drawString(s[1],zd2,58);
      int at[]={an}, ct[]={cn};
      Stringer.drawString(s[2],(210-s[2].length()*6+q)/2+7,102);
      Stringer.drawString(s[3],(210-s[3].length()*4)/2+7,124);
      Stringer.drawString(s[4],(210-s[4].length()*4)/2+7,144);
      Stringer.drawString(s[5]+"   "+s[10],(218-s[5].length()*3-s[10].length()*6+20)/2,164);
      if(sh>=2){
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
      if(sh==2 || (sh==3 && vrt!=1 && vrt!=3 && vrt!=5 && vrt!=6 && vrt!=7)) g.setColor(Color.red);
      else g.setColor(new Color(180, 0, 80));
      if((sh<=2) || (vrt==1 || vrt==3 || vrt==5 || vrt==6 || vrt==7)) g.drawString("Каноническая форма:",245,82);
      else g.drawString("Расширенная форма:",245,82);
      g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 1, 14));
      if(sh==9)
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
      if(sh==10){
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
          for(int i=0; i<10; i++){
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
      b=(600-120-(a+1)*60)/2; d=(int)Math.round(17*(2-c)/2);
      if(sh==3){
        Tabl1(g,a,c,1,0,true,bp);
        if((edt!=true || Right!=true) && slog>=1)
        {
          g.setColor(new Color(255, 255, 255));
          g.fillRect(49+b,tup+d+36,39,17*c-1);
          g.setColor(Color.black);
          for(int i=2; i<=c; i++)
            g.drawLine(b+48,tup+18+d+17*i,b+48+40,tup+18+d+17*i);
        }
      }
      if(sh==4){
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
            if(a==5){
              jTextField5.setBounds(new Rectangle(129+b+240,tup+d+36,60,17));
              jTextField5.setVisible(true); jTextField5.setEnabled(true);
              if(AddRAnswer==false){RightAnswer=RightAnswer+8; AddRAnswer=true;}
            }
            else if(AddRAnswer==false){RightAnswer=RightAnswer+7; AddRAnswer=true;}
            jButton1.setEnabled(false);
            jButton3.setEnabled(true);
          }
        }
      }
      if(sh==5){
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
            kf=(int)Math.round(tbn[3][1]/1000.0);
            if((tbd[3][1]==1) || (kf==0) || (tbn[3][1]-kf*1000==0)){
              jTextField23.setBounds(new Rectangle(129+b,tup+d+(c+2)*17+2,60,16));
              jTextField23.setVisible(true); jTextField23.setEnabled(true);
            }
            kf=(int)Math.round(tbn[3][2]/1000.0);
            if((tbd[3][2]==1) || (kf==0) || (tbn[3][2]-kf*1000==0)){
              jTextField24.setBounds(new Rectangle(129+b+60,tup+d+(c+2)*17+2,60,16));
              jTextField24.setVisible(true); jTextField24.setEnabled(true);
            }
            kf=(int)Math.round(tbn[3][3]/1000.0);
            if((tbd[3][3]==1) || (kf==0) || (tbn[3][3]-kf*1000==0)){
              jTextField25.setBounds(new Rectangle(129+b+120,tup+d+(c+2)*17+2,60,16));
              jTextField25.setVisible(true); jTextField25.setEnabled(true);
            }
            kf=(int)Math.round(tbn[3][4]/1000.0);
            if((tbd[3][4]==1) || (kf==0) || (tbn[3][4]-kf*1000==0)){
              jTextField26.setBounds(new Rectangle(129+b+180,tup+d+(c+2)*17+2,60,16));
              jTextField26.setVisible(true); jTextField26.setEnabled(true);
            }
            if(a==5){
              kf=(int)Math.round(tbn[3][5]/1000.0);
              if((tbd[3][5]==1) || (kf==0) || (tbn[3][5]-kf*1000==0)){
                jTextField27.setBounds(new Rectangle(129+b+240,tup+d+(c+2)*17+2,60,16));
                jTextField27.setVisible(true); jTextField27.setEnabled(true);
              }
            }
            if(AddRAnswer==false){
                for(int i=1; i<=a; i++)
                {
                  kf=(int)Math.round(tbn[3][i]/1000.0);
                  if((tbd[3][i]==1) || (kf==0) || (tbn[3][i]-kf*1000==0))
                    RightAnswer++;
                }
                AddRAnswer=true;
              }
            jButton1.setEnabled(false);
            jButton3.setEnabled(true);
          }
        }
      }
      if(sh==6){
        n=0; Valuation(a,c,tbn,tbd,nm,sm); n=nm[0];
        Tabl1(g,a,c,1+r,1,true,bp);
        Tb1(g,a,c,tbn,tbd,bp);
        g.setColor(Color.red);
        Ind_nk(g,"\u2206","  j",b+153+a*60,tup+48+c*17+d);
        g.setColor(new Color(0, 0, 80));
      }
      if(sh==7){
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
      if(sh==8){
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
      if(sh==9){
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
            if(a==5){
              jTextField5.setBounds(new Rectangle(129+b+240,tup+d+36,60,17));
              jTextField5.setVisible(true); jTextField5.setEnabled(true);
            }
            int kf=0;
            kf=(int)Math.round(tbn[3][1]/1000.0);
            if((tbd[3][1]==1) || (kf==0) || (tbn[3][1]-kf*1000==0)){
              jTextField23.setBounds(new Rectangle(129+b,tup+d+(c+2)*17+2,60,16));
              jTextField23.setVisible(true); jTextField23.setEnabled(true);
            }
            kf=(int)Math.round(tbn[3][2]/1000.0);
            if((tbd[3][2]==1) || (kf==0) || (tbn[3][2]-kf*1000==0)){
              jTextField24.setBounds(new Rectangle(129+b+60,tup+d+(c+2)*17+2,60,16));
              jTextField24.setVisible(true); jTextField24.setEnabled(true);
            }
            kf=(int)Math.round(tbn[3][3]/1000.0);
            if((tbd[3][3]==1) || (kf==0) || (tbn[3][3]-kf*1000==0)){
              jTextField25.setBounds(new Rectangle(129+b+120,tup+d+(c+2)*17+2,60,16));
              jTextField25.setVisible(true); jTextField25.setEnabled(true);
            }
            kf=(int)Math.round(tbn[3][4]/1000.0);
            if((tbd[3][4]==1) || (kf==0) || (tbn[3][4]-kf*1000==0)){
              jTextField26.setBounds(new Rectangle(129+b+180,tup+d+(c+2)*17+2,60,16));
              jTextField26.setVisible(true); jTextField26.setEnabled(true);
            }
            if(a==5){
              kf=(int)Math.round(tbn[3][5]/1000.0);
              if((tbd[3][5]==1) || (kf==0) || (tbn[3][5]-kf*1000==0)){
                jTextField27.setBounds(new Rectangle(129+b+240,tup+d+(c+2)*17+2,60,16));
                jTextField27.setVisible(true); jTextField27.setEnabled(true);
              }
            }
            if(AddRAnswer==false){
                RightAnswer=RightAnswer+5;
                if(a==5) RightAnswer++;
                for(int i=1; i<=a; i++)
                {
                  kf=(int)Math.round(tbn[3][i]/1000.0);
                  if((tbd[3][i]==1) || (kf==0) || (tbn[3][i]-kf*1000==0))
                    RightAnswer++;
                }
                AddRAnswer=true;
              }
            jButton1.setEnabled(false);
            jButton3.setEnabled(true);
          }
        }
      }
      if(sh==10){
        Tabl1(g,a,c,1+r,1,true,bp);
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
          for(int i=0; i<10; i++){
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
          if(slog!=2) g.setColor(Color.lightGray);
          g.drawString("- на вычисление: "+kolmist_calk,237,80);
          g.setColor(Color.lightGray);
          g.drawString("- на применение: "+kolmist_use,237,95);
          g.setColor(new Color(0, 0, 80));
          if(Vopros!=0 && RightAnswer<=Vopros)
            g.drawString("Результат выполнения упражнения: "+(RightAnswer*100/Vopros)+"%",160,120);
          else
            g.drawString("Результат выполнения упражнения: 0%",160,120);
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
        if(AddRAnswer==false){RightAnswer++; AddRAnswer=true;}
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("0.1.",10, 37);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Требуется ли данную задачу привести к канонической форме?",40, 37);
        if(jRadioButton1.isVisible()==false);
        {
          jRadioButton1.setText("Да");
          jRadioButton1.setBounds(new Rectangle(240,57,55,20));
          jRadioButton2.setText("Нет");
          jRadioButton2.setBounds(new Rectangle(340,57,55,20));
          jRadioButton1.setVisible(true);
          jRadioButton1.setEnabled(true);
          jRadioButton2.setVisible(true);
          jRadioButton2.setEnabled(true);
          jButton1.setEnabled(false);
        }
        if(Right==false){
          g.setColor(Color.blue);
          StringerD.drawString("Правильно",267,107);
          if(jButton1.isEnabled()==false)
          {
            jButton1.setEnabled(true);
            if(otv==2) jRadioButton1.setEnabled(false);
            else jRadioButton2.setEnabled(false);
          }
        }
        else if(jRadioButton.isSelected()==false){
               g.setColor(Color.red);
               if(otv==1){
                 StringerD.drawString("Неправильно, так как задача уже представалена в канонической форме.",47,107);
                 if(entry==false){Mist_knowledge[1]++; entry=true;}
               }
               else if(otv==2){
                      StringerD.drawString("Неправильно, так как в ограничениях присутствуют неравенства.",72,107);
                      if(entry==false){Mist_knowledge[1]++; entry=true;}
                    }
             }
      }
      if(sh==2){
        if(AddRAnswer==false){RightAnswer++; AddRAnswer=true;}
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("0.2.",10, 37);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Требуется ли перейти к М-задаче?",40, 37);
        if(jRadioButton1.isVisible()==false);
        {
          jRadioButton1.setText("Да");
          jRadioButton1.setBounds(new Rectangle(240,57,55,20));
          jRadioButton2.setText("Нет");
          jRadioButton2.setBounds(new Rectangle(340,57,55,20));
          jRadioButton1.setVisible(true);
          jRadioButton1.setEnabled(true);
          jRadioButton2.setVisible(true);
          jRadioButton2.setEnabled(true);
          jButton1.setEnabled(false);
        }
        if(Right==false){
          g.setColor(Color.blue);
          StringerD.drawString("Правильно",267,107);
          if(jButton1.isEnabled()==false)
          {
            jButton1.setEnabled(true);
            if(otv==2) jRadioButton1.setEnabled(false);
            else jRadioButton2.setEnabled(false);
          }
        }
        else if(jRadioButton.isSelected()==false){
               g.setColor(Color.red);
               if(otv==1){
                 StringerD.drawString("Неправильно, так как в канонической форме уже есть базисные переменные.",25,107);
                 if(entry==false){ Mist_knowledge[2]++; entry=true;}
               }
               else if(otv==2){
                      StringerD.drawString("Неправильно, в канонической форме нет базисных переменных.",72,107);
                      if(entry==false){ Mist_knowledge[2]++; entry=true;}
                    }
             }
      }
      if(sh==3){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("1.1.",10, 37);
        g.setColor(new Color(0, 0, 80));
        if(slog>=1)
        {
          if(AddRAnswer==false){RightAnswer++; AddRAnswer=true;}
          Stringer.drawString("Выберите базисные переменные.",40, 37);
          if(a==4)
          {
            jCheckBox2.setBounds(new Rectangle(233, 47, 45, 23));
            jCheckBox3.setBounds(new Rectangle(366, 47, 45, 23));
            jCheckBox4.setBounds(new Rectangle(499, 47, 45, 23));
          }
          else
          {
            jCheckBox2.setBounds(new Rectangle(200, 47, 45, 23));
            jCheckBox3.setBounds(new Rectangle(300, 47, 45, 23));
            jCheckBox4.setBounds(new Rectangle(400, 47, 45, 23));
            jCheckBox5.setVisible(true); jCheckBox5.setEnabled(true);
          }
          jCheckBox1.setVisible(true); jCheckBox1.setEnabled(true);
          jCheckBox2.setVisible(true); jCheckBox2.setEnabled(true);
          jCheckBox3.setVisible(true); jCheckBox3.setEnabled(true);
          jCheckBox4.setVisible(true); jCheckBox4.setEnabled(true);
          jButton1.setEnabled(false); jButton3.setEnabled(true);
          if(edt==true)
            if(Right==true)
            {
              g.setColor(Color.blue);
              StringerD.drawString("Правильно",267,107);
              jCheckBox1.setEnabled(false);
              jCheckBox2.setEnabled(false);
              jCheckBox3.setEnabled(false);
              jCheckBox4.setEnabled(false);
              if(a==5) jCheckBox5.setEnabled(false);
              jButton1.setEnabled(true); jButton3.setEnabled(false);
            }
            else
            {
              g.setColor(Color.red);
              StringerD.drawString("Неправильно",258,107);
              if(entry==false){ Mist_knowledge[3]++; entry=true;}
            }
        }
        else
        {
          Stringer.drawString("В базис вводим переменные x_{"+bp[0]+"} и x_{"+bp[1]+"}.",40, 37);
        }
      }
      if(sh==4){
        otvet="";
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("1.2.",10, 37);
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
              else otvet=otvet+")";
              StringerD.drawString(otvet,(620-Fm.stringWidth(otvet)*11/6)/2,107);*/
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
      if(sh==5){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString("1.3.",10, 37);
        g.setColor(new Color(0, 0, 80));
        if(slog==2)
        {
          Stringer.drawString("Вычислите относительные оценки      ,    = 1, ..., "+a+".",40, 37);
          g.setFont(new java.awt.Font("SansSerif", 3, 14));
          g.drawString("j",324, 37);
          g.setColor(Color.red); Ind_nk(g,"\u2206","  j",296,37);
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
          Stringer.drawString("Вычисляем относительные оценки      ,    = 1, ..., "+a+".",40, 37);
          g.setFont(new java.awt.Font("SansSerif", 3, 14));
          g.drawString("j",327, 37);
          g.setColor(Color.red); Ind_nk(g,"\u2206","  j",299,37);
        }
      }
      if(sh==6){
        if(AddRAnswer==false){RightAnswer++; AddRAnswer=true;}
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString((1+r)+".4.1.",10, 37);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Проанализируйте относительные оценки     .",54, 37);
        g.setColor(Color.red);
        Ind_nk(g,"\u2206","  j",355,37);
        g.setColor(new Color(0, 0, 40)); g.setFont(new java.awt.Font("Dialog", 3, 14));
        g.drawString("Текущее базисное решение ",50,62);
        jRadioButton1.setText("оптимально");
        jRadioButton1.setBounds(new Rectangle(253,47,155,20));
        jRadioButton2.setText("не оптимально");
        jRadioButton2.setBounds(new Rectangle(253,67,180,20));
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
                 if(entry==false) Mist_under[6]++; entry=true;
               }
               else if(otv==2){
                      StringerD.drawString("Неправильно, так как все оценки       \u2264 0.",162,107);
                      Ind_nk(g,"\u2206","  j",405,107);
                      if(entry==false) Mist_under[6]++; entry=true;
                    }
             }
      }
      if(sh==7){
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        if(slog>=1)
        {
          if(AddRAnswer==false){RightAnswer++; AddRAnswer=true;}
          g.drawString((1+r)+".4.2.",10, 37);
          g.setColor(new Color(0, 0, 80));
          Stringer.drawString("Курсором мыши укажите в таблице переменную, которая должна быть",54, 37);
          Stringer.drawString("введена в базис.",12, 57);
          jRadioButton.setVisible(true);
          jRadioButton.setEnabled(true);
          jButton1.setEnabled(false);
          if(otv==0){
            g.setColor(Color.red); if(entry==false) Mist_under[7]++; entry=true;
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
          g.drawString("2."+(1+r)+".2.",10, 37);
          g.setColor(new Color(0, 0, 80));
          Stringer.drawString("Вводим в базис переменную     , т.к. оценка при переменной     ",54, 37);
          Stringer.drawString("максимальна.",12, 57);
          Ind_n(g,"x",""+n,268,37); Ind_n(g,"x",""+n,494,37);
        }
      }
      if(sh==8){
        if(AddRAnswer==false){RightAnswer++; AddRAnswer=true;}
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString((1+r)+".5.",10, 37);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Определяем переменную, выводимую из базиса: для этого вычисляем",40, 37);
        Stringer.drawString("отношение БР/a_{ir}. Курсором мыши укажите в таблице переменную, которая",12, 57);
        Stringer.drawString("должна быть выведена из базиса.",12, 77);
        g.setColor(Color.red);
        Stringer.drawString("отношение БР/a_{ir}",12, 57);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("отношение",12, 57);
        jRadioButton.setVisible(true);
        jRadioButton.setEnabled(true);
        jButton1.setEnabled(false);
        if((otv==0)){
          g.setColor(Color.red);
          if(tbn[bpx+1][8]!=-20000){
            if(entry==false) Mist_under[8]++; entry=true;
            StringerD.drawString("Неправильно, так как отношение БР/a_{ir} при переменной x_{"+bp[bpx]+"}",98,97);
            StringerD.drawString("не является минимальным.",208,117);
          }
          else{
            StringerD.drawString("Неправильно, т.к. коэффициент при переменной x_{"+bp[bpx]+"} в столбце соответствующему",15,97);
            StringerD.drawString("переменной x_{"+n+"}, вводимой в базис, не является положительным.",77,117);
            if(entry==false) Mist_under[8]++; entry=true;
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
      if(sh==9){
        otvet="";
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        if(slog==2)
        {
          g.drawString((r+1)+".2.",10, 37);
          g.setColor(new Color(0, 0, 80));
          Stringer.drawString("Вычислите новое базисное решение и занесите результаты пересчета в",40, 37);
          g.setFont(new java.awt.Font("SansSerif", 3, 14));
          g.drawString("Таблицу "+(r+1)+".",12, 57);
          g.setColor(Color.red);
          g.drawString("Таблицу "+(r+1),12, 57);
          jCheckBox.setText("Таблица "+r);
          jCheckBox.setVisible(true);  jCheckBox.setEnabled(true);
          g.setColor(Color.red);
          if(edt==true){
            if((Right==false) || (RightPust==false)){
           /*   StringerD.drawString("Неправильно",258,87);
              if(Right==false) otvet="( Таблица заполнена неверно. ";
              else otvet="(";
              if(RightPust==false) otvet=otvet+" Не оставляйте поля пустыми. )";
              else otvet=otvet+")";
              StringerD.drawString(otvet,(620-Fm.stringWidth(otvet)*11/6)/2,107);*/
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
          g.drawString((r+1)+".2.",10, 37);
          g.setColor(new Color(0, 0, 80));
          Stringer.drawString("Вычисляем новое базисное решение и заносим результаты пересчета в",40, 37);
          g.setFont(new java.awt.Font("SansSerif", 3, 14));
          g.drawString("Таблицу "+(r+1)+".",12, 57);
          g.setColor(Color.red);
          g.drawString("Таблицу "+(r+1),12, 57);
          jCheckBox.setText("Таблица "+r);
          jCheckBox.setVisible(true);  jCheckBox.setEnabled(true);
        }
      }
      if(sh==10){
        int kolmist_calk=0, kolmist_under=0;
        otvet="Решение изходной задачи: x^{* }= ("; boolean flag=false; int ki=0;
        g.setColor(new Color(180, 0, 60)); g.setFont(new java.awt.Font("SansSerif", 3, 16));
        g.drawString((r+2)+".",10, 37);
        g.setColor(new Color(0, 0, 80));
        for(int j=1; j<=an; j++)
        {
          flag=false;
          if(j>1) otvet=otvet+"; ";
          for(int i=0; i<c; i++)
            if(bp[i]==j){
              flag=true;
              if(tbd[i+1][0]!=1 && tbn[i+1][0]!=0) otvet=otvet+tbn[i+1][0]+"/"+tbd[i+1][0];
              else otvet=otvet+tbn[i+1][0];
            }
          if(flag==false) otvet=otvet+"0";
        }
        otvet=otvet+").";
        g.setColor(Color.red);
        Stringer.drawString(otvet,26, 37);
        g.setColor(new Color(0, 0, 80));
        Stringer.drawString("Решение изходной задачи:",26, 37);
        jCheckBoxRezult.setVisible(true);  jCheckBoxRezult.setEnabled(true);
        g.setColor(Color.black);
        g.drawLine(230,80,390,80); g.drawLine(230,81,390,81);
       /* g.setColor(new Color(0, 0, 80)); g.setFont(new java.awt.Font("SansSerif", 3, 14));
        g.drawString("Вы  совершили  следующее  количество  ошибок :",40,67);
        for(int i=0; i<10; i++){
          kolmist_calk=kolmist_calk+Mist_calk[i];
          kolmist_under=kolmist_under+Mist_under[i];
        }
        if(slog==2)
        {
          g.drawString("на вычисление - "+kolmist_calk+" ;",410,67);
          g.drawString("на понимание   - "+kolmist_under+" .",410,87);
        }
        else
          g.drawString(""+(kolmist_under+kolmist_calk)+" .",403,67);*/
     }
     if(sh==10) jButton1.setEnabled(false);
    }
  }

  void jPanel1_mouseClicked(MouseEvent e){
    if(sh==7 || sh==8){
      edt=true;
      jPanel3.repaint();
    }
    if(sh==10 && e.getX()>=511 && e.getX()<=526 && e.getY()>=135 && e.getY()<=150){
      jCheckBoxRezult.setSelected(false);
      Ch=false;
      jPanel1.repaint();
      jPanel2.repaint();
      //jCheckBoxRezult.setOpaque(true);
    }
  }

  void jPanel2_mouseClicked(MouseEvent e){
    if(sh==7 || sh==8){
      edt=true; entry=false;
      Kx=e.getX(); Ky=e.getY();
      jPanel2.repaint();
     // jPanel3.repaint();
    }
  }
  void jPanel3_mouseClicked(MouseEvent e){
    if(sh==7 || sh==8){
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
 //  jComboBox1.setVisible(true); jComboBox1.setEnabled(true);
 //   jComboBox2.setVisible(true); jComboBox2.setEnabled(true);
    jRadioButton.setSelected(true);
    jButton3.setEnabled(false); jButton1.setEnabled(true);
    jRadioButton1.setVisible(false); jRadioButton1.setEnabled(false);
    jRadioButton2.setVisible(false); jRadioButton2.setEnabled(false);
    jCheckBox.setSelected(false); jCheckBox.setVisible(false); jCheckBox.setEnabled(false);
    jCheckBox1.setSelected(false); jCheckBox1.setVisible(false); jCheckBox1.setEnabled(false);
    jCheckBox2.setSelected(false); jCheckBox2.setVisible(false); jCheckBox2.setEnabled(false);
    jCheckBox3.setSelected(false); jCheckBox3.setVisible(false); jCheckBox3.setEnabled(false);
    jCheckBox4.setSelected(false); jCheckBox4.setVisible(false); jCheckBox4.setEnabled(false);
    jCheckBox5.setSelected(false); jCheckBox5.setVisible(false); jCheckBox5.setEnabled(false);
    jCheckBoxRezult.setSelected(true); jCheckBoxRezult.setVisible(false); jCheckBoxRezult.setEnabled(false);
    jTextField1.setText(""); jTextField2.setText(""); jTextField3.setText("");
    jTextField4.setText(""); jTextField5.setText(""); jTextField6.setText("");
    jTextField7.setText(""); jTextField8.setText(""); jTextField9.setText("");
    jTextField23.setText(""); jTextField24.setText(""); jTextField25.setText("");
    jTextField26.setText(""); jTextField27.setText("");
    jTextField1.setVisible(false); jTextField1.setEnabled(false);
    jTextField2.setVisible(false); jTextField2.setEnabled(false);
    jTextField3.setVisible(false); jTextField3.setEnabled(false);
    jTextField4.setVisible(false); jTextField4.setEnabled(false);
    jTextField5.setVisible(false); jTextField5.setEnabled(false);
    jTextField6.setVisible(false); jTextField6.setEnabled(false);
    jTextField7.setVisible(false); jTextField7.setEnabled(false);
    jTextField8.setVisible(false); jTextField8.setEnabled(false);
    jTextField9.setVisible(false); jTextField9.setEnabled(false);
    jTextField23.setVisible(false); jTextField23.setEnabled(false);
    jTextField24.setVisible(false); jTextField24.setEnabled(false);
    jTextField25.setVisible(false); jTextField25.setEnabled(false);
    jTextField26.setVisible(false); jTextField26.setEnabled(false);
    jTextField27.setVisible(false); jTextField27.setEnabled(false);
    jTextField1.setForeground(new Color(0, 0, 120));
    jTextField2.setForeground(new Color(0, 0, 120));
    jTextField3.setForeground(new Color(0, 0, 120));
    jTextField4.setForeground(new Color(0, 0, 120));
    jTextField5.setForeground(new Color(0, 0, 120));
    jTextField6.setForeground(new Color(0, 0, 120));
    jTextField7.setForeground(new Color(0, 0, 120));
    jTextField8.setForeground(new Color(0, 0, 120));
    jTextField9.setForeground(new Color(0, 0, 120));
    jTextField23.setForeground(new Color(0, 0, 120));
    jTextField24.setForeground(new Color(0, 0, 120));
    jTextField25.setForeground(new Color(0, 0, 120));
    jTextField26.setForeground(new Color(0, 0, 120));
    jTextField27.setForeground(new Color(0, 0, 120));
    if(sh==9) sh=5;
    if((sh==6) && (n<=0)) sh=9;
    sh++;
    if (sh>10) sh=10;
    if(sh==9){
      for(int i=0; i<=3; i++)
        for(int j=0; j<=8; j++){
          tbn0[i][j]=tbn[i][j];
          tbd0[i][j]=tbd[i][j];
       }
      for(int i=0; i<=1; i++){
        bp0[i]=bp[i];
      }
      a0=a; c0=c; r++;
    }
    SetParam();
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
    sh=0;
    SetStartParam();
    jRadioButton.setSelected(true);
    jButton3.setEnabled(false); jButton1.setEnabled(true);
    jRadioButton1.setVisible(false); jRadioButton1.setEnabled(false);
    jRadioButton2.setVisible(false); jRadioButton2.setEnabled(false);
    jCheckBox.setSelected(false); jCheckBox.setVisible(false); jCheckBox.setEnabled(false);
    jCheckBox1.setSelected(false); jCheckBox1.setVisible(false); jCheckBox1.setEnabled(false);
    jCheckBox2.setSelected(false); jCheckBox2.setVisible(false); jCheckBox2.setEnabled(false);
    jCheckBox3.setSelected(false); jCheckBox3.setVisible(false); jCheckBox3.setEnabled(false);
    jCheckBox4.setSelected(false); jCheckBox4.setVisible(false); jCheckBox4.setEnabled(false);
    jCheckBox5.setSelected(false); jCheckBox5.setVisible(false); jCheckBox5.setEnabled(false);
    jCheckBoxRezult.setSelected(true); jCheckBoxRezult.setVisible(false); jCheckBoxRezult.setEnabled(false);
    jTextField1.setText(""); jTextField2.setText(""); jTextField3.setText("");
    jTextField4.setText(""); jTextField5.setText(""); jTextField6.setText("");
    jTextField7.setText(""); jTextField8.setText(""); jTextField9.setText("");
    jTextField23.setText(""); jTextField24.setText(""); jTextField25.setText("");
    jTextField26.setText(""); jTextField27.setText("");
    jTextField1.setVisible(false); jTextField1.setEnabled(false);
    jTextField2.setVisible(false); jTextField2.setEnabled(false);
    jTextField3.setVisible(false); jTextField3.setEnabled(false);
    jTextField4.setVisible(false); jTextField4.setEnabled(false);
    jTextField5.setVisible(false); jTextField5.setEnabled(false);
    jTextField6.setVisible(false); jTextField6.setEnabled(false);
    jTextField7.setVisible(false); jTextField7.setEnabled(false);
    jTextField8.setVisible(false); jTextField8.setEnabled(false);
    jTextField9.setVisible(false); jTextField9.setEnabled(false);
    jTextField23.setVisible(false); jTextField23.setEnabled(false);
    jTextField24.setVisible(false); jTextField24.setEnabled(false);
    jTextField25.setVisible(false); jTextField25.setEnabled(false);
    jTextField26.setVisible(false); jTextField26.setEnabled(false);
    jTextField27.setVisible(false); jTextField27.setEnabled(false);
    SetParam();
  }

  void jButton3_actionPerformed(ActionEvent e) {
    Right=true; RightPust=true; edt=true; ots=""; int index=-1; double Number=20000; String txt="";
    if(sh==3)
    {
      for(int i=1; i<=a; i++)
        if((bazis[i-1]==true && bp[0]!=i && bp[1]!=i) || (bazis[i-1]==false && (bp[0]==i || bp[1]==i)))
        { Right=false; Mist_under[4]++;}
    }
    if((jTextField1.isEnabled()==true) && (jTextField1.getText().equals("")!=true)){
      try{
        if(tbn[0][2]==(int)(Double.parseDouble(jTextField1.getText()))){
          jTextField1.setText(""); jTextField1.setVisible(false); jTextField1.setEnabled(false);
        }
        else{ Right=false; Mist_under[4]++; jTextField1.setForeground(Color.red);}
      }
      catch(Exception ee){
        Right=false; Mist_under[4]++; jTextField1.setForeground(Color.red);
      }
    }
    else if((jTextField1.isEnabled()==true) && (jTextField1.getText().equals("")==true)) RightPust=false;
    if((jTextField2.isEnabled()==true) && (jTextField2.getText().equals("")!=true)){
      try{
        if(tbn[0][4]==(int)(Double.parseDouble(jTextField2.getText()))){
          jTextField2.setText(""); jTextField2.setVisible(false); jTextField2.setEnabled(false);
        }
        else { Right=false; Mist_under[4]++; jTextField2.setForeground(Color.red);}
      }
      catch(Exception ee){
        Right=false; Mist_under[4]++; jTextField2.setForeground(Color.red);
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
          else{ Right=false; if(sh==3) Mist_under[4]++; else Mist_calk[9]++; jTextField3.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==3) Mist_under[4]++; else Mist_calk[9]++; jTextField3.setForeground(Color.red);
        }
      }
      else{ Right=false; if(sh==3) Mist_under[4]++; else Mist_calk[9]++; jTextField3.setForeground(Color.red);}
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
          else{ Right=false; if(sh==3) Mist_under[4]++; else Mist_calk[9]++; jTextField4.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==3) Mist_under[4]++; else Mist_calk[9]++; jTextField4.setForeground(Color.red);
        }
      }
      else{ Right=false; if(sh==3) Mist_under[4]++; else Mist_calk[9]++; jTextField4.setForeground(Color.red);}
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
          else{ Right=false; if(sh==3) Mist_under[4]++; else Mist_calk[9]++; jTextField5.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==3) Mist_under[4]++; else Mist_calk[9]++; jTextField5.setForeground(Color.red);
        }
      }
      else{ Right=false; if(sh==3) Mist_under[4]++; else Mist_calk[9]++; jTextField5.setForeground(Color.red);}
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
          else{ Right=false; if(sh==3) Mist_under[4]++; else Mist_calk[9]++; jTextField6.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==3) Mist_under[4]++; else Mist_calk[9]++; jTextField6.setForeground(Color.red);
        }
      }
      else{ Right=false; if(sh==3) Mist_under[4]++; else Mist_calk[9]++; jTextField6.setForeground(Color.red);}
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
          else{ Right=false; if(sh==3) Mist_under[4]++; else Mist_calk[9]++; jTextField7.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==3) Mist_under[4]++; else Mist_calk[9]++; jTextField7.setForeground(Color.red);
        }
      }
      else{ Right=false; if(sh==3) Mist_under[4]++; else Mist_calk[9]++; jTextField7.setForeground(Color.red);}
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
          else{ Right=false; if(sh==3) Mist_under[4]++; else Mist_calk[9]++; jTextField8.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==3) Mist_under[4]++; else Mist_calk[9]++; jTextField8.setForeground(Color.red);
        }
      }
      else{ Right=false; if(sh==3) Mist_under[4]++; else Mist_calk[9]++; jTextField8.setForeground(Color.red);}
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
          else{ Right=false; if(sh==3) Mist_under[4]++; else Mist_calk[9]++; jTextField9.setForeground(Color.red);}
        }
        catch(Exception ee){
          Right=false; if(sh==3) Mist_under[4]++; else Mist_calk[9]++; jTextField9.setForeground(Color.red);
        }
      }
      else{ Right=false; if(sh==3) Mist_under[4]++; else Mist_calk[9]++; jTextField9.setForeground(Color.red);}
    }
    else if((jTextField9.isEnabled()==true) && (jTextField9.getText().equals("")==true)) RightPust=false;
    if((jTextField23.isEnabled()==true) && (jTextField23.getText().equals("")!=true)){
      if((((int)Math.round(tbn[3][1]/1000.0))>-1) && (((int)Math.round(tbn[3][1]/1000.0))<1)){
        txt=jTextField23.getText();
        if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
          index=txt.indexOf("/");
          try{
            if(index==-1) Number=Double.parseDouble(txt);
            else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
            if((double)tbn[3][1]/tbd[3][1]==Number){
              jTextField23.setText(""); jTextField23.setVisible(false); jTextField23.setEnabled(false);
            }
            else{ Right=false; ots=ots+" \u2206_{1}"; if(sh==5) Mist_calk[5]++; else Mist_calk[9]++; jTextField23.setForeground(Color.red);}
          }
          catch(Exception ee){
            Right=false; ots=ots+" \u2206_{1}"; if(sh==5) Mist_calk[5]++; else Mist_calk[9]++; jTextField23.setForeground(Color.red);
          }
        }
        else{Right=false; ots=ots+" \u2206_{1}"; if(sh==5) Mist_calk[5]++; else Mist_calk[9]++; jTextField23.setForeground(Color.red);}
      }
      else if(jTextField23.getText().equals(Delta[1])==true || jTextField23.getText().equals(Delta1[1])==true){
             jTextField23.setText(""); jTextField23.setVisible(false); jTextField23.setEnabled(false);
           }
           else{ Right=false; ots=ots+" \u2206_{1}"; if(sh==5) Mist_calk[5]++; else Mist_calk[9]++; jTextField23.setForeground(Color.red);}
    }
    else if((jTextField23.isEnabled()==true) && (jTextField23.getText().equals("")==true)) RightPust=false;
    if((jTextField24.isEnabled()==true) && (jTextField24.getText().equals("")!=true)){
      if((((int)Math.round(tbn[3][2]/1000.0))>-1) && (((int)Math.round(tbn[3][2]/1000.0))<1)){
        txt=jTextField24.getText();
        if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
          index=txt.indexOf("/");
          try{
            if(index==-1) Number=Double.parseDouble(txt);
            else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
            if((double)tbn[3][2]/tbd[3][2]==Number){
              jTextField24.setText(""); jTextField24.setVisible(false); jTextField24.setEnabled(false);
            }
            else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{2}";
                  if(sh==5) Mist_calk[5]++; else Mist_calk[9]++; jTextField24.setForeground(Color.red);}
          }
          catch(Exception ee){
            Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{2}";
            if(sh==5) Mist_calk[5]++; else Mist_calk[9]++; jTextField24.setForeground(Color.red);
          }
        }
        else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{2}";
              if(sh==5) Mist_calk[5]++; else Mist_calk[9]++; jTextField24.setForeground(Color.red);}
      }
      else if(jTextField24.getText().equals(Delta[2])==true || jTextField24.getText().equals(Delta1[2])==true){
             jTextField24.setText(""); jTextField24.setVisible(false); jTextField24.setEnabled(false);
           }
           else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{2}";
                  if(sh==5) Mist_calk[5]++; else Mist_calk[9]++;}
    }
    else if((jTextField24.isEnabled()==true) && (jTextField24.getText().equals("")==true)) RightPust=false;
    if((jTextField25.isEnabled()==true) && (jTextField25.getText().equals("")!=true)){
      if((((int)Math.round(tbn[3][3]/1000.0))>-1) && (((int)Math.round(tbn[3][3]/1000.0))<1)){
        txt=jTextField25.getText();
        if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
          index=txt.indexOf("/");
          try{
            if(index==-1) Number=Double.parseDouble(txt);
            else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
            if((double)tbn[3][3]/tbd[3][3]==Number){
              jTextField25.setText(""); jTextField25.setVisible(false); jTextField25.setEnabled(false);
            }
            else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{3}";
                   if(sh==5) Mist_calk[5]++; else Mist_calk[9]++; jTextField25.setForeground(Color.red);}
          }
          catch(Exception ee){
            Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{3}";
            if(sh==5) Mist_calk[5]++; else Mist_calk[9]++; jTextField25.setForeground(Color.red);
          }
        }
        else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{3}"; jTextField25.setForeground(Color.red);}
      }
      else if(jTextField25.getText().equals(Delta[3])==true || jTextField25.getText().equals(Delta1[3])==true){
             jTextField25.setText(""); jTextField25.setVisible(false); jTextField25.setEnabled(false);
           }
           else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{3}";
                 if(sh==5) Mist_calk[5]++; else Mist_calk[9]++; jTextField25.setForeground(Color.red);}
    }
    else if((jTextField25.isEnabled()==true) && (jTextField25.getText().equals("")==true)) RightPust=false;
    if((jTextField26.isEnabled()==true) && (jTextField26.getText().equals("")!=true)){
      if((((int)Math.round(tbn[3][4]/1000.0))>-1) && (((int)Math.round(tbn[3][4]/1000.0))<1)){
        txt=jTextField26.getText();
        if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
          index=txt.indexOf("/");
          try{
            if(index==-1) Number=Double.parseDouble(txt);
            else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
            if((double)tbn[3][4]/tbd[3][4]==Number){
              jTextField26.setText(""); jTextField26.setVisible(false); jTextField26.setEnabled(false);
            }
            else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{4}";
                   if(sh==5) Mist_calk[5]++; else Mist_calk[9]++; jTextField26.setForeground(Color.red);}
          }
          catch(Exception ee){
            Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{4}";
            if(sh==5) Mist_calk[5]++; else Mist_calk[9]++; jTextField26.setForeground(Color.red);
          }
        }
        else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{4}"; jTextField26.setForeground(Color.red);}
      }
      else if(jTextField26.getText().equals(Delta[4])==true || jTextField26.getText().equals(Delta1[4])==true){
             jTextField26.setText(""); jTextField26.setVisible(false); jTextField26.setEnabled(false);
           }
           else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{4}";
                  if(sh==5) Mist_calk[5]++; else Mist_calk[9]++; jTextField26.setForeground(Color.red);}
    }
    else if((jTextField26.isEnabled()==true) && (jTextField26.getText().equals("")==true)) RightPust=false;
    if((jTextField27.isEnabled()==true) && (jTextField27.getText().equals("")!=true)){
      if((((int)Math.round(tbn[3][5]/1000.0))>-1) && (((int)Math.round(tbn[3][5]/1000.0))<1)){
        txt=jTextField27.getText();
        if((txt.indexOf("/")==txt.lastIndexOf("/")) && (txt.indexOf("/")!=0)){
          index=txt.indexOf("/");
          try{
            if(index==-1) Number=Double.parseDouble(txt);
            else Number=Double.parseDouble(txt.substring(0,index))/Double.parseDouble(txt.substring(index+1));
            if((double)tbn[3][5]/tbd[3][5]==Number){
              jTextField27.setText(""); jTextField27.setVisible(false); jTextField27.setEnabled(false);
            }
            else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{5}";
                  if(sh==5) Mist_calk[5]++; else Mist_calk[9]++; jTextField27.setForeground(Color.red);}
          }
          catch(Exception ee){
            Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{5}";
            if(sh==5) Mist_calk[5]++; else Mist_calk[9]++; jTextField27.setForeground(Color.red);
          }
        }
        else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{5}"; jTextField27.setForeground(Color.red);}
      }
      else if(jTextField27.getText().equals(Delta[5])==true || jTextField27.getText().equals(Delta1[5])==true){
             jTextField27.setText(""); jTextField27.setVisible(false); jTextField27.setEnabled(false);
           }
           else{ Right=false; if(ots.equals("")==false) ots=ots+", "; ots=ots+" \u2206_{5}";
                 if(sh==5) Mist_calk[5]++; else Mist_calk[9]++; jTextField27.setForeground(Color.red);}
    }
    else if((jTextField27.isEnabled()==true) && (jTextField27.getText().equals("")==true)) RightPust=false;
    if((Right==true) && (RightPust==true)){
      jButton3.setEnabled(false);
      jButton1.setEnabled(true);
    }
   // jPanel1.repaint();
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
    if(sh==6)
      if(n==-1) Right=false;
    if((sh==1) && (vrt!=1 && vrt!=2)) Right=false;
    if((sh==2) && (vrt!=1 && vrt!=3 && vrt!=5 && vrt!=6 && vrt!=7)) Right=false;
    entry=false;
    otv=1;
    jPanel3.repaint();
  }

  void jRadioButton2_itemStateChanged(ItemEvent e) {
    if(sh==6)
      if(n>0) Right=false;
    if((sh==1) && (vrt==1 || vrt==2)) Right=false;
    if((sh==2) && (vrt==1 || vrt==3 || vrt==5 || vrt==6 || vrt==7)) Right=false;
    otv=2; entry=false;
    jPanel3.repaint();
  }

  void jCheckBox_stateChanged(ChangeEvent e) {
    if(jCheckBox.isSelected()==true) Ch=true;
    else Ch=false;
    jPanel1.repaint();
    jCheckBox.setOpaque(true);
  }

  void jCheckBox1_stateChanged(ChangeEvent e) {
    if(jCheckBox1.isSelected()==true) bazis[0]=true;
    else bazis[0]=false;
    entry=false;
    jCheckBox1.setOpaque(true);
  }

  void jCheckBox2_stateChanged(ChangeEvent e) {
    if(jCheckBox2.isSelected()==true) bazis[1]=true;
    else bazis[1]=false;
    entry=false;
    jCheckBox2.setOpaque(true);
  }

  void jCheckBox3_stateChanged(ChangeEvent e) {
    if(jCheckBox3.isSelected()==true) bazis[2]=true;
    else bazis[2]=false;
    entry=false;
    jCheckBox3.setOpaque(true);
  }

  void jCheckBox4_stateChanged(ChangeEvent e) {
    if(jCheckBox4.isSelected()==true) bazis[3]=true;
    else bazis[3]=false;
    entry=false;
    jCheckBox4.setOpaque(true);
  }

  void jCheckBox5_stateChanged(ChangeEvent e) {
    if(jCheckBox5.isSelected()==true) bazis[4]=true;
    else bazis[4]=false;
    entry=false;
    jCheckBox5.setOpaque(true);
  }
  void jCheckBoxRezult_stateChanged(ChangeEvent e) {
    if(jCheckBoxRezult.isSelected()==true && sh==10) Ch=true;
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
}
