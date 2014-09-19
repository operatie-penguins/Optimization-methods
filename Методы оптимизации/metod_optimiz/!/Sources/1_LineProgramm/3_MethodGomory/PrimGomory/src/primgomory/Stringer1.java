package primgomory;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.font.*;
import javax.swing.*;
import java.util.*;

public class Stringer1 {
	public static int[] mist_calc = new int [20];
	static Color tempColor;
	public static int[] mist_under = new int [20];
	static int lastErrorStep = -1;
	static int xStart = 0;
	static Graphics2D g2d;
//	static String[] atext1 = new String[5];
	//static String[] atext2 = new String[5];
	//static String[] atext3 = new String[5];
	static String atext1, atext2, atext3="";
	static String fieldText1 = "";
	static String fieldText2 = "";
	static int ai;
	static int xAnswer, yAnswer;
	public static boolean canGo = true;
//    static boolean writeEnabled;
	static Font[] fonts = {
		new Font("SansSerif", 1, 14), // основной текст
		new Font("SansSerif", 3, 11), // глваный индекс
		new Font("SansSerif", 1, 8) // мелкие индексы
	};
	static FontRenderContext[] frcs = new FontRenderContext[3];
	static Font reservedFont = fonts[0];
	static Font commentFont = new Font("SansSerif", 3, 12);
	static Color reservedColor;
	static Color commentColor = new Color(0,0,128);

	public static double fieldValues[] = new double[10];
	public static int choiceValue = 0; // 0 - nothing, 1 - first, 2 - second, ...

	static JPanel panel = null;
	static JTextField[] fields = new JTextField[10];
	static JRadioButton[] buttons = new JRadioButton[10];
	static ButtonGroup buttonGroup = new ButtonGroup();
	static OwnListener ownListener1 = new OwnListener();

	public static int userAnswer = 0;
	static boolean cbAdded = false;
	static JButton checkButton = new JButton("ѕроверить");

	static {
	  checkButton.addActionListener(ownListener1);
	  checkButton.setFont(new Font("SansSerif", 1, 12));
	  checkButton.setBackground(new Color(230, 230, 255));
	  checkButton.setForeground(new Color(0, 0, 60));

	}


	public static void setFontSizes(int a, int b, int c) {
		fonts[0] = new Font("SansSerif", 1, a);
		fonts[1] = new Font("SansSerif", 1, b);
		fonts[2] = new Font("SansSerif", 1, c);
		reservedFont = fonts[0];
	}

	public static void init() {
		lastErrorStep = -1;
		fieldText1 = "";
		fieldText2 = "";
	}

	public static void setGraphics(Graphics g) {
if(fields[0] != null && fields[1] != null) {
			fieldText1 = fields[0].getText();
			fieldText2 = fields[1].getText();
		}
		g2d = (Graphics2D) g;
		if(cbAdded) {
		  panel.remove(checkButton);
		  cbAdded = false;
		}

		for (int i = 0; i < 3; ++i) {
			g2d.setFont(fonts[i]);
			frcs[i] = g2d.getFontRenderContext();
		}
		for (int i = 0; i < 10; ++i) {
			if (fields[i] == null) {
				continue;
			}
			panel.remove(fields[i]);
			fields[i] = null;
		}
		for (int i = 0; i < 10; ++i) {
			if (buttons[i] == null) {
				continue;
			}
			panel.remove(buttons[i]);
			buttonGroup.remove(buttons[i]);
			buttons[i] = null;
		}
	}

	public static void setPanel(JPanel p) {
		panel = p;
	}

