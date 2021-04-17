## Creating Objects

- The `new` operator creates an Object (instance of a Class) and allocates memory to store this object.
- Assign a reference to the memory allocated to be able to access it.
- Access variable or methods using `.` operator.

## Define Instance Variables

- Variable is defined with its type.
- Variable name is tipically a noun in lowercase.
- To protect data in a class, variables typically use `private` access modifier..
- Optionally, variables can be initialized.
- Uninitialized primitives are defaulted to `0`, except for boolean, witch default is `false`.
- Uninitialized object references are defaulted to `null`.

## Define Instance Methods

- Method must declare its return type, or use `void` if method does not return anything.
- Nonvoid methods must contain a return statement, which must return a value of the corrisponding type.
- Method name is typically a verb in lowercase, followed by descriptive nouns.
- Access modifiers determine from where a method can be invoked.
- Methods may describe a comma-separated list of parameters enclosed in `( )` symbols.
- Method body is enclosed in `{ }` symbols.

## Local Variables and Recursive Object Reference

- No access modifier can be applied to local variables.
- Method parameters are local variables.
- The local variable can "shadow" the instance variable if their names coincide.
- Use the `this` keyword (recursive reference to current obj) to refer to an instance, rather than local variable.
- Variables defined in inner blocks of code are not visible outside these blocks.

## Local Variable Type Inference

- This feature is limited to:
  - Local variables with initializers.
  - Indexes in enhanced for-loops.
  - Local variables declared in a traditional for loop.
- Overuse can reduce code readability.

```java
public void someStuffs(int param){
  var value1 = "Hi"; // infers String type.
  var value2 = param; // infers int type.
}
```

Note: `var` is not a keyword, but a special identifier.  
Is possible to create a variable called `var`, but is very confusing.

## Define Constants

- Keyword `final` is used to mark a variable as constant; once initialized, it cannot be changed. (This means that you can actually initialize a `final` variable after declaring it, but you can't re-assigne it.)
- Instance `final` variables must be initialized immidiately of via constructors.
- Local variables and parameters can also be marked as `final`.
- An attempt to reassign a `final` variable will result in compiler error.

## Static Context

- Class memory context is shared by all instances of the class.
- Keyword `static` is used to mark variables or methods that belong to class context.
- Objects can access shared static context.
- Current instance `this` is meaningless within `static` context.
- An attempt to access current instance methods or variables from the static context will result in compiler error.

```java
public class Product {
  private static Period defaultExpiryPeriod = Period.ofDays(3);
  private String name;
  public static void setDefaultExpiryPeriod(int days){
    defaultExpiryPeriod = Period.ofDays(days);
    String name = this.name; // COMPILER ERROR.
  }
}
```

## Accessing Static Context

- Object reference is not required (but can ben used) to access static context.
- Static initializer runs once, before any othen operation (when class is loaded).
- Instance variables and methods are not accessible through the static context.

```java
public class Product {
  private static Period defaultExpiryPeriod;
  static {
    defaultExpiryPeriod = Period.ofDays(3)
  }
  public static void setExpiryPeriod(int days){
    defaultExpiryPeriod = Period.ofDays(days);
  }
  public static Period getExpiryPeriod(){
    return defaultExpiryPeriod;
  }
  ...
}

public class Shop {
  public static void main(String[] args){
    Product.setExpiryPeriod(4);
    Product.getExpiryPeriod();
  }
}
```

## Combining Static and Final

- Shared constants can be defined as `static` and `final` variables.
- `private` access modifier is not required because value is read-only.

```java
public class Product {
  public static final int MAX_EXPIRY_PERIOD = 5;
  ...
}

public class Shop {
  public static void main(String[] args){
    Period expiry = Period.days(Product.MAX_EXPIRY_PERIOD);
    ...
  }
}
```
