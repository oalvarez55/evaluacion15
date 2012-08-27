/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listamañana;

/**
 *
 * @author Juan Sandoval
 */
public class Nodo {
    
    int dato;
    Nodo sig;
    
    public void Nodo (int a){
        
        this.dato=a;
        this.sig=null;
    }
            
    public void setSig(Nodo p){
         this.sig=p;
    }
    public Nodo getSig(){
        return this.sig;
    }        
}
