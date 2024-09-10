
# Java 'n Git

In this repository I will upload my journey of learning Java and Git. With the help of ChatGPT I created a learning plan with different concepts and tasks to be done weekly. I will also add some more tasks if I feel like I need to understand a concept better.




## Roadmap

### **Week 1: Introduction to Java and Git**

#### **Java Concepts:**
- Introduction to Java
  - ~~History and Features~~
  - ~~Installing JDK and Setting up IDE (e.g., IntelliJ IDEA, Eclipse)~~
  - ~~Basic Syntax: Data Types, Variables, Operators~~
  - ~~Writing Your First Java Program~~

#### **Git Concepts:**
- Introduction to Git
  - ~~Installing Git~~
  - ~~Git Basics: Repository, Commit, Branch, Merge~~
  - ~~Setting up GitHub (or any Git hosting service)~~
  - ~~Creating Your First Git Repository~~

#### **Exercises:**
1. **Java:**
   - ~~Write a simple "Hello World" program.~~
   - ~~Create a program to calculate the sum, difference, product, and quotient of two numbers.~~
   - ~~Practice using different data types (int, float, double, char, etc.).~~

2. **Git:**
   - ~~Create a local Git repository and connect it to a remote repository on GitHub.~~
   - ~~Commit your "Hello World" program to the repository.~~
   - ~~Create a new branch, modify your program, and merge the changes back to the main branch.~~

---

### **Week 2: Control Structures**

#### **Java Concepts:**
- ~~Conditional Statements (if, else, switch)~~
- ~~Loops (for, while, do-while)~~
- ~~Nested loops and control statements (break, continue)~~

#### **Git Concepts:**
- ~~Cloning Repositories~~
- ~~Understanding and resolving merge conflicts~~
- ~~Branching strategies~~

#### **Exercises:**
1. **Java:**
   - ~~Create a program that checks if a number is positive, negative, or zero.~~
   - ~~Write a program to print the first 10 Fibonacci numbers using a loop.~~
   - ~~Create a nested loop to print a multiplication table.~~

2. **Git:**
   - ~~Clone a repository, make changes, and push them back.~~
   - ~~Simulate a merge conflict by modifying the same file on different branches and resolve it.~~
   - ~~Use Git log to view the history and practice reverting commits.~~

---

### **Week 3: Object-Oriented Programming (OOP) Basics**

#### **Java Concepts:**
- ~~Classes and Objects~~
- ~~Constructors~~
- ~~Methods~~
- ~~`this` keyword~~

#### **Git Concepts:**
- Forking a repository
- ~~Pull Requests (PRs)~~
- ~~Reviewing and merging PRs~~

#### **Exercises:**
1. **Java:**
   - ~~Create a `Car` class with attributes like model, brand, and speed. Add methods to accelerate and brake.~~
   - ~~Instantiate objects of the `Car` class and test the methods.~~
   - ~~Use constructors to initialize objects.~~

2. **Git:**
   - Fork a Java project repository and make modifications.
   - ~~Create a Pull Request to the original repository.~~
   - Review a friend's code (if possible) and suggest changes.

---

### **Week 4: Encapsulation and Inheritance**

#### **Java Concepts:**
- ~~Encapsulation and Access Modifiers (private, protected, public)~~
- ~~Getters and Setters~~
- ~~Inheritance~~
- ~~`super` keyword~~

#### **Git Concepts:**
- Tagging releases
- Git stash
- Rebasing vs. Merging

#### **Exercises:**
1. **Java:**
   - ~~Create a `Person` class with private attributes and use getters and setters to access them.~~
   - ~~Develop an `Employee` class that inherits from the `Person` class and adds additional properties and methods.~~
   - ~~Override methods in the `Employee` class and use the `super` keyword.~~

2. **Git:**
   - Tag a commit in your repository to mark a specific version.
   - Use `git stash` to temporarily save your work and switch branches.
   - Rebase your feature branch onto the main branch.

---

