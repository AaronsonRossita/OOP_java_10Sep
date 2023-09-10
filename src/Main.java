import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        MyThread thread1 = new MyThread("One");
//        MyThread thread2 = new MyThread("Two");
//        ThreadError thread3 = new ThreadError("Three");
//        thread1.start();
//        thread3.start();
//        thread2.start();

        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//
//        for(String s : list){
//            System.out.println(s);
//        }

//        list.forEach((s) -> System.out.println(s));
//        list.forEach(System.out::println);

        ForPrint forPrint = new ForPrint();
        Printable printable = (y) ->  {
            System.out.println(y);
            return y;
        };
        printFromPrintable(forPrint);
        printFromPrintable(printable);
    }

    public static void printFromPrintable(Printable p){
        p.print(5);
    }

    public static void switchLambda(int day){
        switch (day) {
            case 1 -> System.out.println("Mon");
            case 2 -> System.out.println("Tue");
            case 3 -> System.out.println("Wed");
            case 4 -> System.out.println("Thu");
            case 5 -> System.out.println("Fri");
            case 6 -> System.out.println("Sat");
            case 7 -> System.out.println("Sun");
            default -> System.out.println("Not a week day");
        }
    }


}