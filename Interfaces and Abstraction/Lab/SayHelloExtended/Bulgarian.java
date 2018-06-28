package InterfacesandAbstraction.sayHelloExendet_05;

public class Bulgarian extends BasePerson implements Person {

    public Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Zdravei!";
    }
}