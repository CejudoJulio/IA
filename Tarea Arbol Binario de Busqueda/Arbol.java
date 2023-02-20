package inteligencia_artificial;

public class Arbol {
    
    Nodo raiz;
  
    public static void main (String a[]){
        Arbol arbol = new Arbol();
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(75);
        arbol.insertar(25);
        arbol.insertar(10);
        arbol.insertar(90);
        System.out.println("Recorriendo:");
        arbol.postorden();
    }
    
    public boolean vacio(){
        return raiz==null;
    }
    
    public void insertar(int valor) {
        Nodo wii = new Nodo();
        wii.setvalor(valor);
        if (vacio()) {
            raiz = wii;
        } else {
            this.insertar(this.raiz, valor);
        }
    }
    
    private void insertar(Nodo padre, int valor) {
        if (valor > padre.getvalor()) {
            if (padre.gethijo_der() == null) {
                Nodo wii = new Nodo();
                wii.setvalor(valor);
                padre.sethijo_der(wii);
            } else {
                this.insertar(padre.gethijo_der(), valor);
            }
        } else {
            if (padre.gethijo_izq() == null) {
                Nodo wii = new Nodo();
                wii.setvalor(valor);
                padre.sethijoizq(wii);
            } else {
                this.insertar(padre.gethijo_izq(), valor);
            }
        }
    }
    
     private void postorden(Nodo wii) {
        if (wii != null) {
            postorden(wii.gethijoizq());
            postorden(wii.gethijoder());
            wii.imprimirDato();
        }
    }
       public void postorden() {
        this.postorden(this.raiz);
    }    
}