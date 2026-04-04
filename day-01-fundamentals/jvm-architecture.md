***Java Development Kit (JDK)***

JDK is a software development kit used to develop Java applications. It includes tools required to write, compile, and run java programs.

**Components of JDK**
- JRE (Java Runtime Environment) → Provides runtime environment
- Development Tools:
  - javac -> Compiler (converts .java to .class)
  - java → Runs the program
  - javadoc → Generates documentation

**Purpose**
- Used for developing Java programs
- Provides tools for compilation, execution, and debugging

**Relationship**
JDK > JRE > JVM
- JDK contains JRE
- JRE contains JVM


***Java Runtime Environment (JRE)***

JRE provides the environment required to run Java programs. It includes the JVM and standard libraries needed for execution.

**Components of JRE**
- JVM (Java Virtual Machine) → Executes bytecode
- Core Libraries → Predefined classes and APIs

**Purpose**
- Runs Java applications
- Provides necessary runtime environment


***Java Virtual Machine (JVM) ***

- The Java Virtual Maching (JVM) is a core component of the Java Runtime Environment (JRE) that allows the Java programs to run on any platform without modification.
- JVM acts as an interpreter between Java bytecode and the underlying hardware, providing Java's famous WORA capability.

**Why JVM is needed**

- Converts bytecode into machine-dependant code.
- Acts as an bridge between Java program and operating system.
- Enables WORA.

**How JVM works**

*Execution Flow*
    .java -> compiled by javac -> .class (bytecode) -> JVM -> output

*Steps*
1. JVM loads the bytecode
2. Verifies it for security
3. Links the class
4. Executes the program
5. Uses JIT compiler for optimization
6. Garbage collector frees unused memory.

**JVM Architecture: Components of JVM**

1. Class Loader Subsystem

*Purpose*
Loads .class files into memory.

*Phases*
- Loading
    - Reads .class file
    - Stores metadata in Method Area
    - Create Class object in Heap representing the loaded class

- Linking :  Responsible for preparing the loaded class for execution. 
    - Verification -> checks bytecode safety and ensures bytecode follows the JVM rules.
    - Preparation -> Allocates memory for static variables and assigns default values.
    - Resolution -> converts the symbolic references into direct references in memory.

- Initialization
    - Assigns actual values to the static variables.
    - Executes static blocks defined in the class.

*Types of Class Loaders*

- Bootstrap Class Loader -> Loads core Java classes
- Extension Class Loader -> Loads classes from extensions directory
- System/Application Class Loader -> Loads classes from the application classpath.

2. JVM Memory Areas

- Method Area -> Stores class-level information like class name, parent class, methods, variables, and static data. Shared across the JVM.
- Heap Area -> Stores all objects. Shared across the JVM.
- Stack Area -> Each thread has its own runtime stack; stores method calls, local variables in stack frames. Destroyed when the thread ends.
- PC Registers -> Hold the address of the currently executing instruction for each thread.
- Native Method Stacks -> Each thread has a separate stack for native method execution.

3. Execution Engine 

Execution Engines executes the bytecode (.class).

- Interpreter ->
    - Executes bytecode line by line.
    - Slower for repeated execution

- Just in Time (JIT) compiler ->
    - Converts entire bytecode into native code.
    - Improves performance by giving the Interpreter a direct native code for repeated method calls.

- Garbage Collector -> 
    - Removes unused objects
    - Frees memory automatically

4. Java Native Interface (JNI)

- Allows Java to interact with C/C++ libraries
- Used for hardware-specific operations

5. Native Method Libraries 

- Collection of libraries written in C/C++
- Required for native execution








