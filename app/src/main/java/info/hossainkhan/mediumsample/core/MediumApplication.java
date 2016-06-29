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

    // TODO - This needs to come from user.
    public static final String apiToken = "";

    /**
     * Key for bearer authorization.
     */
    public static final String BEARER = "Bearer";

    private ApiClient apiClient;
    private User userInfo;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: Application created.");
    }

    public ApiClient getApiClient() {
        if(apiClient == null) {
            apiClient = new ApiClient(BEARER, BEARER + " " + MediumApplication.apiToken);
            apiClient.createDefaultAdapter();
        }
        return apiClient;
    }

    public boolean isUserAvailable() {
        return userInfo != null;
    }

    public User getUser() {
        return userInfo;
    }

    public void setUser(User user) {
        userInfo = user;
    }

}
