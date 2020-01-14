# java-access-modifiers

* The access modifiers in Java specifies the access level or scope of a resource i.e. variaables, method, constructor, or class.
* It specifies how we can access a certain resource.

There are 4 access modifiers:-

**1.)private
2.)default
3.)protected
4.)public
**

**1.)private:** 
* 'private' is a keyword.
* Only members i.e. states and variables, can be private.
* A private member can only be accessed within its class.
* Private members are not visible outside class.
* Constructors can also be private. Private contructor means that you can make object of the containing class only while being inside that particular class.
* private access modifier gives the most isolated access level among all access modifiers.
* private class does not exist because isolating a class within its own body makes no sense.

**2.)default**
* 'default' is not a keyword.
* A resource having no access modifier mentioned have 'default' access level by default.
* Resources i.e. variables, constructors, methods and classes, can have default access level.
* A default resource can be accessed within package only, outside package it is not visible.

**3.)protected**
* 'protected' is a keyword.
* Only members i.e. states and variables, can be protected or you can say can have protected level access.
* Protected members can be accessed anywhere whithin package and outside package through child class object only.
* Protected members acts as public members within package but outside package it acts as a private member of subclass.

**4.)public**
* 'public' is a keyword.
* Resources i.e. variables, constructors, methods and classes, can be public.
* Public resources can be accessed anywhere.
* They can be accessed within class, outside class and outside package as well.
* There can be only one public class in a java source file.
* If there exist a public class in a java source file then the file name must be same as public class' name.
* Best practice is that main method should be inside public class(not forced).

**To understand access modifiers in more depth take a look at this table**

Access Modifier | within class | within package | outside package by subclass only | outside package
--------------- | ------------ | -------------- | -------------------------------- | ---------------
**private**     |    yes       |       no       |               no                 |      no        
**default**     |    yes       |      yes       |               no                 |      no        
**protected**   |    yes       |      yes       |              yes                 |      no        
**public**      |    yes       |      yes       |              yes                 |     yes        

You can also see relevant codes in the repository.