### **Week 5: Polymorphism and Abstraction**

#### **Java Concepts:**
- ~~Method Overloading~~
- ~~Method Overriding~~
- Abstract Classes and Methods
- Interfaces

#### **Git Concepts:**
- Cherry-picking commits
- Working with remote branches
- Git hooks (pre-commit, post-commit)

#### **Exercises:**
1. **Java:**
   - Implement method overloading in a `Calculator` class.
   - Create an abstract class `Animal` with an abstract method `sound()`, and implement it in subclasses `Dog` and `Cat`.
   - Develop an interface `Playable` with a method `play()`, and have it implemented by multiple classes.

2. **Git:**
   - Cherry-pick a specific commit from one branch to another.
   - Practice deleting and recovering remote branches.
   - Create a Git hook that checks for specific conditions before committing.

---

### **Week 6: Exception Handling and File I/O**

#### **Java Concepts:**
- Try-Catch Blocks
- Custom Exceptions
- Working with Files (FileReader, FileWriter, BufferedReader, BufferedWriter)

#### **Git Concepts:**
- Rewriting history with `git rebase`
- Squashing commits
- Git bisect for debugging

#### **Exercises:**
1. **Java:**
   - Write a program that handles arithmetic exceptions (e.g., division by zero).
   - Create custom exceptions for a scenario (e.g., invalid input).
   - Develop a program to read from and write to a text file.

2. **Git:**
   - Use `git rebase` to clean up your commit history by squashing commits.
   - Use `git bisect` to identify the commit that introduced a bug.
   - Amend the last commit using `git commit --amend`.

---

### **Week 7: Collections and Generics**

#### **Java Concepts:**
- Collections Framework (List, Set, Map)
- Iterators
- Generics
- Comparable and Comparator Interfaces

#### **Git Concepts:**
- Git submodules
- Git blame
- Managing large repositories

#### **Exercises:**
1. **Java:**
   - Implement a program using `ArrayList` to manage a list of student names.
   - Write a program that uses `HashMap` to store and retrieve key-value pairs.
   - Create a generic class `Box` that can hold any type of object.

2. **Git:**
   - Add a submodule to your repository and work with it.
   - Use `git blame` to find out who last modified a specific line of code.
   - Practice managing a large repository by splitting it into submodules.

---

### **Week 8: Advanced Java Concepts and Project Development**

#### **Java Concepts:**
- Lambda Expressions and Functional Interfaces
- Streams API
- Multi-threading and Concurrency
- Building and Packaging Java Projects (Maven/Gradle)

#### **Git Concepts:**
- Advanced branching and merging strategies (e.g., GitFlow)
- Managing Git conflicts in a team environment
- Continuous Integration with Git (e.g., GitHub Actions)

#### **Exercises:**
1. **Java:**
   - Create a simple project using Java Streams to process a list of data.
   - Develop a multi-threaded application (e.g., a basic web server).
   - Use Maven/Gradle to build and package a Java project.

2. **Git:**
   - Implement GitFlow in a sample project.
   - Resolve complex conflicts in a team environment using Git.
   - Set up Continuous Integration (CI) for your project using GitHub Actions.

---

### **Final Project: Integration of Java Concepts and Git**

In the final two weeks, you can consolidate everything you've learned by developing a full-fledged Java application. This project could be a simple library management system, a personal finance tracker, or a basic REST API.

- **Project Plan:**
  1. **Week 9:** Plan your project, design classes, set up Git repository.
  2. **Week 10:** Implement the project, use Git for version control, and deploy it.

---

### **Additional Resources:**
- **Books:** 
  - "Effective Java" by Joshua Bloch
  - "Java: The Complete Reference" by Herbert Schildt
- **Online Courses:**
  - Udemy: "Java Programming Masterclass"
  - Coursera: "Java Programming and Software Engineering Fundamentals"
- **Git Resources:**
  - Pro Git book by Scott Chacon and Ben Straub (available for free online)
  - Atlassian Git tutorials
