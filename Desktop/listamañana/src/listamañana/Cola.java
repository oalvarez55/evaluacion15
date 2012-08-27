/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listamañana;

/**
 *
 * @author SIDIOMAS-02
 */
public class Cola {
    
    Nodo cab;
    
    public void Cola(){
        this.cab=null;    
    }
    public void insertarNodo(Nodo p){
        if(cab==null){
            this.cab=p;
        }
        else{
            Nodo q;
            q=cab;
            while(q.getSig()!=null){
                q=q.getSig();
            }
            q.setSig(p);
        }       
    }
    
    public void insert(Nodo q,Nodo p){
        if(q.sig==null)
            q.sig=p;
        else
            this.insert(q.sig,p );
        }
    public void insert(int a){
        
        Nodo p;
        p=new Nodo();
        p.Nodo(a);
        
        if(this.cab==null){
            this.cab=p;
        }
        else
            this.insert(this.cab,p);
    }
    public void show(){
        Nodo p;
        p=this.cab;
        while(p!=null){
            
            System.out.print(p.dato+"  ");}
            p=p.sig;
        }
    public void insertarordenado(int a){
        
        Nodo q;
        q=new Nodo();
        q.Nodo(a);
        if(cab==null)
            this.cab=q;
        
        else{
          this.insertar(this.cab,q);{
            
         }    
        }
    }
    
    public void insertar(Nodo p,Nodo q){
        if(p.sig==null)
            p.sig=q;
        else{
            if (p.sig.dato>q.dato){
                q.sig=p.sig;
                p.sig=q;
            }
            else{
                this.insertar(p.sig, q);
            }
        }
    }
    
}
