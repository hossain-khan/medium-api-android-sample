package info.hossainkhan.mediumsample.core;

import android.app.Application;
import android.util.Log;

/**
 * Application class for the app.
 */
public class MediumSampleApplication extends Application {
    private static final String TAG = MediumSampleApplication.class.getSimpleName();

    // TODO - This needs to come from user.
    public static final String apiToken = "XYZ";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: Application created.");
    }
}
