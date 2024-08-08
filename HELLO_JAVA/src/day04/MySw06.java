package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySw06 extends JFrame {

	private JPanel contentPane;
	private JTextField tf;

	JTextArea ta;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySw06 frame = new MySw06();
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
	public MySw06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 284, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl = new JLabel("출력단수");
		lbl.setBounds(42, 25, 57, 15);
		contentPane.add(lbl);
		
		tf = new JTextField();
		tf.setBounds(110, 22, 116, 21);
		contentPane.add(tf);
		tf.setColumns(10);
		
		JButton btn = new JButton("출력하기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myGGuGGU();
			}
		});
		btn.setBounds(42, 61, 184, 23);
		contentPane.add(btn);
		
		ta = new JTextArea();
		ta.setBounds(42, 94, 184, 143);
		contentPane.add(ta);
	}
	
	void myGGuGGU() {
		
		String dan = tf.getText();
		int idan = Integer.parseInt(dan);
		
		int res = 0;
		String str = "";
		for(int i = 1; i <= 9; i++) {
			res = idan * i;
			str += idan + "x" + i + "=" + res + "\n";
		}
		ta.setText(str);
	}
}
