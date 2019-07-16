# ProjectrestApi

All URIs are relative to *https://136.144.173.90:8009/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteProjectUsingDELETE**](ProjectrestApi.md#deleteProjectUsingDELETE) | **DELETE** /project/delete/{Id} | Deletes a project, its document types, and its files.
[**getAllProjectsUsingGET**](ProjectrestApi.md#getAllProjectsUsingGET) | **GET** /project/all | Returns all projects
[**getProjectByIdUsingGET**](ProjectrestApi.md#getProjectByIdUsingGET) | **GET** /project/{Id} | Gets a project by its ID
[**insertProjectUsingPOST**](ProjectrestApi.md#insertProjectUsingPOST) | **POST** /project/create | Creates a new project. The ID does not need to be filled, as it is generated automatically
[**updateProjectUsingPOST**](ProjectrestApi.md#updateProjectUsingPOST) | **POST** /project/update/{Id} | Updates a project.


<a name="deleteProjectUsingDELETE"></a>
# **deleteProjectUsingDELETE**
> deleteProjectUsingDELETE(id)

Deletes a project, its document types, and its files.

### Example
```java
// Import classes:
//import hu.sundayit.renderservice.client.ApiException;
//import hu.sundayit.renderservice.client.ProjectrestApi;


ProjectrestApi apiInstance = new ProjectrestApi();
Long id = 789L; // Long | Id
try {
    apiInstance.deleteProjectUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectrestApi#deleteProjectUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getAllProjectsUsingGET"></a>
# **getAllProjectsUsingGET**
> IterableProjectEntity getAllProjectsUsingGET()

Returns all projects

### Example
```java
// Import classes:
//import hu.sundayit.renderservice.client.ApiException;
//import hu.sundayit.renderservice.client.ProjectrestApi;


ProjectrestApi apiInstance = new ProjectrestApi();
try {
    IterableProjectEntity result = apiInstance.getAllProjectsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectrestApi#getAllProjectsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IterableProjectEntity**](IterableProjectEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: *_/_*

<a name="getProjectByIdUsingGET"></a>
# **getProjectByIdUsingGET**
> ProjectEntity getProjectByIdUsingGET(id)

Gets a project by its ID

### Example
```java
// Import classes:
//import hu.sundayit.renderservice.client.ApiException;
//import hu.sundayit.renderservice.client.ProjectrestApi;


ProjectrestApi apiInstance = new ProjectrestApi();
Long id = 789L; // Long | Id
try {
    ProjectEntity result = apiInstance.getProjectByIdUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectrestApi#getProjectByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Id |

### Return type

[**ProjectEntity**](ProjectEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="insertProjectUsingPOST"></a>
# **insertProjectUsingPOST**
> ProjectEntity insertProjectUsingPOST(project)

Creates a new project. The ID does not need to be filled, as it is generated automatically

### Example
```java
// Import classes:
//import hu.sundayit.renderservice.client.ApiException;
//import hu.sundayit.renderservice.client.ProjectrestApi;


ProjectrestApi apiInstance = new ProjectrestApi();
ProjectEntity project = new ProjectEntity(); // ProjectEntity | project
try {
    ProjectEntity result = apiInstance.insertProjectUsingPOST(project);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectrestApi#insertProjectUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project** | [**ProjectEntity**](ProjectEntity.md)| project |

### Return type

[**ProjectEntity**](ProjectEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="updateProjectUsingPOST"></a>
# **updateProjectUsingPOST**
> ProjectEntity updateProjectUsingPOST(id, project)

Updates a project.

### Example
```java
// Import classes:
//import hu.sundayit.renderservice.client.ApiException;
//import hu.sundayit.renderservice.client.ProjectrestApi;


ProjectrestApi apiInstance = new ProjectrestApi();
Long id = 789L; // Long | Id
ProjectEntity project = new ProjectEntity(); // ProjectEntity | project
try {
    ProjectEntity result = apiInstance.updateProjectUsingPOST(id, project);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectrestApi#updateProjectUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Id |
 **project** | [**ProjectEntity**](ProjectEntity.md)| project |

### Return type

[**ProjectEntity**](ProjectEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

