public class Nodo {
    //---ATRIBUTOS---
    //El valor que alamacena este nodo. Usamos int para simplificar,
    //pero podría ser genérico. 
    int dato;

    //Referencia al SIGUIENTE nodo de la lista. 
    //Si este nodo es el último, "Siguiente" será null
    Nodo siguiente; 

    //---CONSTRUCTOR--- 
    //Recibe el dato a guardar. "Sguiente" se inicializa en null
    //automáticamente porque es el n valor por defecto de un objecto. 
    public Nodo(int dato){
        this.dato=dato;
        this.siguiente=null;    //Explícito para que quede claro 

    }
    
}

