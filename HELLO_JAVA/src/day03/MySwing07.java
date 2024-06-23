package day03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing07 extends JFrame {

	private JPanel contentPane;
	private JTextField tf;
	String number ="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing07 frame = new MySwing07();
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
	public MySwing07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 263, 287);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		tf = new JTextField();
		tf.setBounds(12, 10, 184, 21);
		contentPane.add(tf);
		tf.setColumns(10);

		JButton btn1 = new JButton("1");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick("1");
			}
		});
		btn1.setBounds(12, 41, 53, 21);
		contentPane.add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick("2");
			}
		});

		btn2.setBounds(75, 40, 53, 21);
		contentPane.add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick("3");
			}
		});

		btn3.setBounds(140, 41, 53, 21);
		contentPane.add(btn3);

		JButton btn4 = new JButton("4");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick("4");
			}
		});

		btn4.setBounds(12, 75, 53, 21);
		contentPane.add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick("5");
			}
		});

		btn5.setBounds(75, 75, 53, 21);
		contentPane.add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick("6");
			}
		});
		btn6.setBounds(140, 75, 53, 21);
		contentPane.add(btn6);

		JButton btn7 = new JButton("7");
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick("7");
			}
		});
		btn7.setBounds(12, 106, 53, 21);
		contentPane.add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick("8");
			}
		});
		btn8.setBounds(75, 106, 53, 21);
		contentPane.add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick("9");
			}
		});
		btn9.setBounds(140, 106, 53, 21);
		contentPane.add(btn9);

		JButton btn0 = new JButton("0");
		btn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick("0");
			}
		});
		btn0.setBounds(12, 137, 53, 21);
		contentPane.add(btn0);

		JButton btn_call = new JButton("CALL");
		btn_call.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mycall();
			}
		});
		btn_call.setBounds(75, 136, 121, 21);
		contentPane.add(btn_call);
	}

	void myclick(String num) {
		number += num;
		tf.setText(number);
	}
	void mycall() {
		JOptionPane.showMessageDialog(null, number);
	}
}
