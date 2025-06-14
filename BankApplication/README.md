# Bank Application

## Application Features:

This back-end banking system handles new customer account requests by reading input from a CSV file. It supports two types of accounts: **Savings** and **Checking**, and performs operations such as deposits, withdrawals, transfers, and displays account details.

---

## Features & Functionalities:

- Reads customer data from a `.csv` file that contains:
  - Name
  - Social Security Number (SSN)
  - Account Type (Checking/Savings)
  - Initial Deposit

- Generates unique 11-digit account numbers using:
  - Prefix `1` for Savings, `2` for Checking
  - Last two digits of the SSN
  - Unique 5-digit sequence
  - Random 3-digit number

- Stores account objects using an appropriate data structure (like `ArrayList<Account>`).

---

## Account Types:

### 1. **Savings Account**
- Includes:
  - Safety Deposit Box Number (3-digit)
  - Access Code (4-digit)
- Interest Rate: Base rate **minus 0.25 points**

### 2. **Checking Account**
- Includes:
  - 12-digit Debit Card Number
  - 4-digit PIN
- Interest Rate: **15% of the base interest rate**

---

## Common Account Functionalities:
- `deposit(amount)`
- `withdraw(amount)`
- `transfer(toAccount, amount)`
- `showInfo()` — Displays:
  - Customer name
  - Account number
  - Balance
  - Account type-specific details

---

## Object-Oriented Design Concepts Used:

- **Abstract Class**: `Account` class defines the common behavior and structure for both account types.
- **Inheritance**: `Checking` and `Savings` classes extend the abstract `Account` class.
- **Interface**: Interest rate determination through an `InterestRate` interface.
- **Encapsulation**: Protected and private fields ensure secure and restricted access.
- **Constructors and super()**: Proper use of constructors to initialize inherited properties.
- **Random Generation**: For debit card, PIN, safety deposit box, and unique account numbers.

---

## Learning Objectives Covered:
- Designing robust object-oriented architecture.
- Utilizing abstract classes, interfaces, constructors, and access modifiers effectively.
- Parsing and processing data from external `.csv` files.
- Implementing real-world banking logic using core Java principles.
