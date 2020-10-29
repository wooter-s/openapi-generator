# ItemsApi

All URIs are relative to *http://petstore.swagger.io:80/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**arrayWithValidationsInItems**](ItemsApi.md#arrayWithValidationsInItems) | **POST** /array_with_validations_in_items/{items} | 
[**refArrayWithValidationsInItems**](ItemsApi.md#refArrayWithValidationsInItems) | **POST** /ref_array_with_validations_in_items/{items} | 



## arrayWithValidationsInItems

> List&lt;Long&gt; arrayWithValidationsInItems(items, requestBody)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.model.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://petstore.swagger.io:80/v2");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        List<Long> items = Arrays.asList(); // List<Long> | 
        List<Long> requestBody = Arrays.asList(); // List<Long> | 
        try {
            List<Long> result = apiInstance.arrayWithValidationsInItems(items, requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#arrayWithValidationsInItems");
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
 **items** | [**List&lt;Long&gt;**](Long.md)|  |
 **requestBody** | [**List&lt;Long&gt;**](Long.md)|  |

### Return type

**List&lt;Long&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |


## refArrayWithValidationsInItems

> List&lt;Long&gt; refArrayWithValidationsInItems(items, requestBody)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.model.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://petstore.swagger.io:80/v2");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        List<Long> items = Arrays.asList(); // List<Long> | 
        List<Long> requestBody = Arrays.asList(); // List<Long> | 
        try {
            List<Long> result = apiInstance.refArrayWithValidationsInItems(items, requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#refArrayWithValidationsInItems");
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
 **items** | [**List&lt;Long&gt;**](Long.md)|  |
 **requestBody** | [**List&lt;Long&gt;**](Long.md)|  |

### Return type

**List&lt;Long&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |

