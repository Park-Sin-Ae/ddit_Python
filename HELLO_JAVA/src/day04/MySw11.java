package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySw11 extends JFrame {

	private JPanel contentPane;
	private JTextField tf;
	String com = "123";
	JTextArea ta;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySw11 frame = new MySw11();
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
	public MySw11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 214, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl = new JLabel("야구게임");
		lbl.setBounds(12, 35, 57, 15);
		contentPane.add(lbl);
		
		tf = new JTextField();
		tf.setBounds(109, 32, 69, 21);
		contentPane.add(tf);
		tf.setColumns(10);
		
		JButton btn = new JButton("맞춰보기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
			}
		});
		btn.setBounds(12, 74, 166, 23);
		contentPane.add(btn);
		
		ta = new JTextArea();
		ta.setBounds(12, 107, 166, 187);
		contentPane.add(ta);
		ranCom();
	}
	
	void ranCom() {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		for(int i = 0; i < 100; i++) {
			int rnd = (int)(Math.random()*9);
			int a = arr[0];
			arr[0]=arr[rnd];
			arr[rnd] = a;
		}
		
		com = arr[0] + "" + arr[1] + "" + arr[2];
		System.out.println(com);
	}
	
	int getS(String com, String mine) {
		int ret = 0;
		String c1 = com.substring(0, 1);
		String c2 = com.substring(1, 2);
		String c3 = com.substring(2, 3);
		
		String m1 = mine.substring(0, 1);
		String m2 = mine.substring(1, 2);
		String m3 = mine.substring(2, 3);
		
		if(c1.equals(m1)) ret++;
		if(c2.equals(m2)) ret++;
		if(c3.equals(m3)) ret++;

		return ret;
	}
	
	int getB(String com, String mine) {
		int ret = 0;
		String c1 = com.substring(0, 1);
		String c2 = com.substring(1, 2);
		String c3 = com.substring(2, 3);
		
		String m1 = mine.substring(0, 1);
		String m2 = mine.substring(1, 2);
		String m3 = mine.substring(2, 3);
		
		if(c1.equals(m2) || c1.equals(m3)) ret++;
		if(c2.equals(m1) || c2.equals(m3)) ret++;
		if(c3.equals(m1) || c3.equals(m2)) ret++;

		return ret;
	}
	
	void myclick() {
		String mine = tf.getText();
		int s = getS(com, mine);
		int b = getB(com, mine);
		System.out.println("s : " + s + "b" + b); 
		
		String line = mine + "\t" + "s : " + s + "b:" + "\n";
		String str_old = ta.getText();
		
		ta.setText(str_old+line);
		tf.setText("");
		
		if(s==3) {
			JOptionPane.showMessageDialog(null, "축하합니다.\n" + mine);
		}
	}
}

