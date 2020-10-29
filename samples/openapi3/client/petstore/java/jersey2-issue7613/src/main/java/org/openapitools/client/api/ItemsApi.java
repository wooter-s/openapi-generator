package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import javax.ws.rs.core.GenericType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ItemsApi {
  private ApiClient apiClient;

  public ItemsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ItemsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API cilent
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API cilent
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 
   * 
   * @param items  (required)
   * @param requestBody  (required)
   * @return List&lt;Long&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
     </table>
   */
  public List<Long> arrayWithValidationsInItems(List<Long> items, List<Long> requestBody) throws ApiException {
    return arrayWithValidationsInItemsWithHttpInfo(items, requestBody).getData();
  }

  /**
   * 
   * 
   * @param items  (required)
   * @param requestBody  (required)
   * @return ApiResponse&lt;List&lt;Long&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Long>> arrayWithValidationsInItemsWithHttpInfo(List<Long> items, List<Long> requestBody) throws ApiException {
    Object localVarPostBody = requestBody;
    
    // verify the required parameter 'items' is set
    if (items == null) {
      throw new ApiException(400, "Missing the required parameter 'items' when calling arrayWithValidationsInItems");
    }
    
    // verify the required parameter 'requestBody' is set
    if (requestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'requestBody' when calling arrayWithValidationsInItems");
    }
    
    // create path and map variables
    String localVarPath = "/array_with_validations_in_items/{items}"
      .replaceAll("\\{" + "items" + "\\}", apiClient.escapeString(items.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Long>> localVarReturnType = new GenericType<List<Long>>() {};

    return apiClient.invokeAPI("ItemsApi.arrayWithValidationsInItems", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param items  (required)
   * @param requestBody  (required)
   * @return List&lt;Long&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
     </table>
   */
  public List<Long> refArrayWithValidationsInItems(List<Long> items, List<Long> requestBody) throws ApiException {
    return refArrayWithValidationsInItemsWithHttpInfo(items, requestBody).getData();
  }

  /**
   * 
   * 
   * @param items  (required)
   * @param requestBody  (required)
   * @return ApiResponse&lt;List&lt;Long&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Long>> refArrayWithValidationsInItemsWithHttpInfo(List<Long> items, List<Long> requestBody) throws ApiException {
    Object localVarPostBody = requestBody;
    
    // verify the required parameter 'items' is set
    if (items == null) {
      throw new ApiException(400, "Missing the required parameter 'items' when calling refArrayWithValidationsInItems");
    }
    
    // verify the required parameter 'requestBody' is set
    if (requestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'requestBody' when calling refArrayWithValidationsInItems");
    }
    
    // create path and map variables
    String localVarPath = "/ref_array_with_validations_in_items/{items}"
      .replaceAll("\\{" + "items" + "\\}", apiClient.escapeString(items.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Long>> localVarReturnType = new GenericType<List<Long>>() {};

    return apiClient.invokeAPI("ItemsApi.refArrayWithValidationsInItems", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
