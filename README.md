# springadvanced

Maven archetype quickstart:

```
$ mvn archetype:generate -DgroupId=com.parkus -DartifactId=autowiring -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

Dependencies:
```
<properties>
    <springframework.version>5.2.22.RELEASE</springframework.version>
 </properties>
  
<dependencies>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-core</artifactId>
      <version>${springframework.version}</version>
    </dependency>

    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-context</artifactId>
      <version>${springframework.version}</version>
    </dependency>
  </dependencies>
```
