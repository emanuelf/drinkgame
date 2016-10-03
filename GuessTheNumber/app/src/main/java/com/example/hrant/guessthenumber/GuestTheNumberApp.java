package com.example.hrant.guessthenumber;

import android.app.Application;

import client.RestClient;

/**
 * Created by hrant on 9/25/16.
 */

public class GuestTheNumberApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        RestClient.init(getApplicationContext());
    }
}
