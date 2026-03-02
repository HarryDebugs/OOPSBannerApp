<div align="center">

# 🎨 OOPs Banner App 🚀

**A progressive Java console application rendering text as multi-line ASCII art.**

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)]()
[![Gitflow](https://img.shields.io/badge/GitFlow-F05032?style=for-the-badge&logo=git&logoColor=white)]()
[![SRM STEP](https://img.shields.io/badge/SRM_STEP-Bootcamp-0052CC?style=for-the-badge)]()
[![Version](https://img.shields.io/badge/Version-8.0-success?style=for-the-badge)]()

*Built by Harry Jay William C as part of an intensive software engineering bootcamp.*

</div>

---

## 📖 About the Project

The **OOPS Banner App** is a foundational Java application designed to explore core programming fundamentals, Object-Oriented Programming (OOP) concepts, and professional version control workflows. 

What starts as a simple script to print text to the console evolves across **8 developmental stages (Use Cases)** into a highly modular, memory-efficient, and object-oriented application using Java Collections (`HashMap`) and custom static methods. 

---

## 🌟 The Output

When executed, the program dynamically generates a 7-line high ASCII art banner of the target word (`OOPS`):

---

## 🛤️ Evolution of the Codebase (UC1 - UC8)

This project was built incrementally, tackling specific computer science problems at each stage.

| Phase | Feature focus | Technical Implementation |
| :--- | :--- | :--- |
| **🟢 UC1** | **Core Syntax** | Basic `System.out.println()` to output literal text strings. |
| **🎨 UC2** | **ASCII Art** | Constructed 7-line visual patterns using basic `+` string concatenation. |
| **🧠 UC3** | **Memory Efficiency** | Replaced `+` with `String.join()` to eliminate intermediate String object creation and reduce memory overhead. |
| **📦 UC4** | **Data Structures** | Grouped repetitive statements into a `String[]` array and traversed using an enhanced `for` loop. |
| **⚡ UC5** | **Code Conciseness** | Implemented Inline Array Initialization to define and populate data simultaneously. |
| **🛠️ UC6** | **Modularity (DRY)** | Abstracted hardcoded patterns into reusable `static` helper methods (`getOPattern()`, etc.). |
| **🧩 UC7** | **Encapsulation** | Created a `CharacterPatternMap` inner class to bind character data and its corresponding array pattern together. |
| **🚀 UC8** | **Collections (`HashMap`)** | Eliminated linear searching by mapping characters directly to patterns using a `HashMap<Character, String[]>`, rendering via a centralized function and `StringBuilder`. |

---

## 🛠️ Technologies & Concepts Mastered

* **Language:** Java ☕
* **Data Structures:** Arrays, `HashMap`, `StringBuilder`
* **OOP Principles:** Encapsulation, Abstraction, Single Responsibility Principle (SRP)
* **Clean Code:** Don't Repeat Yourself (DRY), modular method design.
* **Version Control:** Strict **Gitflow** Branching Strategy (Main ➔ Dev ➔ Feature Branches).

---

## 💻 How to Run Locally

Want to see the banner in action? Follow these steps:

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/YOUR_USERNAME/OOPSBannerApp.git](https://github.com/YOUR_USERNAME/OOPSBannerApp.git)
