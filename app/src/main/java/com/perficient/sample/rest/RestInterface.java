package com.perficient.sample.rest;

import com.perficient.sample.model.User;
import com.perficient.sample.model.UserLogin;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by valamburi.murugan on 3/25/2017.
 */

public interface RestInterface {
    // BASE_URL http://lonaci.eaglesoftware.in:8086/OnlineGamesRestApi/rest/

    @POST("user/login")
    Call<User> doLogin(@Body UserLogin userLogin);

    // @POST("users/new")
    // Call<User> createUser(@Body User user);

}
