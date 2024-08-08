package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class MySw05 extends JFrame {

	private JPanel contentPane;
	JLabel lbl01, lbl02, lbl03, lbl04, lbl05, lbl06;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySw05 frame = new MySw05();
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
	public MySw05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl01 = new JLabel("__");
		lbl01.setBounds(27, 23, 19, 15);
		contentPane.add(lbl01);
		
		lbl02 = new JLabel("__");
		lbl02.setBounds(100, 23, 19, 15);
		contentPane.add(lbl02);
		
		lbl03 = new JLabel("__");
		lbl03.setBounds(173, 23, 19, 15);
		contentPane.add(lbl03);
		
		lbl04 = new JLabel("__");
		lbl04.setBounds(246, 23, 19, 15);
		contentPane.add(lbl04);
		
		lbl05 = new JLabel("__");
		lbl05.setBounds(319, 23, 19, 15);
		contentPane.add(lbl05);
		
		lbl06 = new JLabel("__");
		lbl06.setBounds(392, 23, 19, 15);
		contentPane.add(lbl06);
		
		JButton btn = new JButton("로또생성하기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
			}
		});
		btn.setBounds(39, 80, 356, 23);
		contentPane.add(btn);
	}
	
	void myclick() {
		int[] arr = new int[45];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] += i + 1;
		}
		
		for(int i = 0; i < 1000; i++) {
			int rnd = (int)(Math.random() * 45);
			int a = arr[0];
			arr[0] = arr[rnd];
			arr[rnd] = a;
		}
		lbl01.setText(arr[0]+"");
		lbl02.setText(arr[1]+"");
		lbl03.setText(arr[2]+"");
		lbl04.setText(arr[3]+"");
		lbl05.setText(arr[4]+"");
		lbl06.setText(arr[5]+"");
	}
}
