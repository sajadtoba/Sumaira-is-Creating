package learScan;

public class TestMain {
    public static void main(String[] args) {
        //SingletonDemo firstInstance = new SingletonDemo();
        SingletonDemo firstInstance = SingletonDemo.getInstance();
        // Now we can call firstInstance
        firstInstance.doSomething();
        firstInstance.setName("Robin");
        String name = firstInstance.getName();
        System.out.println("I want to print out my set value  "+name);





    }
}
