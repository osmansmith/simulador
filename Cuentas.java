
/**
 * Abstract class Cuentas - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Cuentas
{
    // 
    protected int nroCuenta=0;
    protected int tipoCuenta=0;
    protected String cliente;
    public Cuentas(int cuenta, int tipo, String cliente){
        this.nroCuenta=cuenta;
        this.tipoCuenta=tipo;
        this.cliente=cliente;   
    }
    public abstract String toString();

}
