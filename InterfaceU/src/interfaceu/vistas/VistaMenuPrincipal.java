
package interfaceu.vistas;

import interfaceu.presentadores.ContratoPresentadorMenuPrincipal;
import interfaceu.presentadores.PresentadorMenuPrincipal;
import java.util.Scanner;


public class VistaMenuPrincipal implements ContratoVistaMenuPrincipal{
    
    ContratoPresentadorMenuPrincipal presentador;

    public VistaMenuPrincipal() {
        this.presentador = new PresentadorMenuPrincipal(this);
        this.presentador.iniciar();
    }
    
    
    @Override
    public void mostrarMenuPrincipal() {
        Scanner scan=new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("<<<<<<<<<<Menu Principal>>>>>>>>>>");
        System.out.println("------------------------------------");
        System.out.println("_____Opciones:_____");
        System.out.println("1_Tomar Nuevo Pedido");
        System.out.println("2_Administrar Pedidos");
        System.out.println("3_Consultar Estado de pedido");
        System.out.println("4_Administrar Sistema como Administrador");
        System.out.println("5-Reportes Y Estadisticas");
        int opcion=scan.nextInt();
        this.presentador.procesarOpcionIngresada(opcion);
        
    }

    
    @Override
    public void mostrarOpcionInexistente() {
        System.out.println("XXXXXERRORXXXXXX");
        System.out.println("Opcion Ingresada Invalida");
    }
 
}
