package prmetn;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class PrMetN extends JApplet {
  private boolean isStandalone = false;
       Image pic;
         public int fll=0,vid=0;;
         int s=0,fl=0,fl1=0,fl2=0;
         Color ColorFon=new Color(247,247,255);//���� ����
         //������
         Color ColorPanelFon=new Color(255,255,255);//���� ���� �������
         Color ColorPanelPamka=new Color(157,187,255);//���� ����������
         //������
         Color ColorBtnBackground=new Color(220,230,255);//���� ���� ������
         Color ColorBtnForeground=new Color(0,0,60);//���� �������
         Font FontBtn=new java.awt.Font("Dialog",1,12);//����� �������(�����"==>" � "<==")
         Font FontBtnStr=new java.awt.Font("Dialog",1,14);//����� ��� "==>" � "<=="
         Font FontStr=new java.awt.Font("SansSerif",0,14);//����� ��� "=>" � "<="
         //���������
         Color ColorTitle=new Color(130,0,80);//����
         Font FontTitle=new java.awt.Font("Dialog",1,16);//�����
         //�������(����. "����������� �����������" � �.�.)
         Color ColorSubTitle=new Color(180,0,60);//����
         Font FontSubTitle=new java.awt.Font("Dialog",3,12);//�����
         //���� "�������"
         Color ColorSolutionText=new Color(0,0,80);
         Font FontSolutionText=new java.awt.Font("Dialog",1,14);

         Container cp;
         DrawPanel_prN drawPanel1 = new DrawPanel_prN();
         JButton nextButton = new JButton();
         JButton refreshButton = new JButton();
         JLabel jLabel1 = new JLabel();
         JLabel jLabel2 = new JLabel();
         JLabel jLabel5 = new JLabel();
         JLabel jLabel6 = new JLabel();
         JButton zoomInButton = new JButton();
         JButton zoomOutButton = new JButton();
         JButton upButton = new JButton();
         JButton downButton = new JButton();
         JButton rightButton = new JButton();
         JButton leftButton = new JButton();
         JButton jButton1 = new JButton();
  JButton jButton_graf = new JButton();
  Panel_3d jPanel_3d = new  Panel_3d();
 // JPanel jPanel_3d = new JPanel();
  TitledBorder titledBorder1;
  Border border1;
  Border border2;
  TitledBorder titledBorder2;

  //Get a parameter value
  public String getParameter(String key, String def) {
    return isStandalone ? System.getProperty(key, def) :
      (getParameter(key) != null ? getParameter(key) : def);
  }

  //Construct the applet
  public PrMetN() {
  }

  //Initialize the applet
  public void init() {
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
    DrawPanel_prN.setFunc(0);
  }
  //Component initialization
  private void jbInit() throws Exception {
  pic = getImage(getCodeBase(), "fun_1.jpg");
    titledBorder1 = new TitledBorder("");
    border1 = BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.white,Color.white,new Color(124, 124, 124),new Color(178, 178, 178));
    border2 = BorderFactory.createMatteBorder(6,6,6,6,Color.white);
    titledBorder2 = new TitledBorder("");
    this.setSize(new Dimension(600,500));
    cp = this.getContentPane();
         cp.setLayout(null);
         this.getContentPane().setBackground(ColorFon);

         this.setSize(new Dimension(613, 550));
         drawPanel1.setBounds(new Rectangle(16, 51, 582, 491));
         jPanel_3d.setBackground(Color.white);
  jPanel_3d.setBorder(BorderFactory.createRaisedBevelBorder());
  jPanel_3d.setBounds(new Rectangle(4, 26, 573, 391));
  jPanel_3d.setLayout(null);
  jPanel_3d.setVisible(false);

         nextButton.setBackground(ColorBtnBackground);
         nextButton.setBounds(new Rectangle(340, 454, 100, 23));
         nextButton.setFont(FontBtnStr);
         nextButton.setForeground(ColorBtnForeground);
         nextButton.setText("==>");
         nextButton.addActionListener(new PrMetN_nextButton_actionAdapter(this));
         refreshButton.setText("��������");
         refreshButton.addActionListener(new PrMetN_refreshButton_actionAdapter(this));
         refreshButton.setForeground(ColorBtnForeground);
         refreshButton.setFont(FontBtn);
         refreshButton.setBounds(new Rectangle(220, 454, 100, 23));
         refreshButton.setBackground(new Color(220, 230, 255));
         jLabel1.setFont(FontTitle);
         jLabel1.setForeground(ColorTitle);
         jLabel1.setRequestFocusEnabled(true);
         jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
         jLabel1.setHorizontalTextPosition(SwingConstants.CENTER);
         jLabel1.setText("������");
         jLabel1.setBounds(new Rectangle(0, 0, 533, 23));
         zoomInButton.setBackground(ColorBtnBackground);
         zoomInButton.setBounds(new Rectangle(66+301, 271+15, 20, 20));
         zoomInButton.setFont(FontStr);
         zoomInButton.setForeground(ColorBtnForeground);
         zoomInButton.setMargin(new Insets(0, 0, 0, 0));
         zoomInButton.setText("+");
         zoomInButton.addActionListener(new PrMetN_zoomInButton_actionAdapter(this));
         zoomOutButton.addActionListener(new PrMetN_zoomOutButton_actionAdapter(this));
         zoomOutButton.setText("-");
         zoomOutButton.addActionListener(new PrMetN_zoomOutButton_actionAdapter(this));
         zoomOutButton.setMargin(new Insets(0, 0, 0, 0));
         zoomOutButton.setForeground(ColorBtnForeground);
         zoomOutButton.setFont(FontStr);
         zoomOutButton.setBounds(new Rectangle(89+301, 271+15, 20, 20));
         zoomOutButton.setBackground(ColorBtnBackground);
         upButton.addActionListener(new   PrMetN_upButton_actionAdapter(this));
         upButton.setText("\u2191");
         upButton.addActionListener(new PrMetN_upButton_actionAdapter(this));
         upButton.setMargin(new Insets(0, 0, 0, 0));
         upButton.setForeground(ColorBtnForeground);
         upButton.setFont(FontStr);
         upButton.setBounds(new Rectangle(135+301, 271+15, 20, 20));
         upButton.setBackground(ColorBtnBackground);
         downButton.addActionListener(new PrMetN_downButton_actionAdapter(this));
         downButton.setText("\u2193");
         downButton.addActionListener(new PrMetN_downButton_actionAdapter(this));
         downButton.setMargin(new Insets(0, 0, 0, 0));
         downButton.setForeground(ColorBtnForeground);
         downButton.setFont(FontStr);
         downButton.setBounds(new Rectangle(112+301, 271+15, 20, 20));
         downButton.setBackground(ColorBtnBackground);
         rightButton.addActionListener(new  PrMetN_rightButton_actionAdapter(this));
         rightButton.setFont(FontStr);
         rightButton.setText("\u2192");
         rightButton.addActionListener(new  PrMetN_rightButton_actionAdapter(this));
         rightButton.setMargin(new Insets(0, 0, 0, 0));
         rightButton.setForeground(ColorBtnForeground);
         rightButton.setBounds(new Rectangle(181+301, 271+15, 20, 20));
         rightButton.setBackground(ColorBtnBackground);
         leftButton.addActionListener(new PrMetN_leftButton_actionAdapter(this));
         leftButton.setFont(FontStr);
         leftButton.setText("\u2190");
         leftButton.addActionListener(new PrMetN_leftButton_actionAdapter(this));
         leftButton.setMargin(new Insets(0, 0, 0, 0));
         leftButton.setForeground(ColorBtnForeground);
         leftButton.setBounds(new Rectangle(158+301, 271+15, 20, 20));
         leftButton.setBackground(ColorBtnBackground);
         cp.setBackground(new Color(247, 247, 255));
         jButton1.setBackground(ColorBtnBackground);
         jButton1.setBounds(new Rectangle(100, 454, 100, 23));
         jButton1.setFont(FontBtnStr);
         jButton1.setForeground(ColorBtnForeground);
         jButton1.setText("<==");
         jButton1.setEnabled(false);
         jButton1.addActionListener(new PrMetN_jButton1_actionAdapter(this));
         jButton_graf.setBackground(new Color(220, 230, 255));

    jButton_graf.setBounds(new Rectangle(5, 421, 571, 26));
    jButton_graf.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton_graf.setForeground(new Color(0, 0, 60));
    jButton_graf.setMinimumSize(new Dimension(467, 25));
    jButton_graf.setText(" ��������� ��������� ������ ������� f(x) =8*(x1+0.6)^4 + 12*(x1+0.4)^4");
    jButton_graf.addActionListener(new PrMetN_jButton_graf_actionAdapter(this));

  drawPanel1.add(jPanel_3d, null);
    drawPanel1.add(downButton, null);

         drawPanel1.add(zoomInButton, null);
         drawPanel1.add(zoomOutButton, null);
         drawPanel1.add(leftButton, null);
         drawPanel1.add(rightButton, null);
         drawPanel1.add(upButton, null);
         drawPanel1.add(jLabel6, null);
      drawPanel1.add(nextButton, null);
    drawPanel1.add(jButton1, null);
    drawPanel1.add(refreshButton, null);
    drawPanel1.add(jButton_graf, null);

         cp.add(jLabel5, null);
         cp.add(jLabel2, null);
         cp.add(jLabel1, null);
    cp.add(drawPanel1, null);
         drawPanel1.addMouseMotionListener(new MouseMotionListener() {
                     public  void mouseMoved(MouseEvent e){
                       drawPanel1_mouseMoved(e);
                     }
                     public  void mouseDragged(MouseEvent e){
                     }
                   });

  }

  //Start the applet
  public void start() {
  }

  //Stop the applet
  public void stop() {
  }

  //Destroy the applet
  public void destroy() {
  }

  //Get Applet information
  public String getAppletInfo() {
    return "Applet Information";
  }

  //Get parameter info
  public String[][] getParameterInfo() {
    return null;
  }

  //Main method
  public static void main(String[] args) {
    PrMetN applet = new PrMetN();
    applet.isStandalone = true;
    JFrame frame = new JFrame();
    //EXIT_ON_CLOSE == 3
    frame.setDefaultCloseOperation(3);
    frame.setTitle("Applet Frame");
    frame.getContentPane().add(applet, BorderLayout.CENTER);
    applet.init();
    applet.start();
    frame.setSize(600,520);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    frame.setLocation((d.width - frame.getSize().width) / 2, (d.height - frame.getSize().height) / 2);
    frame.setVisible(true);
  }

  //static initializer for setting look & feel
  static {
    try {
      //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      //UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
    }
    catch(Exception e) {
    }
  }
  class Panel_3d extends JPanel{
   public void paintComponent(Graphics y){
     super.paintComponent(y);
      y.drawImage(pic, 5,5, this);
      //ColorPanelRamka
     // y.setColor(Color.black);
      //y.drawRect(3,3,460,275);
      //  y.setFont(new java.awt.Font("Dialog", 1, 16));
      //  y.setColor(new Color(180,0,60));
      //  y.drawString("����������", 270,18);

   }
  }

  void nextButton_actionPerformed(ActionEvent e) {
          s++;
          if(s==1)          jButton1.setEnabled(true);
          if(s==300)         nextButton.setEnabled(false);//66
           //if(s==67)            jLabel1.setText("��������");
           if (DrawPanel_prN.cc == DrawPanel_prN.count - 1) {
                        return;
                }
                DrawPanel_prN.cc++;
                if (DrawPanel_prN.incPoints[DrawPanel_prN.cc]) DrawPanel_prN.totalPoints++;
                drawPanel1.repaint();
        }
        void refreshButton_actionPerformed(ActionEvent e) {
          s=0;
          jButton1.setEnabled(false);
          nextButton.setEnabled(true);
                Stringer_prN.init();
                DrawPanel_prN.setFunc(0);
                drawPanel1.repaint();
        }
        void zoomInButton_actionPerformed(ActionEvent e) {
                fl++;
                if(fl==5)zoomInButton.setEnabled(false);
                zoomOutButton.setEnabled(true);
                DrawPanel_prN.setScale(DrawPanel_prN.scale * 1.2);
                drawPanel1.repaint();
        }
        void zoomOutButton_actionPerformed(ActionEvent e) {
                fl--;
                if(fl==-5)zoomOutButton.setEnabled(false);
                zoomInButton.setEnabled(true);
                DrawPanel_prN.setScale(DrawPanel_prN.scale / 1.2);
                drawPanel1.repaint();
        }
        void upButton_actionPerformed(ActionEvent e) {
                fl1++;
                if(fl1==5)upButton.setEnabled(false);
                downButton.setEnabled(true);
                DrawPanel_prN.moveCenter(0, -20);
                drawPanel1.repaint();
        }
        void downButton_actionPerformed(ActionEvent e) {
                fl1--;
                if(fl1==-5)downButton.setEnabled(false);
                upButton.setEnabled(true);
                DrawPanel_prN.moveCenter(0, 20);
                drawPanel1.repaint();
        }
        void leftButton_actionPerformed(ActionEvent e) {
                fl2++;
                if(fl2==5)leftButton.setEnabled(false);
                rightButton.setEnabled(true);
                DrawPanel_prN.moveCenter(-20, 0);
                drawPanel1.repaint();
        }
        void rightButton_actionPerformed(ActionEvent e) {
                fl2--;
                if(fl2==-5)rightButton.setEnabled(false);
                leftButton.setEnabled(true);
                DrawPanel_prN.moveCenter(20, 0);
                drawPanel1.repaint();
        }
        void variantBox_actionPerformed(ActionEvent e) {
                Stringer_prN.init();
                DrawPanel_prN.setFunc(0);
                drawPanel1.repaint();
        }
        void jButton1_actionPerformed(ActionEvent e) {
          s--;
          if(s==0)          jButton1.setEnabled(false);
          if(s==300)         nextButton.setEnabled(true);//65
                if (DrawPanel_prN.cc == 0) {
                        return;
                }
                if (DrawPanel_prN.incPoints[DrawPanel_prN.cc]) DrawPanel_prN.totalPoints--;
                DrawPanel_prN.cc--;
                drawPanel1.repaint();
        }
