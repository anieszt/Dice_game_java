import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;

public class Dice_game {
	
	static int R1;
	static int R2;
    static int face;
    
	public static int NP=0;
	
	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
        
		//how many faces?
		System.out.println("how many faces for the two dices?");
		Scanner Sface =new Scanner(System.in);
        face =Sface.nextInt();
        
        System.out.println("how many rerolls?");
        Scanner St = new Scanner(System.in);
        int T =St.nextInt();
        
        //first result faces randomizing
        Random R1face= new Random();
        Random R2face= new Random();
        
        R1 =R1face.nextInt(face);
        R2 =R2face.nextInt(face);
        
        dice D1= new dice(face,R1);
        System.out.println("D1 has "+D1.getNface() +" faces");        
        dice D2= new dice(face,R2);
        System.out.println("D2 has "+D2.getNface() +" faces");
        
        
        for(int x =0;x< T;x++){
                
        //next results faces randomizing        
        R1 =R1face.nextInt(face+1);	
        R2 =R2face.nextInt(face+1);
        
        if(R1==0){
        	R1++;
        }
        if(R2==0){
        	R2++;
        }
        
        //N of 6 6
        if(R1==face && R2==face){
        	System.out.println("                          perfect score");
        	NP++;
        }
        
        //final faces results 
        System.out.println("dices throwing...");
        System.out.println("D1 = " +R1);
        System.out.println("D2 = " +R2);
        }
     	
        System.out.println("P = " +NP);
        
        //frame       
        JFrame frame6 = new JFrame();
        frame6.setSize(640,480);
        frame6.setTitle("dices Window");
        frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame6.setResizable(false);
        frame6.setLocationRelativeTo(null);
        frame6.setVisible(false);
        frame6.setAlwaysOnTop(true);
        
        Drawingrects DR = new Drawingrects();
        
        if(face==6){
        frame6.setVisible(true);
        frame6.add(DR);
               
        }
    }
	
}
