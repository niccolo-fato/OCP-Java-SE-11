## Java Naming conventions:

- Package: reverse.company.domain  
  Ex: com.oracle.demos.animals
- Class: PascalCase  
  Ex: ShepardDog
- Variable: camelCase  
  Ex: shepardDog
- Constant: SCREAMING_SNAKE_CASE  
  Ex: MIX_SIZE
- Method: camelCase, first word verb  
  Ex: throwTheBall

## Java Basic Rules:

- All Java statements must be terminated with ";" symbol.
- Code blocks must be enclosed with "{" and "}" symbols.
- Indentation is syntactically irrelevant but highly recommended for readability.

## Define Java Class:

- Class name: PascalCase.
- Class file: \<class name>.java
- Highly recommended to also define package when defining a class.  
  If package definition is missing, class would belong to a "default" package.
- Package name: reverse.domain.company.naming.system.adopted.

```java
package com.oracle.demos.animals;
class Dog {
  // Class code.
}
```

## Access Classes Across Packages:

- Method 1: Prefix the class name with the package name.  
  `com.oracle.demos.animals.Dog`
- Method 2: Using the `import` statement.
  - Specifing the class: `com.oracle.demos.animals.Dog`
  - Importing the entire package: `com.oracle.demos.animals.*`

```java
// Single import.
package com.oracle.demos.people;
import com.oracle.demos.animals.Dog;

public class Owner {
  Dog myDog;
}
```

```java
// Entire import.
package com.oracle.demos.people;
import com.oracle.demos.animals.*;

public class Owner {
  Dog myDog;
}
```

## Use Access Modifiers:

- `public`: Visible to any other class.
- `protected`: Visible to classes that are in the same package or to subclasses.
- `<default>`: Visible only to classes in the same package.
- `private`: Visible only within the same class.

```java
package a; // No reverse.domain convention for typing speed purposes.
public class X {
  public Y y1;
  protected Y y2;
  Y y3;
  private Y y4;
}
```

```java
package b;
import a.*;
public class Y extends X {
  public void doSomeStuffs(){
    X x = new X();
    x.y1; // Visible.
    x.y2; // Visible even if protected because of extends.
    x.y3; // Non visible, because we are in a different package.
    x.y4; // Non visible, because we are in a different class.
  }
}
```

## Create Main Application Class

- It must be called `main`.
- It must be `public`. We need to invoke this method from outside of this class.
- It must be `static`. Methods that can be invoked without creating an instance.
- It must be `void`. It does't return a value.
- It must accept an array of `String` objects as the only parameter.

```java
package a;
public class Program {
  public static void main(String[] args) {
    // Code.
  }
}
```

## Compile Java Program

```
javac -cp /project/classes
      -d /project/classes
      /project/sources/demos/Program.java
```

- \-classpath of -cp: Path of other (compiled) classes that the program need to use.
- \-d: Path to store compilation result.
- Path to source code.

## Execute Java Program

```sh
java -cp /project/classes
      demos.Program
      Luca "Biagetti Luca"
```

- \-classpath of -cp: Path where classes are located.
- Fully qualified class name (package prefix).
- Optionally: space separated list of parameters.

Since Java 11, is possible to run single-file source code.

```
java /project/sources/demos/Program.java
```

## Comments and Documentation

- Code comments:
  - Single-line. `// single-line comment`
  - Multi-line. `/* multi-line comment */`
- Docs comments:
  - HTML markups.
  - Descriptive tags using `@`
  - Used by `javadoc` tool to generate docs.

```
javadoc -d <docs path>
        -sourcepath <source code path>
        -subpackages <name of the root package>
```
