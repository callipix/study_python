package day03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing05 extends JFrame {

	private JPanel contentPane;
	private JTextField tf_mine;
	private JTextField tf_com;
	private JTextField tf_result;
	JLabel lbl_mine;
	JLabel lbl_com;
	JLabel lbl_result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing05 frame = new MySwing05();
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
	public MySwing05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 271, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lbl_mine = new JLabel("나:");
		lbl_mine.setBounds(44, 25, 57, 15);
		contentPane.add(lbl_mine);

		lbl_com = new JLabel("컴:");
		lbl_com.setBounds(44, 67, 57, 15);
		contentPane.add(lbl_com);

		lbl_result = new JLabel("결과:");
		lbl_result.setBounds(44, 107, 57, 15);
		contentPane.add(lbl_result);

		tf_mine = new JTextField();
		tf_mine.setBounds(113, 22, 93, 21);
		contentPane.add(tf_mine);
		tf_mine.setColumns(10);

		tf_com = new JTextField();
		tf_com.setColumns(10);
		tf_com.setBounds(113, 64, 93, 21);
		contentPane.add(tf_com);

		tf_result = new JTextField();
		tf_result.setColumns(10);
		tf_result.setBounds(113, 104, 93, 21);
		contentPane.add(tf_result);

		JButton btn = new JButton("게임하기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();

			}
		});
		btn.setBounds(29, 151, 177, 21);
		contentPane.add(btn);
	}

	void myclick() {

		String mine = tf_mine.getText();
		String com = "";
		String result = "";
		
		double rnd = Math.random();
		
		if(rnd > 0.66) {
			com = "가위";
		} else if(rnd > 0.33) {
			com = "바위";
		} else {
			com = "보";
		} 

		if (com.equals("가위") && mine.equals("가위"))		result = "비김";
		if (com.equals("가위") && mine.equals("바위"))		result = "이김";
		if (com.equals("가위") && mine.equals("보"))		result = "짐";

		if (com.equals("바위") && mine.equals("가위"))		result = "짐";
		if (com.equals("바위") && mine.equals("바위"))		result = "비김";
		if (com.equals("바위") && mine.equals("보"))		result = "이김";
		
		if (com.equals("보")  && mine.equals("가위"))		result = "이김";
		if (com.equals("보")  && mine.equals("바위"))		result = "짐";
		if (com.equals("보")  && mine.equals("보"))		result = "비김";
		
		tf_com.setText(com);
		tf_result.setText(result);
	
	}
}
