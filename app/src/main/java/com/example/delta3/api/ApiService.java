package com.example.delta3.api;

import com.example.delta3.beans.Forcedetails;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {
        @GET("api/forces/{forcename}")
        Call<List<Forcedetails>> getForcedetails(@Path("forcename") String name);
    }

