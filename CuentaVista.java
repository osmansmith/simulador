
/**
 * Write a description of class CuentaVista here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CuentaVista extends Cuentas
{
    // instance variables - replace the example below with your own
    protected int nroGirosA=0;
    protected double saldo=0;
    protected int montoGiroMaximoDiario;
    protected int giradoHoy=0;
    public CuentaVista(int cuenta, int tipo, String cliente, int mGirosDiarios)
    {
        super(cuenta, tipo, cliente);
        this.nroGirosA=mGirosDiarios;
    }
    protected void setGiros(int ngd){
        this.nroGirosA=ngd;
    }
    protected  void giroMaximo(int monto){
       this.montoGiroMaximoDiario=monto; 
    }
    public int getGiros(){
        return(this.nroGirosA);
    }
    public double getSaldo(){
        return(this.saldo);
    }
    public int getGirado(){
     return(this.giradoHoy);   
    }
    /***
     * Otros metodos
     */
    
    protected boolean permiteGiro(int montoGiro){
        if(this.saldo-montoGiro>=0){
            return(true);
        }
        else{
            return(false);
        }
    }
    protected boolean girar(int monto){
        this.saldo=this.saldo-monto;
        this.giradoHoy=this.giradoHoy+monto;
        return(true);
    }
    protected void deposito(int monto){
        this.saldo=this.saldo+monto;
    }
    public String toString(){
        String descripcion="Numero de cuenta: "+this.nroCuenta+"\nTipo de cuenta: "+this.tipoCuenta+"\nCliente: "+this.cliente;
        descripcion=descripcion+"\nNumero de giros: "+this.nroGirosA+"\nSaldo Disponible: "+ this.saldo+"\nmonto girado hoy: "+this.giradoHoy+"\n";
        return(descripcion);
    }

}
