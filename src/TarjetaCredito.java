public class TarjetaCredito {

    private String NumTarjetaCR;
    private String NumTarjetaCREnmascarada;

    public TarjetaCredito(){
        this.NumTarjetaCR = "";
        this.NumTarjetaCREnmascarada = "";
    }

    public TarjetaCredito( String NumTarjetaCR ){
        this.NumTarjetaCR = NumTarjetaCR;
        this.NumTarjetaCREnmascarada = "";
    }

    protected String getNumTarjetaCR() {
        return this.NumTarjetaCR;
    }

    protected String getNumTarjetaCREnmascarada() { return this.NumTarjetaCREnmascarada; }

    protected void setNumTarjetaCR( String numTarjetaCR ) {
        this.NumTarjetaCR = numTarjetaCR;
    }

    protected boolean validarFormatoNumTarjetaCR(){

      boolean varIntermedia = false;

      if( NumTarjetaCR.trim().length() == 19 ) {
        if( NumTarjetaCR.trim().matches("[0-9]+"+"[ ]+"+"[0-9]+"+"[ ]"+"[0-9]+"+"[ ]+"+"[0-9]+") ){
            System.out.println("La cadena cumple con los parámetros requeridos.");
            varIntermedia = true;
        }else{
            System.out.println("La cadena tiene una longitud de 19 caractéres, sin embargo, no cumple con el formato >>6543 8756 6342 9846<<");
        }
      }else{
          System.out.println("La cadena debe contener 19 caractéres, 16 dígitos y 3 espacios");
          varIntermedia = false;
      }

        return varIntermedia;
    }

    protected void enmascararNumerosTarjetaCRSubString(){
        this.NumTarjetaCREnmascarada = this.NumTarjetaCR.substring(0,4) + " " + "XXXX" + " " + "XXXX" + " " + this.NumTarjetaCR.substring(15,19);
    }

    protected void enmascararNumerosTarjetaCRPorCiclos(){

        String cadInicialNumeros = this.NumTarjetaCR;
        char caracter;
        String cadFinalNumeros = "";

        for (int i = 0; i < cadInicialNumeros.length(); ++i) {
            if( i <= 4 || i >= 15  ){
                caracter = cadInicialNumeros.charAt(i);
            }else if( cadInicialNumeros.charAt(i) == ' '){
                caracter = ' ';
            }else{
                caracter = 'X';
            }
            cadFinalNumeros = cadFinalNumeros.concat( caracter + "" ) ;
        }
        this.NumTarjetaCREnmascarada = cadFinalNumeros;
    }

}
