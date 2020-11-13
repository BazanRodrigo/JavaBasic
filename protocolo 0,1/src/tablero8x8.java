import java.applet.*;
import java.awt.*;
public class tablero8x8 extends Applet {

void iniciamatriz (){
int matriztablero[][]= new int [8][8];
int ficha=1;
int i,j;   
    for (i = 1; i < 9; i++) {
       if (i==4|i==5) continue;
        for (j = 1; j < 9; j++) {
            if (i%2==1) {
                if (j%2==0) {
                    matriztablero[i][j]=ficha;
                ficha=ficha+1;                    
                }
                if (j%2==1){
                    matriztablero[i][j]=0;
                }
                }
            if (i%2==0) {
                if (j%2==0) {
                     matriztablero[i][j]=0;
                }
                if (j%2==1){
                    matriztablero[i][j]=ficha;
                ficha=ficha+1;
                } 
            }
}
    }     
    }
@Override
public void paint (Graphics g) {
//Dibujacion tablero
Color colorcuadro1=new Color(46, 64, 83);
Color colorcuadro2=new Color(112, 123, 124 );
Color colorficha1=new Color(231, 76, 60 );
Color colorficha2=new Color(241, 196, 15 );
//int matriztablero[][]= new int [8][8];

int posicionfichax=5;
int i,j;
int x1=0;
int x2=0;
int c2=5;
//iniciador grafico de matriz
for (i=1; i<=8; i++) {
    for (j=1; j<=8; j++) {
	if(i%2==1) {
        	if(j%2==0) {		
                    g.setColor(colorcuadro1);
                    g.fillRect(x1, x2, 100, 100);
                    x1=x1+100;
                    }
		if(j%2==1) {
                    g.setColor(colorcuadro2);
                    g.fillRect(x1, x2, 100, 100);
                    x1=x1+100;
		}	
		}
		if(i%2==0) {
                    if(j%2==1) {
			g.setColor(colorcuadro1);
			g.fillRect(x1, x2, 100, 100);
			x1=x1+100;
			}
                    if(j%2==0) {
			g.setColor(colorcuadro2);
                        g.fillRect(x1, x2, 100, 100);
			x1=x1+100;
                        }	
	}
		}
x2=x2+100;
x1=0;		
} 
	
//dibujacion fichas
int ficha=1;
for (i = 1; i < 9; i++) {
       if (i==4|i==5) continue;
        for (j = 1; j < 9; j++) {
            if (i%2==1) {
                if (j%2==0) {
               // posicionfichax=((ficha*200)-95);
               if(ficha>0 || ficha>=4){
            posicionfichax=((ficha*200)-100);
        }
        if(ficha>4 || ficha<=8){
            posicionfichax=((ficha*200)-1000);
        }
         if(ficha>8 || ficha<=12){
            posicionfichax=((ficha*200)-1700);
        }
         if (ficha>12 || ficha<=16){
            posicionfichax=((ficha*200)-2600);
         }
         if (ficha>16 || ficha<=20){
            posicionfichax=((ficha*200)-3300);
         }
         if (ficha>20 || ficha<=24){
            posicionfichax=((ficha*200)-4400);
         } 
               if (ficha<0 && ficha>=12){
                    g.setColor(colorficha1);
                    g.fillOval(posicionfichax,c2,90, 90);
                }
                else{
                    g.setColor(colorficha2);
                    g.fillOval(posicionfichax,c2,90, 90);
                }
                ficha=ficha+1;                    
//                matriztablero[i][j]=ficha;
                ficha=ficha+1;
                }
                if (j%2==1){
//                  matriztablero[i][j]=0;
                }
                }
            if (i%2==0) {
                if (j%2==1) {
//                    matriztablero[i][j]=0;
                }
                if (j%2==0){
                posicionfichax=((ficha*200)-95);
                if (ficha<12 && ficha>=24){
                    g.setColor(colorficha1);
                    g.fillOval(posicionfichax,c2,90, 90);
                }
                else{
                    g.setColor(colorficha2);
                    g.fillOval(posicionfichax,c2,90, 90);
                }
//              ficha=ficha+1; 
 //               matriztablero[i][j]=ficha;
                } 
            }
}
        
c2=c2+100;    }
}
}


