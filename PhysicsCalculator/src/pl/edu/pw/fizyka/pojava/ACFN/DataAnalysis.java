package pl.edu.pw.fizyka.pojava.ACFN;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DataAnalysis {

	private JFrame daFrame;

	/**
	 * Launch the application.
	 */
	public void dAnalysis() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataAnalysis window = new DataAnalysis();
					window.daFrame.setLocationRelativeTo(null);
					window.daFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DataAnalysis() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		daFrame = new JFrame();
		daFrame.setBounds(100, 100, 450, 300);
		daFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		daFrame.getContentPane().setLayout(null);
		
		JButton btnBackToMenu = new JButton("Powr\u00F3t do menu");
		btnBackToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				daFrame.setVisible(false);
				MainMenuFrame.main(null);
			}
		});
		btnBackToMenu.setBounds(241, 216, 183, 34);
		daFrame.getContentPane().add(btnBackToMenu);
	}

}
