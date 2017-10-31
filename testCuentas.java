
/**
 * Write a description of class testCuentas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
public class testCuentas
{
    Random miRandom= new Random();
    CuentaVista miCV;
    CuentaVista ahorro;
    CuentaVista corriente;
    Scanner miSc=new Scanner(System.in);
    int opc = 4;
    public testCuentas()
    {
            menu();
    }
    
    private void printMio(String aimprimir){
        System.out.println(aimprimir);
    }
    
    private void menu(){
        try
        {
            while (opc>0){
                //printMio("\u000C");                
                printMio("[1] Crear Cuenta Vista ");
                printMio("[2] Crear Cuenta de Ahorro");
                printMio("[3] Crear Cuenta Corriente");
                printMio("[9] Simular cajero");
                printMio("[0] Salir");
                printMio("");
                System.out.print("Ingrese opción : ");
                opc = miSc.nextInt();              
                defineAccion(opc);
            }
        }catch(Exception ex)
        {
            printMio("Error en selección de menú : "+ex);
            opc = 0;
        }
    }
    
    private void defineAccion(int seleccion){
        try
        {
            switch (seleccion){
                    case 1:
                            creaCVista();
                            break;
                    case 2:
                            creaCAhorro();
                            break;
                    case 3: 
                            creaCCorriente();
                            break;
                    case 9: 
                            simCajero();
                            break;
                    case 0:
                    printMio("\u000C");
                    printMio("Ádios");
                            break;
                    default:
                      System.out.println("Opción incorrecta, intentelo nuevamente");
                      this.pregunta();
                      
                    break;
            }
        }catch(Exception ex)
        {
            System.out.print("Error en primera selección : "+ex);
             opc = 0;
        }
    }
    private void defineAccion2(int seleccion){
        try
        {
        int monto;
        switch (seleccion){
    
                case 1:
                        printMio("Ingrese monto a girar");
                        monto=miSc.nextInt();
                        if(miCV.permiteGiro(monto)==true){
                            if(miCV.girar(monto)==true){
                             printMio("Giro realizado");   
                            }
                            else{
                              printMio("Opsss");   
                            }
                        }else{
                            printMio("Saldo insuficiente");
                        }
                        printMio(miCV.toString());
                        break;
                case 2:
                        printMio("Ingrese el monto a depositar");
                        monto=miSc.nextInt();
                        miCV.deposito(monto);
                        printMio(miCV.toString());
                        this.pregunta();
                        break;                  
        } 
        }
        catch(Exception ex)
        {
            System.out.print("Error en el cajero : "+ex);
            opc = 0;
        }
    }
    private void simCajero(){
        printMio("[1] Para girar");
        printMio("[2] Para depositar");
        System.out.print("Ingrese opción : ");
        int seleccion=miSc.nextInt();
        defineAccion2(seleccion);
    }
    private void creaCVista(){
        try
        {
            printMio("");
            printMio("Generando numero de cuenta....");
            int nc=generaNumeroCuenta();
            System.out.print("Ingrese rut de cliente : ");
            String cliente=miSc.next();
            miCV=new CuentaVista(nc, 1, cliente, 5);
            printMio("");
            printMio(miCV.toString());            
            pregunta();                                           
        }catch(Exception ex)
        {
            System.out.print("Error en creando cuenta : "+ex);     
            opc = 0;
        }
    }
    private void creaCCorriente(){
        try
        {
            printMio("");
            printMio("Generando numero de cuenta....");
            int nc=generaNumeroCuenta();
            System.out.print("Ingrese rut de cliente : ");
            String cliente=miSc.next();
            corriente=new CuentaVista(nc, 3, cliente, 1000);
            printMio("");
            printMio(corriente.toString());            
            pregunta();                                           
        }catch(Exception ex)
        {
            System.out.print("Error en creando cuenta : "+ex);     
            opc = 0;
        }
    }
    private void creaCAhorro(){
        try
        {
            printMio("");
            printMio("Generando numero de cuenta....");
            int nc=generaNumeroCuenta();
            System.out.print("Ingrese rut de cliente : ");
            String cliente=miSc.next();
            ahorro=new CuentaVista(nc, 2, cliente, 3);
            printMio("");
            printMio(ahorro.toString());            
            pregunta();                                           
        }catch(Exception ex)
        {
            System.out.print("Error en creando cuenta : "+ex);     
            opc = 0;
        }
    }
    private int generaNumeroCuenta(){
        return(miRandom.nextInt());
    }
    
                
    /**
     * Metodo para usar después de una transacción 
     */
    
    private void pregunta()
    {
        try
        {
            printMio("[1] Volver al menú");
            printMio("[0] Salir");
            Scanner teclado=new Scanner(System.in);
            int val = teclado.nextInt();
            System.out.print("\u000C");
            switch(val)
            {
                case 1:
                    System.out.print("\u000C");
                    this.menu();
                break;
                case 0:
                    opc = 0;
                    this.defineAccion(val);
                break;
                default:
                     System.out.println("Opción incorrecta, podria ser menos troll?");
                     this.pregunta();
                break;
            
            }            
        }catch(Exception ex)
        {
            System.out.println("Error fatal, todo se fue a la b : "+ex);
            opc = 0;
        }
    }
    
           
}
