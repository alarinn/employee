# Getting Started

### Reference Documentation

1. This repo describes when part-time employees are added to the employee design.
2. It is assumed that there is a GUI for users to add new employees.
3. The GUI will change to accept a radio button - Employee Type.  The radio button will have 2 options - Part-time and Full-Time.
4. The database will also be changed to add a new column - employee type.
   1. The best practice is to create an Employee Type table and add all of the possible employee types to this table.
   2. For example:
      1. Employee Type Id = 1, Employee Type Description = Full-time
      2. Then a new column can be added to the existing table called EmployeeType.
      3. When a new Employee is created, the Employee table will set the EmployeeType to 1 if the new employee is full-time.
      
I made a few assumptions due to time constraints and lack of a concise business statement.  If this were a real world use case, I would not start on any design until after meeting with the product team and/or business analysts.  Primarily I don't have enough info to know what exactly is a part-time employee.  A part-time employee could be an hourly person working 20 hours a week or they could be a contractor getting paid a fixed cost contract.  A full-time employee could be hourly or salaried.

For the base design changes, I changed the Employee class to be an abstract class with all of the prior attributes.  Then I created 2 new classes - PartTimeEmployee and FullTimeEmployee.  Both of these classes extend or inherit from the base class, Employee.  I added a new attribute to Employee, isPartTime.  Both classes set this new flag in their constructors.  Then in the abstract calculatePay, compute the pay of the Employee.  The method calculatePay() uses polymorphism to calculate the employee's pay without referring to the type of Employee.  This has the added benefit of being used in the context of a block of code where a paper slip could be printed out using a generic call to the calculatePay() method:

```
void printPaySlip(Employee emp) {
   System.out.println("Employee pay calculated: $" + emp.calculatePay());
}
```

How this can be used is in a GeneratePaySlip class where the Employee object was passed into the print method.  In this case, any employee can be used here without knowing what kind of employee they are.  It is apparent when adding addition employee types which then doesn't require changes to existing code outside of adding new classes to handle the new employee types.

Note:  A better way is to make Employee and Interface and design by that interface rather than using inheritance.  This is especially true in cases where inheritance creates a diamond making it difficult to know what the bottom subclass is inheriting from.