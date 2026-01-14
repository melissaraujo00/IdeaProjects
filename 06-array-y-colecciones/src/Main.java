

public class Main {
    static void main(String[] args) {
        int[] numbersPrimitiv = {1,2,3,4,5,6,0,9};

        int deletePosition = 2;

        for (int i = deletePosition; i < numbersPrimitiv.length; i++) {
            numbersPrimitiv[i] = numbersPrimitiv[i+1];

        }
        numbersPrimitiv[numbersPrimitiv.length - 1] = 0;

        for (int number: numbersPrimitiv){
            System.out.println(number);
        }

        /*numbersPrimitiv[0] = 100;
        numbersPrimitiv[1] = 20;

        int[] newNumbers = new int[numbersPrimitiv.length + 1];
        System.arraycopy(numbersPrimitiv, 0, newNumbers, 0, numbersPrimitiv.length);
        newNumbers[5] = 500;

        Integer[] numbersWrapper = new Integer[5]; //los demas son null
        numbersWrapper[0] = 30;

        System.out.println("Tipo int");

        for (int number : newNumbers){
            System.out.println(number);
        }

        System.out.println("Tipo Integer");
        for (Integer number : numbersWrapper){
            System.out.println(number);*/

    }
}