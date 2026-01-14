public class Main {

    public  static  void recursive(){
        recursive();
    }

    static void main(String[] args) {

        try{
            int result = 10/0;
            System.out.println("resultado "+ result);
        }catch (ArithmeticException e){
            System.out.println("Division por cero");
        }finally {
            System.out.println("Este  mensjae se ejecuta siempre");
        }

        System.out.println("El programa finaliza");
    }
}