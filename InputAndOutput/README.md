# 🖋️ Input & Output – Java Basics

This folder contains beginner-level Java programs based on **Input and Output**, forming the foundation of my Java learning journey.


---

## 📚 Topics Covered

- Taking user input using `Scanner`
- Printing output with `System.out.println()`
- Handling basic data types (`int`, `float`, `String`, `char`)
- Formatting output

---

## ✅ Problems Solved (7)

| #   | Problem Title               | Description                                                          |
|-----|-----------------------------|----------------------------------------------------------------------|
| 1   | Sum of Two Numbers          | Take two numbers as input and print their sum                        |
| 2   | Positive or Negative number | Take a number as input and print if it is positive, negative or zero |
| 3   | Print a welcome message     | Take name and age, then print a welcome message                      |
| 4   | ASCII Code Generator        | Take Character as input and convert into Ascii Code                  |
| 5   | Circle Area calculator      | Taking Radius of a circle as input and prints its Area               |
| 6   | Number swap 1               | Swap two number using third variable                                 |
| 7   | Number swap 2               | Swap two number without using third variable                         |

---

## 🔧 How to Run

```bash
javac FileName.java
java FileName

---
# 🖋️ Java Input & Output – Short Notes

## 📘 Concepts Covered

- **Scanner Class**  
  Used for taking input in Java:  
  `Scanner input = new Scanner(System.in);`

- **Common Input Methods**
  - `nextInt()` → Integer input  
  - `nextFloat()` → Float input  
  - `next()` → Single word  
  - `nextLine()` → Full line  
  - `next().charAt(0)` → Character input  

- **Output**
  - `System.out.print()` → Prints on same line  
  - `System.out.println()` → Prints on next line

- **Note**:  
  Use `nextLine()` carefully after other inputs (may need extra `nextLine()` due to buffer issues)

- **Closing Scanner**
  - Optional: `input.close();` (Good practice)

---

These basics are essential for all upcoming Java concepts.
