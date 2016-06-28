package info.hossainkhan.mediumsample.core;

import android.app.Application;
import android.util.Log;

import io.swagger.client.ApiClient;

/**
 * Application class for the app.
 */
public class MediumSampleApplication extends Application {
    private static final String TAG = MediumSampleApplication.class.getSimpleName();

    // TODO - This needs to come from user.
    public static final String apiToken = "";

    /**
     * Key for bearer authorization.
     */
    public static final String BEARER = "Bearer";

    private ApiClient apiClient;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: Application created.");
    }

    public ApiClient getApiClient() {
        if(apiClient == null) {
            apiClient = new ApiClient(BEARER, BEARER + " " + MediumSampleApplication.apiToken);
            apiClient.createDefaultAdapter();
        }
        return apiClient;
    }
}
