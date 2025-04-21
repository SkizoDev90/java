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
		/////////////////////////////////////color rio arriba
		g.setColor (new Color(207, 243, 241 )); 
		int [] vxl = {-150, 800, 800};  	//arriba, derecha, izquierda
		int [] vyl = {0, 0, 200}; 	//arriba, derecha, izquierda
		g.fillPolygon (vxl, vyl, 3);
		////////////////////////////////////linea rio arriba
		g.setColor (Color.black); 
		g.drawLine (-150,0,800,200); 
		
		
	//////////////////////////////////////medio puente arriba
		g.setColor (new Color(250, 230, 174)); 
		int [] vxl2 = {0, -150, 800};  	//arriba, derecha, izquierda
		int [] vyl2 = {450,0, 200}; 	//arriba, derecha, izquierda
		g.fillPolygon (vxl2, vyl2, 3);
		//////////////////////////////////////medio puente arriba
		g.setColor (new Color(250, 230, 174)); 
		int [] vxl3 = {0, 800, 800};  	//arriba, derecha, izquierda
		int [] vyl3 = {450,649, 200}; 	//arriba, derecha, izquierda
		g.fillPolygon (vxl3, vyl3, 3);
		/////////////////////////////////////linea valla arriba 2
		g.setColor (Color.black); 
		g.drawLine (0,90,900,290);
		
		/////////////////////////////////////linea abajo 2
		g.setColor (Color.black); 
		g.drawLine (0,160,900,360);
		
		/////////////////////////////////////ovalo puente 1
		g.setColor (new Color(177, 122, 80));
		g.fillOval(50, 320, 130, 250);
		
		/////////////////////////////////////ovalo puente 2
		g.setColor (new Color(177, 122, 80));
		g.fillOval(270, 380, 130, 250);
		
		/////////////////////////////////////ovalo puente 3
		g.setColor (new Color(177, 122, 80));
		g.fillOval(490, 440, 130, 250);
		
		/////////////////////////////////////ovalo puente 4
		g.setColor (new Color(177, 122, 80));
		g.fillOval(710, 500, 130, 250);
		
		////////////////////////////////////// color rio abajo
		g.setColor (new Color(207, 243, 241 )); 
		int [] vxl1 = {0, 0, 800};  	
		int [] vyl1 = {450,600, 650}; 	
		g.fillPolygon (vxl1, vyl1, 3);
		
		//////////////////////////////////////peatonal arriba
		g.setColor (new Color(240, 240, 124)); 
		int [] vxl4= {0, 0, 900};  	
		int [] vyl4 = {90,160, 290}; 	
		g.fillPolygon (vxl4, vyl4, 3);
		//////////////////////////////////////peatonal abajo
		g.setColor (new Color(240, 240, 124)); 
		int [] vxl5= {0, 900, 900};  	
		int [] vyl5 = {160,290, 360}; 	
		g.fillPolygon (vxl5, vyl5, 3);
		//////////////////////////////////////ovalo1 agua
		g.setColor (new Color(207, 243, 241)); 
		int [] vxl6= {47, 174, 180};  	
		int [] vyl6 = {463,495, 450}; 	
		g.fillPolygon (vxl6, vyl6, 3);	
	
		//////////////////////////////////////ovalo2 agua
		g.setColor (new Color(207, 243, 241)); 
		int [] vxl7= {270, 400, 394};  	
		int [] vyl7 = {518,510, 550}; 	
		g.fillPolygon (vxl7, vyl7, 3);
		
		//////////////////////////////////////ovalo3 agua
		g.setColor (new Color(207, 243, 241)); 
		int [] vxl8= {493, 618, 620};  	
		int [] vyl8 = {573,606, 565}; 	
		g.fillPolygon (vxl8, vyl8, 3);
	}
	public static void main(String[] args) {
		new Libre(); 
	}
}