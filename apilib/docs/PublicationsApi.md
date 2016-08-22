# PublicationsApi

All URIs are relative to *https://api.medium.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**publicationsPublicationIdContributorsGet**](PublicationsApi.md#publicationsPublicationIdContributorsGet) | **GET** publications/{publicationId}/contributors | Contributors of Publication
[**publicationsPublicationIdPostsPost**](PublicationsApi.md#publicationsPublicationIdPostsPost) | **POST** publications/{publicationId}/posts | Create Publication Post
[**usersUserIdPublicationsGet**](PublicationsApi.md#usersUserIdPublicationsGet) | **GET** users/{userId}/publications | User&#39;s publications


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
//import io.swagger.client.api.PublicationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PublicationsApi apiInstance = new PublicationsApi();
String publicationId = "publicationId_example"; // String | A unique identifier for the publication.
try {
    ContibutorResponse result = apiInstance.publicationsPublicationIdContributorsGet(publicationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicationsApi#publicationsPublicationIdContributorsGet");
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

<a name="publicationsPublicationIdPostsPost"></a>
# **publicationsPublicationIdPostsPost**
> PostDetails publicationsPublicationIdPostsPost(publicationId, body)

Create Publication Post

creating a post and associating it with a publication on Medium. The request also shows this association, considering posts a collection of resources under a publication  There are additional rules around publishing that each request to this API must respect:   - If the authenticated user is an &#39;editor&#39; for the publication, they can create posts with any publish status. Posts published as &#39;public&#39; or &#39;unlisted&#39; will appear in collection immediately, while posts created as &#39;draft&#39; will remain in pending state under publication.   - If the authenticated user is a &#39;writer&#39; for the chosen publication, they can only create a post as a &#39;draft&#39;. That post will remain in pending state under publication until an editor for the publication approves it.   - If the authenticated user is neither a &#39;writer&#39; nor an &#39;editor&#39;, they are not allowed to create any posts in a publication. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PublicationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PublicationsApi apiInstance = new PublicationsApi();
String publicationId = "publicationId_example"; // String | Here publicationId is the id of the publication the post is being created under. The publicationId can be acquired from the API for listing user’s publications.
Post body = new Post(); // Post | Creates a post for publication.
try {
    PostDetails result = apiInstance.publicationsPublicationIdPostsPost(publicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicationsApi#publicationsPublicationIdPostsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **publicationId** | **String**| Here publicationId is the id of the publication the post is being created under. The publicationId can be acquired from the API for listing user’s publications. |
 **body** | [**Post**](Post.md)| Creates a post for publication. |

### Return type

[**PostDetails**](PostDetails.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdPublicationsGet"></a>
# **usersUserIdPublicationsGet**
> PublicationResponse usersUserIdPublicationsGet(userId)

User&#39;s publications

Returns a full list of publications that the user is related to in some way. This includes all publications the user is subscribed to, writes to, or edits.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PublicationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PublicationsApi apiInstance = new PublicationsApi();
String userId = "userId_example"; // String | A unique identifier for the user.
try {
    PublicationResponse result = apiInstance.usersUserIdPublicationsGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicationsApi#usersUserIdPublicationsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| A unique identifier for the user. |

### Return type

[**PublicationResponse**](PublicationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

