
/**
 * Write a description of class CuentaAhorro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuentaAhorro extends CuentaVista
{
    private double tasaInteres = 3.16;
     
    /**
     * Constructor for objects of class CuentaAhorro
     */
    public CuentaAhorro(int cuenta, int tipo, String cliente, int mGirosDiarios)
    {
        super(cuenta, tipo, cliente, mGirosDiarios);
       
    }
    
    private void calculaInteres(int monto){
        this.saldo = (monto * tasaInteres)/100;    
    }
     public String toString(){
        String descripcion="Numero de cuenta: "+this.nroCuenta+"\nTipo de cuenta: "+this.tipoCuenta+"\nCliente: "+this.cliente;
        descripcion=descripcion+"\nNumero de giros: "+this.nroGirosA+"\nSaldo Disponible: "+ this.saldo+"\nmonto girado hoy: "+this.giradoHoy+"\n";
        return(descripcion);
    }
}
