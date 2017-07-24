/**
 * @author PNimmanapalli
 * *17.5 Object Serialization
Sometimes we’ll not know exactly how the data
is stored in a file. In such cases, we want to read or write an entire object from a file. Java
provides such a mechanism, called object serialization. A so-called serialized object is an
object represented as a sequence of bytes that includes the object’s data as well as information
about the object’s type and the types of data stored in the object. After a serialized
object has been written into a file, it can be read from the file and deserialized—that is,
the type information and bytes that represent the object and its data can be used to recreate
the object in memory.

To use serialization with files, we initialize ObjectInput-
Stream and ObjectOutputStream objects with stream objects that read from and write to
files—objects of classes FileInputStream and FileOutputStream, respectively. Initializing
stream objects with other stream objects in this manner is sometimes called wrapping—
the new stream object being created wraps the stream object specified as a
constructor argument. To wrap a FileInputStream in an ObjectInputStream, for instance,
we pass the FileInputStream object to the ObjectInputStream’s constructor.

Interfaces ObjectOutput and ObjectInput:

The ObjectOutput interface contains method writeObject, which takes an Object as an argument
and writes its information to an OutputStream. the ObjectInput interface contains method readObject, which reads and returns a reference
to an Object from an InputStream. After an object has been read, its reference can be cast
to the object’s actual type.

17.5.1 Creating a Sequential-Access File Using Object Serialization:
Interface Serializable is a tagging interface. Such an interface does not contain methods. A class
that implements Serializable is tagged as being a Serializable object. This is important,
because an ObjectOutputStream will not output an object unless it is a Serializable
object, which is the case for any object of a class that implements Serializable.

In a Serializable class, every instance variable must be Serializable. Non-Serializable
instance variables must be declared transient to indicate that they should be
ignored during the serialization process. By default, all primitive-type variables are serializable.
For reference-type variables, you must check the class’s documentation (and possibly
its superclasses) to ensure that the type is Serializable. For example, Strings are Serializable.
By default, arrays are serializable; however, in a reference-type array, the referenced
objects might not be.

Writing Serialized Objects to a Sequential-Access File:

We chose the .ser file extension for binary files that contain serialized objects, but this is not required.


NOTE: If you dont want to serialize some sensitive data use the key word : "transient:
 *
 *
 */


import java.io.Serializable;

public class Chapter17_AccountRecordSerializable implements Serializable
{
	
	private int account;
	private String firstName;
	private String lastName;
	private double balance;
	
	 // no-argument constructor calls other constructor with default values
	public Chapter17_AccountRecordSerializable()
	{
		this( 0, "", "", 0.0 );
	}
	
	// four-argument constructor initializes a record
	public Chapter17_AccountRecordSerializable(
	int acct, String first, String last, double bal )
	{
	 setAccount( acct );
	 setFirstName( first );
	 setLastName( last );
	 setBalance( bal );
	 } // end four-argument AccountRecordSerializable constructor
	
	 // set account number
	 public void setAccount( int acct )
	 {
		 account = acct;
	 } // end method setAccount
	
	 // get account number
	public int getAccount()
	{
	return account;
	 } // end method getAccount
	
	 // set first name
	 public void setFirstName( String first )
	 {
	 firstName = first;
	 } // end method setFirstName
	
	 // get first name
	 public String getFirstName()
	 {
	 return firstName;
	 } // end method getFirstName
	
	 // set last name
	 public void setLastName( String last )
	{
	 lastName = last;
	 } // end method setLastName
	
	 // get last name
	 public String getLastName()
	 {
	 return lastName;
	 } // end method getLastName
	
	 // set balance
	 public void setBalance( double bal )
	 {
	 balance = bal;
	 } // end method setBalance
	 
	// get balance
	 public double getBalance()
	 {
		 return balance;
	 }	

}
