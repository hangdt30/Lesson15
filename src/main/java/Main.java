import Exercise1.*;
import Exercise2.StudentInClass;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        String[] carArray = new String[]{"Toyota","Mercedes","Hyundai","Kia Morning","Nissan"};
//        car.sortAlphabet(carArray);
//        car.sortReserve(carArray);
        StudentInClass student = new StudentInClass();
        String[] studentArray=student.inputData();
        System.out.println("-------------");
        student.standardized(studentArray);
        System.out.println("-------------");
        student.sortName(studentArray);
    }



}
