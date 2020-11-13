package pkgswitch;
public class Switch {
    public static void main(String[] args) {
char calf='B';
        System.out.println("Obtenciòn de resultados:");
        switch (calf){  
            case 'A':
                System.out.println("¡felicidades sacaste una A!");
                break;
            case 'B':
                System.out.println("¡Bien, obtuviste una B!");
                break;
            case 'C':
                System.out.println("¡Suficiente sacaste una C!");
                break;
            case 'D':
                System.out.println("¡No hay excusa, hay que estudiar màs!");
                break;
            default:
                System.out.println("¡Calificaciòn reporobatoria o invalida!");
        }
}
}