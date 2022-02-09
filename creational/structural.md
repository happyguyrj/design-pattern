# Adapter
- allows objects with incompatible interfaces to collaborate.
- Problem
    -
## Solution
- The adapter gets an interface, compatible with one of the existing objects.
- Using this interface, the existing object can safely call the adapter’s methods.
- Upon receiving a call, the adapter passes the request to the second object, but in a format and order that the second object expects.
- This pattern involves a single class which is responsible to join functionalities of independent or incompatible interfaces
## Examples
- hole-peg fits
- card reader
## Applicability
- Use the Adapter class when you want to use some existing class, but its interface isn’t compatible with the rest of your code.
- involves an interface which acts as a bridge which makes the functionality of concrete classes independent from interface implementer classes.
- Use the pattern when you want to reuse several existing subclasses that lack some common functionality that can’t be added to the superclass.
## How to Implement
-
## Pros and Cons
- Pros
    - Single Responsibility Principle. You can separate the interface or data conversion code from the primary business logic of the program.
    - Open/Closed Principle. You can introduce new types of adapters into the program without breaking the existing client code, as long as they work with the adapters through the client interface.
- Cons
    -

# Bridge
- used when we need to decouple an abstraction from its implementation so that the two can vary independently
- lets you split a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.
# Problem
-
# Solution
-
# Examples
- TV-Radio Remote
# Applicability
- Use the Bridge pattern when you want to divide and organize a monolithic class that has several variants of some functionality (for example, if the class can work with various database servers).
- Use the pattern when you need to extend a class in several orthogonal (independent) dimensions.
-  Use the Bridge if you need to be able to switch implementations at runtime.
# How to Implement
-
## Pros and Cons
- Pros
    - You can create platform-independent classes and apps.
    - The client code works with high-level abstractions. It isn’t exposed to the platform details.
    - Open/Closed Principle. You can introduce new abstractions and implementations independently from each other.
    - Single Responsibility Principle. You can focus on high-level logic in the abstraction and on platform details in the implementation.
- Cons
    -

## Composite
- used where we need to treat a group of objects in similar way as a single object
- composes objects in term of a tree structure to represent part as well as whole hierarchy
- lets you compose objects into tree structures and then work with these structures as if they were individual objects.
## Problem
- Using the Composite pattern makes sense only when the core model of your app can be represented as a tree.
## Solution
-
## Examples
- Image editor
- Employee
## Applicability
- Use the Composite pattern when you have to implement a tree-like object structure.
- Use the pattern when you want the client code to treat both simple and complex elements uniformly.
## How to Implement
-
## Pros and Cons
- Pros
    - You can work with complex tree structures more conveniently- use polymorphism and recursion to your advantage.
    - Open/Closed Principle. You can introduce new element types into the app without breaking the existing code, which now works with the object tree.
- Cons
    -

# Decorator
- allows a user to add new functionality to an existing object without altering its structure
- decorator class which wraps the original class and provides additional functionality keeping class methods signature intact.
- lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.
# Problem
-
# Solution
-
# Examples
- Encoding and compression decorators
- Shape decorator
# Applicability
- Use the Decorator pattern when you need to be able to assign extra behaviors to objects at runtime without breaking the code that uses these objects.
- Use the pattern when it’s awkward or not possible to extend an object’s behavior using inheritance.
# How to Implement
-
# Pros and Cons
- Pros
    - You can extend an object’s behavior without making a new subclass.
    - You can add or remove responsibilities from an object at runtime.
    - You can combine several behaviors by wrapping an object into multiple decorators.
    - Single Responsibility Principle. You can divide a monolithic class that implements many possible variants of behavior into several smaller classes.
- Cons
    -

# Facade
- hides the complexities of the system and provides an interface to the client using which the client can access the system
- provides a simplified interface to a library, a framework, or any other complex set of classes.
## Problem
-
## Solution
- A facade is a class that provides a simple interface to a complex subsystem which contains lots of moving parts. A facade might provide limited functionality in comparison to working with the subsystem directly. However, it includes only those features that clients really care about.
## Examples
- Audio mixer
- ShapeMaker
## Applicability
- Use the Facade pattern when you need to have a limited but straightforward interface to a complex subsystem.
- Use the Facade when you want to structure a subsystem into layers.
## How to Implement
-
## Pros and Cons
- Pros
    - You can isolate your code from the complexity of a subsystem.
- Cons
    -

# Flyweight
- reduce the number of objects created and to decrease memory footprint and increase performance
- lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each object.
## Problem
-
## Solution
-
## Examples
- forest maker
## Applicability
- Use the Flyweight pattern only when your program must support a huge number of objects which barely fit into available RAM.
## How to Implement
-
## Pros and Cons
- Pros
    - You can save lots of RAM, assuming your program has tons of similar objects.
- Cons
    -

# Proxy
- In proxy pattern, a class represents functionality of another class. This type of design pattern comes under structural pattern.
- lets you provide a substitute or placeholder for another object. A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.
## Problem
-
## Solution
- The Proxy pattern suggests that you create a new proxy class with the same interface as an original service object. Then you update your app so that it passes the proxy object to all of the original object’s clients. Upon receiving a request from a client, the proxy creates a real service object and delegates all the work to it.
## Examples
-
## Applicability
- Lazy initialization (virtual proxy). This is when you have a heavyweight service object that wastes system resources by being always up, even though you only need it from time to time.
- Access control (protection proxy). This is when you want only specific clients to be able to use the service object; for instance, when your objects are crucial parts of an operating system and clients are various launched applications (including malicious ones).
- Local execution of a remote service (remote proxy). This is when the service object is located on a remote server.
- Logging requests (logging proxy). This is when you want to keep a history of requests to the service object.
- Caching request results (caching proxy). This is when you need to cache results of client requests and manage the life cycle of this cache, especially if results are quite large.
- Smart reference. This is when you need to be able to dismiss a heavyweight object once there are no clients that use it.
## How to Implement
-
## Pros and Cons
- Pros
    - You can control the service object without clients knowing about it.
    - You can manage the lifecycle of the service object when clients don’t care about it.
    - The proxy works even if the service object isn’t ready or is not available.
    - Open/Closed Principle. You can introduce new proxies without changing the service or clients.
- Cons
    -

# Filter
- enables developers to filter a set of objects using different criteria and chaining them in a decoupled way through logical operations.
## Problem
-
## Solution
-
## Examples
- Strong criterion
## Applicability
-
## How to Implement
-
## Pros and Cons
- Pros
    -
- Cons
    -