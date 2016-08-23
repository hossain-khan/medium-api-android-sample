package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.PostDetails;
import io.swagger.client.model.Post;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PostsApi {
  /**
   * Create Publication Post
   * creating a post and associating it with a publication on Medium. The request also shows this association, considering posts a collection of resources under a publication  There are additional rules around publishing that each request to this API must respect:   - If the authenticated user is an &#39;editor&#39; for the publication, they can create posts with any publish status. Posts published as &#39;public&#39; or &#39;unlisted&#39; will appear in collection immediately, while posts created as &#39;draft&#39; will remain in pending state under publication.   - If the authenticated user is a &#39;writer&#39; for the chosen publication, they can only create a post as a &#39;draft&#39;. That post will remain in pending state under publication until an editor for the publication approves it.   - If the authenticated user is neither a &#39;writer&#39; nor an &#39;editor&#39;, they are not allowed to create any posts in a publication. 
   * @param publicationId Here publicationId is the id of the publication the post is being created under. The publicationId can be acquired from the API for listing user’s publications. (required)
   * @param body Creates a post for publication. (required)
   * @return Call&lt;PostDetails&gt;
   */
  
  @POST("publications/{publicationId}/posts")
  Call<PostDetails> publicationsPublicationIdPostsPost(
    @Path("publicationId") String publicationId, @Body Post body
  );

  /**
   * Create User Post
   * Creates a post on the authenticated user’s profile.
   * @param authorId authorId is the user id of the authenticated user. (required)
   * @param body Creates a post for user. (required)
   * @return Call&lt;PostDetails&gt;
   */
  
  @POST("users/{authorId}/posts")
  Call<PostDetails> usersAuthorIdPostsPost(
    @Path("authorId") String authorId, @Body Post body
  );

}
