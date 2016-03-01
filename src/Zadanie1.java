import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Zadanie1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zadanie1 frame = new Zadanie1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private int liczbaWierszy = 0;
	private int liczbaSlow = 0;
	
	public void oblicz(){
	
		FileReader fr = null;
		   String linia = "";


		   try{
		     fr = new FileReader("log.txt");
		     BufferedReader bfr = new BufferedReader(fr);
		     
		     while((linia = bfr.readLine()) != null){	
		    	 
		    	 for(int i = 0; i<linia.length(); i++){
 
		    		 	char znak1 = linia.charAt(i);
		    		 	if(!(znak1 == ' ' || znak1 == '\t' || znak1 == '\n' || znak1 == '\r'))
		    		 	{		    		 		    
		    		 		if((i+1)<linia.length())
		    		 		{
		    		 			char znak2 = linia.charAt(i+1);
	    					  	if ((znak2 == ' ' || znak2 == '\t' || znak2 == '\n' || znak2 == '\r'))
	    					  	{		    				  
	    					  		liczbaSlow++;
	    					  	}
	    				  	}
		    		 		else{
		    		 			liczbaSlow++;
		    		 		}
		    		 	}
		    	 }

		        liczbaWierszy++;
		     }
		     fr.close();
		     JOptionPane.showMessageDialog(null, "Liczba wierszy: " + liczbaWierszy + "   Liczba s³ów: " + liczbaSlow );
		   }
		   
		   catch(IOException e){
		    	 JOptionPane.showMessageDialog(null, "Wyst¹pi³ nieznany b³¹d." );
		         System.exit(1);
		   }
	}
		
		
	
	

	/**
	 * Create the frame.
	 */
	public Zadanie1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnOblicz = new JButton("Oblicz!");
		btnOblicz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				oblicz();
				
				
				
			}
		});
		contentPane.add(btnOblicz, BorderLayout.CENTER);
	}

}
