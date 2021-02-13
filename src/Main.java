import java.util.Scanner;

public class Main {
    
    public Main() {
    }
    
    public static void main( String[] args ){

        //String cadNumTarjetaCR = " 5465 4567 9876 0978     ";
        String cadNumTarjetaCR;
        Scanner teclado = new Scanner(System.in);
        cadNumTarjetaCR = teclado. nextLine();

        TarjetaCredito tarjetaCredito = new TarjetaCredito();
        tarjetaCredito.setNumTarjetaCR( cadNumTarjetaCR.trim() );
        if( tarjetaCredito.validarFormatoNumTarjetaCR() ){
              tarjetaCredito.enmascararNumerosTarjetaCRSubString();
              System.out.println( tarjetaCredito.getNumTarjetaCREnmascarada());
              //Se modifica valor del atributo NumTarjetaCR de la clase para confirmar que efectúe los cambios por la función cilos.
              tarjetaCredito.setNumTarjetaCR( cadNumTarjetaCR.trim() );
              tarjetaCredito.enmascararNumerosTarjetaCRPorCiclos();
              System.out.println( tarjetaCredito.getNumTarjetaCREnmascarada());
        }
    }
}
