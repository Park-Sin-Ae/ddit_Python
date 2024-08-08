package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySw09 extends JFrame {

	private JPanel contentPane;
	private JTextField tf;
	private JTextArea ta;
	int com = -1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySw09 frame = new MySw09();
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
	public MySw09() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 195, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl = new JLabel("맞출 수 :");
		lbl.setBounds(12, 20, 57, 15);
		contentPane.add(lbl);
		
		JButton btn = new JButton("숫자맞춰보기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
			}
		});
		btn.setBounds(12, 79, 155, 23);
		contentPane.add(btn);
		
		ta = new JTextArea();
		ta.setBounds(12, 112, 155, 121);
		contentPane.add(ta);
		
		tf = new JTextField();
		tf.setBounds(81, 17, 86, 21);
		contentPane.add(tf);
		tf.setColumns(10);
		
		ranCom();
	}
	void ranCom() {
		com = (int)(Math.random()*99)+1;
		System.out.println("com : " + com);
	}
	
	void myclick() {
		String mine = tf.getText();
		int imine = Integer.parseInt(mine);
		
		String line = "";
		
		if(com < imine) {
			line = mine + "\t" + "DOWN" + "\n";
		} else if (com > imine) {
			line = mine + "\t" + "UP" + "\n";
		} else {
			line = mine + "\t" + "정답" + "\n";
			JOptionPane.showMessageDialog(null, line);
		}
		
		String str_old = ta.getText();
		
		ta.setText(str_old + line);
		tf.setText("");
		
	}
	
}
