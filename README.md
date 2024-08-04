# Groovy Tutorial

To run the console,

```bash
groovyconsole
```

An example of groovy code,

```groovy
def x = 5
x += 5
println x

assert x==11: "Value was not eleven"
```

Groovy is an optionally typed language.

## Data Types

```groovy
String
int
float
Boolean
```

```groovy
String name = "ExampleName"
int courseCount = 11
float salary = 999.99
Boolean isProgrammer = true

println name + " has created " + courseCount + " course. "
println name + " is a programmer? " + isProgrammer.toString().capitalize()
println name + " wishes his salary was \$" + String.format("%.2f", salary)
```

For loop,

```groovy
String[] singers = ["Bob", "Jeff"]

for(String singer: singers){
    println singer
}
```

Or,

```groovy
String[] singers = ["Bob", "Jeff"]

singers.each{x -> println(x)}
```

```groovy
String[] singers = ["Bob", "Jeff"]

singers.each{ println(it) }
```

## Function

```groovy
String getUserName(String firstName, String lastName){
    return firstName.substring(0,1).toLowerCase() + lastName.toLowerCase();
}

void printCredential(cred){
    println("UserName is ${cred}");
}

String[] firstNames = ["Bob", "Jeff", "Roy", "George", "Tom"]
String[] lastNames = ["Dylan", "Lynne", "Orbison", "Harrison", "Petty"]

for(int i=0; i<firstNames.size(); i++){
    printCredential(getUserName(firstNames[i], lastNames[i]))
}
```

## Working with Classes

```groovy
class User{
    String lastName;
    String firstName;

    public String UserName(){
        return getUserName(this.firstName, this.lastName);
    }

    private String getUserName(String firstName, String lastName){
        return firstName.substring(0,1).toLowerCase() + lastName.toLowerCase();
    }
}


void printCredential(cred){
    println("UserName is ${cred}");
}

String[] firstNames = ["Bob", "Jeff", "Roy", "George", "Tom"]
String[] lastNames = ["Dylan", "Lynne", "Orbison", "Harrison", "Petty"]

for(int i=0; i<firstNames.size(); i++){
    User u = new User(firstName: firstNames[i], lastName: lastNames[i]);
    println("UserName is ${u.UserName()}");
    //  printCredential(getUserName(firstNames[i], lastNames[i]))
}
```

## IDE & Compiler Installation

### macOS

```bash
brew install eclipse-java
```

## Documentation

Syntax

<https://groovy-lang.org/syntax.html>

Operators

<https://groovy-lang.org/operators.html>
