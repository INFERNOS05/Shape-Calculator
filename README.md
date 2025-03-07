# Shape-Calculator
# OOP-Shape-Calculator

## Overview
This project is a **Java-based Shape Calculator** that demonstrates **Object-Oriented Programming (OOP)** principles, including **abstraction, inheritance, and interfaces**. It allows users to calculate the **area, perimeter, and volume** of various **2D and 3D geometric shapes** through a simple console-based menu.

## Features
- **2D Shapes:** Circle, Rectangle, Square  
- **3D Shapes:** Sphere, Cylinder, Equilateral Pyramid  
- Uses **abstraction** to define a base `Shape` class  
- Implements **inheritance** to extend functionality for specific shapes  
- Uses **interfaces** (`Volume`) to enforce volume calculation for 3D shapes  
- Simple **menu-driven program** for user input and interaction  

## Concepts Used
### **1. Abstraction (Abstract Classes)**
- The `Shape` class is an **abstract class** that defines common properties (`shapeName`) and enforces method implementation for area and perimeter.  
- Every shape **inherits** from `Shape` and provides its own implementation for these methods.  

### **2. Inheritance**
- Shapes like `Rectangle`, `Square`, and `Circle` **extend** `Shape` to reuse code and implement specific behavior.  

### **3. Interfaces**
- The `Volume` interface is used for 3D shapes like `Sphere`, `Cylinder`, and `EquilateralPyramid`.  
- This ensures that only 3D shapes implement `calculateVolume()`.  

### **4. Encapsulation**
- Shape properties (`radius`, `length`, `width`, etc.) are kept **private** to restrict direct access.  
- Methods provide controlled access to these attributes.  

## How It Works
1. The program displays a **menu** of available shapes.  
2. The user **selects a shape** and enters the required dimensions.  
3. The program **calculates and displays** the area, perimeter, and volume (if applicable).  
4. The user can **repeat** the process or choose to exit.  






