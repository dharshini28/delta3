package com.example.delta3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.delta3.api.ApiService;
import com.example.delta3.beans.Forcedetails;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static java.util.Objects.requireNonNull;

public class MaainActivity extends AppCompatActivity {
    private TextView textViewResult;

    private ApiService jsonPlaceHolderApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maain);

        Intent intent = getIntent();
        if( android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.KITKAT ) {
            String name = requireNonNull ( intent.getExtras () ).getString ("force");
        }


        textViewResult = findViewById(R.id.text_view_result);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://data.police.uk/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        jsonPlaceHolderApi = retrofit.create(ApiService.class);

        getForcedetails();
    }
    private void getForcedetails() {
        Call<List<Forcedetails>> call = jsonPlaceHolderApi
                .getForcedetails("thames-valley");

        call.enqueue(new Callback<List<Forcedetails>>() {
            @Override
            public void onResponse(Call<List<Forcedetails>> call, Response<List<Forcedetails>> response) {

                if (!response.isSuccessful()) {
                    textViewResult.setText("Code: " + response.code());
                    return;
                }

                List<Forcedetails> Forcedetails = response.body();

                for (Forcedetails comment : Forcedetails) {
                    String content = "";
                    content += "url: " + comment.getUrl() + "\n\n";

                    textViewResult.append(content);
                }
            }

            @Override
            public void onFailure(Call<List<Forcedetails>> call, Throwable t) {
                textViewResult.setText(t.getMessage());
            }
        });
    }
}