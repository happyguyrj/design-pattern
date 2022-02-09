# Chain of Responsibility
- chain of receiver objects for a request
- decouples sender and receiver of a request based on type of request
- lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.
# Problem
-
# Solution
-
# Examples
-
# Applicability
- Use the Chain of Responsibility pattern when your program is expected to process different kinds of requests in various ways, but the exact types of requests and their sequences are unknown beforehand.
- Use the pattern when it’s essential to execute several handlers in a particular order.
- Use the CoR pattern when the set of handlers and their order are supposed to change at runtime.
# How to Implement
-
# Pros and Cons
- Pros
    - You can control the order of request handling.
    - Single Responsibility Principle. You can decouple classes that invoke operations from classes that perform operations.
    - Open/Closed Principle. You can introduce new handlers into the app without breaking the existing client code.
- Cons
    -

# Command
- data driven design pattern
- request is wrapped under an object as command and passed to invoker object
- Invoker object looks for the appropriate object which can handle this command and passes the command to the corresponding object which executes the command.
## Problem
-
## Solution
-
## Examples
-
## Applicability
-
## How to Implement
-
## Pros and Cons
- Pros
    -
- Cons
    -

# Iterator
- used to get a way to access the elements of a collection object in sequential manner without any need to know its underlying representation.
## Problem
-
## Solution
-
## Examples
-
## Applicability
-
## How to Implement
-
## Pros and Cons
- Pros
    -
- Cons
    -
# Mediator
- used to reduce communication complexity between multiple objects or classes
- a mediator class which normally handles all the communications between different classes and supports easy maintenance of the code by loose coupling
## Problem
-
## Solution
-
## Examples
- chatroom
## Applicability
-
## How to Implement
-
## Pros and Cons
- Pros
    -
- Cons
    -

# Memento
- used to restore state of an object to a previous state
## Problem
-
## Solution
- Memento contains state of an object to be restored.
- Originator creates and stores states in Memento objects.
- Caretaker object is responsible to restore object state from Memento.
## Examples
-
## Applicability
-
## How to Implement
-
## Pros and Cons
- Pros
    -
- Cons
    -

# Observer
- used when there is one-to-many relationship between objects such as if one object is modified, its depenedent objects are to be notified automatically.
## Problem
-
## Solution
-
## Examples
-
## Applicability
-
## How to Implement
-
## Pros and Cons
- Pros
    -
- Cons
    -

# State
- a class behavior changes based on its state
## Problem
-
## Solution
-
## Examples
-
## Applicability
-
## How to Implement
-
## Pros and Cons
- Pros
    -
- Cons
    -

# Strategy
- a class behavior or its algorithm can be changed at run time
## Problem
-
## Solution
-
## Examples
-
## Applicability
-
## How to Implement
-
## Pros and Cons
- Pros
    -
- Cons
    -

# Template Method
- an abstract class exposes defined way(s)/template(s) to execute its methods.
## Problem
-
## Solution
-
## Examples
-
## Applicability
-
## How to Implement
-
## Pros and Cons
- Pros
    -
- Cons
    -

# Visitor
- use a visitor class which changes the executing algorithm of an element class
- execution algorithm of element can vary as and when visitor varies
## Problem
-
## Solution
-
## Examples
-
## Applicability
-
## How to Implement
-
## Pros and Cons
- Pros
    -
- Cons
    -

# Null object
- a null object replaces check of NULL object instance
- Instead of putting if check for a null value, Null Object reflects a do nothing relationship. Such Null object can also be used to provide default behaviour in case data is not available.
## Problem
-
## Solution
- In Null Object pattern, we create an abstract class specifying various operations to be done, concrete classes extending this class and a null object class providing do nothing implemention of this class and will be used seemlessly where we need to check null value.
## Examples
-
## Applicability
-
## How to Implement
-
## Pros and Cons
- Pros
    -
- Cons
    -


# Interpreter
- provides a way to evaluate language grammar or expression.
## Problem
-
## Solution
-
## Examples
-
## Applicability
-
## How to Implement
-
## Pros and Cons
- Pros
    -
- Cons
    -


