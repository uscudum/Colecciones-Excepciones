package ExcepcionesPersonalizadas;

public class Main {
    public static void main(String[] args) {

        int edad = 15;
        try {
            validarEdad(edad);
        }catch (ExcepcionEdad e){
            System.out.println(e.getMessage());
        }

    }

    static boolean validarEdad(int edad) throws ExcepcionEdad{
        if(edad < 18){
            throw new ExcepcionEdad();
        }else {
            return true;
        }
    }

}
