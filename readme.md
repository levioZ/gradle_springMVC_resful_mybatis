### you don't need to install gradle,you just run the task in the command line

```
$gradlew xxx

```


### how to run  

1、 first, you need to run the task

```
$gradlew build
```

2、generate eclipse or idea configuration files and import it

```
$gradlew eclipse

or

$gradlew idea

```

3、 start tomcat

```
$gradlew bootRun

```
***This is all you have to do***   

### if you want to package war,you just do it

```
$gradlew war

```

### how to test the restful

You can use **postman**,it's a chrome plugin. like this

 ![post man](https://raw.githubusercontent.com/levioZ/levioZ.github.io/master/images/postman.png)


### how to debug
 you can add the following code to build.gradle

```xml
 task debugRun(dependsOn:bootRun) {
     gradle.taskGraph.whenReady { graph ->
         if (graph.hasTask(debugRun)) {
             bootRun {
                 debug = true
             }
         }
     }
 }

```

and config intellij idea,like that:

![intellijConfiguration](https://raw.githubusercontent.com/levioZ/levioZ.github.io/master/images/intellijConfiguration.png)


