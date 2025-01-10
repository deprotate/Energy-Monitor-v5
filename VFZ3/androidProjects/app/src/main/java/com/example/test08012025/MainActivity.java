package com.example.test08012025;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private static final String BASE_URL = "http://192.168.1.1";
    private OkHttpClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        client = new OkHttpClient();

        Button led1Button = findViewById(R.id.led5Button);
        Button led2Button = findViewById(R.id.led6Button);
        Button led3Button = findViewById(R.id.led7Button);
        Button led4Button = findViewById(R.id.led8Button);
        Button led5Button = findViewById(R.id.led10Button);

        led1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendRequest("/led1");
            }
        });

        led2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendRequest("/led2");
            }
        });

        led3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendRequest("/led3");
            }
        });

        led4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendRequest("/led4");
            }
        });

        led5Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendRequest("/led5");
            }
        });
    }

    private void sendRequest(String endpoint) {
        String url = BASE_URL + endpoint;
        Request request = new Request.Builder()
                .url(url)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

}