public class Addition {

    public void add(int[] numbers) {
        Integer result = 0;
        for ( int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        System.out.println("The result is: " + result);
    }
}
