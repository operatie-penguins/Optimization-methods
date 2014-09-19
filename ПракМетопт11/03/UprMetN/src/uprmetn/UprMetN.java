package uprmetn;
/**
 * <p>Title: ����� ����������</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * <p>Company: </p>
 * @author sashka_drakon@mail.ru
 * @version 11.0
 */

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class UprMetN extends JApplet {

    Color ColorFon = new Color(247,247,255);//���� ����
  //������:
    Color ColorPanelFon = new Color(255,255,255);//���� ����
    Color ColorPanelRamka = new Color(157,187,255);//���� ����������
  //������:
    Color ColorBtnBackground = new Color(220,230,255);//���� ���� ������
    Color ColorBtnForeground = new Color(0,0,60);//���� ������� �� ������
    Font FontBtn= new java.awt.Font("Dialog", 1, 12);//����� ������� �� ������(����� ������==> � <==)
    Font FontBtnStr= new java.awt.Font("Dialog", 1, 14);//����� �� ������� ==> � <==
    Font FontStr=new java.awt.Font("SansSerif",0,14);//����� ��� "=>" � "<="
  //���������:
    Color ColorTitle = new Color(130,0,80);//����
    Font FontTitle= new java.awt.Font("Dialog", 1, 16);//�����
  //������� (����. "����������� �����������", "�������", "������" � �.�.):
    Color ColorSubTitle = new Color(180,0,60);//����
    Font FontSubTitle= new java.awt.Font("Dialog", 3, 12);//�����
  //���� "�������":
    Color ColorSolutionText = new Color(0,0,80);//���� ������
    Font FontSolutionText= new java.awt.Font("Dialog", 1, 14);//����� ������
        Container cp;
        DrawPanel_un drawPanel1 = new DrawPanel_un();
        JButton nextButton = new JButton();
        JButton refreshButton = new JButton();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel3 = new JLabel();
//	JComboBox variantBox = new JComboBox();
        JLabel jLabel6 = new JLabel();
        JButton zoomInButton = new JButton();
        JButton zoomOutButton = new JButton();
        JButton upButton = new JButton();
        JButton downButton = new JButton();
        JButton rightButton = new JButton();
        JButton leftButton = new JButton();
        JCheckBox resultBox = new JCheckBox();
        private int slozhnost = 0;

        //Initialize the applet
        public void init() {
                try {
                        String param = this.getParameter("slozhnost");
                        try {
                          slozhnost = Integer.parseInt(param);
                        } catch (Exception ex) { }
                        if (slozhnost < 1 || slozhnost > 3) slozhnost = 1;
                        drawPanel1.slozhnost = slozhnost;
                        Stringer_un.slozhnost = slozhnost;
                        jbInit();
                } catch (Exception e) {
                        e.printStackTrace();
                }
		//drawPanel1.setFunc(0);
        }

        //Component initialization
        private void jbInit() throws Exception {
                cp = this.getContentPane();
                cp.setLayout(null);
                cp.setBackground(ColorFon);
                this.setSize(new Dimension(593, 601));
//������
                drawPanel1.setBounds(new Rectangle(9, 26, 583, 574));
// ��������� ���
                nextButton.setBackground(ColorBtnBackground);
                nextButton.setBounds(new Rectangle(284, 541, 100, 23));
                nextButton.setFont(FontBtnStr);
                nextButton.setForeground(ColorBtnForeground);
                nextButton.setText("==>");
                nextButton.addActionListener(new UprMetN_nextButton_actionAdapter(this));
// ��������
                refreshButton.setText("��������");
                refreshButton.addActionListener(new UprMetN_refreshButton_actionAdapter(this));
                refreshButton.setForeground(ColorBtnForeground);
                refreshButton.setFont(FontBtn);
                refreshButton.setBounds(new Rectangle(151, 540, 100, 23));
                refreshButton.setBackground(ColorBtnBackground);
//�������
                jLabel1.setFont(FontTitle);
                jLabel1.setForeground(ColorTitle);
                jLabel1.setRequestFocusEnabled(true);
                 jLabel1.setToolTipText("");
                jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
                jLabel1.setHorizontalTextPosition(SwingConstants.CENTER);
                jLabel1.setText("����������");
                jLabel1.setBounds(0, 5, 545, 23);
// ������
// 55, -35
//+
                zoomInButton.setBackground(ColorBtnBackground);
                zoomInButton.setBounds(new Rectangle(369, 340, 20, 20));
                zoomInButton.setFont(FontStr);
                zoomInButton.setForeground(ColorBtnForeground);
                zoomInButton.setMargin(new Insets(0, 0, 0, 0));
                zoomInButton.setText("+");
                zoomInButton.addActionListener(new UprMetN_zoomInButton_actionAdapter(this));
//-
                zoomOutButton.addActionListener(new UprMetN_zoomOutButton_actionAdapter(this));
                zoomOutButton.setFont(FontStr);
                zoomOutButton.setText("-");
                zoomOutButton.setMargin(new Insets(0, 0, 0, 0));
                zoomOutButton.setForeground(ColorBtnForeground);
                zoomOutButton.setBounds(new Rectangle(392, 340, 20, 20));
                zoomOutButton.setBackground(ColorBtnBackground);
//�����
                upButton.addActionListener(new UprMetN_upButton_actionAdapter(this));
                upButton.setFont(FontStr);
                upButton.setText("\u2191");
                upButton.setMargin(new Insets(0, 0, 0, 0));
                upButton.setForeground(ColorBtnForeground);
                upButton.setBounds(new Rectangle(415, 340, 20, 20));
                upButton.setBackground(ColorBtnBackground);
//����
                downButton.addActionListener(new UprMetN_downButton_actionAdapter(this));
                downButton.setFont(FontStr);
                downButton.setText("\u2193");
                downButton.setMargin(new Insets(0, 0, 0, 0));
                downButton.setForeground(ColorBtnForeground);
                downButton.setBounds(new Rectangle(438, 340, 20, 20));
                downButton.setBackground(ColorBtnBackground);
//������
                rightButton.addActionListener(new UprMetN_rightButton_actionAdapter(this));
                rightButton.setFont(FontStr);
                rightButton.setText("\u2190");
                rightButton.setMargin(new Insets(0, 0, 0, 0));
                rightButton.setForeground(ColorBtnForeground);
                rightButton.setBounds(new Rectangle(461, 340, 20, 20));
                rightButton.setBackground(ColorBtnBackground);
//�����
                leftButton.addActionListener(new UprMetN_leftButton_actionAdapter(this));
                leftButton.setFont(FontStr);
                leftButton.setText("\u2192");
                leftButton.setMargin(new Insets(0, 0, 0, 0));
                leftButton.setForeground(ColorBtnForeground);
                leftButton.setBounds(new Rectangle(484, 340, 20, 20));
                leftButton.setBackground(ColorBtnBackground);
//

                resultBox.setBackground(ColorPanelFon);
                resultBox.setFont(FontSubTitle);
                resultBox.setForeground(ColorSubTitle);
                resultBox.setText("��� ���������");
                resultBox.setBounds(300, 480, 146, 23);
                resultBox.setVisible(false);
                resultBox.addActionListener(new UprMetN_resultBox_actionAdapter(this));
//
                cp.setBackground(ColorFon);
                drawPanel1.add(resultBox, null);
                drawPanel1.add(jLabel6, null);
    drawPanel1.add(zoomInButton, null);
    drawPanel1.add(leftButton, null);
    drawPanel1.add(rightButton, null);
    drawPanel1.add(downButton, null);
    drawPanel1.add(upButton, null);
    drawPanel1.add(zoomOutButton, null);
    drawPanel1.add(nextButton, null);
    drawPanel1.add(refreshButton, null);
                cp.add(jLabel1, null);
                cp.add(jLabel3, null);
                //cp.add(variantBox, null);
    cp.add(drawPanel1, null);
        }
        //Get Applet information
        public String getAppletInfo() {
                return "Applet Information";
        }
        //Get parameter info
        public String[][] getParameterInfo() {
                return null;
        }
        void nextButton_actionPerformed(ActionEvent e) {
                if (drawPanel1.nextStep == -1 )
                {
                  return;
                }

            /*   if (drawPanel1.step == 13 ||drawPanel1.step == 22 ||drawPanel1.step == 31 ||drawPanel1.step == 40||
                   drawPanel1.step == 49 ||drawPanel1.step == 58||drawPanel1.step == 67 ||drawPanel1.step == 76 ||
                    drawPanel1.step == 85 ||drawPanel1.step == 94||drawPanel1.step == 103 ||drawPanel1.step == 112||
                    drawPanel1.step == 121 ||drawPanel1.step == 130 ||drawPanel1.step == 139 ||drawPanel1.step == 148||
                    drawPanel1.step == 157 ||drawPanel1.step == 166||drawPanel1.step == 175 ||drawPanel1.step == 184 ||
                    drawPanel1.step == 193 ||drawPanel1.step == 202||drawPanel1.step == 211 ||drawPanel1.step == 220||
                    drawPanel1.step == 229 ||drawPanel1.step == 238 ||drawPanel1.step == 247 ||drawPanel1.step == 256||
                    drawPanel1.step == 265 ||drawPanel1.step == 274|| drawPanel1.step == 283 ||drawPanel1.step == 292 ||
                    drawPanel1.step == 301 ||drawPanel1.step == 310

                    ) {//&& drawPanel1.nextStep == 4
                  drawPanel1.k++;
                }*/
                drawPanel1.step = drawPanel1.nextStep;
                Stringer_un.init();
                drawPanel1.go();
                drawPanel1.repaint();
                if (drawPanel1.nextStep == -1)
                {
                  resultBox.setVisible(true);
                  resultBox.setSelected(true);
                  DrawPanel_un.showresult = resultBox.isSelected();
                  //return;
                 }
        }
        void refreshButton_actionPerformed(ActionEvent e) {
                Stringer_un.init();
                Stringer_un.canGo = true;
                resultBox.setVisible(false);
///////////////////////// begin ///////////////////////////////////
                drawPanel1.nextVariant();
//		drawPanel1.setFunc(variantBox.getSelectedIndex());
///////////////////////// end ///////////////////////////////////
                drawPanel1.repaint();
                drawPanel1.step = 0;
                drawPanel1.k = 0;
                drawPanel1.reset();
        }
//����������
        void zoomInButton_actionPerformed(ActionEvent e) {
                drawPanel1.setScale(drawPanel1.scale * 1.2);
                drawPanel1.repaint();
        }
//����������
        void zoomOutButton_actionPerformed(ActionEvent e) {
                drawPanel1.setScale(drawPanel1.scale / 1.2);
                drawPanel1.repaint();
        }
//����� �����
        void upButton_actionPerformed(ActionEvent e) {
                drawPanel1.moveCenter(0, -20);
                drawPanel1.repaint();
        }
//����� ����
        void downButton_actionPerformed(ActionEvent e) {
                drawPanel1.moveCenter(0, 20);
                drawPanel1.repaint();
        }
//����� �����
        void leftButton_actionPerformed(ActionEvent e) {
                drawPanel1.moveCenter(-20, 0);
                drawPanel1.repaint();
        }
//����� ������
        void rightButton_actionPerformed(ActionEvent e) {
                drawPanel1.moveCenter(20, 0);
                drawPanel1.repaint();
        }
        void resultBox_actionPerformed(ActionEvent e) {
                DrawPanel_un.showresult = resultBox.isSelected();
                drawPanel1.repaint();
        }
// ����� ��������
        void variantBox_actionPerformed(ActionEvent e) {
                Stringer_un.init();
//		drawPanel1.setFunc(variantBox.getSelectedIndex());
                drawPanel1.repaint();
        }

}

