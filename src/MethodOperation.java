public class MethodOperation {

    public MethodOperation() {
        System.out.println("Simple overloading");
    }

    public MethodOperation(String name){
        System.out.println("Parameterized constructor" + name);
    }

    void info(){
        System.out.println("just for your info");
    }

    void info(String message){
        System.out.println("this " + message + " is for your info");
    }
}


