# Open-closed principle (OCP)
- Software entities (e.g., classes, modules, functions) should be open for an extension, but closed for modification.
- Problem
```java
public class VehicleCalculations {
    public double calculateValue(Vehicle v) {
        if (v instanceof Car) 
            return v.getValue() * 0.8;
        if (v instanceof Bike)
            return v.getValue() * 0.5;
    }
}
```
- Solution
```java
public class Vehicle {
    public double calculateValue() {...}
}
public class Car extends Vehicle {
    public double calculateValue() {
        return this.getValue() * 0.8;
}
public class Truck extends Vehicle{
    public double calculateValue() {
        return this.getValue() * 0.9;
}
```