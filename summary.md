## ExceptionTest
- should_customize_exception()
1. The knowledge point of this unit test is to know how to call the constructor of its super class. Offical document: https://docs.oracle.com/javase/tutorial/java/IandI/super.html
2. The original constructor StringFormatException(String message) is not yet implemented and throw a NotImplementedException.
3. Implement the constructor of class StringFormatException which is StringFormatException(String message), call its super class by super(message), and thus it can initialize the message as its exception message correctly.
4. No

- should_customize_exception_continued()
1. The knowledge point of this unit test is to know how to call the constructor of its super class. Offical document: https://docs.oracle.com/javase/tutorial/java/IandI/super.html
2. The original constructor StringFormatException(String message, Throwable cause) is not yet implemented and throw a NotImplementedException.
3. Implement the constructor of class StringFormatException which is StringFormatException(String message, Throwable cause), call its super class by super(message, cause), and thus it can initialize the message the cause as its exception member correctly.
4. No

- should_be_careful_of_the_order_of_finally_block()
1. The knowledge point of this unit test is to know that code in a finally block will eventually be executed after try block, and it will overwrite the return statement of the try block if itself also contains a return statement. Offical document: https://docs.oracle.com/javase/tutorial/essential/exceptions/finally.html
2. The original expected result is Integer.MAX_VALUE at first.
3. As the finally block is executed after the try block and use the finally block return statement, passing 2 to the confuse() would finally get 0 as result. So the expected result should be 2.
4. No

- should_use_the_try_pattern()
1. The knowledge point of this unit test is to know the resource that implements AutoCloseable will automatically execute close() when leaving try block. Offical document: https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
2. The original expected result is null value at first.
3. Since the MyClosableType closable will be closed when it is leaving the try block, the close() method of its member ClosableStateReference is invoked under this implementation, so the expected result would be true for isClosed().
4. No

- should_call_closing_even_if_exception_throws()
1. The knowledge point of this unit test is to know the resource that implements AutoCloseable will automatically execute close() when leaving try block even if there is exception thrown. Offical document: https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
2. The original expected result is null value at first.
3. Since the MyClosableType closable will be closed when it is leaving the try block even if there is exception thrown, the close() method of its member ClosableStateReference is invoked under this implementation, so the expected result would be true for isClosed().
4. No

- should_get_method_name_in_stack_frame()
1. The knowledge point of this unit test is to know the Java provided Thread class which can access the current stack trace containing the running class and method. Offical document: https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html
2. The original method getCurrentMethodName() of class StackFrameHelper is not yet implemented and throw a NotImplementedException.
3. Call the Thread.currentThread().getStackTrace() and get the correct class name and method name in the stack trace and then we can return it.
4. No

## InheritanceTest
- should_be_derived_from_object_class()
1. The knowledge point of this unit test is to know that every class even if no explicit superclass, it will inherit Object class as its super class. Offical document: https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html
2. The original expected result is null value at first.
3. The expected super class would be Object since the SimpleEmptyClass has no explicit superclass.
4. No

- should_call_super_class_constructor()
1. The knowledge point of this unit test is to know the calling of one super class default constructor (with no argument) when a subclass default constructor is invoked. Offical document: https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html
2. The original expected result is empty at first.
3. Since it is calling the constructor with no argument, which will call the default constructor of its super class. The log will be in order: "SuperClassWithDefaultConstructor.constructor()", "DerivedFromSuperClassWithDefaultConstructor.constructor()".
4. No

- should_call_super_class_constructor_continued()
1. The knowledge point of this unit test is to know the calling of one super class default constructor (with no argument) when a subclass default constructor is invoked. Offical document: https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html
2. The original expected result is empty at first.
3. Since it is calling the constructor with int as argument, but that consturctor also invoke its own default constructor with this(), which will call the default constructor of its super class. The log will be in order of "SuperClassWithDefaultConstructor.constructor()", "DerivedFromSuperClassWithDefaultConstructor.constructor()", "DerivedFromSuperClassWithDefaultConstructor.constructor(int)".
4. No

- should_call_super_class_constructor_more()
1. The knowledge point of this unit test is to know that we can call its super class constructor by super(). Offical document: https://docs.oracle.com/javase/tutorial/java/IandI/super.html
2. The original expected result is empty at first.
3. Since it is calling the constructor with String as argument, but that consturctor also invoke its own default constructor with super(arg), which will call the constructor of its super class. The log will be in order of "SuperClassWithDefaultConstructor.constructor(String)", "DerivedFromSuperClassWithDefaultConstructor.constructor(String)".
4. No

