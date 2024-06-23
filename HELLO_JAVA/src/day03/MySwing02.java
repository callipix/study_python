package day03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing02 extends JFrame {

	private JPanel contentPane;
	private JTextField tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing02 frame = new MySwing02();
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
	public MySwing02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
		
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tf = new JTextField();
		tf.setBounds(47, 38, 116, 21);
		tf.setText("1");
		contentPane.add(tf);
		tf.setColumns(10);
		
		JButton btn = new JButton("INCREASE");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myclick();
				/*
				 * int count = Integer.parseInt(tf.getText()); tf.setText((count+1)+"");
				 */
			}
		});
		btn.setBounds(203, 37, 93, 23);
		contentPane.add(btn);
	}
	
	void myclick() {
		System.out.println("myclick");
		String a = tf.getText();
		int aa = Integer.parseInt(a);
//		aa++;
		tf.setText((Integer.toString(aa+1)));
	}

}
