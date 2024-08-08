package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySw08 extends JFrame {

	private JPanel contentPane;
	private JTextField tf;
	JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySw08 frame = new MySw08();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MySw08() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 209, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tf = new JTextField();
		tf.setHorizontalAlignment(SwingConstants.RIGHT);
		tf.setBounds(12, 20, 168, 21);
		contentPane.add(tf);
		tf.setColumns(10);
		
		btn1 = new JButton("1");
		
		btn1.setBounds(12, 51, 47, 23);
		contentPane.add(btn1);
		
		btn2 = new JButton("2");
		btn2.setBounds(68, 52, 47, 23);
		contentPane.add(btn2);
		
		btn3 = new JButton("3");
		btn3.setBounds(129, 51, 49, 23);
		contentPane.add(btn3);
		
		btn4 = new JButton("4");
		btn4.setBounds(12, 93, 47, 23);
		contentPane.add(btn4);
		
		btn5 = new JButton("5");
		btn5.setBounds(71, 95, 47, 23);
		contentPane.add(btn5);
		
		btn6 = new JButton("6");
		btn6.setBounds(129, 93, 49, 23);
		contentPane.add(btn6);
		
		btn7 = new JButton("7");
		btn7.setBounds(12, 134, 47, 23);
		contentPane.add(btn7);
		
		btn8 = new JButton("8");
		btn8.setBounds(71, 135, 47, 23);
		contentPane.add(btn8);
		
		btn9 = new JButton("9");
		btn9.setBounds(129, 134, 49, 23);
		contentPane.add(btn9);
		
		btn0 = new JButton("0");
		btn0.setBounds(12, 170, 47, 23);
		contentPane.add(btn0);
		
		JButton btn_call = new JButton("☎");
		btn_call.setBounds(71, 170, 106, 23);
		contentPane.add(btn_call);
		
		btn1.addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent e) {	myclick(e);	}});
		btn2.addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent e) {	myclick(e);	}});
		btn3.addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent e) {	myclick(e);	}});
		btn4.addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent e) {	myclick(e);	}});
		btn5.addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent e) {	myclick(e);	}});
		btn6.addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent e) {	myclick(e);	}});
		btn7.addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent e) {	myclick(e);	}});
		btn8.addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent e) {	myclick(e);	}});
		btn9.addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent e) {	myclick(e);	}});
		btn0.addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent e) {	myclick(e);	}});
		btn_call.addMouseListener(new  MouseAdapter() { public void mouseClicked(MouseEvent e) { mycall(); } });
	}
	
	void mycall() {
		String str_tel = tf.getText();
		JOptionPane.showMessageDialog(null, "calling\n" + str_tel);
	}
	
	void myclick(MouseEvent e) {
		JButton b = (JButton) e.getSource();
		String str_new = b.getText();
		String str_old = tf.getText();
		
		tf.setText(str_old + str_new);
//		System.out.println("str_new:str_new" + str_new);
		
	}

}
;