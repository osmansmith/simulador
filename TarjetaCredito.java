
/**
 * Write a description of class TarjetaCredito here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TarjetaCredito extends Cuentas
{
    private int limiteComprasNacional=1000000;
    private int limiteComprasInternacional=1000;
    private int avanceEfectivo=300000;
    private int cupoUtilizadoN=0;
    private int cupoUtilizadoI=0;
    private int cupoAvanceUtilizado=0;
    
    /**
     * Constructor for objects of class TarjetaCredito
     */
    public TarjetaCredito(int ncuentas, int tipoC, String cliente)
    {
        super(ncuentas, tipoC, cliente);       
    }
    
    /**
     * Setters
     */
    
    private void setCupoN(int cupoN)
    {
      this.cupoUtilizadoN = cupoN;
    }
    private void setCupoI(int cupoI)
    {
      this.cupoUtilizadoI = cupoI;
    }
    private void setCupoAva(int cupoA)
    {
      this.cupoAvanceUtilizado = cupoA;
    }
    
    public String toString(){
      return("Algo");  
    }

}
