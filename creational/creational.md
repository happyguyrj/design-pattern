# Factory Method (Virtual Constructor)
- create object without exposing the creation logic to the client and refer to newly created object using a common interface
- provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.
## Solution
- The Factory Method pattern suggests that you replace direct object construction calls (using the new operator) with calls to a special factory method.
## Examples
- Logictics company
- Cross platform UI
- OS App
## Applicability
Use the Factory Method when you
    - don’t know beforehand the exact types and dependencies of the objects your code should work with.
    - want to provide users of your library or framework with a way to extend its internal components.
    - want to save system resources by reusing existing objects instead of rebuilding them each time.
## How to Implement
-
## Pros and Cons
- Pros
    - You avoid tight coupling between the creator and the concrete products.
    - Single Responsibility Principle. You can move the product creation code into one place in the program, making the code easier to support.
    - Open/Closed Principle. You can introduce new types of products into the program without breaking existing client code.

# Abstract Factory
- lets you produce families of related objects without specifying their concrete classes.
- work around a super-factory which creates other factories
- also called as factory of factories
- an interface is responsible for creating a factory of related objects without explicitly specifying their classes

## Solution
- The first thing the Abstract Factory pattern suggests is to explicitly declare interfaces for each distinct product of the product family (e.g., chair, sofa or coffee table). Then you can make all variants of products follow those interfaces.
## Examples
- Furniture shop simulator
## Applicability
- Use the Abstract Factory when your code needs to work with various families of related products, but you don’t want it to depend on the concrete classes of those products—they might be unknown beforehand or you simply want to allow for future extensibility.
## How to Implement
    -
## Pros and Cons
- Pros
    - You can be sure that the products you’re getting from a factory are compatible with each other.
    - You avoid tight coupling between concrete products and client code.
    - Single Responsibility Principle. You can extract the product creation code into one place, making the code easier to support.
    - Open/Closed Principle. You can introduce new variants of products without breaking existing client code.

# Builder
- lets you construct complex objects step by step.
- builds a complex object using simple objects
- The pattern allows you to produce different types and representations of an object using the same construction code.
## Examples
- Car Builder
- House Builder
## Applicability
- Use the Builder pattern to get rid of a “telescopic constructor”.
- Use the Builder pattern when you want your code to be able to create different representations of some product (for example, stone and wooden houses).
- Use the Builder to construct Composite trees or other complex objects.
## How to Implement
-
## Pros and Cons
- Pros
    - You can construct objects step-by-step, defer construction steps or run steps recursively.
    - You can reuse the same construction code when building various representations of products.
    - Single Responsibility Principle. You can isolate complex construction code from the business logic of the product.

# Prototype (Clone)
- lets you copy existing objects without making your code dependent on their classes.
- creating duplicate object while keeping performance in mind
- involves implementing a prototype interface which tells to create a clone of the current object
- used when creation of object directly is costly
## Solution
The Prototype pattern delegates the cloning process to the actual objects that are being cloned. The pattern declares a common interface for all objects that support cloning. This interface lets you clone an object without coupling your code to the class of that object. Usually, such an interface contains just a single clone method.
## Examples
- Shape copy
## Applicability
- Use the Prototype pattern when your code shouldn’t depend on the concrete classes of objects that you need to copy.
- Use the pattern when you want to reduce the number of subclasses that only differ in the way they initialize their respective objects. Somebody could have created these subclasses to be able to create objects with a specific configuration.
## How to Implement
-
## Pros and Cons
- Pros
    - You can clone objects without coupling to their concrete classes.
    - You can get rid of repeated initialization code in favor of cloning pre-built prototypes.
    - You can produce complex objects more conveniently.
    - You get an alternative to inheritance when dealing with configuration presets for complex objects.

# Singleton
- lets you ensure that a class has only one instance, while providing a global access point to this instance.
## Problem
- Ensure that a class has just a single instance
- Provide a global access point to that instance
## Solution
- Make the default constructor private, to prevent other objects from using the new operator with the Singleton class.
- Create a static creation method that acts as a constructor. Under the hood, this method calls the private constructor to create an object and saves it in a static field. All following calls to this method return the cached object.
## Examples
-
## Applicability
- Use the Singleton pattern when a class in your program should have just a single instance available to all clients; for example, a single database object shared by different parts of the program.
- Use the Singleton pattern when you need stricter control over global variables.
## How to Implement
-
## Pros and Cons
- Pros
    - You can be sure that a class has only a single instance.
    - You gain a global access point to that instance.
    - The singleton object is initialized only when it’s requested for the first time.
- Cons
    - Violates the Single Responsibility Principle. The pattern solves two problems at the time.
    - The Singleton pattern can mask bad design, for instance, when the components of the program know too much about each other.
    - The pattern requires special treatment in a multithreaded environment so that multiple threads won’t create a singleton object several times.

