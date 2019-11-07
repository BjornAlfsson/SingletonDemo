public class Division {

    public void division(int[] numbers) {
        Double result = 0.0;
        for ( int i = 0; i < numbers.length; i++) {
            if ( i == 0.0 ) {
                result += numbers[i];
            } else {
                result /= numbers[i];
            }
        }
        System.out.println("The result is: " + result);
    }
}
