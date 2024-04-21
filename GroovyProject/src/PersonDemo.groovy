
class Person{
    String first
    String last
    String email
}

/*Person.metaClass.sayHello = { -> println "Hola Marta, lo logré"}
Person person = new Person()
person.sayHello()*/


//Expandometaclass doesnt do inheritance, to enable call  expandometaclass.enableglobally

/*Person personTwo = new Person()
Person.metaClass.sayHello = { -> println "Hola Marta, creo que no lo logré"}
personTwo.sayHello()
//Output: Caught: groovy.lang.MissingMethodException: No signature of method: Person.sayHello() is applicable for argument types: () values: []
 */

ExpandoMetaClass.enableGlobally()
//inheritance will function, metaclass modifications apply to existing objects. Higher memory usage
Person personTwo = new Person()
Person.metaClass.sayHello = { -> println "Hola Marta, LO LOGRÉ DE NUEVO"}
personTwo.sayHello()
