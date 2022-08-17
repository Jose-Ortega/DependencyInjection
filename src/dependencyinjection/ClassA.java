
package dependencyinjection;

public class ClassA {

  ClassB classB;

  /* Constructor Injection */
  ClassA(ClassB injected) {
    classB = injected;
  }

  int tenPercent() {
    return (int) (classB.calculate() * 0.1d);
  }
}
