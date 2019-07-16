# RenderrequestrestApi

All URIs are relative to *https://136.144.173.90:8009/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**renderRequestUsingPOST**](RenderrequestrestApi.md#renderRequestUsingPOST) | **POST** /render | Handles a render request and returns


<a name="renderRequestUsingPOST"></a>
# **renderRequestUsingPOST**
> byte[] renderRequestUsingPOST(renderRequestEntity)

Handles a render request and returns

### Example
```java
// Import classes:
//import hu.sundayit.renderservice.client.ApiException;
//import hu.sundayit.renderservice.client.RenderrequestrestApi;


RenderrequestrestApi apiInstance = new RenderrequestrestApi();
RenderRequestEntity renderRequestEntity = new RenderRequestEntity(); // RenderRequestEntity | renderRequestEntity
try {
    byte[] result = apiInstance.renderRequestUsingPOST(renderRequestEntity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RenderrequestrestApi#renderRequestUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **renderRequestEntity** | [**RenderRequestEntity**](RenderRequestEntity.md)| renderRequestEntity |

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/pdf

