package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.PostDetails;
import io.swagger.client.model.Post;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PostsApi
 */
public class PostsApiTest {

    private PostsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PostsApi.class);
    }

    
    /**
     * Create Publication Post
     *
     * creating a post and associating it with a publication on Medium. The request also shows this association, considering posts a collection of resources under a publication  There are additional rules around publishing that each request to this API must respect:   - If the authenticated user is an &#39;editor&#39; for the publication, they can create posts with any publish status. Posts published as &#39;public&#39; or &#39;unlisted&#39; will appear in collection immediately, while posts created as &#39;draft&#39; will remain in pending state under publication.   - If the authenticated user is a &#39;writer&#39; for the chosen publication, they can only create a post as a &#39;draft&#39;. That post will remain in pending state under publication until an editor for the publication approves it.   - If the authenticated user is neither a &#39;writer&#39; nor an &#39;editor&#39;, they are not allowed to create any posts in a publication. 
     */
    @Test
    public void publicationsPublicationIdPostsPostTest() {
        String publicationId = null;
        Post body = null;
        // PostDetails response = api.publicationsPublicationIdPostsPost(publicationId, body);

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
