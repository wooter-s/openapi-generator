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
public class AdditionalPropertiesApi {
  private ApiClient apiClient;

  public AdditionalPropertiesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AdditionalPropertiesApi(ApiClient apiClient) {
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
   * @param additionalPropertiesUnset  (required)
   * @param additionalPropertiesTrue  (required)
   * @param additionalPropertiesFalse  (required)
   * @param additionalPropertiesSchema  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> 201 </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> 202 </td><td>  -  </td></tr>
       <tr><td> 203 </td><td> 203 </td><td>  -  </td></tr>
     </table>
   */
  public Object arrayWithValidationsInItems2(Object additionalPropertiesUnset, Map<String, Object> additionalPropertiesTrue, Object additionalPropertiesFalse, Map<String, String> additionalPropertiesSchema) throws ApiException {
    return arrayWithValidationsInItems2WithHttpInfo(additionalPropertiesUnset, additionalPropertiesTrue, additionalPropertiesFalse, additionalPropertiesSchema).getData();
  }

  /**
   * 
   * 
   * @param additionalPropertiesUnset  (required)
   * @param additionalPropertiesTrue  (required)
   * @param additionalPropertiesFalse  (required)
   * @param additionalPropertiesSchema  (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> 201 </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> 202 </td><td>  -  </td></tr>
       <tr><td> 203 </td><td> 203 </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> arrayWithValidationsInItems2WithHttpInfo(Object additionalPropertiesUnset, Map<String, Object> additionalPropertiesTrue, Object additionalPropertiesFalse, Map<String, String> additionalPropertiesSchema) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'additionalPropertiesUnset' is set
    if (additionalPropertiesUnset == null) {
      throw new ApiException(400, "Missing the required parameter 'additionalPropertiesUnset' when calling arrayWithValidationsInItems2");
    }
    
    // verify the required parameter 'additionalPropertiesTrue' is set
    if (additionalPropertiesTrue == null) {
      throw new ApiException(400, "Missing the required parameter 'additionalPropertiesTrue' when calling arrayWithValidationsInItems2");
    }
    
    // verify the required parameter 'additionalPropertiesFalse' is set
    if (additionalPropertiesFalse == null) {
      throw new ApiException(400, "Missing the required parameter 'additionalPropertiesFalse' when calling arrayWithValidationsInItems2");
    }
    
    // verify the required parameter 'additionalPropertiesSchema' is set
    if (additionalPropertiesSchema == null) {
      throw new ApiException(400, "Missing the required parameter 'additionalPropertiesSchema' when calling arrayWithValidationsInItems2");
    }
    
    // create path and map variables
    String localVarPath = "/additional_properties/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "additionalPropertiesUnset", additionalPropertiesUnset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "additionalPropertiesTrue", additionalPropertiesTrue));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "additionalPropertiesFalse", additionalPropertiesFalse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "additionalPropertiesSchema", additionalPropertiesSchema));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("AdditionalPropertiesApi.arrayWithValidationsInItems2", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param additionalPropertiesUnset  (required)
   * @param additionalPropertiesTrue  (required)
   * @param additionalPropertiesFalse  (required)
   * @param additionalPropertiesSchema  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> 201 </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> 202 </td><td>  -  </td></tr>
       <tr><td> 203 </td><td> 203 </td><td>  -  </td></tr>
     </table>
   */
  public Object arrayWithValidationsInItemsRef(Object additionalPropertiesUnset, Map<String, Object> additionalPropertiesTrue, Object additionalPropertiesFalse, Map<String, String> additionalPropertiesSchema) throws ApiException {
    return arrayWithValidationsInItemsRefWithHttpInfo(additionalPropertiesUnset, additionalPropertiesTrue, additionalPropertiesFalse, additionalPropertiesSchema).getData();
  }

  /**
   * 
   * 
   * @param additionalPropertiesUnset  (required)
   * @param additionalPropertiesTrue  (required)
   * @param additionalPropertiesFalse  (required)
   * @param additionalPropertiesSchema  (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> 201 </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> 202 </td><td>  -  </td></tr>
       <tr><td> 203 </td><td> 203 </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> arrayWithValidationsInItemsRefWithHttpInfo(Object additionalPropertiesUnset, Map<String, Object> additionalPropertiesTrue, Object additionalPropertiesFalse, Map<String, String> additionalPropertiesSchema) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'additionalPropertiesUnset' is set
    if (additionalPropertiesUnset == null) {
      throw new ApiException(400, "Missing the required parameter 'additionalPropertiesUnset' when calling arrayWithValidationsInItemsRef");
    }
    
    // verify the required parameter 'additionalPropertiesTrue' is set
    if (additionalPropertiesTrue == null) {
      throw new ApiException(400, "Missing the required parameter 'additionalPropertiesTrue' when calling arrayWithValidationsInItemsRef");
    }
    
    // verify the required parameter 'additionalPropertiesFalse' is set
    if (additionalPropertiesFalse == null) {
      throw new ApiException(400, "Missing the required parameter 'additionalPropertiesFalse' when calling arrayWithValidationsInItemsRef");
    }
    
    // verify the required parameter 'additionalPropertiesSchema' is set
    if (additionalPropertiesSchema == null) {
      throw new ApiException(400, "Missing the required parameter 'additionalPropertiesSchema' when calling arrayWithValidationsInItemsRef");
    }
    
    // create path and map variables
    String localVarPath = "/ref_additional_properties/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "additionalPropertiesUnset", additionalPropertiesUnset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "additionalPropertiesTrue", additionalPropertiesTrue));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "additionalPropertiesFalse", additionalPropertiesFalse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "additionalPropertiesSchema", additionalPropertiesSchema));

    
    
    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "application/x-www-form-urlencoded", "application/_*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("AdditionalPropertiesApi.arrayWithValidationsInItemsRef", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
