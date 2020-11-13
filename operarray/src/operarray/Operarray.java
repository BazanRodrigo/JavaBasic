package operarray;
import java.io.*;
public class Operarray {
   int elim;
int nuevo;
int aux;
int lista []=new int [10];
int bus;
int pos;
boolean encontrado=false;
BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
//introduccion de valores al arreglo
void llenar()throws IOException
        {
            System.out.println(" Introduce los valores de tu arreglo");
            for (int i = 0; i < lista.length; i++) {
                System.out.println("Introduce el valor para la posicion ["+i+"]");
                lista [i]=Integer.parseInt(teclado.readLine());
            }
        }
void mostrar()
{
    for (int i = 0; i < lista.length; i++) {
        System.out.println("Valor registrado en la posicion ["+i+"]------>"+lista[i]);
    }
}
void buscar() throws IOException
        {
            System.out.println("Ingresa el valor a buscar");
            bus=Integer.parseInt(teclado.readLine());
            for (int j = 0; j < lista.length && !encontrado; j++) {
                if (lista[j]==bus) {
                    pos=j;
                    encontrado = true;                           
                }
            }
            if(pos<0)
                System.out.println("el elemento que busca no está en la lista");
            else
                System.out.println("El elemento "+lista[pos]+" fue encontrado en la posicion ["+pos+"]");
        }
void ordenar(){
        System.out.println("Lista ordenada ");
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length-1; j++) {
                if (lista[j]>lista[j+1]) {
                    aux=lista[j];
                    lista[j]=lista[j+1];
                    lista[j+1]=aux;
                }
            }
        }
    }
void modificar()throws IOException {
        encontrado=false;
        System.out.println("Introduce el número a modificar:");
        bus=Integer.parseInt(teclado.readLine());
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]==bus) {
                pos=i;
                encontrado=true;                       
            }
        }
        if (encontrado==true) {
            System.out.println("Ingresa el nuevo valor");
            nuevo=Integer.parseInt(teclado.readLine());
            lista[pos]=nuevo;                
        }
        else {
            System.out.println("Da otro valor");
        }
        System.out.println("Lista nueva con el elemento modificado");
    }
    void eliminar()throws IOException{
        encontrado=false;
        System.out.println("Ingresa el valor a eliminar");
        bus=Integer.parseInt(teclado.readLine());
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]==bus) {
                pos=i;
                encontrado=true;
            }
            if (encontrado==true) {
                lista[pos]=0;
                System.out.println("Elemento eliminado");
            }
            else{
                System.out.println("Da otro valor");
            }
            System.out.println("Lista actualizada");
        }
        
    }
    
    public static void main(String[] args) throws IOException {
        Operarray oper = new Operarray();
        oper.llenar();
        System.out.println("Mostrar Datos");
        oper.mostrar();
        System.out.println("Busqueda");
        oper.buscar();
        oper.mostrar();
        System.out.println("Ordenar");
        oper.ordenar();
        oper.mostrar();
        System.out.println("Modificar");
        oper.modificar();
        oper.mostrar();
        System.out.println("Eliminar");
        oper.eliminar();
        oper.mostrar();
}
}
