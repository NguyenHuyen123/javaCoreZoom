package Lab4;

public class App {
    public static void main(String[] args) {
        Ex2 e= new Ex2();
        int []arr= {2,3,5,7,16,24,79};
        System.out.println("Toàn bảng là số nguyên tố: "+ e.isAllPrime(arr));
        System.out.println("Có phải mảng tăng dần không? "+ e.arrAscending(arr));
        //3a
        Ex3 e1= new Ex3();
        boolean isValue= false;
        for(int i : e1.trave(arr)){
            if( i!= 0){
                System.out.print(i+" ");
                isValue = true;
            }
        }
        if(!isValue){
            System.out.print("Không có số");
        }
        //3b
       System.out.println("\nTổng số nguyên tố trong mảng: "+ e1.sumPrimeArr(arr));
    }
}
