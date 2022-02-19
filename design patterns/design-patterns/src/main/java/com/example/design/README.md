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
Lets you separate algorithms from the objects on which they operate