

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
	

	private Tesla tesla;
	private Usuario actual;
	private Automovil autoActual;
	
	
	public static void main(String[] args) {
		PApplet.main("Main");
		
	}
	
	
	ControlP5 cp5_pantalla4;
	ControlP5 cp5_pantalla6;
	ControlP5 cp5_pantalla22;
	ControlP5 cp5_pantalla25;
	
	
	
	public void setup() {
		tesla=new Tesla();
		cp5_pantalla4=new ControlP5(this);
		cp5_pantalla6 = new ControlP5(this);
		cp5_pantalla22 = new ControlP5(this);
		cp5_pantalla25 = new ControlP5(this);
	
		
		
		
		cp5_pantalla4.addTextfield("Nombres").setPosition(24,200).setSize(300,41).setAutoClear(true);
		cp5_pantalla4.addTextfield("Apellidos").setPosition(24,290).setSize(300,41).setAutoClear(true);
		cp5_pantalla4.addTextfield("Correo").setPosition(24,380).setSize(300,41).setAutoClear(true);
		cp5_pantalla4.addTextfield("Clave").setPosition(24,470).setSize(300,41).setAutoClear(true);
		cp5_pantalla6.addTextfield("Correo").setPosition(24,200).setSize(300,41).setAutoClear(true);
		cp5_pantalla6.addTextfield("Clave").setPosition(24,300).setSize(300,41).setAutoClear(true);
		cp5_pantalla6.hide();
		
		cp5_pantalla22.addTextfield("Direccion").setPosition(24,165).setSize(300,41).setAutoClear(true);
		cp5_pantalla22.addTextfield("Franquicia").setPosition(24,275).setSize(300,41).setAutoClear(true);
		cp5_pantalla22.addTextfield("Numero de la tarjeta").setPosition(24,340).setSize(300,41).setAutoClear(true);
		cp5_pantalla22.addTextfield("Fecha de expiracion").setPosition(24,410).setSize(300,41).setAutoClear(true);
		cp5_pantalla22.addTextfield("Numero de identificacion").setPosition(24,475).setSize(300,41).setAutoClear(true);
		cp5_pantalla22.hide();
		
		cp5_pantalla25.addTextfield("Direccion").setPosition(24,165).setSize(300,41).setAutoClear(true);
		cp5_pantalla25.addTextfield("Barrio/Apto").setPosition(24,265).setSize(300,41).setAutoClear(true);
		cp5_pantalla25.addTextfield("Numero de contacto").setPosition(24,358).setSize(300,41).setAutoClear(true);
		cp5_pantalla25.addTextfield("Ciudad").setPosition(24,450).setSize(300,41).setAutoClear(true);
		cp5_pantalla25.hide();
		
		
		
		
		
		
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
		cp5_pantalla4.hide();
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
    			cp5_pantalla4.show();
    			
    		}
    		else if((mouseX>=70 && mouseX<280)&&(mouseY>=615 &&mouseY<665)) {
    			pantalla=6;
    			pantallaActual=pantalla6;
    			cp5_pantalla6.show();
    			
    				
    		}
    		
    	}
    	
    	
    	else if(pantalla==6)
    	{
    		
    		if((mouseX>=55 && mouseX<285)&&(mouseY>=450 &&mouseY<500)) {
    			String correo=cp5_pantalla6.get(Textfield.class, "Correo").getText();
    			String clave=cp5_pantalla6.get(Textfield.class, "Clave").getText();
    			boolean encontrado=false;
    			for(Usuario u : tesla.getUsuarios()) {
    				if(u.getCorreo().equals(correo) && u.getContra().equals(clave)) {
    					encontrado=true;
    					actual=u;
    					break;
    				}
    			}
    			if(encontrado) {
    				
    				pantalla=9;
    				pantallaActual=pantalla9;
    				cp5_pantalla6.hide();
    			}
    			else {
    				System.out.println("Los datos estan erroneos o el usuario no esta registrado");
    			}
    			
    			

    		}
    		else if((mouseX>=55 && mouseX<285)&&(mouseY>=600 &&mouseY<700)){
    			pantalla=3;
				pantallaActual=pantalla3;
				cp5_pantalla6.hide();
    		}
    	
    }
    	else if(pantalla==4)
    	{
    		if((mouseX>=55 && mouseX<285)&&(mouseY>=600 &&mouseY<650)) {
    			
    			String nombre=cp5_pantalla4.get(Textfield.class, "Nombres").getText();
    			String apellido=cp5_pantalla4.get(Textfield.class, "Apellidos").getText();
    			String correo=cp5_pantalla4.get(Textfield.class, "Correo").getText();
    			String clave=cp5_pantalla4.get(Textfield.class, "Clave").getText();
    			if(!nombre.equals("") && !apellido.equals("") && !correo.equals("") && !clave.equals("")) {
    				pantalla=3;
        			pantallaActual=pantalla3;
    				tesla.getUsuarios().add(new Usuario(nombre, apellido, correo, clave));
    				System.out.println("El usuario "+nombre+" "+apellido+" ha sido registrado");
    				cp5_pantalla4.hide();
    			}
    			else {
    				System.out.println("Ningun campo debe de estar vacio");
    			}
    			
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
         			cp5_pantalla22.show();
         			autoActual=tesla.getAutomoviles().get(2);
        			
         			
    }
}
    	else if(pantalla==22) {
    	    	 if((mouseX>=55 && mouseX<285)&&(mouseY>=621 &&mouseY<671)) {
    	    		 String direccion=cp5_pantalla22.get(Textfield.class, "Direccion").getText();
    	    			String franquicia=cp5_pantalla22.get(Textfield.class, "Franquicia").getText();
    	    			String tarjeta=cp5_pantalla22.get(Textfield.class, "Numero de la tarjeta").getText();
    	    			String expiracion=cp5_pantalla22.get(Textfield.class, "Fecha de expiracion").getText();
    	    			String identificacion=cp5_pantalla22.get(Textfield.class, "Numero de identificacion").getText();
    	    			if(!direccion.equals("") && !franquicia.equals("") && !tarjeta.equals("") && !expiracion.equals("") &&!identificacion.equals("") ){
    	    				
    	    				pantalla=24;
    	    				pantallaActual=pantalla24;  
    	    				cp5_pantalla22.hide();
    	    			}
    	    			else {
    	    				System.out.println("Todos los campos deben de estar llenos");
    	    			}
    	    	 }
    	     }
    	    	 else if(pantalla==24) {
        	    	 if((mouseX>=55 && mouseX<285)&&(mouseY>=620 &&mouseY<660)) {
                    	 pantalla=25;
             			pantallaActual=pantalla25;
             			cp5_pantalla25.show();
             			
    	    	  
        	    	 }
    	    	 }
        	    	 else if(pantalla==25) {
            	    	 if((mouseX>=55 && mouseX<285)&&(mouseY>=540 &&mouseY<580)) {
            	    		 String direccion=cp5_pantalla25.get(Textfield.class, "Direccion").getText();
         	    			String barrio=cp5_pantalla25.get(Textfield.class, "Barrio/Apto").getText();
         	    			String contacto=cp5_pantalla25.get(Textfield.class, "Numero de contacto").getText();
         	    			String ciudad=cp5_pantalla25.get(Textfield.class, "Ciudad").getText();
         	    			if(!direccion.equals("") && !barrio.equals("") && !contacto.equals("") && !ciudad.equals("") ) {
         	    				
         	    				pantalla=27;
         	    				pantallaActual=pantalla27; 
         	    				cp5_pantalla25.hide();
         	    				actual.getCompras().add(new Historico(autoActual.getModelo(), autoActual.getPrecio(), autoActual.getCilindraje()));
         	    			}
         	    			else {
         	    				System.out.println("Todos los campos deben de estar llenos");
         	    			}
                 			
                 			
            	            }
    	    	  	 
    	    	
}
        	    	 else if(pantalla==27) {
            	    	 if((mouseX>=55 && mouseX<285)&&(mouseY>=540 &&mouseY<580)) {
                        	 pantalla=28;
                 			pantallaActual=pantalla28; 
                 		
                 			for(Historico h : actual.getCompras()) {
                 				System.out.println("Compra de auto "+h.getCompraRealizada() + ", se pago "+h.getMontoCompra()+" con cilindraje "+h.getGamaAuto());
                 			}
                 			  	    	 
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
                 			autoActual=tesla.getAutomoviles().get(1);
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
                 			autoActual=tesla.getAutomoviles().get(0);
    }
            	    	 else if((mouseX>=75 && mouseX<285)&&(mouseY>=585 &&mouseY<625)) {
                        	 pantalla=22;
                 			pantallaActual=pantalla22; 
                 			
}
    }
}
}

    	    


