# OOP in Java
## Classes
Everything in Java is associated with classes and objects. to define a class in java we need to:
- Give a description of the packages, and imports that this classi is a member of/may need to reference.
- The class access modifier (usually it's public), wich restrict the ability to access classes, vars and methods from other classes.
- Methods may describe a comma-separeted list of parameters enclosed in '{}'.
## Objects
The objects are instances of classes they refer to.
- We have to use the "new" operator to create an object, allocating memory for it.
- Assign "reference" to the memory allocated for the object to be able to access it.
#
## instance variables
Classes usually contains variables definitions to store state information about their objects.
- Vars are defined with a type or any Class, their names are tipically written in lowercase.
- Usually to protect data within the classe we can use private access modifier.
- Uninitialized primitives are initialized to '0', bool to 'false', objects to 'null'.
## Local Variables and Recursive Object Reference

- No access modifier can be applied to local variables.
- Method parameters are local variables.
- The local variable can "shadow" the instance variable if their names coincide.
- Use the `this` keyword (recursive reference to current obj) to refer to an instance, rather than local variable.
- Variables defined in inner blocks of code are not visible outside these blocks.
## Local variable type interference.
Since java 10 there's a way to init local vars untyped. You should not overuse this, can reduce the code readability. They can be used:
- Local vars with initialize. 
- Indexes in the enchanced for-loops, and traditional for-loop.
## Constants 
- With the keyword 'final' i can mark a var as a const, once it's initializated can't be change.
- Instance final vars must be either initializated immediately or via all constructors.
## Static 
Using the static keyword i describe vars/methods that not belongs to any instance, but they're shared with all instaces of this class.