- should_call_most_derived_methods()
1. The knowledge point of this unit test is to know the overiding of methods under inheritance. Offical document: https://docs.oracle.com/javase/tutorial/java/IandI/override.html
2. The original expected result is null value at first.
3. Since the class DerivedFromBaseClassForOverriding is overriding the method of getName() over its super class BaseClassForOverriding, the expected result of getName() would be "DerivedFromBaseClassForOverriding".
4. No

- should_call_super_class_methods()
1. The knowledge point of this unit test is to know that we can call the method of its super class by super.xxx(). Offical document: https://docs.oracle.com/javase/tutorial/java/IandI/super.html
2. The original expected result is null value at first.
3. Since the class DerivedFromBaseClassForOverridingCallingSuper is overriding the method of getName() over its super class BaseClassForOverriding, and it is calling the getName() method of its super class by super.getName(), which return "BaseClassForOverriding", plus the "->DerivedFromBaseClassForOverridingCallingSuper". The expected result of getName() of DerivedFromBaseClassForOverridingCallingSuper would be "BaseClassForOverriding->DerivedFromBaseClassForOverridingCallingSuper"
4. No

- should_use_caution_when_dealing_with_array_type()
1. The knowledge point of this unit test is to know the effect of ploymorphism. Offical document: https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html
2. The original expected result is null value at first.
3. Even if the arrayWithBaseType is casted to SuperClassWithDefaultConstructor[], it is actually an array of DerivedFromSuperClassWithDefaultConstructor which is the subclass of SuperClassWithDefaultConstructor. So that it can't store a variable of class SuperClassWithDefaultConstructor. Therefore exception will throw and the expected value of willThrow will be true.
4. No

- should_not_make_you_confused()
1. The knowledge point of this unit test is to know the overiding of methods under inheritance. Offical document: https://docs.oracle.com/javase/tutorial/java/IandI/override.html
2. The original expected result is null value at first.
3. Since the class NestedDerivedClassWithName is overriding the method of getName() over its super classes the expected result of getName() would be "NestedDerivedClassWithName".
4. No

- should_not_make_you_confused_2()
1. The knowledge point of this unit test is to know the inheritance. Offical document: https://docs.oracle.com/javase/tutorial/java/IandI/multipleinheritance.html
2. The original expected result is null value at first.
3. DerivedFromBaseClassWithName don't override the method getName(), calling getName() of a DerivedFromBaseClassWithName instance will invoke the getName() of its super class BaseClassWithName. Therefore the expected result should be "BaseClassWithName".
4. No

- should_use_instance_of_to_determine_inheritance_relationship()
1. The knowledge point of this unit test is to know the effect of ploymorphism and the inheritance can be determined be instance of statement. Offical document: https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html
2. The original expected result is null value at first.
3. Since the class NestedDerivedClassWithName is the subclass of DerivedFromBaseClassWithName which is the subclass of BaseClassWithName, calling instance of these classes would all return true.
4. No

- should_use_instance_of_only_in_inheritance_relationship()
1. The knowledge point of this unit test is to know the inheritance can be determined be instance of statement. Offical document: https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html
2. The original expected results are null value at first.
3. Since the Integer class does not inherit Long class, the first instance of Integer would return true, while instance of Long will return false.
4. No

- should_write_perfect_equals_1() to should_write_perfect_equals_7()
1. The knowledge point of this unit test is to know the overiding of methods and thus we can customize the equals() and hashCode() for a class which need to compare different field. Offical document: https://docs.oracle.com/javase/tutorial/java/IandI/override.html
2. The original method equals() and hashCode() of class PersonForEquals are not yet implemented and throw a NotImplementedException.
3. Implement the equals(), only return true which two names and two yearOfBirths are exactly matched, also return false when the compare object is not of the same class. Implement the hashCode() by adding the hashCode of the name and yearOfBirth.
4. No

## ObjectTest
- should_point_to_the_same_object()
1. The knowledge point of this unit test is to know that reference concept of Java. Offical document: https://docs.oracle.com/javase/tutorial/java/javaOO/usingobject.html
2. The original expected result is null value at first.
3. The two objects are sharing the same reference to the memory space through the assign statement, so the expected result is true.
4. No

