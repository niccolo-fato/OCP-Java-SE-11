## Java Primitives

|           Whole numbers           | Floating numbers  |  Boolean   | Character |
| :-------------------------------: | :---------------: | :--------: | :-------: |
|  `byte`, `short`, `int`, `long`   | `float`, `double` | `boolean`  |  `char`   |
| 8 bits, 16 bits, 32 bits, 64 bits | 32 bits, 64 bits  | true/false |  16 bits  |

## Declare and Initialize

- Variables can be declared with no initialization.
- Numeric values can be expressed as binary, octal, decimal or hex.
- Float and double can be expressed in both normal of exponential notations.
- Smaller types are automatically promoted to bigger types.
- Character values must be enclosed in single quotation marks.

```
<type> <variable name> = <value>;
```

## Restrictions on Primitive Declarations and Initializations

- Variables must be initialized before use.
- A bigger type value cannot be assigned to a smaller type variable.
- Character values must not be enclosed in quotation marks.
- A charater value cannot contain more than one char.
- Boolean values can be expressed only as `true` or `false`.

## Java Operators

|            Operators             |                Precedence                |
| :------------------------------: | :--------------------------------------: |
|   postfix increment/decrement    |                  ++ --                   |
| prefix increment/decrement/unary |              ++ -- + - ~ !               |
|          multiplicative          |                  \* / %                  |
|             additive             |                   + -                    |
|            bit shift             |                << >> >>>                 |
|            relational            |         < > <= >= `instance of`          |
|             equality             |                  == !=                   |
|           bitwise AND            |                    &                     |
|       bitwise exclusive OR       |                    ^                     |
|       bitwise inclusive OR       |                    \|                    |
|           logical AND            |                    &&                    |
|            logical OR            |                   \|\|                   |
|             ternary              |                   ? :                    |
|            assignment            | = += -= \*= /= %= &= ^= \|= <<= >>= >>>= |

## Assignment and Arithmetic Operators

```java
int a = 1, b = 0;
b = a++; // increment postfix (b is 1, a is 2)
b = ++a; // increment prefix (b is 3, a is 3)
b = a--; // increment postfix (b is 3, a is 2)
b = --a; // increment prefix (b is 1, a is 1)
```

## Arithmetic Operations and Type Casting

- Smaller types are automatically casted to bigger types.  
  `byte` -> `short` -> `char` -> `int` -> `long` -> `float` -> `double`.
- A bigger type value cannot be assigned to a smaller type varibale without explicit type casting.
- Type can be explicitly casted: `(<new type>) <variable or expression>`
- When casting a bigger value to a smaller type, beware of a possible overflow.
- Resulting type of arithmetic operations on types smaller than `int` is an `int`; otherwise, the result is of a type of a largest participant.

![Arithmetic Operations and Type Casting](https://i.imgur.com/1dtuTFa.png)

## More Mathematical Operations

- `java.lang.Math` provides various mathematical operations.

```java
// both a and b are int.
int a = 11, b = 3;
// c is 3, because both a and b and int.
long c = Math.round(a/b);
// d is 3.0, because both a and b and int.
double d = Math.round(a/b);
// e is 3.67, because a is double and b is int, so the result type is double.
// to specify the number of digits after `,` we / and * by 10^number of digits.
double e = Math.round((double)a/b*100)/100.0;
```

## Binary Number Representation
