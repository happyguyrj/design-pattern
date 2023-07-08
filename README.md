# Features of Good Design
## Code reuse
### Levels of reuse
#### Lowest Level
- reuse classes
#### Middle level
- design patterns
#### Highest Level
- framework

## Extensibility
Change is the only constant thing in a programmer’s life.

# Design Principles
## Encapsulate What Varies
- Identify the aspects of your application that vary and separate them from what stays the same.
### Encapsulation on a method level
Say you’re making an e-commerce website. Somewhere in your code, there’s a getOrderTotal method that calculates a grand total for the order, including taxes. We can anticipate that tax-related code might need to change in the future
### Encapsulation on a class level
Objects of the Order class delegate all tax-related work to a special object that does just that

## Program to an Interface, not an Implementation
- Depend on abstractions, not on concrete classes.

## Favor Composition Over Inheritance
Caveats of subclass
- A subclass can’t reduce the interface of the superclass
- When overriding methods you need to make sure that the new behavior is compatible with the base one
- Inheritance breaks encapsulation of the superclass
- Subclasses are tightly coupled to superclasses
- Trying to reuse code through inheritance can lead to creating parallel inheritance hierarchies


# SOLID
## Single Responsibility Principle
A class should have just one reason to change.
Example: Let's consider a User class that is responsible for both user authentication and sending emails. However, it is aligned with SRP to split these responsibilities into separate classes
```java
class UserAuthenticator {
    public void authenticateUser(String username, String password) {
        // logic for authenticating the user
    }
}

class EmailSender {
    public void sendEmail(String to, String subject, String message) {
        // logic for sending an email
    }
}
```

## Open/Closed Principle
Classes should be open for extension but closed for modification.
```java
abstract class Customer {
    // common properties and methods
    
    public abstract double calculateDiscount(double amount);
}

class RegularCustomer extends Customer {
    public double calculateDiscount(double amount) {
        // Discount calculation for regular customers
        return amount * 0.1;
    }
}

class PremiumCustomer extends Customer {
    public double calculateDiscount(double amount) {
        // Discount calculation for premium customers
        return amount * 0.2;
    }
}
```

## Liskov Substitution Principle
When extending a class, remember that you should be able to pass objects of the subclass in place of objects of the parent class without breaking the client code.
- Parameter types in a method of a subclass should match or be more abstract than parameter types in the method of the superclass.
- The return type in a method of a subclass should match or be a subtype of the return type in the method of the superclass
- A method in a subclass shouldn’t throw types of exceptions which the base method isn’t expected to throw
- A subclass shouldn’t strengthen pre-conditions
- A subclass shouldn’t weaken post-conditions
- Invariants of a superclass must be preserved
- A subclass shouldn’t change values of private fields of the superclass

Example: Let's consider a scenario where we have a base class called Vehicle and two subclasses called Car and Motorcycle. The Vehicle class has a startEngine() method, and both subclasses override this method to provide their own implementation.
```java
class Vehicle {
    public void startEngine() {
        // Common logic to start the engine
        System.out.println("Engine started");
    }
}

class Car extends Vehicle {
    public void startEngine() {
        // Car-specific logic to start the engine
        System.out.println("Car engine started");
    }
}

class Motorcycle extends Vehicle {
    public void startEngine() {
        // Motorcycle-specific logic to start the engine
        System.out.println("Motorcycle engine started");
    }
}
```

Now, let's envision a scenario where we have a method that accepts a Vehicle object and calls the startEngine() method. According to the Liskov Substitution Principle, we should be able to use any subtype of Vehicle without affecting the correctness of the program.
```java
class VehicleStarter {
    public void start(Vehicle vehicle) {
        vehicle.startEngine();
    }
}
```
We can create instances of both Car and Motorcycle, pass them to the start() method, and observe that the correct startEngine() method is invoked based on the actual object type:
```java
public class Main {
    public static void main(String[] args) {
        VehicleStarter vehicleStarter = new VehicleStarter();

        Vehicle car = new Car();
        vehicleStarter.start(car); // Prints "Car engine started"

        Vehicle motorcycle = new Motorcycle();
        vehicleStarter.start(motorcycle); // Prints "Motorcycle engine started"
    }
}
```
As demonstrated in this example, the VehicleStarter class expects a Vehicle object but can work correctly with both Car and Motorcycle objects, without any modification to its code. This adherence to the Liskov Substitution Principle ensures that the behavior of the program remains intact when substituting one subtype for another.

## Interface Segregation Principle
Clients shouldn’t be forced to depend on methods they do not use.
Example: Suppose we have an interface called Printer that defines various printing operations:
```java
interface Printer {
    void print();
    void scan();
    void fax();
    void photocopy();
}
```

