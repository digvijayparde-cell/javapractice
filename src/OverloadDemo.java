

public class OverloadDemo {
    public void execute(int data) {
        System.out.println(data);
    }

    public void execute(String data) {
        System.out.println(data);
    }

    public void execute(int data, String text) {
        System.out.println(data);
        System.out.println(text);
    }
    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();
        obj.execute(100);
        obj.execute("Testing");
        obj.execute(50, "Java");
    }
}