package com.example.androidpython.Retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitClient {
    private static Retrofit retrofitClient=null;

    public static Retrofit getClienr()
    {
        if(retrofitClient == null)
        {
            retrofitClient = new Retrofit.Builder()
                    .baseUrl("http://10.0.2.2:5000")
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .build();
        }
        return retrofitClient;
    }
}
