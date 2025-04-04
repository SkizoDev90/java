package Libre;

import	java.awt.Color;
import	java.awt.Graphics;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.swing.JFrame; 
import javax.swing.JPanel; 
import javax.swing.border.EmptyBorder;

public class Libre extends JFrame {
	
	public Libre() {
		inicializar();
		setVisible(true);
	
	}	
	
	public void inicializar(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
	}
	public void paint (Graphics g) {
	
		super.paint (g);
		/////////////////////////////////////valla arriba
		g.setColor (Color.black); 
		g.drawLine (0,80,900,350);
		g.setColor (Color.black); 
		g.drawLine (0,160,900,430);
		/////////////////////////////////////valla abajo
		g.setColor (Color.black); 
		g.drawLine (0,270,900,560); 
		
		g.setColor (Color.black); 
		g.drawLine (0,450,900,750);
		
		 
		
	
	}
	public static void main(String[] args) {
		new Libre(); 
	}
 
}

