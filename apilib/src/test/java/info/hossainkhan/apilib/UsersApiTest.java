package info.hossainkhan.apilib;

import io.swagger.client.ApiClient;
import io.swagger.client.api.UsersApi;
import io.swagger.client.model.UserResponse;
import io.swagger.client.model.ContibutorResponse;
import io.swagger.client.model.PostDetails;
import io.swagger.client.model.Post;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
public class UsersApiTest {

    private UsersApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UsersApi.class);
    }

    
    /**
     * User details
     *
     * Returns details of the user who has granted permission to the application.
     */
    @Test
    public void meGetTest() {
        // UserResponse response = api.meGet();

        // TODO: test validations
    }
    
    /**
     * Contributors of Publication
     *
     * This endpoint returns a list of contributors for a given publication. In other words, a list of Medium users who are allowed to publish under a publication, as well as a description of their exact role in the publication (for now, either an editor or a writer).
     */
    @Test
    public void publicationsPublicationIdContributorsGetTest() {
        String publicationId = null;
        // ContibutorResponse response = api.publicationsPublicationIdContributorsGet(publicationId);

        // TODO: test validations
    }
    
    /**
     * Create User Post
     *
     * Creates a post on the authenticated user’s profile.
     */
    @Test
    public void usersAuthorIdPostsPostTest() {
        String authorId = null;
        Post body = null;
        // PostDetails response = api.usersAuthorIdPostsPost(authorId, body);

        // TODO: test validations
    }
    
}
