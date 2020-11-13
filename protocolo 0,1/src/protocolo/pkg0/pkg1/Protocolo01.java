package protocolo.pkg0.pkg1;
import java.io.*;
public class Protocolo01 {
    int tablero[][] = new int [9][9];
    int i, j;
    int ficha=1;
    
void tableronumerico (){
    for (i = 1; i < 9; i++) {
       if (i==4|i==5) continue;
        for (j = 1; j < 9; j++) {
            if (i%2==1) {
                if (j%2==0) {
                    tablero[i][j]=ficha;
                ficha=ficha+1;                    
                }
                if (j%2==1){
                    tablero[i][j]=0;
                }
                }
            if (i%2==0) {
                if (j%2==0) {
                    tablero[i][j]=0;
                }
                if (j%2==1){
                    tablero[i][j]=ficha;
                ficha=ficha+1;
                } 
            }
}
    }     
    }
void muestramatriz () {
            for ( i = 1; i < 9; i++) {
                for (j = 1; j < 9; j++) {
                    System.out.print(tablero[i][j]);
                    System.out.print("   ");
                }
                System.out.println("");
            }
}
    public static void main(String[] args) {
    Protocolo01 pt= new Protocolo01();
    pt.tableronumerico();
    pt.muestramatriz();
    }
    
}