	public static int drawString(String s, int x, int y) {
		//userAnswer = 0;
//		ai = 1;
//        writeEnabled = false;
		xStart = x;
		return drawSubstring(s+"n{}", x, y, 0);
	}
/*
	public static void drawString(String s, int x, int y, boolean isCorrect) {
		//userAnswer = isCorrect ? 1 : -1;
		xStart = x;
		drawSubstring(s, x, y, 0);
	}
*/
	public static boolean tryUpdate() {

		for (int i = 0; i < 10; ++i) {
			if (fields[i] == null) {
				continue;
			}
			try {
				fieldValues[i] = Double.parseDouble(fields[i].getText());
			}
			catch (NumberFormatException e) {
				return false;
			}
		}

		for (int i = 0; i < 10; ++i) {
			if (buttons[i] == null) {
				continue;
			}
			if (buttons[i].isSelected()) {
				choiceValue = i + 1;
			}
		}

		for (int i = 0; i < 10; ++i) {
			if (fields[i] == null) {
				continue;
			}
			panel.remove(fields[i]);
			fields[i] = null;
		}
		for (int i = 0; i < 10; ++i) {
			if (buttons[i] == null) {
				continue;
			}
			panel.remove(buttons[i]);
			buttonGroup.remove(buttons[i]);
			buttons[i] = null;
		}
		if(cbAdded) {
		  panel.remove(checkButton);
		  cbAdded = false;
		}

		return true;
	}

	public static boolean update() {
		for (int i = 0; i < 10; ++i) {
			if (fields[i] == null) {
				continue;
			}
			panel.remove(fields[i]);
			fields[i] = null;
		}
		for (int i = 0; i < 10; ++i) {
			if (buttons[i] == null) {
				continue;
			}
			panel.remove(buttons[i]);
			buttonGroup.remove(buttons[i]);
			buttons[i] = null;
		}
		if(cbAdded) {
		  panel.remove(checkButton);
		  cbAdded = false;
		}

		return true;
	}



