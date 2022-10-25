package ru.geekbrains.Lesson10;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class OKHTTPDemo {

    public static void main(String[] args) throws IOException {

        OkHttpClient httpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://ya.ru")
                .build();

        try (Response response = httpClient.newCall(request).execute()) {

            System.out.println("Status code: " + response.code());
            System.out.println(response.headers());
            System.out.println(response.body());
        }

    }

}
