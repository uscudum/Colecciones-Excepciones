package ExcepcionesPersonalizadas;

public class ExcepcionEdad extends Exception{

    public ExcepcionEdad (String mensaje){
        super(mensaje);
    }

    public ExcepcionEdad(){
        super("La edad no corresponde");
    }


}