- should_point_to_different_object()
1. The knowledge point of this unit test is to know that reference concept of Java. Offical document: https://docs.oracle.com/javase/tutorial/java/javaOO/usingobject.html
2. The original expected result is null value at first.
3. The two objects are created by two new statement, which would point to different memory space even if their member values are the same, so the expected result is false.
4. No

- should_initialized_to_default_value()
1. The knowledge point of this unit test is to know the default value of different data type. Offical document: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
2. The original expected results are empty at first.
3. For a String, default value is null. For a int, default value is 0. For an object, default value is also null. So the expected results are null, 0, null in order.
4. No

- should_pass_by_value()
1. The knowledge point of this unit test is to know that Java is 'pass by value' for method parameter. Offical document: https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html
2. The original expected result is 0 at first.
3. Since java is 'pass by value', no matter what the method is doing to the variable passed inside. For a primitive data type, its value would be affected under this case, so the expected result is 5.
4. No

- should_pass_by_value_continued()
1. The knowledge point of this unit test is to know that Java is 'pass by value' for method parameter. Offical document: https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html
2. The original expected result is null at first.
3. Since java is 'pass by value', so passing an object to it and reassign its reference will not affect the reference of the object outside, so the expected result is sameReference.
4. No

- should_modify_internal_state()
1. The knowledge point of this unit test is to know that even if Java is 'pass by value' for method parameter, of an object, it is passing the reference of it, should editing its member would have effect. Offical document: https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html
2. The original expected result is null at first.
3. Even if Java is 'pass by value' for method parameter, of an object, it is passing the reference of it, should editing its member would have effect, so the expected result is "Updated Name".
4. No

- should_choose_method_at_compile_time()
1. The knowledge point of this unit test is to know that Java would choose the method during compile time, and since the String is casted to Object, the method it inoke will become the one that takes an Object as parameter. Offical document: https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html
2. The original expected result is null value at first.
3. Since Java would choose the method during compile time, and since the String is casted to Object, the method it inoke will become the one that takes an Object as parameter, so the expected result is "methodWithOneParameter(Object)".
4. No

- should_choose_the_most_specific_overload()
1. The knowledge point of this unit test is to know the oveloading of methods. Offical document: https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
2. The original expected result is null value at first.
3. Since Java will chose the most speicific method from the perspective of parameter type, the expected result of getName() would be "methodWithTwoParameters(String, Integer)", but not "methodWithTwoParameters(String, Number)".
4. No

- should_calling_another_constructor()
1. The knowledge point of this unit test is to know we can use this() to call the method of its own class. Offical document: https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html
2. The original expected result is null value at first.
3. The default consturctor of CallingAnotherCtor is calling this("Untitled"), which pass the String "Untitled" to the constructor CallingAnotherCtor(String name) and set the name of it. So the expected result would be "Untitled".
4. No

- should_get_initialization_ordering()
1. The knowledge point of this unit test is to know the initalize of a object. Offical document: https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html
2. The original expected result is empty at first.
3. Since the class InitializationOrderClass, in order it will have the intialization of its members on top, which is "private final Object field = initField();", the initField will be called at first. Then it is the block which add the "Initialization Block" to log, and then to its constructor, however its default constructor also called this(4), which passed to the constructor InitializationOrderClass(int argument). So the expected result would be "Field Initializer", "Initialization Block", "Constructor with argument", "Default constructor in order.
4. No

- should_get_message_of_var_length_parameters()
1. The knowledge point of this unit test is to know the passing of multiple but not limited number of parameter as parameters to a method, which will treat them as an array. Offical document: https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html
2. The original expected results are null value at first.
3. It is passing int 1,2,3 to the method getMessageOfVarLengthParameters(), which will consider it as an array and append them to string, so the expected result should be "1\n2\n3\n".
4. No

- should_get_message_of_var_length_parameters_2()
1. The knowledge point of this unit test is to know the passing of multiple but not limited number of parameter as parameters to a method, which will treat them as an array. Offical document: https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html
2. The original expected results are null value at first.
3. Defining the input parameter as an array will not cause any error for varargs, so itt is passing the array of int 1,2,3 to the method getMessageOfVarLengthParameters(), which will append them to string, so the expected result should be "1\n2\n3\n".
4. No
