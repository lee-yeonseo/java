package method.ex;

public class MethodEx2 {

    public static void main(String[] args) {
        printMessage(3);
        printMessage(5);
        printMessage(7);
    }

    public static void printMessage(int times){
        String message = "Hello, world";
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
