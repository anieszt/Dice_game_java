import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class Drawingrects extends JComponent {
	private static final long serialVersionUID = 1L;

public void paintComponent(Graphics g){
		
		Graphics2D g2 = (Graphics2D) g;
		//thedicesFace
		Rectangle D1 = new Rectangle(80,115,200,200);
		g2.draw(D1);
		Rectangle D2 = new Rectangle(340,115,200,200);
		g2.draw(D2);
		//thedicesPoints
		   //for left dice
		     //Middle1
		Rectangle pMID1 = new Rectangle(156,191,45,45);
		     //up right
		Rectangle pUPR1 = new Rectangle(215,128,45,45);
		     //right
		Rectangle pR1 = new Rectangle(215,193,45,45);
		     //down right
		Rectangle pDOWNR1 = new Rectangle(215,258,45,45);
	         //up left
		Rectangle pUPL1 = new Rectangle(100,128,45,45);
			 //left
		Rectangle pL1 = new Rectangle(100,193,45,45);
			 //down left
		Rectangle pDOWNL1 = new Rectangle(100,258,45,45);
				
		   //for right dice
		Rectangle pMID2 = new Rectangle(418,191,45,45);
		     //up right
		Rectangle pUPR2 = new Rectangle(475,128,45,45);
		     //right
		Rectangle pR2 = new Rectangle(475,193,45,45);
	         //down right
		Rectangle pDOWNR2 = new Rectangle(475,258,45,45);
	          //up left
		Rectangle pUPL2 = new Rectangle(360,128,45,45);
			  //left
		Rectangle pL2 = new Rectangle(360,193,45,45);
			  //down left
		Rectangle pDOWNL2 = new Rectangle(360,258,45,45);
		//D1 rolling
		if(Anisdices.R1==1){
			g2.fill(pMID1);
		}else if(Anisdices.R1==2){
			g2.fill(pUPR1);
			g2.fill(pDOWNL1);
		}else if(Anisdices.R1==3){
			g2.fill(pUPR1);
			g2.fill(pMID1);
			g2.fill(pDOWNL1);
		}else if(Anisdices.R1==4){
			g2.fill(pUPR1);
			g2.fill(pDOWNR1);
			g2.fill(pDOWNL1);
			g2.fill(pUPL1);
		}else if(Anisdices.R1==5){
			g2.fill(pMID1);
			g2.fill(pUPR1);
			g2.fill(pDOWNR1);
			g2.fill(pDOWNL1);
			g2.fill(pUPL1);
		}else if(Anisdices.R1==6){
			g2.fill(pR1);
			g2.fill(pL1);
			g2.fill(pUPR1);
			g2.fill(pDOWNR1);
			g2.fill(pDOWNL1);
			g2.fill(pUPL1);
		}
				
		//D2 rolling
		if(Anisdices.R2==1){
			g2.fill(pMID2);
		}else if(Anisdices.R2==2){
			g2.fill(pUPR2);
			g2.fill(pDOWNL2);
		}else if(Anisdices.R2==3){
			g2.fill(pUPR2);
			g2.fill(pMID2);
			g2.fill(pDOWNL2);
		}else if(Anisdices.R2==4){
			g2.fill(pUPR2);
			g2.fill(pDOWNR2);
			g2.fill(pDOWNL2);
			g2.fill(pUPL2);
		}else if(Anisdices.R2==5){
			g2.fill(pMID2);
			g2.fill(pUPR2);
			g2.fill(pDOWNR2);
			g2.fill(pDOWNL2);
			g2.fill(pUPL2);
		}else if(Anisdices.R2==6){
			g2.fill(pR2);
			g2.fill(pL2);
			g2.fill(pUPR2);
			g2.fill(pDOWNR2);
			g2.fill(pDOWNL2);
			g2.fill(pUPL2);
		}
			
	}

}
