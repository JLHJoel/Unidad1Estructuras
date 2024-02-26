//ejercicio 6 listas dobles
import java.util.Scanner;

public class Listax{
    
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        int opcion=0;
        String nombre;
        Nodo alumno = new Nodo();
        Lista filaBanco = new Lista();

        do{
        
        System.out.println("Listas dobles");
        System.out.println("Menu de opciones: ");
        System.out.println("1- Agregar nodo");
        System.out.println("2- Eliminar inicio");
        System.out.println("3- Eliminar final");
        System.out.println("4- Mostrar lista");
        System.out.println("5- Mostrar inverso");
        System.out.println("6- Eliminar por nombre");
        System.out.println("7- Salir");
        System.out.println("Ingrese una opcion: ");
        opcion = lector.nextInt();
        lector.nextLine();
        switch(opcion){
            case 1: 
            System.out.println("Cliente: ");
            nombre = lector.nextLine();
            filaBanco.insertar(nombre);
            break;
            case 2:
            if(filaBanco.vacia()!=true){
                System.out.println("Eliminando a " + filaBanco.inicio.elemento);
                filaBanco.eliminarInicio();
            }
            else{
                System.out.println("Fila vacia");
            }
            break;
            case 4:
            if(filaBanco.vacia()==true){
                System.out.println("Fila vacia");
            }
            else{
                System.out.println("Personas en fila");
                filaBanco.mostrar();
            }
            break;
            case 3:
            if(filaBanco.vacia()!=true){
                System.out.println("Eliminando a " + filaBanco.fin.elemento);
                filaBanco.eliminarFinal();
            }
            else{
                System.out.println("Fila vacia");
            }
            break;
            case 5:
            if(filaBanco.vacia()==true){
                System.out.println("Fila vacia");
            }
            else{
                System.out.println("Personas en fila inversa");
                filaBanco.mostrarInverso();
            }
            break;
            case 6:
            if(filaBanco.vacia()){
                System.out.println("No hay clientes en la fila");
            }
            else{
                System.out.println("Nombre a borrar: ");
                nombre = lector.nextLine();
                if(filaBanco.eliminar(nombre)==true){
                    System.out.println("Registro eliminado");
                }
                else{
                    System.out.println("Cliente no encontrado");
                }
        }
            break;
        }


        }while(opcion!=7);
       
    }
}
