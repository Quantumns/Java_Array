// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      int [] array = new int[10];

        for (int i = 0; i < array.length ; i++) {
            array[i]= 9-i;
        }
        for (int j:array) {
            System.out.println(j);
        }

    }
}