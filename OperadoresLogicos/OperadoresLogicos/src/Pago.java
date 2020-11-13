public class Pago {
    public static void main(String[] args) {
    short sueldosemana1=700;
    int dias_de_semana=7;
    float deuda_a_pagar=3578.35f;
    double hipoteca=10354.45f;
    long capital_ahorrado=10000;
    double sueldoMensual;
    long x,y,z,w;
        System.out.println("\t datos de pago de una deuda \n");
        System.out.println("\t sueldo semana: "+sueldosemana1+"\n\t hipoteca"+hipoteca);
        System.out.println("\t deuda a externa: "+deuda_a_pagar+"\n\t dias de la semana:"+dias_de_semana);
        System.out.println("\t capital ahorrado: "+capital_ahorrado);
        System.out.println("\t sueldo diario: "+(sueldosemana1/dias_de_semana));
        System.out.println("\t deuda total: "+(hipoteca+deuda_a_pagar));
        System.out.println("\t pago a cuenta: "+capital_ahorrado);
        System.out.println("\t resta por pagar: "+(capital_ahorrado-(deuda_a_pagar+hipoteca)));
        System.out.println("\t Ingreso a el mes: "+(sueldosemana1*4)); 
        sueldoMensual=sueldosemana1*4;
        System.out.println("\t meses para pagar deuda restante: "+(capital_ahorrado-(deuda_a_pagar+hipoteca))/sueldoMensual);
        System.out.println("\t resto, despues de pagar con el sueldo mensual: "+((capital_ahorrado-(deuda_a_pagar+hipoteca))%sueldoMensual));
    
    }
    
}
