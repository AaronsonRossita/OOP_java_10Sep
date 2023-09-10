public class ThreadError extends Thread{

    private String name;

    public ThreadError(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        throw new RuntimeException("boo");
    }
}