However, consider a scenario where not all printers support all of these operations. For instance, some printers may lack the capability to fax or scan. In this case, we can apply ISP by segregating the Printer interface into smaller, more specialized interfaces.
```java
interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

interface FaxMachine {
    void fax();
}

interface Photocopier {
    void photocopy();
}
```

Now we can create specific printer classes that implement the corresponding interfaces based on their capabilities:
```java
class MultifunctionPrinter implements Printer, Scanner, FaxMachine, Photocopier {
    public void print() {
        // Implementation for printing
    }
    
    public void scan() {
        // Implementation for scanning
    }
    
    public void fax() {
        // Implementation for faxing
    }
    
    public void photocopy() {
        // Implementation for photocopying
    }
}

class SimplePrinter implements Printer {
    public void print() {
        // Implementation for printing
    }
}
```

With these smaller, focused interfaces, classes can implement just the methods that are relevant to their functionality, while avoiding unnecessary dependencies.

By applying the Interface Segregation Principle (ISP), the client code can now depend on specific interfaces relevant to their needs, reducing the impact of unrelated methods.
```java
class PrintClient {
    private final Printer printer;

    public PrintClient(Printer printer) {
        this.printer = printer;
    }

    public void doPrint() {
        printer.print();
    }
}

class ScanClient {
    private final Scanner scanner;

    public ScanClient(Scanner scanner) {
        this.scanner = scanner;
    }

    public void doScan() {
        scanner.scan();
    }
}
```
In this example, the PrintClient class depends only on the Printer interface, and ScanClient depends only on the Scanner interface. Thus, each client class is designed to use only the functionalities it requires, adhering to the Interface Segregation Principle.

## Dependency Inversion Principle
High-level classes shouldn’t depend on low-level classes. Both should depend on abstractions. Abstractions shouldn’t depend on details. Details should depend on abstractions
Example: Consider a UserService that depends on a specific database implementation. Instead, we can make it depend on an interface, allowing flexibility to use different databases
```java
interface Database {
    void save(String data);
}

class MySQLDatabase implements Database {
    public void save(String data) {
        // logic for saving data in MySQL
    }
}

class OracleDatabase implements Database {
    public void save(String data) {
        // logic for saving data in Oracle
    }
}

class UserService {
    private final Database database;
    
    public UserService(Database database) {
        this.database = database;
    }
    
    public void saveUser(String userData) {
        database.save(userData);
    }
}

```


# Design patterns
## Creational Design Patterns
Creational patterns provide various object creation mechanisms, which increase flexibility and reuse of existing code.
### Factory pattern
provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

### Abstract Factory pattern
lets you produce families of related objects without specifying their concrete classes.

### Singleton pattern
lets you ensure that a class has only one instance, while providing a global access point to this instance.

### Prototype pattern
lets you copy existing objects without making your code dependent on their classes.

### Builder pattern
lets you construct complex objects step by step.

## Structural Design Patterns
Structural patterns explain how to assemble objects and classes into larger structures while keeping these structures flexible and efficient.

### Adapter pattern
Allows object with incompatible type to collaborate

### Bridge pattern
lets you split a large class of closely related objects into two separate hierarchies

### Composite pattern
Lets you compose objects into tree structures and then work with these structures as if these were individual objects

### Decorator pattern
Lets you attach new behaviour to objects by placing these objects in a special wrapper objects that contain these behaviours

### Facade pattern
Provides a simplified interface to a library/framework

### Flyway pattern
lets you fit more objects in RAM by sharing common parts of state between multiple objects instead of keeping all data in an object

### Proxy pattern
Lets you substitute of placeholder for another object. A proxy controls access to another object, allowing to perform some actions before/after request goes through original object

## Behavioral Design Patterns
Behavioral design patterns are concerned with algorithms and the assignment of responsibilities between objects.

### Chain of Responsibility
Lets you pass a request along chain of handlers.

### Command pattern
Turns a request into standalone object that contains all information about the request

### Iterator pattern
Lets you transverse elements of a collection without exposing its underlying representation

### Mediator pattern
Lets you reduce chaotic dependencies between objects. This restricts direct communication between objects and forces them to collaborate via a mediator

### Memento pattern
Lets you save and restore previous state of an object without revealing details of its implementation

### Observer pattern
Lets you define a subscription mechanism to notify multiple objects about any events that happen to object they are observing

### State pattern
Lets and object alter its behavior when its internal state changes

### Strategy pattern
Lets you define a family of algorithms, put each into a separate class and make their objects interchangeable

### Template pattern
Defines the skeleton of an algorithm in the superclass and lets subclass override specific setups of algorithm without changing its structure

### Visitor pattern
- Lets you separate algorithms from the objects on which they operate
- Defines a new operation to a class without change
