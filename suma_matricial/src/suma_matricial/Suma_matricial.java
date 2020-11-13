package suma_matricial;
import java.io.*;
import java.util.Scanner;
public class Suma_matricial {
    Scanner teclado = new Scanner(System.in);
    int matriz1[];
    int matriz2[];
    int matrizt[];
    int dimension;
    void dimension() {
        System.out.println("Ingresa una dimension");
        dimension = teclado.nextInt();
}
    void llenar() {
         for (int i = 0; i < dimension; i++) {
            System.out.println("Ingresa el elemento para la matriz 1 posicion[1,"+i+"]");
            matriz1[i] = teclado.nextInt();
        }
         for (int i = 0; i < dimension; i++) {
            System.out.println("Ingresa el elemento para la matriz 2 posicion[1,"+i+"]");
            matriz2[i] = teclado.nextInt();
        }
        }
    
void mostrar() {
      System.out.println("Matriz 1");
        for (int i = 0; i < dimension; i++) {
            System.out.print("elemento "+i+" de la matriz 1 = "+matriz1[i]);
        }
            System.out.println("Matriz 2");
         for (int i = 0; i < dimension; i++) {
            System.out.print("elemento "+i+" de la matriz 2 = ["+matriz2[i]);
        } 
    }
void sumar() {
    for (int i = 0; i < dimension; i++) {
        matrizt[i]=matriz1[i]+matriz2[i];
    }
}
void mostrar_suma(){
    System.out.print("[");
    for (int i = 0; i < dimension; i++) {
        System.out.print(matrizt[i]);
    }
    System.out.print("]");
}
    public static void main(String[] args) {
Suma_matricial suma= new Suma_matricial();
suma.dimension ();
suma.llenar();
suma.mostrar();
suma.sumar();
suma.mostrar_suma();
    }
    
}
