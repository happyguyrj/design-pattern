# Single responsibility principle (SRP)
- Every class in Java should have a single job to do
- there should only be one reason to change a class
- Problem
```java
public class Vehicle {
    public void printDetails() {}
    public double calculateValue() {}
    public void addVehicleToDB() {}
}
```