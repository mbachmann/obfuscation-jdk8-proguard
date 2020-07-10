# Java JDK 8 and Fx8 with Maven and Proguard Obfuscation


`obfuscation-jdk8-proguard` sample modular project to run with Maven

### Linux / Mac

If you run on Linux or Mac, follow these steps:

    cd to the folder obfuscation-jdk8-proguard
    ./mvnw clean package

Run the application with obfuscation jar:

    cd to the folder obfuscation-jdk8-proguard
     java -jar ./target/*small.jar

Run the application without obfuscation jar:

    cd to the folder obfuscation-jdk8-proguard
     java -jar ./target/*T.jar

### Windows

If you run on Windows, follow these steps:

    cd to the folder obfuscation-jdk8-proguard
    mvnw clean package

If compilation fails... this line has to be adjusted:
```
<lib>${java.home}/lib/ext/jfxrt.jar</lib>
```

Run the application without obfuscation jar:

    cd to the folder obfuscation-jdk8-proguard
    java -jar target/*small.jar

Run the application without obfuscation jar:

    cd to the folder obfuscation-jdk8-proguard
     java -jar ./target/*T.jar

## Proguard

Proguard runs during `maven package`. Some setups are directly in the
done in the plugin configuration. Some of the properties are
described in the file `proguard_config.pro`.

