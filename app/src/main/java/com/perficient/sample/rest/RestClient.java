package com.perficient.sample.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RestClient {

    public static final String BASE_URL = "http://lonaci.eaglesoftware.in:8086/OnlineGamesRestApi/rest/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            System.out.println("RETROFIT Base URL: " + retrofit.baseUrl());
        }
        return retrofit;
    }

}