///////////////////////////////////////////////////////////////////
void drawPanel1_mouseMoved(MouseEvent e)
  {
   if(e.getX()>=8 && e.getX()<=8+10 && e.getY()>=338-14 && e.getY()<=338+1) drawPanel1.fll=2;
   if(e.getX()>=8+13 && e.getX()<=8+15+13 && e.getY()>=338-14 && e.getY()<=338+1) drawPanel1.fll=3;
   drawPanel1.repaint();
  }

  void jButton_graf_actionPerformed(ActionEvent e) {
   jPanel_3d.setVisible(true);


       if (vid<=2){
       vid = vid + 1;
     }
     if(vid==0)
     {jPanel_3d.setVisible(false);
    }
    if(vid==1)
    {  zoomInButton.setEnabled(false);
 zoomOutButton.setEnabled(false);
 upButton.setEnabled(false);
 downButton.setEnabled(false);
 rightButton.setEnabled(false);
 leftButton.setEnabled(false);



      jPanel_3d.setVisible(true);
   jButton_graf.setText(" ������ ��������� ������ ������� f(x) =8*(x1+0.6)^4 + 12*(x1+0.4)^4");
   }
   if(vid==2)
   {   zoomInButton.setEnabled(true);
   zoomOutButton.setEnabled(true);
   upButton.setEnabled(true);
   downButton.setEnabled(true);
   rightButton.setEnabled(true);
   leftButton.setEnabled(true);

       jPanel_3d.setVisible(false);
      jButton_graf.setText(" ��������� ��������� ������ ������� f(x) =8*(x1+0.6)^4 + 12*(x1+0.4)^4");
    }
   if(vid==2) {vid=0;}

    drawPanel1.repaint();

  }





}
class PrMetN_nextButton_actionAdapter implements java.awt.event.
        ActionListener {
        PrMetN adaptee;
        PrMetN_nextButton_actionAdapter(PrMetN adaptee) {
                this.adaptee = adaptee;
        }
        public void actionPerformed(ActionEvent e) {
                adaptee.nextButton_actionPerformed(e);
        }
}
class PrMetN_refreshButton_actionAdapter implements java.awt.event.
        ActionListener {
        PrMetN adaptee;
        PrMetN_refreshButton_actionAdapter(PrMetN adaptee) {
                this.adaptee = adaptee;
        }
        public void actionPerformed(ActionEvent e) {
                adaptee.refreshButton_actionPerformed(e);
        }
}
class PrMetN_zoomInButton_actionAdapter implements java.awt.event.
        ActionListener {
        PrMetN adaptee;
        PrMetN_zoomInButton_actionAdapter(PrMetN adaptee) {
                this.adaptee = adaptee;
        }
        public void actionPerformed(ActionEvent e) {
                adaptee.zoomInButton_actionPerformed(e);
        }
}
class PrMetN_zoomOutButton_actionAdapter implements java.awt.event.
        ActionListener {
        PrMetN adaptee;
        PrMetN_zoomOutButton_actionAdapter(PrMetN adaptee) {
                this.adaptee = adaptee;
        }
        public void actionPerformed(ActionEvent e) {
                adaptee.zoomOutButton_actionPerformed(e);
        }
}
class PrMetN_upButton_actionAdapter implements java.awt.event.
        ActionListener {
        PrMetN adaptee;
        PrMetN_upButton_actionAdapter(PrMetN adaptee) {
                this.adaptee = adaptee;
        }
        public void actionPerformed(ActionEvent e) {
                adaptee.upButton_actionPerformed(e);
        }
}
class PrMetN_downButton_actionAdapter implements java.awt.event.
        ActionListener {
        PrMetN adaptee;
        PrMetN_downButton_actionAdapter(PrMetN adaptee) {
                this.adaptee = adaptee;
        }
        public void actionPerformed(ActionEvent e) {
                adaptee.downButton_actionPerformed(e);
        }
}
class PrMetN_leftButton_actionAdapter implements java.awt.event.
        ActionListener {
        PrMetN adaptee;
        PrMetN_leftButton_actionAdapter(PrMetN adaptee) {
                this.adaptee = adaptee;
        }
        public void actionPerformed(ActionEvent e) {
                adaptee.leftButton_actionPerformed(e);
        }
}
class PrMetN_rightButton_actionAdapter implements java.awt.event.
        ActionListener {
        PrMetN adaptee;
        PrMetN_rightButton_actionAdapter(PrMetN adaptee) {
                this.adaptee = adaptee;
        }
        public void actionPerformed(ActionEvent e) {
                adaptee.rightButton_actionPerformed(e);
        }
}
class PrMetN_jButton1_actionAdapter implements java.awt.event.ActionListener {
        PrMetN adaptee;
        PrMetN_jButton1_actionAdapter(PrMetN adaptee) {
        this.adaptee = adaptee;
        }
        public void actionPerformed(ActionEvent e) {
        adaptee.jButton1_actionPerformed(e);
        }
///////////////////////////////

}

class PrMetN_jButton_graf_actionAdapter implements java.awt.event.ActionListener {
  PrMetN adaptee;

  PrMetN_jButton_graf_actionAdapter(PrMetN adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton_graf_actionPerformed(e);
  }
}
