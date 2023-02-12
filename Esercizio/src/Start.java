
public class Start {
    public static void main(String[] args) {
        int[] fibonacci = new int[10];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        int i = 0;
        while(i<fibonacci.length-2){
            int a = fibonacci[i] + fibonacci[i +1];
            fibonacci[i + 2] = a;
            i++;
        }
        i = 0;
        while (i<fibonacci.length){
            System.out.println(fibonacci[i]);
            i++;
        }
    }
}
