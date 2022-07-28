**Concepts**


```aidl

Package

It is a collection of many classes.


Classes in Java are organised or grouped
in Packages.


```

```aidl
How Java Code is Executed

(a)Compilation

Our Java Code is converted into byte code by the Java Compiler.

The Java Compiler comes with the Java Development Kit.

Invoking the Java Compiler

javac .\Main.java
 
This creates a Main.class Java File. 

The Java file or byte code is platform independent and can
run in any operating system that has the Java Run Time environment.


(b)Execution




Java Runtime Environment has the JVM

JVM Takes Java Byte code and transaltes 
it to native code that any OS Can understand.

Invoking the Java Compiler

java com.codewithcaleb.Main


```

**Java Editions**
```aidl

Standard Edition(SE)

Most basic java edition that every software engineer must learn

Enterprise Edition(EE)

It is used for building very large enterprise level applications.

Micro Edition(ME)

Designed for Mobile Devices

Java Card

It is used in Smart Cards.


```

**Types**

```aidl

We use primitive types to store simple numbers,chracters and integers.

(a)Integer Full Number Types

 Type | Bytes | Range  |
| ------- | --- | --- |
| byte | 1 | [-128,127] |
| short | 2 | [--32K,32K] |
| int | 4 | [-2B,2B] |
| long | 8 | [-128,127] |

(b)Storing Numbers with decimal points

 Type | Bytes | Range  |
| ------- | --- | --- |
| float | 4 |  |
| double | 8 |  |


(c)Storing letters

 Type | Bytes | Range  |
| ------- | --- | --- |
| char | 2 | A,B,C  |
| boolean | 1 | true/false |


Reference Types

We use reference types to store much more complex Objects
such as date and mail_message


```

**Java Errors**

```aidl
There are two types of Java errors encountered:

1.Compile-time (Syntax Errors)

They happen when we do not use the grammar or the Syntax of
Java Language/

Compile time errors are easier to find and fix.


2.Runtime Time

They happen at run time when we run our applications.

Runtime errors which are harder to find can be fixed by the
use of a debugger.

 
```

//Java Rules

```aidl


 //Java Rules
        //1 .We Must Always specify the datatypes of our variables
        //Other Programming Languages are More linient but Java is Not
        String name ="CALEB";

        //2.We must terminate our Statements with semi Colons unless we are defining a code block
        int Age = 12;

        //3.When we are calling methods we must always include a paranthesis.
        System.out.println();


        //4 Strings in Java are represented by Double Quotes
        //Single quotes are reserved for Characters unlike in other Languages like Python

        //5 Java is Case sensitive so we Must always ensure that our variables are named correctly

        //6.We cannot name our variables using keywords/ such as class

        //7 We cannot use a single equals sign to compare values
        //There is a big difference between one equals sign and two equals sign in Java.

```

**Deploying Java Console Applications
```aidl

Java console applications are deployed as .jar files

```