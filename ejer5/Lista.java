package ejer5;

public class Lista{
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
        if(vacia()==false){ //vacia igual a false, significa que hay personas, !vacia
        Nodo aux = new Nodo();
        aux = inicio;
        while(aux!=null)
        {
            System.out.println(aux.elemento);
            aux = aux.sig;
        }
    }
    }

    public void eliminar(){//borra al inicio
        Nodo aux = new Nodo();
        aux = inicio;
        if (inicio!=null){
            inicio = inicio.sig;
            aux.sig = null;
        }
        // if(!vacia()){
        //     Nodo aux = new Nodo();
        //     aux = inicio;
        //     inicio = inicio.sig;
        //     aux.sig = null;
        //     }
    }

    public boolean vacia(){
        if(inicio==null){
            return true;
        }
        else{
            return false;
        }
    }
}