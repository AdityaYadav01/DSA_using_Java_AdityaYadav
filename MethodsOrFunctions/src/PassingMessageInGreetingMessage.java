public class PassingMessageInGreetingMessage {
    public static void main(String[] args) {
        String greet = message("Aditya Yadav");
        System.out.println(greet);
    }

    static String message(String Name){
        String greet = "Hello " + Name;
        return greet;

    }
}
