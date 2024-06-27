import java.util.Arrays;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {

        //for(int i=0; i<10; i++){
        //    System.out.printf("%s%n",i);
        //}
//        double a=Math.random();
//        System.out.println(a);

//        int count=0;
//        while(count<10){
//            count++;
//            System.out.printf("%s%n", count);
//        }
        String name = "fy";
        int b=5;

        switch (name){
            case "Игорь" -> {
                System.out.println(name);
                break;
            }
            default -> {
                System.out.println("Хз");
            }
        }
        switch (name){
            case "Игорь" ->
                System.out.println(name);
            default ->
                System.out.println("Хз чё?");

        }
        switch (b){
            case 1:
                System.out.println(b);
                break;
            case 5:
                System.out.println(b-2);
                break;
        }
    }

    public static void one(){
        int a = 120000;
        int b = 130;
        System.out.printf("One: a=%s, b=%s%n", a,b);

        two();

        System.out.println("Hell\nWorld");

        b=5000;
        System.out.println("SumOne: a+b =" + (a + b));
    }

    public static void two(){
        int c = 20;
        int d = 30;
        System.out.printf("One: c=%s, d=%s%n", c,d);

        three();

        c=5;
        System.out.println("SumTwo: c+d =" + (c + d));

    }

    public static void three(){
        int e = 50;
        int f = 60;
        System.out.printf("One: e=%s, f=%s%n", e,f);
    }


}

