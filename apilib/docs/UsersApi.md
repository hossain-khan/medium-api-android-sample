# UsersApi

All URIs are relative to *https://api.medium.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**meGet**](UsersApi.md#meGet) | **GET** me | User details
[**publicationsPublicationIdContributorsGet**](UsersApi.md#publicationsPublicationIdContributorsGet) | **GET** publications/{publicationId}/contributors | Contributors of Publication
[**usersAuthorIdPostsPost**](UsersApi.md#usersAuthorIdPostsPost) | **POST** users/{authorId}/posts | Create User Post


<a name="meGet"></a>
# **meGet**
> UserResponse meGet()

User details

Returns details of the user who has granted permission to the application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
try {
    UserResponse result = apiInstance.meGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#meGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="publicationsPublicationIdContributorsGet"></a>
# **publicationsPublicationIdContributorsGet**
> ContibutorResponse publicationsPublicationIdContributorsGet(publicationId)

Contributors of Publication

This endpoint returns a list of contributors for a given publication. In other words, a list of Medium users who are allowed to publish under a publication, as well as a description of their exact role in the publication (for now, either an editor or a writer).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
String publicationId = "publicationId_example"; // String | A unique identifier for the publication.
try {
    ContibutorResponse result = apiInstance.publicationsPublicationIdContributorsGet(publicationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#publicationsPublicationIdContributorsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **publicationId** | **String**| A unique identifier for the publication. |

### Return type

[**ContibutorResponse**](ContibutorResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersAuthorIdPostsPost"></a>
# **usersAuthorIdPostsPost**
> PostDetails usersAuthorIdPostsPost(authorId, body)

Create User Post

Creates a post on the authenticated user’s profile.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
String authorId = "authorId_example"; // String | authorId is the user id of the authenticated user.
Post body = new Post(); // Post | Creates a post for user.
try {
    PostDetails result = apiInstance.usersAuthorIdPostsPost(authorId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersAuthorIdPostsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorId** | **String**| authorId is the user id of the authenticated user. |
 **body** | [**Post**](Post.md)| Creates a post for user. |

### Return type

[**PostDetails**](PostDetails.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

