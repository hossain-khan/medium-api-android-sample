package info.hossainkhan.mediumsample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


import com.google.gson.GsonBuilder;

import info.hossainkhan.mediumsample.core.MediumApplication;
import io.swagger.client.ApiClient;
import io.swagger.client.api.PublicationsApi;
import io.swagger.client.model.Publication;
import io.swagger.client.model.PublicationResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.Collections;
import java.util.List;

/**
 * An activity representing a list of Publications. This activity
 * has different presentations for handset and tablet-size devices. On
 * handsets, the activity presents a list of items, which when touched,
 * lead to a {@link PublicationDetailActivity} representing
 * item details. On tablets, the activity presents the list of items and
 * item details side-by-side using two vertical panes.
 */
public class PublicationListActivity extends AppCompatActivity {

    private static final String TAG = PublicationListActivity.class.getSimpleName();

    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet
     * device.
     */
    private boolean mTwoPane;
    private SimpleItemRecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publication_list);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getTitle());

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        View recyclerView = findViewById(R.id.publication_list);
        assert recyclerView != null;
        setupRecyclerView((RecyclerView) recyclerView);

        if (findViewById(R.id.publication_detail_container) != null) {
            // The detail container view will be present only in the
            // large-screen layouts (res/values-w900dp).
            // If this view is present, then the
            // activity should be in two-pane mode.
            mTwoPane = true;
        }

        loadPublications();
    }

    private void loadPublications() {
        Log.d(TAG, "loadPublications: Executing.");
        ApiClient apiClient = ((MediumApplication) getApplication()).getApiClient();

        PublicationsApi publicationsApi = apiClient.createService(PublicationsApi.class);

        Call<PublicationResponse> publicationResponseCall = publicationsApi.usersUserIdPublicationsGet("user-id");

        publicationResponseCall.enqueue(new Callback<PublicationResponse>() {
            @Override
            public void onResponse(Call<PublicationResponse> call, Response<PublicationResponse> response) {
                Log.d(TAG, "onResponse() called with: call = [" + call + "], response = [" + response + "]");
                if (response.isSuccessful()) {
                    recyclerViewAdapter.setData(response.body().getData());
                } else {
                    Toast.makeText(PublicationListActivity.this, "Unable to get publications.", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<PublicationResponse> call, Throwable t) {
                Log.d(TAG, "onFailure() called with: call = [" + call + "], t = [" + t + "]");
            }
        });
    }

    private void setupRecyclerView(@NonNull RecyclerView recyclerView) {
        recyclerViewAdapter = new SimpleItemRecyclerViewAdapter();
        recyclerView.setAdapter(recyclerViewAdapter);
    }

    public class SimpleItemRecyclerViewAdapter
            extends RecyclerView.Adapter<SimpleItemRecyclerViewAdapter.ViewHolder> {

        private List<Publication> mPublicationData;

        public SimpleItemRecyclerViewAdapter() {
            mPublicationData = Collections.EMPTY_LIST;
        }

        public SimpleItemRecyclerViewAdapter(List<Publication> items) {
            mPublicationData = items;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.publication_list_content, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, int position) {
            holder.mItem = mPublicationData.get(position);
            holder.mIdView.setText(mPublicationData.get(position).getId());
            holder.mContentView.setText(mPublicationData.get(position).getName());

            holder.mView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mTwoPane) {
                        Bundle arguments = new Bundle();
                        arguments.putString(PublicationDetailFragment.ARG_ITEM_ID, holder.mItem.getId());
                        arguments.putString(PublicationDetailFragment.ARG_ITEM_DATA, PublicationListActivity.convertToJson(holder.mItem));
                        PublicationDetailFragment fragment = new PublicationDetailFragment();
                        fragment.setArguments(arguments);
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.publication_detail_container, fragment)
                                .commit();
                    } else {
                        Context context = v.getContext();
                        Intent intent = new Intent(context, PublicationDetailActivity.class);
                        intent.putExtra(PublicationDetailFragment.ARG_ITEM_ID, holder.mItem.getId());
                        intent.putExtra(PublicationDetailFragment.ARG_ITEM_DATA, PublicationListActivity.convertToJson(holder.mItem));

                        context.startActivity(intent);
                    }
                }
            });
        }

        @Override
        public int getItemCount() {
            return mPublicationData.size();
        }

        public void setData(List<Publication> data) {
            this.mPublicationData = data;
            notifyDataSetChanged();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            public final View mView;
            public final TextView mIdView;
            public final TextView mContentView;
            public Publication mItem;

            public ViewHolder(View view) {
                super(view);
                mView = view;
                mIdView = (TextView) view.findViewById(R.id.id);
                mContentView = (TextView) view.findViewById(R.id.content);
            }

            @Override
            public String toString() {
                return super.toString() + " '" + mContentView.getText() + "'";
            }
        }
    }

    /**
     * Converts object to JSON string.
     * @param publication
     * @return JSON text for publication.
     * @see #convertFromJson(String)
     */
    public static String convertToJson(Publication publication) {
        return new GsonBuilder().create().toJson(publication);
    }

    /**
     * Converts JSON text to Publication.
     * @param publicationJsonTxt
     * @return Publication instance from JSON.
     * @see #convertToJson(Publication)
     */
    public static Publication convertFromJson(String publicationJsonTxt) {
        return new GsonBuilder().create().fromJson(publicationJsonTxt, Publication.class);
    }
}
