/**
 * @author PNimmanapalli
 * *8.10 Garbage Collection and Method finalize

 *
 *Every class in Java has the methods of class Object (package java.lang), one of which is
the finalize method.

The JVM performs automatic garbage collection to reclaim the
memory occupied by objects that are no longer used. When there are no more references
to an object, the object is eligible to be collected. This typically occurs when the JVM executes
its garbage collector.

The finalize method is called by the garbage collector to perform termination
housekeeping on an object just before the garbage collector reclaims the object’s memory.

Method finalize does not take parameters and has return type void. A problem with
method finalize is that the garbage collector is not guaranteed to execute at a specified
time.

8.11 static Class Members
Static variables have class scope. We can access a class’s public static members
through a reference to any object of the class, or by qualifying the member name with the
class name and a dot (.), as in Math.random().

Actually, static class members exist even when no objects of the class exist—they’re available as soon as the class is
loaded into memory at execution time.

A static method cannot access non-static class members, because a static method
can be called even when no objects of the class have been instantiated. For the same reason,
the this reference cannot be used in a static method. The this reference must refer to
a specific object of the class, and when a static method is called, there might not be any
objects of its class in memory.

Actually, String objects in Java are immutable—they cannot be modified after they’re created
Stringconcatenation operations actually result in a new Strings object containing the concatenated
values. The original String objects are not modified.
	
	8.12 static Import
	A static import declaration enables you to import the static members of
a class or interface so you can access them via their unqualified names in your class—the
class name and a dot (.) are not required to use an imported static member.

A static import declaration has two forms—one that imports a particular static
member (which is known as single static import) and one that imports all static members
of a class (known as static import on demand).

8.13 final Instance Variables
If Final Variables are not initialized, they must be initialized in every constructor
of the class. Initializing constants in constructors enables each object of the class to have
a different value for the constant. If a final variable is not initialized in its declaration or
in every constructor, a compilation error occurs.

8.14 Time Class Case Study: Creating Packages:

The steps for creating a reusable class are:
1. Declare a public class. If the class is not public, it can be used only by other
classes in the same package.
2. Choose a unique package name and add a package declaration to the source-code
file for the reusable class declaration.
	Note: If no package statement is provided, the class
is placed in the so-called default package and is accessible only to other classes in
the default package that are located in the same directory
3. Compile the class so that it’s placed in the appropriate package directory.
4. Import the reusable class into a program and use the class.

Placing a package declaration at the beginning of a Java source
file indicates that the class declared in the file is part of the specified package.

Only one of the class declarations in a particular file can be public. Other classes in the
file are placed in the package and can be used only by the other classes in the package.
Non-public classes are in a package to support the reusable classes in the package

The package declaration "package com.deitel.jhtp.ch08;" indicates that
class Time1 should be placed in the directory
 com
	deitel
		jhtp
			ch08
 
 When compiling a class in a package, the javac command-line option -d causes the
javac compiler to create appropriate directories based on the class’s package declaration.
The option also specifies where the directories should be stored. For example, in a command
window, we used the compilation command
to specify that the first directory in our package name should be placed in the current directory.
Note: If you do not use the -d option, then you must copy or move
the class file to the appropriate package directory after compiling it.

You can specify the classpath in the java command via the -classpath or -cp command-line options, followed by
a list of directories or archive files separated by semicolons (;)

8.15 Package Access


 *
 *
 */
import java.awt.Color;
import java.awt.Graphics;


public class Chpater8_18_MyLine {
	
	private int x1; // x-coordinate of first endpoint
	private int y1; // y-coordinate of first endpoint
	private int x2; // x-coordinate of second endpoint
	private int y2; // y-coordinate of second endpoint
	private Color myColor; // color of this shape
	
	// constructor with input values
	public Chpater8_18_MyLine( int x1, int y1, int x2, int y2, Color color )
	{
	 this.x1 = x1; // set x-coordinate of first endpoint
	 this.y1 = y1; // set y-coordinate of first endpoint
	 this.x2 = x2; // set x-coordinate of second endpoint
	 this.y2 = y2; // set y-coordinate of second endpoint
	 myColor = color; // set the color
	 } // end MyLine constructor
	
	 // Draw the line in the specified color
	public void draw( Graphics g )
	{
		g.setColor( myColor );
		g.drawLine( x1, y1, x2, y2 );
	} // end method draw	

}
