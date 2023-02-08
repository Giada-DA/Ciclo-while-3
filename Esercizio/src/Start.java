public class Start {
    public static void main(String[] args) {
        int[] fibonacci = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        int i = 0;
        while (i< fibonacci.length){
            int value = fibonacci[i];
            System.out.println(value);
            if(value == 34){
                break;
            }
            i++;
        }
    }
}
