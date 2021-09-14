package com.kaizen.authen_api;

import com.google.gson.JsonObject;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface APIInterface {

//https://mascotapi.rotary-india.org/token
  // @GET("/token")
    //Call<JsonObject> gettoken();

    @GET("/api/Customer/getallcustomer")
    Call<JsonObject> getallcustomer();


    @FormUrlEncoded
    @POST("/token")
    Call<JsonObject>  gettoken(@Field("username") String username, @Field("password") String password,@Field("grant_type") String grant_type);
   // @GET("/api/Customer/getallcustomer")
        //    Call<JsonObject>  gettoken(@Field("username") String username, @Field("password") String password,@Field("grant_type") String grant_type);


//    http://mascotapi.rotary-india.org/api/Customer/getallcustomer



//TokenInterceptor interceptor=new TokenInterceptor();
//
//OkHttpClient client = new OkHttpClient.Builder()
//            .addInterceptor(interceptor).
//            .build();


    //@POST("/api/users")
    //Call<User> createUser(@Body User user);

    //@GET("/api/users?")
    //Call<UserList> doGetUserList(@Query("page") String page);
//
//    @FormUrlEncoded
//    @POST("/api/users?")
//    Call<UserList> doCreateUserWithField(@Field("name") String name, @Field("job") String job);
}
