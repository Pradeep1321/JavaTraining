
/**
 * @author PNimmanapalli
 *
 *Exception handling is designed to process synchronous errors, which occur when a statement
executes. Common examples we’ll see throughout the book are out-of-range array
indices, arithmetic overflow (i.e., a value outside the representable range of values), division
by zero, invalid method parameters, thread interruption (as we’ll see in Chapter 26)
and unsuccessful memory allocation (due to lack of memory). Exception handling is not
designed to process problems associated with asynchronous events (e.g., disk I/O completions,
network message arrivals, mouse clicks and keystrokes), which occur in parallel with,
and independent of, the program’s flow of control.

All Java exception classes inherit directly or indirectly from class Exception, forming an
inheritance hierarchy. You can extend this hierarchy with your own exception classes.




						        	Throwable
		     Exception 									Error
		     |         |                                   |
RuntimeException  --   IOException			AWTError -- ThreadDeath --  VirtualMachineError
       |
ClassCastException -- NullPointerException -- ArithmeticException -- IndexOutOfBoundsException  --  NoSuchElementException
																		|                                 |
																ArrayIndexOutOfBoundsException        InputMismatchException


Checked vs. Unchecked Exceptions:
the Java compiler enforces a catch-or-declare requirement for checked
exceptions. An exception’s type determines whether it’s checked or unchecked. All exception
types that are direct or indirect subclasses of class RuntimeException (package java.lang)
are unchecked exceptions.
Examples of unchecked exceptions include ArrayIndexOutOfBoundsExceptions and ArithmeticExceptions.
 
 All classes that inherit from class Exception but not class RuntimeException are considered to be checked exceptions.
Such exceptions are typically caused by conditions that are not under the control of the program—
for example, in file processing, the program can’t open a file because the file does not
exist. Classes that inherit from class Error are considered to be unchecked
 
11.6 finally Block:
The finally block will execute whether or not an exception is thrown in the corresponding try block
 The finally block also will execute if a try block exits by using a
return, break or continue statement or simply by reaching its closing right brace. The
finally block will not execute if the application exits early from a try block by calling
method System.exit.

System.out and System.err are streams—sequences of bytes. While System.out
(known as the standard output stream) displays a program’s output, System.err (known
as the standard error stream) displays a program’s errors

 *
 *
 */


// Fig. 11.4: UsingExceptions.java
// try...catch...finally exception handling mechanism.

public class Chapter11_UsingExceptions 
{
   public static void main( String[] args )
   {
      try 
      { 
         throwException(); // call method throwException
      } // end try
      catch ( Exception exception ) // exception thrown by throwException
      {
         System.err.println( "Exception handled in main" );
      } // end catch

      doesNotThrowException();
   } // end main

   // demonstrate try...catch...finally
   public static void throwException() throws Exception
   {
      try // throw an exception and immediately catch it
      { 
         System.out.println( "Method throwException" );
         throw new Exception(); // generate exception
      } // end try
      catch ( Exception exception ) // catch exception thrown in try
      {
         System.err.println(
            "Exception handled in method throwException" );
         throw exception; // rethrow for further processing

         // code here would not be reached; would cause compilation errors

      } // end catch
      finally // executes regardless of what occurs in try...catch
      {
         System.err.println( "Finally executed in throwException" );
      } // end finally

      // code here would not be reached; would cause compilation errors

   } // end method throwException

   // demonstrate finally when no exception occurs
   public static void doesNotThrowException()
   {
      try // try block does not throw an exception
      { 
         System.out.println( "Method doesNotThrowException" );
      } // end try
      catch ( Exception exception ) // does not execute
      {
         System.err.println( exception );
      } // end catch
      finally // executes regardless of what occurs in try...catch
      {
         System.err.println( 
            "Finally executed in doesNotThrowException" );
      } // end finally

      System.out.println( "End of method doesNotThrowException" );
   } // end method doesNotThrowException
} // end class UsingExceptions
