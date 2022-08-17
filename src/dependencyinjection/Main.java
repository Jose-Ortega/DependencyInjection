package dependencyinjection;

public class Main {

    public static void main(String... args) {
    /* Notice that we are creating ClassB first */
    ClassB classB = new ImprovedClassB();

    /* Constructor Injection */
    ClassA classA = new ClassA(classB);

    System.out.println("Ten Percent: " + classA.tenPercent());
  }
    
}
