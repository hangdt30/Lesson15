package Exercise1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Car {


    //Sắp xếp mảng theo thứ tự alphabet
    public static void sortAlphabet(String[] car) {
        System.out.println("Sắp xếp mảng theo thứ tự bảng chữ cái");
        Arrays.sort(car);
        Arrays.stream(car).forEach(System.out::println);
    }
    //Sắp xếp theo thứ tự ngược lại
    public static void sortReserve(String[] car) {
        System.out.println("Sắp xếp mảng theo thứ tự ngược  lại của bảng chữ cái");
        Arrays.sort(car, Comparator.reverseOrder());
        Arrays.stream(car).forEach(System.out::println);
    }


}
