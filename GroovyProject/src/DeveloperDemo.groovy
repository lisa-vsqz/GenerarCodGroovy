
// dynamic method interception (methodMissing)
class Developer {
    List languages = []
    def coffee(){
        println "Turning coffee into code...idk"
    }
    //intercept cache invoke pattern
    //dynamic method provided by Groovy that gets called when a method is invoked on an object, but that method does not exist.
    def methodMissing(String name, args){
        println "method was called for ${name}"

        boolean languageExists = languages.find { it == name.split("write")[1]}
        if (languageExists ){
            String language = name.split ("write")[1]
            if (languages.contains(language)){
                def writeCode = { -> println "enjoy writing code in ${language}" }
                metaClass."$name" = writeCode
                return writeCode()
            }
        }
    }
}

ExpandoMetaClass.enableGlobally()

Developer lis = new Developer()
lis.coffee()
lis.languages << "Java"
lis.languages << "Groovy"
lis.languages << "Javascript"
lis.writeGroovy()
lis.writeJava()
lis.writeJavascript()
lis.writePython() //never says you are writing code in python cause is not part of array