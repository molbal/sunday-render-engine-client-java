# renderservice-client

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
    <groupId>hu.sundayit</groupId>
    <artifactId>renderservice-client</artifactId>
    <version>0.1</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "hu.sundayit:renderservice-client:0.1"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/renderservice-client-0.1.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import hu.sundayit.renderservice.client.*;
import hu.sundayit.renderservice.client.auth.*;
import hu.sundayit.renderservice.client.model.*;
import hu.sundayit.renderservice.client.DocumenttyperestApi;

import java.io.File;
import java.util.*;

public class DocumenttyperestApiExample {

    public static void main(String[] args) {
        
        DocumenttyperestApi apiInstance = new DocumenttyperestApi();
        Long id = 789L; // Long | Id
        try {
            apiInstance.deleteDocumentTypeUsingDELETE(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumenttyperestApi#deleteDocumentTypeUsingDELETE");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://136.144.173.90:8009/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DocumenttyperestApi* | [**deleteDocumentTypeUsingDELETE**](docs/DocumenttyperestApi.md#deleteDocumentTypeUsingDELETE) | **DELETE** /document_type/delete/{Id} | Deletes a document type
*DocumenttyperestApi* | [**getDocumentTypeByIdUsingGET**](docs/DocumenttyperestApi.md#getDocumentTypeByIdUsingGET) | **GET** /document_type/{Id} | Returns the document type entity by the ID
*DocumenttyperestApi* | [**getDocumentTypesByProjectIdUsingGET**](docs/DocumenttyperestApi.md#getDocumentTypesByProjectIdUsingGET) | **GET** /document_type/project_id/{projectEntityId} | Returns a list of document type entities by their project id
*DocumenttyperestApi* | [**insertDocumentTypeUsingPOST**](docs/DocumenttyperestApi.md#insertDocumentTypeUsingPOST) | **POST** /document_type/create | insertDocumentType
*DocumenttyperestApi* | [**updateDocumentTypeUsingPOST**](docs/DocumenttyperestApi.md#updateDocumentTypeUsingPOST) | **POST** /document_type/update/{Id} | Updates an existing document type
*FilerestApi* | [**createFileEntityUsingPOST**](docs/FilerestApi.md#createFileEntityUsingPOST) | **POST** /file/create | Creates a file
*FilerestApi* | [**getFileEntityUsingGET**](docs/FilerestApi.md#getFileEntityUsingGET) | **GET** /file/get/{Id} | Gets a file eneity, its metadata read from the database and its contents read from the file storage
*FilerestApi* | [**getFilesByProjectIdUsingGET**](docs/FilerestApi.md#getFilesByProjectIdUsingGET) | **GET** /file/getbyproject/{projectId} | Gets all file entities by a project. Note, that this operation only queries the database, and not the file contents.
*FilerestApi* | [**updateFileContentsUsingPOST**](docs/FilerestApi.md#updateFileContentsUsingPOST) | **POST** /file/update | Updates a file
*ProjectrestApi* | [**deleteProjectUsingDELETE**](docs/ProjectrestApi.md#deleteProjectUsingDELETE) | **DELETE** /project/delete/{Id} | Deletes a project, its document types, and its files.
*ProjectrestApi* | [**getAllProjectsUsingGET**](docs/ProjectrestApi.md#getAllProjectsUsingGET) | **GET** /project/all | Returns all projects
*ProjectrestApi* | [**getProjectByIdUsingGET**](docs/ProjectrestApi.md#getProjectByIdUsingGET) | **GET** /project/{Id} | Gets a project by its ID
*ProjectrestApi* | [**insertProjectUsingPOST**](docs/ProjectrestApi.md#insertProjectUsingPOST) | **POST** /project/create | Creates a new project. The ID does not need to be filled, as it is generated automatically
*ProjectrestApi* | [**updateProjectUsingPOST**](docs/ProjectrestApi.md#updateProjectUsingPOST) | **POST** /project/update/{Id} | Updates a project.
*RenderrequestrestApi* | [**renderRequestUsingPOST**](docs/RenderrequestrestApi.md#renderRequestUsingPOST) | **POST** /render | Handles a render request and returns


## Documentation for Models

 - [DocumentTypeEntity](docs/DocumentTypeEntity.md)
 - [FileEntity](docs/FileEntity.md)
 - [IterableProjectEntity](docs/IterableProjectEntity.md)
 - [ProjectEntity](docs/ProjectEntity.md)
 - [RenderRequestEntity](docs/RenderRequestEntity.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author

molnar.balint@mdy.hu

