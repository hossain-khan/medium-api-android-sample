package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.UserResponse;
import io.swagger.client.model.ContibutorResponse;
import io.swagger.client.model.PostDetails;
import io.swagger.client.model.Post;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UsersApi {
  
  /**
   * User details
   * Returns details of the user who has granted permission to the application.
   * @return Call<UserResponse>
   */
  
  @GET("me")
  Call<UserResponse> meGet();
    

  
  /**
   * Contributors of Publication
   * This endpoint returns a list of contributors for a given publication. In other words, a list of Medium users who are allowed to publish under a publication, as well as a description of their exact role in the publication (for now, either an editor or a writer).
   * @param publicationId A unique identifier for the publication. (required)
   * @return Call<ContibutorResponse>
   */
  
  @GET("publications/{publicationId}/contributors")
  Call<ContibutorResponse> publicationsPublicationIdContributorsGet(
    @Path("publicationId") String publicationId
  );

  
  /**
   * Create User Post
   * Creates a post on the authenticated user\u2019s profile.
   * @param authorId authorId is the user id of the authenticated user. (required)
   * @param body Creates a post for user. (required)
   * @return Call<PostDetails>
   */
  
  @POST("users/{authorId}/posts")
  Call<PostDetails> usersAuthorIdPostsPost(
    @Path("authorId") String authorId, @Body Post body
  );

  
}
