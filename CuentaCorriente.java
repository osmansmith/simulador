
public class CuentaCorriente extends CuentaVista
{
    // instance variables - replace the example below with your own
    private int limiteSobregiro=500000;
    private int sobregirado=0;
    public CuentaCorriente(int cuenta, int tipo, String cliente, int mGirosDiarios)
    {
        super(cuenta, tipo, cliente, mGirosDiarios);
       
    }

    private boolean permiteSobregiro(){
        boolean bandera=false;
        if (sobregirado<limiteSobregiro){
            bandera=true;
        }     
        return(bandera);
    }
    
    private void hacerSobregiro(int monto){
        
       this.sobregirado=this.sobregirado+monto;
    }
    public String toString(){
        String descripcion="Numero de cuenta: "+this.nroCuenta+"\nTipo de cuenta: "+this.tipoCuenta+"\nCliente: "+this.cliente;
        descripcion=descripcion+"\nNumero de giros: "+this.nroGirosA+"\nSaldo Disponible: "+ this.saldo+"\nmonto girado hoy: "+this.giradoHoy+"\n";
        return(descripcion);
    }
    

}
