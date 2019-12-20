package learScan;

public class SingletonDemo {
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Create 2 private variable
    private int number;
    private String name;

    // Create a Method
    private SingletonDemo() {
        this.number = 5;
        this.name = "Demo";
    }
        // Create an instance of the Singleton class
        private static SingletonDemo instance = new SingletonDemo();
        // provide the global point of access to the instance
        public static SingletonDemo getInstance( ){
            return instance;

            }
            public void doSomething() {
                System.out.println("This method does something");
            }
        }





