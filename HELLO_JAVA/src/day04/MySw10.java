package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySw10 extends JFrame {

	private JPanel contentPane;
	private JTextField tf_first;
	private JTextField tf_last;
	private JLabel lbl_first, lbl_last;
	private JTextArea ta;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySw10 frame = new MySw10();
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
	public MySw10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 245, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl_first = new JLabel("시작별수 :");
		lbl_first.setBounds(12, 10, 57, 15);
		contentPane.add(lbl_first);
		
		tf_first = new JTextField();
		tf_first.setBounds(89, 7, 116, 21);
		contentPane.add(tf_first);
		tf_first.setColumns(10);
		
		lbl_last = new JLabel("끝 별수 :");
		lbl_last.setBounds(12, 60, 57, 15);
		contentPane.add(lbl_last);
		
		tf_last = new JTextField();
		tf_last.setColumns(10); 
		tf_last.setBounds(89, 57, 116, 21);
		contentPane.add(tf_last);
		
		JButton btn = new JButton("별 출력하기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
			}
		});
		btn.setBounds(12, 105, 193, 23);
		contentPane.add(btn);
		
		ta = new JTextArea();
		ta.setBounds(12, 138, 193, 290);
		contentPane.add(ta);
	}
	
//	void myclick() {
//		String str = tf_first.getText();
//		String end = tf_last.getText();
//		
//		
//		int stri = Integer.parseInt(str);		
//		int endi = Integer.parseInt(end);
//		
//		for(int i = stri; i <= endi; i++) {
//			for(int j = 0; j < i; j++) {
//				ta.append("★");
//			}
//			ta.append("\n");
//		}
//	}
	
	String star(int cnt) {
		String ret = "";
		for(int i = 0; i < cnt; i++) {
			ret += "★";
		}
		ret += "\n";
		
		return ret;
	}
	
	void myclick() {
		String f = tf_first.getText();
		String l = tf_last.getText();
		
		int ff = Integer.parseInt(f);
		int ll = Integer.parseInt(l);
		
		String txt = "";
		
		for(int i = ff; i <= ll; i++) {
			txt += star(i);
		}
		
		ta.setText(txt);
	}

}
