# lombok-demo
Use Lombok ("metaprogramming" code generator library) with enough Maven support to make IDE happy.

Lombok generates all the cruft for a javabeans, using annotations to control the process.
It's not Groovy or Scala, but it makes the work shorter if you are stuck in plain old Java.

This demo contains a Maven pom.xml which sets up this process,
including a configuration to make an IDE, such as JetBrains IntelliJ,
recognize that you are generating source code and scan the generated code as part of the project.
(this of course greatly helps with autocompletion, as well as not flagging the generated methods and such as undefined)
