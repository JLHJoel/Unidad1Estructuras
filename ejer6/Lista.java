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

    public void mostrarInverso(){
        if(vacia()==false){
            Nodo aux = new Nodo();
            aux = fin;
            while(aux!=null)
            {
                System.out.println(aux.elemento);
                aux = aux.ant;
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

    public boolean eliminar(String nombre){
        if(!vacia()){
            if(nombre==inicio.elemento){
                eliminarInicio();
                return true;
            }
            else if(nombre==fin.elemento){
                eliminarFinal();
                return true;
            }
                else{
                    Nodo aux = new Nodo();
                    aux = inicio.sig;
                    while(aux!=fin){// !=null
                        if(nombre.equals(aux.elemento)){
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
}