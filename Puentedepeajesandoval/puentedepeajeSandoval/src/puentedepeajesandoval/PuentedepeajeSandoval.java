package puentedepeajesandoval;
import java.io.*;
import java.awt.*;
import java.util.Scanner;
public class PuentedepeajeSandoval {
    public static void main(String[] args) throws IOException {
        int opcion;
    double pago;
    double eje;
    Scanner teclado = new Scanner(System.in);    
        System.out.println("Puente de peaje sandoval vallarta \n");
        System.out.println("1) persona___________$5.00");
        System.out.println("2) Bicicleta_________$7.50");
        System.out.println("3) Motocicleta_______$18.75");
        System.out.println("4) Triciclo__________$20.00");
        System.out.println("5) Automovil_________$42.00");
        System.out.println("6) Camioneta_________$62.00");
        System.out.println("7) Autobus___________$123.00");
        System.out.println("8) Trailer___________$150.00");
        System.out.println("¿Què movil cruza? \n");
        opcion = teclado.nextInt();
        System.out.println("Ingrese su efectivo");
        pago = teclado.nextDouble();
        if (opcion==1){
            System.out.println("Cruza persona");
            System.out.println("ingresa $"+pago);
            if (pago >=5){
                System.out.println("Su cambio es de $"+(pago-5));
                System.out.println("Cruza \n ¡Feliz viaje!");
        }else   
                System.out.println("Su faltante "+(pago-5)+"\n ¡No cruza!");
            
        }
        if (opcion==2){
            System.out.println("Cruza Bicicleta");
            System.out.println("ingresa $"+pago);
            if (pago >=7.50){
                System.out.println("Su cambio es de $"+(pago-7.50));
                System.out.println("Cruza \n ¡Feliz viaje!");
            }    else
                System.out.println("Su faltante "+(pago-7.50)+"\n ¡No cruza!");
            }
       
        if (opcion==3){
            System.out.println("Cruza motocilceta");
            System.out.println("ingresa $"+pago);
            if (pago >=18.75){
                System.out.println("Su cambio es de $"+(pago-18.75));
                System.out.println("Cruza \n ¡Feliz viaje!");
        }else 
                System.out.println("Su faltante "+(pago-18.75)+"\n ¡No cruza!");
            }
       
        if (opcion==4){
            System.out.println("Cruza triciclo");
            System.out.println("ingresa $"+pago);
            if (pago >=20){
                System.out.println("Su cambio es de $"+(pago-20));
                System.out.println("Cruza \n ¡Feliz viaje!");
            }else
                System.out.println("Su faltante "+(pago-20)+"\n ¡No cruza!");
       
        }
        if (opcion==5){
            System.out.println("Cruza Automovil");
            System.out.println("ingresa $"+pago);
            if (pago >=42){
                System.out.println("Su cambio es de $"+(pago-42));
                System.out.println("Cruza \n ¡Feliz viaje!");
            }else
                System.out.println("Su faltante "+(pago-42)+"\n ¡No cruza!");
       
        }
        if (opcion==6){
            System.out.println("Cruza Camioneta");
            System.out.println("ingresa $"+pago);
            if (pago >=62){
                System.out.println("Su cambio es de $"+(pago-62));
                System.out.println("Cruza \n ¡Feliz viaje!");
            }else
                System.out.println("Su faltante "+(pago-62)+"\n ¡No cruza!");
        }
       
        if (opcion==7){
            System.out.println("Cruza Autobus");
            System.out.println("ingresa $"+pago);
            if (pago >=123){
                System.out.println("Su cambio es de $"+(pago-123));
                System.out.println("Cruza \n ¡Feliz viaje!");
            }else
                System.out.println("Su faltante "+(pago-123)+"\n ¡No cruza!");
       
        }
        if (opcion==8){
            System.out.println("Cruza trailer");
            System.out.println("Ingresa el número de de ejes de el trailer (recuerda que por cada eje extra se cobran 20 pesos a la tarifa  )");
            eje = teclado.nextInt();
            System.out.println("ingresa $"+pago);
            if (pago >=(150+(eje*20))){
                System.out.println("Su cambio es de $"+((pago)-(150+(eje*20))));
                System.out.println("Cruza \n ¡Feliz viaje!");
            }else 
                System.out.println("Su faltante "+((pago)-(150+(eje*20)))+"\n ¡No cruza!");
        }
   
    }
    
}
