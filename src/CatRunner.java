import java.util.*;

public class CatRunner {

    public static void main(String[] args) {
        /*Greeting2 g2 = x -> {
            if(x < 0.0) return 0.0;
            return Math.pow(x,.5);
        };
        Scanner scan = new Scanner(System.in);
        final int count = scan.nextInt();
        for(int i = 0; i < count; ++i){
            double num = Double.valueOf(scan.next());
            System.out.println(g2.foo(num));
        }
    }
         */

    /*Thread t1 = new Thread() {
        @Override public void run(){
            System.out.println("inside differnt thread: " + Thread.currentThread().getName());
        }
    };

        Tiger a = new Tiger(7);
        Tiger b = new Tiger(3);
        Tiger c = new Tiger(9);

        List<Tiger> tigers = new ArrayList<Tiger>(Arrays.asList(a,b,c));
        /*Greeting2 g2 = x -> {
            if(x < 0.0) return 0.0;
            return Math.pow(x,.5);


        System.out.println(tigers);
        /*Comparator<Tiger> tc = new Comparator<>() {
            @Override public int compare(Tiger o1, Tiger o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        Collections.sort(tigers, tc);
        Collections.sort(tigers, (t1,t2) -> t1.getAge() - t2.getAge());
        System.out.println(tigers);
     */

        Runnable r1 = () -> {
            System.out.println("Inside diffent thread: " + Thread.currentThread().getName());
        };

        Thread t1 = new Thread(r1);
        t1.start();
        System.out.println("inside thread: " + Thread.currentThread().getName());
    }
}

interface Greeting2{
    double foo(double x);
}
