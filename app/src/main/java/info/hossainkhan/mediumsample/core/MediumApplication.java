package info.hossainkhan.mediumsample.core;

import android.app.Application;
import android.util.Log;

import io.swagger.client.ApiClient;
import io.swagger.client.model.User;

/**
 * Application class for the app.
 */
public class MediumApplication extends Application {
    private static final String TAG = MediumApplication.class.getSimpleName();

    /**
     * Get an integration token from <a herf="https://medium.com/me/settings">https://medium.com/me/settings</a> for
     * use with a third-party application. Tokens grant publish access to your account and do not expire, so share carefully. <p/>
     *
     * FIXME - WARNING: DO NOT SHARE THE TOKEN WITH ANYBODY. IF APPLICABLE, REMOVE TOKEN FROM "medium.com" ONCE TESTING IS DONE.
     */
    private static final String MEDIUM_USER_INTEGRATION_TOKEN = ""; // TODO: User must provide this token to run app.

    /**
     * Key for bearer authorization.
     */
    private static final String BEARER = "Bearer";

    private ApiClient apiClient;
    private User userInfo;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: Application created.");

        if ("".equals(MEDIUM_USER_INTEGRATION_TOKEN)) {
            throw new RuntimeException("You must provide your integration token.");
        }
    }

    /**
     * Creates API client instance for making API calls.
     *
     * @return {@link ApiClient} instance.
     */
    public ApiClient getApiClient() {
        if(apiClient == null) {
            apiClient = new ApiClient(BEARER, BEARER + " " + MediumApplication.MEDIUM_USER_INTEGRATION_TOKEN);
            apiClient.createDefaultAdapter();
        }
        return apiClient;
    }

    /**
     * Checks if user information is available.
     *
     * @return {@code true} when available, {@code false} otherwise.
     */
    public boolean isUserAvailable() {
        return userInfo != null;
    }

    /**
     * Provides current's users info.
     *
     * @return {@link User} info.
     */
    public User getUser() {
        return userInfo;
    }

    /**
     * Save user's info.
     *
     * @param user {@link User} info.
     */
    public void setUser(User user) {
        userInfo = user;
    }

}
