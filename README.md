Exercise Description

Program a generic class Person<T> with a name attribute and the necessary methods. The type of the name attribute must be T.
Make another class FullName with attributes firstname and lastname (both strings).

Test the class Person<T>, first with String as type parameter, and then with FullName as type parameter.

Modify the class Person<T> so that it implements the interface Comparable<Person<T>> with persons ordered according to the value of the name attribute. This will require that the type parameter T implements Comparable<T>. Test your modified class.

Add some persons to an ArrayList<Person<Name>>. Print the list before and after sorting it with Collections.sort().
