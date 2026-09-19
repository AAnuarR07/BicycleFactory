# Assignment #2 — Factory Method & Abstract Factory

## Software Design Patterns

This project demonstrates two creational design patterns using a Bicycle System:

- Factory Method
- Abstract Factory

## Factory Method

Factory Method is used to create different types of bicycles.

### Components

- Product: `Bicycle`
- Concrete Products: `MountainBicycle`, `CityBicycle`
- Creator: `BicycleCreator`
- Concrete Creators: `MountainBicycleCreator`, `CityBicycleCreator`

The `createBicycle()` method is the Factory Method.

## Abstract Factory

Abstract Factory is used to create families of related products.

Each family contains a bicycle and a helmet.

### Components

- Abstract Products: `Bicycle`, `Helmet`
- Concrete Products: `MountainBicycle`, `CityBicycle`, `MountainHelmet`, `CityHelmet`
- Abstract Factory: `BicycleFactory`
- Concrete Factories: `MountainBicycleFactory`, `CityBicycleFactory`
- Client: `Main`

The client works through the abstract factory and abstract product interfaces.

## Clean Code Principles

### 1. Meaningful Names

Classes and methods clearly describe their purpose, for example `MountainBicycleFactory` and `createBicycle()`.

### 2. Small Methods

Each method performs one clear operation, such as creating a specific product.

### 3. Single Responsibility

Each class has one focused responsibility, such as representing a product or creating a product family.

### 4. Consistent Formatting

The project follows consistent Java naming, indentation, and formatting conventions.

### 5. No Magic Values

The code uses meaningful types and methods instead of unexplained numeric or string identifiers.

## Project Structure

src/
├── Bicycle.java
├── MountainBicycle.java
├── CityBicycle.java
├── BicycleCreator.java
├── MountainBicycleCreator.java
├── CityBicycleCreator.java
├── Helmet.java
├── MountainHelmet.java
├── CityHelmet.java
├── BicycleFactory.java
├── MountainBicycleFactory.java
├── CityBicycleFactory.java
└── Main.java

## Example Output

=== Factory Method ===
Riding a mountain bicycle
Riding a city bicycle

=== Abstract Factory ===
Riding a mountain bicycle
Wearing a mountain helmet
Riding a city bicycle
Wearing a city helmet
