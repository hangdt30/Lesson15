package Exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StudentInClass {
    public String[] inputData() {
//        System.out.println("Nhập vào số thành viên của lớp");
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        String[] studentArray = new String[n];
//        for (int i =0;i<studentArray.length;i++){
//            System.out.println("Nhập phần tử thứ " + i);
//            studentArray[i]= sc.nextLine();
//        }
        String[] studentArray = new String[]{
                "Mai  Phương Thúy",
                " Nguyễn Mai Phương",
                "Hà Kiều Anh ",
                "Ngô Lan Phương",
                "Đặng thu Thảo",
                "Nguyễn Ngọc Hân",
                "nguyễn Cao Kỳ Duyên",
                "Nguyễn .Tiểu Vy",
                "Trần. Thùy Dung",
                "Bùi . Bích Phương"
        };

        System.out.println("Danh sách các học viên trong lớp:");
        Arrays.stream(studentArray).forEach(System.out::println);
        return studentArray;
    }

    public void standardized(String[] studentArray) {
        for (int i = 0; i < studentArray.length; i++) {
            studentArray[i] = studentArray[i].trim().replaceAll("\\.", " ").replaceAll("\\s{2,}", " ");
            for (int j = 0; j < studentArray[i].length(); j++) {
                if (j == 0) {
                    studentArray[i] = studentArray[i].toUpperCase().substring(0,1)+studentArray[i].substring(1,studentArray[i].length());
                }
                if (studentArray[i].charAt(j) == ' ') {
                    studentArray[i] = studentArray[i].substring(0,j+1)+studentArray[i].toUpperCase().substring(j+1,j+2
                    ) + studentArray[i].substring(j +2, studentArray[i].length());
                }
            }

        }

        System.out.println("Danh sách sau khi chuẩn hóa");
        Arrays.stream(studentArray).forEach(System.out::println);
    }

    public void sortName(String[] studentArray) {
        //Danh sách sau khi sắp xếp theo bảng chữ cái
        System.out.println("Danh sách sau khi sắp xếp");
        Arrays.sort(studentArray);
        Arrays.stream(studentArray).forEach(System.out::println);
    }
}