class UprMetN_nextButton_actionAdapter implements java.awt.event.
        ActionListener {
          UprMetN adaptee;
          UprMetN_nextButton_actionAdapter(UprMetN adaptee) {
                this.adaptee = adaptee;
          }
        public void actionPerformed(ActionEvent e) {
                adaptee.nextButton_actionPerformed(e);
        }
}
class UprMetN_refreshButton_actionAdapter implements java.awt.event.
        ActionListener {
        UprMetN adaptee;
        UprMetN_refreshButton_actionAdapter(UprMetN adaptee) {
                this.adaptee = adaptee;
        }
        public void actionPerformed(ActionEvent e) {
                adaptee.refreshButton_actionPerformed(e);
        }
}
class UprMetN_zoomInButton_actionAdapter implements java.awt.event.
        ActionListener {
        UprMetN adaptee;
        UprMetN_zoomInButton_actionAdapter(UprMetN adaptee) {
                this.adaptee = adaptee;
        }
        public void actionPerformed(ActionEvent e) {
                adaptee.zoomInButton_actionPerformed(e);
        }
}
class UprMetN_zoomOutButton_actionAdapter implements java.awt.event.
        ActionListener {
        UprMetN adaptee;
        UprMetN_zoomOutButton_actionAdapter(UprMetN adaptee) {
                this.adaptee = adaptee;
        }
        public void actionPerformed(ActionEvent e) {
                adaptee.zoomOutButton_actionPerformed(e);
        }
}
class UprMetN_upButton_actionAdapter implements java.awt.event.
        ActionListener {
        UprMetN adaptee;
        UprMetN_upButton_actionAdapter(UprMetN adaptee) {
                this.adaptee = adaptee;
        }
        public void actionPerformed(ActionEvent e) {
                adaptee.upButton_actionPerformed(e);
        }
}
class UprMetN_downButton_actionAdapter implements java.awt.event.
        ActionListener {
        UprMetN adaptee;
        UprMetN_downButton_actionAdapter(UprMetN adaptee) {
                this.adaptee = adaptee;
        }
        public void actionPerformed(ActionEvent e) {
                adaptee.downButton_actionPerformed(e);
        }
}
class UprMetN_leftButton_actionAdapter implements java.awt.event.
        ActionListener {
        UprMetN adaptee;
        UprMetN_leftButton_actionAdapter(UprMetN adaptee) {
                this.adaptee = adaptee;
        }
        public void actionPerformed(ActionEvent e) {
                adaptee.leftButton_actionPerformed(e);
        }
}
class UprMetN_rightButton_actionAdapter implements java.awt.event.
        ActionListener {
        UprMetN adaptee;
        UprMetN_rightButton_actionAdapter(UprMetN adaptee) {
                this.adaptee = adaptee;
        }
        public void actionPerformed(ActionEvent e) {
                adaptee.rightButton_actionPerformed(e);
        }
}
class UprMetN_resultBox_actionAdapter implements java.awt.event.ActionListener {
  UprMetN adaptee;
  UprMetN_resultBox_actionAdapter(UprMetN adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.resultBox_actionPerformed(e);
  }
}
class UprMetN_variantBox_actionAdapter implements java.awt.event.ActionListener {
        UprMetN adaptee;
        UprMetN_variantBox_actionAdapter(UprMetN adaptee) {
        this.adaptee = adaptee;
        }
        public void actionPerformed(ActionEvent e) {
        adaptee.variantBox_actionPerformed(e);
        }
}
