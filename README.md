<div align="center">

# Restaurant Food Ordering System

[![GitHub Repo](https://img.shields.io/badge/GitHub-sharvan--m%2FRestaurantFoodOrder-blue?logo=github)](https://github.com/sharvan-m/RestaurantFoodOrder)
[![Language](https://img.shields.io/badge/Language-Java%208%2B-orange?logo=openjdk)](https://www.oracle.com/java/)
[![Architecture](https://img.shields.io/badge/Design-Object--Oriented%20Programming-green)](#-core-oop-principles)
[![License](https://img.shields.io/badge/License-MIT-lightgrey)](#-license)

**A modular Java console application demonstrating clean Object-Oriented Programming (OOP) architecture, cross-package accessibility, data encapsulation, and order fulfillment workflows.**

[Overview](#-project-overview) • [OOP Principles](#-core-oop-principles) • [Architecture](#-system-architecture) • [Project Structure](#-project-structure) • [Quick Start](#-quick-start--execution) • [Sample Output](#-sample-output)

</div>

---

## 📖 Project Overview

The **Restaurant Food Ordering System** is a foundational Java application designed to illustrate core software engineering principles and clean Object-Oriented Design. It models a real-world food ordering workflow:
- **Menu & Catalog Management:** Encapsulates restaurant details, dynamic menus, and real-time pricing updates.
- **Order Calculation Engine:** Calculates line-item totals and order summaries based on customer selections.
- **Cross-Package Integration:** Separates delivery logistics from restaurant business logic across independent Java packages.

---

## ✨ Core OOP Principles

- **🔒 Data Encapsulation:** All model fields in `Restaurant` and `Order` are marked `private` and accessed strictly through public getters and setters, ensuring state integrity.
- **📦 Multi-Package Architecture:** Demonstrates Java package organization (`Restaurant` and `Delivery`), illustrating cross-package imports and access specifier controls.
- **🧱 Constructor Injection:** Enforces complete object initialization through parameterized constructors for consistent entity states.
- **⚙️ Business Logic Separation:** Decouples pricing calculation (`calculateOrderAmount()`) and presentation (`displayOrderDetails()`) within domain models.

---

## 🏗️ System Architecture

```
┌──────────────────────────────────────┐       creates & manages       ┌─────────────────────────────────────┐
│          Delivery.Delivery           │ ────────────────────────────► │        Restaurant.Restaurant        │
│          (Main Application)          │                               │  • restId, name, address            │
└──────────────────┬───────────────────┘                               │  • food menu items & pricing        │
                   │                                                   │  • displayRestaurantDetails()       │
                   │ creates & executes                                └─────────────────────────────────────┘
                   ▼
┌──────────────────────────────────────┐
│           Restaurant.Order           │
│  • orderId, customerName, foodName   │
│  • quantity, unitPrice, totalAmount  │
│  • calculateOrderAmount()            │
│  • displayOrderDetails()             │
└──────────────────────────────────────┘
```

---

## 📂 Project Structure

```text
RestaurantFoodOrder/
├── Delivery/
│   └── Delivery.java        # Main driver application demonstrating cross-package flow
├── Restaurant/
│   ├── Restaurant.java      # Restaurant entity, menu catalog & price management
│   └── Order.java           # Customer order model & automatic bill calculator
├── .gitignore               # Build artifact and IDE exclusions
└── README.md                # Project documentation
```

---

## ⚡ Quick Start & Execution

### Prerequisites
- [Java Development Kit (JDK 8 or higher)](https://www.oracle.com/java/technologies/downloads/) installed and configured on your `PATH`.

### Compilation & Execution
Compile all packages from the repository root:
```bash
# 1. Compile all Java source files
javac Restaurant/*.java Delivery/*.java

# 2. Run the main Delivery application
java Delivery.Delivery
```

---

## 💻 Sample Output

```text
========================================
       RESTAURANT FOOD ORDER SYSTEM
========================================
RESTAURANT DETAILS
----------------------------------------
Restaurant ID   : 101
Restaurant Name : RKode
Restaurant Address : Chennai
FOOD MENU
----------------------------------------
1. Pizza   - Rs.250.0
2. Burger  - Rs.150.0
3. Pasta   - Rs.200.0

Restaurant ID using getter : 101

After changing restaurant name:
RESTAURANT DETAILS
----------------------------------------
Restaurant ID   : 101
Restaurant Name : RKode Food Corner
Restaurant Address : Chennai
FOOD MENU
----------------------------------------
1. Pizza   - Rs.250.0
2. Burger  - Rs.150.0
3. Pasta   - Rs.200.0

ORDER DETAILS
----------------------------------------
Order ID       : 5001
Customer Name  : Arun
Food Name      : Pizza
Quantity       : 2
Unit Price     : Rs.250.0
Total Amount   : Rs.500.0
========================================
```

---

## 📋 Key Classes & Responsibilities

| Class | Package | Responsibility |
| :--- | :--- | :--- |
| **`Restaurant`** | `Restaurant` | Stores restaurant metadata, menu items, and pricing. Provides getter/setter mutations and menu display. |
| **`Order`** | `Restaurant` | Encapsulates order identity, items, and quantities. Computes `quantity * unitPrice`. |
| **`Delivery`** | `Delivery` | Application entry point (`main`), orchestrating restaurant setup, order placement, and billing. |

---

## 📄 License

This project is open-source and available under the [MIT License](LICENSE).

*Developed by [Sharvan M](https://github.com/sharvan-m).*
