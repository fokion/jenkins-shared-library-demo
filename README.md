[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgithub.com%2Ffokion%2Fjenkins-shared-library-demo.svg?type=shield)](https://app.fossa.io/projects/git%2Bgithub.com%2Ffokion%2Fjenkins-shared-library-demo?ref=badge_shield)

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

## License
[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgithub.com%2Ffokion%2Fjenkins-shared-library-demo.svg?type=large)](https://app.fossa.io/projects/git%2Bgithub.com%2Ffokion%2Fjenkins-shared-library-demo?ref=badge_large)