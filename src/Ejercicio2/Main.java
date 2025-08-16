package Ejercicio2;

public class Main {

    public static void main(String[] args) {

            int operacion;
            try {
                int num1 = 1;
                String num2 = "0";
                operacion = num1 / Integer.parseInt(num2);
            }catch (NumberFormatException e){
                System.out.println("Lo ingresado no es un número");
            }catch (ArithmeticException e){
                System.out.println("No se puede dividir entre 0");
            }catch (Exception e){
                System.out.println("Ocurrió un error" + e.getMessage());
            }finally {
                System.out.println("Esto se ejecuta siempre");
            }



        System.out.println("Hola mundo");






    }
}
