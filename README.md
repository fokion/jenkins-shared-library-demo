Have a pipeline like this  and that will trigger our library
( the library is loaded implicitly from the master branch)

```groovy
pipeline {
   agent any
   stages {
      stage('Hello') {
         steps {
            echo 'Hello World'
         }
      }
      stage('Work with lib'){
          steps{
              coverity("127.0.0.1",12345)
          }
      }
   }
}
```