package puentedepeajeSwitch;
import java.io.*;
import static java.lang.Float.parseFloat;
public class PuentedepeajeSwitch {
    public static void main(String[] args) throws IOException {
    int opcion;
    double eje;
    double precio_persona = 5.00;
    double precio_bicicleta = 7.50;
    double precio_motocicleta = 18.75;
    double precio_triciclo = 20.00;
    double precio_automovil = 42.00;
    double precio_camioneta = 62.00;
    double precio_autobus = 123.00;
    double precio_trailer = 150.00;
    double precio_eje = 20.00;
    double efectivo;
    double cambio;
    double falta;
    BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));    
        System.out.println("Puente de peaje sandoval vallarta \n");
        System.out.println("1) persona___________$"+precio_persona);
        System.out.println("2) Bicicleta_________$"+precio_bicicleta);
        System.out.println("3) Motocicleta_______$"+precio_motocicleta);
        System.out.println("4) Triciclo__________$"+precio_triciclo);
        System.out.println("5) Automovil_________$"+precio_automovil);
        System.out.println("6) Camioneta_________$"+precio_camioneta);
        System.out.println("7) Autobus___________$"+precio_autobus);
        System.out.println("8) Trailer___________$"+precio_trailer);
        System.out.println("¿Què movil cruza? \n");
        opcion = Integer.parseInt(teclado.readLine());
        System.out.println("Ingrese su efectivo");
        efectivo = parseFloat(teclado.readLine());
        switch(opcion){
        case 1:
            cambio=efectivo-precio_persona;
            falta=precio_persona-efectivo;
            System.out.println("Cruza persona");
            System.out.println("ingresa $"+efectivo);
            if (efectivo >=precio_persona){
                System.out.println("Su cambio es de $"+cambio);
                System.out.println("Cruza \n ¡Feliz viaje!");
        }else                 
                System.out.println("Su faltante "+falta+"\n¡No cruza!");
        break;    
        case 2:
            cambio=efectivo-precio_bicicleta;
            falta=precio_bicicleta-efectivo;
            System.out.println("Cruza Bicicleta");
            System.out.println("ingresa $"+efectivo);
            if (efectivo >= precio_bicicleta){
                System.out.println("Su cambio es de $"+cambio);
                System.out.println("Cruza \n ¡Feliz viaje!");
            }    else
                System.out.println("Su faltante "+falta+"\n¡No cruza!");
        break;
        case 3:
            System.out.println("Cruza motocilceta");
            System.out.println("ingresa $"+efectivo);
            cambio=efectivo-precio_motocicleta;
            falta=precio_motocicleta-efectivo;
            if (efectivo >=precio_motocicleta){
                System.out.println("Su cambio es de $"+cambio);
                System.out.println("Cruza \n ¡Feliz viaje!");
        }else 
                System.out.println("Su faltante "+falta+"\n ¡No cruza!");
       break;
        case 4:
            System.out.println("Cruza triciclo");
            System.out.println("ingresa $"+efectivo);
            cambio=efectivo-precio_triciclo;
            falta=precio_triciclo-efectivo;
            if (efectivo >=precio_triciclo){
                System.out.println("Su cambio es de $"+cambio);
                System.out.println("Cruza \n ¡Feliz viaje!");
            }else
                System.out.println("Su faltante "+falta+"\n ¡No cruza!");
       break;
        case 5:
            System.out.println("Cruza Automovil");
            System.out.println("ingresa $"+efectivo);
            cambio=efectivo-precio_automovil;
            falta=precio_automovil-efectivo;
            if (efectivo >=precio_automovil){
                System.out.println("Su cambio es de $"+cambio);
                System.out.println("Cruza \n ¡Feliz viaje!");
            }else
                System.out.println("Su faltante "+falta+"\n ¡No cruza!");
       break;
        case 6:
            System.out.println("Cruza Camioneta");
            System.out.println("ingresa $"+efectivo);
            cambio=efectivo-precio_camioneta;
            falta=precio_camioneta-efectivo;
            if (efectivo >=precio_camioneta){
                System.out.println("Su cambio es de $"+cambio);
                System.out.println("Cruza \n ¡Feliz viaje!");
            }else
                System.out.println("Su faltante "+falta+"\n ¡No cruza!");
       break;
        case 7:
            System.out.println("Cruza Autobus");
            System.out.println("ingresa $"+efectivo);
            cambio=efectivo-precio_autobus;
            falta=precio_autobus-efectivo;
            if (efectivo >=123){
                System.out.println("Su cambio es de $"+cambio);
                System.out.println("Cruza \n ¡Feliz viaje!");
            }else
                System.out.println("Su faltante "+falta+"\n ¡No cruza!");
       break;
        case 8:
            System.out.println("Cruza trailer");
            System.out.println("Ingresa el número de de ejes de el trailer (recuerda que por cada eje extra se cobran 20 pesos a la tarifa  )");
            eje = Integer.parseInt(teclado.readLine());
            System.out.println("ingresa $"+efectivo);
            cambio=efectivo-(precio_trailer+(eje*precio_eje));
            falta=(precio_trailer+(eje*precio_eje))-(efectivo);
            if (efectivo >=(150+(eje*20))){
                System.out.println("Su cambio es de $"+cambio);
                System.out.println("Cruza \n ¡Feliz viaje!");
            }else 
                System.out.println("Su faltante "+falta+"\n ¡No cruza!");
        break;
        default:
            if (opcion <=0 | opcion >=8)
            System.out.println("Opcion invalida, las opciones solo son del 1 al 7");
            else {
                    System.out.println("Caracteres invalidos");                    
                 }
        }
    }  
}