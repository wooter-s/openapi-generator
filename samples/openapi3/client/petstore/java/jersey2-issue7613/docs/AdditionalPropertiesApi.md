# AdditionalPropertiesApi

All URIs are relative to *http://petstore.swagger.io:80/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**arrayWithValidationsInItems2**](AdditionalPropertiesApi.md#arrayWithValidationsInItems2) | **POST** /additional_properties/ | 
[**arrayWithValidationsInItemsRef**](AdditionalPropertiesApi.md#arrayWithValidationsInItemsRef) | **POST** /ref_additional_properties/ | 



## arrayWithValidationsInItems2

> Object arrayWithValidationsInItems2(additionalPropertiesUnset, additionalPropertiesTrue, additionalPropertiesFalse, additionalPropertiesSchema)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AdditionalPropertiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://petstore.swagger.io:80/v2");

        AdditionalPropertiesApi apiInstance = new AdditionalPropertiesApi(defaultClient);
        Object additionalPropertiesUnset = null; // Object | 
        Map<String, Object> additionalPropertiesTrue = new HashMap(); // Map<String, Object> | 
        Object additionalPropertiesFalse = null; // Object | 
        Map<String, String> additionalPropertiesSchema = new HashMap(); // Map<String, String> | 
        try {
            Object result = apiInstance.arrayWithValidationsInItems2(additionalPropertiesUnset, additionalPropertiesTrue, additionalPropertiesFalse, additionalPropertiesSchema);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdditionalPropertiesApi#arrayWithValidationsInItems2");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **additionalPropertiesUnset** | [**Object**](.md)|  |
 **additionalPropertiesTrue** | [**Map&lt;String, Object&gt;**](Object.md)|  |
 **additionalPropertiesFalse** | [**Object**](.md)|  |
 **additionalPropertiesSchema** | [**Map&lt;String, String&gt;**](String.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |
| **201** | 201 |  -  |
| **202** | 202 |  -  |
| **203** | 203 |  -  |


## arrayWithValidationsInItemsRef

> Object arrayWithValidationsInItemsRef(additionalPropertiesUnset, additionalPropertiesTrue, additionalPropertiesFalse, additionalPropertiesSchema)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AdditionalPropertiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://petstore.swagger.io:80/v2");

        AdditionalPropertiesApi apiInstance = new AdditionalPropertiesApi(defaultClient);
        Object additionalPropertiesUnset = null; // Object | 
        Map<String, Object> additionalPropertiesTrue = new HashMap(); // Map<String, Object> | 
        Object additionalPropertiesFalse = null; // Object | 
        Map<String, String> additionalPropertiesSchema = new HashMap(); // Map<String, String> | 
        try {
            Object result = apiInstance.arrayWithValidationsInItemsRef(additionalPropertiesUnset, additionalPropertiesTrue, additionalPropertiesFalse, additionalPropertiesSchema);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdditionalPropertiesApi#arrayWithValidationsInItemsRef");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **additionalPropertiesUnset** | [**Object**](.md)|  |
 **additionalPropertiesTrue** | [**Map&lt;String, Object&gt;**](Object.md)|  |
 **additionalPropertiesFalse** | [**Object**](.md)|  |
 **additionalPropertiesSchema** | [**Map&lt;String, String&gt;**](String.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml, application/x-www-form-urlencoded, application/_*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |
| **201** | 201 |  -  |
| **202** | 202 |  -  |
| **203** | 203 |  -  |

