# DocumenttyperestApi

All URIs are relative to *https://136.144.173.90:8009/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteDocumentTypeUsingDELETE**](DocumenttyperestApi.md#deleteDocumentTypeUsingDELETE) | **DELETE** /document_type/delete/{Id} | Deletes a document type
[**getDocumentTypeByIdUsingGET**](DocumenttyperestApi.md#getDocumentTypeByIdUsingGET) | **GET** /document_type/{Id} | Returns the document type entity by the ID
[**getDocumentTypesByProjectIdUsingGET**](DocumenttyperestApi.md#getDocumentTypesByProjectIdUsingGET) | **GET** /document_type/project_id/{projectEntityId} | Returns a list of document type entities by their project id
[**insertDocumentTypeUsingPOST**](DocumenttyperestApi.md#insertDocumentTypeUsingPOST) | **POST** /document_type/create | insertDocumentType
[**updateDocumentTypeUsingPOST**](DocumenttyperestApi.md#updateDocumentTypeUsingPOST) | **POST** /document_type/update/{Id} | Updates an existing document type


<a name="deleteDocumentTypeUsingDELETE"></a>
# **deleteDocumentTypeUsingDELETE**
> deleteDocumentTypeUsingDELETE(id)

Deletes a document type

### Example
```java
// Import classes:
//import hu.sundayit.renderservice.client.ApiException;
//import hu.sundayit.renderservice.client.DocumenttyperestApi;


DocumenttyperestApi apiInstance = new DocumenttyperestApi();
Long id = 789L; // Long | Id
try {
    apiInstance.deleteDocumentTypeUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumenttyperestApi#deleteDocumentTypeUsingDELETE");
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

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="getDocumentTypeByIdUsingGET"></a>
# **getDocumentTypeByIdUsingGET**
> DocumentTypeEntity getDocumentTypeByIdUsingGET(id)

Returns the document type entity by the ID

### Example
```java
// Import classes:
//import hu.sundayit.renderservice.client.ApiException;
//import hu.sundayit.renderservice.client.DocumenttyperestApi;


DocumenttyperestApi apiInstance = new DocumenttyperestApi();
Long id = 789L; // Long | Id
try {
    DocumentTypeEntity result = apiInstance.getDocumentTypeByIdUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumenttyperestApi#getDocumentTypeByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Id |

### Return type

[**DocumentTypeEntity**](DocumentTypeEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getDocumentTypesByProjectIdUsingGET"></a>
# **getDocumentTypesByProjectIdUsingGET**
> List&lt;DocumentTypeEntity&gt; getDocumentTypesByProjectIdUsingGET(projectEntityId)

Returns a list of document type entities by their project id

### Example
```java
// Import classes:
//import hu.sundayit.renderservice.client.ApiException;
//import hu.sundayit.renderservice.client.DocumenttyperestApi;


DocumenttyperestApi apiInstance = new DocumenttyperestApi();
Long projectEntityId = 789L; // Long | projectEntityId
try {
    List<DocumentTypeEntity> result = apiInstance.getDocumentTypesByProjectIdUsingGET(projectEntityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumenttyperestApi#getDocumentTypesByProjectIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectEntityId** | **Long**| projectEntityId |

### Return type

[**List&lt;DocumentTypeEntity&gt;**](DocumentTypeEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: *_/_*, application/json;charset=UTF-8

<a name="insertDocumentTypeUsingPOST"></a>
# **insertDocumentTypeUsingPOST**
> DocumentTypeEntity insertDocumentTypeUsingPOST(documentTypeEntity)

insertDocumentType

### Example
```java
// Import classes:
//import hu.sundayit.renderservice.client.ApiException;
//import hu.sundayit.renderservice.client.DocumenttyperestApi;


DocumenttyperestApi apiInstance = new DocumenttyperestApi();
DocumentTypeEntity documentTypeEntity = new DocumentTypeEntity(); // DocumentTypeEntity | documentTypeEntity
try {
    DocumentTypeEntity result = apiInstance.insertDocumentTypeUsingPOST(documentTypeEntity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumenttyperestApi#insertDocumentTypeUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentTypeEntity** | [**DocumentTypeEntity**](DocumentTypeEntity.md)| documentTypeEntity |

### Return type

[**DocumentTypeEntity**](DocumentTypeEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="updateDocumentTypeUsingPOST"></a>
# **updateDocumentTypeUsingPOST**
> DocumentTypeEntity updateDocumentTypeUsingPOST(id, documentTypeEntity)

Updates an existing document type

### Example
```java
// Import classes:
//import hu.sundayit.renderservice.client.ApiException;
//import hu.sundayit.renderservice.client.DocumenttyperestApi;


DocumenttyperestApi apiInstance = new DocumenttyperestApi();
Long id = 789L; // Long | Id
DocumentTypeEntity documentTypeEntity = new DocumentTypeEntity(); // DocumentTypeEntity | documentTypeEntity
try {
    DocumentTypeEntity result = apiInstance.updateDocumentTypeUsingPOST(id, documentTypeEntity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumenttyperestApi#updateDocumentTypeUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Id |
 **documentTypeEntity** | [**DocumentTypeEntity**](DocumentTypeEntity.md)| documentTypeEntity |

### Return type

[**DocumentTypeEntity**](DocumentTypeEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

