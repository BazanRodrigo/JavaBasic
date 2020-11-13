
public class inc_dec {
    public static void main(String[] args) {
    int x=5;
    int y=3;
    int z=2;
        System.out.println("Haciendo incrementos y decrementos y asiganciones"
                + "");
        System.out.println("Separador");
        System.out.println("El incremento de"+x+"++"+"="+(x++));
        System.out.println("El valor de x="+(x));
        System.out.println("Separador");
        System.out.println("El incremento de"+"++"+ y +"="+(++y));
        System.out.println(y);
        System.out.println("Separador");
        System.out.println("La suma incrementada de"+x+"++"+""+"+"+y+"="+(x++ +y));
        System.out.println(x);
        System.out.println("Separador");
        System.out.println("El decremento de "+x+"+"+"--"+y+"="+(x+ --y));
    }
    
}
