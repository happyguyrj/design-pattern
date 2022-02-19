# Interface Segregation Principle (ISP)
- states that clients should not be forced to depend upon interface members they do not use
- do not force any client to implement an interface that is irrelevant to them.
- Problem
```java
public interface Vehicle {
    public void drive();
    public void stop();
    public void refuel();
    public void openDoors();
}
public class Bike implements Vehicle {

    // Can be implemented
    public void drive() {...}
    public void stop() {...}
    public void refuel() {...}
    
    // Can not be implemented
    public void openDoors() {...}
}
```
- Solution
```java
public interface IBike {
    public void drive();
    public void stop();
    public void refuel();
}

public interface ICar extends Bike {
    public void openDoors();
}

public class Bike implements IBike {

    // Can be implemented
    public void drive() {...}
    public void stop() {...}
    public void refuel() {...}
}

public class Bike implements ICar {

    // Can be implemented
    public void drive() {...}
    public void stop() {...}
    public void refuel() {...}
    public void openDoors() {...}
}
```


