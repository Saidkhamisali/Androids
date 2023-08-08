package com.example.registration.service;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface registrationApi {


        @POST("/api/vi/registration")
        Call<registrationApi> save(@Body registrationApi registrationApi);


}
