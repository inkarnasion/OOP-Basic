package InterfacesandAbstraction.sayHelloExendet_05;

public class Chinese extends BasePerson implements Person {

    public Chinese(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "NiHao!";
    }
}