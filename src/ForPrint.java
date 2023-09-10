public class ForPrint implements Printable{
    @Override
    public int print(int x) {
        System.out.println("For print");
        return x;
    }

}
