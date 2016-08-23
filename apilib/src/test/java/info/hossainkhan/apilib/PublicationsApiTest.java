package info.hossainkhan.apilib;

import io.swagger.client.ApiClient;
import io.swagger.client.api.PublicationsApi;
import io.swagger.client.model.ContibutorResponse;
import io.swagger.client.model.PostDetails;
import io.swagger.client.model.Post;
import io.swagger.client.model.PublicationResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PublicationsApi
 */
public class PublicationsApiTest {

    private PublicationsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PublicationsApi.class);
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
     * User&#39;s publications
     *
     * Returns a full list of publications that the user is related to in some way. This includes all publications the user is subscribed to, writes to, or edits.
     */
    @Test
    public void usersUserIdPublicationsGetTest() {
        String userId = null;
        // PublicationResponse response = api.usersUserIdPublicationsGet(userId);

        // TODO: test validations
    }
    
}
