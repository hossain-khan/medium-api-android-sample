package info.hossainkhan.mediumsample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import info.hossainkhan.mediumsample.core.MediumApplication;
import io.swagger.client.ApiClient;
import io.swagger.client.api.UsersApi;
import io.swagger.client.model.User;
import io.swagger.client.model.UserResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * {@link MainActivity} created with "Navigation Drawer Activity" template.
 *
 * Minimal modification has been done to provide basic UI feedback on API call.
 */
public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private static final String TAG = MainActivity.class.getSimpleName();

    private TextView mMainContentText;
    private TextView mTitleText;
    private TextView mEmailText;
    private ImageView mThumbImage;
    private MediumApplication mMediumApplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMediumApplication = (MediumApplication) getApplication();

        mMainContentText = (TextView) findViewById(R.id.content_main_text);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // Don't need the fab for this project. Disable it.
        fab.setVisibility(View.GONE);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        View navigationHeaderView = navigationView.getHeaderView(0);
        mTitleText = (TextView) navigationHeaderView.findViewById(R.id.nav_header_title_text);
        mEmailText = (TextView) navigationHeaderView.findViewById(R.id.nav_header_email_text);
        mThumbImage = (ImageView) navigationHeaderView.findViewById(R.id.nav_header_thumb_image);

        if(mMediumApplication.isUserAvailable()) {
            populateUserData(mMediumApplication.getUser());
        } else {
            loadUserDetails();
        }
    }

    /**
     * Updates UI with provided user model data.
     *
     * @param user User instance.
     * @see #loadUserDetails()
     */
    private void populateUserData(final User user) {
        Log.d(TAG, "populateUserData() called with: user = [" + user + "]");
        mTitleText.setText(user.getName());
        mEmailText.setText(user.getUrl());
        Picasso.with(this).load(user.getImageUrl()).into(mThumbImage);

        // Also shows RAW user info in the main container
        mMainContentText.setText(user.toString());
    }

    /**
     * Loads user details by calling {@link UsersApi#meGet()}.<p/>
     *
     * <b>NOTE: You must provide your self-issued access tokens in {@link MediumApplication#MEDIUM_USER_INTEGRATION_TOKEN}</b>
     */
    private void loadUserDetails() {
        Log.d(TAG, "loadUserDetails: Executing.");

        ApiClient apiClient = mMediumApplication.getApiClient();
        UsersApi usersApi = apiClient.createService(UsersApi.class);
        Call<UserResponse> userResponseCall = usersApi.meGet();

        userResponseCall.enqueue(new Callback<UserResponse>() {
            @Override
            public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {
                if(response.isSuccessful()) {
                    User userInfo = response.body().getData();
                    mMediumApplication.setUser(userInfo);
                    populateUserData(userInfo);
                } else {
                    Toast.makeText(MainActivity.this, "User details request failed.\n" + response.errorBody().source().toString(), Toast.LENGTH_SHORT).show();
                    mMainContentText.setText("Request Failed\n" + response.errorBody().source().toString());
                }
            }

            @Override
            public void onFailure(Call<UserResponse> call, Throwable t) {
                mMainContentText.setText("Request Failed");
            }
        });
        Log.d(TAG, "loadUserDetails: " + userResponseCall.isCanceled() + ", " + userResponseCall.isExecuted());
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
