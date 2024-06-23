package day03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing04 extends JFrame {

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
					MySwing04 frame = new MySwing04();
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
	public MySwing04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tf = new JTextField();
		tf.setBounds(133, 9, 83, 21);
		contentPane.add(tf);
		tf.setColumns(10);
		
		ta = new JTextArea();
		ta.setBounds(38, 71, 178, 217);
		contentPane.add(ta);
		
		JButton btn = new JButton("출력하기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
			}

		});
		btn.setBounds(38, 40, 178, 21);
		contentPane.add(btn);
		
		JLabel lbl = new JLabel("출력단수");
		lbl.setBounds(38, 9, 83, 21);
		contentPane.add(lbl);
	}

	private void myclick() {
		String dan = tf.getText();
		int idan = Integer.parseInt(dan);
		String txt ="";
		for(int i = 1 ; i <= 9 ; i++) {
		txt += idan+"*"+i+ "="+ idan*i+"\n";
		}
		ta.setText(txt);
		
	}
}
