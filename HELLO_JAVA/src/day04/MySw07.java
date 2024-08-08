package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySw07 extends JFrame {

	private JPanel contentPane;
	private JTextField tf_mine;
	private JTextField tf_com;
	private JTextField tf_result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySw07 frame = new MySw07();
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
	public MySw07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 216, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_mine = new JLabel("나 :");
		lbl_mine.setBounds(12, 22, 57, 15);
		contentPane.add(lbl_mine);
		
		JLabel lbl_com = new JLabel("컴 :");
		lbl_com.setBounds(12, 61, 57, 15);
		contentPane.add(lbl_com);
		
		JLabel lbl_result = new JLabel("결과 :");
		lbl_result.setBounds(12, 102, 57, 15);
		contentPane.add(lbl_result);
		
		tf_mine = new JTextField();
		tf_mine.setBounds(72, 19, 116, 21);
		contentPane.add(tf_mine);
		tf_mine.setColumns(10);
		
		tf_com = new JTextField();
		tf_com.setColumns(10);
		tf_com.setBounds(72, 58, 116, 21);
		contentPane.add(tf_com);
		
		tf_result = new JTextField();
		tf_result.setColumns(10);
		tf_result.setBounds(72, 99, 116, 21);
		contentPane.add(tf_result);
		
		JButton btn = new JButton("게임하기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
			}
		});
		btn.setBounds(12, 148, 176, 35);
		contentPane.add(btn);
	}
	
	void myclick() {
		String com = tf_com.getText();
		String mine = tf_mine.getText();
		String result = "";
		
		double rnd = Math.random();
		
		if(rnd > 0.5) {
			com = "홀";
		} else {
			com = "짝";
		}
		tf_com.setText(com);
		if(com.equals(mine)) {
			result = "이김";
		} else {
			result = "짐";
		}
		String str = "";
		str += "나 : " + mine + "\n" +"컴 : " + com + "\n" + "결과 : " + result;
		tf_result.setText(result);
		System.out.println(str);
	}

}
