/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listamañana;


/**
 *
 * @author SIDIOMAS-02
 */
public class Pila {
    
    Nodo cab;
    
    public void Pila(){
       cab=null;
    }
    
    public void insertar(int a){
        
        Nodo p;
        p= new Nodo();
        p.Nodo(a);
        p.setSig(cab);
        cab=p;
    }
    public void mostrar(){
        mostrar (this.cab);
    }
    public void mostrar(Nodo q){
       System.out.print(q.dato+"  ");
       if(q.sig!=null)
           this.mostrar(q.sig);
    }
    public void show(){
        Nodo p;
        p=this.cab;
        while(p!=null){
            System.out.print(p.dato+"  ");}
            p=p.sig;
        }
    }

