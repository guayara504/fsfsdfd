/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author Guayara Suarez
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nodo nodo;
        Pila pila = new Pila();
        pila.leerArchivo("./archivos/Documento.txt");
        
        for (int i = 0; i <pila.getContenido().length(); i++) {
           nodo=new Nodo();
           nodo.setCaracter(Character.toString(pila.getContenido().charAt(i)));
           pila.Push(nodo);
           
        }
        
        System.out.println(pila.getContador()+pila.peek().getCaracter());
           
     
//        for (int i = 0; i < pila.getContenido().length(); i++) {
//            if(pila.getContenido().charAt(i)=='(' && pila.getContenido().charAt(i+1)==')') {
//                
//            }
//        }
        
        
        
        

    }
    
}