	private static int drawSubstring(String s, int x, int y, int sy) {
//		System.out.println(s);
		String text, text1, text2, text3, text4;
		char sym;
		int i, dy, iEnd, index = 0, fieldIndex = 0;
		Rectangle2D r, rr;
		int fontIndex = 0;
		boolean[] adj =  {true, true, true, true, true};
		boolean first = true;

		if (sy == 1 || sy == -1) {
			fontIndex = 1;
		}
		else if (sy != 0) {
			fontIndex = 2;
		}
		//boolean needLower = false;
/*
		if ((s.indexOf("#", index) != -1 && s.indexOf("#", index) < s.indexOf("n{}")) || s.indexOf("%") != -1) {
			r = fonts[fontIndex].getStringBounds(s, frcs[fontIndex]);
			// следующа€ строчка отвечает за отступ по y
			y += r.getHeight() / 2 + 2;
		}
*/
		while (true) {
			if ((s.indexOf("#", index) != -1 && s.indexOf("#", index) < s.indexOf("n{}", index)) ||
				 (s.indexOf("%", index) != -1 && s.indexOf("%", index) < s.indexOf("n{}", index)) ||
				 (s.indexOf("/{", index) != -1 && s.indexOf("/{", index) < s.indexOf("n{}", index))) {
				r = fonts[fontIndex].getStringBounds(s, frcs[fontIndex]);
				// следующа€ строчка отвечает за отступ по y
				if (!adj[sy]) {
					y += r.getHeight() / 2 + 2;
					adj[sy] = true;
				}

			}

			i = s.indexOf("{", index);
			if (i == -1) {
				i = s.length() + 1;
			}
			if (index > i - 1) {
				return x;
			}
			text = s.substring(index, i - 1);
			g2d.setFont(fonts[fontIndex]);
			r = fonts[fontIndex].getStringBounds(text, frcs[fontIndex]);
			g2d.drawString(text, x, y);
			x += r.getWidth();
			if (i == s.length() + 1) {
				return x;
			}
			sym = s.charAt(i - 1);//System.out.println(sym);
			iEnd = getEnd(s, i + 1); //s.indexOf("}", i);
			index = iEnd + 1;
			if (sym == 'n') {
				y += r.getHeight() + 3;
				x = xStart;
				if(adj[sy]&& !first) y += r.getHeight();
				first = false;
				adj[sy] = false;
			}
			else if (sym == 'c') {
				text1 = s.substring(i + 1, iEnd);
				reservedFont = fonts[fontIndex];
				fonts[fontIndex] = commentFont;
				g2d.setFont(commentFont);
				reservedColor = g2d.getColor();
				g2d.setColor(commentColor);
				x = drawSubstring(text1, x, y, sy);

				fonts[fontIndex] = reservedFont;
				g2d.setFont(reservedFont);
				//reservedColor = g2d.getColor();
				g2d.setColor(reservedColor);

			}
			else if (sym == 'r') {
				text1 = s.substring(i + 1, iEnd);
				tempColor = g2d.getColor();
				g2d.setColor(Color.red);
//				x = drawSubstring(text1, x, y, sy);
//				g2d.setColor(tempColor);

			}
			else if (sym == 'e') {
	//            text1 = s.substring(i + 1, iEnd);
  //              tempColor = g2d.getColor();
//                g2d.setColor(Color.red);
//				x = drawSubstring(text1, x, y, sy);
				g2d.setColor(tempColor);

			}

/*
			else if (sym == 'e') {
				fonts[fontIndex] = reservedFont;
				g2d.setFont(reservedFont);
				//reservedColor = g2d.getColor();
				g2d.setColor(reservedColor);
			}
*/
			else if (sym == '_') {
				text1 = s.substring(i + 1, iEnd);
				dy = 5;
				x = drawSubstring(text1, x, y + dy, sy + 1);
			}
			else if (sym == '^') {
				text1 = s.substring(i + 1, iEnd);
				dy = -5;
				x = drawSubstring(text1, x, y + dy, sy + 1);
			}
			else if(sym == '/') {
				text1 = s.substring(i + 1, iEnd);
				i = iEnd + 2; //{f}{g}
				iEnd = getEnd(s, i);
				index = iEnd + 1;
				text2 = s.substring(i, iEnd);
				dy = 5;
				int xx1 = drawSubstring(text1, x, y, sy);
				int xTemp = x;
				x = drawSubstring(text2, x, y + (int) r.getHeight() / 2 + 2, sy);
				if (xx1 > x) {
					x = xx1;
				}
				g2d.drawLine(x, y+1 , xTemp-2, y+1); g2d.drawLine(x, y+2 , xTemp-2, y+2);

			}


			else if (sym == '&') {
				text1 = s.substring(i + 1, iEnd);
				i = iEnd + 2; //{f}{g}
				iEnd = getEnd(s, i);
				index = iEnd + 1;
				text2 = s.substring(i, iEnd);
				dy = 5;
				int x1 = drawSubstring(text1, x, y + dy, sy + 1);
				x = drawSubstring(text2, x, y - dy, sy + 1);
				if (x1 > x) {
					x = x1;
				}
			}
			else if (sym == '#') {
				text1 = s.substring(i + 1, iEnd);
				i = iEnd + 2; //{f}{g}
				iEnd = getEnd(s, i);
				index = iEnd + 1;
				text2 = s.substring(i, iEnd);

				int ys1 = y - (int) r.getHeight() / 2 - (int) r.getHeight();
				int ys2 = y - (int) r.getHeight() / 2 + (int) r.getHeight() + 3;

				QuadCurve2D.Double sh = new QuadCurve2D.Double(x, ys1, x - 4,
					(ys1 + ys2) / 2, x, ys2);
				g2d.draw(sh);

				int x1 = drawSubstring(text1, x + 5,
									   y - (int) r.getHeight() / 2 - 2, sy);
				x = drawSubstring(text2, x + 5, y + (int) r.getHeight() / 2 + 2,
								  sy);
				if (x1 > x) {
					x = x1;
				}
				x += 4;

				if (s.charAt(index) == '{') {
					i = iEnd + 2; //{f}{g}{h}{j}
					iEnd = getEnd(s, i);
					index = iEnd + 1;
					text3 = s.substring(i, iEnd);

					i = iEnd + 2; //{f}{g}{h}{j}
					iEnd = getEnd(s, i);
					index = iEnd + 1;
					text4 = s.substring(i, iEnd);

					x1 = drawSubstring(text3, x + 5,
									   y - (int) r.getHeight() / 2 - 2, sy);
					x = drawSubstring(text4, x + 5,
									  y + (int) r.getHeight() / 2 + 2, sy);
					if (x1 > x) {
						x = x1;
					}
				}

				sh = new QuadCurve2D.Double(x, ys1, x + 5, (ys1 + ys2) / 2, x,
											ys2);
				g2d.draw(sh);
				x += 6;

			}
			else if (sym == '?') {
				text1 = s.substring(i + 1, iEnd);
				fieldIndex = Integer.parseInt(text1);
				JTextField f = new JTextField();
				fields[fieldIndex] = f;
				f.setBounds(x, y - (int) r.getHeight() + 1+50, 60,
							(int) r.getHeight() + 3);
				f.setFont(fonts[fontIndex]);
				f.setText(fieldIndex == 0? fieldText1 : fieldText2);
				f.setForeground(g2d.getColor());
								f.setBackground(Color.white);
			//	f.addActionListener(ownListener1);
			//	f.addFocusListener(ownListener1);
				panel.add(f);

				x += 62;
				if(fieldIndex == 1) {
//				  checkButton.setBounds(x+15, y - (int) r.getHeight()+40, 100, 23);
				  checkButton.setBounds(397-20, 436-20, 100, 23);
				  checkButton.setEnabled(true);
				  panel.add(checkButton);

				}
				cbAdded = true;

			}
			else if (sym == '%') {
				//index--;
				fieldIndex = 0; //Integer.parseInt(text1);

				text2 = s.substring(i + 1, iEnd);
//System.out.println(text2);
				JRadioButton b = new JRadioButton(text2);
				buttons[fieldIndex] = b;
				fieldIndex++;
				b.setFont(fonts[fontIndex]);
				b.setForeground(g2d.getColor());
								b.setBackground(Color.white);
				b.addActionListener(ownListener1);
				//b.setLocation(x, y - (int)r.getHeight()+1);
				//b.setBounds(x, y - (int)r.getHeight()+1,50,50);
				rr = fonts[fontIndex].getStringBounds(text2, frcs[fontIndex]);
				b.setBounds(x, y - (int) r.getHeight() * 3 / 2 + 1+50,
							(int) rr.getWidth() + 25, (int) r.getHeight() + 4);
				panel.add(b);
				buttonGroup.add(b);
				int xx = x + b.getWidth() + 2;

//				while (s.charAt(index) == '{') {
				i = iEnd + 2; //{f}{g}{h}{j}
				iEnd = getEnd(s, i);
				index = iEnd + 1;
				text2 = s.substring(i, iEnd);

				b = new JRadioButton(text2);
				buttons[fieldIndex] = b;
				fieldIndex++;
				b.setFont(fonts[fontIndex]);
				b.setForeground(g2d.getColor());
				b.setBackground(Color.white);
				b.addActionListener(ownListener1);
				rr = fonts[fontIndex].getStringBounds(text2, frcs[fontIndex]);
				b.setBounds(x, y + 5 - (int) rr.getHeight() / 2+50,
							(int) rr.getWidth() + 25, (int) r.getHeight() + 4);
				panel.add(b);
				buttonGroup.add(b);
				x += b.getWidth() + 2;
				if (xx > x) {
					x = xx;
					//			}
				}
			}
			else if (sym == '!') {
				canGo = false;
				atext1 = s.substring(i + 1, iEnd);
				i = iEnd + 2; //{f}{g}
				iEnd = getEnd(s, i);
				index = iEnd + 1;
				atext2 = s.substring(i, iEnd);
				if (atext1.trim().toLowerCase().equals("field")) {
					i = iEnd + 2; //{f}{g}
					iEnd = getEnd(s, i);
					index = iEnd + 1;
					//atext3 = atext2;
					atext3 = s.substring(i, iEnd);
				}
				xAnswer = x;
				yAnswer = y;
				ai++;
				//System.out.println(ai);
			}
		}
	}

