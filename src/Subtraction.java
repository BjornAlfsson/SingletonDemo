public class Subtraction {

    public void subtract(int[] numbers) {
        Integer result = 0;
        for ( int i = 0; i < numbers.length; i++) {
            if ( i == 0 ) {
                result += numbers[i];
            } else {
                result -= numbers[i];
            }
        }
        System.out.println("The result is: " + result);
    }
}
