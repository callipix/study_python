package day03;

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

public class MySwing06 extends JFrame {

	private JPanel contentPane;
	private JTextField tf_first;
	private JTextField tf_last;
	JTextArea ta;
	String star ="";
	String star2 ="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing06 frame = new MySwing06();
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
	public MySwing06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 273, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_first = new JLabel("첫별수");
		lbl_first.setBounds(29, 23, 57, 15);
		contentPane.add(lbl_first);
		
		JLabel lbl_last = new JLabel("끝별수");
		lbl_last.setBounds(29, 70, 57, 15);
		contentPane.add(lbl_last);
		
		tf_first = new JTextField();
		tf_first.addMouseListener(new MouseAdapter() {
		
		});
		tf_first.setBounds(98, 20, 116, 21);
		contentPane.add(tf_first);
		tf_first.setColumns(10);
		
		tf_last = new JTextField();
		tf_last.setColumns(10);
		tf_last.setBounds(98, 67, 116, 21);
		contentPane.add(tf_last);
		
		JButton btn = new JButton("별그리기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
			}
		});
		btn.setBounds(29, 115, 185, 21);
		contentPane.add(btn);
		
		ta = new JTextArea();
		ta.setBounds(29, 156, 185, 179);
		contentPane.add(ta);
	}
	void myclick() {
		String first = tf_first.getText();
		String last = tf_last.getText();
		int firstN = Integer.parseInt(first);
		int lastN = Integer.parseInt(last);
		printStar(firstN);
		printStar2(lastN);
		String result = star+"\n"+star2;
		ta.setText(result);
		
	}
	void printStar(int num) {
		for(int i = 1; i<=num ; i++) {
			star += "*";
		}
	}
	void printStar2(int num) {
		for(int i = 1; i<=num ; i++) {
			star2 += "*";
		}
	}

}
