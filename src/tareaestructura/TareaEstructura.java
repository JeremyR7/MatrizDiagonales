
package tareaestructura;

import javax.swing.JOptionPane;


public class TareaEstructura {

    
    public static void main(String[] args) {
         int [] [] matriz = new int [3] [3];
        
        for (int fila =0; fila <3; fila++){
            for (int col = 0; col < 3; col++) {
                matriz [fila] [col] =1;
                System.out.print(matriz[fila] [col] + "  ");
                
                
            }
            System.out.println("");
        }
        int suma=0;
     String contenido= " Diagonales \n ";
     for(int fila =0; fila < matriz.length; fila++){
           for(int col=0; col < matriz[fila].length; col++){
              
               if (fila == col  ){
               contenido+="["+matriz[fila][col]+ "]" ; 
              
               suma=suma+ matriz[fila][col] ; 
     
               }
               else{
                   contenido += "[  ]";
                   
               }
              
           }
           contenido += "\n";
    }
     JOptionPane.showMessageDialog(null,contenido);
      
     JOptionPane.showMessageDialog(null," La suma de la diagonal derecha de la matriz es : " +suma);
     
        int suma1=0;
      int resultado=0;
      String contenid1= " Diagonales \n ";
         int j = (matriz.length)-1;
   for(int fila =0; fila <matriz.length; fila++){
       for(int col=0; col < matriz[fila].length; col++){
           
           if (col == fila  ){
                contenid1+="["+matriz[fila][j--]+ "]" ;
               suma1=suma1+matriz[fila][col];
               
           }
           else{
               contenid1 += "[  ]"; 
               
           }
               

       }
        contenid1 += "\n";
   }
     JOptionPane.showMessageDialog(null,contenid1);
     JOptionPane.showMessageDialog(null," La suma de la diagonal izquierda de la matriz es : " +suma);
     
     
     
    }
    
}
