package com.perficient.sample.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.perficient.sample.R;
import com.perficient.sample.adapter.MoviesAdapter;
import com.perficient.sample.model.Movie;
import com.perficient.sample.model.MoviesResponse;
import com.perficient.sample.model.User;
import com.perficient.sample.model.UserLogin;
import com.perficient.sample.rest.ApiClient;
import com.perficient.sample.rest.ApiInterface;
import com.perficient.sample.rest.RestClient;
import com.perficient.sample.rest.RestInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();


    // TODO - insert your themoviedb.org API KEY here
    private final static String API_KEY = "7e8f60e325cd06e164799af1e317d7a7";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (API_KEY.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please obtain your API KEY from themoviedb.org first!", Toast.LENGTH_LONG).show();
            return;
        }

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.movies_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);

        Call<MoviesResponse> call = apiService.getTopRatedMovies(API_KEY);
        call.enqueue(new Callback<MoviesResponse>() {
            @Override
            public void onResponse(Call<MoviesResponse> call, Response<MoviesResponse> response) {
                int statusCode = response.code();
                List<Movie> movies = response.body().getResults();

                System.out.println("RESPONSE : " + movies);

                recyclerView.setAdapter(new MoviesAdapter(movies, R.layout.list_item_movie, getApplicationContext()));
            }

            @Override
            public void onFailure(Call<MoviesResponse> call, Throwable t) {
                // Log error here since request failed
                Log.e(TAG, t.toString());
            }
        });
        this.callUserLogin();
    }

    private void callUserLogin() {
        RestInterface apiService =
                RestClient.getClient().create(RestInterface.class);

        Log.d(TAG, "Before API Call");
        Call<User> call = apiService.doLogin(getUserLogin());
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                int statusCode = response.code();
                User user = response.body();
                Log.d(TAG, "RESPONSE :: statusCode=" + statusCode + ", user=" + user);
                Toast.makeText(getApplicationContext(), "API Call Successful!", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                // Log error here since request failed
                Log.e(TAG, "Failure: " + t.toString(), t);
                t.printStackTrace();
                Toast.makeText(getApplicationContext(), "API Call Failure!", Toast.LENGTH_LONG).show();
            }
        });
        Log.d(TAG, "After API Call");
    }

    private UserLogin getUserLogin() {
        String type = "username";
        String name = "people12";
        String password = "People@12";
        UserLogin userLogin = new UserLogin(type, name, password);
        Log.d(TAG, "Login Details: " + userLogin);
        return userLogin;
    }

}
