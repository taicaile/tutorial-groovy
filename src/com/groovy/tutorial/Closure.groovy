package com.groovy.tutorial;

String hello = "Hello"

// Closure can have parameter
def myClosure1 = { name -> println "$hello ${name}"}

myClosure1.call("Joe")


// Closure as parameter
def myMethod(clos) {
	clos.call("Groovy")
}

myMethod(myClosure1)

// Closure can have multiple parameters
def myClosure2 = {
	a,b,c -> return a + b + c
}

println myClosure2.call(1,2,3)

def myList1 = ["Apple", "Orange", "Grapes"]
myList1.each { it -> println it}

def myMap = ["subject":"Groovy", "topic":"Closures"]

myMap.each { it -> println it }

def myList2 = [1,2,3,4,5]
println myList2.find{item -> item==3}
println myList2.findAll { item -> item>3 }
println myList2.any { item -> item == 3 }
println myList2.every { item -> item >2 }
