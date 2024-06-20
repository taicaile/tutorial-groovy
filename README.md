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

assert x==11: "Valeo was not eleven"
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
