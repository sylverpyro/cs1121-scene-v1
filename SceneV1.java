// Michael Benson
// Section 10
// SceneV1

import java.awt.*;

public class SceneV1 extends Animator {

	public void draw(int clock,int x,int y,Graphics g) {
	
		// get scene sizes
		int sceneW = Animator.getSceneWidth();
		int sceneH = Animator.getSceneHeight();
		int sceneS = Animator.getSurface();
		
	//--------------------------------------------------------------------------	
	// Tree Draw Call	
	//	treeH = Height of the Tree trunk
	//	treeW = Width of the Tree trunk
	//	treeTopW = Width of the tree leaves (positioned at top of tree trunk
	//	treeTopH = Height of the tree leaves (positioned at top of tree turnk
	//	trunkX = Horizontal positoin of the tree trunk
	//	trunkY = Vertical position of the tree trunk 
	//	topX = Horizontal position of the tree top
	//	topY = Vertical position of the tree top
	//---------------------------------------------------------------------------
		
		// set tree trunk size
		int treeH = 40;
		int treeW = 5;
	
		// set tree top sizes
		int treeTopW = 30;
		int treeTopH = 10;

		// set tree locations
		int trunkX = 100;
		int trunkY = sceneS-treeH;
		int topX = trunkX-(treeTopW/2)+1;
		int topY = trunkY-treeTopH;
	
		// draw the tree

		g.setColor(Color.black);
		g.fillRect(trunkX,trunkY,treeW,treeH);
		
		g.setColor(Color.green);
		g.fillOval(topX,topY,treeTopW,treeTopH);
		
	// End of tree draw call


	// -----------------------------------------------------------------
	// Sun Draw call
	// sunW = width of the sun
	// sunH = height of the sun
	// sunX = horizontal position of the sun
	// sunY = vertical position of the sun
	// -----------------------------------------------------------------
	
		// set sun size
		
		int sunW = 60;
		int sunH = 60;

		// set sun position

		int sunX = -30;
		int sunY = -30;
		
		// draw the sun
		
		g.setColor(Color.yellow);
		g.fillOval(sunX,sunY,sunW,sunH);
		
	// End of sun draw call


	// ----------------------------------------------------------------------------------
	// Cloud draw call
	// cloudW = cloud width
	// cloudH = cloud height
	// cloudX = initial horizontal cloud position and cloud movement and reset definition
	// cloudY = vertical cloud position
	// ----------------------------------------------------------------------------------

	
		// set cloud size
		int cloudW = 30;
		int cloudH = 20;
		
		// set cloud position
		int cloudX = -30+(clock%(sceneW+60));
		int cloudY = 20;
	
		// draw cloud
	
		g.setColor(Color.gray);
		g.fillOval(cloudX,cloudY,cloudW,cloudH);
		
	// End cloud draw call
	
	
	// --------------------------------------------------------------
	// UFO draw call
	// ufoX = initial horizontal ufo position
	// ufoY = initial vertical ufo position
	// ufoW = ufo width
	// ufoH = ufo height
	// -----------------------------------------------------------
		
		// set UFO starting position
		int ufoX = 40;
		int ufoY = 40;

		//set UFO size
		int ufoW = 35;
		int ufoH = 11;
		
		// draw UFO
		g.setColor(Color.gray);
		g.fillOval(ufoX+x+(ufoW/2)-4,ufoY+y-3,10,5);
		g.setColor(Color.black);
		g.fillOval(ufoX+x,ufoY+y,ufoW,ufoH);

	
		// ---------------------------------------------
		// UFO Lights Draw calls
		// ufoLightW = width of the ufo lights
		// ufoLightH = height of the ufo lights
		// ---------------------------------------------
		
		// set UFO light sizes
		int ufoLightW = 3;
		int ufoLightH = 3;
		
		// draw UFO lights
		// The each light has its own call and if/else statement set because of the altranating colors of each of the lights (five total)

		
		//light 1
		
		if (clock%30 <= 10) {
			g.setColor(Color.blue);
			}
		else {
			if (clock%30 > 10) {
				g.setColor(Color.yellow);
				}
			if (clock%30 > 20) {
				g.setColor(Color.red);
				}
			};

		g.fillOval(ufoX+x+2,ufoY+y+4,ufoLightW,ufoLightH);

		// light 2
		
                if (clock%30 <= 10) {
		       g.setColor(Color.red);
		       }       
	        else {          
		        if (clock%30 > 10) {
			        g.setColor(Color.blue);
			        }
		        if (clock%30 > 20) {
		                g.setColor(Color.yellow);
		                }
		         };

		g.fillOval(ufoX+x+9,ufoY+y+4,ufoLightW,ufoLightH);
		
		// light 3
		
                if (clock%30 <= 10) {
	       		g.setColor(Color.yellow);
			}		       
                else {
		        if (clock%30 > 10) {
		                g.setColor(Color.red);
		                }
		        if (clock%30 > 20) {
		                g.setColor(Color.blue);
		                }
			};
	
                g.fillOval(ufoX+x+16,ufoY+y+4,ufoLightW,ufoLightH);
		
		// light 4
		
		if (clock%30 <= 10) {    
        	        g.setColor(Color.blue);
                      }                      
                else {
	               if (clock%30 > 10) {
	                       g.setColor(Color.yellow);
	                       }
	               if (clock%30 > 20) {
	                       g.setColor(Color.red);
	                       }
			};

                g.fillOval(ufoX+x+23,ufoY+y+4,ufoLightW,ufoLightH);
		
                // light 5
		
	 	if (clock%30 <= 10) {
	                g.setColor(Color.red);
		        }
                else {
	                if (clock%30 > 10) {
	                        g.setColor(Color.blue);
                                }
                        if (clock%30 > 20) {
                                g.setColor(Color.yellow);
                                }
                        };
		
	 	g.fillOval(ufoX+x+30,ufoY+y+4,ufoLightW,ufoLightH);                                                                                                                                                                                                                                                                    
		
	} // end of draw method
	
}// end of hw1 class
