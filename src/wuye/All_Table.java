package wuye;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class All_Table extends JFrame {
	EstateSQL estateSQL;
	private JPanel contentPane;
	private JButton btnNewButton;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	All_Table(EstateSQL estateSQL){
		this.estateSQL = estateSQL;
	}
	public void run() {
		setVisible(true);
	}
	void init() {
		setTitle("总体统计");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		btnNewButton = new JButton("月报表");//月报表按钮
		btnNewButton.setBounds(20, 50, 93, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//月报表
			}
		});

		btnNewButton = new JButton("季报表");//季报表按钮
		btnNewButton.setBounds(20, 100, 93, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//季报表
			}
		});

		btnNewButton = new JButton("年报表");//年报表按钮
		btnNewButton.setBounds(20, 150, 93, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//年报表
			}
		});
		btnNewButton = new JButton("返回");//返回
		btnNewButton.setBounds(20, 220, 93, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Administrator_Main_Window administrator_main_window = new Administrator_Main_Window(estateSQL);
				administrator_main_window.init();
				administrator_main_window.run();
				All_Table.super.dispose();
			}
		});
	}

}
