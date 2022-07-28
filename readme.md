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