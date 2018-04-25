
package interfaceu.presentadores;

import interfaceu.vistas.ContratoVistaMenuPrincipal;

public class PresentadorMenuPrincipal implements ContratoPresentadorMenuPrincipal{
    
    ContratoVistaMenuPrincipal vista;

    public PresentadorMenuPrincipal(ContratoVistaMenuPrincipal vista) {
        this.vista = vista;
    }

    public void iniciar() {
        vista.mostrarMenuPrincipal();
    
    }

    
    
    
    
    public void procesarOpcionIngresada(int opcion){
        switch (opcion){
            case 1:
                System.out.println("opcion 1 ingresada");
                break;
            case 2:
                System.out.println("opcion 2 ingresada");
                break;
            case 3:
                System.out.println("opcion 3 ingresada");
                break;
            case 4:
                System.out.println("opcion 4 ingresada");
                break;
            case 5:
                System.out.println("opcion 5 ingresada");
                break;
            default:
                vista.mostrarOpcionInexistente();
        }
    }    
    
    
}