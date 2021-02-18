import java.util.Scanner;

public class Add2Array {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter the Ele of Array1 " +(i +1)+":");
            array1[i] = input.nextInt();

        }
        for (int j = 0; j < array2.length; j++) {
            System.out.println("Enter the Ele of Array2 " +( j + 1)+":");
            array2[j] = input.nextInt();
        }
        int[] array3 = new int[array1.length+ array2.length];
        for (int k = 0; k < array1.length ; k++) {
            array3[k]= array1[k];
        }
        for (int l = 0; l < array2.length; l++) {
            array3[array2.length+l] = array2[l];
        }
        System.out.println("Array3 is:");
        for (int m = 0; m < array3.length; m++)

        {
            System.out.println(array3[m]);
        }
    }
}
