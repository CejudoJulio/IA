package inteligencia_artificial;

public class Nodo{
    private int valor;
    private Nodo hijo_der;
    private Nodo hijo_izq;
    
    public Nodo(){
    hijo_der = null;
    hijo_izq = null;
    
    }
    
    public void sethijo_izq(Nodo auxiliar) {
        hijo_izq = auxili;
    }
    
    public Nodo gethijo_izq() {
    
        return hijo_izq;
    }
    
    public void sethijo_der(Nodo auxiliar) {
        hijo_der = auxili;
    }
    
    public Nodo gethijo_der() {
    
        return hijo_der;
    }
    
    public void setvalor(int auxiliar){
        valor = auxiliar;
    }
    
    public int getvalor(){
        return valor;
    }
     public void imprimir_Dato() {
        System.out.println(this.getvalor());
    }
}
