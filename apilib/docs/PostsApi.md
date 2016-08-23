# PostsApi

All URIs are relative to *https://api.medium.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**publicationsPublicationIdPostsPost**](PostsApi.md#publicationsPublicationIdPostsPost) | **POST** publications/{publicationId}/posts | Create Publication Post
[**usersAuthorIdPostsPost**](PostsApi.md#usersAuthorIdPostsPost) | **POST** users/{authorId}/posts | Create User Post


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
//import io.swagger.client.api.PostsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PostsApi apiInstance = new PostsApi();
String publicationId = "publicationId_example"; // String | Here publicationId is the id of the publication the post is being created under. The publicationId can be acquired from the API for listing user’s publications.
Post body = new Post(); // Post | Creates a post for publication.
try {
    PostDetails result = apiInstance.publicationsPublicationIdPostsPost(publicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostsApi#publicationsPublicationIdPostsPost");
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
//import io.swagger.client.api.PostsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PostsApi apiInstance = new PostsApi();
String authorId = "authorId_example"; // String | authorId is the user id of the authenticated user.
Post body = new Post(); // Post | Creates a post for user.
try {
    PostDetails result = apiInstance.usersAuthorIdPostsPost(authorId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostsApi#usersAuthorIdPostsPost");
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

