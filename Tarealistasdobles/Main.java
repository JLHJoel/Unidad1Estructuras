//Tarea listas dobles
//Lozano Hernandez Joel
package Tarealistasdobles;

import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        int opcion=0;
        String nombre, numcel;
    
        Lista clientes = new Lista();

        do{
        
        System.out.println("\nTarea listas dobles\n");
        System.out.println("Menu de opciones: ");
        System.out.println("1- Agregar cliente");
        System.out.println("2- Eliminar inicio");
        System.out.println("3- Eliminar final");
        System.out.println("4- Mostrar lista de clientes");
        System.out.println("5- Eliminar por nombre");
        System.out.println("6- Eliminar por celular");
        System.out.println("7- Salir");
        System.out.println("Ingrese una opcion: ");
        opcion = lector.nextInt();
        lector.nextLine();
        switch(opcion){
            case 1: 
            do{ // validar que no haya datos en blanco
                System.out.println("Nombre del cliente: ");
                nombre = lector.nextLine();
            }while(clientes.strvacio(nombre));
            do{ // validar que no haya datos en blanco
                System.out.println("Numero de celular: ");
                numcel = lector.nextLine();
            }while(clientes.strvacio(numcel));
            clientes.insertar(nombre, numcel);
            break;
            case 2:
            if(clientes.vacia()!=true){
                System.out.println("Eliminando a " + clientes.inicio.nombre);
                clientes.eliminarInicio();
            }
            else{
                System.out.println("Lista vacia");
            }
            break;
            case 4:
            if(clientes.vacia()==true){
                System.out.println("Lista vacia");
            }
            else{
                System.out.println("Clientes en la lista: \n");
                clientes.mostrar();
            }
            break;
            case 3:
            if(clientes.vacia()!=true){
                System.out.println("Eliminando a " + clientes.fin.nombre);
                clientes.eliminarFinal();
            }
            else{
                System.out.println("Lista vacia");
            }
            break;
            case 5:
            if(clientes.vacia()){
                System.out.println("No hay clientes en la lista");
            }
            else{
                System.out.println("Ingrese el nombre del cliente a eliminar: ");
                nombre = lector.nextLine();
                if(clientes.eliminarNombre(nombre)==true){
                    System.out.println("Registro eliminado");
                }
                else{
                    System.out.println("Cliente no encontrado");
                }
            }          
            break;
            case 6:
            if(clientes.vacia()){
                System.out.println("No hay clientes en la lista");
            }
            else{
                System.out.println("Ingrese el numero del cliente a eliminar: ");
                numcel = lector.nextLine();
                if(clientes.eliminarNumero(numcel)==true){
                    System.out.println("Registro eliminado");
                }
                else{
                    System.out.println("Numero de cliente no encontrado");
                }
            }
            break;

        }   
        }while(opcion!=7);
       
    }
}
