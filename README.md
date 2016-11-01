# alu-client-java

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.payu.gecad.clients</groupId>
    <artifactId>alu-client-java</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.payu.gecad.clients:alu-client-java:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/alu-client-java-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.payu.gecad.*;
import com.payu.gecad.auth.*;
import com.payu.gecad.model.*;
import com.payu.gecad.alu.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
        DefaultApi apiInstance = new DefaultApi();
        try {
            TestEntity result = apiInstance.test1();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#test1");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://some-api.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**test1**](docs/DefaultApi.md#test1) | **GET** /test1 | 
*DefaultApi* | [**test1Post**](docs/DefaultApi.md#test1Post) | **POST** /test1 | 


## Documentation for Models

 - [TestEntity](docs/TestEntity.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### gecadMerchantSecretKey

- **Type**: API key
- **API key parameter name**: gecadMerchantSecretKey
- **Location**: HTTP header

### gecadMerchantKey

- **Type**: API key
- **API key parameter name**: gecardMerchantKey
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



