package dowhile2018;
import java.io.*;
import java.awt.*;
import java.util.Scanner;
public class Dowhile2018 {
    public static void main(String[] args) throws IOException  {
int nota;
int contador=0;
int total=0;
double promedio;
boolean salida=false;
Scanner teclado=new Scanner(System.in);
        System.out.println("Calculo del promedio con Do while");
        System.out.println("Introduce un valor negativo para finalizar");
        do {
            System.out.println("Introduzca su nota "+(contador+1)+":");
            nota = teclado.nextInt();
            if (nota==10)
                total=total+10;
            else if (nota==9)
                total=total+9;
            else if (nota==8)
                total=total+8;
            else if (nota==7)
                total=total+7;
            else if (nota==6)
                total=total+6;
            else if (nota==5)
                total=total+5;
            else if (nota==4)
                total=total+4;
            else if (nota==3)
                total=total+3;
            else if (nota==2)
                total=total+2;
            else if (nota==1)
                total=total+1;
            else if (nota==0)
                total=total+0;
            else if (nota>10){
                System.out.println("Valor incorrecto");
                System.out.println("Reinicia el conteo");
                salida=true;
                break;
            }
            contador=contador+1;
            if ((salida=false) && (nota<0)){
            promedio=total/(contador-1);
                System.out.println("El promedio de las calificaciones es de "+(promedio));
            }
        } while (nota>0);
        
        
    }
    
}
