> Inner classes can be declared private. So it is a security mechanism.
>
> Inner class can be also used to access private members of a class
>
> Nested classes
>
> - static nested classes
>
>   - create with `Outer.Inner inner = new Outer.Inner();`
>
> - inner classes
>
>   - inner classes
>     - create an instance with `Outer.Inner inner = outer.new Inner();`
>   - method local inner classes
>     - scope is only inside the method
>   - anonymous inner classes
>     - declare and instantiate at the same time
>     - used whenever you need to override the method of a class or interface
>     - can be passed directly to a method as a method argument
>
>   > project: java_learning_inner_class
>   >
>   > guide: [Java Inner Classes Tutorialspoint](https://www.tutorialspoint.com/java/java_innerclasses.htm)