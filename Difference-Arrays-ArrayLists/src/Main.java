import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // declaring and setting the arrays value
        int[] array = new int[6];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 50;
        array[4] = 60;
        array[5] = 70;

        System.out.println("Array elements: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element indexes " + i + ": " + array[i]);
        }
        // Declares the array list integers
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(50);
        arrayList.add(60);
        arrayList.add(70);
        arrayList.add(80);
            System.out.println("ArrayList elements: ");
            for ( int i = 0; i < arrayList.size(); i++) {
            System.out.println("Element index " + i + ": " + arrayList.get(i));
        }
    }}