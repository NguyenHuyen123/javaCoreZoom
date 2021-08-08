package Lab2_3;

import java.util.Scanner;

public class Ex2 {
    static int day, month, year;
    Ex1 e1= new Ex1();
    public static void isdate(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập ngày");
         day= sc.nextInt();
        System.out.println("Nhập tháng");
         month= sc.nextInt();
        System.out.println("Nhập năm");
         year= sc.nextInt();
        switch (month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if( day>=1 && day <=31){
                        System.out.println( day+"/"+month+"/"+year+ " hợp lệ");
                        nextDay();
                        prevDay();
                    }else {
                        System.out.println( day+"/"+month+"/"+year+ " Không hợp lệ");
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if( day>=1 && day <=30){
                        System.out.println( day+"/"+month+"/"+year+ " hợp lệ");
                        nextDay();
                        prevDay();
                    }else {
                        System.out.println( day+"/"+month+"/"+year+ " Không hợp lệ");
                    }
                    break;
                case 2:
                    if((year%400==0) || (year%4==0 && year%100!=0)){
                        if( day>=1 && day <=29){
                            System.out.println( day+"/"+month+"/"+year+ " hợp lệ");
                            nextDay();
                            prevDay();
                        }else {
                            System.out.println( day+"/"+month+"/"+year+ " Không hợp lệ");
                        }

                    }else {
                        if( day>=1 && day <=28){
                            System.out.println( day+"/"+month+"/"+year+ " hợp lệ");
                            nextDay();
                            prevDay();

                        }else {
                            System.out.println( day+"/"+month+"/"+year+ " Không hợp lệ");
                        }
                    }
            }

        }
        public static void nextDay (){
        if (month==1 || month==3|| month==5|| month==7||month==8||month==10||month==12){
            if ( day==31){
                if (month==12){
                    System.out.println( 1+"/"+1+"/"+(year +1)+" ngày sau");
                }else {
                    System.out.println( 1+"/"+(month +1)+"/"+year+" ngày sau");
                }
            }else{
                System.out.println( (day+1)+"/"+month+"/"+year+ " ngày sau");
            }

        }else if (month==4 || month==6|| month==9|| month==11){
            if ( day==30){
                System.out.println( 1+"/"+(month+1)+"/"+year+ " ngày sau");
            }else{
                System.out.println( (day+1)+"/"+month+"/"+year+ " ngày sau");
            }
        }else if (month==2){
            if((year%400==0) || (year%4==0 && year%100!=0)){
                if ( day==29){
                    System.out.println( 1+"/"+(month+1)+"/"+year+ " ngày sau");
                }else{
                    System.out.println( (day+1)+"/"+month+"/"+year+ " ngày sau");
                }

            }else
            if ( day==28){
                System.out.println( 1+"/"+(month+1)+"/"+year+ " ngày sau");
            }else{
                System.out.println( (day+1)+"/"+month+"/"+year+ " ngày sau");
            }
        }
        }
        public static void prevDay() {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (day == 1) {
                    if (month == 1) {
                        System.out.println(31 + "/" + 12 + "/" + (year - 1) + " ngày trước");
                    } else if (month == 3) {
                        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                            System.out.println(29 + "/" + (month - 1) + "/" + year + " ngày trước");
                        } else
                            System.out.println(28 + "/" + (month - 1) + "/" + year + " ngày trước");
                    } else if (month == 8) {
                        System.out.println(31 + "/" + (month - 1) + "/" + year + " ngày trước");

                    } else {
                        System.out.println(30 + "/" + (month - 1) + "/" + year + " ngày trước");
                    }
                } else {
                    System.out.println((day - 1) + "/" + month + "/" + year + " ngày trước");
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day == 1) {
                    System.out.println(31 + "/" + (month - 1) + "/" + year + " ngày trước");
                } else {
                    System.out.println((day - 1) + "/" + month + "/" + year + " ngày trước");
                }
            } else if (month == 2) {

                    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                        if (day == 1) {
                            System.out.println(31 + "/" + (month - 1) + "/" + year + " ngày trước");
                        } else {
                            System.out.println((day - 1) + "/" + month + "/" + year + " ngày trước");
                        }
                    } else {
                        if (day == 1) {
                            System.out.println(31 + "/" + (month - 1) + "/" + year + " ngày trước");
                        } else {
                            System.out.println((day - 1) + "/" + month + "/" + year + " ngày trước");
                        }
                    }
            }
        }

    public static void main(String[] args) {
        isdate();
    }
    }


