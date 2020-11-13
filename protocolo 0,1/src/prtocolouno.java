import java.applet.*;
import java.awt.*;
public class prtocolouno extends Applet {
    int matriztablero[][] = new int [9][9];
    int i, j;
    int ficha=1;
    int poscuadrox=0;
    int poscuadroy=0;
    int posfichaunox;
    int posfichadosx;
    int posfichaunoy;
    int posfichadosy;
    Color colorcuadro1=new Color(46, 64, 83);
    Color colorcuadro2=new Color(112, 123, 124 );
    Color colorficha1=new Color(231, 76, 60 );
    Color colorficha2=new Color(241, 196, 15 );
  class tablero8x8 extends Applet {
	Color colorcuadro1=new Color(46, 64, 83);
    Color colorcuadro2=new Color(112, 123, 124 );
    Color colorficha1=new Color(231, 76, 60 );
    Color colorficha2=new Color(241, 196, 15 );
	public void paint (Graphics g) {
		int x1=0;
		int x2=0;
		int c1=5;
		int c2=5;
for (int i=1; i<=8; i++) {
		for (int j=1; j<=8; j++) {
				if(i%2==1) {
					if(j%2==0) {		
						g.setColor(colorcuadro1);
						g.fillRect(x1, x2, 100, 100);
						g.setColor(colorficha1);
						g.fillOval(c1, c2, 90, 90);
						x1=x1+100;
						c1=c1+100;
						}
					if(j%2==1) {
						g.setColor(colorcuadro2);
						g.fillRect(x1, x2, 100, 100);
						x1=x1+100;
						c1=c1+100;
						}	
					}
				if(i%2==0) {
					if(j%2==1) {
						g.setColor(colorcuadro1);
						g.fillRect(x1, x2, 100, 100);
						g.setColor(colorficha1);
						g.fillOval(c1, c2, 90, 90);
						x1=x1+100;
						c1=c1+100;
							}
					if(j%2==0) {
						g.setColor(colorcuadro2);
						g.fillRect(x1, x2, 100, 100);
						x1=x1+100;
						c1=c1+100;
				}	
	}
		}
		x2=x2+100;
		x1=0;
		c1=5;
		c2=c2+100;
		
}
		
	}

}
    public void paint(Graphics g) {
   for (i = 1; i < 9; i++) {
       if (i==4|i==5) 
        for (j = 1; j < 9; j++) {
            if (i%2==1) {
                if (j%2==1) {
                matriztablero[i][j]=ficha;
                ficha=ficha+1; 
                    g.setColor(colorcuadro1);
                    g.fillRect(poscuadrox, poscuadroy, 100, 100);
                    poscuadrox=poscuadrox+100;                   
                }
                if (j%2==0){
                g.setColor(colorcuadro2);
                    g.fillRect(poscuadrox, poscuadroy, 100, 100);
                    poscuadrox=poscuadrox+100;    
                }
                }
            if (i%2==0) {
                if (j%2==1) {
                    g.setColor(colorcuadro2);
                    g.fillRect(poscuadrox, poscuadroy, 100, 100);
                    poscuadrox=poscuadrox+100;                 
                }
                if (j%2==0){
                g.setColor(colorcuadro1);
                    g.fillRect(poscuadrox, poscuadroy, 100, 100);
                    poscuadrox=poscuadrox+100;    
                } 
            }
}
 poscuadrox=0;
poscuadroy=poscuadroy+100; 
   }
}
}

