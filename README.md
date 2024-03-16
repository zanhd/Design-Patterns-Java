# Design-Patterns-Java
Implementation of Design Patterns using Java

There are numerous design patterns categorized into three main groups: Creational, Structural, and Behavioral. Here's a list of some commonly known design patterns within each category:

### Creational Design Patterns:
1. **Singleton Pattern**: Ensures a class has only one instance and provides a global point of access to it.
2. **Factory Method Pattern**: Defines an interface for creating objects, but allows subclasses to alter the type of objects that will be created.
3. **Abstract Factory Pattern**: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
4. **Builder Pattern**: Separates the construction of a complex object from its representation so that the same construction process can create different representations.
5. **Prototype Pattern**: Creates new objects by copying an existing object, known as the prototype.
6. **Object Pool Pattern**: Manages a pool of objects to reduce memory usage and improve performance by reusing objects from the pool.

### Structural Design Patterns:
1. **Adapter Pattern**: Allows objects with incompatible interfaces to work together by providing a wrapper with the required interface.
2. **Bridge Pattern**: Separates an object’s abstraction from its implementation so that they can be modified independently.
3. **Composite Pattern**: Composes objects into tree structures to represent part-whole hierarchies. Clients can treat individual objects and compositions of objects uniformly.
4. **Decorator Pattern**: Attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
5. **Facade Pattern**: Provides a simplified interface to a set of interfaces in a subsystem to make it easier to use.
6. **Flyweight Pattern**: Minimizes memory usage or computational expenses by sharing as much as possible with related objects.

### Behavioral Design Patterns:
1. **Observer Pattern**: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
2. **Strategy Pattern**: Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
3. **Command Pattern**: Encapsulates a request as an object, thereby allowing for parameterization of clients with queues, requests, and operations.
4. **Chain of Responsibility Pattern**: Passes a request along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.
5. **Iterator Pattern**: Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
6. **State Pattern**: Allows an object to alter its behavior when its internal state changes. The object will appear to change its class.
7. **Template Method Pattern**: Defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.
8. **Visitor Pattern**: Represents an operation to be performed on the elements of an object structure. Visitors let you define a new operation without changing the classes of the elements on which it operates.

These are just some of the most commonly cited design patterns. There may be more patterns discovered or variations/extensions of existing ones as software design evolves.
