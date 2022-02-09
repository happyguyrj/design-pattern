# Chain of Responsibility
- chain of receiver objects for a request
- decouples sender and receiver of a request based on type of request
- lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.
# Problem
-
# Solution
-
# Examples
![image](https://user-images.githubusercontent.com/15718435/153119522-291fa31f-9948-435f-bf22-d117a675b355.png)
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
![image](https://user-images.githubusercontent.com/15718435/153119555-6ddbeac5-9c05-4654-a8e4-b154fb9fe0ba.png)
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
![image](https://user-images.githubusercontent.com/15718435/153119588-7c80fe40-9828-495f-acfb-670564b3eb0a.png)
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
- ![image](https://user-images.githubusercontent.com/15718435/153119620-4f1732e6-b791-42e6-a804-a380e59b4fb1.png)
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
![image](https://user-images.githubusercontent.com/15718435/153119633-30878f45-26db-46d3-8e69-250465d65a8d.png)
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
![image](https://user-images.githubusercontent.com/15718435/153119652-58f58633-1283-48a5-8825-b73796bdacaa.png)
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
![image](https://user-images.githubusercontent.com/15718435/153119675-2f8f8d51-9064-480f-ad7a-b8a14919afd0.png)
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
![image](https://user-images.githubusercontent.com/15718435/153119690-97c8c758-e017-4785-93cd-760875cffb1f.png)
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
![image](https://user-images.githubusercontent.com/15718435/153119738-a7578bb1-0845-435b-a93f-9fdb941f9976.png)
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
![image](https://user-images.githubusercontent.com/15718435/153119769-0998989f-3d6a-4b51-af4a-2a1c7b31fbc2.png)
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
![image](https://user-images.githubusercontent.com/15718435/153119787-b27630cf-68bf-4bc2-a6ba-6b40c103de1c.png)
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
![image](https://user-images.githubusercontent.com/15718435/153119811-91f7ac4c-8479-4b48-9649-c6c5c9e09ffe.png)
## Applicability
-
## How to Implement
-
## Pros and Cons
- Pros
    -
- Cons
    -


