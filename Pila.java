
package parcial;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Pila {
    
     private String lectura=" ";
     private String contenido=" ";
     private Nodo cabeza;
     private int contador=0;

    public String getContenido() {
        return contenido;
    }

    public Nodo getCabeza() {
        return cabeza;
    }
     

public int getContador() {
        return contador;
    }

public void Push(Nodo nodo){
       Nodo actual = cabeza;
        contador++;
        if(actual==null){
            cabeza = nodo;
            cabeza.setAbajo(null);
           
        }else{
            for(actual = cabeza; actual.getAbajo()!= null; actual= actual.getAbajo()){
                
            }
            nodo.setArriba(actual);
            actual.setArriba(nodo);
           
            
        }
        contador++;
}
    
public void pop(){  
      
      if(contador>1){
          cabeza=cabeza.getAbajo();
          cabeza.setArriba(null);
          
      }else
      {
          cabeza=null;
      }
      contador--;
}

public Nodo peek(){
      return cabeza;
  }
     
public void leerArchivo(String ruta){
        FileReader fr = null;
        BufferedReader br=null;
        
        try{
             fr=new FileReader(ruta);
             br= new BufferedReader(fr);
            
             
             while((lectura=br.readLine())!=null){
                 contenido+=lectura;
             }
        }catch(FileNotFoundException e){
            System.out.println("no encontrado");
        }catch(IOException e){
            System.out.println("error "+e.getMessage());
        }
       
            
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void imprimir (){
        //System.out.println(contenido);
        Nodo actual;
      for(actual=cabeza;actual!=null;actual=actual.getAbajo()){
          
          System.out.println(actual.getCaracter());
          
      }
    }
    
    
    
  
}
