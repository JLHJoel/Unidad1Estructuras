//ejercicio 4 Listas sencillas
import java.util.Scanner;

class Nodo{
    String elemento;
    Nodo sig;
}


class Lista{
    public Nodo inicio;
    public Nodo fin;

    public Lista(){
    inicio=null;
    fin=null;
    }
    public void insertar(String nombre){
        Nodo nuevo = new Nodo();
        Nodo aux = new Nodo();
        nuevo.elemento = nombre;
        nuevo.sig = null;
        if(inicio==null){ //primer elemento
            inicio = nuevo;
            fin = nuevo;
        }
        else{//metodo facil, a partir del segundo elemento
            //fin.sig = nuevo;
            //fin = nuevo;
            aux = inicio;
            while(aux.sig!=null){
                aux = aux.sig;
            }
            aux.sig = nuevo;
        }
    
    }
    public void mostrar(){
        Nodo aux = new Nodo();
        aux = inicio;
        while(aux!=null)
        {
            System.out.println(aux.elemento);
            aux = aux.sig;
        }
    }
}

public class ejer4{
    
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);


        System.out.println("Listas sencillas");

        Nodo alumno = new Nodo();
        
        alumno.sig = null;
        
        Lista filaBanco = new Lista();
        String nombre;
        
        System.out.println("Cliente: ");
        nombre = lector.nextLine();
        filaBanco.insertar(nombre);
        System.out.println("Cliente 2: ");
        nombre = lector.nextLine();
        filaBanco.insertar(nombre);
        System.out.println("Cliente 3: ");
        nombre = lector.nextLine();
        filaBanco.insertar(nombre);
        System.out.println("Desplegando lista: ");
        filaBanco.mostrar(); 
    }
}
