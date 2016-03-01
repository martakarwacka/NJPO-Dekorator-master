import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnZadanie1 = new JButton("Zadanie 1");
		btnZadanie1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			Zadanie1 zad1 = new Zadanie1();
			zad1.setVisible(true);	
				
				
			}
		});
		frame.getContentPane().add(btnZadanie1);
		
		JButton btnZadanie2 = new JButton("Zadanie 2");
		btnZadanie2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Zadanie2 zad2 = new Zadanie2();
				zad2.setVisible(true);		
				
			}
		});
		frame.getContentPane().add(btnZadanie2);
	}

}
