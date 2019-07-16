# FilerestApi

All URIs are relative to *https://136.144.173.90:8009/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFileEntityUsingPOST**](FilerestApi.md#createFileEntityUsingPOST) | **POST** /file/create | Creates a file
[**getFileEntityUsingGET**](FilerestApi.md#getFileEntityUsingGET) | **GET** /file/get/{Id} | Gets a file eneity, its metadata read from the database and its contents read from the file storage
[**getFilesByProjectIdUsingGET**](FilerestApi.md#getFilesByProjectIdUsingGET) | **GET** /file/getbyproject/{projectId} | Gets all file entities by a project. Note, that this operation only queries the database, and not the file contents.
[**updateFileContentsUsingPOST**](FilerestApi.md#updateFileContentsUsingPOST) | **POST** /file/update | Updates a file


<a name="createFileEntityUsingPOST"></a>
# **createFileEntityUsingPOST**
> FileEntity createFileEntityUsingPOST(fileToCreate)

Creates a file

### Example
```java
// Import classes:
//import hu.sundayit.renderservice.client.ApiException;
//import hu.sundayit.renderservice.client.FilerestApi;


FilerestApi apiInstance = new FilerestApi();
FileEntity fileToCreate = new FileEntity(); // FileEntity | fileToCreate
try {
    FileEntity result = apiInstance.createFileEntityUsingPOST(fileToCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilerestApi#createFileEntityUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileToCreate** | [**FileEntity**](FileEntity.md)| fileToCreate |

### Return type

[**FileEntity**](FileEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="getFileEntityUsingGET"></a>
# **getFileEntityUsingGET**
> FileEntity getFileEntityUsingGET(id)

Gets a file eneity, its metadata read from the database and its contents read from the file storage

### Example
```java
// Import classes:
//import hu.sundayit.renderservice.client.ApiException;
//import hu.sundayit.renderservice.client.FilerestApi;


FilerestApi apiInstance = new FilerestApi();
Long id = 789L; // Long | Id
try {
    FileEntity result = apiInstance.getFileEntityUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilerestApi#getFileEntityUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Id |

### Return type

[**FileEntity**](FileEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getFilesByProjectIdUsingGET"></a>
# **getFilesByProjectIdUsingGET**
> List&lt;FileEntity&gt; getFilesByProjectIdUsingGET(projectId)

Gets all file entities by a project. Note, that this operation only queries the database, and not the file contents.

### Example
```java
// Import classes:
//import hu.sundayit.renderservice.client.ApiException;
//import hu.sundayit.renderservice.client.FilerestApi;


FilerestApi apiInstance = new FilerestApi();
Long projectId = 789L; // Long | projectId
try {
    List<FileEntity> result = apiInstance.getFilesByProjectIdUsingGET(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilerestApi#getFilesByProjectIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| projectId |

### Return type

[**List&lt;FileEntity&gt;**](FileEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="updateFileContentsUsingPOST"></a>
# **updateFileContentsUsingPOST**
> FileEntity updateFileContentsUsingPOST(fileToUpdate)

Updates a file

### Example
```java
// Import classes:
//import hu.sundayit.renderservice.client.ApiException;
//import hu.sundayit.renderservice.client.FilerestApi;


FilerestApi apiInstance = new FilerestApi();
FileEntity fileToUpdate = new FileEntity(); // FileEntity | fileToUpdate
try {
    FileEntity result = apiInstance.updateFileContentsUsingPOST(fileToUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilerestApi#updateFileContentsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileToUpdate** | [**FileEntity**](FileEntity.md)| fileToUpdate |

### Return type

[**FileEntity**](FileEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

