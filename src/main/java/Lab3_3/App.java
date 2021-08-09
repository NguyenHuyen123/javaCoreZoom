package Lab3_3;

public class App {
    public static void main(String[] args) {
        int n=4;
        //
        Ex2d fc= new Ex2d();
        System.out.println(n +"!="+ fc.factorial(n));
        //
        Ex2e sumfc= new Ex2e();
        System.out.println("=======");
        System.out.println("Tổng các giai thừa là: "+sumfc.sumFactorial(n));
        //
        Ex4 sumPrime= new Ex4();
        System.out.println("=======");
        System.out.println("Tổng số nguyên tố 0<n<50: "+sumPrime.sumPrimeNumber());
        //
        Ex5 reserveNum= new Ex5();
        int re=987364;
        System.out.println("=======");
        System.out.println("Số ngược "+re+" là : "+reserveNum.reverseNumber(re));
        //
        Ex1a symmetry= new Ex1a();
        System.out.println("=======");
        System.out.println("có phải là số đối xứng không? "+symmetry.isSymmetryNumber(121));
        ///
        Ex1b e3= new Ex1b();
        System.out.println("======");
        System.out.println("Có phải là số chính phương? "+ e3.isPerfectSquare(9));


    }

    }

