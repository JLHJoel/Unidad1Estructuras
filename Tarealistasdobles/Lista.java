package Tarealistasdobles;

public class Lista{
    public Nodo inicio;
    public Nodo fin;

    public Lista(){
        inicio=null;
        fin=null;
    }
    public void insertar(String nombre, String numcel){
        Nodo nuevo = new Nodo();
        Nodo aux = new Nodo();
        nuevo.nombre = nombre;
        nuevo.numcel = numcel;
        nuevo.sig = null;
        nuevo.ant = null;

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
            nuevo.ant = aux;
            fin = nuevo;
        }
    
    }
    public void mostrar(){
        if(vacia()==false){ //vacia igual a false, significa que hay personas
        Nodo aux = new Nodo();
        aux = inicio;
        while(aux!=null)
        {
            System.out.println(aux.nombre);
            System.out.println("" + aux.numcel + "\n");
            aux = aux.sig;
        }
    }
    }


    public void eliminarInicio(){//borra al inicio
        Nodo aux = new Nodo();
        aux = inicio;
        if(inicio.sig==null){
            inicio = null;
            fin = null;
        }
        else{
            inicio = inicio.sig;
            aux.sig = null; //desconecta el nodo, libera ram
            inicio.ant = null;
        }
        // if(!vacia()){
        //     Nodo aux = new Nodo();
        //     aux = inicio;
        //     inicio = inicio.sig;
        //     aux.sig = null;
        //     }
    }

    public void eliminarFinal(){
        Nodo aux = new Nodo();
        if(fin.ant==null){
            inicio = null;
            fin = null;
        }
        else{
            aux = fin;
            fin = fin.ant;
            fin.sig = null;
            aux.ant =null;
        }
    }

    public boolean eliminarNombre(String nombre){
        if(!vacia()){
            if(nombre.equals(inicio.nombre)){
                eliminarInicio();
                return true;
            }
            else if(nombre.equals(fin.nombre)){
                eliminarFinal();
                return true;
            }
                else{
                    Nodo aux = new Nodo();
                    aux = inicio.sig;
                    while(aux!=null){// !=null
                        if(nombre.equals(aux.nombre)){
                            aux.sig.ant = aux.ant;
                            aux.ant.sig = aux.sig;
                            aux.sig = null;
                            aux.ant = null;
                            
                            return true;
                            //enlaces para liberar el nodo
                        }
                        else{
                            aux = aux.sig;
                        }
                    }
                    
                }
        }
        return false;
    }

    public boolean eliminarNumero(String numcel){
        if(!vacia()){
            if(numcel.equals(inicio.numcel)){
                eliminarInicio();
                return true;
            }
            else if(numcel.equals(fin.numcel)){
                eliminarFinal();
                return true;
            }
                else{
                    Nodo aux = new Nodo();
                    aux = inicio.sig;
                    while(aux!=null){// !=null
                        if(numcel.equals(aux.numcel)){
                            aux.sig.ant = aux.ant;
                            aux.ant.sig = aux.sig;
                            aux.sig = null;
                            aux.ant = null;
                            
                            return true;
                            //enlaces para liberar el nodo
                        }
                        else{
                            aux = aux.sig;
                        }
                    }
                    
                }
        }
        return false;
    }


    public boolean vacia(){
        if(inicio==null){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean strvacio(String dato){ //para validar que no haya datos en blanco
        if(dato==""){
            return true;
        }
        else{
            return false;
        }
    }
}