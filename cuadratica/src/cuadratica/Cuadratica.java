package cuadratica;
import java.io.*;
    import java.util.Scanner;
    import java.awt.*;
public class Cuadratica {    
    public static void main(String[] args)  throw IOException{
Scanner teclado=new Scanner(System.in);
        double a,b,c,re,im,disc;
        System.out.println("Calculo de todas las soluciones de una ecuacion cuadratica");
        System.out.println("__________________________________________________________");
        System.out.println("Ingresa el valor de la variable a"); a=teclado.nextDouble();
        System.out.println("Ingresa el valor de la variable B"); b=teclado.nextDouble();
        System.out.println("Ingresa el valor de la variable c"); c=teclado.nextDouble();
        if ((a==0) & (b==0) & (c==0))
            System.out.println("Es una tautologia y existen infinitas soluciones");
        else if ((a==0) && (b==0) & (c!=0))
            System.out.println("Es una ecuacion degenerada y no hay solucion");
        else if ((a==0) && (c!=0))
            System.out.println("Existe una unica solucion y es "+(-c/b));
        else if ((a!=0) && (c==0)){
            System.out.println("Existen dos soluciones \n");
        System.out.println("X1=0 \n");
        System.out.println("X2= "+(-b/a));
        }
        else{
        disc=Math.pow(b,2)-4*a*c;
        re=-b/(2*a);
        im=Math.sqrt(Math.abs(disc))/(2*a);
        if (disc>=0){
            System.out.println("las soluciones son reales");
            System.out.println("X1= "+(re+im));
            System.out.println("X2= "+(re-im));
        }
        else{
            System.out.println("Las soluciones son complejas");
            System.out.println("X1"+"("+re+"+i"+im+")");
            System.out.println("X2"+"("+re+"-i"+im+")");
                }
    }
    }
