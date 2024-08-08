package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySw03 extends JFrame {

	private JPanel contentPane;
	private JTextField tf02;
	private JTextField tf01;
	private JTextField tf03;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySw03 frame = new MySw03();
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
	public MySw03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		tf01 = new JTextField();
		tf01.setColumns(10);
		contentPane.add(tf01);
		
		JLabel lblNewLabel = new JLabel("x");
		contentPane.add(lblNewLabel);
		
		tf02 = new JTextField();
		contentPane.add(tf02);
		tf02.setColumns(10);
		
		JButton btn = new JButton("=");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
			}
		});
		contentPane.add(btn);
		
		tf03 = new JTextField();
		tf03.setColumns(10);
		contentPane.add(tf03);
	}
	
	void myclick() {
//		String a = tf01.getText();
//		int aa = Integer.parseInt(a);
//		String b = tf02.getText();
//		int bb = Integer.parseInt(b);
//		int cc = aa * bb;
//		String c = Integer.toString(cc); 
//		
//		
//		tf03.setText(c);
		
		// 선생님 풀이
		String a = tf01.getText();
		String b = tf01.getText();
		int aa = Integer.parseInt(a);
		int bb = Integer.parseInt(b);
		
		int mul = aa * bb;
		
		tf03.setText(String.valueOf(mul));
		
	
	}

}
