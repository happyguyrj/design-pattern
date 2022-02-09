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

Command
-
- Problem
    -
- Solution
    -
- Examples
    -
- Applicability
    -
- How to Implement
    -
- Pros and Cons
    - Pros
        -
    - Cons
        -

Iterator
-
- Problem
    -
- Solution
    -
- Examples
    -
- Applicability
    -
- How to Implement
    -
- Pros and Cons
    - Pros
        -
    - Cons
        -

Mediator
-
- Problem
    -
- Solution
    -
- Examples
    -
- Applicability
    -
- How to Implement
    -
- Pros and Cons
    - Pros
        -
    - Cons
        -

Memento
-
- Problem
    -
- Solution
    -
- Examples
    -
- Applicability
    -
- How to Implement
    -
- Pros and Cons
    - Pros
        -
    - Cons
        -

Observer
-
- Problem
    -
- Solution
    -
- Examples
    -
- Applicability
    -
- How to Implement
    -
- Pros and Cons
    - Pros
        -
    - Cons
        -

State
-
- Problem
    -
- Solution
    -
- Examples
    -
- Applicability
    -
- How to Implement
    -
- Pros and Cons
    - Pros
        -
    - Cons
        -

Strategy
-
- Problem
    -
- Solution
    -
- Examples
    -
- Applicability
    -
- How to Implement
    -
- Pros and Cons
    - Pros
        -
    - Cons
        -

Template Method
-
- Problem
    -
- Solution
    -
- Examples
    -
- Applicability
    -
- How to Implement
    -
- Pros and Cons
    - Pros
        -
    - Cons
        -

Visitor
-
- Problem
    -
- Solution
    -
- Examples
    -
- Applicability
    -
- How to Implement
    -
- Pros and Cons
    - Pros
        -
    - Cons
        -


