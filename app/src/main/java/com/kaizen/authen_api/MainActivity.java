package com.kaizen.authen_api;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.JsonObject;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    APIInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiInterface = APIClient.getClient().create(APIInterface.class);
        Call<JsonObject> call = apiInterface.getallcustomer();
//        Call<JsonObject> call = apiInterface.gettoken("7666660143","Pass@123","password");
        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {


                Log.d("TAG",response.code()+"");

                String displayResponse = String.valueOf(response.body());
                Log.d("tokenn",displayResponse);


                // MultipleResource resource = response.body();
//                Integer total = resource.total;
          //      Integer totalPages = resource.totalPages;
          //      List<MultipleResource.Datum> datumList = resource.data;

             //   displayResponse += text + " Page\n" + total + " Total\n" + totalPages + " Total Pages\n";

//                for (MultipleResource.Datum datum : datumList) {
//                    displayResponse += datum.id + " " + datum.name + " " + datum.pantoneValue + " " + datum.year + "\n";
//                }
//
//                responseText.setText(displayResponse);

            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                call.cancel();
            }
        });





    }
}