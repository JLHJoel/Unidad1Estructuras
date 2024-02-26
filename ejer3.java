//ejercicio 3 Buscaminas
import java.util.Scanner;

public class ejer3{
    public static void main(String[] args){

        boolean fin;

        Scanner lector = new Scanner(System.in);
        System.out.println("Arreglos buscaminas \n");
        
        int[][] a =  new int [10][10];
        String[][] r =  new String[10][10]; //respuestas
        //random
        int x=0, y=0;
        for(int j=0; j<a.length; j++){//renglones
            System.out.print(j + "| ");
            for(int i=0; i<a[j].length; i++){//columnas
            a[j][i] = (int) (Math.floor(Math.random()*2+0));
            r[j][i] = "x";
            System.out.print(a[j][i] + " ");
            }
        System.out.println();
        }
    do{
    //pedir posicion
    System.out.println("Posicion de la mina: ");
    System.out.println("X: ");
    x = lector.nextInt();
    System.out.println("Y: ");
    y = lector.nextInt();
    //corroborar si existe mina
    if(a[x][y]==1){
        r[x][y] = "1";
        System.out.println("Has explotado una mina");
        fin = true;
        System.out.println("Juego terminado! \n");
        for(int j=0;j<a.length;j++){//renglones
            System.out.print(j + "| ");
            for(int i=0;i<a[j].length;i++){//columnas
                System.out.print(r[i][j] + " ");
            }
            System.out.println();
        }
    }
    else{ //revela las que estan alrededor
        r[x][y] = "0";
        if(x!=0 && x!=9 && y!=0 && y!=9){
            //posicion en medio
            r[x-1][y] = String.valueOf(a[x-1][y]);
            r[x+1][y] = String.valueOf(a[x+1][y]);
            r[x][y+1] = String.valueOf(a[x][y+1]);
            r[x][y-1] = String.valueOf(a[x][y-1]);
            r[x-1][y-1] = String.valueOf(a[x-1][y-1]);
            r[x-1][y+1] = String.valueOf(a[x-1][y+1]);
            r[x+1][y-1] = String.valueOf(a[x+1][y-1]);
            r[x+1][y+1] = String.valueOf(a[x+1][y+1]);
        }
        else{
            //esquinas
            if(x==0 && y==0){
                r[x+1][y] = String.valueOf(a[x+1][y]);
                r[x][y+1] = String.valueOf(a[x][y+1]);
                r[x+1][y+1] = String.valueOf(a[x+1][y+1]);
            }
            else{
                if(x==0 && y==9){
                    r[x+1][y] = String.valueOf(a[x+1][y]);
                    r[x][y-1] = String.valueOf(a[x][y-1]);
                    r[x+1][y-1] = String.valueOf(a[x+1][y-1]);
                }
                else{
                    if(x==9 && y==9){
                        r[x-1][y] = String.valueOf(a[x-1][y]);
                        r[x][y-1] = String.valueOf(a[x][y-1]);
                        r[x-1][y-1] = String.valueOf(a[x-1][y-1]);
                    }
                    else{
                        if(x==9 && y==0){
                            r[x-1][y] = String.valueOf(a[x-1][y]);
                            r[x][y+1] = String.valueOf(a[x][y+1]);
                            r[x-1][y+1] = String.valueOf(a[x-1][y+1]);
                        }
                        else{
                            if(x==0){
                                r[x+1][y] = String.valueOf(a[x+1][y]);
                                r[x][y+1] = String.valueOf(a[x][y+1]);
                                r[x][y-1] = String.valueOf(a[x][y-1]);
                                r[x+1][y-1] = String.valueOf(a[x+1][y-1]);
                                r[x+1][y+1] = String.valueOf(a[x+1][y+1]);
                            }
                            if(x==9){
                                r[x-1][y] = String.valueOf(a[x-1][y]);
                                r[x][y+1] = String.valueOf(a[x][y+1]);
                                r[x][y-1] = String.valueOf(a[x][y-1]);
                                r[x-1][y-1] = String.valueOf(a[x-1][y-1]);
                                r[x-1][y+1] = String.valueOf(a[x-1][y+1]);
                            }
                            if(y==0){
                                r[x-1][y] = String.valueOf(a[x-1][y]);
                                r[x+1][y] = String.valueOf(a[x+1][y]);
                                r[x][y+1] = String.valueOf(a[x][y+1]);
                                r[x-1][y+1] = String.valueOf(a[x-1][y+1]);
                                r[x+1][y+1] = String.valueOf(a[x+1][y+1]);
                            }
                            if(y==9){
                                r[x-1][y] = String.valueOf(a[x-1][y]);
                                r[x+1][y] = String.valueOf(a[x+1][y]);
                                r[x][y-1] = String.valueOf(a[x][y-1]);
                                r[x-1][y-1] = String.valueOf(a[x-1][y-1]);
                                r[x+1][y-1] = String.valueOf(a[x+1][y-1]);
                            }
                        }
                    }
                }
            }
        }//else esquinas
        //impresion a pantalla
        fin=true;
        for(int j=0;j<a.length;j++){//renglones
            System.out.print(j + "|  ");
            for(int i=0;i<a[j].length;i++){//columnas
                System.out.print(r[i][j] + " ");
                if(r[i][j]=="x"){
                    fin=false;
                }
            }
            System.out.println();
        }

      }//else de cuando no explota
    }while(fin==false); //termina el juego cuando explota una mina (se cierra el ciclo)

    }
    }
