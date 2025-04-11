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
		setBounds(200, 200, 800, 600);
		setResizable(false);
	}
	public void paint (Graphics g) {
	
		super.paint (g);
		/////////////////////////////////////rio arriba
		g.setColor (new Color(207, 243, 241 )); 
		int [] vxl = {-150, 800, 800};  	//arriba, derecha, izquierda
		int [] vyl = {0, 0, 200}; 	//arriba, derecha, izquierda
		g.fillPolygon (vxl, vyl, 3);
		////////////////////////////////////linea arriba
		g.setColor (Color.black); 
		g.drawLine (-150,0,800,200); 
		
		/*g.setColor (Color.black); 
		g.drawLine (0,160,900,430);
		/////////////////////////////////////valla abajo
		g.setColor (Color.black); 
		g.drawLine (0,270,900,560); 
		
		g.setColor (Color.black); 
		g.drawLine (0,450,400,600);*/
		////////////////////////////////////linea arriba
		g.setColor (Color.black); 
		g.drawLine (0,450,800,650);
		
		////////////////////////////////////// rio abajo
		g.setColor (new Color(207, 243, 241 )); 
		int [] vxl1 = {0, 0, 800};  	//arriba, derecha, izquierda
		int [] vyl1 = {450,600, 650}; 	//arriba, derecha, izquierda
		g.fillPolygon (vxl1, vyl1, 3);
		
		
	
	}
	public static void main(String[] args) {
		new Libre(); 
	}
 
}

