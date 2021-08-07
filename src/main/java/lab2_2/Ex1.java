package lab2_2;

import java.util.Scanner;

public class Ex1 {
   int varA = 0;
    public static int inputNumber(String textNotifi) {
        Scanner sc = new Scanner(System.in);
        System.out.println(textNotifi);
        int number = 0;
        try {
            number = sc.nextInt();
            return number;
        } catch (Exception e) {
            System.out.println("Vui lòng nhập số nguyên");
            return 0;
        }
    }
    public static void main(String[] args) {
        Ex1 e1= new Ex1();
       while (true){
           e1.varA = e1.inputNumber("Nhập vào số nguyên A");
           if(e1.varA != 0 && (e1.varA>0 && e1.varA<10)){
               System.out.println(e1.varA);
               break;
           }
       }

    }
}
