# Java Skills Assessment – Junior Developer

This repository contains Java-based mini projects designed to demonstrate core object-oriented programming and problem-solving skills. It includes two key tasks:

---

## 🧑‍💻 Task 1: User Info with Encapsulation

A basic encapsulated class `UserInfo` that stores and manages user information.

Features:
- Private fields for name, age, email, and account status
- Public getters and setters
- Constructor with full parameter initialization
- `DisplayInfo()` method for neatly printing user details

Sample Output:

User info:
Name: Abdulaziz
Age: 21
Email: Abdulazizaisari06@gmail.com
Active / Not Active: true


---

## 💼 Task 2: Payroll Calculator

A flexible payroll system that calculates weekly pay for different employee types with validation, overtime, and tax deduction logic.

### Supported Employee Types:
- `FULL_TIME`: Normal pay up to 40 hrs, 1.5x for overtime
- `PART_TIME`: Valid only up to 25 hrs
- `CONTRACTOR`: Fixed flat rate
- `INTERN`: Paid 80% of hourly rate, up to 20 hrs

### Additional:
- Includes a `calculateTaxDeduction()` method:
  - Tax brackets: 10% – 25%
  - Option to deduct $50 if the employee has health insurance

---

## 🧪 How to Run

1. Compile all `.java` files:

   ```bash
   ./compile.bat
command:
java -cp out Main
--------------------------------------------------------------

Project Structure:

├── src/
│   ├── Main.java
│   ├── UserInfo.java
│   └── PayrollCalculator.java
├── compile.bat
├── .gitignore
└── README.md

