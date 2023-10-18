import java.util.Scanner;

public class ForKelipatan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bilangan, total=0, counter=0;
        double rata;
        
        System.out.println("Masukan bilangan 1-9: ");
        bilangan = sc.nextInt();

        for (int i = 0; i <50; ++i){ 
            if ( i % bilangan ==0) {
                total += i;
                ++counter;
            }
        }

        System.out.printf("Pada rentang 1-50 terdapat %d bilangan kelipatan %d dengan total %d", counter, bilangan,total);
        System.out.println("");

        rata=(double)total/counter;
        System.out.println("rata-rata " + rata);



         


    
}
    
}
