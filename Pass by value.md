# Pass By Value
Java is pass by value, that means a method gets a copy of what you pass in.

For primitives, it gets a copy of the actual value.

### Example:
int age = 21;
in agecopy = age;
System.out.println(age);
System.out.println(ageCopy);





For objects, it gets a copy of the reference, so it can change the object, but it cannot replace the original variable.
