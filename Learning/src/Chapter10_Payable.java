
/**
 * @author PNimmanapalli
 *
 * Abstract classes—for which you never intend to create objects.
 You make a class abstract by declaring it with keyword abstract. An abstract class normally
contains one or more abstract methods. An abstract method is one with keyword
abstract in its declaration, as in
	public abstract void draw(); // abstract method

Abstract methods do not provide implementations. A class that contains any abstract
methods must be explicitly declared abstract even if that class contains some concrete
(nonabstract) methods.
 
Each concrete subclass of an abstract superclass also must provide
concrete implementations of each of the superclass’s abstract methods.

Constructors and static methods cannot be declared abstract.

Constructors are not inherited, so an abstract constructor could never be implemented. Though non-private static
methods are inherited, they cannot be overridden. Since abstract methods are meant to
be overridden so that they can process objects based on their types, it would not make
sense to declare a static method as abstract.

We’ve discussed four ways to assign superclass and subclass references to variables of
superclass and subclass types:
	1. Assigning a superclass reference to a superclass variable is straightforward.
	2. Assigning a subclass reference to a subclass variable is straightforward.
	3. Assigning a subclass reference to a superclass variable is safe, because the subclass
		object is an object of its superclass. However, the superclass variable can be used
		to refer only to superclass members. If this code refers to subclass-only members
		through the superclass variable, the compiler reports errors.
	4. Attempting to assign a superclass reference to a subclass variable is a compilation
		error. To avoid this error, the superclass reference must be cast to a subclass type
		explicitly. At execution time, if the object to which the reference refers is not a subclass
		object, an exception will occur. (For more on exception handling, see
		Chapter 11.) You should use the instanceof operator to ensure that such a cast
		is performed only if the object is a subclass object.
		
		
10.6 final Methods and Classes

It’s also possible to declare methods, method parameters and classes with the final modifier

Final Methods Cannot Be Overridden: A final method in a superclass cannot be overridden in a subclass
Methods that are declared private are implicitly final, because it’s not possible
to override them in a subclass. Methods that are declared static are also implicitly final.
A final method’s declaration can never change, so all subclasses use the same method
implementation, and calls to final methods are resolved at compile time—this is known
as static binding.

A final class that’s declared final cannot be a superclass (i.e., a class cannot extend a final
class). All methods in a final class are implicitly final.

An interface declaration begins with the keyword interface and contains only constants and abstract methods.
Unlike classes, all interface members must be public, and interfaces may not specify any implementation
details.

All methods declared in an interface are implicitly public abstract methods, and all fields
are implicitly public, static and final.
A class that does not implement all the methods of the interface is an abstract class and must be declared
abstract.

Java does not allow subclasses to inherit from more than one superclass, but it allows a class to inherit from one superclass and implement
as many interfaces as it needs.
	public class ClassName extends SuperclassName implements FirstInterface, SecondInterface,
 *
 *
 *
 *
 */


public interface Chapter10_Payable 
{    
   double getPaymentAmount(); // calculate payment; no implementation
} // end interface Payable
