package com.perficient.sample;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.perficient.sample.model.Movie;
import com.perficient.sample.model.MoviesResponse;
import com.perficient.sample.model.User;
import com.perficient.sample.model.UserLogin;
import com.perficient.sample.rest.ApiClient;
import com.perficient.sample.rest.ApiInterface;
import com.perficient.sample.rest.RestClient;
import com.perficient.sample.rest.RestInterface;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    private static final String TAG = ExampleInstrumentedTest.class.getSimpleName();

    @Test
    public void urlTest() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.perficient.sample", appContext.getPackageName());

        RestInterface apiService =
                RestClient.getClient().create(RestInterface.class);

        Log.d(TAG, "Before API Call");
        Call<User> call = apiService.doLogin(getUserLogin());
        Log.d(TAG, call.toString());
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                int statusCode = response.code();
                Log.d(TAG, "RESPONSE :: statusCode=" + statusCode + ", response=" + response.toString());
                Log.d(TAG, "RESPONSE Message: "+response.message());
                Log.d(TAG, "RESPONSE Headers: "+response.headers());
                Log.d(TAG, "RESPONSE Err Body: "+response.errorBody());
                Log.d(TAG, "RESPONSE Raw: "+response.raw());

                User user = response.body();
                Log.d(TAG, "RESPONSE :: statusCode=" + statusCode + ", user=" + user);
                if(!response.isSuccessful()){
                    fail();
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                // Log error here since request failed
                Log.d(TAG, "Failure: " + t.toString(), t);
                t.printStackTrace();
                fail();
            }
        });
        System.out.println("After API Call");
    }

    private UserLogin getUserLogin() {
        String type = "username";
        String name = "people12";
        String password = "People@12";
        UserLogin userLogin = new UserLogin(type, name, password);
        System.out.println("Login Details: " + userLogin);
        return userLogin;
    }

}
