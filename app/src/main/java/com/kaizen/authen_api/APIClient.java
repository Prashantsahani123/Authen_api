package com.kaizen.authen_api;


import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

class APIClient {

    private static Retrofit retrofit = null;

    static Retrofit getClient() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();


        TokenInterceptor interceptors=new TokenInterceptor();

        OkHttpClient clients = new OkHttpClient.Builder()
                .addInterceptor(interceptors).build();



        retrofit = new Retrofit.Builder()
                .baseUrl("https://mascotapi.rotary-india.org")
                .addConverterFactory(GsonConverterFactory.create())
                .client(clients)
                .build();



        return retrofit;
    }

}
