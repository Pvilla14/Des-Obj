package Listados.Listado2;
class ComoStructM {
    int ar[][]={{3,2,0,-1,-2},{4,8,1,-3,-4},{6,9,5,-9,-7}};
}
class Ej7 {
    
    public static void main(String[] args){
        ComoStructM cs = new ComoStructM();
        int columnas = cs.ar[0].length;
        int filas = cs.ar.length;
        for(int i = 0; i < columnas; i++){
            int aux = cs.ar[0][i];
            cs.ar[0][i] = cs.ar[filas-1][i];
            cs.ar[filas-1][i] = aux;
        }
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                System.out.print(cs.ar[i][j]);
                if(j<columnas-1){
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }
}
