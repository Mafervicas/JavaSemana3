package autopista;

public class Main {
    public static void main(String[] args) throws Exception{
        System.out.println("*************");

        Auto auto1 = new Auto("rojo", "grande", "CRV", 2021, "Honda");
        System.out.println(auto1.toStringPublic());
    }
}
