public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while(i<=15){
            System.out.println(i++);
        }

        System.out.println();

        for(int j = 5; j<=15; j++){
            System.out.println(j);
        }


        long x = 2;
        do{
            System.out.println(x);
            x*=x;


        }while(x<1000000);

        for(long y = 2; y<1000000; y*=y){
            System.out.println(y);
        }


        for(i = 0; i<=100; i++){
            if(i%3==0){
                System.out.println("fizz");
            } else if (i%5==0){
                System.out.println("buzz");
            } else if (i%3==0 && i%5 ==0){
                System.out.println("fizz buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
