package reflection.advancedlevel.loggingproxy;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new GreetingImpl();
        Greeting proxy = LoggingProxy.createProxy(greeting, Greeting.class);

        System.out.println(proxy.sayHello("Alice"));
    }
}