	private static int getEnd(String s, int from) {
		int balance = 1;
		while (true) {
			if (s.charAt(from) == '{') {
				balance++;
			}
			else if (s.charAt(from) == '}') {
				balance--;
			}
			if (balance == 0) {
				break;
			}
			from++;
		}
		return from;

	}
public static int numCalcMist = 0;
public static int numCalcChoice = 0;
	public static void infoEntered(AWTEvent e) {

		Component c = (Component) e.getSource();
		if (c == buttons[0] || c == buttons[1]) {
	//		buttons[0].setEnabled(false);
	///		buttons[1].setEnabled(false);
		}
		else {
//			c.setEnabled(false);

		}

		//for (int i = 0; i < ai; ++i) {
			//userAnswer = 0;
			atext2 = atext2.replace(',', '.');
			atext3 = atext3.replace(',', '.');
			if (atext1.trim().toLowerCase().equals("field")) {
				//int fi1 = Integer.parseInt(atext3);
				//int fi2 = Integer.parseInt(atext3);
				//System.out.println(atext2 + "  / " + fieldValues[fi]);
				if (fields[0].getText().trim() == "" || fields[1].getText().trim() == "") return;
				//fields[0].setEnabled(false);
				//fields[1].setEnabled(false);

				double d1, d2;
				try {
					d1 = Double.parseDouble(fields[0].getText());
					d2 = Double.parseDouble(fields[1].getText());
				}
				catch (NumberFormatException ex) {
					d1 = d2 = Double.NaN;
					//fields[0].setEnabled(true);
					//fields[1].setEnabled(true);
					userAnswer = 0;
					return;
				}
				if (fields[0].getText() == "" || fields[1].getText() == "") {
					userAnswer = 0;
				}
				else {
					userAnswer = (d1 == Double.parseDouble(atext2) && d2 == Double.parseDouble(atext3)) ? 1 : -1;
				/*	if(userAnswer < 0 && lastErrorStep != DrawPanel.step) {
						mist_calc[DrawPanel.step]++;
						lastErrorStep = DrawPanel.step;
						numCalcMist ++;
					}*/

				}
			}
			else {
				if (!buttons[0].isSelected() && !buttons[1].isSelected()) {
					userAnswer = 0;return;
				}
				else if ( (atext2.equals("1") && buttons[0].isSelected()) ||
						 (atext2.equals("2") && buttons[1].isSelected())) {
					userAnswer = 1;
				}
				else {
					userAnswer = -1;
				}
			/*	if(userAnswer < 0 && lastErrorStep != DrawPanel.step) {
					mist_under[DrawPanel.step]++;

					lastErrorStep = DrawPanel.step;
					numCalcChoice++;
				}*/

			}
			//if (userAnswer == 0) return;
			//System.out.println("!");
		//}
		g2d = (Graphics2D) panel.getGraphics(); // халтура!
		g2d.setFont(fonts[0]);
		if (userAnswer > 0) {
			g2d.setColor(Color.white);
			g2d.drawString("\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588", xAnswer, yAnswer+50);
			g2d.setColor(Color.blue);
		//	Font f = g2d.getFont();
		//	g2d.setFont(new Font("SansSerif", 3, 14));
			g2d.drawString("ѕравильно!", xAnswer, yAnswer+50);
		//	g2d.setFont(f);
		}
		else if (userAnswer < 0) {
			g2d.setColor(Color.white);
			g2d.drawString("\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588", xAnswer, yAnswer+50);
						g2d.setColor(Color.red);
			g2d.drawString("Ќеправильно.", xAnswer, yAnswer+50);
			// подсчитывание ошибок
//			mist_calc[DrawPanel.step]++;
		}
		if(userAnswer>0) {
			if (atext1.trim().toLowerCase().equals("field")) {
				fields[0].setEnabled(false);
				fields[1].setEnabled(false);
				checkButton.setEnabled(false);

			}
			else  {
				buttons[0].setEnabled(false);
				buttons[1].setEnabled(false);

			}

			canGo = true;
			lastErrorStep = -1;
		}
	}
}

class OwnListener1 extends FocusAdapter implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		Stringer1.infoEntered(e);

	}

	public void focusLost(FocusEvent e) {
		Stringer1.infoEntered(e);
	}

}
