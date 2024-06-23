package day03;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MySwing03 extends JFrame {
	
	JLabel lbl01,lbl02,lbl03,lbl04,lbl05,lbl06;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing03 frame = new MySwing03();
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
	public MySwing03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl01 = new JLabel("__");
		lbl01.setBounds(12, 24, 52, 24);
		contentPane.add(lbl01);
		
		lbl02 = new JLabel("__");
		lbl02.setBounds(76, 24, 52, 24);
		contentPane.add(lbl02);
		
		lbl03 = new JLabel("__");
		lbl03.setBounds(141, 24, 52, 24);
		contentPane.add(lbl03);
		
		lbl04 = new JLabel("__");
		lbl04.setBounds(210, 24, 52, 24);
		contentPane.add(lbl04);
		
		lbl05 = new JLabel("__");
		lbl05.setBounds(282, 24, 52, 24);
		contentPane.add(lbl05);
		
		lbl06 = new JLabel("__");
		lbl06.setBounds(356, 24, 52, 24);
		contentPane.add(lbl06);
		
		JButton btn = new JButton("로또생성하기");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn.addMouseListener(new MouseAdapter() {
	
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
				
				int[] arr = new int[44+1];
				for (int i = 0 ; i<44+1 ; i++) {
					arr[i] = i+1;
				//	System.out.println(arr[i]);
				}
				for(int i = 0 ; i < 100000 ; i++) {
					int rnd = (int)(Math.random()*45);
					int a = arr[0];
					arr[0] = arr[rnd];
					arr[rnd] = a;
				}
				lbl01.setText(String.valueOf(arr[0]));
				lbl02.setText(String.valueOf(arr[1]));
				lbl03.setText(String.valueOf(arr[2]));
				lbl04.setText(String.valueOf(arr[3]));
				lbl05.setText(String.valueOf(arr[4]));
				lbl06.setText(String.valueOf(arr[5]));
			}
		});
		btn.setBounds(12, 68, 363, 24);
		contentPane.add(btn);
		
	}
	
	void myclick() {
		int[] arr = new int[44+1];
		for (int i = 0 ; i<44+1 ; i++) {
			arr[i] = i+1;
		//	System.out.println(arr[i]);
		}
		
		for(int i = 0; i <1000; i++) {
			int rnd = (int)(Math.random()*45);
			int a = arr[0];
			arr[0] = arr[rnd];
			arr[rnd] = a;
		}
		
		lbl01.setText(Integer.toString(arr[0]));
		lbl02.setText(Integer.toString(arr[1]));
		lbl03.setText(Integer.toString(arr[2]));
		lbl04.setText(Integer.toString(arr[3]));
		lbl05.setText(Integer.toString(arr[4]));
		lbl06.setText(Integer.toString(arr[5]));
		
	}
}
