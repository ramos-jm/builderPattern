## Problem Scenario

Imagine you're developing an e-commerce application where customers create accounts with varying levels of detail.

Initially, you use a standard constructor for the User class:

```
public User(String firstName, String lastName, String email,
           String address, String phone, int age) {
     // ...
}
```

However, you encounter challenges:

<li>Registration forms: It's cumbersome to ensure users enter all fields in the correct order, leading to errors and frustration.
<li>Optional fields: Not all customers provide complete information, but the constructor forces them to.
<li>Data consistency: Changes to user profiles after registration can cause unexpected issues due to mutable fields.
Implement solution using the Builder Pattern to address the issue.

## Builder Pattern Output
![image](https://github.com/ramos-jm/builderPattern/assets/127398189/8150bdaa-c94a-4391-9e96-6de24b3d05ea)

## Class Diagram
![builderPattern](https://github.com/ramos-jm/builderPattern/assets/127398189/ff3fd12d-fbbb-4569-bf81-8ee6fdacc6ac)
