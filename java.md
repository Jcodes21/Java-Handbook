The Java Development Kit, JDK consists of the Java Runtime Environment, JRE and some development tools like the java compiler (javac)
The JRE consists of the JVM and the Java standard library.

Compilation
To run a file for the first time your code must be compiled. Each time after that if no changes are made it will run inside the JRE without using javac. Each time you make a change to the code the javac compile it again.

The JDK includes Javac. Java's docs call it a compiler but that's not by the definition of something that translates code into machine code. It translates your human readable syntax into byte code .class files, so, by the definition of something that translates one language into a lower lever language.
The interpreter executes bytecode instructions line by line and passes the frequently used code to the just-in-time (JIT) compiler which translates the bytecode into native machine code at runtime.


