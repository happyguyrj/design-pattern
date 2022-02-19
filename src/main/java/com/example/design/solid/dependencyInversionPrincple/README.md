# Dependency Inversion Principle (DIP)
- states that we should depend on abstractions (interfaces and abstract classes) instead of concrete implementations (classes)
- abstractions should not depend on details; instead, the details should depend on abstractions.
- Problem
```java
public class Car {
    private Engine engine;
    public Car(Engine e) {
        engine = e;
    }
    public void start() {
        engine.start();
    }
}

public class Engine {
   public void start() {...}
}
```
- Solution
```java
public interface EngineInterface {
    public void start();
}

public class Car {
    private EngineInterface engine;
    public Car(EngineInterface e) {
        engine = e;
    }
    public void start() {
        engine.start();
    }
}

public class PetrolEngine implements EngineInterface {
   public void start() {...}
}

public class DieselEngine implements EngineInterface {
   public void start() {...}
}
```
