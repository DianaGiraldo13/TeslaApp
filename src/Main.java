

import controlP5.ControlP5;
import controlP5.Textfield;
import modelo.Automovil;
import modelo.Historico;
import modelo.Tesla;
import modelo.Usuario;
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet{
	
	PImage pantallaActual;
	PImage pantalla1;
	PImage pantalla2;
	PImage pantalla3;
	PImage pantalla4;
	PImage pantalla5;
	PImage pantalla6;
	PImage pantalla7;
	PImage pantalla8;
	PImage pantalla9;
	PImage pantalla10;
	PImage pantalla11;
	PImage pantalla12;
	PImage pantalla13;
	PImage pantalla14;
	PImage pantalla15;
	PImage pantalla16;
	PImage pantalla17;
	PImage pantalla18;
	PImage pantalla19;
	PImage pantalla20;
	PImage pantalla21;
	PImage pantalla22;
	PImage pantalla23;
	PImage pantalla24;
	PImage pantalla25;
	PImage pantalla26;
	PImage pantalla27;
	PImage pantalla28;
	PImage pantalla29;
	PImage pantalla30;
	int pantalla;
	PImage pantallagirar;
	PImage pantallagirar2;
	PImage pantallagirar3;
	
	
	
	public static void main(String[] args) {
		PApplet.main("Main");
		
	}
	
	
	
	public void setup() {
		
		
		
		
		
		
		pantalla1=loadImage("./Interfaz 1.png");
		pantalla2=loadImage("./Interfaz 2.png");
		pantalla3=loadImage("./Interfaz 3.png");
		pantalla4=loadImage("./Interfaz 4.png");
		pantalla5=loadImage("./Interfaz 5.png");
		pantalla6=loadImage("./Interfaz 6.png");
		pantalla7=loadImage("./Interfaz 7.png");
		pantalla8=loadImage("./Interfaz 8.png");
		pantalla9=loadImage("./Interfaz 9.png");
		pantalla10=loadImage("./Interfaz 10.png");
		pantalla11=loadImage("./Interfaz 11.png");
		pantalla12=loadImage("./Interfaz 12.png");
		pantalla13=loadImage("./Interfaz 13.png");
		pantalla14=loadImage("./Interfaz 14.png");
		pantalla15=loadImage("./Interfaz 15.png");
		pantalla16=loadImage("./Interfaz 16.png");
		pantalla17=loadImage("./Interfaz 17.png");
		pantalla18=loadImage("./Interfaz 18.png");
		pantalla19=loadImage("./Interfaz 19.png");
		pantalla20=loadImage("./Interfaz 20.png");
		pantalla21=loadImage("./Interfaz 21.png");
		pantalla22=loadImage("./Interfaz 22.png");
		pantalla23=loadImage("./Interfaz 23.png");
		pantalla24=loadImage("./Interfaz 24.png");
		pantalla25=loadImage("./Interfaz 25.png");
		pantalla26=loadImage("./Interfaz 26.png");
		pantalla27=loadImage("./Interfaz 27.png");
		pantalla28=loadImage("./Interfaz 28.png");
		pantalla29=loadImage("./Interfaz 29.png");
		pantalla30=loadImage("./Interfaz 30.png");
		pantallaActual=pantalla1;
		pantalla=1;
		pantallagirar=pantalla12;
		pantallagirar2=pantalla16;
		pantallagirar3=pantalla20;
	}
	
	public void draw() {
		background(0);
		image(pantallaActual,25,0,300,700);
		//rect(75,585,210,40);
		
	}
    public void settings() {
    	size(350,700);
    }

    
   
    
    public void mousePressed() {
    	if(pantalla==1)
    	{
    		if((mouseX>=255 && mouseX<305)&&(mouseY>=413 &&mouseY <463)) {
    			pantalla=2;
    			pantallaActual=pantalla2;
    		}

    		
    	} 
    	else if(pantalla==2) {
			pantalla=3;
			pantallaActual=pantalla3;
		}
    	else if(pantalla==3) {
    		if((mouseX>=70 && mouseX<280)&&(mouseY>=557 &&mouseY<607)) {
    			pantalla=4;
    			pantallaActual=pantalla4;
    			
    			
    		}
    		else if((mouseX>=70 && mouseX<280)&&(mouseY>=615 &&mouseY<665)) {
    			pantalla=6;
    			pantallaActual=pantalla6;
    			
    			
    				
    		}
    		
    	}
    	
    	
    	else if(pantalla==6)
    	{
    		
    		if((mouseX>=55 && mouseX<285)&&(mouseY>=450 &&mouseY<500)) {
    			
    			
    			
    				
    				pantalla=9;
    				pantallaActual=pantalla9;
    				
    			
    			
    			

    		}
    		else if((mouseX>=55 && mouseX<285)&&(mouseY>=600 &&mouseY<700)){
    			pantalla=3;
				pantallaActual=pantalla3;
		
    		}
    	
    }
    	else if(pantalla==4)
    	{
    		if((mouseX>=55 && mouseX<285)&&(mouseY>=600 &&mouseY<650)) {
    			
    			
    			
    				pantalla=3;
        			pantallaActual=pantalla3;
    		
    			
    			
    			
    		}
    	}
    	else if(pantalla==8)
    	{
    		if((mouseX>=55 && mouseX<285)&&(mouseY>=600 &&mouseY<650)) {
    			System.out.println("ok");
    			pantalla=9;
    			pantallaActual=pantalla9;
    			
    		}
    	}
 
    	else if(pantalla==9) {
    			if((mouseX>=55 && mouseX<285)&&(mouseY>=280 &&mouseY<330)) {
    	    		
        			pantalla=10;
        			pantallaActual=pantalla10;
        			
    			
    		}
    			else if((mouseX>=55 && mouseX<305)&&(mouseY>=380 &&mouseY<430)) {
    	    		
        			pantalla=14;
        			pantallaActual=pantalla14;
    		}
    			else if((mouseX>=55 && mouseX<285)&&(mouseY>=480 &&mouseY<530)) {
    	    		
        			pantalla=18;
        			pantallaActual=pantalla18;     
}
    		
    			
    		}
    	  
    	else if(pantalla==10) {
                 if((mouseX>=55 && mouseX<285)&&(mouseY>=580 &&mouseY<630)) {
        	    		
            			pantalla=11;
            			pantallaActual=pantalla11;     
    	     }
    }
    	else if(pantalla==14) {
                 if((mouseX>=55 && mouseX<285)&&(mouseY>=625 &&mouseY<675)) {
        	    		
            			pantalla=15;
            			pantallaActual=pantalla15;   
    }
}
    	else if(pantalla==18) {
                 if((mouseX>=55 && mouseX<285)&&(mouseY>=625 &&mouseY<675)) {
        	    		
            			pantalla=19;
            			pantallaActual=pantalla19; 
    	     }
    }
    	else if(pantalla==11) {
                 if((mouseX>=55 && mouseX<285)&&(mouseY>=625 &&mouseY<675)) {
        	    		
            			pantalla=12;
            			pantallaActual=pantalla12; 
            			image(pantallagirar,0,0,350,700);
            			
    	     
    }
}
    	else if(pantalla==15) {
                 if((mouseX>=55 && mouseX<285)&&(mouseY>=625 &&mouseY<675)) {
                	 pantalla=16;
         			pantallaActual=pantalla16; 
         			image(pantallagirar2,0,0,350,700);
                 }
    }
    	else if(pantalla==19) {
                 if((mouseX>=55 && mouseX<285)&&(mouseY>=625 &&mouseY<675)) {
                	 pantalla=20;
         			pantallaActual=pantalla20; 
         			image(pantallagirar3,0,0,350,700);
}
}
    	else if(pantalla==12) {
                 if((mouseX>=25 && mouseX<75)&&(mouseY>=275 &&mouseY<475)) {
                	 pantalla=13;
         			pantallaActual=pantalla13; 
         			
    	     }
    
    }
    	else if(pantalla==16) {
                 if((mouseX>=25 && mouseX<75)&&(mouseY>=275 &&mouseY<475)) {
                	 pantalla=17;
         			pantallaActual=pantalla17; 
    }
}
    	else if(pantalla==20) {
                 if((mouseX>=25 && mouseX<75)&&(mouseY>=275 &&mouseY<475)) {
                	 pantalla=21;
         			pantallaActual=pantalla21; 
    	     }
                 }
    	else if(pantalla==13) {
    	    	 if((mouseX>=55 && mouseX<285)&&(mouseY>=578 &&mouseY<618)) {
                	 pantalla=22;
         			pantallaActual=pantalla22; 
         			
        			
         			
    }
}
    	else if(pantalla==22) {
    	    	 if((mouseX>=55 && mouseX<285)&&(mouseY>=621 &&mouseY<671)) {
    	    		
    	    			
    	    				
    	    				pantalla=24;
    	    				pantallaActual=pantalla24;  
    	    				
    	    			
    	    			
    	    	 }
    	     }
    	    	 else if(pantalla==24) {
        	    	 if((mouseX>=55 && mouseX<285)&&(mouseY>=620 &&mouseY<660)) {
                    	 pantalla=25;
             			pantallaActual=pantalla25;
             		
             			
    	    	  
        	    	 }
    	    	 }
        	    	 else if(pantalla==25) {
            	    	 if((mouseX>=55 && mouseX<285)&&(mouseY>=540 &&mouseY<580)) {
            	    		 
         	    		
         	    				
         	    				pantalla=27;
         	    				pantallaActual=pantalla27; 
         	    				         	    			
         	    			
                 			
                 			
            	            }
    	    	  	 
    	    	
}
        	    	 else if(pantalla==27) {
            	    	 if((mouseX>=55 && mouseX<285)&&(mouseY>=540 &&mouseY<580)) {
                        	 pantalla=28;
                 			pantallaActual=pantalla28; 
                 			
                 			  	    	 
    }
}
        	    	 else if(pantalla==28) {
            	    	 if((mouseX>=75 && mouseX<285)&&(mouseY>=533 &&mouseY<573)) {
                        	 pantalla=9;
                 			pantallaActual=pantalla9; 
    }
}
        	    	 else if(pantalla==13) {
            	    	 if((mouseX>=75 && mouseX<285)&&(mouseY>=623 &&mouseY<663)) {
                        	 pantalla=9;
                 			pantallaActual=pantalla9; 
    }
}
        	    	 else if(pantalla==17) {
            	    	 if((mouseX>=75 && mouseX<285)&&(mouseY>=635 &&mouseY<675)) {
                        	 pantalla=9;
                 			pantallaActual=pantalla9;
                 			
    }
            	    	 else if((mouseX>=75 && mouseX<285)&&(mouseY>=593 &&mouseY<633)) {
                        	 pantalla=22;
                 			pantallaActual=pantalla22;
    }
}
        	    	 else if(pantalla==21) {
            	    	 if((mouseX>=75 && mouseX<285)&&(mouseY>=628 &&mouseY<668)) {
                        	 pantalla=9;
                 			pantallaActual=pantalla9;  
                 		
    }
            	    	 else if((mouseX>=75 && mouseX<285)&&(mouseY>=585 &&mouseY<625)) {
                        	 pantalla=22;
                 			pantallaActual=pantalla22; 
                 			
}
    }
}
}

    	    

