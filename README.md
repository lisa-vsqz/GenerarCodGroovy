Proyecto donde se utiliza Groovy para generar codigo en tiempo de ejecución. 
Específicamente se utiliza: methodMissing y ExpandoMetaClass


Concepts:
The methodMissing method is similar to propertyMissing. However, methodMissing intercepts a call for any missing method, thereby avoiding the MissingMethodException.
The ExpandoMetaClass class provides numerous ways to transform an existing class at runtime. For example, we can add properties, methods, or constructors.
